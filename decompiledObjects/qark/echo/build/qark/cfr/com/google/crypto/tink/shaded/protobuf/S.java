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
 *  java.nio.charset.Charset
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  sun.misc.Unsafe
 */
package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.a;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.E;
import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.U;
import com.google.crypto.tink.shaded.protobuf.Z;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.g0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.h0;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.o0;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.q;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.t;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.z;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

public final class S
implements e0 {
    public static final int[] r = new int[0];
    public static final Unsafe s = o0.D();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final O e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final int k;
    public final int l;
    public final U m;
    public final E n;
    public final k0 o;
    public final q p;
    public final J q;

    public S(int[] arrn, Object[] arrobject, int n8, int n9, O o8, boolean bl, boolean bl2, int[] arrn2, int n10, int n11, U u8, E e8, k0 k02, q q8, J j8) {
        this.a = arrn;
        this.b = arrobject;
        this.c = n8;
        this.d = n9;
        this.g = o8 instanceof x;
        this.h = bl;
        bl = q8 != null && q8.e(o8);
        this.f = bl;
        this.i = bl2;
        this.j = arrn2;
        this.k = n10;
        this.l = n11;
        this.m = u8;
        this.n = e8;
        this.o = k02;
        this.p = q8;
        this.e = o8;
        this.q = j8;
    }

    public static boolean A(int n8) {
        if ((n8 & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public static boolean D(Object object, int n8, e0 e02) {
        return e02.c(o0.C(object, S.X(n8)));
    }

    public static boolean G(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof x) {
            return ((x)object).D();
        }
        return true;
    }

    public static boolean J(int n8) {
        if ((n8 & 268435456) != 0) {
            return true;
        }
        return false;
    }

    public static List K(Object object, long l8) {
        return (List)o0.C(object, l8);
    }

    public static long L(Object object, long l8) {
        return o0.A(object, l8);
    }

    public static S T(Class class_, M m8, U u8, E e8, k0 k02, q q8, J j8) {
        if (m8 instanceof c0) {
            return S.V((c0)m8, u8, e8, k02, q8, j8);
        }
        a.a(m8);
        return S.U(null, u8, e8, k02, q8, j8);
    }

    public static S U(h0 h02, U u8, E e8, k0 k02, q q8, J j8) {
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static S V(c0 var0, U var1_1, E var2_2, k0 var3_3, q var4_4, J var5_5) {
        var31_6 = var0.b() == Z.p;
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
            var32_13 = S.r;
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
        var35_21 = S.s;
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
                                                    if (var8_11 >= var7_10) return new S(var38_24, var39_25, var18_29, var16_20, var0.c(), var31_6, false, var32_13, var17_28, var27_26, var1_1, var2_2, var3_3, var4_4, var5_5);
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
                                            var36_22[var10_15] = var34_39 = S.p0(var37_23, (String)var34_39);
                                        }
                                        var25_34 = (int)var35_21.objectFieldOffset((Field)var34_39);
                                        var34_39 = var36_22[++var10_15];
                                        if (var34_39 instanceof Field) {
                                            var34_39 = (Field)var34_39;
                                        } else {
                                            var36_22[var10_15] = var34_39 = S.p0(var37_23, (String)var34_39);
                                        }
                                        var26_35 = (int)var35_21.objectFieldOffset((Field)var34_39);
                                        var24_33 = 0;
                                        var10_15 = var11_18;
                                        var23_32 = var6_9;
                                        var22_31 = var19_27;
                                        break block53;
                                    }
                                    var13_16 = var10_15 + 1;
                                    var34_39 = S.p0(var37_23, (String)var36_22[var10_15]);
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
                        var36_22[var10_15] = var34_39 = S.p0(var37_23, (String)var34_39);
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

    public static long X(int n8) {
        return n8 & 1048575;
    }

    public static boolean Y(Object object, long l8) {
        return (Boolean)o0.C(object, l8);
    }

    public static double Z(Object object, long l8) {
        return (Double)o0.C(object, l8);
    }

    public static float a0(Object object, long l8) {
        return ((Float)o0.C(object, l8)).floatValue();
    }

    public static int b0(Object object, long l8) {
        return (Integer)o0.C(object, l8);
    }

    public static long c0(Object object, long l8) {
        return (Long)o0.C(object, l8);
    }

    public static boolean l(Object object, long l8) {
        return o0.r(object, l8);
    }

    public static void m(Object object) {
        if (S.G(object)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mutating immutable message: ");
        stringBuilder.append(object);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static double o(Object object, long l8) {
        return o0.x(object, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Field p0(Class class_, String string2) {
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

    public static float r(Object object, long l8) {
        return o0.y(object, l8);
    }

    public static l0 v(Object object) {
        x x8 = (x)object;
        l0 l02 = x8.unknownFields;
        object = l02;
        if (l02 == l0.c()) {
            x8.unknownFields = object = l0.k();
        }
        return object;
    }

    public static int v0(int n8) {
        return (n8 & 267386880) >>> 20;
    }

    public static int z(Object object, long l8) {
        return o0.z(object, l8);
    }

    public final void A0(r0 r02, int n8, Object object, int n9) {
        if (object != null) {
            this.q.d(this.t(n9));
            r02.N(n8, null, this.q.e(object));
        }
    }

    public final boolean B(Object object, int n8) {
        int n9 = this.k0(n8);
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
            n8 = this.w0(n8);
            l8 = S.X(n8);
            switch (S.v0(n8)) {
                default: {
                    throw new IllegalArgumentException();
                }
                case 17: {
                    if (o0.C(object, l8) != null) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 16: {
                    bl16 = bl;
                    if (o0.A(object, l8) != 0L) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 15: {
                    bl16 = bl2;
                    if (o0.z(object, l8) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 14: {
                    bl16 = bl3;
                    if (o0.A(object, l8) != 0L) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 13: {
                    bl16 = bl4;
                    if (o0.z(object, l8) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 12: {
                    bl16 = bl5;
                    if (o0.z(object, l8) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 11: {
                    bl16 = bl6;
                    if (o0.z(object, l8) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 10: {
                    return h.p.equals(o0.C(object, l8)) ^ true;
                }
                case 9: {
                    bl16 = bl7;
                    if (o0.C(object, l8) != null) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 8: {
                    object = o0.C(object, l8);
                    if (object instanceof String) {
                        return ((String)object).isEmpty() ^ true;
                    }
                    if (object instanceof h) {
                        return h.p.equals(object) ^ true;
                    }
                    throw new IllegalArgumentException();
                }
                case 7: {
                    return o0.r(object, l8);
                }
                case 6: {
                    bl16 = bl8;
                    if (o0.z(object, l8) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 5: {
                    bl16 = bl9;
                    if (o0.A(object, l8) != 0L) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 4: {
                    bl16 = bl10;
                    if (o0.z(object, l8) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 3: {
                    bl16 = bl11;
                    if (o0.A(object, l8) != 0L) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 2: {
                    bl16 = bl12;
                    if (o0.A(object, l8) != 0L) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 1: {
                    bl16 = bl13;
                    if (Float.floatToRawIntBits((float)o0.y(object, l8)) != 0) {
                        bl16 = true;
                    }
                    return bl16;
                }
                case 0: 
            }
            bl16 = bl14;
            if (Double.doubleToRawLongBits((double)o0.x(object, l8)) != 0L) {
                bl16 = true;
            }
            return bl16;
        }
        bl16 = bl15;
        if ((o0.z(object, l8) & 1 << (n9 >>> 20)) != 0) {
            bl16 = true;
        }
        return bl16;
    }

    public final void B0(int n8, Object object, r0 r02) {
        if (object instanceof String) {
            r02.A(n8, (String)object);
            return;
        }
        r02.M(n8, (h)object);
    }

    public final boolean C(Object object, int n8, int n9, int n10, int n11) {
        if (n9 == 1048575) {
            return this.B(object, n8);
        }
        if ((n10 & n11) != 0) {
            return true;
        }
        return false;
    }

    public final void C0(k0 k02, Object object, r0 r02) {
        k02.t(k02.g(object), r02);
    }

    public final boolean E(Object object, int n8, int n9) {
        if ((object = (List)o0.C(object, S.X(n8))).isEmpty()) {
            return true;
        }
        e0 e02 = this.u(n9);
        for (n8 = 0; n8 < object.size(); ++n8) {
            if (e02.c(object.get(n8))) continue;
            return false;
        }
        return true;
    }

    public final boolean F(Object object, int n8, int n9) {
        if (this.q.e(o0.C(object, S.X(n8))).isEmpty()) {
            return true;
        }
        object = this.t(n9);
        this.q.d(object);
        throw null;
    }

    public final boolean H(Object object, Object object2, int n8) {
        long l8 = this.k0(n8) & 1048575;
        if (o0.z(object, l8) == o0.z(object2, l8)) {
            return true;
        }
        return false;
    }

    public final boolean I(Object object, int n8, int n9) {
        if (o0.z(object, this.k0(n9) & 1048575) == n8) {
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public final void M(k0 var1_1, q var2_2, Object var3_4, d0 var4_5, p var5_6) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:366)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final void N(Object object, int n8, Object object2, p p8, d0 d02) {
        Object object3;
        long l8 = S.X(this.w0(n8));
        Object object4 = o0.C(object, l8);
        if (object4 == null) {
            object3 = this.q.f(object2);
            o0.R(object, l8, object3);
        } else {
            object3 = object4;
            if (this.q.g(object4)) {
                object3 = this.q.f(object2);
                this.q.a(object3, object4);
                o0.R(object, l8, object3);
            }
        }
        object = this.q.h(object3);
        this.q.d(object2);
        d02.M((Map)object, null, p8);
    }

    public final void O(Object object, Object object2, int n8) {
        if (!this.B(object2, n8)) {
            return;
        }
        Unsafe unsafe = s;
        long l8 = S.X(this.w0(n8));
        Object object3 = unsafe.getObject(object2, l8);
        if (object3 != null) {
            Object object4;
            e0 e02 = this.u(n8);
            if (!this.B(object, n8)) {
                if (!S.G(object3)) {
                    unsafe.putObject(object, l8, object3);
                } else {
                    object2 = e02.f();
                    e02.a(object2, object3);
                    unsafe.putObject(object, l8, object2);
                }
                this.q0(object, n8);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l8);
            if (!S.G(object4)) {
                object2 = e02.f();
                e02.a(object2, object4);
                unsafe.putObject(object, l8, object2);
            }
            e02.a(object2, object3);
            return;
        }
        object = new StringBuilder();
        object.append("Source subfield ");
        object.append(this.W(n8));
        object.append(" is present but null: ");
        object.append(object2);
        throw new IllegalStateException(object.toString());
    }

    public final void P(Object object, Object object2, int n8) {
        int n9 = this.W(n8);
        if (!this.I(object2, n9, n8)) {
            return;
        }
        Unsafe unsafe = s;
        long l8 = S.X(this.w0(n8));
        Object object3 = unsafe.getObject(object2, l8);
        if (object3 != null) {
            Object object4;
            e0 e02 = this.u(n8);
            if (!this.I(object, n9, n8)) {
                if (!S.G(object3)) {
                    unsafe.putObject(object, l8, object3);
                } else {
                    object2 = e02.f();
                    e02.a(object2, object3);
                    unsafe.putObject(object, l8, object2);
                }
                this.r0(object, n9, n8);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l8);
            if (!S.G(object4)) {
                object2 = e02.f();
                e02.a(object2, object4);
                unsafe.putObject(object, l8, object2);
            }
            e02.a(object2, object3);
            return;
        }
        object = new StringBuilder();
        object.append("Source subfield ");
        object.append(this.W(n8));
        object.append(" is present but null: ");
        object.append(object2);
        throw new IllegalStateException(object.toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void Q(Object var1_1, Object var2_2, int var3_3) {
        block24 : {
            var4_4 = this.w0(var3_3);
            var6_5 = S.X(var4_4);
            var5_6 = this.W(var3_3);
            switch (S.v0(var4_4)) {
                default: {
                    return;
                }
                case 60: 
                case 68: {
                    this.P(var1_1, var2_2, var3_3);
                    return;
                }
                case 61: 
                case 62: 
                case 63: 
                case 64: 
                case 65: 
                case 66: 
                case 67: {
                    if (this.I(var2_2, var5_6, var3_3) == false) return;
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
                    if (this.I(var2_2, var5_6, var3_3) == false) return;
lbl15: // 2 sources:
                    o0.R(var1_1, var6_5, o0.C(var2_2, var6_5));
                    this.r0(var1_1, var5_6, var3_3);
                    return;
                }
                case 50: {
                    g0.E(this.q, var1_1, var2_2, var6_5);
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
                    this.O(var1_1, var2_2, var3_3);
                    return;
                }
                case 16: {
                    if (this.B(var2_2, var3_3) == false) return;
                    ** GOTO lbl71
                }
                case 15: {
                    if (this.B(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 14: {
                    if (this.B(var2_2, var3_3) == false) return;
                    ** GOTO lbl71
                }
                case 13: {
                    if (this.B(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 12: {
                    if (this.B(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 11: {
                    if (this.B(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 10: {
                    if (this.B(var2_2, var3_3) == false) return;
                    ** GOTO lbl50
                }
                case 8: {
                    if (this.B(var2_2, var3_3) == false) return;
lbl50: // 2 sources:
                    o0.R(var1_1, var6_5, o0.C(var2_2, var6_5));
                    break block24;
                }
                case 7: {
                    if (this.B(var2_2, var3_3) == false) return;
                    o0.H(var1_1, var6_5, o0.r(var2_2, var6_5));
                    break block24;
                }
                case 6: {
                    if (this.B(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 5: {
                    if (this.B(var2_2, var3_3) == false) return;
                    ** GOTO lbl71
                }
                case 4: {
                    if (this.B(var2_2, var3_3) == false) return;
lbl64: // 6 sources:
                    o0.P(var1_1, var6_5, o0.z(var2_2, var6_5));
                    break block24;
                }
                case 3: {
                    if (this.B(var2_2, var3_3) == false) return;
                    ** GOTO lbl71
                }
                case 2: {
                    if (this.B(var2_2, var3_3) == false) return;
lbl71: // 5 sources:
                    o0.Q(var1_1, var6_5, o0.A(var2_2, var6_5));
                    break block24;
                }
                case 1: {
                    if (this.B(var2_2, var3_3) == false) return;
                    o0.O(var1_1, var6_5, o0.y(var2_2, var6_5));
                    break block24;
                }
                case 0: 
            }
            if (this.B(var2_2, var3_3) == false) return;
            o0.N(var1_1, var6_5, o0.x(var2_2, var6_5));
        }
        this.q0(var1_1, var3_3);
    }

    public final Object R(Object object, int n8) {
        e0 e02 = this.u(n8);
        long l8 = S.X(this.w0(n8));
        if (!this.B(object, n8)) {
            return e02.f();
        }
        if (S.G(object = s.getObject(object, l8))) {
            return object;
        }
        Object object2 = e02.f();
        if (object != null) {
            e02.a(object2, object);
        }
        return object2;
    }

    public final Object S(Object object, int n8, int n9) {
        e0 e02 = this.u(n9);
        if (!this.I(object, n8, n9)) {
            return e02.f();
        }
        if (S.G(object = s.getObject(object, S.X(this.w0(n9))))) {
            return object;
        }
        Object object2 = e02.f();
        if (object != null) {
            e02.a(object2, object);
        }
        return object2;
    }

    public final int W(int n8) {
        return this.a[n8];
    }

    @Override
    public void a(Object object, Object object2) {
        S.m(object);
        object2.getClass();
        for (int i8 = 0; i8 < this.a.length; i8 += 3) {
            this.Q(object, object2, i8);
        }
        g0.F(this.o, object, object2);
        if (this.f) {
            g0.D(this.p, object, object2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b(Object var1_1) {
        if (!S.G(var1_1)) {
            return;
        }
        if (var1_1 instanceof x) {
            var7_2 = (x)var1_1;
            var7_2.n();
            var7_2.m();
            var7_2.F();
        }
        var3_3 = this.a.length;
        var2_4 = 0;
        do {
            if (var2_4 >= var3_3) {
                this.o.j(var1_1);
                if (this.f == false) return;
                this.p.f(var1_1);
                return;
            }
            var4_5 = this.w0(var2_4);
            var5_6 = S.X(var4_5);
            if ((var4_5 = S.v0(var4_5)) == 9) ** GOTO lbl-1000
            switch (var4_5) {
                default: {
                    break;
                }
                case 50: {
                    var7_2 = S.s;
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
                    if (!this.B(var1_1, var2_4)) break;
                    this.u(var2_4).b(S.s.getObject(var1_1, var5_6));
                }
            }
            var2_4 += 3;
        } while (true);
    }

    @Override
    public final boolean c(Object object) {
        int n8 = 1048575;
        for (int i8 = n9 = 0; i8 < this.k; ++i8) {
            int n9;
            int n10 = this.j[i8];
            int n11 = this.W(n10);
            int n12 = this.w0(n10);
            int n13 = this.a[n10 + 2];
            int n14 = n13 & 1048575;
            n13 = 1 << (n13 >>> 20);
            if (n14 != n8) {
                if (n14 != 1048575) {
                    n9 = s.getInt(object, (long)n14);
                }
                n8 = n14;
            }
            if (S.J(n12) && !this.C(object, n10, n8, n9, n13)) {
                return false;
            }
            n14 = S.v0(n12);
            if (n14 != 9 && n14 != 17) {
                if (n14 != 27) {
                    if (n14 != 60 && n14 != 68) {
                        if (n14 != 49) {
                            if (n14 != 50 || this.F(object, n12, n10)) continue;
                            return false;
                        }
                    } else {
                        if (!this.I(object, n11, n10) || S.D(object, n12, this.u(n10))) continue;
                        return false;
                    }
                }
                if (this.E(object, n12, n10)) continue;
                return false;
            }
            if (!this.C(object, n10, n8, n9, n13) || S.D(object, n12, this.u(n10))) continue;
            return false;
        }
        if (this.f && !this.p.c(object).e()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean d(Object object, Object object2) {
        int n8 = this.a.length;
        for (int i8 = 0; i8 < n8; i8 += 3) {
            if (this.p(object, object2, i8)) continue;
            return false;
        }
        if (!this.o.g(object).equals(this.o.g(object2))) {
            return false;
        }
        if (this.f) {
            return this.p.c(object).equals(this.p.c(object2));
        }
        return true;
    }

    public final int d0(Object object, byte[] arrby, int n8, int n9, int n10, long l8, e.a a8) {
        Object object2;
        Unsafe unsafe = s;
        Object object3 = this.t(n10);
        Object object4 = object2 = unsafe.getObject(object, l8);
        if (this.q.g(object2)) {
            object4 = this.q.f(object3);
            this.q.a(object4, object2);
            unsafe.putObject(object, l8, object4);
        }
        this.q.d(object3);
        return this.n(arrby, n8, n9, null, this.q.h(object4), a8);
    }

    @Override
    public int e(Object object) {
        if (this.h) {
            return this.x(object);
        }
        return this.w(object);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int e0(Object var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, long var10_10, int var12_11, e.a var13_12) {
        block18 : {
            block19 : {
                var19_13 = S.s;
                var16_14 = this.a[var12_11 + 2] & 1048575;
                var18_15 = true;
                switch (var9_9) {
                    default: {
                        return var3_3;
                    }
                    case 68: {
                        if (var7_7 != 3) return var3_3;
                        var19_13 = this.S(var1_1, var6_6, var12_11);
                        var3_3 = e.M(var19_13, this.u(var12_11), (byte[])var2_2, var3_3, var4_4, var5_5 & -8 | 4, var13_12);
                        var2_2 = var19_13;
                        ** GOTO lbl39
                    }
                    case 67: {
                        if (var7_7 != 0) return var3_3;
                        var3_3 = e.K((byte[])var2_2, var3_3, var13_12);
                        var14_16 = i.c(var13_12.b);
                        ** GOTO lbl78
                    }
                    case 66: {
                        if (var7_7 != 0) return var3_3;
                        var3_3 = e.H((byte[])var2_2, var3_3, var13_12);
                        var4_4 = i.b(var13_12.a);
                        ** GOTO lbl72
                    }
                    case 63: {
                        if (var7_7 != 0) return var3_3;
                        var3_3 = e.H((byte[])var2_2, var3_3, var13_12);
                        var4_4 = var13_12.a;
                        this.s(var12_11);
                        ** GOTO lbl72
                    }
                    case 61: {
                        if (var7_7 != 2) return var3_3;
                        var3_3 = e.b((byte[])var2_2, var3_3, var13_12);
                        var2_2 = var13_12.c;
                        ** GOTO lbl79
                    }
                    case 60: {
                        if (var7_7 != 2) return var3_3;
                        var19_13 = this.S(var1_1, var6_6, var12_11);
                        var3_3 = e.N(var19_13, this.u(var12_11), (byte[])var2_2, var3_3, var4_4, var13_12);
                        var2_2 = var19_13;
lbl39: // 2 sources:
                        this.u0(var1_1, var6_6, var12_11, var2_2);
                        return var3_3;
                    }
                    case 59: {
                        if (var7_7 != 2) return var3_3;
                        var3_3 = e.H((byte[])var2_2, var3_3, var13_12);
                        var4_4 = var13_12.a;
                        if (var4_4 != 0) ** GOTO lbl48
                        var2_2 = "";
                        ** GOTO lbl79
lbl48: // 1 sources:
                        if ((var8_8 & 536870912) != 0) {
                            if (p0.n((byte[])var2_2, var3_3, var3_3 + var4_4) == false) throw A.d();
                        }
                        var19_13.putObject(var1_1, var10_10, (Object)new String((byte[])var2_2, var3_3, var4_4, z.b));
                        var3_3 += var4_4;
                        break block18;
                    }
                    case 58: {
                        if (var7_7 != 0) return var3_3;
                        var3_3 = e.K((byte[])var2_2, var3_3, var13_12);
                        if (var13_12.b == 0L) {
                            var18_15 = false;
                        }
                        var2_2 = var18_15;
                        ** GOTO lbl79
                    }
                    case 57: 
                    case 64: {
                        if (var7_7 != 5) return var3_3;
                        var2_2 = e.g((byte[])var2_2, var3_3);
                        ** GOTO lbl84
                    }
                    case 56: 
                    case 65: {
                        if (var7_7 != 1) return var3_3;
                        var2_2 = e.i((byte[])var2_2, var3_3);
                        break block19;
                    }
                    case 55: 
                    case 62: {
                        if (var7_7 != 0) return var3_3;
                        var3_3 = e.H((byte[])var2_2, var3_3, var13_12);
                        var4_4 = var13_12.a;
lbl72: // 3 sources:
                        var2_2 = var4_4;
                        ** GOTO lbl79
                    }
                    case 53: 
                    case 54: {
                        if (var7_7 != 0) return var3_3;
                        var3_3 = e.K((byte[])var2_2, var3_3, var13_12);
                        var14_16 = var13_12.b;
lbl78: // 2 sources:
                        var2_2 = var14_16;
lbl79: // 5 sources:
                        var19_13.putObject(var1_1, var10_10, var2_2);
                        break block18;
                    }
                    case 52: {
                        if (var7_7 != 5) return var3_3;
                        var2_2 = Float.valueOf((float)e.k((byte[])var2_2, var3_3));
lbl84: // 2 sources:
                        var19_13.putObject(var1_1, var10_10, var2_2);
                        var3_3 += 4;
                        break block18;
                    }
                    case 51: 
                }
                if (var7_7 != 1) return var3_3;
                var2_2 = e.d((byte[])var2_2, var3_3);
            }
            var19_13.putObject(var1_1, var10_10, var2_2);
            var3_3 += 8;
        }
        var19_13.putInt(var1_1, var16_14, var6_6);
        return var3_3;
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
    public int f0(Object var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, e.a var6_6) {
        block34 : {
            var24_7 = var2_2;
            var11_8 = var5_5;
            S.m(var1_1);
            var25_9 = S.s;
            var8_12 = var9_11 = (var14_10 = 0);
            var13_13 = -1;
            var7_14 = 1048575;
            do {
                block45 : {
                    block41 : {
                        block43 : {
                            block44 : {
                                block42 : {
                                    block38 : {
                                        block36 : {
                                            block37 : {
                                                block40 : {
                                                    block39 : {
                                                        block35 : {
                                                            var26_24 = this;
                                                            var27_25 = var1_1;
                                                            var28_26 = var6_6;
                                                            if (var3_3 >= var4_4) break;
                                                            var10_15 = var3_3 + true;
                                                            var9_11 = var24_7[var3_3];
                                                            if (var9_11 < 0) {
                                                                var10_15 = e.G((int)var9_11, (byte[])var24_7, (int)var10_15, (e.a)var28_26);
                                                                var9_11 = var28_26.a;
                                                            }
                                                            var12_16 = var9_11 >>> 3;
                                                            var16_18 = var9_11 & 7;
                                                            var3_3 = var12_16 > var13_13 ? (Object)var26_24.j0((int)var12_16, var14_10 / 3) : (Object)var26_24.i0((int)var12_16);
                                                            if (var3_3 != -1) break block35;
                                                            var3_3 = var11_8;
                                                            var11_8 = false;
                                                            ** GOTO lbl204
                                                        }
                                                        var17_19 = var26_24.a[var3_3 + true];
                                                        var18_20 = S.v0(var17_19);
                                                        var21_22 = S.X(var17_19);
                                                        if (var18_20 > 17) break block36;
                                                        var11_8 = var26_24.a[var3_3 + 2];
                                                        var13_13 = true << (var11_8 >>> 20);
                                                        if ((var11_8 = (Object)(var11_8 & 1048575)) != var7_14) {
                                                            if (var7_14 != 1048575) {
                                                                var25_9.putInt(var27_25, (long)var7_14, (int)var8_12);
                                                            }
                                                            var7_14 = var25_9.getInt(var27_25, (long)var11_8);
                                                            var8_12 = var11_8;
                                                            var11_8 = var7_14;
                                                        } else {
                                                            var11_8 = var8_12;
                                                            var8_12 = var7_14;
                                                        }
                                                        switch (var18_20) {
                                                            default: {
                                                                ** break;
                                                            }
                                                            case 17: {
                                                                if (var16_18 != 3) break block37;
                                                                var24_7 = var26_24.R(var27_25, (int)var3_3);
                                                                var10_15 = e.M(var24_7, var26_24.u((int)var3_3), (byte[])var2_2, (int)var10_15, var4_4, var12_16 << 3 | 4, (e.a)var6_6);
                                                                var26_24.t0(var27_25, (int)var3_3, var24_7);
                                                                var11_8 = var11_8 | var13_13;
                                                                var7_14 = var8_12;
                                                                var8_12 = var11_8;
                                                                break block38;
                                                            }
                                                            case 16: {
                                                                if (var16_18 != 0) break block37;
                                                                var7_14 = e.K((byte[])var2_2, (int)var10_15, (e.a)var28_26);
                                                                var19_21 = i.c(var28_26.b);
                                                                ** GOTO lbl112
                                                            }
                                                            case 15: {
                                                                if (var16_18 != 0) break block37;
                                                                var7_14 = e.H((byte[])var2_2, (int)var10_15, (e.a)var28_26);
                                                                var10_15 = i.b(var28_26.a);
                                                                ** GOTO lbl106
                                                            }
                                                            case 12: {
                                                                if (var16_18 != 0) break block37;
                                                                var7_14 = e.H((byte[])var2_2, (int)var10_15, (e.a)var28_26);
                                                                var10_15 = var28_26.a;
                                                                var26_24.s((int)var3_3);
                                                                ** GOTO lbl106
                                                            }
                                                            case 10: {
                                                                if (var16_18 != 2) break block37;
                                                                var7_14 = e.b((byte[])var2_2, (int)var10_15, (e.a)var28_26);
                                                                ** GOTO lbl85
                                                            }
                                                            case 9: {
                                                                var7_14 = var3_3;
                                                                if (var16_18 != 2) break block37;
                                                                var24_7 = var26_24.R(var27_25, (int)var7_14);
                                                                var10_15 = e.N(var24_7, var26_24.u((int)var7_14), (byte[])var2_2, (int)var10_15, var4_4, (e.a)var6_6);
                                                                var26_24.t0(var27_25, (int)var7_14, var24_7);
                                                                var7_14 = var10_15;
                                                                break block39;
                                                            }
                                                            case 8: {
                                                                var24_7 = var2_2;
                                                                if (var16_18 != 2) break block37;
                                                                var7_14 = (536870912 & var17_19) == 0 ? (Object)e.B((byte[])var24_7, (int)var10_15, (e.a)var28_26) : (Object)e.E((byte[])var24_7, (int)var10_15, (e.a)var28_26);
lbl85: // 2 sources:
                                                                var25_9.putObject(var27_25, var21_22, var28_26.c);
                                                                break block39;
                                                            }
                                                            case 7: {
                                                                if (var16_18 != 0) break block37;
                                                                var7_14 = e.K((byte[])var2_2, (int)var10_15, (e.a)var28_26);
                                                                var23_23 = var28_26.b != 0L;
                                                                o0.H(var27_25, var21_22, var23_23);
                                                                break block39;
                                                            }
                                                            case 6: 
                                                            case 13: {
                                                                if (var16_18 != 5) break block37;
                                                                var25_9.putInt(var27_25, var21_22, e.g((byte[])var2_2, (int)var10_15));
                                                                ** GOTO lbl122
                                                            }
                                                            case 5: 
                                                            case 14: {
                                                                if (var16_18 != 1) break block37;
                                                                var25_9.putLong(var1_1, var21_22, e.i((byte[])var2_2, (int)var10_15));
                                                                var7_14 = var10_15 + 8;
                                                                break block39;
                                                            }
                                                            case 4: 
                                                            case 11: {
                                                                if (var16_18 != 0) break block37;
                                                                var7_14 = e.H((byte[])var2_2, (int)var10_15, (e.a)var28_26);
                                                                var10_15 = var28_26.a;
lbl106: // 3 sources:
                                                                var25_9.putInt(var27_25, var21_22, (int)var10_15);
                                                                break block39;
                                                            }
                                                            case 2: 
                                                            case 3: {
                                                                if (var16_18 != 0) break block37;
                                                                var7_14 = e.K((byte[])var2_2, (int)var10_15, (e.a)var28_26);
                                                                var19_21 = var28_26.b;
lbl112: // 2 sources:
                                                                var25_9.putLong(var1_1, var21_22, var19_21);
                                                                var11_8 = var11_8 | var13_13;
                                                                var10_15 = var7_14;
                                                                var7_14 = var11_8;
                                                                var14_10 = var3_3;
                                                                var3_3 = var10_15;
                                                                break block40;
                                                            }
                                                            case 1: {
                                                                if (var16_18 != 5) break block37;
                                                                o0.O(var27_25, var21_22, e.k((byte[])var2_2, (int)var10_15));
lbl122: // 2 sources:
                                                                var7_14 = var10_15 + 4;
                                                                break block39;
                                                            }
                                                            case 0: 
                                                        }
                                                        if (var16_18 != 1) break block37;
                                                        o0.N(var27_25, var21_22, e.d((byte[])var2_2, (int)var10_15));
                                                        var7_14 = var10_15 + 8;
                                                    }
                                                    var10_15 = var11_8 | var13_13;
                                                    var14_10 = var3_3;
                                                    var3_3 = var7_14;
                                                    var7_14 = var10_15;
                                                }
                                                var11_8 = var5_5;
                                                var10_15 = var8_12;
                                                var24_7 = var2_2;
                                                var13_13 = var12_16;
                                                var8_12 = var7_14;
                                                var7_14 = var10_15;
                                                continue;
                                            }
                                            var7_14 = var3_3;
                                            var3_3 = var11_8;
                                            var11_8 = var7_14;
                                            var7_14 = var8_12;
                                            var8_12 = var3_3;
                                            break block41;
                                        }
                                        var13_13 = var12_16;
                                        if (var18_20 != 27) break block42;
                                        if (var16_18 != 2) break block43;
                                        var24_7 = var28_26 = (z.d)var25_9.getObject(var27_25, var21_22);
                                        if (!var28_26.p()) {
                                            var11_8 = var28_26.size();
                                            var11_8 = var11_8 == false ? (Object)10 : (var11_8 *= 2);
                                            var24_7 = var28_26.h((int)var11_8);
                                            var25_9.putObject(var27_25, var21_22, var24_7);
                                        }
                                        var10_15 = e.p(var26_24.u((int)var3_3), (int)var9_11, (byte[])var2_2, (int)var10_15, var4_4, (z.d)var24_7, (e.a)var6_6);
                                    }
                                    var11_8 = var5_5;
                                    var14_10 = var3_3;
                                    var24_7 = var2_2;
                                    var3_3 = var10_15;
                                    var13_13 = var12_16;
                                    continue;
                                }
                                var11_8 = var7_14;
                                if (var18_20 > 49) break block44;
                                var7_14 = var14_10 = (Object)this.h0(var1_1, (byte[])var2_2, (int)var10_15, var4_4, (int)var9_11, (int)var13_13, var16_18, (int)var3_3, var17_19, var18_20, var21_22, (e.a)var6_6);
                                if (var14_10 == var10_15) ** GOTO lbl-1000
                                var7_14 = var14_10;
                                ** GOTO lbl192
                            }
                            var14_10 = var10_15;
                            var15_17 = var3_3;
                            if (var18_20 != 50) break block45;
                            if (var16_18 != 2) break block43;
                            var7_14 = var10_15 = (Object)this.d0(var1_1, (byte[])var2_2, (int)var14_10, var4_4, (int)var15_17, var21_22, (e.a)var6_6);
                            if (var10_15 == var14_10) ** GOTO lbl-1000
                            var7_14 = var10_15;
                            ** GOTO lbl192
                        }
                        var11_8 = var3_3;
                    }
                    var3_3 = var5_5;
                    ** GOTO lbl204
                }
                var7_14 = var10_15 = (Object)this.e0(var1_1, (byte[])var2_2, (int)var14_10, var4_4, (int)var9_11, (int)var13_13, var16_18, var17_19, var18_20, var21_22, (int)var15_17, (e.a)var6_6);
                if (var10_15 != var14_10) {
                    var7_14 = var10_15;
lbl192: // 3 sources:
                    var10_15 = var5_5;
                    var12_16 = var11_8;
                    var11_8 = var10_15;
                    var10_15 = var12_16;
                    var14_10 = var3_3;
                    var3_3 = var7_14;
                } else lbl-1000: // 3 sources:
                {
                    var13_13 = var3_3;
                    var3_3 = var5_5;
                    var10_15 = var7_14;
                    var7_14 = var11_8;
                    var11_8 = var13_13;
lbl204: // 3 sources:
                    if (var9_11 == var3_3 && var3_3 != false) {
                        var2_2 = this;
                        var5_5 = var3_3;
                        var3_3 = var10_15;
                        break block34;
                    }
                    var10_15 = this.f != false && var6_6.d != p.b() ? (Object)e.f((int)var9_11, (byte[])var2_2, (int)var10_15, var4_4, var1_1, this.e, this.o, (e.a)var6_6) : (Object)e.F((int)var9_11, (byte[])var2_2, (int)var10_15, var4_4, S.v(var1_1), (e.a)var6_6);
                    var14_10 = var11_8;
                    var11_8 = var3_3;
                    var3_3 = var10_15;
                    var13_13 = var12_16;
                    var10_15 = var7_14;
                }
                var24_7 = var2_2;
                var7_14 = var10_15;
            } while (true);
            var5_5 = var11_8;
            var2_2 = var26_24;
        }
        if (var7_14 != 1048575) {
            var25_9.putInt(var1_1, (long)var7_14, (int)var8_12);
        }
        var6_6 = null;
        for (var7_14 = var2_2.k; var7_14 < var2_2.l; ++var7_14) {
            var6_6 = (l0)this.q(var1_1, var2_2.j[var7_14], var6_6, var2_2.o, var1_1);
        }
        if (var5_5 == false) {
            if (var3_3 != var4_4) throw A.h();
            return (int)var3_3;
        }
        if (var3_3 > var4_4) throw A.h();
        if (var9_11 != var5_5) throw A.h();
        return (int)var3_3;
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
                                var5_7 = var6_4 = var6_4 * 53 + this.o.g(var1_1).hashCode();
                                if (this.f == false) return var5_7;
                                return var6_4 * 53 + this.p.c(var1_1).hashCode();
                            }
                            var5_7 = this.w0(var7_3);
                            var9_8 = this.W(var7_3);
                            var11_10 = S.X(var5_7);
                            var10_9 = S.v0(var5_7);
                            var5_7 = 37;
                            switch (var10_9) {
                                default: {
                                    var5_7 = var6_4;
                                    ** break;
                                }
                                case 68: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl56
                                }
                                case 67: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl94
                                }
                                case 66: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 65: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl94
                                }
                                case 64: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 63: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 62: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 61: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
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
                                    var14_12 = o0.C(var1_1, var11_10);
                                    ** GOTO lbl58
                                }
                                case 60: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
lbl56: // 2 sources:
                                    var14_12 = o0.C(var1_1, var11_10);
                                    var5_7 = var6_4 * 53;
lbl58: // 2 sources:
                                    var6_4 = var14_12.hashCode();
                                    break block35;
                                }
                                case 59: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                }
                                case 8: {
                                    var5_7 = var6_4 * 53;
                                    var6_4 = ((String)o0.C(var1_1, var11_10)).hashCode();
                                    break block35;
                                }
                                case 58: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var13_11 = S.Y(var1_1, var11_10);
                                    ** GOTO lbl130
                                }
                                case 57: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 56: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl94
                                }
                                case 55: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
lbl84: // 6 sources:
                                    var5_7 = var6_4 * 53;
                                    var6_4 = S.b0(var1_1, var11_10);
                                    break block35;
                                }
                                case 54: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl94
                                }
                                case 53: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
lbl94: // 5 sources:
                                    var5_7 = var6_4 * 53;
                                    var11_10 = S.c0(var1_1, var11_10);
                                    break block36;
                                }
                                case 52: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var4_6 = S.a0(var1_1, var11_10);
                                    ** GOTO lbl135
                                }
                                case 51: {
                                    var5_7 = var6_4;
                                    if (!this.I(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var2_5 = S.Z(var1_1, var11_10);
                                    break block37;
                                }
                                case 17: {
                                    var14_12 = o0.C(var1_1, var11_10);
                                    if (var14_12 == null) ** GOTO lbl125
                                    ** GOTO lbl124
                                }
                                case 2: 
                                case 3: 
                                case 5: 
                                case 14: 
                                case 16: {
                                    var5_7 = var6_4 * 53;
                                    var11_10 = o0.A(var1_1, var11_10);
                                    break block36;
                                }
                                case 4: 
                                case 6: 
                                case 11: 
                                case 12: 
                                case 13: 
                                case 15: {
                                    var5_7 = var6_4 * 53;
                                    var6_4 = o0.z(var1_1, var11_10);
                                    break block35;
                                }
                                case 9: {
                                    var14_12 = o0.C(var1_1, var11_10);
                                    if (var14_12 == null) ** GOTO lbl125
lbl124: // 2 sources:
                                    var5_7 = var14_12.hashCode();
lbl125: // 3 sources:
                                    var5_7 = var6_4 * 53 + var5_7;
                                    ** break;
                                }
                                case 7: {
                                    var5_7 = var6_4 * 53;
                                    var13_11 = o0.r(var1_1, var11_10);
lbl130: // 2 sources:
                                    var6_4 = z.c(var13_11);
                                    break block35;
                                }
                                case 1: {
                                    var5_7 = var6_4 * 53;
                                    var4_6 = o0.y(var1_1, var11_10);
lbl135: // 2 sources:
                                    var6_4 = Float.floatToIntBits((float)var4_6);
                                    break block35;
                                }
                                case 0: 
                            }
                            var5_7 = var6_4 * 53;
                            var2_5 = o0.x(var1_1, var11_10);
                        }
                        var11_10 = Double.doubleToLongBits((double)var2_5);
                    }
                    var6_4 = z.f(var11_10);
                }
                var5_7 += var6_4;
                ** break;
            }
            var7_3 += 3;
            var6_4 = var5_7;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int g0(Object var1_1, byte[] var2_2, int var3_3, int var4_4, e.a var5_5) {
        S.m(var1_1);
        var21_6 = S.s;
        var9_7 = -1;
        var10_8 = var3_3;
        var3_3 = -1;
        var6_10 = var11_9 = 0;
        var7_11 = 1048575;
        do {
            block39 : {
                block37 : {
                    block38 : {
                        block36 : {
                            block31 : {
                                block30 : {
                                    block33 : {
                                        block32 : {
                                            block34 : {
                                                block35 : {
                                                    block29 : {
                                                        var25_24 = var5_5;
                                                        var24_23 = this;
                                                        var23_22 = var1_1;
                                                        var22_21 = var2_2;
                                                        if (var10_8 >= var4_4) break;
                                                        var8_12 = var10_8 + 1;
                                                        var12_13 = var22_21[var10_8];
                                                        if (var12_13 < 0) {
                                                            var8_12 = e.G(var12_13, (byte[])var22_21, var8_12, (e.a)var25_24);
                                                            var12_13 = var25_24.a;
                                                        }
                                                        var10_8 = var12_13 >>> 3;
                                                        var15_16 = var12_13 & 7;
                                                        var3_3 = var10_8 > var3_3 ? var24_23.j0(var10_8, var11_9 / 3) : var24_23.i0(var10_8);
                                                        if (var3_3 != var9_7) break block29;
                                                        var11_9 = var8_12;
                                                        var8_12 = var9_7;
                                                        var3_3 = 0;
                                                        ** GOTO lbl204
                                                    }
                                                    var16_17 = var24_23.a[var3_3 + 1];
                                                    var17_18 = S.v0(var16_17);
                                                    var18_19 = S.X(var16_17);
                                                    if (var17_18 > 17) break block30;
                                                    var9_7 = var24_23.a[var3_3 + 2];
                                                    var14_15 = 1 << (var9_7 >>> 20);
                                                    var13_14 = var9_7 & 1048575;
                                                    var11_9 = var6_10;
                                                    var9_7 = var7_11;
                                                    if (var13_14 != var7_11) {
                                                        if (var7_11 != 1048575) {
                                                            var21_6.putInt(var23_22, (long)var7_11, var6_10);
                                                        }
                                                        if (var13_14 != 1048575) {
                                                            var6_10 = var21_6.getInt(var23_22, (long)var13_14);
                                                        }
                                                        var9_7 = var13_14;
                                                        var11_9 = var6_10;
                                                    }
                                                    switch (var17_18) {
                                                        case 16: {
                                                            if (var15_16 != 0) ** GOTO lbl-1000
                                                            var23_22 = var5_5;
                                                            var6_10 = e.K((byte[])var22_21, var8_12, (e.a)var23_22);
                                                            var21_6.putLong(var1_1, var18_19, i.c(var23_22.b));
                                                            var8_12 = var11_9 | var14_15;
                                                            var11_9 = var6_10;
                                                            var7_11 = var9_7;
                                                            var6_10 = var3_3;
                                                            var3_3 = var11_9;
                                                            break block31;
                                                        }
                                                        case 15: {
                                                            var24_23 = var5_5;
                                                            if (var15_16 != 0) ** GOTO lbl-1000
                                                            var6_10 = e.H((byte[])var22_21, var8_12, (e.a)var24_23);
                                                            var21_6.putInt(var23_22, var18_19, i.b(var24_23.a));
                                                            ** GOTO lbl85
                                                        }
                                                        case 12: {
                                                            var24_23 = var5_5;
                                                            if (var15_16 != 0) ** GOTO lbl-1000
                                                            var6_10 = e.H((byte[])var22_21, var8_12, (e.a)var24_23);
                                                            var21_6.putInt(var23_22, var18_19, var24_23.a);
                                                            ** GOTO lbl73
                                                        }
                                                        case 10: {
                                                            var24_23 = var5_5;
                                                            if (var15_16 != 2) ** GOTO lbl-1000
                                                            var6_10 = e.b((byte[])var22_21, var8_12, (e.a)var24_23);
                                                            var21_6.putObject(var23_22, var18_19, var24_23.c);
lbl73: // 2 sources:
                                                            var8_12 = var11_9 | var14_15;
                                                            break block32;
                                                        }
                                                        case 9: {
                                                            var6_10 = var3_3;
                                                            ** if (var15_16 != 2) goto lbl-1000
lbl-1000: // 1 sources:
                                                            {
                                                                var22_21 = var24_23.R((Object)var23_22, (int)var6_10);
                                                                var7_11 = e.N((Object)var22_21, (e0)var24_23.u((int)var6_10), (byte[])var2_2, (int)var8_12, (int)var4_4, (e.a)var5_5);
                                                                var24_23.t0((Object)var23_22, (int)var6_10, (Object)var22_21);
                                                                var6_10 = var7_11;
                                                                ** GOTO lbl85
                                                            }
                                                        }
lbl-1000: // 6 sources:
                                                        {
                                                            default: {
                                                                ** break;
                                                            }
                                                        }
lbl85: // 2 sources:
                                                        var8_12 = var11_9 | var14_15;
                                                        break block32;
                                                        case 8: {
                                                            var24_23 = var5_5;
                                                            if (var15_16 != 2) break block33;
                                                            var6_10 = (536870912 & var16_17) == 0 ? e.B((byte[])var22_21, var8_12, (e.a)var24_23) : e.E((byte[])var22_21, var8_12, (e.a)var24_23);
                                                            var21_6.putObject(var23_22, var18_19, var24_23.c);
                                                            break block34;
                                                        }
                                                        case 7: {
                                                            var24_23 = var5_5;
                                                            var20_20 = true;
                                                            if (var15_16 != 0) break block33;
                                                            var6_10 = e.K((byte[])var22_21, var8_12, (e.a)var24_23);
                                                            if (var24_23.b == 0L) {
                                                                var20_20 = false;
                                                            }
                                                            o0.H(var23_22, var18_19, var20_20);
                                                            var8_12 = var11_9 | var14_15;
                                                            break block32;
                                                        }
                                                        case 6: 
                                                        case 13: {
                                                            if (var15_16 != 5) break block33;
                                                            var21_6.putInt(var23_22, var18_19, e.g((byte[])var22_21, var8_12));
                                                            var6_10 = var8_12 + 4;
                                                            break block34;
                                                        }
                                                        case 5: 
                                                        case 14: {
                                                            if (var15_16 != 1) break block33;
                                                            var21_6.putLong(var1_1, var18_19, e.i((byte[])var22_21, var8_12));
                                                            break block35;
                                                        }
                                                        case 4: 
                                                        case 11: {
                                                            var24_23 = var5_5;
                                                            if (var15_16 != 0) break block33;
                                                            var6_10 = e.H((byte[])var22_21, var8_12, (e.a)var24_23);
                                                            var21_6.putInt(var23_22, var18_19, var24_23.a);
                                                            break block34;
                                                        }
                                                        case 2: 
                                                        case 3: {
                                                            var23_22 = var5_5;
                                                            if (var15_16 != 0) break block33;
                                                            var7_11 = e.K((byte[])var22_21, var8_12, (e.a)var23_22);
                                                            var21_6.putLong(var1_1, var18_19, var23_22.b);
                                                            var8_12 = var11_9 | var14_15;
                                                            var6_10 = var3_3;
                                                            var3_3 = var7_11;
                                                            var7_11 = var9_7;
                                                            break block31;
                                                        }
                                                        case 1: {
                                                            var6_10 = var8_12;
                                                            if (var15_16 != 5) break block33;
                                                            o0.O(var23_22, var18_19, e.k((byte[])var22_21, var6_10));
                                                            var6_10 += 4;
                                                            break block34;
                                                        }
                                                        case 0: 
                                                    }
                                                    if (var15_16 != 1) break block33;
                                                    o0.N(var23_22, var18_19, e.d((byte[])var22_21, var8_12));
                                                }
                                                var6_10 = var8_12 + 8;
                                            }
                                            var8_12 = var11_9 | var14_15;
                                        }
                                        var7_11 = var3_3;
                                        var3_3 = var6_10;
                                        var6_10 = var7_11;
                                        var7_11 = var9_7;
                                        break block31;
                                    }
                                    var6_10 = var11_9;
                                    var13_14 = -1;
                                    var11_9 = var8_12;
                                    var7_11 = var9_7;
                                    var8_12 = var13_14;
                                    ** GOTO lbl204
                                }
                                var11_9 = var10_8;
                                if (var17_18 != 27) break block36;
                                if (var15_16 != 2) break block37;
                                var22_21 = var25_24 = (z.d)var21_6.getObject(var23_22, var18_19);
                                if (!var25_24.p()) {
                                    var9_7 = var25_24.size();
                                    var9_7 = var9_7 == 0 ? 10 : (var9_7 *= 2);
                                    var22_21 = var25_24.h(var9_7);
                                    var21_6.putObject(var23_22, var18_19, var22_21);
                                }
                                var11_9 = e.p(var24_23.u(var3_3), var12_13, var2_2, var8_12, var4_4, (z.d)var22_21, var5_5);
                                var8_12 = var3_3;
                                var9_7 = var6_10;
                                var3_3 = var11_9;
                                var6_10 = var8_12;
                                var8_12 = var9_7;
                            }
                            var9_7 = var10_8;
                            var12_13 = -1;
                            var10_8 = var3_3;
                            var3_3 = var9_7;
                            var11_9 = var6_10;
                            var6_10 = var8_12;
                            var9_7 = var12_13;
                            continue;
                        }
                        if (var17_18 > 49) break block38;
                        var9_7 = var13_14 = this.h0(var1_1, var2_2, var8_12, var4_4, var12_13, var11_9, var15_16, var3_3, var16_17, var17_18, var18_19, var5_5);
                        if (var13_14 == var8_12) ** GOTO lbl-1000
                        var8_12 = var13_14;
                        ** GOTO lbl-1000
                    }
                    var9_7 = var3_3;
                    var13_14 = var8_12;
                    if (var17_18 != 50) break block39;
                    if (var15_16 != 2) break block37;
                    var9_7 = var8_12 = this.d0(var1_1, var2_2, var13_14, var4_4, var9_7, var18_19, var5_5);
                    if (var8_12 == var13_14) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                var11_9 = var8_12;
                ** GOTO lbl203
            }
            var9_7 = var8_12 = this.e0(var1_1, var2_2, var13_14, var4_4, var12_13, var11_9, var15_16, var16_17, var17_18, var18_19, var9_7, var5_5);
            if (var8_12 != var13_14) lbl-1000: // 3 sources:
            {
                var9_7 = -1;
            } else lbl-1000: // 3 sources:
            {
                var11_9 = var9_7;
lbl203: // 2 sources:
                var8_12 = -1;
lbl204: // 3 sources:
                var11_9 = e.F(var12_13, var2_2, var11_9, var4_4, S.v(var1_1), var5_5);
                var9_7 = var8_12;
                var8_12 = var11_9;
                var11_9 = var10_8;
            }
            var12_13 = var3_3;
            var10_8 = var8_12;
            var3_3 = var11_9;
            var11_9 = var12_13;
        } while (true);
        if (var7_11 != 1048575) {
            var21_6.putInt(var1_1, (long)var7_11, var6_10);
        }
        if (var10_8 != var4_4) throw A.h();
        return var10_8;
    }

    @Override
    public void h(Object object, byte[] arrby, int n8, int n9, e.a a8) {
        if (this.h) {
            this.g0(object, arrby, n8, n9, a8);
            return;
        }
        this.f0(object, arrby, n8, n9, 0, a8);
    }

    public final int h0(Object object, byte[] arrby, int n8, int n9, int n10, int n11, int n12, int n13, long l8, int n14, long l9, e.a a8) {
        z.d d8;
        Unsafe unsafe = s;
        z.d d9 = d8 = (z.d)unsafe.getObject(object, l9);
        if (!d8.p()) {
            int n15 = d8.size();
            n15 = n15 == 0 ? 10 : (n15 *= 2);
            d9 = d8.h(n15);
            unsafe.putObject(object, l9, (Object)d9);
        }
        switch (n14) {
            default: {
                break;
            }
            case 49: {
                if (n12 != 3) break;
                return e.n(this.u(n13), n10, arrby, n8, n9, d9, a8);
            }
            case 34: 
            case 48: {
                if (n12 == 2) {
                    return e.w(arrby, n8, d9, a8);
                }
                if (n12 != 0) break;
                return e.A(n10, arrby, n8, n9, d9, a8);
            }
            case 33: 
            case 47: {
                if (n12 == 2) {
                    return e.v(arrby, n8, d9, a8);
                }
                if (n12 != 0) break;
                return e.z(n10, arrby, n8, n9, d9, a8);
            }
            case 30: 
            case 44: {
                if (n12 == 2) {
                    n8 = e.x(arrby, n8, d9, a8);
                } else {
                    if (n12 != 0) break;
                    n8 = e.I(n10, arrby, n8, n9, d9, a8);
                }
                this.s(n13);
                g0.z(object, n11, d9, null, null, this.o);
                return n8;
            }
            case 28: {
                if (n12 != 2) break;
                return e.c(n10, arrby, n8, n9, d9, a8);
            }
            case 27: {
                if (n12 != 2) break;
                return e.p(this.u(n13), n10, arrby, n8, n9, d9, a8);
            }
            case 26: {
                if (n12 != 2) break;
                if ((l8 & 0x20000000L) == 0L) {
                    return e.C(n10, arrby, n8, n9, d9, a8);
                }
                return e.D(n10, arrby, n8, n9, d9, a8);
            }
            case 25: 
            case 42: {
                if (n12 == 2) {
                    return e.q(arrby, n8, d9, a8);
                }
                if (n12 != 0) break;
                return e.a(n10, arrby, n8, n9, d9, a8);
            }
            case 24: 
            case 31: 
            case 41: 
            case 45: {
                if (n12 == 2) {
                    return e.s(arrby, n8, d9, a8);
                }
                if (n12 != 5) break;
                return e.h(n10, arrby, n8, n9, d9, a8);
            }
            case 23: 
            case 32: 
            case 40: 
            case 46: {
                if (n12 == 2) {
                    return e.t(arrby, n8, d9, a8);
                }
                if (n12 != 1) break;
                return e.j(n10, arrby, n8, n9, d9, a8);
            }
            case 22: 
            case 29: 
            case 39: 
            case 43: {
                if (n12 == 2) {
                    return e.x(arrby, n8, d9, a8);
                }
                if (n12 != 0) break;
                return e.I(n10, arrby, n8, n9, d9, a8);
            }
            case 20: 
            case 21: 
            case 37: 
            case 38: {
                if (n12 == 2) {
                    return e.y(arrby, n8, d9, a8);
                }
                if (n12 != 0) break;
                return e.L(n10, arrby, n8, n9, d9, a8);
            }
            case 19: 
            case 36: {
                if (n12 == 2) {
                    return e.u(arrby, n8, d9, a8);
                }
                if (n12 != 5) break;
                return e.l(n10, arrby, n8, n9, d9, a8);
            }
            case 18: 
            case 35: {
                if (n12 == 2) {
                    return e.r(arrby, n8, d9, a8);
                }
                if (n12 != 1) break;
                return e.e(n10, arrby, n8, n9, d9, a8);
            }
        }
        return n8;
    }

    @Override
    public void i(Object object, r0 r02) {
        if (r02.v() == r0.a.p) {
            this.z0(object, r02);
            return;
        }
        if (this.h) {
            this.y0(object, r02);
            return;
        }
        this.x0(object, r02);
    }

    public final int i0(int n8) {
        if (n8 >= this.c && n8 <= this.d) {
            return this.s0(n8, 0);
        }
        return -1;
    }

    @Override
    public void j(Object object, d0 d02, p p8) {
        p8.getClass();
        S.m(object);
        this.M(this.o, this.p, object, d02, p8);
    }

    public final int j0(int n8, int n9) {
        if (n8 >= this.c && n8 <= this.d) {
            return this.s0(n8, n9);
        }
        return -1;
    }

    public final boolean k(Object object, Object object2, int n8) {
        if (this.B(object, n8) == this.B(object2, n8)) {
            return true;
        }
        return false;
    }

    public final int k0(int n8) {
        return this.a[n8 + 2];
    }

    public final void l0(Object object, long l8, d0 d02, e0 e02, p p8) {
        d02.N(this.n.e(object, l8), e02, p8);
    }

    public final void m0(Object object, int n8, d0 d02, e0 e02, p p8) {
        long l8 = S.X(n8);
        d02.K(this.n.e(object, l8), e02, p8);
    }

    public final int n(byte[] arrby, int n8, int n9, H.a a8, Map map, e.a a9) {
        n8 = e.H(arrby, n8, a9);
        int n10 = a9.a;
        if (n10 >= 0 && n10 <= n9 - n8) {
            throw null;
        }
        throw A.m();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void n0(Object object, int n8, d0 object2) {
        long l8;
        if (S.A(n8)) {
            l8 = S.X(n8);
            object2 = object2.F();
        } else if (this.g) {
            l8 = S.X(n8);
            object2 = object2.m();
        } else {
            l8 = S.X(n8);
            object2 = object2.u();
        }
        o0.R(object, l8, object2);
    }

    public final void o0(Object object, int n8, d0 d02) {
        if (S.A(n8)) {
            d02.t(this.n.e(object, S.X(n8)));
            return;
        }
        d02.q(this.n.e(object, S.X(n8)));
    }

    public final boolean p(Object object, Object object2, int n8) {
        int n9 = this.w0(n8);
        long l8 = S.X(n9);
        n9 = S.v0(n9);
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
                if (this.H(object, object2, n8)) {
                    bl20 = bl19;
                    if (g0.J(o0.C(object, l8), o0.C(object2, l8))) {
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
                return g0.J(o0.C(object, l8), o0.C(object2, l8));
            }
            case 17: {
                boolean bl21 = bl;
                if (this.k(object, object2, n8)) {
                    bl21 = bl;
                    if (g0.J(o0.C(object, l8), o0.C(object2, l8))) {
                        bl21 = true;
                    }
                }
                return bl21;
            }
            case 16: {
                boolean bl22 = bl2;
                if (this.k(object, object2, n8)) {
                    bl22 = bl2;
                    if (o0.A(object, l8) == o0.A(object2, l8)) {
                        bl22 = true;
                    }
                }
                return bl22;
            }
            case 15: {
                boolean bl23 = bl3;
                if (this.k(object, object2, n8)) {
                    bl23 = bl3;
                    if (o0.z(object, l8) == o0.z(object2, l8)) {
                        bl23 = true;
                    }
                }
                return bl23;
            }
            case 14: {
                boolean bl24 = bl4;
                if (this.k(object, object2, n8)) {
                    bl24 = bl4;
                    if (o0.A(object, l8) == o0.A(object2, l8)) {
                        bl24 = true;
                    }
                }
                return bl24;
            }
            case 13: {
                boolean bl25 = bl5;
                if (this.k(object, object2, n8)) {
                    bl25 = bl5;
                    if (o0.z(object, l8) == o0.z(object2, l8)) {
                        bl25 = true;
                    }
                }
                return bl25;
            }
            case 12: {
                boolean bl26 = bl6;
                if (this.k(object, object2, n8)) {
                    bl26 = bl6;
                    if (o0.z(object, l8) == o0.z(object2, l8)) {
                        bl26 = true;
                    }
                }
                return bl26;
            }
            case 11: {
                boolean bl27 = bl7;
                if (this.k(object, object2, n8)) {
                    bl27 = bl7;
                    if (o0.z(object, l8) == o0.z(object2, l8)) {
                        bl27 = true;
                    }
                }
                return bl27;
            }
            case 10: {
                boolean bl28 = bl8;
                if (this.k(object, object2, n8)) {
                    bl28 = bl8;
                    if (g0.J(o0.C(object, l8), o0.C(object2, l8))) {
                        bl28 = true;
                    }
                }
                return bl28;
            }
            case 9: {
                boolean bl29 = bl9;
                if (this.k(object, object2, n8)) {
                    bl29 = bl9;
                    if (g0.J(o0.C(object, l8), o0.C(object2, l8))) {
                        bl29 = true;
                    }
                }
                return bl29;
            }
            case 8: {
                boolean bl30 = bl10;
                if (this.k(object, object2, n8)) {
                    bl30 = bl10;
                    if (g0.J(o0.C(object, l8), o0.C(object2, l8))) {
                        bl30 = true;
                    }
                }
                return bl30;
            }
            case 7: {
                boolean bl31 = bl11;
                if (this.k(object, object2, n8)) {
                    bl31 = bl11;
                    if (o0.r(object, l8) == o0.r(object2, l8)) {
                        bl31 = true;
                    }
                }
                return bl31;
            }
            case 6: {
                boolean bl32 = bl12;
                if (this.k(object, object2, n8)) {
                    bl32 = bl12;
                    if (o0.z(object, l8) == o0.z(object2, l8)) {
                        bl32 = true;
                    }
                }
                return bl32;
            }
            case 5: {
                boolean bl33 = bl13;
                if (this.k(object, object2, n8)) {
                    bl33 = bl13;
                    if (o0.A(object, l8) == o0.A(object2, l8)) {
                        bl33 = true;
                    }
                }
                return bl33;
            }
            case 4: {
                boolean bl34 = bl14;
                if (this.k(object, object2, n8)) {
                    bl34 = bl14;
                    if (o0.z(object, l8) == o0.z(object2, l8)) {
                        bl34 = true;
                    }
                }
                return bl34;
            }
            case 3: {
                boolean bl35 = bl15;
                if (this.k(object, object2, n8)) {
                    bl35 = bl15;
                    if (o0.A(object, l8) == o0.A(object2, l8)) {
                        bl35 = true;
                    }
                }
                return bl35;
            }
            case 2: {
                boolean bl36 = bl16;
                if (this.k(object, object2, n8)) {
                    bl36 = bl16;
                    if (o0.A(object, l8) == o0.A(object2, l8)) {
                        bl36 = true;
                    }
                }
                return bl36;
            }
            case 1: {
                boolean bl37 = bl17;
                if (this.k(object, object2, n8)) {
                    bl37 = bl17;
                    if (Float.floatToIntBits((float)o0.y(object, l8)) == Float.floatToIntBits((float)o0.y(object2, l8))) {
                        bl37 = true;
                    }
                }
                return bl37;
            }
            case 0: 
        }
        boolean bl38 = bl18;
        if (this.k(object, object2, n8)) {
            bl38 = bl18;
            if (Double.doubleToLongBits((double)o0.x(object, l8)) == Double.doubleToLongBits((double)o0.x(object2, l8))) {
                bl38 = true;
            }
        }
        return bl38;
    }

    public final Object q(Object object, int n8, Object object2, k0 k02, Object object3) {
        this.W(n8);
        if (o0.C(object, S.X(this.w0(n8))) == null) {
            return object2;
        }
        this.s(n8);
        return object2;
    }

    public final void q0(Object object, int n8) {
        long l8 = 1048575 & (n8 = this.k0(n8));
        if (l8 == 1048575L) {
            return;
        }
        o0.P(object, l8, 1 << (n8 >>> 20) | o0.z(object, l8));
    }

    public final void r0(Object object, int n8, int n9) {
        o0.P(object, this.k0(n9) & 1048575, n8);
    }

    public final z.c s(int n8) {
        a.a(this.b[n8 / 3 * 2 + 1]);
        return null;
    }

    public final int s0(int n8, int n9) {
        int n10 = this.a.length / 3 - 1;
        while (n9 <= n10) {
            int n11 = n10 + n9 >>> 1;
            int n12 = n11 * 3;
            int n13 = this.W(n12);
            if (n8 == n13) {
                return n12;
            }
            if (n8 < n13) {
                n10 = n11 - 1;
                continue;
            }
            n9 = n11 + 1;
        }
        return -1;
    }

    public final Object t(int n8) {
        return this.b[n8 / 3 * 2];
    }

    public final void t0(Object object, int n8, Object object2) {
        s.putObject(object, S.X(this.w0(n8)), object2);
        this.q0(object, n8);
    }

    public final e0 u(int n8) {
        e0 e02 = (e0)this.b[n8 = n8 / 3 * 2];
        if (e02 != null) {
            return e02;
        }
        e02 = a0.a().c((Class)this.b[n8 + 1]);
        this.b[n8] = e02;
        return e02;
    }

    public final void u0(Object object, int n8, int n9, Object object2) {
        s.putObject(object, S.X(this.w0(n9)), object2);
        this.r0(object, n8, n9);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int w(Object var1_1) {
        var17_2 = S.s;
        var8_3 = 1048575;
        var4_4 = 0;
        var3_5 = 0;
        var6_6 = 0;
        do {
            block87 : {
                block88 : {
                    if (var4_4 >= this.a.length) {
                        var2_7 = var3_5 += this.y(this.o, var1_1);
                        if (this.f == false) return var2_7;
                        return var3_5 + this.p.c(var1_1).c();
                    }
                    var13_14 = this.w0(var4_4);
                    var12_13 = this.W(var4_4);
                    var14_15 = S.v0(var13_14);
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
                        var2_7 = this.i != false && var14_15 >= u.c0.c() && var14_15 <= u.p0.c() ? this.a[var4_4 + 2] & 1048575 : 0;
                        var9_10 = 0;
                        var5_8 = var8_3;
                        var7_9 = var2_7;
                    }
                    var15_16 = S.X(var13_14);
                    switch (var14_15) {
                        default: {
                            var2_7 = var3_5;
                            ** break;
                        }
                        case 68: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            ** GOTO lbl287
                        }
                        case 67: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            var15_16 = S.c0(var1_1, var15_16);
                            ** GOTO lbl293
                        }
                        case 66: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = S.b0(var1_1, var15_16);
                            ** GOTO lbl299
                        }
                        case 65: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            ** GOTO lbl304
                        }
                        case 64: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            ** GOTO lbl309
                        }
                        case 63: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = S.b0(var1_1, var15_16);
                            ** GOTO lbl316
                        }
                        case 62: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = S.b0(var1_1, var15_16);
                            ** GOTO lbl322
                        }
                        case 61: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            ** GOTO lbl327
                        }
                        case 60: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            ** GOTO lbl332
                        }
                        case 59: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            var18_17 = var17_2.getObject(var1_1, var15_16);
                            var2_7 = var18_17 instanceof h ? k.f(var12_13, (h)var18_17) : k.J(var12_13, (String)var18_17);
                            ** GOTO lbl344
                        }
                        case 58: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            ** GOTO lbl343
                        }
                        case 57: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = k.l(var12_13, 0);
                            ** GOTO lbl310
                        }
                        case 56: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = k.n(var12_13, 0L);
                            ** GOTO lbl344
                        }
                        case 55: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = k.t(var12_13, S.b0(var1_1, var15_16));
                            ** GOTO lbl344
                        }
                        case 54: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = k.O(var12_13, S.c0(var1_1, var15_16));
                            ** GOTO lbl344
                        }
                        case 53: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = k.v(var12_13, S.c0(var1_1, var15_16));
                            ** GOTO lbl344
                        }
                        case 52: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = k.p(var12_13, 0.0f);
                            ** GOTO lbl344
                        }
                        case 51: {
                            var2_7 = var3_5;
                            if (!this.I(var1_1, var12_13, var4_4)) break block87;
                            var2_7 = k.h(var12_13, 0.0);
                            ** GOTO lbl344
                        }
                        case 50: {
                            var2_7 = this.q.b(var12_13, var17_2.getObject(var1_1, var15_16), this.t(var4_4));
                            ** GOTO lbl344
                        }
                        case 49: {
                            var2_7 = g0.j(var12_13, (List)var17_2.getObject(var1_1, var15_16), this.u(var4_4));
                            ** GOTO lbl344
                        }
                        case 48: {
                            var8_3 = g0.t((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 47: {
                            var8_3 = g0.r((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 46: {
                            var8_3 = g0.i((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 45: {
                            var8_3 = g0.g((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 44: {
                            var8_3 = g0.e((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 43: {
                            var8_3 = g0.w((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 42: {
                            var8_3 = g0.b((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 41: {
                            var8_3 = g0.g((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 40: {
                            var8_3 = g0.i((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 39: {
                            var8_3 = g0.l((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 38: {
                            var8_3 = g0.y((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 37: {
                            var8_3 = g0.n((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 36: {
                            var8_3 = g0.g((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
                            ** GOTO lbl238
                        }
                        case 35: {
                            var8_3 = g0.i((List)var17_2.getObject(var1_1, var15_16));
                            var2_7 = var3_5;
                            if (var8_3 <= 0) break block87;
                            var2_7 = var8_3;
                            if (!this.i) ** GOTO lbl239
                            var2_7 = var8_3;
lbl238: // 14 sources:
                            var17_2.putInt(var1_1, (long)var7_9, var2_7);
lbl239: // 15 sources:
                            var2_7 = k.L(var12_13) + k.N(var2_7) + var2_7;
                            ** GOTO lbl310
                        }
                        case 34: {
                            var2_7 = g0.s(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 33: {
                            var2_7 = g0.q(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 23: 
                        case 32: {
                            var2_7 = g0.h(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 19: 
                        case 24: 
                        case 31: {
                            var2_7 = g0.f(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 30: {
                            var2_7 = g0.d(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 29: {
                            var2_7 = g0.v(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl344
                        }
                        case 28: {
                            var2_7 = g0.c(var12_13, (List)var17_2.getObject(var1_1, var15_16));
                            ** GOTO lbl344
                        }
                        case 27: {
                            var2_7 = g0.p(var12_13, (List)var17_2.getObject(var1_1, var15_16), this.u(var4_4));
                            ** GOTO lbl344
                        }
                        case 26: {
                            var2_7 = g0.u(var12_13, (List)var17_2.getObject(var1_1, var15_16));
                            ** GOTO lbl344
                        }
                        case 25: {
                            var2_7 = g0.a(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 22: {
                            var2_7 = g0.k(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 21: {
                            var2_7 = g0.x(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl279
                        }
                        case 20: {
                            var2_7 = g0.m(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
lbl279: // 9 sources:
                            var2_7 = var3_5 + var2_7;
                            ** break;
                        }
                        case 18: {
                            var2_7 = g0.h(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                            ** GOTO lbl344
                        }
                        case 17: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
lbl287: // 2 sources:
                            var2_7 = k.r(var12_13, (O)var17_2.getObject(var1_1, var15_16), this.u(var4_4));
                            ** GOTO lbl344
                        }
                        case 16: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var15_16 = var17_2.getLong(var1_1, var15_16);
lbl293: // 2 sources:
                            var2_7 = k.H(var12_13, var15_16);
                            ** GOTO lbl344
                        }
                        case 15: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = var17_2.getInt(var1_1, var15_16);
lbl299: // 2 sources:
                            var2_7 = k.F(var12_13, var2_7);
                            ** GOTO lbl344
                        }
                        case 14: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
lbl304: // 2 sources:
                            var2_7 = k.D(var12_13, 0L);
                            ** GOTO lbl344
                        }
                        case 13: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
lbl309: // 2 sources:
                            var2_7 = k.B(var12_13, 0);
lbl310: // 3 sources:
                            var2_7 = var3_5 + var2_7;
                            break block87;
                        }
                        case 12: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = var17_2.getInt(var1_1, var15_16);
lbl316: // 2 sources:
                            var2_7 = k.j(var12_13, var2_7);
                            ** GOTO lbl344
                        }
                        case 11: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = var17_2.getInt(var1_1, var15_16);
lbl322: // 2 sources:
                            var2_7 = k.M(var12_13, var2_7);
                            ** GOTO lbl344
                        }
                        case 10: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
lbl327: // 2 sources:
                            var2_7 = k.f(var12_13, (h)var17_2.getObject(var1_1, var15_16));
                            ** GOTO lbl344
                        }
                        case 9: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
lbl332: // 2 sources:
                            var2_7 = g0.o(var12_13, var17_2.getObject(var1_1, var15_16), this.u(var4_4));
                            ** GOTO lbl344
                        }
                        case 8: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var18_17 = var17_2.getObject(var1_1, var15_16);
                            var2_7 = var18_17 instanceof h ? k.f(var12_13, (h)var18_17) : k.J(var12_13, (String)var18_17);
                            ** GOTO lbl344
                        }
                        case 7: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
lbl343: // 2 sources:
                            var2_7 = k.d(var12_13, true);
lbl344: // 24 sources:
                            var2_7 = var3_5 + var2_7;
                            break block87;
                        }
                        case 6: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = k.l(var12_13, 0);
                            break block88;
                        }
                        case 5: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = k.n(var12_13, 0L);
                            break block88;
                        }
                        case 4: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = k.t(var12_13, var17_2.getInt(var1_1, var15_16));
                            break block88;
                        }
                        case 3: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = k.O(var12_13, var17_2.getLong(var1_1, var15_16));
                            break block88;
                        }
                        case 2: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = k.v(var12_13, var17_2.getLong(var1_1, var15_16));
                            break block88;
                        }
                        case 1: {
                            var2_7 = var3_5;
                            if ((var6_6 & var9_10) == 0) break block87;
                            var2_7 = k.p(var12_13, 0.0f);
                            break block88;
                        }
                        case 0: 
                    }
                    var2_7 = var3_5;
                    if ((var6_6 & var9_10) == 0) break block87;
                    var2_7 = k.h(var12_13, 0.0);
                }
                var2_7 = var3_5 + var2_7;
                ** break;
            }
            var4_4 += 3;
            var3_5 = var2_7;
            var8_3 = var5_8;
        } while (true);
    }

    public final int w0(int n8) {
        return this.a[n8 + 1];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int x(Object var1_1) {
        var12_2 = S.s;
        var4_4 = var3_3 = 0;
        while (var3_3 < this.a.length) {
            block80 : {
                block82 : {
                    block81 : {
                        var5_6 = this.w0(var3_3);
                        var2_5 = S.v0(var5_6);
                        var7_8 = this.W(var3_3);
                        var8_9 = S.X(var5_6);
                        var5_6 = var2_5 >= u.c0.c() && var2_5 <= u.p0.c() ? this.a[var3_3 + 2] & 1048575 : 0;
                        switch (var2_5) {
                            default: {
                                var2_5 = var4_4;
                                ** break;
                            }
                            case 68: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl257
                            }
                            case 67: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                var8_9 = S.c0(var1_1, var8_9);
                                ** GOTO lbl263
                            }
                            case 66: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                var2_5 = S.b0(var1_1, var8_9);
                                ** GOTO lbl269
                            }
                            case 65: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl274
                            }
                            case 64: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl279
                            }
                            case 63: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                var2_5 = S.b0(var1_1, var8_9);
                                ** GOTO lbl285
                            }
                            case 62: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                var2_5 = S.b0(var1_1, var8_9);
                                ** GOTO lbl291
                            }
                            case 61: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl296
                            }
                            case 60: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl301
                            }
                            case 59: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                var10_10 = var11_11 = o0.C(var1_1, var8_9);
                                if (!(var11_11 instanceof h)) ** GOTO lbl-1000
                                var10_10 = var11_11;
                                ** GOTO lbl309
                            }
                            case 58: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl317
                            }
                            case 57: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl322
                            }
                            case 56: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl327
                            }
                            case 55: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                var2_5 = S.b0(var1_1, var8_9);
                                ** GOTO lbl333
                            }
                            case 54: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                var8_9 = S.c0(var1_1, var8_9);
                                ** GOTO lbl339
                            }
                            case 53: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                var8_9 = S.c0(var1_1, var8_9);
                                ** GOTO lbl345
                            }
                            case 52: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl350
                            }
                            case 51: {
                                var2_5 = var4_4;
                                if (!this.I(var1_1, var7_8, var3_3)) break block80;
                                break block81;
                            }
                            case 50: {
                                var2_5 = this.q.b(var7_8, o0.C(var1_1, var8_9), this.t(var3_3));
                                break block82;
                            }
                            case 49: {
                                var2_5 = g0.j(var7_8, S.K(var1_1, var8_9), this.u(var3_3));
                                break block82;
                            }
                            case 48: {
                                var6_7 = g0.t((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 47: {
                                var6_7 = g0.r((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 46: {
                                var6_7 = g0.i((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 45: {
                                var6_7 = g0.g((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 44: {
                                var6_7 = g0.e((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 43: {
                                var6_7 = g0.w((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 42: {
                                var6_7 = g0.b((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 41: {
                                var6_7 = g0.g((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 40: {
                                var6_7 = g0.i((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 39: {
                                var6_7 = g0.l((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 38: {
                                var6_7 = g0.y((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 37: {
                                var6_7 = g0.n((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 36: {
                                var6_7 = g0.g((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
                                ** GOTO lbl212
                            }
                            case 35: {
                                var6_7 = g0.i((List)var12_2.getObject(var1_1, var8_9));
                                var2_5 = var4_4;
                                if (var6_7 <= 0) break block80;
                                var2_5 = var6_7;
                                if (!this.i) ** GOTO lbl213
                                var2_5 = var6_7;
lbl212: // 14 sources:
                                var12_2.putInt(var1_1, (long)var5_6, var2_5);
lbl213: // 15 sources:
                                var2_5 = k.L(var7_8) + k.N(var2_5) + var2_5;
                                break block82;
                            }
                            case 34: {
                                var2_5 = g0.s(var7_8, S.K(var1_1, var8_9), false);
                                break block82;
                            }
                            case 33: {
                                var2_5 = g0.q(var7_8, S.K(var1_1, var8_9), false);
                                break block82;
                            }
                            case 18: 
                            case 23: 
                            case 32: {
                                var2_5 = g0.h(var7_8, S.K(var1_1, var8_9), false);
                                break block82;
                            }
                            case 19: 
                            case 24: 
                            case 31: {
                                var2_5 = g0.f(var7_8, S.K(var1_1, var8_9), false);
                                break block82;
                            }
                            case 30: {
                                var2_5 = g0.d(var7_8, S.K(var1_1, var8_9), false);
                                break block82;
                            }
                            case 29: {
                                var2_5 = g0.v(var7_8, S.K(var1_1, var8_9), false);
                                break block82;
                            }
                            case 28: {
                                var2_5 = g0.c(var7_8, S.K(var1_1, var8_9));
                                break block82;
                            }
                            case 27: {
                                var2_5 = g0.p(var7_8, S.K(var1_1, var8_9), this.u(var3_3));
                                break block82;
                            }
                            case 26: {
                                var2_5 = g0.u(var7_8, S.K(var1_1, var8_9));
                                break block82;
                            }
                            case 25: {
                                var2_5 = g0.a(var7_8, S.K(var1_1, var8_9), false);
                                break block82;
                            }
                            case 22: {
                                var2_5 = g0.k(var7_8, S.K(var1_1, var8_9), false);
                                break block82;
                            }
                            case 21: {
                                var2_5 = g0.x(var7_8, S.K(var1_1, var8_9), false);
                                break block82;
                            }
                            case 20: {
                                var2_5 = g0.m(var7_8, S.K(var1_1, var8_9), false);
                                break block82;
                            }
                            case 17: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
lbl257: // 2 sources:
                                var2_5 = k.r(var7_8, (O)o0.C(var1_1, var8_9), this.u(var3_3));
                                break block82;
                            }
                            case 16: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
                                var8_9 = o0.A(var1_1, var8_9);
lbl263: // 2 sources:
                                var2_5 = k.H(var7_8, var8_9);
                                break block82;
                            }
                            case 15: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
                                var2_5 = o0.z(var1_1, var8_9);
lbl269: // 2 sources:
                                var2_5 = k.F(var7_8, var2_5);
                                break block82;
                            }
                            case 14: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
lbl274: // 2 sources:
                                var2_5 = k.D(var7_8, 0L);
                                break block82;
                            }
                            case 13: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
lbl279: // 2 sources:
                                var2_5 = k.B(var7_8, 0);
                                break block82;
                            }
                            case 12: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
                                var2_5 = o0.z(var1_1, var8_9);
lbl285: // 2 sources:
                                var2_5 = k.j(var7_8, var2_5);
                                break block82;
                            }
                            case 11: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
                                var2_5 = o0.z(var1_1, var8_9);
lbl291: // 2 sources:
                                var2_5 = k.M(var7_8, var2_5);
                                break block82;
                            }
                            case 10: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
lbl296: // 2 sources:
                                var10_10 = o0.C(var1_1, var8_9);
                                ** GOTO lbl309
                            }
                            case 9: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
lbl301: // 2 sources:
                                var2_5 = g0.o(var7_8, o0.C(var1_1, var8_9), this.u(var3_3));
                                break block82;
                            }
                            case 8: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
                                var10_10 = var11_11 = o0.C(var1_1, var8_9);
                                ** if (!(var11_11 instanceof h)) goto lbl-1000
lbl-1000: // 1 sources:
                                {
                                    var10_10 = var11_11;
lbl309: // 3 sources:
                                    var2_5 = k.f((int)var7_8, (h)((h)var10_10));
                                    ** GOTO lbl357
                                }
lbl-1000: // 2 sources:
                                {
                                    var2_5 = k.J(var7_8, (String)var10_10);
                                }
                                break block82;
                            }
                            case 7: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
lbl317: // 2 sources:
                                var2_5 = k.d(var7_8, true);
                                break block82;
                            }
                            case 6: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
lbl322: // 2 sources:
                                var2_5 = k.l(var7_8, 0);
                                break block82;
                            }
                            case 5: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
lbl327: // 2 sources:
                                var2_5 = k.n(var7_8, 0L);
                                break block82;
                            }
                            case 4: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
                                var2_5 = o0.z(var1_1, var8_9);
lbl333: // 2 sources:
                                var2_5 = k.t(var7_8, var2_5);
                                break block82;
                            }
                            case 3: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
                                var8_9 = o0.A(var1_1, var8_9);
lbl339: // 2 sources:
                                var2_5 = k.O(var7_8, var8_9);
                                break block82;
                            }
                            case 2: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
                                var8_9 = o0.A(var1_1, var8_9);
lbl345: // 2 sources:
                                var2_5 = k.v(var7_8, var8_9);
                                break block82;
                            }
                            case 1: {
                                var2_5 = var4_4;
                                if (!this.B(var1_1, var3_3)) break block80;
lbl350: // 2 sources:
                                var2_5 = k.p(var7_8, 0.0f);
                                break block82;
                            }
                            case 0: 
                        }
                        var2_5 = var4_4;
                        if (!this.B(var1_1, var3_3)) break block80;
                    }
                    var2_5 = k.h(var7_8, 0.0);
                }
                var2_5 = var4_4 + var2_5;
                ** break;
            }
            var3_3 += 3;
            var4_4 = var2_5;
        }
        return var4_4 + this.y(this.o, var1_1);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void x0(Object var1_1, r0 var2_2) {
        if (this.f && !(var15_3 = this.p.c(var1_1)).d()) {
            var17_4 = var15_3.f();
            var15_3 = (Map.Entry)var17_4.next();
        } else {
            var17_4 = null;
            var15_3 = null;
        }
        var8_5 = this.a.length;
        var18_6 = S.s;
        var3_7 = 1048575;
        var6_8 = 0;
        var4_9 = 0;
        do {
            block118 : {
                var16_17 = var15_3;
                if (var6_8 >= var8_5) break;
                var9_12 = this.w0(var6_8);
                var10_13 = this.W(var6_8);
                var11_14 = S.v0(var9_12);
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
                    this.p.j(var2_2, (Map.Entry)var15_3);
                    if (var17_4.hasNext()) {
                        var15_3 = (Map.Entry)var17_4.next();
                        continue;
                    }
                    var15_3 = null;
                }
                var13_16 = S.X(var9_12);
                switch (var11_14) {
                    case 68: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.O(var10_13, var18_6.getObject(var1_1, var13_16), this.u(var6_8));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 67: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.w(var10_13, S.c0(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 66: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.H(var10_13, S.b0(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 65: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.n(var10_13, S.c0(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 64: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.g(var10_13, S.b0(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 63: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.D(var10_13, S.b0(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 62: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.e(var10_13, S.b0(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 61: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.M(var10_13, (h)var18_6.getObject(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 60: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.L(var10_13, var18_6.getObject(var1_1, var13_16), this.u(var6_8));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 59: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            this.B0(var10_13, var18_6.getObject(var1_1, var13_16), var2_2);
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 58: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.d(var10_13, S.Y(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 57: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.l(var10_13, S.b0(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 56: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.u(var10_13, S.c0(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 55: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.i(var10_13, S.b0(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 54: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.C(var10_13, S.c0(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 53: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.c(var10_13, S.c0(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 52: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.x(var10_13, S.a0(var1_1, var13_16));
                            ** break;
                        }
                        ** GOTO lbl127
                    }
                    case 51: {
                        if (this.I(var1_1, var10_13, var6_8)) {
                            var2_2.m(var10_13, S.Z(var1_1, var13_16));
                            ** break;
                        }
                    }
lbl127: // 20 sources:
                    default: {
                        ** break;
                    }
                    case 50: {
                        this.A0(var2_2, var10_13, var18_6.getObject(var1_1, var13_16), var6_8);
                        ** break;
                    }
                    case 49: {
                        g0.T(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, this.u(var6_8));
                        ** break;
                    }
                    case 48: {
                        g0.a0(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 47: {
                        g0.Z(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 46: {
                        g0.Y(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 45: {
                        g0.X(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 44: {
                        g0.P(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 43: {
                        g0.c0(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 42: {
                        g0.M(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 41: {
                        g0.Q(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 40: {
                        g0.R(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 39: {
                        g0.U(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 38: {
                        g0.d0(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 37: {
                        g0.V(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 36: {
                        g0.S(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 35: {
                        g0.O(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                        ** break;
                    }
                    case 34: {
                        g0.a0(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 33: {
                        g0.Z(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 32: {
                        g0.Y(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 31: {
                        g0.X(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 30: {
                        g0.P(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 29: {
                        g0.c0(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 28: {
                        g0.N(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2);
                        ** break;
                    }
                    case 27: {
                        g0.W(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, this.u(var6_8));
                        ** break;
                    }
                    case 26: {
                        g0.b0(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2);
                        ** break;
                    }
                    case 25: {
                        g0.M(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 24: {
                        g0.Q(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 23: {
                        g0.R(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 22: {
                        g0.U(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 21: {
                        g0.d0(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 20: {
                        g0.V(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 19: {
                        g0.S(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 18: {
                        g0.O(this.W(var6_8), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                        ** break;
                    }
                    case 17: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.O(var10_13, var18_6.getObject(var1_1, var13_16), this.u(var6_8));
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
                            var2_2.M(var10_13, (h)var18_6.getObject(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 9: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.L(var10_13, var18_6.getObject(var1_1, var13_16), this.u(var6_8));
                            ** break;
                        }
                        break block118;
                    }
                    case 8: {
                        if ((var7_11 & var4_9) != 0) {
                            this.B0(var10_13, var18_6.getObject(var1_1, var13_16), var2_2);
                            ** break;
                        }
                        break block118;
                    }
                    case 7: {
                        if ((var7_11 & var4_9) != 0) {
                            var2_2.d(var10_13, S.l(var1_1, var13_16));
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
                            var2_2.x(var10_13, S.r(var1_1, var13_16));
                            ** break;
                        }
                        break block118;
                    }
                    case 0: 
                }
                if ((var7_11 & var4_9) != 0) {
                    var2_2.m(var10_13, S.o(var1_1, var13_16));
                }
            }
            var6_8 += 3;
        } while (true);
        do {
            if (var16_17 == null) {
                this.C0(this.o, var1_1, var2_2);
                return;
            }
            this.p.j(var2_2, (Map.Entry)var16_17);
            if (var17_4.hasNext()) {
                var16_17 = (Map.Entry)var17_4.next();
                continue;
            }
            var16_17 = null;
        } while (true);
    }

    public final int y(k0 k02, Object object) {
        return k02.h(k02.g(object));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void y0(Object var1_1, r0 var2_2) {
        if (this.f && !(var13_3 = this.p.c(var1_1)).d()) {
            var15_4 = var13_3.f();
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
                    var7_9 = this.w0(var6_6);
                    var9_10 = this.W(var6_6);
                    while (var13_3 != null && this.p.a((Map.Entry)var13_3) <= var9_10) {
                        this.p.j(var2_2, (Map.Entry)var13_3);
                        if (var15_4.hasNext()) {
                            var13_3 = (Map.Entry)var15_4.next();
                            continue;
                        }
                        var13_3 = null;
                    }
                    switch (S.v0(var7_9)) {
                        default: {
                            ** break;
                        }
                        case 68: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            ** GOTO lbl192
                        }
                        case 67: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = S.c0(var1_1, S.X(var7_9));
                            ** GOTO lbl197
                        }
                        case 66: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = S.b0(var1_1, S.X(var7_9));
                            ** GOTO lbl202
                        }
                        case 65: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = S.c0(var1_1, S.X(var7_9));
                            ** GOTO lbl207
                        }
                        case 64: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = S.b0(var1_1, S.X(var7_9));
                            ** GOTO lbl212
                        }
                        case 63: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = S.b0(var1_1, S.X(var7_9));
                            ** GOTO lbl217
                        }
                        case 62: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = S.b0(var1_1, S.X(var7_9));
                            ** GOTO lbl222
                        }
                        case 61: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            ** GOTO lbl226
                        }
                        case 60: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            ** GOTO lbl230
                        }
                        case 59: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            ** GOTO lbl234
                        }
                        case 58: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var12_12 = S.Y(var1_1, S.X(var7_9));
                            ** GOTO lbl239
                        }
                        case 57: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = S.b0(var1_1, S.X(var7_9));
                            ** GOTO lbl244
                        }
                        case 56: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = S.c0(var1_1, S.X(var7_9));
                            ** GOTO lbl249
                        }
                        case 55: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = S.b0(var1_1, S.X(var7_9));
                            ** GOTO lbl254
                        }
                        case 54: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = S.c0(var1_1, S.X(var7_9));
                            ** GOTO lbl259
                        }
                        case 53: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = S.c0(var1_1, S.X(var7_9));
                            ** GOTO lbl264
                        }
                        case 52: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var5_8 = S.a0(var1_1, S.X(var7_9));
                            ** GOTO lbl269
                        }
                        case 51: {
                            if (!this.I(var1_1, var9_10, var6_6)) break block100;
                            var3_7 = S.Z(var1_1, S.X(var7_9));
                            break block101;
                        }
                        case 50: {
                            this.A0(var2_2, var9_10, o0.C(var1_1, S.X(var7_9)), var6_6);
                            ** break;
                        }
                        case 49: {
                            g0.T(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, this.u(var6_6));
                            ** break;
                        }
                        case 48: {
                            g0.a0(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 47: {
                            g0.Z(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 46: {
                            g0.Y(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 45: {
                            g0.X(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 44: {
                            g0.P(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 43: {
                            g0.c0(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 42: {
                            g0.M(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 41: {
                            g0.Q(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 40: {
                            g0.R(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 39: {
                            g0.U(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 38: {
                            g0.d0(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 37: {
                            g0.V(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 36: {
                            g0.S(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 35: {
                            g0.O(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 34: {
                            g0.a0(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 33: {
                            g0.Z(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 32: {
                            g0.Y(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 31: {
                            g0.X(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 30: {
                            g0.P(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 29: {
                            g0.c0(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 28: {
                            g0.N(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2);
                            ** break;
                        }
                        case 27: {
                            g0.W(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, this.u(var6_6));
                            ** break;
                        }
                        case 26: {
                            g0.b0(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2);
                            ** break;
                        }
                        case 25: {
                            g0.M(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 24: {
                            g0.Q(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 23: {
                            g0.R(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 22: {
                            g0.U(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 21: {
                            g0.d0(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 20: {
                            g0.V(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 19: {
                            g0.S(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 18: {
                            g0.O(this.W(var6_6), (List)o0.C(var1_1, S.X(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 17: {
                            if (!this.B(var1_1, var6_6)) break block100;
lbl192: // 2 sources:
                            var2_2.O(var9_10, o0.C(var1_1, S.X(var7_9)), this.u(var6_6));
                            break block100;
                        }
                        case 16: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var10_11 = S.L(var1_1, S.X(var7_9));
lbl197: // 2 sources:
                            var2_2.w(var9_10, var10_11);
                            break block100;
                        }
                        case 15: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var7_9 = S.z(var1_1, S.X(var7_9));
lbl202: // 2 sources:
                            var2_2.H(var9_10, var7_9);
                            break block100;
                        }
                        case 14: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var10_11 = S.L(var1_1, S.X(var7_9));
lbl207: // 2 sources:
                            var2_2.n(var9_10, var10_11);
                            break block100;
                        }
                        case 13: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var7_9 = S.z(var1_1, S.X(var7_9));
lbl212: // 2 sources:
                            var2_2.g(var9_10, var7_9);
                            break block100;
                        }
                        case 12: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var7_9 = S.z(var1_1, S.X(var7_9));
lbl217: // 2 sources:
                            var2_2.D(var9_10, var7_9);
                            break block100;
                        }
                        case 11: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var7_9 = S.z(var1_1, S.X(var7_9));
lbl222: // 2 sources:
                            var2_2.e(var9_10, var7_9);
                            break block100;
                        }
                        case 10: {
                            if (!this.B(var1_1, var6_6)) break block100;
lbl226: // 2 sources:
                            var2_2.M(var9_10, (h)o0.C(var1_1, S.X(var7_9)));
                            break block100;
                        }
                        case 9: {
                            if (!this.B(var1_1, var6_6)) break block100;
lbl230: // 2 sources:
                            var2_2.L(var9_10, o0.C(var1_1, S.X(var7_9)), this.u(var6_6));
                            break block100;
                        }
                        case 8: {
                            if (!this.B(var1_1, var6_6)) break block100;
lbl234: // 2 sources:
                            this.B0(var9_10, o0.C(var1_1, S.X(var7_9)), var2_2);
                            break block100;
                        }
                        case 7: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var12_12 = S.l(var1_1, S.X(var7_9));
lbl239: // 2 sources:
                            var2_2.d(var9_10, var12_12);
                            break block100;
                        }
                        case 6: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var7_9 = S.z(var1_1, S.X(var7_9));
lbl244: // 2 sources:
                            var2_2.l(var9_10, var7_9);
                            break block100;
                        }
                        case 5: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var10_11 = S.L(var1_1, S.X(var7_9));
lbl249: // 2 sources:
                            var2_2.u(var9_10, var10_11);
                            break block100;
                        }
                        case 4: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var7_9 = S.z(var1_1, S.X(var7_9));
lbl254: // 2 sources:
                            var2_2.i(var9_10, var7_9);
                            break block100;
                        }
                        case 3: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var10_11 = S.L(var1_1, S.X(var7_9));
lbl259: // 2 sources:
                            var2_2.C(var9_10, var10_11);
                            break block100;
                        }
                        case 2: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var10_11 = S.L(var1_1, S.X(var7_9));
lbl264: // 2 sources:
                            var2_2.c(var9_10, var10_11);
                            break block100;
                        }
                        case 1: {
                            if (!this.B(var1_1, var6_6)) break block100;
                            var5_8 = S.r(var1_1, S.X(var7_9));
lbl269: // 2 sources:
                            var2_2.x(var9_10, var5_8);
                            break block100;
                        }
                        case 0: 
                    }
                    if (!this.B(var1_1, var6_6)) break block100;
                    var3_7 = S.o(var1_1, S.X(var7_9));
                }
                var2_2.m(var9_10, var3_7);
                ** break;
            }
            var6_6 += 3;
        } while (true);
        do {
            if (var14_13 == null) {
                this.C0(this.o, var1_1, var2_2);
                return;
            }
            this.p.j(var2_2, (Map.Entry)var14_13);
            if (var15_4.hasNext()) {
                var14_13 = (Map.Entry)var15_4.next();
                continue;
            }
            var14_13 = null;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void z0(Object var1_1, r0 var2_2) {
        this.C0(this.o, var1_1, var2_2);
        if (this.f && !(var12_3 = this.p.c(var1_1)).d()) {
            var14_4 = var12_3.a();
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
                            this.p.j(var2_2, (Map.Entry)var13_12);
                            if (var14_4.hasNext() == false) return;
                            var13_12 = (Map.Entry)var14_4.next();
                        }
                        return;
                    }
                    var7_8 = this.w0(var6_5);
                    var8_9 = this.W(var6_5);
                    while (var12_3 != null && this.p.a((Map.Entry)var12_3) > var8_9) {
                        this.p.j(var2_2, (Map.Entry)var12_3);
                        if (var14_4.hasNext()) {
                            var12_3 = (Map.Entry)var14_4.next();
                            continue;
                        }
                        var12_3 = null;
                    }
                    switch (S.v0(var7_8)) {
                        default: {
                            ** break;
                        }
                        case 68: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            ** GOTO lbl198
                        }
                        case 67: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = S.c0(var1_1, S.X(var7_8));
                            ** GOTO lbl203
                        }
                        case 66: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = S.b0(var1_1, S.X(var7_8));
                            ** GOTO lbl208
                        }
                        case 65: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = S.c0(var1_1, S.X(var7_8));
                            ** GOTO lbl213
                        }
                        case 64: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = S.b0(var1_1, S.X(var7_8));
                            ** GOTO lbl218
                        }
                        case 63: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = S.b0(var1_1, S.X(var7_8));
                            ** GOTO lbl223
                        }
                        case 62: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = S.b0(var1_1, S.X(var7_8));
                            ** GOTO lbl228
                        }
                        case 61: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            ** GOTO lbl232
                        }
                        case 60: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            ** GOTO lbl236
                        }
                        case 59: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            ** GOTO lbl240
                        }
                        case 58: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var11_11 = S.Y(var1_1, S.X(var7_8));
                            ** GOTO lbl245
                        }
                        case 57: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = S.b0(var1_1, S.X(var7_8));
                            ** GOTO lbl250
                        }
                        case 56: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = S.c0(var1_1, S.X(var7_8));
                            ** GOTO lbl255
                        }
                        case 55: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = S.b0(var1_1, S.X(var7_8));
                            ** GOTO lbl260
                        }
                        case 54: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = S.c0(var1_1, S.X(var7_8));
                            ** GOTO lbl265
                        }
                        case 53: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = S.c0(var1_1, S.X(var7_8));
                            ** GOTO lbl270
                        }
                        case 52: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var5_7 = S.a0(var1_1, S.X(var7_8));
                            ** GOTO lbl275
                        }
                        case 51: {
                            if (!this.I(var1_1, var8_9, var6_5)) break block99;
                            var3_6 = S.Z(var1_1, S.X(var7_8));
                            break block100;
                        }
                        case 50: {
                            this.A0(var2_2, var8_9, o0.C(var1_1, S.X(var7_8)), var6_5);
                            ** break;
                        }
                        case 49: {
                            g0.T(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, this.u(var6_5));
                            ** break;
                        }
                        case 48: {
                            g0.a0(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 47: {
                            g0.Z(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 46: {
                            g0.Y(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 45: {
                            g0.X(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 44: {
                            g0.P(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 43: {
                            g0.c0(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 42: {
                            g0.M(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 41: {
                            g0.Q(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 40: {
                            g0.R(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 39: {
                            g0.U(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 38: {
                            g0.d0(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 37: {
                            g0.V(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 36: {
                            g0.S(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 35: {
                            g0.O(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 34: {
                            g0.a0(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 33: {
                            g0.Z(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 32: {
                            g0.Y(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 31: {
                            g0.X(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 30: {
                            g0.P(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 29: {
                            g0.c0(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 28: {
                            g0.N(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2);
                            ** break;
                        }
                        case 27: {
                            g0.W(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, this.u(var6_5));
                            ** break;
                        }
                        case 26: {
                            g0.b0(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2);
                            ** break;
                        }
                        case 25: {
                            g0.M(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 24: {
                            g0.Q(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 23: {
                            g0.R(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 22: {
                            g0.U(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 21: {
                            g0.d0(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 20: {
                            g0.V(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 19: {
                            g0.S(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 18: {
                            g0.O(this.W(var6_5), (List)o0.C(var1_1, S.X(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 17: {
                            if (!this.B(var1_1, var6_5)) break block99;
lbl198: // 2 sources:
                            var2_2.O(var8_9, o0.C(var1_1, S.X(var7_8)), this.u(var6_5));
                            break block99;
                        }
                        case 16: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var9_10 = S.L(var1_1, S.X(var7_8));
lbl203: // 2 sources:
                            var2_2.w(var8_9, var9_10);
                            break block99;
                        }
                        case 15: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var7_8 = S.z(var1_1, S.X(var7_8));
lbl208: // 2 sources:
                            var2_2.H(var8_9, var7_8);
                            break block99;
                        }
                        case 14: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var9_10 = S.L(var1_1, S.X(var7_8));
lbl213: // 2 sources:
                            var2_2.n(var8_9, var9_10);
                            break block99;
                        }
                        case 13: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var7_8 = S.z(var1_1, S.X(var7_8));
lbl218: // 2 sources:
                            var2_2.g(var8_9, var7_8);
                            break block99;
                        }
                        case 12: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var7_8 = S.z(var1_1, S.X(var7_8));
lbl223: // 2 sources:
                            var2_2.D(var8_9, var7_8);
                            break block99;
                        }
                        case 11: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var7_8 = S.z(var1_1, S.X(var7_8));
lbl228: // 2 sources:
                            var2_2.e(var8_9, var7_8);
                            break block99;
                        }
                        case 10: {
                            if (!this.B(var1_1, var6_5)) break block99;
lbl232: // 2 sources:
                            var2_2.M(var8_9, (h)o0.C(var1_1, S.X(var7_8)));
                            break block99;
                        }
                        case 9: {
                            if (!this.B(var1_1, var6_5)) break block99;
lbl236: // 2 sources:
                            var2_2.L(var8_9, o0.C(var1_1, S.X(var7_8)), this.u(var6_5));
                            break block99;
                        }
                        case 8: {
                            if (!this.B(var1_1, var6_5)) break block99;
lbl240: // 2 sources:
                            this.B0(var8_9, o0.C(var1_1, S.X(var7_8)), var2_2);
                            break block99;
                        }
                        case 7: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var11_11 = S.l(var1_1, S.X(var7_8));
lbl245: // 2 sources:
                            var2_2.d(var8_9, var11_11);
                            break block99;
                        }
                        case 6: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var7_8 = S.z(var1_1, S.X(var7_8));
lbl250: // 2 sources:
                            var2_2.l(var8_9, var7_8);
                            break block99;
                        }
                        case 5: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var9_10 = S.L(var1_1, S.X(var7_8));
lbl255: // 2 sources:
                            var2_2.u(var8_9, var9_10);
                            break block99;
                        }
                        case 4: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var7_8 = S.z(var1_1, S.X(var7_8));
lbl260: // 2 sources:
                            var2_2.i(var8_9, var7_8);
                            break block99;
                        }
                        case 3: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var9_10 = S.L(var1_1, S.X(var7_8));
lbl265: // 2 sources:
                            var2_2.C(var8_9, var9_10);
                            break block99;
                        }
                        case 2: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var9_10 = S.L(var1_1, S.X(var7_8));
lbl270: // 2 sources:
                            var2_2.c(var8_9, var9_10);
                            break block99;
                        }
                        case 1: {
                            if (!this.B(var1_1, var6_5)) break block99;
                            var5_7 = S.r(var1_1, S.X(var7_8));
lbl275: // 2 sources:
                            var2_2.x(var8_9, var5_7);
                            break block99;
                        }
                        case 0: 
                    }
                    if (!this.B(var1_1, var6_5)) break block99;
                    var3_6 = S.o(var1_1, S.X(var7_8));
                }
                var2_2.m(var8_9, var3_6);
                ** break;
            }
            var6_5 -= 3;
        } while (true);
    }
}

