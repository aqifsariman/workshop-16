package ibf2022.ssf.day16;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import java.io.Reader;
import java.io.StringReader;

@SpringBootApplication
public class Day16Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Day16Application.class, args);
	}

	@Override
	public void run(String... args) {
		// // {"name": "fred", "email": "fred@gmail.com"}
		// JsonObject json = Json.createObjectBuilder().add("name", "fred")
		// 		.add("email", "fred@gmail.com").build();
		// System.out.println("+++ Json String " + json.toString());

		// JsonArray array = Json.createArrayBuilder()
		// 		.add(json)
		// 		.add(json)
		// 		.build();

		// System.out.println("+++ Json Array " + array.toString());

		// String jsonString = """
		// 		{
		// 			"orderID": 1234,
		// 			"address": "10 Bedrock Ave",
		// 			"lineItems": [
		// 				{
		// 					"name": "apple",
		// 					"quantity": 10
		// 				},{
		// 					"name": "orange",
		// 					"quantity": 20
		// 				}
		// 			]
		// 		}
		// 		""";

		// System.out.println(jsonString);

		// Reader reader = new StringReader(jsonString);
		// JsonReader jsonReader = Json.createReader(reader);
		// json = jsonReader.readObject();

		// System.out.println("OrderID: " + json.getInt("orderID"));
		// System.out.println("Address: " + json.getString("address"));
		// array = json.getJsonArray("lineItems");
		// for (int i = 0; i < array.size(); i++) {
		// 	json = array.getJsonObject(i);
		// 	System.out.printf("Name: %s, Quantity: %d\n", 
		// 	json.getString("name"), json.getInt("quantity"));
		// }

	}

}
