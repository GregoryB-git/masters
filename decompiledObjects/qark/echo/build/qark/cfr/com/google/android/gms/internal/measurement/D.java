/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.internal.measurement.Z;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.z;
import java.util.List;

public final class D
extends A {
    public D() {
        this.a.add((Object)Z.M);
        this.a.add((Object)Z.a0);
        this.a.add((Object)Z.b0);
        this.a.add((Object)Z.c0);
        this.a.add((Object)Z.d0);
        this.a.add((Object)Z.f0);
        this.a.add((Object)Z.g0);
        this.a.add((Object)Z.l0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean c(s s8, s s9) {
        s s10 = s8;
        do {
            block20 : {
                block23 : {
                    block18 : {
                        boolean bl;
                        boolean bl2;
                        block22 : {
                            block21 : {
                                block19 : {
                                    block17 : {
                                        if (s10.getClass().equals((Object)s9.getClass())) {
                                            if (s10 instanceof z) {
                                                return true;
                                            }
                                            if (s10 instanceof q) {
                                                return true;
                                            }
                                            if (s10 instanceof k) {
                                                if (!Double.isNaN((double)s10.f())) {
                                                    if (Double.isNaN((double)s9.f())) {
                                                        return false;
                                                    }
                                                    if (s10.f().doubleValue() == s9.f().doubleValue()) {
                                                        return true;
                                                    }
                                                }
                                                return false;
                                            }
                                            if (s10 instanceof u) {
                                                return s10.g().equals((Object)s9.g());
                                            }
                                            if (s10 instanceof h) {
                                                return s10.d().equals((Object)s9.d());
                                            }
                                            if (s10 == s9) {
                                                return true;
                                            }
                                            return false;
                                        }
                                        if (s10 instanceof z || s10 instanceof q) {
                                            if (s9 instanceof z) {
                                                return true;
                                            }
                                            if (s9 instanceof q) {
                                                return true;
                                            }
                                        }
                                        if (!(bl2 = s10 instanceof k) || !(s9 instanceof u)) break block17;
                                        s8 = new k(s9.f());
                                        break block18;
                                    }
                                    bl = s10 instanceof u;
                                    if (!bl || !(s9 instanceof k)) break block19;
                                    s8 = new k(s10.f());
                                    break block20;
                                }
                                if (!(s10 instanceof h)) break block21;
                                s8 = new k(s10.f());
                                break block20;
                            }
                            if (!(s9 instanceof h)) break block22;
                            s8 = new k(s9.f());
                            break block18;
                        }
                        if (!bl && !bl2 || !(s9 instanceof m)) break block23;
                        s8 = new u(s9.g());
                    }
                    s9 = s8;
                    continue;
                }
                if (!(s10 instanceof m) || !(s9 instanceof u) && !(s9 instanceof k)) break;
                s8 = new u(s10.g());
            }
            s10 = s8;
        } while (true);
        return false;
    }

    public static boolean d(s s8, s s9) {
        s s10 = s8;
        if (s8 instanceof m) {
            s10 = new u(s8.g());
        }
        s8 = s9;
        if (s9 instanceof m) {
            s8 = new u(s9.g());
        }
        if (s10 instanceof u && s8 instanceof u) {
            if (s10.g().compareTo(s8.g()) < 0) {
                return true;
            }
            return false;
        }
        double d8 = s10.f();
        double d9 = s8.f();
        if (!Double.isNaN((double)d8)) {
            if (Double.isNaN((double)d9)) {
                return false;
            }
            if (d8 == 0.0 && d9 == 0.0 || d8 == 0.0 && d9 == 0.0) {
                return false;
            }
            if (Double.compare((double)d8, (double)d9) < 0) {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean e(s s8, s s9) {
        s s10 = s8;
        if (s8 instanceof m) {
            s10 = new u(s8.g());
        }
        s8 = s9;
        if (s9 instanceof m) {
            s8 = new u(s9.g());
        }
        if (!(s10 instanceof u) || !(s8 instanceof u)) {
            if (Double.isNaN((double)s10.f())) return false;
            if (Double.isNaN((double)s8.f())) {
                return false;
            }
        }
        if (D.d(s8, s10)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final s b(String var1_1, f3 var2_2, List var3_3) {
        C2.f(C2.c(var1_1), 2, var3_3);
        var5_4 = var2_2.b((s)var3_3.get(0));
        var2_2 = var2_2.b((s)var3_3.get(1));
        switch (G.a[C2.c(var1_1).ordinal()]) {
            default: {
                return super.a(var1_1);
            }
            case 8: {
                var4_5 = D.c(var5_4, (s)var2_2);
                ** GOTO lbl18
            }
            case 7: {
                var4_5 = D.e(var5_4, (s)var2_2);
                ** break;
            }
            case 6: {
                var4_5 = D.d(var5_4, (s)var2_2);
                ** break;
            }
            case 5: {
                var4_5 = C2.h(var5_4, (s)var2_2);
lbl18: // 2 sources:
                var4_5 ^= true;
                ** break;
            }
            case 4: {
                var4_5 = C2.h(var5_4, (s)var2_2);
                ** break;
            }
            case 3: {
                var4_5 = D.e((s)var2_2, var5_4);
                ** break;
            }
            case 2: {
                var4_5 = D.d((s)var2_2, var5_4);
                ** break;
            }
            case 1: 
        }
        var4_5 = D.c(var5_4, (s)var2_2);
lbl31: // 7 sources:
        if (var4_5 == false) return s.j;
        return s.i;
    }
}

