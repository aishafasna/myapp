package com.example.applications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class display extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        APIServices service = APIClient.getClient().create(APIServices.class);

        Call<example> userCall = service.userDisplay();
        userCall.enqueue(new Callback<example>() {
            @Override
            public void onResponse(Call<example> call, Response<example> response) {
                example ex=response.body();
                List<Table> examples= ex.getTable();
                ContactAdapter adapter = new ContactAdapter(getApplicationContext(),examples);

                recyclerView.setAdapter(adapter);


            }

            @Override
            public void onFailure(Call<example> call, Throwable t) {

            }
        });



    }


}


