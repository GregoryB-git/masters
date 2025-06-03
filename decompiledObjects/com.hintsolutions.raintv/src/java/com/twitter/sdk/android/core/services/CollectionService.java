/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  retrofit2.Call
 *  retrofit2.http.GET
 *  retrofit2.http.Query
 */
package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.TwitterCollection;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CollectionService {
    @GET(value="/1.1/collections/entries.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<TwitterCollection> collection(@Query(value="id") String var1, @Query(value="count") Integer var2, @Query(value="max_position") Long var3, @Query(value="min_position") Long var4);
}

