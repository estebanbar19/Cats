package com.test.cats.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.test.cats.Adapters.catsRecyclerViewAdapter;
import com.test.cats.R;
import com.test.cats.data.ApiAdapter;
import com.test.cats.models.Cat;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.catsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        ApiAdapter.getApiService().getCats().enqueue(new Callback<List<Cat>>() {
            @Override
            public void onResponse(Call<List<Cat>> call, Response<List<Cat>> response) {
                System.out.println("\n\nLista de gatos: "+response.body().toString()+"\n\n");
                recyclerView.setAdapter(new catsRecyclerViewAdapter(response.body()));
            }

            @Override
            public void onFailure(Call<List<Cat>> call, Throwable t) {
                System.out.println("Failure\n"+t.getMessage());
            }
        });
    }
}