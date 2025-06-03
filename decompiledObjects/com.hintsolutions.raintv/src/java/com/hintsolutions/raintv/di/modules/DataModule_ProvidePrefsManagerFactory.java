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
 *  tvrain.managers.PrefsManager
 */
package com.hintsolutions.raintv.di.modules;

import android.content.Context;
import com.hintsolutions.raintv.di.modules.DataModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import tvrain.managers.PrefsManager;

public final class DataModule_ProvidePrefsManagerFactory
implements Factory<PrefsManager> {
    private final Provider<Context> contextProvider;
    private final DataModule module;

    public DataModule_ProvidePrefsManagerFactory(DataModule dataModule, Provider<Context> provider) {
        this.module = dataModule;
        this.contextProvider = provider;
    }

    public static DataModule_ProvidePrefsManagerFactory create(DataModule dataModule, Provider<Context> provider) {
        return new DataModule_ProvidePrefsManagerFactory(dataModule, provider);
    }

    public static PrefsManager providePrefsManager(DataModule dataModule, Context context) {
        return (PrefsManager)Preconditions.checkNotNull((Object)dataModule.providePrefsManager(context), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public PrefsManager get() {
        return DataModule_ProvidePrefsManagerFactory.providePrefsManager(this.module, (Context)this.contextProvider.get());
    }
}

