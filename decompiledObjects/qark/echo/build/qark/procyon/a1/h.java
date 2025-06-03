// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a1;

import d0.x;
import java.util.List;
import X2.v;
import F0.W;
import g0.a;
import d0.q;
import F0.K;
import java.util.Arrays;
import g0.z;

public final class h extends i
{
    public static final byte[] o;
    public static final byte[] p;
    public boolean n;
    
    static {
        o = new byte[] { 79, 112, 117, 115, 72, 101, 97, 100 };
        p = new byte[] { 79, 112, 117, 115, 84, 97, 103, 115 };
    }
    
    public static boolean n(final z z, final byte[] a2) {
        if (z.a() < a2.length) {
            return false;
        }
        final int f = z.f();
        final byte[] a3 = new byte[a2.length];
        z.l(a3, 0, a2.length);
        z.T(f);
        return Arrays.equals(a3, a2);
    }
    
    public static boolean o(final z z) {
        return n(z, h.o);
    }
    
    @Override
    public long f(final z z) {
        return this.c(K.e(z.e()));
    }
    
    @Override
    public boolean i(final z z, final long n, final b b) {
        q.b b2;
        if (n(z, h.o)) {
            final byte[] copy = Arrays.copyOf(z.e(), z.g());
            final int c = K.c(copy);
            final List a = K.a(copy);
            if (b.a != null) {
                return true;
            }
            b2 = new q.b().o0("audio/opus").N(c).p0(48000).b0(a);
        }
        else {
            final byte[] p3 = h.p;
            if (!n(z, p3)) {
                g0.a.h(b.a);
                return false;
            }
            g0.a.h(b.a);
            if (this.n) {
                return true;
            }
            this.n = true;
            z.U(p3.length);
            final x d = W.d(v.V(W.k(z, false, false).b));
            if (d == null) {
                return true;
            }
            b2 = b.a.a().h0(d.b(b.a.k));
        }
        b.a = b2.K();
        return true;
    }
    
    @Override
    public void l(final boolean b) {
        super.l(b);
        if (b) {
            this.n = false;
        }
    }
}
