/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package o0;

import android.net.Uri;
import g0.G;

public final class i {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public i(String string2, long l8, long l9) {
        String string3 = string2;
        if (string2 == null) {
            string3 = "";
        }
        this.c = string3;
        this.a = l8;
        this.b = l9;
    }

    public i a(i i8, String string2) {
        String string3 = this.c(string2);
        if (i8 != null) {
            long l8;
            if (!string3.equals((Object)i8.c(string2))) {
                return null;
            }
            long l9 = this.b;
            long l10 = -1L;
            if (l9 != -1L && (l8 = this.a) + l9 == i8.a) {
                long l11 = i8.b;
                if (l11 != -1L) {
                    l10 = l9 + l11;
                }
                return new i(string3, l8, l10);
            }
            long l12 = i8.b;
            if (l12 != -1L && (l8 = i8.a) + l12 == this.a) {
                if (l9 != -1L) {
                    l10 = l12 + l9;
                }
                return new i(string3, l8, l10);
            }
        }
        return null;
    }

    public Uri b(String string2) {
        return G.f(string2, this.c);
    }

    public String c(String string2) {
        return G.e(string2, this.c);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (i.class != object.getClass()) {
                return false;
            }
            object = (i)object;
            if (this.a == object.a && this.b == object.b && this.c.equals((Object)object.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        if (this.d == 0) {
            this.d = ((527 + (int)this.a) * 31 + (int)this.b) * 31 + this.c.hashCode();
        }
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RangedUri(referenceUri=");
        stringBuilder.append(this.c);
        stringBuilder.append(", start=");
        stringBuilder.append(this.a);
        stringBuilder.append(", length=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

