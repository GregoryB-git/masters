// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import j0.i;
import k0.v0;
import k0.y0;
import k0.d1;
import d0.J;
import java.util.ArrayList;
import d0.I;
import i0.y;
import B0.b;
import g0.M;
import android.net.Uri;
import d0.u;
import d0.q;

public final class U extends a
{
    public static final q j;
    public static final u k;
    public static final byte[] l;
    public final long h;
    public u i;
    
    static {
        k = new u.c().b("SilenceMediaSource").e(Uri.EMPTY).c((j = new q.b().o0("audio/raw").N(2).p0(44100).i0(2).K()).n).a();
        l = new byte[M.g0(2, 2) * 1024];
    }
    
    public U(final long h, final u i) {
        g0.a.a(h >= 0L);
        this.h = h;
        this.i = i;
    }
    
    public static /* synthetic */ u C() {
        return U.k;
    }
    
    public static /* synthetic */ q D() {
        return U.j;
    }
    
    public static /* synthetic */ byte[] G() {
        return U.l;
    }
    
    public static long H(long n) {
        n = n * 44100L / 1000000L;
        return M.g0(2, 2) * n;
    }
    
    public static long I(final long n) {
        return n / M.g0(2, 2) * 1000000L / 44100L;
    }
    
    @Override
    public void B() {
    }
    
    @Override
    public u a() {
        synchronized (this) {
            return this.i;
        }
    }
    
    @Override
    public void e(final v v) {
    }
    
    @Override
    public v f(final x.b b, final B0.b b2, final long n) {
        return new c(this.h);
    }
    
    @Override
    public void h() {
    }
    
    @Override
    public void l(final u i) {
        synchronized (this) {
            this.i = i;
        }
    }
    
    @Override
    public void z(final y y) {
        this.A(new V(this.h, true, false, false, null, this.a()));
    }
    
    public static final class b
    {
        public long a;
        public Object b;
        
        public U a() {
            g0.a.f(this.a > 0L);
            return new U(this.a, U.C().a().d(this.b).a(), null);
        }
        
        public b b(final long a) {
            this.a = a;
            return this;
        }
        
        public b c(final Object b) {
            this.b = b;
            return this;
        }
    }
    
    public static final class c implements v
    {
        public static final Z q;
        public final long o;
        public final ArrayList p;
        
        static {
            q = new Z(new J[] { new J(new q[] { U.D() }) });
        }
        
        public c(final long o) {
            this.o = o;
            this.p = new ArrayList();
        }
        
        public final long a(final long n) {
            return M.q(n, 0L, this.o);
        }
        
        @Override
        public boolean b() {
            return false;
        }
        
        @Override
        public long c() {
            return Long.MIN_VALUE;
        }
        
        @Override
        public long d(final long n, final d1 d1) {
            return this.a(n);
        }
        
        @Override
        public long f() {
            return Long.MIN_VALUE;
        }
        
        @Override
        public boolean g(final y0 y0) {
            return false;
        }
        
        @Override
        public void h(final long n) {
        }
        
        @Override
        public long i(final A0.y[] array, final boolean[] array2, final Q[] array3, final boolean[] array4, long a) {
            a = this.a(a);
            for (int i = 0; i < array.length; ++i) {
                final Q o = array3[i];
                if (o != null && (array[i] == null || !array2[i])) {
                    this.p.remove(o);
                    array3[i] = null;
                }
                if (array3[i] == null && array[i] != null) {
                    final d e = new d(this.o);
                    e.b(a);
                    this.p.add(e);
                    array3[i] = e;
                    array4[i] = true;
                }
            }
            return a;
        }
        
        @Override
        public long l() {
            return -9223372036854775807L;
        }
        
        @Override
        public Z n() {
            return c.q;
        }
        
        @Override
        public void p() {
        }
        
        @Override
        public void q(final long n, final boolean b) {
        }
        
        @Override
        public long s(long a) {
            a = this.a(a);
            for (int i = 0; i < this.p.size(); ++i) {
                ((d)this.p.get(i)).b(a);
            }
            return a;
        }
        
        @Override
        public void u(final v.a a, final long n) {
            a.k(this);
        }
    }
    
    public static final class d implements Q
    {
        public final long o;
        public boolean p;
        public long q;
        
        public d(final long n) {
            this.o = H(n);
            this.b(0L);
        }
        
        @Override
        public void a() {
        }
        
        public void b(final long n) {
            this.q = M.q(H(n), 0L, this.o);
        }
        
        @Override
        public boolean e() {
            return true;
        }
        
        @Override
        public int j(final v0 v0, final i i, final int n) {
            if (!this.p || (n & 0x2) != 0x0) {
                v0.b = U.D();
                this.p = true;
                return -5;
            }
            final long o = this.o;
            final long q = this.q;
            final long b = o - q;
            if (b == 0L) {
                i.l(4);
                return -4;
            }
            i.t = I(q);
            i.l(1);
            final int length = (int)Math.min(U.G().length, b);
            if ((n & 0x4) == 0x0) {
                i.z(length);
                i.r.put(U.G(), 0, length);
            }
            if ((n & 0x1) == 0x0) {
                this.q += length;
            }
            return -4;
        }
        
        @Override
        public int m(final long n) {
            final long q = this.q;
            this.b(n);
            return (int)((this.q - q) / U.G().length);
        }
    }
}
