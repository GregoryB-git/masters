// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A0;

import d0.I;
import x0.x;
import g0.M;
import y0.n;
import X2.B;
import d0.q;
import X2.D;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import g0.o;
import java.util.List;
import d0.J;
import y0.m;
import X2.v;
import B0.e;

public class a extends c
{
    public final e h;
    public final long i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final float n;
    public final float o;
    public final v p;
    public final g0.c q;
    public float r;
    public int s;
    public int t;
    public long u;
    public m v;
    public long w;
    
    public a(final J j, final int[] array, final int n, final e h, final long n2, final long n3, long n4, final int l, final int m, final float n5, final float o, final List list, final g0.c q) {
        super(j, array, n);
        if (n4 < n2) {
            g0.o.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            n4 = n2;
        }
        this.h = h;
        this.i = n2 * 1000L;
        this.j = n3 * 1000L;
        this.k = n4 * 1000L;
        this.l = l;
        this.m = m;
        this.n = n5;
        this.o = o;
        this.p = X2.v.U(list);
        this.q = q;
        this.r = 1.0f;
        this.t = 0;
        this.u = -9223372036854775807L;
        this.w = -2147483647L;
    }
    
    public static v B(final y.a[] array) {
        final ArrayList<v.a> list = new ArrayList<v.a>();
        final int n = 0;
        for (int i = 0; i < array.length; ++i) {
            final y.a a = array[i];
            v.a m;
            if (a != null && a.b.length > 1) {
                m = v.M();
                m.h(new a(0L, 0L));
            }
            else {
                m = null;
            }
            list.add(m);
        }
        final long[][] g = G(array);
        final int[] array2 = new int[g.length];
        final long[] array3 = new long[g.length];
        for (int j = 0; j < g.length; ++j) {
            final long[] array4 = g[j];
            long n2;
            if (array4.length == 0) {
                n2 = 0L;
            }
            else {
                n2 = array4[0];
            }
            array3[j] = n2;
        }
        y(list, array3);
        final v h = H(g);
        for (int k = 0; k < h.size(); ++k) {
            final int intValue = h.get(k);
            final int n3 = array2[intValue] + 1;
            array2[intValue] = n3;
            array3[intValue] = g[intValue][n3];
            y(list, array3);
        }
        for (int l = 0; l < array.length; ++l) {
            if (list.get(l) != null) {
                array3[l] *= 2L;
            }
        }
        y(list, array3);
        final v.a m2 = v.M();
        for (int n4 = n; n4 < list.size(); ++n4) {
            final v.a a2 = list.get(n4);
            v v;
            if (a2 == null) {
                v = X2.v.Y();
            }
            else {
                v = a2.k();
            }
            m2.h(v);
        }
        return m2.k();
    }
    
    public static long[][] G(final y.a[] array) {
        final long[][] array2 = new long[array.length][];
        for (int i = 0; i < array.length; ++i) {
            final y.a a = array[i];
            if (a == null) {
                array2[i] = new long[0];
            }
            else {
                array2[i] = new long[a.b.length];
                int n = 0;
                while (true) {
                    final int[] b = a.b;
                    if (n >= b.length) {
                        break;
                    }
                    final long n2 = a.a.a(b[n]).i;
                    final long[] array3 = array2[i];
                    long n3 = n2;
                    if (n2 == -1L) {
                        n3 = 0L;
                    }
                    array3[n] = n3;
                    ++n;
                }
                Arrays.sort(array2[i]);
            }
        }
        return array2;
    }
    
    public static v H(final long[][] array) {
        final D c = X2.J.a().a().c();
        for (int i = 0; i < array.length; ++i) {
            final long[] array2 = array[i];
            if (array2.length > 1) {
                final int length = array2.length;
                final double[] array3 = new double[length];
                int n = 0;
                while (true) {
                    final long[] array4 = array[i];
                    final int length2 = array4.length;
                    double log = 0.0;
                    if (n >= length2) {
                        break;
                    }
                    final long n2 = array4[n];
                    if (n2 != -1L) {
                        log = Math.log((double)n2);
                    }
                    array3[n] = log;
                    ++n;
                }
                final int n3 = length - 1;
                final double n4 = array3[n3] - array3[0];
                int j = 0;
                while (j < n3) {
                    final double n5 = array3[j];
                    ++j;
                    final double n6 = array3[j];
                    double d;
                    if (n4 == 0.0) {
                        d = 1.0;
                    }
                    else {
                        d = ((n5 + n6) * 0.5 - array3[0]) / n4;
                    }
                    c.put(d, i);
                }
            }
        }
        return v.U(c.values());
    }
    
    public static void y(final List list, final long[] array) {
        long n = 0L;
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= array.length) {
                break;
            }
            n += array[n3];
            ++n3;
        }
        while (i < list.size()) {
            final v.a a = list.get(i);
            if (a != null) {
                a.h(new a(n, array[i]));
            }
            ++i;
        }
    }
    
    public final int A(final long n, long c) {
        c = this.C(c);
        int i = 0;
        int n2 = 0;
        while (i < super.b) {
            if (n == Long.MIN_VALUE || !this.i(i, n)) {
                final q b = this.b(i);
                if (this.z(b, b.i, c)) {
                    return i;
                }
                n2 = i;
            }
            ++i;
        }
        return n2;
    }
    
    public final long C(long n) {
        n = this.I(n);
        if (this.p.isEmpty()) {
            return n;
        }
        int n2;
        for (n2 = 1; n2 < this.p.size() - 1 && ((a)this.p.get(n2)).a < n; ++n2) {}
        final a a = this.p.get(n2 - 1);
        final a a2 = this.p.get(n2);
        final long a3 = a.a;
        final float n3 = (n - a3) / (float)(a2.a - a3);
        n = a.b;
        return n + (long)(n3 * (a2.b - n));
    }
    
    public final long D(final List list) {
        final boolean empty = list.isEmpty();
        final long n = -9223372036854775807L;
        if (empty) {
            return -9223372036854775807L;
        }
        final m m = (m)X2.B.d(list);
        final long g = m.g;
        long n2 = n;
        if (g != -9223372036854775807L) {
            final long h = m.h;
            n2 = n;
            if (h != -9223372036854775807L) {
                n2 = h - g;
            }
        }
        return n2;
    }
    
    public long E() {
        return this.k;
    }
    
    public final long F(final n[] array, final List list) {
        final int s = this.s;
        if (s < array.length && array[s].next()) {
            final n n = array[this.s];
            return n.a() - n.b();
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            final n n2 = array[i];
            if (n2.next()) {
                return n2.a() - n2.b();
            }
        }
        return this.D(list);
    }
    
    public final long I(final long n) {
        final long d = this.h.d();
        this.w = d;
        final long n2 = (long)(d * this.n);
        final long b = this.h.b();
        if (b != -9223372036854775807L && n != -9223372036854775807L) {
            final float n3 = (float)n;
            return (long)(n2 * Math.max(n3 / this.r - b, 0.0f) / n3);
        }
        return (long)(n2 / this.r);
    }
    
    public final long J(final long n, final long n2) {
        if (n == -9223372036854775807L) {
            return this.i;
        }
        long n3 = n;
        if (n2 != -9223372036854775807L) {
            n3 = n - n2;
        }
        return Math.min((long)(n3 * this.o), this.i);
    }
    
    public boolean K(final long n, final List list) {
        final long u = this.u;
        return u == -9223372036854775807L || n - u >= 1000L || (!list.isEmpty() && !((m)X2.B.d(list)).equals(this.v));
    }
    
    @Override
    public void g() {
        this.v = null;
    }
    
    @Override
    public void j() {
        this.u = -9223372036854775807L;
        this.v = null;
    }
    
    @Override
    public int k(final long n, final List list) {
        final long b = this.q.b();
        if (!this.K(b, list)) {
            return list.size();
        }
        this.u = b;
        m v;
        if (list.isEmpty()) {
            v = null;
        }
        else {
            v = (m)X2.B.d(list);
        }
        this.v = v;
        final boolean empty = list.isEmpty();
        int i = 0;
        if (empty) {
            return 0;
        }
        final int size = list.size();
        final long h0 = M.h0(list.get(size - 1).g - n, this.r);
        final long e = this.E();
        if (h0 < e) {
            return size;
        }
        final q b2 = this.b(this.A(b, this.D(list)));
        while (i < size) {
            final m m = list.get(i);
            final q d = m.d;
            if (M.h0(m.g - n, this.r) >= e && d.i < b2.i) {
                final int u = d.u;
                if (u != -1 && u <= this.m) {
                    final int t = d.t;
                    if (t != -1 && t <= this.l && u < b2.u) {
                        return i;
                    }
                }
            }
            ++i;
        }
        return size;
    }
    
    @Override
    public int n() {
        return this.t;
    }
    
    @Override
    public int o() {
        return this.s;
    }
    
    @Override
    public void r(final float r) {
        this.r = r;
    }
    
    @Override
    public Object s() {
        return null;
    }
    
    @Override
    public void v(long n, final long n2, final long n3, final List list, final n[] array) {
        n = this.q.b();
        final long f = this.F(array, list);
        int t = this.t;
        if (t == 0) {
            this.t = 1;
            this.s = this.A(n, f);
            return;
        }
        int s = this.s;
        int a;
        if (list.isEmpty()) {
            a = -1;
        }
        else {
            a = this.a(((m)X2.B.d(list)).d);
        }
        if (a != -1) {
            t = ((m)X2.B.d(list)).e;
            s = a;
        }
        final int a2 = this.A(n, f);
        int s2 = 0;
        Label_0227: {
            if ((s2 = a2) != s) {
                s2 = a2;
                if (!this.i(s, n)) {
                    final q b = this.b(s);
                    final q b2 = this.b(a2);
                    n = this.J(n3, f);
                    final int i = b2.i;
                    final int j = b.i;
                    if (i <= j || n2 >= n) {
                        s2 = a2;
                        if (i >= j) {
                            break Label_0227;
                        }
                        s2 = a2;
                        if (n2 < this.j) {
                            break Label_0227;
                        }
                    }
                    s2 = s;
                }
            }
        }
        if (s2 != s) {
            t = 3;
        }
        this.t = t;
        this.s = s2;
    }
    
    public boolean z(final q q, final int n, final long n2) {
        return n <= n2;
    }
    
    public static final class a
    {
        public final long a;
        public final long b;
        
        public a(final long a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.b == a.b;
        }
        
        @Override
        public int hashCode() {
            return (int)this.a * 31 + (int)this.b;
        }
    }
    
    public static class b implements y.b
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final float f;
        public final float g;
        public final g0.c h;
        
        public b() {
            this(10000, 25000, 25000, 0.7f);
        }
        
        public b(final int n, final int n2, final int n3, final float n4) {
            this(n, n2, n3, 1279, 719, n4, 0.75f, g0.c.a);
        }
        
        public b(final int a, final int b, final int c, final int d, final int e, final float f, final float g, final g0.c h) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        @Override
        public final y[] a(final y.a[] array, final e e, final x.b b, final I i) {
            final v x = B(array);
            final y[] array2 = new y[array.length];
            for (int j = 0; j < array.length; ++j) {
                final y.a a = array[j];
                if (a != null) {
                    final int[] b2 = a.b;
                    if (b2.length != 0) {
                        c b3;
                        if (b2.length == 1) {
                            b3 = new z(a.a, b2[0], a.c);
                        }
                        else {
                            b3 = this.b(a.a, b2, a.c, e, x.get(j));
                        }
                        array2[j] = b3;
                    }
                }
            }
            return array2;
        }
        
        public a b(final J j, final int[] array, final int n, final e e, final v v) {
            return new a(j, array, n, e, this.a, this.b, this.c, this.d, this.e, this.f, this.g, v, this.h);
        }
    }
}
