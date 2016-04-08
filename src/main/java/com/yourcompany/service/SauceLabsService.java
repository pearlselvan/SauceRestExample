package com.yourcompany.service;

import com.yourcompany.models.SauceUser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by mehmetgerceker on 4/7/16.
 */
public interface SauceLabsService {
    @GET("users/{username}")
    Call<SauceUser> getUser(@Path("username") String username);
}
