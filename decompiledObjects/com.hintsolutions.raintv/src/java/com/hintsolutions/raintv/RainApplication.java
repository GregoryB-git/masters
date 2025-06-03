/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  com.google.android.exoplayer2.offline.DownloadManager
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.hintsolutions.raintv.services.push.NotificationOpenedHandler
 *  com.hintsolutions.raintv.services.video.DownloadTracker
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  javax.inject.Inject
 *  ru.tvrain.core.Consts
 *  tvrain.analytics.AnalyticsManager
 *  tvrain.analytics.tagmanager.AppMetrica
 *  tvrain.managers.UserManager
 */
package com.hintsolutions.raintv;

import android.app.Application;
import android.content.Context;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.source.MediaSource;
import com.hintsolutions.raintv.di.components.AppComponent;
import com.hintsolutions.raintv.di.components.DaggerAppComponent;
import com.hintsolutions.raintv.di.modules.AppModule;
import com.hintsolutions.raintv.services.push.NotificationOpenedHandler;
import com.hintsolutions.raintv.services.video.DownloadTracker;
import com.hintsolutions.raintv.utils.Foreground;
import com.hintsolutions.raintv.utils.VideoDownloadHelper;
import com.onesignal.OneSignal;
import com.vk.sdk.VKSdk;
import javax.inject.Inject;
import ru.tvrain.core.Consts;
import tvrain.analytics.AnalyticsManager;
import tvrain.analytics.tagmanager.AppMetrica;
import tvrain.managers.UserManager;

public class RainApplication
extends Application
implements Consts {
    private static AppComponent appComponent;
    @Inject
    public AnalyticsManager analyticsManager;
    @Inject
    public UserManager userManager;
    private VideoDownloadHelper videoDownloadHelper;

    private void buildComponents() {
        AppComponent appComponent;
        RainApplication.appComponent = appComponent = this.buildAppComponent();
        appComponent.inject(this);
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    private void initExternalServices() {
        VKSdk.initialize(this.getApplicationContext());
        this.analyticsManager.init((Application)this);
        this.setupOneSignal();
        AppMetrica.init((Application)this);
    }

    private void setupOneSignal() {
        OneSignal.initWithContext((Context)this);
        OneSignal.setAppId("9c26730c-52e8-11e5-ab67-774e68d13af4");
        OneSignal.setNotificationOpenedHandler((OneSignal.OSNotificationOpenedHandler)new NotificationOpenedHandler());
        OneSignal.sendTag("android_version", "2.11.2");
    }

    public AppComponent buildAppComponent() {
        return DaggerAppComponent.builder().appModule(new AppModule((Context)this)).build();
    }

    public DownloadManager getDownloadManager() {
        return this.videoDownloadHelper.initDownloadManager();
    }

    public DownloadTracker getDownloadTracker() {
        this.videoDownloadHelper.initDownloadManager();
        return this.videoDownloadHelper.getDownloadTracker();
    }

    public MediaSource getMediaSourceForUrl(String string2) {
        this.videoDownloadHelper.initDownloadManager();
        return this.videoDownloadHelper.getMediaSourceForUrl(string2);
    }

    public void onCreate() {
        super.onCreate();
        this.videoDownloadHelper = new VideoDownloadHelper((Context)this);
        this.buildComponents();
        this.initExternalServices();
        Foreground.init(this);
        this.userManager.restoreAuthorization();
    }

    public void onTerminate() {
        try {
            this.unregisterActivityLifecycleCallbacks(Foreground.getInstance());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        super.onTerminate();
    }
}

