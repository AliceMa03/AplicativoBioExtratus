package com.example.infcomercial4.bioextratus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


import com.example.infcomercial4.bioextratus.fragments.ProductCreateFragment;
import com.example.infcomercial4.bioextratus.fragments.ProductListFragment;
import com.example.infcomercial4.bioextratus.interfaces.OnProductListener;
import com.example.infcomercial4.bioextratus.model.ProductModel;

import java.util.ArrayList;
import java.util.UUID;



public class MainActivity extends AppCompatActivity implements OnProductListener {

    private ArrayList<ProductModel> products;
    private ProductCreateFragment createFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.createFragment = null;

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createFragment = new ProductCreateFragment();
                replaceFragment(createFragment);
            }
        });

        this.products = fakeList();

        createProductList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void createProductList() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("dataSource", products);

        ProductListFragment fragment = new ProductListFragment();
        fragment.setArguments(bundle);

        replaceFragment(fragment);

        this.createFragment = null;
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.customLayout, fragment);
        ft.commit();
    }

    public ArrayList<ProductModel> fakeList() {
        ArrayList<ProductModel> result = new ArrayList<ProductModel>();

        return result;
    }

    @Override
    public void beforeCreate(ProductModel model) {
        this.products.add(model);
        createProductList();
    }

    @Override
    public void barcodeCapture(ProductModel model) {
        IntentIntegrator intent = new IntentIntegrator(MainActivity.this);
        intent.initiateScan();
    }

    @Override
    public void cancel() {
        createProductList();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            String barcode = result.getContents();
            if (barcode != null && !"".equals(barcode)) {
                createFragment.setBarCode(barcode);
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
