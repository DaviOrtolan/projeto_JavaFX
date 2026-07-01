import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox; 
import javafx.geometry.Pos;         
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.control.Button;

public class ExemploVideo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button botaoPlay = new Button("Play");
        Button botaoPause = new Button("Pause"); 
        
        String urlVideo = "file:///C:/Users/davim/OneDrive/Documentos/projeto_JavaFX/meus-videos/video.mp4";
        Media media  = new Media(urlVideo);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        mediaView.setFitHeight(500);
        mediaView.setFitWidth(600);
        mediaView.setPreserveRatio(true);

        HBox containerBotoes = new HBox(10); 
        containerBotoes.setAlignment(Pos.CENTER); // Centraliza os botões horizontalmente
        containerBotoes.getChildren().addAll(botaoPlay, botaoPause); // Adiciona os dois botões

        VBox layoutPrincipal = new VBox(15); 
        layoutPrincipal.setAlignment(Pos.CENTER); 
        layoutPrincipal.getChildren().addAll(mediaView, containerBotoes);

        Scene cena = new Scene(layoutPrincipal, 800, 600);

        primaryStage.setTitle("Exemplo Vídeo");
        primaryStage.setScene(cena);
        primaryStage.show();

        // Ações dos botões
        botaoPlay.setOnAction(e -> mediaPlayer.play());
        botaoPause.setOnAction(e -> mediaPlayer.pause());

        // Resetar o vídeo ao final
        mediaPlayer.setOnEndOfMedia(() -> {
            mediaPlayer.stop();
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}