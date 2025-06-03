// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X3;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import d4.b;
import java.util.HashSet;
import java.util.Set;
import V3.k;
import java.util.HashMap;
import Y3.m;
import java.util.Iterator;
import java.util.Map;
import Y3.a;
import c4.c;
import Y3.d;

public class i
{
    public static final Y3.i f;
    public static final Y3.i g;
    public static final Y3.i h;
    public static final Y3.i i;
    public d a;
    public final f b;
    public final c c;
    public final a d;
    public long e;
    
    static {
        f = new Y3.i() {
            public boolean b(final Map map) {
                final h h = map.get(a4.h.i);
                return h != null && h.d;
            }
        };
        g = new Y3.i() {
            public boolean b(final Map map) {
                final h h = map.get(a4.h.i);
                return h != null && h.e;
            }
        };
        h = new Y3.i() {
            public boolean b(final h h) {
                return h.e ^ true;
            }
        };
        i = new Y3.i() {
            public boolean b(final h h) {
                return i.a().a(h) ^ true;
            }
        };
    }
    
    public i(final f b, final c c, final a d) {
        this.e = 0L;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = new d(null);
        this.r();
        for (final h h : b.n()) {
            this.e = Math.max(h.a + 1L, this.e);
            this.d(h);
        }
    }
    
    public static /* synthetic */ Y3.i a() {
        return X3.i.h;
    }
    
    public static void c(final a4.i i) {
        m.g(!i.g() || i.f(), "Can't have tracked non-default query that loads all data");
    }
    
    public static long e(final X3.a a, final long n) {
        return n - Math.min((long)Math.floor(n * (1.0f - a.b())), a.c());
    }
    
    public static a4.i o(final a4.i i) {
        a4.i a = i;
        if (i.g()) {
            a = a4.i.a(i.e());
        }
        return a;
    }
    
    public final void d(final h h) {
        c(h.b);
        Map<Object, h> map;
        if ((map = (Map<Object, h>)this.a.s(h.b.e())) == null) {
            map = (Map<Object, h>)new HashMap<a4.h, h>();
            this.a = this.a.W(h.b.e(), map);
        }
        final h h2 = map.get(h.b.d());
        m.f(h2 == null || h2.a == h.a);
        map.put(h.b.d(), h);
    }
    
    public long f() {
        return this.k(X3.i.h).size();
    }
    
    public void g(final k k) {
        if (!this.m(k)) {
            final a4.i a = a4.i.a(k);
            final h i = this.i(a);
            h b;
            if (i == null) {
                final long e = this.e;
                this.e = 1L + e;
                b = new h(e, a, this.d.a(), true, false);
            }
            else {
                m.g(i.d ^ true, "This should have been handled above!");
                b = i.b();
            }
            this.s(b);
        }
    }
    
    public final Set h(final k k) {
        final HashSet<Long> set = new HashSet<Long>();
        final Map map = (Map)this.a.s(k);
        if (map != null) {
            for (final h h : map.values()) {
                if (!h.b.g()) {
                    set.add(h.a);
                }
            }
        }
        return set;
    }
    
    public h i(a4.i o) {
        o = o(o);
        final Map map = (Map)this.a.s(o.e());
        if (map != null) {
            return map.get(o.d());
        }
        return null;
    }
    
    public Set j(final k k) {
        m.g(this.n(a4.i.a(k)) ^ true, "Path is fully complete.");
        final HashSet<b> set = new HashSet<b>();
        final Set h = this.h(k);
        if (!h.isEmpty()) {
            set.addAll((Collection<?>)this.b.v(h));
        }
        for (final Map.Entry<b, V> entry : this.a.Y(k).M()) {
            final b b = entry.getKey();
            final d d = (d)entry.getValue();
            if (d.getValue() != null && X3.i.f.a(d.getValue())) {
                set.add(b);
            }
        }
        return set;
    }
    
    public final List k(final Y3.i i) {
        final ArrayList<h> list = new ArrayList<h>();
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            for (final h h : iterator.next().getValue().values()) {
                if (i.a(h)) {
                    list.add(h);
                }
            }
        }
        return list;
    }
    
    public boolean l(final k k) {
        return this.a.V(k, X3.i.g) != null;
    }
    
    public final boolean m(final k k) {
        return this.a.f(k, X3.i.f) != null;
    }
    
    public boolean n(final a4.i i) {
        if (this.m(i.e())) {
            return true;
        }
        if (i.g()) {
            return false;
        }
        final Map map = (Map)this.a.s(i.e());
        return map != null && map.containsKey(i.d()) && map.get(i.d()).d;
    }
    
    public g p(final X3.a a) {
        final List k = this.k(X3.i.h);
        final long e = e(a, k.size());
        g g = new g();
        if (this.c.f()) {
            final c c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Pruning old queries.  Prunable: ");
            sb.append(k.size());
            sb.append(" Count to prune: ");
            sb.append(e);
            c.b(sb.toString(), new Object[0]);
        }
        Collections.sort((List<Object>)k, new Comparator() {
            public int a(final h h, final h h2) {
                return m.b(h.c, h2.c);
            }
        });
        for (int n = 0; n < e; ++n) {
            final h h = k.get(n);
            g = g.d(h.b.e());
            this.q(h.b);
        }
        for (int i = (int)e; i < k.size(); ++i) {
            g = g.c(k.get(i).b.e());
        }
        final List j = this.k(X3.i.i);
        if (this.c.f()) {
            final c c2 = this.c;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Unprunable queries: ");
            sb2.append(j.size());
            c2.b(sb2.toString(), new Object[0]);
        }
        final Iterator<h> iterator = j.iterator();
        while (iterator.hasNext()) {
            g = g.c(iterator.next().b.e());
        }
        return g;
    }
    
    public void q(a4.i o) {
        o = o(o);
        final h i = this.i(o);
        m.g(i != null, "Query must exist to be removed.");
        this.b.h(i.a);
        final Map map = (Map)this.a.s(o.e());
        map.remove(o.d());
        if (map.isEmpty()) {
            this.a = this.a.U(o.e());
        }
    }
    
    public final void r() {
        try {
            this.b.g();
            this.b.j(this.d.a());
            this.b.p();
        }
        finally {
            this.b.f();
        }
    }
    
    public final void s(final h h) {
        this.d(h);
        this.b.u(h);
    }
    
    public void t(final k k) {
        this.a.Y(k).q((d.c)new d.c() {
            public Void b(final k k, final Map map, final Void void1) {
                final Iterator<Map.Entry<K, h>> iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                    final h h = iterator.next().getValue();
                    if (!h.d) {
                        X3.i.this.s(h.b());
                    }
                }
                return null;
            }
        });
    }
    
    public void u(final a4.i i) {
        this.v(i, true);
    }
    
    public final void v(a4.i o, final boolean b) {
        o = o(o);
        final h i = this.i(o);
        final long a = this.d.a();
        h a2;
        if (i != null) {
            a2 = i.c(a).a(b);
        }
        else {
            m.g(b, "If we're setting the query to inactive, we should already be tracking it!");
            final long e = this.e;
            this.e = 1L + e;
            a2 = new h(e, o, a, false, b);
        }
        this.s(a2);
    }
    
    public void w(final a4.i i) {
        final h j = this.i(o(i));
        if (j != null && !j.d) {
            this.s(j.b());
        }
    }
    
    public void x(final a4.i i) {
        this.v(i, false);
    }
}
