/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
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
package com.google.protobuf;

import android.support.v4.media.a;
import com.google.protobuf.K;
import com.google.protobuf.c0;
import com.google.protobuf.f;
import com.google.protobuf.h;
import com.google.protobuf.m0;
import com.google.protobuf.r;
import com.google.protobuf.t;
import com.google.protobuf.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class o {
    public static final o d = new o(true);
    public final c0 a;
    public boolean b;
    public boolean c;

    public o() {
        this.a = c0.q(16);
    }

    public o(c0 c02) {
        this.a = c02;
        this.o();
    }

    public o(boolean bl) {
        this(c0.q(0));
        this.o();
    }

    public static int b(m0.b b8, int n8, Object object) {
        int n9;
        n8 = n9 = h.O(n8);
        if (b8 == m0.b.z) {
            n8 = n9 * 2;
        }
        return n8 + o.c(b8, object);
    }

    public static int c(m0.b b8, Object object) {
        switch (.b[b8.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                if (object instanceof t.a) {
                    return h.l(((t.a)object).g());
                }
                return h.l((Integer)object);
            }
            case 17: {
                return h.L((Long)object);
            }
            case 16: {
                return h.J((Integer)object);
            }
            case 15: {
                return h.H((Long)object);
            }
            case 14: {
                return h.F((Integer)object);
            }
            case 13: {
                return h.Q((Integer)object);
            }
            case 12: {
                if (object instanceof f) {
                    return h.h((f)object);
                }
                return h.f((byte[])object);
            }
            case 11: {
                if (object instanceof f) {
                    return h.h((f)object);
                }
                return h.N((String)object);
            }
            case 10: {
                return h.B((K)object);
            }
            case 9: {
                return h.t((K)object);
            }
            case 8: {
                return h.e((Boolean)object);
            }
            case 7: {
                return h.n((Integer)object);
            }
            case 6: {
                return h.p((Long)object);
            }
            case 5: {
                return h.w((Integer)object);
            }
            case 4: {
                return h.S((Long)object);
            }
            case 3: {
                return h.y((Long)object);
            }
            case 2: {
                return h.r(((Float)object).floatValue());
            }
            case 1: 
        }
        return h.j((Double)object);
    }

    public static int d(b b8, Object object) {
        m0.b b9 = b8.k();
        int n8 = b8.g();
        if (b8.i()) {
            boolean bl = b8.q();
            int n9 = 0;
            int n10 = 0;
            b8 = (List)object;
            if (bl) {
                b8 = b8.iterator();
                while (b8.hasNext()) {
                    n10 += o.c(b9, b8.next());
                }
                return h.O(n8) + n10 + h.Q(n10);
            }
            b8 = b8.iterator();
            n10 = n9;
            while (b8.hasNext()) {
                n10 += o.b(b9, n8, b8.next());
            }
            return n10;
        }
        return o.b(b9, n8, object);
    }

    public static int i(m0.b b8, boolean bl) {
        if (bl) {
            return 2;
        }
        return b8.h();
    }

    public static boolean l(Map.Entry entry) {
        a.a(entry.getKey());
        throw null;
    }

    public static boolean m(m0.b b8, Object object) {
        t.a(object);
        int n8 = .a[b8.e().ordinal()];
        boolean bl = true;
        boolean bl2 = true;
        switch (n8) {
            default: {
                return false;
            }
            case 9: {
                return object instanceof K;
            }
            case 8: {
                if (!(object instanceof Integer)) {
                    if (object instanceof t.a) {
                        return true;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            case 7: {
                bl2 = bl;
                if (!(object instanceof f)) {
                    if (object instanceof byte[]) {
                        return true;
                    }
                    bl2 = false;
                }
                return bl2;
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

    public static o r() {
        return new o();
    }

    public static void u(h h8, m0.b b8, int n8, Object object) {
        if (b8 == m0.b.z) {
            h8.r0(n8, (K)object);
            return;
        }
        h8.N0(n8, o.i(b8, false));
        o.v(h8, b8, object);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void v(h var0, m0.b var1_1, Object var2_2) {
        switch (.b[var1_1.ordinal()]) {
            default: {
                return;
            }
            case 18: {
                var3_3 = var2_2 instanceof t.a != false ? ((t.a)var2_2).g() : ((Integer)var2_2).intValue();
                var0.k0(var3_3);
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
                if (!(var2_2 instanceof f)) {
                    var0.d0((byte[])var2_2);
                    return;
                }
                ** GOTO lbl32
            }
            case 11: {
                if (!(var2_2 instanceof f)) {
                    var0.M0((String)var2_2);
                    return;
                }
lbl32: // 3 sources:
                var0.g0((f)var2_2);
                return;
            }
            case 10: {
                var0.A0((K)var2_2);
                return;
            }
            case 9: {
                var0.t0((K)var2_2);
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

    public o a() {
        o o8 = o.r();
        for (int i8 = 0; i8 < this.a.k(); ++i8) {
            Map.Entry entry = this.a.j(i8);
            a.a(entry.getKey());
            o8.s(null, entry.getValue());
        }
        for (Map.Entry entry : this.a.m()) {
            a.a(entry.getKey());
            o8.s(null, entry.getValue());
        }
        o8.c = this.c;
        return o8;
    }

    public Iterator e() {
        if (this.c) {
            return new x(this.a.h().iterator());
        }
        return this.a.h().iterator();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof o)) {
            return false;
        }
        object = (o)object;
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
            n8 += o.d(null, entry.getValue());
        }
        for (Map.Entry entry : this.a.m()) {
            a.a(entry.getKey());
            n8 += o.d(null, entry.getValue());
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
            if (o.l(this.a.j(i8))) continue;
            return false;
        }
        Iterator iterator = this.a.m().iterator();
        while (iterator.hasNext()) {
            if (o.l((Map.Entry)iterator.next())) continue;
            return false;
        }
        return true;
    }

    public Iterator n() {
        if (this.c) {
            return new x(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public void o() {
        if (this.b) {
            return;
        }
        for (int i8 = 0; i8 < this.a.k(); ++i8) {
            Map.Entry entry = this.a.j(i8);
            if (!(entry.getValue() instanceof r)) continue;
            ((r)entry.getValue()).J();
        }
        this.a.p();
        this.b = true;
    }

    public void p(o o8) {
        for (int i8 = 0; i8 < o8.a.k(); ++i8) {
            this.q(o8.a.j(i8));
        }
        o8 = o8.a.m().iterator();
        while (o8.hasNext()) {
            this.q((Map.Entry)o8.next());
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
            object = arrayList.iterator();
            while (object.hasNext()) {
                this.t(b8, object.next());
            }
            object = arrayList;
        } else {
            this.t(b8, object);
        }
        this.a.r(b8, object);
    }

    public final void t(b b8, Object object) {
        if (o.m(b8.k(), object)) {
            return;
        }
        throw new IllegalArgumentException(String.format((String)"Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", (Object[])new Object[]{b8.g(), b8.k().e(), object.getClass().getName()}));
    }

    public static interface b
    extends Comparable {
        public int g();

        public boolean i();

        public m0.b k();

        public boolean q();
    }

}

