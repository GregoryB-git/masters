/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.h2;

public class vg {
    @Nullable
    public final String a;
    @Nullable
    public final String b;
    @Deprecated
    @Nullable
    public final String c;
    @Nullable
    public final String d;
    @Nullable
    public final String e;
    @Nullable
    public final String f;
    @Nullable
    public final String g;
    @Nullable
    public final String h;
    @Nullable
    public final String i;
    @Nullable
    public final String j;
    @Nullable
    public final String k;
    @Nullable
    public final String l;
    @Nullable
    public final String m;
    @Nullable
    public final String n;
    @Nullable
    public final String o;
    @Nullable
    public final String p;

    public vg() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public vg(@NonNull Gl.a object) {
        this.a = object.c("dId");
        this.b = object.c("uId");
        this.c = object.b("kitVer");
        this.d = object.c("analyticsSdkVersionName");
        this.e = object.c("kitBuildNumber");
        this.f = object.c("kitBuildType");
        this.g = object.c("appVer");
        this.h = object.optString("app_debuggable", "0");
        this.i = object.c("appBuild");
        this.j = object.c("osVer");
        this.l = object.c("lang");
        this.m = object.c("root");
        this.p = object.c("commit_hash");
        this.n = object.optString("app_framework", h2.a());
        int n7 = object.optInt("osApiLev", -1);
        Object var4_3 = null;
        String string = n7 == -1 ? null : String.valueOf((int)n7);
        this.k = string;
        n7 = object.optInt("attribution_id", 0);
        object = var4_3;
        if (n7 > 0) {
            object = String.valueOf((int)n7);
        }
        this.o = object;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("DbNetworkTaskConfig{deviceId='");
        a.B(stringBuilder, this.a, '\'', ", uuid='");
        a.B(stringBuilder, this.b, '\'', ", kitVersion='");
        a.B(stringBuilder, this.c, '\'', ", analyticsSdkVersionName='");
        a.B(stringBuilder, this.d, '\'', ", kitBuildNumber='");
        a.B(stringBuilder, this.e, '\'', ", kitBuildType='");
        a.B(stringBuilder, this.f, '\'', ", appVersion='");
        a.B(stringBuilder, this.g, '\'', ", appDebuggable='");
        a.B(stringBuilder, this.h, '\'', ", appBuildNumber='");
        a.B(stringBuilder, this.i, '\'', ", osVersion='");
        a.B(stringBuilder, this.j, '\'', ", osApiLevel='");
        a.B(stringBuilder, this.k, '\'', ", locale='");
        a.B(stringBuilder, this.l, '\'', ", deviceRootStatus='");
        a.B(stringBuilder, this.m, '\'', ", appFramework='");
        a.B(stringBuilder, this.n, '\'', ", attributionId='");
        a.B(stringBuilder, this.o, '\'', ", commitHash='");
        stringBuilder.append(this.p);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

