/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package a4;

import V3.G;
import W3.d;
import W3.e;
import W3.f;
import a4.a;
import a4.k;
import b4.d;
import d4.b;
import d4.g;
import d4.h;
import d4.i;
import d4.j;
import d4.m;
import d4.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class l {
    public static d.a b = new d.a(){

        @Override
        public m a(h h8, m m8, boolean bl) {
            return null;
        }

        @Override
        public n b(b b8) {
            return null;
        }
    };
    public final b4.d a;

    public l(b4.d d8) {
        this.a = d8;
    }

    public static boolean g(k k8, b b8) {
        return k8.c().c(b8);
    }

    public final k a(k k8, V3.k k9, Y3.d object, G g8, n n8, b4.a a8) {
        if (g8.i(k9) != null) {
            return k8;
        }
        boolean bl = k8.d().e();
        Object object22 = k8.d();
        if (object.getValue() != null) {
            if (k9.isEmpty() && object22.f() || object22.d(k9)) {
                return this.d(k8, k9, object22.b().A(k9), g8, n8, bl, a8);
            }
            object = k8;
            if (k9.isEmpty()) {
                object = V3.b.s();
                for (Object object22 : object22.b()) {
                    object = object.d(object22.c(), object22.d());
                }
                object = this.c(k8, k9, (V3.b)object, g8, n8, bl, a8);
            }
            return object;
        }
        Object object3 = V3.b.s();
        Iterator iterator = object.iterator();
        object = object3;
        while (iterator.hasNext()) {
            object3 = (V3.k)((Map.Entry)iterator.next()).getKey();
            V3.k k10 = k9.T((V3.k)object3);
            if (!object22.d(k10)) continue;
            object = object.a((V3.k)object3, object22.b().A(k10));
        }
        return this.c(k8, k9, (V3.b)object, g8, n8, bl, a8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public c b(k k8, W3.d object, G g8, n n8) {
        b4.a a8 = new b4.a();
        int n9 = .a[object.c().ordinal()];
        if (n9 != 1) {
            if (n9 != 2) {
                if (n9 != 3) {
                    if (n9 != 4) {
                        k8 = new StringBuilder();
                        k8.append("Unknown operation: ");
                        k8.append((Object)object.c());
                        throw new AssertionError((Object)k8.toString());
                    }
                    object = this.i(k8, object.a(), g8, n8, a8);
                } else {
                    object = (W3.a)object;
                    boolean bl = object.f();
                    V3.k k9 = object.a();
                    object = !bl ? this.a(k8, k9, object.e(), g8, n8, a8) : this.k(k8, k9, g8, n8, a8);
                }
            } else if ((object = (W3.c)object).b().d()) {
                object = this.e(k8, object.a(), object.e(), g8, n8, a8);
            } else {
                Y3.m.f(object.b().c());
                boolean bl = object.b().e() || k8.d().e();
                object = this.c(k8, object.a(), object.e(), g8, n8, bl, a8);
            }
        } else if ((object = (f)object).b().d()) {
            object = this.f(k8, object.a(), object.e(), g8, n8, a8);
        } else {
            Y3.m.f(object.b().c());
            boolean bl = object.b().e() || k8.d().e() && !object.a().isEmpty();
            object = this.d(k8, object.a(), object.e(), g8, n8, bl, a8);
        }
        g8 = new ArrayList((Collection)a8.a());
        this.j(k8, (k)object, (List)g8);
        return new c((k)object, (List)g8);
    }

    public final k c(k k8, V3.k object, V3.b object2, G g8, n n8, boolean bl, b4.a a8) {
        Object object3;
        if (k8.d().b().isEmpty() && !k8.d().f()) {
            return k8;
        }
        boolean bl2 = object2.X() == null;
        Y3.m.g(bl2, "Can't have a merge that is an overwrite");
        object = object.isEmpty() ? object2 : V3.b.s().f((V3.k)object, (V3.b)object2);
        object2 = k8.d().b();
        Map map = object.q();
        Object object4 = map.entrySet().iterator();
        object = k8;
        while (object4.hasNext()) {
            object3 = (Map.Entry)object4.next();
            b b8 = (b)object3.getKey();
            if (!object2.Q(b8)) continue;
            n n9 = object2.v(b8);
            object3 = ((V3.b)object3.getValue()).g(n9);
            object = this.d((k)object, new V3.k(b8), (n)object3, g8, n8, bl, a8);
        }
        for (Map.Entry entry : map.entrySet()) {
            object4 = (b)entry.getKey();
            object3 = (V3.b)entry.getValue();
            boolean bl3 = !k8.d().c((b)object4) && object3.X() == null;
            if (object2.Q((b)object4) || bl3) continue;
            object3 = object2.v((b)object4);
            n n10 = ((V3.b)entry.getValue()).g((n)object3);
            object = this.d((k)object, new V3.k(new b[]{object4}), n10, g8, n8, bl, a8);
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final k d(k var1_1, V3.k var2_2, n var3_3, G var4_4, n var5_5, boolean var6_6, b4.a var7_7) {
        block7 : {
            var11_17 = var1_1.d();
            var9_18 = this.a;
            if (!var6_15) {
                var9_18 = var9_18.b();
            }
            var6_15 = var2_2.isEmpty();
            var8_19 = true;
            if (!var6_15) break block7;
            var10_20 = var11_17.a();
            var3_4 = i.f(var3_3 /* !! */ , var9_18.e());
            ** GOTO lbl19
        }
        if (var9_18.d() && !var11_17.e()) {
            Y3.m.g(var2_2.isEmpty() ^ true, "An empty path should have been caught in the other branch");
            var10_20 = var2_2.Z();
            var12_22 = var2_2.c0();
            var3_7 = var11_17.b().v((b)var10_20).y(var12_22, var3_3 /* !! */ );
            var3_8 = var11_17.a().D((b)var10_20, var3_7);
            var10_20 = var11_17.a();
lbl19: // 2 sources:
            var3_6 = var9_18.f((i)var10_20, (i)var3_5, null);
        } else {
            var10_21 = var2_2.Z();
            if (!var11_17.d(var2_2) && var2_2.size() > 1) {
                return var1_1;
            }
            var12_23 = var2_2.c0();
            var3_9 = var11_17.b().v(var10_21).y(var12_23, var3_3 /* !! */ );
            if (var10_21.s()) {
                var3_10 = var9_18.a(var11_17.a(), var3_9);
            } else {
                var3_11 = var9_18.c(var11_17.a(), var10_21, var3_9, var12_23, l.b, null);
            }
        }
        var6_15 = var8_19;
        if (!var11_17.f()) {
            var6_15 = var2_2.isEmpty() != false ? var8_19 : false;
        }
        var1_1 = var1_1.f((i)var3_12, var6_15, var9_18.d());
        return this.h(var1_1, var2_2, (G)var4_13, new d((G)var4_13, var1_1, (n)var5_14), (b4.a)var7_16);
    }

    public final k e(k k8, V3.k k9, V3.b object, G g8, n n8, b4.a a8) {
        Object object2;
        boolean bl = object.X() == null;
        Y3.m.g(bl, "Can't have a merge that is an overwrite");
        Iterator iterator = object.iterator();
        k k10 = k8;
        while (iterator.hasNext()) {
            object2 = (Map.Entry)iterator.next();
            V3.k k11 = k9.T((V3.k)object2.getKey());
            if (!l.g(k8, k11.Z())) continue;
            k10 = this.f(k10, k11, (n)object2.getValue(), g8, n8, a8);
        }
        iterator = object.iterator();
        object = k10;
        while (iterator.hasNext()) {
            k10 = (Map.Entry)iterator.next();
            object2 = k9.T((V3.k)k10.getKey());
            if (l.g(k8, object2.Z())) continue;
            object = this.f((k)object, (V3.k)object2, (n)k10.getValue(), g8, n8, a8);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final k f(k k8, V3.k k9, n n8, G object, n object2, b4.a a8) {
        boolean bl;
        void var2_5;
        n n9;
        void var2_9;
        V3.k k10;
        void var6_15;
        a a9;
        d d8;
        boolean bl2;
        b b8;
        block4 : {
            n n10;
            block2 : {
                block3 : {
                    void var5_13;
                    a9 = k8.c();
                    d8 = new d((G)((Object)d8), k8, (n)var5_13);
                    if (k9.isEmpty()) {
                        i i8 = i.f(n10, this.a.e());
                        return k8.e(this.a.f(k8.c().a(), i8, (b4.a)var6_15), true, this.a.d());
                    }
                    b8 = k9.Z();
                    if (b8.s()) {
                        i i9 = this.a.a(k8.c().a(), n10);
                        bl = a9.f();
                        bl2 = a9.e();
                        return k8.e((i)var2_5, bl, bl2);
                    }
                    k10 = k9.c0();
                    n9 = a9.b().v(b8);
                    if (k10.isEmpty()) break block2;
                    n n11 = d8.b(b8);
                    if (n11 == null) break block3;
                    if (k10.X().s() && n11.A(k10.a0()).isEmpty()) break block4;
                    n10 = n11.y(k10, n10);
                    break block2;
                }
                n10 = g.W();
            }
            void var2_7 = n10;
        }
        if (n9.equals((Object)var2_9)) return k8;
        i i10 = this.a.c(a9.a(), b8, (n)var2_9, k10, d8, (b4.a)var6_15);
        bl = a9.f();
        bl2 = this.a.d();
        return k8.e((i)var2_5, bl, bl2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final k h(k var1_1, V3.k var2_2, G var3_3, d.a var4_4, b4.a var5_5) {
        block10 : {
            block11 : {
                block9 : {
                    var8_6 = var1_1.c();
                    if (var3_3.i(var2_2) != null) {
                        return var1_1;
                    }
                    var6_7 = var2_2.isEmpty();
                    var7_8 = false;
                    if (!var6_7) break block9;
                    Y3.m.g(var1_1.d().f(), "If change path is empty, we must have complete server data");
                    if (var1_1.d().e()) {
                        var4_4 = var1_1.b();
                        if (!(var4_4 instanceof d4.c)) {
                            var4_4 = g.W();
                        }
                        var3_3 = var3_3.e((n)var4_4);
                    } else {
                        var3_3 = var3_3.b(var1_1.b());
                    }
                    var3_3 = i.f((n)var3_3, this.a.e());
                    var3_3 = this.a.f(var1_1.c().a(), (i)var3_3, var5_5);
                    break block10;
                }
                var9_9 = var2_2.Z();
                if (!var9_9.s()) break block11;
                var6_7 = var2_2.size() == 1;
                Y3.m.g(var6_7, "Can't have a priority with additional path components");
                var3_3 = var3_3.f(var2_2, var8_6.b(), var1_1.d().b());
                if (var3_3 == null) ** GOTO lbl-1000
                var3_3 = this.a.a(var8_6.a(), (n)var3_3);
                break block10;
            }
            var10_10 = var2_2.c0();
            if (var8_6.c(var9_9)) {
                var11_11 = var1_1.d().b();
                var3_3 = (var3_3 = var3_3.f(var2_2, var8_6.b(), var11_11)) != null ? var8_6.b().v(var9_9).y(var10_10, (n)var3_3) : var8_6.b().v(var9_9);
            } else {
                var3_3 = var3_3.a(var9_9, var1_1.d());
            }
            if (var3_3 != null) {
                var3_3 = this.a.c(var8_6.a(), var9_9, (n)var3_3, var10_10, (d.a)var4_4, var5_5);
            } else lbl-1000: // 2 sources:
            {
                var3_3 = var8_6.a();
            }
        }
        if (!var8_6.f()) {
            var6_7 = var7_8;
            if (var2_2.isEmpty() == false) return var1_1.e((i)var3_3, var6_7, this.a.d());
        }
        var6_7 = true;
        return var1_1.e((i)var3_3, var6_7, this.a.d());
    }

    public final k i(k k8, V3.k k9, G g8, n object, b4.a a8) {
        object = k8.d();
        i i8 = object.a();
        boolean bl = object.f() || k9.isEmpty();
        return this.h(k8.f(i8, bl, object.e()), k9, g8, b, a8);
    }

    public final void j(k k8, k object, List list) {
        if ((object = object.c()).f()) {
            boolean bl = object.b().B() || object.b().isEmpty();
            if (!list.isEmpty() || !k8.c().f() || bl && !object.b().equals((Object)k8.a()) || !object.b().t().equals((Object)k8.a().t())) {
                list.add((Object)a4.c.n(object.a()));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public k k(k k8, V3.k object, G g8, n object2, b4.a a8) {
        boolean bl;
        block13 : {
            block14 : {
                i i8;
                block9 : {
                    block12 : {
                        d d8;
                        b b8;
                        Object object3;
                        block11 : {
                            block10 : {
                                if (g8.i((V3.k)object) != null) {
                                    return k8;
                                }
                                d8 = new d(g8, k8, (n)object2);
                                i8 = k8.c().a();
                                if (object.isEmpty() || object.Z().s()) break block9;
                                b8 = object.Z();
                                object2 = object3 = g8.a(b8, k8.d());
                                if (object3 == null) {
                                    object2 = object3;
                                    if (k8.d().c(b8)) {
                                        object2 = i8.k().v(b8);
                                    }
                                }
                                if ((object3 = object2) == null) break block10;
                                object2 = this.a;
                                break block11;
                            }
                            object2 = i8;
                            if (object3 != null) break block12;
                            object2 = i8;
                            if (!k8.c().b().Q(b8)) break block12;
                            object2 = this.a;
                            object3 = g.W();
                        }
                        object2 = object2.c(i8, b8, (n)object3, object.c0(), d8, a8);
                    }
                    object = object2;
                    if (!object2.k().isEmpty()) break block13;
                    object = object2;
                    if (!k8.d().f()) break block13;
                    n n8 = g8.b(k8.b());
                    object = object2;
                    if (!n8.B()) break block13;
                    object = n8;
                    break block14;
                }
                if (k8.d().f()) {
                    object = g8.b(k8.b());
                    object2 = i8;
                } else {
                    object = g8.e(k8.d().b());
                    object2 = i8;
                }
            }
            object = i.f((n)object, this.a.e());
            object = this.a.f((i)object2, (i)object, a8);
        }
        if (!k8.d().f() && g8.i(V3.k.Y()) == null) {
            bl = false;
            return k8.e((i)object, bl, this.a.d());
        }
        bl = true;
        return k8.e((i)object, bl, this.a.d());
    }

    public static class c {
        public final k a;
        public final List b;

        public c(k k8, List list) {
            this.a = k8;
            this.b = list;
        }
    }

    public static class d
    implements d.a {
        public final G a;
        public final k b;
        public final n c;

        public d(G g8, k k8, n n8) {
            this.a = g8;
            this.b = k8;
            this.c = n8;
        }

        @Override
        public m a(h h8, m m8, boolean bl) {
            n n8 = this.c;
            if (n8 == null) {
                n8 = this.b.b();
            }
            return this.a.g(n8, m8, bl, h8);
        }

        @Override
        public n b(b b8) {
            Object object = this.b.c();
            if (object.c(b8)) {
                return object.b().v(b8);
            }
            object = this.c;
            object = object != null ? new a(i.f((n)object, j.j()), true, false) : this.b.d();
            return this.a.a(b8, (a)object);
        }
    }

}

