package com.motkal.putbowl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.motkal.putbowl.controller.DataController;
import com.motkal.putbowl.controller.activity.MainActivity;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class SplashActivity extends AppCompatActivity {
    DataController dataController;
//    ImageView splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        dataController = new DataController(this);
//        splash = findViewById(R.id.splash);
//        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(splash);
//        Glide.with(this).load(R.drawable.soccer_ball).into(imageViewTarget);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        dataController.clearContents();
        dataController.saveAllQueries();
        dataController.loopSplash();
    }
}