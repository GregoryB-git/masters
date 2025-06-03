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
 *  retrofit2.http.GET
 *  retrofit2.http.Query
 */
package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.Tweet;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ListService {
    @GET(value="/1.1/lists/statuses.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<List<Tweet>> statuses(@Query(value="list_id") Long var1, @Query(value="slug") String var2, @Query(value="owner_screen_name") String var3, @Query(value="owner_id") Long var4, @Query(value="since_id") Long var5, @Query(value="max_id") Long var6, @Query(value="count") Integer var7, @Query(value="include_entities") Boolean var8, @Query(value="include_rts") Boolean var9);
}

