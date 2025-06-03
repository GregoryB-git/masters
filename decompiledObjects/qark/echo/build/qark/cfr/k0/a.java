/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Object
 */
package k0;

import android.util.Pair;
import d0.I;
import x0.T;

public abstract class a
extends I {
    public final int e;
    public final T f;
    public final boolean g;

    public a(boolean bl, T t8) {
        this.g = bl;
        this.f = t8;
        this.e = t8.a();
    }

    public static Object v(Object object) {
        return ((Pair)object).second;
    }

    public static Object w(Object object) {
        return ((Pair)object).first;
    }

    public static Object y(Object object, Object object2) {
        return Pair.create((Object)object, (Object)object2);
    }

    public abstract int A(int var1);

    public final int B(int n8, boolean bl) {
        if (bl) {
            return this.f.c(n8);
        }
        if (n8 < this.e - 1) {
            return n8 + 1;
        }
        return -1;
    }

    public final int C(int n8, boolean bl) {
        if (bl) {
            return this.f.f(n8);
        }
        if (n8 > 0) {
            return n8 - 1;
        }
        return -1;
    }

    public abstract I D(int var1);

    @Override
    public int a(boolean bl) {
        if (this.e == 0) {
            return -1;
        }
        boolean bl2 = this.g;
        int n8 = 0;
        if (bl2) {
            bl = false;
        }
        if (bl) {
            n8 = this.f.e();
        }
        while (this.D(n8).q()) {
            int n9;
            n8 = n9 = this.B(n8, bl);
            if (n9 != -1) continue;
            return -1;
        }
        return this.A(n8) + this.D(n8).a(bl);
    }

    @Override
    public final int b(Object object) {
        if (!(object instanceof Pair)) {
            return -1;
        }
        Object object2 = a.w(object);
        object = a.v(object);
        int n8 = this.s(object2);
        if (n8 == -1) {
            return -1;
        }
        int n9 = this.D(n8).b(object);
        if (n9 == -1) {
            return -1;
        }
        return this.z(n8) + n9;
    }

    @Override
    public int c(boolean bl) {
        int n8 = this.e;
        if (n8 == 0) {
            return -1;
        }
        if (this.g) {
            bl = false;
        }
        n8 = bl ? this.f.g() : --n8;
        while (this.D(n8).q()) {
            int n9;
            n8 = n9 = this.C(n8, bl);
            if (n9 != -1) continue;
            return -1;
        }
        return this.A(n8) + this.D(n8).c(bl);
    }

    @Override
    public int e(int n8, int n9, boolean bl) {
        boolean bl2 = this.g;
        int n10 = 0;
        int n11 = n9;
        if (bl2) {
            n11 = n9;
            if (n9 == 1) {
                n11 = 2;
            }
            bl = false;
        }
        int n12 = this.u(n8);
        int n13 = this.A(n12);
        I i8 = this.D(n12);
        n9 = n11 == 2 ? n10 : n11;
        if ((n8 = i8.e(n8 - n13, n9, bl)) != -1) {
            return n13 + n8;
        }
        n8 = this.B(n12, bl);
        while (n8 != -1 && this.D(n8).q()) {
            n8 = this.B(n8, bl);
        }
        if (n8 != -1) {
            return this.A(n8) + this.D(n8).a(bl);
        }
        if (n11 == 2) {
            return this.a(bl);
        }
        return -1;
    }

    @Override
    public final I.b g(int n8, I.b b8, boolean bl) {
        int n9 = this.t(n8);
        int n10 = this.A(n9);
        int n11 = this.z(n9);
        this.D(n9).g(n8 - n11, b8, bl);
        b8.c += n10;
        if (bl) {
            b8.b = a.y(this.x(n9), g0.a.e(b8.b));
        }
        return b8;
    }

    @Override
    public final I.b h(Object object, I.b b8) {
        Object object2 = a.w(object);
        Object object3 = a.v(object);
        int n8 = this.s(object2);
        int n9 = this.A(n8);
        this.D(n8).h(object3, b8);
        b8.c += n9;
        b8.b = object;
        return b8;
    }

    @Override
    public int l(int n8, int n9, boolean bl) {
        boolean bl2 = this.g;
        int n10 = 0;
        int n11 = n9;
        if (bl2) {
            n11 = n9;
            if (n9 == 1) {
                n11 = 2;
            }
            bl = false;
        }
        int n12 = this.u(n8);
        int n13 = this.A(n12);
        I i8 = this.D(n12);
        n9 = n11 == 2 ? n10 : n11;
        if ((n8 = i8.l(n8 - n13, n9, bl)) != -1) {
            return n13 + n8;
        }
        n8 = this.C(n12, bl);
        while (n8 != -1 && this.D(n8).q()) {
            n8 = this.C(n8, bl);
        }
        if (n8 != -1) {
            return this.A(n8) + this.D(n8).c(bl);
        }
        if (n11 == 2) {
            return this.c(bl);
        }
        return -1;
    }

    @Override
    public final Object m(int n8) {
        int n9 = this.t(n8);
        int n10 = this.z(n9);
        Object object = this.D(n9).m(n8 - n10);
        return a.y(this.x(n9), object);
    }

    @Override
    public final I.c o(int n8, I.c c8, long l8) {
        int n9 = this.u(n8);
        int n10 = this.A(n9);
        int n11 = this.z(n9);
        this.D(n9).o(n8 - n10, c8, l8);
        Object object = this.x(n9);
        if (!I.c.q.equals(c8.a)) {
            object = a.y(object, c8.a);
        }
        c8.a = object;
        c8.n += n11;
        c8.o += n11;
        return c8;
    }

    public abstract int s(Object var1);

    public abstract int t(int var1);

    public abstract int u(int var1);

    public abstract Object x(int var1);

    public abstract int z(int var1);
}

