/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.I;
import com.google.android.gms.internal.measurement.Z;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.t;
import java.util.ArrayList;
import java.util.List;

public final class F
extends A {
    public F() {
        this.a.add((Object)Z.r);
        this.a.add((Object)Z.A);
        this.a.add((Object)Z.B);
        this.a.add((Object)Z.C);
        this.a.add((Object)Z.I);
        this.a.add((Object)Z.E);
        this.a.add((Object)Z.J);
        this.a.add((Object)Z.O);
        this.a.add((Object)Z.e0);
        this.a.add((Object)Z.r0);
        this.a.add((Object)Z.u0);
        this.a.add((Object)Z.x0);
        this.a.add((Object)Z.y0);
    }

    public static s c(f3 f32, List list) {
        C2.j(Z.O, 2, list);
        s s8 = f32.b((s)list.get(0));
        s s9 = f32.b((s)list.get(1));
        if (s9 instanceof g) {
            List list2 = ((g)s9).a0();
            s9 = new ArrayList();
            if (list.size() > 2) {
                s9 = list.subList(2, list.size());
            }
            return new t(s8.g(), list2, (List)s9, f32);
        }
        throw new IllegalArgumentException(String.format((String)"FN requires an ArrayValue of parameter names found %s", (Object[])new Object[]{s9.getClass().getCanonicalName()}));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final s b(String object, f3 object2, List object3) {
        int n8 = I.a[C2.c((String)object).ordinal()];
        switch (n8) {
            default: {
                return super.a((String)object);
            }
            case 13: {
                C2.f(Z.y0, 3, (List)object3);
                if (!object2.b((s)object3.get(0)).d().booleanValue()) return object2.b((s)object3.get(2));
                return object2.b((s)object3.get(1));
            }
            case 12: {
                C2.f(Z.x0, 3, (List)object3);
                object = object2.b((s)object3.get(0));
                s s8 = object2.b((s)object3.get(1));
                s s9 = object2.b((s)object3.get(2));
                if (!(s8 instanceof g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(s9 instanceof g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                object3 = (g)s8;
                s8 = (g)s9;
                n8 = 0;
                for (int i8 = 0; i8 < object3.U(); ++i8) {
                    if (n8 == 0 && !object.equals((Object)object2.b(object3.M(i8)))) continue;
                    s9 = object2.b(s8.M(i8));
                    if (s9 instanceof l) {
                        if (((l)s9).b().equals((Object)"break")) return s.d;
                        return s9;
                    }
                    n8 = 1;
                }
                if (object3.U() + 1 != s8.U() || !((object = object2.b(s8.M(object3.U()))) instanceof l) || !(object2 = ((l)object).b()).equals((Object)"return") && !object2.equals((Object)"continue")) return s.d;
                return object;
            }
            case 11: {
                if (object3.isEmpty()) {
                    return s.h;
                }
                C2.f(Z.u0, 1, (List)object3);
                return new l("return", object2.b((s)object3.get(0)));
            }
            case 10: {
                return new g((List)object3);
            }
            case 9: {
                C2.j(Z.e0, 2, (List)object3);
                s s10 = object2.b((s)object3.get(0));
                s s11 = object2.b((s)object3.get(1));
                object = object3.size() > 2 ? object2.b((s)object3.get(2)) : null;
                object3 = s.d;
                object = s10.d() != false ? object2.a((g)s11) : (object != null ? object2.a((g)object) : object3);
                if (!(object instanceof l)) return object3;
                return object;
            }
            case 8: {
                return F.c((f3)object2, (List)object3);
            }
            case 7: {
                C2.j(Z.J, 2, (List)object3);
                object3 = (t)F.c((f3)object2, (List)object3);
                object = object3.e() == null ? "" : object3.e();
                object2.h((String)object, (s)object3);
                return object3;
            }
            case 6: {
                C2.f(Z.B, 0, (List)object3);
                return s.f;
            }
            case 4: 
            case 5: {
                if (object3.isEmpty() || !((object = object2.b((s)object3.get(0))) instanceof g)) return s.d;
                return object2.a((g)object);
            }
            case 3: {
                C2.f(Z.B, 0, (List)object3);
                return s.g;
            }
            case 2: {
                return object2.d().a(new g((List)object3));
            }
            case 1: 
        }
        C2.f(Z.r, 3, (List)object3);
        object = object2.b((s)object3.get(0));
        String string2 = object2.b((s)object3.get(1)).g();
        object3 = object2.b((s)object3.get(2));
        if (!(object3 instanceof g)) {
            throw new IllegalArgumentException(String.format((String)"Function arguments for Apply are not a list found %s", (Object[])new Object[]{object3.getClass().getCanonicalName()}));
        }
        if (string2.isEmpty()) throw new IllegalArgumentException("Function name for apply is undefined");
        return object.s(string2, (f3)object2, ((g)object3).a0());
    }
}

