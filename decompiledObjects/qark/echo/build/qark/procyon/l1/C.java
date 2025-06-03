// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import g0.y;
import g0.a;
import F0.L;
import F0.M;
import java.util.List;
import F0.s;
import F0.q;
import F0.t;
import g0.z;
import android.util.SparseArray;
import g0.E;
import F0.x;
import F0.r;

public final class C implements r
{
    public static final x l;
    public final E a;
    public final SparseArray b;
    public final z c;
    public final A d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public l1.z i;
    public t j;
    public boolean k;
    
    static {
        l = new B();
    }
    
    public C() {
        this(new E(0L));
    }
    
    public C(final E a) {
        this.a = a;
        this.c = new z(4096);
        this.b = new SparseArray();
        this.d = new A();
    }
    
    @Override
    public void a(long n, final long n2) {
        n = this.a.f();
        final boolean b = false;
        final boolean b2 = n == -9223372036854775807L;
        Label_0077: {
            if (!b2) {
                n = this.a.d();
                if (n == -9223372036854775807L || n == 0L || n == n2) {
                    break Label_0077;
                }
            }
            else if (!b2) {
                break Label_0077;
            }
            this.a.i(n2);
        }
        final l1.z i = this.i;
        int j = b ? 1 : 0;
        if (i != null) {
            i.h(n2);
            j = (b ? 1 : 0);
        }
        while (j < this.b.size()) {
            ((a)this.b.valueAt(j)).d();
            ++j;
        }
    }
    
    @Override
    public void b(final t j) {
        this.j = j;
    }
    
    @Override
    public boolean e(final s s) {
        final byte[] array = new byte[14];
        boolean b = false;
        s.n(array, 0, 14);
        if (0x1BA != ((array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF))) {
            return false;
        }
        if ((array[4] & 0xC4) != 0x44) {
            return false;
        }
        if ((array[6] & 0x4) != 0x4) {
            return false;
        }
        if ((array[8] & 0x4) != 0x4) {
            return false;
        }
        if ((array[9] & 0x1) != 0x1) {
            return false;
        }
        if ((array[12] & 0x3) != 0x3) {
            return false;
        }
        s.o(array[13] & 0x7);
        s.n(array, 0, 3);
        if (0x1 == ((array[0] & 0xFF) << 16 | (array[1] & 0xFF) << 8 | (array[2] & 0xFF))) {
            b = true;
        }
        return b;
    }
    
    public final void h(final long n) {
        if (!this.k) {
            this.k = true;
            t t;
            M b;
            if (this.d.c() != -9223372036854775807L) {
                final l1.z i = new l1.z(this.d.d(), this.d.c(), n);
                this.i = i;
                t = this.j;
                b = i.b();
            }
            else {
                t = this.j;
                b = new M.b(this.d.c());
            }
            t.e(b);
        }
    }
    
    @Override
    public int i(final s s, final L l) {
        g0.a.h(this.j);
        final long a = s.a();
        final long n = lcmp(a, -1L);
        if (n != 0 && !this.d.e()) {
            return this.d.g(s, l);
        }
        this.h(a);
        final l1.z i = this.i;
        if (i != null && i.d()) {
            return this.i.c(s, l);
        }
        s.h();
        long n2;
        if (n != 0) {
            n2 = a - s.m();
        }
        else {
            n2 = -1L;
        }
        if (n2 != -1L && n2 < 4L) {
            return -1;
        }
        if (!s.l(this.c.e(), 0, 4, true)) {
            return -1;
        }
        this.c.T(0);
        final int p2 = this.c.p();
        if (p2 == 441) {
            return -1;
        }
        int n3;
        if (p2 == 442) {
            s.n(this.c.e(), 0, 10);
            this.c.T(9);
            n3 = (this.c.G() & 0x7) + 14;
        }
        else if (p2 == 443) {
            s.n(this.c.e(), 0, 2);
            this.c.T(0);
            n3 = this.c.M() + 6;
        }
        else {
            if ((p2 & 0xFFFFFF00) >> 8 != 1) {
                s.i(1);
                return 0;
            }
            final int n4 = p2 & 0xFF;
            a a3;
            final a a2 = a3 = (a)this.b.get(n4);
            if (!this.e) {
                a a4;
                if ((a4 = a2) == null) {
                    m j = null;
                    Label_0426: {
                        m m = null;
                        Label_0358: {
                            if (n4 == 189) {
                                m = new c();
                            }
                            else if ((p2 & 0xE0) == 0xC0) {
                                m = new l1.t();
                            }
                            else {
                                if ((p2 & 0xF0) == 0xE0) {
                                    m = new n();
                                    this.g = true;
                                    break Label_0358;
                                }
                                j = null;
                                break Label_0426;
                            }
                            this.f = true;
                        }
                        this.h = s.p();
                        j = m;
                    }
                    a4 = a2;
                    if (j != null) {
                        j.e(this.j, new K.d(n4, 256));
                        a4 = new a(j, this.a);
                        this.b.put(n4, (Object)a4);
                    }
                }
                long n5;
                if (this.f && this.g) {
                    n5 = this.h + 8192L;
                }
                else {
                    n5 = 1048576L;
                }
                a3 = a4;
                if (s.p() > n5) {
                    this.e = true;
                    this.j.j();
                    a3 = a4;
                }
            }
            s.n(this.c.e(), 0, 2);
            this.c.T(0);
            final int n6 = this.c.M() + 6;
            if (a3 == null) {
                s.i(n6);
                return 0;
            }
            this.c.P(n6);
            s.readFully(this.c.e(), 0, n6);
            this.c.T(6);
            a3.a(this.c);
            final z c = this.c;
            c.S(c.b());
            return 0;
        }
        s.i(n3);
        return 0;
    }
    
    @Override
    public void release() {
    }
    
    public static final class a
    {
        public final m a;
        public final E b;
        public final y c;
        public boolean d;
        public boolean e;
        public boolean f;
        public int g;
        public long h;
        
        public a(final m a, final E b) {
            this.a = a;
            this.b = b;
            this.c = new y(new byte[64]);
        }
        
        public void a(final z z) {
            z.l(this.c.a, 0, 3);
            this.c.p(0);
            this.b();
            z.l(this.c.a, 0, this.g);
            this.c.p(0);
            this.c();
            this.a.d(this.h, 4);
            this.a.a(z);
            this.a.c(false);
        }
        
        public final void b() {
            this.c.r(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.r(6);
            this.g = this.c.h(8);
        }
        
        public final void c() {
            this.h = 0L;
            if (this.d) {
                this.c.r(4);
                final long n = this.c.h(3);
                this.c.r(1);
                final long n2 = this.c.h(15) << 15;
                this.c.r(1);
                final long n3 = this.c.h(15);
                this.c.r(1);
                if (!this.f && this.e) {
                    this.c.r(4);
                    final long n4 = this.c.h(3);
                    this.c.r(1);
                    final long n5 = this.c.h(15) << 15;
                    this.c.r(1);
                    final long n6 = this.c.h(15);
                    this.c.r(1);
                    this.b.b(n4 << 30 | n5 | n6);
                    this.f = true;
                }
                this.h = this.b.b(n << 30 | n2 | n3);
            }
        }
        
        public void d() {
            this.f = false;
            this.a.b();
        }
    }
}
