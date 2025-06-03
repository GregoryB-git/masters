/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  dagger.internal.Factory
 *  dagger.internal.Preconditions
 *  java.lang.Object
 *  java.lang.String
 *  javax.inject.Provider
 *  tvrain.analytics.AnalyticsManager
 */
package com.hintsolutions.raintv.di.modules;

import android.content.Context;
import com.hintsolutions.raintv.di.modules.AnalyticsModule;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import tvrain.analytics.AnalyticsManager;

public final class AnalyticsModule_ProvideAnalyticsManagerFactory
implements Factory<AnalyticsManager> {
    private final Provider<Context> contextProvider;
    private final AnalyticsModule module;

    public AnalyticsModule_ProvideAnalyticsManagerFactory(AnalyticsModule analyticsModule, Provider<Context> provider) {
        this.module = analyticsModule;
        this.contextProvider = provider;
    }

    public static AnalyticsModule_ProvideAnalyticsManagerFactory create(AnalyticsModule analyticsModule, Provider<Context> provider) {
        return new AnalyticsModule_ProvideAnalyticsManagerFactory(analyticsModule, provider);
    }

    public static AnalyticsManager provideAnalyticsManager(AnalyticsModule analyticsModule, Context context) {
        return (AnalyticsManager)Preconditions.checkNotNull((Object)analyticsModule.provideAnalyticsManager(context), (String)"Cannot return null from a non-@Nullable @Provides method");
    }

    public AnalyticsManager get() {
        return AnalyticsModule_ProvideAnalyticsManagerFactory.provideAnalyticsManager(this.module, (Context)this.contextProvider.get());
    }
}

