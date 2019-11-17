package com.suliman.chatapplication.Fragments;

import com.suliman.chatapplication.Notifications.MyResponse;
import com.suliman.chatapplication.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA6cEHUh8:APA91bHtXfRlRSL7SiXmXHGLqI03KUuQbhj2h7TwkhUfmG_P24B4PS8tcUUfT1lTDmP9ObekZQOZ3_0OSS4Ct_2SCJ0zl1c4YiradQhQoZt6LuAFb3wR18C6dOOwswrmf7eLB9rKGERc"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
