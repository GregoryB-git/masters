/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  retrofit2.Call
 *  retrofit2.http.GET
 *  retrofit2.http.Query
 */
package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.Search;
import com.twitter.sdk.android.core.services.params.Geocode;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SearchService {
    @GET(value="/1.1/search/tweets.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<Search> tweets(@Query(value="q") String var1, @Query(encoded=true, value="geocode") Geocode var2, @Query(value="lang") String var3, @Query(value="locale") String var4, @Query(value="result_type") String var5, @Query(value="count") Integer var6, @Query(value="until") String var7, @Query(value="since_id") Long var8, @Query(value="max_id") Long var9, @Query(value="include_entities") Boolean var10);
}

