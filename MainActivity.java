
package dev.end.kosci;

import android.os.Bundle;
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
        images[0] = findViewById(R.id.img1);

        binding.rzut.setOnClickListener(v -> {
            for (int i = 0; i < 5; i++) {
                if (kosci[i].dostepna) {
                    kosci[i].rzutKością();
                }
            }
        });
    }
}