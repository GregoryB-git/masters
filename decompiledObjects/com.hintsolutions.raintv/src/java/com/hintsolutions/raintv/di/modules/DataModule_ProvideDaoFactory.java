/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dagger.internal.Factory
 *  dagger.internal.Preconditions
 *  java.lang.Object
 *  java.lang.String
 *  javax.inject.Provider
 *  ru.tvrain.core.simplediskcache.SimpleDiskCache
 */
package com.hintsolutions.raintv.di.modules;

import com.hintsolutions.raintv.di.modules.DataModule;
import com.hintsolutions.raintv.utils.Cache;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import ru.tvrain.core.simplediskcache.SimpleDiskCache;

public final class DataModule_ProvideDaoFactory
implements Factory<Cache> {
    private final DataModule module;
    private final Provider<SimpleDiskCache> simpleDiskCacheProvider;

    public DataModule_ProvideDaoFactory(DataModule dataModule, Provider<SimpleDiskCache> provider) {
        this.module = dataModule;
        this.simpleDiskCacheProvider = provider;
    }

    public static DataModule_ProvideDaoFactory create(DataModule dataModule, Provider<SimpleDiskCache> provider) {
        return new DataModule_ProvideDaoFactory(dataModule, provider);
    }

    public static Cache provideDao(DataModule dataModule, SimpleDiskCache simpleDiskCache) {
        return (Cache)Preconditions.checkNotNull((Object)dataModule.provideDao(simpleDiskCache), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public Cache get() {
        return DataModule_ProvideDaoFactory.provideDao(this.module, (SimpleDiskCache)this.simpleDiskCacheProvider.get());
    }
}

