package jlexdev.com.navlikepinterest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /**
         * Add repositories in build.gradle (Project)
         * Add dependencies in build.gradle (Module)
         * Add rules in proguard-wrapper.properties
         */

        // Init
        BottomNavigationViewEx bottomNavEx = findViewById(R.id.bottom_nav_ex);

        // Disable all animation
        bottomNavEx.enableAnimation(false);
        bottomNavEx.enableShiftingMode(false);
        bottomNavEx.enableItemShiftingMode(false);

        // Change Dimens
        //bottomNavEx.setIconSize(20, 20); //(dp)
        bottomNavEx.setTextSize(10); //(sp)

        // Event
        bottomNavEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                switch (id){
                    case R.id.action_home:
                        Toast.makeText(SecondActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.action_posts:
                        Toast.makeText(SecondActivity.this, "Posts", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.action_form:
                        Toast.makeText(SecondActivity.this, "Form", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.action_account:
                        Toast.makeText(SecondActivity.this, "Regresar", Toast.LENGTH_SHORT).show();
                        finish();
                        return true;
                }

                return false;
            }
        });
    }
}
