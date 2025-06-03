// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import g0.a;
import g0.M;

public final class C
{
    public static final C d;
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;
    
    static {
        d = new C(1.0f);
        e = M.w0(0);
        f = M.w0(1);
    }
    
    public C(final float n) {
        this(n, 1.0f);
    }
    
    public C(final float a, final float b) {
        final boolean b2 = true;
        g0.a.a(a > 0.0f);
        g0.a.a(b > 0.0f && b2);
        this.a = a;
        this.b = b;
        this.c = Math.round(a * 1000.0f);
    }
    
    public long a(final long n) {
        return n * this.c;
    }
    
    public C b(final float n) {
        return new C(n, this.b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (C.class != o.getClass()) {
            return false;
        }
        final C c = (C)o;
        return this.a == c.a && this.b == c.b;
    }
    
    @Override
    public int hashCode() {
        return (527 + Float.floatToRawIntBits(this.a)) * 31 + Float.floatToRawIntBits(this.b);
    }
    
    @Override
    public String toString() {
        return M.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", this.a, this.b);
    }
}
