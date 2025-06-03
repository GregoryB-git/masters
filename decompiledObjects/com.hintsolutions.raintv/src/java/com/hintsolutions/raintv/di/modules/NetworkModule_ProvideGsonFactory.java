/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  dagger.internal.Factory
 *  dagger.internal.Preconditions
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.di.modules;

import com.google.gson.Gson;
import com.hintsolutions.raintv.di.modules.NetworkModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class NetworkModule_ProvideGsonFactory
implements Factory<Gson> {
    private final NetworkModule module;

    public NetworkModule_ProvideGsonFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ProvideGsonFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvideGsonFactory(networkModule);
    }

    public static Gson provideGson(NetworkModule networkModule) {
        return (Gson)Preconditions.checkNotNull((Object)networkModule.provideGson(), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public Gson get() {
        return NetworkModule_ProvideGsonFactory.provideGson(this.module);
    }
}

