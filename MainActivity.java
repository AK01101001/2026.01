
package dev.end.kosci;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import dev.end.kosci.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Kosc[] kosci;
    ImageView[] images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        kosci = new Kosc[5];
        images = new ImageView[5];
        for (int i = 0; i < 5; i++) {

                kosci[i] = new Kosc(0);

        }
        images[0] = binding.img1;
        images[1] = binding.img2;
        images[2] = binding.img3;
        images[3] = binding.img4;
        images[4] = binding.img5;

        binding.rzut.setOnClickListener(v -> {
            int suma = 0;
            for (int i = 0; i < 5; i++) {
                if (kosci[i].dostepna) {
                    suma += Rzut(i);
                }
                else
                {
                    suma +=kosci[i].wartosc;
                }
            }
            binding.suma.setText(String.valueOf(suma));
        });
        for (int i = 0; i < images.length; i++) {
            int I = i;
            images[i].setOnClickListener(v -> {
                images[I].setImageAlpha(kosci[I].zmienDostepnosc() ? 255 : 120);
            });
        }
    }

    private int Rzut(int i) {
        kosci[i].rzutKością();
        int res =0;
        switch (kosci[i].wartosc)
        {
            case 0:
                res = R.drawable.kosc0;
                break;case 1:
                res = R.drawable.kosc1;
                break;case 2:
                res = R.drawable.kosc2;
                break;case 3:
                res = R.drawable.kosc3;
                break;case 4:
                res = R.drawable.kosc4;
                break; case 5:
                res = R.drawable.kosc5;
                break;case 6:
                res = R.drawable.kosc6;
                break;
        }
        images[i].setImageResource(res);
        return kosci[i].wartosc;
    }
}