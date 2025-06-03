/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.google.firebase.crashlytics.AnalyticsDeferredProxy
 *  com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
 *  com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
 *  com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
 *  com.google.firebase.inject.Deferred$DeferredHandler
 *  com.google.firebase.inject.Provider
 *  java.lang.Object
 *  java.lang.String
 */
import android.os.Bundle;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

public final class n
implements BreadcrumbSource,
AnalyticsEventLogger,
Deferred.DeferredHandler {
    public final AnalyticsDeferredProxy a;

    public /* synthetic */ n(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.a = analyticsDeferredProxy;
    }

    public final void handle(Provider provider) {
        AnalyticsDeferredProxy.a((AnalyticsDeferredProxy)this.a, (Provider)provider);
    }

    public final void logEvent(String string, Bundle bundle) {
        AnalyticsDeferredProxy.b((AnalyticsDeferredProxy)this.a, (String)string, (Bundle)bundle);
    }

    public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        AnalyticsDeferredProxy.c((AnalyticsDeferredProxy)this.a, (BreadcrumbHandler)breadcrumbHandler);
    }
}

