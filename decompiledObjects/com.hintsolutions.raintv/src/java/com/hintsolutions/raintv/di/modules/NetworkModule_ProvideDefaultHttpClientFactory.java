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

public final class NetworkModule_ProvideDefaultHttpClientFactory
implements Factory<OkHttpClient> {
    private final Provider<Context> contextProvider;
    private final NetworkModule module;

    public NetworkModule_ProvideDefaultHttpClientFactory(NetworkModule networkModule, Provider<Context> provider) {
        this.module = networkModule;
        this.contextProvider = provider;
    }

    public static NetworkModule_ProvideDefaultHttpClientFactory create(NetworkModule networkModule, Provider<Context> provider) {
        return new NetworkModule_ProvideDefaultHttpClientFactory(networkModule, provider);
    }

    public static OkHttpClient provideDefaultHttpClient(NetworkModule networkModule, Context context) {
        return (OkHttpClient)Preconditions.checkNotNull((Object)networkModule.provideDefaultHttpClient(context), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public OkHttpClient get() {
        return NetworkModule_ProvideDefaultHttpClientFactory.provideDefaultHttpClient(this.module, (Context)this.contextProvider.get());
    }
}

