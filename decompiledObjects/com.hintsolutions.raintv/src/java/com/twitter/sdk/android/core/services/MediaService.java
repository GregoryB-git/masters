/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  okhttp3.RequestBody
 *  retrofit2.Call
 *  retrofit2.http.Multipart
 *  retrofit2.http.POST
 *  retrofit2.http.Part
 */
package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.Media;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface MediaService {
    @Multipart
    @POST(value="https://upload.twitter.com/1.1/media/upload.json")
    public Call<Media> upload(@Part(value="media") RequestBody var1, @Part(value="media_data") RequestBody var2, @Part(value="additional_owners") RequestBody var3);
}

