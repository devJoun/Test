package com.example.test;
import com.android.volley.AuthFailureError;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest { //php 연동
    final static String url="https://kimjong7413.cafe24.com/Login.php";

    private Map<String,String>map;

    public LoginRequest(String userID,String userPassword,Response.Listener<String>listener){
        super(Method.POST,url,listener,null);
        map=new HashMap<>();

        map.put("userID",userID);
        map.put("userPassword",userPassword);

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}