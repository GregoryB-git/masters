/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package a4;

import V3.G;
import W3.d;
import W3.e;
import a4.b;
import a4.c;
import a4.f;
import a4.h;
import a4.i;
import a4.k;
import a4.l;
import b4.d;
import d4.g;
import d4.m;
import d4.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class j {
    public final i a;
    public final l b;
    public k c;
    public final List d;
    public final f e;

    public j(i i8, k object) {
        this.a = i8;
        Object object2 = new b4.b(i8.c());
        d d8 = i8.d().j();
        this.b = new l(d8);
        a4.a a8 = object.d();
        object = object.c();
        d4.i i9 = d4.i.f(g.W(), i8.c());
        d4.i i10 = object2.f(i9, a8.a(), null);
        i9 = d8.f(i9, object.a(), null);
        object2 = new a4.a(i10, a8.f(), object2.d());
        this.c = new k(new a4.a(i9, object.f(), d8.d()), (a4.a)object2);
        this.d = new ArrayList();
        this.e = new f(i8);
    }

    public void a(V3.h h8) {
        this.d.add((Object)h8);
    }

    public a b(W3.d object, G object2, n n8) {
        boolean bl;
        block5 : {
            block4 : {
                Object object3 = object.c();
                d.a a8 = d.a.p;
                boolean bl2 = false;
                if (object3 == a8 && object.b().b() != null) {
                    bl = this.c.b() != null;
                    Y3.m.g(bl, "We should always have a full cache before handling merges");
                    bl = this.c.a() != null;
                    Y3.m.g(bl, "Missing event cache, even though we have a server cache");
                }
                object3 = this.c;
                object = this.b.b((k)object3, (W3.d)object, (G)object2, n8);
                if (object.a.d().f()) break block4;
                bl = bl2;
                if (object3.d().f()) break block5;
            }
            bl = true;
        }
        Y3.m.g(bl, "Once a server snap is complete, it should never go back");
        this.c = object2 = object.a;
        return new a(this.c(object.b, object2.c().a(), null), object.b);
    }

    public final List c(List list, d4.i i8, V3.h h8) {
        h8 = h8 == null ? this.d : Arrays.asList((Object[])new V3.h[]{h8});
        return this.e.d(list, i8, (List)h8);
    }

    public n d() {
        return this.c.a();
    }

    public n e(V3.k k8) {
        n n8 = this.c.b();
        if (n8 != null && (this.a.g() || !k8.isEmpty() && !n8.v(k8.Z()).isEmpty())) {
            return n8.A(k8);
        }
        return null;
    }

    public n f() {
        return this.c.c().b();
    }

    public List g(V3.h h8) {
        a4.a a8 = this.c.c();
        ArrayList arrayList = new ArrayList();
        for (m m8 : a8.b()) {
            arrayList.add((Object)c.c(m8.c(), m8.d()));
        }
        if (a8.f()) {
            arrayList.add((Object)c.n(a8.a()));
        }
        return this.c((List)arrayList, a8.a(), h8);
    }

    public i h() {
        return this.a;
    }

    public n i() {
        return this.c.d().b();
    }

    public boolean j() {
        return this.d.isEmpty();
    }

    public List k(V3.h h8, Q3.c object) {
        List list;
        int n8 = 0;
        if (object != null) {
            ArrayList arrayList = new ArrayList();
            boolean bl = h8 == null;
            Y3.m.g(bl, "A cancel should cancel all event registrations");
            V3.k k8 = this.a.e();
            Iterator iterator = this.d.iterator();
            do {
                list = arrayList;
                if (iterator.hasNext()) {
                    arrayList.add((Object)new b((V3.h)iterator.next(), (Q3.c)object, k8));
                    continue;
                }
                break;
            } while (true);
        } else {
            list = Collections.emptyList();
        }
        if (h8 != null) {
            block12 : {
                int n9 = -1;
                while (n8 < this.d.size()) {
                    object = (V3.h)this.d.get(n8);
                    if (object.f(h8)) {
                        if (object.h()) break block12;
                        n9 = n8;
                    }
                    ++n8;
                }
                n8 = n9;
            }
            if (n8 != -1) {
                h8 = (V3.h)this.d.get(n8);
                this.d.remove(n8);
                h8.l();
                return list;
            }
        } else {
            h8 = this.d.iterator();
            while (h8.hasNext()) {
                ((V3.h)h8.next()).l();
            }
            this.d.clear();
        }
        return list;
    }

    public static class a {
        public final List a;
        public final List b;

        public a(List list, List list2) {
            this.a = list;
            this.b = list2;
        }
    }

}

