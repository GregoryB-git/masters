/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package R4;

import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public a(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "packageName");
        Intrinsics.checkNotNullParameter(string3, "versionName");
        Intrinsics.checkNotNullParameter(string4, "appBuildVersion");
        Intrinsics.checkNotNullParameter(string5, "deviceManufacturer");
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
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
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AndroidApplicationInfo(packageName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", versionName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", appBuildVersion=");
        stringBuilder.append(this.c);
        stringBuilder.append(", deviceManufacturer=");
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

