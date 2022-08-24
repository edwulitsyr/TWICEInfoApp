package com.example.project1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * MainActivity
 */
public class MainActivity extends AppCompatActivity {

    // key used to pass extra data to an intent specifying the origin of the method call
    public static final String ORIGIN_EXTRA_TAG = "originExtra";

    /**
     * Navigation listener used to load fragments based on which nav icon is clicked
     */
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            // determine which fragment to create based on menu selection
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.songsFragment:
                    selectedFragment = new SongsFragment();
                    break;
                case R.id.aboutFragment:
                    selectedFragment = new AboutFragment();
                    break;
                case R.id.membersFragment:
                    selectedFragment = new MembersFragment();
                    break;
            }
            // support switching between fragments
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment)
                    .commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // initialize bottom nav
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AboutFragment()).commit();

        // set default view to be the ABOUT fragment
        if (savedInstanceState == null) {
            bottomNavigationView.setSelectedItemId(R.id.aboutFragment);
        }
    }

    /**
     * Navigate to more info activity screen
     */
    public void goToMoreInfoActivity(View view) {
        Intent intent = new Intent(this, MoreInfoActivity.class);

        // determine the origin of the more info request
        String tag = (String) view.getTag();
        switch (tag) {
            case "origin_about":
                intent.putExtra(ORIGIN_EXTRA_TAG, Origin.ABOUT); // origin of the call to start MoreInfo activity is the ABOUT page
        }
        startActivity(intent);
    }
}