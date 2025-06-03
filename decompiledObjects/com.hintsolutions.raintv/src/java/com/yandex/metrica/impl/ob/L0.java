/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.yandex.metrica.impl.ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.i;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.T1;
import com.yandex.metrica.impl.ob.n1;
import java.util.LinkedHashMap;
import java.util.Map;

public class l0
implements n1 {
    private Location a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Map<String, String> e = new LinkedHashMap();
    private Map<String, String> f = new LinkedHashMap();
    @Nullable
    private String g;
    private boolean h;
    private T1 i;

    private void a(@Nullable Map<String, String> entry2, @NonNull i.b b2) {
        if (!A2.b(entry2)) {
            for (Map.Entry entry2 : entry2.entrySet()) {
                b2.a((String)entry2.getKey(), (String)entry2.getValue());
            }
        }
    }

    private static boolean a(Object object) {
        boolean bl2 = object == null;
        return bl2;
    }

    private void b() {
        T1 t12 = this.i;
        if (t12 != null) {
            t12.a(this.b, this.d, this.c);
        }
    }

    private void b(@Nullable Map<String, String> iterator, @NonNull i.b b2) {
        if (!A2.b(iterator)) {
            for (Map.Entry entry : iterator.entrySet()) {
                b2.b((String)entry.getKey(), (String)entry.getValue());
            }
        }
    }

    public i a(i i2) {
        if (this.h) {
            return i2;
        }
        i.b b2 = com.yandex.metrica.i.a(i2.apiKey);
        b2.a(i2.b, i2.i);
        b2.b(i2.a);
        b2.a(i2.preloadInfo);
        b2.a(i2.location);
        if (A2.a(i2.d)) {
            b2.a(i2.d);
        }
        if (A2.a((Object)i2.appVersion)) {
            b2.a(i2.appVersion);
        }
        if (A2.a(i2.f)) {
            b2.b(i2.f);
        }
        if (A2.a(i2.e)) {
            b2.a(i2.e);
        }
        if (A2.a(i2.g)) {
            b2.c(i2.g);
        }
        if (A2.a(i2.logs) && i2.logs.booleanValue()) {
            b2.b();
        }
        if (A2.a(i2.sessionTimeout)) {
            b2.e(i2.sessionTimeout);
        }
        if (A2.a(i2.crashReporting)) {
            b2.d(i2.crashReporting);
        }
        if (A2.a(i2.nativeCrashReporting)) {
            b2.f(i2.nativeCrashReporting);
        }
        if (A2.a(i2.locationTracking)) {
            b2.e(i2.locationTracking);
        }
        if (A2.a((Object)i2.c)) {
            b2.f = i2.c;
        }
        if (A2.a(i2.firstActivationAsUpdate)) {
            b2.a(i2.firstActivationAsUpdate);
        }
        if (A2.a(i2.statisticsSending)) {
            b2.j(i2.statisticsSending);
        }
        if (A2.a(i2.k)) {
            b2.b(i2.k);
        }
        if (A2.a(i2.maxReportsInDatabaseCount)) {
            b2.d(i2.maxReportsInDatabaseCount);
        }
        if (A2.a(i2.l)) {
            b2.a(i2.l);
        }
        if (A2.a((Object)i2.userProfileID)) {
            b2.c(i2.userProfileID);
        }
        if (A2.a(i2.revenueAutoTrackingEnabled)) {
            b2.h(i2.revenueAutoTrackingEnabled);
        }
        if (A2.a(i2.appOpenTrackingEnabled)) {
            b2.c(i2.appOpenTrackingEnabled);
        }
        this.a(this.e, b2);
        this.a(i2.h, b2);
        this.b(this.f, b2);
        this.b(i2.errorEnvironment, b2);
        Boolean bl2 = this.b;
        if (l0.a(i2.locationTracking) && A2.a(bl2)) {
            b2.e(bl2);
        }
        bl2 = this.a;
        if (l0.a(i2.location) && A2.a(bl2)) {
            b2.a((Location)bl2);
        }
        bl2 = this.d;
        if (l0.a(i2.statisticsSending) && A2.a(bl2)) {
            b2.j(bl2);
        }
        if (!A2.a((Object)i2.userProfileID) && A2.a((Object)this.g)) {
            b2.c(this.g);
        }
        this.h = true;
        this.a = null;
        this.b = null;
        this.d = null;
        this.e.clear();
        this.f.clear();
        this.g = null;
        return b2.a();
    }

    @Override
    public void a(@Nullable Location location) {
        this.a = location;
    }

    public void a(T1 t12) {
        this.i = t12;
    }

    @Override
    public void a(boolean bl2) {
        this.c = bl2;
        this.b();
    }

    @Override
    public void b(boolean bl2) {
        this.b = bl2;
        this.b();
    }

    @Override
    public void c(String string, String string2) {
        this.f.put((Object)string, (Object)string2);
    }

    @Override
    public void setStatisticsSending(boolean bl2) {
        this.d = bl2;
        this.b();
    }

    @Override
    public void setUserProfileID(@Nullable String string) {
        this.g = string;
    }
}

