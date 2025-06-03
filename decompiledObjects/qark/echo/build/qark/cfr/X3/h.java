/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package X3;

import a4.i;

public final class h {
    public final long a;
    public final i b;
    public final long c;
    public final boolean d;
    public final boolean e;

    public h(long l8, i i8, long l9, boolean bl, boolean bl2) {
        this.a = l8;
        if (i8.g() && !i8.f()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.b = i8;
        this.c = l9;
        this.d = bl;
        this.e = bl2;
    }

    public h a(boolean bl) {
        return new h(this.a, this.b, this.c, this.d, bl);
    }

    public h b() {
        return new h(this.a, this.b, this.c, true, this.e);
    }

    public h c(long l8) {
        return new h(this.a, this.b, l8, this.d, this.e);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object != null) {
            if (object.getClass() != h.class) {
                return false;
            }
            object = (h)object;
            if (this.a == object.a && this.b.equals(object.b) && this.c == object.c && this.d == object.d && this.e == object.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((Long.valueOf((long)this.a).hashCode() * 31 + this.b.hashCode()) * 31 + Long.valueOf((long)this.c).hashCode()) * 31 + Boolean.valueOf((boolean)this.d).hashCode()) * 31 + Boolean.valueOf((boolean)this.e).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackedQuery{id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", querySpec=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", lastUse=");
        stringBuilder.append(this.c);
        stringBuilder.append(", complete=");
        stringBuilder.append(this.d);
        stringBuilder.append(", active=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

