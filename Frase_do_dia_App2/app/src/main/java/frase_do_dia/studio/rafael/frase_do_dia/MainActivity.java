package frase_do_dia.studio.rafael.frase_do_dia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Propriedade dos componentes
    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    //Array com as frases
    private String[] frases = {
            "O sucesso normalmente vem para quem está ocupado demais para procurar por ele !",
            "Dê mais atenção ao que você tem de bom na sua vida",
            "Enfrente os problemas e leve a melhor!",
            "Para chegar ao topo, o que importa é começar!",
            "De nada adianta ter sonhos, se você não se empenhar em correr atrás!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseID);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseID);
        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });


    }
}
