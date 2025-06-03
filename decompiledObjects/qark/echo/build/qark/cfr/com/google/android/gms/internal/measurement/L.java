/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.N;
import com.google.android.gms.internal.measurement.O;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.T;
import com.google.android.gms.internal.measurement.Z;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import java.util.Iterator;
import java.util.List;

public final class L
extends A {
    public L() {
        this.a.add((Object)Z.P);
        this.a.add((Object)Z.Q);
        this.a.add((Object)Z.R);
        this.a.add((Object)Z.S);
        this.a.add((Object)Z.T);
        this.a.add((Object)Z.U);
        this.a.add((Object)Z.V);
        this.a.add((Object)Z.C0);
    }

    public static s c(P p8, s s8, s s9) {
        return L.d(p8, s8.k(), s9);
    }

    public static s d(P p8, Iterator iterator, s s8) {
        if (iterator != null) {
            while (iterator.hasNext()) {
                s s9 = p8.a((s)iterator.next()).a((g)s8);
                if (!(s9 instanceof l)) continue;
                if ("break".equals((Object)(s9 = (l)s9).b())) {
                    return s.d;
                }
                if (!"return".equals((Object)s9.b())) continue;
                return s9;
            }
        }
        return s.d;
    }

    public static s e(P p8, s s8, s s9) {
        if (s8 instanceof Iterable) {
            return L.d(p8, ((Iterable)s8).iterator(), s9);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final s b(String object, f3 f32, List object2) {
        switch (O.a[C2.c((String)object).ordinal()]) {
            default: {
                return super.a((String)object);
            }
            case 8: {
                C2.f(Z.C0, 4, (List)object2);
                object = (s)object2.get(0);
                s s8 = (s)object2.get(1);
                s s9 = (s)object2.get(2);
                object2 = f32.b((s)object2.get(3));
                if (f32.b(s9).d().booleanValue() && (s9 = f32.a((g)object2)) instanceof l) {
                    if ("break".equals((Object)(s9 = (l)s9).b())) return s.d;
                    if ("return".equals((Object)s9.b())) {
                        return s9;
                    }
                }
                while (f32.b((s)object).d().booleanValue()) {
                    s9 = f32.a((g)object2);
                    if (s9 instanceof l) {
                        if ("break".equals((Object)(s9 = (l)s9).b())) return s.d;
                        if ("return".equals((Object)s9.b())) {
                            return s9;
                        }
                    }
                    f32.b(s8);
                }
                return s.d;
            }
            case 7: {
                C2.f(Z.V, 3, (List)object2);
                if (!(object2.get(0) instanceof u)) throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                object = ((s)object2.get(0)).g();
                s s10 = f32.b((s)object2.get(1));
                object2 = f32.b((s)object2.get(2));
                return L.e(new Q(f32, (String)object), s10, (s)object2);
            }
            case 6: {
                C2.f(Z.U, 3, (List)object2);
                if (!(object2.get(0) instanceof u)) throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                object = ((s)object2.get(0)).g();
                s s11 = f32.b((s)object2.get(1));
                object2 = f32.b((s)object2.get(2));
                return L.e(new N(f32, (String)object), s11, (s)object2);
            }
            case 5: {
                C2.f(Z.T, 3, (List)object2);
                if (!(object2.get(0) instanceof u)) throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                object = ((s)object2.get(0)).g();
                s s12 = f32.b((s)object2.get(1));
                object2 = f32.b((s)object2.get(2));
                return L.e(new T(f32, (String)object), s12, (s)object2);
            }
            case 4: {
                C2.f(Z.S, 4, (List)object2);
                object = f32.b((s)object2.get(0));
                if (!(object instanceof g)) throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                g g8 = (g)object;
                s s13 = (s)object2.get(1);
                s s14 = (s)object2.get(2);
                s s15 = f32.b((s)object2.get(3));
                object2 = f32.d();
                int n8 = 0;
                do {
                    object = object2;
                    if (n8 >= g8.U()) break;
                    object = g8.M(n8).g();
                    object2.h((String)object, f32.c((String)object));
                    ++n8;
                } while (true);
                while (f32.b(s13).d().booleanValue()) {
                    object2 = f32.a((g)s15);
                    if (object2 instanceof l) {
                        if ("break".equals((Object)(object2 = (l)object2).b())) return s.d;
                        if ("return".equals((Object)object2.b())) {
                            return object2;
                        }
                    }
                    object2 = f32.d();
                    for (n8 = 0; n8 < g8.U(); ++n8) {
                        String string2 = g8.M(n8).g();
                        object2.h(string2, object.c(string2));
                    }
                    object2.b(s14);
                    object = object2;
                }
                return s.d;
            }
            case 3: {
                C2.f(Z.R, 3, (List)object2);
                if (!(object2.get(0) instanceof u)) throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                object = ((s)object2.get(0)).g();
                s s16 = f32.b((s)object2.get(1));
                object2 = f32.b((s)object2.get(2));
                return L.c(new Q(f32, (String)object), s16, (s)object2);
            }
            case 2: {
                C2.f(Z.Q, 3, (List)object2);
                if (!(object2.get(0) instanceof u)) throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                object = ((s)object2.get(0)).g();
                s s17 = f32.b((s)object2.get(1));
                object2 = f32.b((s)object2.get(2));
                return L.c(new N(f32, (String)object), s17, (s)object2);
            }
            case 1: 
        }
        C2.f(Z.P, 3, (List)object2);
        if (!(object2.get(0) instanceof u)) throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
        object = ((s)object2.get(0)).g();
        s s18 = f32.b((s)object2.get(1));
        object2 = f32.b((s)object2.get(2));
        return L.c(new T(f32, (String)object), s18, (s)object2);
    }
}

