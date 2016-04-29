package com.example.steve.simpfit;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeScreen extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        FragmentManager fm = getSupportFragmentManager();
        Fragment frag1 =fm.findFragmentById(R.id.fragcont);

        if (frag1 == null){
            frag1 = new FitnessFrag();
            fm.beginTransaction()
                    .add(R.id.fragcont, frag1)
                    .commit();
        }



    }

    public void LogOff(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("Logging Off");
        myAlert.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(WelcomeScreen.this, MainActivity.class);
                startActivity(i);
                dialog.dismiss();
            }
        })
                .create();
        myAlert.show();

    }

    public void NewClient(View view) {
        Intent i = new Intent(this, NewClient.class);
        startActivity(i);
    }

    public void NewSession(View view) {
        Intent i = new Intent(this, NewSession.class);
        startActivity(i);
    }

    public void ViewUpcoming(View view) {
        Intent i = new Intent(this, ViewUpcoming.class);
        startActivity(i);

    }

    public void ViewClients(View view) {
        Intent i = new Intent(this, ViewClients.class);
        startActivity(i);
    }
}

