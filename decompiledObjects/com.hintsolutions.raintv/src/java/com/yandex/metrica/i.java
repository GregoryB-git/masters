/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.A2
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.yandex.metrica;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.c;
import com.yandex.metrica.impl.ob.A2;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class i
extends YandexMetricaConfig {
    @Nullable
    public final String a;
    @Nullable
    public final Map<String, String> b;
    @Nullable
    public final String c;
    @Nullable
    public final List<String> d;
    @Nullable
    public final Integer e;
    @Nullable
    public final Integer f;
    @Nullable
    public final Integer g;
    @Nullable
    public final Map<String, String> h;
    @Nullable
    public final Boolean i;
    @Nullable
    public final Boolean j;
    @Nullable
    public final Boolean k;
    @Nullable
    public final c l;

    public i(@NonNull YandexMetricaConfig yandexMetricaConfig) {
        super(yandexMetricaConfig);
        this.a = null;
        this.b = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.c = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.d = null;
        this.k = null;
        this.l = null;
    }

    private i(@NonNull b b4) {
        super(b4.a);
        this.e = b4.d;
        Object object = b4.c;
        Object var3_3 = null;
        object = object == null ? null : A2.c((Collection)object);
        this.d = object;
        this.a = b4.b;
        object = b4.e;
        object = object == null ? var3_3 : A2.e((Map)object);
        this.b = object;
        this.g = b4.h;
        this.f = b4.g;
        this.c = b4.f;
        this.h = A2.e((Map)b4.i);
        this.i = b4.j;
        this.j = b4.k;
        com.yandex.metrica.i$b.c(b4);
        this.k = b4.l;
        this.l = b4.m;
        com.yandex.metrica.i$b.f(b4);
    }

    public /* synthetic */ i(b b4, a a4) {
        this(b4);
    }

    @NonNull
    public static b a(@NonNull YandexMetricaConfig yandexMetricaConfig) {
        b b4 = new b(yandexMetricaConfig.apiKey);
        if (A2.a((Object)yandexMetricaConfig.appVersion)) {
            b4.a(yandexMetricaConfig.appVersion);
        }
        if (A2.a((Object)yandexMetricaConfig.sessionTimeout)) {
            b4.e(yandexMetricaConfig.sessionTimeout);
        }
        if (A2.a((Object)yandexMetricaConfig.crashReporting)) {
            b4.d(yandexMetricaConfig.crashReporting);
        }
        if (A2.a((Object)yandexMetricaConfig.nativeCrashReporting)) {
            b4.f(yandexMetricaConfig.nativeCrashReporting);
        }
        if (A2.a((Object)yandexMetricaConfig.location)) {
            b4.a(yandexMetricaConfig.location);
        }
        if (A2.a((Object)yandexMetricaConfig.locationTracking)) {
            b4.e(yandexMetricaConfig.locationTracking);
        }
        if (A2.a((Object)yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            b4.b();
        }
        if (A2.a((Object)yandexMetricaConfig.preloadInfo)) {
            b4.a(yandexMetricaConfig.preloadInfo);
        }
        if (A2.a((Object)yandexMetricaConfig.firstActivationAsUpdate)) {
            b4.a(yandexMetricaConfig.firstActivationAsUpdate);
        }
        if (A2.a((Object)yandexMetricaConfig.statisticsSending)) {
            b4.j(yandexMetricaConfig.statisticsSending);
        }
        if (A2.a((Object)yandexMetricaConfig.maxReportsInDatabaseCount)) {
            b4.d(yandexMetricaConfig.maxReportsInDatabaseCount);
        }
        if (A2.a(yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry entry : yandexMetricaConfig.errorEnvironment.entrySet()) {
                b4.b((String)entry.getKey(), (String)entry.getValue());
            }
        }
        if (A2.a((Object)yandexMetricaConfig.userProfileID)) {
            b4.c(yandexMetricaConfig.userProfileID);
        }
        if (A2.a((Object)yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            b4.h(yandexMetricaConfig.revenueAutoTrackingEnabled);
        }
        if (A2.a((Object)yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            b4.i(yandexMetricaConfig.sessionsAutoTrackingEnabled);
        }
        if (A2.a((Object)yandexMetricaConfig.appOpenTrackingEnabled)) {
            b4.c(yandexMetricaConfig.appOpenTrackingEnabled);
        }
        if (yandexMetricaConfig instanceof i) {
            yandexMetricaConfig = (i)yandexMetricaConfig;
            if (A2.a(((i)yandexMetricaConfig).d)) {
                b4.a(((i)yandexMetricaConfig).d);
            }
            if (A2.a((Object)((i)yandexMetricaConfig).l)) {
                b4.a(((i)yandexMetricaConfig).l);
            }
            A2.a(null);
        }
        return b4;
    }

    @NonNull
    public static b a(@NonNull String string2) {
        return new b(string2);
    }

    public static final class b {
        @NonNull
        private YandexMetricaConfig.Builder a;
        @Nullable
        private String b;
        @Nullable
        private List<String> c;
        @Nullable
        private Integer d;
        @Nullable
        private Map<String, String> e;
        @Nullable
        public String f;
        @Nullable
        private Integer g;
        @Nullable
        private Integer h;
        @NonNull
        private LinkedHashMap<String, String> i = new LinkedHashMap();
        @Nullable
        private Boolean j;
        @Nullable
        private Boolean k;
        @Nullable
        private Boolean l;
        @Nullable
        private c m;

        public b(@NonNull String string2) {
            this.a = YandexMetricaConfig.newConfigBuilder(string2);
        }

        public static /* synthetic */ void c(b b4) {
        }

        public static /* synthetic */ void f(b b4) {
        }

        @NonNull
        public b a(int n) {
            if (n >= 0) {
                this.d = n;
                return this;
            }
            throw new IllegalArgumentException(String.format((Locale)Locale.US, (String)"Invalid %1$s. %1$s should be positive.", (Object[])new Object[]{"App Build Number"}));
        }

        @NonNull
        public b a(@Nullable Location location) {
            this.a.withLocation(location);
            return this;
        }

        @NonNull
        public b a(@Nullable PreloadInfo preloadInfo) {
            this.a.withPreloadInfo(preloadInfo);
            return this;
        }

        @NonNull
        public b a(@Nullable c c2) {
            this.m = c2;
            return this;
        }

        @NonNull
        public b a(@NonNull String string2) {
            this.a.withAppVersion(string2);
            return this;
        }

        @NonNull
        public b a(@NonNull String string2, @Nullable String string3) {
            this.i.put((Object)string2, (Object)string3);
            return this;
        }

        @NonNull
        public b a(@Nullable List<String> list) {
            this.c = list;
            return this;
        }

        @NonNull
        public b a(@Nullable Map<String, String> map, @Nullable Boolean bl) {
            this.j = bl;
            this.e = map;
            return this;
        }

        @NonNull
        public b a(boolean bl) {
            this.a.handleFirstActivationAsUpdate(bl);
            return this;
        }

        @NonNull
        public i a() {
            return new i(this, null);
        }

        @NonNull
        public b b() {
            this.a.withLogs();
            return this;
        }

        @NonNull
        public b b(int n) {
            this.g = n;
            return this;
        }

        @NonNull
        public b b(@Nullable String string2) {
            this.b = string2;
            return this;
        }

        @NonNull
        public b b(@NonNull String string2, @Nullable String string3) {
            this.a.withErrorEnvironmentValue(string2, string3);
            return this;
        }

        @NonNull
        public b b(boolean bl) {
            this.l = bl;
            return this;
        }

        @NonNull
        public b c(int n) {
            this.h = n;
            return this;
        }

        @NonNull
        public b c(@Nullable String string2) {
            this.a.withUserProfileID(string2);
            return this;
        }

        @NonNull
        public b c(boolean bl) {
            this.a.withAppOpenTrackingEnabled(bl);
            return this;
        }

        @NonNull
        public b d(int n) {
            this.a.withMaxReportsInDatabaseCount(n);
            return this;
        }

        @NonNull
        public b d(boolean bl) {
            this.a.withCrashReporting(bl);
            return this;
        }

        @NonNull
        public b e(int n) {
            this.a.withSessionTimeout(n);
            return this;
        }

        @NonNull
        public b e(boolean bl) {
            this.a.withLocationTracking(bl);
            return this;
        }

        @NonNull
        public b f(boolean bl) {
            this.a.withNativeCrashReporting(bl);
            return this;
        }

        @NonNull
        public b g(boolean bl) {
            this.k = bl;
            return this;
        }

        @NonNull
        public b h(boolean bl) {
            this.a.withRevenueAutoTrackingEnabled(bl);
            return this;
        }

        @NonNull
        public b i(boolean bl) {
            this.a.withSessionsAutoTrackingEnabled(bl);
            return this;
        }

        @NonNull
        public b j(boolean bl) {
            this.a.withStatisticsSending(bl);
            return this;
        }
    }
}

