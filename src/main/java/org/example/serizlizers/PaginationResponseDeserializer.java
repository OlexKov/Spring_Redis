package org.example.serizlizers;

import com.fasterxml.jackson.core.JsonParser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.example.models.PaginationResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class PaginationResponseDeserializer<T> extends JsonDeserializer<PaginationResponse<T>> {

    @Override
    public PaginationResponse<T> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        System.out.println("Deserialization started");
        ObjectMapper mapper = (ObjectMapper) p.getCodec();

        // Читання JSON в Map
        Map<String, Object> map = mapper.readValue(p, new TypeReference<Map<String, Object>>() {});

        // Десеріалізація itemsList
        List<T> itemsList = mapper.convertValue(map.get("itemsList"), new TypeReference<List<T>>() {});

        // Отримання totalElements
        long totalElements = ((Number) map.get("totalElements")).longValue();

        return new PaginationResponse<>(itemsList, totalElements);
    }
}
