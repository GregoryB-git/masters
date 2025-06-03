/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dagger.MembersInjector
 *  java.lang.Object
 *  javax.inject.Provider
 *  tvrain.managers.PrefsManager
 */
package com.hintsolutions.raintv.services.video;

import com.hintsolutions.raintv.services.video.DownloadTracker;
import com.hintsolutions.raintv.utils.Cache;
import dagger.MembersInjector;
import javax.inject.Provider;
import tvrain.managers.PrefsManager;

public final class DownloadTracker_MembersInjector
implements MembersInjector<DownloadTracker> {
    private final Provider<Cache> cacheProvider;
    private final Provider<PrefsManager> prefsManagerProvider;

    public DownloadTracker_MembersInjector(Provider<Cache> provider, Provider<PrefsManager> provider2) {
        this.cacheProvider = provider;
        this.prefsManagerProvider = provider2;
    }

    public static MembersInjector<DownloadTracker> create(Provider<Cache> provider, Provider<PrefsManager> provider2) {
        return new DownloadTracker_MembersInjector(provider, provider2);
    }

    public static void injectCache(DownloadTracker downloadTracker, Cache cache) {
        downloadTracker.cache = cache;
    }

    public static void injectPrefsManager(DownloadTracker downloadTracker, PrefsManager prefsManager) {
        downloadTracker.prefsManager = prefsManager;
    }

    public void injectMembers(DownloadTracker downloadTracker) {
        DownloadTracker_MembersInjector.injectCache(downloadTracker, (Cache)this.cacheProvider.get());
        DownloadTracker_MembersInjector.injectPrefsManager(downloadTracker, (PrefsManager)this.prefsManagerProvider.get());
    }
}

