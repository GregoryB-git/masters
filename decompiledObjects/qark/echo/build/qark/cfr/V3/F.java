/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 */
package V3;

import V3.B;
import V3.G;
import V3.b;
import V3.k;
import Y3.i;
import a4.a;
import d4.g;
import d4.h;
import d4.m;
import d4.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class F {
    public static final i d = new i(){

        public boolean b(B b8) {
            return b8.f();
        }
    };
    public b a = b.s();
    public List b = new ArrayList();
    public Long c = -1L;

    /*
     * Enabled aggressive block sorting
     */
    public static b j(List object, i i8, k k8) {
        b b8 = b.s();
        Iterator iterator = object.iterator();
        object = b8;
        do {
            void var3_7;
            k k9;
            block7 : {
                k k10;
                B b9;
                block10 : {
                    void var3_9;
                    block9 : {
                        k k11;
                        block8 : {
                            block5 : {
                                block6 : {
                                    if (!iterator.hasNext()) {
                                        return object;
                                    }
                                    b9 = (B)iterator.next();
                                    if (!i8.a(b9)) continue;
                                    k11 = b9.c();
                                    if (!b9.e()) break block5;
                                    if (!k8.W(k11)) break block6;
                                    k9 = k.b0(k8, k11);
                                    n n8 = b9.b();
                                    break block7;
                                }
                                if (!k11.W(k8)) continue;
                                object = object.a(k.Y(), b9.b().A(k.b0(k11, k8)));
                                continue;
                            }
                            if (!k8.W(k11)) break block8;
                            k k12 = k.b0(k8, k11);
                            break block9;
                        }
                        if (!k11.W(k8)) continue;
                        k10 = k.b0(k11, k8);
                        if (!k10.isEmpty()) break block10;
                        k k13 = k.Y();
                    }
                    object = object.f((k)var3_9, b9.a());
                    continue;
                }
                n n9 = b9.a().T(k10);
                if (n9 == null) continue;
                k9 = k.Y();
            }
            object = object.a(k9, (n)var3_7);
        } while (true);
    }

    public void a(k k8, b b8, Long l8) {
        boolean bl = l8 > this.c;
        Y3.m.f(bl);
        this.b.add((Object)new B(l8, k8, b8));
        this.a = this.a.f(k8, b8);
        this.c = l8;
    }

    public void b(k k8, n n8, Long l8, boolean bl) {
        boolean bl2 = l8 > this.c;
        Y3.m.f(bl2);
        this.b.add((Object)new B(l8, k8, n8, bl));
        if (bl) {
            this.a = this.a.a(k8, n8);
        }
        this.c = l8;
    }

    public n c(k k8, d4.b b8, a a8) {
        n n8 = this.a.T(k8 = k8.U(b8));
        if (n8 != null) {
            return n8;
        }
        if (a8.c(b8)) {
            return this.a.k(k8).g(a8.b().v(b8));
        }
        return null;
    }

    public n d(k object, n n8, List object2, final boolean bl) {
        if (object2.isEmpty() && !bl) {
            object2 = this.a.T((k)object);
            if (object2 != null) {
                return object2;
            }
            if ((object = this.a.k((k)object)).isEmpty()) {
                return n8;
            }
            if (n8 == null && !object.V(k.Y())) {
                return null;
            }
            if (n8 == null) {
                n8 = g.W();
            }
            return object.g(n8);
        }
        b b8 = this.a.k((k)object);
        if (!bl && b8.isEmpty()) {
            return n8;
        }
        if (!bl && n8 == null && !b8.V(k.Y())) {
            return null;
        }
        object2 = new i((List)object2, (k)object){
            public final /* synthetic */ List c;
            public final /* synthetic */ k d;
            {
                this.c = list;
                this.d = k8;
            }

            public boolean b(B b8) {
                if ((b8.f() || bl) && !this.c.contains((Object)b8.d()) && (b8.c().W(this.d) || this.d.W(b8.c()))) {
                    return true;
                }
                return false;
            }
        };
        object = F.j(this.b, (i)object2, object);
        if (n8 == null) {
            n8 = g.W();
        }
        return object.g(n8);
    }

    public n e(k object, n object22) {
        n n8 = g.W();
        Object object3 = this.a.T((k)object);
        if (object3 != null) {
            object = n8;
            if (!object3.B()) {
                object22 = object3.iterator();
                do {
                    object = n8;
                    if (!object22.hasNext()) break;
                    object = (m)object22.next();
                    n8 = n8.N(object.c(), object.d());
                } while (true);
            }
            return object;
        }
        object = this.a.k((k)object);
        object22 = object22.iterator();
        while (object22.hasNext()) {
            object3 = (m)object22.next();
            n n9 = object.k(new k(object3.c())).g(object3.d());
            n8 = n8.N(object3.c(), n9);
        }
        for (Object object22 : object.S()) {
            n8 = n8.N(object22.c(), object22.d());
        }
        return n8;
    }

    public n f(k object, k k8, n n8, n n9) {
        boolean bl = n8 != null || n9 != null;
        Y3.m.g(bl, "Either existingEventSnap or existingServerSnap must exist");
        object = object.T(k8);
        if (this.a.V((k)object)) {
            return null;
        }
        if ((object = this.a.k((k)object)).isEmpty()) {
            return n9.A(k8);
        }
        return object.g(n9.A(k8));
    }

    public m g(k object, n object2, m m8, boolean bl, h h8) {
        Object object32;
        block4 : {
            b b8;
            Object var7_8;
            Object object32;
            block3 : {
                b8 = this.a.k((k)object);
                object = b8.T(k.Y());
                object32 = null;
                var7_8 = null;
                if (object != null) break block3;
                if (object2 == null) break block4;
                object = b8.g((n)object2);
            }
            b8 = object.iterator();
            object = var7_8;
            do {
                object32 = object;
                if (!b8.hasNext()) break;
                object2 = (m)b8.next();
                if (h8.a((m)object2, m8, bl) <= 0 || object != null && h8.a((m)object2, (m)object, bl) >= 0) continue;
                object = object2;
            } while (true);
        }
        return object32;
    }

    public G h(k k8) {
        return new G(k8, this);
    }

    public B i(long l8) {
        for (B b8 : this.b) {
            if (b8.d() != l8) continue;
            return b8;
        }
        return null;
    }

    public List k() {
        ArrayList arrayList = new ArrayList((Collection)this.b);
        this.a = b.s();
        this.b = new ArrayList();
        return arrayList;
    }

    public final boolean l(B b8, k k8) {
        if (b8.e()) {
            return b8.c().W(k8);
        }
        for (Map.Entry entry : b8.a()) {
            if (!b8.c().T((k)entry.getKey()).W(k8)) continue;
            return true;
        }
        return false;
    }

    public boolean m(long l8) {
        Object object;
        int n8;
        B b8;
        block11 : {
            object = this.b.iterator();
            n8 = 0;
            while (object.hasNext()) {
                b8 = (B)object.next();
                if (b8.d() != l8) {
                    ++n8;
                    continue;
                }
                break block11;
            }
            b8 = null;
        }
        boolean bl = b8 != null;
        Y3.m.g(bl, "removeWrite called with nonexistent writeId");
        this.b.remove((Object)b8);
        bl = b8.f();
        boolean bl2 = false;
        for (int i8 = this.b.size() - 1; bl && i8 >= 0; --i8) {
            object = (B)this.b.get(i8);
            boolean bl3 = bl2;
            boolean bl4 = bl;
            if (object.f()) {
                if (i8 >= n8 && this.l((B)object, b8.c())) {
                    bl4 = false;
                    bl3 = bl2;
                } else {
                    bl3 = bl2;
                    bl4 = bl;
                    if (b8.c().W(object.c())) {
                        bl3 = true;
                        bl4 = bl;
                    }
                }
            }
            bl2 = bl3;
            bl = bl4;
        }
        if (!bl) {
            return false;
        }
        if (bl2) {
            this.n();
            return true;
        }
        if (b8.e()) {
            this.a = this.a.W(b8.c());
            return true;
        }
        object = b8.a().iterator();
        while (object.hasNext()) {
            k k8 = (k)((Map.Entry)object.next()).getKey();
            this.a = this.a.W(b8.c().T(k8));
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void n() {
        long l8;
        this.a = F.j(this.b, d, k.Y());
        if (this.b.size() > 0) {
            List list = this.b;
            l8 = ((B)list.get(list.size() - 1)).d();
        } else {
            l8 = -1L;
        }
        this.c = l8;
    }

    public n o(k k8) {
        return this.a.T(k8);
    }

}

