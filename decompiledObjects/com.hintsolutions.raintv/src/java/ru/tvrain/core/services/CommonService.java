/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  okhttp3.ResponseBody
 *  retrofit2.http.GET
 *  retrofit2.http.Url
 *  rx.Observable
 */
package ru.tvrain.core.services;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

public interface CommonService {
    @GET
    public Observable<ResponseBody> getStreams(@Url String var1);
}

