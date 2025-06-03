// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a1;

import F0.s;
import F0.A;
import F0.M;
import F0.y;
import g0.a;
import d0.x;
import java.util.Arrays;
import g0.z;
import F0.B;

public final class b extends i
{
    public B n;
    public a o;
    
    public static boolean o(final byte[] array) {
        boolean b = false;
        if (array[0] == -1) {
            b = true;
        }
        return b;
    }
    
    public static boolean p(final z z) {
        return z.a() >= 5 && z.G() == 127 && z.I() == 1179402563L;
    }
    
    @Override
    public long f(final z z) {
        if (!o(z.e())) {
            return -1L;
        }
        return this.n(z);
    }
    
    @Override
    public boolean i(final z z, final long n, final i.b b) {
        final byte[] e = z.e();
        final B n2 = this.n;
        if (n2 == null) {
            final B n3 = new B(e, 17);
            this.n = n3;
            b.a = n3.g(Arrays.copyOfRange(e, 9, z.g()), null);
            return true;
        }
        if ((e[0] & 0x7F) == 0x3) {
            final B.a g = F0.z.g(z);
            final B b2 = n2.b(g);
            this.n = b2;
            this.o = new a(b2, g);
            return true;
        }
        if (o(e)) {
            final a o = this.o;
            if (o != null) {
                o.d(n);
                b.b = this.o;
            }
            g0.a.e(b.a);
            return false;
        }
        return true;
    }
    
    @Override
    public void l(final boolean b) {
        super.l(b);
        if (b) {
            this.n = null;
            this.o = null;
        }
    }
    
    public final int n(final z z) {
        final int n = (z.e()[2] & 0xFF) >> 4;
        if (n == 6 || n == 7) {
            z.U(4);
            z.N();
        }
        final int j = y.j(z, n);
        z.T(0);
        return j;
    }
    
    public static final class a implements g
    {
        public B a;
        public B.a b;
        public long c;
        public long d;
        
        public a(final B a, final B.a b) {
            this.a = a;
            this.b = b;
            this.c = -1L;
            this.d = -1L;
        }
        
        @Override
        public M a() {
            g0.a.f(this.c != -1L);
            return new A(this.a, this.c);
        }
        
        @Override
        public void b(final long n) {
            final long[] a = this.b.a;
            this.d = a[g0.M.h(a, n, true, true)];
        }
        
        @Override
        public long c(final s s) {
            final long d = this.d;
            if (d >= 0L) {
                final long n = -(d + 2L);
                this.d = -1L;
                return n;
            }
            return -1L;
        }
        
        public void d(final long c) {
            this.c = c;
        }
    }
}
