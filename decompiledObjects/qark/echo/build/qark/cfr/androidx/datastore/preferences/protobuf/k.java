/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.y;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class k
implements s0 {
    public final j a;

    public k(j j8) {
        this.a = j8 = (j)y.b(j8, "output");
        j8.a = this;
    }

    public static k P(j j8) {
        k k8 = j8.a;
        if (k8 != null) {
            return k8;
        }
        return new k(j8);
    }

    @Override
    public void A(int n8, String string2) {
        this.a.L0(n8, string2);
    }

    @Override
    public void B(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.K((Integer)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.I0((Integer)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.H0(n8, (Integer)list.get(n9));
            }
        }
    }

    @Override
    public void C(int n8, long l8) {
        this.a.Q0(n8, l8);
    }

    @Override
    public void D(int n8, int n9) {
        this.a.j0(n8, n9);
    }

    @Override
    public void E(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.x((Long)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.y0((Long)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.x0(n8, (Long)list.get(n9));
            }
        }
    }

    @Override
    public void F(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.k((Integer)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.k0((Integer)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.j0(n8, (Integer)list.get(n9));
            }
        }
    }

    @Override
    public void G(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.i((Double)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.i0((Double)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.h0(n8, (Double)list.get(n9));
            }
        }
    }

    @Override
    public void H(int n8, int n9) {
        this.a.H0(n8, n9);
    }

    @Override
    public void I(int n8, List list) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.a.f0(n8, (g)list.get(i8));
        }
    }

    @Override
    public void J(int n8, g g8) {
        this.a.f0(n8, g8);
    }

    @Override
    public void K(int n8, Object object, e0 e02) {
        this.a.z0(n8, (O)object, e02);
    }

    @Override
    public void L(int n8, List list, e0 e02) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.K(n8, list.get(i8), e02);
        }
    }

    @Override
    public void M(int n8, List list, e0 e02) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.O(n8, list.get(i8), e02);
        }
    }

    @Override
    public void N(int n8, H.a a8, Map map) {
        if (this.a.Y()) {
            this.T(n8, a8, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.a.N0(n8, 2);
            this.a.P0(H.b(a8, entry.getKey(), entry.getValue()));
            H.e(this.a, a8, entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void O(int n8, Object object, e0 e02) {
        this.a.s0(n8, (O)object, e02);
    }

    public final void Q(int n8, boolean bl, Object object, H.a a8) {
        this.a.N0(n8, 2);
        this.a.P0(H.b(a8, bl, object));
        H.e(this.a, a8, bl, object);
    }

    public final void R(int n8, H.a a8, Map map) {
        int n9 = map.size();
        int[] arrn = new int[n9];
        Object object = map.keySet().iterator();
        int n10 = 0;
        int n11 = 0;
        while (object.hasNext()) {
            arrn[n11] = (Integer)object.next();
            ++n11;
        }
        Arrays.sort((int[])arrn);
        for (n11 = n10; n11 < n9; ++n11) {
            n10 = arrn[n11];
            object = map.get((Object)n10);
            this.a.N0(n8, 2);
            this.a.P0(H.b(a8, n10, object));
            H.e(this.a, a8, n10, object);
        }
    }

    public final void S(int n8, H.a a8, Map map) {
        int n9 = map.size();
        long[] arrl = new long[n9];
        Object object = map.keySet().iterator();
        int n10 = 0;
        int n11 = 0;
        while (object.hasNext()) {
            arrl[n11] = (Long)object.next();
            ++n11;
        }
        Arrays.sort((long[])arrl);
        for (n11 = n10; n11 < n9; ++n11) {
            long l8 = arrl[n11];
            object = map.get((Object)l8);
            this.a.N0(n8, 2);
            this.a.P0(H.b(a8, l8, object));
            H.e(this.a, a8, l8, object);
        }
    }

    public final void T(int n8, H.a a8, Map object) {
        switch (.a[a8.a.ordinal()]) {
            default: {
                object = new StringBuilder();
                object.append("does not support key type: ");
                object.append((Object)a8.a);
                throw new IllegalArgumentException(object.toString());
            }
            case 12: {
                this.U(n8, a8, (Map)object);
                return;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                this.S(n8, a8, (Map)object);
                return;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                this.R(n8, a8, (Map)object);
                return;
            }
            case 1: 
        }
        Object object2 = object.get((Object)Boolean.FALSE);
        if (object2 != null) {
            this.Q(n8, false, object2, a8);
        }
        if ((object = object.get((Object)Boolean.TRUE)) != null) {
            this.Q(n8, true, object, a8);
        }
    }

    public final void U(int n8, H.a a8, Map map) {
        int n9 = map.size();
        Object[] arrobject = new String[n9];
        Object object = map.keySet().iterator();
        int n10 = 0;
        int n11 = 0;
        while (object.hasNext()) {
            arrobject[n11] = (String)object.next();
            ++n11;
        }
        Arrays.sort((Object[])arrobject);
        for (n11 = n10; n11 < n9; ++n11) {
            object = arrobject[n11];
            Object object2 = map.get(object);
            this.a.N0(n8, 2);
            this.a.P0(H.b(a8, object, object2));
            H.e(this.a, a8, object, object2);
        }
    }

    public final void V(int n8, Object object) {
        if (object instanceof String) {
            this.a.L0(n8, (String)object);
            return;
        }
        this.a.f0(n8, (g)object);
    }

    @Override
    public void a(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.v((Integer)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.w0((Integer)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.v0(n8, (Integer)list.get(n9));
            }
        }
    }

    @Override
    public void b(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.q(((Float)list.get(n8)).floatValue());
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.q0(((Float)list.get(n8)).floatValue());
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.p0(n8, ((Float)list.get(n9)).floatValue());
            }
        }
    }

    @Override
    public void c(int n8, long l8) {
        this.a.x0(n8, l8);
    }

    @Override
    public void d(int n8, boolean bl) {
        this.a.b0(n8, bl);
    }

    @Override
    public void e(int n8, int n9) {
        this.a.O0(n8, n9);
    }

    @Override
    public final void f(int n8, Object object) {
        if (object instanceof g) {
            this.a.C0(n8, (g)object);
            return;
        }
        this.a.B0(n8, (O)object);
    }

    @Override
    public void g(int n8, int n9) {
        this.a.D0(n8, n9);
    }

    @Override
    public void h(int n8) {
        this.a.N0(n8, 3);
    }

    @Override
    public void i(int n8, int n9) {
        this.a.v0(n8, n9);
    }

    @Override
    public void j(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.o((Long)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.o0((Long)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.n0(n8, (Long)list.get(n9));
            }
        }
    }

    @Override
    public void k(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.G((Integer)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.E0((Integer)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.D0(n8, (Integer)list.get(n9));
            }
        }
    }

    @Override
    public void l(int n8, int n9) {
        this.a.l0(n8, n9);
    }

    @Override
    public void m(int n8, double d8) {
        this.a.h0(n8, d8);
    }

    @Override
    public void n(int n8, long l8) {
        this.a.F0(n8, l8);
    }

    @Override
    public void o(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.I((Long)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.G0((Long)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.F0(n8, (Long)list.get(n9));
            }
        }
    }

    @Override
    public void p(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.m((Integer)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.m0((Integer)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.l0(n8, (Integer)list.get(n9));
            }
        }
    }

    @Override
    public void q(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.T((Long)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.R0((Long)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.Q0(n8, (Long)list.get(n9));
            }
        }
    }

    @Override
    public void r(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.d((Boolean)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.c0((Boolean)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.b0(n8, (Boolean)list.get(n9));
            }
        }
    }

    @Override
    public void s(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.R((Integer)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.P0((Integer)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.O0(n8, (Integer)list.get(n9));
            }
        }
    }

    @Override
    public void t(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.N0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += j.M((Long)list.get(n8));
                ++n8;
            }
            this.a.P0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.K0((Long)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.J0(n8, (Long)list.get(n9));
            }
        }
    }

    @Override
    public void u(int n8, long l8) {
        this.a.n0(n8, l8);
    }

    @Override
    public s0.a v() {
        return s0.a.o;
    }

    @Override
    public void w(int n8, long l8) {
        this.a.J0(n8, l8);
    }

    @Override
    public void x(int n8, float f8) {
        this.a.p0(n8, f8);
    }

    @Override
    public void y(int n8, List list) {
        int n9;
        boolean bl = list instanceof D;
        int n10 = 0;
        if (bl) {
            D d8 = (D)list;
            for (n9 = n10; n9 < list.size(); ++n9) {
                this.V(n8, d8.n(n9));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.L0(n8, (String)list.get(n9));
            }
        }
    }

    @Override
    public void z(int n8) {
        this.a.N0(n8, 4);
    }

}

