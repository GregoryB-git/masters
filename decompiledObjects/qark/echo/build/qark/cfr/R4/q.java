/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package R4;

import R4.b;
import R4.j;
import R4.t;
import kotlin.jvm.internal.Intrinsics;

public final class q {
    public final j a;
    public final t b;
    public final b c;

    public q(j j8, t t8, b b8) {
        Intrinsics.checkNotNullParameter(j8, "eventType");
        Intrinsics.checkNotNullParameter(t8, "sessionData");
        Intrinsics.checkNotNullParameter(b8, "applicationInfo");
        this.a = j8;
        this.b = t8;
        this.c = b8;
    }

    public final b a() {
        return this.c;
    }

    public final j b() {
        return this.a;
    }

    public final t c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof q)) {
            return false;
        }
        object = (q)object;
        if (this.a != object.a) {
            return false;
        }
        if (!Intrinsics.a(this.b, object.b)) {
            return false;
        }
        if (!Intrinsics.a(this.c, object.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SessionEvent(eventType=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", sessionData=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", applicationInfo=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

