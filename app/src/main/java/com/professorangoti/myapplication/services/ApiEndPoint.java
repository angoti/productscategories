package com.professorangoti.myapplication.services;

import com.professorangoti.myapplication.entities.Product;
import com.professorangoti.myapplication.entities.User;
import com.professorangoti.myapplication.entities.UserLog;
import com.professorangoti.myapplication.entities.UserLogReturn;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiEndPoint {

    @POST("auth/login")
    Call<UserLogReturn> autenticar(@Body UserLog userLog);

    @POST("users")
    Call<User> cadastrarNovoUsuario(@Body User user);

    @GET("products")
    Call<Product> todosProdutos();
}
