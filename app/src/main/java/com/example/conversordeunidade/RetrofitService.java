package com.example.conversordeunidade;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetrofitService {
    @Headers("X-Mashape-Key: AuuyclCPjcmshv2iOPq190OpzLrMp1FJWwejsnJrdfwOUr4h44")

    @FormUrlEncoded
    @POST("convert")
    Call<RespostaServidor> converterUnidade(@Field("from-type") String from_type,
                                            @Field("from-value") String from_value,
                                            @Field("to-type") String to_type);
}
