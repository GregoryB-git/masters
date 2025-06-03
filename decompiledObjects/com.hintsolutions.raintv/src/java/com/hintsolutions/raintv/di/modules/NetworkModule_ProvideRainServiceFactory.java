/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dagger.internal.Factory
 *  dagger.internal.Preconditions
 *  java.lang.Object
 *  java.lang.String
 *  javax.inject.Provider
 *  retrofit2.Retrofit
 *  ru.tvrain.core.services.RainService
 */
package com.hintsolutions.raintv.di.modules;

import com.hintsolutions.raintv.di.modules.NetworkModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
import ru.tvrain.core.services.RainService;

public final class NetworkModule_ProvideRainServiceFactory
implements Factory<RainService> {
    private final NetworkModule module;
    private final Provider<Retrofit> retrofitProvider;

    public NetworkModule_ProvideRainServiceFactory(NetworkModule networkModule, Provider<Retrofit> provider) {
        this.module = networkModule;
        this.retrofitProvider = provider;
    }

    public static NetworkModule_ProvideRainServiceFactory create(NetworkModule networkModule, Provider<Retrofit> provider) {
        return new NetworkModule_ProvideRainServiceFactory(networkModule, provider);
    }

    public static RainService provideRainService(NetworkModule networkModule, Retrofit retrofit) {
        return (RainService)Preconditions.checkNotNull((Object)networkModule.provideRainService(retrofit), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public RainService get() {
        return NetworkModule_ProvideRainServiceFactory.provideRainService(this.module, (Retrofit)this.retrofitProvider.get());
    }
}

