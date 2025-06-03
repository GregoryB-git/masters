/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package R4;

import R4.d;
import R4.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.j;

public final class t {
    public final String a;
    public final String b;
    public final int c;
    public long d;
    public f e;
    public String f;

    public t(String string2, String string3, int n8, long l8, f f8, String string4) {
        Intrinsics.checkNotNullParameter(string2, "sessionId");
        Intrinsics.checkNotNullParameter(string3, "firstSessionId");
        Intrinsics.checkNotNullParameter(f8, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(string4, "firebaseInstallationId");
        this.a = string2;
        this.b = string3;
        this.c = n8;
        this.d = l8;
        this.e = f8;
        this.f = string4;
    }

    public /* synthetic */ t(String string2, String string3, int n8, long l8, f f8, String string4, int n9, g g8) {
        if ((n9 & 16) != 0) {
            f8 = new f(null, null, 0.0, 7, null);
        }
        if ((n9 & 32) != 0) {
            string4 = "";
        }
        this(string2, string3, n8, l8, f8, string4);
    }

    public final f a() {
        return this.e;
    }

    public final long b() {
        return this.d;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof t)) {
            return false;
        }
        object = (t)object;
        if (!Intrinsics.a(this.a, object.a)) {
            return false;
        }
        if (!Intrinsics.a(this.b, object.b)) {
            return false;
        }
        if (this.c != object.c) {
            return false;
        }
        if (this.d != object.d) {
            return false;
        }
        if (!Intrinsics.a(this.e, object.e)) {
            return false;
        }
        if (!Intrinsics.a(this.f, object.f)) {
            return false;
        }
        return true;
    }

    public final int f() {
        return this.c;
    }

    public final void g(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.f = string2;
    }

    public int hashCode() {
        return ((((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c) * 31 + j.a(this.d)) * 31 + this.e.hashCode()) * 31 + this.f.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SessionInfo(sessionId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", firstSessionId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sessionIndex=");
        stringBuilder.append(this.c);
        stringBuilder.append(", eventTimestampUs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", dataCollectionStatus=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(", firebaseInstallationId=");
        stringBuilder.append(this.f);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

