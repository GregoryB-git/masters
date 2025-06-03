// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import java.util.Arrays;
import d0.A;
import F0.L;
import F0.s;
import F0.q;
import c1.v;
import F0.M;
import java.util.Collections;
import java.util.ArrayList;
import g0.a;
import g0.E;
import android.util.SparseBooleanArray;
import android.util.SparseArray;
import c1.t;
import android.util.SparseIntArray;
import g0.z;
import java.util.List;
import F0.x;
import F0.r;

public final class J implements r
{
    public static final x v;
    public final int a;
    public final int b;
    public final int c;
    public final List d;
    public final z e;
    public final SparseIntArray f;
    public final K.c g;
    public final t.a h;
    public final SparseArray i;
    public final SparseBooleanArray j;
    public final SparseBooleanArray k;
    public final H l;
    public G m;
    public F0.t n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public K s;
    public int t;
    public int u;
    
    static {
        v = new I();
    }
    
    public J(final int a, final int b, final t.a h, final E o, final K.c c, final int c2) {
        this.g = (K.c)g0.a.e(c);
        this.c = c2;
        this.a = a;
        this.b = b;
        this.h = h;
        if (a != 1 && a != 2) {
            (this.d = new ArrayList()).add(o);
        }
        else {
            this.d = Collections.singletonList(o);
        }
        this.e = new z(new byte[9400], 0);
        this.j = new SparseBooleanArray();
        this.k = new SparseBooleanArray();
        this.i = new SparseArray();
        this.f = new SparseIntArray();
        this.l = new H(c2);
        this.n = F0.t.a;
        this.u = -1;
        this.A();
    }
    
    public J(final int n, final t.a a) {
        this(1, n, a, new E(0L), new j(0), 112800);
    }
    
    public static /* synthetic */ SparseArray f(final J j) {
        return j.i;
    }
    
    public static /* synthetic */ int h(final J j) {
        return j.o;
    }
    
    public static /* synthetic */ boolean j(final J j) {
        return j.p;
    }
    
    public static /* synthetic */ boolean k(final J j, final boolean p2) {
        return j.p = p2;
    }
    
    public static /* synthetic */ int l(final J j, final int o) {
        return j.o = o;
    }
    
    public static /* synthetic */ int m(final J j) {
        return j.o++;
    }
    
    public static /* synthetic */ int n(final J j) {
        return j.a;
    }
    
    public static /* synthetic */ List o(final J j) {
        return j.d;
    }
    
    public static /* synthetic */ int p(final J j, final int u) {
        return j.u = u;
    }
    
    public static /* synthetic */ K q(final J j) {
        return j.s;
    }
    
    public static /* synthetic */ K r(final J j, final K s) {
        return j.s = s;
    }
    
    public static /* synthetic */ K.c s(final J j) {
        return j.g;
    }
    
    public static /* synthetic */ F0.t t(final J j) {
        return j.n;
    }
    
    public static /* synthetic */ SparseBooleanArray u(final J j) {
        return j.j;
    }
    
    public static /* synthetic */ SparseBooleanArray v(final J j) {
        return j.k;
    }
    
    private void z(final long n) {
        if (!this.q) {
            this.q = true;
            F0.t t;
            M b;
            if (this.l.b() != -9223372036854775807L) {
                final G m = new G(this.l.c(), this.l.b(), n, this.u, this.c);
                this.m = m;
                t = this.n;
                b = m.b();
            }
            else {
                t = this.n;
                b = new M.b(this.l.b());
            }
            t.e(b);
        }
    }
    
    public final void A() {
        this.j.clear();
        this.i.clear();
        final SparseArray a = this.g.a();
        for (int size = a.size(), i = 0; i < size; ++i) {
            this.i.put(a.keyAt(i), (Object)a.valueAt(i));
        }
        this.i.put(0, (Object)new l1.E(new a()));
        this.s = null;
    }
    
    public final boolean B(final int n) {
        if (this.a != 2 && !this.p) {
            final SparseBooleanArray k = this.k;
            final boolean b = false;
            if (k.get(n, false)) {
                return b;
            }
        }
        return true;
    }
    
    @Override
    public void a(long d, final long n) {
        g0.a.f(this.a != 2);
        for (int size = this.d.size(), i = 0; i < size; ++i) {
            final E e = this.d.get(i);
            final boolean b = e.f() == -9223372036854775807L;
            if (!b) {
                d = e.d();
                if (d == -9223372036854775807L || d == 0L || d == n) {
                    continue;
                }
            }
            else if (!b) {
                continue;
            }
            e.i(n);
        }
        if (n != 0L) {
            final G m = this.m;
            if (m != null) {
                m.h(n);
            }
        }
        this.e.P(0);
        this.f.clear();
        for (int j = 0; j < this.i.size(); ++j) {
            ((K)this.i.valueAt(j)).b();
        }
        this.t = 0;
    }
    
    @Override
    public void b(final F0.t t) {
        F0.t n = t;
        if ((this.b & 0x1) == 0x0) {
            n = new v(t, this.h);
        }
        this.n = n;
    }
    
    @Override
    public boolean e(final s s) {
        final byte[] e = this.e.e();
        s.n(e, 0, 940);
        int i = 0;
    Label_0023:
        while (i < 188) {
            for (int j = 0; j < 5; ++j) {
                if (e[j * 188 + i] != 71) {
                    ++i;
                    continue Label_0023;
                }
            }
            s.i(i);
            return true;
        }
        return false;
    }
    
    @Override
    public int i(final s s, final L l) {
        final long a = s.a();
        final int a2 = this.a;
        int i = 0;
        final boolean b = a2 == 2;
        if (this.p) {
            if (a != -1L && !b && !this.l.d()) {
                return this.l.e(s, l, this.u);
            }
            this.z(a);
            if (this.r) {
                this.r = false;
                this.a(0L, 0L);
                if (s.p() != 0L) {
                    l.a = 0L;
                    return 1;
                }
            }
            final G m = this.m;
            if (m != null && m.d()) {
                return this.m.c(s, l);
            }
        }
        if (!this.w(s)) {
            while (i < this.i.size()) {
                final K k = (K)this.i.valueAt(i);
                if (k instanceof y) {
                    final y y = (y)k;
                    if (y.d(b)) {
                        y.a(new z(), 1);
                    }
                }
                ++i;
            }
            return -1;
        }
        final int x = this.x();
        final int g = this.e.g();
        if (x > g) {
            return 0;
        }
        final int p2 = this.e.p();
        Label_0262: {
            if ((0x800000 & p2) == 0x0) {
                int n;
                if ((0x400000 & p2) != 0x0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                final int n2 = (0x1FFF00 & p2) >> 8;
                final boolean b2 = (p2 & 0x20) != 0x0;
                K j;
                if ((p2 & 0x10) != 0x0) {
                    j = (K)this.i.get(n2);
                }
                else {
                    j = null;
                }
                if (j != null) {
                    if (this.a != 2) {
                        final int n3 = p2 & 0xF;
                        final int value = this.f.get(n2, n3 - 1);
                        this.f.put(n2, n3);
                        if (value == n3) {
                            break Label_0262;
                        }
                        if (n3 != (value + 1 & 0xF)) {
                            j.b();
                        }
                    }
                    int n4 = n;
                    if (b2) {
                        final int g2 = this.e.G();
                        int n5;
                        if ((this.e.G() & 0x40) != 0x0) {
                            n5 = 2;
                        }
                        else {
                            n5 = 0;
                        }
                        n4 = (n | n5);
                        this.e.U(g2 - 1);
                    }
                    final boolean p3 = this.p;
                    if (this.B(n2)) {
                        this.e.S(x);
                        j.a(this.e, n4);
                        this.e.S(g);
                    }
                    if (this.a != 2 && !p3 && this.p && a != -1L) {
                        this.r = true;
                    }
                }
            }
        }
        this.e.T(x);
        return 0;
    }
    
    @Override
    public void release() {
    }
    
    public final boolean w(final s s) {
        final byte[] e = this.e.e();
        if (9400 - this.e.f() < 188) {
            final int a = this.e.a();
            if (a > 0) {
                System.arraycopy(e, this.e.f(), e, 0, a);
            }
            this.e.R(e, a);
        }
        while (this.e.a() < 188) {
            final int g = this.e.g();
            final int read = s.read(e, g, 9400 - g);
            if (read == -1) {
                return false;
            }
            this.e.S(g + read);
        }
        return true;
    }
    
    public final int x() {
        final int f = this.e.f();
        final int g = this.e.g();
        final int a = l1.L.a(this.e.e(), f, g);
        this.e.T(a);
        final int n = a + 188;
        if (n > g) {
            final int t = this.t + (a - f);
            this.t = t;
            if (this.a == 2) {
                if (t <= 376) {
                    return n;
                }
                throw A.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        }
        else {
            this.t = 0;
        }
        return n;
    }
    
    public class a implements D
    {
        public final g0.y a;
        
        public a() {
            this.a = new g0.y(new byte[4]);
        }
        
        @Override
        public void a(final z z) {
            if (z.G() != 0) {
                return;
            }
            if ((z.G() & 0x80) == 0x0) {
                return;
            }
            z.U(6);
            for (int n = z.a() / 4, i = 0; i < n; ++i) {
                z.k(this.a, 4);
                final int h = this.a.h(16);
                this.a.r(3);
                if (h == 0) {
                    this.a.r(13);
                }
                else {
                    final int h2 = this.a.h(13);
                    if (J.f(J.this).get(h2) == null) {
                        J.f(J.this).put(h2, (Object)new l1.E(new b(h2)));
                        J.m(J.this);
                    }
                }
            }
            if (J.n(J.this) != 2) {
                J.f(J.this).remove(0);
            }
        }
        
        @Override
        public void c(final E e, final F0.t t, final K.d d) {
        }
    }
    
    public class b implements D
    {
        public final g0.y a;
        public final SparseArray b;
        public final SparseIntArray c;
        public final int d;
        
        public b(final int d) {
            this.a = new g0.y(new byte[5]);
            this.b = new SparseArray();
            this.c = new SparseIntArray();
            this.d = d;
        }
        
        @Override
        public void a(final z z) {
            if (z.G() != 2) {
                return;
            }
            E e;
            if (J.n(J.this) != 1 && J.n(J.this) != 2 && J.h(J.this) != 1) {
                e = new E(J.o(J.this).get(0).d());
                J.o(J.this).add(e);
            }
            else {
                e = J.o(J.this).get(0);
            }
            if ((z.G() & 0x80) == 0x0) {
                return;
            }
            z.U(1);
            final int m = z.M();
            z.U(3);
            z.k(this.a, 2);
            this.a.r(3);
            J.p(J.this, this.a.h(13));
            z.k(this.a, 2);
            this.a.r(4);
            z.U(this.a.h(12));
            if (J.n(J.this) == 2 && J.q(J.this) == null) {
                final K.b b = new K.b(21, null, 0, null, g0.M.f);
                final J e2 = J.this;
                J.r(e2, J.s(e2).b(21, b));
                if (J.q(J.this) != null) {
                    J.q(J.this).c(e, J.t(J.this), new K.d(m, 21, 8192));
                }
            }
            this.b.clear();
            this.c.clear();
            int n;
            for (int i = z.a(); i > 0; i = n) {
                z.k(this.a, 5);
                final int h = this.a.h(8);
                this.a.r(3);
                final int h2 = this.a.h(13);
                this.a.r(4);
                final int h3 = this.a.h(12);
                final K.b b2 = this.b(z, h3);
                int a;
                if (h == 6 || (a = h) == 5) {
                    a = b2.a;
                }
                n = i - (h3 + 5);
                int n2;
                if (J.n(J.this) == 2) {
                    n2 = a;
                }
                else {
                    n2 = h2;
                }
                if (!J.u(J.this).get(n2)) {
                    K k;
                    if (J.n(J.this) == 2 && a == 21) {
                        k = J.q(J.this);
                    }
                    else {
                        k = J.s(J.this).b(a, b2);
                    }
                    if (J.n(J.this) != 2 || h2 < this.c.get(n2, 8192)) {
                        this.c.put(n2, h2);
                        this.b.put(n2, (Object)k);
                    }
                }
            }
            for (int size = this.c.size(), j = 0; j < size; ++j) {
                final int key = this.c.keyAt(j);
                final int value = this.c.valueAt(j);
                J.u(J.this).put(key, true);
                J.v(J.this).put(value, true);
                final K l = (K)this.b.valueAt(j);
                if (l != null) {
                    if (l != J.q(J.this)) {
                        l.c(e, J.t(J.this), new K.d(m, key, 8192));
                    }
                    J.f(J.this).put(value, (Object)l);
                }
            }
            if (J.n(J.this) == 2) {
                if (J.j(J.this)) {
                    return;
                }
                J.t(J.this).j();
                J.l(J.this, 0);
            }
            else {
                J.f(J.this).remove(this.d);
                final J e3 = J.this;
                int n3;
                if (J.n(e3) == 1) {
                    n3 = 0;
                }
                else {
                    n3 = J.h(J.this) - 1;
                }
                J.l(e3, n3);
                if (J.h(J.this) != 0) {
                    return;
                }
                J.t(J.this).j();
            }
            J.k(J.this, true);
        }
        
        public final K.b b(final z z, int g) {
            final int f = z.f();
            final int to = f + g;
            g = -1;
            List<K.a> list;
            Object o = list = null;
            int n = 0;
            while (z.f() < to) {
                final int g2 = z.G();
                final int n2 = z.f() + z.G();
                if (n2 > to) {
                    break;
                }
                String trim = null;
                int g3 = 0;
                List<K.a> list2 = null;
                Label_0466: {
                    Label_0195: {
                        Label_0170: {
                            if (g2 == 5) {
                                final long i = z.I();
                                if (i == 1094921523L) {
                                    break Label_0170;
                                }
                                if (i == 1161904947L) {
                                    break Label_0195;
                                }
                                if (i != 1094921524L) {
                                    trim = (String)o;
                                    g3 = n;
                                    list2 = list;
                                    if (i == 1212503619L) {
                                        g = 36;
                                        trim = (String)o;
                                        g3 = n;
                                        list2 = list;
                                    }
                                    break Label_0466;
                                }
                            }
                            else {
                                if (g2 == 106) {
                                    break Label_0170;
                                }
                                if (g2 == 122) {
                                    break Label_0195;
                                }
                                if (g2 != 127) {
                                    if (g2 == 123) {
                                        g = 138;
                                    }
                                    else {
                                        if (g2 == 10) {
                                            trim = z.D(3).trim();
                                            g3 = z.G();
                                            list2 = list;
                                            break Label_0466;
                                        }
                                        if (g2 == 89) {
                                            list2 = new ArrayList<K.a>();
                                            while (z.f() < n2) {
                                                final String trim2 = z.D(3).trim();
                                                g = z.G();
                                                final byte[] array = new byte[4];
                                                z.l(array, 0, 4);
                                                list2.add(new K.a(trim2, g, array));
                                            }
                                            g = 89;
                                            trim = (String)o;
                                            g3 = n;
                                            break Label_0466;
                                        }
                                        trim = (String)o;
                                        g3 = n;
                                        list2 = list;
                                        if (g2 != 111) {
                                            break Label_0466;
                                        }
                                        g = 257;
                                    }
                                    trim = (String)o;
                                    g3 = n;
                                    list2 = list;
                                    break Label_0466;
                                }
                                final int g4 = z.G();
                                if (g4 != 21) {
                                    if (g4 == 14) {
                                        g = 136;
                                        trim = (String)o;
                                        g3 = n;
                                        list2 = list;
                                        break Label_0466;
                                    }
                                    trim = (String)o;
                                    g3 = n;
                                    list2 = list;
                                    if (g4 == 33) {
                                        g = 139;
                                        trim = (String)o;
                                        g3 = n;
                                        list2 = list;
                                    }
                                    break Label_0466;
                                }
                            }
                            g = 172;
                            trim = (String)o;
                            g3 = n;
                            list2 = list;
                            break Label_0466;
                        }
                        g = 129;
                        trim = (String)o;
                        g3 = n;
                        list2 = list;
                        break Label_0466;
                    }
                    g = 135;
                    trim = (String)o;
                    g3 = n;
                    list2 = list;
                }
                z.U(n2 - z.f());
                o = trim;
                n = g3;
                list = list2;
            }
            z.T(to);
            return new K.b(g, (String)o, n, list, Arrays.copyOfRange(z.e(), f, to));
        }
        
        @Override
        public void c(final E e, final F0.t t, final K.d d) {
        }
    }
}
