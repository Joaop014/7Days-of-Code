package teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;

public class testes {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\ApiKey.txt"));
		
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(new URI("https://imdb-api.com/en/API/Top250Movies/"+br+"https://imdb-api.com/en/API/Top250Movies/"))
				.GET()
				.build();
		
		HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println(httpResponse.body());
		System.out.println(httpResponse.statusCode());
		System.out.println(httpResponse.version());
		
	}

}
