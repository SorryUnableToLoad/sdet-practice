package sdet.JSONPARSE;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;

public class Json {

    private static ObjectMapper objectMapper = getDefaultObjectMapper();

    private static ObjectMapper getDefaultObjectMapper() {
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return defaultObjectMapper;
    }

    public static JsonNode parse(String src) {
        try {
            return objectMapper.readTree(src);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonNode parse(String src, String path) {
        JsonNode rootNode = null;
        try {
            rootNode = objectMapper.readTree(src);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return rootNode.at(path);
    }

    public static <A> A fromJson(JsonNode node, Class<A> clazz) {
        try {
            return objectMapper.treeToValue(node, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


    public static <A> A fromJson(String res, Class<A> clazz) {
        return fromJson(Json.parse(res), clazz);
    }

    public static JsonNode toJson(Object obj) {
        return objectMapper.valueToTree(obj);
    }

    public static String stringify(JsonNode node) {
        ObjectWriter objectWriter = objectMapper.writer();
        try {
            return objectWriter.writeValueAsString(node);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String stringify(Object jsonPojo) {
        JsonNode node = Json.toJson(jsonPojo);
        ObjectWriter objectWriter = objectMapper.writer();
        try {
            return objectWriter.writeValueAsString(node);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String prettyPrint(JsonNode node) {
        ObjectWriter objectWriter = objectMapper.writer();
        objectWriter = objectWriter.with(SerializationFeature.INDENT_OUTPUT);
        try {
            return objectWriter.writeValueAsString(node);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    public static String prettyPrint(String response) {
        JsonNode parsedJson = Json.parse(response);
        ObjectWriter objectWriter = objectMapper.writer();
        objectWriter = objectWriter.with(SerializationFeature.INDENT_OUTPUT);
        try {
            return objectWriter.writeValueAsString(parsedJson);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
