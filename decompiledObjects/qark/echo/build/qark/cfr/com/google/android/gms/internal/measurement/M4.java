/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.NoSuchFieldException
 *  java.lang.NoSuchMethodError
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.nio.charset.Charset
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  sun.misc.Unsafe
 */
package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import com.google.android.gms.internal.measurement.A4;
import com.google.android.gms.internal.measurement.D4;
import com.google.android.gms.internal.measurement.D5;
import com.google.android.gms.internal.measurement.E5;
import com.google.android.gms.internal.measurement.F4;
import com.google.android.gms.internal.measurement.G3;
import com.google.android.gms.internal.measurement.G4;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.J3;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.O3;
import com.google.android.gms.internal.measurement.P4;
import com.google.android.gms.internal.measurement.S3;
import com.google.android.gms.internal.measurement.T3;
import com.google.android.gms.internal.measurement.T5;
import com.google.android.gms.internal.measurement.U3;
import com.google.android.gms.internal.measurement.U4;
import com.google.android.gms.internal.measurement.V4;
import com.google.android.gms.internal.measurement.W4;
import com.google.android.gms.internal.measurement.W5;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Z4;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.c4;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.internal.measurement.v5;
import com.google.android.gms.internal.measurement.w4;
import com.google.android.gms.internal.measurement.x5;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sun.misc.Unsafe;

public final class M4
implements Z4 {
    public static final int[] r = new int[0];
    public static final Unsafe s = D5.p();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final I4 e;
    public final boolean f;
    public final boolean g;
    public final V4 h;
    public final boolean i;
    public final int[] j;
    public final int k;
    public final int l;
    public final P4 m;
    public final q4 n;
    public final x5 o;
    public final O3 p;
    public final F4 q;

    public M4(int[] arrn, Object[] arrobject, int n8, int n9, I4 i42, V4 v42, boolean bl, int[] arrn2, int n10, int n11, P4 p42, q4 q42, x5 x52, O3 o32, F4 f42) {
        this.a = arrn;
        this.b = arrobject;
        this.c = n8;
        this.d = n9;
        this.g = i42 instanceof Y3;
        this.h = v42;
        bl = o32 != null && o32.d(i42);
        this.f = bl;
        this.i = false;
        this.j = arrn2;
        this.k = n10;
        this.l = n11;
        this.m = p42;
        this.n = q42;
        this.o = x52;
        this.p = o32;
        this.e = i42;
        this.q = f42;
    }

    public static boolean A(Object object, int n8, Z4 z42) {
        return z42.c(D5.B(object, n8 & 1048575));
    }

    public static float B(Object object, long l8) {
        return ((Float)D5.B(object, l8)).floatValue();
    }

    public static int H(Object object, long l8) {
        return (Integer)D5.B(object, l8);
    }

    public static long L(Object object, long l8) {
        return (Long)D5.B(object, l8);
    }

    public static v5 O(Object object) {
        Y3 y32 = (Y3)object;
        v5 v52 = y32.zzb;
        object = v52;
        if (v52 == v5.k()) {
            y32.zzb = object = v5.l();
        }
        return object;
    }

    public static boolean P(Object object, long l8) {
        return (Boolean)D5.B(object, l8);
    }

    public static void R(Object object) {
        if (M4.T(object)) {
            return;
        }
        object = String.valueOf((Object)object);
        StringBuilder stringBuilder = new StringBuilder("Mutating immutable message: ");
        stringBuilder.append((String)object);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static boolean S(int n8) {
        if ((n8 & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public static boolean T(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof Y3) {
            return ((Y3)object).F();
        }
        return true;
    }

    public static double j(Object object, long l8) {
        return (Double)D5.B(object, l8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static M4 n(Class arrn, G4 object, P4 p42, q4 q42, x5 x52, O3 o32, F4 f42) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        if (!(object instanceof W4)) {
            a.a(object);
            throw new NoSuchMethodError();
        }
        W4 w42 = (W4)object;
        object = w42.d();
        int n18 = object.length();
        if (object.charAt(0) >= '\ud800') {
            n13 = 1;
            do {
                n16 = n15 = n13 + 1;
                if (object.charAt(n13) >= '\ud800') {
                    n13 = n15;
                    continue;
                }
                break;
            } while (true);
        } else {
            n16 = 1;
        }
        n13 = n16 + 1;
        int n19 = object.charAt(n16);
        n16 = n13;
        n15 = n19;
        if (n19 >= 55296) {
            n15 = n19 & 8191;
            n16 = 13;
            n19 = n13;
            do {
                n13 = n19 + 1;
                if ((n19 = (int)object.charAt(n19)) < 55296) break;
                n15 |= (n19 & 8191) << n16;
                n16 += 13;
                n19 = n13;
            } while (true);
            n15 |= n19 << n16;
            n16 = n13;
        }
        if (n15 == 0) {
            arrn = r;
            n15 = n19 = (n8 = (n12 = (n14 = (n13 = (n11 = 0)))));
        } else {
            n13 = n16 + 1;
            n16 = n19 = (int)object.charAt(n16);
            n15 = n13;
            if (n19 >= 55296) {
                n15 = n19 & 8191;
                n16 = 13;
                n19 = n13;
                do {
                    n13 = n19 + 1;
                    if ((n19 = (int)object.charAt(n19)) < 55296) break;
                    n15 |= (n19 & 8191) << n16;
                    n16 += 13;
                    n19 = n13;
                } while (true);
                n16 = n15 | n19 << n16;
                n15 = n13;
            }
            n13 = n15 + 1;
            n12 = n15 = (int)object.charAt(n15);
            n19 = n13;
            if (n15 >= 55296) {
                n19 = n15 & 8191;
                n15 = 13;
                n11 = n13;
                do {
                    n13 = n11 + 1;
                    if ((n11 = (int)object.charAt(n11)) < 55296) break;
                    n19 |= (n11 & 8191) << n15;
                    n15 += 13;
                    n11 = n13;
                } while (true);
                n12 = n19 | n11 << n15;
                n19 = n13;
            }
            n15 = n19 + 1;
            n13 = n19 = (int)object.charAt(n19);
            n11 = n15;
            if (n19 >= 55296) {
                n19 &= 8191;
                n13 = 13;
                n11 = n15;
                do {
                    n15 = n11 + 1;
                    if ((n11 = (int)object.charAt(n11)) < 55296) break;
                    n19 |= (n11 & 8191) << n13;
                    n13 += 13;
                    n11 = n15;
                } while (true);
                n13 = n19 | n11 << n13;
                n11 = n15;
            }
            n19 = n11 + 1;
            n15 = n9 = (int)object.charAt(n11);
            n11 = n19;
            if (n9 >= 55296) {
                n11 = n9 & 8191;
                n15 = 13;
                n9 = n19;
                do {
                    n19 = n9 + 1;
                    if ((n9 = (int)object.charAt(n9)) < 55296) break;
                    n11 |= (n9 & 8191) << n15;
                    n15 += 13;
                    n9 = n19;
                } while (true);
                n15 = n11 | n9 << n15;
                n11 = n19;
            }
            n19 = n11 + 1;
            n11 = n14 = (int)object.charAt(n11);
            n9 = n19;
            if (n14 >= 55296) {
                n9 = n14 & 8191;
                n11 = 13;
                n14 = n19;
                do {
                    n19 = n14 + 1;
                    if ((n14 = (int)object.charAt(n14)) < 55296) break;
                    n9 |= (n14 & 8191) << n11;
                    n11 += 13;
                    n14 = n19;
                } while (true);
                n11 = n9 | n14 << n11;
                n9 = n19;
            }
            n19 = n9 + 1;
            n9 = n8 = (int)object.charAt(n9);
            n14 = n19;
            if (n8 >= 55296) {
                n14 = n8 & 8191;
                n9 = 13;
                n8 = n19;
                do {
                    n19 = n8 + 1;
                    if ((n8 = (int)object.charAt(n8)) < 55296) break;
                    n14 |= (n8 & 8191) << n9;
                    n9 += 13;
                    n8 = n19;
                } while (true);
                n9 = n14 | n8 << n9;
                n14 = n19;
            }
            n19 = n14 + 1;
            n8 = n17 = (int)object.charAt(n14);
            n14 = n19;
            if (n17 >= 55296) {
                n8 = n17 & 8191;
                n14 = 13;
                n17 = n19;
                do {
                    n19 = n17 + 1;
                    if ((n17 = (int)object.charAt(n17)) < 55296) break;
                    n8 |= (n17 & 8191) << n14;
                    n14 += 13;
                    n17 = n19;
                } while (true);
                n8 |= n17 << n14;
                n14 = n19;
            }
            n17 = n14 + 1;
            n14 = n10 = (int)object.charAt(n14);
            n19 = n17;
            if (n10 >= 55296) {
                n14 = n10 & 8191;
                n19 = 13;
                n10 = n17;
                n17 = n14;
                do {
                    n14 = n10 + 1;
                    if ((n10 = (int)object.charAt(n10)) < 55296) break;
                    n17 |= (n10 & 8191) << n19;
                    n19 += 13;
                    n10 = n14;
                } while (true);
                n19 = n14;
                n14 = n17 |= n10 << n19;
            }
            arrn = new int[n14 + n9 + n8];
            n8 = (n16 << 1) + n12;
            n17 = n19;
            n19 = n14;
            n12 = n15;
            n14 = n13;
            n13 = n9;
            n15 = n16;
            n16 = n17;
        }
        Unsafe unsafe = s;
        Object[] arrobject = w42.e();
        Class class_ = w42.a().getClass();
        int[] arrn2 = new int[n11 * 3];
        Object[] arrobject2 = new Object[n11 << 1];
        int n20 = n19 + n13;
        n13 = n19;
        n11 = n20;
        n10 = 0;
        int n21 = 0;
        n9 = n8;
        n17 = n12;
        n8 = n14;
        n14 = n10;
        n10 = n15;
        do {
            int n22;
            int n23;
            int n24;
            int n25;
            int n26;
            block55 : {
                int n27;
                Object object2;
                block59 : {
                    block56 : {
                        block61 : {
                            block57 : {
                                block60 : {
                                    block58 : {
                                        block51 : {
                                            block53 : {
                                                block54 : {
                                                    block52 : {
                                                        n24 = n14;
                                                        if (n16 >= n18) {
                                                            return new M4(arrn2, arrobject2, n8, n17, w42.a(), w42.b(), false, arrn, n19, n20, p42, q42, x52, o32, f42);
                                                        }
                                                        n15 = n16 + 1;
                                                        n26 = object.charAt(n16);
                                                        if (n26 >= 55296) {
                                                            n14 = n26 & 8191;
                                                            n16 = 13;
                                                            n12 = n15;
                                                            do {
                                                                n15 = n12 + 1;
                                                                if ((n12 = (int)object.charAt(n12)) < 55296) break;
                                                                n14 |= (n12 & 8191) << n16;
                                                                n16 += 13;
                                                                n12 = n15;
                                                            } while (true);
                                                            n26 = n14 | n12 << n16;
                                                            n16 = n15;
                                                        } else {
                                                            n16 = n15;
                                                        }
                                                        n12 = n16 + 1;
                                                        n23 = object.charAt(n16);
                                                        if (n23 >= 55296) {
                                                            n14 = n23 & 8191;
                                                            n16 = 13;
                                                            do {
                                                                n15 = n12 + 1;
                                                                if ((n12 = (int)object.charAt(n12)) < 55296) break;
                                                                n14 |= (n12 & 8191) << n16;
                                                                n16 += 13;
                                                                n12 = n15;
                                                            } while (true);
                                                            n23 = n14 | n12 << n16;
                                                            n14 = n15;
                                                        } else {
                                                            n14 = n12;
                                                        }
                                                        n25 = n23 & 255;
                                                        n22 = n21;
                                                        if ((n23 & 1024) != 0) {
                                                            arrn[n21] = n24;
                                                            n22 = n21 + 1;
                                                        }
                                                        if (n25 < 51) break block51;
                                                        n15 = n14 + 1;
                                                        n12 = object.charAt(n14);
                                                        n16 = n15;
                                                        n14 = n12;
                                                        if (n12 >= 55296) {
                                                            n14 = n12 & 8191;
                                                            n16 = 13;
                                                            n12 = n15;
                                                            do {
                                                                n15 = n12 + 1;
                                                                if ((n12 = (int)object.charAt(n12)) < 55296) break;
                                                                n14 |= (n12 & 8191) << n16;
                                                                n16 += 13;
                                                                n12 = n15;
                                                            } while (true);
                                                            n14 |= n12 << n16;
                                                            n16 = n15;
                                                        }
                                                        if ((n15 = n25 - 51) == 9 || n15 == 17) break block52;
                                                        if (n15 != 12 || !w42.b().equals((Object)V4.o) && (n23 & 2048) == 0) break block53;
                                                        n12 = n24 / 3;
                                                        n15 = n9 + 1;
                                                        arrobject2[(n12 << 1) + 1] = arrobject[n9];
                                                        break block54;
                                                    }
                                                    n12 = n24 / 3;
                                                    n15 = n9 + 1;
                                                    arrobject2[(n12 << 1) + 1] = arrobject[n9];
                                                }
                                                n9 = n15;
                                            }
                                            if ((object2 = arrobject[n15 = n14 << 1]) instanceof Field) {
                                                object2 = (Field)object2;
                                            } else {
                                                arrobject[n15] = object2 = M4.s(class_, (String)object2);
                                            }
                                            n21 = (int)unsafe.objectFieldOffset((Field)object2);
                                            object2 = arrobject[++n15];
                                            if (object2 instanceof Field) {
                                                object2 = (Field)object2;
                                            } else {
                                                arrobject[n15] = object2 = M4.s(class_, (String)object2);
                                            }
                                            n14 = (int)unsafe.objectFieldOffset((Field)object2);
                                            n27 = n9;
                                            n9 = 0;
                                            n15 = n16;
                                            n12 = n13;
                                            n16 = n27;
                                            break block55;
                                        }
                                        n12 = n9 + 1;
                                        object2 = M4.s(class_, (String)arrobject[n9]);
                                        if (n25 == 9 || n25 == 17) break block56;
                                        if (n25 == 27 || n25 == 49) break block57;
                                        if (n25 == 12 || n25 == 30 || n25 == 44) break block58;
                                        n16 = n12;
                                        n15 = n13;
                                        if (n25 == 50) {
                                            n16 = n13 + 1;
                                            arrn[n13] = n24;
                                            n15 = n24 / 3 << 1;
                                            n13 = n9 + 2;
                                            arrobject2[n15] = arrobject[n12];
                                            if ((n23 & 2048) != 0) {
                                                arrobject2[n15 + 1] = arrobject[n13];
                                                n15 = n16;
                                                n16 = n9 += 3;
                                            } else {
                                                n15 = n16;
                                                n16 = n13;
                                            }
                                        }
                                        break block59;
                                    }
                                    if (w42.b() == V4.o) break block60;
                                    n16 = n12;
                                    n15 = n13;
                                    if ((n23 & 2048) == 0) break block59;
                                }
                                n15 = n24 / 3;
                                n16 = n9 + 2;
                                arrobject2[(n15 << 1) + 1] = arrobject[n12];
                                break block61;
                            }
                            n15 = n24 / 3;
                            n16 = n9 + 2;
                            arrobject2[(n15 << 1) + 1] = arrobject[n12];
                        }
                        n15 = n13;
                        break block59;
                    }
                    arrobject2[(n24 / 3 << 1) + 1] = object2.getType();
                    n15 = n13;
                    n16 = n12;
                }
                n21 = (int)unsafe.objectFieldOffset((Field)object2);
                if ((n23 & 4096) != 0 && n25 <= 17) {
                    n13 = n14 + 1;
                    n14 = n12 = (int)object.charAt(n14);
                    n9 = n13;
                    if (n12 >= 55296) {
                        n14 = n12 & 8191;
                        n9 = 13;
                        n12 = n13;
                        do {
                            n13 = n12 + 1;
                            if ((n12 = (int)object.charAt(n12)) < 55296) break;
                            n14 |= (n12 & 8191) << n9;
                            n9 += 13;
                            n12 = n13;
                        } while (true);
                        n14 |= n12 << n9;
                        n9 = n13;
                    }
                    if ((object2 = arrobject[n13 = (n10 << 1) + n14 / 32]) instanceof Field) {
                        object2 = (Field)object2;
                    } else {
                        arrobject[n13] = object2 = M4.s(class_, (String)object2);
                    }
                    n13 = (int)unsafe.objectFieldOffset((Field)object2);
                    n14 %= 32;
                } else {
                    n13 = 1048575;
                    n9 = n14;
                    n14 = 0;
                }
                n12 = n11;
                if (n25 >= 18) {
                    n12 = n11;
                    if (n25 <= 49) {
                        arrn[n11] = n21;
                        n12 = n11 + 1;
                    }
                }
                n27 = n14;
                n11 = n12;
                n12 = n15;
                n15 = n9;
                n14 = n13;
                n9 = n27;
            }
            arrn2[n24] = n26;
            n13 = (n23 & 512) != 0 ? 536870912 : 0;
            n26 = (n23 & 256) != 0 ? 268435456 : 0;
            n23 = (n23 & 2048) != 0 ? Integer.MIN_VALUE : 0;
            arrn2[n24 + 1] = n25 << 20 | (n26 | n13 | n23) | n21;
            n13 = n24 + 3;
            arrn2[n24 + 2] = n9 << 20 | n14;
            n9 = n16;
            n16 = n15;
            n14 = n13;
            n21 = n22;
            n13 = n12;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Field s(Class object, String string2) {
        try {
            return object.getDeclaredField(string2);
        }
        catch (NoSuchFieldException noSuchFieldException) {}
        Object object2 = object.getDeclaredFields();
        int n8 = object2.length;
        int n9 = 0;
        do {
            Field field;
            if (n9 >= n8) {
                object = object.getName();
                object2 = Arrays.toString((Object[])object2);
                field = new StringBuilder("Field ");
                field.append(string2);
                field.append(" for ");
                field.append((String)object);
                field.append(" not found. Known fields are ");
                field.append((String)object2);
                throw new RuntimeException(field.toString());
            }
            field = object2[n9];
            if (string2.equals((Object)field.getName())) {
                return field;
            }
            ++n9;
        } while (true);
    }

    public static void t(int n8, Object object, T5 t52) {
        if (object instanceof String) {
            t52.E(n8, (String)object);
            return;
        }
        t52.f(n8, (q3)object);
    }

    public static void u(x5 x52, Object object, T5 t52) {
        x52.g(x52.k(object), t52);
    }

    public final int C(int n8) {
        return this.a[n8 + 2];
    }

    public final void D(Object object, int n8) {
        long l8 = 1048575 & (n8 = this.C(n8));
        if (l8 == 1048575L) {
            return;
        }
        D5.h(object, l8, 1 << (n8 >>> 20) | D5.t(object, l8));
    }

    public final void E(Object object, int n8, int n9) {
        D5.h(object, this.C(n9) & 1048575, n8);
    }

    public final void F(Object object, Object object2, int n8) {
        int n9 = this.a[n8];
        if (!this.J(object2, n9, n8)) {
            return;
        }
        Unsafe unsafe = s;
        long l8 = this.G(n8) & 1048575;
        Object object3 = unsafe.getObject(object2, l8);
        if (object3 != null) {
            Object object4;
            Z4 z42 = this.N(n8);
            if (!this.J(object, n9, n8)) {
                if (!M4.T(object3)) {
                    unsafe.putObject(object, l8, object3);
                } else {
                    object2 = z42.a();
                    z42.d(object2, object3);
                    unsafe.putObject(object, l8, object2);
                }
                this.E(object, n9, n8);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l8);
            if (!M4.T(object4)) {
                object2 = z42.a();
                z42.d(object2, object4);
                unsafe.putObject(object, l8, object2);
            }
            z42.d(object2, object3);
            return;
        }
        n8 = this.a[n8];
        object = String.valueOf((Object)object2);
        object2 = new StringBuilder("Source subfield ");
        object2.append(n8);
        object2.append(" is present but null: ");
        object2.append((String)object);
        throw new IllegalStateException(object2.toString());
    }

    public final int G(int n8) {
        return this.a[n8 + 1];
    }

    public final boolean I(Object object, int n8) {
        int n9 = this.C(n8);
        long l8 = n9 & 1048575;
        if (l8 == 1048575L) {
            n8 = this.G(n8);
            l8 = n8 & 1048575;
            switch ((n8 & 267386880) >>> 20) {
                default: {
                    throw new IllegalArgumentException();
                }
                case 17: {
                    if (D5.B(object, l8) != null) {
                        return true;
                    }
                    return false;
                }
                case 16: {
                    if (D5.x(object, l8) != 0L) {
                        return true;
                    }
                    return false;
                }
                case 15: {
                    if (D5.t(object, l8) != 0) {
                        return true;
                    }
                    return false;
                }
                case 14: {
                    if (D5.x(object, l8) != 0L) {
                        return true;
                    }
                    return false;
                }
                case 13: {
                    if (D5.t(object, l8) != 0) {
                        return true;
                    }
                    return false;
                }
                case 12: {
                    if (D5.t(object, l8) != 0) {
                        return true;
                    }
                    return false;
                }
                case 11: {
                    if (D5.t(object, l8) != 0) {
                        return true;
                    }
                    return false;
                }
                case 10: {
                    if (!q3.p.equals(D5.B(object, l8))) {
                        return true;
                    }
                    return false;
                }
                case 9: {
                    if (D5.B(object, l8) != null) {
                        return true;
                    }
                    return false;
                }
                case 8: {
                    object = D5.B(object, l8);
                    if (object instanceof String) {
                        if (!((String)object).isEmpty()) {
                            return true;
                        }
                        return false;
                    }
                    if (object instanceof q3) {
                        if (!q3.p.equals(object)) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException();
                }
                case 7: {
                    return D5.F(object, l8);
                }
                case 6: {
                    if (D5.t(object, l8) != 0) {
                        return true;
                    }
                    return false;
                }
                case 5: {
                    if (D5.x(object, l8) != 0L) {
                        return true;
                    }
                    return false;
                }
                case 4: {
                    if (D5.t(object, l8) != 0) {
                        return true;
                    }
                    return false;
                }
                case 3: {
                    if (D5.x(object, l8) != 0L) {
                        return true;
                    }
                    return false;
                }
                case 2: {
                    if (D5.x(object, l8) != 0L) {
                        return true;
                    }
                    return false;
                }
                case 1: {
                    if (Float.floatToRawIntBits((float)D5.n(object, l8)) != 0) {
                        return true;
                    }
                    return false;
                }
                case 0: 
            }
            if (Double.doubleToRawLongBits((double)D5.a(object, l8)) != 0L) {
                return true;
            }
            return false;
        }
        if ((D5.t(object, l8) & 1 << (n9 >>> 20)) != 0) {
            return true;
        }
        return false;
    }

    public final boolean J(Object object, int n8, int n9) {
        if (D5.t(object, this.C(n9) & 1048575) == n8) {
            return true;
        }
        return false;
    }

    public final boolean K(Object object, Object object2, int n8) {
        if (this.I(object, n8) == this.I(object2, n8)) {
            return true;
        }
        return false;
    }

    public final g4 M(int n8) {
        return (g4)this.b[(n8 / 3 << 1) + 1];
    }

    public final Z4 N(int n8) {
        Z4 z42 = (Z4)this.b[n8 = n8 / 3 << 1];
        if (z42 != null) {
            return z42;
        }
        z42 = U4.a().b((Class)this.b[n8 + 1]);
        this.b[n8] = z42;
        return z42;
    }

    public final Object Q(int n8) {
        return this.b[n8 / 3 << 1];
    }

    @Override
    public final Object a() {
        return this.m.b(this.e);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final int b(Object var1_1) {
        var16_2 = M4.s;
        var2_3 = 1048575;
        var3_4 = 0;
        var5_6 = 0;
        for (var7_5 = 0; var7_5 < this.a.length; var7_5 += 3) {
            block84 : {
                block85 : {
                    var10_11 = this.G(var7_5);
                    var11_12 = (267386880 & var10_11) >>> 20;
                    var14_14 = this.a;
                    var9_10 = var14_14[var7_5];
                    var8_9 = var14_14[var7_5 + 2];
                    var6_8 = var8_9 & 1048575;
                    if (var11_12 <= 17) {
                        var4_7 = var2_3;
                        if (var6_8 != var2_3) {
                            var3_4 = var6_8 == 1048575 ? 0 : var16_2.getInt(var1_1, (long)var6_8);
                            var4_7 = var6_8;
                        }
                        var8_9 = 1 << (var8_9 >>> 20);
                        var6_8 = var4_7;
                    } else {
                        var8_9 = 0;
                        var6_8 = var2_3;
                    }
                    var12_13 = var10_11 & 1048575;
                    if (var11_12 >= T3.c0.a()) {
                        T3.p0.a();
                    }
                    switch (var11_12) {
                        default: {
                            var2_3 = var5_6;
                            ** GOTO lbl326
                        }
                        case 68: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var14_14 = var16_2.getObject(var1_1, var12_13);
                            ** GOTO lbl256
                        }
                        case 67: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var12_13 = M4.L(var1_1, var12_13);
                            ** GOTO lbl262
                        }
                        case 66: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var2_3 = M4.H(var1_1, var12_13);
                            ** GOTO lbl268
                        }
                        case 65: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            ** GOTO lbl273
                        }
                        case 64: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            ** GOTO lbl278
                        }
                        case 63: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var2_3 = M4.H(var1_1, var12_13);
                            ** GOTO lbl285
                        }
                        case 62: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var2_3 = M4.H(var1_1, var12_13);
                            ** GOTO lbl291
                        }
                        case 61: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var14_14 = var16_2.getObject(var1_1, var12_13);
                            ** GOTO lbl310
                        }
                        case 60: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var14_14 = var16_2.getObject(var1_1, var12_13);
                            ** GOTO lbl302
                        }
                        case 59: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var14_14 = var15_15 = var16_2.getObject(var1_1, var12_13);
                            if (!(var15_15 instanceof q3)) ** GOTO lbl-1000
                            var14_14 = var15_15;
                            ** GOTO lbl310
                        }
                        case 58: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            ** GOTO lbl318
                        }
                        case 57: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var2_3 = J3.h0(var9_10, 0);
                            ** GOTO lbl279
                        }
                        case 56: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var2_3 = J3.P(var9_10, 0L);
                            ** GOTO lbl319
                        }
                        case 55: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var2_3 = J3.l0(var9_10, M4.H(var1_1, var12_13));
                            ** GOTO lbl319
                        }
                        case 54: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var2_3 = J3.m0(var9_10, M4.L(var1_1, var12_13));
                            ** GOTO lbl319
                        }
                        case 53: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var2_3 = J3.Y(var9_10, M4.L(var1_1, var12_13));
                            ** GOTO lbl319
                        }
                        case 52: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var2_3 = J3.f(var9_10, 0.0f);
                            ** GOTO lbl319
                        }
                        case 51: {
                            var2_3 = var5_6;
                            if (!this.J(var1_1, var9_10, var7_5)) ** GOTO lbl326
                            var2_3 = J3.e(var9_10, 0.0);
                            ** GOTO lbl319
                        }
                        case 50: {
                            var2_3 = this.q.i(var9_10, var16_2.getObject(var1_1, var12_13), this.Q(var7_5));
                            ** GOTO lbl319
                        }
                        case 49: {
                            var2_3 = a5.c(var9_10, (List)var16_2.getObject(var1_1, var12_13), this.N(var7_5));
                            ** GOTO lbl319
                        }
                        case 48: {
                            var4_7 = a5.R((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 47: {
                            var4_7 = a5.O((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 46: {
                            var4_7 = a5.D((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 45: {
                            var4_7 = a5.z((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 44: {
                            var4_7 = a5.t((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 43: {
                            var4_7 = a5.U((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 42: {
                            var4_7 = a5.e((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 41: {
                            var4_7 = a5.z((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 40: {
                            var4_7 = a5.D((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 39: {
                            var4_7 = a5.H((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 38: {
                            var4_7 = a5.X((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 37: {
                            var4_7 = a5.L((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 36: {
                            var4_7 = a5.z((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
                            ** GOTO lbl207
                        }
                        case 35: {
                            var4_7 = a5.D((List)var16_2.getObject(var1_1, var12_13));
                            var2_3 = var5_6;
                            if (var4_7 <= 0) ** GOTO lbl326
                            var2_3 = var4_7;
lbl207: // 14 sources:
                            var2_3 = J3.s0(var9_10) + J3.v0(var2_3) + var2_3;
                            ** GOTO lbl279
                        }
                        case 34: {
                            var2_3 = a5.Q(var9_10, (List)var16_2.getObject(var1_1, var12_13), false);
                            ** GOTO lbl247
                        }
                        case 33: {
                            var2_3 = a5.N(var9_10, (List)var16_2.getObject(var1_1, var12_13), false);
                            ** GOTO lbl247
                        }
                        case 23: 
                        case 32: {
                            var2_3 = a5.C(var9_10, (List)var16_2.getObject(var1_1, var12_13), false);
                            ** GOTO lbl247
                        }
                        case 19: 
                        case 24: 
                        case 31: {
                            var2_3 = a5.y(var9_10, (List)var16_2.getObject(var1_1, var12_13), false);
                            ** GOTO lbl247
                        }
                        case 30: {
                            var2_3 = a5.s(var9_10, (List)var16_2.getObject(var1_1, var12_13), false);
                            ** GOTO lbl247
                        }
                        case 29: {
                            var2_3 = a5.T(var9_10, (List)var16_2.getObject(var1_1, var12_13), false);
                            ** GOTO lbl319
                        }
                        case 28: {
                            var2_3 = a5.b(var9_10, (List)var16_2.getObject(var1_1, var12_13));
                            ** GOTO lbl319
                        }
                        case 27: {
                            var2_3 = a5.r(var9_10, (List)var16_2.getObject(var1_1, var12_13), this.N(var7_5));
                            ** GOTO lbl319
                        }
                        case 26: {
                            var2_3 = a5.q(var9_10, (List)var16_2.getObject(var1_1, var12_13));
                            ** GOTO lbl319
                        }
                        case 25: {
                            var2_3 = a5.d(var9_10, (List)var16_2.getObject(var1_1, var12_13), false);
                            ** GOTO lbl247
                        }
                        case 22: {
                            var2_3 = a5.G(var9_10, (List)var16_2.getObject(var1_1, var12_13), false);
                            ** GOTO lbl247
                        }
                        case 21: {
                            var2_3 = a5.W(var9_10, (List)var16_2.getObject(var1_1, var12_13), false);
                            ** GOTO lbl247
                        }
                        case 20: {
                            var2_3 = a5.K(var9_10, (List)var16_2.getObject(var1_1, var12_13), false);
lbl247: // 9 sources:
                            var4_7 = var5_6 + var2_3;
                            break block84;
                        }
                        case 18: {
                            var2_3 = a5.C(var9_10, (List)var16_2.getObject(var1_1, var12_13), false);
                            ** GOTO lbl319
                        }
                        case 17: {
                            var2_3 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) ** GOTO lbl326
                            var14_14 = var16_2.getObject(var1_1, var12_13);
lbl256: // 2 sources:
                            var2_3 = J3.x(var9_10, (I4)var14_14, this.N(var7_5));
                            ** GOTO lbl319
                        }
                        case 16: {
                            var2_3 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) ** GOTO lbl326
                            var12_13 = var16_2.getLong(var1_1, var12_13);
lbl262: // 2 sources:
                            var2_3 = J3.i0(var9_10, var12_13);
                            ** GOTO lbl319
                        }
                        case 15: {
                            var2_3 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) ** GOTO lbl326
                            var2_3 = var16_2.getInt(var1_1, var12_13);
lbl268: // 2 sources:
                            var2_3 = J3.t0(var9_10, var2_3);
                            ** GOTO lbl319
                        }
                        case 14: {
                            var2_3 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) ** GOTO lbl326
lbl273: // 2 sources:
                            var2_3 = J3.e0(var9_10, 0L);
                            ** GOTO lbl319
                        }
                        case 13: {
                            var2_3 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) ** GOTO lbl326
lbl278: // 2 sources:
                            var2_3 = J3.p0(var9_10, 0);
lbl279: // 3 sources:
                            var2_3 = var5_6 + var2_3;
                            ** GOTO lbl326
                        }
                        case 12: {
                            var2_3 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) ** GOTO lbl326
                            var2_3 = var16_2.getInt(var1_1, var12_13);
lbl285: // 2 sources:
                            var2_3 = J3.d0(var9_10, var2_3);
                            ** GOTO lbl319
                        }
                        case 11: {
                            var2_3 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) ** GOTO lbl326
                            var2_3 = var16_2.getInt(var1_1, var12_13);
lbl291: // 2 sources:
                            var2_3 = J3.w0(var9_10, var2_3);
                            ** GOTO lbl319
                        }
                        case 10: {
                            var2_3 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) ** GOTO lbl326
                            var14_14 = var16_2.getObject(var1_1, var12_13);
                            ** GOTO lbl310
                        }
                        case 9: {
                            var2_3 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) ** GOTO lbl326
                            var14_14 = var16_2.getObject(var1_1, var12_13);
lbl302: // 2 sources:
                            var2_3 = a5.a(var9_10, var14_14, this.N(var7_5));
                            ** GOTO lbl319
                        }
                        case 8: {
                            var2_3 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) ** GOTO lbl326
                            var14_14 = var15_15 = var16_2.getObject(var1_1, var12_13);
                            ** if (!(var15_15 instanceof q3)) goto lbl-1000
lbl-1000: // 1 sources:
                            {
                                var14_14 = var15_15;
lbl310: // 4 sources:
                                var2_3 = J3.Q((int)var9_10, (q3)((q3)var14_14));
                                ** GOTO lbl319
                            }
lbl-1000: // 2 sources:
                            {
                                var2_3 = J3.y(var9_10, (String)var14_14);
                            }
                            ** GOTO lbl319
                        }
                        case 7: {
                            var2_3 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) ** GOTO lbl326
lbl318: // 2 sources:
                            var2_3 = J3.z(var9_10, true);
lbl319: // 23 sources:
                            var2_3 = var5_6 + var2_3;
                            ** GOTO lbl326
                        }
                        case 6: {
                            var2_3 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) ** GOTO lbl326
                            var2_3 = J3.h0(var9_10, 0);
                            break block85;
lbl326: // 47 sources:
                            var4_7 = var2_3;
                            break block84;
                        }
                        case 5: {
                            var4_7 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) break block84;
                            var2_3 = J3.P(var9_10, 0L);
                            break block85;
                        }
                        case 4: {
                            var4_7 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) break block84;
                            var2_3 = J3.l0(var9_10, var16_2.getInt(var1_1, var12_13));
                            break block85;
                        }
                        case 3: {
                            var4_7 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) break block84;
                            var2_3 = J3.m0(var9_10, var16_2.getLong(var1_1, var12_13));
                            break block85;
                        }
                        case 2: {
                            var4_7 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) break block84;
                            var2_3 = J3.Y(var9_10, var16_2.getLong(var1_1, var12_13));
                            break block85;
                        }
                        case 1: {
                            var4_7 = var5_6;
                            if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) break block84;
                            var2_3 = J3.f(var9_10, 0.0f);
                            break block85;
                        }
                        case 0: 
                    }
                    var4_7 = var5_6;
                    if (!this.z(var1_1, var7_5, var6_8, var3_4, var8_9)) break block84;
                    var2_3 = J3.e(var9_10, 0.0);
                }
                var4_7 = var5_6 + var2_3;
            }
            var2_3 = var6_8;
            var5_6 = var4_7;
        }
        var3_4 = 0;
        var14_14 = this.o;
        var2_3 = var4_7 = var5_6 + var14_14.a(var14_14.k(var1_1));
        if (this.f == false) return var2_3;
        var1_1 = this.p.b(var1_1);
        var5_6 = 0;
        var2_3 = var3_4;
        for (var3_4 = var5_6; var3_4 < var1_1.a.g(); var2_3 += S3.b((U3)null, (Object)var14_14.getValue()), ++var3_4) {
            var14_14 = var1_1.a.h(var3_4);
            a.a(var14_14.getKey());
        }
        var1_1 = var1_1.a.j().iterator();
        do {
            if (!var1_1.hasNext()) {
                return var4_7 + var2_3;
            }
            var14_14 = (Map.Entry)var1_1.next();
            a.a(var14_14.getKey());
            var2_3 += S3.b(null, var14_14.getValue());
        } while (true);
    }

    @Override
    public final boolean c(Object object) {
        int n8 = 1048575;
        for (int i8 = n9 = 0; i8 < this.k; ++i8) {
            int n9;
            int n10 = this.j[i8];
            int n11 = this.a[n10];
            int n12 = this.G(n10);
            int n13 = this.a[n10 + 2];
            int n14 = n13 & 1048575;
            n13 = 1 << (n13 >>> 20);
            if (n14 != n8) {
                if (n14 != 1048575) {
                    n9 = s.getInt(object, (long)n14);
                }
                n8 = n14;
            }
            if ((268435456 & n12) != 0 && !this.z(object, n10, n8, n9, n13)) {
                return false;
            }
            n14 = (267386880 & n12) >>> 20;
            if (n14 != 9 && n14 != 17) {
                List list;
                if (n14 != 27) {
                    if (n14 != 60 && n14 != 68) {
                        if (n14 != 49) {
                            if (n14 != 50 || this.q.c(D5.B(object, n12 & 1048575)).isEmpty()) continue;
                            object = this.Q(n10);
                            this.q.b(object);
                            throw null;
                        }
                    } else {
                        if (!this.J(object, n11, n10) || M4.A(object, n12, this.N(n10))) continue;
                        return false;
                    }
                }
                if ((list = (List)D5.B(object, n12 & 1048575)).isEmpty()) continue;
                Z4 z42 = this.N(n10);
                for (n14 = 0; n14 < list.size(); ++n14) {
                    if (z42.c(list.get(n14))) continue;
                    return false;
                }
                continue;
            }
            if (!this.z(object, n10, n8, n9, n13) || M4.A(object, n12, this.N(n10))) continue;
            return false;
        }
        if (this.f && !this.p.b(object).n()) {
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void d(Object var1_1, Object var2_2) {
        M4.R(var1_1);
        var2_2.getClass();
        var3_3 = 0;
        do {
            block31 : {
                block32 : {
                    if (var3_3 >= this.a.length) {
                        a5.n(this.o, var1_1, var2_2);
                        if (this.f == false) return;
                        a5.l(this.p, var1_1, var2_2);
                        return;
                    }
                    var4_4 = this.G(var3_3);
                    var6_6 = 1048575 & var4_4;
                    var5_5 = this.a[var3_3];
                    switch ((var4_4 & 267386880) >>> 20) {
                        default: {
                            ** break;
                        }
                        case 60: 
                        case 68: {
                            this.F(var1_1, var2_2, var3_3);
                            ** break;
                        }
                        case 61: 
                        case 62: 
                        case 63: 
                        case 64: 
                        case 65: 
                        case 66: 
                        case 67: {
                            if (!this.J(var2_2, var5_5, var3_3)) break block31;
                            ** GOTO lbl24
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
                            if (!this.J(var2_2, var5_5, var3_3)) break block31;
lbl24: // 2 sources:
                            D5.j(var1_1, var6_6, D5.B(var2_2, var6_6));
                            this.E(var1_1, var5_5, var3_3);
                            break block31;
                        }
                        case 50: {
                            a5.m(this.q, var1_1, var2_2, var6_6);
                            ** break;
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
                            this.n.b(var1_1, var2_2, var6_6);
                            ** break;
                        }
                        case 9: 
                        case 17: {
                            this.y(var1_1, var2_2, var3_3);
                            ** break;
                        }
                        case 16: {
                            if (!this.I(var2_2, var3_3)) break block31;
                            ** GOTO lbl80
                        }
                        case 15: {
                            if (!this.I(var2_2, var3_3)) break block31;
                            ** GOTO lbl73
                        }
                        case 14: {
                            if (!this.I(var2_2, var3_3)) break block31;
                            ** GOTO lbl80
                        }
                        case 13: {
                            if (!this.I(var2_2, var3_3)) break block31;
                            ** GOTO lbl73
                        }
                        case 12: {
                            if (!this.I(var2_2, var3_3)) break block31;
                            ** GOTO lbl73
                        }
                        case 11: {
                            if (!this.I(var2_2, var3_3)) break block31;
                            ** GOTO lbl73
                        }
                        case 10: {
                            if (!this.I(var2_2, var3_3)) break block31;
                            ** GOTO lbl59
                        }
                        case 8: {
                            if (!this.I(var2_2, var3_3)) break block31;
lbl59: // 2 sources:
                            D5.j(var1_1, var6_6, D5.B(var2_2, var6_6));
                            break block32;
                        }
                        case 7: {
                            if (!this.I(var2_2, var3_3)) break block31;
                            D5.v(var1_1, var6_6, D5.F(var2_2, var6_6));
                            break block32;
                        }
                        case 6: {
                            if (!this.I(var2_2, var3_3)) break block31;
                            ** GOTO lbl73
                        }
                        case 5: {
                            if (!this.I(var2_2, var3_3)) break block31;
                            ** GOTO lbl80
                        }
                        case 4: {
                            if (!this.I(var2_2, var3_3)) break block31;
lbl73: // 6 sources:
                            D5.h(var1_1, var6_6, D5.t(var2_2, var6_6));
                            break block32;
                        }
                        case 3: {
                            if (!this.I(var2_2, var3_3)) break block31;
                            ** GOTO lbl80
                        }
                        case 2: {
                            if (!this.I(var2_2, var3_3)) break block31;
lbl80: // 5 sources:
                            D5.i(var1_1, var6_6, D5.x(var2_2, var6_6));
                            break block32;
                        }
                        case 1: {
                            if (!this.I(var2_2, var3_3)) break block31;
                            D5.g(var1_1, var6_6, D5.n(var2_2, var6_6));
                            break block32;
                        }
                        case 0: 
                    }
                    if (!this.I(var2_2, var3_3)) break block31;
                    D5.f(var1_1, var6_6, D5.a(var2_2, var6_6));
                }
                this.D(var1_1, var3_3);
                ** break;
            }
            var3_3 += 3;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void e(Object var1_1) {
        if (!M4.T(var1_1)) {
            return;
        }
        var5_2 = var1_1 instanceof Y3;
        var2_3 = 0;
        if (var5_2) {
            var8_4 = (Y3)var1_1;
            var8_4.j(Integer.MAX_VALUE);
            var8_4.zza = 0;
            var8_4.D();
        }
        var3_5 = this.a.length;
        do {
            if (var2_3 >= var3_5) {
                this.o.l(var1_1);
                if (this.f == false) return;
                this.p.f(var1_1);
                return;
            }
            var4_6 = this.G(var2_3);
            var6_7 = 1048575 & var4_6;
            if ((var4_6 = (var4_6 & 267386880) >>> 20) == 9) ** GOTO lbl-1000
            if (var4_6 == 60 || var4_6 == 68) ** GOTO lbl33
            switch (var4_6) {
                default: {
                    break;
                }
                case 50: {
                    var8_4 = M4.s;
                    var9_8 = var8_4.getObject(var1_1, var6_7);
                    if (var9_8 == null) break;
                    var8_4.putObject(var1_1, var6_7, this.q.e(var9_8));
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
                    this.n.d(var1_1, var6_7);
                    break;
                }
lbl33: // 1 sources:
                if (!this.J(var1_1, this.a[var2_3], var2_3)) break;
                ** GOTO lbl37
                case 17: lbl-1000: // 2 sources:
                {
                    if (!this.I(var1_1, var2_3)) break;
lbl37: // 2 sources:
                    this.N(var2_3).e(M4.s.getObject(var1_1, var6_7));
                    break;
                }
            }
            var2_3 += 3;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final int f(Object var1_1) {
        var8_2 = this.a.length;
        var7_3 = 0;
        var6_4 = 0;
        do {
            block34 : {
                block35 : {
                    block36 : {
                        block37 : {
                            if (var7_3 >= var8_2) {
                                var5_7 = var6_4 = var6_4 * 53 + this.o.k(var1_1).hashCode();
                                if (this.f == false) return var5_7;
                                return var6_4 * 53 + this.p.b(var1_1).hashCode();
                            }
                            var10_9 = this.G(var7_3);
                            var9_8 = this.a[var7_3];
                            var11_10 = 1048575 & var10_9;
                            var5_7 = 37;
                            switch ((var10_9 & 267386880) >>> 20) {
                                default: {
                                    var5_7 = var6_4;
                                    ** break;
                                }
                                case 68: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl55
                                }
                                case 67: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl93
                                }
                                case 66: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl83
                                }
                                case 65: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl93
                                }
                                case 64: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl83
                                }
                                case 63: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl83
                                }
                                case 62: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl83
                                }
                                case 61: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
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
                                    var14_12 = D5.B(var1_1, var11_10);
                                    ** GOTO lbl57
                                }
                                case 60: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
lbl55: // 2 sources:
                                    var14_12 = D5.B(var1_1, var11_10);
                                    var5_7 = var6_4 * 53;
lbl57: // 2 sources:
                                    var6_4 = var14_12.hashCode();
                                    break block35;
                                }
                                case 59: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                }
                                case 8: {
                                    var5_7 = var6_4 * 53;
                                    var6_4 = ((String)D5.B(var1_1, var11_10)).hashCode();
                                    break block35;
                                }
                                case 58: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var13_11 = M4.P(var1_1, var11_10);
                                    ** GOTO lbl129
                                }
                                case 57: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl83
                                }
                                case 56: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl93
                                }
                                case 55: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
lbl83: // 6 sources:
                                    var5_7 = var6_4 * 53;
                                    var6_4 = M4.H(var1_1, var11_10);
                                    break block35;
                                }
                                case 54: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl93
                                }
                                case 53: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
lbl93: // 5 sources:
                                    var5_7 = var6_4 * 53;
                                    var11_10 = M4.L(var1_1, var11_10);
                                    break block36;
                                }
                                case 52: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var4_6 = M4.B(var1_1, var11_10);
                                    ** GOTO lbl134
                                }
                                case 51: {
                                    var5_7 = var6_4;
                                    if (!this.J(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var2_5 = M4.j(var1_1, var11_10);
                                    break block37;
                                }
                                case 17: {
                                    var14_12 = D5.B(var1_1, var11_10);
                                    if (var14_12 == null) ** GOTO lbl124
                                    ** GOTO lbl123
                                }
                                case 2: 
                                case 3: 
                                case 5: 
                                case 14: 
                                case 16: {
                                    var5_7 = var6_4 * 53;
                                    var11_10 = D5.x(var1_1, var11_10);
                                    break block36;
                                }
                                case 4: 
                                case 6: 
                                case 11: 
                                case 12: 
                                case 13: 
                                case 15: {
                                    var5_7 = var6_4 * 53;
                                    var6_4 = D5.t(var1_1, var11_10);
                                    break block35;
                                }
                                case 9: {
                                    var14_12 = D5.B(var1_1, var11_10);
                                    if (var14_12 == null) ** GOTO lbl124
lbl123: // 2 sources:
                                    var5_7 = var14_12.hashCode();
lbl124: // 3 sources:
                                    var5_7 = var6_4 * 53 + var5_7;
                                    ** break;
                                }
                                case 7: {
                                    var5_7 = var6_4 * 53;
                                    var13_11 = D5.F(var1_1, var11_10);
lbl129: // 2 sources:
                                    var6_4 = a4.c(var13_11);
                                    break block35;
                                }
                                case 1: {
                                    var5_7 = var6_4 * 53;
                                    var4_6 = D5.n(var1_1, var11_10);
lbl134: // 2 sources:
                                    var6_4 = Float.floatToIntBits((float)var4_6);
                                    break block35;
                                }
                                case 0: 
                            }
                            var5_7 = var6_4 * 53;
                            var2_5 = D5.a(var1_1, var11_10);
                        }
                        var11_10 = Double.doubleToLongBits((double)var2_5);
                    }
                    var6_4 = a4.b(var11_10);
                }
                var5_7 += var6_4;
                ** break;
            }
            var7_3 += 3;
            var6_4 = var5_7;
        } while (true);
    }

    @Override
    public final void g(Object object, byte[] arrby, int n8, int n9, p3 p32) {
        this.m(object, arrby, n8, n9, 0, p32);
    }

    @Override
    public final boolean h(Object object, Object object2) {
        int n8 = this.a.length;
        block22 : for (int i8 = 0; i8 < n8; i8 += 3) {
            int n9 = this.G(i8);
            long l8 = n9 & 1048575;
            switch ((n9 & 267386880) >>> 20) {
                default: {
                    continue block22;
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
                    long l9 = this.C(i8) & 1048575;
                    if (D5.t(object, l9) == D5.t(object2, l9)) {
                        if (a5.p(D5.B(object, l8), D5.B(object2, l8))) continue block22;
                        return false;
                    }
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
                case 49: 
                case 50: {
                    if (a5.p(D5.B(object, l8), D5.B(object2, l8))) continue block22;
                    return false;
                }
                case 17: {
                    if (this.K(object, object2, i8)) {
                        if (a5.p(D5.B(object, l8), D5.B(object2, l8))) continue block22;
                        return false;
                    }
                    break;
                }
                case 16: {
                    if (this.K(object, object2, i8)) {
                        if (D5.x(object, l8) == D5.x(object2, l8)) continue block22;
                        return false;
                    }
                    break;
                }
                case 15: {
                    if (this.K(object, object2, i8)) {
                        if (D5.t(object, l8) == D5.t(object2, l8)) continue block22;
                        return false;
                    }
                    break;
                }
                case 14: {
                    if (this.K(object, object2, i8)) {
                        if (D5.x(object, l8) == D5.x(object2, l8)) continue block22;
                        return false;
                    }
                    break;
                }
                case 13: {
                    if (this.K(object, object2, i8)) {
                        if (D5.t(object, l8) == D5.t(object2, l8)) continue block22;
                        return false;
                    }
                    break;
                }
                case 12: {
                    if (this.K(object, object2, i8)) {
                        if (D5.t(object, l8) == D5.t(object2, l8)) continue block22;
                        return false;
                    }
                    break;
                }
                case 11: {
                    if (this.K(object, object2, i8)) {
                        if (D5.t(object, l8) == D5.t(object2, l8)) continue block22;
                        return false;
                    }
                    break;
                }
                case 10: {
                    if (this.K(object, object2, i8)) {
                        if (a5.p(D5.B(object, l8), D5.B(object2, l8))) continue block22;
                        return false;
                    }
                    break;
                }
                case 9: {
                    if (this.K(object, object2, i8)) {
                        if (a5.p(D5.B(object, l8), D5.B(object2, l8))) continue block22;
                        return false;
                    }
                    break;
                }
                case 8: {
                    if (this.K(object, object2, i8)) {
                        if (a5.p(D5.B(object, l8), D5.B(object2, l8))) continue block22;
                        return false;
                    }
                    break;
                }
                case 7: {
                    if (this.K(object, object2, i8)) {
                        if (D5.F(object, l8) == D5.F(object2, l8)) continue block22;
                        return false;
                    }
                    break;
                }
                case 6: {
                    if (this.K(object, object2, i8)) {
                        if (D5.t(object, l8) == D5.t(object2, l8)) continue block22;
                        return false;
                    }
                    break;
                }
                case 5: {
                    if (this.K(object, object2, i8)) {
                        if (D5.x(object, l8) == D5.x(object2, l8)) continue block22;
                        return false;
                    }
                    break;
                }
                case 4: {
                    if (this.K(object, object2, i8)) {
                        if (D5.t(object, l8) == D5.t(object2, l8)) continue block22;
                        return false;
                    }
                    break;
                }
                case 3: {
                    if (this.K(object, object2, i8)) {
                        if (D5.x(object, l8) == D5.x(object2, l8)) continue block22;
                        return false;
                    }
                    break;
                }
                case 2: {
                    if (this.K(object, object2, i8)) {
                        if (D5.x(object, l8) == D5.x(object2, l8)) continue block22;
                        return false;
                    }
                    break;
                }
                case 1: {
                    if (this.K(object, object2, i8)) {
                        if (Float.floatToIntBits((float)D5.n(object, l8)) == Float.floatToIntBits((float)D5.n(object2, l8))) continue block22;
                        return false;
                    }
                    break;
                }
                case 0: {
                    if (!this.K(object, object2, i8)) break;
                    if (Double.doubleToLongBits((double)D5.a(object, l8)) == Double.doubleToLongBits((double)D5.a(object2, l8))) continue block22;
                    return false;
                }
            }
            return false;
        }
        if (!this.o.k(object).equals(this.o.k(object2))) {
            return false;
        }
        if (this.f) {
            return this.p.b(object).equals(this.p.b(object2));
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void i(Object var1_1, T5 var2_2) {
        block236 : {
            block235 : {
                var22_3 = var2_2;
                if (var2_2.a() == W5.b) break block235;
                if (!this.f) ** GOTO lbl-1000
                var20_19 = this.p.b(var1_1);
                if (!var20_19.a.isEmpty()) {
                    var21_5 = var20_19.l();
                    var20_19 = (Map.Entry)var21_5.next();
                } else lbl-1000: // 2 sources:
                {
                    var20_19 = null;
                    var21_5 = null;
                }
                var10_20 = this.a.length;
                var23_21 = M4.s;
                var6_7 = 1048575;
                break block236;
            }
            M4.u(this.o, var1_1, (T5)var22_3);
            if (!this.f) ** GOTO lbl-1000
            var2_2 = this.p.b(var1_1);
            if (!var2_2.a.isEmpty()) {
                var21_4 = var2_2.i();
                var2_2 = (Map.Entry)var21_4.next();
            } else lbl-1000: // 2 sources:
            {
                var21_4 = null;
                var2_2 = null;
            }
            var6_6 = this.a.length - 3;
            do {
                block237 : {
                    block238 : {
                        var20_18 = var2_2;
                        if (var6_6 < 0) {
                            while (var20_18 != null) {
                                this.p.c((T5)var22_3, (Map.Entry)var20_18);
                                if (var21_4.hasNext() == false) return;
                                var20_18 = (Map.Entry)var21_4.next();
                            }
                            return;
                        }
                        var7_10 = this.G(var6_6);
                        var8_12 = this.a[var6_6];
                        while (var2_2 != null && this.p.a((Map.Entry)var2_2) > var8_12) {
                            this.p.c((T5)var22_3, (Map.Entry)var2_2);
                            if (var21_4.hasNext()) {
                                var2_2 = (Map.Entry)var21_4.next();
                                continue;
                            }
                            var2_2 = null;
                        }
                        switch ((var7_10 & 267386880) >>> 20) {
                            default: {
                                ** break;
                            }
                            case 68: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                ** GOTO lbl216
                            }
                            case 67: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var16_14 = M4.L(var1_1, var7_10 & 1048575);
                                ** GOTO lbl221
                            }
                            case 66: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var7_10 = M4.H(var1_1, var7_10 & 1048575);
                                ** GOTO lbl226
                            }
                            case 65: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var16_14 = M4.L(var1_1, var7_10 & 1048575);
                                ** GOTO lbl231
                            }
                            case 64: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var7_10 = M4.H(var1_1, var7_10 & 1048575);
                                ** GOTO lbl236
                            }
                            case 63: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var7_10 = M4.H(var1_1, var7_10 & 1048575);
                                ** GOTO lbl241
                            }
                            case 62: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var7_10 = M4.H(var1_1, var7_10 & 1048575);
                                ** GOTO lbl246
                            }
                            case 61: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                ** GOTO lbl250
                            }
                            case 60: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                ** GOTO lbl254
                            }
                            case 59: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                ** GOTO lbl258
                            }
                            case 58: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var18_16 = M4.P(var1_1, var7_10 & 1048575);
                                ** GOTO lbl263
                            }
                            case 57: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var7_10 = M4.H(var1_1, var7_10 & 1048575);
                                ** GOTO lbl268
                            }
                            case 56: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var16_14 = M4.L(var1_1, var7_10 & 1048575);
                                ** GOTO lbl273
                            }
                            case 55: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var7_10 = M4.H(var1_1, var7_10 & 1048575);
                                ** GOTO lbl278
                            }
                            case 54: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var16_14 = M4.L(var1_1, var7_10 & 1048575);
                                ** GOTO lbl283
                            }
                            case 53: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var16_14 = M4.L(var1_1, var7_10 & 1048575);
                                ** GOTO lbl288
                            }
                            case 52: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var5_9 = M4.B(var1_1, var7_10 & 1048575);
                                ** GOTO lbl293
                            }
                            case 51: {
                                if (!this.J(var1_1, var8_12, var6_6)) break block237;
                                var3_8 = M4.j(var1_1, var7_10 & 1048575);
                                break block238;
                            }
                            case 50: {
                                this.v((T5)var22_3, var8_12, D5.B(var1_1, var7_10 & 1048575), var6_6);
                                ** break;
                            }
                            case 49: {
                                a5.j(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, this.N(var6_6));
                                ** break;
                            }
                            case 48: {
                                a5.a0(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 47: {
                                a5.Z(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 46: {
                                a5.Y(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 45: {
                                a5.V(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 44: {
                                a5.B(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 43: {
                                a5.b0(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 42: {
                                a5.k(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 41: {
                                a5.F(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 40: {
                                a5.J(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 39: {
                                a5.P(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 38: {
                                a5.c0(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 37: {
                                a5.S(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 36: {
                                a5.M(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 35: {
                                a5.x(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, true);
                                ** break;
                            }
                            case 34: {
                                a5.a0(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 33: {
                                a5.Z(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 32: {
                                a5.Y(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 31: {
                                a5.V(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 30: {
                                a5.B(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 29: {
                                a5.b0(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 28: {
                                a5.i(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3);
                                ** break;
                            }
                            case 27: {
                                a5.w(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, this.N(var6_6));
                                ** break;
                            }
                            case 26: {
                                a5.v(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3);
                                ** break;
                            }
                            case 25: {
                                a5.k(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 24: {
                                a5.F(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 23: {
                                a5.J(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 22: {
                                a5.P(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 21: {
                                a5.c0(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 20: {
                                a5.S(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 19: {
                                a5.M(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 18: {
                                a5.x(this.a[var6_6], (List)D5.B(var1_1, var7_10 & 1048575), (T5)var22_3, false);
                                ** break;
                            }
                            case 17: {
                                if (!this.I(var1_1, var6_6)) break block237;
lbl216: // 2 sources:
                                var22_3.C(var8_12, D5.B(var1_1, var7_10 & 1048575), this.N(var6_6));
                                break block237;
                            }
                            case 16: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var16_14 = D5.x(var1_1, var7_10 & 1048575);
lbl221: // 2 sources:
                                var22_3.A(var8_12, var16_14);
                                break block237;
                            }
                            case 15: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var7_10 = D5.t(var1_1, var7_10 & 1048575);
lbl226: // 2 sources:
                                var22_3.G(var8_12, var7_10);
                                break block237;
                            }
                            case 14: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var16_14 = D5.x(var1_1, var7_10 & 1048575);
lbl231: // 2 sources:
                                var22_3.s(var8_12, var16_14);
                                break block237;
                            }
                            case 13: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var7_10 = D5.t(var1_1, var7_10 & 1048575);
lbl236: // 2 sources:
                                var22_3.x(var8_12, var7_10);
                                break block237;
                            }
                            case 12: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var7_10 = D5.t(var1_1, var7_10 & 1048575);
lbl241: // 2 sources:
                                var22_3.K(var8_12, var7_10);
                                break block237;
                            }
                            case 11: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var7_10 = D5.t(var1_1, var7_10 & 1048575);
lbl246: // 2 sources:
                                var22_3.h(var8_12, var7_10);
                                break block237;
                            }
                            case 10: {
                                if (!this.I(var1_1, var6_6)) break block237;
lbl250: // 2 sources:
                                var22_3.f(var8_12, (q3)D5.B(var1_1, var7_10 & 1048575));
                                break block237;
                            }
                            case 9: {
                                if (!this.I(var1_1, var6_6)) break block237;
lbl254: // 2 sources:
                                var22_3.d(var8_12, D5.B(var1_1, var7_10 & 1048575), this.N(var6_6));
                                break block237;
                            }
                            case 8: {
                                if (!this.I(var1_1, var6_6)) break block237;
lbl258: // 2 sources:
                                M4.t(var8_12, D5.B(var1_1, var7_10 & 1048575), (T5)var22_3);
                                break block237;
                            }
                            case 7: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var18_16 = D5.F(var1_1, var7_10 & 1048575);
lbl263: // 2 sources:
                                var22_3.c(var8_12, var18_16);
                                break block237;
                            }
                            case 6: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var7_10 = D5.t(var1_1, var7_10 & 1048575);
lbl268: // 2 sources:
                                var22_3.k(var8_12, var7_10);
                                break block237;
                            }
                            case 5: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var16_14 = D5.x(var1_1, var7_10 & 1048575);
lbl273: // 2 sources:
                                var22_3.M(var8_12, var16_14);
                                break block237;
                            }
                            case 4: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var7_10 = D5.t(var1_1, var7_10 & 1048575);
lbl278: // 2 sources:
                                var22_3.r(var8_12, var7_10);
                                break block237;
                            }
                            case 3: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var16_14 = D5.x(var1_1, var7_10 & 1048575);
lbl283: // 2 sources:
                                var22_3.I(var8_12, var16_14);
                                break block237;
                            }
                            case 2: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var16_14 = D5.x(var1_1, var7_10 & 1048575);
lbl288: // 2 sources:
                                var22_3.j(var8_12, var16_14);
                                break block237;
                            }
                            case 1: {
                                if (!this.I(var1_1, var6_6)) break block237;
                                var5_9 = D5.n(var1_1, var7_10 & 1048575);
lbl293: // 2 sources:
                                var22_3.O(var8_12, var5_9);
                                break block237;
                            }
                            case 0: 
                        }
                        if (!this.I(var1_1, var6_6)) break block237;
                        var3_8 = D5.a(var1_1, var7_10 & 1048575);
                    }
                    var22_3.N(var8_12, var3_8);
                    ** break;
                }
                var6_6 -= 3;
            } while (true);
        }
        for (var8_13 = var7_11 = 0; var8_13 < var10_20; var8_13 += 3) {
            block239 : {
                var13_25 = this.G(var8_13);
                var24_29 = this.a;
                var12_24 = var24_29[var8_13];
                var14_26 = (var13_25 & 267386880) >>> 20;
                if (var14_26 <= 17) {
                    var15_27 = var24_29[var8_13 + 2];
                    var11_23 = var15_27 & 1048575;
                    var9_22 = var6_7;
                    if (var11_23 != var6_7) {
                        var7_11 = var11_23 == 1048575 ? 0 : var23_21.getInt(var1_1, (long)var11_23);
                        var9_22 = var11_23;
                    }
                    var11_23 = true << (var15_27 >>> 20);
                    var6_7 = var9_22;
                    var9_22 = var11_23;
                } else {
                    var9_22 = 0;
                }
                do {
                    var24_29 = var21_5;
                    if (var20_19 == null || this.p.a((Map.Entry)var20_19) > var12_24) break;
                    this.p.c((T5)var22_3, (Map.Entry)var20_19);
                    if (var24_29.hasNext()) {
                        var20_19 = (Map.Entry)var24_29.next();
                        continue;
                    }
                    var20_19 = null;
                } while (true);
                var16_15 = var13_25 & 1048575;
                switch (var14_26) {
                    case 68: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.C(var12_24, var23_21.getObject(var1_1, var16_15), this.N(var8_13));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 67: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.A(var12_24, M4.L(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 66: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.G(var12_24, M4.H(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 65: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.s(var12_24, M4.L(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 64: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.x(var12_24, M4.H(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 63: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.K(var12_24, M4.H(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 62: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.h(var12_24, M4.H(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 61: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.f(var12_24, (q3)var23_21.getObject(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 60: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.d(var12_24, var23_21.getObject(var1_1, var16_15), this.N(var8_13));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 59: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            M4.t(var12_24, var23_21.getObject(var1_1, var16_15), (T5)var22_3);
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 58: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.c(var12_24, M4.P(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 57: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.k(var12_24, M4.H(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 56: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.M(var12_24, M4.L(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 55: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.r(var12_24, M4.H(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 54: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.I(var12_24, M4.L(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 53: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.j(var12_24, M4.L(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 52: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.O(var12_24, M4.B(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 51: {
                        if (this.J(var1_1, var12_24, var8_13)) {
                            var22_3.N(var12_24, M4.j(var1_1, var16_15));
                            ** break;
                        }
                        ** GOTO lbl497
                    }
                    case 50: {
                        this.v((T5)var22_3, var12_24, var23_21.getObject(var1_1, var16_15), var8_13);
                        ** break;
                    }
                    case 49: {
                        a5.j(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, this.N(var8_13));
                        ** break;
                    }
                    case 48: {
                        a5.a0(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 47: {
                        a5.Z(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 46: {
                        a5.Y(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 45: {
                        a5.V(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 44: {
                        a5.B(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 43: {
                        a5.b0(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 42: {
                        a5.k(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 41: {
                        a5.F(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 40: {
                        a5.J(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 39: {
                        a5.P(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 38: {
                        a5.c0(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 37: {
                        a5.S(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 36: {
                        a5.M(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 35: {
                        a5.x(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, true);
                        ** break;
                    }
                    case 34: {
                        a5.a0(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 33: {
                        a5.Z(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 32: {
                        a5.Y(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 31: {
                        a5.V(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 30: {
                        a5.B(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 29: {
                        a5.b0(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 28: {
                        a5.i(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3);
                        ** break;
                    }
                    case 27: {
                        a5.w(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, this.N(var8_13));
                        ** break;
                    }
                    case 26: {
                        a5.v(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3);
                    }
lbl497: // 56 sources:
                    default: {
                        var18_17 = false;
                        ** GOTO lbl524
                    }
                    case 25: {
                        a5.k(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 24: {
                        a5.F(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 23: {
                        a5.J(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 22: {
                        a5.P(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 21: {
                        a5.c0(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 20: {
                        a5.S(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 19: {
                        a5.M(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
                        ** GOTO lbl523
                    }
                    case 18: {
                        a5.x(this.a[var8_13], (List)var23_21.getObject(var1_1, var16_15), (T5)var22_3, false);
lbl523: // 14 sources:
                        var18_17 = false;
lbl524: // 2 sources:
                        var21_5 = var22_3;
                        ** break;
                    }
                    case 17: {
                        var18_17 = false;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var2_2.C(var12_24, var23_21.getObject(var1_1, var16_15), this.N(var8_13));
                        }
                        var21_5 = var2_2;
                        ** break;
                    }
                    case 16: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.A(var12_24, var23_21.getLong(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 15: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.G(var12_24, var23_21.getInt(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 14: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.s(var12_24, var23_21.getLong(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 13: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.x(var12_24, var23_21.getInt(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 12: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.K(var12_24, var23_21.getInt(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 11: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.h(var12_24, var23_21.getInt(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 10: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.f(var12_24, (q3)var23_21.getObject(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 9: {
                        var19_28 = false;
                        var11_23 = var8_13;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var11_23, var6_7, var7_11, var9_22)) {
                            var22_3.d(var12_24, var23_21.getObject(var1_1, var16_15), this.N(var11_23));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 8: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            M4.t(var12_24, var23_21.getObject(var1_1, var16_15), (T5)var22_3);
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 7: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.c(var12_24, D5.F(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 6: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.k(var12_24, var23_21.getInt(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 5: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.M(var12_24, var23_21.getLong(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 4: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.r(var12_24, var23_21.getInt(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 3: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.I(var12_24, var23_21.getLong(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 2: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.j(var12_24, var23_21.getLong(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 1: {
                        var19_28 = false;
                        var21_5 = var22_3;
                        var18_17 = var19_28;
                        if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                            var22_3.O(var12_24, D5.n(var1_1, var16_15));
                            var21_5 = var22_3;
                            var18_17 = var19_28;
                            ** break;
                        }
                        break block239;
                    }
                    case 0: 
                }
                var19_28 = false;
                var21_5 = var22_3;
                var18_17 = var19_28;
                if (this.z(var1_1, var8_13, var6_7, var7_11, var9_22)) {
                    var22_3.N(var12_24, D5.a(var1_1, var16_15));
                    var18_17 = var19_28;
                    var21_5 = var22_3;
                }
            }
            var22_3 = var21_5;
            var21_5 = var24_29;
        }
        do {
            if (var20_19 == null) {
                M4.u(this.o, var1_1, (T5)var22_3);
                return;
            }
            this.p.c((T5)var22_3, (Map.Entry)var20_19);
            if (var21_5.hasNext()) {
                var20_19 = (Map.Entry)var21_5.next();
                continue;
            }
            var20_19 = null;
        } while (true);
    }

    public final int k(int n8) {
        if (n8 >= this.c && n8 <= this.d) {
            return this.l(n8, 0);
        }
        return -1;
    }

    public final int l(int n8, int n9) {
        int n10 = this.a.length / 3 - 1;
        while (n9 <= n10) {
            int n11 = n10 + n9 >>> 1;
            int n12 = n11 * 3;
            int n13 = this.a[n12];
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

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int m(Object var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, p3 var6_6) {
        block133 : {
            var28_7 = var1_1;
            var12_8 = var4_4;
            var13_9 = var5_5;
            var25_10 = var6_6;
            M4.R(var1_1);
            var27_11 = M4.s;
            var9_14 = var7_13 = (var14_12 = 0);
            var8_15 = -1;
            var11_16 = 1048575;
            block48 : while (var3_3 < var12_8) {
                block143 : {
                    block135 : {
                        block132 : {
                            block142 : {
                                block138 : {
                                    block139 : {
                                        block140 : {
                                            block141 : {
                                                block131 : {
                                                    block137 : {
                                                        block136 : {
                                                            block134 : {
                                                                var10_17 = var3_3 + true;
                                                                if ((var3_3 = var2_2[var3_3]) < 0) {
                                                                    var10_17 = n3.d((int)var3_3, (byte[])var2_2, (int)var10_17, (p3)var25_10);
                                                                    var3_3 = var25_10.a;
                                                                }
                                                                var7_13 = var3_3 >>> 3;
                                                                var16_19 = var3_3 & 7;
                                                                if (var7_13 > var8_15) {
                                                                    var8_15 = var14_12 / 3;
                                                                    var8_15 = var7_13 >= this.c && var7_13 <= this.d ? this.l((int)var7_13, (int)var8_15) : -1;
                                                                } else {
                                                                    var8_15 = this.k((int)var7_13);
                                                                }
                                                                if (var8_15 != -1) break block134;
                                                                var14_12 = var11_16;
                                                                var16_19 = 0;
                                                                var15_18 = var13_9;
                                                                var13_9 = var7_13;
                                                                var8_15 = var12_8;
                                                                var7_13 = var3_3;
                                                                var11_16 = var10_17;
                                                                var26_26 = var25_10;
                                                                var3_3 = var15_18;
                                                                var10_17 = var16_19;
                                                                var12_8 = var14_12;
                                                                var25_10 = var27_11;
                                                                break block135;
                                                            }
                                                            var31_29 = this.a;
                                                            var19_22 = var31_29[var8_15 + 1];
                                                            var17_20 = (var19_22 & 267386880) >>> 20;
                                                            var20_23 = var19_22 & 1048575;
                                                            if (var17_20 > 17) break block136;
                                                            var12_8 = var31_29[var8_15 + 2];
                                                            var18_21 = true << (var12_8 >>> 20);
                                                            if ((var12_8 = (Object)(var12_8 & 1048575)) != var11_16) {
                                                                if (var11_16 != 1048575) {
                                                                    var27_11.putInt(var28_7, (long)var11_16, (int)var9_14);
                                                                }
                                                                var9_14 = var12_8 == 1048575 ? 0 : (Object)var27_11.getInt(var28_7, (long)var12_8);
                                                                var13_9 = var9_14;
                                                            } else {
                                                                var12_8 = var11_16;
                                                                var13_9 = var9_14;
                                                            }
                                                            block0 : switch (var17_20) {
                                                                do {
                                                                    default: {
                                                                        var9_14 = var5_5;
                                                                        var11_16 = var3_3;
                                                                        break block0;
                                                                    }
                                                                    break;
                                                                } while (true);
                                                                case 17: {
                                                                    if (var16_19 != 3) ** continue;
                                                                    var26_26 = this.p(var28_7, (int)var8_15);
                                                                    var15_18 = n3.h(var26_26, this.N((int)var8_15), (byte[])var2_2, (int)var10_17, (int)var4_4, var7_13 << 3 | 4, (p3)var6_6);
                                                                    this.x(var28_7, (int)var8_15, var26_26);
                                                                    var9_14 = var13_9 | var18_21;
                                                                    var10_17 = var7_13;
                                                                    var11_16 = var12_8;
                                                                    var12_8 = var4_4;
                                                                    var7_13 = var3_3;
                                                                    var14_12 = var8_15;
                                                                    var8_15 = var10_17;
                                                                    var3_3 = var15_18;
lbl71: // 2 sources:
                                                                    do {
                                                                        var13_9 = var5_5;
                                                                        continue block48;
                                                                        break;
                                                                    } while (true);
                                                                }
                                                                case 16: {
                                                                    if (var16_19 == false) {
                                                                        var9_14 = n3.p((byte[])var2_2, (int)var10_17, (p3)var25_10);
                                                                        var27_11.putLong(var1_1, var20_23, G3.b(var25_10.b));
                                                                        var10_17 = var13_9 | var18_21;
lbl79: // 2 sources:
                                                                        do {
                                                                            var11_16 = var12_8;
                                                                            var15_18 = var3_3;
                                                                            var14_12 = var8_15;
                                                                            var13_9 = var5_5;
                                                                            var12_8 = var4_4;
                                                                            var3_3 = var9_14;
                                                                            var8_15 = var7_13;
                                                                            var7_13 = var15_18;
                                                                            var9_14 = var10_17;
                                                                            continue block48;
                                                                            break;
                                                                        } while (true);
                                                                    }
                                                                    var9_14 = var5_5;
                                                                    var11_16 = var3_3;
                                                                    break;
                                                                }
                                                                case 15: {
                                                                    var9_14 = var5_5;
                                                                    var26_26 = var25_10;
                                                                    var11_16 = var3_3;
                                                                    if (var16_19 != false) break;
                                                                    var9_14 = n3.o((byte[])var2_2, (int)var10_17, (p3)var26_26);
                                                                    var27_11.putInt(var28_7, var20_23, G3.e(var26_26.a));
lbl100: // 3 sources:
                                                                    do {
                                                                        var10_17 = var5_5;
                                                                        var11_16 = var13_9 | var18_21;
                                                                        var13_9 = var10_17;
                                                                        var10_17 = var11_16;
lbl105: // 2 sources:
                                                                        do {
                                                                            var26_26 = var27_11;
                                                                            var11_16 = var4_4;
lbl108: // 3 sources:
                                                                            do {
                                                                                var15_18 = var7_13;
                                                                                var7_13 = var3_3;
                                                                                var14_12 = var8_15;
                                                                                var8_15 = var15_18;
lbl113: // 2 sources:
                                                                                do {
                                                                                    var15_18 = var12_8;
                                                                                    var3_3 = var9_14;
                                                                                    var9_14 = var10_17;
                                                                                    var27_11 = var26_26;
                                                                                    var12_8 = var11_16;
                                                                                    var11_16 = var15_18;
                                                                                    continue block48;
                                                                                    break;
                                                                                } while (true);
                                                                                break;
                                                                            } while (true);
                                                                            break;
                                                                        } while (true);
                                                                        break;
                                                                    } while (true);
                                                                }
                                                                case 12: {
                                                                    var9_14 = var4_4;
                                                                    var14_12 = var5_5;
                                                                    var29_27 = var25_10;
                                                                    var17_20 = var8_15;
                                                                    var15_18 = var3_3;
                                                                    var9_14 = var7_13;
                                                                    var26_26 = var27_11;
                                                                    var9_14 = var14_12;
                                                                    var11_16 = var15_18;
                                                                    if (var16_19 != false) break;
                                                                    var16_19 = n3.o((byte[])var2_2, (int)var10_17, (p3)var29_27);
                                                                    var9_14 = var29_27.a;
                                                                    var29_27 = this.M((int)var17_20);
                                                                    if ((var19_22 & Integer.MIN_VALUE) != 0 && var29_27 != null && !var29_27.e((int)var9_14)) {
                                                                        M4.O(var1_1).e((int)var15_18, (long)var9_14);
                                                                        var9_14 = var13_9;
lbl138: // 2 sources:
                                                                        do {
                                                                            var11_16 = var12_8;
                                                                            var10_17 = var3_3;
                                                                            var15_18 = var8_15;
                                                                            var12_8 = var4_4;
                                                                            var3_3 = var16_19;
                                                                            var13_9 = var14_12;
                                                                            var8_15 = var7_13;
                                                                            var14_12 = var15_18;
                                                                            var7_13 = var10_17;
                                                                            continue block48;
                                                                            break;
                                                                        } while (true);
                                                                    }
                                                                    var26_26.putInt(var28_7, var20_23, (int)var9_14);
                                                                    var9_14 = var13_9 | var18_21;
                                                                    ** continue;
                                                                }
                                                                case 10: {
                                                                    var14_12 = var5_5;
                                                                    var26_26 = var25_10;
                                                                    var29_27 = var27_11;
                                                                    if (var16_19 == 2) {
                                                                        var9_14 = n3.j((byte[])var2_2, (int)var10_17, (p3)var26_26);
                                                                        var29_27.putObject(var28_7, var20_23, var26_26.c);
                                                                        var10_17 = var13_9 | var18_21;
                                                                        var11_16 = var4_4;
                                                                        var15_18 = var8_15;
                                                                        var25_10 = var26_26;
                                                                        var26_26 = var29_27;
                                                                        var13_9 = var14_12;
                                                                        var8_15 = var7_13;
                                                                        var14_12 = var15_18;
                                                                        var7_13 = var3_3;
                                                                        ** continue;
                                                                    }
                                                                    do {
                                                                        var9_14 = var5_5;
                                                                        var11_16 = var3_3;
                                                                        break block0;
                                                                        break;
                                                                    } while (true);
                                                                }
                                                                case 9: {
                                                                    var11_16 = var8_15;
                                                                    if (var16_19 != 2) ** continue;
                                                                    var26_26 = this.p(var28_7, (int)var11_16);
                                                                    var9_14 = n3.i(var26_26, this.N((int)var11_16), (byte[])var2_2, (int)var10_17, (int)var4_4, (p3)var6_6);
                                                                    this.x(var28_7, (int)var11_16, var26_26);
                                                                    var10_17 = var13_9 | var18_21;
                                                                    var26_26 = var27_11;
                                                                    var11_16 = var4_4;
                                                                    var13_9 = var5_5;
                                                                    ** GOTO lbl108
                                                                }
                                                                case 8: {
                                                                    var26_26 = var25_10;
                                                                    var9_14 = var10_17;
                                                                    if (var16_19 == 2) {
                                                                        if (M4.S(var19_22)) {
                                                                            var9_14 = n3.m((byte[])var2_2, (int)var9_14, (p3)var26_26);
                                                                        } else {
                                                                            var9_14 = n3.o((byte[])var2_2, (int)var9_14, (p3)var26_26);
                                                                            var10_17 = var26_26.a;
                                                                            if (var10_17 < 0) throw k4.d();
                                                                            if (var10_17 == false) {
                                                                                var26_26.c = "";
                                                                            } else {
                                                                                var26_26.c = new String((byte[])var2_2, (int)var9_14, (int)var10_17, a4.b);
                                                                                var9_14 += var10_17;
                                                                            }
                                                                        }
                                                                        var27_11.putObject(var28_7, var20_23, var26_26.c);
lbl200: // 4 sources:
                                                                        do {
                                                                            var10_17 = var13_9 | var18_21;
                                                                            var13_9 = var5_5;
                                                                            ** continue;
                                                                            break;
                                                                        } while (true);
                                                                    }
lbl204: // 7 sources:
                                                                    do {
                                                                        var9_14 = var5_5;
                                                                        var11_16 = var3_3;
                                                                        break block0;
                                                                        break;
                                                                    } while (true);
                                                                }
                                                                case 7: {
                                                                    var26_26 = var25_10;
                                                                    if (var16_19 != false) ** GOTO lbl204
                                                                    var9_14 = n3.p((byte[])var2_2, (int)var10_17, (p3)var26_26);
                                                                    var24_25 = var26_26.b != 0L;
                                                                    D5.v(var28_7, var20_23, var24_25);
                                                                    ** GOTO lbl200
                                                                }
                                                                case 6: 
                                                                case 13: {
                                                                    var9_14 = var10_17;
                                                                    if (var16_19 != 5) ** GOTO lbl204
                                                                    var27_11.putInt(var28_7, var20_23, n3.n((byte[])var2_2, (int)var9_14));
                                                                    var9_14 += 4;
                                                                    ** GOTO lbl200
                                                                }
                                                                case 5: 
                                                                case 14: {
                                                                    var9_14 = var10_17;
                                                                    var26_26 = var27_11;
                                                                    if (var16_19 != true) ** GOTO lbl204
                                                                    var26_26.putLong(var1_1, var20_23, n3.q((byte[])var2_2, (int)var9_14));
                                                                    var9_14 += 8;
                                                                    var10_17 = var13_9 | var18_21;
                                                                    var11_16 = var4_4;
                                                                    var13_9 = var5_5;
                                                                    ** continue;
                                                                }
                                                                case 4: 
                                                                case 11: {
                                                                    var26_26 = var25_10;
                                                                    if (var16_19 != false) ** GOTO lbl204
                                                                    var9_14 = n3.o((byte[])var2_2, (int)var10_17, (p3)var26_26);
                                                                    var27_11.putInt(var28_7, var20_23, var26_26.a);
                                                                    ** continue;
                                                                }
                                                                case 2: 
                                                                case 3: {
                                                                    var26_26 = var25_10;
                                                                    var29_27 = var27_11;
                                                                    if (var16_19 != false) ** continue;
                                                                    var9_14 = n3.p((byte[])var2_2, (int)var10_17, (p3)var26_26);
                                                                    var29_27.putLong(var1_1, var20_23, var26_26.b);
                                                                    var10_17 = var13_9 | var18_21;
                                                                    ** continue;
                                                                }
                                                                case 1: {
                                                                    var9_14 = var5_5;
                                                                    var14_12 = var10_17;
                                                                    var11_16 = var3_3;
                                                                    if (var16_19 != 5) break;
                                                                    D5.g(var28_7, var20_23, n3.l((byte[])var2_2, (int)var14_12));
                                                                    var9_14 = var14_12 + 4;
                                                                    ** GOTO lbl100
                                                                }
                                                                case 0: {
                                                                    var9_14 = var5_5;
                                                                    var14_12 = var10_17;
                                                                    var11_16 = var3_3;
                                                                    if (var16_19 != true) break;
                                                                    D5.f(var28_7, var20_23, n3.a((byte[])var2_2, (int)var14_12));
                                                                    var9_14 = var14_12 + 8;
                                                                    ** continue;
                                                                }
                                                            }
                                                            var3_3 = var10_17;
                                                            var10_17 = var8_15;
                                                            var14_12 = var7_13;
                                                            var7_13 = var11_16;
                                                            var8_15 = var4_4;
                                                            var11_16 = var3_3;
                                                            var26_26 = var25_10;
                                                            var3_3 = var9_14;
                                                            var9_14 = var13_9;
                                                            var13_9 = var14_12;
                                                            var25_10 = var27_11;
                                                            break block135;
                                                        }
                                                        var13_9 = var5_5;
                                                        var14_12 = var11_16;
                                                        var26_26 = var25_10;
                                                        var11_16 = var10_17;
                                                        var12_8 = 10;
                                                        if (var17_20 != 27) break block137;
                                                        if (var16_19 == 2) {
                                                            var25_10 = var29_27 = (h4)var27_11.getObject(var28_7, var20_23);
                                                            if (!var29_27.c()) {
                                                                var10_17 = var29_27.size();
                                                                if (var10_17 != false) {
                                                                    var12_8 = var10_17 << 1;
                                                                }
                                                                var25_10 = var29_27.e((int)var12_8);
                                                                var27_11.putObject(var28_7, var20_23, var25_10);
                                                            }
                                                            var29_27 = this.N((int)var8_15);
                                                            var15_18 = n3.e((Z4)var29_27, (int)var3_3, (byte[])var2_2, (int)var11_16, (int)var4_4, (h4)var25_10, (p3)var6_6);
                                                            var12_8 = var4_4;
                                                            var10_17 = var8_15;
                                                            var8_15 = var7_13;
                                                            var7_13 = var3_3;
                                                            var11_16 = var14_12;
                                                            var25_10 = var26_26;
                                                            var3_3 = var15_18;
                                                            var14_12 = var10_17;
                                                            continue;
                                                        }
                                                        break block138;
                                                    }
                                                    if (var17_20 > 49) break block139;
                                                    var22_24 = var19_22;
                                                    var31_29 = M4.s;
                                                    var30_28 = (h4)var31_29.getObject(var28_7, var20_23);
                                                    var29_27 = var30_28;
                                                    if (!var30_28.c()) {
                                                        var13_9 = var30_28.size();
                                                        if (var13_9 != false) {
                                                            var12_8 = var13_9 << 1;
                                                        }
                                                        var29_27 = var30_28.e((int)var12_8);
                                                        var31_29.putObject(var28_7, var20_23, var29_27);
                                                    }
                                                    block16 : switch (var17_20) {
                                                        default: {
                                                            var10_17 = var8_15;
                                                            var8_15 = var3_3;
                                                            var3_3 = var11_16;
                                                            var25_10 = var26_26;
                                                            break;
                                                        }
                                                        case 49: {
                                                            if (var16_19 == 3) {
                                                                var25_10 = this.N((int)var8_15);
                                                                var13_9 = var3_3;
                                                                var15_18 = var13_9 & -8 | 4;
                                                                var12_8 = n3.f((Z4)var25_10, (byte[])var2_2, (int)var11_16, (int)var4_4, (int)var15_18, (p3)var6_6);
                                                                do {
                                                                    var29_27.add(var26_26.c);
                                                                    var10_17 = var12_8;
                                                                    if (var12_8 >= var4_4) break;
                                                                    var16_19 = n3.o((byte[])var2_2, (int)var12_8, (p3)var26_26);
                                                                    var10_17 = var12_8;
                                                                    if (var13_9 != var26_26.a) break;
                                                                    var12_8 = n3.f((Z4)var25_10, (byte[])var2_2, (int)var16_19, (int)var4_4, (int)var15_18, (p3)var6_6);
                                                                } while (true);
lbl334: // 11 sources:
                                                                do {
                                                                    var12_8 = var8_15;
                                                                    var8_15 = var3_3;
                                                                    var3_3 = var10_17;
                                                                    var10_17 = var12_8;
                                                                    var25_10 = var26_26;
                                                                    break block131;
                                                                    break;
                                                                } while (true);
                                                            }
                                                            var10_17 = var8_15;
                                                            var8_15 = var3_3;
                                                            var3_3 = var11_16;
                                                            var25_10 = var26_26;
                                                            break;
                                                        }
                                                        case 34: 
                                                        case 48: {
                                                            if (var16_19 != 2) ** GOTO lbl357
                                                            var25_10 = (w4)var29_27;
                                                            var10_17 = n3.o((byte[])var2_2, (int)var11_16, (p3)var26_26);
                                                            var12_8 = var26_26.a + var10_17;
                                                            while (var10_17 < var12_8) {
                                                                var10_17 = n3.p((byte[])var2_2, (int)var10_17, (p3)var26_26);
                                                                var25_10.d(G3.b(var26_26.b));
                                                            }
                                                            if (var10_17 == var12_8) ** GOTO lbl334
                                                            throw k4.f();
lbl357: // 1 sources:
                                                            if (var16_19 != false) ** GOTO lbl369
                                                            var25_10 = (w4)var29_27;
                                                            var12_8 = n3.p((byte[])var2_2, (int)var11_16, (p3)var26_26);
                                                            do {
                                                                var25_10.d(G3.b(var26_26.b));
                                                                var10_17 = var12_8;
                                                                if (var12_8 >= var4_4) ** GOTO lbl334
                                                                var13_9 = n3.o((byte[])var2_2, (int)var12_8, (p3)var26_26);
                                                                var10_17 = var12_8;
                                                                if (var3_3 != var26_26.a) ** GOTO lbl334
                                                                var12_8 = n3.p((byte[])var2_2, (int)var13_9, (p3)var26_26);
                                                            } while (true);
lbl369: // 5 sources:
                                                            do {
                                                                var10_17 = var8_15;
                                                                var8_15 = var3_3;
                                                                var3_3 = var11_16;
                                                                var25_10 = var26_26;
                                                                break block16;
                                                                break;
                                                            } while (true);
                                                        }
                                                        case 33: 
                                                        case 47: {
                                                            if (var16_19 != 2) ** GOTO lbl386
                                                            var25_10 = (c4)var29_27;
                                                            var10_17 = n3.o((byte[])var2_2, (int)var11_16, (p3)var26_26);
                                                            var12_8 = var26_26.a + var10_17;
                                                            while (var10_17 < var12_8) {
                                                                var10_17 = n3.o((byte[])var2_2, (int)var10_17, (p3)var26_26);
                                                                var25_10.g(G3.e(var26_26.a));
                                                            }
                                                            if (var10_17 == var12_8) ** GOTO lbl334
                                                            throw k4.f();
lbl386: // 1 sources:
                                                            if (var16_19 != false) ** GOTO lbl369
                                                            var25_10 = (c4)var29_27;
                                                            var12_8 = n3.o((byte[])var2_2, (int)var11_16, (p3)var26_26);
                                                            do {
                                                                var25_10.g(G3.e(var26_26.a));
                                                                var10_17 = var12_8;
                                                                if (var12_8 >= var4_4) ** GOTO lbl334
                                                                var13_9 = n3.o((byte[])var2_2, (int)var12_8, (p3)var26_26);
                                                                var10_17 = var12_8;
                                                                if (var3_3 != var26_26.a) ** GOTO lbl334
                                                                var12_8 = n3.o((byte[])var2_2, (int)var13_9, (p3)var26_26);
                                                            } while (true);
                                                        }
                                                        case 30: 
                                                        case 44: {
                                                            if (var16_19 != 2) ** GOTO lbl402
                                                            var10_17 = n3.k((byte[])var2_2, (int)var11_16, (h4)var29_27, (p3)var26_26);
                                                            ** GOTO lbl404
lbl402: // 1 sources:
                                                            if (var16_19 != false) ** GOTO lbl369
                                                            var10_17 = n3.b((int)var3_3, (byte[])var2_2, (int)var11_16, (int)var4_4, (h4)var29_27, (p3)var6_6);
lbl404: // 2 sources:
                                                            a5.h(var1_1, (int)var7_13, (List)var29_27, this.M((int)var8_15), null, this.o);
                                                            ** GOTO lbl334
                                                        }
                                                        case 28: {
                                                            if (var16_19 != 2) ** GOTO lbl369
                                                            var13_9 = n3.o((byte[])var2_2, (int)var11_16, (p3)var26_26);
                                                            var15_18 = var26_26.a;
                                                            if (var15_18 < 0) throw k4.d();
                                                            if (var15_18 > var2_2.length - var13_9) throw k4.f();
                                                            var10_17 = var13_9;
                                                            var12_8 = var15_18;
                                                            if (var15_18 != false) ** GOTO lbl419
                                                            var12_8 = var13_9;
                                                            do {
                                                                var29_27.add((Object)q3.p);
                                                                ** GOTO lbl422
lbl419: // 1 sources:
                                                                do {
                                                                    var29_27.add((Object)q3.q((byte[])var2_2, (int)var10_17, (int)var12_8));
                                                                    var12_8 = var10_17 + var12_8;
lbl422: // 2 sources:
                                                                    var10_17 = var12_8;
                                                                    if (var12_8 >= var4_4) ** GOTO lbl334
                                                                    var13_9 = n3.o((byte[])var2_2, (int)var12_8, (p3)var26_26);
                                                                    var10_17 = var12_8;
                                                                    if (var3_3 == var26_26.a) ** break;
                                                                    ** continue;
                                                                    var13_9 = n3.o((byte[])var2_2, (int)var13_9, (p3)var26_26);
                                                                    var15_18 = var26_26.a;
                                                                    if (var15_18 < 0) throw k4.d();
                                                                    if (var15_18 > var2_2.length - var13_9) throw k4.f();
                                                                    var10_17 = var13_9;
                                                                    var12_8 = var15_18;
                                                                } while (var15_18 != false);
                                                                var12_8 = var13_9;
                                                            } while (true);
                                                        }
                                                        case 27: {
                                                            var12_8 = var3_3;
                                                            if (var16_19 != 2) ** continue;
                                                            var11_16 = n3.e(this.N((int)var8_15), (int)var12_8, (byte[])var2_2, (int)var11_16, (int)var4_4, (h4)var29_27, (p3)var6_6);
lbl441: // 9 sources:
                                                            do {
                                                                var12_8 = var11_16;
                                                                var11_16 = var10_17;
                                                                var10_17 = var3_3;
                                                                var13_9 = var8_15;
                                                                var3_3 = var12_8;
                                                                var8_15 = var10_17;
                                                                var10_17 = var13_9;
                                                                break block131;
                                                                break;
                                                            } while (true);
                                                        }
                                                        case 26: {
                                                            var13_9 = var4_4;
                                                            var28_7 = var26_26;
                                                            var15_18 = var3_3;
                                                            if (var16_19 != 2) ** GOTO lbl502
                                                            if ((var22_24 & 0x20000000L) != 0L) ** GOTO lbl477
                                                            var12_8 = n3.o((byte[])var2_2, (int)var11_16, (p3)var28_7);
                                                            var11_16 = var28_7.a;
                                                            if (var11_16 < 0) throw k4.d();
                                                            if (var11_16 != false) ** GOTO lbl462
lbl460: // 2 sources:
                                                            var29_27.add((Object)"");
                                                            ** GOTO lbl466
lbl462: // 1 sources:
                                                            var26_26 = new String((byte[])var2_2, (int)var12_8, (int)var11_16, a4.b);
                                                            do {
                                                                var29_27.add(var26_26);
                                                                var12_8 += var11_16;
lbl466: // 2 sources:
                                                                var11_16 = var12_8;
                                                                if (var12_8 >= var13_9) ** GOTO lbl441
                                                                var16_19 = n3.o((byte[])var2_2, (int)var12_8, (p3)var28_7);
                                                                var11_16 = var12_8;
                                                                if (var15_18 != var28_7.a) ** GOTO lbl441
                                                                var12_8 = n3.o((byte[])var2_2, (int)var16_19, (p3)var28_7);
                                                                var11_16 = var28_7.a;
                                                                if (var11_16 < 0) throw k4.d();
                                                                if (var11_16 == false) ** GOTO lbl460
                                                                var26_26 = new String((byte[])var2_2, (int)var12_8, (int)var11_16, a4.b);
                                                            } while (true);
lbl477: // 1 sources:
                                                            var12_8 = n3.o((byte[])var2_2, (int)var11_16, (p3)var28_7);
                                                            var16_19 = var28_7.a;
                                                            if (var16_19 < 0) throw k4.d();
                                                            if (var16_19 != false) ** GOTO lbl483
lbl481: // 2 sources:
                                                            var29_27.add((Object)"");
                                                            ** GOTO lbl489
lbl483: // 1 sources:
                                                            var11_16 = var12_8 + var16_19;
                                                            if (!E5.f((byte[])var2_2, (int)var12_8, (int)var11_16)) throw k4.c();
                                                            var26_26 = new String((byte[])var2_2, (int)var12_8, (int)var16_19, a4.b);
                                                            do {
                                                                var29_27.add(var26_26);
                                                                var12_8 = var11_16;
lbl489: // 2 sources:
                                                                var11_16 = var12_8;
                                                                if (var12_8 >= var13_9) ** GOTO lbl441
                                                                var16_19 = n3.o((byte[])var2_2, (int)var12_8, (p3)var28_7);
                                                                var11_16 = var12_8;
                                                                if (var15_18 != var28_7.a) ** GOTO lbl441
                                                                var12_8 = n3.o((byte[])var2_2, (int)var16_19, (p3)var28_7);
                                                                var16_19 = var28_7.a;
                                                                if (var16_19 < 0) throw k4.d();
                                                                if (var16_19 == false) ** GOTO lbl481
                                                                var11_16 = var12_8 + var16_19;
                                                                if (!E5.f((byte[])var2_2, (int)var12_8, (int)var11_16)) throw k4.c();
                                                                var26_26 = new String((byte[])var2_2, (int)var12_8, (int)var16_19, a4.b);
                                                            } while (true);
lbl502: // 5 sources:
                                                            do {
                                                                var11_16 = var10_17;
                                                                var10_17 = var8_15;
                                                                var8_15 = var3_3;
                                                                var3_3 = var11_16;
                                                                break block16;
                                                                break;
                                                            } while (true);
                                                        }
                                                        case 25: 
                                                        case 42: {
                                                            if (var16_19 != 2) ** GOTO lbl518
                                                            a.a(var29_27);
                                                            var11_16 = n3.o((byte[])var2_2, (int)var11_16, (p3)var26_26);
                                                            var12_8 = var26_26.a + var11_16;
                                                            if (var11_16 < var12_8) ** GOTO lbl516
                                                            if (var11_16 == var12_8) ** GOTO lbl441
                                                            throw k4.f();
lbl516: // 1 sources:
                                                            n3.p((byte[])var2_2, (int)var11_16, (p3)var26_26);
                                                            throw null;
lbl518: // 1 sources:
                                                            if (var16_19 != false) ** GOTO lbl502
                                                            a.a(var29_27);
                                                            n3.p((byte[])var2_2, (int)var11_16, (p3)var26_26);
                                                            var20_23 = var26_26.b;
                                                            throw null;
                                                        }
                                                        case 24: 
                                                        case 31: 
                                                        case 41: 
                                                        case 45: {
                                                            if (var16_19 != 2) ** GOTO lbl532
                                                            var28_7 = (c4)var29_27;
                                                            var12_8 = var26_26.a + var11_16;
                                                            for (var11_16 = (Object)n3.o((byte[])var2_2, (int)var11_16, (p3)var26_26); var11_16 < var12_8; var11_16 += 4) {
                                                                var28_7.g(n3.n((byte[])var2_2, (int)var11_16));
                                                            }
                                                            if (var11_16 == var12_8) ** GOTO lbl441
                                                            throw k4.f();
lbl532: // 1 sources:
                                                            if (var16_19 != 5) ** GOTO lbl502
                                                            var28_7 = (c4)var29_27;
                                                            var28_7.g(n3.n((byte[])var2_2, (int)var11_16));
                                                            var12_8 = var11_16 + 4;
                                                            do {
                                                                var11_16 = var12_8;
                                                                if (var12_8 >= var4_4) break;
                                                                var13_9 = n3.o((byte[])var2_2, (int)var12_8, (p3)var26_26);
                                                                var11_16 = var12_8;
                                                                if (var3_3 != var26_26.a) break;
                                                                var28_7.g(n3.n((byte[])var2_2, (int)var13_9));
                                                                var12_8 = var13_9 + 4;
                                                            } while (true);
lbl545: // 4 sources:
                                                            do {
                                                                var12_8 = var10_17;
                                                                var10_17 = var3_3;
                                                                var13_9 = var8_15;
                                                                var3_3 = var11_16;
                                                                var8_15 = var10_17;
                                                                var10_17 = var13_9;
                                                                var11_16 = var12_8;
                                                                break block131;
                                                                break;
                                                            } while (true);
                                                        }
                                                        case 23: 
                                                        case 32: 
                                                        case 40: 
                                                        case 46: {
                                                            if (var16_19 != 2) ** GOTO lbl563
                                                            var28_7 = (w4)var29_27;
                                                            var12_8 = var26_26.a + var11_16;
                                                            for (var11_16 = (Object)n3.o((byte[])var2_2, (int)var11_16, (p3)var26_26); var11_16 < var12_8; var11_16 += 8) {
                                                                var28_7.d(n3.q((byte[])var2_2, (int)var11_16));
                                                            }
                                                            if (var11_16 == var12_8) ** GOTO lbl441
                                                            throw k4.f();
lbl563: // 1 sources:
                                                            if (var16_19 != true) ** GOTO lbl502
                                                            var28_7 = (w4)var29_27;
                                                            var28_7.d(n3.q((byte[])var2_2, (int)var11_16));
                                                            var12_8 = var11_16 + 8;
                                                            do {
                                                                var11_16 = var12_8;
                                                                if (var12_8 >= var4_4) ** GOTO lbl545
                                                                var13_9 = n3.o((byte[])var2_2, (int)var12_8, (p3)var26_26);
                                                                var11_16 = var12_8;
                                                                if (var3_3 != var26_26.a) ** continue;
                                                                var28_7.d(n3.q((byte[])var2_2, (int)var13_9));
                                                                var12_8 = var13_9 + 8;
                                                            } while (true);
                                                        }
                                                        case 22: 
                                                        case 29: 
                                                        case 39: 
                                                        case 43: {
                                                            var12_8 = var11_16;
                                                            var13_9 = var3_3;
                                                            if (var16_19 == 2) {
                                                                var11_16 = n3.k((byte[])var2_2, (int)var12_8, (h4)var29_27, (p3)var26_26);
                                                                ** continue;
                                                            }
                                                            if (var16_19 != false) ** continue;
                                                            var25_10 = var26_26;
                                                            var11_16 = var12_8;
                                                            var10_17 = var13_9;
                                                            var15_18 = var8_15;
                                                            var3_3 = n3.b((int)var13_9, (byte[])var2_2, (int)var12_8, (int)var4_4, (h4)var29_27, (p3)var6_6);
                                                            var8_15 = var10_17;
                                                            var10_17 = var15_18;
                                                            break block131;
                                                        }
                                                        case 20: 
                                                        case 21: 
                                                        case 37: 
                                                        case 38: {
                                                            var12_8 = var8_15;
                                                            var13_9 = var11_16;
                                                            var15_18 = var3_3;
                                                            if (var16_19 != 2) ** GOTO lbl609
                                                            var25_10 = (w4)var29_27;
                                                            var3_3 = n3.o((byte[])var2_2, (int)var13_9, (p3)var26_26);
                                                            var8_15 = var26_26.a + var3_3;
                                                            while (var3_3 < var8_15) {
                                                                var3_3 = n3.p((byte[])var2_2, (int)var3_3, (p3)var26_26);
                                                                var25_10.d(var26_26.b);
                                                            }
                                                            if (var3_3 != var8_15) throw k4.f();
                                                            var8_15 = var15_18;
                                                            var10_17 = var12_8;
                                                            var11_16 = var13_9;
                                                            var25_10 = var26_26;
                                                            break block131;
lbl609: // 1 sources:
                                                            var8_15 = var15_18;
                                                            var10_17 = var12_8;
                                                            var3_3 = var13_9;
                                                            var25_10 = var26_26;
                                                            if (var16_19 != false) break;
                                                            var28_7 = (w4)var29_27;
                                                            var16_19 = n3.p((byte[])var2_2, (int)var13_9, (p3)var26_26);
                                                            do {
                                                                var28_7.d(var26_26.b);
                                                                var3_3 = var16_19;
                                                                var8_15 = var15_18;
                                                                var10_17 = var12_8;
                                                                var11_16 = var13_9;
                                                                var25_10 = var26_26;
                                                                if (var16_19 < var4_4) {
                                                                    var17_20 = n3.o((byte[])var2_2, (int)var16_19, (p3)var26_26);
                                                                    var3_3 = var16_19;
                                                                    var8_15 = var15_18;
                                                                    var10_17 = var12_8;
                                                                    var11_16 = var13_9;
                                                                    var25_10 = var26_26;
                                                                    if (var15_18 == var26_26.a) {
                                                                        var16_19 = n3.p((byte[])var2_2, (int)var17_20, (p3)var26_26);
                                                                        continue;
                                                                    }
                                                                }
                                                                break block131;
                                                                break;
                                                            } while (true);
                                                        }
                                                        case 19: 
                                                        case 36: {
                                                            var10_17 = var8_15;
                                                            var8_15 = var3_3;
                                                            if (var16_19 != 2) ** GOTO lbl647
                                                            a.a(var29_27);
                                                            var3_3 = n3.o((byte[])var2_2, (int)var11_16, (p3)var26_26);
                                                            var12_8 = var26_26.a + var3_3;
                                                            if (var3_3 < var12_8) ** GOTO lbl645
                                                            if (var3_3 != var12_8) throw k4.f();
                                                            var25_10 = var26_26;
                                                            break block131;
lbl645: // 1 sources:
                                                            n3.l((byte[])var2_2, (int)var3_3);
                                                            throw null;
lbl647: // 1 sources:
                                                            if (var16_19 != 5) {
                                                                var3_3 = var11_16;
                                                                var25_10 = var26_26;
                                                                break;
                                                            }
                                                            a.a(var29_27);
                                                            n3.l((byte[])var2_2, (int)var11_16);
                                                            throw null;
                                                        }
                                                        case 18: 
                                                        case 35: {
                                                            var10_17 = var8_15;
                                                            var8_15 = var3_3;
                                                            if (var16_19 != 2) ** GOTO lbl667
                                                            a.a(var29_27);
                                                            var3_3 = n3.o((byte[])var2_2, (int)var11_16, (p3)var26_26);
                                                            var12_8 = var26_26.a + var3_3;
                                                            if (var3_3 < var12_8) ** GOTO lbl665
                                                            if (var3_3 != var12_8) throw k4.f();
                                                            var25_10 = var26_26;
                                                            break block131;
lbl665: // 1 sources:
                                                            n3.a((byte[])var2_2, (int)var3_3);
                                                            throw null;
lbl667: // 1 sources:
                                                            if (var16_19 == true) break block140;
                                                            var25_10 = var26_26;
                                                            var3_3 = var11_16;
                                                        }
                                                    }
                                                    var12_8 = var3_3;
                                                    var11_16 = var3_3;
                                                    var3_3 = var12_8;
                                                }
                                                var12_8 = var4_4;
                                                if (var3_3 != var11_16) break block141;
                                                var15_18 = var12_8;
                                                var12_8 = var8_15;
                                                var13_9 = var7_13;
                                                var28_7 = var1_1;
                                                var7_13 = var5_5;
                                                var11_16 = var3_3;
                                                var26_26 = var25_10;
                                                var8_15 = var15_18;
                                                var3_3 = var7_13;
                                                var7_13 = var12_8;
                                                var12_8 = var14_12;
                                                var25_10 = var27_11;
                                                break block135;
                                            }
                                            var13_9 = var5_5;
                                            var15_18 = var7_13;
                                            var11_16 = var14_12;
                                            var28_7 = var1_1;
                                            var7_13 = var8_15;
                                            var8_15 = var15_18;
lbl696: // 2 sources:
                                            do {
                                                var14_12 = var10_17;
                                                continue block48;
                                                break;
                                            } while (true);
                                        }
                                        a.a(var29_27);
                                        n3.a((byte[])var2_2, (int)var11_16);
                                        throw null;
                                    }
                                    var29_27 = var27_11;
                                    var13_9 = var8_15;
                                    var15_18 = var11_16;
                                    var11_16 = var3_3;
                                    if (var17_20 != 50) break block142;
                                    if (var16_19 == 2) {
                                        var28_7 = M4.s;
                                        var27_11 = this.Q((int)var13_9);
                                        var6_6 = var25_10 = var28_7.getObject(var1_1, var20_23);
                                        if (this.q.g(var25_10)) {
                                            var6_6 = this.q.f(var27_11);
                                            this.q.d(var6_6, var25_10);
                                            var28_7.putObject(var1_1, var20_23, var6_6);
                                        }
                                        this.q.b(var27_11);
                                        this.q.h(var6_6);
                                        var3_3 = n3.o((byte[])var2_2, (int)var15_18, (p3)var26_26);
                                        var5_5 = var26_26.a;
                                        if (var5_5 < 0 || var5_5 > var4_4 - var3_3) throw k4.f();
                                        throw null;
                                    }
                                    var28_7 = var1_1;
                                }
                                var25_10 = var27_11;
                                var15_18 = var5_5;
                                var12_8 = var3_3;
                                var13_9 = var7_13;
                                var7_13 = var8_15;
                                var8_15 = var4_4;
                                var11_16 = var10_17;
                                var3_3 = var15_18;
                                var10_17 = var7_13;
                                var7_13 = var12_8;
                                var12_8 = var14_12;
                                break block135;
                            }
                            var28_7 = var1_1;
                            var30_28 = M4.s;
                            var22_24 = var31_29[var13_9 + 2] & 1048575;
                            block32 : switch (var17_20) {
                                do {
                                    default: {
                                        var12_8 = var11_16;
                                        var11_16 = var7_13;
                                        break block32;
                                    }
                                    break;
                                } while (true);
                                case 68: {
                                    if (var16_19 != 3) ** continue;
                                    var26_26 = this.q(var28_7, (int)var7_13, (int)var13_9);
                                    var3_3 = n3.h(var26_26, this.N((int)var13_9), (byte[])var2_2, (int)var15_18, (int)var4_4, var11_16 & -8 | 4, (p3)var6_6);
                                    this.w(var28_7, (int)var7_13, (int)var13_9, var26_26);
                                    var12_8 = var11_16;
                                    var11_16 = var7_13;
lbl754: // 2 sources:
                                    do {
                                        var26_26 = var25_10;
                                        break block132;
                                        break;
                                    } while (true);
                                }
                                case 67: {
                                    if (var16_19 == false) {
                                        var11_16 = n3.p((byte[])var2_2, (int)var15_18, (p3)var26_26);
                                        var30_28.putObject(var28_7, var20_23, (Object)G3.b(var26_26.b));
                                        var30_28.putInt(var28_7, var22_24, (int)var7_13);
lbl762: // 3 sources:
                                        do {
                                            var12_8 = var3_3;
                                            var3_3 = var11_16;
                                            var11_16 = var7_13;
                                            ** continue;
                                            break;
                                        } while (true);
                                    }
lbl767: // 6 sources:
                                    do {
                                        var26_26 = var25_10;
                                        var11_16 = var7_13;
                                        var12_8 = var3_3;
                                        break block32;
                                        break;
                                    } while (true);
                                }
                                case 66: {
                                    if (var16_19 != false) ** GOTO lbl767
                                    var11_16 = n3.o((byte[])var2_2, (int)var15_18, (p3)var26_26);
                                    var26_26 = G3.e(var26_26.a);
lbl776: // 3 sources:
                                    do {
                                        var30_28.putObject(var28_7, var20_23, var26_26);
                                        var30_28.putInt(var28_7, var22_24, (int)var7_13);
                                        ** GOTO lbl762
                                        break;
                                    } while (true);
                                }
                                case 63: {
                                    if (var16_19 != false) ** GOTO lbl767
                                    var12_8 = n3.o((byte[])var2_2, (int)var15_18, (p3)var26_26);
                                    var15_18 = var26_26.a;
                                    var26_26 = this.M((int)var13_9);
                                    if (var26_26 != null && !var26_26.e((int)var15_18)) {
                                        M4.O(var1_1).e((int)var11_16, (long)var15_18);
                                        var11_16 = var12_8;
                                        ** continue;
                                    }
                                    var26_26 = (int)var15_18;
                                    var11_16 = var12_8;
                                    ** GOTO lbl776
                                }
                                case 61: {
                                    if (var16_19 != 2) ** GOTO lbl767
                                    var11_16 = n3.j((byte[])var2_2, (int)var15_18, (p3)var26_26);
                                    var26_26 = var26_26.c;
                                    ** continue;
                                }
                                case 60: {
                                    var12_8 = var7_13;
                                    if (var16_19 != 2) ** continue;
                                    var25_10 = this.q(var28_7, (int)var12_8, (int)var13_9);
                                    var27_11 = this.N((int)var13_9);
                                    var7_13 = var11_16;
                                    var3_3 = n3.i(var25_10, (Z4)var27_11, (byte[])var2_2, (int)var15_18, (int)var4_4, (p3)var6_6);
                                    this.w(var28_7, (int)var12_8, (int)var13_9, var25_10);
                                    var11_16 = var12_8;
                                    var12_8 = var7_13;
                                    break block132;
                                }
                                case 59: {
                                    var25_10 = var26_26;
                                    var13_9 = var11_16;
                                    var26_26 = var25_10;
                                    var11_16 = var7_13;
                                    var12_8 = var13_9;
                                    if (var16_19 != 2) break;
                                    var3_3 = n3.o((byte[])var2_2, (int)var15_18, (p3)var25_10);
                                    var11_16 = var25_10.a;
                                    if (var11_16 == false) {
                                        var30_28.putObject(var28_7, var20_23, (Object)"");
                                    } else {
                                        if ((var19_22 & 536870912) != 0 && !E5.f((byte[])var2_2, (int)var3_3, (int)(var3_3 + var11_16))) {
                                            throw k4.c();
                                        }
                                        var30_28.putObject(var28_7, var20_23, (Object)new String((byte[])var2_2, (int)var3_3, (int)var11_16, a4.b));
                                        var3_3 += var11_16;
                                    }
                                    var30_28.putInt(var28_7, var22_24, (int)var7_13);
                                    var26_26 = var25_10;
                                    var11_16 = var7_13;
                                    var12_8 = var13_9;
                                    break block132;
                                }
                                case 58: {
                                    var27_11 = var26_26;
                                    var12_8 = var7_13;
                                    var13_9 = var11_16;
                                    var26_26 = var27_11;
                                    var11_16 = var12_8;
                                    var12_8 = var13_9;
                                    if (var16_19 != false) break;
                                    var11_16 = n3.p((byte[])var2_2, (int)var15_18, (p3)var27_11);
                                    var24_25 = var27_11.b != 0L;
                                    var26_26 = var24_25;
lbl840: // 3 sources:
                                    do {
                                        var12_8 = var3_3;
                                        var30_28.putObject(var28_7, var20_23, var26_26);
                                        var30_28.putInt(var28_7, var22_24, (int)var7_13);
                                        var3_3 = var11_16;
                                        var26_26 = var25_10;
                                        var11_16 = var7_13;
                                        break block132;
                                        break;
                                    } while (true);
                                }
                                case 57: 
                                case 64: {
                                    var12_8 = var7_13;
                                    var13_9 = var11_16;
                                    var11_16 = var12_8;
                                    var12_8 = var13_9;
                                    if (var16_19 != 5) break;
                                    var26_26 = n3.n((byte[])var2_2, (int)var15_18);
lbl855: // 2 sources:
                                    do {
                                        var30_28.putObject(var28_7, var20_23, var26_26);
                                        var11_16 = var10_17 + 4;
lbl858: // 2 sources:
                                        do {
                                            var12_8 = var3_3;
                                            var30_28.putInt(var28_7, var22_24, (int)var7_13);
                                            var3_3 = var11_16;
                                            var26_26 = var25_10;
                                            var11_16 = var7_13;
                                            break block132;
                                            break;
                                        } while (true);
                                        break;
                                    } while (true);
                                }
                                case 56: 
                                case 65: {
                                    var12_8 = var7_13;
                                    var13_9 = var11_16;
                                    var11_16 = var12_8;
                                    var12_8 = var13_9;
                                    if (var16_19 != true) break;
                                    var26_26 = n3.q((byte[])var2_2, (int)var15_18);
lbl872: // 2 sources:
                                    do {
                                        var30_28.putObject(var28_7, var20_23, var26_26);
                                        var11_16 = var10_17 + 8;
                                        ** continue;
                                        break;
                                    } while (true);
                                }
                                case 55: 
                                case 62: {
                                    var27_11 = var26_26;
                                    var12_8 = var7_13;
                                    var13_9 = var11_16;
                                    var26_26 = var27_11;
                                    var11_16 = var12_8;
                                    var12_8 = var13_9;
                                    if (var16_19 != false) break;
                                    var11_16 = n3.o((byte[])var2_2, (int)var15_18, (p3)var27_11);
                                    var26_26 = var27_11.a;
                                    ** GOTO lbl840
                                }
                                case 53: 
                                case 54: {
                                    var27_11 = var26_26;
                                    var12_8 = var7_13;
                                    var13_9 = var11_16;
                                    var26_26 = var27_11;
                                    var11_16 = var12_8;
                                    var12_8 = var13_9;
                                    if (var16_19 != false) break;
                                    var11_16 = n3.p((byte[])var2_2, (int)var15_18, (p3)var27_11);
                                    var26_26 = var27_11.b;
                                    ** continue;
                                }
                                case 52: {
                                    var12_8 = var7_13;
                                    var13_9 = var11_16;
                                    var11_16 = var12_8;
                                    var12_8 = var13_9;
                                    if (var16_19 != 5) break;
                                    var26_26 = Float.valueOf((float)n3.l((byte[])var2_2, (int)var15_18));
                                    ** continue;
                                }
                                case 51: {
                                    var12_8 = var7_13;
                                    var13_9 = var11_16;
                                    var11_16 = var12_8;
                                    var12_8 = var13_9;
                                    if (var16_19 != true) break;
                                    var26_26 = n3.a((byte[])var2_2, (int)var15_18);
                                    ** continue;
                                }
                            }
                            var3_3 = var10_17;
                        }
                        var7_13 = var8_15;
                        var8_15 = var4_4;
                        if (var3_3 != var10_17) break block143;
                        var16_19 = var5_5;
                        var15_18 = var3_3;
                        var10_17 = var7_13;
                        var7_13 = var12_8;
                        var25_10 = var29_27;
                        var12_8 = var14_12;
                        var13_9 = var11_16;
                        var3_3 = var16_19;
                        var11_16 = var15_18;
                    }
                    if (var7_13 == var3_3 && var3_3 != false) {
                        var5_5 = var8_15;
                        var8_15 = var12_8;
                        var4_4 = var3_3;
                        var3_3 = var11_16;
                        break block133;
                    }
                    if (this.f && (var26_26 = var26_26.d) != M3.c) {
                        var26_26.b(this.e, (int)var13_9);
                        var11_16 = n3.c((int)var7_13, (byte[])var2_2, (int)var11_16, (int)var4_4, M4.O(var1_1), (p3)var6_6);
lbl938: // 2 sources:
                        do {
                            var26_26 = var6_6;
                            var15_18 = var3_3;
                            var16_19 = var13_9;
                            var14_12 = var12_8;
                            var27_11 = var25_10;
                            var3_3 = var11_16;
                            var25_10 = var26_26;
                            var12_8 = var8_15;
                            var13_9 = var15_18;
                            var8_15 = var16_19;
                            var11_16 = var14_12;
                            ** continue;
                            break;
                        } while (true);
                    }
                    var11_16 = n3.c((int)var7_13, (byte[])var2_2, (int)var11_16, (int)var4_4, M4.O(var1_1), (p3)var6_6);
                    ** continue;
                }
                var10_17 = var12_8;
                var25_10 = var6_6;
                var12_8 = var8_15;
                var8_15 = var11_16;
                var11_16 = var14_12;
                var27_11 = var29_27;
                var14_12 = var7_13;
                var7_13 = var10_17;
                ** continue;
            }
            var25_10 = var27_11;
            var5_5 = var12_8;
            var4_4 = var13_9;
            var8_15 = var11_16;
        }
        if (var8_15 != 1048575) {
            var25_10.putInt(var28_7, (long)var8_15, (int)var9_14);
        }
        var2_2 = null;
        for (var8_15 = this.k; var8_15 < this.l; ++var8_15) {
            var2_2 = (v5)this.r(var1_1, this.j[var8_15], var2_2, this.o, var1_1);
        }
        if (var4_4 == false) {
            if (var3_3 != var5_5) throw k4.e();
            return (int)var3_3;
        }
        if (var3_3 > var5_5 || var7_13 != var4_4) throw k4.e();
        return (int)var3_3;
    }

    public final Object o(int n8, int n9, Map object, g4 g42, Object object2, x5 x52, Object object3) {
        this.q.b(this.Q(n8));
        Iterator iterator = object.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (g42.e((Integer)entry.getValue())) continue;
            object = object2;
            if (object2 == null) {
                object = x52.i(object3);
            }
            object2 = q3.U(A4.a(null, entry.getKey(), entry.getValue()));
            J3 j32 = object2.b();
            try {
                A4.b(j32, null, entry.getKey(), entry.getValue());
            }
            catch (IOException iOException) {
                throw new RuntimeException((Throwable)iOException);
            }
            x52.c(object, n9, object2.a());
            iterator.remove();
            object2 = object;
        }
        return object2;
    }

    public final Object p(Object object, int n8) {
        Z4 z42 = this.N(n8);
        long l8 = this.G(n8) & 1048575;
        if (!this.I(object, n8)) {
            return z42.a();
        }
        if (M4.T(object = s.getObject(object, l8))) {
            return object;
        }
        Object object2 = z42.a();
        if (object != null) {
            z42.d(object2, object);
        }
        return object2;
    }

    public final Object q(Object object, int n8, int n9) {
        Z4 z42 = this.N(n9);
        if (!this.J(object, n8, n9)) {
            return z42.a();
        }
        if (M4.T(object = s.getObject(object, (long)(this.G(n9) & 1048575)))) {
            return object;
        }
        Object object2 = z42.a();
        if (object != null) {
            z42.d(object2, object);
        }
        return object2;
    }

    public final Object r(Object object, int n8, Object object2, x5 x52, Object object3) {
        int n9 = this.a[n8];
        if ((object = D5.B(object, this.G(n8) & 1048575)) == null) {
            return object2;
        }
        g4 g42 = this.M(n8);
        if (g42 == null) {
            return object2;
        }
        return this.o(n8, n9, this.q.h(object), g42, object2, x52, object3);
    }

    public final void v(T5 t52, int n8, Object object, int n9) {
        if (object != null) {
            this.q.b(this.Q(n9));
            t52.o(n8, null, this.q.c(object));
        }
    }

    public final void w(Object object, int n8, int n9, Object object2) {
        s.putObject(object, (long)(this.G(n9) & 1048575), object2);
        this.E(object, n8, n9);
    }

    public final void x(Object object, int n8, Object object2) {
        s.putObject(object, (long)(this.G(n8) & 1048575), object2);
        this.D(object, n8);
    }

    public final void y(Object object, Object object2, int n8) {
        if (!this.I(object2, n8)) {
            return;
        }
        Unsafe unsafe = s;
        long l8 = this.G(n8) & 1048575;
        Object object3 = unsafe.getObject(object2, l8);
        if (object3 != null) {
            Object object4;
            Z4 z42 = this.N(n8);
            if (!this.I(object, n8)) {
                if (!M4.T(object3)) {
                    unsafe.putObject(object, l8, object3);
                } else {
                    object2 = z42.a();
                    z42.d(object2, object3);
                    unsafe.putObject(object, l8, object2);
                }
                this.D(object, n8);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l8);
            if (!M4.T(object4)) {
                object2 = z42.a();
                z42.d(object2, object4);
                unsafe.putObject(object, l8, object2);
            }
            z42.d(object2, object3);
            return;
        }
        n8 = this.a[n8];
        object = String.valueOf((Object)object2);
        object2 = new StringBuilder("Source subfield ");
        object2.append(n8);
        object2.append(" is present but null: ");
        object2.append((String)object);
        throw new IllegalStateException(object2.toString());
    }

    public final boolean z(Object object, int n8, int n9, int n10, int n11) {
        if (n9 == 1048575) {
            return this.I(object, n8);
        }
        if ((n10 & n11) != 0) {
            return true;
        }
        return false;
    }
}

