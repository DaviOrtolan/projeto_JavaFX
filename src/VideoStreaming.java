import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class VideoStreaming extends Application {
    public void start(Stage primaryStage) {
        WebView webView = new WebView();

        String urlVideo;
        urlVideo = "https://www.google.com/?hl=pt_BR&zx=1782997306767";

        webView.getEngine().load(urlVideo);
        Scene cena = new Scene(webView);

        primaryStage.setTitle("Exemplo de Streaming");
        primaryStage.setScene(cena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
