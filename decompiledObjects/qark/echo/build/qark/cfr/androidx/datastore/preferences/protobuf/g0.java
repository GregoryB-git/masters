/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.util.Iterator
 *  java.util.List
 *  java.util.RandomAccess
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.n0;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class g0 {
    public static final Class a = g0.A();
    public static final l0 b = g0.B(false);
    public static final l0 c = g0.B(true);
    public static final l0 d = new n0();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class A() {
        try {
            return Class.forName((String)"androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static l0 B(boolean bl) {
        Object object;
        block3 : {
            try {
                object = g0.C();
                if (object != null) break block3;
                return null;
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        object = (l0)object.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{bl});
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class C() {
        try {
            return Class.forName((String)"androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static void D(p p8, Object object, Object object2) {
        if (!(object2 = p8.c(object2)).j()) {
            p8.d(object).p((s)object2);
        }
    }

    public static void E(J j8, Object object, Object object2, long l8) {
        p0.O(object, l8, j8.a(p0.A(object, l8), p0.A(object2, l8)));
    }

    public static void F(l0 l02, Object object, Object object2) {
        l02.p(object, l02.k(l02.g(object), l02.g(object2)));
    }

    public static l0 G() {
        return b;
    }

    public static l0 H() {
        return c;
    }

    public static void I(Class class_) {
        Class class_2;
        if (!w.class.isAssignableFrom(class_) && (class_2 = a) != null) {
            if (class_2.isAssignableFrom(class_)) {
                return;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean J(Object object, Object object2) {
        if (!(object == object2 || object != null && object.equals(object2))) {
            return false;
        }
        return true;
    }

    public static Object K(int n8, int n9, Object object, l0 l02) {
        Object object2 = object;
        if (object == null) {
            object2 = l02.n();
        }
        l02.e(object2, n8, n9);
        return object2;
    }

    public static l0 L() {
        return d;
    }

    public static void M(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.r(n8, list, bl);
        }
    }

    public static void N(int n8, List list, s0 s02) {
        if (list != null && !list.isEmpty()) {
            s02.I(n8, list);
        }
    }

    public static void O(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.G(n8, list, bl);
        }
    }

    public static void P(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.F(n8, list, bl);
        }
    }

    public static void Q(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.p(n8, list, bl);
        }
    }

    public static void R(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.j(n8, list, bl);
        }
    }

    public static void S(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.b(n8, list, bl);
        }
    }

    public static void T(int n8, List list, s0 s02, e0 e02) {
        if (list != null && !list.isEmpty()) {
            s02.M(n8, list, e02);
        }
    }

    public static void U(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.a(n8, list, bl);
        }
    }

    public static void V(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.E(n8, list, bl);
        }
    }

    public static void W(int n8, List list, s0 s02, e0 e02) {
        if (list != null && !list.isEmpty()) {
            s02.L(n8, list, e02);
        }
    }

    public static void X(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.k(n8, list, bl);
        }
    }

    public static void Y(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.o(n8, list, bl);
        }
    }

    public static void Z(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.B(n8, list, bl);
        }
    }

    public static int a(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        if (bl) {
            return j.P(n8) + j.y(n9);
        }
        return n9 * j.c(n8, true);
    }

    public static void a0(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.t(n8, list, bl);
        }
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int n8, List list, s0 s02) {
        if (list != null && !list.isEmpty()) {
            s02.y(n8, list);
        }
    }

    public static int c(int n8, List list) {
        int n9 = list.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        n8 = n10;
        n10 = n9 *= j.P(n8);
        while (n8 < list.size()) {
            n10 += j.g((g)list.get(n8));
            ++n8;
        }
        return n10;
    }

    public static void c0(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.s(n8, list, bl);
        }
    }

    public static int d(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = g0.e(list);
        n8 = j.P(n8);
        if (bl) {
            return n8 + j.y(n10);
        }
        return n10 + n9 * n8;
    }

    public static void d0(int n8, List list, s0 s02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            s02.q(n8, list, bl);
        }
    }

    public static int e(List list) {
        int n8 = list.size();
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof x) {
            list = (x)list;
            if (n8 <= 0) {
                return 0;
            }
            throw null;
        }
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += j.k((Integer)list.get(i8));
        }
        return n9;
    }

    public static int f(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        if (bl) {
            return j.P(n8) + j.y(n9 * 4);
        }
        return n9 * j.l(n8, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        if (bl) {
            return j.P(n8) + j.y(n9 * 8);
        }
        return n9 * j.n(n8, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int n8, List list, e0 e02) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = 0;
        for (int i8 = 0; i8 < n9; ++i8) {
            n10 += j.r(n8, (O)list.get(i8), e02);
        }
        return n10;
    }

    public static int k(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = g0.l(list);
        n8 = j.P(n8);
        if (bl) {
            return n8 + j.y(n10);
        }
        return n10 + n9 * n8;
    }

    public static int l(List list) {
        int n8 = list.size();
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof x) {
            list = (x)list;
            if (n8 <= 0) {
                return 0;
            }
            throw null;
        }
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += j.v((Integer)list.get(i8));
        }
        return n9;
    }

    public static int m(int n8, List list, boolean bl) {
        if (list.size() == 0) {
            return 0;
        }
        int n9 = g0.n(list);
        if (bl) {
            return j.P(n8) + j.y(n9);
        }
        return n9 + list.size() * j.P(n8);
    }

    public static int n(List list) {
        int n8 = list.size();
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof F) {
            list = (F)list;
            if (n8 <= 0) {
                return 0;
            }
            throw null;
        }
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += j.x((Long)list.get(i8));
        }
        return n9;
    }

    public static int o(int n8, Object object, e0 e02) {
        return j.z(n8, (O)object, e02);
    }

    public static int p(int n8, List list, e0 e02) {
        int n9 = list.size();
        int n10 = 0;
        if (n9 == 0) {
            return 0;
        }
        int n11 = j.P(n8) * n9;
        for (n8 = n10; n8 < n9; ++n8) {
            n11 += j.B((O)list.get(n8), e02);
        }
        return n11;
    }

    public static int q(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = g0.r(list);
        n8 = j.P(n8);
        if (bl) {
            return n8 + j.y(n10);
        }
        return n10 + n9 * n8;
    }

    public static int r(List list) {
        int n8 = list.size();
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof x) {
            list = (x)list;
            if (n8 <= 0) {
                return 0;
            }
            throw null;
        }
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += j.K((Integer)list.get(i8));
        }
        return n9;
    }

    public static int s(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = g0.t(list);
        n8 = j.P(n8);
        if (bl) {
            return n8 + j.y(n10);
        }
        return n10 + n9 * n8;
    }

    public static int t(List list) {
        int n8 = list.size();
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof F) {
            list = (F)list;
            if (n8 <= 0) {
                return 0;
            }
            throw null;
        }
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += j.M((Long)list.get(i8));
        }
        return n9;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int u(int n8, List list) {
        int n9;
        int n10 = list.size();
        int n11 = 0;
        int n12 = 0;
        if (n10 == 0) {
            return 0;
        }
        n8 = n9 = j.P(n8) * n10;
        if (list instanceof D) {
            list = (D)list;
            n8 = n9;
            n11 = n12;
            do {
                n9 = n8;
                if (n11 >= n10) return n9;
                {
                    Object object = list.n(n11);
                    n9 = object instanceof g ? j.g((g)object) : j.O((String)object);
                    n8 += n9;
                    ++n11;
                    continue;
                }
                break;
            } while (true);
        } else {
            do {
                n9 = n8;
                if (n11 >= n10) return n9;
                Object object = list.get(n11);
                n9 = object instanceof g ? j.g((g)object) : j.O((String)object);
                n8 += n9;
                ++n11;
            } while (true);
        }
    }

    public static int v(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = g0.w(list);
        n8 = j.P(n8);
        if (bl) {
            return n8 + j.y(n10);
        }
        return n10 + n9 * n8;
    }

    public static int w(List list) {
        int n8 = list.size();
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof x) {
            list = (x)list;
            if (n8 <= 0) {
                return 0;
            }
            throw null;
        }
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += j.R((Integer)list.get(i8));
        }
        return n9;
    }

    public static int x(int n8, List list, boolean bl) {
        int n9 = list.size();
        if (n9 == 0) {
            return 0;
        }
        int n10 = g0.y(list);
        n8 = j.P(n8);
        if (bl) {
            return n8 + j.y(n10);
        }
        return n10 + n9 * n8;
    }

    public static int y(List list) {
        int n8 = list.size();
        if (n8 == 0) {
            return 0;
        }
        if (list instanceof F) {
            list = (F)list;
            if (n8 <= 0) {
                return 0;
            }
            throw null;
        }
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += j.T((Long)list.get(i8));
        }
        return n9;
    }

    public static Object z(int n8, List list, y.a a8, Object object, l0 l02) {
        Object object2;
        if (a8 == null) {
            return object;
        }
        if (list instanceof RandomAccess) {
            int n9 = list.size();
            int n10 = 0;
            for (int i8 = 0; i8 < n9; ++i8) {
                object2 = (Integer)list.get(i8);
                int n11 = object2.intValue();
                if (a8.a(n11)) {
                    if (i8 != n10) {
                        list.set(n10, object2);
                    }
                    ++n10;
                    continue;
                }
                object = g0.K(n8, n11, object, l02);
            }
            object2 = object;
            if (n10 != n9) {
                list.subList(n10, n9).clear();
                return object;
            }
        } else {
            list = list.iterator();
            do {
                object2 = object;
                if (!list.hasNext()) break;
                int n12 = (Integer)list.next();
                if (a8.a(n12)) continue;
                object = g0.K(n8, n12, object, l02);
                list.remove();
            } while (true);
        }
        return object2;
    }
}

