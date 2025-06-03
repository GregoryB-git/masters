/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dagger.MembersInjector
 *  java.lang.Object
 *  javax.inject.Provider
 *  tvrain.analytics.AnalyticsManager
 *  tvrain.managers.UserManager
 */
package com.hintsolutions.raintv;

import com.hintsolutions.raintv.RainApplication;
import dagger.MembersInjector;
import javax.inject.Provider;
import tvrain.analytics.AnalyticsManager;
import tvrain.managers.UserManager;

public final class RainApplication_MembersInjector
implements MembersInjector<RainApplication> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<UserManager> userManagerProvider;

    public RainApplication_MembersInjector(Provider<AnalyticsManager> provider, Provider<UserManager> provider2) {
        this.analyticsManagerProvider = provider;
        this.userManagerProvider = provider2;
    }

    public static MembersInjector<RainApplication> create(Provider<AnalyticsManager> provider, Provider<UserManager> provider2) {
        return new RainApplication_MembersInjector(provider, provider2);
    }

    public static void injectAnalyticsManager(RainApplication rainApplication, AnalyticsManager analyticsManager) {
        rainApplication.analyticsManager = analyticsManager;
    }

    public static void injectUserManager(RainApplication rainApplication, UserManager userManager) {
        rainApplication.userManager = userManager;
    }

    public void injectMembers(RainApplication rainApplication) {
        RainApplication_MembersInjector.injectAnalyticsManager(rainApplication, (AnalyticsManager)this.analyticsManagerProvider.get());
        RainApplication_MembersInjector.injectUserManager(rainApplication, (UserManager)this.userManagerProvider.get());
    }
}

