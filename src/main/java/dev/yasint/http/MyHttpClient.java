package dev.yasint.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.yasint.dto.GeoDataAPIResponse;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyHttpClient {

    private static final String GEO_API_ACCESS_KEY = "5ab65783b6e946ef0b4627b2169503c7";

    public static void callGeoAPI(String query) {

        try {

            HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .followRedirects(HttpClient.Redirect.NORMAL)
                    .build();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(String.format(
                            "http://api.positionstack.com/v1/forward?access_key=%s&query=%s",
                            GEO_API_ACCESS_KEY, query
                    )))
                    .version(HttpClient.Version.HTTP_2)
                    .GET()
                    .build();

            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenAccept((body) -> {
                        ObjectMapper mapper = new ObjectMapper();

                        try {
                            GeoDataAPIResponse unmarshal = mapper.readValue(body, GeoDataAPIResponse.class);
                            System.out.println(unmarshal.getData()[0].getLatitude() + " | " + unmarshal.getData()[0].getLongitude());
                        } catch (JsonProcessingException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .join();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }


}
