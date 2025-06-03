// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import d4.g;
import a4.c;
import java.util.Collection;
import java.util.ArrayList;
import d4.n;
import W3.d;
import java.util.Iterator;
import a4.j;
import a4.i;
import java.util.Set;
import d4.m;
import d4.b;
import java.util.HashSet;
import java.util.List;
import a4.a;
import java.util.HashMap;
import X3.e;
import java.util.Map;

public class v
{
    public final Map a;
    public final e b;
    
    public v(final e b) {
        this.a = new HashMap();
        this.b = b;
    }
    
    public List a(final h h, final G g, final a a) {
        final i e = h.e();
        final j g2 = this.g(e, g, a);
        if (!e.g()) {
            final HashSet<b> set = new HashSet<b>();
            final Iterator<Object> iterator = g2.f().iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next().c());
            }
            this.b.o(e, set);
        }
        if (!this.a.containsKey(e.d())) {
            this.a.put(e.d(), g2);
        }
        this.a.put(e.d(), g2);
        g2.a(h);
        return g2.g(h);
    }
    
    public List b(final d d, final G g, final n n) {
        final a4.h b = d.b().b();
        if (b != null) {
            final j j = this.a.get(b);
            Y3.m.f(j != null);
            return this.c(j, d, g, n);
        }
        final ArrayList list = new ArrayList();
        final Iterator<Map.Entry<K, j>> iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            list.addAll(this.c(iterator.next().getValue(), d, g, n));
        }
        return list;
    }
    
    public final List c(final j j, final d d, final G g, final n n) {
        final j.a b = j.b(d, g, n);
        if (!j.h().g()) {
            final HashSet<b> set = new HashSet<b>();
            final HashSet<b> set2 = new HashSet<b>();
            for (final c c : b.b) {
                final a4.e.a i = c.j();
                if (i == a4.e.a.p) {
                    set2.add(c.i());
                }
                else {
                    if (i != a4.e.a.o) {
                        continue;
                    }
                    set.add(c.i());
                }
            }
            if (!set2.isEmpty() || !set.isEmpty()) {
                this.b.l(j.h(), set2, set);
            }
        }
        return b.a;
    }
    
    public n d(final k k) {
        final Iterator<j> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            final n e = iterator.next().e(k);
            if (e != null) {
                return e;
            }
        }
        return null;
    }
    
    public j e() {
        final Iterator<Map.Entry<K, j>> iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            final j j = iterator.next().getValue();
            if (j.h().g()) {
                return j;
            }
        }
        return null;
    }
    
    public List f() {
        final ArrayList<j> list = new ArrayList<j>();
        final Iterator<Map.Entry<K, j>> iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            final j j = iterator.next().getValue();
            if (!j.h().g()) {
                list.add(j);
            }
        }
        return list;
    }
    
    public j g(final i i, final G g, final a a) {
        final j j = this.a.get(i.d());
        if (j == null) {
            n b;
            if (a.f()) {
                b = a.b();
            }
            else {
                b = null;
            }
            final n b2 = g.b(b);
            boolean b3;
            n e;
            if (b2 != null) {
                b3 = true;
                e = b2;
            }
            else {
                n n;
                if (a.b() != null) {
                    n = a.b();
                }
                else {
                    n = g.W();
                }
                e = g.e(n);
                b3 = false;
            }
            return new j(i, new a4.k(new a(d4.i.f(e, i.c()), b3, false), a));
        }
        return j;
    }
    
    public boolean h() {
        return this.e() != null;
    }
    
    public boolean i() {
        return this.a.isEmpty();
    }
    
    public Y3.g j(final i i, final h h, final Q3.c c) {
        final ArrayList<i> list = new ArrayList<i>();
        final ArrayList list2 = new ArrayList();
        final boolean h2 = this.h();
        if (i.f()) {
            final Iterator<Map.Entry<K, j>> iterator = this.a.entrySet().iterator();
            while (iterator.hasNext()) {
                final j j = iterator.next().getValue();
                list2.addAll(j.k(h, c));
                if (j.j()) {
                    iterator.remove();
                    if (j.h().g()) {
                        continue;
                    }
                    list.add(j.h());
                }
            }
        }
        else {
            final j k = this.a.get(i.d());
            if (k != null) {
                list2.addAll(k.k(h, c));
                if (k.j()) {
                    this.a.remove(i.d());
                    if (!k.h().g()) {
                        list.add(k.h());
                    }
                }
            }
        }
        if (h2 && !this.h()) {
            list.add(i.a(i.e()));
        }
        return new Y3.g(list, list2);
    }
    
    public boolean k(final i i) {
        return this.l(i) != null;
    }
    
    public j l(final i i) {
        if (i.g()) {
            return this.e();
        }
        return this.a.get(i.d());
    }
}
