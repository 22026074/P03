package sg.edu.rp.c346.id22026074.p03s01;

import static sg.edu.rp.c346.id22026074.p03s01.R.*;
import static sg.edu.rp.c346.id22026074.p03s01.R.id.*;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import sg.edu.rp.c346.id22026074.p03s01.R;

public class MainActivity extends AppCompatActivity {

    //step uno: declare field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbDisplay;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        //step dos: link field variable to UI components in layout
        tvDisplay = findViewById(textViewDisplay);
        btnDisplay = findViewById(buttonDisplay);
        etInput = findViewById(editTextInput);
        tbDisplay = findViewById(toggleButtonEnabled);
        rgGender = findViewById(id.radioGroupDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                String pronouns = "";
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == id.radioButtonMale) {
                    pronouns = "He says";
                } else {
                    pronouns = "She says";
                }
                tvDisplay.setText(pronouns + ", '" + stringResponse + "'");
            }
        });

        tbDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbDisplay.isChecked()) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }
            }
        });

    }
}