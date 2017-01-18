package www.devetude.net.stopwatch.acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import www.devetude.net.stopwatch.R;

/**
 * Created by user on 2017-01-18.
 */
public class SplashAcitivity extends AppCompatActivity {
    private static final int SPLASH_DEALY = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashAcitivity.this, MainActivity.class);
                SplashAcitivity.this.startActivity(mainIntent);
                SplashAcitivity.this.finish();
            }


        }, SPLASH_DEALY);
    }
}
