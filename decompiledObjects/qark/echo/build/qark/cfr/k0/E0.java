/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 *  java.util.List
 */
package k0;

import X2.v;
import android.util.Pair;
import d0.I;
import g0.a;
import g0.k;
import java.util.ArrayList;
import java.util.List;
import k0.B0;
import k0.C0;
import k0.D0;
import k0.U0;
import k0.w;
import x0.v;
import x0.x;

public final class E0 {
    public final I.b a;
    public final I.c b;
    public final l0.a c;
    public final k d;
    public final B0.a e;
    public long f;
    public int g;
    public boolean h;
    public B0 i;
    public B0 j;
    public B0 k;
    public int l;
    public Object m;
    public long n;
    public w.c o;
    public List p;

    public E0(l0.a a8, k k8, B0.a a9, w.c c8) {
        this.c = a8;
        this.d = k8;
        this.e = a9;
        this.o = c8;
        this.a = new I.b();
        this.b = new I.c();
        this.p = new ArrayList();
    }

    public static boolean C(I.b b8) {
        boolean bl;
        block8 : {
            boolean bl2;
            int n8;
            block9 : {
                n8 = b8.c();
                bl = bl2 = false;
                if (n8 == 0) break block8;
                if (n8 != 1) break block9;
                bl = bl2;
                if (b8.q(0)) break block8;
            }
            bl = bl2;
            if (b8.r(b8.o())) {
                long l8 = 0L;
                if (b8.e(0L) != -1) {
                    return false;
                }
                if (b8.d == 0L) {
                    return true;
                }
                int n9 = b8.q(n8 - 1) ? 2 : 1;
                for (int i8 = 0; i8 <= n8 - n9; ++i8) {
                    l8 += b8.i(i8);
                }
                bl = bl2;
                if (b8.d <= l8) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public static x.b K(I i8, Object object, long l8, long l9, I.c c8, I.b b8) {
        int n8;
        i8.h(object, b8);
        i8.n(b8.c, c8);
        for (n8 = i8.b((Object)object); E0.C(b8) && n8 <= c8.o; ++n8) {
            i8.g(n8, b8, true);
            object = a.e(b8.b);
        }
        i8.h(object, b8);
        n8 = b8.e(l8);
        if (n8 == -1) {
            return new x.b(object, l9, b8.d(l8));
        }
        return new x.b(object, n8, b8.k(n8), l9);
    }

    public static /* synthetic */ void a(E0 e02, v.a a8, x.b b8) {
        e02.D(a8, b8);
    }

    public static boolean d(long l8, long l9) {
        if (l8 != -9223372036854775807L && l8 != l9) {
            return false;
        }
        return true;
    }

    public final boolean A(I i8, x.b b8) {
        boolean bl = this.y(b8);
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        int n8 = i8.h((Object)b8.a, (I.b)this.a).c;
        int n9 = i8.b(b8.a);
        if (i8.n((int)n8, (I.c)this.b).o == n9) {
            bl2 = true;
        }
        return bl2;
    }

    public boolean B(v v8) {
        B0 b02 = this.k;
        if (b02 != null && b02.a == v8) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void D(v.a a8, x.b b8) {
        this.c.L(a8.k(), b8);
    }

    public final void E() {
        Object object;
        v.a a8 = X2.v.M();
        for (object = this.i; object != null; object = object.k()) {
            a8.h(object.f.a);
        }
        object = this.j;
        object = object == null ? null : object.f.a;
        this.d.j(new D0(this, a8, (x.b)object));
    }

    public void F(long l8) {
        B0 b02 = this.k;
        if (b02 != null) {
            b02.u(l8);
        }
    }

    public final void G(List list) {
        for (int i8 = 0; i8 < this.p.size(); ++i8) {
            ((B0)this.p.get(i8)).v();
        }
        this.p = list;
    }

    public void H() {
        if (!this.p.isEmpty()) {
            this.G((List)new ArrayList());
        }
    }

    public boolean I(B0 b02) {
        a.h(b02);
        boolean bl = b02.equals((Object)this.k);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        this.k = b02;
        while (b02.k() != null) {
            if ((b02 = (B0)a.e(b02.k())) == this.j) {
                this.j = this.i;
                bl2 = true;
            }
            b02.v();
            --this.l;
        }
        ((B0)a.e(this.k)).y(null);
        this.E();
        return bl2;
    }

    public final B0 J(C0 c02) {
        for (int i8 = 0; i8 < this.p.size(); ++i8) {
            if (!((B0)this.p.get(i8)).d(c02)) continue;
            return (B0)this.p.remove(i8);
        }
        return null;
    }

    public x.b L(I i8, Object object, long l8) {
        Object object2;
        long l9 = this.M(i8, object);
        i8.h(object, this.a);
        i8.n(this.a.c, this.b);
        int n8 = i8.b(object);
        boolean bl = false;
        do {
            object2 = object;
            if (n8 < this.b.n) break;
            object2 = this.a;
            boolean bl2 = true;
            i8.g(n8, (I.b)object2, true);
            if (this.a.c() <= 0) {
                bl2 = false;
            }
            bl |= bl2;
            object2 = this.a;
            if (object2.e(object2.d) != -1) {
                object = a.e(this.a.b);
            }
            if (bl) {
                object2 = object;
                if (!bl2) break;
                if (this.a.d != 0L) {
                    object2 = object;
                    break;
                }
            }
            --n8;
        } while (true);
        return E0.K(i8, object2, l8, l9, this.b, this.a);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long M(I i8, Object object) {
        int n8;
        int n9 = i8.h((Object)object, (I.b)this.a).c;
        Object object2 = this.m;
        if (object2 != null && (n8 = i8.b(object2)) != -1 && i8.f((int)n8, (I.b)this.a).c == n9) {
            return this.n;
        }
        for (object2 = this.i; object2 != null; object2 = object2.k()) {
            if (!object2.b.equals(object)) continue;
            return object2.f.a.d;
        }
        for (object2 = this.i; object2 != null; object2 = object2.k()) {
            n8 = i8.b(object2.b);
            if (n8 == -1 || i8.f((int)n8, (I.b)this.a).c != n9) continue;
            return object2.f.a.d;
        }
        long l8 = this.N(object);
        if (l8 != -1L) {
            return l8;
        }
        l8 = this.f;
        this.f = 1L + l8;
        if (this.i != null) return l8;
        this.m = object;
        this.n = l8;
        return l8;
    }

    public final long N(Object object) {
        for (int i8 = 0; i8 < this.p.size(); ++i8) {
            B0 b02 = (B0)this.p.get(i8);
            if (!b02.b.equals(object)) continue;
            return b02.f.a.d;
        }
        return -1L;
    }

    public boolean O() {
        B0 b02 = this.k;
        if (b02 != null && (b02.f.i || !b02.s() || this.k.f.e == -9223372036854775807L || this.l >= 100)) {
            return false;
        }
        return true;
    }

    public final boolean P(I i8) {
        B0 b02 = this.i;
        if (b02 == null) {
            return true;
        }
        int n8 = i8.b(b02.b);
        do {
            n8 = i8.d(n8, this.a, this.b, this.g, this.h);
            while (((B0)a.e(b02)).k() != null && !b02.f.g) {
                b02 = b02.k();
            }
            B0 b03 = b02.k();
            if (n8 == -1 || b03 == null || i8.b(b03.b) != n8) break;
            b02 = b03;
        } while (true);
        boolean bl = this.I(b02);
        b02.f = this.v(i8, b02.f);
        return bl ^ true;
    }

    public void Q(I i8, w.c c8) {
        this.o = c8;
        this.x(i8);
    }

    public boolean R(I i8, long l8, long l9) {
        Object object = this.i;
        Object object2 = null;
        while (object != null) {
            Object object3;
            C0 c02 = object.f;
            if (object2 == null) {
                object2 = this.v(i8, c02);
            } else {
                object3 = this.k(i8, (B0)object2, l8);
                if (object3 == null) {
                    return this.I((B0)object2) ^ true;
                }
                if (!this.e(c02, (C0)object3)) {
                    return this.I((B0)object2) ^ true;
                }
                object2 = object3;
            }
            object.f = object2.a(c02.c);
            if (!E0.d(c02.e, object2.e)) {
                object.C();
                l8 = object2.e;
                l8 = l8 == -9223372036854775807L ? Long.MAX_VALUE : object.B(l8);
                boolean bl = object == this.j && !object.f.f && (l9 == Long.MIN_VALUE || l9 >= l8);
                if (!this.I((B0)object) && !bl) {
                    return true;
                }
                return false;
            }
            object3 = object.k();
            object2 = object;
            object = object3;
        }
        return true;
    }

    public boolean S(I i8, int n8) {
        this.g = n8;
        return this.P(i8);
    }

    public boolean T(I i8, boolean bl) {
        this.h = bl;
        return this.P(i8);
    }

    public B0 b() {
        int n8;
        B0 b02 = this.i;
        if (b02 == null) {
            return null;
        }
        if (b02 == this.j) {
            this.j = b02.k();
        }
        this.i.v();
        this.l = n8 = this.l - 1;
        if (n8 == 0) {
            this.k = null;
            b02 = this.i;
            this.m = b02.b;
            this.n = b02.f.a.d;
        }
        this.i = this.i.k();
        this.E();
        return this.i;
    }

    public B0 c() {
        this.j = ((B0)a.h(this.j)).k();
        this.E();
        return (B0)a.h(this.j);
    }

    public final boolean e(C0 c02, C0 c03) {
        if (c02.b == c03.b && c02.a.equals(c03.a)) {
            return true;
        }
        return false;
    }

    public void f() {
        if (this.l == 0) {
            return;
        }
        this.m = b02.b;
        this.n = b02.f.a.d;
        for (B0 b02 = (B0)a.h((Object)this.i); b02 != null; b02 = b02.k()) {
            b02.v();
        }
        this.i = null;
        this.k = null;
        this.j = null;
        this.l = 0;
        this.E();
    }

    public B0 g(C0 object) {
        B0 b02 = this.k;
        long l8 = b02 == null ? 1000000000000L : b02.m() + this.k.f.e - object.b;
        b02 = this.J((C0)object);
        if (b02 == null) {
            object = this.e.a((C0)object, l8);
        } else {
            b02.f = object;
            b02.z(l8);
            object = b02;
        }
        b02 = this.k;
        if (b02 != null) {
            b02.y((B0)object);
        } else {
            this.i = object;
            this.j = object;
        }
        this.m = null;
        this.k = object;
        ++this.l;
        this.E();
        return object;
    }

    public final Pair h(I i8, Object object, long l8) {
        int n8 = i8.e(i8.h((Object)object, (I.b)this.a).c, this.g, this.h);
        if (n8 != -1) {
            return i8.k(this.b, this.a, n8, -9223372036854775807L, l8);
        }
        return null;
    }

    public final C0 i(U0 u02) {
        return this.n(u02.a, u02.b, u02.c, u02.s);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final C0 j(I i8, B0 object, long l8) {
        long l9;
        C0 c02 = object.f;
        int n8 = i8.d(i8.b(c02.a.a), this.a, this.b, this.g, this.h);
        if (n8 == -1) {
            return null;
        }
        int n9 = i8.g((int)n8, (I.b)this.a, (boolean)true).c;
        Object object2 = a.e(this.a.b);
        long l10 = c02.a.d;
        if (i8.n((int)n9, (I.c)this.b).n == n8) {
            Pair pair = i8.k(this.b, this.a, n9, -9223372036854775807L, Math.max((long)0L, (long)l8));
            if (pair == null) {
                return null;
            }
            object2 = pair.first;
            l9 = (Long)pair.second;
            if ((object = object.k()) != null && object.b.equals(object2)) {
                l8 = object.f.a.d;
            } else {
                l8 = l10 = this.N(object2);
                if (l10 == -1L) {
                    l8 = this.f;
                    this.f = 1L + l8;
                }
            }
            l10 = l8;
            l8 = -9223372036854775807L;
            object = object2;
        } else {
            l8 = 0L;
            object = object2;
            l9 = l8;
        }
        object = E0.K(i8, object, l9, l10, this.b, this.a);
        l10 = l8;
        if (l8 != -9223372036854775807L) {
            l10 = l8;
            if (c02.c != -9223372036854775807L) {
                boolean bl = this.w(c02.a.a, i8);
                if (object.b() && bl) {
                    l10 = c02.c;
                } else {
                    l10 = l8;
                    if (bl) {
                        l9 = c02.c;
                        return this.n(i8, (x.b)object, l8, l9);
                    }
                }
            }
        }
        l8 = l10;
        return this.n(i8, (x.b)object, l8, l9);
    }

    public final C0 k(I i8, B0 b02, long l8) {
        C0 c02 = b02.f;
        l8 = b02.m() + c02.e - l8;
        if (c02.g) {
            return this.j(i8, b02, l8);
        }
        return this.l(i8, b02, l8);
    }

    public final C0 l(I i8, B0 object, long l8) {
        C0 c02 = object.f;
        x.b b8 = c02.a;
        i8.h(b8.a, this.a);
        if (b8.b()) {
            long l9;
            int n8 = b8.b;
            int n9 = this.a.a(n8);
            if (n9 == -1) {
                return null;
            }
            int n10 = this.a.l(n8, b8.c);
            if (n10 < n9) {
                return this.o(i8, b8.a, n8, n10, c02.c, b8.d);
            }
            long l10 = l9 = c02.c;
            if (l9 == -9223372036854775807L) {
                object = this.b;
                I.b b9 = this.a;
                if ((object = i8.k((I.c)object, b9, b9.c, -9223372036854775807L, Math.max((long)0L, (long)l8))) == null) {
                    return null;
                }
                l10 = (Long)object.second;
            }
            l8 = this.r(i8, b8.a, b8.b);
            return this.p(i8, b8.a, Math.max((long)l8, (long)l10), c02.c, b8.d);
        }
        int n11 = b8.e;
        if (n11 != -1 && this.a.q(n11)) {
            return this.j(i8, (B0)object, l8);
        }
        int n12 = this.a.k(b8.e);
        n11 = this.a.r(b8.e) && this.a.h(b8.e, n12) == 3 ? 1 : 0;
        if (n12 != this.a.a(b8.e) && n11 == 0) {
            return this.o(i8, b8.a, b8.e, n12, c02.e, b8.d);
        }
        l8 = this.r(i8, b8.a, b8.e);
        return this.p(i8, b8.a, l8, c02.e, b8.d);
    }

    public B0 m() {
        return this.k;
    }

    public final C0 n(I i8, x.b b8, long l8, long l9) {
        i8.h(b8.a, this.a);
        boolean bl = b8.b();
        Object object = b8.a;
        if (bl) {
            return this.o(i8, object, b8.b, b8.c, l8, b8.d);
        }
        return this.p(i8, object, l9, l8, b8.d);
    }

    public final C0 o(I i8, Object object, int n8, int n9, long l8, long l9) {
        object = new x.b(object, n8, n9, l9);
        long l10 = i8.h(object.a, this.a).b(object.b, object.c);
        l9 = n9 == this.a.k(n8) ? this.a.g() : 0L;
        boolean bl = this.a.r(object.b);
        if (l10 != -9223372036854775807L && l9 >= l10) {
            l9 = Math.max((long)0L, (long)(l10 - 1L));
        }
        return new C0((x.b)object, l9, l8, -9223372036854775807L, l10, bl, false, false, false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final C0 p(I var1_1, Object var2_2, long var3_3, long var5_4, long var7_5) {
        block9 : {
            block8 : {
                block7 : {
                    block6 : {
                        var13_6 = var3_3;
                        var1_1.h(var2_2, this.a);
                        var11_7 = this.a.d(var13_6);
                        var12_8 = 0;
                        var10_9 = var11_7 != -1 && this.a.q(var11_7) != false ? 1 : 0;
                        var21_10 = this.a;
                        if (var11_7 != -1) break block6;
                        if (var21_10.c() <= 0 || !(var21_10 = this.a).r(var21_10.o())) ** GOTO lbl-1000
                        var9_11 = true;
                        break block7;
                    }
                    if (!var21_10.r(var11_7)) ** GOTO lbl-1000
                    var3_3 = this.a.f(var11_7);
                    var21_10 = this.a;
                    if (var3_3 == var21_10.d && var21_10.p(var11_7)) {
                        var9_11 = true;
                        var11_7 = -1;
                    } else lbl-1000: // 3 sources:
                    {
                        var9_11 = false;
                    }
                }
                var2_2 = new x.b(var2_2, var7_5, var11_7);
                var18_12 = this.y((x.b)var2_2);
                var19_13 = this.A(var1_1, (x.b)var2_2);
                var20_14 = this.z(var1_1, (x.b)var2_2, var18_12);
                var17_15 = var11_7 != -1 && this.a.r(var11_7) != false && var10_9 == 0;
                var3_3 = var11_7 != -1 && var10_9 == 0 ? this.a.f(var11_7) : (var9_11 != false ? this.a.d : -9223372036854775807L);
                var7_5 = var3_3 != -9223372036854775807L && var3_3 != Long.MIN_VALUE ? var3_3 : this.a.d;
                var15_16 = var13_6;
                if (var7_5 == -9223372036854775807L) return new C0((x.b)var2_2, var15_16, var5_4, var3_3, var7_5, var17_15, var18_12, var19_13, var20_14);
                var15_16 = var13_6;
                if (var13_6 < var7_5) return new C0((x.b)var2_2, var15_16, var5_4, var3_3, var7_5, var17_15, var18_12, var19_13, var20_14);
                if (var20_14) break block8;
                var10_9 = var12_8;
                if (var9_11) break block9;
            }
            var10_9 = 1;
        }
        var15_16 = Math.max((long)0L, (long)(var7_5 - (long)var10_9));
        return new C0((x.b)var2_2, var15_16, var5_4, var3_3, var7_5, var17_15, var18_12, var19_13, var20_14);
    }

    public final C0 q(I i8, Object object, long l8, long l9) {
        object = E0.K(i8, object, l8, l9, this.b, this.a);
        boolean bl = object.b();
        Object object2 = object.a;
        if (bl) {
            return this.o(i8, object2, object.b, object.c, l8, object.d);
        }
        return this.p(i8, object2, l8, -9223372036854775807L, object.d);
    }

    public final long r(I i8, Object object, int n8) {
        i8.h(object, this.a);
        long l8 = this.a.f(n8);
        if (l8 == Long.MIN_VALUE) {
            return this.a.d;
        }
        return l8 + this.a.i(n8);
    }

    public C0 s(long l8, U0 u02) {
        B0 b02 = this.k;
        if (b02 == null) {
            return this.i(u02);
        }
        return this.k(u02.a, b02, l8);
    }

    public B0 t() {
        return this.i;
    }

    public B0 u() {
        return this.j;
    }

    public C0 v(I i8, C0 c02) {
        boolean bl;
        x.b b8;
        boolean bl2;
        long l8;
        boolean bl3;
        long l9;
        boolean bl4;
        int n8;
        b8 = c02.a;
        bl4 = this.y(b8);
        bl3 = this.A(i8, b8);
        bl2 = this.z(i8, b8, bl4);
        i8.h(c02.a.a, this.a);
        l9 = !b8.b() && (n8 = b8.e) != -1 ? this.a.f(n8) : -9223372036854775807L;
        l8 = b8.b() ? this.a.b(b8.b, b8.c) : (l9 != -9223372036854775807L && l9 != Long.MIN_VALUE ? l9 : this.a.j());
        bl = b8.b() ? this.a.r(b8.b) : (n8 = b8.e) != -1 && this.a.r(n8);
        return new C0(b8, c02.b, c02.c, l9, l8, bl, bl4, bl3, bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean w(Object object, I i8) {
        int n8 = i8.h(object, this.a).c();
        int n9 = this.a.o();
        if (n8 <= 0) return false;
        if (!this.a.r(n9)) return false;
        boolean bl = true;
        if (n8 > 1) return bl;
        if (this.a.f(n9) == Long.MIN_VALUE) return false;
        return true;
    }

    public void x(I object) {
        B0 b02;
        if (this.o.a != -9223372036854775807L && (b02 = this.k) != null) {
            ArrayList arrayList = new ArrayList();
            Object object2 = this.h((I)object, b02.f.a.a, 0L);
            if (object2 != null && !object.n(object.h((Object)object2.first, (I.b)this.a).c, this.b).f()) {
                long l8;
                long l9 = l8 = this.N(object2.first);
                if (l8 == -1L) {
                    l9 = this.f;
                    this.f = 1L + l9;
                }
                C0 c02 = this.q((I)object, object2.first, (Long)object2.second, l9);
                object = object2 = this.J(c02);
                if (object2 == null) {
                    l9 = b02.m();
                    l8 = b02.f.e;
                    long l10 = c02.b;
                    object = this.e.a(c02, l9 + l8 - l10);
                }
                arrayList.add(object);
            }
            this.G((List)arrayList);
            return;
        }
        this.H();
    }

    public final boolean y(x.b b8) {
        if (!b8.b() && b8.e == -1) {
            return true;
        }
        return false;
    }

    public final boolean z(I i8, x.b b8, boolean bl) {
        int n8 = i8.b(b8.a);
        if (!i8.n((int)i8.f((int)n8, (I.b)this.a).c, (I.c)this.b).i && i8.r(n8, this.a, this.b, this.g, this.h) && bl) {
            return true;
        }
        return false;
    }
}

