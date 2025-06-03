/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  dagger.internal.Factory
 *  dagger.internal.Preconditions
 *  java.lang.Object
 *  java.lang.String
 *  javax.inject.Provider
 *  tvrain.analytics.AnalyticsManager
 *  tvrain.managers.PrefsManager
 *  tvrain.managers.UserManager
 */
package com.hintsolutions.raintv.di.modules;

import com.google.gson.Gson;
import com.hintsolutions.raintv.di.modules.UserModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import tvrain.analytics.AnalyticsManager;
import tvrain.managers.PrefsManager;
import tvrain.managers.UserManager;

public final class UserModule_ProvideUserManagerFactory
implements Factory<UserManager> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<Gson> gsonProvider;
    private final UserModule module;
    private final Provider<PrefsManager> prefsManagerProvider;

    public UserModule_ProvideUserManagerFactory(UserModule userModule, Provider<Gson> provider, Provider<PrefsManager> provider2, Provider<AnalyticsManager> provider3) {
        this.module = userModule;
        this.gsonProvider = provider;
        this.prefsManagerProvider = provider2;
        this.analyticsManagerProvider = provider3;
    }

    public static UserModule_ProvideUserManagerFactory create(UserModule userModule, Provider<Gson> provider, Provider<PrefsManager> provider2, Provider<AnalyticsManager> provider3) {
        return new UserModule_ProvideUserManagerFactory(userModule, provider, provider2, provider3);
    }

    public static UserManager provideUserManager(UserModule userModule, Gson gson, PrefsManager prefsManager, AnalyticsManager analyticsManager) {
        return (UserManager)Preconditions.checkNotNull((Object)userModule.provideUserManager(gson, prefsManager, analyticsManager), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public UserManager get() {
        return UserModule_ProvideUserManagerFactory.provideUserManager(this.module, (Gson)this.gsonProvider.get(), (PrefsManager)this.prefsManagerProvider.get(), (AnalyticsManager)this.analyticsManagerProvider.get());
    }
}

