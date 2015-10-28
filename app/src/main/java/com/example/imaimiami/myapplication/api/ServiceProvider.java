package com.example.imaimiami.myapplication.api;

import java.lang.reflect.Type;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

import com.example.imaimiami.myapplication.model.Images;
import com.example.imaimiami.myapplication.model.Image;

public class ServiceProvider {

    private static RestAdapter restAdapter = null;

    private static RestAdapter getRestAdapter() {
        if (restAdapter == null) {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
//                    .registerTypeAdapter(Image.class, new MyDeserializer())
                    .create();
            restAdapter = new RestAdapter.Builder()
                    .setEndpoint("http://192.168.11.165:3000")
                    .setConverter(new GsonConverter(gson))
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .build();
        }
        return restAdapter;
    }

    public static ApiService getApiService() {
        return getRestAdapter().create(ApiService.class);
    }
}

//class MyDeserializer implements JsonDeserializer<Image>
//{
//    @Override
//    public Image deserialize(JsonElement je, Type type, JsonDeserializationContext jdc)
//            throws JsonParseException
//    {
//        // Get the "content" element from the parsed JSON
//        JsonElement content = je.getAsJsonObject().get("books");
//
//        // Deserialize it. You use a new instance of Gson to avoid infinite recursion
//        // to this deserializer
//        return new Gson().fromJson(content, Image.class);
//
//    }
//}
