/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 */
package a4;

import a4.c;
import a4.d;
import a4.e;
import a4.i;
import d4.b;
import d4.h;
import d4.m;
import d4.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class f {
    public final i a;
    public final h b;

    public f(i i8) {
        this.a = i8;
        this.b = i8.c();
    }

    public final Comparator b() {
        return new Comparator(){

            public int a(c object, c object2) {
                boolean bl = object.i() != null && object2.i() != null;
                Y3.m.f(bl);
                object = new m(object.i(), object.k().k());
                object2 = new m(object2.i(), object2.k().k());
                return f.this.b.compare(object, object2);
            }
        };
    }

    public final d c(c c8, V3.h h8, d4.i i8) {
        c c9 = c8;
        if (!c8.j().equals((Object)e.a.s)) {
            c9 = c8.j().equals((Object)e.a.o) ? c8 : c8.a(i8.q(c8.i(), c8.k().k(), this.b));
        }
        return h8.b(c9, this.a);
    }

    public List d(List list, d4.i i8, List list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (c c8 : list) {
            if (!c8.j().equals((Object)e.a.r) || !this.b.d(c8.l().k(), c8.k().k())) continue;
            arrayList2.add((Object)c.f(c8.i(), c8.k()));
        }
        this.e((List)arrayList, e.a.o, list, list2, i8);
        this.e((List)arrayList, e.a.p, list, list2, i8);
        this.e((List)arrayList, e.a.q, (List)arrayList2, list2, i8);
        this.e((List)arrayList, e.a.r, list, list2, i8);
        this.e((List)arrayList, e.a.s, list, list2, i8);
        return arrayList;
    }

    public final void e(List list, e.a a8, List list2, List list3, d4.i i8) {
        Object object = new ArrayList();
        for (c c8 : list2) {
            if (!c8.j().equals((Object)a8)) continue;
            object.add((Object)c8);
        }
        Collections.sort((List)object, (Comparator)this.b());
        list2 = object.iterator();
        while (list2.hasNext()) {
            object = (c)list2.next();
            for (V3.h h8 : list3) {
                if (!h8.i(a8)) continue;
                list.add((Object)this.c((c)object, h8, i8));
            }
        }
    }

}

