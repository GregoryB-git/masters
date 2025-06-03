/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  dagger.Module
 *  dagger.Provides
 *  java.lang.Object
 *  javax.inject.Singleton
 *  tvrain.ads.AdsManager
 */
package com.hintsolutions.raintv.di.modules;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import tvrain.ads.AdsManager;

@Module
public class AdsModule {
    @Provides
    @Singleton
    public AdsManager provideAdsManager(Context context) {
        return new AdsManager(context.getApplicationContext());
    }
}

