package com.moringaschool.outingapi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;

public class CreateNewAccount extends AppCompatActivity {
    @BindView(R.id.createUserButton) Button mCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_account);
            mCreate = (Button) findViewById(R.id.createUserButton);

            mCreate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(CreateNewAccount.this,EscapeActivity.class);
                    startActivity(intent);

                }
            });
        }
    }

