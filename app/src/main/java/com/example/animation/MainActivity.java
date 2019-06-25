package com.example.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img;
        img = findViewById(R.id.img_anima);

     /*   ObjectAnimator animator = ObjectAnimator.ofFloat(img,"RotationX",0.0f,360f);
        animator.setDuration(3000);
        animator.setRepeatCount(Animation.INFINITE);
        animator.start();*/
     Animation ani = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
     ani.setDuration(3000);

     img.setAnimation(ani);


    }
}
