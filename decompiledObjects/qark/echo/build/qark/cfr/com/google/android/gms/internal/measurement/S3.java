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
package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.J3;
import com.google.android.gms.internal.measurement.K5;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.U3;
import com.google.android.gms.internal.measurement.U5;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.m4;
import com.google.android.gms.internal.measurement.q3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class S3 {
    public static final S3 d = new S3(true);
    public final d5 a;
    public boolean b;
    public boolean c;

    public S3() {
        this.a = d5.b(16);
    }

    public S3(d5 d52) {
        this.a = d52;
        this.m();
    }

    public S3(boolean bl) {
        this(d5.b(0));
        this.m();
    }

    public static int b(U3 u32, Object object) {
        K5 k52 = u32.b();
        int n8 = u32.a();
        if (u32.f()) {
            object = (List)object;
            boolean bl = u32.d();
            int n9 = 0;
            int n10 = 0;
            if (bl) {
                if (object.isEmpty()) {
                    return 0;
                }
                u32 = object.iterator();
                while (u32.hasNext()) {
                    n10 += S3.d(k52, u32.next());
                }
                return J3.s0(n8) + n10 + J3.v0(n10);
            }
            u32 = object.iterator();
            n10 = n9;
            while (u32.hasNext()) {
                n10 += S3.c(k52, n8, u32.next());
            }
            return n10;
        }
        return S3.c(k52, n8, object);
    }

    public static int c(K5 k52, int n8, Object object) {
        int n9;
        n8 = n9 = J3.s0(n8);
        if (k52 == K5.z) {
            a4.g((I4)object);
            n8 = n9 << 1;
        }
        return n8 + S3.d(k52, object);
    }

    public static int d(K5 k52, Object object) {
        switch (R3.b[k52.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                if (object instanceof e4) {
                    return J3.X(((e4)object).a());
                }
                return J3.X((Integer)object);
            }
            case 17: {
                return J3.j0((Long)object);
            }
            case 16: {
                return J3.o0((Integer)object);
            }
            case 15: {
                return J3.f0((Long)object);
            }
            case 14: {
                return J3.k0((Integer)object);
            }
            case 13: {
                return J3.v0((Integer)object);
            }
            case 12: {
                if (object instanceof q3) {
                    return J3.A((q3)object);
                }
                return J3.i((byte[])object);
            }
            case 11: {
                if (object instanceof q3) {
                    return J3.A((q3)object);
                }
                return J3.C((String)object);
            }
            case 10: {
                return J3.T((I4)object);
            }
            case 9: {
                return J3.B((I4)object);
            }
            case 8: {
                return J3.h((Boolean)object);
            }
            case 7: {
                return J3.c0((Integer)object);
            }
            case 6: {
                return J3.S((Long)object);
            }
            case 5: {
                return J3.g0((Integer)object);
            }
            case 4: {
                return J3.n0((Long)object);
            }
            case 3: {
                return J3.a0((Long)object);
            }
            case 2: {
                return J3.d(((Float)object).floatValue());
            }
            case 1: 
        }
        return J3.c((Double)object);
    }

    public static int e(Map.Entry entry) {
        a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static void j(U3 u32, Object object) {
        block18 : {
            block19 : {
                boolean bl;
                K5 k52 = u32.b();
                a4.e(object);
                switch (R3.a[k52.c().ordinal()]) {
                    default: {
                        break block18;
                    }
                    case 9: {
                        if (object instanceof I4) {
                            return;
                        }
                        break block18;
                    }
                    case 8: {
                        if (object instanceof Integer) break block19;
                        if (object instanceof e4) {
                            return;
                        }
                        break block18;
                    }
                    case 7: {
                        if (object instanceof q3) break block19;
                        if (object instanceof byte[]) {
                            return;
                        }
                        break block18;
                    }
                    case 6: {
                        bl = object instanceof String;
                        break;
                    }
                    case 5: {
                        bl = object instanceof Boolean;
                        break;
                    }
                    case 4: {
                        bl = object instanceof Double;
                        break;
                    }
                    case 3: {
                        bl = object instanceof Float;
                        break;
                    }
                    case 2: {
                        bl = object instanceof Long;
                        break;
                    }
                    case 1: {
                        bl = object instanceof Integer;
                    }
                }
                if (!bl) break block18;
            }
            return;
        }
        throw new IllegalArgumentException(String.format((String)"Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", (Object[])new Object[]{u32.a(), u32.b().c(), object.getClass().getName()}));
    }

    public static boolean k(Map.Entry entry) {
        a.a(entry.getKey());
        throw null;
    }

    public final int a() {
        int n8 = 0;
        for (int i8 = 0; i8 < this.a.g(); ++i8) {
            n8 += S3.e(this.a.h(i8));
        }
        Iterator iterator = this.a.j().iterator();
        while (iterator.hasNext()) {
            n8 += S3.e((Map.Entry)iterator.next());
        }
        return n8;
    }

    public final /* synthetic */ Object clone() {
        S3 s32 = new S3();
        for (int i8 = 0; i8 < this.a.g(); ++i8) {
            Map.Entry entry = this.a.h(i8);
            a.a(entry.getKey());
            s32.g(null, entry.getValue());
        }
        for (Map.Entry entry : this.a.j()) {
            a.a(entry.getKey());
            s32.g(null, entry.getValue());
        }
        s32.c = this.c;
        return s32;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof S3)) {
            return false;
        }
        object = (S3)object;
        return this.a.equals((Object)object.a);
    }

    public final void f(S3 s32) {
        for (int i8 = 0; i8 < s32.a.g(); ++i8) {
            this.h(s32.a.h(i8));
        }
        s32 = s32.a.j().iterator();
        while (s32.hasNext()) {
            this.h((Map.Entry)s32.next());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void g(U3 u32, Object object) {
        if (u32.f()) {
            if (!(object instanceof List)) throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection)((List)object));
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                object = arrayList.get(i8);
                S3.j(u32, object);
            }
            object = arrayList;
        } else {
            S3.j(u32, object);
        }
        this.a.d(u32, object);
    }

    public final void h(Map.Entry entry) {
        a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator i() {
        if (this.c) {
            return new m4(this.a.m().iterator());
        }
        return this.a.m().iterator();
    }

    public final Iterator l() {
        if (this.c) {
            return new m4(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final void m() {
        if (this.b) {
            return;
        }
        for (int i8 = 0; i8 < this.a.g(); ++i8) {
            Map.Entry entry = this.a.h(i8);
            if (!(entry.getValue() instanceof Y3)) continue;
            ((Y3)entry.getValue()).C();
        }
        this.a.f();
        this.b = true;
    }

    public final boolean n() {
        for (int i8 = 0; i8 < this.a.g(); ++i8) {
            if (S3.k(this.a.h(i8))) continue;
            return false;
        }
        Iterator iterator = this.a.j().iterator();
        while (iterator.hasNext()) {
            if (S3.k((Map.Entry)iterator.next())) continue;
            return false;
        }
        return true;
    }
}

