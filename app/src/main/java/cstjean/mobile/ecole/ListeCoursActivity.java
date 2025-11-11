package cstjean.mobile.ecole;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class ListeCoursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_liste_cours);
        Log.d("ProjetEcole", "onCreate");
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.fragment_container), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("ProjetEcole", "onSaveInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ProjetEcole", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ProjetEcole", "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ProjetEcole", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ProjetEcole", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ProjetEcole", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ProjetEcole", "onResume");
    }
}