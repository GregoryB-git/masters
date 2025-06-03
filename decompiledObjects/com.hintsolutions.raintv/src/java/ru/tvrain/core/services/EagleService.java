/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  okhttp3.RequestBody
 *  retrofit2.http.Body
 *  retrofit2.http.GET
 *  retrofit2.http.POST
 *  retrofit2.http.Path
 *  retrofit2.http.Query
 *  retrofit2.http.Url
 *  rx.Observable
 */
package ru.tvrain.core.services;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import ru.tvrain.core.data.eagle.EagleRequest;
import ru.tvrain.core.data.eagle.EagleResponse;
import ru.tvrain.core.data.eagle.Record;
import rx.Observable;

public interface EagleService {
    @POST(value="media/records.json?account=tvrainru")
    public Observable<EagleResponse> createVideo(@Query(value="auth_token") String var1, @Body EagleRequest var2);

    @GET(value="media/records/{id}.json")
    public Observable<EagleResponse> getVideo(@Path(value="id") Integer var1, @Query(value="account") String var2, @Query(value="auth_token") String var3);

    @POST
    public Observable<Record> uploadVideo(@Url String var1, @Body RequestBody var2);
}

