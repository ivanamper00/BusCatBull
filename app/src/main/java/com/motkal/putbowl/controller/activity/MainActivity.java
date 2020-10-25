package com.motkal.putbowl.controller.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.motkal.putbowl.R;
import com.motkal.putbowl.controller.activity.fragments.LeaguesFragment;
import com.motkal.putbowl.controller.activity.fragments.LiveFragment;
import com.motkal.putbowl.controller.activity.fragments.MatchesFragment;
import com.motkal.putbowl.controller.activity.fragments.TeamsFragment;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;
    FragmentManager fragmentManager;
    TeamsFragment teamsFragment;
    LeaguesFragment leaguesFragment;
    LiveFragment liveFragment;
    MatchesFragment matchesFragment;
    float resources;
    CoordinatorLayout.LayoutParams param;
    int flag;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

//            LinearLayout.LayoutParams buttonLayoutParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//            buttonLayoutParams.setMargins(50, 10, 0, 0);
//            button.setLayoutParams(buttonLayoutParams);
            switch (item.getItemId()){
                case R.id.live:

                    liveFragment = new LiveFragment();
                    flag = 0;
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.main_frame_layout, liveFragment).commit();
                    System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa " + liveFragment.getTag());
                    return true;
                case R.id.matches:

                    matchesFragment = new MatchesFragment();
                    flag = 0;
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.main_frame_layout, matchesFragment).commit();
                    System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa " + matchesFragment.getTag());
                    return true;
                case R.id.teams:

                    teamsFragment = new TeamsFragment();
                    flag = 0;
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.main_frame_layout, teamsFragment).commit();
                    System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa " + teamsFragment.getTag());
                    return true;
                case R.id.leagues:
//                    if(navImage.getVisibility() != ImageView.GONE){
//                        navImage.setVisibility(ImageView.GONE);
//                        param.setMargins(0,marginTop(0),0,55);
//                        frameLayout.setLayoutParams(param);
//                    }
                    leaguesFragment = new LeaguesFragment();
                    flag = 0;
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.main_frame_layout, leaguesFragment).commit();
                    System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa " + leaguesFragment.getTag());
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main();
    }

    public void main(){
        resources = this.getResources().getDisplayMetrics().density;
        bottomNavigationView = findViewById(R.id.main_navigation_menu);
//        param = new CoordinatorLayout.LayoutParams(CoordinatorLayout.LayoutParams.MATCH_PARENT,CoordinatorLayout.LayoutParams.MATCH_PARENT);
//        navImage = findViewById(R.id.imageView);
        frameLayout = findViewById(R.id.main_frame_layout);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        bottomNavigationView.setSelectedItemId(R.id.live);
        flag = 0;
    }

    public int marginTop(int number){
        return (int)(number * resources);
    }

    @Override
    public void onBackPressed() {
        if(flag== 1){
            finish();
        }else{
            flag++;
            Toast.makeText(MainActivity.this, "Press Back to Exit.", Toast.LENGTH_SHORT).show();
        }
    }
}