/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.A2
 *  com.yandex.metrica.impl.ob.m1
 *  com.yandex.metrica.impl.ob.un
 *  com.yandex.metrica.impl.ob.xn
 *  com.yandex.metrica.impl.ob.yn
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.yandex.metrica;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.m1;
import com.yandex.metrica.impl.ob.un;
import com.yandex.metrica.impl.ob.xn;
import com.yandex.metrica.impl.ob.yn;
import java.util.LinkedHashMap;
import java.util.Map;

public class YandexMetricaConfig {
    @NonNull
    public final String apiKey;
    @Nullable
    public final Boolean appOpenTrackingEnabled;
    @Nullable
    public final String appVersion;
    @Nullable
    public final Boolean crashReporting;
    @Nullable
    public final Map<String, String> errorEnvironment;
    @Nullable
    public final Boolean firstActivationAsUpdate;
    @Nullable
    public final Location location;
    @Nullable
    public final Boolean locationTracking;
    @Nullable
    public final Boolean logs;
    @Nullable
    public final Integer maxReportsInDatabaseCount;
    @Nullable
    public final Boolean nativeCrashReporting;
    @Nullable
    public final PreloadInfo preloadInfo;
    @Nullable
    public final Boolean revenueAutoTrackingEnabled;
    @Nullable
    public final Integer sessionTimeout;
    @Nullable
    public final Boolean sessionsAutoTrackingEnabled;
    @Nullable
    public final Boolean statisticsSending;
    @Nullable
    public final String userProfileID;

    public YandexMetricaConfig(@NonNull Builder builder) {
        this.apiKey = builder.a;
        this.appVersion = builder.b;
        this.sessionTimeout = builder.c;
        this.crashReporting = builder.d;
        this.nativeCrashReporting = builder.e;
        this.location = builder.f;
        this.locationTracking = builder.g;
        this.logs = builder.h;
        this.preloadInfo = builder.i;
        this.firstActivationAsUpdate = builder.j;
        this.statisticsSending = builder.k;
        this.maxReportsInDatabaseCount = builder.l;
        this.errorEnvironment = A2.e((Map)builder.m);
        this.userProfileID = builder.n;
        this.revenueAutoTrackingEnabled = builder.o;
        this.sessionsAutoTrackingEnabled = builder.p;
        this.appOpenTrackingEnabled = builder.q;
    }

    public YandexMetricaConfig(@NonNull YandexMetricaConfig yandexMetricaConfig) {
        this.apiKey = yandexMetricaConfig.apiKey;
        this.appVersion = yandexMetricaConfig.appVersion;
        this.sessionTimeout = yandexMetricaConfig.sessionTimeout;
        this.crashReporting = yandexMetricaConfig.crashReporting;
        this.nativeCrashReporting = yandexMetricaConfig.nativeCrashReporting;
        this.location = yandexMetricaConfig.location;
        this.locationTracking = yandexMetricaConfig.locationTracking;
        this.logs = yandexMetricaConfig.logs;
        this.preloadInfo = yandexMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = yandexMetricaConfig.firstActivationAsUpdate;
        this.statisticsSending = yandexMetricaConfig.statisticsSending;
        this.maxReportsInDatabaseCount = yandexMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = yandexMetricaConfig.errorEnvironment;
        this.userProfileID = yandexMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = yandexMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = yandexMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = yandexMetricaConfig.appOpenTrackingEnabled;
    }

    @NonNull
    public static Builder createBuilderFromConfig(@NonNull YandexMetricaConfig yandexMetricaConfig) {
        Builder builder = YandexMetricaConfig.newConfigBuilder(yandexMetricaConfig.apiKey);
        if (A2.a((Object)yandexMetricaConfig.appVersion)) {
            builder.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (A2.a((Object)yandexMetricaConfig.sessionTimeout)) {
            builder.withSessionTimeout(yandexMetricaConfig.sessionTimeout);
        }
        if (A2.a((Object)yandexMetricaConfig.crashReporting)) {
            builder.withCrashReporting(yandexMetricaConfig.crashReporting);
        }
        if (A2.a((Object)yandexMetricaConfig.nativeCrashReporting)) {
            builder.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting);
        }
        if (A2.a((Object)yandexMetricaConfig.location)) {
            builder.withLocation(yandexMetricaConfig.location);
        }
        if (A2.a((Object)yandexMetricaConfig.locationTracking)) {
            builder.withLocationTracking(yandexMetricaConfig.locationTracking);
        }
        if (A2.a((Object)yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            builder.withLogs();
        }
        if (A2.a((Object)yandexMetricaConfig.preloadInfo)) {
            builder.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (A2.a((Object)yandexMetricaConfig.firstActivationAsUpdate)) {
            builder.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate);
        }
        if (A2.a((Object)yandexMetricaConfig.statisticsSending)) {
            builder.withStatisticsSending(yandexMetricaConfig.statisticsSending);
        }
        if (A2.a((Object)yandexMetricaConfig.maxReportsInDatabaseCount)) {
            builder.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount);
        }
        if (A2.a(yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry entry : yandexMetricaConfig.errorEnvironment.entrySet()) {
                builder.withErrorEnvironmentValue((String)entry.getKey(), (String)entry.getValue());
            }
        }
        if (A2.a((Object)yandexMetricaConfig.userProfileID)) {
            builder.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (A2.a((Object)yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            builder.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled);
        }
        if (A2.a((Object)yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            builder.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled);
        }
        if (A2.a((Object)yandexMetricaConfig.appOpenTrackingEnabled)) {
            builder.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled);
        }
        return builder;
    }

    public static YandexMetricaConfig fromJson(String string2) {
        return new m1().a(string2);
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String string2) {
        return new Builder(string2);
    }

    public String toJson() {
        return new m1().a(this);
    }

    public static class Builder {
        private static final xn<String> r = new un((xn)new yn());
        @NonNull
        private final String a;
        @Nullable
        private String b;
        @Nullable
        private Integer c;
        @Nullable
        private Boolean d;
        @Nullable
        private Boolean e;
        @Nullable
        private Location f;
        @Nullable
        private Boolean g;
        @Nullable
        private Boolean h;
        @Nullable
        private PreloadInfo i;
        @Nullable
        private Boolean j;
        @Nullable
        private Boolean k;
        @Nullable
        private Integer l;
        @NonNull
        private LinkedHashMap<String, String> m = new LinkedHashMap();
        @Nullable
        private String n;
        @Nullable
        private Boolean o;
        @Nullable
        private Boolean p;
        @Nullable
        private Boolean q;

        public Builder(@NonNull String string2) {
            ((un)r).a((Object)string2);
            this.a = string2;
        }

        @NonNull
        public YandexMetricaConfig build() {
            return new YandexMetricaConfig(this);
        }

        @NonNull
        public Builder handleFirstActivationAsUpdate(boolean bl) {
            this.j = bl;
            return this;
        }

        @NonNull
        public Builder withAppOpenTrackingEnabled(boolean bl) {
            this.q = bl;
            return this;
        }

        @NonNull
        public Builder withAppVersion(@Nullable String string2) {
            this.b = string2;
            return this;
        }

        @NonNull
        public Builder withCrashReporting(boolean bl) {
            this.d = bl;
            return this;
        }

        @NonNull
        public Builder withErrorEnvironmentValue(@NonNull String string2, @Nullable String string3) {
            this.m.put((Object)string2, (Object)string3);
            return this;
        }

        @NonNull
        public Builder withLocation(@Nullable Location location) {
            this.f = location;
            return this;
        }

        @NonNull
        public Builder withLocationTracking(boolean bl) {
            this.g = bl;
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.h = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int n) {
            this.l = n;
            return this;
        }

        @NonNull
        public Builder withNativeCrashReporting(boolean bl) {
            this.e = bl;
            return this;
        }

        @NonNull
        public Builder withPreloadInfo(@Nullable PreloadInfo preloadInfo) {
            this.i = preloadInfo;
            return this;
        }

        @NonNull
        public Builder withRevenueAutoTrackingEnabled(boolean bl) {
            this.o = bl;
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int n) {
            this.c = n;
            return this;
        }

        @NonNull
        public Builder withSessionsAutoTrackingEnabled(boolean bl) {
            this.p = bl;
            return this;
        }

        @NonNull
        public Builder withStatisticsSending(boolean bl) {
            this.k = bl;
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String string2) {
            this.n = string2;
            return this;
        }
    }
}

