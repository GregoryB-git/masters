/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.TypeAdapterFactory
 *  com.twitter.sdk.android.core.TwitterAuthToken
 *  com.twitter.sdk.android.core.TwitterSession
 *  com.twitter.sdk.android.core.models.BindingValuesAdapter
 *  com.twitter.sdk.android.core.models.SafeListAdapter
 *  com.twitter.sdk.android.core.models.SafeMapAdapter
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.concurrent.ConcurrentHashMap
 *  okhttp3.OkHttpClient
 *  retrofit2.Converter$Factory
 *  retrofit2.Retrofit
 *  retrofit2.Retrofit$Builder
 *  retrofit2.converter.gson.GsonConverterFactory
 */
package com.twitter.sdk.android.core;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.internal.network.OkHttpClientHelper;
import com.twitter.sdk.android.core.models.BindingValues;
import com.twitter.sdk.android.core.models.BindingValuesAdapter;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import com.twitter.sdk.android.core.services.AccountService;
import com.twitter.sdk.android.core.services.CollectionService;
import com.twitter.sdk.android.core.services.ConfigurationService;
import com.twitter.sdk.android.core.services.FavoriteService;
import com.twitter.sdk.android.core.services.ListService;
import com.twitter.sdk.android.core.services.MediaService;
import com.twitter.sdk.android.core.services.SearchService;
import com.twitter.sdk.android.core.services.StatusesService;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TwitterApiClient {
    public final Retrofit retrofit;
    public final ConcurrentHashMap<Class, Object> services = this.buildConcurrentMap();

    public TwitterApiClient() {
        this(OkHttpClientHelper.getOkHttpClient(TwitterCore.getInstance().getGuestSessionProvider()), new TwitterApi());
    }

    public TwitterApiClient(TwitterSession twitterSession) {
        this(OkHttpClientHelper.getOkHttpClient((Session<? extends TwitterAuthToken>)twitterSession, TwitterCore.getInstance().getAuthConfig()), new TwitterApi());
    }

    public TwitterApiClient(TwitterSession twitterSession, OkHttpClient okHttpClient) {
        this(OkHttpClientHelper.getCustomOkHttpClient(okHttpClient, (Session<? extends TwitterAuthToken>)twitterSession, TwitterCore.getInstance().getAuthConfig()), new TwitterApi());
    }

    public TwitterApiClient(OkHttpClient okHttpClient) {
        this(OkHttpClientHelper.getCustomOkHttpClient(okHttpClient, TwitterCore.getInstance().getGuestSessionProvider()), new TwitterApi());
    }

    public TwitterApiClient(OkHttpClient okHttpClient, TwitterApi twitterApi) {
        this.retrofit = this.buildRetrofit(okHttpClient, twitterApi);
    }

    private ConcurrentHashMap buildConcurrentMap() {
        return new ConcurrentHashMap();
    }

    private Gson buildGson() {
        return new GsonBuilder().registerTypeAdapterFactory((TypeAdapterFactory)new SafeListAdapter()).registerTypeAdapterFactory((TypeAdapterFactory)new SafeMapAdapter()).registerTypeAdapter(BindingValues.class, (Object)new BindingValuesAdapter()).create();
    }

    private Retrofit buildRetrofit(OkHttpClient okHttpClient, TwitterApi twitterApi) {
        return new Retrofit.Builder().client(okHttpClient).baseUrl(twitterApi.getBaseHostUrl()).addConverterFactory((Converter.Factory)GsonConverterFactory.create((Gson)this.buildGson())).build();
    }

    public AccountService getAccountService() {
        return this.getService(AccountService.class);
    }

    public CollectionService getCollectionService() {
        return this.getService(CollectionService.class);
    }

    public ConfigurationService getConfigurationService() {
        return this.getService(ConfigurationService.class);
    }

    public FavoriteService getFavoriteService() {
        return this.getService(FavoriteService.class);
    }

    public ListService getListService() {
        return this.getService(ListService.class);
    }

    public MediaService getMediaService() {
        return this.getService(MediaService.class);
    }

    public SearchService getSearchService() {
        return this.getService(SearchService.class);
    }

    public <T> T getService(Class<T> clazz) {
        if (!this.services.contains(clazz)) {
            this.services.putIfAbsent(clazz, this.retrofit.create(clazz));
        }
        return (T)this.services.get(clazz);
    }

    public StatusesService getStatusesService() {
        return this.getService(StatusesService.class);
    }
}

