/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 */
package k0;

import W2.k;
import g0.a;

public final class y0 {
    public final long a;
    public final float b;
    public final long c;

    public y0(b b8) {
        this.a = b8.a;
        this.b = b8.b;
        this.c = b8.c;
    }

    public /* synthetic */ y0(b b8,  a8) {
        this(b8);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof y0)) {
            return false;
        }
        object = (y0)object;
        if (this.a == object.a && this.b == object.b && this.c == object.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(new Object[]{this.a, Float.valueOf((float)this.b), this.c});
    }

    public static final class b {
        public long a = -9223372036854775807L;
        public float b = -3.4028235E38f;
        public long c = -9223372036854775807L;

        public y0 d() {
            return new y0(this, null);
        }

        public b e(long l8) {
            boolean bl = l8 >= 0L || l8 == -9223372036854775807L;
            a.a(bl);
            this.c = l8;
            return this;
        }

        public b f(long l8) {
            this.a = l8;
            return this;
        }

        public b g(float f8) {
            boolean bl = f8 > 0.0f || f8 == -3.4028235E38f;
            a.a(bl);
            this.b = f8;
            return this;
        }
    }

}

