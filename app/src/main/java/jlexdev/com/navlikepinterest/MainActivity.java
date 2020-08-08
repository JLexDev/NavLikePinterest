package jlexdev.com.navlikepinterest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        // Disabled Animation
        BottomNavHelper.disableShiftMode(bottomNav);

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                switch (id){
                    case R.id.action_home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.action_posts:
                        Toast.makeText(MainActivity.this, "Posts", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.action_form:
                        Toast.makeText(MainActivity.this, "Form", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.action_account:
                        Toast.makeText(MainActivity.this, "Ir a BottomNavEx", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(i);
                        return true;
                }

                return false;
            }
        });
    }
}
