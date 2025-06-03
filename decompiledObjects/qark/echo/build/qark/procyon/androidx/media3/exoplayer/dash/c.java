// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media3.exoplayer.dash;

import i0.k;
import d0.z;
import java.util.Map;
import X2.w;
import d0.q;
import java.util.Collection;
import g0.G;
import android.util.Pair;
import android.os.SystemClock;
import y0.n;
import g0.M;
import k0.y0;
import F0.h;
import n0.i;
import y0.l;
import i0.t;
import B0.m;
import k0.d1;
import y0.e;
import java.util.ArrayList;
import F0.T;
import o0.j;
import l0.y1;
import java.util.List;
import y0.f;
import java.io.IOException;
import A0.y;
import i0.g;
import n0.b;
import B0.o;

public class c implements androidx.media3.exoplayer.dash.a
{
    public final o a;
    public final n0.b b;
    public final int[] c;
    public final int d;
    public final g e;
    public final long f;
    public final int g;
    public final d.c h;
    public final b[] i;
    public y j;
    public c k;
    public int l;
    public IOException m;
    public boolean n;
    public long o;
    
    public c(final f.a a, final o a2, final c k, final n0.b b, int i, final int[] c, final y j, final int d, final g e, long g, final int g2, final boolean b2, final List list, final d.c h, final y1 y1, final B0.f f) {
        this.a = a2;
        this.k = k;
        this.b = b;
        this.c = c;
        this.j = j;
        this.d = d;
        this.e = e;
        this.l = i;
        this.f = g;
        this.g = g2;
        this.h = h;
        this.o = -9223372036854775807L;
        g = k.g(i);
        final ArrayList n = this.n();
        this.i = new b[j.length()];
        j l;
        o0.b m;
        b[] i2;
        for (i = 0; i < this.i.length; ++i) {
            l = n.get(j.c(i));
            m = b.j(l.c);
            i2 = this.i;
            if (m == null) {
                m = l.c.get(0);
            }
            i2[i] = new b(g, l, m, a.c(d, l.b, b2, list, h, y1), 0L, l.l());
        }
    }
    
    @Override
    public void a() {
        final IOException m = this.m;
        if (m == null) {
            this.a.a();
            return;
        }
        throw m;
    }
    
    @Override
    public boolean b(final long n, final e e, final List list) {
        return this.m == null && this.j.q(n, e, list);
    }
    
    @Override
    public void c(final c k, int i) {
        try {
            this.k = k;
            this.l = i;
            final long g = k.g(i);
            final ArrayList n = this.n();
            j j;
            b[] l;
            for (i = 0; i < this.i.length; ++i) {
                j = n.get(this.j.c(i));
                l = this.i;
                l[i] = l[i].b(g, j);
            }
        }
        catch (x0.b m) {
            this.m = m;
        }
    }
    
    @Override
    public long d(final long n, final d1 d1) {
        final b[] i = this.i;
        for (int length = i.length, j = 0; j < length; ++j) {
            final b b = i[j];
            if (b.d != null) {
                final long h = b.h();
                if (h != 0L) {
                    final long k = b.j(n);
                    final long l = b.k(k);
                    long m;
                    if (l < n && (h == -1L || k < b.f() + h - 1L)) {
                        m = b.k(k + 1L);
                    }
                    else {
                        m = l;
                    }
                    return d1.a(n, l, m);
                }
            }
        }
        return n;
    }
    
    @Override
    public boolean e(final e e, final boolean b, final m.c c, final m m) {
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final d.c h = this.h;
        if (h != null && h.j(e)) {
            return true;
        }
        if (!this.k.d && e instanceof y0.m) {
            final IOException c2 = c.c;
            if (c2 instanceof t && ((t)c2).r == 404) {
                final b b3 = this.i[this.j.a(e.d)];
                final long h2 = b3.h();
                if (h2 != -1L && h2 != 0L && ((y0.m)e).g() > b3.f() + h2 - 1L) {
                    return this.n = true;
                }
            }
        }
        final b b4 = this.i[this.j.a(e.d)];
        final o0.b j = this.b.j(b4.b.c);
        if (j != null && !b4.c.equals(j)) {
            return true;
        }
        final m.a i = this.j(this.j, b4.b.c);
        if (!i.a(2) && !i.a(1)) {
            return false;
        }
        final m.b b5 = m.b(i, c);
        boolean b6 = b2;
        if (b5 != null) {
            if (!i.a(b5.a)) {
                return false;
            }
            final int a = b5.a;
            if (a == 2) {
                final y k = this.j;
                return k.p(k.a(e.d), b5.b);
            }
            b6 = b2;
            if (a == 1) {
                this.b.e(b4.c, b5.b);
                b6 = true;
            }
        }
        return b6;
    }
    
    @Override
    public int f(final long n, final List list) {
        if (this.m == null && this.j.length() >= 2) {
            return this.j.k(n, list);
        }
        return list.size();
    }
    
    @Override
    public void g(final e e) {
        if (e instanceof l) {
            final int a = this.j.a(((l)e).d);
            final b b = this.i[a];
            if (b.d == null) {
                final h d = ((f)g0.a.h(b.a)).d();
                if (d != null) {
                    this.i[a] = b.c(new n0.i(d, b.b.d));
                }
            }
        }
        final d.c h = this.h;
        if (h != null) {
            h.i(e);
        }
    }
    
    @Override
    public void h(final y0 y0, final long n, final List list, final y0.g g) {
        if (this.m != null) {
            return;
        }
        final long a = y0.a;
        final long n2 = n - a;
        final long j0 = M.J0(this.k.a);
        final long j2 = M.J0(this.k.d(this.l).b);
        final d.c h = this.h;
        if (h != null && h.h(j0 + j2 + n)) {
            return;
        }
        final long j3 = M.J0(M.d0(this.f));
        final long m = this.m(j3);
        y0.m i;
        if (list.isEmpty()) {
            i = null;
        }
        else {
            i = list.get(list.size() - 1);
        }
        final int length = this.j.length();
        final n[] array = new n[length];
        for (int k = 0; k < length; ++k) {
            final b b = this.i[k];
            if (b.d == null) {
                array[k] = n.a;
            }
            else {
                final long e = b.e(j3);
                final long g2 = b.g(j3);
                final int n3 = k;
                final n[] array2 = array;
                final long o = this.o(b, i, n, e, g2);
                if (o < e) {
                    array2[n3] = n.a;
                }
                else {
                    array2[n3] = new c(this.r(n3), o, g2, m);
                }
            }
        }
        this.j.v(a, n2, this.k(j3, a), list, array);
        final int o2 = this.j.o();
        this.o = SystemClock.elapsedRealtime();
        final b r = this.r(o2);
        final f a2 = r.a;
        if (a2 != null) {
            final j b2 = r.b;
            o0.i n4;
            if (a2.f() == null) {
                n4 = b2.n();
            }
            else {
                n4 = null;
            }
            o0.i l;
            if (r.d == null) {
                l = b2.m();
            }
            else {
                l = null;
            }
            if (n4 != null || l != null) {
                g.a = this.p(r, this.e, this.j.m(), this.j.n(), this.j.s(), n4, l, null);
                return;
            }
        }
        final long a3 = androidx.media3.exoplayer.dash.c.b.a(r);
        final c k2 = this.k;
        final boolean b3 = k2.d && this.l == k2.e() - 1;
        final long n5 = -9223372036854775807L;
        final boolean b4 = !b3 || a3 != -9223372036854775807L;
        if (r.h() == 0L) {
            g.b = b4;
            return;
        }
        final long e2 = r.e(j3);
        final long g3 = r.g(j3);
        boolean b5 = b4;
        if (b3) {
            final long i2 = r.i(g3);
            b5 = (b4 & i2 + (i2 - r.k(g3)) >= a3);
        }
        final long o3 = this.o(r, i, n, e2, g3);
        if (o3 < e2) {
            this.m = new x0.b();
            return;
        }
        final long n6 = lcmp(o3, g3);
        if (n6 > 0 || (this.n && n6 >= 0)) {
            g.b = b5;
            return;
        }
        if (b5 && r.k(o3) >= a3) {
            g.b = true;
            return;
        }
        int n8;
        int n7 = n8 = (int)Math.min(this.g, g3 - o3 + 1L);
        if (a3 != -9223372036854775807L) {
            while ((n8 = n7) > 1) {
                n8 = n7;
                if (r.k(n7 + o3 - 1L) < a3) {
                    break;
                }
                --n7;
            }
        }
        long n9 = n5;
        if (list.isEmpty()) {
            n9 = n;
        }
        g.a = this.q(r, this.e, this.d, this.j.m(), this.j.n(), this.j.s(), o3, n8, n9, m, null);
    }
    
    @Override
    public void i(final y j) {
        this.j = j;
    }
    
    public final m.a j(final y y, final List list) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final int length = y.length();
        int i = 0;
        int n = 0;
        while (i < length) {
            int n2 = n;
            if (y.i(i, elapsedRealtime)) {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        final int f = n0.b.f(list);
        return new m.a(f, f - this.b.g(list), length, n);
    }
    
    public final long k(final long n, final long n2) {
        if (this.k.d && this.i[0].h() != 0L) {
            return Math.max(0L, Math.min(this.m(n), this.i[0].i(this.i[0].g(n))) - n2);
        }
        return -9223372036854775807L;
    }
    
    public final Pair l(long n, final o0.i i, final b b) {
        ++n;
        if (n >= b.h()) {
            return null;
        }
        final o0.i l = b.l(n);
        final String a = G.a(i.b(b.c.a), l.b(b.c.a));
        final StringBuilder sb = new StringBuilder();
        sb.append(l.a);
        sb.append("-");
        String str = sb.toString();
        if (l.b != -1L) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(l.a + l.b);
            str = sb2.toString();
        }
        return new Pair((Object)a, (Object)str);
    }
    
    public final long m(final long n) {
        final c k = this.k;
        final long a = k.a;
        if (a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n - M.J0(a + k.d(this.l).b);
    }
    
    public final ArrayList n() {
        final List c = this.k.d(this.l).c;
        final ArrayList list = new ArrayList();
        final int[] c2 = this.c;
        for (int length = c2.length, i = 0; i < length; ++i) {
            list.addAll(c.get(c2[i]).c);
        }
        return list;
    }
    
    public final long o(final b b, final y0.m m, final long n, final long n2, final long n3) {
        if (m != null) {
            return m.g();
        }
        return M.q(b.j(n), n2, n3);
    }
    
    public e p(final b b, final g g, final q q, final int n, final Object o, o0.i i, o0.i a, final B0.g.a a2) {
        final j b2 = b.b;
        if (i != null) {
            a = i.a(a, b.c.a);
            if (a != null) {
                i = a;
            }
        }
        else {
            i = (o0.i)g0.a.e(a);
        }
        return new l(g, n0.h.a(b2, b.c.a, i, 0, w.j()), q, n, o, b.a);
    }
    
    public e q(final b b, final g g, int n, final q q, final int n2, final Object o, final long n3, final int n4, long i, long n5, final B0.g.a a) {
        final j b2 = b.b;
        final long k = b.k(n3);
        o0.i l = b.l(n3);
        final f a2 = b.a;
        int n6 = 8;
        if (a2 == null) {
            i = b.i(n3);
            if (b.m(n3, n5)) {
                n6 = 0;
            }
            return new y0.o(g, n0.h.a(b2, b.c.a, l, n6, w.j()), q, n2, o, k, i, n3, n, q);
        }
        int j = 1;
        n = 1;
        while (j < n4) {
            final o0.i a3 = l.a(b.l(j + n3), b.c.a);
            if (a3 == null) {
                break;
            }
            ++n;
            ++j;
            l = a3;
        }
        final long n7 = n + n3 - 1L;
        final long m = b.i(n7);
        long a4 = androidx.media3.exoplayer.dash.c.b.a(b);
        if (a4 == -9223372036854775807L || a4 > m) {
            a4 = -9223372036854775807L;
        }
        if (b.m(n7, n5)) {
            n6 = 0;
        }
        final k a5 = n0.h.a(b2, b.c.a, l, n6, w.j());
        final long n8 = n5 = -b2.d;
        if (z.p(q.n)) {
            n5 = n8 + k;
        }
        return new y0.j(g, a5, q, n2, o, k, m, i, a4, n3, n, n5, b.a);
    }
    
    public final b r(final int n) {
        final b b = this.i[n];
        final o0.b j = this.b.j(b.b.c);
        b d = b;
        if (j != null) {
            d = b;
            if (!j.equals(b.c)) {
                d = b.d(j);
                this.i[n] = d;
            }
        }
        return d;
    }
    
    @Override
    public void release() {
        final b[] i = this.i;
        for (int length = i.length, j = 0; j < length; ++j) {
            final f a = i[j].a;
            if (a != null) {
                a.release();
            }
        }
    }
    
    public static final class a implements androidx.media3.exoplayer.dash.a.a
    {
        public final g.a a;
        public final int b;
        public final f.a c;
        
        public a(final g.a a) {
            this(a, 1);
        }
        
        public a(final g.a a, final int n) {
            this(y0.d.x, a, n);
        }
        
        public a(final f.a c, final g.a a, final int b) {
            this.c = c;
            this.a = a;
            this.b = b;
        }
        
        @Override
        public q b(final q q) {
            return this.c.b(q);
        }
        
        @Override
        public androidx.media3.exoplayer.dash.a c(final o o, final c c, final n0.b b, final int n, final int[] array, final y y, final int n2, final long n3, final boolean b2, final List list, final d.c c2, final i0.y y2, final y1 y3, final B0.f f) {
            final g a = this.a.a();
            if (y2 != null) {
                a.c(y2);
            }
            return new c(this.c, o, c, b, n, array, y, n2, a, n3, this.b, b2, list, c2, y3, f);
        }
        
        public a d(final boolean b) {
            this.c.a(b);
            return this;
        }
    }
    
    public static final class b
    {
        public final f a;
        public final j b;
        public final o0.b c;
        public final n0.g d;
        public final long e;
        public final long f;
        
        public b(final long e, final j b, final o0.b c, final f a, final long f, final n0.g d) {
            this.e = e;
            this.b = b;
            this.c = c;
            this.f = f;
            this.a = a;
            this.d = d;
        }
        
        public static /* synthetic */ long a(final b b) {
            return b.e;
        }
        
        public b b(final long n, final j j) {
            final n0.g l = this.b.l();
            final n0.g i = j.l();
            if (l == null) {
                return new b(n, j, this.c, this.a, this.f, l);
            }
            if (!l.g()) {
                return new b(n, j, this.c, this.a, this.f, i);
            }
            final long k = l.i(n);
            if (k == 0L) {
                return new b(n, j, this.c, this.a, this.f, i);
            }
            g0.a.h(i);
            final long h = l.h();
            final long c = l.c(h);
            long a = k + h;
            final long n2 = a - 1L;
            final long c2 = l.c(n2);
            final long b = l.b(n2, n);
            final long h2 = i.h();
            final long c3 = i.c(h2);
            final long f = this.f;
            final long n3 = lcmp(c2 + b, c3);
            if (n3 != 0) {
                if (n3 < 0) {
                    throw new x0.b();
                }
                if (c3 < c) {
                    final long n4 = f - (i.a(c, n) - h);
                    return new b(n, j, this.c, this.a, n4, i);
                }
                a = l.a(c3, n);
            }
            final long n4 = f + (a - h2);
            return new b(n, j, this.c, this.a, n4, i);
        }
        
        public b c(final n0.g g) {
            return new b(this.e, this.b, this.c, this.a, this.f, g);
        }
        
        public b d(final o0.b b) {
            return new b(this.e, this.b, b, this.a, this.f, this.d);
        }
        
        public long e(final long n) {
            return ((n0.g)g0.a.h(this.d)).d(this.e, n) + this.f;
        }
        
        public long f() {
            return ((n0.g)g0.a.h(this.d)).h() + this.f;
        }
        
        public long g(final long n) {
            return this.e(n) + ((n0.g)g0.a.h(this.d)).j(this.e, n) - 1L;
        }
        
        public long h() {
            return ((n0.g)g0.a.h(this.d)).i(this.e);
        }
        
        public long i(final long n) {
            return this.k(n) + ((n0.g)g0.a.h(this.d)).b(n - this.f, this.e);
        }
        
        public long j(final long n) {
            return ((n0.g)g0.a.h(this.d)).a(n, this.e) + this.f;
        }
        
        public long k(final long n) {
            return ((n0.g)g0.a.h(this.d)).c(n - this.f);
        }
        
        public o0.i l(final long n) {
            return ((n0.g)g0.a.h(this.d)).f(n - this.f);
        }
        
        public boolean m(final long n, final long n2) {
            final boolean g = ((n0.g)g0.a.h(this.d)).g();
            boolean b = true;
            if (g) {
                return true;
            }
            if (n2 != -9223372036854775807L) {
                if (this.i(n) <= n2) {
                    return true;
                }
                b = false;
            }
            return b;
        }
    }
    
    public static final class c extends y0.b
    {
        public final androidx.media3.exoplayer.dash.c.b e;
        public final long f;
        
        public c(final androidx.media3.exoplayer.dash.c.b e, final long n, final long n2, final long f) {
            super(n, n2);
            this.e = e;
            this.f = f;
        }
        
        @Override
        public long a() {
            this.c();
            return this.e.i(this.d());
        }
        
        @Override
        public long b() {
            this.c();
            return this.e.k(this.d());
        }
    }
}
