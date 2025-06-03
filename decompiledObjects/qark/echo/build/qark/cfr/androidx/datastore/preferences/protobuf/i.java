/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z;
import java.util.List;
import java.util.Map;

public final class i
implements d0 {
    public final h a;
    public int b;
    public int c;
    public int d = 0;

    public i(h h8) {
        this.a = h8 = (h)y.b(h8, "input");
        h8.d = this;
    }

    public static i O(h h8) {
        i i8 = h8.d;
        if (i8 != null) {
            return i8;
        }
        return new i(h8);
    }

    private Object P(r0.b b8, Class class_, o o8) {
        switch (.a[b8.ordinal()]) {
            default: {
                throw new RuntimeException("unsupported field type.");
            }
            case 17: {
                return this.c();
            }
            case 16: {
                return this.w();
            }
            case 15: {
                return this.F();
            }
            case 14: {
                return this.j();
            }
            case 13: {
                return this.h();
            }
            case 12: {
                return this.r();
            }
            case 11: {
                return this.z();
            }
            case 10: {
                return this.S(class_, o8);
            }
            case 9: {
                return this.E();
            }
            case 8: {
                return this.x();
            }
            case 7: {
                return Float.valueOf((float)this.readFloat());
            }
            case 6: {
                return this.f();
            }
            case 5: {
                return this.n();
            }
            case 4: {
                return this.b();
            }
            case 3: {
                return this.readDouble();
            }
            case 2: {
                return this.u();
            }
            case 1: 
        }
        return this.o();
    }

    private Object Q(e0 e02, o o8) {
        block3 : {
            Object object;
            int n8 = this.c;
            this.c = r0.c(r0.a(this.b), 4);
            try {
                object = e02.f();
                e02.h(object, this, o8);
                e02.b(object);
                int n9 = this.b;
                int n10 = this.c;
                if (n9 != n10) break block3;
            }
            catch (Throwable throwable) {
                this.c = n8;
                throw throwable;
            }
            this.c = n8;
            return object;
        }
        throw z.g();
    }

    private Object R(e0 object, o o8) {
        int n8 = this.a.C();
        Object object2 = this.a;
        if (object2.a < object2.b) {
            n8 = object2.l(n8);
            object2 = object.f();
            h h8 = this.a;
            ++h8.a;
            object.h(object2, this, o8);
            object.b(object2);
            this.a.a(0);
            object = this.a;
            --object.a;
            object.k(n8);
            return object2;
        }
        throw z.h();
    }

    private void U(int n8) {
        if (this.a.d() == n8) {
            return;
        }
        throw z.k();
    }

    private void V(int n8) {
        if (r0.b(this.b) == n8) {
            return;
        }
        throw z.d();
    }

    private void W(int n8) {
        if ((n8 & 3) == 0) {
            return;
        }
        throw z.g();
    }

    private void X(int n8) {
        if ((n8 & 7) == 0) {
            return;
        }
        throw z.g();
    }

    @Override
    public void A(List list) {
        if (r0.b(this.b) == 2) {
            int n8;
            do {
                list.add((Object)this.u());
                if (!this.a.e()) continue;
                return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        throw z.d();
    }

    @Override
    public void B(List list) {
        if (list instanceof l) {
            list = (l)list;
            int n8 = r0.b(this.b);
            if (n8 != 1) {
                if (n8 != 2) {
                    throw z.d();
                }
                this.X(this.a.C());
                this.a.d();
                this.a.o();
                throw null;
            }
            this.a.o();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 1) {
            if (n9 == 2) {
                n9 = this.a.C();
                this.X(n9);
                int n10 = this.a.d();
                do {
                    list.add((Object)this.a.o());
                } while (this.a.d() < n10 + n9);
                return;
            }
            throw z.d();
        }
        do {
            list.add((Object)this.a.o());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public void C(List list) {
        if (list instanceof F) {
            list = (F)list;
            int n8 = r0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) {
                    throw z.d();
                }
                this.a.C();
                this.a.d();
                this.a.u();
                throw null;
            }
            this.a.u();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 0) {
            if (n9 == 2) {
                n9 = this.a.C();
                n9 = this.a.d() + n9;
                do {
                    list.add((Object)this.a.u());
                } while (this.a.d() < n9);
                this.U(n9);
                return;
            }
            throw z.d();
        }
        do {
            list.add((Object)this.a.u());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public void D(List list) {
        if (list instanceof F) {
            list = (F)list;
            int n8 = r0.b(this.b);
            if (n8 != 1) {
                if (n8 != 2) {
                    throw z.d();
                }
                this.X(this.a.C());
                this.a.d();
                this.a.w();
                throw null;
            }
            this.a.w();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 1) {
            if (n9 == 2) {
                n9 = this.a.C();
                this.X(n9);
                int n10 = this.a.d();
                do {
                    list.add((Object)this.a.w());
                } while (this.a.d() < n10 + n9);
                return;
            }
            throw z.d();
        }
        do {
            list.add((Object)this.a.w());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public long E() {
        this.V(0);
        return this.a.u();
    }

    @Override
    public String F() {
        this.V(2);
        return this.a.A();
    }

    @Override
    public void G(List list) {
        if (list instanceof F) {
            list = (F)list;
            int n8 = r0.b(this.b);
            if (n8 != 1) {
                if (n8 != 2) {
                    throw z.d();
                }
                this.X(this.a.C());
                this.a.d();
                this.a.r();
                throw null;
            }
            this.a.r();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 1) {
            if (n9 == 2) {
                n9 = this.a.C();
                this.X(n9);
                int n10 = this.a.d();
                do {
                    list.add((Object)this.a.r());
                } while (this.a.d() < n10 + n9);
                return;
            }
            throw z.d();
        }
        do {
            list.add((Object)this.a.r());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public void H(List list) {
        if (list instanceof x) {
            list = (x)list;
            int n8 = r0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) {
                    throw z.d();
                }
                this.a.C();
                this.a.d();
                this.a.t();
                throw null;
            }
            this.a.t();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 0) {
            if (n9 == 2) {
                n9 = this.a.C();
                n9 = this.a.d() + n9;
                do {
                    list.add((Object)this.a.t());
                } while (this.a.d() < n9);
                this.U(n9);
                return;
            }
            throw z.d();
        }
        do {
            list.add((Object)this.a.t());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public void I(List list) {
        if (list instanceof x) {
            list = (x)list;
            int n8 = r0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) {
                    throw z.d();
                }
                this.a.C();
                this.a.d();
                this.a.p();
                throw null;
            }
            this.a.p();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 0) {
            if (n9 == 2) {
                n9 = this.a.C();
                n9 = this.a.d() + n9;
                do {
                    list.add((Object)this.a.p());
                } while (this.a.d() < n9);
                this.U(n9);
                return;
            }
            throw z.d();
        }
        do {
            list.add((Object)this.a.p());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public Object J(e0 e02, o o8) {
        this.V(2);
        return this.R(e02, o8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void K(Map var1_1, H.a var2_3, o var3_4) {
        this.V(2);
        var4_5 = this.a.C();
        var4_5 = this.a.l(var4_5);
        var7_6 = var2_3.b;
        var8_7 = var2_3.d;
        try {
            do {
                block5 : {
                    if ((var5_8 = this.p()) == Integer.MAX_VALUE || (var6_9 = this.a.e())) break block5;
                    if (var5_8 == 1) ** GOTO lbl16
                    if (var5_8 == 2) ** GOTO lbl14
                    try {
                        if (this.y() == false) throw new z("Unable to parse map entry.");
                        continue;
lbl14: // 1 sources:
                        var8_7 = var9_10 = this.P(var2_3.c, var2_3.d.getClass(), var3_4);
                        continue;
lbl16: // 1 sources:
                        var7_6 = var9_10 = this.P(var2_3.a, null, null);
                        continue;
                    }
                    catch (z.a var9_11) {}
                }
                var1_1.put(var7_6, var8_7);
                this.a.k(var4_5);
                return;
                if (this.y() == false) throw new z("Unable to parse map entry.");
            } while (true);
        }
        catch (Throwable var1_2) {}
        this.a.k(var4_5);
        throw var1_2;
    }

    @Override
    public void L(List list, e0 e02, o o8) {
        if (r0.b(this.b) == 3) {
            block2 : {
                int n8;
                int n9 = this.b;
                do {
                    list.add(this.Q(e02, o8));
                    if (this.a.e()) break block2;
                    if (this.d == 0) continue;
                    return;
                } while ((n8 = this.a.B()) == n9);
                this.d = n8;
            }
            return;
        }
        throw z.d();
    }

    @Override
    public void M(List list, e0 e02, o o8) {
        if (r0.b(this.b) == 2) {
            block2 : {
                int n8;
                int n9 = this.b;
                do {
                    list.add(this.R(e02, o8));
                    if (this.a.e()) break block2;
                    if (this.d == 0) continue;
                    return;
                } while ((n8 = this.a.B()) == n9);
                this.d = n8;
            }
            return;
        }
        throw z.d();
    }

    @Override
    public Object N(e0 e02, o o8) {
        this.V(3);
        return this.Q(e02, o8);
    }

    public Object S(Class class_, o o8) {
        this.V(2);
        return this.R(a0.a().c(class_), o8);
    }

    public void T(List list, boolean bl) {
        if (r0.b(this.b) == 2) {
            int n8;
            if (list instanceof D && !bl) {
                int n9;
                list = (D)list;
                do {
                    list.H(this.u());
                    if (!this.a.e()) continue;
                    return;
                } while ((n9 = this.a.B()) == this.b);
                this.d = n9;
                return;
            }
            do {
                String string2 = bl ? this.F() : this.m();
                list.add((Object)string2);
                if (!this.a.e()) continue;
                return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        throw z.d();
    }

    @Override
    public void a(List list) {
        if (list instanceof x) {
            list = (x)list;
            int n8 = r0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) {
                    throw z.d();
                }
                this.a.C();
                this.a.d();
                this.a.x();
                throw null;
            }
            this.a.x();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 0) {
            if (n9 == 2) {
                n9 = this.a.C();
                n9 = this.a.d() + n9;
                do {
                    list.add((Object)this.a.x());
                } while (this.a.d() < n9);
                this.U(n9);
                return;
            }
            throw z.d();
        }
        do {
            list.add((Object)this.a.x());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public int b() {
        this.V(0);
        return this.a.p();
    }

    @Override
    public long c() {
        this.V(0);
        return this.a.D();
    }

    @Override
    public void d(List list) {
        if (list instanceof x) {
            list = (x)list;
            int n8 = r0.b(this.b);
            if (n8 != 2) {
                if (n8 != 5) {
                    throw z.d();
                }
                this.a.q();
                throw null;
            }
            this.W(this.a.C());
            this.a.d();
            this.a.q();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 2) {
            if (n9 == 5) {
                do {
                    list.add((Object)this.a.q());
                    if (!this.a.e()) continue;
                    return;
                } while ((n9 = this.a.B()) == this.b);
                this.d = n9;
                return;
            }
            throw z.d();
        }
        n9 = this.a.C();
        this.W(n9);
        int n10 = this.a.d();
        do {
            list.add((Object)this.a.q());
        } while (this.a.d() < n10 + n9);
    }

    @Override
    public int e() {
        return this.b;
    }

    @Override
    public long f() {
        this.V(1);
        return this.a.r();
    }

    @Override
    public void g(List list) {
        if (list instanceof x) {
            list = (x)list;
            int n8 = r0.b(this.b);
            if (n8 != 2) {
                if (n8 != 5) {
                    throw z.d();
                }
                this.a.v();
                throw null;
            }
            this.W(this.a.C());
            this.a.d();
            this.a.v();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 2) {
            if (n9 == 5) {
                do {
                    list.add((Object)this.a.v());
                    if (!this.a.e()) continue;
                    return;
                } while ((n9 = this.a.B()) == this.b);
                this.d = n9;
                return;
            }
            throw z.d();
        }
        n9 = this.a.C();
        this.W(n9);
        int n10 = this.a.d();
        do {
            list.add((Object)this.a.v());
        } while (this.a.d() < n10 + n9);
    }

    @Override
    public int h() {
        this.V(0);
        return this.a.x();
    }

    @Override
    public void i(List list) {
        if (list instanceof F) {
            list = (F)list;
            int n8 = r0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) {
                    throw z.d();
                }
                this.a.C();
                this.a.d();
                this.a.y();
                throw null;
            }
            this.a.y();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 0) {
            if (n9 == 2) {
                n9 = this.a.C();
                n9 = this.a.d() + n9;
                do {
                    list.add((Object)this.a.y());
                } while (this.a.d() < n9);
                this.U(n9);
                return;
            }
            throw z.d();
        }
        do {
            list.add((Object)this.a.y());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public long j() {
        this.V(0);
        return this.a.y();
    }

    @Override
    public void k(List list) {
        if (list instanceof x) {
            list = (x)list;
            int n8 = r0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) {
                    throw z.d();
                }
                this.a.C();
                this.a.d();
                this.a.C();
                throw null;
            }
            this.a.C();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 0) {
            if (n9 == 2) {
                n9 = this.a.C();
                n9 = this.a.d() + n9;
                do {
                    list.add((Object)this.a.C());
                } while (this.a.d() < n9);
                this.U(n9);
                return;
            }
            throw z.d();
        }
        do {
            list.add((Object)this.a.C());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public void l(List list) {
        if (list instanceof e) {
            list = (e)list;
            int n8 = r0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) {
                    throw z.d();
                }
                this.a.C();
                this.a.d();
                this.a.m();
                throw null;
            }
            this.a.m();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 0) {
            if (n9 == 2) {
                n9 = this.a.C();
                n9 = this.a.d() + n9;
                do {
                    list.add((Object)this.a.m());
                } while (this.a.d() < n9);
                this.U(n9);
                return;
            }
            throw z.d();
        }
        do {
            list.add((Object)this.a.m());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public String m() {
        this.V(2);
        return this.a.z();
    }

    @Override
    public int n() {
        this.V(5);
        return this.a.q();
    }

    @Override
    public boolean o() {
        this.V(0);
        return this.a.m();
    }

    @Override
    public int p() {
        int n8 = this.d;
        if (n8 != 0) {
            this.b = n8;
            this.d = 0;
        } else {
            this.b = this.a.B();
        }
        n8 = this.b;
        if (n8 != 0 && n8 != this.c) {
            return r0.a(n8);
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public void q(List list) {
        this.T(list, false);
    }

    @Override
    public long r() {
        this.V(1);
        return this.a.w();
    }

    @Override
    public double readDouble() {
        this.V(1);
        return this.a.o();
    }

    @Override
    public float readFloat() {
        this.V(5);
        return this.a.s();
    }

    @Override
    public void s(List list) {
        if (list instanceof F) {
            list = (F)list;
            int n8 = r0.b(this.b);
            if (n8 != 0) {
                if (n8 != 2) {
                    throw z.d();
                }
                this.a.C();
                this.a.d();
                this.a.D();
                throw null;
            }
            this.a.D();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 0) {
            if (n9 == 2) {
                n9 = this.a.C();
                n9 = this.a.d() + n9;
                do {
                    list.add((Object)this.a.D());
                } while (this.a.d() < n9);
                this.U(n9);
                return;
            }
            throw z.d();
        }
        do {
            list.add((Object)this.a.D());
            if (!this.a.e()) continue;
            return;
        } while ((n9 = this.a.B()) == this.b);
        this.d = n9;
    }

    @Override
    public void t(List list) {
        this.T(list, true);
    }

    @Override
    public g u() {
        this.V(2);
        return this.a.n();
    }

    @Override
    public void v(List list) {
        if (list instanceof u) {
            list = (u)list;
            int n8 = r0.b(this.b);
            if (n8 != 2) {
                if (n8 != 5) {
                    throw z.d();
                }
                this.a.s();
                throw null;
            }
            this.W(this.a.C());
            this.a.d();
            this.a.s();
            throw null;
        }
        int n9 = r0.b(this.b);
        if (n9 != 2) {
            if (n9 == 5) {
                do {
                    list.add((Object)Float.valueOf((float)this.a.s()));
                    if (!this.a.e()) continue;
                    return;
                } while ((n9 = this.a.B()) == this.b);
                this.d = n9;
                return;
            }
            throw z.d();
        }
        n9 = this.a.C();
        this.W(n9);
        int n10 = this.a.d();
        do {
            list.add((Object)Float.valueOf((float)this.a.s()));
        } while (this.a.d() < n10 + n9);
    }

    @Override
    public int w() {
        this.V(0);
        return this.a.C();
    }

    @Override
    public int x() {
        this.V(0);
        return this.a.t();
    }

    @Override
    public boolean y() {
        int n8;
        if (!this.a.e() && (n8 = this.b) != this.c) {
            return this.a.E(n8);
        }
        return false;
    }

    @Override
    public int z() {
        this.V(5);
        return this.a.v();
    }

}

