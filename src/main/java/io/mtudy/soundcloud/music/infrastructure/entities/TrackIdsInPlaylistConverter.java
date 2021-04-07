package io.mtudy.soundcloud.music.infrastructure.entities;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.ArrayList;
import java.util.List;

@Converter
public class TrackIdsInPlaylistConverter implements AttributeConverter<List<String>, String> {
    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(List<String> attribute) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(attribute);
    }

    @SneakyThrows
    @Override
    @SuppressWarnings("unchecked")
    public List<String> convertToEntityAttribute(String dbData) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(dbData, ArrayList.class);
    }
}
