// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import java.util.Collections;
import java.util.HashSet;
import d0.J;
import g0.a;
import x0.Q;
import k0.y0;
import android.net.Uri;
import k0.d1;
import d0.z;
import g0.M;
import d0.q;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import B0.f;
import x0.j;
import java.util.IdentityHashMap;
import B0.b;
import x0.E;
import p0.x;
import i0.y;
import x0.S;
import x0.Z;
import l0.y1;
import r0.k;
import x0.v;

public final class m implements v, k.b
{
    public final boolean A;
    public final int B;
    public final boolean C;
    public final y1 D;
    public final s.b E;
    public final long F;
    public v.a G;
    public int H;
    public Z I;
    public s[] J;
    public s[] K;
    public int[][] L;
    public int M;
    public S N;
    public final h o;
    public final k p;
    public final g q;
    public final y r;
    public final x s;
    public final p0.v.a t;
    public final B0.m u;
    public final E.a v;
    public final B0.b w;
    public final IdentityHashMap x;
    public final q0.v y;
    public final j z;
    
    public m(final h o, final k p16, final g q, final y r, final f f, final x s, final p0.v.a t, final B0.m u, final E.a v, final B0.b w, final j z, final boolean a, final int b, final boolean c, final y1 d, final long f2) {
        this.o = o;
        this.p = p16;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.F = f2;
        this.E = new b(null);
        this.N = z.a();
        this.x = new IdentityHashMap();
        this.y = new q0.v();
        this.J = new s[0];
        this.K = new s[0];
        this.L = new int[0][];
    }
    
    public static Map A(final List c) {
        final ArrayList<d0.m> list = new ArrayList<d0.m>(c);
        final HashMap<String, d0.m> hashMap = new HashMap<String, d0.m>();
        int i = 0;
        while (i < list.size()) {
            d0.m f = (d0.m)c.get(i);
            final String q = f.q;
            int j;
            i = (j = i + 1);
            while (j < list.size()) {
                final d0.m m = list.get(j);
                if (TextUtils.equals((CharSequence)m.q, (CharSequence)q)) {
                    f = f.f(m);
                    list.remove(j);
                }
                else {
                    ++j;
                }
            }
            hashMap.put(q, f);
        }
        return hashMap;
    }
    
    public static q B(final q q) {
        final String q2 = M.Q(q.j, 2);
        return new q.b().a0(q.a).c0(q.b).d0(q.c).Q(q.m).o0(z.g(q2)).O(q2).h0(q.k).M(q.g).j0(q.h).v0(q.t).Y(q.u).X(q.v).q0(q.e).m0(q.f).K();
    }
    
    public static /* synthetic */ int k(final m m) {
        return --m.H;
    }
    
    public static /* synthetic */ s[] m(final m m) {
        return m.J;
    }
    
    public static /* synthetic */ Z o(final m m, final Z i) {
        return m.I = i;
    }
    
    public static /* synthetic */ v.a r(final m m) {
        return m.G;
    }
    
    public static /* synthetic */ k t(final m m) {
        return m.p;
    }
    
    public static q z(final q q, final q q2, final boolean b) {
        List list = X2.v.Y();
        int h = -1;
        String j;
        d0.x k;
        int n;
        int n2;
        int n3;
        String s;
        String b3;
        List list2;
        if (q2 != null) {
            j = q2.j;
            k = q2.k;
            n = q2.B;
            n2 = q2.e;
            n3 = q2.f;
            s = q2.d;
            final String b2 = q2.b;
            final List c = q2.c;
            b3 = b2;
            list2 = c;
        }
        else {
            final String q3 = M.Q(q.j, 1);
            final d0.x i = q.k;
            if (b) {
                n = q.B;
                n2 = q.e;
                n3 = q.f;
                s = q.d;
                b3 = q.b;
                list = q.c;
            }
            else {
                n2 = 0;
                s = null;
                n = -1;
                n3 = 0;
                b3 = null;
            }
            list2 = list;
            j = q3;
            k = i;
        }
        final String g = z.g(j);
        int g2;
        if (b) {
            g2 = q.g;
        }
        else {
            g2 = -1;
        }
        if (b) {
            h = q.h;
        }
        return new q.b().a0(q.a).c0(b3).d0(list2).Q(q.m).o0(g).O(j).h0(k).M(g2).j0(h).N(n).q0(n2).m0(n3).e0(s).K();
    }
    
    public void D() {
        this.p.l((k.b)this);
        final s[] j = this.J;
        for (int length = j.length, i = 0; i < length; ++i) {
            j[i].h0();
        }
        this.G = null;
    }
    
    @Override
    public void a() {
        final s[] j = this.J;
        for (int length = j.length, i = 0; i < length; ++i) {
            j[i].d0();
        }
        ((S.a)this.G).e(this);
    }
    
    @Override
    public boolean b() {
        return this.N.b();
    }
    
    @Override
    public long c() {
        return this.N.c();
    }
    
    @Override
    public long d(final long n, final d1 d1) {
        final s[] k = this.K;
        for (int length = k.length, i = 0; i < length; ++i) {
            final s s = k[i];
            if (s.S()) {
                return s.d(n, d1);
            }
        }
        return n;
    }
    
    @Override
    public boolean e(final Uri uri, final B0.m.c c, final boolean b) {
        final s[] j = this.J;
        final int length = j.length;
        boolean b2 = true;
        for (int i = 0; i < length; ++i) {
            b2 &= j[i].c0(uri, c, b);
        }
        ((S.a)this.G).e(this);
        return b2;
    }
    
    @Override
    public long f() {
        return this.N.f();
    }
    
    @Override
    public boolean g(final y0 y0) {
        if (this.I == null) {
            final s[] j = this.J;
            for (int length = j.length, i = 0; i < length; ++i) {
                j[i].C();
            }
            return false;
        }
        return this.N.g(y0);
    }
    
    @Override
    public void h(final long n) {
        this.N.h(n);
    }
    
    @Override
    public long i(final A0.y[] array, final boolean[] array2, final Q[] array3, final boolean[] array4, final long n) {
        final int[] array5 = new int[array.length];
        final int[] array6 = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            final Q key = array3[i];
            int intValue;
            if (key == null) {
                intValue = -1;
            }
            else {
                intValue = this.x.get(key);
            }
            array5[i] = intValue;
            array6[i] = -1;
            final A0.y y = array[i];
            if (y != null) {
                final J d = y.d();
                int n2 = 0;
                while (true) {
                    final s[] j = this.J;
                    if (n2 >= j.length) {
                        break;
                    }
                    if (j[n2].n().d(d) != -1) {
                        array6[i] = n2;
                        break;
                    }
                    ++n2;
                }
            }
        }
        this.x.clear();
        final int length = array.length;
        final Q[] array7 = new Q[length];
        final Q[] array8 = new Q[array.length];
        final A0.y[] array9 = new A0.y[array.length];
        final s[] array10 = new s[this.J.length];
        int n3 = 0;
        int k = 0;
        boolean b = false;
        while (k < this.J.length) {
            for (int l = 0; l < array.length; ++l) {
                final int n4 = array5[l];
                final A0.y y2 = null;
                Q q;
                if (n4 == k) {
                    q = array3[l];
                }
                else {
                    q = null;
                }
                array8[l] = q;
                A0.y y3 = y2;
                if (array6[l] == k) {
                    y3 = array[l];
                }
                array9[l] = y3;
            }
            final s s = this.J[k];
            final boolean l2 = s.l0(array9, array2, array8, array4, n, b);
            int n5 = 0;
            int n6 = 0;
            boolean b2;
            while (true) {
                final int length2 = array.length;
                b2 = true;
                boolean b3 = true;
                if (n5 >= length2) {
                    break;
                }
                final Q key2 = array8[n5];
                int n7;
                if (array6[n5] == k) {
                    a.e(key2);
                    array7[n5] = key2;
                    this.x.put(key2, k);
                    n7 = 1;
                }
                else {
                    n7 = n6;
                    if (array5[n5] == k) {
                        if (key2 != null) {
                            b3 = false;
                        }
                        a.f(b3);
                        n7 = n6;
                    }
                }
                ++n5;
                n6 = n7;
            }
            Label_0555: {
                if (n6 != 0) {
                    array10[n3] = s;
                    final int n8 = n3 + 1;
                    if (n3 == 0) {
                        s.o0(true);
                        if (!l2) {
                            final s[] m = this.K;
                            if (m.length != 0) {
                                n3 = n8;
                                if (s == m[0]) {
                                    break Label_0555;
                                }
                            }
                        }
                        this.y.b();
                        b = true;
                        n3 = n8;
                    }
                    else {
                        s.o0(k < this.M && b2);
                        n3 = n8;
                    }
                }
            }
            ++k;
        }
        System.arraycopy(array7, 0, array3, 0, length);
        final s[] k2 = (s[])g0.M.O0(array10, n3);
        this.K = k2;
        final X2.v v = X2.v.V(k2);
        this.N = this.z.b(v, X2.E.k(v, new l()));
        return n;
    }
    
    @Override
    public long l() {
        return -9223372036854775807L;
    }
    
    @Override
    public Z n() {
        return (Z)a.e(this.I);
    }
    
    @Override
    public void p() {
        final s[] j = this.J;
        for (int length = j.length, i = 0; i < length; ++i) {
            j[i].p();
        }
    }
    
    @Override
    public void q(final long n, final boolean b) {
        final s[] k = this.K;
        for (int length = k.length, i = 0; i < length; ++i) {
            k[i].q(n, b);
        }
    }
    
    @Override
    public long s(final long n) {
        final s[] k = this.K;
        if (k.length > 0) {
            final boolean k2 = k[0].k0(n, false);
            int n2 = 1;
            while (true) {
                final s[] i = this.K;
                if (n2 >= i.length) {
                    break;
                }
                i[n2].k0(n, k2);
                ++n2;
            }
            if (k2) {
                this.y.b();
            }
        }
        return n;
    }
    
    @Override
    public void u(final v.a g, final long n) {
        this.G = g;
        this.p.j((k.b)this);
        this.x(n);
    }
    
    public final void v(final long n, final List list, final List list2, final List list3, final Map map) {
        final ArrayList<Uri> list4 = new ArrayList<Uri>(list.size());
        final ArrayList<q> list5 = new ArrayList<q>(list.size());
        final ArrayList<Integer> list6 = new ArrayList<Integer>(list.size());
        final HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < list.size(); ++i) {
            final String d = list.get(i).d;
            if (set.add(d)) {
                list4.clear();
                list5.clear();
                list6.clear();
                boolean b = true;
                boolean b2;
                for (int j = 0; j < list.size(); ++j, b = b2) {
                    b2 = b;
                    if (g0.M.c(d, list.get(j).d)) {
                        final r0.g.a a = list.get(j);
                        list6.add(j);
                        list4.add(a.a);
                        list5.add(a.b);
                        b2 = (b & g0.M.P(a.b.j, 1) == 1);
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("audio:");
                sb.append(d);
                final String string = sb.toString();
                final s y = this.y(string, 1, list4.toArray(g0.M.j(new Uri[0])), list5.toArray(new q[0]), null, Collections.emptyList(), map, n);
                list3.add(a3.f.n(list6));
                list2.add(y);
                if (this.A && b) {
                    y.f0(new J[] { new J(string, (q[])list5.toArray(new q[0])) }, 0, new int[0]);
                }
            }
        }
    }
    
    public final void w(final r0.g g, final long n, final List list, final List list2, final Map map) {
        final int size = g.e.size();
        final int[] array = new int[size];
        int i = 0;
        int n3;
        int n2 = n3 = i;
        while (i < g.e.size()) {
            final q b = g.e.get(i).b;
            if (b.u <= 0 && g0.M.Q(b.j, 2) == null) {
                if (g0.M.Q(b.j, 1) != null) {
                    array[i] = 1;
                    ++n3;
                }
                else {
                    array[i] = -1;
                }
            }
            else {
                array[i] = 2;
                ++n2;
            }
            ++i;
        }
        boolean b2;
        boolean b3;
        if (n2 > 0) {
            b2 = true;
            b3 = false;
        }
        else if (n3 < size) {
            n2 = size - n3;
            b3 = true;
            b2 = false;
        }
        else {
            n2 = size;
            b2 = (b3 = false);
        }
        final Uri[] array2 = new Uri[n2];
        final q[] array3 = new q[n2];
        final int[] array4 = new int[n2];
        int n4;
        int n5;
        for (int j = n4 = 0; j < g.e.size(); ++j, n4 = n5) {
            if (b2) {
                n5 = n4;
                if (array[j] != 2) {
                    continue;
                }
            }
            if (b3) {
                n5 = n4;
                if (array[j] == 1) {
                    continue;
                }
            }
            final r0.g.b b4 = g.e.get(j);
            array2[n4] = b4.a;
            array3[n4] = b4.b;
            array4[n4] = j;
            n5 = n4 + 1;
        }
        final String k = array3[0].j;
        final int p5 = g0.M.P(k, 2);
        final int p6 = g0.M.P(k, 1);
        final boolean b5 = (p6 == 1 || (p6 == 0 && g.g.isEmpty())) && p5 <= 1 && p6 + p5 > 0;
        int n6;
        if (!b2 && p6 > 0) {
            n6 = 1;
        }
        else {
            n6 = 0;
        }
        final s y = this.y("main", n6, array2, array3, g.j, g.k, map, n);
        list.add(y);
        list2.add(array4);
        if (this.A && b5) {
            final ArrayList<J> list3 = new ArrayList<J>();
            if (p5 > 0) {
                final q[] array5 = new q[n2];
                for (int l = 0; l < n2; ++l) {
                    array5[l] = B(array3[l]);
                }
                list3.add(new J("main", array5));
                if (p6 > 0 && (g.j != null || g.g.isEmpty())) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("main");
                    sb.append(":audio");
                    list3.add(new J(sb.toString(), new q[] { z(array3[0], g.j, false) }));
                }
                final List m = g.k;
                if (m != null) {
                    for (int i2 = 0; i2 < m.size(); ++i2) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("main");
                        sb2.append(":cc:");
                        sb2.append(i2);
                        list3.add(new J(sb2.toString(), new q[] { this.o.b(m.get(i2)) }));
                    }
                }
            }
            else {
                final q[] array6 = new q[n2];
                for (int n7 = 0; n7 < n2; ++n7) {
                    array6[n7] = z(array3[n7], g.j, true);
                }
                list3.add(new J("main", array6));
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("main");
            sb3.append(":id3");
            final J j2 = new J(sb3.toString(), new q[] { new q.b().a0("ID3").o0("application/id3").K() });
            list3.add(j2);
            y.f0(list3.toArray(new J[0]), 0, list3.indexOf(j2));
        }
    }
    
    public final void x(final long n) {
        final r0.g g = (r0.g)a.e(this.p.b());
        Map<Object, Object> map;
        if (this.C) {
            map = (Map<Object, Object>)A(g.m);
        }
        else {
            map = Collections.emptyMap();
        }
        final boolean empty = g.e.isEmpty();
        final List g2 = g.g;
        final List h = g.h;
        this.H = 0;
        final ArrayList<s> list = new ArrayList<s>();
        final ArrayList<int[]> list2 = new ArrayList<int[]>();
        if (empty ^ true) {
            this.w(g, n, list, list2, map);
        }
        this.v(n, g2, list, list2, map);
        this.M = list.size();
        for (int i = 0; i < h.size(); ++i) {
            final r0.g.a a = h.get(i);
            final StringBuilder sb = new StringBuilder();
            sb.append("subtitle:");
            sb.append(i);
            sb.append(":");
            sb.append(a.d);
            final String string = sb.toString();
            final q b = a.b;
            final s y = this.y(string, 3, new Uri[] { a.a }, new q[] { b }, null, Collections.emptyList(), map, n);
            list2.add(new int[] { i });
            list.add(y);
            y.f0(new J[] { new J(string, new q[] { this.o.b(b) }) }, 0, new int[0]);
        }
        this.J = list.toArray(new s[0]);
        this.L = list2.toArray(new int[0][]);
        this.H = this.J.length;
        for (int j = 0; j < this.M; ++j) {
            this.J[j].o0(true);
        }
        final s[] k = this.J;
        for (int length = k.length, l = 0; l < length; ++l) {
            k[l].C();
        }
        this.K = this.J;
    }
    
    public final s y(final String s, final int n, final Uri[] array, final q[] array2, final q q, final List list, final Map map, final long n2) {
        return new s(s, n, this.E, new q0.f(this.o, this.p, array, array2, this.q, this.r, this.y, this.F, list, this.D, null), map, this.w, n2, q, this.s, this.t, this.u, this.v, this.B);
    }
    
    public class b implements s.b
    {
        public void a(final s s) {
            ((S.a)m.r(m.this)).e(m.this);
        }
        
        @Override
        public void m(final Uri uri) {
            m.t(m.this).i(uri);
        }
        
        @Override
        public void o() {
            if (m.k(m.this) > 0) {
                return;
            }
            final s[] m = q0.m.m(q0.m.this);
            int n;
            for (int length = m.length, i = n = 0; i < length; ++i) {
                n += m[i].n().a;
            }
            final J[] array = new J[n];
            final s[] j = q0.m.m(q0.m.this);
            int n2;
            for (int length2 = j.length, k = n2 = 0; k < length2; ++k) {
                final s s = j[k];
                for (int a = s.n().a, l = 0; l < a; ++l, ++n2) {
                    array[n2] = s.n().b(l);
                }
            }
            q0.m.o(q0.m.this, new Z(array));
            q0.m.r(q0.m.this).k(q0.m.this);
        }
    }
}
