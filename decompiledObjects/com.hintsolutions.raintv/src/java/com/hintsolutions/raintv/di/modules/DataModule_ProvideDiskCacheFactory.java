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
 *  ru.tvrain.core.simplediskcache.SimpleDiskCache
 */
package com.hintsolutions.raintv.di.modules;

import android.content.Context;
import com.hintsolutions.raintv.di.modules.DataModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import ru.tvrain.core.simplediskcache.SimpleDiskCache;

public final class DataModule_ProvideDiskCacheFactory
implements Factory<SimpleDiskCache> {
    private final Provider<Context> contextProvider;
    private final DataModule module;

    public DataModule_ProvideDiskCacheFactory(DataModule dataModule, Provider<Context> provider) {
        this.module = dataModule;
        this.contextProvider = provider;
    }

    public static DataModule_ProvideDiskCacheFactory create(DataModule dataModule, Provider<Context> provider) {
        return new DataModule_ProvideDiskCacheFactory(dataModule, provider);
    }

    public static SimpleDiskCache provideDiskCache(DataModule dataModule, Context context) {
        return (SimpleDiskCache)Preconditions.checkNotNull((Object)dataModule.provideDiskCache(context), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public SimpleDiskCache get() {
        return DataModule_ProvideDiskCacheFactory.provideDiskCache(this.module, (Context)this.contextProvider.get());
    }
}

