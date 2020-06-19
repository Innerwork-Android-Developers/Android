package com.example.innerwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {

    Animation top,bot;
     ImageView iv;
    TextView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        top= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bot=AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        i1=findViewById(R.id.tex1);
         iv=findViewById(R.id.im1);
        i1.setAnimation(bot);
        iv.setAnimation(top);

        Handler h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.v("tag","first");
                Intent i=new Intent(MainActivity.this,Main2.class);
                startActivity(i);
                finish();

            }
        },4100);


    }
}
