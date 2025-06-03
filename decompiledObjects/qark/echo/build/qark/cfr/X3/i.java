/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package X3;

import V3.k;
import X3.a;
import X3.f;
import X3.g;
import X3.h;
import Y3.d;
import Y3.m;
import c4.c;
import d4.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class i {
    public static final Y3.i f = new Y3.i(){

        public boolean b(Map object) {
            if ((object = (h)object.get((Object)a4.h.i)) != null && object.d) {
                return true;
            }
            return false;
        }
    };
    public static final Y3.i g = new Y3.i(){

        public boolean b(Map object) {
            if ((object = (h)object.get((Object)a4.h.i)) != null && object.e) {
                return true;
            }
            return false;
        }
    };
    public static final Y3.i h = new Y3.i(){

        public boolean b(h h8) {
            return h8.e ^ true;
        }
    };
    public static final Y3.i i = new Y3.i(){

        public boolean b(h h8) {
            return h.a(h8) ^ true;
        }
    };
    public d a;
    public final f b;
    public final c c;
    public final Y3.a d;
    public long e = 0L;

    public i(f f8, c object2, Y3.a a8) {
        this.b = f8;
        this.c = object2;
        this.d = a8;
        this.a = new d(null);
        this.r();
        for (Object object2 : f8.n()) {
            this.e = Math.max((long)(object2.a + 1L), (long)this.e);
            this.d((h)object2);
        }
    }

    public static void c(a4.i i8) {
        boolean bl = !i8.g() || i8.f();
        m.g(bl, "Can't have tracked non-default query that loads all data");
    }

    public static long e(a a8, long l8) {
        float f8 = a8.b();
        return l8 - Math.min((long)((long)Math.floor((double)((float)l8 * (1.0f - f8)))), (long)a8.c());
    }

    public static a4.i o(a4.i i8) {
        a4.i i9 = i8;
        if (i8.g()) {
            i9 = a4.i.a(i8.e());
        }
        return i9;
    }

    public final void d(h h8) {
        i.c(h8.b);
        Object object = (Map)this.a.s(h8.b.e());
        Map map = object;
        if (object == null) {
            map = new HashMap();
            this.a = this.a.W(h8.b.e(), (Object)map);
        }
        boolean bl = (object = (h)map.get((Object)h8.b.d())) == null || object.a == h8.a;
        m.f(bl);
        map.put((Object)h8.b.d(), (Object)h8);
    }

    public long f() {
        return this.k(h).size();
    }

    public void g(k object) {
        if (!this.m((k)object)) {
            h h8 = this.i((a4.i)(object = a4.i.a((k)object)));
            if (h8 == null) {
                long l8 = this.e;
                this.e = 1L + l8;
                object = new h(l8, (a4.i)object, this.d.a(), true, false);
            } else {
                m.g(h8.d ^ true, "This should have been handled above!");
                object = h8.b();
            }
            this.s((h)object);
        }
    }

    public final Set h(k k8) {
        HashSet hashSet = new HashSet();
        if ((k8 = (Map)this.a.s(k8)) != null) {
            for (h h8 : k8.values()) {
                if (h8.b.g()) continue;
                hashSet.add((Object)h8.a);
            }
        }
        return hashSet;
    }

    public h i(a4.i i8) {
        Map map = (Map)this.a.s((i8 = i.o(i8)).e());
        if (map != null) {
            return (h)map.get((Object)i8.d());
        }
        return null;
    }

    public Set j(k k8) {
        m.g(this.n(a4.i.a(k8)) ^ true, "Path is fully complete.");
        HashSet hashSet = new HashSet();
        Object object = this.h(k8);
        if (!object.isEmpty()) {
            hashSet.addAll((Collection)this.b.v((Set)object));
        }
        for (Object object2 : this.a.Y(k8).M()) {
            object = (b)object2.getKey();
            if ((object2 = (d)object2.getValue()).getValue() == null || !f.a((Object)((Map)object2.getValue()))) continue;
            hashSet.add(object);
        }
        return hashSet;
    }

    public final List k(Y3.i i8) {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            for (h h8 : ((Map)((Map.Entry)iterator.next()).getValue()).values()) {
                if (!i8.a(h8)) continue;
                arrayList.add((Object)h8);
            }
        }
        return arrayList;
    }

    public boolean l(k k8) {
        if (this.a.V(k8, g) != null) {
            return true;
        }
        return false;
    }

    public final boolean m(k k8) {
        if (this.a.f(k8, f) != null) {
            return true;
        }
        return false;
    }

    public boolean n(a4.i i8) {
        if (this.m(i8.e())) {
            return true;
        }
        if (i8.g()) {
            return false;
        }
        Map map = (Map)this.a.s(i8.e());
        if (map != null && map.containsKey((Object)i8.d()) && ((h)map.get((Object)i8.d())).d) {
            return true;
        }
        return false;
    }

    public g p(a object) {
        StringBuilder stringBuilder;
        Object object2;
        List list = this.k(h);
        long l8 = i.e((a)object, list.size());
        object = new g();
        if (this.c.f()) {
            object2 = this.c;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Pruning old queries.  Prunable: ");
            stringBuilder.append(list.size());
            stringBuilder.append(" Count to prune: ");
            stringBuilder.append(l8);
            object2.b(stringBuilder.toString(), new Object[0]);
        }
        Collections.sort((List)list, (Comparator)new Comparator(){

            public int a(h h8, h h9) {
                return m.b(h8.c, h9.c);
            }
        });
        int n8 = 0;
        while ((long)n8 < l8) {
            object2 = (h)list.get(n8);
            object = object.d(object2.b.e());
            this.q(object2.b);
            ++n8;
        }
        for (n8 = (int)l8; n8 < list.size(); ++n8) {
            object = object.c(((h)list.get((int)n8)).b.e());
        }
        list = this.k(i);
        if (this.c.f()) {
            object2 = this.c;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unprunable queries: ");
            stringBuilder.append(list.size());
            object2.b(stringBuilder.toString(), new Object[0]);
        }
        list = list.iterator();
        while (list.hasNext()) {
            object = object.c(((h)list.next()).b.e());
        }
        return object;
    }

    public void q(a4.i i8) {
        h h8 = this.i(i8 = i.o(i8));
        boolean bl = h8 != null;
        m.g(bl, "Query must exist to be removed.");
        this.b.h(h8.a);
        h8 = (Map)this.a.s(i8.e());
        h8.remove((Object)i8.d());
        if (h8.isEmpty()) {
            this.a = this.a.U(i8.e());
        }
    }

    public final void r() {
        try {
            this.b.g();
            this.b.j(this.d.a());
            this.b.p();
            return;
        }
        finally {
            this.b.f();
        }
    }

    public final void s(h h8) {
        this.d(h8);
        this.b.u(h8);
    }

    public void t(k k8) {
        this.a.Y(k8).q(new d.c(){

            public Void b(k k8, Map object, Void void_) {
                k8 = object.entrySet().iterator();
                while (k8.hasNext()) {
                    object = (h)((Map.Entry)k8.next()).getValue();
                    if (object.d) continue;
                    i.this.s(object.b());
                }
                return null;
            }
        });
    }

    public void u(a4.i i8) {
        this.v(i8, true);
    }

    public final void v(a4.i object, boolean bl) {
        object = i.o((a4.i)object);
        h h8 = this.i((a4.i)object);
        long l8 = this.d.a();
        if (h8 != null) {
            object = h8.c(l8).a(bl);
        } else {
            m.g(bl, "If we're setting the query to inactive, we should already be tracking it!");
            long l9 = this.e;
            this.e = 1L + l9;
            object = new h(l9, (a4.i)object, l8, false, bl);
        }
        this.s((h)object);
    }

    public void w(a4.i object) {
        if ((object = this.i(i.o((a4.i)object))) != null && !object.d) {
            this.s(object.b());
        }
    }

    public void x(a4.i i8) {
        this.v(i8, false);
    }

}

