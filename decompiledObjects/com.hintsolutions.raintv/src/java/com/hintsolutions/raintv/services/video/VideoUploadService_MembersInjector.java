/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dagger.MembersInjector
 *  java.lang.Object
 *  javax.inject.Provider
 *  ru.tvrain.core.services.EagleService
 */
package com.hintsolutions.raintv.services.video;

import com.hintsolutions.raintv.services.video.VideoUploadService;
import com.hintsolutions.raintv.utils.Cache;
import dagger.MembersInjector;
import javax.inject.Provider;
import ru.tvrain.core.services.EagleService;

public final class VideoUploadService_MembersInjector
implements MembersInjector<VideoUploadService> {
    private final Provider<Cache> cacheProvider;
    private final Provider<EagleService> eagleApiProvider;

    public VideoUploadService_MembersInjector(Provider<Cache> provider, Provider<EagleService> provider2) {
        this.cacheProvider = provider;
        this.eagleApiProvider = provider2;
    }

    public static MembersInjector<VideoUploadService> create(Provider<Cache> provider, Provider<EagleService> provider2) {
        return new VideoUploadService_MembersInjector(provider, provider2);
    }

    public static void injectCache(VideoUploadService videoUploadService, Cache cache) {
        videoUploadService.cache = cache;
    }

    public static void injectEagleApi(VideoUploadService videoUploadService, EagleService eagleService) {
        videoUploadService.eagleApi = eagleService;
    }

    public void injectMembers(VideoUploadService videoUploadService) {
        VideoUploadService_MembersInjector.injectCache(videoUploadService, (Cache)this.cacheProvider.get());
        VideoUploadService_MembersInjector.injectEagleApi(videoUploadService, (EagleService)this.eagleApiProvider.get());
    }
}

