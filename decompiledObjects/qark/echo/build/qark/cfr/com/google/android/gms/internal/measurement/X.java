/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.W;
import com.google.android.gms.internal.measurement.Z;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.t;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.z;
import java.util.Iterator;
import java.util.List;

public final class X
extends A {
    public X() {
        this.a.add((Object)Z.s);
        this.a.add((Object)Z.D);
        this.a.add((Object)Z.G);
        this.a.add((Object)Z.H);
        this.a.add((Object)Z.N);
        this.a.add((Object)Z.W);
        this.a.add((Object)Z.Y);
        this.a.add((Object)Z.Z);
        this.a.add((Object)Z.m0);
        this.a.add((Object)Z.v0);
        this.a.add((Object)Z.z0);
        this.a.add((Object)Z.A0);
        this.a.add((Object)Z.B0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final s b(String object, f3 object2, List object3) {
        int n8 = W.a[C2.c((String)object).ordinal()];
        int n9 = 0;
        int n10 = 0;
        switch (n8) {
            int n11;
            default: {
                return super.a((String)object);
            }
            case 13: {
                C2.j(Z.B0, 1, (List)object3);
                object = object3.iterator();
                while (object.hasNext()) {
                    object3 = object2.b((s)object.next());
                    if (!(object3 instanceof u)) throw new IllegalArgumentException(String.format((String)"Expected string for var name. got %s", (Object[])new Object[]{object3.getClass().getCanonicalName()}));
                    object2.e(object3.g(), s.d);
                }
                return s.d;
            }
            case 12: {
                C2.f(Z.A0, 0, (List)object3);
                return s.d;
            }
            case 11: {
                C2.f(Z.z0, 1, (List)object3);
                object = object2.b((s)object3.get(0));
                if (object instanceof z) {
                    object = "undefined";
                    return new u((String)object);
                } else if (object instanceof h) {
                    object = "boolean";
                    return new u((String)object);
                } else if (object instanceof k) {
                    object = "number";
                    return new u((String)object);
                } else if (object instanceof u) {
                    object = "string";
                    return new u((String)object);
                } else if (object instanceof t) {
                    object = "function";
                    return new u((String)object);
                } else {
                    if (object instanceof v || object instanceof l) throw new IllegalArgumentException(String.format((String)"Unsupported value type %s in typeof", (Object[])new Object[]{object}));
                    object = "object";
                }
                return new u((String)object);
            }
            case 10: {
                C2.f(Z.v0, 3, (List)object3);
                object = object2.b((s)object3.get(0));
                s s8 = object2.b((s)object3.get(1));
                object2 = object2.b((s)object3.get(2));
                if (object == s.d || object == s.e) throw new IllegalStateException(String.format((String)"Can't set property %s of %s", (Object[])new Object[]{s8.g(), object.g()}));
                if (object instanceof g && s8 instanceof k) {
                    ((g)object).X(s8.f().intValue(), (s)object2);
                    return object2;
                }
                if (!(object instanceof m)) return object2;
                ((m)object).a(s8.g(), (s)object2);
                return object2;
            }
            case 9: {
                C2.f(Z.m0, 0, (List)object3);
                return s.e;
            }
            case 7: 
            case 8: {
                C2.f(Z.Z, 2, (List)object3);
                object = object2.b((s)object3.get(0));
                object2 = object2.b((s)object3.get(1));
                if (object instanceof g && C2.l((s)object2)) {
                    return ((g)object).M(object2.f().intValue());
                }
                if (object instanceof m) {
                    return ((m)object).i(object2.g());
                }
                if (!(object instanceof u)) return s.d;
                if ("length".equals((Object)object2.g())) {
                    return new k((double)object.g().length());
                }
                if (!C2.l((s)object2) || object2.f() >= (double)object.g().length()) return s.d;
                return new u(String.valueOf((char)object.g().charAt(object2.f().intValue())));
            }
            case 6: {
                C2.f(Z.W, 1, (List)object3);
                object = object2.b((s)object3.get(0));
                if (!(object instanceof u)) throw new IllegalArgumentException(String.format((String)"Expected string for get var. got %s", (Object[])new Object[]{object.getClass().getCanonicalName()}));
                return object2.c(object.g());
            }
            case 5: {
                C2.j(Z.N, 1, (List)object3);
                object = s.d;
                for (n11 = 0; n11 < object3.size(); ++n11) {
                    object = object2.b((s)object3.get(n11));
                    if (object instanceof l) throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                return object;
            }
            case 4: {
                if (object3.isEmpty()) {
                    return new r();
                }
                if (object3.size() % 2 != 0) throw new IllegalArgumentException(String.format((String)"CREATE_OBJECT requires an even number of arguments, found %s", (Object[])new Object[]{object3.size()}));
                object = new r();
                for (n11 = n9; n11 < object3.size() - 1; n11 += 2) {
                    s s9 = object2.b((s)object3.get(n11));
                    s s10 = object2.b((s)object3.get(n11 + 1));
                    if (s9 instanceof l || s10 instanceof l) throw new IllegalStateException("Failed to evaluate map entry");
                    object.a(s9.g(), s10);
                }
                return object;
            }
            case 3: {
                if (object3.isEmpty()) {
                    return new g();
                }
                object = new g();
                object3 = object3.iterator();
                n11 = n10;
                while (object3.hasNext()) {
                    s s11 = object2.b((s)object3.next());
                    if (s11 instanceof l) throw new IllegalStateException("Failed to evaluate array element");
                    object.X(n11, s11);
                    ++n11;
                }
                return object;
            }
            case 2: {
                C2.j(Z.D, 2, (List)object3);
                if (object3.size() % 2 != 0) throw new IllegalArgumentException(String.format((String)"CONST requires an even number of arguments, found %s", (Object[])new Object[]{object3.size()}));
                n11 = 0;
                while (n11 < object3.size() - 1) {
                    object = object2.b((s)object3.get(n11));
                    if (!(object instanceof u)) throw new IllegalArgumentException(String.format((String)"Expected string for const name. got %s", (Object[])new Object[]{object.getClass().getCanonicalName()}));
                    object2.f(object.g(), object2.b((s)object3.get(n11 + 1)));
                    n11 += 2;
                }
                return s.d;
            }
            case 1: 
        }
        C2.f(Z.s, 2, (List)object3);
        object = object2.b((s)object3.get(0));
        if (!(object instanceof u)) throw new IllegalArgumentException(String.format((String)"Expected string for assign var. got %s", (Object[])new Object[]{object.getClass().getCanonicalName()}));
        if (!object2.g(object.g())) throw new IllegalArgumentException(String.format((String)"Attempting to assign undefined value %s", (Object[])new Object[]{object.g()}));
        object3 = object2.b((s)object3.get(1));
        object2.h(object.g(), (s)object3);
        return object3;
    }
}

