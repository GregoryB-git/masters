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
 */
package com.hintsolutions.raintv.di.modules;

import android.content.Context;
import com.hintsolutions.raintv.di.modules.NetworkModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

public final class NetworkModule_ProvideCustomHttpClientFactory
implements Factory<OkHttpClient> {
    private final Provider<Context> contextProvider;
    private final NetworkModule module;

    public NetworkModule_ProvideCustomHttpClientFactory(NetworkModule networkModule, Provider<Context> provider) {
        this.module = networkModule;
        this.contextProvider = provider;
    }

    public static NetworkModule_ProvideCustomHttpClientFactory create(NetworkModule networkModule, Provider<Context> provider) {
        return new NetworkModule_ProvideCustomHttpClientFactory(networkModule, provider);
    }

    public static OkHttpClient provideCustomHttpClient(NetworkModule networkModule, Context context) {
        return (OkHttpClient)Preconditions.checkNotNull((Object)networkModule.provideCustomHttpClient(context), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public OkHttpClient get() {
        return NetworkModule_ProvideCustomHttpClientFactory.provideCustomHttpClient(this.module, (Context)this.contextProvider.get());
    }
}

