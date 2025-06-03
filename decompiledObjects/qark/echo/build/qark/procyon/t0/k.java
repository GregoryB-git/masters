// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import g0.o;
import d0.z;
import g0.M;
import android.content.Context;

public final class k implements b
{
    public final Context a;
    public int b;
    public boolean c;
    
    public k(final Context a) {
        this.a = a;
        this.b = 0;
        this.c = true;
    }
    
    @Override
    public m a(final a a) {
        if (M.a >= 23) {
            final int b = this.b;
            if (b == 1 || (b == 0 && this.b())) {
                final int k = z.k(a.c.n);
                final StringBuilder sb = new StringBuilder();
                sb.append("Creating an asynchronous MediaCodec adapter for track type ");
                sb.append(M.p0(k));
                o.f("DMCodecAdapterFactory", sb.toString());
                final t0.b.b b2 = new t0.b.b(k);
                b2.e(this.c);
                return b2.d(a);
            }
        }
        return new K.b().a(a);
    }
    
    public final boolean b() {
        final int a = M.a;
        if (a >= 31) {
            return true;
        }
        final Context a2 = this.a;
        return a2 != null && a >= 28 && a2.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }
}
