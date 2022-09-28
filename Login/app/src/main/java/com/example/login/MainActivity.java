package com.example.login;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.signin);
        myButton.setOnClickListener(view -> {
            EditText email = findViewById(R.id.editTextTextPersonName7);
            EditText password = findViewById(R.id.editTextTextPassword);
            EditText name = findViewById(R.id.editName);

            JSONObject jsonBody = new JSONObject();
            try {
                jsonBody.put("email", email.getText());
                jsonBody.put("password", password.getText());
                jsonBody.put("nombre", name.getText());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            final String requestBody = jsonBody.toString();
            Log.e("test", jsonBody.toString());
            String myUrl = " https://f97d-2800-e2-4e80-25d0-4833-e377-aa27-2488.ngrok.io/guardar";
            StringRequest myRequest = new StringRequest(Request.Method.POST, myUrl, response -> {
                try {
                    JSONObject myObj = new JSONObject(response);
                    myObj.getString("Holi");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }, error -> {
                Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }) {
                @Override
                public String getBodyContentType() {
                    return "application/json; charset=utf-8";
                }

                @Override
                public byte[] getBody() throws AuthFailureError {

                    try {
                        return requestBody.getBytes(StandardCharsets.UTF_8);
                    } catch (Exception e) {
                        return null;
                    }
                }

                @Override
                protected Response<String> parseNetworkResponse(NetworkResponse response) {

                    String responseString = "";
                    if (response != null) {
                        responseString = String.valueOf(response.statusCode);
                    }
                    return Response.success(responseString, HttpHeaderParser.parseCacheHeaders(response));
                }
            };
            RequestQueue myRequestque = Volley.newRequestQueue(getApplicationContext());
            myRequestque.add(myRequest);
        });
    }


}