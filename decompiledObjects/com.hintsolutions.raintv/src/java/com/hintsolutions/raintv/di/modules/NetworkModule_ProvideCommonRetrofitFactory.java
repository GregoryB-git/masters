/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
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
import com.hintsolutions.raintv.di.modules.NetworkModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class NetworkModule_ProvideCommonRetrofitFactory
implements Factory<Retrofit> {
    private final Provider<Context> contextProvider;
    private final NetworkModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;

    public NetworkModule_ProvideCommonRetrofitFactory(NetworkModule networkModule, Provider<Context> provider, Provider<OkHttpClient> provider2) {
        this.module = networkModule;
        this.contextProvider = provider;
        this.okHttpClientProvider = provider2;
    }

    public static NetworkModule_ProvideCommonRetrofitFactory create(NetworkModule networkModule, Provider<Context> provider, Provider<OkHttpClient> provider2) {
        return new NetworkModule_ProvideCommonRetrofitFactory(networkModule, provider, provider2);
    }

    public static Retrofit provideCommonRetrofit(NetworkModule networkModule, Context context, OkHttpClient okHttpClient) {
        return (Retrofit)Preconditions.checkNotNull((Object)networkModule.provideCommonRetrofit(context, okHttpClient), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public Retrofit get() {
        return NetworkModule_ProvideCommonRetrofitFactory.provideCommonRetrofit(this.module, (Context)this.contextProvider.get(), (OkHttpClient)this.okHttpClientProvider.get());
    }
}

