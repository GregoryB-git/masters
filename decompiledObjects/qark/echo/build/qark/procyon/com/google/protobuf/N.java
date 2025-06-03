// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import java.util.Arrays;
import java.lang.reflect.Field;
import android.support.v4.media.a;
import java.util.List;
import sun.misc.Unsafe;

public final class N implements Z
{
    public static final int[] r;
    public static final Unsafe s;
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
    
    static {
        r = new int[0];
        s = k0.D();
    }
    
    public N(final int[] a, final Object[] b, final int c, final int d, final K e, final boolean h, final boolean i, final int[] j, final int k, final int l, final P m, final A n, final g0 o, final l p15, final F q) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = (e instanceof r);
        this.h = h;
        this.f = (p15 != null && p15.d(e));
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p15;
        this.e = e;
        this.q = q;
    }
    
    public static boolean C(final int n) {
        return (n & 0x10000000) != 0x0;
    }
    
    public static List D(final Object o, final long n) {
        return (List)k0.C(o, n);
    }
    
    public static long E(final Object o, final long n) {
        return k0.A(o, n);
    }
    
    public static N I(final Class clazz, final I i, final P p7, final A a, final g0 g0, final l l, final F f) {
        if (i instanceof Y) {
            return K((Y)i, p7, a, g0, l, f);
        }
        a.a(i);
        return J(null, p7, a, g0, l, f);
    }
    
    public static N J(final d0 d0, final P p6, final A a, final g0 g0, final l l, final F f) {
        throw null;
    }
    
    public static N K(final Y y, final P p6, final A a, final g0 g0, final l l, final F f) {
        final boolean b = y.b() == V.p;
        final String e = y.e();
        final int length = e.length();
        int index2;
        if (e.charAt(0) >= '\ud800') {
            int index = 1;
            while (true) {
                final int n = index2 = index + 1;
                if (e.charAt(index) < '\ud800') {
                    break;
                }
                index = n;
            }
        }
        else {
            index2 = 1;
        }
        final int n2 = index2 + 1;
        final char char1 = e.charAt(index2);
        int n3 = n2;
        int n4;
        if ((n4 = char1) >= 55296) {
            int n5 = char1 & '\u1fff';
            int n6 = 13;
            int index3 = n2;
            int n7;
            char char2;
            while (true) {
                n7 = index3 + 1;
                char2 = e.charAt(index3);
                if (char2 < '\ud800') {
                    break;
                }
                n5 |= (char2 & '\u1fff') << n6;
                n6 += 13;
                index3 = n7;
            }
            n4 = (n5 | char2 << n6);
            n3 = n7;
        }
        int[] r;
        int n8;
        int char3;
        int n9;
        int char4;
        int n12;
        int n11;
        int char5;
        if (n4 == 0) {
            r = N.r;
            n8 = 0;
            n9 = (char3 = n8);
            final int n10 = char4 = char3;
            n11 = (n12 = char4);
            char5 = n10;
        }
        else {
            final int n13 = n3 + 1;
            int char6;
            final char c = (char)(char6 = e.charAt(n3));
            int index4 = n13;
            if (c >= '\ud800') {
                int n14 = c & '\u1fff';
                int n15 = 13;
                int index5 = n13;
                int n16;
                char char7;
                while (true) {
                    n16 = index5 + 1;
                    char7 = e.charAt(index5);
                    if (char7 < '\ud800') {
                        break;
                    }
                    n14 |= (char7 & '\u1fff') << n15;
                    n15 += 13;
                    index5 = n16;
                }
                char6 = (n14 | char7 << n15);
                index4 = n16;
            }
            final int n17 = index4 + 1;
            int char8;
            final char c2 = (char)(char8 = e.charAt(index4));
            int index6 = n17;
            if (c2 >= '\ud800') {
                int n18 = c2 & '\u1fff';
                int n19 = 13;
                int index7 = n17;
                int n20;
                char char9;
                while (true) {
                    n20 = index7 + 1;
                    char9 = e.charAt(index7);
                    if (char9 < '\ud800') {
                        break;
                    }
                    n18 |= (char9 & '\u1fff') << n19;
                    n19 += 13;
                    index7 = n20;
                }
                char8 = (n18 | char9 << n19);
                index6 = n20;
            }
            final int n21 = index6 + 1;
            int char10;
            final char c3 = (char)(char10 = e.charAt(index6));
            int index8 = n21;
            if (c3 >= '\ud800') {
                int n22 = c3 & '\u1fff';
                int n23 = 13;
                int index9 = n21;
                int n24;
                char char11;
                while (true) {
                    n24 = index9 + 1;
                    char11 = e.charAt(index9);
                    if (char11 < '\ud800') {
                        break;
                    }
                    n22 |= (char11 & '\u1fff') << n23;
                    n23 += 13;
                    index9 = n24;
                }
                char10 = (n22 | char11 << n23);
                index8 = n24;
            }
            final int n25 = index8 + 1;
            int char12;
            final char c4 = (char)(char12 = e.charAt(index8));
            int index10 = n25;
            if (c4 >= '\ud800') {
                int n26 = c4 & '\u1fff';
                int n27 = 13;
                int index11 = n25;
                int n28;
                char char13;
                while (true) {
                    n28 = index11 + 1;
                    char13 = e.charAt(index11);
                    if (char13 < '\ud800') {
                        break;
                    }
                    n26 |= (char13 & '\u1fff') << n27;
                    n27 += 13;
                    index11 = n28;
                }
                char12 = (n26 | char13 << n27);
                index10 = n28;
            }
            final int n29 = index10 + 1;
            final char c5 = (char)(char3 = e.charAt(index10));
            int index12 = n29;
            if (c5 >= '\ud800') {
                int n30 = c5 & '\u1fff';
                int n31 = 13;
                int index13 = n29;
                int n32;
                char char14;
                while (true) {
                    n32 = index13 + 1;
                    char14 = e.charAt(index13);
                    if (char14 < '\ud800') {
                        break;
                    }
                    n30 |= (char14 & '\u1fff') << n31;
                    n31 += 13;
                    index13 = n32;
                }
                char3 = (n30 | char14 << n31);
                index12 = n32;
            }
            final int n33 = index12 + 1;
            final char c6 = (char)(char5 = e.charAt(index12));
            int index14 = n33;
            if (c6 >= '\ud800') {
                int n34 = c6 & '\u1fff';
                int n35 = 13;
                int index15 = n33;
                int n36;
                char char15;
                while (true) {
                    n36 = index15 + 1;
                    char15 = e.charAt(index15);
                    if (char15 < '\ud800') {
                        break;
                    }
                    n34 |= (char15 & '\u1fff') << n35;
                    n35 += 13;
                    index15 = n36;
                }
                char5 = (n34 | char15 << n35);
                index14 = n36;
            }
            final int n37 = index14 + 1;
            int char16;
            final char c7 = (char)(char16 = e.charAt(index14));
            int index16 = n37;
            if (c7 >= '\ud800') {
                int n38 = c7 & '\u1fff';
                int n39 = 13;
                int index17 = n37;
                int n40;
                char char17;
                while (true) {
                    n40 = index17 + 1;
                    char17 = e.charAt(index17);
                    if (char17 < '\ud800') {
                        break;
                    }
                    n38 |= (char17 & '\u1fff') << n39;
                    n39 += 13;
                    index17 = n40;
                }
                char16 = (n38 | char17 << n39);
                index16 = n40;
            }
            final int n41 = index16 + 1;
            final char c8 = (char)(char4 = e.charAt(index16));
            int n42 = n41;
            if (c8 >= '\ud800') {
                final int n43 = c8 & '\u1fff';
                int n44 = 13;
                int index18 = n41;
                int n45 = n43;
                char char18;
                while (true) {
                    n42 = index18 + 1;
                    char18 = e.charAt(index18);
                    if (char18 < '\ud800') {
                        break;
                    }
                    n45 |= (char18 & '\u1fff') << n44;
                    n44 += 13;
                    index18 = n42;
                }
                char4 = (n45 | char18 << n44);
            }
            r = new int[char4 + char5 + char16];
            n11 = char6 * 2 + char8;
            final int n46 = n42;
            n9 = char12;
            n8 = char10;
            n12 = char6;
            n3 = n46;
        }
        final Unsafe s = N.s;
        final Object[] d = y.d();
        final Class<? extends K> class1 = y.c().getClass();
        final int[] array = new int[char3 * 3];
        final Object[] array2 = new Object[char3 * 2];
        final int n47 = char4 + char5;
        int n48 = char4;
        int n49 = n47;
        int n50 = 0;
        int n51 = 0;
        int n52 = n11;
        final int n53 = char4;
        final int n54 = n9;
        final int n55 = n8;
        int n56 = length;
        while (true) {
            final int n57 = n51;
            if (n3 >= n56) {
                break;
            }
            int index19 = n3 + 1;
            int char19 = e.charAt(n3);
            int index20;
            if (char19 >= 55296) {
                int n58 = char19 & 0x1FFF;
                int n59 = 13;
                char char20;
                while (true) {
                    index20 = index19 + 1;
                    char20 = e.charAt(index19);
                    if (char20 < '\ud800') {
                        break;
                    }
                    n58 |= (char20 & '\u1fff') << n59;
                    n59 += 13;
                    index19 = index20;
                }
                char19 = (n58 | char20 << n59);
            }
            else {
                index20 = index19;
            }
            int index21 = index20 + 1;
            int char21 = e.charAt(index20);
            int n63;
            int n64;
            if (char21 >= 55296) {
                int n60 = char21 & 0x1FFF;
                int n61 = 13;
                int n62;
                char char22;
                while (true) {
                    n62 = index21 + 1;
                    char22 = e.charAt(index21);
                    n63 = n56;
                    if (char22 < '\ud800') {
                        break;
                    }
                    n60 |= (char22 & '\u1fff') << n61;
                    n61 += 13;
                    n56 = n63;
                    index21 = n62;
                }
                char21 = (n60 | char22 << n61);
                n64 = n62;
            }
            else {
                n64 = index21;
                n63 = n56;
            }
            final int n65 = char21 & 0xFF;
            int n66 = n50;
            if ((char21 & 0x400) != 0x0) {
                r[n50] = n57;
                n66 = n50 + 1;
            }
            int n68;
            int n80;
            int n82;
            int n83;
            int n84;
            int n85;
            if (n65 >= 51) {
                final int n67 = n64 + 1;
                int char23;
                final char c9 = (char)(char23 = e.charAt(n64));
                n68 = n67;
                if (c9 >= '\ud800') {
                    int n69 = c9 & '\u1fff';
                    int n70 = 13;
                    int index22 = n67;
                    int n71;
                    char char24;
                    while (true) {
                        n71 = index22 + 1;
                        char24 = e.charAt(index22);
                        if (char24 < '\ud800') {
                            break;
                        }
                        n69 |= (char24 & '\u1fff') << n70;
                        n70 += 13;
                        index22 = n71;
                    }
                    char23 = (n69 | char24 << n70);
                    n68 = n71;
                }
                final int n72 = n65 - 51;
                int n73 = 0;
                Label_1725: {
                    int n76;
                    if (n72 != 9 && n72 != 17) {
                        n73 = n52;
                        if (n72 != 12) {
                            break Label_1725;
                        }
                        n73 = n52;
                        if (b) {
                            break Label_1725;
                        }
                        final int n74 = n57 / 3;
                        final int n75 = n52 + 1;
                        array2[n74 * 2 + 1] = d[n52];
                        n76 = n75;
                    }
                    else {
                        final int n77 = n57 / 3;
                        final int n78 = n52 + 1;
                        array2[n77 * 2 + 1] = d[n52];
                        n76 = n78;
                    }
                    n73 = n76;
                }
                final int n79 = char23 * 2;
                final Object o = d[n79];
                Field t;
                if (o instanceof Field) {
                    t = (Field)o;
                }
                else {
                    t = T(class1, (String)o);
                    d[n79] = t;
                }
                n80 = (int)s.objectFieldOffset(t);
                final int n81 = n79 + 1;
                final Object o2 = d[n81];
                Field t2;
                if (o2 instanceof Field) {
                    t2 = (Field)o2;
                }
                else {
                    t2 = T(class1, (String)o2);
                    d[n81] = t2;
                }
                n82 = (int)s.objectFieldOffset(t2);
                n83 = 0;
                n52 = n73;
                n84 = n48;
                n85 = n49;
            }
            else {
                final int n86 = n52 + 1;
                final Field t3 = T(class1, (String)d[n52]);
                int n87 = 0;
                Label_2147: {
                    if (n65 == 9 || n65 == 17) {
                        array2[n57 / 3 * 2 + 1] = t3.getType();
                        n87 = n86;
                    }
                    else {
                        Label_2092: {
                            if (n65 == 27 || n65 == 49) {
                                final int n88 = n57 / 3;
                                n87 = n52 + 2;
                                array2[n88 * 2 + 1] = d[n86];
                            }
                            else {
                                int n89;
                                if (n65 != 12 && n65 != 30 && n65 != 44) {
                                    n87 = n86;
                                    n89 = n48;
                                    if (n65 == 50) {
                                        final int n90 = n48 + 1;
                                        r[n48] = n57;
                                        final int n91 = n57 / 3 * 2;
                                        final int n92 = n52 + 2;
                                        array2[n91] = d[n86];
                                        if ((char21 & 0x800) == 0x0) {
                                            n48 = n90;
                                            n87 = n92;
                                            break Label_2147;
                                        }
                                        final int n93 = n52 + 3;
                                        array2[n91 + 1] = d[n92];
                                        n89 = n90;
                                        n87 = n93;
                                    }
                                }
                                else {
                                    n87 = n86;
                                    n89 = n48;
                                    if (!b) {
                                        final int n94 = n57 / 3;
                                        n87 = n52 + 2;
                                        array2[n94 * 2 + 1] = d[n86];
                                        break Label_2092;
                                    }
                                }
                                n48 = n89;
                            }
                        }
                    }
                }
                final int n95 = (int)s.objectFieldOffset(t3);
                final int n96 = n87;
                int n101;
                int n103;
                int n104;
                if ((char21 & 0x1000) == 0x1000 && n65 <= 17) {
                    final int n97 = n64 + 1;
                    int char25 = e.charAt(n64);
                    if (char25 >= 55296) {
                        final int n98 = char25 & 0x1FFF;
                        int n99 = 13;
                        int index23 = n97;
                        int n100 = n98;
                        char char26;
                        while (true) {
                            n101 = index23 + 1;
                            char26 = e.charAt(index23);
                            if (char26 < '\ud800') {
                                break;
                            }
                            n100 |= (char26 & '\u1fff') << n99;
                            n99 += 13;
                            index23 = n101;
                        }
                        char25 = (n100 | char26 << n99);
                    }
                    else {
                        n101 = n97;
                    }
                    final int n102 = n12 * 2 + char25 / 32;
                    final Object o3 = d[n102];
                    Field t4;
                    if (o3 instanceof Field) {
                        t4 = (Field)o3;
                    }
                    else {
                        t4 = T(class1, (String)o3);
                        d[n102] = t4;
                    }
                    n103 = (int)s.objectFieldOffset(t4);
                    n104 = char25 % 32;
                }
                else {
                    final int n105 = 1048575;
                    n104 = 0;
                    n101 = n64;
                    n103 = n105;
                }
                n83 = n104;
                n80 = n95;
                n82 = n103;
                n52 = n96;
                n84 = n48;
                n85 = n49;
                n68 = n101;
                if (n65 >= 18) {
                    n83 = n104;
                    n80 = n95;
                    n82 = n103;
                    n52 = n96;
                    n84 = n48;
                    n85 = n49;
                    n68 = n101;
                    if (n65 <= 49) {
                        r[n49] = n95;
                        n85 = n49 + 1;
                        n68 = n101;
                        n84 = n48;
                        n52 = n96;
                        n82 = n103;
                        n80 = n95;
                        n83 = n104;
                    }
                }
            }
            array[n57] = char19;
            int n106;
            if ((char21 & 0x200) != 0x0) {
                n106 = 536870912;
            }
            else {
                n106 = 0;
            }
            int n107;
            if ((char21 & 0x100) != 0x0) {
                n107 = 268435456;
            }
            else {
                n107 = 0;
            }
            array[n57 + 1] = (n107 | n106 | n65 << 20 | n80);
            n51 = n57 + 3;
            array[n57 + 2] = (n83 << 20 | n82);
            final int n108 = n68;
            n56 = n63;
            n3 = n108;
            n50 = n66;
            n48 = n84;
            n49 = n85;
        }
        return new N(array, array2, n55, n54, y.c(), b, false, r, n53, n47, p6, a, g0, l, f);
    }
    
    public static long M(final int n) {
        return n & 0xFFFFF;
    }
    
    public static boolean N(final Object o, final long n) {
        return (boolean)k0.C(o, n);
    }
    
    public static double O(final Object o, final long n) {
        return (double)k0.C(o, n);
    }
    
    public static float P(final Object o, final long n) {
        return (float)k0.C(o, n);
    }
    
    public static int Q(final Object o, final long n) {
        return (int)k0.C(o, n);
    }
    
    public static long R(final Object o, final long n) {
        return (long)k0.C(o, n);
    }
    
    public static Field T(final Class clazz, final String s) {
        while (true) {
            try {
                return clazz.getDeclaredField(s);
                while (true) {
                    final Field[] declaredFields;
                    int n = 0;
                    return declaredFields[n];
                    Label_0048: {
                        ++n;
                    }
                    Label_0022: {
                        break Label_0022;
                        Label_0055:
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Field ");
                        sb.append(s);
                        sb.append(" for ");
                        sb.append(clazz.getName());
                        sb.append(" not found. Known fields are ");
                        sb.append(Arrays.toString(declaredFields));
                        throw new RuntimeException(sb.toString());
                        declaredFields = clazz.getDeclaredFields();
                        final int length = declaredFields.length;
                        n = 0;
                    }
                    continue;
                }
            }
            // iftrue(Label_0048:, !s.equals((Object)field.getName()))
            // iftrue(Label_0055:, n >= length)
            catch (NoSuchFieldException ex) {
                continue;
            }
            break;
        }
    }
    
    public static int W(final int n) {
        return (n & 0xFF00000) >>> 20;
    }
    
    public static boolean j(final Object o, final long n) {
        return k0.r(o, n);
    }
    
    public static void k(final Object obj) {
        if (z(obj)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Mutating immutable message: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static double l(final Object o, final long n) {
        return k0.x(o, n);
    }
    
    public static float n(final Object o, final long n) {
        return k0.y(o, n);
    }
    
    public static int t(final Object o, final long n) {
        return k0.z(o, n);
    }
    
    public static boolean w(final Object o, final int n, final Z z) {
        return z.c(k0.C(o, M(n)));
    }
    
    public static boolean z(final Object o) {
        return o != null && (!(o instanceof r) || ((r)o).I());
    }
    
    public final boolean A(final Object o, final Object o2, final int n) {
        final long n2 = this.S(n) & 0xFFFFF;
        return k0.z(o, n2) == k0.z(o2, n2);
    }
    
    public final boolean B(final Object o, final int n, final int n2) {
        return k0.z(o, this.S(n2) & 0xFFFFF) == n;
    }
    
    public final void F(final Object o, Object o2, final int n) {
        if (!this.u(o2, n)) {
            return;
        }
        final long m = M(this.X(n));
        final Unsafe s = N.s;
        final Object object = s.getObject(o2, m);
        if (object == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Source subfield ");
            sb.append(this.L(n));
            sb.append(" is present but null: ");
            sb.append(o2);
            throw new IllegalStateException(sb.toString());
        }
        final Z p3 = this.p(n);
        if (!this.u(o, n)) {
            if (!z(object)) {
                s.putObject(o, m, object);
            }
            else {
                o2 = p3.f();
                p3.a(o2, object);
                s.putObject(o, m, o2);
            }
            this.U(o, n);
            return;
        }
        final Object o3 = o2 = s.getObject(o, m);
        if (!z(o3)) {
            o2 = p3.f();
            p3.a(o2, o3);
            s.putObject(o, m, o2);
        }
        p3.a(o2, object);
    }
    
    public final void G(final Object o, Object o2, final int n) {
        final int l = this.L(n);
        if (!this.B(o2, l, n)) {
            return;
        }
        final long m = M(this.X(n));
        final Unsafe s = N.s;
        final Object object = s.getObject(o2, m);
        if (object == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Source subfield ");
            sb.append(this.L(n));
            sb.append(" is present but null: ");
            sb.append(o2);
            throw new IllegalStateException(sb.toString());
        }
        final Z p3 = this.p(n);
        if (!this.B(o, l, n)) {
            if (!z(object)) {
                s.putObject(o, m, object);
            }
            else {
                o2 = p3.f();
                p3.a(o2, object);
                s.putObject(o, m, o2);
            }
            this.V(o, l, n);
            return;
        }
        final Object o3 = o2 = s.getObject(o, m);
        if (!z(o3)) {
            o2 = p3.f();
            p3.a(o2, o3);
            s.putObject(o, m, o2);
        }
        p3.a(o2, object);
    }
    
    public final void H(final Object o, final Object o2, final int n) {
        final int x = this.X(n);
        final long m = M(x);
        final int l = this.L(n);
        while (true) {
            Label_0512: {
                Label_0440: {
                    Label_0412: {
                        switch (W(x)) {
                            default: {
                                return;
                            }
                            case 60:
                            case 68: {
                                this.G(o, o2, n);
                                return;
                            }
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67: {
                                if (this.B(o2, l, n)) {
                                    break;
                                }
                                return;
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
                                if (this.B(o2, l, n)) {
                                    break;
                                }
                                return;
                            }
                            case 50: {
                                b0.D(this.q, o, o2, m);
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
                                this.n.d(o, o2, m);
                                return;
                            }
                            case 9:
                            case 17: {
                                this.F(o, o2, n);
                                return;
                            }
                            case 16: {
                                if (this.u(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 15: {
                                if (this.u(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 14: {
                                if (this.u(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 13: {
                                if (this.u(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 12: {
                                if (this.u(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 11: {
                                if (this.u(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 10: {
                                if (this.u(o2, n)) {
                                    break Label_0512;
                                }
                                return;
                            }
                            case 8: {
                                if (this.u(o2, n)) {
                                    break Label_0512;
                                }
                                return;
                            }
                            case 7: {
                                if (this.u(o2, n)) {
                                    k0.H(o, m, k0.r(o2, m));
                                    break Label_0424;
                                }
                                return;
                            }
                            case 6: {
                                if (this.u(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 5: {
                                if (this.u(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 4: {
                                if (this.u(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 3: {
                                if (this.u(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 2: {
                                if (this.u(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 1: {
                                if (this.u(o2, n)) {
                                    k0.O(o, m, k0.y(o2, m));
                                    break Label_0424;
                                }
                                return;
                            }
                            case 0: {
                                if (this.u(o2, n)) {
                                    k0.N(o, m, k0.x(o2, m));
                                    break Label_0424;
                                }
                                return;
                            }
                        }
                        k0.R(o, m, k0.C(o2, m));
                        this.V(o, l, n);
                        return;
                    }
                    k0.Q(o, m, k0.A(o2, m));
                    this.U(o, n);
                    return;
                }
                k0.P(o, m, k0.z(o2, m));
                continue;
            }
            k0.R(o, m, k0.C(o2, m));
            continue;
        }
    }
    
    public final int L(final int n) {
        return this.a[n];
    }
    
    public final int S(final int n) {
        return this.a[n + 2];
    }
    
    public final void U(final Object o, int s) {
        s = this.S(s);
        final long n = 0xFFFFF & s;
        if (n == 1048575L) {
            return;
        }
        k0.P(o, n, 1 << (s >>> 20) | k0.z(o, n));
    }
    
    public final void V(final Object o, final int n, final int n2) {
        k0.P(o, this.S(n2) & 0xFFFFF, n);
    }
    
    public final int X(final int n) {
        return this.a[n + 1];
    }
    
    public final void Y(final Object o, final n0 n0) {
        Iterator<Map.Entry<?, ?>> n2 = null;
        Map.Entry<?, ?> entry = null;
        Label_0053: {
            if (this.f) {
                final o b = this.p.b(o);
                if (!b.j()) {
                    n2 = (Iterator<Map.Entry<?, ?>>)b.n();
                    entry = n2.next();
                    break Label_0053;
                }
            }
            n2 = null;
            entry = null;
        }
        final int length = this.a.length;
        final Unsafe s = N.s;
        int n3 = 1048575;
        int n4 = 0;
        int int1 = 0;
        Map.Entry<?, ?> entry2;
        while (true) {
            entry2 = entry;
            if (n4 >= length) {
                break;
            }
            final int x = this.X(n4);
            final int l = this.L(n4);
            final int w = W(x);
            int n8;
            if (w <= 17) {
                final int n5 = this.a[n4 + 2];
                final int n6 = n5 & 0xFFFFF;
                int n7;
                if (n6 != (n7 = n3)) {
                    int1 = s.getInt(o, n6);
                    n7 = n6;
                }
                n8 = 1 << (n5 >>> 20);
                n3 = n7;
            }
            else {
                n8 = 0;
            }
            while (entry != null && this.p.a((Map.Entry)entry) <= l) {
                this.p.f(n0, (Map.Entry)entry);
                if (n2.hasNext()) {
                    entry = n2.next();
                }
                else {
                    entry = null;
                }
            }
            final long m = M(x);
            switch (w) {
                case 68: {
                    if (this.B(o, l, n4)) {
                        n0.L(l, s.getObject(o, m), this.p(n4));
                        break;
                    }
                    break;
                }
                case 67: {
                    if (this.B(o, l, n4)) {
                        n0.w(l, R(o, m));
                        break;
                    }
                    break;
                }
                case 66: {
                    if (this.B(o, l, n4)) {
                        n0.H(l, Q(o, m));
                        break;
                    }
                    break;
                }
                case 65: {
                    if (this.B(o, l, n4)) {
                        n0.n(l, R(o, m));
                        break;
                    }
                    break;
                }
                case 64: {
                    if (this.B(o, l, n4)) {
                        n0.g(l, Q(o, m));
                        break;
                    }
                    break;
                }
                case 63: {
                    if (this.B(o, l, n4)) {
                        n0.D(l, Q(o, m));
                        break;
                    }
                    break;
                }
                case 62: {
                    if (this.B(o, l, n4)) {
                        n0.e(l, Q(o, m));
                        break;
                    }
                    break;
                }
                case 61: {
                    if (this.B(o, l, n4)) {
                        n0.M(l, (f)s.getObject(o, m));
                        break;
                    }
                    break;
                }
                case 60: {
                    if (this.B(o, l, n4)) {
                        n0.N(l, s.getObject(o, m), this.p(n4));
                        break;
                    }
                    break;
                }
                case 59: {
                    if (this.B(o, l, n4)) {
                        this.c0(l, s.getObject(o, m), n0);
                        break;
                    }
                    break;
                }
                case 58: {
                    if (this.B(o, l, n4)) {
                        n0.d(l, N(o, m));
                        break;
                    }
                    break;
                }
                case 57: {
                    if (this.B(o, l, n4)) {
                        n0.l(l, Q(o, m));
                        break;
                    }
                    break;
                }
                case 56: {
                    if (this.B(o, l, n4)) {
                        n0.u(l, R(o, m));
                        break;
                    }
                    break;
                }
                case 55: {
                    if (this.B(o, l, n4)) {
                        n0.i(l, Q(o, m));
                        break;
                    }
                    break;
                }
                case 54: {
                    if (this.B(o, l, n4)) {
                        n0.C(l, R(o, m));
                        break;
                    }
                    break;
                }
                case 53: {
                    if (this.B(o, l, n4)) {
                        n0.c(l, R(o, m));
                        break;
                    }
                    break;
                }
                case 52: {
                    if (this.B(o, l, n4)) {
                        n0.x(l, P(o, m));
                        break;
                    }
                    break;
                }
                case 51: {
                    if (this.B(o, l, n4)) {
                        n0.m(l, O(o, m));
                        break;
                    }
                    break;
                }
                case 50: {
                    this.b0(n0, l, s.getObject(o, m), n4);
                    break;
                }
                case 49: {
                    b0.R(this.L(n4), (List)s.getObject(o, m), n0, this.p(n4));
                    break;
                }
                case 48: {
                    b0.Y(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 47: {
                    b0.X(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 46: {
                    b0.W(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 45: {
                    b0.V(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 44: {
                    b0.N(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 43: {
                    b0.a0(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 42: {
                    b0.K(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 41: {
                    b0.O(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 40: {
                    b0.P(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 39: {
                    b0.S(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 38: {
                    b0.b0(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 37: {
                    b0.T(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 36: {
                    b0.Q(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 35: {
                    b0.M(this.L(n4), (List)s.getObject(o, m), n0, true);
                    break;
                }
                case 34: {
                    b0.Y(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 33: {
                    b0.X(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 32: {
                    b0.W(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 31: {
                    b0.V(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 30: {
                    b0.N(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 29: {
                    b0.a0(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 28: {
                    b0.L(this.L(n4), (List)s.getObject(o, m), n0);
                    break;
                }
                case 27: {
                    b0.U(this.L(n4), (List)s.getObject(o, m), n0, this.p(n4));
                    break;
                }
                case 26: {
                    b0.Z(this.L(n4), (List)s.getObject(o, m), n0);
                    break;
                }
                case 25: {
                    b0.K(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 24: {
                    b0.O(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 23: {
                    b0.P(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 22: {
                    b0.S(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 21: {
                    b0.b0(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 20: {
                    b0.T(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 19: {
                    b0.Q(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 18: {
                    b0.M(this.L(n4), (List)s.getObject(o, m), n0, false);
                    break;
                }
                case 17: {
                    if ((n8 & int1) != 0x0) {
                        n0.L(l, s.getObject(o, m), this.p(n4));
                        break;
                    }
                    break;
                }
                case 16: {
                    if ((n8 & int1) != 0x0) {
                        n0.w(l, s.getLong(o, m));
                        break;
                    }
                    break;
                }
                case 15: {
                    if ((n8 & int1) != 0x0) {
                        n0.H(l, s.getInt(o, m));
                        break;
                    }
                    break;
                }
                case 14: {
                    if ((n8 & int1) != 0x0) {
                        n0.n(l, s.getLong(o, m));
                        break;
                    }
                    break;
                }
                case 13: {
                    if ((n8 & int1) != 0x0) {
                        n0.g(l, s.getInt(o, m));
                        break;
                    }
                    break;
                }
                case 12: {
                    if ((n8 & int1) != 0x0) {
                        n0.D(l, s.getInt(o, m));
                        break;
                    }
                    break;
                }
                case 11: {
                    if ((n8 & int1) != 0x0) {
                        n0.e(l, s.getInt(o, m));
                        break;
                    }
                    break;
                }
                case 10: {
                    if ((n8 & int1) != 0x0) {
                        n0.M(l, (f)s.getObject(o, m));
                        break;
                    }
                    break;
                }
                case 9: {
                    if ((n8 & int1) != 0x0) {
                        n0.N(l, s.getObject(o, m), this.p(n4));
                        break;
                    }
                    break;
                }
                case 8: {
                    if ((n8 & int1) != 0x0) {
                        this.c0(l, s.getObject(o, m), n0);
                        break;
                    }
                    break;
                }
                case 7: {
                    if ((n8 & int1) != 0x0) {
                        n0.d(l, j(o, m));
                        break;
                    }
                    break;
                }
                case 6: {
                    if ((n8 & int1) != 0x0) {
                        n0.l(l, s.getInt(o, m));
                        break;
                    }
                    break;
                }
                case 5: {
                    if ((n8 & int1) != 0x0) {
                        n0.u(l, s.getLong(o, m));
                        break;
                    }
                    break;
                }
                case 4: {
                    if ((n8 & int1) != 0x0) {
                        n0.i(l, s.getInt(o, m));
                        break;
                    }
                    break;
                }
                case 3: {
                    if ((n8 & int1) != 0x0) {
                        n0.C(l, s.getLong(o, m));
                        break;
                    }
                    break;
                }
                case 2: {
                    if ((n8 & int1) != 0x0) {
                        n0.c(l, s.getLong(o, m));
                        break;
                    }
                    break;
                }
                case 1: {
                    if ((n8 & int1) != 0x0) {
                        n0.x(l, n(o, m));
                        break;
                    }
                    break;
                }
                case 0: {
                    if ((n8 & int1) != 0x0) {
                        n0.m(l, l(o, m));
                        break;
                    }
                    break;
                }
            }
            n4 += 3;
        }
        while (entry2 != null) {
            this.p.f(n0, (Map.Entry)entry2);
            if (n2.hasNext()) {
                entry2 = n2.next();
            }
            else {
                entry2 = null;
            }
        }
        this.d0(this.o, o, n0);
    }
    
    public final void Z(final Object o, final n0 n0) {
        Object n2 = null;
        Map.Entry<?, ?> entry = null;
        Label_0054: {
            if (this.f) {
                final o b = this.p.b(o);
                if (!b.j()) {
                    n2 = b.n();
                    entry = ((Iterator<Map.Entry<?, ?>>)n2).next();
                    break Label_0054;
                }
            }
            n2 = (entry = null);
        }
        final int length = this.a.length;
        int n3 = 0;
        Map.Entry<?, ?> entry2;
        while (true) {
            entry2 = entry;
            if (n3 >= length) {
                break;
            }
            final int x = this.X(n3);
            final int l = this.L(n3);
            while (entry != null && this.p.a((Map.Entry)entry) <= l) {
                this.p.f(n0, (Map.Entry)entry);
                if (((Iterator)n2).hasNext()) {
                    entry = ((Iterator<Map.Entry<?, ?>>)n2).next();
                }
                else {
                    entry = null;
                }
            }
            Label_2343: {
                double n16 = 0.0;
                Label_1083: {
                    float n15 = 0.0f;
                    Label_1048: {
                        long n14 = 0L;
                        Label_1012: {
                            long n13 = 0L;
                            Label_0976: {
                                int n12 = 0;
                                Label_0940: {
                                    long n11 = 0L;
                                    Label_0904: {
                                        int n10 = 0;
                                        Label_0868: {
                                            boolean b2 = false;
                                            Label_0832: {
                                                Label_0790: {
                                                    Label_0752: {
                                                        Label_0717: {
                                                            int n9 = 0;
                                                            Label_0692: {
                                                                int n8 = 0;
                                                                Label_0656: {
                                                                    int n7 = 0;
                                                                    Label_0620: {
                                                                        long n6 = 0L;
                                                                        Label_0584: {
                                                                            int n5 = 0;
                                                                            Label_0548: {
                                                                                long n4 = 0L;
                                                                                Label_0512: {
                                                                                    switch (W(x)) {
                                                                                        default: {
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 68: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                break;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 67: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n4 = R(o, M(x));
                                                                                                break Label_0512;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 66: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n5 = Q(o, M(x));
                                                                                                break Label_0548;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 65: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n6 = R(o, M(x));
                                                                                                break Label_0584;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 64: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n7 = Q(o, M(x));
                                                                                                break Label_0620;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 63: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n8 = Q(o, M(x));
                                                                                                break Label_0656;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 62: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n9 = Q(o, M(x));
                                                                                                break Label_0692;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 61: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                break Label_0717;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 60: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                break Label_0752;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 59: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                break Label_0790;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 58: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                b2 = N(o, M(x));
                                                                                                break Label_0832;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 57: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n10 = Q(o, M(x));
                                                                                                break Label_0868;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 56: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n11 = R(o, M(x));
                                                                                                break Label_0904;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 55: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n12 = Q(o, M(x));
                                                                                                break Label_0940;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 54: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n13 = R(o, M(x));
                                                                                                break Label_0976;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 53: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n14 = R(o, M(x));
                                                                                                break Label_1012;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 52: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n15 = P(o, M(x));
                                                                                                break Label_1048;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 51: {
                                                                                            if (this.B(o, l, n3)) {
                                                                                                n16 = O(o, M(x));
                                                                                                break Label_1083;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 50: {
                                                                                            this.b0(n0, l, k0.C(o, M(x)), n3);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 49: {
                                                                                            b0.R(this.L(n3), (List)k0.C(o, M(x)), n0, this.p(n3));
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 48: {
                                                                                            b0.Y(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 47: {
                                                                                            b0.X(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 46: {
                                                                                            b0.W(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 45: {
                                                                                            b0.V(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 44: {
                                                                                            b0.N(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 43: {
                                                                                            b0.a0(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 42: {
                                                                                            b0.K(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 41: {
                                                                                            b0.O(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 40: {
                                                                                            b0.P(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 39: {
                                                                                            b0.S(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 38: {
                                                                                            b0.b0(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 37: {
                                                                                            b0.T(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 36: {
                                                                                            b0.Q(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 35: {
                                                                                            b0.M(this.L(n3), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 34: {
                                                                                            b0.Y(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 33: {
                                                                                            b0.X(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 32: {
                                                                                            b0.W(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 31: {
                                                                                            b0.V(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 30: {
                                                                                            b0.N(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 29: {
                                                                                            b0.a0(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 28: {
                                                                                            b0.L(this.L(n3), (List)k0.C(o, M(x)), n0);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 27: {
                                                                                            b0.U(this.L(n3), (List)k0.C(o, M(x)), n0, this.p(n3));
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 26: {
                                                                                            b0.Z(this.L(n3), (List)k0.C(o, M(x)), n0);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 25: {
                                                                                            b0.K(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 24: {
                                                                                            b0.O(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 23: {
                                                                                            b0.P(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 22: {
                                                                                            b0.S(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 21: {
                                                                                            b0.b0(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 20: {
                                                                                            b0.T(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 19: {
                                                                                            b0.Q(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 18: {
                                                                                            b0.M(this.L(n3), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 17: {
                                                                                            if (this.u(o, n3)) {
                                                                                                break;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 16: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n4 = E(o, M(x));
                                                                                                break Label_0512;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 15: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n5 = t(o, M(x));
                                                                                                break Label_0548;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 14: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n6 = E(o, M(x));
                                                                                                break Label_0584;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 13: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n7 = t(o, M(x));
                                                                                                break Label_0620;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 12: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n8 = t(o, M(x));
                                                                                                break Label_0656;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 11: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n9 = t(o, M(x));
                                                                                                break Label_0692;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 10: {
                                                                                            if (this.u(o, n3)) {
                                                                                                break Label_0717;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 9: {
                                                                                            if (this.u(o, n3)) {
                                                                                                break Label_0752;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 8: {
                                                                                            if (this.u(o, n3)) {
                                                                                                break Label_0790;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 7: {
                                                                                            if (this.u(o, n3)) {
                                                                                                b2 = j(o, M(x));
                                                                                                break Label_0832;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 6: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n10 = t(o, M(x));
                                                                                                break Label_0868;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 5: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n11 = E(o, M(x));
                                                                                                break Label_0904;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 4: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n12 = t(o, M(x));
                                                                                                break Label_0940;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 3: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n13 = E(o, M(x));
                                                                                                break Label_0976;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 2: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n14 = E(o, M(x));
                                                                                                break Label_1012;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 1: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n15 = n(o, M(x));
                                                                                                break Label_1048;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 0: {
                                                                                            if (this.u(o, n3)) {
                                                                                                n16 = l(o, M(x));
                                                                                                break Label_1083;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                    }
                                                                                    n0.L(l, k0.C(o, M(x)), this.p(n3));
                                                                                    break Label_2343;
                                                                                }
                                                                                n0.w(l, n4);
                                                                                break Label_2343;
                                                                            }
                                                                            n0.H(l, n5);
                                                                            break Label_2343;
                                                                        }
                                                                        n0.n(l, n6);
                                                                        break Label_2343;
                                                                    }
                                                                    n0.g(l, n7);
                                                                    break Label_2343;
                                                                }
                                                                n0.D(l, n8);
                                                                break Label_2343;
                                                            }
                                                            n0.e(l, n9);
                                                            break Label_2343;
                                                        }
                                                        n0.M(l, (f)k0.C(o, M(x)));
                                                        break Label_2343;
                                                    }
                                                    n0.N(l, k0.C(o, M(x)), this.p(n3));
                                                    break Label_2343;
                                                }
                                                this.c0(l, k0.C(o, M(x)), n0);
                                                break Label_2343;
                                            }
                                            n0.d(l, b2);
                                            break Label_2343;
                                        }
                                        n0.l(l, n10);
                                        break Label_2343;
                                    }
                                    n0.u(l, n11);
                                    break Label_2343;
                                }
                                n0.i(l, n12);
                                break Label_2343;
                            }
                            n0.C(l, n13);
                            break Label_2343;
                        }
                        n0.c(l, n14);
                        break Label_2343;
                    }
                    n0.x(l, n15);
                    break Label_2343;
                }
                n0.m(l, n16);
            }
            n3 += 3;
        }
        while (entry2 != null) {
            this.p.f(n0, (Map.Entry)entry2);
            if (((Iterator)n2).hasNext()) {
                entry2 = ((Iterator<Map.Entry<?, ?>>)n2).next();
            }
            else {
                entry2 = null;
            }
        }
        this.d0(this.o, o, n0);
    }
    
    @Override
    public void a(final Object o, final Object o2) {
        k(o);
        o2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            this.H(o, o2, i);
        }
        b0.E(this.o, o, o2);
        if (this.f) {
            b0.C(this.p, o, o2);
        }
    }
    
    public final void a0(final Object o, final n0 n0) {
        this.d0(this.o, o, n0);
        Object e = null;
        Map.Entry<?, ?> entry = null;
        Label_0064: {
            if (this.f) {
                final o b = this.p.b(o);
                if (!b.j()) {
                    e = b.e();
                    entry = ((Iterator<Map.Entry<?, ?>>)e).next();
                    break Label_0064;
                }
            }
            e = (entry = null);
        }
        int n2 = this.a.length - 3;
        Map.Entry<?, ?> entry2;
        while (true) {
            entry2 = entry;
            if (n2 < 0) {
                break;
            }
            final int x = this.X(n2);
            final int l = this.L(n2);
            while (entry != null && this.p.a((Map.Entry)entry) > l) {
                this.p.f(n0, (Map.Entry)entry);
                if (((Iterator)e).hasNext()) {
                    entry = ((Iterator<Map.Entry<?, ?>>)e).next();
                }
                else {
                    entry = null;
                }
            }
            Label_2347: {
                double n15 = 0.0;
                Label_1087: {
                    float n14 = 0.0f;
                    Label_1052: {
                        long n13 = 0L;
                        Label_1016: {
                            long n12 = 0L;
                            Label_0980: {
                                int n11 = 0;
                                Label_0944: {
                                    long n10 = 0L;
                                    Label_0908: {
                                        int n9 = 0;
                                        Label_0872: {
                                            boolean b2 = false;
                                            Label_0836: {
                                                Label_0794: {
                                                    Label_0756: {
                                                        Label_0721: {
                                                            int n8 = 0;
                                                            Label_0696: {
                                                                int n7 = 0;
                                                                Label_0660: {
                                                                    int n6 = 0;
                                                                    Label_0624: {
                                                                        long n5 = 0L;
                                                                        Label_0588: {
                                                                            int n4 = 0;
                                                                            Label_0552: {
                                                                                long n3 = 0L;
                                                                                Label_0516: {
                                                                                    switch (W(x)) {
                                                                                        default: {
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 68: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                break;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 67: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n3 = R(o, M(x));
                                                                                                break Label_0516;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 66: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n4 = Q(o, M(x));
                                                                                                break Label_0552;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 65: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n5 = R(o, M(x));
                                                                                                break Label_0588;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 64: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n6 = Q(o, M(x));
                                                                                                break Label_0624;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 63: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n7 = Q(o, M(x));
                                                                                                break Label_0660;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 62: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n8 = Q(o, M(x));
                                                                                                break Label_0696;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 61: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                break Label_0721;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 60: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                break Label_0756;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 59: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                break Label_0794;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 58: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                b2 = N(o, M(x));
                                                                                                break Label_0836;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 57: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n9 = Q(o, M(x));
                                                                                                break Label_0872;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 56: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n10 = R(o, M(x));
                                                                                                break Label_0908;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 55: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n11 = Q(o, M(x));
                                                                                                break Label_0944;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 54: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n12 = R(o, M(x));
                                                                                                break Label_0980;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 53: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n13 = R(o, M(x));
                                                                                                break Label_1016;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 52: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n14 = P(o, M(x));
                                                                                                break Label_1052;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 51: {
                                                                                            if (this.B(o, l, n2)) {
                                                                                                n15 = O(o, M(x));
                                                                                                break Label_1087;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 50: {
                                                                                            this.b0(n0, l, k0.C(o, M(x)), n2);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 49: {
                                                                                            b0.R(this.L(n2), (List)k0.C(o, M(x)), n0, this.p(n2));
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 48: {
                                                                                            b0.Y(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 47: {
                                                                                            b0.X(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 46: {
                                                                                            b0.W(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 45: {
                                                                                            b0.V(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 44: {
                                                                                            b0.N(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 43: {
                                                                                            b0.a0(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 42: {
                                                                                            b0.K(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 41: {
                                                                                            b0.O(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 40: {
                                                                                            b0.P(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 39: {
                                                                                            b0.S(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 38: {
                                                                                            b0.b0(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 37: {
                                                                                            b0.T(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 36: {
                                                                                            b0.Q(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 35: {
                                                                                            b0.M(this.L(n2), (List)k0.C(o, M(x)), n0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 34: {
                                                                                            b0.Y(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 33: {
                                                                                            b0.X(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 32: {
                                                                                            b0.W(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 31: {
                                                                                            b0.V(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 30: {
                                                                                            b0.N(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 29: {
                                                                                            b0.a0(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 28: {
                                                                                            b0.L(this.L(n2), (List)k0.C(o, M(x)), n0);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 27: {
                                                                                            b0.U(this.L(n2), (List)k0.C(o, M(x)), n0, this.p(n2));
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 26: {
                                                                                            b0.Z(this.L(n2), (List)k0.C(o, M(x)), n0);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 25: {
                                                                                            b0.K(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 24: {
                                                                                            b0.O(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 23: {
                                                                                            b0.P(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 22: {
                                                                                            b0.S(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 21: {
                                                                                            b0.b0(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 20: {
                                                                                            b0.T(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 19: {
                                                                                            b0.Q(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 18: {
                                                                                            b0.M(this.L(n2), (List)k0.C(o, M(x)), n0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 17: {
                                                                                            if (this.u(o, n2)) {
                                                                                                break;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 16: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n3 = E(o, M(x));
                                                                                                break Label_0516;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 15: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n4 = t(o, M(x));
                                                                                                break Label_0552;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 14: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n5 = E(o, M(x));
                                                                                                break Label_0588;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 13: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n6 = t(o, M(x));
                                                                                                break Label_0624;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 12: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n7 = t(o, M(x));
                                                                                                break Label_0660;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 11: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n8 = t(o, M(x));
                                                                                                break Label_0696;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 10: {
                                                                                            if (this.u(o, n2)) {
                                                                                                break Label_0721;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 9: {
                                                                                            if (this.u(o, n2)) {
                                                                                                break Label_0756;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 8: {
                                                                                            if (this.u(o, n2)) {
                                                                                                break Label_0794;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 7: {
                                                                                            if (this.u(o, n2)) {
                                                                                                b2 = j(o, M(x));
                                                                                                break Label_0836;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 6: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n9 = t(o, M(x));
                                                                                                break Label_0872;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 5: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n10 = E(o, M(x));
                                                                                                break Label_0908;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 4: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n11 = t(o, M(x));
                                                                                                break Label_0944;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 3: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n12 = E(o, M(x));
                                                                                                break Label_0980;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 2: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n13 = E(o, M(x));
                                                                                                break Label_1016;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 1: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n14 = n(o, M(x));
                                                                                                break Label_1052;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 0: {
                                                                                            if (this.u(o, n2)) {
                                                                                                n15 = l(o, M(x));
                                                                                                break Label_1087;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                    }
                                                                                    n0.L(l, k0.C(o, M(x)), this.p(n2));
                                                                                    break Label_2347;
                                                                                }
                                                                                n0.w(l, n3);
                                                                                break Label_2347;
                                                                            }
                                                                            n0.H(l, n4);
                                                                            break Label_2347;
                                                                        }
                                                                        n0.n(l, n5);
                                                                        break Label_2347;
                                                                    }
                                                                    n0.g(l, n6);
                                                                    break Label_2347;
                                                                }
                                                                n0.D(l, n7);
                                                                break Label_2347;
                                                            }
                                                            n0.e(l, n8);
                                                            break Label_2347;
                                                        }
                                                        n0.M(l, (f)k0.C(o, M(x)));
                                                        break Label_2347;
                                                    }
                                                    n0.N(l, k0.C(o, M(x)), this.p(n2));
                                                    break Label_2347;
                                                }
                                                this.c0(l, k0.C(o, M(x)), n0);
                                                break Label_2347;
                                            }
                                            n0.d(l, b2);
                                            break Label_2347;
                                        }
                                        n0.l(l, n9);
                                        break Label_2347;
                                    }
                                    n0.u(l, n10);
                                    break Label_2347;
                                }
                                n0.i(l, n11);
                                break Label_2347;
                            }
                            n0.C(l, n12);
                            break Label_2347;
                        }
                        n0.c(l, n13);
                        break Label_2347;
                    }
                    n0.x(l, n14);
                    break Label_2347;
                }
                n0.m(l, n15);
            }
            n2 -= 3;
        }
        while (entry2 != null) {
            this.p.f(n0, (Map.Entry)entry2);
            if (((Iterator)e).hasNext()) {
                entry2 = ((Iterator<Map.Entry<?, ?>>)e).next();
            }
            else {
                entry2 = null;
            }
        }
    }
    
    @Override
    public void b(final Object o) {
        if (!z(o)) {
            return;
        }
        if (o instanceof r) {
            final r r = (r)o;
            r.r();
            r.q();
            r.K();
        }
        for (int length = this.a.length, i = 0; i < length; i += 3) {
            final int x = this.X(i);
            final long m = M(x);
            final int w = W(x);
            if (w != 9) {
                switch (w) {
                    default: {
                        continue;
                    }
                    case 50: {
                        final Unsafe s = N.s;
                        final Object object = s.getObject(o, m);
                        if (object != null) {
                            s.putObject(o, m, this.q.c(object));
                        }
                        continue;
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
                        this.n.c(o, m);
                        continue;
                    }
                    case 17: {
                        break;
                    }
                }
            }
            if (this.u(o, i)) {
                this.p(i).b(N.s.getObject(o, m));
            }
        }
        this.o.d(o);
        if (this.f) {
            this.p.e(o);
        }
    }
    
    public final void b0(final n0 n0, final int n2, final Object o, final int n3) {
        if (o != null) {
            n0.O(n2, this.q.d(this.o(n3)), this.q.e(o));
        }
    }
    
    @Override
    public final boolean c(final Object o) {
        int n = 1048575;
        int i;
        for (int int1 = i = 0; i < this.k; ++i) {
            final int n2 = this.j[i];
            final int l = this.L(n2);
            final int x = this.X(n2);
            final int n3 = this.a[n2 + 2];
            final int n4 = n3 & 0xFFFFF;
            final int n5 = 1 << (n3 >>> 20);
            if (n4 != n) {
                if (n4 != 1048575) {
                    int1 = N.s.getInt(o, n4);
                }
                n = n4;
            }
            if (C(x) && !this.v(o, n2, n, int1, n5)) {
                return false;
            }
            final int w = W(x);
            if (w != 9 && w != 17) {
                if (w != 27) {
                    if (w != 60 && w != 68) {
                        if (w != 49) {
                            if (w != 50) {
                                continue;
                            }
                            if (!this.y(o, x, n2)) {
                                return false;
                            }
                            continue;
                        }
                    }
                    else {
                        if (this.B(o, l, n2) && !w(o, x, this.p(n2))) {
                            return false;
                        }
                        continue;
                    }
                }
                if (!this.x(o, x, n2)) {
                    return false;
                }
            }
            else if (this.v(o, n2, n, int1, n5) && !w(o, x, this.p(n2))) {
                return false;
            }
        }
        return !this.f || this.p.b(o).k();
    }
    
    public final void c0(final int n, final Object o, final n0 n2) {
        if (o instanceof String) {
            n2.A(n, (String)o);
            return;
        }
        n2.M(n, (f)o);
    }
    
    @Override
    public boolean d(final Object o, final Object o2) {
        for (int length = this.a.length, i = 0; i < length; i += 3) {
            if (!this.m(o, o2, i)) {
                return false;
            }
        }
        return this.o.a(o).equals(this.o.a(o2)) && (!this.f || this.p.b(o).equals(this.p.b(o2)));
    }
    
    public final void d0(final g0 g0, final Object o, final n0 n0) {
        g0.h(g0.a(o), n0);
    }
    
    @Override
    public int e(final Object o) {
        if (this.h) {
            return this.r(o);
        }
        return this.q(o);
    }
    
    @Override
    public Object f() {
        return this.m.a(this.e);
    }
    
    @Override
    public int g(final Object o) {
        final int length = this.a.length;
        int i = 0;
        int n = 0;
    Label_0434_Outer:
        while (i < length) {
            final int x = this.X(i);
            final int l = this.L(i);
            final long m = M(x);
            final int w = W(x);
            int hashCode = 37;
            int n2 = 0;
            Label_1001: {
                Label_0883: {
                    Object o3 = null;
                Label_0434:
                    while (true) {
                        double value2 = 0.0;
                    Label_0854:
                        while (true) {
                            float value = 0.0f;
                            Label_0814: {
                                boolean b = false;
                                Label_0678: {
                                    Label_0460: {
                                        Label_0419: {
                                            int n3 = 0;
                                            Object o2 = null;
                                            Label_0386: {
                                                Label_0623: {
                                                    switch (w) {
                                                        default: {
                                                            n2 = n;
                                                            break Label_1001;
                                                        }
                                                        case 68: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 67: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 66: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 65: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 64: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 63: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 62: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 61: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0623;
                                                            }
                                                            break Label_1001;
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
                                                            n3 = n * 53;
                                                            o2 = k0.C(o, m);
                                                            break Label_0386;
                                                        }
                                                        case 60: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 59: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0623;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 8: {
                                                            n3 = n * 53;
                                                            final int n4 = ((String)k0.C(o, m)).hashCode();
                                                            break Label_0393;
                                                        }
                                                        case 58: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                n3 = n * 53;
                                                                b = N(o, m);
                                                                break Label_0678;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 57: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 56: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 55: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 54: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 53: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 52: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                n3 = n * 53;
                                                                value = P(o, m);
                                                                break Label_0814;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 51: {
                                                            n2 = n;
                                                            if (this.B(o, l, i)) {
                                                                n3 = n * 53;
                                                                value2 = O(o, m);
                                                                break Label_0854;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 17: {
                                                            o3 = k0.C(o, m);
                                                            if (o3 != null) {
                                                                break Label_0434;
                                                            }
                                                            break Label_0883;
                                                        }
                                                        case 2:
                                                        case 3:
                                                        case 5:
                                                        case 14:
                                                        case 16: {
                                                            n3 = n * 53;
                                                            final long n5 = k0.A(o, m);
                                                            break Label_0434;
                                                        }
                                                        case 4:
                                                        case 6:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                        case 15: {
                                                            n3 = n * 53;
                                                            final int n4 = k0.z(o, m);
                                                            break Label_0393;
                                                        }
                                                        case 9: {
                                                            o3 = k0.C(o, m);
                                                            if (o3 != null) {
                                                                break Label_0434;
                                                            }
                                                            break Label_0883;
                                                        }
                                                        case 7: {
                                                            n3 = n * 53;
                                                            b = k0.r(o, m);
                                                            break Label_0678;
                                                        }
                                                        case 1: {
                                                            n3 = n * 53;
                                                            value = k0.y(o, m);
                                                            break Label_0814;
                                                        }
                                                        case 0: {
                                                            n3 = n * 53;
                                                            value2 = k0.x(o, m);
                                                            break Label_0854;
                                                        }
                                                    }
                                                }
                                                o2 = k0.C(o, m);
                                                n3 = n * 53;
                                            }
                                            final int n4 = o2.hashCode();
                                            n2 = n3 + n4;
                                            break Label_1001;
                                        }
                                        int n3 = n * 53;
                                        final long n5 = R(o, m);
                                        final int n4 = t.f(n5);
                                        continue Label_0434_Outer;
                                    }
                                    int n3 = n * 53;
                                    final int n4 = Q(o, m);
                                    continue Label_0434_Outer;
                                }
                                final int n4 = t.c(b);
                                continue Label_0434_Outer;
                            }
                            final int n4 = Float.floatToIntBits(value);
                            continue Label_0434_Outer;
                        }
                        final long n5 = Double.doubleToLongBits(value2);
                        continue Label_0434;
                    }
                    hashCode = o3.hashCode();
                }
                n2 = n * 53 + hashCode;
            }
            i += 3;
            n = n2;
        }
        int n6 = n * 53 + this.o.a(o).hashCode();
        if (this.f) {
            n6 = n6 * 53 + this.p.b(o).hashCode();
        }
        return n6;
    }
    
    @Override
    public void h(final Object o, final n0 n0) {
        if (n0.v() == com.google.protobuf.n0.a.p) {
            this.a0(o, n0);
            return;
        }
        if (this.h) {
            this.Z(o, n0);
            return;
        }
        this.Y(o, n0);
    }
    
    public final boolean i(final Object o, final Object o2, final int n) {
        return this.u(o, n) == this.u(o2, n);
    }
    
    public final boolean m(final Object o, final Object o2, final int n) {
        final int x = this.X(n);
        final long m = M(x);
        final int w = W(x);
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        final boolean b5 = false;
        final boolean b6 = false;
        final boolean b7 = false;
        final boolean b8 = false;
        final boolean b9 = false;
        final boolean b10 = false;
        final boolean b11 = false;
        final boolean b12 = false;
        final boolean b13 = false;
        final boolean b14 = false;
        final boolean b15 = false;
        final boolean b16 = false;
        final boolean b17 = false;
        final boolean b18 = false;
        final boolean b19 = false;
        switch (w) {
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
                boolean b20 = b19;
                if (this.A(o, o2, n)) {
                    b20 = b19;
                    if (b0.I(k0.C(o, m), k0.C(o2, m))) {
                        b20 = true;
                    }
                }
                return b20;
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
                return b0.I(k0.C(o, m), k0.C(o2, m));
            }
            case 17: {
                boolean b21 = b;
                if (this.i(o, o2, n)) {
                    b21 = b;
                    if (b0.I(k0.C(o, m), k0.C(o2, m))) {
                        b21 = true;
                    }
                }
                return b21;
            }
            case 16: {
                boolean b22 = b2;
                if (this.i(o, o2, n)) {
                    b22 = b2;
                    if (k0.A(o, m) == k0.A(o2, m)) {
                        b22 = true;
                    }
                }
                return b22;
            }
            case 15: {
                boolean b23 = b3;
                if (this.i(o, o2, n)) {
                    b23 = b3;
                    if (k0.z(o, m) == k0.z(o2, m)) {
                        b23 = true;
                    }
                }
                return b23;
            }
            case 14: {
                boolean b24 = b4;
                if (this.i(o, o2, n)) {
                    b24 = b4;
                    if (k0.A(o, m) == k0.A(o2, m)) {
                        b24 = true;
                    }
                }
                return b24;
            }
            case 13: {
                boolean b25 = b5;
                if (this.i(o, o2, n)) {
                    b25 = b5;
                    if (k0.z(o, m) == k0.z(o2, m)) {
                        b25 = true;
                    }
                }
                return b25;
            }
            case 12: {
                boolean b26 = b6;
                if (this.i(o, o2, n)) {
                    b26 = b6;
                    if (k0.z(o, m) == k0.z(o2, m)) {
                        b26 = true;
                    }
                }
                return b26;
            }
            case 11: {
                boolean b27 = b7;
                if (this.i(o, o2, n)) {
                    b27 = b7;
                    if (k0.z(o, m) == k0.z(o2, m)) {
                        b27 = true;
                    }
                }
                return b27;
            }
            case 10: {
                boolean b28 = b8;
                if (this.i(o, o2, n)) {
                    b28 = b8;
                    if (b0.I(k0.C(o, m), k0.C(o2, m))) {
                        b28 = true;
                    }
                }
                return b28;
            }
            case 9: {
                boolean b29 = b9;
                if (this.i(o, o2, n)) {
                    b29 = b9;
                    if (b0.I(k0.C(o, m), k0.C(o2, m))) {
                        b29 = true;
                    }
                }
                return b29;
            }
            case 8: {
                boolean b30 = b10;
                if (this.i(o, o2, n)) {
                    b30 = b10;
                    if (b0.I(k0.C(o, m), k0.C(o2, m))) {
                        b30 = true;
                    }
                }
                return b30;
            }
            case 7: {
                boolean b31 = b11;
                if (this.i(o, o2, n)) {
                    b31 = b11;
                    if (k0.r(o, m) == k0.r(o2, m)) {
                        b31 = true;
                    }
                }
                return b31;
            }
            case 6: {
                boolean b32 = b12;
                if (this.i(o, o2, n)) {
                    b32 = b12;
                    if (k0.z(o, m) == k0.z(o2, m)) {
                        b32 = true;
                    }
                }
                return b32;
            }
            case 5: {
                boolean b33 = b13;
                if (this.i(o, o2, n)) {
                    b33 = b13;
                    if (k0.A(o, m) == k0.A(o2, m)) {
                        b33 = true;
                    }
                }
                return b33;
            }
            case 4: {
                boolean b34 = b14;
                if (this.i(o, o2, n)) {
                    b34 = b14;
                    if (k0.z(o, m) == k0.z(o2, m)) {
                        b34 = true;
                    }
                }
                return b34;
            }
            case 3: {
                boolean b35 = b15;
                if (this.i(o, o2, n)) {
                    b35 = b15;
                    if (k0.A(o, m) == k0.A(o2, m)) {
                        b35 = true;
                    }
                }
                return b35;
            }
            case 2: {
                boolean b36 = b16;
                if (this.i(o, o2, n)) {
                    b36 = b16;
                    if (k0.A(o, m) == k0.A(o2, m)) {
                        b36 = true;
                    }
                }
                return b36;
            }
            case 1: {
                boolean b37 = b17;
                if (this.i(o, o2, n)) {
                    b37 = b17;
                    if (Float.floatToIntBits(k0.y(o, m)) == Float.floatToIntBits(k0.y(o2, m))) {
                        b37 = true;
                    }
                }
                return b37;
            }
            case 0: {
                boolean b38 = b18;
                if (this.i(o, o2, n)) {
                    b38 = b18;
                    if (Double.doubleToLongBits(k0.x(o, m)) == Double.doubleToLongBits(k0.x(o2, m))) {
                        b38 = true;
                    }
                }
                return b38;
            }
        }
    }
    
    public final Object o(final int n) {
        return this.b[n / 3 * 2];
    }
    
    public final Z p(int n) {
        n = n / 3 * 2;
        final Z z = (Z)this.b[n];
        if (z != null) {
            return z;
        }
        return (Z)(this.b[n] = W.a().c((Class)this.b[n + 1]));
    }
    
    public final int q(final Object o) {
        final Unsafe s = N.s;
        int n = 1048575;
        int i = 0;
        int n2 = 0;
        int int1 = 0;
    Label_0526_Outer:
        while (i < this.a.length) {
            final int x = this.X(i);
            final int l = this.L(i);
            final int w = W(x);
            int n6;
            int n7;
            int n8;
            if (w <= 17) {
                final int n3 = this.a[i + 2];
                final int n4 = n3 & 0xFFFFF;
                final int n5 = 1 << (n3 >>> 20);
                n6 = n;
                n7 = n3;
                n8 = n5;
                if (n4 != n) {
                    int1 = s.getInt(o, n4);
                    n6 = n4;
                    n7 = n3;
                    n8 = n5;
                }
            }
            else {
                int n9;
                if (this.i && w >= com.google.protobuf.p.c0.e() && w <= com.google.protobuf.p.p0.e()) {
                    n9 = (this.a[i + 2] & 0xFFFFF);
                }
                else {
                    n9 = 0;
                }
                n8 = 0;
                n6 = n;
                n7 = n9;
            }
            final long m = M(x);
            int n10 = 0;
            Label_2362: {
                int n19 = 0;
                Label_2214: {
                    int n18 = 0;
                Label_0642:
                    while (true) {
                        int x2 = 0;
                        Label_1150: {
                        Label_0526:
                            while (true) {
                                Label_0856: {
                                    Label_0759: {
                                        Label_0725: {
                                            int n14 = 0;
                                            Label_0701: {
                                                int n13 = 0;
                                            Label_0670:
                                                while (true) {
                                                    Label_0635: {
                                                        Label_0611: {
                                                            int n12 = 0;
                                                            Label_0587: {
                                                                long n11 = 0L;
                                                                Label_0555: {
                                                                    switch (w) {
                                                                        default: {
                                                                            n10 = n2;
                                                                            break Label_0530;
                                                                        }
                                                                        case 68: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                break;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 67: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                n11 = R(o, m);
                                                                                break Label_0555;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 66: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                n12 = Q(o, m);
                                                                                break Label_0587;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 65: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                break Label_0611;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 64: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                break Label_0635;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 63: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                n13 = Q(o, m);
                                                                                break Label_0670;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 62: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                n14 = Q(o, m);
                                                                                break Label_0701;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 61: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                break Label_0725;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 60: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                break Label_0759;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 59: {
                                                                            n10 = n2;
                                                                            if (!this.B(o, l, i)) {
                                                                                break Label_0530;
                                                                            }
                                                                            final Object object = s.getObject(o, m);
                                                                            if (object instanceof f) {
                                                                                final int n15 = com.google.protobuf.h.g(l, (f)object);
                                                                                break Label_0526;
                                                                            }
                                                                            final int n15 = com.google.protobuf.h.M(l, (String)object);
                                                                            break Label_0526;
                                                                        }
                                                                        case 58: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                break Label_0856;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 57: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                final int n16 = com.google.protobuf.h.m(l, 0);
                                                                                break Label_0642;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 56: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                final int n15 = com.google.protobuf.h.o(l, 0L);
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 55: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                final int n15 = com.google.protobuf.h.v(l, Q(o, m));
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 54: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                final int n15 = com.google.protobuf.h.R(l, R(o, m));
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 53: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                final int n15 = com.google.protobuf.h.x(l, R(o, m));
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 52: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                final int n15 = com.google.protobuf.h.q(l, 0.0f);
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 51: {
                                                                            n10 = n2;
                                                                            if (this.B(o, l, i)) {
                                                                                final int n15 = com.google.protobuf.h.i(l, 0.0);
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 50: {
                                                                            final int n15 = this.q.b(l, s.getObject(o, m), this.o(i));
                                                                            break Label_0526;
                                                                        }
                                                                        case 49: {
                                                                            final int n15 = b0.j(l, (List)s.getObject(o, m), this.p(i));
                                                                            break Label_0526;
                                                                        }
                                                                        case 48: {
                                                                            final int t = b0.t((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (t <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = t;
                                                                            if (this.i) {
                                                                                x2 = t;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 47: {
                                                                            final int r = b0.r((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (r <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = r;
                                                                            if (this.i) {
                                                                                x2 = r;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 46: {
                                                                            final int j = b0.i((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (j <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = j;
                                                                            if (this.i) {
                                                                                x2 = j;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 45: {
                                                                            final int g = b0.g((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (g <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = g;
                                                                            if (this.i) {
                                                                                x2 = g;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 44: {
                                                                            final int e = b0.e((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (e <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = e;
                                                                            if (this.i) {
                                                                                x2 = e;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 43: {
                                                                            final int w2 = b0.w((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (w2 <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = w2;
                                                                            if (this.i) {
                                                                                x2 = w2;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 42: {
                                                                            final int b = b0.b((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (b <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = b;
                                                                            if (this.i) {
                                                                                x2 = b;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 41: {
                                                                            final int g2 = b0.g((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (g2 <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = g2;
                                                                            if (this.i) {
                                                                                x2 = g2;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 40: {
                                                                            final int k = b0.i((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (k <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = k;
                                                                            if (this.i) {
                                                                                x2 = k;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 39: {
                                                                            final int l2 = b0.l((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (l2 <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = l2;
                                                                            if (this.i) {
                                                                                x2 = l2;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 38: {
                                                                            final int y = b0.y((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (y <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = y;
                                                                            if (this.i) {
                                                                                x2 = y;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 37: {
                                                                            final int n17 = b0.n((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (n17 <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = n17;
                                                                            if (this.i) {
                                                                                x2 = n17;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 36: {
                                                                            final int g3 = b0.g((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (g3 <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = g3;
                                                                            if (this.i) {
                                                                                x2 = g3;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 35: {
                                                                            final int i2 = b0.i((List)s.getObject(o, m));
                                                                            n10 = n2;
                                                                            if (i2 <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = i2;
                                                                            if (this.i) {
                                                                                x2 = i2;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 34: {
                                                                            n18 = b0.s(l, (List)s.getObject(o, m), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 33: {
                                                                            n18 = b0.q(l, (List)s.getObject(o, m), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 23:
                                                                        case 32: {
                                                                            n18 = b0.h(l, (List)s.getObject(o, m), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 19:
                                                                        case 24:
                                                                        case 31: {
                                                                            n18 = b0.f(l, (List)s.getObject(o, m), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 30: {
                                                                            n18 = b0.d(l, (List)s.getObject(o, m), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 29: {
                                                                            final int n15 = b0.v(l, (List)s.getObject(o, m), false);
                                                                            break Label_0526;
                                                                        }
                                                                        case 28: {
                                                                            final int n15 = b0.c(l, (List)s.getObject(o, m));
                                                                            break Label_0526;
                                                                        }
                                                                        case 27: {
                                                                            final int n15 = b0.p(l, (List)s.getObject(o, m), this.p(i));
                                                                            break Label_0526;
                                                                        }
                                                                        case 26: {
                                                                            final int n15 = b0.u(l, (List)s.getObject(o, m));
                                                                            break Label_0526;
                                                                        }
                                                                        case 25: {
                                                                            n18 = b0.a(l, (List)s.getObject(o, m), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 22: {
                                                                            n18 = b0.k(l, (List)s.getObject(o, m), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 21: {
                                                                            n18 = b0.x(l, (List)s.getObject(o, m), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 20: {
                                                                            n18 = b0.m(l, (List)s.getObject(o, m), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 18: {
                                                                            final int n15 = b0.h(l, (List)s.getObject(o, m), false);
                                                                            break Label_0526;
                                                                        }
                                                                        case 17: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                break;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 16: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n11 = s.getLong(o, m);
                                                                                break Label_0555;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 15: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n12 = s.getInt(o, m);
                                                                                break Label_0587;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 14: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                break Label_0611;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 13: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                break Label_0635;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 12: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n13 = s.getInt(o, m);
                                                                                break Label_0670;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 11: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n14 = s.getInt(o, m);
                                                                                break Label_0701;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 10: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                break Label_0725;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 9: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                break Label_0759;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 8: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) == 0x0) {
                                                                                break Label_0530;
                                                                            }
                                                                            final Object object2 = s.getObject(o, m);
                                                                            if (object2 instanceof f) {
                                                                                final int n15 = com.google.protobuf.h.g(l, (f)object2);
                                                                                break Label_0526;
                                                                            }
                                                                            final int n15 = com.google.protobuf.h.M(l, (String)object2);
                                                                            break Label_0526;
                                                                        }
                                                                        case 7: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                break Label_0856;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 6: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.protobuf.h.m(l, 0);
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 5: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.protobuf.h.o(l, 0L);
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_2362;
                                                                        }
                                                                        case 4: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.protobuf.h.v(l, s.getInt(o, m));
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_2362;
                                                                        }
                                                                        case 3: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.protobuf.h.R(l, s.getLong(o, m));
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_2362;
                                                                        }
                                                                        case 2: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.protobuf.h.x(l, s.getLong(o, m));
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_2362;
                                                                        }
                                                                        case 1: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.protobuf.h.q(l, 0.0f);
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_2362;
                                                                        }
                                                                        case 0: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.protobuf.h.i(l, 0.0);
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_2362;
                                                                        }
                                                                    }
                                                                    final int n15 = com.google.protobuf.h.s(l, (K)s.getObject(o, m), this.p(i));
                                                                    n10 = n2 + n15;
                                                                    break Label_2362;
                                                                }
                                                                final int n15 = com.google.protobuf.h.K(l, n11);
                                                                continue Label_0526;
                                                            }
                                                            final int n15 = com.google.protobuf.h.I(l, n12);
                                                            continue Label_0526;
                                                        }
                                                        final int n15 = com.google.protobuf.h.G(l, 0L);
                                                        continue Label_0526;
                                                    }
                                                    final int n16 = com.google.protobuf.h.E(l, 0);
                                                    n10 = n2 + n16;
                                                    continue Label_0526_Outer;
                                                }
                                                final int n15 = com.google.protobuf.h.k(l, n13);
                                                continue Label_0526;
                                            }
                                            final int n15 = com.google.protobuf.h.P(l, n14);
                                            continue Label_0526;
                                        }
                                        final int n15 = com.google.protobuf.h.g(l, (f)s.getObject(o, m));
                                        continue Label_0526;
                                    }
                                    final int n15 = b0.o(l, s.getObject(o, m), this.p(i));
                                    continue Label_0526;
                                }
                                final int n15 = com.google.protobuf.h.d(l, true);
                                continue Label_0526;
                            }
                            s.putInt(o, n7, x2);
                        }
                        final int n16 = com.google.protobuf.h.O(l) + com.google.protobuf.h.Q(x2) + x2;
                        continue Label_0642;
                    }
                    n10 = n2 + n18;
                    break Label_2362;
                }
                n10 = n2 + n19;
            }
            i += 3;
            n2 = n10;
            n = n6;
        }
        int n20 = n2 + this.s(this.o, o);
        if (this.f) {
            n20 += this.p.b(o).h();
        }
        return n20;
    }
    
    public final int r(final Object o) {
        final Unsafe s = N.s;
        int n = 0;
        int n3 = 0;
    Label_0416_Outer:
        for (int i = n = 0; i < this.a.length; i += 3, n = n3) {
            final int x = this.X(i);
            final int w = W(x);
            final int l = this.L(i);
            final long m = M(x);
            int n2;
            if (w >= com.google.protobuf.p.c0.e() && w <= com.google.protobuf.p.p0.e()) {
                n2 = (this.a[i + 2] & 0xFFFFF);
            }
            else {
                n2 = 0;
            }
        Label_0620_Outer:
            while (true) {
                int x2 = 0;
                Label_1033: {
                    Label_1023: {
                        Label_0930: {
                            Label_0906: {
                                long n10 = 0L;
                                Label_0881: {
                                    long n9 = 0L;
                                    Label_0848: {
                                        int n8 = 0;
                                        Label_0816: {
                                            Label_0785: {
                                                Label_0761: {
                                                    Label_0737: {
                                                        Object o3 = null;
                                                        Label_0709: {
                                                            while (true) {
                                                                Label_0706: {
                                                                    Label_0648: {
                                                                        Label_0612: {
                                                                            int n7 = 0;
                                                                            Label_0588: {
                                                                                int n6 = 0;
                                                                                Label_0557: {
                                                                                    Label_0526: {
                                                                                        Label_0502: {
                                                                                            int n5 = 0;
                                                                                            Label_0478: {
                                                                                                long n4 = 0L;
                                                                                                Label_0446: {
                                                                                                    switch (w) {
                                                                                                        default: {
                                                                                                            n3 = n;
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 68: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 67: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                n4 = R(o, m);
                                                                                                                break Label_0446;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 66: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                n5 = Q(o, m);
                                                                                                                break Label_0478;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 65: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                break Label_0502;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 64: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                break Label_0526;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 63: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                n6 = Q(o, m);
                                                                                                                break Label_0557;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 62: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                n7 = Q(o, m);
                                                                                                                break Label_0588;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 61: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                break Label_0612;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 60: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                break Label_0648;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 59: {
                                                                                                            n3 = n;
                                                                                                            if (!this.B(o, l, i)) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            final Object o2 = o3 = k0.C(o, m);
                                                                                                            if (o2 instanceof f) {
                                                                                                                final Object c = o2;
                                                                                                                break Label_0706;
                                                                                                            }
                                                                                                            break Label_0709;
                                                                                                        }
                                                                                                        case 58: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                break Label_0737;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 57: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                break Label_0761;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 56: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                break Label_0785;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 55: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                n8 = Q(o, m);
                                                                                                                break Label_0816;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 54: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                n9 = R(o, m);
                                                                                                                break Label_0848;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 53: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                n10 = R(o, m);
                                                                                                                break Label_0881;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 52: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                break Label_0906;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 51: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, l, i)) {
                                                                                                                break Label_0930;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 50: {
                                                                                                            final int n11 = this.q.b(l, k0.C(o, m), this.o(i));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 49: {
                                                                                                            final int n11 = b0.j(l, D(o, m), this.p(i));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 48: {
                                                                                                            final int t = b0.t((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (t <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = t;
                                                                                                            if (this.i) {
                                                                                                                x2 = t;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 47: {
                                                                                                            final int r = b0.r((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (r <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = r;
                                                                                                            if (this.i) {
                                                                                                                x2 = r;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 46: {
                                                                                                            final int j = b0.i((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (j <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = j;
                                                                                                            if (this.i) {
                                                                                                                x2 = j;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 45: {
                                                                                                            final int g = b0.g((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (g <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = g;
                                                                                                            if (this.i) {
                                                                                                                x2 = g;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 44: {
                                                                                                            final int e = b0.e((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (e <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = e;
                                                                                                            if (this.i) {
                                                                                                                x2 = e;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 43: {
                                                                                                            final int w2 = b0.w((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (w2 <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = w2;
                                                                                                            if (this.i) {
                                                                                                                x2 = w2;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 42: {
                                                                                                            final int b = b0.b((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (b <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = b;
                                                                                                            if (this.i) {
                                                                                                                x2 = b;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 41: {
                                                                                                            final int g2 = b0.g((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (g2 <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = g2;
                                                                                                            if (this.i) {
                                                                                                                x2 = g2;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 40: {
                                                                                                            final int k = b0.i((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (k <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = k;
                                                                                                            if (this.i) {
                                                                                                                x2 = k;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 39: {
                                                                                                            final int l2 = b0.l((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (l2 <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = l2;
                                                                                                            if (this.i) {
                                                                                                                x2 = l2;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 38: {
                                                                                                            final int y = b0.y((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (y <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = y;
                                                                                                            if (this.i) {
                                                                                                                x2 = y;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 37: {
                                                                                                            final int n12 = b0.n((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (n12 <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = n12;
                                                                                                            if (this.i) {
                                                                                                                x2 = n12;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 36: {
                                                                                                            final int g3 = b0.g((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (g3 <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = g3;
                                                                                                            if (this.i) {
                                                                                                                x2 = g3;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 35: {
                                                                                                            final int i2 = b0.i((List)s.getObject(o, m));
                                                                                                            n3 = n;
                                                                                                            if (i2 <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = i2;
                                                                                                            if (this.i) {
                                                                                                                x2 = i2;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 34: {
                                                                                                            final int n11 = b0.s(l, D(o, m), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 33: {
                                                                                                            final int n11 = b0.q(l, D(o, m), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 18:
                                                                                                        case 23:
                                                                                                        case 32: {
                                                                                                            final int n11 = b0.h(l, D(o, m), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 19:
                                                                                                        case 24:
                                                                                                        case 31: {
                                                                                                            final int n11 = b0.f(l, D(o, m), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 30: {
                                                                                                            final int n11 = b0.d(l, D(o, m), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 29: {
                                                                                                            final int n11 = b0.v(l, D(o, m), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 28: {
                                                                                                            final int n11 = b0.c(l, D(o, m));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 27: {
                                                                                                            final int n11 = b0.p(l, D(o, m), this.p(i));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 26: {
                                                                                                            final int n11 = b0.u(l, D(o, m));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 25: {
                                                                                                            final int n11 = b0.a(l, D(o, m), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 22: {
                                                                                                            final int n11 = b0.k(l, D(o, m), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 21: {
                                                                                                            final int n11 = b0.x(l, D(o, m), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 20: {
                                                                                                            final int n11 = b0.m(l, D(o, m), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 17: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 16: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                n4 = k0.A(o, m);
                                                                                                                break Label_0446;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 15: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                n5 = k0.z(o, m);
                                                                                                                break Label_0478;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 14: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                break Label_0502;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 13: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                break Label_0526;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 12: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                n6 = k0.z(o, m);
                                                                                                                break Label_0557;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 11: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                n7 = k0.z(o, m);
                                                                                                                break Label_0588;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 10: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                break Label_0612;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 9: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                break Label_0648;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 8: {
                                                                                                            n3 = n;
                                                                                                            if (!this.u(o, i)) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            final Object o4 = o3 = k0.C(o, m);
                                                                                                            if (o4 instanceof f) {
                                                                                                                final Object c = o4;
                                                                                                                break Label_0706;
                                                                                                            }
                                                                                                            break Label_0709;
                                                                                                        }
                                                                                                        case 7: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                break Label_0737;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 6: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                break Label_0761;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 5: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                break Label_0785;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 4: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                n8 = k0.z(o, m);
                                                                                                                break Label_0816;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                n9 = k0.A(o, m);
                                                                                                                break Label_0848;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                n10 = k0.A(o, m);
                                                                                                                break Label_0881;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 1: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                break Label_0906;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 0: {
                                                                                                            n3 = n;
                                                                                                            if (this.u(o, i)) {
                                                                                                                break Label_0930;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                    }
                                                                                                    final int n11 = com.google.protobuf.h.s(l, (K)k0.C(o, m), this.p(i));
                                                                                                    n3 = n + n11;
                                                                                                    continue Label_0416_Outer;
                                                                                                }
                                                                                                final int n11 = com.google.protobuf.h.K(l, n4);
                                                                                                continue Label_0620_Outer;
                                                                                            }
                                                                                            final int n11 = com.google.protobuf.h.I(l, n5);
                                                                                            continue Label_0620_Outer;
                                                                                        }
                                                                                        final int n11 = com.google.protobuf.h.G(l, 0L);
                                                                                        continue Label_0620_Outer;
                                                                                    }
                                                                                    final int n11 = com.google.protobuf.h.E(l, 0);
                                                                                    continue Label_0620_Outer;
                                                                                }
                                                                                final int n11 = com.google.protobuf.h.k(l, n6);
                                                                                continue Label_0620_Outer;
                                                                            }
                                                                            final int n11 = com.google.protobuf.h.P(l, n7);
                                                                            continue Label_0620_Outer;
                                                                        }
                                                                        final Object c = k0.C(o, m);
                                                                        final int n11 = com.google.protobuf.h.g(l, (f)c);
                                                                        continue Label_0620_Outer;
                                                                    }
                                                                    final int n11 = b0.o(l, k0.C(o, m), this.p(i));
                                                                    continue Label_0620_Outer;
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                        final int n11 = com.google.protobuf.h.M(l, (String)o3);
                                                        continue;
                                                    }
                                                    final int n11 = com.google.protobuf.h.d(l, true);
                                                    continue;
                                                }
                                                final int n11 = com.google.protobuf.h.m(l, 0);
                                                continue;
                                            }
                                            final int n11 = com.google.protobuf.h.o(l, 0L);
                                            continue;
                                        }
                                        final int n11 = com.google.protobuf.h.v(l, n8);
                                        continue;
                                    }
                                    final int n11 = com.google.protobuf.h.R(l, n9);
                                    continue;
                                }
                                final int n11 = com.google.protobuf.h.x(l, n10);
                                continue;
                            }
                            final int n11 = com.google.protobuf.h.q(l, 0.0f);
                            continue;
                        }
                        final int n11 = com.google.protobuf.h.i(l, 0.0);
                        continue;
                    }
                    s.putInt(o, n2, x2);
                }
                final int n11 = com.google.protobuf.h.O(l) + com.google.protobuf.h.Q(x2) + x2;
                continue;
            }
        }
        return n + this.s(this.o, o);
    }
    
    public final int s(final g0 g0, final Object o) {
        return g0.b(g0.a(o));
    }
    
    public final boolean u(Object c, int x) {
        final int s = this.S(x);
        final long n = 0xFFFFF & s;
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        final boolean b5 = false;
        final boolean b6 = false;
        final boolean b7 = false;
        final boolean b8 = false;
        final boolean b9 = false;
        final boolean b10 = false;
        final boolean b11 = false;
        final boolean b12 = false;
        final boolean b13 = false;
        final boolean b14 = false;
        final boolean b15 = false;
        boolean b16 = false;
        if (n != 1048575L) {
            boolean b17 = b15;
            if ((k0.z(c, n) & 1 << (s >>> 20)) != 0x0) {
                b17 = true;
            }
            return b17;
        }
        x = this.X(x);
        final long m = M(x);
        switch (W(x)) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                if (k0.C(c, m) != null) {
                    b16 = true;
                }
                return b16;
            }
            case 16: {
                boolean b18 = b;
                if (k0.A(c, m) != 0L) {
                    b18 = true;
                }
                return b18;
            }
            case 15: {
                boolean b19 = b2;
                if (k0.z(c, m) != 0) {
                    b19 = true;
                }
                return b19;
            }
            case 14: {
                boolean b20 = b3;
                if (k0.A(c, m) != 0L) {
                    b20 = true;
                }
                return b20;
            }
            case 13: {
                boolean b21 = b4;
                if (k0.z(c, m) != 0) {
                    b21 = true;
                }
                return b21;
            }
            case 12: {
                boolean b22 = b5;
                if (k0.z(c, m) != 0) {
                    b22 = true;
                }
                return b22;
            }
            case 11: {
                boolean b23 = b6;
                if (k0.z(c, m) != 0) {
                    b23 = true;
                }
                return b23;
            }
            case 10: {
                return com.google.protobuf.f.p.equals(k0.C(c, m)) ^ true;
            }
            case 9: {
                boolean b24 = b7;
                if (k0.C(c, m) != null) {
                    b24 = true;
                }
                return b24;
            }
            case 8: {
                c = k0.C(c, m);
                if (c instanceof String) {
                    return ((String)c).isEmpty() ^ true;
                }
                if (c instanceof f) {
                    return com.google.protobuf.f.p.equals(c) ^ true;
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return k0.r(c, m);
            }
            case 6: {
                boolean b25 = b8;
                if (k0.z(c, m) != 0) {
                    b25 = true;
                }
                return b25;
            }
            case 5: {
                boolean b26 = b9;
                if (k0.A(c, m) != 0L) {
                    b26 = true;
                }
                return b26;
            }
            case 4: {
                boolean b27 = b10;
                if (k0.z(c, m) != 0) {
                    b27 = true;
                }
                return b27;
            }
            case 3: {
                boolean b28 = b11;
                if (k0.A(c, m) != 0L) {
                    b28 = true;
                }
                return b28;
            }
            case 2: {
                boolean b29 = b12;
                if (k0.A(c, m) != 0L) {
                    b29 = true;
                }
                return b29;
            }
            case 1: {
                boolean b30 = b13;
                if (Float.floatToRawIntBits(k0.y(c, m)) != 0) {
                    b30 = true;
                }
                return b30;
            }
            case 0: {
                boolean b31 = b14;
                if (Double.doubleToRawLongBits(k0.x(c, m)) != 0L) {
                    b31 = true;
                }
                return b31;
            }
        }
    }
    
    public final boolean v(final Object o, final int n, final int n2, final int n3, final int n4) {
        if (n2 == 1048575) {
            return this.u(o, n);
        }
        return (n3 & n4) != 0x0;
    }
    
    public final boolean x(final Object o, int i, final int n) {
        final List list = (List)k0.C(o, M(i));
        if (list.isEmpty()) {
            return true;
        }
        final Z p3 = this.p(n);
        for (i = 0; i < list.size(); ++i) {
            if (!p3.c(list.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean y(final Object o, final int n, final int n2) {
        final Map e = this.q.e(k0.C(o, M(n)));
        if (e.isEmpty()) {
            return true;
        }
        if (this.q.d(this.o(n2)).c.e() != m0.c.x) {
            return true;
        }
        final Iterator<Object> iterator = e.values().iterator();
        Z z = null;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            Z c;
            if ((c = z) == null) {
                c = W.a().c(next.getClass());
            }
            z = c;
            if (!c.c(next)) {
                return false;
            }
        }
        return true;
    }
}
