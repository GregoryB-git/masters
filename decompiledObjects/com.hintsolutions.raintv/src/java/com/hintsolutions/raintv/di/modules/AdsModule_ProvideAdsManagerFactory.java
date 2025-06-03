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
 *  tvrain.ads.AdsManager
 */
package com.hintsolutions.raintv.di.modules;

import android.content.Context;
import com.hintsolutions.raintv.di.modules.AdsModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import tvrain.ads.AdsManager;

public final class AdsModule_ProvideAdsManagerFactory
implements Factory<AdsManager> {
    private final Provider<Context> contextProvider;
    private final AdsModule module;

    public AdsModule_ProvideAdsManagerFactory(AdsModule adsModule, Provider<Context> provider) {
        this.module = adsModule;
        this.contextProvider = provider;
    }

    public static AdsModule_ProvideAdsManagerFactory create(AdsModule adsModule, Provider<Context> provider) {
        return new AdsModule_ProvideAdsManagerFactory(adsModule, provider);
    }

    public static AdsManager provideAdsManager(AdsModule adsModule, Context context) {
        return (AdsManager)Preconditions.checkNotNull((Object)adsModule.provideAdsManager(context), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public AdsManager get() {
        return AdsModule_ProvideAdsManagerFactory.provideAdsManager(this.module, (Context)this.contextProvider.get());
    }
}

