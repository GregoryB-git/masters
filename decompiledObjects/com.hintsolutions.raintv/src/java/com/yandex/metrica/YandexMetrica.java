/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.location.Location
 *  android.webkit.WebView
 *  androidx.annotation.MainThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.ecommerce.ECommerceEvent
 *  com.yandex.metrica.impl.ob.Kf
 *  com.yandex.metrica.impl.ob.W2
 *  com.yandex.metrica.plugins.YandexMetricaPlugins
 *  com.yandex.metrica.profile.UserProfile
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 */
package com.yandex.metrica;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.ob.Kf;
import com.yandex.metrica.impl.ob.W2;
import com.yandex.metrica.plugins.YandexMetricaPlugins;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

public final class YandexMetrica {
    private YandexMetrica() {
    }

    public static void activate(@NonNull Context context, @NonNull YandexMetricaConfig yandexMetricaConfig) {
        Kf.a().a(context, yandexMetricaConfig);
    }

    public static void activateReporter(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        Kf.a().a(context, reporterConfig);
    }

    public static void enableActivityAutoTracking(@NonNull Application application) {
        Kf.a().a(application);
    }

    public static int getLibraryApiLevel() {
        return 105;
    }

    @NonNull
    public static String getLibraryVersion() {
        return "5.2.0";
    }

    @NonNull
    public static YandexMetricaPlugins getPluginExtension() {
        return W2.a();
    }

    @NonNull
    public static IReporter getReporter(@NonNull Context context, @NonNull String string2) {
        return Kf.a().a(context, string2);
    }

    @MainThread
    public static void initWebViewReporting(@NonNull WebView webView) {
        Kf.a().a(webView);
    }

    public static void pauseSession(@Nullable Activity activity) {
        Kf.a().a(activity);
    }

    public static void putErrorEnvironmentValue(@NonNull String string2, @Nullable String string3) {
        Kf.a().a(string2, string3);
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        Kf.a().a(adRevenue);
    }

    public static void reportAppOpen(@NonNull Activity activity) {
        Kf.a().b(activity);
    }

    public static void reportAppOpen(@NonNull Intent intent) {
        Kf.a().a(intent);
    }

    public static void reportAppOpen(@NonNull String string2) {
        Kf.a().a(string2);
    }

    public static void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        Kf.a().a(eCommerceEvent);
    }

    public static void reportError(@NonNull String string2, @Nullable String string3) {
        Kf.a().a(string2, string3, null);
    }

    public static void reportError(@NonNull String string2, @Nullable String string3, @Nullable Throwable throwable) {
        Kf.a().a(string2, string3, throwable);
    }

    public static void reportError(@NonNull String string2, @Nullable Throwable throwable) {
        Kf.a().a(string2, throwable);
    }

    public static void reportEvent(@NonNull String string2) {
        Kf.a().b(string2);
    }

    public static void reportEvent(@NonNull String string2, @Nullable String string3) {
        Kf.a().b(string2, string3);
    }

    public static void reportEvent(@NonNull String string2, @Nullable Map<String, Object> map) {
        Kf.a().a(string2, map);
    }

    @Deprecated
    public static void reportNativeCrash(@NonNull String string2) {
        Kf.a().d(string2);
    }

    public static void reportReferralUrl(@NonNull String string2) {
        Kf.a().e(string2);
    }

    public static void reportRevenue(@NonNull Revenue revenue) {
        Kf.a().a(revenue);
    }

    public static void reportUnhandledException(@NonNull Throwable throwable) {
        Kf.a().a(throwable);
    }

    public static void reportUserProfile(@NonNull UserProfile userProfile) {
        Kf.a().a(userProfile);
    }

    public static void requestAppMetricaDeviceID(@NonNull AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        Kf.a().a(appMetricaDeviceIDListener);
    }

    public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        Kf.a().a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        Kf.a().a(deferredDeeplinkParametersListener);
    }

    public static void resumeSession(@Nullable Activity activity) {
        Kf.a().c(activity);
    }

    public static void sendEventsBuffer() {
        Kf.a().i();
    }

    public static void setLocation(@Nullable Location location) {
        Kf.a().a(location);
    }

    public static void setLocationTracking(@NonNull Context context, boolean bl) {
        Kf.a().a(context, bl);
    }

    public static void setLocationTracking(boolean bl) {
        Kf.a().a(bl);
    }

    public static void setStatisticsSending(@NonNull Context context, boolean bl) {
        Kf.a().b(context, bl);
    }

    public static void setUserProfileID(@Nullable String string2) {
        Kf.a().f(string2);
    }
}

