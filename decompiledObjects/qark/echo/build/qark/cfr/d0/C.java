/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package d0;

import g0.M;
import g0.a;

public final class C {
    public static final C d = new C(1.0f);
    public static final String e = M.w0(0);
    public static final String f = M.w0(1);
    public final float a;
    public final float b;
    public final int c;

    public C(float f8) {
        this(f8, 1.0f);
    }

    public C(float f8, float f9) {
        boolean bl = true;
        boolean bl2 = f8 > 0.0f;
        a.a(bl2);
        bl2 = f9 > 0.0f ? bl : false;
        a.a(bl2);
        this.a = f8;
        this.b = f9;
        this.c = Math.round((float)(f8 * 1000.0f));
    }

    public long a(long l8) {
        return l8 * (long)this.c;
    }

    public C b(float f8) {
        return new C(f8, this.b);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (C.class != object.getClass()) {
                return false;
            }
            object = (C)object;
            if (this.a == object.a && this.b == object.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (527 + Float.floatToRawIntBits((float)this.a)) * 31 + Float.floatToRawIntBits((float)this.b);
    }

    public String toString() {
        return M.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", new Object[]{Float.valueOf((float)this.a), Float.valueOf((float)this.b)});
    }
}

