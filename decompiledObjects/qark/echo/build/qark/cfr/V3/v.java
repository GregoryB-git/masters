/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package V3;

import V3.G;
import V3.h;
import V3.k;
import W3.d;
import X3.e;
import a4.a;
import a4.c;
import a4.e;
import a4.j;
import d4.b;
import d4.g;
import d4.i;
import d4.m;
import d4.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class v {
    public final Map a = new HashMap();
    public final e b;

    public v(e e8) {
        this.b = e8;
    }

    public List a(h h8, G object, a a8) {
        a4.i i8 = h8.e();
        object = this.g(i8, (G)object, a8);
        if (!i8.g()) {
            a8 = new HashSet();
            Iterator iterator = object.f().iterator();
            while (iterator.hasNext()) {
                a8.add((Object)((m)iterator.next()).c());
            }
            this.b.o(i8, (Set)a8);
        }
        if (!this.a.containsKey((Object)i8.d())) {
            this.a.put((Object)i8.d(), object);
        }
        this.a.put((Object)i8.d(), object);
        object.a(h8);
        return object.g(h8);
    }

    public List b(d d8, G g8, n n8) {
        Object object = d8.b().b();
        if (object != null) {
            boolean bl = (object = (j)this.a.get(object)) != null;
            Y3.m.f(bl);
            return this.c((j)object, d8, g8, n8);
        }
        object = new ArrayList();
        Iterator iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            object.addAll((Collection)this.c((j)((Map.Entry)iterator.next()).getValue(), d8, g8, n8));
        }
        return object;
    }

    public final List c(j j8, d object, G g8, n n8) {
        object = j8.b((d)object, g8, n8);
        if (!j8.h().g()) {
            g8 = new HashSet();
            n8 = new HashSet();
            for (c c8 : object.b) {
                e.a a8 = c8.j();
                if (a8 == e.a.p) {
                    n8.add((Object)c8.i());
                    continue;
                }
                if (a8 != e.a.o) continue;
                g8.add((Object)c8.i());
            }
            if (!n8.isEmpty() || !g8.isEmpty()) {
                this.b.l(j8.h(), (Set)n8, (Set)g8);
            }
        }
        return object.a;
    }

    public n d(k k8) {
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            n n8 = ((j)iterator.next()).e(k8);
            if (n8 == null) continue;
            return n8;
        }
        return null;
    }

    public j e() {
        Iterator iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            j j8 = (j)((Map.Entry)iterator.next()).getValue();
            if (!j8.h().g()) continue;
            return j8;
        }
        return null;
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            j j8 = (j)((Map.Entry)iterator.next()).getValue();
            if (j8.h().g()) continue;
            arrayList.add((Object)j8);
        }
        return arrayList;
    }

    public j g(a4.i i8, G object, a a8) {
        Object object2 = (j)this.a.get((Object)i8.d());
        if (object2 == null) {
            boolean bl;
            object2 = a8.f() ? a8.b() : null;
            if ((object2 = object.b((n)object2)) != null) {
                bl = true;
                object = object2;
            } else {
                object2 = a8.b() != null ? a8.b() : g.W();
                object = object.e((n)object2);
                bl = false;
            }
            return new j(i8, new a4.k(new a(i.f((n)object, i8.c()), bl, false), a8));
        }
        return object2;
    }

    public boolean h() {
        if (this.e() != null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        return this.a.isEmpty();
    }

    public Y3.g j(a4.i i8, h h8, Q3.c c8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean bl = this.h();
        if (i8.f()) {
            Iterator iterator = this.a.entrySet().iterator();
            while (iterator.hasNext()) {
                j j8 = (j)((Map.Entry)iterator.next()).getValue();
                arrayList2.addAll((Collection)j8.k(h8, c8));
                if (!j8.j()) continue;
                iterator.remove();
                if (j8.h().g()) continue;
                arrayList.add((Object)j8.h());
            }
        } else {
            j j9 = (j)this.a.get((Object)i8.d());
            if (j9 != null) {
                arrayList2.addAll((Collection)j9.k(h8, c8));
                if (j9.j()) {
                    this.a.remove((Object)i8.d());
                    if (!j9.h().g()) {
                        arrayList.add((Object)j9.h());
                    }
                }
            }
        }
        if (bl && !this.h()) {
            arrayList.add((Object)a4.i.a(i8.e()));
        }
        return new Y3.g((Object)arrayList, (Object)arrayList2);
    }

    public boolean k(a4.i i8) {
        if (this.l(i8) != null) {
            return true;
        }
        return false;
    }

    public j l(a4.i i8) {
        if (i8.g()) {
            return this.e();
        }
        return (j)this.a.get((Object)i8.d());
    }
}

