// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a4;

import d4.j;
import d4.g;
import d4.i;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import W3.f;
import W3.c;
import java.util.Iterator;
import java.util.Map;
import b4.a;
import V3.G;
import d4.n;
import d4.b;
import d4.m;
import d4.h;
import b4.d;

public class l
{
    public static b4.d.a b;
    public final b4.d a;
    
    static {
        l.b = new b4.d.a() {
            @Override
            public m a(final h h, final m m, final boolean b) {
                return null;
            }
            
            @Override
            public n b(final b b) {
                return null;
            }
        };
    }
    
    public l(final b4.d a) {
        this.a = a;
    }
    
    public static boolean g(final k k, final b b) {
        return k.c().c(b);
    }
    
    public final k a(final k k, final V3.k i, final Y3.d d, final G g, final n n, final a a) {
        if (g.i(i) != null) {
            return k;
        }
        final boolean e = k.d().e();
        final a4.a d2 = k.d();
        if (d.getValue() == null) {
            final V3.b s = V3.b.s();
            final Iterator iterator = d.iterator();
            V3.b a2 = s;
            while (iterator.hasNext()) {
                final V3.k j = iterator.next().getKey();
                final V3.k t = i.T(j);
                if (d2.d(t)) {
                    a2 = a2.a(j, d2.b().A(t));
                }
            }
            return this.c(k, i, a2, g, n, e, a);
        }
        if ((i.isEmpty() && d2.f()) || d2.d(i)) {
            return this.d(k, i, d2.b().A(i), g, n, e, a);
        }
        k c = k;
        if (i.isEmpty()) {
            V3.b b = V3.b.s();
            for (final m m : d2.b()) {
                b = b.d(m.c(), m.d());
            }
            c = this.c(k, i, b, g, n, e, a);
        }
        return c;
    }
    
    public c b(final k k, final W3.d d, final G g, final n n) {
        final a a = new a();
        final int n2 = l$b.a[d.c().ordinal()];
        k i;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unknown operation: ");
                        sb.append(d.c());
                        throw new AssertionError((Object)sb.toString());
                    }
                    i = this.i(k, d.a(), g, n, a);
                }
                else {
                    final W3.a a2 = (W3.a)d;
                    final boolean f = a2.f();
                    final V3.k a3 = a2.a();
                    if (!f) {
                        i = this.a(k, a3, a2.e(), g, n, a);
                    }
                    else {
                        i = this.k(k, a3, g, n, a);
                    }
                }
            }
            else {
                final W3.c c = (W3.c)d;
                if (c.b().d()) {
                    i = this.e(k, c.a(), c.e(), g, n, a);
                }
                else {
                    Y3.m.f(c.b().c());
                    i = this.c(k, c.a(), c.e(), g, n, c.b().e() || k.d().e(), a);
                }
            }
        }
        else {
            final f f2 = (f)d;
            if (f2.b().d()) {
                i = this.f(k, f2.a(), f2.e(), g, n, a);
            }
            else {
                Y3.m.f(f2.b().c());
                i = this.d(k, f2.a(), f2.e(), g, n, f2.b().e() || (k.d().e() && !f2.a().isEmpty()), a);
            }
        }
        final ArrayList list = new ArrayList(a.a());
        this.j(k, i, list);
        return new c(i, list);
    }
    
    public final k c(final k k, final V3.k i, final V3.b b, final G g, final n n, final boolean b2, final a a) {
        if (k.d().b().isEmpty() && !k.d().f()) {
            return k;
        }
        Y3.m.g(b.X() == null, "Can't have a merge that is an overwrite");
        V3.b f;
        if (i.isEmpty()) {
            f = b;
        }
        else {
            f = V3.b.s().f(i, b);
        }
        final n b3 = k.d().b();
        final Map q = f.q();
        final Iterator<Map.Entry<b, V>> iterator = q.entrySet().iterator();
        k j = k;
        while (iterator.hasNext()) {
            final Map.Entry<b, V> entry = iterator.next();
            final b b4 = entry.getKey();
            if (b3.Q(b4)) {
                j = this.d(j, new V3.k(new b[] { b4 }), ((V3.b)entry.getValue()).g(b3.v(b4)), g, n, b2, a);
            }
        }
        for (final Map.Entry<b, V> entry2 : q.entrySet()) {
            final b b5 = entry2.getKey();
            final V3.b b6 = (V3.b)entry2.getValue();
            final boolean b7 = !k.d().c(b5) && b6.X() == null;
            if (!b3.Q(b5) && !b7) {
                j = this.d(j, new V3.k(new b[] { b5 }), ((V3.b)entry2.getValue()).g(b3.v(b5)), g, n, b2, a);
            }
        }
        return j;
    }
    
    public final k d(k f, final V3.k k, n n, final G g, final n n2, final boolean b, final a a) {
        final a4.a d = f.d();
        b4.d d2 = this.a;
        if (!b) {
            d2 = d2.b();
        }
        final boolean empty = k.isEmpty();
        final boolean b2 = true;
        i l = null;
        Label_0261: {
            i i;
            i j;
            if (empty) {
                i = d.a();
                j = d4.i.f(n, d2.e());
            }
            else if (d2.d() && !d.e()) {
                Y3.m.g(k.isEmpty() ^ true, "An empty path should have been caught in the other branch");
                final b z = k.Z();
                n = d.b().v(z).y(k.c0(), n);
                j = d.a().D(z, n);
                i = d.a();
            }
            else {
                final b z2 = k.Z();
                if (!d.d(k) && k.size() > 1) {
                    return f;
                }
                final V3.k c0 = k.c0();
                n = d.b().v(z2).y(c0, n);
                if (z2.s()) {
                    l = d2.a(d.a(), n);
                    break Label_0261;
                }
                l = d2.c(d.a(), z2, n, c0, a4.l.b, null);
                break Label_0261;
            }
            l = d2.f(i, j, null);
        }
        boolean b3 = b2;
        if (!d.f()) {
            b3 = (k.isEmpty() && b2);
        }
        f = f.f(l, b3, d2.d());
        return this.h(f, k, g, new d(g, f, n2), a);
    }
    
    public final k e(final k k, final V3.k i, final V3.b b, final G g, final n n, final a a) {
        Y3.m.g(b.X() == null, "Can't have a merge that is an overwrite");
        final Iterator iterator = b.iterator();
        k f = k;
        while (iterator.hasNext()) {
            final Map.Entry<V3.k, V> entry = iterator.next();
            final V3.k t = i.T(entry.getKey());
            if (g(k, t.Z())) {
                f = this.f(f, t, (n)entry.getValue(), g, n, a);
            }
        }
        final Iterator iterator2 = b.iterator();
        k f2 = f;
        while (iterator2.hasNext()) {
            final Map.Entry<V3.k, V> entry2 = iterator2.next();
            final V3.k t2 = i.T(entry2.getKey());
            if (!g(k, t2.Z())) {
                f2 = this.f(f2, t2, (n)entry2.getValue(), g, n, a);
            }
        }
        return f2;
    }
    
    public final k f(final k k, final V3.k i, n n, final G g, final n n2, final a a) {
        final a4.a c = k.c();
        final d d = new d(g, k, n2);
        if (i.isEmpty()) {
            return k.e(this.a.f(k.c().a(), i.f(n, this.a.e()), a), true, this.a.d());
        }
        final b z = i.Z();
        i j;
        boolean b;
        boolean b2;
        if (z.s()) {
            j = this.a.a(k.c().a(), n);
            b = c.f();
            b2 = c.e();
        }
        else {
            final V3.k c2 = i.c0();
            final n v = c.b().v(z);
            n b3 = null;
            Label_0231: {
                if (!c2.isEmpty()) {
                    b3 = ((b4.d.a)d).b(z);
                    if (b3 != null) {
                        if (c2.X().s() && b3.A(c2.a0()).isEmpty()) {
                            break Label_0231;
                        }
                        n = b3.y(c2, n);
                    }
                    else {
                        n = g.W();
                    }
                }
                b3 = n;
            }
            if (v.equals(b3)) {
                return k;
            }
            j = this.a.c(c.a(), z, b3, c2, (b4.d.a)d, a);
            b = c.f();
            b2 = this.a.d();
        }
        return k.e(j, b, b2);
    }
    
    public final k h(final k k, final V3.k i, final G g, final b4.d.a a, final a a2) {
        final a4.a c = k.c();
        if (g.i(i) != null) {
            return k;
        }
        final boolean empty = i.isEmpty();
        final boolean b = false;
        i j = null;
        Label_0344: {
            if (empty) {
                Y3.m.g(k.d().f(), "If change path is empty, we must have complete server data");
                n n2;
                if (k.d().e()) {
                    n n = k.b();
                    if (!(n instanceof d4.c)) {
                        n = g.W();
                    }
                    n2 = g.e(n);
                }
                else {
                    n2 = g.b(k.b());
                }
                j = this.a.f(k.c().a(), i.f(n2, this.a.e()), a2);
            }
            else {
                final b z = i.Z();
                if (z.s()) {
                    Y3.m.g(i.size() == 1, "Can't have a priority with additional path components");
                    final n f = g.f(i, c.b(), k.d().b());
                    if (f != null) {
                        j = this.a.a(c.a(), f);
                        break Label_0344;
                    }
                }
                else {
                    final V3.k c2 = i.c0();
                    n n3;
                    if (c.c(z)) {
                        final n f2 = g.f(i, c.b(), k.d().b());
                        if (f2 != null) {
                            n3 = c.b().v(z).y(c2, f2);
                        }
                        else {
                            n3 = c.b().v(z);
                        }
                    }
                    else {
                        n3 = g.a(z, k.d());
                    }
                    if (n3 != null) {
                        j = this.a.c(c.a(), z, n3, c2, a, a2);
                        break Label_0344;
                    }
                }
                j = c.a();
            }
        }
        if (!c.f()) {
            final boolean b2 = b;
            if (!i.isEmpty()) {
                return k.e(j, b2, this.a.d());
            }
        }
        final boolean b2 = true;
        return k.e(j, b2, this.a.d());
    }
    
    public final k i(final k k, final V3.k i, final G g, final n n, final a a) {
        final a4.a d = k.d();
        return this.h(k.f(d.a(), d.f() || i.isEmpty(), d.e()), i, g, l.b, a);
    }
    
    public final void j(final k k, final k i, final List list) {
        final a4.a c = i.c();
        if (c.f()) {
            final boolean b = c.b().B() || c.b().isEmpty();
            if (!list.isEmpty() || !k.c().f() || (b && !c.b().equals(k.a())) || !c.b().t().equals(k.a().t())) {
                list.add(a4.c.n(c.a()));
            }
        }
    }
    
    public k k(final k k, final V3.k i, final G g, n v, final a a) {
        if (g.i(i) != null) {
            return k;
        }
        final d d = new d(g, k, v);
        final i a2 = k.c().a();
        i c = null;
        n n;
        if (!i.isEmpty() && !i.Z().s()) {
            final b z = i.Z();
            final n a3 = g.a(z, k.d());
            if ((v = a3) == null) {
                v = a3;
                if (k.d().c(z)) {
                    v = a2.k().v(z);
                }
            }
            n w = v;
            Label_0194: {
                b4.d d2;
                if (w != null) {
                    d2 = this.a;
                }
                else {
                    c = a2;
                    if (w != null) {
                        break Label_0194;
                    }
                    c = a2;
                    if (!k.c().b().Q(z)) {
                        break Label_0194;
                    }
                    d2 = this.a;
                    w = g.W();
                }
                c = d2.c(a2, z, w, i.c0(), (b4.d.a)d, a);
            }
            i f = c;
            if (!c.k().isEmpty()) {
                return k.e(f, k.d().f() || g.i(V3.k.Y()) != null, this.a.d());
            }
            f = c;
            if (!k.d().f()) {
                return k.e(f, k.d().f() || g.i(V3.k.Y()) != null, this.a.d());
            }
            final n b = g.b(k.b());
            f = c;
            if (!b.B()) {
                return k.e(f, k.d().f() || g.i(V3.k.Y()) != null, this.a.d());
            }
            n = b;
        }
        else if (k.d().f()) {
            n = g.b(k.b());
            c = a2;
        }
        else {
            n = g.e(k.d().b());
            c = a2;
        }
        i f = this.a.f(c, i.f(n, this.a.e()), a);
        return k.e(f, k.d().f() || g.i(V3.k.Y()) != null, this.a.d());
    }
    
    public static class c
    {
        public final k a;
        public final List b;
        
        public c(final k a, final List b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static class d implements a
    {
        public final G a;
        public final k b;
        public final n c;
        
        public d(final G a, final k b, final n c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public m a(final h h, final m m, final boolean b) {
            n n = this.c;
            if (n == null) {
                n = this.b.b();
            }
            return this.a.g(n, m, b, h);
        }
        
        @Override
        public n b(final b b) {
            final a4.a c = this.b.c();
            if (c.c(b)) {
                return c.b().v(b);
            }
            final n c2 = this.c;
            a4.a d;
            if (c2 != null) {
                d = new a4.a(i.f(c2, j.j()), true, false);
            }
            else {
                d = this.b.d();
            }
            return this.a.a(b, d);
        }
    }
}
