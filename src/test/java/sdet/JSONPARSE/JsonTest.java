package sdet.JSONPARSE;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

class JsonTest {
    private String jsonSource = "{\"title\":\"data from jsonString\", \"author\":\"suraj\"}";

    @Test
    void parse() {
        JsonNode jsonNode = Json.parse(jsonSource);
        System.out.println(jsonNode);
        assertEquals(jsonNode.get("title").asText(), "data from jsonString");
    }

    @Test
    void fromJson() {
        JsonNode jsonNode = Json.parse(jsonSource);
        JsonPojo jsonString = Json.fromJson(jsonNode, JsonPojo.class);
        System.out.println("json string title : " + jsonString.getTitle());
        System.out.println("json string author : " + jsonString.getAuthor());

        JsonPojo jsonString1 = Json.fromJson(jsonSource, JsonPojo.class);
        System.out.println("json string title : " + jsonString1.getTitle());
        assertEquals(jsonString.getTitle(), "data from jsonString");
    }

    @Test
    void toJson() {
        JsonPojo jsonPojo = new JsonPojo();
        jsonPojo.setTitle("Tittle From Pojo");
        jsonPojo.setAuthor("Sharathkumar");
        JsonNode node = Json.toJson(jsonPojo);
        System.out.println(node);
        assertEquals(node.get("title").asText(), "Tittle From Pojo");
    }

    @Test
    void stringify() throws IOException {
        JsonPojo jsonPojo = new JsonPojo();
        jsonPojo.setTitle("Tittle From Pojo");
        jsonPojo.setAuthor("Sharathkumar");
        JsonNode node = Json.toJson(jsonPojo);
        System.out.println(Json.stringify(node));
        System.out.println(Json.stringify(jsonPojo));

    }

    @Test
    void prettyPrint() {
        JsonPojo jsonPojo = new JsonPojo();
        jsonPojo.setTitle("Tittle From Pojo");
        jsonPojo.setAuthor("Sharathkumar");
        JsonNode node = Json.toJson(jsonPojo);
        System.out.println(Json.prettyPrint(node));
        System.out.println(Json.prettyPrint(jsonSource));
    }
}