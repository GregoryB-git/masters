/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package R4;

import R4.a;
import R4.n;
import kotlin.jvm.internal.Intrinsics;

public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final n e;
    public final a f;

    public b(String string2, String string3, String string4, String string5, n n8, a a8) {
        Intrinsics.checkNotNullParameter(string2, "appId");
        Intrinsics.checkNotNullParameter(string3, "deviceModel");
        Intrinsics.checkNotNullParameter(string4, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(string5, "osVersion");
        Intrinsics.checkNotNullParameter(n8, "logEnvironment");
        Intrinsics.checkNotNullParameter(a8, "androidAppInfo");
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = n8;
        this.f = a8;
    }

    public final a a() {
        return this.f;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final n d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        if (!Intrinsics.a(this.a, object.a)) {
            return false;
        }
        if (!Intrinsics.a(this.b, object.b)) {
            return false;
        }
        if (!Intrinsics.a(this.c, object.c)) {
            return false;
        }
        if (!Intrinsics.a(this.d, object.d)) {
            return false;
        }
        if (this.e != object.e) {
            return false;
        }
        if (!Intrinsics.a(this.f, object.f)) {
            return false;
        }
        return true;
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        return ((((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + this.f.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApplicationInfo(appId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", deviceModel=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sessionSdkVersion=");
        stringBuilder.append(this.c);
        stringBuilder.append(", osVersion=");
        stringBuilder.append(this.d);
        stringBuilder.append(", logEnvironment=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(", androidAppInfo=");
        stringBuilder.append((Object)this.f);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

