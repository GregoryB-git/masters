/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.gson.Gson
 *  dagger.Module
 *  dagger.Provides
 *  java.lang.Object
 *  javax.inject.Singleton
 *  tvrain.analytics.AnalyticsManager
 *  tvrain.managers.PrefsManager
 *  tvrain.managers.UserManager
 */
package com.hintsolutions.raintv.di.modules;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import tvrain.analytics.AnalyticsManager;
import tvrain.managers.PrefsManager;
import tvrain.managers.UserManager;

@Module
public class UserModule {
    @Provides
    @Singleton
    @NonNull
    public UserManager provideUserManager(Gson gson, PrefsManager prefsManager, AnalyticsManager analyticsManager) {
        return new UserManager(gson, prefsManager, analyticsManager);
    }
}

