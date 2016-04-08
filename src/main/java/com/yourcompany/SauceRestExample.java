package com.yourcompany;


import com.yourcompany.service.SauceLabsService;
import com.yourcompany.service.SauceLabsServiceGenerator;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mehmetgerceker on 4/7/16.
 */
public class SauceRestExample {

    public static void main(String[] args){

        SauceLabsService service = SauceLabsServiceGenerator.createService(SauceLabsService.class,
                System.getenv("SAUCE_USERNAME"),
                System.getenv("SAUCE_ACCESS_KEY"));
        Call<>
        System.out.println(service.getUser("mehmetg"));
    }

}
