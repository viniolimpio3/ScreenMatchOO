import com.google.gson.Gson;
import com.vini.screenmatch.models.Filme;
import com.vini.screenmatch.models.Titulo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class HttpTest {

    public static void main(String[] args) {
        try{

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um filme para ser pesquisado:");
            var busca = sc.nextLine();
            
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.omdbapi.com/?t=" + busca + "&apikey=6585022c"))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            Gson gson = new Gson();

            Filme t = gson.fromJson(response.body(), Filme.class);
            System.out.println(t);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
