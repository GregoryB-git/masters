/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  dagger.Module
 *  dagger.Provides
 *  java.lang.Object
 *  javax.inject.Singleton
 *  tvrain.analytics.AnalyticsManager
 */
package com.hintsolutions.raintv.di.modules;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import tvrain.analytics.AnalyticsManager;

@Module
public class AnalyticsModule {
    @Provides
    @Singleton
    public AnalyticsManager provideAnalyticsManager(Context context) {
        return new AnalyticsManager(context);
    }
}

