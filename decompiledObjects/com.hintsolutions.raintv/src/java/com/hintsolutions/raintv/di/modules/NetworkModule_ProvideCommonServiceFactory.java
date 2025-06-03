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
 *  ru.tvrain.core.services.CommonService
 */
package com.hintsolutions.raintv.di.modules;

import com.hintsolutions.raintv.di.modules.NetworkModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
import ru.tvrain.core.services.CommonService;

public final class NetworkModule_ProvideCommonServiceFactory
implements Factory<CommonService> {
    private final NetworkModule module;
    private final Provider<Retrofit> retrofitProvider;

    public NetworkModule_ProvideCommonServiceFactory(NetworkModule networkModule, Provider<Retrofit> provider) {
        this.module = networkModule;
        this.retrofitProvider = provider;
    }

    public static NetworkModule_ProvideCommonServiceFactory create(NetworkModule networkModule, Provider<Retrofit> provider) {
        return new NetworkModule_ProvideCommonServiceFactory(networkModule, provider);
    }

    public static CommonService provideCommonService(NetworkModule networkModule, Retrofit retrofit) {
        return (CommonService)Preconditions.checkNotNull((Object)networkModule.provideCommonService(retrofit), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public CommonService get() {
        return NetworkModule_ProvideCommonServiceFactory.provideCommonService(this.module, (Retrofit)this.retrofitProvider.get());
    }
}

