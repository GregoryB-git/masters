// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a1;

import X2.v;
import java.util.List;
import d0.q;
import java.util.ArrayList;
import g0.a;
import d0.A;
import java.util.Arrays;
import g0.z;
import F0.W;

public final class j extends i
{
    public a n;
    public int o;
    public boolean p;
    public W.c q;
    public W.a r;
    
    public static void n(final z z, final long n) {
        if (z.b() < z.g() + 4) {
            z.Q(Arrays.copyOf(z.e(), z.g() + 4));
        }
        else {
            z.S(z.g() + 4);
        }
        final byte[] e = z.e();
        e[z.g() - 4] = (byte)(n & 0xFFL);
        e[z.g() - 3] = (byte)(n >>> 8 & 0xFFL);
        e[z.g() - 2] = (byte)(n >>> 16 & 0xFFL);
        e[z.g() - 1] = (byte)(n >>> 24 & 0xFFL);
    }
    
    public static int o(final byte b, final a a) {
        if (!a.d[p(b, a.e, 1)].a) {
            return a.a.g;
        }
        return a.a.h;
    }
    
    public static int p(final byte b, final int n, final int n2) {
        return b >> n2 & 255 >>> 8 - n;
    }
    
    public static boolean r(final z z) {
        try {
            return W.o(1, z, true);
        }
        catch (A a) {
            return false;
        }
    }
    
    @Override
    public void e(final long n) {
        super.e(n);
        int g = 0;
        this.p = (n != 0L);
        final W.c q = this.q;
        if (q != null) {
            g = q.g;
        }
        this.o = g;
    }
    
    @Override
    public long f(final z z) {
        final byte[] e = z.e();
        int n = 0;
        if ((e[0] & 0x1) == 0x1) {
            return -1L;
        }
        final int o = o(z.e()[0], (a)g0.a.h(this.n));
        if (this.p) {
            n = (this.o + o) / 4;
        }
        final long n2 = n;
        n(z, n2);
        this.p = true;
        this.o = o;
        return n2;
    }
    
    @Override
    public boolean i(final z z, final long n, final b b) {
        if (this.n != null) {
            g0.a.e(b.a);
            return false;
        }
        final a q = this.q(z);
        if ((this.n = q) == null) {
            return true;
        }
        final W.c a = q.a;
        final ArrayList<byte[]> list = new ArrayList<byte[]>();
        list.add(a.j);
        list.add(q.c);
        b.a = new q.b().o0("audio/vorbis").M(a.e).j0(a.d).N(a.b).p0(a.c).b0(list).h0(W.d(v.V(q.b.b))).K();
        return true;
    }
    
    @Override
    public void l(final boolean b) {
        super.l(b);
        if (b) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
    
    public a q(final z z) {
        final W.c q = this.q;
        if (q == null) {
            this.q = W.l(z);
            return null;
        }
        final W.a r = this.r;
        if (r == null) {
            this.r = W.j(z);
            return null;
        }
        final byte[] array = new byte[z.g()];
        System.arraycopy(z.e(), 0, array, 0, z.g());
        final W.b[] m = W.m(z, q.b);
        return new a(q, r, array, m, W.b(m.length - 1));
    }
    
    public static final class a
    {
        public final W.c a;
        public final W.a b;
        public final byte[] c;
        public final W.b[] d;
        public final int e;
        
        public a(final W.c a, final W.a b, final byte[] c, final W.b[] d, final int e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
}
