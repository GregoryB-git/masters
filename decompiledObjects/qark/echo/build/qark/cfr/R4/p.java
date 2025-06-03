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
import x1.j;

public final class p {
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public p(String string2, String string3, int n8, long l8) {
        Intrinsics.checkNotNullParameter(string2, "sessionId");
        Intrinsics.checkNotNullParameter(string3, "firstSessionId");
        this.a = string2;
        this.b = string3;
        this.c = n8;
        this.d = l8;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof p)) {
            return false;
        }
        object = (p)object;
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
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c) * 31 + j.a(this.d);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SessionDetails(sessionId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", firstSessionId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sessionIndex=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sessionStartTimestampUs=");
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

