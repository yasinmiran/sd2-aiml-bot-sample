package dev.yasint.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.yasint.dto.GeoDataAPIResponse;
import dev.yasint.dto.WeatherDataResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyHttpClient {

    private static final String GEO_API_KEY = "5ab65783b6e946ef0b4627b2169503c7";
    private static final String WEATHER_API_KEY = "0cdce2fa4b7ae8942a4698469e85fe17";

    public static void callGeoAPI(String query) {

        try {

            HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).followRedirects(HttpClient.Redirect.NORMAL).build();

            HttpRequest request = HttpRequest.newBuilder().uri(new URI(String.format("http://api.positionstack.com/v1/forward?access_key=%s&query=%s", GEO_API_KEY, query))).version(HttpClient.Version.HTTP_2).GET().build();

            client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept((body) -> {
                ObjectMapper mapper = new ObjectMapper();

                try {
                    GeoDataAPIResponse unmarshal = mapper.readValue(body, GeoDataAPIResponse.class);
                    System.out.println(unmarshal.getData()[0].getLatitude() + " | " + unmarshal.getData()[0].getLongitude());
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }).join();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }

    public static void callWeatherAPI(double lat, double lon) {

        HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).followRedirects(HttpClient.Redirect.NORMAL).build();

        try {

            HttpRequest request = HttpRequest.newBuilder().uri(new URI(String.format(
                    "https://api.openweathermap.org/data/2.5/weather?appid=%s&lat=%f&lon=%f",
                    WEATHER_API_KEY, lat, lon))
            ).version(HttpClient.Version.HTTP_2).GET().build();

            HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = res.body();

            ObjectMapper mapper = new ObjectMapper();

            try {
                final int FIRST_WEATHER_ENTRY = 0;
                WeatherDataResponse unmarshal = mapper.readValue(body, WeatherDataResponse.class);
                System.out.println(unmarshal.getWeather().get(FIRST_WEATHER_ENTRY).main);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
