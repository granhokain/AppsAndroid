package adivinha.studio.rafael.adivinha_app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Propriedade dos componentes
    private Button botaoJogar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Método utilizado para recuperar o elemento da tela
        botaoJogar = (Button) findViewById(R.id.botaoJogarId);
        textoResultado = (TextView) findViewById(R.id.resultadoId);

        //Criando o evento de click no botão
        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gerador de número aleatório
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(10);
                textoResultado.setText("Numero escolhido: " + numeroAleatorio);
            }
        });
    }


}
