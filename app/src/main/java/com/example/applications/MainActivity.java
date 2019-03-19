package com.example.applications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity {
    TextInputEditText name, phoneno, emailid, college, source, course, status, reg_date, comment;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (TextInputEditText) findViewById(R.id.textInputEditTextName);
        phoneno = (TextInputEditText) findViewById(R.id.textInputEditTextphoneno);
        emailid = (TextInputEditText) findViewById(R.id.textInputEditTextemail);
        college = (TextInputEditText) findViewById(R.id.textInputEditTextcollege);
        source = (TextInputEditText) findViewById(R.id.textInputEditTextsource);
        course = (TextInputEditText) findViewById(R.id.textInputEditTextcource);
        status = (TextInputEditText) findViewById(R.id.textInputEditTextstatus);
        reg_date = (TextInputEditText) findViewById(R.id.textInputEditTextreg_date);
        comment = (TextInputEditText) findViewById(R.id.textInputEditTextcomment);
        btn = (Button) findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aname = name.getText().toString();
                String aphoneno = phoneno.getText().toString();
                String aemailid = emailid.getText().toString();
                String acollege = college.getText().toString();
                String asource = source.getText().toString();
                String acourse = course.getText().toString();
                String astatus = status.getText().toString();
                String aregdate = reg_date.getText().toString();
                String acomment = comment.getText().toString();
                int lid=2;
                APIServices services=APIClient.getClient().create(APIServices.class);
                final Call<example> usercall=services.userSignUp(lid,aname,aphoneno,aemailid,acollege,asource,acourse,astatus,aregdate,acomment);
                usercall.enqueue(new Callback<example>() {
                    @Override
                    public void onResponse(Call<example> call, Response<example> response) {
                        Log.i("onResponse", new Gson().toJson(response.body()));
                        Toast.makeText(MainActivity.this,"details successfully submitted",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<example> call, Throwable t) {
                        Toast.makeText(MainActivity.this,"submission failed",Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });

    }
}