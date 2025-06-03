/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  com.hintsolutions.raintv.utils.Cache
 *  dagger.Module
 *  dagger.Provides
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  javax.inject.Singleton
 *  ru.tvrain.core.simplediskcache.SimpleDiskCache
 *  tvrain.managers.PrefsManager
 */
package com.hintsolutions.raintv.di.modules;

import android.content.Context;
import androidx.annotation.NonNull;
import com.hintsolutions.raintv.utils.Cache;
import dagger.Module;
import dagger.Provides;
import java.io.File;
import java.io.IOException;
import javax.inject.Singleton;
import ru.tvrain.core.simplediskcache.SimpleDiskCache;
import tvrain.managers.PrefsManager;

@Module
public class DataModule {
    @Provides
    @Singleton
    @NonNull
    public Cache provideDao(SimpleDiskCache simpleDiskCache) {
        return new Cache(simpleDiskCache);
    }

    @Provides
    @Singleton
    public SimpleDiskCache provideDiskCache(Context context) {
        try {
            SimpleDiskCache simpleDiskCache = SimpleDiskCache.open((File)context.getExternalCacheDir(), (int)0x101D10, (long)0x200000L);
            context = simpleDiskCache;
        }
        catch (Exception exception) {
            try {
                context = SimpleDiskCache.open((File)context.getCacheDir(), (int)0x101D10, (long)0x200000L);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                context = null;
            }
            exception.printStackTrace();
        }
        return context;
    }

    @Provides
    @Singleton
    @NonNull
    public PrefsManager providePrefsManager(Context context) {
        return new PrefsManager(context);
    }
}

