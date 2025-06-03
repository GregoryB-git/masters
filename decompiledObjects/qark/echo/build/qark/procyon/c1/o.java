// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import java.util.Arrays;
import a3.f;
import F0.L;
import d0.A;
import java.util.Collections;
import g0.g;
import F0.s;
import F0.H;
import g0.a;
import java.util.ArrayList;
import g0.M;
import F0.T;
import g0.z;
import java.util.List;
import d0.q;
import F0.r;

public class o implements r
{
    public final t a;
    public final d b;
    public final q c;
    public final List d;
    public final z e;
    public byte[] f;
    public T g;
    public int h;
    public int i;
    public long[] j;
    public long k;
    
    public o(final t a, final q q) {
        this.a = a;
        this.b = new d();
        this.f = M.f;
        this.e = new z();
        this.c = q.a().o0("application/x-media3-cues").O(q.n).S(a.d()).K();
        this.d = new ArrayList();
        this.i = 0;
        this.j = M.g;
        this.k = -9223372036854775807L;
    }
    
    @Override
    public void a(final long n, final long k) {
        final int i = this.i;
        g0.a.f(i != 0 && i != 5);
        this.k = k;
        if (this.i == 2) {
            this.i = 1;
        }
        if (this.i == 4) {
            this.i = 3;
        }
    }
    
    @Override
    public void b(final F0.t t) {
        g0.a.f(this.i == 0);
        (this.g = t.a(0, 3)).d(this.c);
        t.j();
        t.e(new H(new long[] { 0L }, new long[] { 0L }, -9223372036854775807L));
        this.i = 1;
    }
    
    @Override
    public boolean e(final s s) {
        return true;
    }
    
    public final void h() {
        while (true) {
            try {
                final long k = this.k;
                t.b b;
                if (k != -9223372036854775807L) {
                    b = t.b.c(k);
                }
                else {
                    b = t.b.b();
                }
                this.a.c(this.f, 0, this.h, b, new n(this));
                Collections.sort((List<Comparable>)this.d);
                this.j = new long[this.d.size()];
                for (int i = 0; i < this.d.size(); ++i) {
                    this.j[i] = o.b.c((b)this.d.get(i));
                }
                this.f = M.f;
                return;
                final RuntimeException ex;
                throw A.a("SubtitleParser failed.", ex);
            }
            catch (RuntimeException ex2) {}
            final RuntimeException ex2;
            final RuntimeException ex = ex2;
            continue;
        }
    }
    
    @Override
    public int i(final s s, final L l) {
        final int i = this.i;
        g0.a.f(i != 0 && i != 5);
        if (this.i == 1) {
            int d;
            if (s.a() != -1L) {
                d = a3.f.d(s.a());
            }
            else {
                d = 1024;
            }
            if (d > this.f.length) {
                this.f = new byte[d];
            }
            this.h = 0;
            this.i = 2;
        }
        if (this.i == 2 && this.j(s)) {
            this.h();
            this.i = 4;
        }
        if (this.i == 3 && this.k(s)) {
            this.l();
            this.i = 4;
        }
        if (this.i == 4) {
            return -1;
        }
        return 0;
    }
    
    public final boolean j(final s s) {
        final byte[] f = this.f;
        if (f.length == this.h) {
            this.f = Arrays.copyOf(f, f.length + 1024);
        }
        final byte[] f2 = this.f;
        final int h = this.h;
        final int read = s.read(f2, h, f2.length - h);
        if (read != -1) {
            this.h += read;
        }
        final long a = s.a();
        return (a != -1L && this.h == a) || read == -1;
    }
    
    public final boolean k(final s s) {
        int d;
        if (s.a() != -1L) {
            d = a3.f.d(s.a());
        }
        else {
            d = 1024;
        }
        return s.b(d) == -1;
    }
    
    public final void l() {
        final long k = this.k;
        int i;
        if (k == -9223372036854775807L) {
            i = 0;
        }
        else {
            i = M.h(this.j, k, true, true);
        }
        while (i < this.d.size()) {
            this.m((b)this.d.get(i));
            ++i;
        }
    }
    
    public final void m(final b b) {
        g0.a.h(this.g);
        final int length = o.b.e(b).length;
        this.e.Q(o.b.e(b));
        this.g.e(this.e, length);
        this.g.b(o.b.c(b), 1, length, 0, null);
    }
    
    @Override
    public void release() {
        if (this.i == 5) {
            return;
        }
        this.a.b();
        this.i = 5;
    }
    
    public static class b implements Comparable
    {
        public final long o;
        public final byte[] p;
        
        public b(final long o, final byte[] p2) {
            this.o = o;
            this.p = p2;
        }
        
        public static /* synthetic */ long c(final b b) {
            return b.o;
        }
        
        public static /* synthetic */ byte[] e(final b b) {
            return b.p;
        }
        
        public int h(final b b) {
            return Long.compare(this.o, b.o);
        }
    }
}
