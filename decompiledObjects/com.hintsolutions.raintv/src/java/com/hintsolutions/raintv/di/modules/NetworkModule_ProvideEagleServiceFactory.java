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
 *  ru.tvrain.core.services.EagleService
 */
package com.hintsolutions.raintv.di.modules;

import com.hintsolutions.raintv.di.modules.NetworkModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
import ru.tvrain.core.services.EagleService;

public final class NetworkModule_ProvideEagleServiceFactory
implements Factory<EagleService> {
    private final NetworkModule module;
    private final Provider<Retrofit> retrofitProvider;

    public NetworkModule_ProvideEagleServiceFactory(NetworkModule networkModule, Provider<Retrofit> provider) {
        this.module = networkModule;
        this.retrofitProvider = provider;
    }

    public static NetworkModule_ProvideEagleServiceFactory create(NetworkModule networkModule, Provider<Retrofit> provider) {
        return new NetworkModule_ProvideEagleServiceFactory(networkModule, provider);
    }

    public static EagleService provideEagleService(NetworkModule networkModule, Retrofit retrofit) {
        return (EagleService)Preconditions.checkNotNull((Object)networkModule.provideEagleService(retrofit), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public EagleService get() {
        return NetworkModule_ProvideEagleServiceFactory.provideEagleService(this.module, (Retrofit)this.retrofitProvider.get());
    }
}

