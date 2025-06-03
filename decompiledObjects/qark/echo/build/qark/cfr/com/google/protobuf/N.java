/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Field
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  sun.misc.Unsafe
 */
package com.google.protobuf;

import android.support.v4.media.a;
import com.google.protobuf.A;
import com.google.protobuf.D;
import com.google.protobuf.F;
import com.google.protobuf.I;
import com.google.protobuf.K;
import com.google.protobuf.P;
import com.google.protobuf.V;
import com.google.protobuf.W;
import com.google.protobuf.Y;
import com.google.protobuf.Z;
import com.google.protobuf.b0;
import com.google.protobuf.d0;
import com.google.protobuf.f;
import com.google.protobuf.g0;
import com.google.protobuf.h;
import com.google.protobuf.k0;
import com.google.protobuf.l;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import com.google.protobuf.o;
import com.google.protobuf.p;
import com.google.protobuf.r;
import com.google.protobuf.t;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

public final class N
implements Z {
    public static final int[] r = new int[0];
    public static final Unsafe s = k0.D();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final K e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final int k;
    public final int l;
    public final P m;
    public final A n;
    public final g0 o;
    public final l p;
    public final F q;

    public N(int[] arrn, Object[] arrobject, int n8, int n9, K k8, boolean bl, boolean bl2, int[] arrn2, int n10, int n11, P p8, A a8, g0 g02, l l8, F f8) {
        this.a = arrn;
        this.b = arrobject;
        this.c = n8;
        this.d = n9;
        this.g = k8 instanceof r;
        this.h = bl;
        bl = l8 != null && l8.d(k8);
        this.f = bl;
        this.i = bl2;
        this.j = arrn2;
        this.k = n10;
        this.l = n11;
        this.m = p8;
        this.n = a8;
        this.o = g02;
        this.p = l8;
        this.e = k8;
        this.q = f8;
    }

    public static boolean C(int n8) {
        if ((n8 & 268435456) != 0) {
            return true;
        }
        return false;
    }

    public static List D(Object object, long l8) {
        return (List)k0.C(object, l8);
    }

    public static long E(Object object, long l8) {
        return k0.A(object, l8);
    }

    public static N I(Class class_, I i8, P p8, A a8, g0 g02, l l8, F f8) {
        if (i8 instanceof Y) {
            return N.K((Y)i8, p8, a8, g02, l8, f8);
        }
        a.a(i8);
        return N.J(null, p8, a8, g02, l8, f8);
    }

    public static N J(d0 d02, P p8, A a8, g0 g02, l l8, F f8) {
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static N K(Y var0, P var1_1, A var2_2, g0 var3_3, l var4_4, F var5_5) {
        var31_6 = var0.b() == V.p;
        var33_7 = var0.e();
        var20_8 = var33_7.length();
        if (var33_7.charAt(0) >= '\ud800') {
            var6_9 = 1;
            do {
                var7_10 = var8_11 = var6_9 + 1;
                if (var33_7.charAt(var6_9) >= '\ud800') {
                    var6_9 = var8_11;
                    continue;
                }
                break;
            } while (true);
        } else {
            var7_10 = 1;
        }
        var6_9 = var7_10 + 1;
        var9_12 = var33_7.charAt(var7_10);
        var8_11 = var6_9;
        var7_10 = var9_12;
        if (var9_12 >= 55296) {
            var8_11 = var9_12 & 8191;
            var7_10 = 13;
            var9_12 = var6_9;
            do {
                var6_9 = var9_12 + 1;
                if ((var9_12 = (int)var33_7.charAt(var9_12)) < 55296) break;
                var8_11 |= (var9_12 & 8191) << var7_10;
                var7_10 += 13;
                var9_12 = var6_9;
            } while (true);
            var7_10 = var8_11 | var9_12 << var7_10;
            var8_11 = var6_9;
        }
        if (var7_10 == 0) {
            var32_13 = N.r;
            var15_17 = var13_16 = (var7_10 = (var6_9 = (var10_15 = (var12_14 = (var9_12 = 0)))));
            var11_18 = var6_9;
        } else {
            var7_10 = var8_11 + 1;
            var6_9 = var9_12 = (int)var33_7.charAt(var8_11);
            var8_11 = var7_10;
            if (var9_12 >= 55296) {
                var8_11 = var9_12 & 8191;
                var6_9 = 13;
                var9_12 = var7_10;
                do {
                    var7_10 = var9_12 + 1;
                    if ((var9_12 = (int)var33_7.charAt(var9_12)) < 55296) break;
                    var8_11 |= (var9_12 & 8191) << var6_9;
                    var6_9 += 13;
                    var9_12 = var7_10;
                } while (true);
                var6_9 = var8_11 | var9_12 << var6_9;
                var8_11 = var7_10;
            }
            var7_10 = var8_11 + 1;
            var13_16 = var9_12 = (int)var33_7.charAt(var8_11);
            var8_11 = var7_10;
            if (var9_12 >= 55296) {
                var9_12 &= 8191;
                var8_11 = 13;
                var10_15 = var7_10;
                do {
                    var7_10 = var10_15 + 1;
                    if ((var10_15 = (int)var33_7.charAt(var10_15)) < 55296) break;
                    var9_12 |= (var10_15 & 8191) << var8_11;
                    var8_11 += 13;
                    var10_15 = var7_10;
                } while (true);
                var13_16 = var9_12 | var10_15 << var8_11;
                var8_11 = var7_10;
            }
            var7_10 = var8_11 + 1;
            var8_11 = var10_15 = (int)var33_7.charAt(var8_11);
            var9_12 = var7_10;
            if (var10_15 >= 55296) {
                var9_12 = var10_15 & 8191;
                var8_11 = 13;
                var10_15 = var7_10;
                do {
                    var7_10 = var10_15 + 1;
                    if ((var10_15 = (int)var33_7.charAt(var10_15)) < 55296) break;
                    var9_12 |= (var10_15 & 8191) << var8_11;
                    var8_11 += 13;
                    var10_15 = var7_10;
                } while (true);
                var8_11 = var9_12 | var10_15 << var8_11;
                var9_12 = var7_10;
            }
            var7_10 = var9_12 + 1;
            var9_12 = var11_18 = (int)var33_7.charAt(var9_12);
            var10_15 = var7_10;
            if (var11_18 >= 55296) {
                var10_15 = var11_18 & 8191;
                var9_12 = 13;
                var11_18 = var7_10;
                do {
                    var7_10 = var11_18 + 1;
                    if ((var11_18 = (int)var33_7.charAt(var11_18)) < 55296) break;
                    var10_15 |= (var11_18 & 8191) << var9_12;
                    var9_12 += 13;
                    var11_18 = var7_10;
                } while (true);
                var9_12 = var10_15 | var11_18 << var9_12;
                var10_15 = var7_10;
            }
            var7_10 = var10_15 + 1;
            var10_15 = var12_14 = (int)var33_7.charAt(var10_15);
            var11_18 = var7_10;
            if (var12_14 >= 55296) {
                var11_18 = var12_14 & 8191;
                var10_15 = 13;
                var12_14 = var7_10;
                do {
                    var7_10 = var12_14 + 1;
                    if ((var12_14 = (int)var33_7.charAt(var12_14)) < 55296) break;
                    var11_18 |= (var12_14 & 8191) << var10_15;
                    var10_15 += 13;
                    var12_14 = var7_10;
                } while (true);
                var10_15 = var11_18 | var12_14 << var10_15;
                var11_18 = var7_10;
            }
            var7_10 = var11_18 + 1;
            var14_19 = var33_7.charAt(var11_18);
            var11_18 = var14_19;
            var12_14 = var7_10;
            if (var14_19 >= 55296) {
                var12_14 = var14_19 & 8191;
                var11_18 = 13;
                var14_19 = var7_10;
                do {
                    var7_10 = var14_19 + 1;
                    if ((var14_19 = (int)var33_7.charAt(var14_19)) < 55296) break;
                    var12_14 |= (var14_19 & 8191) << var11_18;
                    var11_18 += 13;
                    var14_19 = var7_10;
                } while (true);
                var11_18 = var12_14 | var14_19 << var11_18;
                var12_14 = var7_10;
            }
            var7_10 = var12_14 + 1;
            var14_19 = var15_17 = (int)var33_7.charAt(var12_14);
            var12_14 = var7_10;
            if (var15_17 >= 55296) {
                var14_19 = var15_17 & 8191;
                var12_14 = 13;
                var15_17 = var7_10;
                do {
                    var7_10 = var15_17 + 1;
                    if ((var15_17 = (int)var33_7.charAt(var15_17)) < 55296) break;
                    var14_19 |= (var15_17 & 8191) << var12_14;
                    var12_14 += 13;
                    var15_17 = var7_10;
                } while (true);
                var14_19 |= var15_17 << var12_14;
                var12_14 = var7_10;
            }
            var15_17 = var12_14 + 1;
            var7_10 = var16_20 = (int)var33_7.charAt(var12_14);
            var12_14 = var15_17;
            if (var16_20 >= 55296) {
                var12_14 = var16_20 & 8191;
                var7_10 = 13;
                var16_20 = var15_17;
                var15_17 = var12_14;
                do {
                    var12_14 = var16_20 + 1;
                    if ((var16_20 = (int)var33_7.charAt(var16_20)) < 55296) break;
                    var15_17 |= (var16_20 & 8191) << var7_10;
                    var7_10 += 13;
                    var16_20 = var12_14;
                } while (true);
                var7_10 = var15_17 | var16_20 << var7_10;
            }
            var32_13 = new int[var7_10 + var11_18 + var14_19];
            var13_16 = var6_9 * 2 + var13_16;
            var14_19 = var12_14;
            var12_14 = var9_12;
            var9_12 = var8_11;
            var15_17 = var6_9;
            var8_11 = var14_19;
        }
        var35_21 = N.s;
        var36_22 = var0.d();
        var37_23 = var0.c().getClass();
        var38_24 = new int[var10_15 * 3];
        var39_25 = new Object[var10_15 * 2];
        var27_26 = var7_10 + var11_18;
        var6_9 = var7_10;
        var19_27 = var27_26;
        var11_18 = 0;
        var14_19 = 0;
        var10_15 = var13_16;
        var17_28 = var7_10;
        var16_20 = var12_14;
        var18_29 = var9_12;
        var7_10 = var20_8;
        do {
            block53 : {
                block58 : {
                    block54 : {
                        block55 : {
                            block56 : {
                                block57 : {
                                    block49 : {
                                        block51 : {
                                            block52 : {
                                                block50 : {
                                                    var28_36 = var14_19;
                                                    if (var8_11 >= var7_10) return new N(var38_24, var39_25, var18_29, var16_20, var0.c(), var31_6, false, var32_13, var17_28, var27_26, var1_1, var2_2, var3_3, var4_4, var5_5);
                                                    var13_16 = var8_11 + 1;
                                                    var14_19 = var33_7.charAt(var8_11);
                                                    if (var14_19 >= 55296) {
                                                        var12_14 = var14_19 & 8191;
                                                        var8_11 = 13;
                                                        do {
                                                            var9_12 = var13_16 + 1;
                                                            if ((var13_16 = (int)var33_7.charAt(var13_16)) < 55296) break;
                                                            var12_14 |= (var13_16 & 8191) << var8_11;
                                                            var8_11 += 13;
                                                            var13_16 = var9_12;
                                                        } while (true);
                                                        var14_19 = var12_14 | var13_16 << var8_11;
                                                    } else {
                                                        var9_12 = var13_16;
                                                    }
                                                    var8_11 = var9_12 + 1;
                                                    var20_8 = var33_7.charAt(var9_12);
                                                    if (var20_8 >= 55296) {
                                                        var12_14 = var20_8 & 8191;
                                                        var9_12 = 13;
                                                        do {
                                                            var13_16 = var8_11 + 1;
                                                            var20_8 = var33_7.charAt(var8_11);
                                                            var8_11 = var7_10;
                                                            if (var20_8 < 55296) break;
                                                            var12_14 |= (var20_8 & 8191) << var9_12;
                                                            var9_12 += 13;
                                                            var7_10 = var8_11;
                                                            var8_11 = var13_16;
                                                        } while (true);
                                                        var20_8 = var12_14 | var20_8 << var9_12;
                                                        var12_14 = var13_16;
                                                    } else {
                                                        var12_14 = var8_11;
                                                        var8_11 = var7_10;
                                                    }
                                                    var30_38 = var20_8 & 255;
                                                    var9_12 = var11_18;
                                                    if ((var20_8 & 1024) != 0) {
                                                        var32_13[var11_18] = var28_36;
                                                        var9_12 = var11_18 + 1;
                                                    }
                                                    if (var30_38 < 51) break block49;
                                                    var11_18 = var12_14 + 1;
                                                    var12_14 = var13_16 = (int)var33_7.charAt(var12_14);
                                                    var7_10 = var11_18;
                                                    if (var13_16 >= 55296) {
                                                        var12_14 = var13_16 & 8191;
                                                        var7_10 = 13;
                                                        var13_16 = var11_18;
                                                        do {
                                                            var11_18 = var13_16 + 1;
                                                            if ((var13_16 = (int)var33_7.charAt(var13_16)) < 55296) break;
                                                            var12_14 |= (var13_16 & 8191) << var7_10;
                                                            var7_10 += 13;
                                                            var13_16 = var11_18;
                                                        } while (true);
                                                        var12_14 |= var13_16 << var7_10;
                                                        var7_10 = var11_18;
                                                    }
                                                    if ((var13_16 = var30_38 - 51) == 9 || var13_16 == 17) break block50;
                                                    var11_18 = var10_15;
                                                    if (var13_16 != 12) break block51;
                                                    var11_18 = var10_15;
                                                    if (var31_6) break block51;
                                                    var13_16 = var28_36 / 3;
                                                    var11_18 = var10_15 + 1;
                                                    var39_25[var13_16 * 2 + 1] = var36_22[var10_15];
                                                    var10_15 = var11_18;
                                                    break block52;
                                                }
                                                var13_16 = var28_36 / 3;
                                                var11_18 = var10_15 + 1;
                                                var39_25[var13_16 * 2 + 1] = var36_22[var10_15];
                                                var10_15 = var11_18;
                                            }
                                            var11_18 = var10_15;
                                        }
                                        if ((var34_39 = var36_22[var10_15 = var12_14 * 2]) instanceof Field) {
                                            var34_39 = (Field)var34_39;
                                        } else {
                                            var36_22[var10_15] = var34_39 = N.T(var37_23, (String)var34_39);
                                        }
                                        var25_34 = (int)var35_21.objectFieldOffset((Field)var34_39);
                                        var34_39 = var36_22[++var10_15];
                                        if (var34_39 instanceof Field) {
                                            var34_39 = (Field)var34_39;
                                        } else {
                                            var36_22[var10_15] = var34_39 = N.T(var37_23, (String)var34_39);
                                        }
                                        var26_35 = (int)var35_21.objectFieldOffset((Field)var34_39);
                                        var24_33 = 0;
                                        var10_15 = var11_18;
                                        var23_32 = var6_9;
                                        var22_31 = var19_27;
                                        break block53;
                                    }
                                    var13_16 = var10_15 + 1;
                                    var34_39 = N.T(var37_23, (String)var36_22[var10_15]);
                                    if (var30_38 == 9 || var30_38 == 17) break block54;
                                    if (var30_38 == 27 || var30_38 == 49) break block55;
                                    if (var30_38 == 12 || var30_38 == 30 || var30_38 == 44) break block56;
                                    var7_10 = var13_16;
                                    var11_18 = var6_9;
                                    if (var30_38 != 50) ** GOTO lbl-1000
                                    var7_10 = var6_9 + 1;
                                    var32_13[var6_9] = var28_36;
                                    var21_30 = var28_36 / 3 * 2;
                                    var11_18 = var10_15 + 2;
                                    var39_25[var21_30] = var36_22[var13_16];
                                    if ((var20_8 & 2048) == 0) break block57;
                                    var6_9 = var10_15 + 3;
                                    var39_25[var21_30 + 1] = var36_22[var11_18];
                                    var11_18 = var7_10;
                                    var7_10 = var6_9;
                                    ** GOTO lbl-1000
                                }
                                var6_9 = var7_10;
                                var7_10 = var11_18;
                                break block58;
                            }
                            var7_10 = var13_16;
                            var11_18 = var6_9;
                            if (!var31_6) {
                                var11_18 = var28_36 / 3;
                                var7_10 = var10_15 + 2;
                                var39_25[var11_18 * 2 + 1] = var36_22[var13_16];
                            } else lbl-1000: // 3 sources:
                            {
                                var6_9 = var11_18;
                            }
                            break block58;
                        }
                        var11_18 = var28_36 / 3;
                        var7_10 = var10_15 + 2;
                        var39_25[var11_18 * 2 + 1] = var36_22[var13_16];
                        break block58;
                    }
                    var39_25[var28_36 / 3 * 2 + 1] = var34_39.getType();
                    var7_10 = var13_16;
                }
                var29_37 = (int)var35_21.objectFieldOffset((Field)var34_39);
                var21_30 = var7_10;
                if ((var20_8 & 4096) == 4096 && var30_38 <= 17) {
                    var10_15 = var12_14 + 1;
                    var7_10 = var33_7.charAt(var12_14);
                    if (var7_10 >= 55296) {
                        var12_14 = var7_10 & 8191;
                        var7_10 = 13;
                        var11_18 = var10_15;
                        var10_15 = var12_14;
                        do {
                            var13_16 = var11_18 + 1;
                            if ((var11_18 = (int)var33_7.charAt(var11_18)) < 55296) break;
                            var10_15 |= (var11_18 & 8191) << var7_10;
                            var7_10 += 13;
                            var11_18 = var13_16;
                        } while (true);
                        var7_10 = var10_15 | var11_18 << var7_10;
                    } else {
                        var13_16 = var10_15;
                    }
                    var10_15 = var15_17 * 2 + var7_10 / 32;
                    var34_39 = var36_22[var10_15];
                    if (var34_39 instanceof Field) {
                        var34_39 = (Field)var34_39;
                    } else {
                        var36_22[var10_15] = var34_39 = N.T(var37_23, (String)var34_39);
                    }
                    var12_14 = (int)var35_21.objectFieldOffset((Field)var34_39);
                    var11_18 = var7_10 % 32;
                } else {
                    var7_10 = 1048575;
                    var11_18 = 0;
                    var13_16 = var12_14;
                    var12_14 = var7_10;
                }
                var24_33 = var11_18;
                var25_34 = var29_37;
                var26_35 = var12_14;
                var10_15 = var21_30;
                var23_32 = var6_9;
                var22_31 = var19_27;
                var7_10 = var13_16;
                if (var30_38 >= 18) {
                    var24_33 = var11_18;
                    var25_34 = var29_37;
                    var26_35 = var12_14;
                    var10_15 = var21_30;
                    var23_32 = var6_9;
                    var22_31 = var19_27;
                    var7_10 = var13_16;
                    if (var30_38 <= 49) {
                        var32_13[var19_27] = var29_37;
                        var22_31 = var19_27 + 1;
                        var7_10 = var13_16;
                        var23_32 = var6_9;
                        var10_15 = var21_30;
                        var26_35 = var12_14;
                        var25_34 = var29_37;
                        var24_33 = var11_18;
                    }
                }
            }
            var38_24[var28_36] = var14_19;
            var6_9 = (var20_8 & 512) != 0 ? 536870912 : 0;
            var11_18 = (var20_8 & 256) != 0 ? 268435456 : 0;
            var38_24[var28_36 + 1] = var11_18 | var6_9 | var30_38 << 20 | var25_34;
            var14_19 = var28_36 + 3;
            var38_24[var28_36 + 2] = var24_33 << 20 | var26_35;
            var6_9 = var7_10;
            var7_10 = var8_11;
            var8_11 = var6_9;
            var11_18 = var9_12;
            var6_9 = var23_32;
            var19_27 = var22_31;
        } while (true);
    }

    public static long M(int n8) {
        return n8 & 1048575;
    }

    public static boolean N(Object object, long l8) {
        return (Boolean)k0.C(object, l8);
    }

    public static double O(Object object, long l8) {
        return (Double)k0.C(object, l8);
    }

    public static float P(Object object, long l8) {
        return ((Float)k0.C(object, l8)).floatValue();
    }

    public static int Q(Object object, long l8) {
        return (Integer)k0.C(object, l8);
    }

    public static long R(Object object, long l8) {
        return (Long)k0.C(object, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Field T(Class class_, String string2) {
        try {
            return class_.getDeclaredField(string2);
        }
        catch (NoSuchFieldException noSuchFieldException) {}
        Object[] arrobject = class_.getDeclaredFields();
        int n8 = arrobject.length;
        int n9 = 0;
        do {
            Field field;
            if (n9 >= n8) {
                field = new StringBuilder();
                field.append("Field ");
                field.append(string2);
                field.append(" for ");
                field.append(class_.getName());
                field.append(" not found. Known fields are ");
                field.append(Arrays.toString((Object[])arrobject));
                throw new RuntimeException(field.toString());
            }
            field = arrobject[n9];
            if (string2.equals((Object)field.getName())) {
                return field;
            }
            ++n9;
        } while (true);
    }

    public static int W(int n8) {
        return (n8 & 267386880) >>> 20;
    }

    public static boolean j(Object object, long l8) {
        return k0.r(object, l8);
    }

    public static void k(Object object) {
        if (N.z(object)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mutating immutable message: ");
        stringBuilder.append(object);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static double l(Object object, long l8) {
        return k0.x(object, l8);
    }

    public static float n(Object object, long l8) {
        return k0.y(object, l8);
    }

    public static int t(Object object, long l8) {
        return k0.z(object, l8);
    }

    public static boolean w(Object object, int n8, Z z8) {
        return z8.c(k0.C(object, N.M(n8)));
    }

    public static boolean z(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof r) {
            return ((r)object).I();
        }
        return true;
    }

    public final boolean A(Object object, Object object2, int n8) {
        long l8 = this.S(n8) & 1048575;
        if (k0.z(object, l8) == k0.z(object2, l8)) {
            return true;
        }
        return false;
    }

    public final boolean B(Object object, int n8, int n9) {
        if (k0.z(object, this.S(n9) & 1048575) == n8) {
            return true;
        }
        return false;
    }

    public final void F(Object object, Object object2, int n8) {
        if (!this.u(object2, n8)) {
            return;
        }
        Unsafe unsafe = s;
        long l8 = N.M(this.X(n8));
        Object object3 = unsafe.getObject(object2, l8);
        if (object3 != null) {
            Object object4;
            Z z8 = this.p(n8);
            if (!this.u(object, n8)) {
                if (!N.z(object3)) {
                    unsafe.putObject(object, l8, object3);
                } else {
                    object2 = z8.f();
                    z8.a(object2, object3);
                    unsafe.putObject(object, l8, object2);
                }
                this.U(object, n8);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l8);
            if (!N.z(object4)) {
                object2 = z8.f();
                z8.a(object2, object4);
                unsafe.putObject(object, l8, object2);
            }
            z8.a(object2, object3);
            return;
        }
        object = new StringBuilder();
        object.append("Source subfield ");
        object.append(this.L(n8));
        object.append(" is present but null: ");
        object.append(object2);
        throw new IllegalStateException(object.toString());
    }

    public final void G(Object object, Object object2, int n8) {
        int n9 = this.L(n8);
        if (!this.B(object2, n9, n8)) {
            return;
        }
        Unsafe unsafe = s;
        long l8 = N.M(this.X(n8));
        Object object3 = unsafe.getObject(object2, l8);
        if (object3 != null) {
            Object object4;
            Z z8 = this.p(n8);
            if (!this.B(object, n9, n8)) {
                if (!N.z(object3)) {
                    unsafe.putObject(object, l8, object3);
                } else {
                    object2 = z8.f();
                    z8.a(object2, object3);
                    unsafe.putObject(object, l8, object2);
                }
                this.V(object, n9, n8);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l8);
            if (!N.z(object4)) {
                object2 = z8.f();
                z8.a(object2, object4);
                unsafe.putObject(object, l8, object2);
            }
            z8.a(object2, object3);
            return;
        }
        object = new StringBuilder();
        object.append("Source subfield ");
        object.append(this.L(n8));
        object.append(" is present but null: ");
        object.append(object2);
        throw new IllegalStateException(object.toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void H(Object var1_1, Object var2_2, int var3_3) {
        block24 : {
            var4_4 = this.X(var3_3);
            var6_5 = N.M(var4_4);
            var5_6 = this.L(var3_3);
            switch (N.W(var4_4)) {
                default: {
                    return;
                }
                case 60: 
                case 68: {
                    this.G(var1_1, var2_2, var3_3);
                    return;
                }
                case 61: 
                case 62: 
                case 63: 
                case 64: 
                case 65: 
                case 66: 
                case 67: {
                    if (this.B(var2_2, var5_6, var3_3) == false) return;
                    ** GOTO lbl15
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: {
                    if (this.B(var2_2, var5_6, var3_3) == false) return;
lbl15: // 2 sources:
                    k0.R(var1_1, var6_5, k0.C(var2_2, var6_5));
                    this.V(var1_1, var5_6, var3_3);
                    return;
                }
                case 50: {
                    b0.D(this.q, var1_1, var2_2, var6_5);
                    return;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    this.n.d(var1_1, var2_2, var6_5);
                    return;
                }
                case 9: 
                case 17: {
                    this.F(var1_1, var2_2, var3_3);
                    return;
                }
                case 16: {
                    if (this.u(var2_2, var3_3) == false) return;
                    ** GOTO lbl71
                }
                case 15: {
                    if (this.u(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 14: {
                    if (this.u(var2_2, var3_3) == false) return;
                    ** GOTO lbl71
                }
                case 13: {
                    if (this.u(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 12: {
                    if (this.u(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 11: {
                    if (this.u(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 10: {
                    if (this.u(var2_2, var3_3) == false) return;
                    ** GOTO lbl50
                }
                case 8: {
                    if (this.u(var2_2, var3_3) == false) return;
lbl50: // 2 sources:
                    k0.R(var1_1, var6_5, k0.C(var2_2, var6_5));
                    break block24;
                }
                case 7: {
                    if (this.u(var2_2, var3_3) == false) return;
                    k0.H(var1_1, var6_5, k0.r(var2_2, var6_5));
                    break block24;
                }
                case 6: {
                    if (this.u(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 5: {
                    if (this.u(var2_2, var3_3) == false) return;
                    ** GOTO lbl71
                }
                case 4: {
                    if (this.u(var2_2, var3_3) == false) return;
lbl64: // 6 sources:
                    k0.P(var1_1, var6_5, k0.z(var2_2, var6_5));
                    break block24;
                }
                case 3: {
                    if (this.u(var2_2, var3_3) == false) return;
                    ** GOTO lbl71
                }
                case 2: {
                    if (this.u(var2_2, var3_3) == false) return;
lbl71: // 5 sources:
                    k0.Q(var1_1, var6_5, k0.A(var2_2, var6_5));
                    break block24;
                }
                case 1: {
                    if (this.u(var2_2, var3_3) == false) return;
                    k0.O(var1_1, var6_5, k0.y(var2_2, var6_5));
                    break block24;
                }
                case 0: 
            }
            if (this.u(var2_2, var3_3) == false) return;
            k0.N(var1_1, var6_5, k0.x(var2_2, var6_5));
        }
        this.U(var1_1, var3_3);
    }

    public final int L(int n8) {
        return this.a[n8];
    }

    public final int S(int n8) {
        return this.a[n8 + 2];
    }

    public final void U(Object object, int n8) {
        long l8 = 1048575 & (n8 = this.S(n8));
        if (l8 == 1048575L) {
            return;
        }
        k0.P(object, l8, 1 << (n8 >>> 20) | k0.z(object, l8));
    }

    public final void V(Object object, int n8, int n9) {
        k0.P(object, this.S(n9) & 1048575, n8);
    }

    public final int X(int n8) {
        return this.a[n8 + 1];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void Y(Object var1_1, n0 var2_2) {
        if (this.f && !(var15_3 = this.p.b(var1_1)).j()) {
            var17_4 = var15_3.n();
            var15_3 = (Map.Entry)var17_4.next();
        } else {
            var17_4 = null;
            var15_3 = null;
        }
        var8_5 = this.a.length;
        var18_6 = N.s;
        var3_7 = 1048575;
        var6_8 = 0;
        var4_9 = 0;
        do {
            block118 : {
                var16_17 = var15_3;
                if (var6_8 >= var8_5) break;
                var9_12 = this.X(var6_8);
                var10_13 = this.L(var6_8);
                var11_14 = N.W(var9_12);
                if (var11_14 <= 17) {
                    var12_15 = this.a[var6_8 + 2];
                    var7_11 = var12_15 & 1048575;
                    var5_10 = var3_7;
                    if (var7_11 != var3_7) {
                        var4_9 = var18_6.getInt(var1_1, (long)var7_11);
                        var5_10 = var7_11;
                    }
                    var7_11 = 1 << (var12_15 >>> 20);
                    var3_7 = var5_10;
                } else {
                    var7_11 = 0;
                }
                while (var15_3 != null && this.p.a((Map.Entry)var15_3) <= var10_13) {
                    this.p.f(var2_2, (Map.Entry)var15_3);
                    if (var17_4.hasNext()) {
                        var15_3 = (Map.Entry)var17_4.next();
                        continue;
                    }
                    var15_3 = null;
                }
                var13_16 = N.M(var9_12);
                switch (var11_14) {
                    case 68: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.L(var10_13, var18_6.getObject(var1_1, var13_16), this.p(var6_8));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 67: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.w(var10_13, N.R(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 66: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.H(var10_13, N.Q(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 65: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.n(var10_13, N.R(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 64: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.g(var10_13, N.Q(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 63: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.D(var10_13, N.Q(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 62: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.e(var10_13, N.Q(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 61: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.M(var10_13, (f)var18_6.getObject(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 60: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.N(var10_13, var18_6.getObject(var1_1, var13_16), this.p(var6_8));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 59: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            this.c0(var10_13, var18_6.getObject(var1_1, var13_16), var2_2);
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 58: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.d(var10_13, N.N(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 57: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.l(var10_13, N.Q(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 56: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.u(var10_13, N.R(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 55: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.i(var10_13, N.Q(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 54: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.C(var10_13, N.R(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 53: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.c(var10_13, N.R(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 52: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.x(var10_13, N.P(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 51: {
                        if (this.B(var1_1, var10_13, var6_8)) {
                            var2_2.m(var10_13, N.O(var1_1, var13_16));
                            ** break;
                        }
                    }
lbl127: // 20 sources:
                    default: {
                        ** break;
                    }
                    case 50: {
                        this.b0(var2_2, var10_13, var18_6.getObject(var1_1, var13_16), var6_8);
                        ** break;
                    }
                    case 49: {
                        b0.R(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, this.p(var6_8));
                        ** break;
                    }
                    case 48: {
                        b0.Y(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 47: {
                        b0.X(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 46: {
                        b0.W(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 45: {
                        b0.V(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 44: {
                        b0.N(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 43: {
                        b0.a0(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 42: {
                        b0.K(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 41: {
                        b0.O(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 40: {
                        b0.P(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 39: {
                        b0.S(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 38: {
                        b0.b0(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 37: {
                        b0.T(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 36: {
                        b0.Q(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 35: {
                        b0.M(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 34: {
                        b0.Y(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 33: {
                        b0.X(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 32: {
                        b0.W(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 31: {
                        b0.V(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 30: {
                        b0.N(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 29: {
                        b0.a0(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 28: {
                        b0.L(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2);
                        ** break;
                    }
                    case 27: {
                        b0.U(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, this.p(var6_8));
                        ** break;
                    }
                    case 26: {
                        b0.Z(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2);
                        ** break;
                    }
                    case 25: {
                        b0.K(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 24: {
                        b0.O(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 23: {
                        b0.P(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 22: {
                        b0.S(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 21: {
                        b0.b0(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 20: {
                        b0.T(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 19: {
                        b0.Q(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 18: {
                        b0.M(this.L(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 17: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.L(var10_13, var18_6.getObject(var1_1, var13_16), this.p(var6_8));
                            ** break;
                        }
                        break block118;
                    }
                    case 16: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.w(var10_13, var18_6.getLong(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 15: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.H(var10_13, var18_6.getInt(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 14: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.n(var10_13, var18_6.getLong(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 13: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.g(var10_13, var18_6.getInt(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 12: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.D(var10_13, var18_6.getInt(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 11: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.e(var10_13, var18_6.getInt(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 10: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.M(var10_13, (f)var18_6.getObject(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 9: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.N(var10_13, var18_6.getObject(var1_1, var13_16), this.p(var6_8));
                            ** break;
                        }
                        break block118;
                    }
                    case 8: {
                        if ((var7_11 & var4_9) != 0) {
                            this.c0(var10_13, var18_6.getObject(var1_1, var13_16), var2_2);
                            ** break;
                        }
                        break block118;
                    }
                    case 7: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.d(var10_13, N.j(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 6: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.l(var10_13, var18_6.getInt(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 5: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.u(var10_13, var18_6.getLong(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 4: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.i(var10_13, var18_6.getInt(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 3: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.C(var10_13, var18_6.getLong(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 2: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.c(var10_13, var18_6.getLong(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 1: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.x(var10_13, N.n(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 0: 
                }
                if ((var7_11 & var4_9) != 0) {
                    var2_2.m(var10_13, N.l(var1_1, var13_16));
                }
            }
            var6_8 += 3;
        } while (true);
        do {
            if (var16_17 == null) {
                this.d0(this.o, var1_1, var2_2);
                return;
            }
            this.p.f(var2_2, (Map.Entry)var16_17);
            if (var17_4.hasNext()) {
                var16_17 = (Map.Entry)var17_4.next();
                continue;
            }
            var16_17 = null;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void Z(Object var1_1, n0 var2_2) {
        if (this.f && !(var13_3 = this.p.b(var1_1)).j()) {
            var15_4 = var13_3.n();
            var13_3 = (Map.Entry)var15_4.next();
        } else {
            var13_3 = var15_4 = null;
        }
        var8_5 = this.a.length;
        var6_6 = 0;
        do {
            block100 : {
                block101 : {
                    var14_13 = var13_3;
                    if (var6_6 >= var8_5) break;
                    var7_9 = this.X(var6_6);
                    var9_10 = this.L(var6_6);
                    while (var13_3 != null && this.p.a((Map.Entry)var13_3) <= var9_10) {
                        this.p.f(var2_2, (Map.Entry)var13_3);
                        if (var15_4.hasNext()) {
                            var13_3 = (Map.Entry)var15_4.next();
                            continue;
                        }
                        var13_3 = null;
                    }
                    switch (N.W(var7_9)) {
                        default: {
                            ** break;
                        }
                        case 68: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            ** GOTO lbl192
                        }
                        case 67: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = N.R(var1_1, N.M(var7_9));
                            ** GOTO lbl197
                        }
                        case 66: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = N.Q(var1_1, N.M(var7_9));
                            ** GOTO lbl202
                        }
                        case 65: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = N.R(var1_1, N.M(var7_9));
                            ** GOTO lbl207
                        }
                        case 64: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = N.Q(var1_1, N.M(var7_9));
                            ** GOTO lbl212
                        }
                        case 63: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = N.Q(var1_1, N.M(var7_9));
                            ** GOTO lbl217
                        }
                        case 62: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = N.Q(var1_1, N.M(var7_9));
                            ** GOTO lbl222
                        }
                        case 61: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            ** GOTO lbl226
                        }
                        case 60: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            ** GOTO lbl230
                        }
                        case 59: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            ** GOTO lbl234
                        }
                        case 58: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var12_12 = N.N(var1_1, N.M(var7_9));
                            ** GOTO lbl239
                        }
                        case 57: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = N.Q(var1_1, N.M(var7_9));
                            ** GOTO lbl244
                        }
                        case 56: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = N.R(var1_1, N.M(var7_9));
                            ** GOTO lbl249
                        }
                        case 55: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = N.Q(var1_1, N.M(var7_9));
                            ** GOTO lbl254
                        }
                        case 54: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = N.R(var1_1, N.M(var7_9));
                            ** GOTO lbl259
                        }
                        case 53: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = N.R(var1_1, N.M(var7_9));
                            ** GOTO lbl264
                        }
                        case 52: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var5_8 = N.P(var1_1, N.M(var7_9));
                            ** GOTO lbl269
                        }
                        case 51: {
                            if (!this.B(var1_1, var9_10, var6_6)) break block100;
                            var3_7 = N.O(var1_1, N.M(var7_9));
                            break block101;
                        }
                        case 50: {
                            this.b0(var2_2, var9_10, k0.C(var1_1, N.M(var7_9)), var6_6);
                            ** break;
                        }
                        case 49: {
                            b0.R(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, this.p(var6_6));
                            ** break;
                        }
                        case 48: {
                            b0.Y(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 47: {
                            b0.X(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 46: {
                            b0.W(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 45: {
                            b0.V(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 44: {
                            b0.N(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 43: {
                            b0.a0(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 42: {
                            b0.K(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 41: {
                            b0.O(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 40: {
                            b0.P(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 39: {
                            b0.S(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 38: {
                            b0.b0(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 37: {
                            b0.T(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 36: {
                            b0.Q(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 35: {
                            b0.M(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 34: {
                            b0.Y(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 33: {
                            b0.X(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 32: {
                            b0.W(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 31: {
                            b0.V(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 30: {
                            b0.N(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 29: {
                            b0.a0(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 28: {
                            b0.L(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2);
                            ** break;
                        }
                        case 27: {
                            b0.U(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, this.p(var6_6));
                            ** break;
                        }
                        case 26: {
                            b0.Z(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2);
                            ** break;
                        }
                        case 25: {
                            b0.K(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 24: {
                            b0.O(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 23: {
                            b0.P(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 22: {
                            b0.S(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 21: {
                            b0.b0(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 20: {
                            b0.T(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 19: {
                            b0.Q(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 18: {
                            b0.M(this.L(var6_6), (List)k0.C(var1_1, N.M(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 17: {
                            if (!this.u(var1_1, var6_6)) break block100;
lbl192: // 2 sources:
                            var2_2.L(var9_10, k0.C(var1_1, N.M(var7_9)), this.p(var6_6));
                            break block100;
                        }
                        case 16: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var10_11 = N.E(var1_1, N.M(var7_9));
lbl197: // 2 sources:
                            var2_2.w(var9_10, var10_11);
                            break block100;
                        }
                        case 15: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var7_9 = N.t(var1_1, N.M(var7_9));
lbl202: // 2 sources:
                            var2_2.H(var9_10, var7_9);
                            break block100;
                        }
                        case 14: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var10_11 = N.E(var1_1, N.M(var7_9));
lbl207: // 2 sources:
                            var2_2.n(var9_10, var10_11);
                            break block100;
                        }
                        case 13: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var7_9 = N.t(var1_1, N.M(var7_9));
lbl212: // 2 sources:
                            var2_2.g(var9_10, var7_9);
                            break block100;
                        }
                        case 12: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var7_9 = N.t(var1_1, N.M(var7_9));
lbl217: // 2 sources:
                            var2_2.D(var9_10, var7_9);
                            break block100;
                        }
                        case 11: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var7_9 = N.t(var1_1, N.M(var7_9));
lbl222: // 2 sources:
                            var2_2.e(var9_10, var7_9);
                            break block100;
                        }
                        case 10: {
                            if (!this.u(var1_1, var6_6)) break block100;
lbl226: // 2 sources:
                            var2_2.M(var9_10, (f)k0.C(var1_1, N.M(var7_9)));
                            break block100;
                        }
                        case 9: {
                            if (!this.u(var1_1, var6_6)) break block100;
lbl230: // 2 sources:
                            var2_2.N(var9_10, k0.C(var1_1, N.M(var7_9)), this.p(var6_6));
                            break block100;
                        }
                        case 8: {
                            if (!this.u(var1_1, var6_6)) break block100;
lbl234: // 2 sources:
                            this.c0(var9_10, k0.C(var1_1, N.M(var7_9)), var2_2);
                            break block100;
                        }
                        case 7: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var12_12 = N.j(var1_1, N.M(var7_9));
lbl239: // 2 sources:
                            var2_2.d(var9_10, var12_12);
                            break block100;
                        }
                        case 6: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var7_9 = N.t(var1_1, N.M(var7_9));
lbl244: // 2 sources:
                            var2_2.l(var9_10, var7_9);
                            break block100;
                        }
                        case 5: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var10_11 = N.E(var1_1, N.M(var7_9));
lbl249: // 2 sources:
                            var2_2.u(var9_10, var10_11);
                            break block100;
                        }
                        case 4: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var7_9 = N.t(var1_1, N.M(var7_9));
lbl254: // 2 sources:
                            var2_2.i(var9_10, var7_9);
                            break block100;
                        }
                        case 3: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var10_11 = N.E(var1_1, N.M(var7_9));
lbl259: // 2 sources:
                            var2_2.C(var9_10, var10_11);
                            break block100;
                        }
                        case 2: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var10_11 = N.E(var1_1, N.M(var7_9));
lbl264: // 2 sources:
                            var2_2.c(var9_10, var10_11);
                            break block100;
                        }
                        case 1: {
                            if (!this.u(var1_1, var6_6)) break block100;
                            var5_8 = N.n(var1_1, N.M(var7_9));
lbl269: // 2 sources:
                            var2_2.x(var9_10, var5_8);
                            break block100;
                        }
                        case 0: 
                    }
                    if (!this.u(var1_1, var6_6)) break block100;
                    var3_7 = N.l(var1_1, N.M(var7_9));
                }
                var2_2.m(var9_10, var3_7);
                ** break;
            }
            var6_6 += 3;
        } while (true);
        do {
            if (var14_13 == null) {
                this.d0(this.o, var1_1, var2_2);
                return;
            }
            this.p.f(var2_2, (Map.Entry)var14_13);
            if (var15_4.hasNext()) {
                var14_13 = (Map.Entry)var15_4.next();
                continue;
            }
            var14_13 = null;
        } while (true);
    }

    @Override
    public void a(Object object, Object object2) {
        N.k(object);
        object2.getClass();
        for (int i8 = 0; i8 < this.a.length; i8 += 3) {
            this.H(object, object2, i8);
        }
        b0.E(this.o, object, object2);
        if (this.f) {
            b0.C(this.p, object, object2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a0(Object var1_1, n0 var2_2) {
        this.d0(this.o, var1_1, var2_2);
        if (this.f && !(var12_3 = this.p.b(var1_1)).j()) {
            var14_4 = var12_3.e();
            var12_3 = (Map.Entry)var14_4.next();
        } else {
            var12_3 = var14_4 = null;
        }
        var6_5 = this.a.length - 3;
        do {
            block99 : {
                block100 : {
                    var13_12 = var12_3;
                    if (var6_5 < 0) {
                        while (var13_12 != null) {
                            this.p.f(var2_2, (Map.Entry)var13_12);
                            if (var14_4.hasNext() == false) return;
                            var13_12 = (Map.Entry)var14_4.next();
                        }
                        return;
                    }
                    var7_8 = this.X(var6_5);
                    var8_9 = this.L(var6_5);
                    while (var12_3 != null && this.p.a((Map.Entry)var12_3) > var8_9) {
                        this.p.f(var2_2, (Map.Entry)var12_3);
                        if (var14_4.hasNext()) {
                            var12_3 = (Map.Entry)var14_4.next();
                            continue;
                        }
                        var12_3 = null;
                    }
                    switch (N.W(var7_8)) {
                        default: {
                            ** break;
                        }
                        case 68: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            ** GOTO lbl198
                        }
                        case 67: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = N.R(var1_1, N.M(var7_8));
                            ** GOTO lbl203
                        }
                        case 66: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = N.Q(var1_1, N.M(var7_8));
                            ** GOTO lbl208
                        }
                        case 65: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = N.R(var1_1, N.M(var7_8));
                            ** GOTO lbl213
                        }
                        case 64: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = N.Q(var1_1, N.M(var7_8));
                            ** GOTO lbl218
                        }
                        case 63: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = N.Q(var1_1, N.M(var7_8));
                            ** GOTO lbl223
                        }
                        case 62: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = N.Q(var1_1, N.M(var7_8));
                            ** GOTO lbl228
                        }
                        case 61: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            ** GOTO lbl232
                        }
                        case 60: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            ** GOTO lbl236
                        }
                        case 59: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            ** GOTO lbl240
                        }
                        case 58: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var11_11 = N.N(var1_1, N.M(var7_8));
                            ** GOTO lbl245
                        }
                        case 57: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = N.Q(var1_1, N.M(var7_8));
                            ** GOTO lbl250
                        }
                        case 56: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = N.R(var1_1, N.M(var7_8));
                            ** GOTO lbl255
                        }
                        case 55: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = N.Q(var1_1, N.M(var7_8));
                            ** GOTO lbl260
                        }
                        case 54: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = N.R(var1_1, N.M(var7_8));
                            ** GOTO lbl265
                        }
                        case 53: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = N.R(var1_1, N.M(var7_8));
                            ** GOTO lbl270
                        }
                        case 52: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var5_7 = N.P(var1_1, N.M(var7_8));
                            ** GOTO lbl275
                        }
                        case 51: {
                            if (!this.B(var1_1, var8_9, var6_5)) break block99;
                            var3_6 = N.O(var1_1, N.M(var7_8));
                            break block100;
                        }
                        case 50: {
                            this.b0(var2_2, var8_9, k0.C(var1_1, N.M(var7_8)), var6_5);
                            ** break;
                        }
                        case 49: {
                            b0.R(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, this.p(var6_5));
                            ** break;
                        }
                        case 48: {
                            b0.Y(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 47: {
                            b0.X(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 46: {
                            b0.W(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 45: {
                            b0.V(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 44: {
                            b0.N(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 43: {
                            b0.a0(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 42: {
                            b0.K(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 41: {
                            b0.O(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 40: {
                            b0.P(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 39: {
                            b0.S(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 38: {
                            b0.b0(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 37: {
                            b0.T(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 36: {
                            b0.Q(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 35: {
                            b0.M(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 34: {
                            b0.Y(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 33: {
                            b0.X(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 32: {
                            b0.W(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 31: {
                            b0.V(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 30: {
                            b0.N(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 29: {
                            b0.a0(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 28: {
                            b0.L(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2);
                            ** break;
                        }
                        case 27: {
                            b0.U(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, this.p(var6_5));
                            ** break;
                        }
                        case 26: {
                            b0.Z(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2);
                            ** break;
                        }
                        case 25: {
                            b0.K(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 24: {
                            b0.O(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 23: {
                            b0.P(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 22: {
                            b0.S(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 21: {
                            b0.b0(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 20: {
                            b0.T(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 19: {
                            b0.Q(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 18: {
                            b0.M(this.L(var6_5), (List)k0.C(var1_1, N.M(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 17: {
                            if (!this.u(var1_1, var6_5)) break block99;
lbl198: // 2 sources:
                            var2_2.L(var8_9, k0.C(var1_1, N.M(var7_8)), this.p(var6_5));
                            break block99;
                        }
                        case 16: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var9_10 = N.E(var1_1, N.M(var7_8));
lbl203: // 2 sources:
                            var2_2.w(var8_9, var9_10);
                            break block99;
                        }
                        case 15: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var7_8 = N.t(var1_1, N.M(var7_8));
lbl208: // 2 sources:
                            var2_2.H(var8_9, var7_8);
                            break block99;
                        }
                        case 14: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var9_10 = N.E(var1_1, N.M(var7_8));
lbl213: // 2 sources:
                            var2_2.n(var8_9, var9_10);
                            break block99;
                        }
                        case 13: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var7_8 = N.t(var1_1, N.M(var7_8));
lbl218: // 2 sources:
                            var2_2.g(var8_9, var7_8);
                            break block99;
                        }
                        case 12: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var7_8 = N.t(var1_1, N.M(var7_8));
lbl223: // 2 sources:
                            var2_2.D(var8_9, var7_8);
                            break block99;
                        }
                        case 11: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var7_8 = N.t(var1_1, N.M(var7_8));
lbl228: // 2 sources:
                            var2_2.e(var8_9, var7_8);
                            break block99;
                        }
                        case 10: {
                            if (!this.u(var1_1, var6_5)) break block99;
lbl232: // 2 sources:
                            var2_2.M(var8_9, (f)k0.C(var1_1, N.M(var7_8)));
                            break block99;
                        }
                        case 9: {
                            if (!this.u(var1_1, var6_5)) break block99;
lbl236: // 2 sources:
                            var2_2.N(var8_9, k0.C(var1_1, N.M(var7_8)), this.p(var6_5));
                            break block99;
                        }
                        case 8: {
                            if (!this.u(var1_1, var6_5)) break block99;
lbl240: // 2 sources:
                            this.c0(var8_9, k0.C(var1_1, N.M(var7_8)), var2_2);
                            break block99;
                        }
                        case 7: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var11_11 = N.j(var1_1, N.M(var7_8));
lbl245: // 2 sources:
                            var2_2.d(var8_9, var11_11);
                            break block99;
                        }
                        case 6: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var7_8 = N.t(var1_1, N.M(var7_8));
lbl250: // 2 sources:
                            var2_2.l(var8_9, var7_8);
                            break block99;
                        }
                        case 5: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var9_10 = N.E(var1_1, N.M(var7_8));
lbl255: // 2 sources:
                            var2_2.u(var8_9, var9_10);
                            break block99;
                        }
                        case 4: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var7_8 = N.t(var1_1, N.M(var7_8));
lbl260: // 2 sources:
                            var2_2.i(var8_9, var7_8);
                            break block99;
                        }
                        case 3: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var9_10 = N.E(var1_1, N.M(var7_8));
lbl265: // 2 sources:
                            var2_2.C(var8_9, var9_10);
                            break block99;
                        }
                        case 2: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var9_10 = N.E(var1_1, N.M(var7_8));
lbl270: // 2 sources:
                            var2_2.c(var8_9, var9_10);
                            break block99;
                        }
                        case 1: {
                            if (!this.u(var1_1, var6_5)) break block99;
                            var5_7 = N.n(var1_1, N.M(var7_8));
lbl275: // 2 sources:
                            var2_2.x(var8_9, var5_7);
                            break block99;
                        }
                        case 0: 
                    }
                    if (!this.u(var1_1, var6_5)) break block99;
                    var3_6 = N.l(var1_1, N.M(var7_8));
                }
                var2_2.m(var8_9, var3_6);
                ** break;
            }
            var6_5 -= 3;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b(Object var1_1) {
        if (!N.z(var1_1)) {
            return;
        }
        if (var1_1 instanceof r) {
            var7_2 = (r)var1_1;
            var7_2.r();
            var7_2.q();
            var7_2.K();
        }
        var3_3 = this.a.length;
        var2_4 = 0;
        do {
            if (var2_4 >= var3_3) {
                this.o.d(var1_1);
                if (this.f == false) return;
                this.p.e(var1_1);
                return;
            }
            var4_5 = this.X(var2_4);
            var5_6 = N.M(var4_5);
            if ((var4_5 = N.W(var4_5)) == 9) ** GOTO lbl-1000
            switch (var4_5) {
                default: {
                    break;
                }
                case 50: {
                    var7_2 = N.s;
                    var8_7 = var7_2.getObject(var1_1, var5_6);
                    if (var8_7 == null) break;
                    var7_2.putObject(var1_1, var5_6, this.q.c(var8_7));
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    this.n.c(var1_1, var5_6);
                    break;
                }
                case 17: lbl-1000: // 2 sources:
                {
                    if (!this.u(var1_1, var2_4)) break;
                    this.p(var2_4).b(N.s.getObject(var1_1, var5_6));
                }
            }
            var2_4 += 3;
        } while (true);
    }

    public final void b0(n0 n02, int n8, Object object, int n9) {
        if (object != null) {
            n02.O(n8, this.q.d(this.o(n9)), this.q.e(object));
        }
    }

    @Override
    public final boolean c(Object object) {
        int n8 = 1048575;
        for (int i8 = n9 = 0; i8 < this.k; ++i8) {
            int n9;
            int n10 = this.j[i8];
            int n11 = this.L(n10);
            int n12 = this.X(n10);
            int n13 = this.a[n10 + 2];
            int n14 = n13 & 1048575;
            n13 = 1 << (n13 >>> 20);
            if (n14 != n8) {
                if (n14 != 1048575) {
                    n9 = s.getInt(object, (long)n14);
                }
                n8 = n14;
            }
            if (N.C(n12) && !this.v(object, n10, n8, n9, n13)) {
                return false;
            }
            n14 = N.W(n12);
            if (n14 != 9 && n14 != 17) {
                if (n14 != 27) {
                    if (n14 != 60 && n14 != 68) {
                        if (n14 != 49) {
                            if (n14 != 50 || this.y(object, n12, n10)) continue;
                            return false;
                        }
                    } else {
                        if (!this.B(object, n11, n10) || N.w(object, n12, this.p(n10))) continue;
                        return false;
                    }
                }
                if (this.x(object, n12, n10)) continue;
                return false;
            }
            if (!this.v(object, n10, n8, n9, n13) || N.w(object, n12, this.p(n10))) continue;
            return false;
        }
        if (this.f && !this.p.b(object).k()) {
            return false;
        }
        return true;
    }

    public final void c0(int n8, Object object, n0 n02) {
        if (object instanceof String) {
            n02.A(n8, (String)object);
            return;
        }
        n02.M(n8, (f)object);
    }

    @Override
    public boolean d(Object object, Object object2) {
        int n8 = this.a.length;
        for (int i8 = 0; i8 < n8; i8 += 3) {
            if (this.m(object, object2, i8)) continue;
            return false;
        }
        if (!this.o.a(object).equals(this.o.a(object2))) {
            return false;
        }
        if (this.f) {
            return this.p.b(object).equals(this.p.b(object2));
        }
        return true;
    }

    public final void d0(g0 g02, Object object, n0 n02) {
        g02.h(g02.a(object), n02);
    }

    @Override
    public int e(Object object) {
        if (this.h) {
            return this.r(object);
        }
        return this.q(object);
    }

    @Override
    public Object f() {
        return this.m.a(this.e);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int g(Object var1_1) {
        var8_2 = this.a.length;
        var7_3 = 0;
        var6_4 = 0;
        do {
            block34 : {
                block35 : {
                    block36 : {
                        block37 : {
                            if (var7_3 >= var8_2) {
                                var5_7 = var6_4 = var6_4 * 53 + this.o.a(var1_1).hashCode();
                                if (this.f == false) return var5_7;
                                return var6_4 * 53 + this.p.b(var1_1).hashCode();
                            }
                            var5_7 = this.X(var7_3);
                            var9_8 = this.L(var7_3);
                            var11_10 = N.M(var5_7);
                            var10_9 = N.W(var5_7);
                            var5_7 = 37;
                            switch (var10_9) {
                                default: {
                                    var5_7 = var6_4;
                                    ** break;
                                }
                                case 68: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl56
                                }
                                case 67: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl94
                                }
                                case 66: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 65: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl94
                                }
                                case 64: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 63: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 62: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 61: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                }
                                case 10: 
                                case 18: 
                                case 19: 
                                case 20: 
                                case 21: 
                                case 22: 
                                case 23: 
                                case 24: 
                                case 25: 
                                case 26: 
                                case 27: 
                                case 28: 
                                case 29: 
                                case 30: 
                                case 31: 
                                case 32: 
                                case 33: 
                                case 34: 
                                case 35: 
                                case 36: 
                                case 37: 
                                case 38: 
                                case 39: 
                                case 40: 
                                case 41: 
                                case 42: 
                                case 43: 
                                case 44: 
                                case 45: 
                                case 46: 
                                case 47: 
                                case 48: 
                                case 49: 
                                case 50: {
                                    var5_7 = var6_4 * 53;
                                    var14_12 = k0.C(var1_1, var11_10);
                                    ** GOTO lbl58
                                }
                                case 60: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
lbl56: // 2 sources:
                                    var14_12 = k0.C(var1_1, var11_10);
                                    var5_7 = var6_4 * 53;
lbl58: // 2 sources:
                                    var6_4 = var14_12.hashCode();
                                    break block35;
                                }
                                case 59: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                }
                                case 8: {
                                    var5_7 = var6_4 * 53;
                                    var6_4 = ((String)k0.C(var1_1, var11_10)).hashCode();
                                    break block35;
                                }
                                case 58: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var13_11 = N.N(var1_1, var11_10);
                                    ** GOTO lbl130
                                }
                                case 57: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 56: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl94
                                }
                                case 55: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
lbl84: // 6 sources:
                                    var5_7 = var6_4 * 53;
                                    var6_4 = N.Q(var1_1, var11_10);
                                    break block35;
                                }
                                case 54: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl94
                                }
                                case 53: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
lbl94: // 5 sources:
                                    var5_7 = var6_4 * 53;
                                    var11_10 = N.R(var1_1, var11_10);
                                    break block36;
                                }
                                case 52: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var4_6 = N.P(var1_1, var11_10);
                                    ** GOTO lbl135
                                }
                                case 51: {
                                    var5_7 = var6_4;
                                    if (!this.B(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var2_5 = N.O(var1_1, var11_10);
                                    break block37;
                                }
                                case 17: {
                                    var14_12 = k0.C(var1_1, var11_10);
                                    if (var14_12 == null) ** GOTO lbl125
                                    ** GOTO lbl124
                                }
                                case 2: 
                                case 3: 
                                case 5: 
                                case 14: 
                                case 16: {
                                    var5_7 = var6_4 * 53;
                                    var11_10 = k0.A(var1_1, var11_10);
                                    break block36;
                                }
                                case 4: 
                                case 6: 
                                case 11: 
                                case 12: 
                                case 13: 
                                case 15: {
                                    var5_7 = var6_4 * 53;
                                    var6_4 = k0.z(var1_1, var11_10);
                                    break block35;
                                }
                                case 9: {
                                    var14_12 = k0.C(var1_1, var11_10);
                                    if (var14_12 == null) ** GOTO lbl125
lbl124: // 2 sources:
                                    var5_7 = var14_12.hashCode();
lbl125: // 3 sources:
                                    var5_7 = var6_4 * 53 + var5_7;
                                    ** break;
                                }
                                case 7: {
                                    var5_7 = var6_4 * 53;
                                    var13_11 = k0.r(var1_1, var11_10);
lbl130: // 2 sources:
                                    var6_4 = t.c(var13_11);
                                    break block35;
                                }
                                case 1: {
                                    var5_7 = var6_4 * 53;
                                    var4_6 = k0.y(var1_1, var11_10);
lbl135: // 2 sources:
                                    var6_4 = Float.floatToIntBits((float)var4_6);
                                    break block35;
                                }
                                case 0: 
                            }
                            var5_7 = var6_4 * 53;
                            var2_5 = k0.x(var1_1, var11_10);
                        }
                        var11_10 = Double.doubleToLongBits((double)var2_5);
                    }
                    var6_4 = t.f(var11_10);
                }
                var5_7 += var6_4;
                ** break;
            }
            var7_3 += 3;
            var6_4 = var5_7;
        } while (true);
    }

    @Override
    public void h(Object object, n0 n02) {
        if (n02.v() == n0.a.p) {
            this.a0(object, n02);
            return;
        }
        if (this.h) {
            this.Z(object, n02);
            return;
        }
        this.Y(object, n02);
    }

    public final boolean i(Object object, Object object2, int n8) {
        if (this.u(object, n8) == this.u(object2, n8)) {
            return true;
        }
        return false;
    }

    public final boolean m(Object object, Object object2, int n8) {
        int n9 = this.X(n8);
        long l8 = N.M(n9);
        n9 = N.W(n9);
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        boolean bl9 = false;
        boolean bl10 = false;
        boolean bl11 = false;
        boolean bl12 = false;
        boolean bl13 = false;
        boolean bl14 = false;
        boolean bl15 = false;
        boolean bl16 = false;
        boolean bl17 = false;
        boolean bl18 = false;
        boolean bl19 = false;
        switch (n9) {
            default: {
                return true;
            }
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 63: 
            case 64: 
            case 65: 
            case 66: 
            case 67: 
            case 68: {
                boolean bl20 = bl19;
                if (this.A(object, object2, n8)) {
                    bl20 = bl19;
                    if (b0.I(k0.C(object, l8), k0.C(object2, l8))) {
                        bl20 = true;
                    }
                }
                return bl20;
            }
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 47: 
            case 48: 
            case 49: 
            case 50: {
                return b0.I(k0.C(object, l8), k0.C(object2, l8));
            }
            case 17: {
                boolean bl21 = bl;
                if (this.i(object, object2, n8)) {
                    bl21 = bl;
                    if (b0.I(k0.C(object, l8), k0.C(object2, l8))) {
                        bl21 = true;
                    }
                }
                return bl21;
            }
            case 16: {
                boolean bl22 = bl2;
                if (this.i(object, object2, n8)) {
                    bl22 = bl2;
                    if (k0.A(object, l8) == k0.A(object2, l8)) {
                        bl22 = true;
                    }
                }
                return bl22;
            }
            case 15: {
                boolean bl23 = bl3;
                if (this.i(object, object2, n8)) {
                    bl23 = bl3;
                    if (k0.z(object, l8) == k0.z(object2, l8)) {
                        bl23 = true;
                    }
                }
                return bl23;
            }
            case 14: {
                boolean bl24 = bl4;
                if (this.i(object, object2, n8)) {
                    bl24 = bl4;
                    if (k0.A(object, l8) == k0.A(object2, l8)) {
                        bl24 = true;
                    }
                }
                return bl24;
            }
            case 13: {
                boolean bl25 = bl5;
                if (this.i(object, object2, n8)) {
                    bl25 = bl5;
                    if (k0.z(object, l8) == k0.z(object2, l8)) {
                        bl25 = true;
                    }
                }
                return bl25;
            }
            case 12: {
                boolean bl26 = bl6;
                if (this.i(object, object2, n8)) {
                    bl26 = bl6;
                    if (k0.z(object, l8) == k0.z(object2, l8)) {
                        bl26 = true;
                    }
                }
                return bl26;
            }
            case 11: {
                boolean bl27 = bl7;
                if (this.i(object, object2, n8)) {
                    bl27 = bl7;
                    if (k0.z(object, l8) == k0.z(object2, l8)) {
                        bl27 = true;
                    }
                }
                return bl27;
            }
            case 10: {
                boolean bl28 = bl8;
                if (this.i(object, object2, n8)) {
                    bl28 = bl8;
                    if (b0.I(k0.C(object, l8), k0.C(object2, l8))) {
                        bl28 = true;
                    }
                }
                return bl28;
            }
            case 9: {
                boolean bl29 = bl9;
                if (this.i(object, object2, n8)) {
                    bl29 = bl9;
                    if (b0.I(k0.C(object, l8), k0.C(object2, l8))) {
                        bl29 = true;
                    }
                }
                return bl29;
            }
            case 8: {
                boolean bl30 = bl10;
                if (this.i(object, object2, n8)) {
                    bl30 = bl10;
                    if (b0.I(k0.C(object, l8), k0.C(object2, l8))) {
                        bl30 = true;
                    }
                }
                return bl30;
            }
            case 7: {
                boolean bl31 = bl11;
                if (this.i(object, object2, n8)) {
                    bl31 = bl11;
                    if (k0.r(object, l8) == k0.r(object2, l8)) {
                        bl31 = true;
                    }
                }
                return bl31;
            }
            case 6: {
                boolean bl32 = bl12;
                if (this.i(object, object2, n8)) {
                    bl32 = bl12;
                    if (k0.z(object, l8) == k0.z(object2, l8)) {
                        bl32 = true;
                    }
                }
                return bl32;
            }
            case 5: {
                boolean bl33 = bl13;
                if (this.i(object, object2, n8)) {
                    bl33 = bl13;
                    if (k0.A(object, l8) == k0.A(object2, l8)) {
                        bl33 = true;
                    }
                }
                return bl33;
            }
            case 4: {
                boolean bl34 = bl14;
                if (this.i(object, object2, n8)) {
                    bl34 = bl14;
                    if (k0.z(object, l8) == k0.z(object2, l8)) {
                        bl34 = true;
                    }
                }
                return bl34;
            }
            case 3: {
                boolean bl35 = bl15;
                if (this.i(object, object2, n8)) {
                    bl35 = bl15;
                    if (k0.A(object, l8) == k0.A(object2, l8)) {
                        bl35 = true;
                    }
                }
                return bl35;
            }
            case 2: {
                boolean bl36 = bl16;
                if (this.i(object, object2, n8)) {
                    bl36 = bl16;
                    if (k0.A(object, l8) == k0.A(object2, l8)) {
                        bl36 = true;
                    }
                }
                return bl36;
            }
            case 1: {
                boolean bl37 = bl17;
                if (this.i(object, object2, n8)) {
                    bl37 = bl17;
                    if (Float.floatToIntBits((float)k0.y(object, l8)) == Float.floatToIntBits((float)k0.y(object2, l8))) {
                        bl37 = true;
                    }
                }
                return bl37;
            }
            case 0: 
        }
        boolean bl38 = bl18;
        if (this.i(object, object2, n8)) {
            bl38 = bl18;
            if (Double.doubleToLongBits((double)k0.x(object, l8)) == Double.doubleToLongBits((double)k0.x(object2, l8))) {
                bl38 = true;
            }
        }
        return bl38;
    }

    public final Object o(int n8) {
        return this.b[n8 / 3 * 2];
    }

    public final Z p(int n8) {
        Z z8 = (Z)this.b[n8 = n8 / 3 * 2];
        if (z8 != null) {
            return z8;
        }
        z8 = W.a().c((Class)this.b[n8 + 1]);
        this.b[n8] = z8;
        return z8;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int q(Object var1_1) {
        var17_2 = N.s;
        var8_3 = 1048575;
        var4_4 = 0;
        var3_5 = 0;
        var6_6 = 0;
        do {
            block87 : {
                block88 : {
                    if (var4_4 >= this.a.length) {
                        var2_7 = var3_5 += this.s(this.o, var1_1);
                        if (this.f == false) return var2_7;
                        return var3_5 + this.p.b(var1_1).h();
                    }
                    var13_14 = this.X(var4_4);
                    var12_13 = this.L(var4_4);
                    var14_15 = N.W(var13_14);
                    if (var14_15 <= 17) {
                        var2_7 = this.a[var4_4 + 2];
                        var11_12 = var2_7 & 1048575;
                        var10_11 = 1 << (var2_7 >>> 20);
                        var5_8 = var8_3;
                        var7_9 = var2_7;
                        var9_10 = var10_11;
                        if (var11_12 != var8_3) {
                            var6_6 = var17_2.getInt(var1_1, (long)var11_12);
                            var5_8 = var11_12;
                            var7_9 = var2_7;
                            var9_10 = var10_11;
                        }
                    } else {
                        var2_7 = this.i != false && var14_15 >= p.c0.e() && var14_15 <= p.p0.e() ? this.a[var4_4 + 2] & 1048575 : 0;
                        var9_10 = 0;
                        var5_8 = var8_3;
                        var7_9 = var2_7;
                    }
                    var15_16 = N.M(var13_14);
                    switch (var14_15) {
                        default: {
                            var2_7 = var3_5;
                            ** break;
                        }
                        case 68: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            ** GOTO lbl287
                        }
                        case 67: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            var15_16 = N.R(var1_1, var15_16);
                            ** GOTO lbl293
                        }
                        case 66: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = N.Q(var1_1, var15_16);
                            ** GOTO lbl299
                        }
                        case 65: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            ** GOTO lbl304
                        }
                        case 64: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            ** GOTO lbl309
                        }
                        case 63: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = N.Q(var1_1, var15_16);
                            ** GOTO lbl316
                        }
                        case 62: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = N.Q(var1_1, var15_16);
                            ** GOTO lbl322
                        }
                        case 61: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            ** GOTO lbl327
                        }
                        case 60: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            ** GOTO lbl332
                        }
                        case 59: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            var18_17 = var17_2.getObject(var1_1, var15_16);
                            var2_7 = var18_17 instanceof f ? h.g(var12_13, (f)var18_17) : h.M(var12_13, (String)var18_17);
                            ** GOTO lbl344
                        }
                        case 58: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            ** GOTO lbl343
                        }
                        case 57: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = h.m(var12_13, 0);
                            ** GOTO lbl310
                        }
                        case 56: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = h.o(var12_13, 0L);
                            ** GOTO lbl344
                        }
                        case 55: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = h.v(var12_13, N.Q(var1_1, var15_16));
                            ** GOTO lbl344
                        }
                        case 54: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = h.R(var12_13, N.R(var1_1, var15_16));
                            ** GOTO lbl344
                        }
                        case 53: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = h.x(var12_13, N.R(var1_1, var15_16));
                            ** GOTO lbl344
                        }
                        case 52: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = h.q(var12_13, 0.0f);
                            ** GOTO lbl344
                        }
                        case 51: {
                            var2_7 = var3_5;
                            if (!this.B(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = h.i(var12_13, 0.0);
                            ** GOTO lbl344
                        }
                        case 50: {
                            var2_7 = this.q.b(var12_13, var17_2.getObject(var1_1, var15_16), this.o(var4_4));
                            ** GOTO lbl344
                        }
                        case 49: {
                            var2_7 = b0.j(var12_13, (List)var17_2.getObject(var1_1, var15_16), this.p(var4_4));
                            ** GOTO lbl344
                        }
                        case 48: {
                            var8_3 = b0.t((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 47: {
                            var8_3 = b0.r((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 46: {
                            var8_3 = b0.i((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 45: {
                            var8_3 = b0.g((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 44: {
                            var8_3 = b0.e((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 43: {
                            var8_3 = b0.w((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 42: {
                            var8_3 = b0.b((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 41: {
                            var8_3 = b0.g((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 40: {
                            var8_3 = b0.i((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 39: {
                            var8_3 = b0.l((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 38: {
                            var8_3 = b0.y((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 37: {
                            var8_3 = b0.n((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 36: {
                            var8_3 = b0.g((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 35: {
                            var8_3 = b0.i((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
lbl238: // 14 sources:
                            var17_2.putInt(var1_1, (long)var7_9, var2_7);
lbl239: // 15 sources:
                            var2_7 = h.O(var12_13) + h.Q(var2_7) + var2_7;
                            ** GOTO lbl310
                        }
                        case 34: {
                            var2_7 = b0.s(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 33: {
                            var2_7 = b0.q(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 23: 
                        case 32: {
                            var2_7 = b0.h(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 19: 
                        case 24: 
                        case 31: {
                            var2_7 = b0.f(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 30: {
                            var2_7 = b0.d(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 29: {
                            var2_7 = b0.v(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl344
                        }
                        case 28: {
                            var2_7 = b0.c(var12_13, (List)var17_2.getObject(var1_1, var15_16));
                            ** GOTO lbl344
                        }
                        case 27: {
                            var2_7 = b0.p(var12_13, (List)var17_2.getObject(var1_1, var15_16), this.p(var4_4));
                            ** GOTO lbl344
                        }
                        case 26: {
                            var2_7 = b0.u(var12_13, (List)var17_2.getObject(var1_1, var15_16));
                            ** GOTO lbl344
                        }
                        case 25: {
                            var2_7 = b0.a(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 22: {
                            var2_7 = b0.k(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 21: {
                            var2_7 = b0.x(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 20: {
                            var2_7 = b0.m(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
lbl279: // 9 sources:
                            var2_7 = var3_5 + var2_7;
                            ** break;
                        }
                        case 18: {
                            var2_7 = b0.h(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl344
                        }
                        case 17: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
lbl287: // 2 sources:
                            var2_7 = h.s(var12_13, (K)var17_2.getObject(var1_1, var15_16), this.p(var4_4));
                            ** GOTO lbl344
                        }
                        case 16: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var15_16 = var17_2.getLong(var1_1, var15_16);
lbl293: // 2 sources:
                            var2_7 = h.K(var12_13, var15_16);
                            ** GOTO lbl344
                        }
                        case 15: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = var17_2.getInt(var1_1, var15_16);
lbl299: // 2 sources:
                            var2_7 = h.I(var12_13, var2_7);
                            ** GOTO lbl344
                        }
                        case 14: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
lbl304: // 2 sources:
                            var2_7 = h.G(var12_13, 0L);
                            ** GOTO lbl344
                        }
                        case 13: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
lbl309: // 2 sources:
                            var2_7 = h.E(var12_13, 0);
lbl310: // 3 sources:
                            var2_7 = var3_5 + var2_7;
                            break block87;
                        }
                        case 12: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = var17_2.getInt(var1_1, var15_16);
lbl316: // 2 sources:
                            var2_7 = h.k(var12_13, var2_7);
                            ** GOTO lbl344
                        }
                        case 11: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = var17_2.getInt(var1_1, var15_16);
lbl322: // 2 sources:
                            var2_7 = h.P(var12_13, var2_7);
                            ** GOTO lbl344
                        }
                        case 10: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
lbl327: // 2 sources:
                            var2_7 = h.g(var12_13, (f)var17_2.getObject(var1_1, var15_16));
                            ** GOTO lbl344
                        }
                        case 9: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
lbl332: // 2 sources:
                            var2_7 = b0.o(var12_13, var17_2.getObject(var1_1, var15_16), this.p(var4_4));
                            ** GOTO lbl344
                        }
                        case 8: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var18_17 = var17_2.getObject(var1_1, var15_16);
                            var2_7 = var18_17 instanceof f ? h.g(var12_13, (f)var18_17) : h.M(var12_13, (String)var18_17);
                            ** GOTO lbl344
                        }
                        case 7: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
lbl343: // 2 sources:
                            var2_7 = h.d(var12_13, true);
lbl344: // 24 sources:
                            var2_7 = var3_5 + var2_7;
                            break block87;
                        }
                        case 6: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = h.m(var12_13, 0);
                            break block88;
                        }
                        case 5: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = h.o(var12_13, 0L);
                            break block88;
                        }
                        case 4: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = h.v(var12_13, var17_2.getInt(var1_1, var15_16));
                            break block88;
                        }
                        case 3: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = h.R(var12_13, var17_2.getLong(var1_1, var15_16));
                            break block88;
                        }
                        case 2: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = h.x(var12_13, var17_2.getLong(var1_1, var15_16));
                            break block88;
                        }
                        case 1: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = h.q(var12_13, 0.0f);
                            break block88;
                        }
                        case 0: 
                    }
                    var2_7 = var3_5;
                    if ((var6_6 & var9_10) == 0) break block87;
                    var2_7 = h.i(var12_13, 0.0);
                }
                var2_7 = var3_5 + var2_7;
                ** break;
            }
            var4_4 += 3;
            var3_5 = var2_7;
            var8_3 = var5_8;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int r(Object var1_1) {
        var12_2 = N.s;
        var4_4 = var3_3 = 0;
        while (var3_3 < this.a.length) {
            block80 : {
                block82 : {
                    block81 : {
                        var5_6 = this.X(var3_3);
                        var2_5 = N.W(var5_6);
                        var7_8 = this.L(var3_3);
                        var8_9 = N.M(var5_6);
                        var5_6 = var2_5 >= p.c0.e() && var2_5 <= p.p0.e() ? this.a[var3_3 + 2] & 1048575 : 0;
                        switch (var2_5) {
                            default: {
                                var2_5 = var4_4;
                                ** break;
                            }
                            case 68: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl257
                            }
                            case 67: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                var8_9 = N.R(var1_1, var8_9);
                                ** GOTO lbl263
                            }
                            case 66: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                var2_5 = N.Q(var1_1, var8_9);
                                ** GOTO lbl269
                            }
                            case 65: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl274
                            }
                            case 64: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl279
                            }
                            case 63: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                var2_5 = N.Q(var1_1, var8_9);
                                ** GOTO lbl285
                            }
                            case 62: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                var2_5 = N.Q(var1_1, var8_9);
                                ** GOTO lbl291
                            }
                            case 61: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl296
                            }
                            case 60: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl301
                            }
                            case 59: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                var10_10 = var11_11 = k0.C(var1_1, var8_9);
                                if (!(var11_11 instanceof f)) ** GOTO lbl-1000
                                var10_10 = var11_11;
                                ** GOTO lbl309
                            }
                            case 58: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl317
                            }
                            case 57: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl322
                            }
                            case 56: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl327
                            }
                            case 55: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                var2_5 = N.Q(var1_1, var8_9);
                                ** GOTO lbl333
                            }
                            case 54: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                var8_9 = N.R(var1_1, var8_9);
                                ** GOTO lbl339
                            }
                            case 53: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                var8_9 = N.R(var1_1, var8_9);
                                ** GOTO lbl345
                            }
                            case 52: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl350
                            }
                            case 51: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var7_8, var3_3)) break block80;
                                break block81;
                            }
                            case 50: {
                                var2_5 = this.q.b(var7_8, k0.C(var1_1, var8_9), this.o(var3_3));
                                break block82;
                            }
                            case 49: {
                                var2_5 = b0.j(var7_8, N.D(var1_1, var8_9), this.p(var3_3));
                                break block82;
                            }
                            case 48: {
                                var6_7 = b0.t((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 47: {
                                var6_7 = b0.r((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 46: {
                                var6_7 = b0.i((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 45: {
                                var6_7 = b0.g((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 44: {
                                var6_7 = b0.e((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 43: {
                                var6_7 = b0.w((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 42: {
                                var6_7 = b0.b((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 41: {
                                var6_7 = b0.g((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 40: {
                                var6_7 = b0.i((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 39: {
                                var6_7 = b0.l((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 38: {
                                var6_7 = b0.y((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 37: {
                                var6_7 = b0.n((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 36: {
                                var6_7 = b0.g((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 35: {
                                var6_7 = b0.i((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
lbl212: // 14 sources:
                                var12_2.putInt(var1_1, (long)var5_6, var2_5);
lbl213: // 15 sources:
                                var2_5 = h.O(var7_8) + h.Q(var2_5) + var2_5;
                                break block82;
                            }
                            case 34: {
                                var2_5 = b0.s(var7_8, N.D(var1_1, var8_9), false);
                                break block82;
                            }
                            case 33: {
                                var2_5 = b0.q(var7_8, N.D(var1_1, var8_9), false);
                                break block82;
                            }
                            case 18: 
                            case 23: 
                            case 32: {
                                var2_5 = b0.h(var7_8, N.D(var1_1, var8_9), false);
                                break block82;
                            }
                            case 19: 
                            case 24: 
                            case 31: {
                                var2_5 = b0.f(var7_8, N.D(var1_1, var8_9), false);
                                break block82;
                            }
                            case 30: {
                                var2_5 = b0.d(var7_8, N.D(var1_1, var8_9), false);
                                break block82;
                            }
                            case 29: {
                                var2_5 = b0.v(var7_8, N.D(var1_1, var8_9), false);
                                break block82;
                            }
                            case 28: {
                                var2_5 = b0.c(var7_8, N.D(var1_1, var8_9));
                                break block82;
                            }
                            case 27: {
                                var2_5 = b0.p(var7_8, N.D(var1_1, var8_9), this.p(var3_3));
                                break block82;
                            }
                            case 26: {
                                var2_5 = b0.u(var7_8, N.D(var1_1, var8_9));
                                break block82;
                            }
                            case 25: {
                                var2_5 = b0.a(var7_8, N.D(var1_1, var8_9), false);
                                break block82;
                            }
                            case 22: {
                                var2_5 = b0.k(var7_8, N.D(var1_1, var8_9), false);
                                break block82;
                            }
                            case 21: {
                                var2_5 = b0.x(var7_8, N.D(var1_1, var8_9), false);
                                break block82;
                            }
                            case 20: {
                                var2_5 = b0.m(var7_8, N.D(var1_1, var8_9), false);
                                break block82;
                            }
                            case 17: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
lbl257: // 2 sources:
                                var2_5 = h.s(var7_8, (K)k0.C(var1_1, var8_9), this.p(var3_3));
                                break block82;
                            }
                            case 16: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
                                var8_9 = k0.A(var1_1, var8_9);
lbl263: // 2 sources:
                                var2_5 = h.K(var7_8, var8_9);
                                break block82;
                            }
                            case 15: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
                                var2_5 = k0.z(var1_1, var8_9);
lbl269: // 2 sources:
                                var2_5 = h.I(var7_8, var2_5);
                                break block82;
                            }
                            case 14: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
lbl274: // 2 sources:
                                var2_5 = h.G(var7_8, 0L);
                                break block82;
                            }
                            case 13: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
lbl279: // 2 sources:
                                var2_5 = h.E(var7_8, 0);
                                break block82;
                            }
                            case 12: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
                                var2_5 = k0.z(var1_1, var8_9);
lbl285: // 2 sources:
                                var2_5 = h.k(var7_8, var2_5);
                                break block82;
                            }
                            case 11: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
                                var2_5 = k0.z(var1_1, var8_9);
lbl291: // 2 sources:
                                var2_5 = h.P(var7_8, var2_5);
                                break block82;
                            }
                            case 10: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
lbl296: // 2 sources:
                                var10_10 = k0.C(var1_1, var8_9);
                                ** GOTO lbl309
                            }
                            case 9: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
lbl301: // 2 sources:
                                var2_5 = b0.o(var7_8, k0.C(var1_1, var8_9), this.p(var3_3));
                                break block82;
                            }
                            case 8: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
                                var10_10 = var11_11 = k0.C(var1_1, var8_9);
                                ** if (!(var11_11 instanceof f)) goto lbl-1000
lbl-1000: // 1 sources:
                                {
                                    var10_10 = var11_11;
lbl309: // 3 sources:
                                    var2_5 = h.g((int)var7_8, (f)((f)var10_10));
                                    ** GOTO lbl357
                                }
lbl-1000: // 2 sources:
                                {
                                    var2_5 = h.M(var7_8, (String)var10_10);
                                }
                                break block82;
                            }
                            case 7: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
lbl317: // 2 sources:
                                var2_5 = h.d(var7_8, true);
                                break block82;
                            }
                            case 6: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
lbl322: // 2 sources:
                                var2_5 = h.m(var7_8, 0);
                                break block82;
                            }
                            case 5: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
lbl327: // 2 sources:
                                var2_5 = h.o(var7_8, 0L);
                                break block82;
                            }
                            case 4: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
                                var2_5 = k0.z(var1_1, var8_9);
lbl333: // 2 sources:
                                var2_5 = h.v(var7_8, var2_5);
                                break block82;
                            }
                            case 3: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
                                var8_9 = k0.A(var1_1, var8_9);
lbl339: // 2 sources:
                                var2_5 = h.R(var7_8, var8_9);
                                break block82;
                            }
                            case 2: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
                                var8_9 = k0.A(var1_1, var8_9);
lbl345: // 2 sources:
                                var2_5 = h.x(var7_8, var8_9);
                                break block82;
                            }
                            case 1: {
                                var2_5 = var4_4;
                                if (!this.u(var1_1, var3_3)) break block80;
lbl350: // 2 sources:
                                var2_5 = h.q(var7_8, 0.0f);
                                break block82;
                            }
                            case 0: 
                        }
                        var2_5 = var4_4;
                        if (!this.u(var1_1, var3_3)) break block80;
                    }
                    var2_5 = h.i(var7_8, 0.0);
                }
                var2_5 = var4_4 + var2_5;
                ** break;
            }
            var3_3 += 3;
            var4_4 = var2_5;
        }
        return var4_4 + this.s(this.o, var1_1);
    }

    public final int s(g0 g02, Object object) {
        return g02.b(g02.a(object));
    }

    public final boolean u(Object object, int n8) {
        int n9 = this.S(n8);
        long l8 = 1048575 & n9;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        boolean bl9 = false;
        boolean bl10 = false;
        boolean bl11 = false;
        boolean bl12 = false;
        boolean bl13 = false;
        boolean bl14 = false;
        boolean bl15 = false;
        boolean bl16 = false;
        if (l8 == 1048575L) {
            n8 = this.X(n8);
            l8 = N.M(n8);
            switch (N.W(n8)) {
                default: {
                    throw new IllegalArgumentException();
                }
                case 17: {
                    if (k0.C(object, l8) != null) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 16: {
                    bl16 = bl;
                    if (k0.A(object, l8) != 0L) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 15: {
                    bl16 = bl2;
                    if (k0.z(object, l8) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 14: {
                    bl16 = bl3;
                    if (k0.A(object, l8) != 0L) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 13: {
                    bl16 = bl4;
                    if (k0.z(object, l8) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 12: {
                    bl16 = bl5;
                    if (k0.z(object, l8) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 11: {
                    bl16 = bl6;
                    if (k0.z(object, l8) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 10: {
                    return f.p.equals(k0.C(object, l8)) ^ true;
                }
                case 9: {
                    bl16 = bl7;
                    if (k0.C(object, l8) != null) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 8: {
                    object = k0.C(object, l8);
                    if (object instanceof String) {
                        return ((String)object).isEmpty() ^ true;
                    }
                    if (object instanceof f) {
                        return f.p.equals(object) ^ true;
                    }
                    throw new IllegalArgumentException();
                }
                case 7: {
                    return k0.r(object, l8);
                }
                case 6: {
                    bl16 = bl8;
                    if (k0.z(object, l8) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 5: {
                    bl16 = bl9;
                    if (k0.A(object, l8) != 0L) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 4: {
                    bl16 = bl10;
                    if (k0.z(object, l8) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 3: {
                    bl16 = bl11;
                    if (k0.A(object, l8) != 0L) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 2: {
                    bl16 = bl12;
                    if (k0.A(object, l8) != 0L) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 1: {
                    bl16 = bl13;
                    if (Float.floatToRawIntBits((float)k0.y(object, l8)) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 0: 
            }
            bl16 = bl14;
            if (Double.doubleToRawLongBits((double)k0.x(object, l8)) != 0L) {
                bl16 = true;
            }
            return bl16;
        }
        bl16 = bl15;
        if ((k0.z(object, l8) & 1 << (n9 >>> 20)) != 0) {
            bl16 = true;
        }
        return bl16;
    }

    public final boolean v(Object object, int n8, int n9, int n10, int n11) {
        if (n9 == 1048575) {
            return this.u(object, n8);
        }
        if ((n10 & n11) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x(Object object, int n8, int n9) {
        if ((object = (List)k0.C(object, N.M(n8))).isEmpty()) {
            return true;
        }
        Z z8 = this.p(n9);
        for (n8 = 0; n8 < object.size(); ++n8) {
            if (z8.c(object.get(n8))) continue;
            return false;
        }
        return true;
    }

    public final boolean y(Object object, int n8, int n9) {
        if ((object = this.q.e(k0.C(object, N.M(n8)))).isEmpty()) {
            return true;
        }
        Object object2 = this.o(n9);
        if (this.q.d((Object)object2).c.e() != m0.c.x) {
            return true;
        }
        Iterator iterator = object.values().iterator();
        object = null;
        while (iterator.hasNext()) {
            Object object3 = iterator.next();
            object2 = object;
            if (object == null) {
                object2 = W.a().c(object3.getClass());
            }
            object = object2;
            if (object2.c(object3)) continue;
            return false;
        }
        return true;
    }
}

