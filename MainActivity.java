package com.example.covidchecker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox checkCold = findViewById(R.id.checkCold);
    private CheckBox checkCough = findViewById(R.id.checkCough);
    private CheckBox checkFever = findViewById(R.id.checkFever);
    private CheckBox checkThroatPain = findViewById(R.id.checkThroatPain);
    private CheckBox checkBreathingIssues = findViewById(R.id.checkBreathingIssues);
    private ProgressBar progressBar = findViewById(R.id.progressBar);

    @Override
    public void onClick(View v) {

        if (((CheckBox) v).isChecked()) {
            Toast.makeText(this, "blah", Toast.LENGTH_SHORT).show();
//            progressBar.incrementProgressBy(20);
//        } else {
//            progressBar.incrementProgressBy(-20);
        }

        //        if (checkCough.isChecked()) {
//            progressBar.incrementProgressBy(20);
//        } else {
//            progressBar.incrementProgressBy(-20);
//        }
//        if (checkFever.isChecked()) {
//            progressBar.incrementProgressBy(20);
//        } else {
//            progressBar.incrementProgressBy(-20);
//        }
//        if (checkThroatPain.isChecked()) {
//            progressBar.incrementProgressBy(20);
//        } else {
//            progressBar.incrementProgressBy(-20);
//        }
//        if (checkBreathingIssues.isChecked()) {
//            progressBar.incrementProgressBy(20);
//        } else {
//            progressBar.incrementProgressBy(-20);
//        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkCold = findViewById(R.id.checkCold);
        checkCough = findViewById(R.id.checkCough);
        checkFever = findViewById(R.id.checkFever);
        checkThroatPain = findViewById(R.id.checkThroatPain);
        checkBreathingIssues = findViewById(R.id.checkBreathingIssues);
        progressBar = findViewById(R.id.progressBar);

        checkCold.setOnClickListener(this);
        checkCough.setOnClickListener(this);
        checkFever.setOnClickListener(this);
        checkThroatPain.setOnClickListener(this);
        checkBreathingIssues.setOnClickListener(this);

        if (checkCold.isChecked() && checkCough.isChecked() && checkFever.isChecked() && checkThroatPain.isChecked() && checkBreathingIssues.isChecked())
            Toast.makeText(MainActivity.this, "YOU GON DIE", Toast.LENGTH_SHORT).show();
    }

    public void btnClick(View view) {

        EditText edtTxtName = findViewById(R.id.edtTxtName);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        TextView txtHello = findViewById(R.id.txtHello);
        txtHello.setText("Hello " + edtTxtName.getText().toString() + " !!");
        Toast.makeText(this, "Vanakkam di maapla", Toast.LENGTH_SHORT).show();
    }

}