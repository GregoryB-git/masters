/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.hintsolutions.raintv.common.BaseFragment
 *  com.hintsolutions.raintv.utils.Cache
 *  dagger.MembersInjector
 *  java.lang.Object
 *  javax.inject.Provider
 *  ru.tvrain.core.services.CommonService
 *  ru.tvrain.core.services.EagleService
 *  ru.tvrain.core.services.RainService
 *  tvrain.analytics.AnalyticsManager
 *  tvrain.managers.PrefsManager
 *  tvrain.managers.UserManager
 */
package com.hintsolutions.raintv.common;

import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.utils.Cache;
import dagger.MembersInjector;
import javax.inject.Provider;
import ru.tvrain.core.services.CommonService;
import ru.tvrain.core.services.EagleService;
import ru.tvrain.core.services.RainService;
import tvrain.analytics.AnalyticsManager;
import tvrain.managers.PrefsManager;
import tvrain.managers.UserManager;

public final class BaseFragment_MembersInjector
implements MembersInjector<BaseFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<Cache> cacheProvider;
    private final Provider<CommonService> commonApiProvider;
    private final Provider<EagleService> eagleApiProvider;
    private final Provider<PrefsManager> prefsManagerProvider;
    private final Provider<RainService> rainApiProvider;
    private final Provider<UserManager> userManagerProvider;

    public BaseFragment_MembersInjector(Provider<Cache> provider, Provider<RainService> provider2, Provider<EagleService> provider3, Provider<CommonService> provider4, Provider<AnalyticsManager> provider5, Provider<UserManager> provider6, Provider<PrefsManager> provider7) {
        this.cacheProvider = provider;
        this.rainApiProvider = provider2;
        this.eagleApiProvider = provider3;
        this.commonApiProvider = provider4;
        this.analyticsManagerProvider = provider5;
        this.userManagerProvider = provider6;
        this.prefsManagerProvider = provider7;
    }

    public static MembersInjector<BaseFragment> create(Provider<Cache> provider, Provider<RainService> provider2, Provider<EagleService> provider3, Provider<CommonService> provider4, Provider<AnalyticsManager> provider5, Provider<UserManager> provider6, Provider<PrefsManager> provider7) {
        return new BaseFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectAnalyticsManager(BaseFragment baseFragment, AnalyticsManager analyticsManager) {
        baseFragment.analyticsManager = analyticsManager;
    }

    public static void injectCache(BaseFragment baseFragment, Cache cache) {
        baseFragment.cache = cache;
    }

    public static void injectCommonApi(BaseFragment baseFragment, CommonService commonService) {
        baseFragment.commonApi = commonService;
    }

    public static void injectEagleApi(BaseFragment baseFragment, EagleService eagleService) {
        baseFragment.eagleApi = eagleService;
    }

    public static void injectPrefsManager(BaseFragment baseFragment, PrefsManager prefsManager) {
        baseFragment.prefsManager = prefsManager;
    }

    public static void injectRainApi(BaseFragment baseFragment, RainService rainService) {
        baseFragment.rainApi = rainService;
    }

    public static void injectUserManager(BaseFragment baseFragment, UserManager userManager) {
        baseFragment.userManager = userManager;
    }

    public void injectMembers(BaseFragment baseFragment) {
        BaseFragment_MembersInjector.injectCache(baseFragment, (Cache)this.cacheProvider.get());
        BaseFragment_MembersInjector.injectRainApi(baseFragment, (RainService)this.rainApiProvider.get());
        BaseFragment_MembersInjector.injectEagleApi(baseFragment, (EagleService)this.eagleApiProvider.get());
        BaseFragment_MembersInjector.injectCommonApi(baseFragment, (CommonService)this.commonApiProvider.get());
        BaseFragment_MembersInjector.injectAnalyticsManager(baseFragment, (AnalyticsManager)this.analyticsManagerProvider.get());
        BaseFragment_MembersInjector.injectUserManager(baseFragment, (UserManager)this.userManagerProvider.get());
        BaseFragment_MembersInjector.injectPrefsManager(baseFragment, (PrefsManager)this.prefsManagerProvider.get());
    }
}

