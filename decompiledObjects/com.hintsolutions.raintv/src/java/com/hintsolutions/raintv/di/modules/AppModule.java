/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  dagger.Module
 *  dagger.Provides
 *  java.lang.Object
 *  javax.inject.Singleton
 */
package com.hintsolutions.raintv.di.modules;

import android.content.Context;
import androidx.annotation.NonNull;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class AppModule {
    private Context appContext;

    public AppModule(@NonNull Context context) {
        this.appContext = context;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return this.appContext;
    }
}

