package kr.hs.e_mirim.cheong.anif;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by LG on 2017-11-23.
 */

public class SplashActivity extends Activity {


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(new Intent(this,AuthActivity.class));
        finish();
    }
}