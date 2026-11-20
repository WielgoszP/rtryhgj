package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView obraz1 = findViewById(R.id.obraz1);
        ImageView obraz2 = findViewById(R.id.obraz2);
        ImageView obraz3 = findViewById(R.id.obraz3);

        Button btn_1 = findViewById(R.id.btn_1);
        Button btn_2 = findViewById(R.id.btn_2);
        Button btn_3 = findViewById(R.id.btn_3);

        RadioGroup radio= findViewById(R.id.radiogrupa);



        Button btn_zapisz = findViewById(R.id.btn_zapisz);

        btn_1.setOnClickListener(v->{
            String tekst = btn_1.getText().toString();
            if( tekst.equals("Salon: Biały") ){
                btn_1.setText("Salon: Żółty");
                obraz1.setBackgroundColor(Color.parseColor("#FFFF00"));
            } else if (tekst.equals("Salon: Żółty")) {
                btn_1.setText("Salon: Niebieski"); //rgb
                obraz1.setBackgroundColor(Color.parseColor("#0000FF"));
            } else if (tekst.equals("Salon: Niebieski")) {
                btn_1.setText("Salon: Biały");
                obraz1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        });
        btn_2.setOnClickListener(v->{
            String tekst = btn_2.getText().toString();
            if( tekst.equals("Kuchnia: Biały") ){
                btn_2.setText("Kuchnia: Żółty");
                obraz2.setBackgroundColor(Color.parseColor("#FFFF00"));
            } else if (tekst.equals("Kuchnia: Żółty")) {
                btn_2.setText("Kuchnia: Niebieski");
                obraz2.setBackgroundColor(Color.parseColor("#0000FF"));
            } else if (tekst.equals("Kuchnia: Niebieski")) {
                btn_2.setText("Kuchnia: Biały");
                obraz2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        });
        btn_3.setOnClickListener(v->{
            String tekst = btn_3.getText().toString();
            if( tekst.equals("Sypialnia: Biały") ){
                btn_3.setText("Sypialnia: Żółty");
                obraz3.setBackgroundColor(Color.parseColor("#FFFF00"));
            } else if (tekst.equals("Sypialnia: Żółty")) {
                btn_3.setText("Sypialnia: Niebieski"); //rgb
                obraz3.setBackgroundColor(Color.parseColor("#0000FF"));
            } else if (tekst.equals("Sypialnia: Niebieski")) {
                btn_3.setText("Sypialnia: Biały");
                obraz3.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        });



        if(tryb1.isChecked()){
            btn_1.setText("Salon: Biały");
            btn_2.setText("Kuchnia: Biały");
            btn_3.setText("Sypialnia: Biały");
            obraz1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            obraz2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            obraz3.setBackgroundColor(Color.parseColor("#FFFFFF"));

        }
        if(tryb2.isChecked()){
            btn_1.setText("Salon: Żółty");
            btn_2.setText("Kuchnia: Żółty");
            btn_3.setText("Sypialnia: Żółty");
            obraz1.setBackgroundColor(Color.parseColor("#FFFF00"));
            obraz2.setBackgroundColor(Color.parseColor("#FFFF00"));
            obraz3.setBackgroundColor(Color.parseColor("#FFFF00"));

        }
        if(tryb3.isChecked()){
            btn_1.setText("Salon: niebieski");
            btn_2.setText("Kuchnia: niebieski");
            btn_3.setText("Sypialnia: niebieski");
            obraz1.setBackgroundColor(Color.parseColor("#0000FF"));
            obraz2.setBackgroundColor(Color.parseColor("#0000FF"));
            obraz3.setBackgroundColor(Color.parseColor("#0000FF"));

        }

    }
}