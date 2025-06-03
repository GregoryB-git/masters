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
import R4.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class f {
    public final d a;
    public final d b;
    public final double c;

    public f(d d8, d d9, double d10) {
        Intrinsics.checkNotNullParameter(d8, "performance");
        Intrinsics.checkNotNullParameter(d9, "crashlytics");
        this.a = d8;
        this.b = d9;
        this.c = d10;
    }

    public /* synthetic */ f(d d8, d d9, double d10, int n8, g g8) {
        if ((n8 & 1) != 0) {
            d8 = d.q;
        }
        if ((n8 & 2) != 0) {
            d9 = d.q;
        }
        if ((n8 & 4) != 0) {
            d10 = 1.0;
        }
        this(d8, d9, d10);
    }

    public final d a() {
        return this.b;
    }

    public final d b() {
        return this.a;
    }

    public final double c() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        object = (f)object;
        if (this.a != object.a) {
            return false;
        }
        if (this.b != object.b) {
            return false;
        }
        if (!Intrinsics.a(this.c, object.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + e.a(this.c);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataCollectionStatus(performance=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", crashlytics=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", sessionSamplingRate=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

