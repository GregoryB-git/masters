/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.b;
import com.yandex.metrica.impl.ob.U;
import com.yandex.metrica.impl.ob.ai;
import com.yandex.metrica.impl.ob.c2;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.h2;
import com.yandex.metrica.impl.ob.sb;
import com.yandex.metrica.impl.ob.tb;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;

public class rg {
    private String a;
    private U b;
    private c2 c;
    @NonNull
    private final String d = rg.y();
    @NonNull
    private String e = h2.a();
    private String f;
    private String g;
    private tb h;
    @NonNull
    private sb i;
    @Nullable
    private String j;
    private String k;
    private ci l;

    @NonNull
    private static String y() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty((CharSequence)"public")) {
            stringBuilder.append("public");
        }
        if (!TextUtils.isEmpty((CharSequence)"binary")) {
            stringBuilder.append("_binary");
        }
        if (!TextUtils.isEmpty((CharSequence)"")) {
            stringBuilder.append("_");
        }
        return stringBuilder.toString();
    }

    @NonNull
    public sb a() {
        return this.i;
    }

    public void a(U u) {
        this.b = u;
    }

    public void a(@NonNull c2 c22) {
        this.c = c22;
    }

    public void a(ci ci2) {
        this.l = ci2;
    }

    public void a(@NonNull sb sb2) {
        this.i = sb2;
    }

    public void a(@NonNull tb tb2) {
        rg rg2 = this;
        synchronized (rg2) {
            this.h = tb2;
            return;
        }
    }

    public void a(@Nullable String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.g = string;
        }
    }

    public String b() {
        String string;
        String string2 = string = this.g;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public void b(@Nullable String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.f = string;
        }
    }

    @NonNull
    public String c() {
        return this.e;
    }

    public void c(@Nullable String string) {
        this.j = string;
    }

    @NonNull
    public String d() {
        rg rg2 = this;
        synchronized (rg2) {
            Object object;
            block6: {
                block5: {
                    object = this.h;
                    if (object != null) break block5;
                    object = null;
                    break block6;
                }
                object = ((tb)object).a();
            }
            Object object2 = object;
            if (object == null) {
                object2 = "";
            }
            return object2;
        }
    }

    public final void d(String string) {
        this.k = string;
    }

    @NonNull
    public String e() {
        rg rg2 = this;
        synchronized (rg2) {
            Object object;
            block6: {
                block5: {
                    object = this.h;
                    if (object != null) break block5;
                    object = null;
                    break block6;
                }
                object = ((tb)object).b().a();
            }
            Object object2 = object;
            if (object == null) {
                object2 = "";
            }
            return object2;
        }
    }

    public void e(String string) {
        this.a = string;
    }

    public String f() {
        String string;
        String string2 = string = this.f;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    @NonNull
    public String g() {
        rg rg2 = this;
        synchronized (rg2) {
            String string;
            block3: {
                String string2;
                string = string2 = this.l.i();
                if (string2 != null) break block3;
                string = "";
            }
            return string;
        }
    }

    @NonNull
    public String h() {
        return this.b.e;
    }

    @NonNull
    public String i() {
        String string = this.j;
        String string2 = com.yandex.metrica.b.b.a();
        String string3 = string;
        if (string == null) {
            string3 = string2;
        }
        return string3;
    }

    @NonNull
    public String j() {
        return this.d;
    }

    @NonNull
    public String k() {
        String string;
        String string2 = string = this.k;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    @NonNull
    public String l() {
        String string;
        String string2 = string = this.b.a;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    @NonNull
    public String m() {
        return this.b.b;
    }

    public int n() {
        return this.b.d;
    }

    @NonNull
    public String o() {
        return this.b.c;
    }

    public String p() {
        return this.a;
    }

    @NonNull
    public RetryPolicyConfig q() {
        return this.l.J();
    }

    public float r() {
        return this.c.d();
    }

    public int s() {
        return this.c.b();
    }

    public int t() {
        return this.c.c();
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("BaseRequestConfig{mPackageName='");
        a.B(stringBuilder, this.a, '\'', ", mConstantDeviceInfo=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", screenInfo=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", mSdkVersionName='");
        stringBuilder.append("5.2.0");
        stringBuilder.append('\'');
        stringBuilder.append(", mSdkBuildNumber='");
        stringBuilder.append("45002146");
        stringBuilder.append('\'');
        stringBuilder.append(", mSdkBuildType='");
        stringBuilder.append(this.d);
        stringBuilder.append('\'');
        stringBuilder.append(", mAppPlatform='");
        stringBuilder.append("android");
        stringBuilder.append('\'');
        stringBuilder.append(", mProtocolVersion='");
        stringBuilder.append("2");
        stringBuilder.append('\'');
        stringBuilder.append(", mAppFramework='");
        stringBuilder.append(this.e);
        stringBuilder.append('\'');
        stringBuilder.append(", mCommitHash='");
        stringBuilder.append("e44a8b69c7d76049d312caec6fb8a01b60982d8f");
        stringBuilder.append('\'');
        stringBuilder.append(", mAppVersion='");
        a.B(stringBuilder, this.f, '\'', ", mAppBuildNumber='");
        a.B(stringBuilder, this.g, '\'', ", appSetId=");
        stringBuilder.append((Object)this.h);
        stringBuilder.append(", mAdvertisingIdsHolder=");
        stringBuilder.append((Object)this.i);
        stringBuilder.append(", mDeviceType='");
        a.B(stringBuilder, this.j, '\'', ", mLocale='");
        a.B(stringBuilder, this.k, '\'', ", mStartupState=");
        stringBuilder.append((Object)this.l);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public int u() {
        return this.c.e();
    }

    public ci v() {
        return this.l;
    }

    @NonNull
    public String w() {
        rg rg2 = this;
        synchronized (rg2) {
            String string;
            block3: {
                String string2;
                string = string2 = this.l.V();
                if (string2 != null) break block3;
                string = "";
            }
            return string;
        }
    }

    public boolean x() {
        rg rg2 = this;
        synchronized (rg2) {
            boolean bl = ai.a(this.l);
            return bl;
        }
    }

    public static class c<A> {
        @NonNull
        public final ci a;
        @NonNull
        public final A b;

        public c(@NonNull ci ci2, A a2) {
            this.a = ci2;
            this.b = a2;
        }
    }

    public static interface d<T extends rg, D> {
        @NonNull
        public T a(D var1);
    }
}

