package org.example.serizlizers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.example.dtos.ProductDto;

import java.io.IOException;
import java.util.Map;

public class ProductDtoDeserializer extends JsonDeserializer<ProductDto> {

    @Override
    public ProductDto deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        System.out.println("Deserialization started");
        ObjectMapper mapper = (ObjectMapper) p.getCodec();
        // Читання даних у мапу
        Map<String, Object> map = mapper.readValue(p, new TypeReference<Map<String, Object>>() {});

        // Створення об'єкта ProductDto з даних мапи
        ProductDto productDto = new ProductDto();
        productDto.setId((Long) map.get("id"));
        productDto.setName((String) map.get("name"));
        // Продовжуйте з іншими полями...

        return productDto;
    }
}
