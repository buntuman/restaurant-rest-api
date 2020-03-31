import java.net.URI;
import java.net.http.*;

public class RestaurantApi {
    private static String BASE_URL = "http://74.102.13.44"; // this should change
    private static String API = BASE_URL+"/api";

    public static String getUsers() throws Exception{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(API+"/users")).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();

    }
}
