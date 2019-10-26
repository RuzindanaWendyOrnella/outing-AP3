package com.moringaschool.outingapi2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
public class SavedActivity extends AppCompatActivity {
    @BindView (R.id.locationNameText) TextView mlocationNameText;
    @BindView (R.id.locationTypeText) TextView mlocationTypeText;
    @BindView (R.id.locationDescriptionText) TextView mlocationDescriptionText;
    @BindView (R.id.locationDressCodeText) TextView mlocationDresscodeText;
    @BindView (R.id.locationTimeText) TextView mlocationTimeText;
private Context context;
private  SavedAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved);
        ButterKnife.bind(this);

   /*     SavedAdapter adapter=new SavedAdapter(this,android.R.layout.simple_list_item_1,mlist,mlocationNameText,mlocationTypeText,mlocationDescriptionText,mlocationDresscodeText,mlocationTimeText,context);*/
     /*  SavedAdapter adapter=new SavedAdapter()*/
        Intent intent2 = getIntent();
        String Name = intent2.getStringExtra("Name");
        System.out.println(Name);
        String Type = intent2.getStringExtra("Type");
        String Description = intent2.getStringExtra("Description");
        String Dresscode = intent2.getStringExtra("Dresscode");
        String Time = intent2.getStringExtra("Time");
        mlocationNameText.setText(  "NAME: " + Name);
        mlocationTypeText.setText(  "TYPE: " + Type);
        mlocationDescriptionText.setText(  "DESCRIPTION: " + Description);
        mlocationDresscodeText.setText("DRESSCODE: " +  Dresscode);
        mlocationTimeText.setText(  "TIME: " + Time);
        Toast.makeText(SavedActivity.this, "Congratulations,your Event Has Been Saved!", Toast.LENGTH_LONG).show();
    }
}
