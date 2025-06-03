/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.gson.Gson
 *  dagger.internal.Factory
 *  dagger.internal.Preconditions
 *  java.lang.Object
 *  java.lang.String
 *  javax.inject.Provider
 *  okhttp3.OkHttpClient
 *  retrofit2.Retrofit
 */
package com.hintsolutions.raintv.di.modules;

import android.content.Context;
import com.google.gson.Gson;
import com.hintsolutions.raintv.di.modules.NetworkModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class NetworkModule_ProvideEagleRetrofitFactory
implements Factory<Retrofit> {
    private final Provider<Context> contextProvider;
    private final Provider<Gson> gsonProvider;
    private final NetworkModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;

    public NetworkModule_ProvideEagleRetrofitFactory(NetworkModule networkModule, Provider<Context> provider, Provider<OkHttpClient> provider2, Provider<Gson> provider3) {
        this.module = networkModule;
        this.contextProvider = provider;
        this.okHttpClientProvider = provider2;
        this.gsonProvider = provider3;
    }

    public static NetworkModule_ProvideEagleRetrofitFactory create(NetworkModule networkModule, Provider<Context> provider, Provider<OkHttpClient> provider2, Provider<Gson> provider3) {
        return new NetworkModule_ProvideEagleRetrofitFactory(networkModule, provider, provider2, provider3);
    }

    public static Retrofit provideEagleRetrofit(NetworkModule networkModule, Context context, OkHttpClient okHttpClient, Gson gson) {
        return (Retrofit)Preconditions.checkNotNull((Object)networkModule.provideEagleRetrofit(context, okHttpClient, gson), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public Retrofit get() {
        return NetworkModule_ProvideEagleRetrofitFactory.provideEagleRetrofit(this.module, (Context)this.contextProvider.get(), (OkHttpClient)this.okHttpClientProvider.get(), (Gson)this.gsonProvider.get());
    }
}

