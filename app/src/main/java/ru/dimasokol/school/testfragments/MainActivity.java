package ru.dimasokol.school.testfragments;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.root_layout, SelfIdFragment.newInstance())
                    .commit();
        }

        findViewById(R.id.button_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                        .add(R.id.root_layout, TextFragment.newInstance(Long.toString(System.currentTimeMillis())))
                        .commit();

            }
        });

        findViewById(R.id.button_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialogFragment fragment = AlertDialogFragment.newInstance(Long.toString(System.currentTimeMillis()));
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(fragment, null)
                        .commitAllowingStateLoss();
            }
        });
    }

}
