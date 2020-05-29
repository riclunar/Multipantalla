package mx.edu.tesoem.isc.riclr.multipantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // aquí se coloca el tipo de diseño landscape o portrain
    }

    @SuppressLint("SourceLockedOrientationActivity")
    public void vHorizontal(View v){
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @SuppressLint("SourceLockedOrientationActivity")
    public void vVertical(View v){
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
}
