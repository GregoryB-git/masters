/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.yandex.metrica.impl.ob.c6
 *  com.yandex.metrica.impl.ob.d6
 *  com.yandex.metrica.impl.ob.e6
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicLong
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.W5;
import com.yandex.metrica.impl.ob.X5;
import com.yandex.metrica.impl.ob.c6;
import com.yandex.metrica.impl.ob.d6;
import com.yandex.metrica.impl.ob.e6;
import com.yandex.metrica.impl.ob.yg;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;
import static a.o;

public class U5 {
    private final L3 a;
    private final c6 b;
    private final W5 c;
    private long d;
    private long e;
    private AtomicLong f;
    private boolean g;
    private volatile a h;
    private long i;
    private long j;
    private SystemTimeProvider k;

    public U5(L3 l3, c6 c62, W5 w5, SystemTimeProvider systemTimeProvider) {
        this.a = l3;
        this.b = c62;
        this.c = w5;
        this.k = systemTimeProvider;
        this.g();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean a() {
        a a3;
        if (this.h == null) {
            U5 u5 = this;
            synchronized (u5) {
                a3 = this.h;
                if (a3 == null) {
                    try {
                        Object object = this.a.i().a(this.d, this.c.a()).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty((CharSequence)object)) {
                            a3 = new JSONObject((String)object);
                            this.h = object = new a((JSONObject)a3);
                        }
                    }
                    catch (Throwable throwable) {}
                }
            }
        }
        a3 = this.h;
        boolean bl = false;
        if (a3 == null) return bl;
        return a3.a(this.a.m());
    }

    private void g() {
        long l3;
        this.e = this.c.a(this.k.elapsedRealtime());
        this.d = this.c.c(-1L);
        this.f = new AtomicLong(this.c.b(0L));
        this.g = this.c.a(true);
        this.i = l3 = this.c.e(0L);
        this.j = this.c.d(l3 - this.e);
    }

    public long a(long l3) {
        c6 c62 = this.b;
        this.j = l3 = TimeUnit.MILLISECONDS.toSeconds(l3 - this.e);
        ((d6)c62).b(l3);
        return this.j;
    }

    public void a(boolean bl) {
        if (this.g != bl) {
            this.g = bl;
            ((d6)this.b).a(bl).b();
        }
    }

    public long b() {
        return Math.max((long)(this.i - TimeUnit.MILLISECONDS.toSeconds(this.e)), (long)this.j);
    }

    public boolean b(long l3) {
        long l4 = this.d;
        boolean bl = false;
        boolean bl2 = l4 >= 0L;
        boolean bl3 = this.a();
        long l6 = this.k.elapsedRealtime();
        l4 = this.i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        boolean bl4 = timeUnit.toSeconds(l6) < l4;
        l6 = timeUnit.toSeconds(l3);
        l3 = timeUnit.toSeconds(l3 - this.e);
        bl4 = bl4 || l6 - l4 >= (long)this.c.a(this.a.m().N()) || l3 >= X5.b;
        boolean bl5 = bl;
        if (bl2) {
            bl5 = bl;
            if (bl3) {
                bl5 = bl;
                if (bl4 ^ true) {
                    bl5 = true;
                }
            }
        }
        return bl5;
    }

    public long c() {
        return this.d;
    }

    public void c(long l3) {
        c6 c62 = this.b;
        this.i = l3 = TimeUnit.MILLISECONDS.toSeconds(l3);
        ((d6)c62).e(l3).b();
    }

    public long d() {
        return this.j;
    }

    public long e() {
        long l3 = this.f.getAndIncrement();
        c6 c62 = this.b;
        long l4 = this.f.get();
        ((d6)c62).c(l4).b();
        return l3;
    }

    public e6 f() {
        return this.c.a();
    }

    public boolean h() {
        boolean bl = this.g && this.d > 0L;
        return bl;
    }

    public void i() {
        U5 u5 = this;
        synchronized (u5) {
            ((d6)this.b).a();
            this.h = null;
            return;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("Session{mId=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mInitTime=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mCurrentReportId=");
        stringBuilder.append((Object)this.f);
        stringBuilder.append(", mSessionRequestParams=");
        stringBuilder.append((Object)this.h);
        stringBuilder.append(", mSleepStartSeconds=");
        return o(stringBuilder, this.i, '}');
    }

    public static class a {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final int f;
        private final int g;

        public a(JSONObject jSONObject) {
            this.a = jSONObject.optString("analyticsSdkVersionName", null);
            this.b = jSONObject.optString("kitBuildNumber", null);
            this.c = jSONObject.optString("appVer", null);
            this.d = jSONObject.optString("appBuild", null);
            this.e = jSONObject.optString("osVer", null);
            this.f = jSONObject.optInt("osApiLev", -1);
            this.g = jSONObject.optInt("attribution_id", 0);
        }

        public boolean a(yg yg2) {
            yg2.getClass();
            boolean bl = TextUtils.equals((CharSequence)"5.2.0", (CharSequence)this.a) && TextUtils.equals((CharSequence)"45002146", (CharSequence)this.b) && TextUtils.equals((CharSequence)yg2.f(), (CharSequence)this.c) && TextUtils.equals((CharSequence)yg2.b(), (CharSequence)this.d) && TextUtils.equals((CharSequence)yg2.o(), (CharSequence)this.e) && this.f == yg2.n() && this.g == yg2.C();
            return bl;
        }

        public String toString() {
            StringBuilder stringBuilder = z2.t("SessionRequestParams{mKitVersionName='");
            a.B(stringBuilder, this.a, '\'', ", mKitBuildNumber='");
            a.B(stringBuilder, this.b, '\'', ", mAppVersion='");
            a.B(stringBuilder, this.c, '\'', ", mAppBuild='");
            a.B(stringBuilder, this.d, '\'', ", mOsVersion='");
            a.B(stringBuilder, this.e, '\'', ", mApiLevel=");
            stringBuilder.append(this.f);
            stringBuilder.append(", mAttributionId=");
            return a.n(stringBuilder, this.g, '}');
        }
    }
}

