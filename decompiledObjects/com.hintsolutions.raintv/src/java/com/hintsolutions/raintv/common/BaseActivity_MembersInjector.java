/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.hintsolutions.raintv.common.BaseActivity
 *  com.hintsolutions.raintv.utils.Cache
 *  dagger.MembersInjector
 *  java.lang.Object
 *  javax.inject.Provider
 *  ru.tvrain.core.services.CommonService
 *  ru.tvrain.core.services.EagleService
 *  ru.tvrain.core.services.RainService
 *  tvrain.ads.AdsManager
 *  tvrain.analytics.AnalyticsManager
 *  tvrain.managers.PrefsManager
 *  tvrain.managers.UserManager
 */
package com.hintsolutions.raintv.common;

import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.utils.Cache;
import dagger.MembersInjector;
import javax.inject.Provider;
import ru.tvrain.core.services.CommonService;
import ru.tvrain.core.services.EagleService;
import ru.tvrain.core.services.RainService;
import tvrain.ads.AdsManager;
import tvrain.analytics.AnalyticsManager;
import tvrain.managers.PrefsManager;
import tvrain.managers.UserManager;

public final class BaseActivity_MembersInjector
implements MembersInjector<BaseActivity> {
    private final Provider<AdsManager> adsManagerProvider;
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<Cache> cacheProvider;
    private final Provider<CommonService> commonApiProvider;
    private final Provider<EagleService> eagleApiProvider;
    private final Provider<PrefsManager> prefsManagerProvider;
    private final Provider<RainService> rainApiProvider;
    private final Provider<UserManager> userManagerProvider;

    public BaseActivity_MembersInjector(Provider<Cache> provider, Provider<RainService> provider2, Provider<EagleService> provider3, Provider<CommonService> provider4, Provider<AdsManager> provider5, Provider<AnalyticsManager> provider6, Provider<PrefsManager> provider7, Provider<UserManager> provider8) {
        this.cacheProvider = provider;
        this.rainApiProvider = provider2;
        this.eagleApiProvider = provider3;
        this.commonApiProvider = provider4;
        this.adsManagerProvider = provider5;
        this.analyticsManagerProvider = provider6;
        this.prefsManagerProvider = provider7;
        this.userManagerProvider = provider8;
    }

    public static MembersInjector<BaseActivity> create(Provider<Cache> provider, Provider<RainService> provider2, Provider<EagleService> provider3, Provider<CommonService> provider4, Provider<AdsManager> provider5, Provider<AnalyticsManager> provider6, Provider<PrefsManager> provider7, Provider<UserManager> provider8) {
        return new BaseActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static void injectAdsManager(BaseActivity baseActivity, AdsManager adsManager) {
        baseActivity.adsManager = adsManager;
    }

    public static void injectAnalyticsManager(BaseActivity baseActivity, AnalyticsManager analyticsManager) {
        baseActivity.analyticsManager = analyticsManager;
    }

    public static void injectCache(BaseActivity baseActivity, Cache cache) {
        baseActivity.cache = cache;
    }

    public static void injectCommonApi(BaseActivity baseActivity, CommonService commonService) {
        baseActivity.commonApi = commonService;
    }

    public static void injectEagleApi(BaseActivity baseActivity, EagleService eagleService) {
        baseActivity.eagleApi = eagleService;
    }

    public static void injectPrefsManager(BaseActivity baseActivity, PrefsManager prefsManager) {
        baseActivity.prefsManager = prefsManager;
    }

    public static void injectRainApi(BaseActivity baseActivity, RainService rainService) {
        baseActivity.rainApi = rainService;
    }

    public static void injectUserManager(BaseActivity baseActivity, UserManager userManager) {
        baseActivity.userManager = userManager;
    }

    public void injectMembers(BaseActivity baseActivity) {
        BaseActivity_MembersInjector.injectCache(baseActivity, (Cache)this.cacheProvider.get());
        BaseActivity_MembersInjector.injectRainApi(baseActivity, (RainService)this.rainApiProvider.get());
        BaseActivity_MembersInjector.injectEagleApi(baseActivity, (EagleService)this.eagleApiProvider.get());
        BaseActivity_MembersInjector.injectCommonApi(baseActivity, (CommonService)this.commonApiProvider.get());
        BaseActivity_MembersInjector.injectAdsManager(baseActivity, (AdsManager)this.adsManagerProvider.get());
        BaseActivity_MembersInjector.injectAnalyticsManager(baseActivity, (AnalyticsManager)this.analyticsManagerProvider.get());
        BaseActivity_MembersInjector.injectPrefsManager(baseActivity, (PrefsManager)this.prefsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserManager(baseActivity, (UserManager)this.userManagerProvider.get());
    }
}

