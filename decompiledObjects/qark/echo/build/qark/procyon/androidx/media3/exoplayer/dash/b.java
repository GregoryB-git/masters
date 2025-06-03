// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media3.exoplayer.dash;

import F0.T;
import y0.i;
import k0.y0;
import k0.d1;
import java.util.Iterator;
import x0.Q;
import d0.J;
import java.util.regex.Matcher;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collection;
import g0.M;
import android.util.SparseArray;
import java.util.ArrayList;
import X2.G;
import o0.e;
import d0.q;
import android.util.Pair;
import o0.g;
import B0.f;
import x0.Z;
import B0.o;
import B0.m;
import p0.x;
import i0.y;
import java.util.List;
import o0.c;
import n0.j;
import l0.y1;
import x0.E;
import java.util.IdentityHashMap;
import java.util.regex.Pattern;
import y0.h;
import x0.S;
import x0.v;

public final class b implements v, S.a, h.b
{
    public static final Pattern M;
    public static final Pattern N;
    public final androidx.media3.exoplayer.dash.d A;
    public final IdentityHashMap B;
    public final E.a C;
    public final p0.v.a D;
    public final y1 E;
    public v.a F;
    public h[] G;
    public j[] H;
    public S I;
    public o0.c J;
    public int K;
    public List L;
    public final int o;
    public final androidx.media3.exoplayer.dash.a.a p;
    public final y q;
    public final x r;
    public final m s;
    public final n0.b t;
    public final long u;
    public final o v;
    public final B0.b w;
    public final Z x;
    public final a[] y;
    public final x0.j z;
    
    static {
        M = Pattern.compile("CC([1-4])=(.+)");
        N = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    }
    
    public b(final int o, final o0.c j, final n0.b t, final int k, final androidx.media3.exoplayer.dash.a.a p17, final y q, final B0.f f, final x r, final p0.v.a d, final m s, final E.a c, final long u, final o v, final B0.b w, final x0.j z, final androidx.media3.exoplayer.dash.d.b b, final y1 e) {
        this.o = o;
        this.J = j;
        this.t = t;
        this.K = k;
        this.p = p17;
        this.q = q;
        this.r = r;
        this.D = d;
        this.s = s;
        this.C = c;
        this.u = u;
        this.v = v;
        this.w = w;
        this.z = z;
        this.E = e;
        this.A = new androidx.media3.exoplayer.dash.d(j, b, w);
        this.G = I(0);
        this.H = new j[0];
        this.B = new IdentityHashMap();
        this.I = z.a();
        final o0.g d2 = j.d(k);
        final List d3 = d2.d;
        this.L = d3;
        final Pair w2 = w(r, p17, d2.c, d3);
        this.x = (Z)w2.first;
        this.y = (a[])w2.second;
    }
    
    public static q[] A(final List list, final int[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            final int n = array[i];
            final o0.a a = list.get(n);
            final List d = list.get(n).d;
            int j = 0;
            while (j < d.size()) {
                final o0.e e = d.get(j);
                q q;
                Pattern pattern;
                if ("urn:scte:dash:cc:cea-608:2015".equals(e.a)) {
                    final q.b o0 = new q.b().o0("application/cea-608");
                    final StringBuilder sb = new StringBuilder();
                    sb.append(a.a);
                    sb.append(":cea608");
                    q = o0.a0(sb.toString()).K();
                    pattern = b.M;
                }
                else {
                    if (!"urn:scte:dash:cc:cea-708:2015".equals(e.a)) {
                        ++j;
                        continue;
                    }
                    final q.b o2 = new q.b().o0("application/cea-708");
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(a.a);
                    sb2.append(":cea708");
                    q = o2.a0(sb2.toString()).K();
                    pattern = b.N;
                }
                return K(e, pattern, q);
            }
        }
        return new q[0];
    }
    
    public static int[][] B(final List list) {
        final int size = list.size();
        final HashMap f = G.f(size);
        final ArrayList list2 = new ArrayList<Object>(size);
        final SparseArray sparseArray = new SparseArray(size);
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            f.put(list.get(i).a, i);
            final ArrayList<Integer> list3 = new ArrayList<Integer>();
            list3.add(i);
            list2.add(list3);
            sparseArray.put(i, (Object)list3);
        }
        for (int j = 0; j < size; ++j) {
            final o0.a a = list.get(j);
            o0.e e;
            if ((e = z(a.e)) == null) {
                e = z(a.f);
            }
            int intValue = 0;
            Label_0211: {
                if (e != null) {
                    final Integer n2 = f.get(Long.parseLong(e.b));
                    if (n2 != null) {
                        intValue = n2;
                        break Label_0211;
                    }
                }
                intValue = j;
            }
            int n3 = intValue;
            if (intValue == j) {
                final o0.e x = x(a.f);
                n3 = intValue;
                if (x != null) {
                    final String[] b1 = g0.M.b1(x.b, ",");
                    final int length = b1.length;
                    int n4 = 0;
                    while (true) {
                        n3 = intValue;
                        if (n4 >= length) {
                            break;
                        }
                        final Integer n5 = f.get(Long.parseLong(b1[n4]));
                        int min = intValue;
                        if (n5 != null) {
                            min = Math.min(intValue, n5);
                        }
                        ++n4;
                        intValue = min;
                    }
                }
            }
            if (n3 != j) {
                final List list4 = (List)sparseArray.get(j);
                final List list5 = (List)sparseArray.get(n3);
                list5.addAll(list4);
                sparseArray.put(j, (Object)list5);
                list2.remove(list4);
            }
        }
        final int size2 = list2.size();
        final int[][] array = new int[size2][];
        for (int k = n; k < size2; ++k) {
            Arrays.sort(array[k] = a3.f.n((Collection)list2.get(k)));
        }
        return array;
    }
    
    public static boolean E(final List list, final int[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            final List c = list.get(array[i]).c;
            for (int j = 0; j < c.size(); ++j) {
                if (!c.get(j).e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static int F(final int n, final List list, final int[][] array, final boolean[] array2, final q[][] array3) {
        int i = 0;
        int n2 = 0;
        while (i < n) {
            int n3 = n2;
            if (E(list, array[i])) {
                array2[i] = true;
                n3 = n2 + 1;
            }
            final q[] a = A(list, array[i]);
            array3[i] = a;
            n2 = n3;
            if (a.length != 0) {
                n2 = n3 + 1;
            }
            ++i;
        }
        return n2;
    }
    
    public static void H(final androidx.media3.exoplayer.dash.a.a a, final q[] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = a.b(array[i]);
        }
    }
    
    public static h[] I(final int n) {
        return new h[n];
    }
    
    public static q[] K(final o0.e e, final Pattern pattern, final q q) {
        final String b = e.b;
        if (b == null) {
            return new q[] { q };
        }
        final String[] b2 = g0.M.b1(b, ";");
        final q[] array = new q[b2.length];
        for (int i = 0; i < b2.length; ++i) {
            final Matcher matcher = pattern.matcher(b2[i]);
            if (!matcher.matches()) {
                return new q[] { q };
            }
            final int int1 = Integer.parseInt(matcher.group(1));
            final q.b a = q.a();
            final StringBuilder sb = new StringBuilder();
            sb.append(q.a);
            sb.append(":");
            sb.append(int1);
            array[i] = a.a0(sb.toString()).L(int1).e0(matcher.group(2)).K();
        }
        return array;
    }
    
    public static void r(final List list, final J[] array, final a[] array2, int n) {
        for (int i = 0; i < list.size(); ++i, ++n) {
            final o0.f f = list.get(i);
            final q k = new q.b().a0(f.a()).o0("application/x-emsg").K();
            final StringBuilder sb = new StringBuilder();
            sb.append(f.a());
            sb.append(":");
            sb.append(i);
            array[n] = new J(sb.toString(), new q[] { k });
            array2[n] = a.c(i);
        }
    }
    
    public static int t(final x x, final androidx.media3.exoplayer.dash.a.a a, final List list, final int[][] array, final int n, final boolean[] array2, final q[][] array3, final J[] array4, final a[] array5) {
        int n2 = 0;
        int n3;
        int n5;
        for (int i = n3 = 0; i < n; ++i, n3 = n5, n2 = 0) {
            final int[] array6 = array[i];
            final ArrayList<o0.j> list2 = new ArrayList<o0.j>();
            for (int length = array6.length, j = n2; j < length; ++j) {
                list2.addAll((Collection<?>)list.get(array6[j]).c);
            }
            final int size = list2.size();
            final q[] array7 = new q[size];
            for (int k = n2; k < size; ++k) {
                final q b = list2.get(k).b;
                array7[k] = b.a().R(x.b(b)).K();
            }
            final o0.a a2 = list.get(array6[n2]);
            final long a3 = a2.a;
            String s;
            if (a3 != -1L) {
                s = Long.toString(a3);
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append("unset:");
                sb.append(i);
                s = sb.toString();
            }
            int n4 = n3 + 1;
            if (array2[i]) {
                n5 = n3 + 2;
            }
            else {
                n5 = n4;
                n4 = -1;
            }
            int n7;
            if (array3[i].length != 0) {
                final int n6 = n5 + 1;
                n7 = n5;
                n5 = n6;
            }
            else {
                n7 = -1;
            }
            H(a, array7);
            array4[n3] = new J(s, array7);
            array5[n3] = b.a.d(a2.b, array6, n3, n4, n7);
            if (n4 != -1) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s);
                sb2.append(":emsg");
                final String string = sb2.toString();
                array4[n4] = new J(string, new q[] { new q.b().a0(string).o0("application/x-emsg").K() });
                array5[n4] = b.a.b(array6, n3);
            }
            if (n7 != -1) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(s);
                sb3.append(":cc");
                final String string2 = sb3.toString();
                array5[n7] = b.a.a(array6, n3, X2.v.V(array3[i]));
                H(a, array3[i]);
                array4[n7] = new J(string2, array3[i]);
            }
        }
        return n3;
    }
    
    public static Pair w(final x x, final androidx.media3.exoplayer.dash.a.a a, final List list, final List list2) {
        final int[][] b = B(list);
        final int length = b.length;
        final boolean[] array = new boolean[length];
        final q[][] array2 = new q[length][];
        final int n = F(length, list, b, array, array2) + length + list2.size();
        final J[] array3 = new J[n];
        final a[] array4 = new a[n];
        r(list2, array3, array4, t(x, a, list, b, length, array, array2, array3, array4));
        return Pair.create((Object)new Z(array3), (Object)array4);
    }
    
    public static o0.e x(final List list) {
        return y(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }
    
    public static o0.e y(final List list, final String s) {
        for (int i = 0; i < list.size(); ++i) {
            final o0.e e = list.get(i);
            if (s.equals(e.a)) {
                return e;
            }
        }
        return null;
    }
    
    public static o0.e z(final List list) {
        return y(list, "http://dashif.org/guidelines/trickmode");
    }
    
    public final int C(int i, final int[] array) {
        i = array[i];
        if (i == -1) {
            return -1;
        }
        final int e = this.y[i].e;
        int n;
        for (i = 0; i < array.length; ++i) {
            n = array[i];
            if (n == e && this.y[n].c == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public final int[] D(final A0.y[] array) {
        final int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            final A0.y y = array[i];
            if (y != null) {
                array2[i] = this.x.d(y.d());
            }
            else {
                array2[i] = -1;
            }
        }
        return array2;
    }
    
    public void J(final h h) {
        ((S.a)this.F).e(this);
    }
    
    public void L() {
        this.A.o();
        final h[] g = this.G;
        for (int length = g.length, i = 0; i < length; ++i) {
            g[i].P((h.b)this);
        }
        this.F = null;
    }
    
    public final void M(final A0.y[] array, final boolean[] array2, final Q[] array3) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == null || !array2[i]) {
                final Q q = array3[i];
                if (q instanceof h) {
                    ((h)q).P((h.b)this);
                }
                else if (q instanceof h.a) {
                    ((h.a)q).c();
                }
                array3[i] = null;
            }
        }
    }
    
    public final void N(final A0.y[] array, final Q[] array2, final int[] array3) {
        for (int i = 0; i < array.length; ++i) {
            final Q q = array2[i];
            if (q instanceof x0.o || q instanceof h.a) {
                final int c = this.C(i, array3);
                if (c == -1) {
                    if (array2[i] instanceof x0.o) {
                        continue;
                    }
                }
                else {
                    final Q q2 = array2[i];
                    if (q2 instanceof h.a && ((h.a)q2).o == array2[c]) {
                        continue;
                    }
                }
                final Q q3 = array2[i];
                if (q3 instanceof h.a) {
                    ((h.a)q3).c();
                }
                array2[i] = null;
            }
        }
    }
    
    public final void O(final A0.y[] array, final Q[] array2, final boolean[] array3, final long n, final int[] array4) {
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= array.length) {
                break;
            }
            final A0.y y = array[n3];
            if (y != null) {
                final Q q = array2[n3];
                if (q == null) {
                    array3[n3] = true;
                    final a a = this.y[array4[n3]];
                    final int c = a.c;
                    if (c == 0) {
                        array2[n3] = this.v(a, y, n);
                    }
                    else if (c == 2) {
                        array2[n3] = new j((o0.f)this.L.get(a.d), y.d().a(0), this.J.d);
                    }
                }
                else if (q instanceof h) {
                    ((androidx.media3.exoplayer.dash.a)((h)q).E()).i(y);
                }
            }
            ++n3;
        }
        while (i < array.length) {
            if (array2[i] == null && array[i] != null) {
                final a a2 = this.y[array4[i]];
                if (a2.c == 1) {
                    final int c2 = this.C(i, array4);
                    if (c2 == -1) {
                        array2[i] = new x0.o();
                    }
                    else {
                        array2[i] = ((h)array2[c2]).S(n, a2.b);
                    }
                }
            }
            ++i;
        }
    }
    
    public void P(final o0.c j, final int k) {
        this.J = j;
        this.K = k;
        this.A.q(j);
        final h[] g = this.G;
        if (g != null) {
            for (int length = g.length, i = 0; i < length; ++i) {
                ((androidx.media3.exoplayer.dash.a)g[i].E()).c(j, k);
            }
            ((S.a)this.F).e(this);
        }
        this.L = j.d(k).d;
        final j[] h = this.H;
        for (int length2 = h.length, l = 0; l < length2; ++l) {
            final j m = h[l];
            for (final o0.f f : this.L) {
                if (f.a().equals(m.b())) {
                    final int e = j.e();
                    boolean b = true;
                    if (!j.d || k != e - 1) {
                        b = false;
                    }
                    m.d(f, b);
                    break;
                }
            }
        }
    }
    
    @Override
    public void a(final h key) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0032: {
            try {
                final androidx.media3.exoplayer.dash.d.c c = this.B.remove(key);
                if (c != null) {
                    c.n();
                }
            }
            finally {
                break Label_0032;
            }
            return;
        }
    }
    // monitorexit(this)
    
    @Override
    public boolean b() {
        return this.I.b();
    }
    
    @Override
    public long c() {
        return this.I.c();
    }
    
    @Override
    public long d(final long n, final d1 d1) {
        final h[] g = this.G;
        for (int length = g.length, i = 0; i < length; ++i) {
            final h h = g[i];
            if (h.o == 2) {
                return h.d(n, d1);
            }
        }
        return n;
    }
    
    @Override
    public long f() {
        return this.I.f();
    }
    
    @Override
    public boolean g(final y0 y0) {
        return this.I.g(y0);
    }
    
    @Override
    public void h(final long n) {
        this.I.h(n);
    }
    
    @Override
    public long i(final A0.y[] array, final boolean[] array2, final Q[] array3, final boolean[] array4, final long n) {
        final int[] d = this.D(array);
        this.M(array, array2, array3);
        this.N(array, array3, d);
        this.O(array, array3, array4, n, d);
        final ArrayList<h> list = new ArrayList<h>();
        final ArrayList<j> list2 = new ArrayList<j>();
        for (int length = array3.length, i = 0; i < length; ++i) {
            final Q q = array3[i];
            if (q instanceof h) {
                list.add((h)q);
            }
            else if (q instanceof j) {
                list2.add((j)q);
            }
        }
        list.toArray(this.G = I(list.size()));
        list2.toArray(this.H = new j[list2.size()]);
        this.I = this.z.b(list, X2.E.k(list, new n0.d()));
        return n;
    }
    
    @Override
    public long l() {
        return -9223372036854775807L;
    }
    
    @Override
    public Z n() {
        return this.x;
    }
    
    @Override
    public void p() {
        this.v.a();
    }
    
    @Override
    public void q(final long n, final boolean b) {
        final h[] g = this.G;
        for (int length = g.length, i = 0; i < length; ++i) {
            g[i].q(n, b);
        }
    }
    
    @Override
    public long s(final long n) {
        final h[] g = this.G;
        final int length = g.length;
        final int n2 = 0;
        for (int i = 0; i < length; ++i) {
            g[i].R(n);
        }
        final j[] h = this.H;
        for (int length2 = h.length, j = n2; j < length2; ++j) {
            h[j].c(n);
        }
        return n;
    }
    
    @Override
    public void u(final v.a f, final long n) {
        (this.F = f).k(this);
    }
    
    public final h v(final a a, final A0.y y, final long n) {
        final int f = a.f;
        int i = 0;
        final boolean b = f != -1;
        final androidx.media3.exoplayer.dash.d.c c = null;
        J b2;
        int n2;
        if (b) {
            b2 = this.x.b(f);
            n2 = 1;
        }
        else {
            n2 = 0;
            b2 = null;
        }
        final int g = a.g;
        X2.v v;
        if (g != -1) {
            v = this.y[g].h;
        }
        else {
            v = X2.v.Y();
        }
        final int n3 = n2 + v.size();
        final q[] array = new q[n3];
        final int[] array2 = new int[n3];
        int n4;
        if (b) {
            array[0] = b2.a(0);
            array2[0] = 5;
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        final ArrayList<q> list = new ArrayList<q>();
        while (i < v.size()) {
            final q q = v.get(i);
            array[n4] = q;
            array2[n4] = 3;
            list.add(q);
            ++n4;
            ++i;
        }
        T k = c;
        if (this.J.d) {
            k = c;
            if (b) {
                k = this.A.k();
            }
        }
        final h key = new h(a.b, array2, array, this.p.c(this.v, this.J, this.t, this.K, a.a, y, a.b, this.u, b, list, (androidx.media3.exoplayer.dash.d.c)k, this.q, this.E, null), this, this.w, n, this.r, this.D, this.s, this.C);
        synchronized (this) {
            this.B.put(key, k);
            return key;
        }
    }
    
    public static final class a
    {
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final X2.v h;
        
        public a(final int b, final int c, final int[] a, final int e, final int f, final int g, final int d, final X2.v h) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.e = e;
            this.f = f;
            this.g = g;
            this.d = d;
            this.h = h;
        }
        
        public static a a(final int[] array, final int n, final X2.v v) {
            return new a(3, 1, array, n, -1, -1, -1, v);
        }
        
        public static a b(final int[] array, final int n) {
            return new a(5, 1, array, n, -1, -1, -1, X2.v.Y());
        }
        
        public static a c(final int n) {
            return new a(5, 2, new int[0], -1, -1, -1, n, X2.v.Y());
        }
        
        public static a d(final int n, final int[] array, final int n2, final int n3, final int n4) {
            return new a(n, 0, array, n2, n3, n4, -1, X2.v.Y());
        }
    }
}
