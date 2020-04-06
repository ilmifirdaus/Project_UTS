package id.ac.polinema.dapurku.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import id.ac.polinema.dapurku.R;

public class NoteActivity extends AppCompatActivity {

    private EditText descriptionInput;
    private EditText startInput;
    private EditText resultInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        descriptionInput = findViewById(R.id.input_description);
        startInput = findViewById(R.id.input_start);
        resultInput = findViewById(R.id.input_result);
    }

    public void handleSubmit(View view) {
        String desc = descriptionInput.getText().toString();
        String start = startInput.getText().toString();
        String result = resultInput.getText().toString();
        // Put the String to pass back into an Intent and close this activity]
        if (desc.equals("")) {
            Toast.makeText(this, "Harap Isi Deskripsi", Toast.LENGTH_SHORT).show();
        } else if (start.equals("")) {
            Toast.makeText(this, "Harap Isi Berat Awal", Toast.LENGTH_SHORT).show();
        } else if (result.equals("")) {
            Toast.makeText(this, "Harap Isi Berat Akhir", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent();
            intent.putExtra("desc", desc);
            intent.putExtra("start", start);
            intent.putExtra("result", result);
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}
