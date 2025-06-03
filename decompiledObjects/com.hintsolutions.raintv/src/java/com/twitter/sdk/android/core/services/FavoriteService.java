/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.models.Tweet
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  retrofit2.Call
 *  retrofit2.http.Field
 *  retrofit2.http.FormUrlEncoded
 *  retrofit2.http.GET
 *  retrofit2.http.POST
 *  retrofit2.http.Query
 */
package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.Tweet;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface FavoriteService {
    @FormUrlEncoded
    @POST(value="/1.1/favorites/create.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<Tweet> create(@Field(value="id") Long var1, @Field(value="include_entities") Boolean var2);

    @FormUrlEncoded
    @POST(value="/1.1/favorites/destroy.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<Tweet> destroy(@Field(value="id") Long var1, @Field(value="include_entities") Boolean var2);

    @GET(value="/1.1/favorites/list.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<List<Tweet>> list(@Query(value="user_id") Long var1, @Query(value="screen_name") String var2, @Query(value="count") Integer var3, @Query(value="since_id") String var4, @Query(value="max_id") String var5, @Query(value="include_entities") Boolean var6);
}

