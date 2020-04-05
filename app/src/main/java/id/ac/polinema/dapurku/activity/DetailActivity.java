package id.ac.polinema.dapurku.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import id.ac.polinema.dapurku.R;
import id.ac.polinema.dapurku.adapter.MenuAdapter;
import id.ac.polinema.dapurku.model.ModelResep;

public class DetailActivity extends AppCompatActivity {
    public static final String TRANSACTION_KEY = "TRANSACTION";
    public static final String INDEX_KEY = "INDEX";
    public static final int INSERT_REQUEST = 1;
    public static final int UPDATE_REQUEST = 2;

    public MenuAdapter menuAdapter;
    public RecyclerView recyclerView;
    public ArrayList<ModelResep> dataModelArrayList = new ArrayList<ModelResep>();

    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        ModelResep data = (ModelResep) bundle.getSerializable("dataModel");

        // setting judul bar
        setTitle(data.getJudul());

        //tampil data konten
        webView1 = findViewById(R.id.webView1);
        webView1.loadUrl("file:///android_asset/" + data.getKonten());
    }
    }