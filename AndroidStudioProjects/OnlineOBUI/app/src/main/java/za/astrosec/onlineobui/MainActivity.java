package za.astrosec.onlineobui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import za.astrosec.onlineobui.views.GuardActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//initiate login button
        Button loginButton     = (Button) findViewById(R.id.loginButton);
        EditText loginName     = (EditText) findViewById(R.id.loginName);
        EditText loginPassword = (EditText) findViewById(R.id.loginPassword);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
                //if loginName role == guard
                Intent login = new Intent(MainActivity.this, GuardActivity.class);
                startActivity(login);
                //TODO
                //ELSE
                //if loginName role == manager
                //Intent login = new Intent(MainActivity.this, GuardActivity.class);
                //startActivity(login);
            }
        });

    }


}
