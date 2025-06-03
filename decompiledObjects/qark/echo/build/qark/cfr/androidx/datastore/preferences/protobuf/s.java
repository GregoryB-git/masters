/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Comparable
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package androidx.datastore.preferences.protobuf;

import android.support.v4.media.a;
import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.h0;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class s {
    public static final s d = new s(true);
    public final h0 a;
    public boolean b;
    public boolean c;

    public s() {
        this.a = h0.q(16);
    }

    public s(h0 h02) {
        this.a = h02;
        this.o();
    }

    public s(boolean bl) {
        this(h0.q(0));
        this.o();
    }

    public static int b(r0.b b8, int n8, Object object) {
        int n9;
        n8 = n9 = j.P(n8);
        if (b8 == r0.b.z) {
            n8 = n9 * 2;
        }
        return n8 + s.c(b8, object);
    }

    public static int c(r0.b b8, Object object) {
        switch (.b[b8.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                return j.k((Integer)object);
            }
            case 17: {
                return j.M((Long)object);
            }
            case 16: {
                return j.K((Integer)object);
            }
            case 15: {
                return j.I((Long)object);
            }
            case 14: {
                return j.G((Integer)object);
            }
            case 13: {
                return j.R((Integer)object);
            }
            case 12: {
                if (object instanceof g) {
                    return j.g((g)object);
                }
                return j.e((byte[])object);
            }
            case 11: {
                if (object instanceof g) {
                    return j.g((g)object);
                }
                return j.O((String)object);
            }
            case 10: {
                return j.A((O)object);
            }
            case 9: {
                return j.s((O)object);
            }
            case 8: {
                return j.d((Boolean)object);
            }
            case 7: {
                return j.m((Integer)object);
            }
            case 6: {
                return j.o((Long)object);
            }
            case 5: {
                return j.v((Integer)object);
            }
            case 4: {
                return j.T((Long)object);
            }
            case 3: {
                return j.x((Long)object);
            }
            case 2: {
                return j.q(((Float)object).floatValue());
            }
            case 1: 
        }
        return j.i((Double)object);
    }

    public static int d(b b8, Object object) {
        r0.b b9 = b8.k();
        int n8 = b8.g();
        if (b8.i()) {
            boolean bl = b8.q();
            int n9 = 0;
            int n10 = 0;
            b8 = (List)object;
            if (bl) {
                b8 = b8.iterator();
                while (b8.hasNext()) {
                    n10 += s.c(b9, b8.next());
                }
                return j.P(n8) + n10 + j.E(n10);
            }
            b8 = b8.iterator();
            n10 = n9;
            while (b8.hasNext()) {
                n10 += s.b(b9, n8, b8.next());
            }
            return n10;
        }
        return s.b(b9, n8, object);
    }

    public static int i(r0.b b8, boolean bl) {
        if (bl) {
            return 2;
        }
        return b8.e();
    }

    public static boolean l(Map.Entry entry) {
        a.a(entry.getKey());
        throw null;
    }

    public static boolean m(r0.b b8, Object object) {
        y.a(object);
        int n8 = .a[b8.c().ordinal()];
        boolean bl = true;
        switch (n8) {
            default: {
                return false;
            }
            case 9: {
                return object instanceof O;
            }
            case 8: {
                return object instanceof Integer;
            }
            case 7: {
                if (!(object instanceof g)) {
                    if (object instanceof byte[]) {
                        return true;
                    }
                    bl = false;
                }
                return bl;
            }
            case 6: {
                return object instanceof String;
            }
            case 5: {
                return object instanceof Boolean;
            }
            case 4: {
                return object instanceof Double;
            }
            case 3: {
                return object instanceof Float;
            }
            case 2: {
                return object instanceof Long;
            }
            case 1: 
        }
        return object instanceof Integer;
    }

    public static s r() {
        return new s();
    }

    public static void u(j j8, r0.b b8, int n8, Object object) {
        if (b8 == r0.b.z) {
            j8.r0(n8, (O)object);
            return;
        }
        j8.N0(n8, s.i(b8, false));
        s.v(j8, b8, object);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void v(j var0, r0.b var1_1, Object var2_2) {
        switch (.b[var1_1.ordinal()]) {
            default: {
                return;
            }
            case 18: {
                var0.k0((Integer)var2_2);
                return;
            }
            case 17: {
                var0.K0((Long)var2_2);
                return;
            }
            case 16: {
                var0.I0((Integer)var2_2);
                return;
            }
            case 15: {
                var0.G0((Long)var2_2);
                return;
            }
            case 14: {
                var0.E0((Integer)var2_2);
                return;
            }
            case 13: {
                var0.P0((Integer)var2_2);
                return;
            }
            case 12: {
                if (!(var2_2 instanceof g)) {
                    var0.d0((byte[])var2_2);
                    return;
                }
                ** GOTO lbl31
            }
            case 11: {
                if (!(var2_2 instanceof g)) {
                    var0.M0((String)var2_2);
                    return;
                }
lbl31: // 3 sources:
                var0.g0((g)var2_2);
                return;
            }
            case 10: {
                var0.A0((O)var2_2);
                return;
            }
            case 9: {
                var0.t0((O)var2_2);
                return;
            }
            case 8: {
                var0.c0((Boolean)var2_2);
                return;
            }
            case 7: {
                var0.m0((Integer)var2_2);
                return;
            }
            case 6: {
                var0.o0((Long)var2_2);
                return;
            }
            case 5: {
                var0.w0((Integer)var2_2);
                return;
            }
            case 4: {
                var0.R0((Long)var2_2);
                return;
            }
            case 3: {
                var0.y0((Long)var2_2);
                return;
            }
            case 2: {
                var0.q0(((Float)var2_2).floatValue());
                return;
            }
            case 1: 
        }
        var0.i0((Double)var2_2);
    }

    public s a() {
        s s8 = s.r();
        for (int i8 = 0; i8 < this.a.k(); ++i8) {
            Map.Entry entry = this.a.j(i8);
            a.a(entry.getKey());
            s8.s(null, entry.getValue());
        }
        for (Map.Entry entry : this.a.m()) {
            a.a(entry.getKey());
            s8.s(null, entry.getValue());
        }
        s8.c = this.c;
        return s8;
    }

    public Iterator e() {
        if (this.c) {
            return new B(this.a.h().iterator());
        }
        return this.a.h().iterator();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof s)) {
            return false;
        }
        object = (s)object;
        return this.a.equals((Object)object.a);
    }

    public int f() {
        int n8 = 0;
        for (int i8 = 0; i8 < this.a.k(); ++i8) {
            n8 += this.g(this.a.j(i8));
        }
        Iterator iterator = this.a.m().iterator();
        while (iterator.hasNext()) {
            n8 += this.g((Map.Entry)iterator.next());
        }
        return n8;
    }

    public final int g(Map.Entry entry) {
        a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public int h() {
        int n8 = 0;
        for (int i8 = 0; i8 < this.a.k(); ++i8) {
            Map.Entry entry = this.a.j(i8);
            a.a(entry.getKey());
            n8 += s.d(null, entry.getValue());
        }
        for (Map.Entry entry : this.a.m()) {
            a.a(entry.getKey());
            n8 += s.d(null, entry.getValue());
        }
        return n8;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean j() {
        return this.a.isEmpty();
    }

    public boolean k() {
        for (int i8 = 0; i8 < this.a.k(); ++i8) {
            if (s.l(this.a.j(i8))) continue;
            return false;
        }
        Iterator iterator = this.a.m().iterator();
        while (iterator.hasNext()) {
            if (s.l((Map.Entry)iterator.next())) continue;
            return false;
        }
        return true;
    }

    public Iterator n() {
        if (this.c) {
            return new B(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public void o() {
        if (this.b) {
            return;
        }
        this.a.p();
        this.b = true;
    }

    public void p(s s8) {
        for (int i8 = 0; i8 < s8.a.k(); ++i8) {
            this.q(s8.a.j(i8));
        }
        s8 = s8.a.m().iterator();
        while (s8.hasNext()) {
            this.q((Map.Entry)s8.next());
        }
    }

    public final void q(Map.Entry entry) {
        a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void s(b b8, Object object) {
        if (b8.i()) {
            if (!(object instanceof List)) throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection)((List)object));
            for (Object object2 : arrayList) {
                this.t(b8.k(), object2);
            }
            object = arrayList;
        } else {
            this.t(b8.k(), object);
        }
        this.a.r(b8, object);
    }

    public final void t(r0.b b8, Object object) {
        if (s.m(b8, object)) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static interface b
    extends Comparable {
        public int g();

        public boolean i();

        public r0.b k();

        public boolean q();
    }

}

