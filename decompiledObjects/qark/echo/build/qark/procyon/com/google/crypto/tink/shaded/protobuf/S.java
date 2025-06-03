// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.io.Serializable;
import java.util.Map;
import java.util.Arrays;
import java.lang.reflect.Field;
import android.support.v4.media.a;
import java.util.List;
import sun.misc.Unsafe;

public final class S implements e0
{
    public static final int[] r;
    public static final Unsafe s;
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
    
    static {
        r = new int[0];
        s = o0.D();
    }
    
    public S(final int[] a, final Object[] b, final int c, final int d, final O e, final boolean h, final boolean i, final int[] j, final int k, final int l, final U m, final E n, final k0 o, final q p15, final J q) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = (e instanceof x);
        this.h = h;
        this.f = (p15 != null && p15.e(e));
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
    
    public static boolean A(final int n) {
        return (n & 0x20000000) != 0x0;
    }
    
    public static boolean D(final Object o, final int n, final e0 e0) {
        return e0.c(o0.C(o, X(n)));
    }
    
    public static boolean G(final Object o) {
        return o != null && (!(o instanceof x) || ((x)o).D());
    }
    
    public static boolean J(final int n) {
        return (n & 0x10000000) != 0x0;
    }
    
    public static List K(final Object o, final long n) {
        return (List)o0.C(o, n);
    }
    
    public static long L(final Object o, final long n) {
        return o0.A(o, n);
    }
    
    public static S T(final Class clazz, final M m, final U u, final E e, final k0 k0, final q q, final J j) {
        if (m instanceof c0) {
            return V((c0)m, u, e, k0, q, j);
        }
        a.a(m);
        return U(null, u, e, k0, q, j);
    }
    
    public static S U(final h0 h0, final U u, final E e, final k0 k0, final q q, final J j) {
        throw null;
    }
    
    public static S V(final c0 c0, final U u, final E e, final k0 k0, final q q, final J j) {
        final boolean b = c0.b() == Z.p;
        final String e2 = c0.e();
        final int length = e2.length();
        int index2;
        if (e2.charAt(0) >= '\ud800') {
            int index = 1;
            while (true) {
                final int n = index2 = index + 1;
                if (e2.charAt(index) < '\ud800') {
                    break;
                }
                index = n;
            }
        }
        else {
            index2 = 1;
        }
        final int n2 = index2 + 1;
        final char char1 = e2.charAt(index2);
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
                char2 = e2.charAt(index3);
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
            r = S.r;
            n8 = 0;
            n9 = (char3 = n8);
            final int n10 = char4 = char3;
            n11 = (n12 = char4);
            char5 = n10;
        }
        else {
            final int n13 = n3 + 1;
            int char6;
            final char c2 = (char)(char6 = e2.charAt(n3));
            int index4 = n13;
            if (c2 >= '\ud800') {
                int n14 = c2 & '\u1fff';
                int n15 = 13;
                int index5 = n13;
                int n16;
                char char7;
                while (true) {
                    n16 = index5 + 1;
                    char7 = e2.charAt(index5);
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
            final char c3 = (char)(char8 = e2.charAt(index4));
            int index6 = n17;
            if (c3 >= '\ud800') {
                int n18 = c3 & '\u1fff';
                int n19 = 13;
                int index7 = n17;
                int n20;
                char char9;
                while (true) {
                    n20 = index7 + 1;
                    char9 = e2.charAt(index7);
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
            final char c4 = (char)(char10 = e2.charAt(index6));
            int index8 = n21;
            if (c4 >= '\ud800') {
                int n22 = c4 & '\u1fff';
                int n23 = 13;
                int index9 = n21;
                int n24;
                char char11;
                while (true) {
                    n24 = index9 + 1;
                    char11 = e2.charAt(index9);
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
            final char c5 = (char)(char12 = e2.charAt(index8));
            int index10 = n25;
            if (c5 >= '\ud800') {
                int n26 = c5 & '\u1fff';
                int n27 = 13;
                int index11 = n25;
                int n28;
                char char13;
                while (true) {
                    n28 = index11 + 1;
                    char13 = e2.charAt(index11);
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
            final char c6 = (char)(char3 = e2.charAt(index10));
            int index12 = n29;
            if (c6 >= '\ud800') {
                int n30 = c6 & '\u1fff';
                int n31 = 13;
                int index13 = n29;
                int n32;
                char char14;
                while (true) {
                    n32 = index13 + 1;
                    char14 = e2.charAt(index13);
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
            final char c7 = (char)(char5 = e2.charAt(index12));
            int index14 = n33;
            if (c7 >= '\ud800') {
                int n34 = c7 & '\u1fff';
                int n35 = 13;
                int index15 = n33;
                int n36;
                char char15;
                while (true) {
                    n36 = index15 + 1;
                    char15 = e2.charAt(index15);
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
            final char c8 = (char)(char16 = e2.charAt(index14));
            int index16 = n37;
            if (c8 >= '\ud800') {
                int n38 = c8 & '\u1fff';
                int n39 = 13;
                int index17 = n37;
                int n40;
                char char17;
                while (true) {
                    n40 = index17 + 1;
                    char17 = e2.charAt(index17);
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
            final char c9 = (char)(char4 = e2.charAt(index16));
            int n42 = n41;
            if (c9 >= '\ud800') {
                final int n43 = c9 & '\u1fff';
                int n44 = 13;
                int index18 = n41;
                int n45 = n43;
                char char18;
                while (true) {
                    n42 = index18 + 1;
                    char18 = e2.charAt(index18);
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
        final Unsafe s = S.s;
        final Object[] d = c0.d();
        final Class<? extends O> class1 = c0.c().getClass();
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
            int char19 = e2.charAt(n3);
            int index20;
            if (char19 >= 55296) {
                int n58 = char19 & 0x1FFF;
                int n59 = 13;
                char char20;
                while (true) {
                    index20 = index19 + 1;
                    char20 = e2.charAt(index19);
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
            int char21 = e2.charAt(index20);
            int n63;
            int n64;
            if (char21 >= 55296) {
                int n60 = char21 & 0x1FFF;
                int n61 = 13;
                int n62;
                char char22;
                while (true) {
                    n62 = index21 + 1;
                    char22 = e2.charAt(index21);
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
                final char c10 = (char)(char23 = e2.charAt(n64));
                n68 = n67;
                if (c10 >= '\ud800') {
                    int n69 = c10 & '\u1fff';
                    int n70 = 13;
                    int index22 = n67;
                    int n71;
                    char char24;
                    while (true) {
                        n71 = index22 + 1;
                        char24 = e2.charAt(index22);
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
                Field p6;
                if (o instanceof Field) {
                    p6 = (Field)o;
                }
                else {
                    p6 = p0(class1, (String)o);
                    d[n79] = p6;
                }
                n80 = (int)s.objectFieldOffset(p6);
                final int n81 = n79 + 1;
                final Object o2 = d[n81];
                Field p7;
                if (o2 instanceof Field) {
                    p7 = (Field)o2;
                }
                else {
                    p7 = p0(class1, (String)o2);
                    d[n81] = p7;
                }
                n82 = (int)s.objectFieldOffset(p7);
                n83 = 0;
                n52 = n73;
                n84 = n48;
                n85 = n49;
            }
            else {
                final int n86 = n52 + 1;
                final Field p8 = p0(class1, (String)d[n52]);
                int n87 = 0;
                Label_2147: {
                    if (n65 == 9 || n65 == 17) {
                        array2[n57 / 3 * 2 + 1] = p8.getType();
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
                final int n95 = (int)s.objectFieldOffset(p8);
                final int n96 = n87;
                int n101;
                int n103;
                int n104;
                if ((char21 & 0x1000) == 0x1000 && n65 <= 17) {
                    final int n97 = n64 + 1;
                    int char25 = e2.charAt(n64);
                    if (char25 >= 55296) {
                        final int n98 = char25 & 0x1FFF;
                        int n99 = 13;
                        int index23 = n97;
                        int n100 = n98;
                        char char26;
                        while (true) {
                            n101 = index23 + 1;
                            char26 = e2.charAt(index23);
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
                    Field p9;
                    if (o3 instanceof Field) {
                        p9 = (Field)o3;
                    }
                    else {
                        p9 = p0(class1, (String)o3);
                        d[n102] = p9;
                    }
                    n103 = (int)s.objectFieldOffset(p9);
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
        return new S(array, array2, n55, n54, c0.c(), b, false, r, n53, n47, u, e, k0, q, j);
    }
    
    public static long X(final int n) {
        return n & 0xFFFFF;
    }
    
    public static boolean Y(final Object o, final long n) {
        return (boolean)o0.C(o, n);
    }
    
    public static double Z(final Object o, final long n) {
        return (double)o0.C(o, n);
    }
    
    public static float a0(final Object o, final long n) {
        return (float)o0.C(o, n);
    }
    
    public static int b0(final Object o, final long n) {
        return (int)o0.C(o, n);
    }
    
    public static long c0(final Object o, final long n) {
        return (long)o0.C(o, n);
    }
    
    public static boolean l(final Object o, final long n) {
        return o0.r(o, n);
    }
    
    public static void m(final Object obj) {
        if (G(obj)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Mutating immutable message: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static double o(final Object o, final long n) {
        return o0.x(o, n);
    }
    
    public static Field p0(final Class clazz, final String s) {
        while (true) {
            try {
                return clazz.getDeclaredField(s);
                final StringBuilder sb;
                Label_0055: {
                    sb = new StringBuilder();
                }
                sb.append("Field ");
                sb.append(s);
                sb.append(" for ");
                sb.append(clazz.getName());
                sb.append(" not found. Known fields are ");
                Field[] declaredFields = null;
                sb.append(Arrays.toString(declaredFields));
                throw new RuntimeException(sb.toString());
                while (true) {
                    int n = 0;
                    return declaredFields[n];
                    Label_0048:
                    ++n;
                    continue;
                    declaredFields = clazz.getDeclaredFields();
                    final int length = declaredFields.length;
                    n = 0;
                    continue;
                }
            }
            // iftrue(Label_0055:, n >= length)
            // iftrue(Label_0048:, !s.equals((Object)field.getName()))
            catch (NoSuchFieldException ex) {
                continue;
            }
            break;
        }
    }
    
    public static float r(final Object o, final long n) {
        return o0.y(o, n);
    }
    
    public static l0 v(final Object o) {
        final x x = (x)o;
        l0 unknownFields;
        if ((unknownFields = x.unknownFields) == l0.c()) {
            unknownFields = l0.k();
            x.unknownFields = unknownFields;
        }
        return unknownFields;
    }
    
    public static int v0(final int n) {
        return (n & 0xFF00000) >>> 20;
    }
    
    public static int z(final Object o, final long n) {
        return o0.z(o, n);
    }
    
    public final void A0(final r0 r0, final int n, final Object o, final int n2) {
        if (o != null) {
            this.q.d(this.t(n2));
            r0.N(n, null, this.q.e(o));
        }
    }
    
    public final boolean B(Object c, int w0) {
        final int k0 = this.k0(w0);
        final long n = 0xFFFFF & k0;
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
            if ((o0.z(c, n) & 1 << (k0 >>> 20)) != 0x0) {
                b17 = true;
            }
            return b17;
        }
        w0 = this.w0(w0);
        final long x = X(w0);
        switch (v0(w0)) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                if (o0.C(c, x) != null) {
                    b16 = true;
                }
                return b16;
            }
            case 16: {
                boolean b18 = b;
                if (o0.A(c, x) != 0L) {
                    b18 = true;
                }
                return b18;
            }
            case 15: {
                boolean b19 = b2;
                if (o0.z(c, x) != 0) {
                    b19 = true;
                }
                return b19;
            }
            case 14: {
                boolean b20 = b3;
                if (o0.A(c, x) != 0L) {
                    b20 = true;
                }
                return b20;
            }
            case 13: {
                boolean b21 = b4;
                if (o0.z(c, x) != 0) {
                    b21 = true;
                }
                return b21;
            }
            case 12: {
                boolean b22 = b5;
                if (o0.z(c, x) != 0) {
                    b22 = true;
                }
                return b22;
            }
            case 11: {
                boolean b23 = b6;
                if (o0.z(c, x) != 0) {
                    b23 = true;
                }
                return b23;
            }
            case 10: {
                return com.google.crypto.tink.shaded.protobuf.h.p.equals(o0.C(c, x)) ^ true;
            }
            case 9: {
                boolean b24 = b7;
                if (o0.C(c, x) != null) {
                    b24 = true;
                }
                return b24;
            }
            case 8: {
                c = o0.C(c, x);
                if (c instanceof String) {
                    return ((String)c).isEmpty() ^ true;
                }
                if (c instanceof h) {
                    return com.google.crypto.tink.shaded.protobuf.h.p.equals(c) ^ true;
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return o0.r(c, x);
            }
            case 6: {
                boolean b25 = b8;
                if (o0.z(c, x) != 0) {
                    b25 = true;
                }
                return b25;
            }
            case 5: {
                boolean b26 = b9;
                if (o0.A(c, x) != 0L) {
                    b26 = true;
                }
                return b26;
            }
            case 4: {
                boolean b27 = b10;
                if (o0.z(c, x) != 0) {
                    b27 = true;
                }
                return b27;
            }
            case 3: {
                boolean b28 = b11;
                if (o0.A(c, x) != 0L) {
                    b28 = true;
                }
                return b28;
            }
            case 2: {
                boolean b29 = b12;
                if (o0.A(c, x) != 0L) {
                    b29 = true;
                }
                return b29;
            }
            case 1: {
                boolean b30 = b13;
                if (Float.floatToRawIntBits(o0.y(c, x)) != 0) {
                    b30 = true;
                }
                return b30;
            }
            case 0: {
                boolean b31 = b14;
                if (Double.doubleToRawLongBits(o0.x(c, x)) != 0L) {
                    b31 = true;
                }
                return b31;
            }
        }
    }
    
    public final void B0(final int n, final Object o, final r0 r0) {
        if (o instanceof String) {
            r0.A(n, (String)o);
            return;
        }
        r0.M(n, (h)o);
    }
    
    public final boolean C(final Object o, final int n, final int n2, final int n3, final int n4) {
        if (n2 == 1048575) {
            return this.B(o, n);
        }
        return (n3 & n4) != 0x0;
    }
    
    public final void C0(final k0 k0, final Object o, final r0 r0) {
        k0.t(k0.g(o), r0);
    }
    
    public final boolean E(final Object o, int i, final int n) {
        final List list = (List)o0.C(o, X(i));
        if (list.isEmpty()) {
            return true;
        }
        final e0 u = this.u(n);
        for (i = 0; i < list.size(); ++i) {
            if (!u.c(list.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean F(Object t, final int n, final int n2) {
        if (this.q.e(o0.C(t, X(n))).isEmpty()) {
            return true;
        }
        t = this.t(n2);
        this.q.d(t);
        throw null;
    }
    
    public final boolean H(final Object o, final Object o2, final int n) {
        final long n2 = this.k0(n) & 0xFFFFF;
        return o0.z(o, n2) == o0.z(o2, n2);
    }
    
    public final boolean I(final Object o, final int n, final int n2) {
        return o0.z(o, this.k0(n2) & 0xFFFFF) == n;
    }
    
    public final void M(final k0 k0, q q, final Object o, final d0 d0, final p p5) {
        Object o2 = null;
        Object q2;
        int p6;
        int i0;
        int w0;
        Object o3;
        O o4 = null;
        int b;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        List list9 = null;
        List list10 = null;
        List list11 = null;
        List list12 = null;
        List list13 = null;
        List list14 = null;
        O o5 = null;
        int b2;
        int j;
        Object o6;
        int l;
        int m;
        int k2;
        boolean m2;
        Object o7;
        boolean y;
        boolean m3;
        final A.a a;
        Object q3;
        boolean m4;
        final q q4;
        Block_19_Outer:Block_20_Outer:Label_0620_Outer:
        while (true) {
            q2 = o2;
        Label_3297_Outer:
            while (true) {
                Label_3362: {
                    while (true) {
                        try {
                            p6 = d0.p();
                            q2 = o2;
                            i0 = this.i0(p6);
                            if (i0 >= 0) {
                                q2 = o2;
                                w0 = this.w0(i0);
                                o3 = o2;
                                q2 = o2;
                                while (true) {
                                    try {
                                        Label_2618: {
                                            Label_2574: {
                                                Label_2034: {
                                                    Label_1991: {
                                                        Label_1948: {
                                                            Label_1905: {
                                                                Label_1862: {
                                                                    Label_1819: {
                                                                        Label_1776: {
                                                                            Label_1733: {
                                                                                Label_1690: {
                                                                                    Label_1642: {
                                                                                        Label_1567: {
                                                                                            Label_1524: {
                                                                                                Label_1481: {
                                                                                                    Label_1438: {
                                                                                                        Label_0822: {
                                                                                                            switch (v0(w0)) {
                                                                                                                case 68: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o4 = (O)this.S(o, p6, i0);
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    d0.L(o4, this.u(i0), p5);
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 67: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.j());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 66: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.h());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 65: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.r());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 64: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.z());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 63: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    b = d0.b();
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    this.s(i0);
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), b);
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 62: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.w());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 61: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.u());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 60: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o4 = (O)this.S(o, p6, i0);
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    d0.J(o4, this.u(i0), p5);
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 59: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    this.n0(o, w0, d0);
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 58: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.o());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 57: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.n());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 56: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.f());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 55: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.x());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 54: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.c());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 53: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.E());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 52: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.readFloat());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 51: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.readDouble());
                                                                                                                    break Label_0822;
                                                                                                                }
                                                                                                                case 50: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    this.N(o, i0, this.t(i0), p5, d0);
                                                                                                                    continue Block_19_Outer;
                                                                                                                }
                                                                                                                case 49: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    this.l0(o, X(w0), d0, this.u(i0), p5);
                                                                                                                    continue Block_19_Outer;
                                                                                                                }
                                                                                                                case 48: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list = this.n.e(o, X(w0));
                                                                                                                    break Label_1438;
                                                                                                                }
                                                                                                                case 47: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list2 = this.n.e(o, X(w0));
                                                                                                                    break Label_1481;
                                                                                                                }
                                                                                                                case 46: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list3 = this.n.e(o, X(w0));
                                                                                                                    break Label_1524;
                                                                                                                }
                                                                                                                case 45: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list4 = this.n.e(o, X(w0));
                                                                                                                    break Label_1567;
                                                                                                                }
                                                                                                                case 44: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list5 = this.n.e(o, X(w0));
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    d0.I(list5);
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    this.s(i0);
                                                                                                                    break Label_1642;
                                                                                                                }
                                                                                                                case 43: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list6 = this.n.e(o, X(w0));
                                                                                                                    break Label_1690;
                                                                                                                }
                                                                                                                case 42: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list7 = this.n.e(o, X(w0));
                                                                                                                    break Label_1733;
                                                                                                                }
                                                                                                                case 41: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list8 = this.n.e(o, X(w0));
                                                                                                                    break Label_1776;
                                                                                                                }
                                                                                                                case 40: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list9 = this.n.e(o, X(w0));
                                                                                                                    break Label_1819;
                                                                                                                }
                                                                                                                case 39: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list10 = this.n.e(o, X(w0));
                                                                                                                    break Label_1862;
                                                                                                                }
                                                                                                                case 38: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list11 = this.n.e(o, X(w0));
                                                                                                                    break Label_1905;
                                                                                                                }
                                                                                                                case 37: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list12 = this.n.e(o, X(w0));
                                                                                                                    break Label_1948;
                                                                                                                }
                                                                                                                case 36: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list13 = this.n.e(o, X(w0));
                                                                                                                    break Label_1991;
                                                                                                                }
                                                                                                                case 35: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list14 = this.n.e(o, X(w0));
                                                                                                                    break Label_2034;
                                                                                                                }
                                                                                                                case 34: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list = this.n.e(o, X(w0));
                                                                                                                    break Label_1438;
                                                                                                                }
                                                                                                                case 33: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list2 = this.n.e(o, X(w0));
                                                                                                                    break Label_1481;
                                                                                                                }
                                                                                                                case 32: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list3 = this.n.e(o, X(w0));
                                                                                                                    break Label_1524;
                                                                                                                }
                                                                                                                case 31: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list4 = this.n.e(o, X(w0));
                                                                                                                    break Label_1567;
                                                                                                                }
                                                                                                                case 30: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list5 = this.n.e(o, X(w0));
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    d0.I(list5);
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    this.s(i0);
                                                                                                                    break Label_1642;
                                                                                                                }
                                                                                                                case 29: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list6 = this.n.e(o, X(w0));
                                                                                                                    break Label_1690;
                                                                                                                }
                                                                                                                case 28: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    d0.A(this.n.e(o, X(w0)));
                                                                                                                    continue Block_19_Outer;
                                                                                                                }
                                                                                                                case 27: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    this.m0(o, w0, d0, this.u(i0), p5);
                                                                                                                    continue Block_19_Outer;
                                                                                                                }
                                                                                                                case 26: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    this.o0(o, w0, d0);
                                                                                                                    continue Block_19_Outer;
                                                                                                                }
                                                                                                                case 25: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list7 = this.n.e(o, X(w0));
                                                                                                                    break Label_1733;
                                                                                                                }
                                                                                                                case 24: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list8 = this.n.e(o, X(w0));
                                                                                                                    break Label_1776;
                                                                                                                }
                                                                                                                case 23: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list9 = this.n.e(o, X(w0));
                                                                                                                    break Label_1819;
                                                                                                                }
                                                                                                                case 22: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list10 = this.n.e(o, X(w0));
                                                                                                                    break Label_1862;
                                                                                                                }
                                                                                                                case 21: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list11 = this.n.e(o, X(w0));
                                                                                                                    break Label_1905;
                                                                                                                }
                                                                                                                case 20: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list12 = this.n.e(o, X(w0));
                                                                                                                    break Label_1948;
                                                                                                                }
                                                                                                                case 19: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list13 = this.n.e(o, X(w0));
                                                                                                                    break Label_1991;
                                                                                                                }
                                                                                                                case 18: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    list14 = this.n.e(o, X(w0));
                                                                                                                    break Label_2034;
                                                                                                                }
                                                                                                                case 17: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o5 = (O)this.R(o, i0);
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    d0.L(o5, this.u(i0), p5);
                                                                                                                    break Label_2574;
                                                                                                                }
                                                                                                                case 16: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.Q(o, X(w0), d0.j());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 15: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.P(o, X(w0), d0.h());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 14: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.Q(o, X(w0), d0.r());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 13: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.P(o, X(w0), d0.z());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 12: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    b2 = d0.b();
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    this.s(i0);
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.P(o, X(w0), b2);
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 11: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.P(o, X(w0), d0.w());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 10: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.R(o, X(w0), d0.u());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 9: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o5 = (O)this.R(o, i0);
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    d0.J(o5, this.u(i0), p5);
                                                                                                                    break Label_2574;
                                                                                                                }
                                                                                                                case 8: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    this.n0(o, w0, d0);
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 7: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.H(o, X(w0), d0.o());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 6: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.P(o, X(w0), d0.n());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 5: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.Q(o, X(w0), d0.f());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 4: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.P(o, X(w0), d0.x());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 3: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.Q(o, X(w0), d0.c());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 2: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.Q(o, X(w0), d0.E());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 1: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.O(o, X(w0), d0.readFloat());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                case 0: {
                                                                                                                    o3 = o2;
                                                                                                                    q2 = o2;
                                                                                                                    o0.N(o, X(w0), d0.readDouble());
                                                                                                                    break Label_2618;
                                                                                                                }
                                                                                                                default: {
                                                                                                                    break Label_3362;
                                                                                                                }
                                                                                                            }
                                                                                                            o3 = o2;
                                                                                                            q2 = o2;
                                                                                                            this.u0(o, p6, i0, o4);
                                                                                                            continue Block_19_Outer;
                                                                                                        }
                                                                                                        o3 = o2;
                                                                                                        q2 = o2;
                                                                                                        this.r0(o, p6, i0);
                                                                                                        continue Block_19_Outer;
                                                                                                    }
                                                                                                    o3 = o2;
                                                                                                    q2 = o2;
                                                                                                    d0.i(list);
                                                                                                    continue Block_19_Outer;
                                                                                                }
                                                                                                o3 = o2;
                                                                                                q2 = o2;
                                                                                                d0.a(list2);
                                                                                                continue Block_19_Outer;
                                                                                            }
                                                                                            o3 = o2;
                                                                                            q2 = o2;
                                                                                            d0.D(list3);
                                                                                            continue Block_19_Outer;
                                                                                        }
                                                                                        o3 = o2;
                                                                                        q2 = o2;
                                                                                        d0.g(list4);
                                                                                        continue Block_19_Outer;
                                                                                    }
                                                                                    o3 = o2;
                                                                                    q2 = o2;
                                                                                    o2 = g0.z(o, p6, list5, null, o2, k0);
                                                                                    continue Block_19_Outer;
                                                                                }
                                                                                o3 = o2;
                                                                                q2 = o2;
                                                                                d0.k(list6);
                                                                                continue Block_19_Outer;
                                                                            }
                                                                            o3 = o2;
                                                                            q2 = o2;
                                                                            d0.l(list7);
                                                                            continue Block_19_Outer;
                                                                        }
                                                                        o3 = o2;
                                                                        q2 = o2;
                                                                        d0.d(list8);
                                                                        continue Block_19_Outer;
                                                                    }
                                                                    o3 = o2;
                                                                    q2 = o2;
                                                                    d0.G(list9);
                                                                    continue Block_19_Outer;
                                                                }
                                                                o3 = o2;
                                                                q2 = o2;
                                                                d0.H(list10);
                                                                continue Block_19_Outer;
                                                            }
                                                            o3 = o2;
                                                            q2 = o2;
                                                            d0.s(list11);
                                                            continue Block_19_Outer;
                                                        }
                                                        o3 = o2;
                                                        q2 = o2;
                                                        d0.C(list12);
                                                        continue Block_19_Outer;
                                                    }
                                                    o3 = o2;
                                                    q2 = o2;
                                                    d0.v(list13);
                                                    continue Block_19_Outer;
                                                }
                                                o3 = o2;
                                                q2 = o2;
                                                d0.B(list14);
                                                continue Block_19_Outer;
                                            }
                                            o3 = o2;
                                            q2 = o2;
                                            this.t0(o, i0, o5);
                                            continue Block_19_Outer;
                                        }
                                        o3 = o2;
                                        q2 = o2;
                                        this.q0(o, i0);
                                        continue Block_19_Outer;
                                        Label_3339: {
                                            k0.o(o, q2);
                                        }
                                        // iftrue(Label_3351:, q2 == null)
                                        return;
                                        // iftrue(Label_3198:, o3 == null)
                                        // iftrue(Label_3284:, k2 >= this.l)
                                        // iftrue(Label_0713:, j >= this.l)
                                        Block_29_Outer:Label_3248_Outer:Block_25_Outer:
                                        while (true) {
                                            while (true) {
                                            Block_21_Outer:
                                                while (true) {
                                                    Block_26: {
                                                        Block_27: {
                                                            while (true) {
                                                                Block_28: {
                                                                    while (true) {
                                                                    Block_22_Outer:
                                                                        while (true) {
                                                                            Label_3303: {
                                                                                Block_24: {
                                                                                    while (true) {
                                                                                        while (true) {
                                                                                        Block_17:
                                                                                            while (true) {
                                                                                                while (true) {
                                                                                                    o6 = this.q(o, this.j[j], o6, k0, o);
                                                                                                    ++j;
                                                                                                    Label_0677: {
                                                                                                        break Label_0677;
                                                                                                        k0.o(o, o6);
                                                                                                        return;
                                                                                                        Label_3186: {
                                                                                                            break Block_24;
                                                                                                        }
                                                                                                        q2 = this.q(o, this.j[l], q2, k0, o);
                                                                                                        ++l;
                                                                                                        break Label_3303;
                                                                                                        j = this.k;
                                                                                                        break Label_0677;
                                                                                                        m = this.k;
                                                                                                        break Block_22_Outer;
                                                                                                        break Block_27;
                                                                                                        Label_3198:
                                                                                                        return;
                                                                                                    }
                                                                                                    continue Block_20_Outer;
                                                                                                }
                                                                                                o6 = o2;
                                                                                                break Block_17;
                                                                                                o3 = o6;
                                                                                                q2 = o6;
                                                                                                m2 = k0.m(o6, d0);
                                                                                                o2 = o6;
                                                                                                continue Block_22_Outer;
                                                                                            }
                                                                                            o3 = o2;
                                                                                            q2 = o2;
                                                                                            o6 = k0.f(o);
                                                                                            continue Block_21_Outer;
                                                                                        }
                                                                                        Label_3284: {
                                                                                            break Block_28;
                                                                                        }
                                                                                        q2 = o3;
                                                                                        y = d0.y();
                                                                                        o2 = o3;
                                                                                        continue Label_3248_Outer;
                                                                                    }
                                                                                }
                                                                                k0.o(o, o3);
                                                                                return;
                                                                                while (true) {
                                                                                    q2 = o7;
                                                                                    m3 = k0.m(o7, d0);
                                                                                    o2 = o7;
                                                                                    break Block_26;
                                                                                    q2 = o3;
                                                                                    o7 = k0.f(o);
                                                                                    continue Block_25_Outer;
                                                                                }
                                                                                Label_3351: {
                                                                                    return;
                                                                                }
                                                                                o3 = this.q(o, this.j[m], o3, k0, o);
                                                                                ++m;
                                                                                break Block_22_Outer;
                                                                                l = this.k;
                                                                            }
                                                                            continue Label_3248_Outer;
                                                                        }
                                                                        continue Label_3297_Outer;
                                                                    }
                                                                }
                                                                k0.o(o, o7);
                                                                return;
                                                                q2 = o3;
                                                                continue Block_25_Outer;
                                                            }
                                                        }
                                                        o7 = this.q(o, this.j[k2], o7, k0, o);
                                                        ++k2;
                                                        continue Label_0620_Outer;
                                                        Label_0725: {
                                                            return;
                                                        }
                                                    }
                                                    k2 = this.k;
                                                    continue Label_0620_Outer;
                                                }
                                                Label_3199: {
                                                    continue Label_3297_Outer;
                                                }
                                            }
                                            Label_0713: {
                                                continue Block_29_Outer;
                                            }
                                        }
                                    }
                                    // iftrue(Label_0644:, o2 != null)
                                    // iftrue(Label_0003:, m2)
                                    // iftrue(Label_3351:, o7 == null)
                                    // iftrue(Label_0003:, y)
                                    // iftrue(Label_0003:, m3)
                                    // iftrue(Label_3339:, l >= this.l)
                                    // iftrue(Label_3186:, m >= this.l)
                                    // iftrue(Label_3199:, !k0.q(d0))
                                    // iftrue(Label_3219:, o7 = o3 != null)
                                    // iftrue(Label_0725:, o6 == null)
                                    catch (A.a a) {}
                                    o2 = a;
                                    continue;
                                }
                            }
                            if (p6 == Integer.MAX_VALUE) {
                                for (int k3 = this.k; k3 < this.l; ++k3) {
                                    o2 = this.q(o, this.j[k3], o2, k0, o);
                                }
                                if (o2 != null) {
                                    k0.o(o, o2);
                                }
                                return;
                            }
                            q2 = o2;
                            if (!this.f) {
                                o3 = null;
                            }
                            else {
                                q2 = o2;
                                o3 = q.b(p5, this.e, p6);
                            }
                            if (o3 != null) {
                                q2 = o2;
                                o2 = q.g(o, d0, o3, p5, q.d(o), o2, k0);
                                continue Label_0620_Outer;
                            }
                            q2 = o2;
                            if (k0.q(d0)) {
                                q3 = o2;
                                q2 = o2;
                                if (d0.y()) {
                                    continue Label_0620_Outer;
                                }
                            }
                            else {
                                if ((o3 = o2) == null) {
                                    q2 = o2;
                                    o3 = k0.f(o);
                                }
                                q2 = o3;
                                m4 = k0.m(o3, d0);
                                q3 = o3;
                                if (m4) {
                                    o2 = o3;
                                    continue Label_0620_Outer;
                                }
                            }
                            for (int k4 = this.k; k4 < this.l; ++k4) {
                                q3 = this.q(o, this.j[k4], q3, k0, o);
                            }
                            if (q3 != null) {
                                k0.o(o, q3);
                            }
                            return;
                        }
                        finally {}
                        q = q4;
                        continue;
                    }
                }
                continue;
            }
        }
    }
    
    public final void N(final Object o, final int n, final Object o2, final p p5, final d0 d0) {
        final long x = X(this.w0(n));
        final Object c = o0.C(o, x);
        Object o3;
        if (c == null) {
            o3 = this.q.f(o2);
            o0.R(o, x, o3);
        }
        else {
            o3 = c;
            if (this.q.g(c)) {
                o3 = this.q.f(o2);
                this.q.a(o3, c);
                o0.R(o, x, o3);
            }
        }
        final Map h = this.q.h(o3);
        this.q.d(o2);
        d0.M(h, null, p5);
    }
    
    public final void O(final Object o, Object o2, final int n) {
        if (!this.B(o2, n)) {
            return;
        }
        final long x = X(this.w0(n));
        final Unsafe s = S.s;
        final Object object = s.getObject(o2, x);
        if (object == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Source subfield ");
            sb.append(this.W(n));
            sb.append(" is present but null: ");
            sb.append(o2);
            throw new IllegalStateException(sb.toString());
        }
        final e0 u = this.u(n);
        if (!this.B(o, n)) {
            if (!G(object)) {
                s.putObject(o, x, object);
            }
            else {
                o2 = u.f();
                u.a(o2, object);
                s.putObject(o, x, o2);
            }
            this.q0(o, n);
            return;
        }
        final Object o3 = o2 = s.getObject(o, x);
        if (!G(o3)) {
            o2 = u.f();
            u.a(o2, o3);
            s.putObject(o, x, o2);
        }
        u.a(o2, object);
    }
    
    public final void P(final Object o, Object o2, final int n) {
        final int w = this.W(n);
        if (!this.I(o2, w, n)) {
            return;
        }
        final long x = X(this.w0(n));
        final Unsafe s = S.s;
        final Object object = s.getObject(o2, x);
        if (object == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Source subfield ");
            sb.append(this.W(n));
            sb.append(" is present but null: ");
            sb.append(o2);
            throw new IllegalStateException(sb.toString());
        }
        final e0 u = this.u(n);
        if (!this.I(o, w, n)) {
            if (!G(object)) {
                s.putObject(o, x, object);
            }
            else {
                o2 = u.f();
                u.a(o2, object);
                s.putObject(o, x, o2);
            }
            this.r0(o, w, n);
            return;
        }
        final Object o3 = o2 = s.getObject(o, x);
        if (!G(o3)) {
            o2 = u.f();
            u.a(o2, o3);
            s.putObject(o, x, o2);
        }
        u.a(o2, object);
    }
    
    public final void Q(final Object o, final Object o2, final int n) {
        final int w0 = this.w0(n);
        final long x = X(w0);
        final int w2 = this.W(n);
        while (true) {
            Label_0512: {
                Label_0440: {
                    Label_0412: {
                        switch (v0(w0)) {
                            default: {
                                return;
                            }
                            case 60:
                            case 68: {
                                this.P(o, o2, n);
                                return;
                            }
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67: {
                                if (this.I(o2, w2, n)) {
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
                                if (this.I(o2, w2, n)) {
                                    break;
                                }
                                return;
                            }
                            case 50: {
                                g0.E(this.q, o, o2, x);
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
                                this.n.d(o, o2, x);
                                return;
                            }
                            case 9:
                            case 17: {
                                this.O(o, o2, n);
                                return;
                            }
                            case 16: {
                                if (this.B(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 15: {
                                if (this.B(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 14: {
                                if (this.B(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 13: {
                                if (this.B(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 12: {
                                if (this.B(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 11: {
                                if (this.B(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 10: {
                                if (this.B(o2, n)) {
                                    break Label_0512;
                                }
                                return;
                            }
                            case 8: {
                                if (this.B(o2, n)) {
                                    break Label_0512;
                                }
                                return;
                            }
                            case 7: {
                                if (this.B(o2, n)) {
                                    o0.H(o, x, o0.r(o2, x));
                                    break Label_0424;
                                }
                                return;
                            }
                            case 6: {
                                if (this.B(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 5: {
                                if (this.B(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 4: {
                                if (this.B(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 3: {
                                if (this.B(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 2: {
                                if (this.B(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 1: {
                                if (this.B(o2, n)) {
                                    o0.O(o, x, o0.y(o2, x));
                                    break Label_0424;
                                }
                                return;
                            }
                            case 0: {
                                if (this.B(o2, n)) {
                                    o0.N(o, x, o0.x(o2, x));
                                    break Label_0424;
                                }
                                return;
                            }
                        }
                        o0.R(o, x, o0.C(o2, x));
                        this.r0(o, w2, n);
                        return;
                    }
                    o0.Q(o, x, o0.A(o2, x));
                    this.q0(o, n);
                    return;
                }
                o0.P(o, x, o0.z(o2, x));
                continue;
            }
            o0.R(o, x, o0.C(o2, x));
            continue;
        }
    }
    
    public final Object R(Object object, final int n) {
        final e0 u = this.u(n);
        final long x = X(this.w0(n));
        if (!this.B(object, n)) {
            return u.f();
        }
        object = S.s.getObject(object, x);
        if (G(object)) {
            return object;
        }
        final Object f = u.f();
        if (object != null) {
            u.a(f, object);
        }
        return f;
    }
    
    public final Object S(Object object, final int n, final int n2) {
        final e0 u = this.u(n2);
        if (!this.I(object, n, n2)) {
            return u.f();
        }
        object = S.s.getObject(object, X(this.w0(n2)));
        if (G(object)) {
            return object;
        }
        final Object f = u.f();
        if (object != null) {
            u.a(f, object);
        }
        return f;
    }
    
    public final int W(final int n) {
        return this.a[n];
    }
    
    @Override
    public void a(final Object o, final Object o2) {
        m(o);
        o2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            this.Q(o, o2, i);
        }
        g0.F(this.o, o, o2);
        if (this.f) {
            g0.D(this.p, o, o2);
        }
    }
    
    @Override
    public void b(final Object o) {
        if (!G(o)) {
            return;
        }
        if (o instanceof x) {
            final x x = (x)o;
            x.n();
            x.m();
            x.F();
        }
        for (int length = this.a.length, i = 0; i < length; i += 3) {
            final int w0 = this.w0(i);
            final long x2 = X(w0);
            final int v0 = v0(w0);
            if (v0 != 9) {
                switch (v0) {
                    default: {
                        continue;
                    }
                    case 50: {
                        final Unsafe s = S.s;
                        final Object object = s.getObject(o, x2);
                        if (object != null) {
                            s.putObject(o, x2, this.q.c(object));
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
                        this.n.c(o, x2);
                        continue;
                    }
                    case 17: {
                        break;
                    }
                }
            }
            if (this.B(o, i)) {
                this.u(i).b(S.s.getObject(o, x2));
            }
        }
        this.o.j(o);
        if (this.f) {
            this.p.f(o);
        }
    }
    
    @Override
    public final boolean c(final Object o) {
        int n = 1048575;
        int i;
        for (int int1 = i = 0; i < this.k; ++i) {
            final int n2 = this.j[i];
            final int w = this.W(n2);
            final int w2 = this.w0(n2);
            final int n3 = this.a[n2 + 2];
            final int n4 = n3 & 0xFFFFF;
            final int n5 = 1 << (n3 >>> 20);
            if (n4 != n) {
                if (n4 != 1048575) {
                    int1 = S.s.getInt(o, n4);
                }
                n = n4;
            }
            if (J(w2) && !this.C(o, n2, n, int1, n5)) {
                return false;
            }
            final int v0 = v0(w2);
            if (v0 != 9 && v0 != 17) {
                if (v0 != 27) {
                    if (v0 != 60 && v0 != 68) {
                        if (v0 != 49) {
                            if (v0 != 50) {
                                continue;
                            }
                            if (!this.F(o, w2, n2)) {
                                return false;
                            }
                            continue;
                        }
                    }
                    else {
                        if (this.I(o, w, n2) && !D(o, w2, this.u(n2))) {
                            return false;
                        }
                        continue;
                    }
                }
                if (!this.E(o, w2, n2)) {
                    return false;
                }
            }
            else if (this.C(o, n2, n, int1, n5) && !D(o, w2, this.u(n2))) {
                return false;
            }
        }
        return !this.f || this.p.c(o).e();
    }
    
    @Override
    public boolean d(final Object o, final Object o2) {
        for (int length = this.a.length, i = 0; i < length; i += 3) {
            if (!this.p(o, o2, i)) {
                return false;
            }
        }
        return this.o.g(o).equals(this.o.g(o2)) && (!this.f || this.p.c(o).equals(this.p.c(o2)));
    }
    
    public final int d0(final Object o, final byte[] array, final int n, final int n2, final int n3, final long n4, final e.a a) {
        final Unsafe s = S.s;
        final Object t = this.t(n3);
        Object x;
        final Object o2 = x = s.getObject(o, n4);
        if (this.q.g(o2)) {
            x = this.q.f(t);
            this.q.a(x, o2);
            s.putObject(o, n4, x);
        }
        this.q.d(t);
        return this.n(array, n, n2, null, this.q.h(x), a);
    }
    
    @Override
    public int e(final Object o) {
        if (this.h) {
            return this.x(o);
        }
        return this.w(o);
    }
    
    public final int e0(final Object o, final byte[] bytes, int offset, int n, final int n2, final int x, final int n3, final int n4, final int n5, final long n6, final int n7, final e.a a) {
        final Unsafe s = S.s;
        final long offset2 = this.a[n7 + 2] & 0xFFFFF;
        boolean b = true;
    Label_0210:
        while (true) {
            Number x4 = null;
            Label_0522: {
                Number x3 = null;
            Label_0491:
                while (true) {
                    Label_0245: {
                        long l = 0L;
                        Label_0195: {
                            Object o2 = null;
                            switch (n5) {
                                default: {
                                    return offset;
                                }
                                case 68: {
                                    if (n3 == 3) {
                                        final Object s2 = this.S(o, x, n7);
                                        offset = com.google.crypto.tink.shaded.protobuf.e.M(s2, this.u(n7), bytes, offset, n, (n2 & 0xFFFFFFF8) | 0x4, a);
                                        o2 = s2;
                                        break;
                                    }
                                    return offset;
                                }
                                case 67: {
                                    if (n3 == 0) {
                                        offset = com.google.crypto.tink.shaded.protobuf.e.K(bytes, offset, a);
                                        l = com.google.crypto.tink.shaded.protobuf.i.c(a.b);
                                        break Label_0195;
                                    }
                                    return offset;
                                }
                                case 66: {
                                    if (n3 == 0) {
                                        offset = com.google.crypto.tink.shaded.protobuf.e.H(bytes, offset, a);
                                        n = com.google.crypto.tink.shaded.protobuf.i.b(a.a);
                                        break Label_0245;
                                    }
                                    return offset;
                                }
                                case 63: {
                                    if (n3 == 0) {
                                        offset = com.google.crypto.tink.shaded.protobuf.e.H(bytes, offset, a);
                                        n = a.a;
                                        this.s(n7);
                                        break Label_0245;
                                    }
                                    return offset;
                                }
                                case 61: {
                                    if (n3 == 2) {
                                        offset = com.google.crypto.tink.shaded.protobuf.e.b(bytes, offset, a);
                                        final Object x2 = a.c;
                                        break Label_0201;
                                    }
                                    return offset;
                                }
                                case 60: {
                                    if (n3 == 2) {
                                        final Object s3 = this.S(o, x, n7);
                                        offset = com.google.crypto.tink.shaded.protobuf.e.N(s3, this.u(n7), bytes, offset, n, a);
                                        o2 = s3;
                                        break;
                                    }
                                    return offset;
                                }
                                case 59: {
                                    if (n3 != 2) {
                                        return offset;
                                    }
                                    offset = com.google.crypto.tink.shaded.protobuf.e.H(bytes, offset, a);
                                    n = a.a;
                                    if (n == 0) {
                                        final Object x2 = "";
                                        break Label_0201;
                                    }
                                    if ((n4 & 0x20000000) != 0x0 && !p0.n(bytes, offset, offset + n)) {
                                        throw A.d();
                                    }
                                    s.putObject(o, n6, new String(bytes, offset, n, z.b));
                                    offset += n;
                                    break Label_0210;
                                }
                                case 58: {
                                    if (n3 == 0) {
                                        offset = com.google.crypto.tink.shaded.protobuf.e.K(bytes, offset, a);
                                        if (a.b == 0L) {
                                            b = false;
                                        }
                                        final Object x2 = b;
                                        break Label_0201;
                                    }
                                    return offset;
                                }
                                case 57:
                                case 64: {
                                    if (n3 == 5) {
                                        x3 = com.google.crypto.tink.shaded.protobuf.e.g(bytes, offset);
                                        break Label_0491;
                                    }
                                    return offset;
                                }
                                case 56:
                                case 65: {
                                    if (n3 == 1) {
                                        x4 = com.google.crypto.tink.shaded.protobuf.e.i(bytes, offset);
                                        break Label_0522;
                                    }
                                    return offset;
                                }
                                case 55:
                                case 62: {
                                    if (n3 == 0) {
                                        offset = com.google.crypto.tink.shaded.protobuf.e.H(bytes, offset, a);
                                        n = a.a;
                                        break Label_0245;
                                    }
                                    return offset;
                                }
                                case 53:
                                case 54: {
                                    if (n3 == 0) {
                                        offset = com.google.crypto.tink.shaded.protobuf.e.K(bytes, offset, a);
                                        l = a.b;
                                        break Label_0195;
                                    }
                                    return offset;
                                }
                                case 52: {
                                    if (n3 == 5) {
                                        x3 = com.google.crypto.tink.shaded.protobuf.e.k(bytes, offset);
                                        break Label_0491;
                                    }
                                    return offset;
                                }
                                case 51: {
                                    if (n3 == 1) {
                                        x4 = com.google.crypto.tink.shaded.protobuf.e.d(bytes, offset);
                                        break Label_0522;
                                    }
                                    return offset;
                                }
                            }
                            this.u0(o, x, n7, o2);
                            return offset;
                        }
                        final Object x2 = l;
                        s.putObject(o, n6, x2);
                        s.putInt(o, offset2, x);
                        return offset;
                    }
                    final Object x2 = n;
                    continue;
                }
                s.putObject(o, n6, x3);
                offset += 4;
                continue Label_0210;
            }
            s.putObject(o, n6, x4);
            offset += 8;
            continue Label_0210;
        }
    }
    
    @Override
    public Object f() {
        return this.m.a(this.e);
    }
    
    public int f0(final Object o, final byte[] array, int i, final int n, int n2, final e.a a) {
        byte[] array2 = array;
        int n3 = n2;
        m(o);
        final Unsafe s = S.s;
        int n4 = 0;
        int n5;
        int a2 = n5 = n4;
        int n6 = -1;
        int n7 = 1048575;
        while (true) {
            int g;
            int n8;
            int n9;
            int n10 = 0;
            int n11;
            int v0;
            long x;
            int n12;
            int n13;
            int n14;
            int int1;
            int n15;
            int n16;
            Object r;
            int n17 = 0;
            int n18;
            int n19 = 0;
            long x2 = 0L;
            int n20 = 0;
            int x3 = 0;
            int n21;
            Object r2;
            int n22;
            int n23;
            int n24;
            int n25;
            int n26;
            int n27;
            int n28;
            int n29;
            int h0;
            int n30 = 0;
            int n31;
            int n32;
            int n33;
            int d0;
            int e0;
            int n34;
            int n35;
            int n36;
            int n37;
            Object h2;
            z.d d2;
            int size;
            int n38;
            int n39;
            S s2;
            int j;
            Object o2;
            Label_0563_Outer:Label_1180_Outer:
            while (i < n) {
                g = i + 1;
                a2 = array2[i];
                if (a2 < 0) {
                    g = com.google.crypto.tink.shaded.protobuf.e.G(a2, array2, g, a);
                    a2 = a.a;
                }
                n8 = a2 >>> 3;
                n9 = (a2 & 0x7);
                if (n8 > n6) {
                    i = this.j0(n8, n4 / 3);
                }
                else {
                    i = this.i0(n8);
                }
                while (true) {
                    Label_1319: {
                        if (i == -1) {
                            i = n3;
                            n10 = 0;
                            break Label_1319;
                        }
                        n11 = this.a[i + 1];
                        v0 = v0(n11);
                        x = X(n11);
                        Label_0976: {
                            Label_0422: {
                                if (v0 <= 17) {
                                    n12 = this.a[i + 2];
                                    n13 = 1 << (n12 >>> 20);
                                    n14 = (n12 & 0xFFFFF);
                                    if (n14 != n7) {
                                        if (n7 != 1048575) {
                                            s.putInt(o, n7, n5);
                                        }
                                        int1 = s.getInt(o, n14);
                                        n15 = n14;
                                        n16 = int1;
                                    }
                                    else {
                                        n16 = n5;
                                        n15 = n7;
                                    }
                                    Label_0959: {
                                        while (true) {
                                            Label_0819: {
                                                Label_0631: {
                                                    while (true) {
                                                        Label_0552: {
                                                            switch (v0) {
                                                                default: {
                                                                    break Label_0959;
                                                                }
                                                                case 17: {
                                                                    if (n9 == 3) {
                                                                        r = this.R(o, i);
                                                                        n17 = com.google.crypto.tink.shaded.protobuf.e.M(r, this.u(i), array, g, n, n8 << 3 | 0x4, a);
                                                                        this.t0(o, i, r);
                                                                        n18 = (n16 | n13);
                                                                        n7 = n15;
                                                                        n5 = n18;
                                                                        break Label_0422;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                                case 16: {
                                                                    if (n9 == 0) {
                                                                        n19 = com.google.crypto.tink.shaded.protobuf.e.K(array, g, a);
                                                                        x2 = i.c(a.b);
                                                                        break;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                                case 15: {
                                                                    if (n9 == 0) {
                                                                        n20 = com.google.crypto.tink.shaded.protobuf.e.H(array, g, a);
                                                                        x3 = i.b(a.a);
                                                                        break Label_0552;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                                case 12: {
                                                                    if (n9 == 0) {
                                                                        n20 = com.google.crypto.tink.shaded.protobuf.e.H(array, g, a);
                                                                        x3 = a.a;
                                                                        this.s(i);
                                                                        break Label_0552;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                                case 10: {
                                                                    if (n9 == 2) {
                                                                        n20 = com.google.crypto.tink.shaded.protobuf.e.b(array, g, a);
                                                                        break Label_0631;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                                case 9: {
                                                                    n21 = i;
                                                                    if (n9 == 2) {
                                                                        r2 = this.R(o, n21);
                                                                        n22 = com.google.crypto.tink.shaded.protobuf.e.N(r2, this.u(n21), array, g, n, a);
                                                                        this.t0(o, n21, r2);
                                                                        n20 = n22;
                                                                        break Label_0563;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                                case 8: {
                                                                    if (n9 != 2) {
                                                                        break Label_0959;
                                                                    }
                                                                    if ((0x20000000 & n11) == 0x0) {
                                                                        n20 = com.google.crypto.tink.shaded.protobuf.e.B(array, g, a);
                                                                        break Label_0631;
                                                                    }
                                                                    n20 = com.google.crypto.tink.shaded.protobuf.e.E(array, g, a);
                                                                    break Label_0631;
                                                                }
                                                                case 7: {
                                                                    if (n9 == 0) {
                                                                        n20 = com.google.crypto.tink.shaded.protobuf.e.K(array, g, a);
                                                                        o0.H(o, x, a.b != 0L);
                                                                        break Label_0563;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                                case 6:
                                                                case 13: {
                                                                    if (n9 == 5) {
                                                                        s.putInt(o, x, com.google.crypto.tink.shaded.protobuf.e.g(array, g));
                                                                        break Label_0819;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                                case 5:
                                                                case 14: {
                                                                    if (n9 == 1) {
                                                                        s.putLong(o, x, com.google.crypto.tink.shaded.protobuf.e.i(array, g));
                                                                        n20 = g + 8;
                                                                        break Label_0563;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                                case 4:
                                                                case 11: {
                                                                    if (n9 == 0) {
                                                                        n20 = com.google.crypto.tink.shaded.protobuf.e.H(array, g, a);
                                                                        x3 = a.a;
                                                                        break Label_0552;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                                case 2:
                                                                case 3: {
                                                                    if (n9 == 0) {
                                                                        n19 = com.google.crypto.tink.shaded.protobuf.e.K(array, g, a);
                                                                        x2 = a.b;
                                                                        break;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                                case 1: {
                                                                    if (n9 == 5) {
                                                                        o0.O(o, x, com.google.crypto.tink.shaded.protobuf.e.k(array, g));
                                                                        break Label_0819;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                                case 0: {
                                                                    if (n9 == 1) {
                                                                        o0.N(o, x, com.google.crypto.tink.shaded.protobuf.e.d(array, g));
                                                                        n20 = g + 8;
                                                                        break Label_0563;
                                                                    }
                                                                    break Label_0959;
                                                                }
                                                            }
                                                            s.putLong(o, x, x2);
                                                            n23 = (n16 | n13);
                                                            n24 = n19;
                                                            n25 = n23;
                                                            n4 = i;
                                                            i = n24;
                                                            n3 = n2;
                                                            n26 = n15;
                                                            array2 = array;
                                                            n6 = n8;
                                                            n5 = n25;
                                                            n7 = n26;
                                                            continue Label_0563_Outer;
                                                        }
                                                        s.putInt(o, x, x3);
                                                        n27 = (n16 | n13);
                                                        n4 = i;
                                                        i = n20;
                                                        n25 = n27;
                                                        continue Label_1180_Outer;
                                                    }
                                                }
                                                s.putObject(o, x, a.c);
                                                continue Label_1180_Outer;
                                            }
                                            n20 = g + 4;
                                            continue Label_1180_Outer;
                                        }
                                    }
                                    n28 = i;
                                    i = n16;
                                    n10 = n28;
                                    n7 = n15;
                                    n5 = i;
                                    break Label_0976;
                                }
                                n6 = n8;
                                Label_1267: {
                                    if (v0 != 27) {
                                        n29 = n7;
                                        Label_1190: {
                                            if (v0 <= 49) {
                                                h0 = this.h0(o, array, g, n, a2, n6, n9, i, n11, v0, x, a);
                                                if ((n30 = h0) == g) {
                                                    break Label_1190;
                                                }
                                                n31 = h0;
                                            }
                                            else {
                                                n32 = g;
                                                n33 = i;
                                                if (v0 == 50) {
                                                    if (n9 != 2) {
                                                        break Label_1267;
                                                    }
                                                    d0 = this.d0(o, array, n32, n, n33, x, a);
                                                    if ((n30 = d0) == n32) {
                                                        break Label_1190;
                                                    }
                                                    n31 = d0;
                                                }
                                                else {
                                                    e0 = this.e0(o, array, n32, n, a2, n6, n9, n11, v0, x, n33, a);
                                                    if ((n30 = e0) == n32) {
                                                        break Label_1190;
                                                    }
                                                    n31 = e0;
                                                }
                                            }
                                            n34 = n2;
                                            n35 = n29;
                                            n3 = n34;
                                            n36 = n35;
                                            n4 = i;
                                            i = n31;
                                            break Label_1180;
                                        }
                                        n37 = i;
                                        i = n2;
                                        g = n30;
                                        n7 = n29;
                                        n10 = n37;
                                        break Label_1319;
                                    }
                                    if (n9 == 2) {
                                        d2 = (z.d)(h2 = s.getObject(o, x));
                                        if (!d2.p()) {
                                            size = d2.size();
                                            if (size == 0) {
                                                n38 = 10;
                                            }
                                            else {
                                                n38 = size * 2;
                                            }
                                            h2 = d2.h(n38);
                                            s.putObject(o, x, h2);
                                        }
                                        n17 = com.google.crypto.tink.shaded.protobuf.e.p(this.u(i), a2, array, g, n, (z.d)h2, a);
                                        break Label_0422;
                                    }
                                }
                                n10 = i;
                                break Label_0976;
                            }
                            n3 = n2;
                            n4 = i;
                            array2 = array;
                            i = n17;
                            n6 = n8;
                            continue Label_1180_Outer;
                        }
                        i = n2;
                        break Label_1319;
                        array2 = array;
                        n7 = n36;
                        continue Label_1180_Outer;
                    }
                    if (a2 != i || i == 0) {
                        if (this.f && a.d != com.google.crypto.tink.shaded.protobuf.p.b()) {
                            n39 = com.google.crypto.tink.shaded.protobuf.e.f(a2, array, g, n, o, this.e, this.o, a);
                        }
                        else {
                            n39 = com.google.crypto.tink.shaded.protobuf.e.F(a2, array, g, n, v(o), a);
                        }
                        n4 = n10;
                        n3 = i;
                        i = n39;
                        n6 = n8;
                        n36 = n7;
                        continue;
                    }
                    break;
                }
                s2 = this;
                n2 = i;
                i = g;
                if (n7 != 1048575) {
                    s.putInt(o, n7, n5);
                }
                j = s2.k;
                o2 = null;
                while (j < s2.l) {
                    o2 = this.q(o, s2.j[j], o2, s2.o, o);
                    ++j;
                }
                if (o2 != null) {
                    s2.o.o(o, o2);
                }
                if (n2 == 0) {
                    if (i == n) {
                        return i;
                    }
                    throw A.h();
                }
                else {
                    if (i <= n && a2 == n2) {
                        return i;
                    }
                    throw A.h();
                }
            }
            n2 = n3;
            s2 = this;
            continue;
        }
    }
    
    @Override
    public int g(final Object o) {
        final int length = this.a.length;
        int i = 0;
        int n = 0;
    Label_0434_Outer:
        while (i < length) {
            final int w0 = this.w0(i);
            final int w2 = this.W(i);
            final long x = X(w0);
            final int v0 = v0(w0);
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
                                                    switch (v0) {
                                                        default: {
                                                            n2 = n;
                                                            break Label_1001;
                                                        }
                                                        case 68: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 67: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 66: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 65: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 64: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 63: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 62: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 61: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
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
                                                            o2 = o0.C(o, x);
                                                            break Label_0386;
                                                        }
                                                        case 60: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 59: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break Label_0623;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 8: {
                                                            n3 = n * 53;
                                                            final int n4 = ((String)o0.C(o, x)).hashCode();
                                                            break Label_0393;
                                                        }
                                                        case 58: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                n3 = n * 53;
                                                                b = Y(o, x);
                                                                break Label_0678;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 57: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 56: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 55: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 54: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 53: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 52: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                n3 = n * 53;
                                                                value = a0(o, x);
                                                                break Label_0814;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 51: {
                                                            n2 = n;
                                                            if (this.I(o, w2, i)) {
                                                                n3 = n * 53;
                                                                value2 = Z(o, x);
                                                                break Label_0854;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 17: {
                                                            o3 = o0.C(o, x);
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
                                                            final long n5 = o0.A(o, x);
                                                            break Label_0434;
                                                        }
                                                        case 4:
                                                        case 6:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                        case 15: {
                                                            n3 = n * 53;
                                                            final int n4 = o0.z(o, x);
                                                            break Label_0393;
                                                        }
                                                        case 9: {
                                                            o3 = o0.C(o, x);
                                                            if (o3 != null) {
                                                                break Label_0434;
                                                            }
                                                            break Label_0883;
                                                        }
                                                        case 7: {
                                                            n3 = n * 53;
                                                            b = o0.r(o, x);
                                                            break Label_0678;
                                                        }
                                                        case 1: {
                                                            n3 = n * 53;
                                                            value = o0.y(o, x);
                                                            break Label_0814;
                                                        }
                                                        case 0: {
                                                            n3 = n * 53;
                                                            value2 = o0.x(o, x);
                                                            break Label_0854;
                                                        }
                                                    }
                                                }
                                                o2 = o0.C(o, x);
                                                n3 = n * 53;
                                            }
                                            final int n4 = o2.hashCode();
                                            n2 = n3 + n4;
                                            break Label_1001;
                                        }
                                        int n3 = n * 53;
                                        final long n5 = c0(o, x);
                                        final int n4 = z.f(n5);
                                        continue Label_0434_Outer;
                                    }
                                    int n3 = n * 53;
                                    final int n4 = b0(o, x);
                                    continue Label_0434_Outer;
                                }
                                final int n4 = z.c(b);
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
        int n6 = n * 53 + this.o.g(o).hashCode();
        if (this.f) {
            n6 = n6 * 53 + this.p.c(o).hashCode();
        }
        return n6;
    }
    
    public final int g0(final Object o, final byte[] array, int n, final int n2, final e.a a) {
        m(o);
        final Unsafe s = S.s;
        int n3 = -1;
        int i = n;
        n = -1;
        int int1;
        int n4 = int1 = 0;
        int n5 = 1048575;
    Label_1197_Outer:
        while (i < n2) {
            int g = i + 1;
            int a2 = array[i];
            if (a2 < 0) {
                g = com.google.crypto.tink.shaded.protobuf.e.G(a2, array, g, a);
                a2 = a.a;
            }
            final int n6 = a2 >>> 3;
            final int n7 = a2 & 0x7;
            if (n6 > n) {
                n = this.j0(n6, n4 / 3);
            }
            else {
                n = this.i0(n6);
            }
            while (true) {
                int n8 = 0;
                int n9 = 0;
                Label_1325: {
                    if (n == n3) {
                        n8 = g;
                        n9 = n3;
                        n = 0;
                        break Label_1325;
                    }
                    final int n10 = this.a[n + 1];
                    final int v0 = v0(n10);
                    final long x = X(n10);
                    int n16 = 0;
                    int n18 = 0;
                    Label_0416: {
                        if (v0 <= 17) {
                            final int n11 = this.a[n + 2];
                            final int n12 = 1 << (n11 >>> 20);
                            final int n13 = n11 & 0xFFFFF;
                            int n14 = int1;
                            int n15;
                            if (n13 != (n15 = n5)) {
                                if (n5 != 1048575) {
                                    s.putInt(o, n5, int1);
                                }
                                if (n13 != 1048575) {
                                    int1 = s.getInt(o, n13);
                                }
                                n15 = n13;
                                n14 = int1;
                            }
                        Label_0488_Outer:
                            while (true) {
                                Label_0826: {
                                    while (true) {
                                        Label_0539: {
                                            int n19 = 0;
                                            Label_0481: {
                                                switch (v0) {
                                                    case 16: {
                                                        if (n7 == 0) {
                                                            final int k = com.google.crypto.tink.shaded.protobuf.e.K(array, g, a);
                                                            s.putLong(o, x, com.google.crypto.tink.shaded.protobuf.i.c(a.b));
                                                            n16 = (n14 | n12);
                                                            final int n17 = k;
                                                            n5 = n15;
                                                            n18 = n;
                                                            n = n17;
                                                            break Label_0416;
                                                        }
                                                        break;
                                                    }
                                                    case 15: {
                                                        if (n7 == 0) {
                                                            n19 = com.google.crypto.tink.shaded.protobuf.e.H(array, g, a);
                                                            s.putInt(o, x, com.google.crypto.tink.shaded.protobuf.i.b(a.a));
                                                            break Label_0481;
                                                        }
                                                        break;
                                                    }
                                                    case 12: {
                                                        if (n7 == 0) {
                                                            n19 = com.google.crypto.tink.shaded.protobuf.e.H(array, g, a);
                                                            s.putInt(o, x, a.a);
                                                            break Label_0539;
                                                        }
                                                        break;
                                                    }
                                                    case 10: {
                                                        if (n7 == 2) {
                                                            n19 = com.google.crypto.tink.shaded.protobuf.e.b(array, g, a);
                                                            s.putObject(o, x, a.c);
                                                            break Label_0539;
                                                        }
                                                        break;
                                                    }
                                                    case 9: {
                                                        final int n20 = n;
                                                        if (n7 == 2) {
                                                            final Object r = this.R(o, n20);
                                                            final int n21 = com.google.crypto.tink.shaded.protobuf.e.N(r, this.u(n20), array, g, n2, a);
                                                            this.t0(o, n20, r);
                                                            n19 = n21;
                                                            break Label_0481;
                                                        }
                                                        break;
                                                    }
                                                    case 8: {
                                                        if (n7 == 2) {
                                                            if ((0x20000000 & n10) == 0x0) {
                                                                n19 = com.google.crypto.tink.shaded.protobuf.e.B(array, g, a);
                                                            }
                                                            else {
                                                                n19 = com.google.crypto.tink.shaded.protobuf.e.E(array, g, a);
                                                            }
                                                            s.putObject(o, x, a.c);
                                                            break Label_0703;
                                                        }
                                                        break;
                                                    }
                                                    case 7: {
                                                        boolean b = true;
                                                        if (n7 == 0) {
                                                            n19 = com.google.crypto.tink.shaded.protobuf.e.K(array, g, a);
                                                            if (a.b == 0L) {
                                                                b = false;
                                                            }
                                                            o0.H(o, x, b);
                                                            n16 = (n14 | n12);
                                                            break Label_0488;
                                                        }
                                                        break;
                                                    }
                                                    case 6:
                                                    case 13: {
                                                        if (n7 == 5) {
                                                            s.putInt(o, x, com.google.crypto.tink.shaded.protobuf.e.g(array, g));
                                                            n19 = g + 4;
                                                            break Label_0703;
                                                        }
                                                        break;
                                                    }
                                                    case 5:
                                                    case 14: {
                                                        if (n7 == 1) {
                                                            s.putLong(o, x, com.google.crypto.tink.shaded.protobuf.e.i(array, g));
                                                            break Label_0826;
                                                        }
                                                        break;
                                                    }
                                                    case 4:
                                                    case 11: {
                                                        if (n7 == 0) {
                                                            n19 = com.google.crypto.tink.shaded.protobuf.e.H(array, g, a);
                                                            s.putInt(o, x, a.a);
                                                            break Label_0703;
                                                        }
                                                        break;
                                                    }
                                                    case 2:
                                                    case 3: {
                                                        if (n7 == 0) {
                                                            final int j = com.google.crypto.tink.shaded.protobuf.e.K(array, g, a);
                                                            s.putLong(o, x, a.b);
                                                            n16 = (n14 | n12);
                                                            n18 = n;
                                                            n = j;
                                                            n5 = n15;
                                                            break Label_0416;
                                                        }
                                                        break;
                                                    }
                                                    case 1: {
                                                        final int n22 = g;
                                                        if (n7 == 5) {
                                                            o0.O(o, x, com.google.crypto.tink.shaded.protobuf.e.k(array, n22));
                                                            n19 = n22 + 4;
                                                            break Label_0703;
                                                        }
                                                        break;
                                                    }
                                                    case 0: {
                                                        if (n7 == 1) {
                                                            o0.N(o, x, com.google.crypto.tink.shaded.protobuf.e.d(array, g));
                                                            break Label_0826;
                                                        }
                                                        break;
                                                    }
                                                }
                                                break Label_0488_Outer;
                                            }
                                            n16 = (n14 | n12);
                                            final int n23 = n;
                                            n = n19;
                                            n18 = n23;
                                            n5 = n15;
                                            break Label_0416;
                                        }
                                        n16 = (n14 | n12);
                                        continue Label_1197_Outer;
                                        n16 = (n14 | n12);
                                        continue Label_1197_Outer;
                                    }
                                    break Label_0488_Outer;
                                }
                                int n19 = g + 8;
                                continue Label_0488_Outer;
                            }
                            int1 = n14;
                            final int n24 = -1;
                            n8 = g;
                            n5 = n15;
                            n9 = n24;
                            break Label_1325;
                        }
                        final int n25 = n6;
                        while (true) {
                            Label_1276: {
                                if (v0 == 27) {
                                    if (n7 == 2) {
                                        Object h;
                                        final z.d d = (z.d)(h = s.getObject(o, x));
                                        if (!d.p()) {
                                            final int size = d.size();
                                            int n26;
                                            if (size == 0) {
                                                n26 = 10;
                                            }
                                            else {
                                                n26 = size * 2;
                                            }
                                            h = d.h(n26);
                                            s.putObject(o, x, h);
                                        }
                                        final int p5 = com.google.crypto.tink.shaded.protobuf.e.p(this.u(n), a2, array, g, n2, (z.d)h, a);
                                        final int n27 = n;
                                        final int n28 = int1;
                                        n = p5;
                                        n18 = n27;
                                        n16 = n28;
                                        break Label_0416;
                                    }
                                    break Label_1276;
                                }
                                else {
                                    int n29 = 0;
                                    Label_1214: {
                                        if (v0 <= 49) {
                                            final int h2 = this.h0(o, array, g, n2, a2, n25, n7, n, n10, v0, x, a);
                                            if ((n29 = h2) == g) {
                                                break Label_1214;
                                            }
                                            final int n30 = h2;
                                        }
                                        else {
                                            final int n31 = n;
                                            final int n32 = g;
                                            if (v0 == 50) {
                                                if (n7 != 2) {
                                                    break Label_1276;
                                                }
                                                final int n30 = this.d0(o, array, n32, n2, n31, x, a);
                                                if ((n29 = n30) == n32) {
                                                    break Label_1214;
                                                }
                                            }
                                            else {
                                                final int n30 = this.e0(o, array, n32, n2, a2, n25, n7, n10, v0, x, n31, a);
                                                if ((n29 = n30) == n32) {
                                                    break Label_1214;
                                                }
                                            }
                                        }
                                        n3 = -1;
                                        break Label_1197;
                                    }
                                    n8 = n29;
                                }
                                n9 = -1;
                                break Label_1325;
                            }
                            n8 = g;
                            continue;
                        }
                    }
                    final int n33 = n6;
                    final int n34 = -1;
                    i = n;
                    n = n33;
                    n4 = n18;
                    int1 = n16;
                    n3 = n34;
                    continue Label_1197_Outer;
                    final int n35 = n;
                    int n30 = 0;
                    i = n30;
                    final int n25;
                    n = n25;
                    n4 = n35;
                    continue Label_1197_Outer;
                }
                final int f = com.google.crypto.tink.shaded.protobuf.e.F(a2, array, n8, n2, v(o), a);
                n3 = n9;
                final int n30 = f;
                final int n25 = n6;
                continue;
            }
        }
        if (n5 != 1048575) {
            s.putInt(o, n5, int1);
        }
        if (i == n2) {
            return i;
        }
        throw A.h();
    }
    
    @Override
    public void h(final Object o, final byte[] array, final int n, final int n2, final e.a a) {
        if (this.h) {
            this.g0(o, array, n, n2, a);
            return;
        }
        this.f0(o, array, n, n2, 0, a);
    }
    
    public final int h0(final Object o, final byte[] array, int n, final int n2, final int n3, final int n4, final int n5, final int n6, final long n7, final int n8, final long n9, final e.a a) {
        final Unsafe s = S.s;
        Object h;
        final z.d d = (z.d)(h = s.getObject(o, n9));
        if (!d.p()) {
            final int size = d.size();
            int n10;
            if (size == 0) {
                n10 = 10;
            }
            else {
                n10 = size * 2;
            }
            h = d.h(n10);
            s.putObject(o, n9, h);
        }
        switch (n8) {
            case 49: {
                if (n5 == 3) {
                    return com.google.crypto.tink.shaded.protobuf.e.n(this.u(n6), n3, array, n, n2, (z.d)h, a);
                }
                break;
            }
            case 34:
            case 48: {
                if (n5 == 2) {
                    return com.google.crypto.tink.shaded.protobuf.e.w(array, n, (z.d)h, a);
                }
                if (n5 == 0) {
                    return com.google.crypto.tink.shaded.protobuf.e.A(n3, array, n, n2, (z.d)h, a);
                }
                break;
            }
            case 33:
            case 47: {
                if (n5 == 2) {
                    return com.google.crypto.tink.shaded.protobuf.e.v(array, n, (z.d)h, a);
                }
                if (n5 == 0) {
                    return com.google.crypto.tink.shaded.protobuf.e.z(n3, array, n, n2, (z.d)h, a);
                }
                break;
            }
            case 30:
            case 44: {
                if (n5 == 2) {
                    n = com.google.crypto.tink.shaded.protobuf.e.x(array, n, (z.d)h, a);
                }
                else {
                    if (n5 != 0) {
                        break;
                    }
                    n = com.google.crypto.tink.shaded.protobuf.e.I(n3, array, n, n2, (z.d)h, a);
                }
                this.s(n6);
                g0.z(o, n4, (List)h, null, null, this.o);
                return n;
            }
            case 28: {
                if (n5 == 2) {
                    return com.google.crypto.tink.shaded.protobuf.e.c(n3, array, n, n2, (z.d)h, a);
                }
                break;
            }
            case 27: {
                if (n5 == 2) {
                    return com.google.crypto.tink.shaded.protobuf.e.p(this.u(n6), n3, array, n, n2, (z.d)h, a);
                }
                break;
            }
            case 26: {
                if (n5 != 2) {
                    break;
                }
                if ((n7 & 0x20000000L) == 0x0L) {
                    return com.google.crypto.tink.shaded.protobuf.e.C(n3, array, n, n2, (z.d)h, a);
                }
                return com.google.crypto.tink.shaded.protobuf.e.D(n3, array, n, n2, (z.d)h, a);
            }
            case 25:
            case 42: {
                if (n5 == 2) {
                    return com.google.crypto.tink.shaded.protobuf.e.q(array, n, (z.d)h, a);
                }
                if (n5 == 0) {
                    return com.google.crypto.tink.shaded.protobuf.e.a(n3, array, n, n2, (z.d)h, a);
                }
                break;
            }
            case 24:
            case 31:
            case 41:
            case 45: {
                if (n5 == 2) {
                    return com.google.crypto.tink.shaded.protobuf.e.s(array, n, (z.d)h, a);
                }
                if (n5 == 5) {
                    return com.google.crypto.tink.shaded.protobuf.e.h(n3, array, n, n2, (z.d)h, a);
                }
                break;
            }
            case 23:
            case 32:
            case 40:
            case 46: {
                if (n5 == 2) {
                    return com.google.crypto.tink.shaded.protobuf.e.t(array, n, (z.d)h, a);
                }
                if (n5 == 1) {
                    return com.google.crypto.tink.shaded.protobuf.e.j(n3, array, n, n2, (z.d)h, a);
                }
                break;
            }
            case 22:
            case 29:
            case 39:
            case 43: {
                if (n5 == 2) {
                    return com.google.crypto.tink.shaded.protobuf.e.x(array, n, (z.d)h, a);
                }
                if (n5 == 0) {
                    return com.google.crypto.tink.shaded.protobuf.e.I(n3, array, n, n2, (z.d)h, a);
                }
                break;
            }
            case 20:
            case 21:
            case 37:
            case 38: {
                if (n5 == 2) {
                    return com.google.crypto.tink.shaded.protobuf.e.y(array, n, (z.d)h, a);
                }
                if (n5 == 0) {
                    return com.google.crypto.tink.shaded.protobuf.e.L(n3, array, n, n2, (z.d)h, a);
                }
                break;
            }
            case 19:
            case 36: {
                if (n5 == 2) {
                    return com.google.crypto.tink.shaded.protobuf.e.u(array, n, (z.d)h, a);
                }
                if (n5 == 5) {
                    return com.google.crypto.tink.shaded.protobuf.e.l(n3, array, n, n2, (z.d)h, a);
                }
                break;
            }
            case 18:
            case 35: {
                if (n5 == 2) {
                    return com.google.crypto.tink.shaded.protobuf.e.r(array, n, (z.d)h, a);
                }
                if (n5 == 1) {
                    return com.google.crypto.tink.shaded.protobuf.e.e(n3, array, n, n2, (z.d)h, a);
                }
                break;
            }
        }
        return n;
    }
    
    @Override
    public void i(final Object o, final r0 r0) {
        if (r0.v() == com.google.crypto.tink.shaded.protobuf.r0.a.p) {
            this.z0(o, r0);
            return;
        }
        if (this.h) {
            this.y0(o, r0);
            return;
        }
        this.x0(o, r0);
    }
    
    public final int i0(final int n) {
        if (n >= this.c && n <= this.d) {
            return this.s0(n, 0);
        }
        return -1;
    }
    
    @Override
    public void j(final Object o, final d0 d0, final p p3) {
        p3.getClass();
        m(o);
        this.M(this.o, this.p, o, d0, p3);
    }
    
    public final int j0(final int n, final int n2) {
        if (n >= this.c && n <= this.d) {
            return this.s0(n, n2);
        }
        return -1;
    }
    
    public final boolean k(final Object o, final Object o2, final int n) {
        return this.B(o, n) == this.B(o2, n);
    }
    
    public final int k0(final int n) {
        return this.a[n + 2];
    }
    
    public final void l0(final Object o, final long n, final d0 d0, final e0 e0, final p p5) {
        d0.N(this.n.e(o, n), e0, p5);
    }
    
    public final void m0(final Object o, final int n, final d0 d0, final e0 e0, final p p5) {
        d0.K(this.n.e(o, X(n)), e0, p5);
    }
    
    public final int n(final byte[] array, int h, final int n, final H.a a, final Map map, final e.a a2) {
        h = com.google.crypto.tink.shaded.protobuf.e.H(array, h, a2);
        final int a3 = a2.a;
        if (a3 >= 0 && a3 <= n - h) {
            throw null;
        }
        throw A.m();
    }
    
    public final void n0(final Object o, final int n, final d0 d0) {
        long n2;
        Serializable s;
        if (A(n)) {
            n2 = X(n);
            s = d0.F();
        }
        else if (this.g) {
            n2 = X(n);
            s = d0.m();
        }
        else {
            n2 = X(n);
            s = d0.u();
        }
        o0.R(o, n2, s);
    }
    
    public final void o0(final Object o, final int n, final d0 d0) {
        if (A(n)) {
            d0.t(this.n.e(o, X(n)));
            return;
        }
        d0.q(this.n.e(o, X(n)));
    }
    
    public final boolean p(final Object o, final Object o2, final int n) {
        final int w0 = this.w0(n);
        final long x = X(w0);
        final int v0 = v0(w0);
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
        switch (v0) {
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
                if (this.H(o, o2, n)) {
                    b20 = b19;
                    if (g0.J(o0.C(o, x), o0.C(o2, x))) {
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
                return g0.J(o0.C(o, x), o0.C(o2, x));
            }
            case 17: {
                boolean b21 = b;
                if (this.k(o, o2, n)) {
                    b21 = b;
                    if (g0.J(o0.C(o, x), o0.C(o2, x))) {
                        b21 = true;
                    }
                }
                return b21;
            }
            case 16: {
                boolean b22 = b2;
                if (this.k(o, o2, n)) {
                    b22 = b2;
                    if (o0.A(o, x) == o0.A(o2, x)) {
                        b22 = true;
                    }
                }
                return b22;
            }
            case 15: {
                boolean b23 = b3;
                if (this.k(o, o2, n)) {
                    b23 = b3;
                    if (o0.z(o, x) == o0.z(o2, x)) {
                        b23 = true;
                    }
                }
                return b23;
            }
            case 14: {
                boolean b24 = b4;
                if (this.k(o, o2, n)) {
                    b24 = b4;
                    if (o0.A(o, x) == o0.A(o2, x)) {
                        b24 = true;
                    }
                }
                return b24;
            }
            case 13: {
                boolean b25 = b5;
                if (this.k(o, o2, n)) {
                    b25 = b5;
                    if (o0.z(o, x) == o0.z(o2, x)) {
                        b25 = true;
                    }
                }
                return b25;
            }
            case 12: {
                boolean b26 = b6;
                if (this.k(o, o2, n)) {
                    b26 = b6;
                    if (o0.z(o, x) == o0.z(o2, x)) {
                        b26 = true;
                    }
                }
                return b26;
            }
            case 11: {
                boolean b27 = b7;
                if (this.k(o, o2, n)) {
                    b27 = b7;
                    if (o0.z(o, x) == o0.z(o2, x)) {
                        b27 = true;
                    }
                }
                return b27;
            }
            case 10: {
                boolean b28 = b8;
                if (this.k(o, o2, n)) {
                    b28 = b8;
                    if (g0.J(o0.C(o, x), o0.C(o2, x))) {
                        b28 = true;
                    }
                }
                return b28;
            }
            case 9: {
                boolean b29 = b9;
                if (this.k(o, o2, n)) {
                    b29 = b9;
                    if (g0.J(o0.C(o, x), o0.C(o2, x))) {
                        b29 = true;
                    }
                }
                return b29;
            }
            case 8: {
                boolean b30 = b10;
                if (this.k(o, o2, n)) {
                    b30 = b10;
                    if (g0.J(o0.C(o, x), o0.C(o2, x))) {
                        b30 = true;
                    }
                }
                return b30;
            }
            case 7: {
                boolean b31 = b11;
                if (this.k(o, o2, n)) {
                    b31 = b11;
                    if (o0.r(o, x) == o0.r(o2, x)) {
                        b31 = true;
                    }
                }
                return b31;
            }
            case 6: {
                boolean b32 = b12;
                if (this.k(o, o2, n)) {
                    b32 = b12;
                    if (o0.z(o, x) == o0.z(o2, x)) {
                        b32 = true;
                    }
                }
                return b32;
            }
            case 5: {
                boolean b33 = b13;
                if (this.k(o, o2, n)) {
                    b33 = b13;
                    if (o0.A(o, x) == o0.A(o2, x)) {
                        b33 = true;
                    }
                }
                return b33;
            }
            case 4: {
                boolean b34 = b14;
                if (this.k(o, o2, n)) {
                    b34 = b14;
                    if (o0.z(o, x) == o0.z(o2, x)) {
                        b34 = true;
                    }
                }
                return b34;
            }
            case 3: {
                boolean b35 = b15;
                if (this.k(o, o2, n)) {
                    b35 = b15;
                    if (o0.A(o, x) == o0.A(o2, x)) {
                        b35 = true;
                    }
                }
                return b35;
            }
            case 2: {
                boolean b36 = b16;
                if (this.k(o, o2, n)) {
                    b36 = b16;
                    if (o0.A(o, x) == o0.A(o2, x)) {
                        b36 = true;
                    }
                }
                return b36;
            }
            case 1: {
                boolean b37 = b17;
                if (this.k(o, o2, n)) {
                    b37 = b17;
                    if (Float.floatToIntBits(o0.y(o, x)) == Float.floatToIntBits(o0.y(o2, x))) {
                        b37 = true;
                    }
                }
                return b37;
            }
            case 0: {
                boolean b38 = b18;
                if (this.k(o, o2, n)) {
                    b38 = b18;
                    if (Double.doubleToLongBits(o0.x(o, x)) == Double.doubleToLongBits(o0.x(o2, x))) {
                        b38 = true;
                    }
                }
                return b38;
            }
        }
    }
    
    public final Object q(final Object o, final int n, final Object o2, final k0 k0, final Object o3) {
        this.W(n);
        if (o0.C(o, X(this.w0(n))) == null) {
            return o2;
        }
        this.s(n);
        return o2;
    }
    
    public final void q0(final Object o, int k0) {
        k0 = this.k0(k0);
        final long n = 0xFFFFF & k0;
        if (n == 1048575L) {
            return;
        }
        o0.P(o, n, 1 << (k0 >>> 20) | o0.z(o, n));
    }
    
    public final void r0(final Object o, final int n, final int n2) {
        o0.P(o, this.k0(n2) & 0xFFFFF, n);
    }
    
    public final z.c s(final int n) {
        android.support.v4.media.a.a(this.b[n / 3 * 2 + 1]);
        return null;
    }
    
    public final int s0(final int n, int i) {
        int n2 = this.a.length / 3 - 1;
        while (i <= n2) {
            final int n3 = n2 + i >>> 1;
            final int n4 = n3 * 3;
            final int w = this.W(n4);
            if (n == w) {
                return n4;
            }
            if (n < w) {
                n2 = n3 - 1;
            }
            else {
                i = n3 + 1;
            }
        }
        return -1;
    }
    
    public final Object t(final int n) {
        return this.b[n / 3 * 2];
    }
    
    public final void t0(final Object o, final int n, final Object x) {
        S.s.putObject(o, X(this.w0(n)), x);
        this.q0(o, n);
    }
    
    public final e0 u(int n) {
        n = n / 3 * 2;
        final e0 e0 = (e0)this.b[n];
        if (e0 != null) {
            return e0;
        }
        return (e0)(this.b[n] = a0.a().c((Class)this.b[n + 1]));
    }
    
    public final void u0(final Object o, final int n, final int n2, final Object x) {
        S.s.putObject(o, X(this.w0(n2)), x);
        this.r0(o, n, n2);
    }
    
    public final int w(final Object o) {
        final Unsafe s = S.s;
        int n = 1048575;
        int i = 0;
        int n2 = 0;
        int int1 = 0;
    Label_0526_Outer:
        while (i < this.a.length) {
            final int w0 = this.w0(i);
            final int w2 = this.W(i);
            final int v0 = v0(w0);
            int n6;
            int n7;
            int n8;
            if (v0 <= 17) {
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
                if (this.i && v0 >= u.c0.c() && v0 <= u.p0.c()) {
                    n9 = (this.a[i + 2] & 0xFFFFF);
                }
                else {
                    n9 = 0;
                }
                n8 = 0;
                n6 = n;
                n7 = n9;
            }
            final long x = X(w0);
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
                                                                    switch (v0) {
                                                                        default: {
                                                                            n10 = n2;
                                                                            break Label_0530;
                                                                        }
                                                                        case 68: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                break;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 67: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                n11 = c0(o, x);
                                                                                break Label_0555;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 66: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                n12 = b0(o, x);
                                                                                break Label_0587;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 65: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                break Label_0611;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 64: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                break Label_0635;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 63: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                n13 = b0(o, x);
                                                                                break Label_0670;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 62: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                n14 = b0(o, x);
                                                                                break Label_0701;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 61: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                break Label_0725;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 60: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                break Label_0759;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 59: {
                                                                            n10 = n2;
                                                                            if (!this.I(o, w2, i)) {
                                                                                break Label_0530;
                                                                            }
                                                                            final Object object = s.getObject(o, x);
                                                                            if (object instanceof h) {
                                                                                final int n15 = com.google.crypto.tink.shaded.protobuf.k.f(w2, (h)object);
                                                                                break Label_0526;
                                                                            }
                                                                            final int n15 = com.google.crypto.tink.shaded.protobuf.k.J(w2, (String)object);
                                                                            break Label_0526;
                                                                        }
                                                                        case 58: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                break Label_0856;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 57: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                final int n16 = com.google.crypto.tink.shaded.protobuf.k.l(w2, 0);
                                                                                break Label_0642;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 56: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                final int n15 = com.google.crypto.tink.shaded.protobuf.k.n(w2, 0L);
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 55: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                final int n15 = com.google.crypto.tink.shaded.protobuf.k.t(w2, b0(o, x));
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 54: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                final int n15 = com.google.crypto.tink.shaded.protobuf.k.O(w2, c0(o, x));
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 53: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                final int n15 = com.google.crypto.tink.shaded.protobuf.k.v(w2, c0(o, x));
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 52: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                final int n15 = com.google.crypto.tink.shaded.protobuf.k.p(w2, 0.0f);
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 51: {
                                                                            n10 = n2;
                                                                            if (this.I(o, w2, i)) {
                                                                                final int n15 = com.google.crypto.tink.shaded.protobuf.k.h(w2, 0.0);
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 50: {
                                                                            final int n15 = this.q.b(w2, s.getObject(o, x), this.t(i));
                                                                            break Label_0526;
                                                                        }
                                                                        case 49: {
                                                                            final int n15 = g0.j(w2, (List)s.getObject(o, x), this.u(i));
                                                                            break Label_0526;
                                                                        }
                                                                        case 48: {
                                                                            final int t = g0.t((List)s.getObject(o, x));
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
                                                                            final int r = g0.r((List)s.getObject(o, x));
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
                                                                            final int j = g0.i((List)s.getObject(o, x));
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
                                                                            final int g = g0.g((List)s.getObject(o, x));
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
                                                                            final int e = g0.e((List)s.getObject(o, x));
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
                                                                            final int w3 = g0.w((List)s.getObject(o, x));
                                                                            n10 = n2;
                                                                            if (w3 <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = w3;
                                                                            if (this.i) {
                                                                                x2 = w3;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 42: {
                                                                            final int b = g0.b((List)s.getObject(o, x));
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
                                                                            final int g2 = g0.g((List)s.getObject(o, x));
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
                                                                            final int k = g0.i((List)s.getObject(o, x));
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
                                                                            final int l = g0.l((List)s.getObject(o, x));
                                                                            n10 = n2;
                                                                            if (l <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = l;
                                                                            if (this.i) {
                                                                                x2 = l;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 38: {
                                                                            final int y = g0.y((List)s.getObject(o, x));
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
                                                                            final int n17 = g0.n((List)s.getObject(o, x));
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
                                                                            final int g3 = g0.g((List)s.getObject(o, x));
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
                                                                            final int m = g0.i((List)s.getObject(o, x));
                                                                            n10 = n2;
                                                                            if (m <= 0) {
                                                                                break Label_0530;
                                                                            }
                                                                            x2 = m;
                                                                            if (this.i) {
                                                                                x2 = m;
                                                                                break Label_0526;
                                                                            }
                                                                            break Label_1150;
                                                                        }
                                                                        case 34: {
                                                                            n18 = g0.s(w2, (List)s.getObject(o, x), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 33: {
                                                                            n18 = g0.q(w2, (List)s.getObject(o, x), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 23:
                                                                        case 32: {
                                                                            n18 = g0.h(w2, (List)s.getObject(o, x), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 19:
                                                                        case 24:
                                                                        case 31: {
                                                                            n18 = g0.f(w2, (List)s.getObject(o, x), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 30: {
                                                                            n18 = g0.d(w2, (List)s.getObject(o, x), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 29: {
                                                                            final int n15 = g0.v(w2, (List)s.getObject(o, x), false);
                                                                            break Label_0526;
                                                                        }
                                                                        case 28: {
                                                                            final int n15 = g0.c(w2, (List)s.getObject(o, x));
                                                                            break Label_0526;
                                                                        }
                                                                        case 27: {
                                                                            final int n15 = g0.p(w2, (List)s.getObject(o, x), this.u(i));
                                                                            break Label_0526;
                                                                        }
                                                                        case 26: {
                                                                            final int n15 = g0.u(w2, (List)s.getObject(o, x));
                                                                            break Label_0526;
                                                                        }
                                                                        case 25: {
                                                                            n18 = g0.a(w2, (List)s.getObject(o, x), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 22: {
                                                                            n18 = g0.k(w2, (List)s.getObject(o, x), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 21: {
                                                                            n18 = g0.x(w2, (List)s.getObject(o, x), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 20: {
                                                                            n18 = g0.m(w2, (List)s.getObject(o, x), false);
                                                                            break Label_0642;
                                                                        }
                                                                        case 18: {
                                                                            final int n15 = g0.h(w2, (List)s.getObject(o, x), false);
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
                                                                                n11 = s.getLong(o, x);
                                                                                break Label_0555;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 15: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n12 = s.getInt(o, x);
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
                                                                                n13 = s.getInt(o, x);
                                                                                break Label_0670;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 11: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n14 = s.getInt(o, x);
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
                                                                            final Object object2 = s.getObject(o, x);
                                                                            if (object2 instanceof h) {
                                                                                final int n15 = com.google.crypto.tink.shaded.protobuf.k.f(w2, (h)object2);
                                                                                break Label_0526;
                                                                            }
                                                                            final int n15 = com.google.crypto.tink.shaded.protobuf.k.J(w2, (String)object2);
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
                                                                                n19 = com.google.crypto.tink.shaded.protobuf.k.l(w2, 0);
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_0530;
                                                                        }
                                                                        case 5: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.crypto.tink.shaded.protobuf.k.n(w2, 0L);
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_2362;
                                                                        }
                                                                        case 4: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.crypto.tink.shaded.protobuf.k.t(w2, s.getInt(o, x));
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_2362;
                                                                        }
                                                                        case 3: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.crypto.tink.shaded.protobuf.k.O(w2, s.getLong(o, x));
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_2362;
                                                                        }
                                                                        case 2: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.crypto.tink.shaded.protobuf.k.v(w2, s.getLong(o, x));
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_2362;
                                                                        }
                                                                        case 1: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.crypto.tink.shaded.protobuf.k.p(w2, 0.0f);
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_2362;
                                                                        }
                                                                        case 0: {
                                                                            n10 = n2;
                                                                            if ((int1 & n8) != 0x0) {
                                                                                n19 = com.google.crypto.tink.shaded.protobuf.k.h(w2, 0.0);
                                                                                break Label_2214;
                                                                            }
                                                                            break Label_2362;
                                                                        }
                                                                    }
                                                                    final int n15 = com.google.crypto.tink.shaded.protobuf.k.r(w2, (O)s.getObject(o, x), this.u(i));
                                                                    n10 = n2 + n15;
                                                                    break Label_2362;
                                                                }
                                                                final int n15 = com.google.crypto.tink.shaded.protobuf.k.H(w2, n11);
                                                                continue Label_0526;
                                                            }
                                                            final int n15 = com.google.crypto.tink.shaded.protobuf.k.F(w2, n12);
                                                            continue Label_0526;
                                                        }
                                                        final int n15 = com.google.crypto.tink.shaded.protobuf.k.D(w2, 0L);
                                                        continue Label_0526;
                                                    }
                                                    final int n16 = com.google.crypto.tink.shaded.protobuf.k.B(w2, 0);
                                                    n10 = n2 + n16;
                                                    continue Label_0526_Outer;
                                                }
                                                final int n15 = com.google.crypto.tink.shaded.protobuf.k.j(w2, n13);
                                                continue Label_0526;
                                            }
                                            final int n15 = com.google.crypto.tink.shaded.protobuf.k.M(w2, n14);
                                            continue Label_0526;
                                        }
                                        final int n15 = com.google.crypto.tink.shaded.protobuf.k.f(w2, (h)s.getObject(o, x));
                                        continue Label_0526;
                                    }
                                    final int n15 = g0.o(w2, s.getObject(o, x), this.u(i));
                                    continue Label_0526;
                                }
                                final int n15 = com.google.crypto.tink.shaded.protobuf.k.d(w2, true);
                                continue Label_0526;
                            }
                            s.putInt(o, n7, x2);
                        }
                        final int n16 = com.google.crypto.tink.shaded.protobuf.k.L(w2) + com.google.crypto.tink.shaded.protobuf.k.N(x2) + x2;
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
        int n20 = n2 + this.y(this.o, o);
        if (this.f) {
            n20 += this.p.c(o).c();
        }
        return n20;
    }
    
    public final int w0(final int n) {
        return this.a[n + 1];
    }
    
    public final int x(final Object o) {
        final Unsafe s = S.s;
        int n = 0;
        int n3 = 0;
    Label_0416_Outer:
        for (int i = n = 0; i < this.a.length; i += 3, n = n3) {
            final int w0 = this.w0(i);
            final int v0 = v0(w0);
            final int w2 = this.W(i);
            final long x = X(w0);
            int n2;
            if (v0 >= u.c0.c() && v0 <= u.p0.c()) {
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
                                                                                                    switch (v0) {
                                                                                                        default: {
                                                                                                            n3 = n;
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 68: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 67: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                n4 = c0(o, x);
                                                                                                                break Label_0446;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 66: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                n5 = b0(o, x);
                                                                                                                break Label_0478;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 65: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                break Label_0502;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 64: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                break Label_0526;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 63: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                n6 = b0(o, x);
                                                                                                                break Label_0557;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 62: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                n7 = b0(o, x);
                                                                                                                break Label_0588;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 61: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                break Label_0612;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 60: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                break Label_0648;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 59: {
                                                                                                            n3 = n;
                                                                                                            if (!this.I(o, w2, i)) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            final Object o2 = o3 = o0.C(o, x);
                                                                                                            if (o2 instanceof h) {
                                                                                                                final Object c = o2;
                                                                                                                break Label_0706;
                                                                                                            }
                                                                                                            break Label_0709;
                                                                                                        }
                                                                                                        case 58: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                break Label_0737;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 57: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                break Label_0761;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 56: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                break Label_0785;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 55: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                n8 = b0(o, x);
                                                                                                                break Label_0816;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 54: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                n9 = c0(o, x);
                                                                                                                break Label_0848;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 53: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                n10 = c0(o, x);
                                                                                                                break Label_0881;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 52: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                break Label_0906;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 51: {
                                                                                                            n3 = n;
                                                                                                            if (this.I(o, w2, i)) {
                                                                                                                break Label_0930;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 50: {
                                                                                                            final int n11 = this.q.b(w2, o0.C(o, x), this.t(i));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 49: {
                                                                                                            final int n11 = g0.j(w2, K(o, x), this.u(i));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 48: {
                                                                                                            final int t = g0.t((List)s.getObject(o, x));
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
                                                                                                            final int r = g0.r((List)s.getObject(o, x));
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
                                                                                                            final int j = g0.i((List)s.getObject(o, x));
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
                                                                                                            final int g = g0.g((List)s.getObject(o, x));
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
                                                                                                            final int e = g0.e((List)s.getObject(o, x));
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
                                                                                                            final int w3 = g0.w((List)s.getObject(o, x));
                                                                                                            n3 = n;
                                                                                                            if (w3 <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = w3;
                                                                                                            if (this.i) {
                                                                                                                x2 = w3;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 42: {
                                                                                                            final int b = g0.b((List)s.getObject(o, x));
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
                                                                                                            final int g2 = g0.g((List)s.getObject(o, x));
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
                                                                                                            final int k = g0.i((List)s.getObject(o, x));
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
                                                                                                            final int l = g0.l((List)s.getObject(o, x));
                                                                                                            n3 = n;
                                                                                                            if (l <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = l;
                                                                                                            if (this.i) {
                                                                                                                x2 = l;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 38: {
                                                                                                            final int y = g0.y((List)s.getObject(o, x));
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
                                                                                                            final int n12 = g0.n((List)s.getObject(o, x));
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
                                                                                                            final int g3 = g0.g((List)s.getObject(o, x));
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
                                                                                                            final int m = g0.i((List)s.getObject(o, x));
                                                                                                            n3 = n;
                                                                                                            if (m <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x2 = m;
                                                                                                            if (this.i) {
                                                                                                                x2 = m;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 34: {
                                                                                                            final int n11 = g0.s(w2, K(o, x), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 33: {
                                                                                                            final int n11 = g0.q(w2, K(o, x), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 18:
                                                                                                        case 23:
                                                                                                        case 32: {
                                                                                                            final int n11 = g0.h(w2, K(o, x), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 19:
                                                                                                        case 24:
                                                                                                        case 31: {
                                                                                                            final int n11 = g0.f(w2, K(o, x), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 30: {
                                                                                                            final int n11 = g0.d(w2, K(o, x), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 29: {
                                                                                                            final int n11 = g0.v(w2, K(o, x), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 28: {
                                                                                                            final int n11 = g0.c(w2, K(o, x));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 27: {
                                                                                                            final int n11 = g0.p(w2, K(o, x), this.u(i));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 26: {
                                                                                                            final int n11 = g0.u(w2, K(o, x));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 25: {
                                                                                                            final int n11 = g0.a(w2, K(o, x), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 22: {
                                                                                                            final int n11 = g0.k(w2, K(o, x), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 21: {
                                                                                                            final int n11 = g0.x(w2, K(o, x), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 20: {
                                                                                                            final int n11 = g0.m(w2, K(o, x), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 17: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 16: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n4 = o0.A(o, x);
                                                                                                                break Label_0446;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 15: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n5 = o0.z(o, x);
                                                                                                                break Label_0478;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 14: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_0502;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 13: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_0526;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 12: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n6 = o0.z(o, x);
                                                                                                                break Label_0557;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 11: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n7 = o0.z(o, x);
                                                                                                                break Label_0588;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 10: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_0612;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 9: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_0648;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 8: {
                                                                                                            n3 = n;
                                                                                                            if (!this.B(o, i)) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            final Object o4 = o3 = o0.C(o, x);
                                                                                                            if (o4 instanceof h) {
                                                                                                                final Object c = o4;
                                                                                                                break Label_0706;
                                                                                                            }
                                                                                                            break Label_0709;
                                                                                                        }
                                                                                                        case 7: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_0737;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 6: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_0761;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 5: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_0785;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 4: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n8 = o0.z(o, x);
                                                                                                                break Label_0816;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n9 = o0.A(o, x);
                                                                                                                break Label_0848;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                n10 = o0.A(o, x);
                                                                                                                break Label_0881;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 1: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_0906;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 0: {
                                                                                                            n3 = n;
                                                                                                            if (this.B(o, i)) {
                                                                                                                break Label_0930;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                    }
                                                                                                    final int n11 = com.google.crypto.tink.shaded.protobuf.k.r(w2, (O)o0.C(o, x), this.u(i));
                                                                                                    n3 = n + n11;
                                                                                                    continue Label_0416_Outer;
                                                                                                }
                                                                                                final int n11 = com.google.crypto.tink.shaded.protobuf.k.H(w2, n4);
                                                                                                continue Label_0620_Outer;
                                                                                            }
                                                                                            final int n11 = com.google.crypto.tink.shaded.protobuf.k.F(w2, n5);
                                                                                            continue Label_0620_Outer;
                                                                                        }
                                                                                        final int n11 = com.google.crypto.tink.shaded.protobuf.k.D(w2, 0L);
                                                                                        continue Label_0620_Outer;
                                                                                    }
                                                                                    final int n11 = com.google.crypto.tink.shaded.protobuf.k.B(w2, 0);
                                                                                    continue Label_0620_Outer;
                                                                                }
                                                                                final int n11 = com.google.crypto.tink.shaded.protobuf.k.j(w2, n6);
                                                                                continue Label_0620_Outer;
                                                                            }
                                                                            final int n11 = com.google.crypto.tink.shaded.protobuf.k.M(w2, n7);
                                                                            continue Label_0620_Outer;
                                                                        }
                                                                        final Object c = o0.C(o, x);
                                                                        final int n11 = com.google.crypto.tink.shaded.protobuf.k.f(w2, (h)c);
                                                                        continue Label_0620_Outer;
                                                                    }
                                                                    final int n11 = g0.o(w2, o0.C(o, x), this.u(i));
                                                                    continue Label_0620_Outer;
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                        final int n11 = com.google.crypto.tink.shaded.protobuf.k.J(w2, (String)o3);
                                                        continue;
                                                    }
                                                    final int n11 = com.google.crypto.tink.shaded.protobuf.k.d(w2, true);
                                                    continue;
                                                }
                                                final int n11 = com.google.crypto.tink.shaded.protobuf.k.l(w2, 0);
                                                continue;
                                            }
                                            final int n11 = com.google.crypto.tink.shaded.protobuf.k.n(w2, 0L);
                                            continue;
                                        }
                                        final int n11 = com.google.crypto.tink.shaded.protobuf.k.t(w2, n8);
                                        continue;
                                    }
                                    final int n11 = com.google.crypto.tink.shaded.protobuf.k.O(w2, n9);
                                    continue;
                                }
                                final int n11 = com.google.crypto.tink.shaded.protobuf.k.v(w2, n10);
                                continue;
                            }
                            final int n11 = com.google.crypto.tink.shaded.protobuf.k.p(w2, 0.0f);
                            continue;
                        }
                        final int n11 = com.google.crypto.tink.shaded.protobuf.k.h(w2, 0.0);
                        continue;
                    }
                    s.putInt(o, n2, x2);
                }
                final int n11 = com.google.crypto.tink.shaded.protobuf.k.L(w2) + com.google.crypto.tink.shaded.protobuf.k.N(x2) + x2;
                continue;
            }
        }
        return n + this.y(this.o, o);
    }
    
    public final void x0(final Object o, final r0 r0) {
        Iterator<Map.Entry<?, ?>> f = null;
        Map.Entry<?, ?> entry = null;
        Label_0053: {
            if (this.f) {
                final t c = this.p.c(o);
                if (!c.d()) {
                    f = (Iterator<Map.Entry<?, ?>>)c.f();
                    entry = f.next();
                    break Label_0053;
                }
            }
            f = null;
            entry = null;
        }
        final int length = this.a.length;
        final Unsafe s = S.s;
        int n = 1048575;
        int n2 = 0;
        int int1 = 0;
        Map.Entry<?, ?> entry2;
        while (true) {
            entry2 = entry;
            if (n2 >= length) {
                break;
            }
            final int w0 = this.w0(n2);
            final int w2 = this.W(n2);
            final int v0 = v0(w0);
            int n6;
            if (v0 <= 17) {
                final int n3 = this.a[n2 + 2];
                final int n4 = n3 & 0xFFFFF;
                int n5;
                if (n4 != (n5 = n)) {
                    int1 = s.getInt(o, n4);
                    n5 = n4;
                }
                n6 = 1 << (n3 >>> 20);
                n = n5;
            }
            else {
                n6 = 0;
            }
            while (entry != null && this.p.a((Map.Entry)entry) <= w2) {
                this.p.j(r0, (Map.Entry)entry);
                if (f.hasNext()) {
                    entry = f.next();
                }
                else {
                    entry = null;
                }
            }
            final long x = X(w0);
            switch (v0) {
                case 68: {
                    if (this.I(o, w2, n2)) {
                        r0.O(w2, s.getObject(o, x), this.u(n2));
                        break;
                    }
                    break;
                }
                case 67: {
                    if (this.I(o, w2, n2)) {
                        r0.w(w2, c0(o, x));
                        break;
                    }
                    break;
                }
                case 66: {
                    if (this.I(o, w2, n2)) {
                        r0.H(w2, b0(o, x));
                        break;
                    }
                    break;
                }
                case 65: {
                    if (this.I(o, w2, n2)) {
                        r0.n(w2, c0(o, x));
                        break;
                    }
                    break;
                }
                case 64: {
                    if (this.I(o, w2, n2)) {
                        r0.g(w2, b0(o, x));
                        break;
                    }
                    break;
                }
                case 63: {
                    if (this.I(o, w2, n2)) {
                        r0.D(w2, b0(o, x));
                        break;
                    }
                    break;
                }
                case 62: {
                    if (this.I(o, w2, n2)) {
                        r0.e(w2, b0(o, x));
                        break;
                    }
                    break;
                }
                case 61: {
                    if (this.I(o, w2, n2)) {
                        r0.M(w2, (h)s.getObject(o, x));
                        break;
                    }
                    break;
                }
                case 60: {
                    if (this.I(o, w2, n2)) {
                        r0.L(w2, s.getObject(o, x), this.u(n2));
                        break;
                    }
                    break;
                }
                case 59: {
                    if (this.I(o, w2, n2)) {
                        this.B0(w2, s.getObject(o, x), r0);
                        break;
                    }
                    break;
                }
                case 58: {
                    if (this.I(o, w2, n2)) {
                        r0.d(w2, Y(o, x));
                        break;
                    }
                    break;
                }
                case 57: {
                    if (this.I(o, w2, n2)) {
                        r0.l(w2, b0(o, x));
                        break;
                    }
                    break;
                }
                case 56: {
                    if (this.I(o, w2, n2)) {
                        r0.u(w2, c0(o, x));
                        break;
                    }
                    break;
                }
                case 55: {
                    if (this.I(o, w2, n2)) {
                        r0.i(w2, b0(o, x));
                        break;
                    }
                    break;
                }
                case 54: {
                    if (this.I(o, w2, n2)) {
                        r0.C(w2, c0(o, x));
                        break;
                    }
                    break;
                }
                case 53: {
                    if (this.I(o, w2, n2)) {
                        r0.c(w2, c0(o, x));
                        break;
                    }
                    break;
                }
                case 52: {
                    if (this.I(o, w2, n2)) {
                        r0.x(w2, a0(o, x));
                        break;
                    }
                    break;
                }
                case 51: {
                    if (this.I(o, w2, n2)) {
                        r0.m(w2, Z(o, x));
                        break;
                    }
                    break;
                }
                case 50: {
                    this.A0(r0, w2, s.getObject(o, x), n2);
                    break;
                }
                case 49: {
                    g0.T(this.W(n2), (List)s.getObject(o, x), r0, this.u(n2));
                    break;
                }
                case 48: {
                    g0.a0(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 47: {
                    g0.Z(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 46: {
                    g0.Y(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 45: {
                    g0.X(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 44: {
                    g0.P(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 43: {
                    g0.c0(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 42: {
                    g0.M(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 41: {
                    g0.Q(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 40: {
                    g0.R(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 39: {
                    g0.U(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 38: {
                    g0.d0(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 37: {
                    g0.V(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 36: {
                    g0.S(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 35: {
                    g0.O(this.W(n2), (List)s.getObject(o, x), r0, true);
                    break;
                }
                case 34: {
                    g0.a0(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 33: {
                    g0.Z(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 32: {
                    g0.Y(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 31: {
                    g0.X(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 30: {
                    g0.P(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 29: {
                    g0.c0(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 28: {
                    g0.N(this.W(n2), (List)s.getObject(o, x), r0);
                    break;
                }
                case 27: {
                    g0.W(this.W(n2), (List)s.getObject(o, x), r0, this.u(n2));
                    break;
                }
                case 26: {
                    g0.b0(this.W(n2), (List)s.getObject(o, x), r0);
                    break;
                }
                case 25: {
                    g0.M(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 24: {
                    g0.Q(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 23: {
                    g0.R(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 22: {
                    g0.U(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 21: {
                    g0.d0(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 20: {
                    g0.V(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 19: {
                    g0.S(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 18: {
                    g0.O(this.W(n2), (List)s.getObject(o, x), r0, false);
                    break;
                }
                case 17: {
                    if ((n6 & int1) != 0x0) {
                        r0.O(w2, s.getObject(o, x), this.u(n2));
                        break;
                    }
                    break;
                }
                case 16: {
                    if ((n6 & int1) != 0x0) {
                        r0.w(w2, s.getLong(o, x));
                        break;
                    }
                    break;
                }
                case 15: {
                    if ((n6 & int1) != 0x0) {
                        r0.H(w2, s.getInt(o, x));
                        break;
                    }
                    break;
                }
                case 14: {
                    if ((n6 & int1) != 0x0) {
                        r0.n(w2, s.getLong(o, x));
                        break;
                    }
                    break;
                }
                case 13: {
                    if ((n6 & int1) != 0x0) {
                        r0.g(w2, s.getInt(o, x));
                        break;
                    }
                    break;
                }
                case 12: {
                    if ((n6 & int1) != 0x0) {
                        r0.D(w2, s.getInt(o, x));
                        break;
                    }
                    break;
                }
                case 11: {
                    if ((n6 & int1) != 0x0) {
                        r0.e(w2, s.getInt(o, x));
                        break;
                    }
                    break;
                }
                case 10: {
                    if ((n6 & int1) != 0x0) {
                        r0.M(w2, (h)s.getObject(o, x));
                        break;
                    }
                    break;
                }
                case 9: {
                    if ((n6 & int1) != 0x0) {
                        r0.L(w2, s.getObject(o, x), this.u(n2));
                        break;
                    }
                    break;
                }
                case 8: {
                    if ((n6 & int1) != 0x0) {
                        this.B0(w2, s.getObject(o, x), r0);
                        break;
                    }
                    break;
                }
                case 7: {
                    if ((n6 & int1) != 0x0) {
                        r0.d(w2, l(o, x));
                        break;
                    }
                    break;
                }
                case 6: {
                    if ((n6 & int1) != 0x0) {
                        r0.l(w2, s.getInt(o, x));
                        break;
                    }
                    break;
                }
                case 5: {
                    if ((n6 & int1) != 0x0) {
                        r0.u(w2, s.getLong(o, x));
                        break;
                    }
                    break;
                }
                case 4: {
                    if ((n6 & int1) != 0x0) {
                        r0.i(w2, s.getInt(o, x));
                        break;
                    }
                    break;
                }
                case 3: {
                    if ((n6 & int1) != 0x0) {
                        r0.C(w2, s.getLong(o, x));
                        break;
                    }
                    break;
                }
                case 2: {
                    if ((n6 & int1) != 0x0) {
                        r0.c(w2, s.getLong(o, x));
                        break;
                    }
                    break;
                }
                case 1: {
                    if ((n6 & int1) != 0x0) {
                        r0.x(w2, r(o, x));
                        break;
                    }
                    break;
                }
                case 0: {
                    if ((n6 & int1) != 0x0) {
                        r0.m(w2, o(o, x));
                        break;
                    }
                    break;
                }
            }
            n2 += 3;
        }
        while (entry2 != null) {
            this.p.j(r0, (Map.Entry)entry2);
            if (f.hasNext()) {
                entry2 = f.next();
            }
            else {
                entry2 = null;
            }
        }
        this.C0(this.o, o, r0);
    }
    
    public final int y(final k0 k0, final Object o) {
        return k0.h(k0.g(o));
    }
    
    public final void y0(final Object o, final r0 r0) {
        Object f = null;
        Map.Entry<?, ?> entry = null;
        Label_0054: {
            if (this.f) {
                final t c = this.p.c(o);
                if (!c.d()) {
                    f = c.f();
                    entry = ((Iterator<Map.Entry<?, ?>>)f).next();
                    break Label_0054;
                }
            }
            f = (entry = null);
        }
        final int length = this.a.length;
        int n = 0;
        Map.Entry<?, ?> entry2;
        while (true) {
            entry2 = entry;
            if (n >= length) {
                break;
            }
            final int w0 = this.w0(n);
            final int w2 = this.W(n);
            while (entry != null && this.p.a((Map.Entry)entry) <= w2) {
                this.p.j(r0, (Map.Entry)entry);
                if (((Iterator)f).hasNext()) {
                    entry = ((Iterator<Map.Entry<?, ?>>)f).next();
                }
                else {
                    entry = null;
                }
            }
            Label_2343: {
                double n14 = 0.0;
                Label_1083: {
                    float n13 = 0.0f;
                    Label_1048: {
                        long n12 = 0L;
                        Label_1012: {
                            long n11 = 0L;
                            Label_0976: {
                                int n10 = 0;
                                Label_0940: {
                                    long n9 = 0L;
                                    Label_0904: {
                                        int n8 = 0;
                                        Label_0868: {
                                            boolean b = false;
                                            Label_0832: {
                                                Label_0790: {
                                                    Label_0752: {
                                                        Label_0717: {
                                                            int n7 = 0;
                                                            Label_0692: {
                                                                int n6 = 0;
                                                                Label_0656: {
                                                                    int n5 = 0;
                                                                    Label_0620: {
                                                                        long n4 = 0L;
                                                                        Label_0584: {
                                                                            int n3 = 0;
                                                                            Label_0548: {
                                                                                long n2 = 0L;
                                                                                Label_0512: {
                                                                                    switch (v0(w0)) {
                                                                                        default: {
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 68: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                break;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 67: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n2 = c0(o, X(w0));
                                                                                                break Label_0512;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 66: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n3 = b0(o, X(w0));
                                                                                                break Label_0548;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 65: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n4 = c0(o, X(w0));
                                                                                                break Label_0584;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 64: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n5 = b0(o, X(w0));
                                                                                                break Label_0620;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 63: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n6 = b0(o, X(w0));
                                                                                                break Label_0656;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 62: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n7 = b0(o, X(w0));
                                                                                                break Label_0692;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 61: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                break Label_0717;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 60: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                break Label_0752;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 59: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                break Label_0790;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 58: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                b = Y(o, X(w0));
                                                                                                break Label_0832;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 57: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n8 = b0(o, X(w0));
                                                                                                break Label_0868;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 56: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n9 = c0(o, X(w0));
                                                                                                break Label_0904;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 55: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n10 = b0(o, X(w0));
                                                                                                break Label_0940;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 54: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n11 = c0(o, X(w0));
                                                                                                break Label_0976;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 53: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n12 = c0(o, X(w0));
                                                                                                break Label_1012;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 52: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n13 = a0(o, X(w0));
                                                                                                break Label_1048;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 51: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n14 = Z(o, X(w0));
                                                                                                break Label_1083;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 50: {
                                                                                            this.A0(r0, w2, o0.C(o, X(w0)), n);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 49: {
                                                                                            g0.T(this.W(n), (List)o0.C(o, X(w0)), r0, this.u(n));
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 48: {
                                                                                            g0.a0(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 47: {
                                                                                            g0.Z(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 46: {
                                                                                            g0.Y(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 45: {
                                                                                            g0.X(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 44: {
                                                                                            g0.P(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 43: {
                                                                                            g0.c0(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 42: {
                                                                                            g0.M(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 41: {
                                                                                            g0.Q(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 40: {
                                                                                            g0.R(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 39: {
                                                                                            g0.U(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 38: {
                                                                                            g0.d0(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 37: {
                                                                                            g0.V(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 36: {
                                                                                            g0.S(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 35: {
                                                                                            g0.O(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 34: {
                                                                                            g0.a0(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 33: {
                                                                                            g0.Z(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 32: {
                                                                                            g0.Y(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 31: {
                                                                                            g0.X(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 30: {
                                                                                            g0.P(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 29: {
                                                                                            g0.c0(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 28: {
                                                                                            g0.N(this.W(n), (List)o0.C(o, X(w0)), r0);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 27: {
                                                                                            g0.W(this.W(n), (List)o0.C(o, X(w0)), r0, this.u(n));
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 26: {
                                                                                            g0.b0(this.W(n), (List)o0.C(o, X(w0)), r0);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 25: {
                                                                                            g0.M(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 24: {
                                                                                            g0.Q(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 23: {
                                                                                            g0.R(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 22: {
                                                                                            g0.U(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 21: {
                                                                                            g0.d0(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 20: {
                                                                                            g0.V(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 19: {
                                                                                            g0.S(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 18: {
                                                                                            g0.O(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 17: {
                                                                                            if (this.B(o, n)) {
                                                                                                break;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 16: {
                                                                                            if (this.B(o, n)) {
                                                                                                n2 = L(o, X(w0));
                                                                                                break Label_0512;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 15: {
                                                                                            if (this.B(o, n)) {
                                                                                                n3 = z(o, X(w0));
                                                                                                break Label_0548;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 14: {
                                                                                            if (this.B(o, n)) {
                                                                                                n4 = L(o, X(w0));
                                                                                                break Label_0584;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 13: {
                                                                                            if (this.B(o, n)) {
                                                                                                n5 = z(o, X(w0));
                                                                                                break Label_0620;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 12: {
                                                                                            if (this.B(o, n)) {
                                                                                                n6 = z(o, X(w0));
                                                                                                break Label_0656;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 11: {
                                                                                            if (this.B(o, n)) {
                                                                                                n7 = z(o, X(w0));
                                                                                                break Label_0692;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 10: {
                                                                                            if (this.B(o, n)) {
                                                                                                break Label_0717;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 9: {
                                                                                            if (this.B(o, n)) {
                                                                                                break Label_0752;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 8: {
                                                                                            if (this.B(o, n)) {
                                                                                                break Label_0790;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 7: {
                                                                                            if (this.B(o, n)) {
                                                                                                b = l(o, X(w0));
                                                                                                break Label_0832;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 6: {
                                                                                            if (this.B(o, n)) {
                                                                                                n8 = z(o, X(w0));
                                                                                                break Label_0868;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 5: {
                                                                                            if (this.B(o, n)) {
                                                                                                n9 = L(o, X(w0));
                                                                                                break Label_0904;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 4: {
                                                                                            if (this.B(o, n)) {
                                                                                                n10 = z(o, X(w0));
                                                                                                break Label_0940;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 3: {
                                                                                            if (this.B(o, n)) {
                                                                                                n11 = L(o, X(w0));
                                                                                                break Label_0976;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 2: {
                                                                                            if (this.B(o, n)) {
                                                                                                n12 = L(o, X(w0));
                                                                                                break Label_1012;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 1: {
                                                                                            if (this.B(o, n)) {
                                                                                                n13 = r(o, X(w0));
                                                                                                break Label_1048;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 0: {
                                                                                            if (this.B(o, n)) {
                                                                                                n14 = o(o, X(w0));
                                                                                                break Label_1083;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                    }
                                                                                    r0.O(w2, o0.C(o, X(w0)), this.u(n));
                                                                                    break Label_2343;
                                                                                }
                                                                                r0.w(w2, n2);
                                                                                break Label_2343;
                                                                            }
                                                                            r0.H(w2, n3);
                                                                            break Label_2343;
                                                                        }
                                                                        r0.n(w2, n4);
                                                                        break Label_2343;
                                                                    }
                                                                    r0.g(w2, n5);
                                                                    break Label_2343;
                                                                }
                                                                r0.D(w2, n6);
                                                                break Label_2343;
                                                            }
                                                            r0.e(w2, n7);
                                                            break Label_2343;
                                                        }
                                                        r0.M(w2, (h)o0.C(o, X(w0)));
                                                        break Label_2343;
                                                    }
                                                    r0.L(w2, o0.C(o, X(w0)), this.u(n));
                                                    break Label_2343;
                                                }
                                                this.B0(w2, o0.C(o, X(w0)), r0);
                                                break Label_2343;
                                            }
                                            r0.d(w2, b);
                                            break Label_2343;
                                        }
                                        r0.l(w2, n8);
                                        break Label_2343;
                                    }
                                    r0.u(w2, n9);
                                    break Label_2343;
                                }
                                r0.i(w2, n10);
                                break Label_2343;
                            }
                            r0.C(w2, n11);
                            break Label_2343;
                        }
                        r0.c(w2, n12);
                        break Label_2343;
                    }
                    r0.x(w2, n13);
                    break Label_2343;
                }
                r0.m(w2, n14);
            }
            n += 3;
        }
        while (entry2 != null) {
            this.p.j(r0, (Map.Entry)entry2);
            if (((Iterator)f).hasNext()) {
                entry2 = ((Iterator<Map.Entry<?, ?>>)f).next();
            }
            else {
                entry2 = null;
            }
        }
        this.C0(this.o, o, r0);
    }
    
    public final void z0(final Object o, final r0 r0) {
        this.C0(this.o, o, r0);
        Object a = null;
        Map.Entry<?, ?> entry = null;
        Label_0064: {
            if (this.f) {
                final t c = this.p.c(o);
                if (!c.d()) {
                    a = c.a();
                    entry = ((Iterator<Map.Entry<?, ?>>)a).next();
                    break Label_0064;
                }
            }
            a = (entry = null);
        }
        int n = this.a.length - 3;
        Map.Entry<?, ?> entry2;
        while (true) {
            entry2 = entry;
            if (n < 0) {
                break;
            }
            final int w0 = this.w0(n);
            final int w2 = this.W(n);
            while (entry != null && this.p.a((Map.Entry)entry) > w2) {
                this.p.j(r0, (Map.Entry)entry);
                if (((Iterator)a).hasNext()) {
                    entry = ((Iterator<Map.Entry<?, ?>>)a).next();
                }
                else {
                    entry = null;
                }
            }
            Label_2347: {
                double n14 = 0.0;
                Label_1087: {
                    float n13 = 0.0f;
                    Label_1052: {
                        long n12 = 0L;
                        Label_1016: {
                            long n11 = 0L;
                            Label_0980: {
                                int n10 = 0;
                                Label_0944: {
                                    long n9 = 0L;
                                    Label_0908: {
                                        int n8 = 0;
                                        Label_0872: {
                                            boolean b = false;
                                            Label_0836: {
                                                Label_0794: {
                                                    Label_0756: {
                                                        Label_0721: {
                                                            int n7 = 0;
                                                            Label_0696: {
                                                                int n6 = 0;
                                                                Label_0660: {
                                                                    int n5 = 0;
                                                                    Label_0624: {
                                                                        long n4 = 0L;
                                                                        Label_0588: {
                                                                            int n3 = 0;
                                                                            Label_0552: {
                                                                                long n2 = 0L;
                                                                                Label_0516: {
                                                                                    switch (v0(w0)) {
                                                                                        default: {
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 68: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                break;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 67: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n2 = c0(o, X(w0));
                                                                                                break Label_0516;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 66: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n3 = b0(o, X(w0));
                                                                                                break Label_0552;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 65: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n4 = c0(o, X(w0));
                                                                                                break Label_0588;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 64: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n5 = b0(o, X(w0));
                                                                                                break Label_0624;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 63: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n6 = b0(o, X(w0));
                                                                                                break Label_0660;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 62: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n7 = b0(o, X(w0));
                                                                                                break Label_0696;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 61: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                break Label_0721;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 60: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                break Label_0756;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 59: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                break Label_0794;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 58: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                b = Y(o, X(w0));
                                                                                                break Label_0836;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 57: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n8 = b0(o, X(w0));
                                                                                                break Label_0872;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 56: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n9 = c0(o, X(w0));
                                                                                                break Label_0908;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 55: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n10 = b0(o, X(w0));
                                                                                                break Label_0944;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 54: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n11 = c0(o, X(w0));
                                                                                                break Label_0980;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 53: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n12 = c0(o, X(w0));
                                                                                                break Label_1016;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 52: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n13 = a0(o, X(w0));
                                                                                                break Label_1052;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 51: {
                                                                                            if (this.I(o, w2, n)) {
                                                                                                n14 = Z(o, X(w0));
                                                                                                break Label_1087;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 50: {
                                                                                            this.A0(r0, w2, o0.C(o, X(w0)), n);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 49: {
                                                                                            g0.T(this.W(n), (List)o0.C(o, X(w0)), r0, this.u(n));
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 48: {
                                                                                            g0.a0(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 47: {
                                                                                            g0.Z(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 46: {
                                                                                            g0.Y(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 45: {
                                                                                            g0.X(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 44: {
                                                                                            g0.P(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 43: {
                                                                                            g0.c0(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 42: {
                                                                                            g0.M(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 41: {
                                                                                            g0.Q(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 40: {
                                                                                            g0.R(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 39: {
                                                                                            g0.U(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 38: {
                                                                                            g0.d0(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 37: {
                                                                                            g0.V(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 36: {
                                                                                            g0.S(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 35: {
                                                                                            g0.O(this.W(n), (List)o0.C(o, X(w0)), r0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 34: {
                                                                                            g0.a0(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 33: {
                                                                                            g0.Z(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 32: {
                                                                                            g0.Y(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 31: {
                                                                                            g0.X(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 30: {
                                                                                            g0.P(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 29: {
                                                                                            g0.c0(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 28: {
                                                                                            g0.N(this.W(n), (List)o0.C(o, X(w0)), r0);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 27: {
                                                                                            g0.W(this.W(n), (List)o0.C(o, X(w0)), r0, this.u(n));
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 26: {
                                                                                            g0.b0(this.W(n), (List)o0.C(o, X(w0)), r0);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 25: {
                                                                                            g0.M(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 24: {
                                                                                            g0.Q(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 23: {
                                                                                            g0.R(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 22: {
                                                                                            g0.U(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 21: {
                                                                                            g0.d0(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 20: {
                                                                                            g0.V(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 19: {
                                                                                            g0.S(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 18: {
                                                                                            g0.O(this.W(n), (List)o0.C(o, X(w0)), r0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 17: {
                                                                                            if (this.B(o, n)) {
                                                                                                break;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 16: {
                                                                                            if (this.B(o, n)) {
                                                                                                n2 = L(o, X(w0));
                                                                                                break Label_0516;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 15: {
                                                                                            if (this.B(o, n)) {
                                                                                                n3 = z(o, X(w0));
                                                                                                break Label_0552;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 14: {
                                                                                            if (this.B(o, n)) {
                                                                                                n4 = L(o, X(w0));
                                                                                                break Label_0588;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 13: {
                                                                                            if (this.B(o, n)) {
                                                                                                n5 = z(o, X(w0));
                                                                                                break Label_0624;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 12: {
                                                                                            if (this.B(o, n)) {
                                                                                                n6 = z(o, X(w0));
                                                                                                break Label_0660;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 11: {
                                                                                            if (this.B(o, n)) {
                                                                                                n7 = z(o, X(w0));
                                                                                                break Label_0696;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 10: {
                                                                                            if (this.B(o, n)) {
                                                                                                break Label_0721;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 9: {
                                                                                            if (this.B(o, n)) {
                                                                                                break Label_0756;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 8: {
                                                                                            if (this.B(o, n)) {
                                                                                                break Label_0794;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 7: {
                                                                                            if (this.B(o, n)) {
                                                                                                b = l(o, X(w0));
                                                                                                break Label_0836;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 6: {
                                                                                            if (this.B(o, n)) {
                                                                                                n8 = z(o, X(w0));
                                                                                                break Label_0872;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 5: {
                                                                                            if (this.B(o, n)) {
                                                                                                n9 = L(o, X(w0));
                                                                                                break Label_0908;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 4: {
                                                                                            if (this.B(o, n)) {
                                                                                                n10 = z(o, X(w0));
                                                                                                break Label_0944;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 3: {
                                                                                            if (this.B(o, n)) {
                                                                                                n11 = L(o, X(w0));
                                                                                                break Label_0980;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 2: {
                                                                                            if (this.B(o, n)) {
                                                                                                n12 = L(o, X(w0));
                                                                                                break Label_1016;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 1: {
                                                                                            if (this.B(o, n)) {
                                                                                                n13 = r(o, X(w0));
                                                                                                break Label_1052;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 0: {
                                                                                            if (this.B(o, n)) {
                                                                                                n14 = o(o, X(w0));
                                                                                                break Label_1087;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                    }
                                                                                    r0.O(w2, o0.C(o, X(w0)), this.u(n));
                                                                                    break Label_2347;
                                                                                }
                                                                                r0.w(w2, n2);
                                                                                break Label_2347;
                                                                            }
                                                                            r0.H(w2, n3);
                                                                            break Label_2347;
                                                                        }
                                                                        r0.n(w2, n4);
                                                                        break Label_2347;
                                                                    }
                                                                    r0.g(w2, n5);
                                                                    break Label_2347;
                                                                }
                                                                r0.D(w2, n6);
                                                                break Label_2347;
                                                            }
                                                            r0.e(w2, n7);
                                                            break Label_2347;
                                                        }
                                                        r0.M(w2, (h)o0.C(o, X(w0)));
                                                        break Label_2347;
                                                    }
                                                    r0.L(w2, o0.C(o, X(w0)), this.u(n));
                                                    break Label_2347;
                                                }
                                                this.B0(w2, o0.C(o, X(w0)), r0);
                                                break Label_2347;
                                            }
                                            r0.d(w2, b);
                                            break Label_2347;
                                        }
                                        r0.l(w2, n8);
                                        break Label_2347;
                                    }
                                    r0.u(w2, n9);
                                    break Label_2347;
                                }
                                r0.i(w2, n10);
                                break Label_2347;
                            }
                            r0.C(w2, n11);
                            break Label_2347;
                        }
                        r0.c(w2, n12);
                        break Label_2347;
                    }
                    r0.x(w2, n13);
                    break Label_2347;
                }
                r0.m(w2, n14);
            }
            n -= 3;
        }
        while (entry2 != null) {
            this.p.j(r0, (Map.Entry)entry2);
            if (((Iterator)a).hasNext()) {
                entry2 = ((Iterator<Map.Entry<?, ?>>)a).next();
            }
            else {
                entry2 = null;
            }
        }
    }
}
