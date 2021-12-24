package com.example.IUSR;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    private TextView getResponseText;
    private EditText inputUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button getRequestButton = findViewById(R.id.getData);
        getResponseText = findViewById(R.id.getResponseData);
        inputUrl = (EditText) findViewById(R.id.inputUrl);

        getRequestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendGetRequest();
            }
        });

    }

    private void sendGetRequest(){
        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
        String url = inputUrl.getText().toString();
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                getResponseText.setText("Data: " + response + "\r\n");
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                getResponseText.setText("Data: Response Failed");
            }
        });

        queue.add(stringRequest);
    }
}