/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import l6.c;

public final class d {
    public final String a;
    public final c b;

    public d(String string2, c c8) {
        Intrinsics.checkNotNullParameter(string2, "value");
        Intrinsics.checkNotNullParameter(c8, "range");
        this.a = string2;
        this.b = c8;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        object = (d)object;
        if (!Intrinsics.a(this.a, object.a)) {
            return false;
        }
        if (!Intrinsics.a(this.b, object.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MatchGroup(value=");
        stringBuilder.append(this.a);
        stringBuilder.append(", range=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

