// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import A0.c;
import java.util.Arrays;
import android.os.SystemClock;
import x0.b;
import X2.B;
import k0.y0;
import k0.d1;
import android.util.Pair;
import g0.a;
import y0.n;
import java.util.Collections;
import g0.G;
import java.util.Collection;
import java.util.ArrayList;
import g0.M;
import A0.y;
import java.io.IOException;
import l0.y1;
import java.util.List;
import d0.J;
import r0.k;
import d0.q;
import android.net.Uri;
import i0.g;

public class f
{
    public final h a;
    public final g b;
    public final g c;
    public final v d;
    public final Uri[] e;
    public final q[] f;
    public final k g;
    public final J h;
    public final List i;
    public final q0.e j;
    public final y1 k;
    public final long l;
    public boolean m;
    public byte[] n;
    public IOException o;
    public Uri p;
    public boolean q;
    public y r;
    public long s;
    public boolean t;
    public long u;
    
    public f(final h a, final k g, final Uri[] e, final q[] f, final q0.g g2, final i0.y y, final v d, final long l, final List i, final y1 k, final B0.f f2) {
        this.a = a;
        this.g = g;
        this.e = e;
        this.f = f;
        this.d = d;
        this.l = l;
        this.i = i;
        this.k = k;
        this.u = -9223372036854775807L;
        this.j = new q0.e(4);
        this.n = M.f;
        this.s = -9223372036854775807L;
        final g a2 = g2.a(1);
        this.b = a2;
        if (y != null) {
            a2.c(y);
        }
        this.c = g2.a(3);
        this.h = new J(f);
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = 0; j < e.length; ++j) {
            if ((f[j].f & 0x4000) == 0x0) {
                list.add(j);
            }
        }
        this.r = new d(this.h, a3.f.n(list));
    }
    
    public static Uri e(final r0.f f, final r0.f.e e) {
        if (e != null) {
            final String u = e.u;
            if (u != null) {
                return G.f(f.a, u);
            }
        }
        return null;
    }
    
    public static e h(final r0.f f, final long n, int n2) {
        final int n3 = (int)(n - f.k);
        final int size = f.r.size();
        e e = null;
        if (n3 == size) {
            if (n2 == -1) {
                n2 = 0;
            }
            if (n2 < f.s.size()) {
                e = new e(f.s.get(n2), n, n2);
            }
            return e;
        }
        final r0.f.d d = f.r.get(n3);
        if (n2 == -1) {
            return new e(d, n, -1);
        }
        if (n2 < d.A.size()) {
            return new e((r0.f.e)d.A.get(n2), n, n2);
        }
        n2 = n3 + 1;
        if (n2 < f.r.size()) {
            return new e(f.r.get(n2), n + 1L, -1);
        }
        if (!f.s.isEmpty()) {
            return new e(f.s.get(0), n + 1L, 0);
        }
        return null;
    }
    
    public static List j(final r0.f f, final long n, final int n2) {
        final int n3 = (int)(n - f.k);
        if (n3 >= 0 && f.r.size() >= n3) {
            final ArrayList<Object> list = new ArrayList<Object>();
            final int size = f.r.size();
            final int n4 = 0;
            int n5 = n2;
            if (n3 < size) {
                int n6 = n3;
                if (n2 != -1) {
                    final r0.f.d d = f.r.get(n3);
                    if (n2 == 0) {
                        list.add(d);
                    }
                    else if (n2 < d.A.size()) {
                        final List a = d.A;
                        list.addAll(a.subList(n2, a.size()));
                    }
                    n6 = n3 + 1;
                }
                final List r = f.r;
                list.addAll(r.subList(n6, r.size()));
                n5 = 0;
            }
            if (f.n != -9223372036854775807L) {
                if (n5 == -1) {
                    n5 = n4;
                }
                if (n5 < f.s.size()) {
                    final List s = f.s;
                    list.addAll(s.subList(n5, s.size()));
                }
            }
            return Collections.unmodifiableList((List<?>)list);
        }
        return X2.v.Y();
    }
    
    public n[] a(final j j, final long n) {
        int b;
        if (j == null) {
            b = -1;
        }
        else {
            b = this.h.b(j.d);
        }
        final int length = this.r.length();
        final n[] array = new n[length];
        for (int i = 0; i < length; ++i) {
            final int c = this.r.c(i);
            final Uri uri = this.e[c];
            if (!this.g.d(uri)) {
                array[i] = n.a;
            }
            else {
                final r0.f k = this.g.k(uri, false);
                g0.a.e(k);
                final long n2 = k.h - this.g.m();
                final Pair g = this.g(j, c != b, k, n2, n);
                array[i] = new c(k.a, n2, j(k, (long)g.first, (int)g.second));
            }
        }
        return array;
    }
    
    public final void b() {
        this.g.g(this.e[this.r.l()]);
    }
    
    public long c(long s, final d1 d1) {
        final int o = this.r.o();
        final Uri[] e = this.e;
        r0.f k;
        if (o < e.length && o != -1) {
            k = this.g.k(e[this.r.l()], true);
        }
        else {
            k = null;
        }
        long n = s;
        if (k != null) {
            n = s;
            if (!k.r.isEmpty()) {
                if (!k.c) {
                    return s;
                }
                final long n2 = k.h - this.g.m();
                final long l = s - n2;
                final int f = M.f(k.r, l, true, true);
                final long s2 = k.r.get(f).s;
                if (f != k.r.size() - 1) {
                    s = ((r0.f.d)k.r.get(f + 1)).s;
                }
                else {
                    s = s2;
                }
                n = d1.a(l, s2, s) + n2;
            }
        }
        return n;
    }
    
    public int d(final j j) {
        if (j.o == -1) {
            return 1;
        }
        final r0.f f = (r0.f)g0.a.e(this.g.k(this.e[this.h.b(j.d)], false));
        final int n = (int)(j.j - f.k);
        if (n < 0) {
            return 1;
        }
        List list;
        if (n < f.r.size()) {
            list = f.r.get(n).A;
        }
        else {
            list = f.s;
        }
        if (j.o >= list.size()) {
            return 2;
        }
        final r0.f.b b = list.get(j.o);
        if (b.A) {
            return 0;
        }
        if (M.c(Uri.parse(G.e(f.a, b.o)), j.b.a)) {
            return 1;
        }
        return 2;
    }
    
    public void f(final y0 y0, long longValue, final List list, final boolean b, final b b2) {
        j j;
        if (list.isEmpty()) {
            j = null;
        }
        else {
            j = (j)B.d(list);
        }
        int b3;
        if (j == null) {
            b3 = -1;
        }
        else {
            b3 = this.h.b(j.d);
        }
        final long a = y0.a;
        final long n = longValue - a;
        final long u = this.u(a);
        long max = n;
        long max2 = u;
        if (j != null) {
            max = n;
            max2 = u;
            if (!this.q) {
                final long d = j.d();
                max = Math.max(0L, n - d);
                max2 = u;
                if (u != -9223372036854775807L) {
                    max2 = Math.max(0L, u - d);
                    max = max;
                }
            }
        }
        this.r.v(a, max, max2, list, this.a(j, longValue));
        int l = this.r.l();
        final boolean b4 = b3 != l;
        Uri uri = this.e[l];
        if (!this.g.d(uri)) {
            b2.c = uri;
            this.t &= uri.equals((Object)this.p);
            this.p = uri;
            return;
        }
        r0.f f = this.g.k(uri, true);
        g0.a.e(f);
        this.q = f.c;
        this.y(f);
        long n2 = f.h - this.g.m();
        final Pair g = this.g(j, b4, f, n2, longValue);
        final long longValue2 = (long)g.first;
        int n3 = (int)g.second;
        if (longValue2 < f.k && j != null && b4) {
            uri = this.e[b3];
            f = this.g.k(uri, true);
            g0.a.e(f);
            n2 = f.h - this.g.m();
            final Pair g2 = this.g(j, false, f, n2, longValue);
            longValue = (long)g2.first;
            n3 = (int)g2.second;
            l = b3;
        }
        else {
            longValue = longValue2;
        }
        if (l != b3 && b3 != -1) {
            this.g.g(this.e[b3]);
        }
        if (longValue < f.k) {
            this.o = new x0.b();
            return;
        }
        e h;
        if ((h = h(f, longValue, n3)) == null) {
            if (!f.o) {
                b2.c = uri;
                this.t &= uri.equals((Object)this.p);
                this.p = uri;
                return;
            }
            if (b || f.r.isEmpty()) {
                b2.b = true;
                return;
            }
            h = new e((r0.f.e)B.d(f.r), f.k + f.r.size() - 1L, -1);
        }
        this.t = false;
        this.p = null;
        this.u = SystemClock.elapsedRealtime();
        final Uri e = e(f, h.a.p);
        if ((b2.a = this.n(e, l, true, null)) != null) {
            return;
        }
        final Uri e2 = e(f, h.a);
        if ((b2.a = this.n(e2, l, false, null)) != null) {
            return;
        }
        final boolean w = q0.j.w(j, uri, f, h, n2);
        if (w && h.d) {
            return;
        }
        b2.a = q0.j.j(this.a, this.b, this.f[l], n2, f, h, uri, this.i, this.r.n(), this.r.s(), this.m, this.d, this.l, j, this.j.a(e2), this.j.a(e), w, this.k, null);
    }
    
    public final Pair g(final j j, final boolean b, final r0.f f, long n, long n2) {
        int i = -1;
        if (j != null && !b) {
            if (j.h()) {
                if (j.o == -1) {
                    n = j.g();
                }
                else {
                    n = j.j;
                }
                final int o = j.o;
                if (o != -1) {
                    i = o + 1;
                }
                return new Pair((Object)n, (Object)i);
            }
            return new Pair((Object)j.j, (Object)j.o);
        }
        else {
            final long u = f.u;
            long g = n2;
            if (j != null) {
                if (this.q) {
                    g = n2;
                }
                else {
                    g = j.g;
                }
            }
            if (!f.o && g >= u + n) {
                return new Pair((Object)(f.k + f.r.size()), (Object)(-1));
            }
            final long l = g - n;
            final List r = f.r;
            final boolean a = this.g.a();
            int n3 = 0;
            final int f2 = M.f(r, l, true, !a || j == null);
            n2 = f2 + f.k;
            int k = i;
            n = n2;
            if (f2 >= 0) {
                final r0.f.d d = f.r.get(f2);
                List list;
                if (l < d.s + d.q) {
                    list = d.A;
                }
                else {
                    list = f.s;
                }
                while (true) {
                    k = i;
                    n = n2;
                    if (n3 >= list.size()) {
                        break;
                    }
                    final r0.f.b b2 = list.get(n3);
                    if (l < b2.s + b2.q) {
                        k = i;
                        n = n2;
                        if (b2.z) {
                            if (list == f.s) {
                                n = 1L;
                            }
                            else {
                                n = 0L;
                            }
                            n += n2;
                            k = n3;
                            break;
                        }
                        break;
                    }
                    else {
                        ++n3;
                    }
                }
            }
            return new Pair((Object)n, (Object)k);
        }
    }
    
    public int i(final long n, final List list) {
        if (this.o == null && this.r.length() >= 2) {
            return this.r.k(n, list);
        }
        return list.size();
    }
    
    public J k() {
        return this.h;
    }
    
    public y l() {
        return this.r;
    }
    
    public boolean m() {
        return this.q;
    }
    
    public final y0.e n(final Uri uri, final int n, final boolean b, final B0.g.a a) {
        if (uri == null) {
            return null;
        }
        final byte[] c = this.j.c(uri);
        if (c != null) {
            this.j.b(uri, c);
            return null;
        }
        return new a(this.c, new i0.k.b().i(uri).b(1).a(), this.f[n], this.r.n(), this.r.s(), this.n);
    }
    
    public boolean o(final y0.e e, final long n) {
        final y r = this.r;
        return r.p(r.e(this.h.b(e.d)), n);
    }
    
    public void p() {
        final IOException o = this.o;
        if (o == null) {
            final Uri p = this.p;
            if (p != null && this.t) {
                this.g.h(p);
            }
            return;
        }
        throw o;
    }
    
    public boolean q(final Uri uri) {
        return M.s(this.e, uri);
    }
    
    public void r(final y0.e e) {
        if (e instanceof a) {
            final a a = (a)e;
            this.n = a.h();
            this.j.b(a.b.a, (byte[])g0.a.e(a.j()));
        }
    }
    
    public boolean s(final Uri uri, final long n) {
        final boolean b = false;
        int n2 = 0;
        while (true) {
            final Uri[] e = this.e;
            if (n2 >= e.length) {
                n2 = -1;
                break;
            }
            if (e[n2].equals((Object)uri)) {
                break;
            }
            ++n2;
        }
        if (n2 == -1) {
            return true;
        }
        final int e2 = this.r.e(n2);
        if (e2 == -1) {
            return true;
        }
        this.t |= uri.equals((Object)this.p);
        if (n != -9223372036854775807L) {
            boolean b2 = b;
            if (!this.r.p(e2, n)) {
                return b2;
            }
            b2 = b;
            if (!this.g.c(uri, n)) {
                return b2;
            }
        }
        return true;
    }
    
    public void t() {
        this.b();
        this.o = null;
    }
    
    public final long u(final long n) {
        final long s = this.s;
        long n2 = -9223372036854775807L;
        if (s != -9223372036854775807L) {
            n2 = s - n;
        }
        return n2;
    }
    
    public void v(final boolean m) {
        this.m = m;
    }
    
    public void w(final y r) {
        this.b();
        this.r = r;
    }
    
    public boolean x(final long n, final y0.e e, final List list) {
        return this.o == null && this.r.q(n, e, list);
    }
    
    public final void y(final r0.f f) {
        long s;
        if (f.o) {
            s = -9223372036854775807L;
        }
        else {
            s = f.e() - this.g.m();
        }
        this.s = s;
    }
    
    public static final class a extends k
    {
        public byte[] l;
        
        public a(final i0.g g, final i0.k k, final q q, final int n, final Object o, final byte[] array) {
            super(g, k, 3, q, n, o, array);
        }
        
        @Override
        public void g(final byte[] original, final int newLength) {
            this.l = Arrays.copyOf(original, newLength);
        }
        
        public byte[] j() {
            return this.l;
        }
    }
    
    public static final class b
    {
        public y0.e a;
        public boolean b;
        public Uri c;
        
        public b() {
            this.a();
        }
        
        public void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }
    
    public static final class c extends y0.b
    {
        public final List e;
        public final long f;
        public final String g;
        
        public c(final String g, final long f, final List e) {
            super(0L, e.size() - 1);
            this.g = g;
            this.f = f;
            this.e = e;
        }
        
        @Override
        public long a() {
            this.c();
            final r0.f.e e = this.e.get((int)this.d());
            return this.f + e.s + e.q;
        }
        
        @Override
        public long b() {
            this.c();
            return this.f + this.e.get((int)this.d()).s;
        }
    }
    
    public static final class d extends c
    {
        public int h;
        
        public d(final J j, final int[] array) {
            super(j, array);
            this.h = this.a(j.a(array[0]));
        }
        
        @Override
        public int n() {
            return 0;
        }
        
        @Override
        public int o() {
            return this.h;
        }
        
        @Override
        public Object s() {
            return null;
        }
        
        @Override
        public void v(long elapsedRealtime, final long n, final long n2, final List list, final n[] array) {
            elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.i(this.h, elapsedRealtime)) {
                return;
            }
            for (int i = super.b - 1; i >= 0; --i) {
                if (!this.i(i, elapsedRealtime)) {
                    this.h = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
    
    public static final class e
    {
        public final r0.f.e a;
        public final long b;
        public final int c;
        public final boolean d;
        
        public e(final r0.f.e a, final long b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = (a instanceof r0.f.b && ((r0.f.b)a).A);
        }
    }
}
