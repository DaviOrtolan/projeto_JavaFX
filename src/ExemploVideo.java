import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class ExemploVideo extends Application {
    @Override
    public void start(Stage primaryStage) {
        String urlVideo = "file:///C:/Users/davim/OneDrive/Documentos/projeto_JavaFX/meus-videos/video.mp4";
        Media media  = new Media(urlVideo);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        HBox hbox = new HBox();
        hbox.getChildren().add(mediaView);

        Scene cena = new Scene(hbox, 800, 600);

        primaryStage.setTitle("Exemplo Vídeo");
        primaryStage.setScene(cena);
        primaryStage.show();

        mediaPlayer.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
