/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.models.Tweet
 *  java.lang.Boolean
 *  java.lang.Double
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
 *  retrofit2.http.Path
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
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface StatusesService {
    @FormUrlEncoded
    @POST(value="/1.1/statuses/destroy/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<Tweet> destroy(@Path(value="id") Long var1, @Field(value="trim_user") Boolean var2);

    @GET(value="/1.1/statuses/home_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<List<Tweet>> homeTimeline(@Query(value="count") Integer var1, @Query(value="since_id") Long var2, @Query(value="max_id") Long var3, @Query(value="trim_user") Boolean var4, @Query(value="exclude_replies") Boolean var5, @Query(value="contributor_details") Boolean var6, @Query(value="include_entities") Boolean var7);

    @GET(value="/1.1/statuses/lookup.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<List<Tweet>> lookup(@Query(value="id") String var1, @Query(value="include_entities") Boolean var2, @Query(value="trim_user") Boolean var3, @Query(value="map") Boolean var4);

    @GET(value="/1.1/statuses/mentions_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<List<Tweet>> mentionsTimeline(@Query(value="count") Integer var1, @Query(value="since_id") Long var2, @Query(value="max_id") Long var3, @Query(value="trim_user") Boolean var4, @Query(value="contributor_details") Boolean var5, @Query(value="include_entities") Boolean var6);

    @FormUrlEncoded
    @POST(value="/1.1/statuses/retweet/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<Tweet> retweet(@Path(value="id") Long var1, @Field(value="trim_user") Boolean var2);

    @GET(value="/1.1/statuses/retweets_of_me.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<List<Tweet>> retweetsOfMe(@Query(value="count") Integer var1, @Query(value="since_id") Long var2, @Query(value="max_id") Long var3, @Query(value="trim_user") Boolean var4, @Query(value="include_entities") Boolean var5, @Query(value="include_user_entities") Boolean var6);

    @GET(value="/1.1/statuses/show.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<Tweet> show(@Query(value="id") Long var1, @Query(value="trim_user") Boolean var2, @Query(value="include_my_retweet") Boolean var3, @Query(value="include_entities") Boolean var4);

    @FormUrlEncoded
    @POST(value="/1.1/statuses/unretweet/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<Tweet> unretweet(@Path(value="id") Long var1, @Field(value="trim_user") Boolean var2);

    @FormUrlEncoded
    @POST(value="/1.1/statuses/update.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<Tweet> update(@Field(value="status") String var1, @Field(value="in_reply_to_status_id") Long var2, @Field(value="possibly_sensitive") Boolean var3, @Field(value="lat") Double var4, @Field(value="long") Double var5, @Field(value="place_id") String var6, @Field(value="display_coordinates") Boolean var7, @Field(value="trim_user") Boolean var8, @Field(value="media_ids") String var9);

    @GET(value="/1.1/statuses/user_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    public Call<List<Tweet>> userTimeline(@Query(value="user_id") Long var1, @Query(value="screen_name") String var2, @Query(value="count") Integer var3, @Query(value="since_id") Long var4, @Query(value="max_id") Long var5, @Query(value="trim_user") Boolean var6, @Query(value="exclude_replies") Boolean var7, @Query(value="contributor_details") Boolean var8, @Query(value="include_rts") Boolean var9);
}

