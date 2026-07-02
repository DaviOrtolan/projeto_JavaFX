import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;
import javafx.stage.FileChooser;

public class ExemploFileChooser extends Application {
    public void start(Stage primaryStage) {
        FileChooser seletorDeArquivo = new FileChooser();
        seletorDeArquivo.setTitle("Escolha um arquivo");

        Button botaoAbrir = new Button("Abrir arquivo");

        botaoAbrir.setOnAction(e -> {
            File arquivoSelecionado = seletorDeArquivo.showOpenDialog(primaryStage);
            if (arquivoSelecionado != null) {
                exibirImagem(arquivoSelecionado, primaryStage);
            }
        });

        VBox layout = new VBox(botaoAbrir);
        Scene cena = new Scene(layout, 800, 600);
        primaryStage.setTitle("Testando FileChooser");
        primaryStage.setScene(cena);
        primaryStage.show();
    }

    private void exibirImagem(File arquivo, Stage palcoDoArquivoSelecionado) {
        Image imagem = new Image(arquivo.toURI().toString());
        ImageView imageView = new ImageView(imagem);

        VBox layout;

        // a linha abaixo obtém o layout atual
        layout = (VBox) palcoDoArquivoSelecionado.getScene().getRoot();

        // a linha abaixo adiciona a imagem no layout
        layout.getChildren().add(imageView);

        // ajustar tamanho imagem 
        imageView.setFitWidth(500);
        imageView.setFitHeight(500);

        palcoDoArquivoSelecionado.setTitle("Seletor de Arquivos");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
