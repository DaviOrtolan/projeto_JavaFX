import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ExemploImagens extends Application {
    @Override
    public void start(Stage primaryStage) {
        // caminho absoluto para a imagem no Windows
        String caminhoImagem = "file:///C:/Users/davim/OneDrive-/Documentos/Curso Java - Udemy/imagem.png";

        Image imagem  = new Image(caminhoImagem);

        ImageView imageView = new ImageView(imagem);

        // configuração para ajustar o tamanho da imagem
        imageView.setFitWidth(613); // largura 
        imageView.setFitHeight(640); // altura
        imageView.setPreserveRatio(true); // mantém a proporção da imagem

        VBox layout = new VBox(imageView);
        Scene cena = new Scene(layout, 700, 700);

        primaryStage.setScene(cena);
        primaryStage.show();
    }    

    public static void main(String[] args) {
        launch(args);
    }
}
