/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.gson.Gson
 *  com.hintsolutions.raintv.common.BaseActivity
 *  com.hintsolutions.raintv.common.BaseFragment
 *  com.hintsolutions.raintv.di.modules.AdsModule_ProvideAdsManagerFactory
 *  com.hintsolutions.raintv.di.modules.AnalyticsModule_ProvideAnalyticsManagerFactory
 *  com.hintsolutions.raintv.di.modules.AppModule_ProvideContextFactory
 *  com.hintsolutions.raintv.di.modules.DataModule_ProvideDaoFactory
 *  com.hintsolutions.raintv.di.modules.DataModule_ProvideDiskCacheFactory
 *  com.hintsolutions.raintv.di.modules.DataModule_ProvidePrefsManagerFactory
 *  com.hintsolutions.raintv.di.modules.NetworkModule_ProvideCommonRetrofitFactory
 *  com.hintsolutions.raintv.di.modules.NetworkModule_ProvideCommonServiceFactory
 *  com.hintsolutions.raintv.di.modules.NetworkModule_ProvideCustomHttpClientFactory
 *  com.hintsolutions.raintv.di.modules.NetworkModule_ProvideDefaultHttpClientFactory
 *  com.hintsolutions.raintv.di.modules.NetworkModule_ProvideEagleRetrofitFactory
 *  com.hintsolutions.raintv.di.modules.NetworkModule_ProvideEagleServiceFactory
 *  com.hintsolutions.raintv.di.modules.NetworkModule_ProvideGsonFactory
 *  com.hintsolutions.raintv.di.modules.NetworkModule_ProvideRainRetrofitFactory
 *  com.hintsolutions.raintv.di.modules.NetworkModule_ProvideRainServiceFactory
 *  com.hintsolutions.raintv.di.modules.UserModule_ProvideUserManagerFactory
 *  com.hintsolutions.raintv.services.audio.MusicService
 *  com.hintsolutions.raintv.services.audio.MusicService_MembersInjector
 *  com.hintsolutions.raintv.services.push.NotificationOpenedHandler
 *  com.hintsolutions.raintv.services.push.NotificationOpenedHandler_MembersInjector
 *  com.hintsolutions.raintv.services.video.DownloadTracker
 *  com.hintsolutions.raintv.services.video.DownloadTracker_MembersInjector
 *  com.hintsolutions.raintv.services.video.VideoUploadService
 *  com.hintsolutions.raintv.services.video.VideoUploadService_MembersInjector
 *  com.hintsolutions.raintv.utils.Cache
 *  dagger.internal.DoubleCheck
 *  dagger.internal.Preconditions
 *  java.lang.Object
 *  java.lang.Override
 *  javax.inject.Provider
 *  okhttp3.OkHttpClient
 *  retrofit2.Retrofit
 *  ru.tvrain.core.services.CommonService
 *  ru.tvrain.core.services.EagleService
 *  ru.tvrain.core.services.RainService
 *  ru.tvrain.core.simplediskcache.SimpleDiskCache
 *  tvrain.ads.AdsManager
 *  tvrain.analytics.AnalyticsManager
 *  tvrain.managers.DrawerManager
 *  tvrain.managers.DrawerManager_MembersInjector
 *  tvrain.managers.PrefsManager
 *  tvrain.managers.UserManager
 *  tvrain.utils.CurrentlyOnAirGetter
 *  tvrain.utils.CurrentlyOnAirGetter_MembersInjector
 */
package com.hintsolutions.raintv.di.components;

import android.content.Context;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.Gson;
import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.RainApplication_MembersInjector;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.common.BaseActivity_MembersInjector;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.common.BaseFragment_MembersInjector;
import com.hintsolutions.raintv.di.components.AppComponent;
import com.hintsolutions.raintv.di.components.DaggerAppComponent;
import com.hintsolutions.raintv.di.modules.AdsModule;
import com.hintsolutions.raintv.di.modules.AdsModule_ProvideAdsManagerFactory;
import com.hintsolutions.raintv.di.modules.AnalyticsModule;
import com.hintsolutions.raintv.di.modules.AnalyticsModule_ProvideAnalyticsManagerFactory;
import com.hintsolutions.raintv.di.modules.AppModule;
import com.hintsolutions.raintv.di.modules.AppModule_ProvideContextFactory;
import com.hintsolutions.raintv.di.modules.DataModule;
import com.hintsolutions.raintv.di.modules.DataModule_ProvideDaoFactory;
import com.hintsolutions.raintv.di.modules.DataModule_ProvideDiskCacheFactory;
import com.hintsolutions.raintv.di.modules.DataModule_ProvidePrefsManagerFactory;
import com.hintsolutions.raintv.di.modules.NetworkModule;
import com.hintsolutions.raintv.di.modules.NetworkModule_ProvideCommonRetrofitFactory;
import com.hintsolutions.raintv.di.modules.NetworkModule_ProvideCommonServiceFactory;
import com.hintsolutions.raintv.di.modules.NetworkModule_ProvideCustomHttpClientFactory;
import com.hintsolutions.raintv.di.modules.NetworkModule_ProvideDefaultHttpClientFactory;
import com.hintsolutions.raintv.di.modules.NetworkModule_ProvideEagleRetrofitFactory;
import com.hintsolutions.raintv.di.modules.NetworkModule_ProvideEagleServiceFactory;
import com.hintsolutions.raintv.di.modules.NetworkModule_ProvideGsonFactory;
import com.hintsolutions.raintv.di.modules.NetworkModule_ProvideRainRetrofitFactory;
import com.hintsolutions.raintv.di.modules.NetworkModule_ProvideRainServiceFactory;
import com.hintsolutions.raintv.di.modules.UserModule;
import com.hintsolutions.raintv.di.modules.UserModule_ProvideUserManagerFactory;
import com.hintsolutions.raintv.news.GalleryImageOverlayView;
import com.hintsolutions.raintv.news.GalleryImageOverlayView_MembersInjector;
import com.hintsolutions.raintv.services.audio.MusicService;
import com.hintsolutions.raintv.services.audio.MusicService_MembersInjector;
import com.hintsolutions.raintv.services.push.NotificationOpenedHandler;
import com.hintsolutions.raintv.services.push.NotificationOpenedHandler_MembersInjector;
import com.hintsolutions.raintv.services.video.DownloadTracker;
import com.hintsolutions.raintv.services.video.DownloadTracker_MembersInjector;
import com.hintsolutions.raintv.services.video.VideoUploadService;
import com.hintsolutions.raintv.services.video.VideoUploadService_MembersInjector;
import com.hintsolutions.raintv.utils.Cache;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import ru.tvrain.core.services.CommonService;
import ru.tvrain.core.services.EagleService;
import ru.tvrain.core.services.RainService;
import ru.tvrain.core.simplediskcache.SimpleDiskCache;
import tvrain.ads.AdsManager;
import tvrain.analytics.AnalyticsManager;
import tvrain.managers.DrawerManager;
import tvrain.managers.DrawerManager_MembersInjector;
import tvrain.managers.PrefsManager;
import tvrain.managers.UserManager;
import tvrain.utils.CurrentlyOnAirGetter;
import tvrain.utils.CurrentlyOnAirGetter_MembersInjector;

public final class DaggerAppComponent
implements AppComponent {
    private Provider<AdsManager> provideAdsManagerProvider;
    private Provider<AnalyticsManager> provideAnalyticsManagerProvider;
    private Provider<Retrofit> provideCommonRetrofitProvider;
    private Provider<CommonService> provideCommonServiceProvider;
    private Provider<Context> provideContextProvider;
    private Provider<OkHttpClient> provideCustomHttpClientProvider;
    private Provider<Cache> provideDaoProvider;
    private Provider<OkHttpClient> provideDefaultHttpClientProvider;
    private Provider<SimpleDiskCache> provideDiskCacheProvider;
    private Provider<Retrofit> provideEagleRetrofitProvider;
    private Provider<EagleService> provideEagleServiceProvider;
    private Provider<Gson> provideGsonProvider;
    private Provider<PrefsManager> providePrefsManagerProvider;
    private Provider<Retrofit> provideRainRetrofitProvider;
    private Provider<RainService> provideRainServiceProvider;
    private Provider<UserManager> provideUserManagerProvider;

    private DaggerAppComponent(AdsModule adsModule, AnalyticsModule analyticsModule, AppModule appModule, DataModule dataModule, NetworkModule networkModule, UserModule userModule) {
        this.initialize(adsModule, analyticsModule, appModule, dataModule, networkModule, userModule);
    }

    public /* synthetic */ DaggerAppComponent(AdsModule adsModule, AnalyticsModule analyticsModule, AppModule appModule, DataModule dataModule, NetworkModule networkModule, UserModule userModule, 1 var7_7) {
        this(adsModule, analyticsModule, appModule, dataModule, networkModule, userModule);
    }

    public static Builder builder() {
        return new Object(null){
            private AdsModule adsModule;
            private AnalyticsModule analyticsModule;
            private AppModule appModule;
            private DataModule dataModule;
            private NetworkModule networkModule;
            private UserModule userModule;
            {
                this();
            }

            public Builder adsModule(AdsModule adsModule) {
                this.adsModule = (AdsModule)Preconditions.checkNotNull((Object)adsModule);
                return this;
            }

            public Builder analyticsModule(AnalyticsModule analyticsModule) {
                this.analyticsModule = (AnalyticsModule)Preconditions.checkNotNull((Object)analyticsModule);
                return this;
            }

            public Builder appModule(AppModule appModule) {
                this.appModule = (AppModule)Preconditions.checkNotNull((Object)appModule);
                return this;
            }

            public AppComponent build() {
                if (this.adsModule == null) {
                    this.adsModule = new AdsModule();
                }
                if (this.analyticsModule == null) {
                    this.analyticsModule = new AnalyticsModule();
                }
                Preconditions.checkBuilderRequirement((Object)this.appModule, AppModule.class);
                if (this.dataModule == null) {
                    this.dataModule = new DataModule();
                }
                if (this.networkModule == null) {
                    this.networkModule = new NetworkModule();
                }
                if (this.userModule == null) {
                    this.userModule = new UserModule();
                }
                return new DaggerAppComponent(this.adsModule, this.analyticsModule, this.appModule, this.dataModule, this.networkModule, this.userModule, null);
            }

            public Builder dataModule(DataModule dataModule) {
                this.dataModule = (DataModule)Preconditions.checkNotNull((Object)dataModule);
                return this;
            }

            public Builder networkModule(NetworkModule networkModule) {
                this.networkModule = (NetworkModule)Preconditions.checkNotNull((Object)networkModule);
                return this;
            }

            public Builder userModule(UserModule userModule) {
                this.userModule = (UserModule)Preconditions.checkNotNull((Object)userModule);
                return this;
            }
        };
    }

    private void initialize(AdsModule adsModule, AnalyticsModule analyticsModule, AppModule appModule, DataModule dataModule, NetworkModule networkModule, UserModule userModule) {
        appModule = DoubleCheck.provider((Provider)AppModule_ProvideContextFactory.create((AppModule)appModule));
        this.provideContextProvider = appModule;
        appModule = DoubleCheck.provider((Provider)DataModule_ProvideDiskCacheFactory.create((DataModule)dataModule, (Provider)appModule));
        this.provideDiskCacheProvider = appModule;
        this.provideDaoProvider = DoubleCheck.provider((Provider)DataModule_ProvideDaoFactory.create((DataModule)dataModule, (Provider)appModule));
        this.provideCustomHttpClientProvider = DoubleCheck.provider((Provider)NetworkModule_ProvideCustomHttpClientFactory.create((NetworkModule)networkModule, this.provideContextProvider));
        appModule = DoubleCheck.provider((Provider)NetworkModule_ProvideGsonFactory.create((NetworkModule)networkModule));
        this.provideGsonProvider = appModule;
        appModule = DoubleCheck.provider((Provider)NetworkModule_ProvideRainRetrofitFactory.create((NetworkModule)networkModule, this.provideContextProvider, this.provideCustomHttpClientProvider, (Provider)appModule));
        this.provideRainRetrofitProvider = appModule;
        this.provideRainServiceProvider = DoubleCheck.provider((Provider)NetworkModule_ProvideRainServiceFactory.create((NetworkModule)networkModule, (Provider)appModule));
        appModule = DoubleCheck.provider((Provider)NetworkModule_ProvideDefaultHttpClientFactory.create((NetworkModule)networkModule, this.provideContextProvider));
        this.provideDefaultHttpClientProvider = appModule;
        appModule = DoubleCheck.provider((Provider)NetworkModule_ProvideEagleRetrofitFactory.create((NetworkModule)networkModule, this.provideContextProvider, (Provider)appModule, this.provideGsonProvider));
        this.provideEagleRetrofitProvider = appModule;
        this.provideEagleServiceProvider = DoubleCheck.provider((Provider)NetworkModule_ProvideEagleServiceFactory.create((NetworkModule)networkModule, (Provider)appModule));
        appModule = DoubleCheck.provider((Provider)NetworkModule_ProvideCommonRetrofitFactory.create((NetworkModule)networkModule, this.provideContextProvider, this.provideDefaultHttpClientProvider));
        this.provideCommonRetrofitProvider = appModule;
        this.provideCommonServiceProvider = DoubleCheck.provider((Provider)NetworkModule_ProvideCommonServiceFactory.create((NetworkModule)networkModule, (Provider)appModule));
        this.provideAdsManagerProvider = DoubleCheck.provider((Provider)AdsModule_ProvideAdsManagerFactory.create((AdsModule)adsModule, this.provideContextProvider));
        this.provideAnalyticsManagerProvider = DoubleCheck.provider((Provider)AnalyticsModule_ProvideAnalyticsManagerFactory.create((AnalyticsModule)analyticsModule, this.provideContextProvider));
        adsModule = DoubleCheck.provider((Provider)DataModule_ProvidePrefsManagerFactory.create((DataModule)dataModule, this.provideContextProvider));
        this.providePrefsManagerProvider = adsModule;
        this.provideUserManagerProvider = DoubleCheck.provider((Provider)UserModule_ProvideUserManagerFactory.create((UserModule)userModule, this.provideGsonProvider, (Provider)adsModule, this.provideAnalyticsManagerProvider));
    }

    @CanIgnoreReturnValue
    private BaseActivity injectBaseActivity(BaseActivity baseActivity) {
        BaseActivity_MembersInjector.injectCache(baseActivity, (Cache)this.provideDaoProvider.get());
        BaseActivity_MembersInjector.injectRainApi(baseActivity, (RainService)this.provideRainServiceProvider.get());
        BaseActivity_MembersInjector.injectEagleApi(baseActivity, (EagleService)this.provideEagleServiceProvider.get());
        BaseActivity_MembersInjector.injectCommonApi(baseActivity, (CommonService)this.provideCommonServiceProvider.get());
        BaseActivity_MembersInjector.injectAdsManager(baseActivity, (AdsManager)this.provideAdsManagerProvider.get());
        BaseActivity_MembersInjector.injectAnalyticsManager(baseActivity, (AnalyticsManager)this.provideAnalyticsManagerProvider.get());
        BaseActivity_MembersInjector.injectPrefsManager(baseActivity, (PrefsManager)this.providePrefsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserManager(baseActivity, (UserManager)this.provideUserManagerProvider.get());
        return baseActivity;
    }

    @CanIgnoreReturnValue
    private BaseFragment injectBaseFragment(BaseFragment baseFragment) {
        BaseFragment_MembersInjector.injectCache(baseFragment, (Cache)this.provideDaoProvider.get());
        BaseFragment_MembersInjector.injectRainApi(baseFragment, (RainService)this.provideRainServiceProvider.get());
        BaseFragment_MembersInjector.injectEagleApi(baseFragment, (EagleService)this.provideEagleServiceProvider.get());
        BaseFragment_MembersInjector.injectCommonApi(baseFragment, (CommonService)this.provideCommonServiceProvider.get());
        BaseFragment_MembersInjector.injectAnalyticsManager(baseFragment, (AnalyticsManager)this.provideAnalyticsManagerProvider.get());
        BaseFragment_MembersInjector.injectUserManager(baseFragment, (UserManager)this.provideUserManagerProvider.get());
        BaseFragment_MembersInjector.injectPrefsManager(baseFragment, (PrefsManager)this.providePrefsManagerProvider.get());
        return baseFragment;
    }

    @CanIgnoreReturnValue
    private CurrentlyOnAirGetter injectCurrentlyOnAirGetter(CurrentlyOnAirGetter currentlyOnAirGetter) {
        CurrentlyOnAirGetter_MembersInjector.injectRainApi((CurrentlyOnAirGetter)currentlyOnAirGetter, (RainService)((RainService)this.provideRainServiceProvider.get()));
        CurrentlyOnAirGetter_MembersInjector.injectUserManager((CurrentlyOnAirGetter)currentlyOnAirGetter, (UserManager)((UserManager)this.provideUserManagerProvider.get()));
        return currentlyOnAirGetter;
    }

    @CanIgnoreReturnValue
    private DownloadTracker injectDownloadTracker(DownloadTracker downloadTracker) {
        DownloadTracker_MembersInjector.injectCache((DownloadTracker)downloadTracker, (Cache)((Cache)this.provideDaoProvider.get()));
        DownloadTracker_MembersInjector.injectPrefsManager((DownloadTracker)downloadTracker, (PrefsManager)((PrefsManager)this.providePrefsManagerProvider.get()));
        return downloadTracker;
    }

    @CanIgnoreReturnValue
    private DrawerManager injectDrawerManager(DrawerManager drawerManager) {
        DrawerManager_MembersInjector.injectPrefsManager((DrawerManager)drawerManager, (PrefsManager)((PrefsManager)this.providePrefsManagerProvider.get()));
        return drawerManager;
    }

    @CanIgnoreReturnValue
    private GalleryImageOverlayView injectGalleryImageOverlayView(GalleryImageOverlayView galleryImageOverlayView) {
        GalleryImageOverlayView_MembersInjector.injectContext(galleryImageOverlayView, (Context)this.provideContextProvider.get());
        return galleryImageOverlayView;
    }

    @CanIgnoreReturnValue
    private MusicService injectMusicService(MusicService musicService) {
        MusicService_MembersInjector.injectAnalyticsManager((MusicService)musicService, (AnalyticsManager)((AnalyticsManager)this.provideAnalyticsManagerProvider.get()));
        return musicService;
    }

    @CanIgnoreReturnValue
    private NotificationOpenedHandler injectNotificationOpenedHandler(NotificationOpenedHandler notificationOpenedHandler) {
        NotificationOpenedHandler_MembersInjector.injectContext((NotificationOpenedHandler)notificationOpenedHandler, (Context)((Context)this.provideContextProvider.get()));
        return notificationOpenedHandler;
    }

    @CanIgnoreReturnValue
    private RainApplication injectRainApplication(RainApplication rainApplication) {
        RainApplication_MembersInjector.injectAnalyticsManager(rainApplication, (AnalyticsManager)this.provideAnalyticsManagerProvider.get());
        RainApplication_MembersInjector.injectUserManager(rainApplication, (UserManager)this.provideUserManagerProvider.get());
        return rainApplication;
    }

    @CanIgnoreReturnValue
    private VideoUploadService injectVideoUploadService(VideoUploadService videoUploadService) {
        VideoUploadService_MembersInjector.injectCache((VideoUploadService)videoUploadService, (Cache)((Cache)this.provideDaoProvider.get()));
        VideoUploadService_MembersInjector.injectEagleApi((VideoUploadService)videoUploadService, (EagleService)((EagleService)this.provideEagleServiceProvider.get()));
        return videoUploadService;
    }

    @Override
    public void inject(RainApplication rainApplication) {
        this.injectRainApplication(rainApplication);
    }

    @Override
    public void inject(BaseActivity baseActivity) {
        this.injectBaseActivity(baseActivity);
    }

    @Override
    public void inject(BaseFragment baseFragment) {
        this.injectBaseFragment(baseFragment);
    }

    @Override
    public void inject(GalleryImageOverlayView galleryImageOverlayView) {
        this.injectGalleryImageOverlayView(galleryImageOverlayView);
    }

    @Override
    public void inject(MusicService musicService) {
        this.injectMusicService(musicService);
    }

    @Override
    public void inject(NotificationOpenedHandler notificationOpenedHandler) {
        this.injectNotificationOpenedHandler(notificationOpenedHandler);
    }

    @Override
    public void inject(DownloadTracker downloadTracker) {
        this.injectDownloadTracker(downloadTracker);
    }

    @Override
    public void inject(VideoUploadService videoUploadService) {
        this.injectVideoUploadService(videoUploadService);
    }

    @Override
    public void inject(DrawerManager drawerManager) {
        this.injectDrawerManager(drawerManager);
    }

    @Override
    public void inject(CurrentlyOnAirGetter currentlyOnAirGetter) {
        this.injectCurrentlyOnAirGetter(currentlyOnAirGetter);
    }
}

