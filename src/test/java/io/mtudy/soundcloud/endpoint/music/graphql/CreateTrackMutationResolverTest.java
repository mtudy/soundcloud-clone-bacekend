package io.mtudy.soundcloud.endpoint.music.graphql;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import io.mtudy.soundcloud.WithFaker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CreateTrackMutationResolverTest implements WithFaker {
    @Autowired
    GraphQLTestTemplate graphQLTestTemplate;

    @Test
    public void it_will_return_new_track_entity() throws IOException {
        var variables = new ObjectMapper().createObjectNode();

        var input = new ObjectMapper().createObjectNode();
        input.put("title", faker.music().chord());
        input.put("artworkUrl", faker.avatar().image());

        variables.set("input", input);

        GraphQLResponse response = graphQLTestTemplate.perform(
            "graphql/music/create-track.graphql",
            variables
        );
        assertThat(response.getStatusCode().value() == 200).isTrue();
    }
}
