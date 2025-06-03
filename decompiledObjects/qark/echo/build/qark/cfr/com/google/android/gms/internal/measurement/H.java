/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.K;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.t;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public abstract class H {
    public static g a(g g8, f3 f32, n n8) {
        return H.b(g8, f32, n8, null, null);
    }

    public static g b(g g8, f3 f32, n n8, Boolean bl, Boolean bl2) {
        g g9 = new g();
        Iterator iterator = g8.Z();
        while (iterator.hasNext()) {
            int n9 = (Integer)iterator.next();
            if (!g8.Y(n9)) continue;
            s s8 = n8.b(f32, Arrays.asList((Object[])new s[]{g8.M(n9), new k((double)n9), g8}));
            if (s8.d().equals((Object)bl)) {
                return g9;
            }
            if (bl2 != null && !s8.d().equals((Object)bl2)) continue;
            g9.X(n9, s8);
        }
        return g9;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static s c(g var0, f3 var1_1, List var2_2, boolean var3_3) {
        block4 : {
            C2.k("reduce", 1, (List)var2_2);
            C2.n("reduce", 2, (List)var2_2);
            var10_4 = var1_1.b((s)var2_2.get(0));
            if (var10_4 instanceof n == false) throw new IllegalArgumentException("Callback should be a method");
            if (var2_2.size() == 2) {
                if ((var2_2 = var1_1.b((s)var2_2.get(1))) instanceof l != false) throw new IllegalArgumentException("Failed to parse initial value");
            } else {
                if (var0.U() == 0) throw new IllegalStateException("Empty array with no initial value error");
                var2_2 = null;
            }
            var11_5 = (n)var10_4;
            var5_6 = var0.U();
            var4_7 = var3_3 != false ? 0 : var5_6 - 1;
            var5_6 = var3_3 ? --var5_6 : 0;
            var6_8 = var3_3 != false ? 1 : -1;
            var8_9 = var5_6;
            var7_10 = var4_7;
            var10_4 = var2_2;
            var9_11 = var6_8;
            if (var2_2 != null) break block4;
            var2_2 = var0.M(var4_7);
            ** GOTO lbl34
        }
        while ((var8_9 - var7_10) * var9_11 >= 0) {
            var5_6 = var8_9;
            var4_7 = var7_10;
            var2_2 = var10_4;
            var6_8 = var9_11;
            if (var0.Y(var7_10)) {
                var2_2 = var11_5.b(var1_1, Arrays.asList((Object[])new s[]{var10_4, var0.M(var7_10), new k((double)var7_10), var0}));
                if (var2_2 instanceof l != false) throw new IllegalStateException("Reduce operation failed");
                var5_6 = var8_9;
                var4_7 = var7_10;
                var6_8 = var9_11;
            }
lbl34: // 4 sources:
            var7_10 = var4_7 + var6_8;
            var8_9 = var5_6;
            var10_4 = var2_2;
            var9_11 = var6_8;
        }
        return var10_4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static s d(String var0, g var1_1, f3 var2_2, List var3_3) {
        block89 : {
            var0.hashCode();
            switch (var0.hashCode()) {
                case 1943291465: {
                    if (!var0.equals((Object)"indexOf")) break;
                    var10_4 = 19;
                    ** break;
                }
                case 1099846370: {
                    if (!var0.equals((Object)"reverse")) break;
                    var10_4 = 18;
                    ** break;
                }
                case 965561430: {
                    if (!var0.equals((Object)"reduceRight")) break;
                    var10_4 = 17;
                    ** break;
                }
                case 109526418: {
                    if (!var0.equals((Object)"slice")) break;
                    var10_4 = 16;
                    ** break;
                }
                case 109407362: {
                    if (!var0.equals((Object)"shift")) break;
                    var10_4 = 15;
                    ** break;
                }
                case 96891675: {
                    if (!var0.equals((Object)"every")) break;
                    var10_4 = 14;
                    ** break;
                }
                case 3536286: {
                    if (!var0.equals((Object)"sort")) break;
                    var10_4 = 13;
                    ** break;
                }
                case 3536116: {
                    if (!var0.equals((Object)"some")) break;
                    var10_4 = 12;
                    ** break;
                }
                case 3452698: {
                    if (!var0.equals((Object)"push")) break;
                    var10_4 = 11;
                    ** break;
                }
                case 3267882: {
                    if (!var0.equals((Object)"join")) break;
                    var10_4 = 10;
                    ** break;
                }
                case 111185: {
                    if (!var0.equals((Object)"pop")) break;
                    var10_4 = 9;
                    ** break;
                }
                case 107868: {
                    if (!var0.equals((Object)"map")) break;
                    var10_4 = 8;
                    ** break;
                }
                case -277637751: {
                    if (!var0.equals((Object)"unshift")) break;
                    var10_4 = 7;
                    ** break;
                }
                case -467511597: {
                    if (!var0.equals((Object)"lastIndexOf")) break;
                    var10_4 = 6;
                    ** break;
                }
                case -678635926: {
                    if (!var0.equals((Object)"forEach")) break;
                    var10_4 = 5;
                    ** break;
                }
                case -895859076: {
                    if (!var0.equals((Object)"splice")) break;
                    var10_4 = 4;
                    ** break;
                }
                case -934873754: {
                    if (!var0.equals((Object)"reduce")) break;
                    var10_4 = 3;
                    ** break;
                }
                case -1274492040: {
                    if (!var0.equals((Object)"filter")) break;
                    var10_4 = 2;
                    ** break;
                }
                case -1354795244: {
                    if (!var0.equals((Object)"concat")) break;
                    var10_4 = 1;
                    ** break;
                }
                case -1776922004: {
                    if (var0.equals((Object)"toString")) break block89;
                }
            }
            var10_4 = -1;
            ** break;
        }
        var10_4 = 0;
lbl85: // 21 sources:
        var4_5 = 0.0;
        switch (var10_4) {
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
            case 19: {
                C2.n("indexOf", 2, (List)var3_3);
                var0 = s.d;
                if (!var3_3.isEmpty()) {
                    var0 = var2_2.b((s)var3_3.get(0));
                }
                if (var3_3.size() > 1) {
                    var4_5 = C2.a(var2_2.b((s)var3_3.get(1)).f());
                    if (var4_5 >= (double)var1_1.U()) {
                        return new k(-1.0);
                    }
                    if (var4_5 < 0.0) {
                        var4_5 = (double)var1_1.U() + var4_5;
                    }
                }
                var2_2 = var1_1.Z();
                do {
                    if (var2_2.hasNext() == false) return new k(-1.0);
                } while ((var6_6 = (double)(var10_4 = ((Integer)var2_2.next()).intValue())) < var4_5 || !C2.h(var1_1.M(var10_4), (s)var0));
                return new k(var6_6);
            }
            case 18: {
                C2.g("reverse", 0, (List)var3_3);
                var11_9 = var1_1.U();
                if (var11_9 == 0) return var1_1;
                var10_4 = 0;
                while (var10_4 < var11_9 / 2) {
                    if (var1_1.Y(var10_4)) {
                        var0 = var1_1.M(var10_4);
                        var1_1.X(var10_4, null);
                        var12_11 = var11_9 - 1 - var10_4;
                        if (var1_1.Y(var12_11)) {
                            var1_1.X(var10_4, var1_1.M(var12_11));
                        }
                        var1_1.X(var12_11, (s)var0);
                    }
                    ++var10_4;
                }
                return var1_1;
            }
            case 17: {
                return H.c(var1_1, (f3)var2_2, (List)var3_3, false);
            }
            case 16: {
                C2.n("slice", 2, (List)var3_3);
                if (var3_3.isEmpty()) {
                    return var1_1.c();
                }
                var8_13 = var1_1.U();
                var4_5 = C2.a(var2_2.b((s)var3_3.get(0)).f());
                var6_7 = var4_5 < 0.0 ? Math.max((double)(var4_5 + var8_13), (double)0.0) : Math.min((double)var4_5, (double)var8_13);
                var4_5 = var8_13;
                if (var3_3.size() == 2) {
                    var4_5 = C2.a(var2_2.b((s)var3_3.get(1)).f());
                    var4_5 = var4_5 < 0.0 ? Math.max((double)(var8_13 + var4_5), (double)0.0) : Math.min((double)var8_13, (double)var4_5);
                }
                var0 = new g();
                var10_4 = (int)var6_7;
                while ((double)var10_4 < var4_5) {
                    var0.T(var1_1.M(var10_4));
                    ++var10_4;
                }
                return var0;
            }
            case 15: {
                C2.g("shift", 0, (List)var3_3);
                if (var1_1.U() == 0) {
                    return s.d;
                }
                var0 = var1_1.M(0);
                var1_1.W(0);
                return var0;
            }
            case 14: {
                C2.g("every", 1, (List)var3_3);
                var0 = var2_2.b((s)var3_3.get(0));
                if (var0 instanceof t == false) throw new IllegalArgumentException("Callback should be a method");
                if (var1_1.U() == 0) return s.i;
                if (H.b(var1_1, (f3)var2_2, (t)var0, Boolean.FALSE, Boolean.TRUE).U() == var1_1.U()) return s.i;
                return s.j;
            }
            case 13: {
                C2.n("sort", 1, (List)var3_3);
                if (var1_1.U() < 2) return var1_1;
                var14_14 = var1_1.a0();
                if (!var3_3.isEmpty()) {
                    var0 = var2_2.b((s)var3_3.get(0));
                    if (var0 instanceof n == false) throw new IllegalArgumentException("Comparator should be a method");
                    var0 = (n)var0;
                } else {
                    var0 = null;
                }
                Collections.sort((List)var14_14, (Comparator)new K((n)var0, (f3)var2_2));
                var1_1.b0();
                var0 = var14_14.iterator();
                var10_4 = 0;
                while (var0.hasNext() != false) {
                    var1_1.X(var10_4, (s)var0.next());
                    ++var10_4;
                }
                return var1_1;
            }
            case 12: {
                C2.g("some", 1, (List)var3_3);
                var0 = var2_2.b((s)var3_3.get(0));
                if (var0 instanceof n == false) throw new IllegalArgumentException("Callback should be a method");
                if (var1_1.U() == 0) return s.j;
                var0 = (n)var0;
                var3_3 = var1_1.Z();
                do {
                    if (var3_3.hasNext() == false) return s.j;
                } while (!var1_1.Y(var10_4 = ((Integer)var3_3.next()).intValue()) || !var0.b((f3)var2_2, Arrays.asList((Object[])new s[]{var1_1.M(var10_4), new k((double)var10_4), var1_1})).d().booleanValue());
                return s.i;
            }
            case 11: {
                if (var3_3.isEmpty() != false) return new k((double)var1_1.U());
                var0 = var3_3.iterator();
                while (var0.hasNext() != false) {
                    var1_1.T(var2_2.b((s)var0.next()));
                }
                return new k((double)var1_1.U());
            }
            case 10: {
                C2.n("join", 1, (List)var3_3);
                if (var1_1.U() == 0) {
                    return s.k;
                }
                if (var3_3.isEmpty()) {
                    var0 = ",";
                    return new u(var1_1.V((String)var0));
                }
                var0 = var2_2.b((s)var3_3.get(0));
                if (!(var0 instanceof q) && !(var0 instanceof z)) {
                    var0 = var0.g();
                    return new u(var1_1.V((String)var0));
                }
                var0 = "";
                return new u(var1_1.V((String)var0));
            }
            case 9: {
                C2.g("pop", 0, (List)var3_3);
                var10_4 = var1_1.U();
                if (var10_4 == 0) {
                    return s.d;
                }
                var0 = var1_1.M(--var10_4);
                var1_1.W(var10_4);
                return var0;
            }
            case 8: {
                C2.g("map", 1, (List)var3_3);
                var0 = var2_2.b((s)var3_3.get(0));
                if (var0 instanceof t == false) throw new IllegalArgumentException("Callback should be a method");
                if (var1_1.U() != 0) return H.a(var1_1, (f3)var2_2, (t)var0);
                return new g();
            }
            case 7: {
                if (var3_3.isEmpty() != false) return new k((double)var1_1.U());
                var0 = new g();
                var3_3 = var3_3.iterator();
                while (var3_3.hasNext()) {
                    var14_15 = var2_2.b((s)var3_3.next());
                    if (var14_15 instanceof l != false) throw new IllegalStateException("Argument evaluation failed");
                    var0.T(var14_15);
                }
                var10_4 = var0.U();
                var2_2 = var1_1.Z();
                while (var2_2.hasNext()) {
                    var3_3 = (Integer)var2_2.next();
                    var0.X(var3_3.intValue() + var10_4, var1_1.M(var3_3.intValue()));
                }
                var1_1.b0();
                var2_2 = var0.Z();
                while (var2_2.hasNext() != false) {
                    var3_3 = (Integer)var2_2.next();
                    var1_1.X(var3_3.intValue(), var0.M(var3_3.intValue()));
                }
                return new k((double)var1_1.U());
            }
            case 6: {
                C2.n("lastIndexOf", 2, (List)var3_3);
                var0 = s.d;
                if (!var3_3.isEmpty()) {
                    var0 = var2_2.b((s)var3_3.get(0));
                }
                var4_5 = var1_1.U() - 1;
                if (var3_3.size() > 1) {
                    var4_5 = Double.isNaN((double)(var2_2 = var2_2.b((s)var3_3.get(1))).f()) != false ? (double)(var1_1.U() - 1) : C2.a(var2_2.f());
                    var6_8 = var4_5;
                    var4_5 = var6_8;
                    if (var6_8 < 0.0) {
                        var4_5 = var6_8 + (double)var1_1.U();
                    }
                }
                if (var4_5 < 0.0) {
                    return new k(-1.0);
                }
                var10_4 = (int)Math.min((double)var1_1.U(), (double)var4_5);
                while (var10_4 >= 0) {
                    if (var1_1.Y(var10_4) && C2.h(var1_1.M(var10_4), (s)var0)) {
                        return new k((double)var10_4);
                    }
                    --var10_4;
                }
                return new k(-1.0);
            }
            case 5: {
                C2.g("forEach", 1, (List)var3_3);
                var0 = var2_2.b((s)var3_3.get(0));
                if (var0 instanceof t == false) throw new IllegalArgumentException("Callback should be a method");
                if (var1_1.D() == 0) {
                    return s.d;
                }
                H.a(var1_1, (f3)var2_2, (t)var0);
                return s.d;
            }
            case 4: {
                if (var3_3.isEmpty()) {
                    return new g();
                }
                var11_10 = (int)C2.a(var2_2.b((s)var3_3.get(0)).f());
                if (var11_10 < 0) {
                    var10_4 = Math.max((int)0, (int)(var11_10 + var1_1.U()));
                } else {
                    var10_4 = var11_10;
                    if (var11_10 > var1_1.U()) {
                        var10_4 = var1_1.U();
                    }
                }
                var12_12 = var1_1.U();
                var0 = new g();
                var11_10 = var10_4;
                if (var3_3.size() <= 1) {
                    while (var11_10 < var12_12) {
                        var0.T(var1_1.M(var11_10));
                        var1_1.X(var11_10, null);
                        ++var11_10;
                    }
                    return var0;
                }
                var13_18 = Math.max((int)0, (int)((int)C2.a(var2_2.b((s)var3_3.get(1)).f())));
                if (var13_18 > 0) {
                    for (var11_10 = var10_4; var11_10 < Math.min((int)var12_12, (int)(var10_4 + var13_18)); ++var11_10) {
                        var0.T(var1_1.M(var10_4));
                        var1_1.W(var10_4);
                    }
                }
                if (var3_3.size() <= 2) return var0;
                var11_10 = 2;
                while (var11_10 < var3_3.size()) {
                    var14_16 = var2_2.b((s)var3_3.get(var11_10));
                    if (var14_16 instanceof l != false) throw new IllegalArgumentException("Failed to parse elements to add");
                    var1_1.S(var10_4 + var11_10 - 2, var14_16);
                    ++var11_10;
                }
                return var0;
            }
            case 3: {
                return H.c(var1_1, (f3)var2_2, (List)var3_3, true);
            }
            case 2: {
                C2.g("filter", 1, (List)var3_3);
                var3_3 = var2_2.b((s)var3_3.get(0));
                if (var3_3 instanceof t == false) throw new IllegalArgumentException("Callback should be a method");
                if (var1_1.D() == 0) {
                    return new g();
                }
                var0 = (g)var1_1.c();
                var2_2 = H.b(var1_1, (f3)var2_2, (t)var3_3, null, Boolean.TRUE);
                var1_1 = new g();
                var2_2 = var2_2.Z();
                while (var2_2.hasNext() != false) {
                    var1_1.T(var0.M((Integer)var2_2.next()));
                }
                return var1_1;
            }
            case 1: {
                var0 = (g)var1_1.c();
                if (var3_3.isEmpty() != false) return var0;
                var1_1 = var3_3.iterator();
                block58 : while (var1_1.hasNext() != false) {
                    var3_3 = var2_2.b((s)var1_1.next());
                    if (var3_3 instanceof l != false) throw new IllegalStateException("Failed evaluation of arguments");
                    var10_4 = var0.U();
                    if (var3_3 instanceof g) {
                        var3_3 = (g)var3_3;
                        var14_17 = var3_3.Z();
                        do {
                            if (!var14_17.hasNext()) continue block58;
                            var15_19 = (Integer)var14_17.next();
                            var0.X(var15_19 + var10_4, var3_3.M(var15_19));
                        } while (true);
                    }
                    var0.X(var10_4, (s)var3_3);
                }
                return var0;
            }
            case 0: 
        }
        C2.g("toString", 0, (List)var3_3);
        return new u(var1_1.toString());
    }
}

