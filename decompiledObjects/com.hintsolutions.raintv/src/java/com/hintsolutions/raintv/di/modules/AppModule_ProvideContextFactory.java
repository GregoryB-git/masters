/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  dagger.internal.Factory
 *  dagger.internal.Preconditions
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.di.modules;

import android.content.Context;
import com.hintsolutions.raintv.di.modules.AppModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvideContextFactory
implements Factory<Context> {
    private final AppModule module;

    public AppModule_ProvideContextFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvideContextFactory create(AppModule appModule) {
        return new AppModule_ProvideContextFactory(appModule);
    }

    public static Context provideContext(AppModule appModule) {
        return (Context)Preconditions.checkNotNull((Object)appModule.provideContext(), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public Context get() {
        return AppModule_ProvideContextFactory.provideContext(this.module);
    }
}

