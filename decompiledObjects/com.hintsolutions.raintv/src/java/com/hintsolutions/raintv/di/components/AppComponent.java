/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.hintsolutions.raintv.RainApplication
 *  com.hintsolutions.raintv.common.BaseActivity
 *  com.hintsolutions.raintv.common.BaseFragment
 *  com.hintsolutions.raintv.services.audio.MusicService
 *  com.hintsolutions.raintv.services.push.NotificationOpenedHandler
 *  com.hintsolutions.raintv.services.video.DownloadTracker
 *  com.hintsolutions.raintv.services.video.VideoUploadService
 *  dagger.Component
 *  java.lang.Object
 *  javax.inject.Singleton
 *  tvrain.managers.DrawerManager
 *  tvrain.utils.CurrentlyOnAirGetter
 */
package com.hintsolutions.raintv.di.components;

import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.di.modules.AdsModule;
import com.hintsolutions.raintv.di.modules.AnalyticsModule;
import com.hintsolutions.raintv.di.modules.AppModule;
import com.hintsolutions.raintv.di.modules.DataModule;
import com.hintsolutions.raintv.di.modules.NetworkModule;
import com.hintsolutions.raintv.di.modules.UserModule;
import com.hintsolutions.raintv.news.GalleryImageOverlayView;
import com.hintsolutions.raintv.services.audio.MusicService;
import com.hintsolutions.raintv.services.push.NotificationOpenedHandler;
import com.hintsolutions.raintv.services.video.DownloadTracker;
import com.hintsolutions.raintv.services.video.VideoUploadService;
import dagger.Component;
import javax.inject.Singleton;
import tvrain.managers.DrawerManager;
import tvrain.utils.CurrentlyOnAirGetter;

@Component(modules={AdsModule.class, AnalyticsModule.class, AppModule.class, DataModule.class, NetworkModule.class, UserModule.class})
@Singleton
public interface AppComponent {
    public void inject(RainApplication var1);

    public void inject(BaseActivity var1);

    public void inject(BaseFragment var1);

    public void inject(GalleryImageOverlayView var1);

    public void inject(MusicService var1);

    public void inject(NotificationOpenedHandler var1);

    public void inject(DownloadTracker var1);

    public void inject(VideoUploadService var1);

    public void inject(DrawerManager var1);

    public void inject(CurrentlyOnAirGetter var1);
}

