// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import h0.e;
import android.util.SparseArray;
import java.util.List;
import d0.h;
import d0.q;
import java.util.Arrays;
import java.util.ArrayList;
import F0.t;
import h0.d;
import g0.M;
import g0.a;
import g0.z;
import F0.T;

public final class p implements m
{
    public final F a;
    public final boolean b;
    public final boolean c;
    public final w d;
    public final w e;
    public final w f;
    public long g;
    public final boolean[] h;
    public String i;
    public T j;
    public b k;
    public boolean l;
    public long m;
    public boolean n;
    public final z o;
    
    public p(final F a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = new boolean[3];
        this.d = new w(7, 128);
        this.e = new w(8, 128);
        this.f = new w(6, 128);
        this.m = -9223372036854775807L;
        this.o = new z();
    }
    
    private void f() {
        g0.a.h(this.j);
        M.i(this.k);
    }
    
    @Override
    public void a(final z z) {
        this.f();
        int f = z.f();
        final int g = z.g();
        final byte[] e = z.e();
        this.g += z.a();
        this.j.e(z, z.a());
        while (true) {
            final int c = h0.d.c(e, f, g, this.h);
            if (c == g) {
                break;
            }
            final int f2 = h0.d.f(e, c);
            final int n = c - f;
            if (n > 0) {
                this.h(e, f, c);
            }
            final int n2 = g - c;
            final long n3 = this.g - n2;
            int n4;
            if (n < 0) {
                n4 = -n;
            }
            else {
                n4 = 0;
            }
            this.g(n3, n2, n4, this.m);
            this.i(n3, f2, this.m);
            f = c + 3;
        }
        this.h(e, f, g);
    }
    
    @Override
    public void b() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        h0.d.a(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        final b k = this.k;
        if (k != null) {
            k.h();
        }
    }
    
    @Override
    public void c(final boolean b) {
        this.f();
        if (b) {
            this.k.b(this.g);
        }
    }
    
    @Override
    public void d(final long m, int n) {
        this.m = m;
        final boolean n2 = this.n;
        if ((n & 0x2) != 0x0) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.n = (((n2 ? 1 : 0) | n) != 0x0);
    }
    
    @Override
    public void e(final t t, final K.d d) {
        d.a();
        this.i = d.b();
        final T a = t.a(d.c(), 2);
        this.j = a;
        this.k = new b(a, this.b, this.c);
        this.a.b(t, d);
    }
    
    public final void g(final long n, final int n2, int r, final long n3) {
        Label_0461: {
            if (!this.l || this.k.d()) {
                this.d.b(r);
                this.e.b(r);
                w w = null;
                Label_0359: {
                    if (!this.l) {
                        if (!this.d.c() || !this.e.c()) {
                            break Label_0461;
                        }
                        final ArrayList<byte[]> list = new ArrayList<byte[]>();
                        final w d = this.d;
                        list.add(Arrays.copyOf(d.d, d.e));
                        final w e = this.e;
                        list.add(Arrays.copyOf(e.d, e.e));
                        final w d2 = this.d;
                        final d.c l = h0.d.l(d2.d, 3, d2.e);
                        final w e2 = this.e;
                        final d.b j = h0.d.j(e2.d, 3, e2.e);
                        this.j.d(new q.b().a0(this.i).o0("video/avc").O(g0.d.a(l.a, l.b, l.c)).v0(l.f).Y(l.g).P(new h.b().d(l.q).c(l.r).e(l.s).g(l.i + 8).b(l.j + 8).a()).k0(l.h).b0(list).g0(l.t).K());
                        this.l = true;
                        this.k.g(l);
                        this.k.f(j);
                        this.d.d();
                    }
                    else {
                        if (this.d.c()) {
                            final w d3 = this.d;
                            this.k.g(h0.d.l(d3.d, 3, d3.e));
                            w = this.d;
                            break Label_0359;
                        }
                        if (!this.e.c()) {
                            break Label_0461;
                        }
                        final w e3 = this.e;
                        this.k.f(h0.d.j(e3.d, 3, e3.e));
                    }
                    w = this.e;
                }
                w.d();
            }
        }
        if (this.f.b(r)) {
            final w f = this.f;
            r = h0.d.r(f.d, f.e);
            this.o.R(this.f.d, r);
            this.o.T(4);
            this.a.a(n3, this.o);
        }
        if (this.k.c(n, n2, this.l)) {
            this.n = false;
        }
    }
    
    public final void h(final byte[] array, final int n, final int n2) {
        if (!this.l || this.k.d()) {
            this.d.a(array, n, n2);
            this.e.a(array, n, n2);
        }
        this.f.a(array, n, n2);
        this.k.a(array, n, n2);
    }
    
    public final void i(final long n, final int n2, final long n3) {
        if (!this.l || this.k.d()) {
            this.d.e(n2);
            this.e.e(n2);
        }
        this.f.e(n2);
        this.k.j(n, n2, n3, this.n);
    }
    
    public static final class b
    {
        public final T a;
        public final boolean b;
        public final boolean c;
        public final SparseArray d;
        public final SparseArray e;
        public final e f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public boolean k;
        public long l;
        public a m;
        public a n;
        public boolean o;
        public long p;
        public long q;
        public boolean r;
        public boolean s;
        
        public b(final T a, final boolean b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = new SparseArray();
            this.e = new SparseArray();
            this.m = new a(null);
            this.n = new a(null);
            final byte[] g = new byte[128];
            this.g = g;
            this.f = new e(g, 0, 0);
            this.h();
        }
        
        public void a(final byte[] array, int h, int e) {
            if (!this.k) {
                return;
            }
            e -= h;
            final byte[] g = this.g;
            final int length = g.length;
            final int h2 = this.h;
            if (length < h2 + e) {
                this.g = Arrays.copyOf(g, (h2 + e) * 2);
            }
            System.arraycopy(array, h, this.g, this.h, e);
            h = this.h + e;
            this.h = h;
            this.f.i(this.g, 0, h);
            if (!this.f.b(8)) {
                return;
            }
            this.f.k();
            final int e2 = this.f.e(2);
            this.f.l(5);
            if (!this.f.c()) {
                return;
            }
            this.f.h();
            if (!this.f.c()) {
                return;
            }
            final int h3 = this.f.h();
            if (!this.c) {
                this.k = false;
                this.n.f(h3);
                return;
            }
            if (!this.f.c()) {
                return;
            }
            final int h4 = this.f.h();
            if (this.e.indexOfKey(h4) < 0) {
                this.k = false;
                return;
            }
            final d.b b = (d.b)this.e.get(h4);
            final d.c c = (d.c)this.d.get(b.b);
            if (c.k) {
                if (!this.f.b(2)) {
                    return;
                }
                this.f.l(2);
            }
            if (!this.f.b(c.m)) {
                return;
            }
            final int e3 = this.f.e(c.m);
            boolean d = false;
            boolean d2 = false;
            boolean b2 = false;
            Label_0392: {
                if (!c.l) {
                    if (!this.f.b(1)) {
                        return;
                    }
                    d = this.f.d();
                    if (d) {
                        if (!this.f.b(1)) {
                            return;
                        }
                        d2 = this.f.d();
                        b2 = true;
                        break Label_0392;
                    }
                }
                else {
                    d = false;
                }
                b2 = false;
                d2 = false;
            }
            final boolean b3 = this.i == 5;
            int h5;
            if (b3) {
                if (!this.f.c()) {
                    return;
                }
                h5 = this.f.h();
            }
            else {
                h5 = 0;
            }
            h = c.n;
            int g2 = 0;
            int g3 = 0;
            Label_0616: {
                while (true) {
                    Label_0519: {
                        if (h == 0) {
                            if (!this.f.b(c.o)) {
                                return;
                            }
                            e = this.f.e(c.o);
                            if (!b.c || d) {
                                break Label_0519;
                            }
                            if (!this.f.c()) {
                                return;
                            }
                            g2 = this.f.g();
                            h = 0;
                        }
                        else {
                            if (h != 1 || c.p) {
                                e = 0;
                                break Label_0519;
                            }
                            if (!this.f.c()) {
                                return;
                            }
                            h = this.f.g();
                            if (!b.c || d) {
                                e = 0;
                                g2 = (g3 = e);
                                break Label_0616;
                            }
                            if (!this.f.c()) {
                                return;
                            }
                            g3 = this.f.g();
                            e = (g2 = 0);
                            break Label_0616;
                        }
                        g3 = h;
                        break Label_0616;
                    }
                    g2 = 0;
                    h = 0;
                    continue;
                }
            }
            this.n.e(c, e2, h3, e3, h4, d, b2, d2, b3, h5, e, g2, h, g3);
            this.k = false;
        }
        
        public void b(final long j) {
            this.i();
            this.j = j;
            this.e(0);
            this.o = false;
        }
        
        public boolean c(final long n, final int n2, final boolean b) {
            if (this.i == 9 || (this.c && this.n.c(this.m))) {
                if (b && this.o) {
                    this.e(n2 + (int)(n - this.j));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            this.i();
            return this.r;
        }
        
        public boolean d() {
            return this.c;
        }
        
        public final void e(final int n) {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public void f(final d.b b) {
            this.e.append(b.a, (Object)b);
        }
        
        public void g(final d.c c) {
            this.d.append(c.d, (Object)c);
        }
        
        public void h() {
            this.k = false;
            this.o = false;
            this.n.b();
        }
        
        public final void i() {
            boolean b;
            if (this.b) {
                b = this.n.d();
            }
            else {
                b = this.s;
            }
            final boolean r = this.r;
            final int i = this.i;
            boolean b2 = true;
            if (i != 5) {
                b2 = (b && i == 1 && b2);
            }
            this.r = (r | b2);
        }
        
        public void j(final long j, final int i, final long l, final boolean s) {
            this.i = i;
            this.l = l;
            this.j = j;
            this.s = s;
            if ((this.b && i == 1) || (this.c && (i == 5 || i == 1 || i == 2))) {
                final a m = this.m;
                this.m = this.n;
                (this.n = m).b();
                this.h = 0;
                this.k = true;
            }
        }
        
        public static final class a
        {
            public boolean a;
            public boolean b;
            public d.c c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;
            
            public void b() {
                this.b = false;
                this.a = false;
            }
            
            public final boolean c(final a a) {
                final boolean a2 = this.a;
                final boolean b = false;
                if (!a2) {
                    return false;
                }
                if (!a.a) {
                    return true;
                }
                final d.c c = (d.c)a.h(this.c);
                final d.c c2 = (d.c)a.h(a.c);
                if (this.f == a.f && this.g == a.g && this.h == a.h && (!this.i || !a.i || this.j == a.j)) {
                    final int d = this.d;
                    final int d2 = a.d;
                    if (d == d2 || (d != 0 && d2 != 0)) {
                        final int n = c.n;
                        if ((n != 0 || c2.n != 0 || (this.m == a.m && this.n == a.n)) && (n != 1 || c2.n != 1 || (this.o == a.o && this.p == a.p))) {
                            final boolean k = this.k;
                            if (k == a.k) {
                                boolean b2 = b;
                                if (!k) {
                                    return b2;
                                }
                                b2 = b;
                                if (this.l == a.l) {
                                    return b2;
                                }
                            }
                        }
                    }
                }
                return true;
            }
            
            public boolean d() {
                if (this.b) {
                    final int e = this.e;
                    if (e == 7 || e == 2) {
                        return true;
                    }
                }
                return false;
            }
            
            public void e(final d.c c, final int d, final int e, final int f, final int g, final boolean h, final boolean i, final boolean j, final boolean k, final int l, final int m, final int n, final int o, final int p14) {
                this.c = c;
                this.d = d;
                this.e = e;
                this.f = f;
                this.g = g;
                this.h = h;
                this.i = i;
                this.j = j;
                this.k = k;
                this.l = l;
                this.m = m;
                this.n = n;
                this.o = o;
                this.p = p14;
                this.a = true;
                this.b = true;
            }
            
            public void f(final int e) {
                this.e = e;
                this.b = true;
            }
        }
    }
}
