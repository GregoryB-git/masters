/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dagger.MembersInjector
 *  java.lang.Object
 *  javax.inject.Provider
 *  tvrain.analytics.AnalyticsManager
 */
package com.hintsolutions.raintv.services.audio;

import com.hintsolutions.raintv.services.audio.MusicService;
import dagger.MembersInjector;
import javax.inject.Provider;
import tvrain.analytics.AnalyticsManager;

public final class MusicService_MembersInjector
implements MembersInjector<MusicService> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;

    public MusicService_MembersInjector(Provider<AnalyticsManager> provider) {
        this.analyticsManagerProvider = provider;
    }

    public static MembersInjector<MusicService> create(Provider<AnalyticsManager> provider) {
        return new MusicService_MembersInjector(provider);
    }

    public static void injectAnalyticsManager(MusicService musicService, AnalyticsManager analyticsManager) {
        musicService.analyticsManager = analyticsManager;
    }

    public void injectMembers(MusicService musicService) {
        MusicService_MembersInjector.injectAnalyticsManager(musicService, (AnalyticsManager)this.analyticsManagerProvider.get());
    }
}

