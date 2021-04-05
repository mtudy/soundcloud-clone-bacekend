package io.mtudy.soundcloud.endpoint.music.graphql;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTest;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import io.mtudy.soundcloud.WithFaker;
import io.mtudy.soundcloud.music.application.inputs.CreateTrackInput;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@GraphQLTest
public class CreateTrackMutationResolverTest implements WithFaker {
    @Autowired
    private ObjectMapper mapper;

    @Autowired
    GraphQLTestTemplate graphQLTestTemplate;

    @Test
    public void it_will_return_new_track_entity() throws Exception {
        var payload = mapper.convertValue(
            new CreateTrackInput(faker.music().chord(), faker.avatar().image()),
            ObjectNode.class
        );

        GraphQLResponse response = graphQLTestTemplate.postForResource(
            "graphql/music/create-track.graphqls"
        );

        assertThat(response.getStatusCode().value() == 200).isTrue();
    }
}
