/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
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
package androidx.datastore.preferences.protobuf;

import android.support.v4.media.a;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.M;
import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.Z;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.y;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

public final class S
implements e0 {
    public static final int[] r = new int[0];
    public static final Unsafe s = p0.B();
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
    public final l0 o;
    public final p p;
    public final J q;

    public S(int[] arrn, Object[] arrobject, int n8, int n9, O o8, boolean bl, boolean bl2, int[] arrn2, int n10, int n11, U u8, E e8, l0 l02, p p8, J j8) {
        this.a = arrn;
        this.b = arrobject;
        this.c = n8;
        this.d = n9;
        this.g = o8 instanceof w;
        this.h = bl;
        bl = p8 != null && p8.e(o8);
        this.f = bl;
        this.i = bl2;
        this.j = arrn2;
        this.k = n10;
        this.l = n11;
        this.m = u8;
        this.n = e8;
        this.o = l02;
        this.p = p8;
        this.e = o8;
        this.q = j8;
    }

    public static boolean E(int n8) {
        if ((n8 & 268435456) != 0) {
            return true;
        }
        return false;
    }

    public static List F(Object object, long l8) {
        return (List)p0.A(object, l8);
    }

    public static long G(Object object, long l8) {
        return p0.y(object, l8);
    }

    public static S M(Class class_, M m8, U u8, E e8, l0 l02, p p8, J j8) {
        if (m8 instanceof c0) {
            return S.O((c0)m8, u8, e8, l02, p8, j8);
        }
        a.a(m8);
        return S.N(null, u8, e8, l02, p8, j8);
    }

    public static S N(i0 i02, U u8, E e8, l0 l02, p p8, J j8) {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static S O(c0 c02, U u8, E e8, l0 l02, p p8, J j8) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int[] arrn = c02.b();
        int[] arrn2 = Z.p;
        int n17 = 0;
        boolean bl = arrn == arrn2;
        String string2 = c02.e();
        int n18 = string2.length();
        int n19 = string2.charAt(0);
        if (n19 >= 55296) {
            n19 &= 8191;
            n15 = 1;
            n12 = 13;
            do {
                n10 = n15 + '\u0001';
                if ((n15 = string2.charAt(n15)) < 55296) break;
                n19 |= (n15 & 8191) << n12;
                n12 += 13;
                n15 = n10;
            } while (true);
            n19 |= n15 << n12;
            n12 = n10;
        } else {
            n12 = 1;
        }
        n10 = n12 + 1;
        n15 = string2.charAt(n12);
        int n20 = n10;
        n12 = n15;
        if (n15 >= 55296) {
            n15 &= 8191;
            n12 = 13;
            n9 = n10;
            do {
                n10 = n9 + 1;
                if ((n9 = (int)string2.charAt(n9)) < 55296) break;
                n15 |= (n9 & 8191) << n12;
                n12 += 13;
                n9 = n10;
            } while (true);
            n12 = n15 | n9 << n12;
            n20 = n10;
        }
        if (n12 == 0) {
            arrn2 = r;
            n11 = n12 = (n8 = (n10 = (n14 = (n15 = 0))));
            n9 = n17;
            n13 = n10;
        } else {
            n12 = n20 + 1;
            n10 = n9 = (int)string2.charAt(n20);
            n15 = n12;
            if (n9 >= 55296) {
                n15 = n9 & 8191;
                n10 = 13;
                n9 = n12;
                do {
                    n12 = n9 + 1;
                    if ((n9 = (int)string2.charAt(n9)) < 55296) break;
                    n15 |= (n9 & 8191) << n10;
                    n10 += 13;
                    n9 = n12;
                } while (true);
                n10 = n15 | n9 << n10;
                n15 = n12;
            }
            n12 = n15 + 1;
            n17 = n15 = (int)string2.charAt(n15);
            n9 = n12;
            if (n15 >= 55296) {
                n9 = n15 & 8191;
                n15 = 13;
                n20 = n12;
                do {
                    n12 = n20 + 1;
                    if ((n20 = (int)string2.charAt(n20)) < 55296) break;
                    n9 |= (n20 & 8191) << n15;
                    n15 += 13;
                    n20 = n12;
                } while (true);
                n17 = n9 | n20 << n15;
                n9 = n12;
            }
            n15 = n9 + 1;
            n12 = n9 = (int)string2.charAt(n9);
            n20 = n15;
            if (n9 >= 55296) {
                n9 &= 8191;
                n12 = 13;
                n20 = n15;
                do {
                    n15 = n20 + 1;
                    if ((n20 = (int)string2.charAt(n20)) < 55296) break;
                    n9 |= (n20 & 8191) << n12;
                    n12 += 13;
                    n20 = n15;
                } while (true);
                n12 = n9 | n20 << n12;
                n20 = n15;
            }
            n9 = n20 + 1;
            n15 = n20 = (int)string2.charAt(n20);
            n8 = n9;
            if (n20 >= 55296) {
                n20 &= 8191;
                n15 = 13;
                n8 = n9;
                do {
                    n9 = n8 + 1;
                    if ((n8 = (int)string2.charAt(n8)) < 55296) break;
                    n20 |= (n8 & 8191) << n15;
                    n15 += 13;
                    n8 = n9;
                } while (true);
                n15 = n20 | n8 << n15;
                n8 = n9;
            }
            n20 = n8 + 1;
            n9 = n8 = (int)string2.charAt(n8);
            n14 = n20;
            if (n8 >= 55296) {
                n8 &= 8191;
                n9 = 13;
                n14 = n20;
                do {
                    n20 = n14 + 1;
                    if ((n14 = (int)string2.charAt(n14)) < 55296) break;
                    n8 |= (n14 & 8191) << n9;
                    n9 += 13;
                    n14 = n20;
                } while (true);
                n9 = n8 | n14 << n9;
                n14 = n20;
            }
            n8 = n14 + 1;
            n20 = n11 = (int)string2.charAt(n14);
            n14 = n8;
            if (n11 >= 55296) {
                n14 = n11 & 8191;
                n20 = 13;
                n11 = n8;
                do {
                    n8 = n11 + 1;
                    if ((n11 = (int)string2.charAt(n11)) < 55296) break;
                    n14 |= (n11 & 8191) << n20;
                    n20 += 13;
                    n11 = n8;
                } while (true);
                n20 = n14 | n11 << n20;
                n14 = n8;
            }
            n8 = n14 + 1;
            n11 = n16 = (int)string2.charAt(n14);
            n14 = n8;
            if (n16 >= 55296) {
                n11 = n16 & 8191;
                n14 = 13;
                n16 = n8;
                do {
                    n8 = n16 + 1;
                    if ((n16 = (int)string2.charAt(n16)) < 55296) break;
                    n11 |= (n16 & 8191) << n14;
                    n14 += 13;
                    n16 = n8;
                } while (true);
                n11 |= n16 << n14;
                n14 = n8;
            }
            n16 = n14 + 1;
            n8 = n13 = (int)string2.charAt(n14);
            n14 = n16;
            if (n13 >= 55296) {
                n14 = n13 & 8191;
                n13 = n16;
                n8 = 13;
                n16 = n14;
                do {
                    n14 = n13 + 1;
                    if ((n13 = (int)string2.charAt(n13)) < 55296) break;
                    n16 |= (n13 & 8191) << n8;
                    n8 += 13;
                    n13 = n14;
                } while (true);
                n8 = n16 | n13 << n8;
            }
            arrn2 = new int[n8 + n20 + n11];
            n11 = n10 * 2 + n17;
            n17 = n14;
            n16 = n12;
            n12 = n8;
            n8 = n11;
            n13 = n9;
            n14 = n15;
            n15 = n20;
            n11 = n10;
            n20 = n17;
            n9 = n16;
        }
        Unsafe unsafe = s;
        Object[] arrobject = c02.d();
        Class class_ = c02.c().getClass();
        arrn = new int[n13 * 3];
        Object[] arrobject2 = new Object[n13 * 2];
        int n21 = n12 + n15;
        n10 = n12;
        n15 = n21;
        n13 = 0;
        n17 = 0;
        n16 = n14;
        n14 = n13;
        int n22 = n19;
        n13 = n9;
        do {
            int n23;
            int n24;
            int n25;
            int n26;
            block54 : {
                Object object;
                int n27;
                block60 : {
                    block58 : {
                        block55 : {
                            block59 : {
                                block56 : {
                                    block57 : {
                                        block53 : {
                                            n23 = n17;
                                            if (n20 >= n18) {
                                                return new S(arrn, arrobject2, n13, n16, c02.c(), bl, false, arrn2, n12, n21, u8, e8, l02, p8, j8);
                                            }
                                            n9 = n20 + 1;
                                            n25 = string2.charAt(n20);
                                            if (n25 >= 55296) {
                                                n20 = n25 & 8191;
                                                n19 = 13;
                                                do {
                                                    n17 = n9 + 1;
                                                    n25 = string2.charAt(n9);
                                                    n9 = n12;
                                                    if (n25 < 55296) break;
                                                    n20 |= (n25 & 8191) << n19;
                                                    n19 += 13;
                                                    n12 = n9;
                                                    n9 = n17;
                                                } while (true);
                                                n25 = n20 | n25 << n19;
                                                n12 = n17;
                                            } else {
                                                n19 = n12;
                                                n12 = n9;
                                                n9 = n19;
                                            }
                                            n19 = n12 + 1;
                                            n24 = string2.charAt(n12);
                                            if (n24 >= 55296) {
                                                n20 = n24 & 8191;
                                                n12 = 13;
                                                n17 = n19;
                                                do {
                                                    n19 = n17 + 1;
                                                    if ((n17 = (int)string2.charAt(n17)) < 55296) break;
                                                    n20 |= (n17 & 8191) << n12;
                                                    n12 += 13;
                                                    n17 = n19;
                                                } while (true);
                                                n24 = n20 | n17 << n12;
                                                n17 = n19;
                                            } else {
                                                n17 = n19;
                                            }
                                            n26 = n24 & 255;
                                            n20 = n14;
                                            if ((n24 & 1024) != 0) {
                                                arrn2[n14] = n23;
                                                n20 = n14 + 1;
                                            }
                                            if (n26 < 51) break block53;
                                            n19 = n17 + 1;
                                            n17 = string2.charAt(n17);
                                            n12 = n19;
                                            n14 = n17;
                                            if (n17 >= 55296) {
                                                n14 = n17 & 8191;
                                                n12 = 13;
                                                n17 = n19;
                                                do {
                                                    n19 = n17 + 1;
                                                    if ((n17 = (int)string2.charAt(n17)) < 55296) break;
                                                    n14 |= (n17 & 8191) << n12;
                                                    n12 += 13;
                                                    n17 = n19;
                                                } while (true);
                                                n14 |= n17 << n12;
                                                n12 = n19;
                                            }
                                            if ((n17 = n26 - 51) != 9 && n17 != 17) {
                                                n19 = n8;
                                                if (n17 == 12) {
                                                    n19 = n8;
                                                    if ((n22 & 1) == 1) {
                                                        n17 = n23 / 3;
                                                        n19 = n8 + 1;
                                                        arrobject2[n17 * 2 + 1] = arrobject[n8];
                                                    }
                                                }
                                            } else {
                                                n17 = n23 / 3;
                                                n19 = n8 + 1;
                                                arrobject2[n17 * 2 + 1] = arrobject[n8];
                                            }
                                            if ((object = arrobject[n8 = n14 * 2]) instanceof Field) {
                                                object = (Field)object;
                                            } else {
                                                arrobject[n8] = object = S.c0(class_, (String)object);
                                            }
                                            n17 = (int)unsafe.objectFieldOffset((Field)object);
                                            object = arrobject[++n8];
                                            if (object instanceof Field) {
                                                object = (Field)object;
                                            } else {
                                                arrobject[n8] = object = S.c0(class_, (String)object);
                                            }
                                            n8 = (int)unsafe.objectFieldOffset((Field)object);
                                            n14 = 0;
                                            break block54;
                                        }
                                        n14 = n8 + 1;
                                        object = S.c0(class_, (String)arrobject[n8]);
                                        if (n26 == 9 || n26 == 17) break block55;
                                        if (n26 == 27 || n26 == 49) break block56;
                                        if (n26 == 12 || n26 == 30 || n26 == 44) break block57;
                                        if (n26 == 50) {
                                            n12 = n10 + 1;
                                            arrn2[n10] = n23;
                                            n27 = n23 / 3 * 2;
                                            n19 = n8 + 2;
                                            arrobject2[n27] = arrobject[n14];
                                            if ((n24 & 2048) != 0) {
                                                n10 = n8 + 3;
                                                arrobject2[n27 + 1] = arrobject[n19];
                                                n19 = n10;
                                            }
                                        } else {
                                            n19 = n14;
                                            n12 = n10;
                                        }
                                        break block58;
                                    }
                                    n19 = n14;
                                    n12 = n10;
                                    if ((n22 & 1) != 1) break block58;
                                    n19 = n23 / 3;
                                    n12 = n8 + 2;
                                    arrobject2[n19 * 2 + 1] = arrobject[n14];
                                    break block59;
                                }
                                n19 = n23 / 3;
                                n12 = n8 + 2;
                                arrobject2[n19 * 2 + 1] = arrobject[n14];
                            }
                            n19 = n12;
                            break block60;
                        }
                        arrobject2[n23 / 3 * 2 + 1] = object.getType();
                        n19 = n14;
                        n12 = n10;
                    }
                    n10 = n12;
                }
                n27 = (int)unsafe.objectFieldOffset((Field)object);
                if ((n22 & 1) == 1 && n26 <= 17) {
                    n8 = n17 + 1;
                    n17 = string2.charAt(n17);
                    n12 = n8;
                    n14 = n17;
                    if (n17 >= 55296) {
                        n14 = n17 & 8191;
                        n12 = 13;
                        n17 = n8;
                        do {
                            n8 = n17 + 1;
                            if ((n17 = (int)string2.charAt(n17)) < 55296) break;
                            n14 |= (n17 & 8191) << n12;
                            n12 += 13;
                            n17 = n8;
                        } while (true);
                        n14 |= n17 << n12;
                        n12 = n8;
                    }
                    if ((object = arrobject[n8 = n11 * 2 + n14 / 32]) instanceof Field) {
                        object = (Field)object;
                    } else {
                        arrobject[n8] = object = S.c0(class_, (String)object);
                    }
                    n17 = n12;
                    n8 = (int)unsafe.objectFieldOffset((Field)object);
                    n12 = n14 % 32;
                } else {
                    n8 = 0;
                    n12 = 0;
                }
                n14 = n15;
                if (n26 >= 18) {
                    n14 = n15;
                    if (n26 <= 49) {
                        arrn2[n15] = n27;
                        n14 = n15 + 1;
                    }
                }
                n15 = n14;
                n14 = n12;
                n12 = n17;
                n17 = n27;
            }
            arrn[n23] = n25;
            n25 = (n24 & 512) != 0 ? 536870912 : 0;
            n24 = (n24 & 256) != 0 ? 268435456 : 0;
            arrn[n23 + 1] = n24 | n25 | n26 << 20 | n17;
            n17 = n23 + 3;
            arrn[n23 + 2] = n14 << 20 | n8;
            n14 = n20;
            n20 = n12;
            n8 = n19;
            n12 = n9;
        } while (true);
    }

    public static long Q(int n8) {
        return n8 & 1048575;
    }

    public static boolean R(Object object, long l8) {
        return (Boolean)p0.A(object, l8);
    }

    public static double S(Object object, long l8) {
        return (Double)p0.A(object, l8);
    }

    public static float T(Object object, long l8) {
        return ((Float)p0.A(object, l8)).floatValue();
    }

    public static int U(Object object, long l8) {
        return (Integer)p0.A(object, l8);
    }

    public static long V(Object object, long l8) {
        return (Long)p0.A(object, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Field c0(Class class_, String string2) {
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

    public static int g0(int n8) {
        return (n8 & 267386880) >>> 20;
    }

    public static boolean k(Object object, long l8) {
        return p0.p(object, l8);
    }

    public static double l(Object object, long l8) {
        return p0.v(object, l8);
    }

    public static float o(Object object, long l8) {
        return p0.w(object, l8);
    }

    public static int v(Object object, long l8) {
        return p0.x(object, l8);
    }

    public static boolean w(int n8) {
        if ((n8 & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public static boolean z(Object object, int n8, e0 e02) {
        return e02.c(p0.A(object, S.Q(n8)));
    }

    public final boolean A(Object object, int n8, int n9) {
        if ((object = (List)p0.A(object, S.Q(n8))).isEmpty()) {
            return true;
        }
        e0 e02 = this.r(n9);
        for (n8 = 0; n8 < object.size(); ++n8) {
            if (e02.c(object.get(n8))) continue;
            return false;
        }
        return true;
    }

    public final boolean B(Object object, int n8, int n9) {
        if ((object = this.q.e(p0.A(object, S.Q(n8)))).isEmpty()) {
            return true;
        }
        Object object2 = this.q(n9);
        if (this.q.d((Object)object2).c.c() != r0.c.x) {
            return true;
        }
        Iterator iterator = object.values().iterator();
        object = null;
        while (iterator.hasNext()) {
            Object object3 = iterator.next();
            object2 = object;
            if (object == null) {
                object2 = a0.a().c(object3.getClass());
            }
            object = object2;
            if (object2.c(object3)) continue;
            return false;
        }
        return true;
    }

    public final boolean C(Object object, Object object2, int n8) {
        long l8 = this.X(n8) & 1048575;
        if (p0.x(object, l8) == p0.x(object2, l8)) {
            return true;
        }
        return false;
    }

    public final boolean D(Object object, int n8, int n9) {
        if (p0.x(object, this.X(n9) & 1048575) == n8) {
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public final void H(l0 var1_1, p var2_2, Object var3_4, d0 var4_5, o var5_6) {
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

    public final void I(Object object, int n8, Object object2, o o8, d0 d02) {
        Object object3;
        long l8 = S.Q(this.h0(n8));
        Object object4 = p0.A(object, l8);
        if (object4 == null) {
            object3 = this.q.f(object2);
            p0.O(object, l8, object3);
        } else {
            object3 = object4;
            if (this.q.g(object4)) {
                object3 = this.q.f(object2);
                this.q.a(object3, object4);
                p0.O(object, l8, object3);
            }
        }
        d02.K(this.q.h(object3), this.q.d(object2), o8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void J(Object object, Object object2, int n8) {
        long l8 = S.Q(this.h0(n8));
        if (!this.x(object2, n8)) {
            return;
        }
        Object object3 = p0.A(object, l8);
        object2 = p0.A(object2, l8);
        if (object3 != null && object2 != null) {
            object2 = y.h(object3, object2);
        } else if (object2 == null) {
            return;
        }
        p0.O(object, l8, object2);
        this.d0(object, n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void K(Object object, Object object2, int n8) {
        int n9 = this.h0(n8);
        int n10 = this.P(n8);
        long l8 = S.Q(n9);
        if (!this.D(object2, n10, n8)) {
            return;
        }
        Object object3 = p0.A(object, l8);
        object2 = p0.A(object2, l8);
        if (object3 != null && object2 != null) {
            object2 = y.h(object3, object2);
        } else if (object2 == null) {
            return;
        }
        p0.O(object, l8, object2);
        this.e0(object, n10, n8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void L(Object var1_1, Object var2_2, int var3_3) {
        block24 : {
            var4_4 = this.h0(var3_3);
            var6_5 = S.Q(var4_4);
            var5_6 = this.P(var3_3);
            switch (S.g0(var4_4)) {
                default: {
                    return;
                }
                case 60: 
                case 68: {
                    this.K(var1_1, var2_2, var3_3);
                    return;
                }
                case 61: 
                case 62: 
                case 63: 
                case 64: 
                case 65: 
                case 66: 
                case 67: {
                    if (this.D(var2_2, var5_6, var3_3) == false) return;
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
                    if (this.D(var2_2, var5_6, var3_3) == false) return;
lbl15: // 2 sources:
                    p0.O(var1_1, var6_5, p0.A(var2_2, var6_5));
                    this.e0(var1_1, var5_6, var3_3);
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
                    this.J(var1_1, var2_2, var3_3);
                    return;
                }
                case 16: {
                    if (this.x(var2_2, var3_3) == false) return;
                    ** GOTO lbl71
                }
                case 15: {
                    if (this.x(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 14: {
                    if (this.x(var2_2, var3_3) == false) return;
                    ** GOTO lbl71
                }
                case 13: {
                    if (this.x(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 12: {
                    if (this.x(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 11: {
                    if (this.x(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 10: {
                    if (this.x(var2_2, var3_3) == false) return;
                    ** GOTO lbl50
                }
                case 8: {
                    if (this.x(var2_2, var3_3) == false) return;
lbl50: // 2 sources:
                    p0.O(var1_1, var6_5, p0.A(var2_2, var6_5));
                    break block24;
                }
                case 7: {
                    if (this.x(var2_2, var3_3) == false) return;
                    p0.E(var1_1, var6_5, p0.p(var2_2, var6_5));
                    break block24;
                }
                case 6: {
                    if (this.x(var2_2, var3_3) == false) return;
                    ** GOTO lbl64
                }
                case 5: {
                    if (this.x(var2_2, var3_3) == false) return;
                    ** GOTO lbl71
                }
                case 4: {
                    if (this.x(var2_2, var3_3) == false) return;
lbl64: // 6 sources:
                    p0.M(var1_1, var6_5, p0.x(var2_2, var6_5));
                    break block24;
                }
                case 3: {
                    if (this.x(var2_2, var3_3) == false) return;
                    ** GOTO lbl71
                }
                case 2: {
                    if (this.x(var2_2, var3_3) == false) return;
lbl71: // 5 sources:
                    p0.N(var1_1, var6_5, p0.y(var2_2, var6_5));
                    break block24;
                }
                case 1: {
                    if (this.x(var2_2, var3_3) == false) return;
                    p0.L(var1_1, var6_5, p0.w(var2_2, var6_5));
                    break block24;
                }
                case 0: 
            }
            if (this.x(var2_2, var3_3) == false) return;
            p0.K(var1_1, var6_5, p0.v(var2_2, var6_5));
        }
        this.d0(var1_1, var3_3);
    }

    public final int P(int n8) {
        return this.a[n8];
    }

    public final int W(int n8) {
        if (n8 >= this.c && n8 <= this.d) {
            return this.f0(n8, 0);
        }
        return -1;
    }

    public final int X(int n8) {
        return this.a[n8 + 2];
    }

    public final void Y(Object object, long l8, d0 d02, e0 e02, o o8) {
        d02.L(this.n.e(object, l8), e02, o8);
    }

    public final void Z(Object object, int n8, d0 d02, e0 e02, o o8) {
        long l8 = S.Q(n8);
        d02.M(this.n.e(object, l8), e02, o8);
    }

    @Override
    public void a(Object object, Object object2) {
        object2.getClass();
        for (int i8 = 0; i8 < this.a.length; i8 += 3) {
            this.L(object, object2, i8);
        }
        if (!this.h) {
            g0.F(this.o, object, object2);
            if (this.f) {
                g0.D(this.p, object, object2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a0(Object object, int n8, d0 object2) {
        long l8;
        if (S.w(n8)) {
            l8 = S.Q(n8);
            object2 = object2.F();
        } else if (this.g) {
            l8 = S.Q(n8);
            object2 = object2.m();
        } else {
            l8 = S.Q(n8);
            object2 = object2.u();
        }
        p0.O(object, l8, object2);
    }

    @Override
    public void b(Object object) {
        int n8;
        int n9;
        for (n8 = this.k; n8 < (n9 = this.l); ++n8) {
            long l8 = S.Q(this.h0(this.j[n8]));
            Object object2 = p0.A(object, l8);
            if (object2 == null) continue;
            p0.O(object, l8, this.q.c(object2));
        }
        int n10 = this.j.length;
        for (n8 = n9; n8 < n10; ++n8) {
            this.n.c(object, this.j[n8]);
        }
        this.o.j(object);
        if (this.f) {
            this.p.f(object);
        }
    }

    public final void b0(Object object, int n8, d0 d02) {
        if (S.w(n8)) {
            d02.t(this.n.e(object, S.Q(n8)));
            return;
        }
        d02.q(this.n.e(object, S.Q(n8)));
    }

    @Override
    public final boolean c(Object object) {
        int n8;
        int n9 = -1;
        int n10 = n8 = 0;
        while (n8 < this.k) {
            int n11;
            block13 : {
                int n12;
                int n13;
                int n14;
                block10 : {
                    block11 : {
                        int n15;
                        block12 : {
                            n13 = this.j[n8];
                            n15 = this.P(n13);
                            n14 = this.h0(n13);
                            if (!this.h) {
                                n11 = this.a[n13 + 2];
                                int n16 = 1048575 & n11;
                                int n17 = 1 << (n11 >>> 20);
                                n11 = n9;
                                n12 = n17;
                                if (n16 != n9) {
                                    n10 = s.getInt(object, (long)n16);
                                    n11 = n16;
                                    n12 = n17;
                                }
                            } else {
                                n12 = 0;
                                n11 = n9;
                            }
                            if (S.E(n14) && !this.y(object, n13, n10, n12)) {
                                return false;
                            }
                            n9 = S.g0(n14);
                            if (n9 == 9 || n9 == 17) break block10;
                            if (n9 == 27) break block11;
                            if (n9 == 60 || n9 == 68) break block12;
                            if (n9 == 49) break block11;
                            if (n9 == 50 && !this.B(object, n14, n13)) {
                                return false;
                            }
                            break block13;
                        }
                        if (this.D(object, n15, n13) && !S.z(object, n14, this.r(n13))) {
                            return false;
                        }
                        break block13;
                    }
                    if (!this.A(object, n14, n13)) {
                        return false;
                    }
                    break block13;
                }
                if (this.y(object, n13, n10, n12) && !S.z(object, n14, this.r(n13))) {
                    return false;
                }
            }
            ++n8;
            n9 = n11;
        }
        if (this.f && !this.p.c(object).k()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean d(Object object, Object object2) {
        int n8 = this.a.length;
        for (int i8 = 0; i8 < n8; i8 += 3) {
            if (this.m(object, object2, i8)) continue;
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

    public final void d0(Object object, int n8) {
        if (this.h) {
            return;
        }
        n8 = this.X(n8);
        long l8 = n8 & 1048575;
        p0.M(object, l8, p0.x(object, l8) | 1 << (n8 >>> 20));
    }

    @Override
    public int e(Object object) {
        if (this.h) {
            return this.t(object);
        }
        return this.s(object);
    }

    public final void e0(Object object, int n8, int n9) {
        p0.M(object, this.X(n9) & 1048575, n8);
    }

    @Override
    public Object f() {
        return this.m.a(this.e);
    }

    public final int f0(int n8, int n9) {
        int n10 = this.a.length / 3 - 1;
        while (n9 <= n10) {
            int n11 = n10 + n9 >>> 1;
            int n12 = n11 * 3;
            int n13 = this.P(n12);
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
                            var5_7 = this.h0(var7_3);
                            var9_8 = this.P(var7_3);
                            var11_10 = S.Q(var5_7);
                            var10_9 = S.g0(var5_7);
                            var5_7 = 37;
                            switch (var10_9) {
                                default: {
                                    var5_7 = var6_4;
                                    ** break;
                                }
                                case 68: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl56
                                }
                                case 67: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl94
                                }
                                case 66: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 65: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl94
                                }
                                case 64: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 63: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 62: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 61: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
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
                                    var14_12 = p0.A(var1_1, var11_10);
                                    ** GOTO lbl58
                                }
                                case 60: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
lbl56: // 2 sources:
                                    var14_12 = p0.A(var1_1, var11_10);
                                    var5_7 = var6_4 * 53;
lbl58: // 2 sources:
                                    var6_4 = var14_12.hashCode();
                                    break block35;
                                }
                                case 59: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                }
                                case 8: {
                                    var5_7 = var6_4 * 53;
                                    var6_4 = ((String)p0.A(var1_1, var11_10)).hashCode();
                                    break block35;
                                }
                                case 58: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var13_11 = S.R(var1_1, var11_10);
                                    ** GOTO lbl130
                                }
                                case 57: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl84
                                }
                                case 56: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl94
                                }
                                case 55: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
lbl84: // 6 sources:
                                    var5_7 = var6_4 * 53;
                                    var6_4 = S.U(var1_1, var11_10);
                                    break block35;
                                }
                                case 54: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    ** GOTO lbl94
                                }
                                case 53: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
lbl94: // 5 sources:
                                    var5_7 = var6_4 * 53;
                                    var11_10 = S.V(var1_1, var11_10);
                                    break block36;
                                }
                                case 52: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var4_6 = S.T(var1_1, var11_10);
                                    ** GOTO lbl135
                                }
                                case 51: {
                                    var5_7 = var6_4;
                                    if (!this.D(var1_1, var9_8, var7_3)) break block34;
                                    var5_7 = var6_4 * 53;
                                    var2_5 = S.S(var1_1, var11_10);
                                    break block37;
                                }
                                case 17: {
                                    var14_12 = p0.A(var1_1, var11_10);
                                    if (var14_12 == null) ** GOTO lbl125
                                    ** GOTO lbl124
                                }
                                case 2: 
                                case 3: 
                                case 5: 
                                case 14: 
                                case 16: {
                                    var5_7 = var6_4 * 53;
                                    var11_10 = p0.y(var1_1, var11_10);
                                    break block36;
                                }
                                case 4: 
                                case 6: 
                                case 11: 
                                case 12: 
                                case 13: 
                                case 15: {
                                    var5_7 = var6_4 * 53;
                                    var6_4 = p0.x(var1_1, var11_10);
                                    break block35;
                                }
                                case 9: {
                                    var14_12 = p0.A(var1_1, var11_10);
                                    if (var14_12 == null) ** GOTO lbl125
lbl124: // 2 sources:
                                    var5_7 = var14_12.hashCode();
lbl125: // 3 sources:
                                    var5_7 = var6_4 * 53 + var5_7;
                                    ** break;
                                }
                                case 7: {
                                    var5_7 = var6_4 * 53;
                                    var13_11 = p0.p(var1_1, var11_10);
lbl130: // 2 sources:
                                    var6_4 = y.c(var13_11);
                                    break block35;
                                }
                                case 1: {
                                    var5_7 = var6_4 * 53;
                                    var4_6 = p0.w(var1_1, var11_10);
lbl135: // 2 sources:
                                    var6_4 = Float.floatToIntBits((float)var4_6);
                                    break block35;
                                }
                                case 0: 
                            }
                            var5_7 = var6_4 * 53;
                            var2_5 = p0.v(var1_1, var11_10);
                        }
                        var11_10 = Double.doubleToLongBits((double)var2_5);
                    }
                    var6_4 = y.f(var11_10);
                }
                var5_7 += var6_4;
                ** break;
            }
            var7_3 += 3;
            var6_4 = var5_7;
        } while (true);
    }

    @Override
    public void h(Object object, d0 d02, o o8) {
        o8.getClass();
        this.H(this.o, this.p, object, d02, o8);
    }

    public final int h0(int n8) {
        return this.a[n8 + 1];
    }

    @Override
    public void i(Object object, s0 s02) {
        if (s02.v() == s0.a.p) {
            this.k0(object, s02);
            return;
        }
        if (this.h) {
            this.j0(object, s02);
            return;
        }
        this.i0(object, s02);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void i0(Object var1_1, s0 var2_2) {
        if (this.f && !(var15_3 = this.p.c(var1_1)).j()) {
            var16_4 = var15_3.n();
            var15_3 = (Map.Entry)var16_4.next();
        } else {
            var16_4 = null;
            var15_3 = null;
        }
        var7_5 = this.a.length;
        var17_6 = S.s;
        var3_7 = -1;
        var4_9 = 0;
        block71 : for (var6_8 = 0; var6_8 < var7_5; var6_8 += 3) {
            var9_12 = this.h0(var6_8);
            var10_13 = this.P(var6_8);
            var11_14 = S.g0(var9_12);
            if (!this.h && var11_14 <= 17) {
                var12_15 = this.a[var6_8 + 2];
                var8_11 = var12_15 & 1048575;
                var5_10 = var3_7;
                if (var8_11 != var3_7) {
                    var4_9 = var17_6.getInt(var1_1, (long)var8_11);
                    var5_10 = var8_11;
                }
                var8_11 = 1 << (var12_15 >>> 20);
                var3_7 = var5_10;
            } else {
                var8_11 = 0;
            }
            while (var15_3 != null && this.p.a((Map.Entry)var15_3) <= var10_13) {
                this.p.j(var2_2, (Map.Entry)var15_3);
                if (var16_4.hasNext()) {
                    var15_3 = (Map.Entry)var16_4.next();
                    continue;
                }
                var15_3 = null;
            }
            var13_16 = S.Q(var9_12);
            switch (var11_14) {
                case 68: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.O(var10_13, var17_6.getObject(var1_1, var13_16), this.r(var6_8));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 67: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.w(var10_13, S.V(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 66: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.H(var10_13, S.U(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 65: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.n(var10_13, S.V(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 64: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.g(var10_13, S.U(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 63: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.D(var10_13, S.U(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 62: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.e(var10_13, S.U(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 61: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.J(var10_13, (g)var17_6.getObject(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 60: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.K(var10_13, var17_6.getObject(var1_1, var13_16), this.r(var6_8));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 59: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        this.m0(var10_13, var17_6.getObject(var1_1, var13_16), var2_2);
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 58: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.d(var10_13, S.R(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 57: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.l(var10_13, S.U(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 56: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.u(var10_13, S.V(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 55: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.i(var10_13, S.U(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 54: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.C(var10_13, S.V(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 53: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.c(var10_13, S.V(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 52: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.x(var10_13, S.T(var1_1, var13_16));
                        continue block71;
                    }
                    ** GOTO lbl124
                }
                case 51: {
                    if (this.D(var1_1, var10_13, var6_8)) {
                        var2_2.m(var10_13, S.S(var1_1, var13_16));
                        continue block71;
                    }
                }
lbl124: // 20 sources:
                default: {
                    continue block71;
                }
                case 50: {
                    this.l0(var2_2, var10_13, var17_6.getObject(var1_1, var13_16), var6_8);
                    continue block71;
                }
                case 49: {
                    g0.T(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, this.r(var6_8));
                    continue block71;
                }
                case 48: {
                    g0.a0(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 47: {
                    g0.Z(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 46: {
                    g0.Y(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 45: {
                    g0.X(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 44: {
                    g0.P(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 43: {
                    g0.c0(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 42: {
                    g0.M(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 41: {
                    g0.Q(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 40: {
                    g0.R(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 39: {
                    g0.U(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 38: {
                    g0.d0(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 37: {
                    g0.V(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 36: {
                    g0.S(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 35: {
                    g0.O(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, true);
                    continue block71;
                }
                case 34: {
                    g0.a0(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 33: {
                    g0.Z(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 32: {
                    g0.Y(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 31: {
                    g0.X(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 30: {
                    g0.P(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 29: {
                    g0.c0(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 28: {
                    g0.N(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2);
                    continue block71;
                }
                case 27: {
                    g0.W(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, this.r(var6_8));
                    continue block71;
                }
                case 26: {
                    g0.b0(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2);
                    continue block71;
                }
                case 25: {
                    g0.M(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 24: {
                    g0.Q(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 23: {
                    g0.R(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 22: {
                    g0.U(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 21: {
                    g0.d0(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 20: {
                    g0.V(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 19: {
                    g0.S(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 18: {
                    g0.O(this.P(var6_8), (List)var17_6.getObject(var1_1, var13_16), var2_2, false);
                    continue block71;
                }
                case 17: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.O(var10_13, var17_6.getObject(var1_1, var13_16), this.r(var6_8));
                    continue block71;
                }
                case 16: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.w(var10_13, var17_6.getLong(var1_1, var13_16));
                    continue block71;
                }
                case 15: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.H(var10_13, var17_6.getInt(var1_1, var13_16));
                    continue block71;
                }
                case 14: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.n(var10_13, var17_6.getLong(var1_1, var13_16));
                    continue block71;
                }
                case 13: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.g(var10_13, var17_6.getInt(var1_1, var13_16));
                    continue block71;
                }
                case 12: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.D(var10_13, var17_6.getInt(var1_1, var13_16));
                    continue block71;
                }
                case 11: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.e(var10_13, var17_6.getInt(var1_1, var13_16));
                    continue block71;
                }
                case 10: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.J(var10_13, (g)var17_6.getObject(var1_1, var13_16));
                    continue block71;
                }
                case 9: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.K(var10_13, var17_6.getObject(var1_1, var13_16), this.r(var6_8));
                    continue block71;
                }
                case 8: {
                    if (!(var8_11 & var4_9)) continue block71;
                    this.m0(var10_13, var17_6.getObject(var1_1, var13_16), var2_2);
                    continue block71;
                }
                case 7: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.d(var10_13, S.k(var1_1, var13_16));
                    continue block71;
                }
                case 6: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.l(var10_13, var17_6.getInt(var1_1, var13_16));
                    continue block71;
                }
                case 5: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.u(var10_13, var17_6.getLong(var1_1, var13_16));
                    continue block71;
                }
                case 4: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.i(var10_13, var17_6.getInt(var1_1, var13_16));
                    continue block71;
                }
                case 3: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.C(var10_13, var17_6.getLong(var1_1, var13_16));
                    continue block71;
                }
                case 2: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.c(var10_13, var17_6.getLong(var1_1, var13_16));
                    continue block71;
                }
                case 1: {
                    if (!(var8_11 & var4_9)) continue block71;
                    var2_2.x(var10_13, S.o(var1_1, var13_16));
                    continue block71;
                }
                case 0: 
            }
            if (!(var8_11 & var4_9)) continue;
            var2_2.m(var10_13, S.l(var1_1, var13_16));
        }
        do {
            if (var15_3 == null) {
                this.n0(this.o, var1_1, var2_2);
                return;
            }
            this.p.j(var2_2, (Map.Entry)var15_3);
            if (var16_4.hasNext()) {
                var15_3 = (Map.Entry)var16_4.next();
                continue;
            }
            var15_3 = null;
        } while (true);
    }

    public final boolean j(Object object, Object object2, int n8) {
        if (this.x(object, n8) == this.x(object2, n8)) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void j0(Object var1_1, s0 var2_2) {
        if (this.f && !(var13_3 = this.p.c(var1_1)).j()) {
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
                    var7_9 = this.h0(var6_6);
                    var9_10 = this.P(var6_6);
                    while (var13_3 != null && this.p.a((Map.Entry)var13_3) <= var9_10) {
                        this.p.j(var2_2, (Map.Entry)var13_3);
                        if (var15_4.hasNext()) {
                            var13_3 = (Map.Entry)var15_4.next();
                            continue;
                        }
                        var13_3 = null;
                    }
                    switch (S.g0(var7_9)) {
                        default: {
                            ** break;
                        }
                        case 68: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            ** GOTO lbl192
                        }
                        case 67: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = S.V(var1_1, S.Q(var7_9));
                            ** GOTO lbl197
                        }
                        case 66: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = S.U(var1_1, S.Q(var7_9));
                            ** GOTO lbl202
                        }
                        case 65: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = S.V(var1_1, S.Q(var7_9));
                            ** GOTO lbl207
                        }
                        case 64: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = S.U(var1_1, S.Q(var7_9));
                            ** GOTO lbl212
                        }
                        case 63: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = S.U(var1_1, S.Q(var7_9));
                            ** GOTO lbl217
                        }
                        case 62: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = S.U(var1_1, S.Q(var7_9));
                            ** GOTO lbl222
                        }
                        case 61: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            ** GOTO lbl226
                        }
                        case 60: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            ** GOTO lbl230
                        }
                        case 59: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            ** GOTO lbl234
                        }
                        case 58: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var12_12 = S.R(var1_1, S.Q(var7_9));
                            ** GOTO lbl239
                        }
                        case 57: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = S.U(var1_1, S.Q(var7_9));
                            ** GOTO lbl244
                        }
                        case 56: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = S.V(var1_1, S.Q(var7_9));
                            ** GOTO lbl249
                        }
                        case 55: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var7_9 = S.U(var1_1, S.Q(var7_9));
                            ** GOTO lbl254
                        }
                        case 54: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = S.V(var1_1, S.Q(var7_9));
                            ** GOTO lbl259
                        }
                        case 53: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var10_11 = S.V(var1_1, S.Q(var7_9));
                            ** GOTO lbl264
                        }
                        case 52: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var5_8 = S.T(var1_1, S.Q(var7_9));
                            ** GOTO lbl269
                        }
                        case 51: {
                            if (!this.D(var1_1, var9_10, var6_6)) break block100;
                            var3_7 = S.S(var1_1, S.Q(var7_9));
                            break block101;
                        }
                        case 50: {
                            this.l0(var2_2, var9_10, p0.A(var1_1, S.Q(var7_9)), var6_6);
                            ** break;
                        }
                        case 49: {
                            g0.T(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, this.r(var6_6));
                            ** break;
                        }
                        case 48: {
                            g0.a0(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 47: {
                            g0.Z(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 46: {
                            g0.Y(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 45: {
                            g0.X(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 44: {
                            g0.P(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 43: {
                            g0.c0(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 42: {
                            g0.M(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 41: {
                            g0.Q(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 40: {
                            g0.R(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 39: {
                            g0.U(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 38: {
                            g0.d0(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 37: {
                            g0.V(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 36: {
                            g0.S(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 35: {
                            g0.O(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, true);
                            ** break;
                        }
                        case 34: {
                            g0.a0(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 33: {
                            g0.Z(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 32: {
                            g0.Y(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 31: {
                            g0.X(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 30: {
                            g0.P(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 29: {
                            g0.c0(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 28: {
                            g0.N(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2);
                            ** break;
                        }
                        case 27: {
                            g0.W(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, this.r(var6_6));
                            ** break;
                        }
                        case 26: {
                            g0.b0(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2);
                            ** break;
                        }
                        case 25: {
                            g0.M(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 24: {
                            g0.Q(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 23: {
                            g0.R(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 22: {
                            g0.U(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 21: {
                            g0.d0(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 20: {
                            g0.V(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 19: {
                            g0.S(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 18: {
                            g0.O(this.P(var6_6), (List)p0.A(var1_1, S.Q(var7_9)), var2_2, false);
                            ** break;
                        }
                        case 17: {
                            if (!this.x(var1_1, var6_6)) break block100;
lbl192: // 2 sources:
                            var2_2.O(var9_10, p0.A(var1_1, S.Q(var7_9)), this.r(var6_6));
                            break block100;
                        }
                        case 16: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var10_11 = S.G(var1_1, S.Q(var7_9));
lbl197: // 2 sources:
                            var2_2.w(var9_10, var10_11);
                            break block100;
                        }
                        case 15: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var7_9 = S.v(var1_1, S.Q(var7_9));
lbl202: // 2 sources:
                            var2_2.H(var9_10, var7_9);
                            break block100;
                        }
                        case 14: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var10_11 = S.G(var1_1, S.Q(var7_9));
lbl207: // 2 sources:
                            var2_2.n(var9_10, var10_11);
                            break block100;
                        }
                        case 13: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var7_9 = S.v(var1_1, S.Q(var7_9));
lbl212: // 2 sources:
                            var2_2.g(var9_10, var7_9);
                            break block100;
                        }
                        case 12: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var7_9 = S.v(var1_1, S.Q(var7_9));
lbl217: // 2 sources:
                            var2_2.D(var9_10, var7_9);
                            break block100;
                        }
                        case 11: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var7_9 = S.v(var1_1, S.Q(var7_9));
lbl222: // 2 sources:
                            var2_2.e(var9_10, var7_9);
                            break block100;
                        }
                        case 10: {
                            if (!this.x(var1_1, var6_6)) break block100;
lbl226: // 2 sources:
                            var2_2.J(var9_10, (g)p0.A(var1_1, S.Q(var7_9)));
                            break block100;
                        }
                        case 9: {
                            if (!this.x(var1_1, var6_6)) break block100;
lbl230: // 2 sources:
                            var2_2.K(var9_10, p0.A(var1_1, S.Q(var7_9)), this.r(var6_6));
                            break block100;
                        }
                        case 8: {
                            if (!this.x(var1_1, var6_6)) break block100;
lbl234: // 2 sources:
                            this.m0(var9_10, p0.A(var1_1, S.Q(var7_9)), var2_2);
                            break block100;
                        }
                        case 7: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var12_12 = S.k(var1_1, S.Q(var7_9));
lbl239: // 2 sources:
                            var2_2.d(var9_10, var12_12);
                            break block100;
                        }
                        case 6: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var7_9 = S.v(var1_1, S.Q(var7_9));
lbl244: // 2 sources:
                            var2_2.l(var9_10, var7_9);
                            break block100;
                        }
                        case 5: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var10_11 = S.G(var1_1, S.Q(var7_9));
lbl249: // 2 sources:
                            var2_2.u(var9_10, var10_11);
                            break block100;
                        }
                        case 4: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var7_9 = S.v(var1_1, S.Q(var7_9));
lbl254: // 2 sources:
                            var2_2.i(var9_10, var7_9);
                            break block100;
                        }
                        case 3: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var10_11 = S.G(var1_1, S.Q(var7_9));
lbl259: // 2 sources:
                            var2_2.C(var9_10, var10_11);
                            break block100;
                        }
                        case 2: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var10_11 = S.G(var1_1, S.Q(var7_9));
lbl264: // 2 sources:
                            var2_2.c(var9_10, var10_11);
                            break block100;
                        }
                        case 1: {
                            if (!this.x(var1_1, var6_6)) break block100;
                            var5_8 = S.o(var1_1, S.Q(var7_9));
lbl269: // 2 sources:
                            var2_2.x(var9_10, var5_8);
                            break block100;
                        }
                        case 0: 
                    }
                    if (!this.x(var1_1, var6_6)) break block100;
                    var3_7 = S.l(var1_1, S.Q(var7_9));
                }
                var2_2.m(var9_10, var3_7);
                ** break;
            }
            var6_6 += 3;
        } while (true);
        do {
            if (var14_13 == null) {
                this.n0(this.o, var1_1, var2_2);
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
    public final void k0(Object var1_1, s0 var2_2) {
        this.n0(this.o, var1_1, var2_2);
        if (this.f && !(var12_3 = this.p.c(var1_1)).j()) {
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
                            this.p.j(var2_2, (Map.Entry)var13_12);
                            if (var14_4.hasNext() == false) return;
                            var13_12 = (Map.Entry)var14_4.next();
                        }
                        return;
                    }
                    var7_8 = this.h0(var6_5);
                    var8_9 = this.P(var6_5);
                    while (var12_3 != null && this.p.a((Map.Entry)var12_3) > var8_9) {
                        this.p.j(var2_2, (Map.Entry)var12_3);
                        if (var14_4.hasNext()) {
                            var12_3 = (Map.Entry)var14_4.next();
                            continue;
                        }
                        var12_3 = null;
                    }
                    switch (S.g0(var7_8)) {
                        default: {
                            ** break;
                        }
                        case 68: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            ** GOTO lbl198
                        }
                        case 67: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = S.V(var1_1, S.Q(var7_8));
                            ** GOTO lbl203
                        }
                        case 66: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = S.U(var1_1, S.Q(var7_8));
                            ** GOTO lbl208
                        }
                        case 65: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = S.V(var1_1, S.Q(var7_8));
                            ** GOTO lbl213
                        }
                        case 64: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = S.U(var1_1, S.Q(var7_8));
                            ** GOTO lbl218
                        }
                        case 63: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = S.U(var1_1, S.Q(var7_8));
                            ** GOTO lbl223
                        }
                        case 62: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = S.U(var1_1, S.Q(var7_8));
                            ** GOTO lbl228
                        }
                        case 61: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            ** GOTO lbl232
                        }
                        case 60: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            ** GOTO lbl236
                        }
                        case 59: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            ** GOTO lbl240
                        }
                        case 58: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var11_11 = S.R(var1_1, S.Q(var7_8));
                            ** GOTO lbl245
                        }
                        case 57: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = S.U(var1_1, S.Q(var7_8));
                            ** GOTO lbl250
                        }
                        case 56: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = S.V(var1_1, S.Q(var7_8));
                            ** GOTO lbl255
                        }
                        case 55: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var7_8 = S.U(var1_1, S.Q(var7_8));
                            ** GOTO lbl260
                        }
                        case 54: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = S.V(var1_1, S.Q(var7_8));
                            ** GOTO lbl265
                        }
                        case 53: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var9_10 = S.V(var1_1, S.Q(var7_8));
                            ** GOTO lbl270
                        }
                        case 52: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var5_7 = S.T(var1_1, S.Q(var7_8));
                            ** GOTO lbl275
                        }
                        case 51: {
                            if (!this.D(var1_1, var8_9, var6_5)) break block99;
                            var3_6 = S.S(var1_1, S.Q(var7_8));
                            break block100;
                        }
                        case 50: {
                            this.l0(var2_2, var8_9, p0.A(var1_1, S.Q(var7_8)), var6_5);
                            ** break;
                        }
                        case 49: {
                            g0.T(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, this.r(var6_5));
                            ** break;
                        }
                        case 48: {
                            g0.a0(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 47: {
                            g0.Z(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 46: {
                            g0.Y(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 45: {
                            g0.X(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 44: {
                            g0.P(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 43: {
                            g0.c0(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 42: {
                            g0.M(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 41: {
                            g0.Q(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 40: {
                            g0.R(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 39: {
                            g0.U(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 38: {
                            g0.d0(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 37: {
                            g0.V(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 36: {
                            g0.S(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 35: {
                            g0.O(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, true);
                            ** break;
                        }
                        case 34: {
                            g0.a0(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 33: {
                            g0.Z(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 32: {
                            g0.Y(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 31: {
                            g0.X(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 30: {
                            g0.P(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 29: {
                            g0.c0(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 28: {
                            g0.N(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2);
                            ** break;
                        }
                        case 27: {
                            g0.W(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, this.r(var6_5));
                            ** break;
                        }
                        case 26: {
                            g0.b0(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2);
                            ** break;
                        }
                        case 25: {
                            g0.M(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 24: {
                            g0.Q(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 23: {
                            g0.R(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 22: {
                            g0.U(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 21: {
                            g0.d0(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 20: {
                            g0.V(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 19: {
                            g0.S(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 18: {
                            g0.O(this.P(var6_5), (List)p0.A(var1_1, S.Q(var7_8)), var2_2, false);
                            ** break;
                        }
                        case 17: {
                            if (!this.x(var1_1, var6_5)) break block99;
lbl198: // 2 sources:
                            var2_2.O(var8_9, p0.A(var1_1, S.Q(var7_8)), this.r(var6_5));
                            break block99;
                        }
                        case 16: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var9_10 = S.G(var1_1, S.Q(var7_8));
lbl203: // 2 sources:
                            var2_2.w(var8_9, var9_10);
                            break block99;
                        }
                        case 15: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var7_8 = S.v(var1_1, S.Q(var7_8));
lbl208: // 2 sources:
                            var2_2.H(var8_9, var7_8);
                            break block99;
                        }
                        case 14: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var9_10 = S.G(var1_1, S.Q(var7_8));
lbl213: // 2 sources:
                            var2_2.n(var8_9, var9_10);
                            break block99;
                        }
                        case 13: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var7_8 = S.v(var1_1, S.Q(var7_8));
lbl218: // 2 sources:
                            var2_2.g(var8_9, var7_8);
                            break block99;
                        }
                        case 12: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var7_8 = S.v(var1_1, S.Q(var7_8));
lbl223: // 2 sources:
                            var2_2.D(var8_9, var7_8);
                            break block99;
                        }
                        case 11: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var7_8 = S.v(var1_1, S.Q(var7_8));
lbl228: // 2 sources:
                            var2_2.e(var8_9, var7_8);
                            break block99;
                        }
                        case 10: {
                            if (!this.x(var1_1, var6_5)) break block99;
lbl232: // 2 sources:
                            var2_2.J(var8_9, (g)p0.A(var1_1, S.Q(var7_8)));
                            break block99;
                        }
                        case 9: {
                            if (!this.x(var1_1, var6_5)) break block99;
lbl236: // 2 sources:
                            var2_2.K(var8_9, p0.A(var1_1, S.Q(var7_8)), this.r(var6_5));
                            break block99;
                        }
                        case 8: {
                            if (!this.x(var1_1, var6_5)) break block99;
lbl240: // 2 sources:
                            this.m0(var8_9, p0.A(var1_1, S.Q(var7_8)), var2_2);
                            break block99;
                        }
                        case 7: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var11_11 = S.k(var1_1, S.Q(var7_8));
lbl245: // 2 sources:
                            var2_2.d(var8_9, var11_11);
                            break block99;
                        }
                        case 6: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var7_8 = S.v(var1_1, S.Q(var7_8));
lbl250: // 2 sources:
                            var2_2.l(var8_9, var7_8);
                            break block99;
                        }
                        case 5: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var9_10 = S.G(var1_1, S.Q(var7_8));
lbl255: // 2 sources:
                            var2_2.u(var8_9, var9_10);
                            break block99;
                        }
                        case 4: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var7_8 = S.v(var1_1, S.Q(var7_8));
lbl260: // 2 sources:
                            var2_2.i(var8_9, var7_8);
                            break block99;
                        }
                        case 3: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var9_10 = S.G(var1_1, S.Q(var7_8));
lbl265: // 2 sources:
                            var2_2.C(var8_9, var9_10);
                            break block99;
                        }
                        case 2: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var9_10 = S.G(var1_1, S.Q(var7_8));
lbl270: // 2 sources:
                            var2_2.c(var8_9, var9_10);
                            break block99;
                        }
                        case 1: {
                            if (!this.x(var1_1, var6_5)) break block99;
                            var5_7 = S.o(var1_1, S.Q(var7_8));
lbl275: // 2 sources:
                            var2_2.x(var8_9, var5_7);
                            break block99;
                        }
                        case 0: 
                    }
                    if (!this.x(var1_1, var6_5)) break block99;
                    var3_6 = S.l(var1_1, S.Q(var7_8));
                }
                var2_2.m(var8_9, var3_6);
                ** break;
            }
            var6_5 -= 3;
        } while (true);
    }

    public final void l0(s0 s02, int n8, Object object, int n9) {
        if (object != null) {
            s02.N(n8, this.q.d(this.q(n9)), this.q.e(object));
        }
    }

    public final boolean m(Object object, Object object2, int n8) {
        int n9 = this.h0(n8);
        long l8 = S.Q(n9);
        n9 = S.g0(n9);
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
                if (this.C(object, object2, n8)) {
                    bl20 = bl19;
                    if (g0.J(p0.A(object, l8), p0.A(object2, l8))) {
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
                return g0.J(p0.A(object, l8), p0.A(object2, l8));
            }
            case 17: {
                boolean bl21 = bl;
                if (this.j(object, object2, n8)) {
                    bl21 = bl;
                    if (g0.J(p0.A(object, l8), p0.A(object2, l8))) {
                        bl21 = true;
                    }
                }
                return bl21;
            }
            case 16: {
                boolean bl22 = bl2;
                if (this.j(object, object2, n8)) {
                    bl22 = bl2;
                    if (p0.y(object, l8) == p0.y(object2, l8)) {
                        bl22 = true;
                    }
                }
                return bl22;
            }
            case 15: {
                boolean bl23 = bl3;
                if (this.j(object, object2, n8)) {
                    bl23 = bl3;
                    if (p0.x(object, l8) == p0.x(object2, l8)) {
                        bl23 = true;
                    }
                }
                return bl23;
            }
            case 14: {
                boolean bl24 = bl4;
                if (this.j(object, object2, n8)) {
                    bl24 = bl4;
                    if (p0.y(object, l8) == p0.y(object2, l8)) {
                        bl24 = true;
                    }
                }
                return bl24;
            }
            case 13: {
                boolean bl25 = bl5;
                if (this.j(object, object2, n8)) {
                    bl25 = bl5;
                    if (p0.x(object, l8) == p0.x(object2, l8)) {
                        bl25 = true;
                    }
                }
                return bl25;
            }
            case 12: {
                boolean bl26 = bl6;
                if (this.j(object, object2, n8)) {
                    bl26 = bl6;
                    if (p0.x(object, l8) == p0.x(object2, l8)) {
                        bl26 = true;
                    }
                }
                return bl26;
            }
            case 11: {
                boolean bl27 = bl7;
                if (this.j(object, object2, n8)) {
                    bl27 = bl7;
                    if (p0.x(object, l8) == p0.x(object2, l8)) {
                        bl27 = true;
                    }
                }
                return bl27;
            }
            case 10: {
                boolean bl28 = bl8;
                if (this.j(object, object2, n8)) {
                    bl28 = bl8;
                    if (g0.J(p0.A(object, l8), p0.A(object2, l8))) {
                        bl28 = true;
                    }
                }
                return bl28;
            }
            case 9: {
                boolean bl29 = bl9;
                if (this.j(object, object2, n8)) {
                    bl29 = bl9;
                    if (g0.J(p0.A(object, l8), p0.A(object2, l8))) {
                        bl29 = true;
                    }
                }
                return bl29;
            }
            case 8: {
                boolean bl30 = bl10;
                if (this.j(object, object2, n8)) {
                    bl30 = bl10;
                    if (g0.J(p0.A(object, l8), p0.A(object2, l8))) {
                        bl30 = true;
                    }
                }
                return bl30;
            }
            case 7: {
                boolean bl31 = bl11;
                if (this.j(object, object2, n8)) {
                    bl31 = bl11;
                    if (p0.p(object, l8) == p0.p(object2, l8)) {
                        bl31 = true;
                    }
                }
                return bl31;
            }
            case 6: {
                boolean bl32 = bl12;
                if (this.j(object, object2, n8)) {
                    bl32 = bl12;
                    if (p0.x(object, l8) == p0.x(object2, l8)) {
                        bl32 = true;
                    }
                }
                return bl32;
            }
            case 5: {
                boolean bl33 = bl13;
                if (this.j(object, object2, n8)) {
                    bl33 = bl13;
                    if (p0.y(object, l8) == p0.y(object2, l8)) {
                        bl33 = true;
                    }
                }
                return bl33;
            }
            case 4: {
                boolean bl34 = bl14;
                if (this.j(object, object2, n8)) {
                    bl34 = bl14;
                    if (p0.x(object, l8) == p0.x(object2, l8)) {
                        bl34 = true;
                    }
                }
                return bl34;
            }
            case 3: {
                boolean bl35 = bl15;
                if (this.j(object, object2, n8)) {
                    bl35 = bl15;
                    if (p0.y(object, l8) == p0.y(object2, l8)) {
                        bl35 = true;
                    }
                }
                return bl35;
            }
            case 2: {
                boolean bl36 = bl16;
                if (this.j(object, object2, n8)) {
                    bl36 = bl16;
                    if (p0.y(object, l8) == p0.y(object2, l8)) {
                        bl36 = true;
                    }
                }
                return bl36;
            }
            case 1: {
                boolean bl37 = bl17;
                if (this.j(object, object2, n8)) {
                    bl37 = bl17;
                    if (Float.floatToIntBits((float)p0.w(object, l8)) == Float.floatToIntBits((float)p0.w(object2, l8))) {
                        bl37 = true;
                    }
                }
                return bl37;
            }
            case 0: 
        }
        boolean bl38 = bl18;
        if (this.j(object, object2, n8)) {
            bl38 = bl18;
            if (Double.doubleToLongBits((double)p0.v(object, l8)) == Double.doubleToLongBits((double)p0.v(object2, l8))) {
                bl38 = true;
            }
        }
        return bl38;
    }

    public final void m0(int n8, Object object, s0 s02) {
        if (object instanceof String) {
            s02.A(n8, (String)object);
            return;
        }
        s02.J(n8, (g)object);
    }

    public final Object n(Object object, int n8, Object object2, l0 l02) {
        this.P(n8);
        if (p0.A(object, S.Q(this.h0(n8))) == null) {
            return object2;
        }
        this.p(n8);
        return object2;
    }

    public final void n0(l0 l02, Object object, s0 s02) {
        l02.t(l02.g(object), s02);
    }

    public final y.a p(int n8) {
        a.a(this.b[n8 / 3 * 2 + 1]);
        return null;
    }

    public final Object q(int n8) {
        return this.b[n8 / 3 * 2];
    }

    public final e0 r(int n8) {
        e0 e02 = (e0)this.b[n8 = n8 / 3 * 2];
        if (e02 != null) {
            return e02;
        }
        e02 = a0.a().c((Class)this.b[n8 + 1]);
        this.b[n8] = e02;
        return e02;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int s(Object var1_1) {
        var15_2 = S.s;
        var2_3 = -1;
        var7_4 = 0;
        var4_5 = 0;
        var3_6 = 0;
        do {
            block79 : {
                block80 : {
                    if (var7_4 >= this.a.length) {
                        var2_3 = var3_6 = var4_5 + this.u(this.o, var1_1);
                        if (this.f == false) return var2_3;
                        return var3_6 + this.p.c(var1_1).h();
                    }
                    var11_12 = this.h0(var7_4);
                    var10_11 = this.P(var7_4);
                    var12_13 = S.g0(var11_12);
                    if (var12_13 <= 17) {
                        var6_8 = this.a[var7_4 + 2];
                        var8_9 = 1048575 & var6_8;
                        var5_7 = var2_3;
                        if (var8_9 != var2_3) {
                            var3_6 = var15_2.getInt(var1_1, (long)var8_9);
                            var5_7 = var8_9;
                        }
                        var9_10 = 1 << (var6_8 >>> 20);
                        var8_9 = var3_6;
                    } else {
                        var6_8 = this.i != false && var12_13 >= t.c0.c() && var12_13 <= t.p0.c() ? this.a[var7_4 + 2] & 1048575 : 0;
                        var9_10 = 0;
                        var5_7 = var2_3;
                        var8_9 = var3_6;
                    }
                    var13_14 = S.Q(var11_12);
                    switch (var12_13) {
                        default: {
                            var2_3 = var4_5;
                            ** GOTO lbl348
                        }
                        case 68: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            ** GOTO lbl284
                        }
                        case 67: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            var13_14 = S.V(var1_1, var13_14);
                            ** GOTO lbl290
                        }
                        case 66: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            var2_3 = S.U(var1_1, var13_14);
                            ** GOTO lbl296
                        }
                        case 65: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            ** GOTO lbl301
                        }
                        case 64: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            ** GOTO lbl306
                        }
                        case 63: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            var2_3 = S.U(var1_1, var13_14);
                            ** GOTO lbl313
                        }
                        case 62: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            var2_3 = S.U(var1_1, var13_14);
                            ** GOTO lbl319
                        }
                        case 61: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            ** GOTO lbl324
                        }
                        case 60: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            ** GOTO lbl329
                        }
                        case 59: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            var16_15 = var15_2.getObject(var1_1, var13_14);
                            var2_3 = var16_15 instanceof g ? j.f(var10_11, (g)var16_15) : j.N(var10_11, (String)var16_15);
                            ** GOTO lbl341
                        }
                        case 58: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            ** GOTO lbl340
                        }
                        case 57: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            var2_3 = j.l(var10_11, 0);
                            ** GOTO lbl307
                        }
                        case 56: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            var2_3 = j.n(var10_11, 0L);
                            ** GOTO lbl341
                        }
                        case 55: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            var2_3 = j.u(var10_11, S.U(var1_1, var13_14));
                            ** GOTO lbl341
                        }
                        case 54: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            var2_3 = j.S(var10_11, S.V(var1_1, var13_14));
                            ** GOTO lbl341
                        }
                        case 53: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            var2_3 = j.w(var10_11, S.V(var1_1, var13_14));
                            ** GOTO lbl341
                        }
                        case 52: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            var2_3 = j.p(var10_11, 0.0f);
                            ** GOTO lbl341
                        }
                        case 51: {
                            var2_3 = var4_5;
                            if (!this.D(var1_1, var10_11, var7_4)) ** GOTO lbl348
                            var2_3 = j.h(var10_11, 0.0);
                            ** GOTO lbl341
                        }
                        case 50: {
                            var2_3 = this.q.b(var10_11, var15_2.getObject(var1_1, var13_14), this.q(var7_4));
                            ** GOTO lbl341
                        }
                        case 49: {
                            var2_3 = g0.j(var10_11, (List)var15_2.getObject(var1_1, var13_14), this.r(var7_4));
                            ** GOTO lbl341
                        }
                        case 48: {
                            var3_6 = g0.t((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 47: {
                            var3_6 = g0.r((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 46: {
                            var3_6 = g0.i((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 45: {
                            var3_6 = g0.g((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 44: {
                            var3_6 = g0.e((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 43: {
                            var3_6 = g0.w((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 42: {
                            var3_6 = g0.b((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 41: {
                            var3_6 = g0.g((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 40: {
                            var3_6 = g0.i((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 39: {
                            var3_6 = g0.l((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 38: {
                            var3_6 = g0.y((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 37: {
                            var3_6 = g0.n((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 36: {
                            var3_6 = g0.g((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
                            ** GOTO lbl235
                        }
                        case 35: {
                            var3_6 = g0.i((List)var15_2.getObject(var1_1, var13_14));
                            var2_3 = var4_5;
                            if (var3_6 <= 0) ** GOTO lbl348
                            var2_3 = var3_6;
                            if (!this.i) ** GOTO lbl236
                            var2_3 = var3_6;
lbl235: // 14 sources:
                            var15_2.putInt(var1_1, (long)var6_8, var2_3);
lbl236: // 15 sources:
                            var2_3 = j.P(var10_11) + j.R(var2_3) + var2_3;
                            ** GOTO lbl307
                        }
                        case 34: {
                            var2_3 = g0.s(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                            ** GOTO lbl276
                        }
                        case 33: {
                            var2_3 = g0.q(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                            ** GOTO lbl276
                        }
                        case 23: 
                        case 32: {
                            var2_3 = g0.h(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                            ** GOTO lbl276
                        }
                        case 19: 
                        case 24: 
                        case 31: {
                            var2_3 = g0.f(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                            ** GOTO lbl276
                        }
                        case 30: {
                            var2_3 = g0.d(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                            ** GOTO lbl276
                        }
                        case 29: {
                            var2_3 = g0.v(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                            ** GOTO lbl341
                        }
                        case 28: {
                            var2_3 = g0.c(var10_11, (List)var15_2.getObject(var1_1, var13_14));
                            ** GOTO lbl341
                        }
                        case 27: {
                            var2_3 = g0.p(var10_11, (List)var15_2.getObject(var1_1, var13_14), this.r(var7_4));
                            ** GOTO lbl341
                        }
                        case 26: {
                            var2_3 = g0.u(var10_11, (List)var15_2.getObject(var1_1, var13_14));
                            ** GOTO lbl341
                        }
                        case 25: {
                            var2_3 = g0.a(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                            ** GOTO lbl276
                        }
                        case 22: {
                            var2_3 = g0.k(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                            ** GOTO lbl276
                        }
                        case 21: {
                            var2_3 = g0.x(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                            ** GOTO lbl276
                        }
                        case 20: {
                            var2_3 = g0.m(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
lbl276: // 9 sources:
                            var3_6 = var4_5 + var2_3;
                            break block79;
                        }
                        case 18: {
                            var2_3 = g0.h(var10_11, (List)var15_2.getObject(var1_1, var13_14), false);
                            ** GOTO lbl341
                        }
                        case 17: {
                            var2_3 = var4_5;
                            if ((var8_9 & var9_10) == 0) ** GOTO lbl348
lbl284: // 2 sources:
                            var2_3 = j.r(var10_11, (O)var15_2.getObject(var1_1, var13_14), this.r(var7_4));
                            ** GOTO lbl341
                        }
                        case 16: {
                            var2_3 = var4_5;
                            if ((var8_9 & var9_10) == 0) ** GOTO lbl348
                            var13_14 = var15_2.getLong(var1_1, var13_14);
lbl290: // 2 sources:
                            var2_3 = j.L(var10_11, var13_14);
                            ** GOTO lbl341
                        }
                        case 15: {
                            var2_3 = var4_5;
                            if ((var8_9 & var9_10) == 0) ** GOTO lbl348
                            var2_3 = var15_2.getInt(var1_1, var13_14);
lbl296: // 2 sources:
                            var2_3 = j.J(var10_11, var2_3);
                            ** GOTO lbl341
                        }
                        case 14: {
                            var2_3 = var4_5;
                            if ((var8_9 & var9_10) == 0) ** GOTO lbl348
lbl301: // 2 sources:
                            var2_3 = j.H(var10_11, 0L);
                            ** GOTO lbl341
                        }
                        case 13: {
                            var2_3 = var4_5;
                            if ((var8_9 & var9_10) == 0) ** GOTO lbl348
lbl306: // 2 sources:
                            var2_3 = j.F(var10_11, 0);
lbl307: // 3 sources:
                            var2_3 = var4_5 + var2_3;
                            ** GOTO lbl348
                        }
                        case 12: {
                            var2_3 = var4_5;
                            if ((var8_9 & var9_10) == 0) ** GOTO lbl348
                            var2_3 = var15_2.getInt(var1_1, var13_14);
lbl313: // 2 sources:
                            var2_3 = j.j(var10_11, var2_3);
                            ** GOTO lbl341
                        }
                        case 11: {
                            var2_3 = var4_5;
                            if ((var8_9 & var9_10) == 0) ** GOTO lbl348
                            var2_3 = var15_2.getInt(var1_1, var13_14);
lbl319: // 2 sources:
                            var2_3 = j.Q(var10_11, var2_3);
                            ** GOTO lbl341
                        }
                        case 10: {
                            var2_3 = var4_5;
                            if ((var8_9 & var9_10) == 0) ** GOTO lbl348
lbl324: // 2 sources:
                            var2_3 = j.f(var10_11, (g)var15_2.getObject(var1_1, var13_14));
                            ** GOTO lbl341
                        }
                        case 9: {
                            var2_3 = var4_5;
                            if ((var8_9 & var9_10) == 0) ** GOTO lbl348
lbl329: // 2 sources:
                            var2_3 = g0.o(var10_11, var15_2.getObject(var1_1, var13_14), this.r(var7_4));
                            ** GOTO lbl341
                        }
                        case 8: {
                            var2_3 = var4_5;
                            if ((var8_9 & var9_10) == 0) ** GOTO lbl348
                            var16_15 = var15_2.getObject(var1_1, var13_14);
                            var2_3 = var16_15 instanceof g ? j.f(var10_11, (g)var16_15) : j.N(var10_11, (String)var16_15);
                            ** GOTO lbl341
                        }
                        case 7: {
                            var2_3 = var4_5;
                            if ((var8_9 & var9_10) == 0) ** GOTO lbl348
lbl340: // 2 sources:
                            var2_3 = j.c(var10_11, true);
lbl341: // 24 sources:
                            var2_3 = var4_5 + var2_3;
                            ** GOTO lbl348
                        }
                        case 6: {
                            var2_3 = var4_5;
                            if ((var8_9 & var9_10) == 0) ** GOTO lbl348
                            var2_3 = j.l(var10_11, 0);
                            break block80;
lbl348: // 47 sources:
                            var3_6 = var2_3;
                            break block79;
                        }
                        case 5: {
                            var3_6 = var4_5;
                            if ((var8_9 & var9_10) == 0) break block79;
                            var2_3 = j.n(var10_11, 0L);
                            break block80;
                        }
                        case 4: {
                            var3_6 = var4_5;
                            if ((var8_9 & var9_10) == 0) break block79;
                            var2_3 = j.u(var10_11, var15_2.getInt(var1_1, var13_14));
                            break block80;
                        }
                        case 3: {
                            var3_6 = var4_5;
                            if ((var8_9 & var9_10) == 0) break block79;
                            var2_3 = j.S(var10_11, var15_2.getLong(var1_1, var13_14));
                            break block80;
                        }
                        case 2: {
                            var3_6 = var4_5;
                            if ((var8_9 & var9_10) == 0) break block79;
                            var2_3 = j.w(var10_11, var15_2.getLong(var1_1, var13_14));
                            break block80;
                        }
                        case 1: {
                            var3_6 = var4_5;
                            if ((var8_9 & var9_10) == 0) break block79;
                            var2_3 = j.p(var10_11, 0.0f);
                            break block80;
                        }
                        case 0: 
                    }
                    var3_6 = var4_5;
                    if ((var8_9 & var9_10) == 0) break block79;
                    var2_3 = j.h(var10_11, 0.0);
                }
                var3_6 = var4_5 + var2_3;
            }
            var7_4 += 3;
            var2_3 = var5_7;
            var4_5 = var3_6;
            var3_6 = var8_9;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int t(Object var1_1) {
        var12_2 = S.s;
        var4_4 = var3_3 = 0;
        while (var3_3 < this.a.length) {
            block80 : {
                block82 : {
                    block81 : {
                        var5_6 = this.h0(var3_3);
                        var2_5 = S.g0(var5_6);
                        var7_8 = this.P(var3_3);
                        var8_9 = S.Q(var5_6);
                        var5_6 = var2_5 >= t.c0.c() && var2_5 <= t.p0.c() ? this.a[var3_3 + 2] & 1048575 : 0;
                        switch (var2_5) {
                            default: {
                                var2_5 = var4_4;
                                ** break;
                            }
                            case 68: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl257
                            }
                            case 67: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                var8_9 = S.V(var1_1, var8_9);
                                ** GOTO lbl263
                            }
                            case 66: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                var2_5 = S.U(var1_1, var8_9);
                                ** GOTO lbl269
                            }
                            case 65: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl274
                            }
                            case 64: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl279
                            }
                            case 63: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                var2_5 = S.U(var1_1, var8_9);
                                ** GOTO lbl285
                            }
                            case 62: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                var2_5 = S.U(var1_1, var8_9);
                                ** GOTO lbl291
                            }
                            case 61: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl296
                            }
                            case 60: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl301
                            }
                            case 59: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                var10_10 = var11_11 = p0.A(var1_1, var8_9);
                                if (!(var11_11 instanceof g)) ** GOTO lbl-1000
                                var10_10 = var11_11;
                                ** GOTO lbl309
                            }
                            case 58: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl317
                            }
                            case 57: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl322
                            }
                            case 56: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl327
                            }
                            case 55: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                var2_5 = S.U(var1_1, var8_9);
                                ** GOTO lbl333
                            }
                            case 54: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                var8_9 = S.V(var1_1, var8_9);
                                ** GOTO lbl339
                            }
                            case 53: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                var8_9 = S.V(var1_1, var8_9);
                                ** GOTO lbl345
                            }
                            case 52: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                ** GOTO lbl350
                            }
                            case 51: {
                                var2_5 = var4_4;
                                if (!this.D(var1_1, var7_8, var3_3)) break block80;
                                break block81;
                            }
                            case 50: {
                                var2_5 = this.q.b(var7_8, p0.A(var1_1, var8_9), this.q(var3_3));
                                break block82;
                            }
                            case 49: {
                                var2_5 = g0.j(var7_8, S.F(var1_1, var8_9), this.r(var3_3));
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
                                var2_5 = j.P(var7_8) + j.R(var2_5) + var2_5;
                                break block82;
                            }
                            case 34: {
                                var2_5 = g0.s(var7_8, S.F(var1_1, var8_9), false);
                                break block82;
                            }
                            case 33: {
                                var2_5 = g0.q(var7_8, S.F(var1_1, var8_9), false);
                                break block82;
                            }
                            case 18: 
                            case 23: 
                            case 32: {
                                var2_5 = g0.h(var7_8, S.F(var1_1, var8_9), false);
                                break block82;
                            }
                            case 19: 
                            case 24: 
                            case 31: {
                                var2_5 = g0.f(var7_8, S.F(var1_1, var8_9), false);
                                break block82;
                            }
                            case 30: {
                                var2_5 = g0.d(var7_8, S.F(var1_1, var8_9), false);
                                break block82;
                            }
                            case 29: {
                                var2_5 = g0.v(var7_8, S.F(var1_1, var8_9), false);
                                break block82;
                            }
                            case 28: {
                                var2_5 = g0.c(var7_8, S.F(var1_1, var8_9));
                                break block82;
                            }
                            case 27: {
                                var2_5 = g0.p(var7_8, S.F(var1_1, var8_9), this.r(var3_3));
                                break block82;
                            }
                            case 26: {
                                var2_5 = g0.u(var7_8, S.F(var1_1, var8_9));
                                break block82;
                            }
                            case 25: {
                                var2_5 = g0.a(var7_8, S.F(var1_1, var8_9), false);
                                break block82;
                            }
                            case 22: {
                                var2_5 = g0.k(var7_8, S.F(var1_1, var8_9), false);
                                break block82;
                            }
                            case 21: {
                                var2_5 = g0.x(var7_8, S.F(var1_1, var8_9), false);
                                break block82;
                            }
                            case 20: {
                                var2_5 = g0.m(var7_8, S.F(var1_1, var8_9), false);
                                break block82;
                            }
                            case 17: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
lbl257: // 2 sources:
                                var2_5 = j.r(var7_8, (O)p0.A(var1_1, var8_9), this.r(var3_3));
                                break block82;
                            }
                            case 16: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
                                var8_9 = p0.y(var1_1, var8_9);
lbl263: // 2 sources:
                                var2_5 = j.L(var7_8, var8_9);
                                break block82;
                            }
                            case 15: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
                                var2_5 = p0.x(var1_1, var8_9);
lbl269: // 2 sources:
                                var2_5 = j.J(var7_8, var2_5);
                                break block82;
                            }
                            case 14: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
lbl274: // 2 sources:
                                var2_5 = j.H(var7_8, 0L);
                                break block82;
                            }
                            case 13: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
lbl279: // 2 sources:
                                var2_5 = j.F(var7_8, 0);
                                break block82;
                            }
                            case 12: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
                                var2_5 = p0.x(var1_1, var8_9);
lbl285: // 2 sources:
                                var2_5 = j.j(var7_8, var2_5);
                                break block82;
                            }
                            case 11: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
                                var2_5 = p0.x(var1_1, var8_9);
lbl291: // 2 sources:
                                var2_5 = j.Q(var7_8, var2_5);
                                break block82;
                            }
                            case 10: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
lbl296: // 2 sources:
                                var10_10 = p0.A(var1_1, var8_9);
                                ** GOTO lbl309
                            }
                            case 9: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
lbl301: // 2 sources:
                                var2_5 = g0.o(var7_8, p0.A(var1_1, var8_9), this.r(var3_3));
                                break block82;
                            }
                            case 8: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
                                var10_10 = var11_11 = p0.A(var1_1, var8_9);
                                ** if (!(var11_11 instanceof g)) goto lbl-1000
lbl-1000: // 1 sources:
                                {
                                    var10_10 = var11_11;
lbl309: // 3 sources:
                                    var2_5 = j.f((int)var7_8, (g)((g)var10_10));
                                    ** GOTO lbl357
                                }
lbl-1000: // 2 sources:
                                {
                                    var2_5 = j.N(var7_8, (String)var10_10);
                                }
                                break block82;
                            }
                            case 7: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
lbl317: // 2 sources:
                                var2_5 = j.c(var7_8, true);
                                break block82;
                            }
                            case 6: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
lbl322: // 2 sources:
                                var2_5 = j.l(var7_8, 0);
                                break block82;
                            }
                            case 5: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
lbl327: // 2 sources:
                                var2_5 = j.n(var7_8, 0L);
                                break block82;
                            }
                            case 4: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
                                var2_5 = p0.x(var1_1, var8_9);
lbl333: // 2 sources:
                                var2_5 = j.u(var7_8, var2_5);
                                break block82;
                            }
                            case 3: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
                                var8_9 = p0.y(var1_1, var8_9);
lbl339: // 2 sources:
                                var2_5 = j.S(var7_8, var8_9);
                                break block82;
                            }
                            case 2: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
                                var8_9 = p0.y(var1_1, var8_9);
lbl345: // 2 sources:
                                var2_5 = j.w(var7_8, var8_9);
                                break block82;
                            }
                            case 1: {
                                var2_5 = var4_4;
                                if (!this.x(var1_1, var3_3)) break block80;
lbl350: // 2 sources:
                                var2_5 = j.p(var7_8, 0.0f);
                                break block82;
                            }
                            case 0: 
                        }
                        var2_5 = var4_4;
                        if (!this.x(var1_1, var3_3)) break block80;
                    }
                    var2_5 = j.h(var7_8, 0.0);
                }
                var2_5 = var4_4 + var2_5;
                ** break;
            }
            var3_3 += 3;
            var4_4 = var2_5;
        }
        return var4_4 + this.u(this.o, var1_1);
    }

    public final int u(l0 l02, Object object) {
        return l02.h(l02.g(object));
    }

    public final boolean x(Object object, int n8) {
        boolean bl = this.h;
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
        if (bl) {
            n8 = this.h0(n8);
            long l8 = S.Q(n8);
            switch (S.g0(n8)) {
                default: {
                    throw new IllegalArgumentException();
                }
                case 17: {
                    if (p0.A(object, l8) != null) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 16: {
                    bl17 = bl2;
                    if (p0.y(object, l8) != 0L) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 15: {
                    bl17 = bl3;
                    if (p0.x(object, l8) != 0) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 14: {
                    bl17 = bl4;
                    if (p0.y(object, l8) != 0L) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 13: {
                    bl17 = bl5;
                    if (p0.x(object, l8) != 0) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 12: {
                    bl17 = bl6;
                    if (p0.x(object, l8) != 0) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 11: {
                    bl17 = bl7;
                    if (p0.x(object, l8) != 0) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 10: {
                    return g.p.equals(p0.A(object, l8)) ^ true;
                }
                case 9: {
                    bl17 = bl8;
                    if (p0.A(object, l8) != null) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 8: {
                    object = p0.A(object, l8);
                    if (object instanceof String) {
                        return ((String)object).isEmpty() ^ true;
                    }
                    if (object instanceof g) {
                        return g.p.equals(object) ^ true;
                    }
                    throw new IllegalArgumentException();
                }
                case 7: {
                    return p0.p(object, l8);
                }
                case 6: {
                    bl17 = bl9;
                    if (p0.x(object, l8) != 0) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 5: {
                    bl17 = bl10;
                    if (p0.y(object, l8) != 0L) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 4: {
                    bl17 = bl11;
                    if (p0.x(object, l8) != 0) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 3: {
                    bl17 = bl12;
                    if (p0.y(object, l8) != 0L) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 2: {
                    bl17 = bl13;
                    if (p0.y(object, l8) != 0L) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 1: {
                    bl17 = bl14;
                    if (p0.w(object, l8) != 0.0f) {
                        bl17 = true;
                    }
                    return bl17;
                }
                case 0: 
            }
            bl17 = bl15;
            if (p0.v(object, l8) != 0.0) {
                bl17 = true;
            }
            return bl17;
        }
        n8 = this.X(n8);
        bl17 = bl16;
        if ((p0.x(object, n8 & 1048575) & 1 << (n8 >>> 20)) != 0) {
            bl17 = true;
        }
        return bl17;
    }

    public final boolean y(Object object, int n8, int n9, int n10) {
        if (this.h) {
            return this.x(object, n8);
        }
        if ((n9 & n10) != 0) {
            return true;
        }
        return false;
    }
}

