package id.ac.polinema.dapurku.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import id.ac.polinema.dapurku.R;
import id.ac.polinema.dapurku.model.ModelResep;

public class DetailActivity extends AppCompatActivity {

    TextView deskripsi;
    TextView berat_awal;
    TextView berat_akhir;

    String desc, start, result;

    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        deskripsi = findViewById(R.id.text_description);
        berat_awal = findViewById(R.id.text_start);
        berat_akhir = findViewById(R.id.text_result);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, NoteActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        ModelResep data = (ModelResep) bundle.getSerializable("dataModel");

        // setting judul bar
        setTitle(data.getJudul());

        //tampil data konten
        webView1 = findViewById(R.id.webView1);
        webView1.loadUrl("file:///android_asset/" + data.getKonten());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                desc = data.getStringExtra("desc");
                start = data.getStringExtra("start");
                result = data.getStringExtra("result");

                deskripsi.setText(desc);
                berat_awal.setText(start);
                berat_akhir.setText(result);
            }
        }
    }
}