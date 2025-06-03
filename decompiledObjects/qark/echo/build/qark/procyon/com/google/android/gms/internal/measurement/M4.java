// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import android.support.v4.media.a;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class M4 implements Z4
{
    public static final int[] r;
    public static final Unsafe s;
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
    
    static {
        r = new int[0];
        s = D5.p();
    }
    
    public M4(final int[] a, final Object[] b, final int c, final int d, final I4 e, final V4 h, final boolean b2, final int[] j, final int k, final int l, final P4 m, final q4 n, final x5 o, final O3 p15, final F4 q) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = (e instanceof Y3);
        this.h = h;
        this.f = (p15 != null && p15.d(e));
        this.i = false;
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
    
    public static boolean A(final Object o, final int n, final Z4 z4) {
        return z4.c(D5.B(o, n & 0xFFFFF));
    }
    
    public static float B(final Object o, final long n) {
        return (float)D5.B(o, n);
    }
    
    public static int H(final Object o, final long n) {
        return (int)D5.B(o, n);
    }
    
    public static long L(final Object o, final long n) {
        return (long)D5.B(o, n);
    }
    
    public static v5 O(final Object o) {
        final Y3 y3 = (Y3)o;
        v5 zzb;
        if ((zzb = y3.zzb) == v5.k()) {
            zzb = v5.l();
            y3.zzb = zzb;
        }
        return zzb;
    }
    
    public static boolean P(final Object o, final long n) {
        return (boolean)D5.B(o, n);
    }
    
    public static void R(final Object obj) {
        if (T(obj)) {
            return;
        }
        final String value = String.valueOf(obj);
        final StringBuilder sb = new StringBuilder("Mutating immutable message: ");
        sb.append(value);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static boolean S(final int n) {
        return (n & 0x20000000) != 0x0;
    }
    
    public static boolean T(final Object o) {
        return o != null && (!(o instanceof Y3) || ((Y3)o).F());
    }
    
    public static double j(final Object o, final long n) {
        return (double)D5.B(o, n);
    }
    
    public static M4 n(final Class clazz, final G4 g4, final P4 p7, final q4 q4, final x5 x5, final O3 o3, final F4 f4) {
        if (g4 instanceof W4) {
            final W4 w4 = (W4)g4;
            final String d = w4.d();
            final int length = d.length();
            int index2;
            if (d.charAt(0) >= '\ud800') {
                int index = 1;
                while (true) {
                    final int n = index2 = index + 1;
                    if (d.charAt(index) < '\ud800') {
                        break;
                    }
                    index = n;
                }
            }
            else {
                index2 = 1;
            }
            final int n2 = index2 + 1;
            final char char1 = d.charAt(index2);
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
                    char2 = d.charAt(index3);
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
            int char3;
            int n9;
            int n8;
            int n11;
            int n10;
            int n13;
            int n12;
            if (n4 == 0) {
                r = M4.r;
                char3 = 0;
                n8 = (n9 = char3);
                n10 = (n11 = n9);
                n12 = (n13 = n11);
            }
            else {
                final int n14 = n3 + 1;
                int char4;
                final char c = (char)(char4 = d.charAt(n3));
                int index4 = n14;
                if (c >= '\ud800') {
                    int n15 = c & '\u1fff';
                    int n16 = 13;
                    int index5 = n14;
                    int n17;
                    char char5;
                    while (true) {
                        n17 = index5 + 1;
                        char5 = d.charAt(index5);
                        if (char5 < '\ud800') {
                            break;
                        }
                        n15 |= (char5 & '\u1fff') << n16;
                        n16 += 13;
                        index5 = n17;
                    }
                    char4 = (n15 | char5 << n16);
                    index4 = n17;
                }
                final int n18 = index4 + 1;
                int char6;
                final char c2 = (char)(char6 = d.charAt(index4));
                int index6 = n18;
                if (c2 >= '\ud800') {
                    int n19 = c2 & '\u1fff';
                    int n20 = 13;
                    int index7 = n18;
                    int n21;
                    char char7;
                    while (true) {
                        n21 = index7 + 1;
                        char7 = d.charAt(index7);
                        if (char7 < '\ud800') {
                            break;
                        }
                        n19 |= (char7 & '\u1fff') << n20;
                        n20 += 13;
                        index7 = n21;
                    }
                    char6 = (n19 | char7 << n20);
                    index6 = n21;
                }
                final int n22 = index6 + 1;
                int char8;
                final char c3 = (char)(char8 = d.charAt(index6));
                int index8 = n22;
                if (c3 >= '\ud800') {
                    int n23 = c3 & '\u1fff';
                    int n24 = 13;
                    int index9 = n22;
                    int n25;
                    char char9;
                    while (true) {
                        n25 = index9 + 1;
                        char9 = d.charAt(index9);
                        if (char9 < '\ud800') {
                            break;
                        }
                        n23 |= (char9 & '\u1fff') << n24;
                        n24 += 13;
                        index9 = n25;
                    }
                    char8 = (n23 | char9 << n24);
                    index8 = n25;
                }
                final int n26 = index8 + 1;
                int char10;
                final char c4 = (char)(char10 = d.charAt(index8));
                int index10 = n26;
                if (c4 >= '\ud800') {
                    int n27 = c4 & '\u1fff';
                    int n28 = 13;
                    int index11 = n26;
                    int n29;
                    char char11;
                    while (true) {
                        n29 = index11 + 1;
                        char11 = d.charAt(index11);
                        if (char11 < '\ud800') {
                            break;
                        }
                        n27 |= (char11 & '\u1fff') << n28;
                        n28 += 13;
                        index11 = n29;
                    }
                    char10 = (n27 | char11 << n28);
                    index10 = n29;
                }
                final int n30 = index10 + 1;
                final char c5 = (char)(char3 = d.charAt(index10));
                int index12 = n30;
                if (c5 >= '\ud800') {
                    int n31 = c5 & '\u1fff';
                    int n32 = 13;
                    int index13 = n30;
                    int n33;
                    char char12;
                    while (true) {
                        n33 = index13 + 1;
                        char12 = d.charAt(index13);
                        if (char12 < '\ud800') {
                            break;
                        }
                        n31 |= (char12 & '\u1fff') << n32;
                        n32 += 13;
                        index13 = n33;
                    }
                    char3 = (n31 | char12 << n32);
                    index12 = n33;
                }
                final int n34 = index12 + 1;
                int char13;
                final char c6 = (char)(char13 = d.charAt(index12));
                int index14 = n34;
                if (c6 >= '\ud800') {
                    int n35 = c6 & '\u1fff';
                    int n36 = 13;
                    int index15 = n34;
                    int n37;
                    char char14;
                    while (true) {
                        n37 = index15 + 1;
                        char14 = d.charAt(index15);
                        if (char14 < '\ud800') {
                            break;
                        }
                        n35 |= (char14 & '\u1fff') << n36;
                        n36 += 13;
                        index15 = n37;
                    }
                    char13 = (n35 | char14 << n36);
                    index14 = n37;
                }
                final int n38 = index14 + 1;
                int char15;
                final char c7 = (char)(char15 = d.charAt(index14));
                int index16 = n38;
                if (c7 >= '\ud800') {
                    int n39 = c7 & '\u1fff';
                    int n40 = 13;
                    int index17 = n38;
                    int n41;
                    char char16;
                    while (true) {
                        n41 = index17 + 1;
                        char16 = d.charAt(index17);
                        if (char16 < '\ud800') {
                            break;
                        }
                        n39 |= (char16 & '\u1fff') << n40;
                        n40 += 13;
                        index17 = n41;
                    }
                    char15 = (n39 | char16 << n40);
                    index16 = n41;
                }
                final int n42 = index16 + 1;
                int char17;
                final char c8 = (char)(char17 = d.charAt(index16));
                int n43 = n42;
                if (c8 >= '\ud800') {
                    final int n44 = c8 & '\u1fff';
                    int n45 = 13;
                    int index18 = n42;
                    int n46 = n44;
                    int n47;
                    char char18;
                    while (true) {
                        n47 = index18 + 1;
                        char18 = d.charAt(index18);
                        if (char18 < '\ud800') {
                            break;
                        }
                        n46 |= (char18 & '\u1fff') << n45;
                        n45 += 13;
                        index18 = n47;
                    }
                    final int n48 = n46 | char18 << n45;
                    n43 = n47;
                    char17 = n48;
                }
                r = new int[char17 + char13 + char15];
                n11 = (char4 << 1) + char6;
                final int n49 = n43;
                n12 = char17;
                n10 = char10;
                n9 = char8;
                n8 = char13;
                n13 = char4;
                n3 = n49;
            }
            final Unsafe s = M4.s;
            final Object[] e = w4.e();
            final Class<? extends I4> class1 = w4.a().getClass();
            final int[] array = new int[char3 * 3];
            final Object[] array2 = new Object[char3 << 1];
            final int n50 = n12 + n8;
            int n51 = n12;
            int n52 = n50;
            final boolean b = false;
            int n53 = 0;
            int n54 = n11;
            final int n55 = n10;
            final int n56 = n9;
            int n57 = b ? 1 : 0;
            final int n58 = n13;
            while (true) {
                final int n59 = n57;
                if (n3 >= length) {
                    break;
                }
                final int n60 = n3 + 1;
                int char19 = d.charAt(n3);
                int index20;
                if (char19 >= 55296) {
                    int n61 = char19 & 0x1FFF;
                    int n62 = 13;
                    int index19 = n60;
                    int n63;
                    char char20;
                    while (true) {
                        n63 = index19 + 1;
                        char20 = d.charAt(index19);
                        if (char20 < '\ud800') {
                            break;
                        }
                        n61 |= (char20 & '\u1fff') << n62;
                        n62 += 13;
                        index19 = n63;
                    }
                    char19 = (n61 | char20 << n62);
                    index20 = n63;
                }
                else {
                    index20 = n60;
                }
                int index21 = index20 + 1;
                int char21 = d.charAt(index20);
                int n67;
                if (char21 >= 55296) {
                    int n64 = char21 & 0x1FFF;
                    int n65 = 13;
                    int n66;
                    char char22;
                    while (true) {
                        n66 = index21 + 1;
                        char22 = d.charAt(index21);
                        if (char22 < '\ud800') {
                            break;
                        }
                        n64 |= (char22 & '\u1fff') << n65;
                        n65 += 13;
                        index21 = n66;
                    }
                    char21 = (n64 | char22 << n65);
                    n67 = n66;
                }
                else {
                    n67 = index21;
                }
                final int n68 = char21 & 0xFF;
                int n69 = n53;
                if ((char21 & 0x400) != 0x0) {
                    r[n53] = n59;
                    n69 = n53 + 1;
                }
                int n81;
                int n83;
                int n85;
                int n86;
                int n87;
                int n88 = 0;
                if (n68 >= 51) {
                    final int n70 = n67 + 1;
                    final char char23 = d.charAt(n67);
                    int n71 = n70;
                    int n72;
                    if ((n72 = char23) >= 55296) {
                        int n73 = char23 & '\u1fff';
                        int n74 = 13;
                        int index22 = n70;
                        int n75;
                        char char24;
                        while (true) {
                            n75 = index22 + 1;
                            char24 = d.charAt(index22);
                            if (char24 < '\ud800') {
                                break;
                            }
                            n73 |= (char24 & '\u1fff') << n74;
                            n74 += 13;
                            index22 = n75;
                        }
                        n72 = (n73 | char24 << n74);
                        n71 = n75;
                    }
                    final int n76 = n68 - 51;
                    Label_1707: {
                        int n78;
                        if (n76 == 9 || n76 == 17) {
                            final int n77 = n59 / 3;
                            n78 = n54 + 1;
                            array2[(n77 << 1) + 1] = e[n54];
                        }
                        else {
                            if (n76 != 12 || (!w4.b().equals(V4.o) && (char21 & 0x800) == 0x0)) {
                                break Label_1707;
                            }
                            final int n79 = n59 / 3;
                            n78 = n54 + 1;
                            array2[(n79 << 1) + 1] = e[n54];
                        }
                        n54 = n78;
                    }
                    final int n80 = n72 << 1;
                    final Object o4 = e[n80];
                    Field s2;
                    if (o4 instanceof Field) {
                        s2 = (Field)o4;
                    }
                    else {
                        s2 = s(class1, (String)o4);
                        e[n80] = s2;
                    }
                    n81 = (int)s.objectFieldOffset(s2);
                    final int n82 = n80 + 1;
                    final Object o5 = e[n82];
                    Field s3;
                    if (o5 instanceof Field) {
                        s3 = (Field)o5;
                    }
                    else {
                        s3 = s(class1, (String)o5);
                        e[n82] = s3;
                    }
                    n83 = (int)s.objectFieldOffset(s3);
                    final int n84 = n54;
                    n85 = 0;
                    n86 = n71;
                    n87 = n51;
                    n88 = n84;
                }
                else {
                    final int n89 = n54 + 1;
                    final Field s4 = s(class1, (String)e[n54]);
                    int n90 = 0;
                    Label_2145: {
                        if (n68 == 9 || n68 == 17) {
                            array2[(n59 / 3 << 1) + 1] = s4.getType();
                            n90 = n51;
                            n88 = n89;
                        }
                        else {
                            if (n68 == 27 || n68 == 49) {
                                final int n91 = n59 / 3;
                                n88 = n54 + 2;
                                array2[(n91 << 1) + 1] = e[n89];
                            }
                            else {
                                if (n68 != 12 && n68 != 30 && n68 != 44) {
                                    n88 = n89;
                                    n90 = n51;
                                    if (n68 == 50) {
                                        final int n92 = n51 + 1;
                                        r[n51] = n59;
                                        final int n93 = n59 / 3 << 1;
                                        final int n94 = n54 + 2;
                                        array2[n93] = e[n89];
                                        if ((char21 & 0x800) != 0x0) {
                                            final int n95 = n54 + 3;
                                            array2[n93 + 1] = e[n94];
                                            n90 = n92;
                                            n88 = n95;
                                        }
                                        else {
                                            n90 = n92;
                                            n88 = n94;
                                        }
                                    }
                                    break Label_2145;
                                }
                                if (w4.b() != V4.o) {
                                    n88 = n89;
                                    n90 = n51;
                                    if ((char21 & 0x800) == 0x0) {
                                        break Label_2145;
                                    }
                                }
                                final int n96 = n59 / 3;
                                n88 = n54 + 2;
                                array2[(n96 << 1) + 1] = e[n89];
                            }
                            n90 = n51;
                        }
                    }
                    n81 = (int)s.objectFieldOffset(s4);
                    int n98;
                    int n103;
                    int n104;
                    if ((char21 & 0x1000) != 0x0 && n68 <= 17) {
                        final int n97 = n67 + 1;
                        int char25;
                        final char c9 = (char)(char25 = d.charAt(n67));
                        n98 = n97;
                        if (c9 >= '\ud800') {
                            int n99 = c9 & '\u1fff';
                            int n100 = 13;
                            int index23 = n97;
                            int n101;
                            char char26;
                            while (true) {
                                n101 = index23 + 1;
                                char26 = d.charAt(index23);
                                if (char26 < '\ud800') {
                                    break;
                                }
                                n99 |= (char26 & '\u1fff') << n100;
                                n100 += 13;
                                index23 = n101;
                            }
                            char25 = (n99 | char26 << n100);
                            n98 = n101;
                        }
                        final int n102 = (n58 << 1) + char25 / 32;
                        final Object o6 = e[n102];
                        Field s5;
                        if (o6 instanceof Field) {
                            s5 = (Field)o6;
                        }
                        else {
                            s5 = s(class1, (String)o6);
                            e[n102] = s5;
                        }
                        n103 = (int)s.objectFieldOffset(s5);
                        n104 = char25 % 32;
                    }
                    else {
                        n103 = 1048575;
                        n98 = n67;
                        n104 = 0;
                    }
                    int n105 = n52;
                    if (n68 >= 18) {
                        n105 = n52;
                        if (n68 <= 49) {
                            r[n52] = n81;
                            n105 = n52 + 1;
                        }
                    }
                    final int n106 = n104;
                    n52 = n105;
                    n87 = n90;
                    n86 = n98;
                    n83 = n103;
                    n85 = n106;
                }
                array[n59] = char19;
                int n107;
                if ((char21 & 0x200) != 0x0) {
                    n107 = 536870912;
                }
                else {
                    n107 = 0;
                }
                int n108;
                if ((char21 & 0x100) != 0x0) {
                    n108 = 268435456;
                }
                else {
                    n108 = 0;
                }
                int n109;
                if ((char21 & 0x800) != 0x0) {
                    n109 = Integer.MIN_VALUE;
                }
                else {
                    n109 = 0;
                }
                array[n59 + 1] = (n68 << 20 | (n108 | n107 | n109) | n81);
                final int n110 = n59 + 3;
                array[n59 + 2] = (n85 << 20 | n83);
                n54 = n88;
                n3 = n86;
                n57 = n110;
                n53 = n69;
                n51 = n87;
            }
            return new M4(array, array2, n56, n55, w4.a(), w4.b(), false, r, n12, n50, p7, q4, x5, o3, f4);
        }
        a.a(g4);
        throw new NoSuchMethodError();
    }
    
    public static Field s(Class name, final String s) {
        while (true) {
            try {
                return ((Class)name).getDeclaredField(s);
                Label_0055: {
                    name = ((Class)name).getName();
                }
                final Field[] declaredFields;
                final String string = Arrays.toString(declaredFields);
                final StringBuilder sb = new StringBuilder("Field ");
                sb.append(s);
                sb.append(" for ");
                sb.append(name);
                sb.append(" not found. Known fields are ");
                sb.append(string);
                throw new RuntimeException(sb.toString());
                declaredFields = ((Class)name).getDeclaredFields();
                final int length = declaredFields.length;
                int n = 0;
                while (true) {
                    return declaredFields[n];
                    Label_0048:
                    ++n;
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
    
    public static void t(final int n, final Object o, final T5 t5) {
        if (o instanceof String) {
            t5.E(n, (String)o);
            return;
        }
        t5.f(n, (q3)o);
    }
    
    public static void u(final x5 x5, final Object o, final T5 t5) {
        x5.g(x5.k(o), t5);
    }
    
    public final int C(final int n) {
        return this.a[n + 2];
    }
    
    public final void D(final Object o, int c) {
        c = this.C(c);
        final long n = 0xFFFFF & c;
        if (n == 1048575L) {
            return;
        }
        D5.h(o, n, 1 << (c >>> 20) | D5.t(o, n));
    }
    
    public final void E(final Object o, final int n, final int n2) {
        D5.h(o, this.C(n2) & 0xFFFFF, n);
    }
    
    public final void F(final Object o, Object o2, int i) {
        final int n = this.a[i];
        if (!this.J(o2, n, i)) {
            return;
        }
        final long offset = this.G(i) & 0xFFFFF;
        final Unsafe s = M4.s;
        final Object object = s.getObject(o2, offset);
        if (object == null) {
            i = this.a[i];
            final String value = String.valueOf(o2);
            final StringBuilder sb = new StringBuilder("Source subfield ");
            sb.append(i);
            sb.append(" is present but null: ");
            sb.append(value);
            throw new IllegalStateException(sb.toString());
        }
        final Z4 n2 = this.N(i);
        if (!this.J(o, n, i)) {
            if (!T(object)) {
                s.putObject(o, offset, object);
            }
            else {
                o2 = n2.a();
                n2.d(o2, object);
                s.putObject(o, offset, o2);
            }
            this.E(o, n, i);
            return;
        }
        final Object o3 = o2 = s.getObject(o, offset);
        if (!T(o3)) {
            o2 = n2.a();
            n2.d(o2, o3);
            s.putObject(o, offset, o2);
        }
        n2.d(o2, object);
    }
    
    public final int G(final int n) {
        return this.a[n + 1];
    }
    
    public final boolean I(Object b, int g) {
        final int c = this.C(g);
        final long n = c & 0xFFFFF;
        if (n != 1048575L) {
            return (D5.t(b, n) & 1 << (c >>> 20)) != 0x0;
        }
        g = this.G(g);
        final long n2 = g & 0xFFFFF;
        switch ((g & 0xFF00000) >>> 20) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                return D5.B(b, n2) != null;
            }
            case 16: {
                return D5.x(b, n2) != 0L;
            }
            case 15: {
                return D5.t(b, n2) != 0;
            }
            case 14: {
                return D5.x(b, n2) != 0L;
            }
            case 13: {
                return D5.t(b, n2) != 0;
            }
            case 12: {
                return D5.t(b, n2) != 0;
            }
            case 11: {
                return D5.t(b, n2) != 0;
            }
            case 10: {
                return !q3.p.equals(D5.B(b, n2));
            }
            case 9: {
                return D5.B(b, n2) != null;
            }
            case 8: {
                b = D5.B(b, n2);
                if (b instanceof String) {
                    return !((String)b).isEmpty();
                }
                if (b instanceof q3) {
                    return !q3.p.equals(b);
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return D5.F(b, n2);
            }
            case 6: {
                return D5.t(b, n2) != 0;
            }
            case 5: {
                return D5.x(b, n2) != 0L;
            }
            case 4: {
                return D5.t(b, n2) != 0;
            }
            case 3: {
                return D5.x(b, n2) != 0L;
            }
            case 2: {
                return D5.x(b, n2) != 0L;
            }
            case 1: {
                return Float.floatToRawIntBits(D5.n(b, n2)) != 0;
            }
            case 0: {
                return Double.doubleToRawLongBits(D5.a(b, n2)) != 0L;
            }
        }
    }
    
    public final boolean J(final Object o, final int n, final int n2) {
        return D5.t(o, this.C(n2) & 0xFFFFF) == n;
    }
    
    public final boolean K(final Object o, final Object o2, final int n) {
        return this.I(o, n) == this.I(o2, n);
    }
    
    public final g4 M(final int n) {
        return (g4)this.b[(n / 3 << 1) + 1];
    }
    
    public final Z4 N(int n) {
        n = n / 3 << 1;
        final Z4 z4 = (Z4)this.b[n];
        if (z4 != null) {
            return z4;
        }
        return (Z4)(this.b[n] = U4.a().b((Class)this.b[n + 1]));
    }
    
    public final Object Q(final int n) {
        return this.b[n / 3 << 1];
    }
    
    @Override
    public final Object a() {
        return this.m.b(this.e);
    }
    
    @Override
    public final int b(final Object o) {
        final Unsafe s = M4.s;
        int n = 1048575;
        int int1 = 0;
        int i = 0;
        int n2 = 0;
    Label_0725_Outer:
        while (i < this.a.length) {
            final int g = this.G(i);
            final int n3 = (0xFF00000 & g) >>> 20;
            final int[] a = this.a;
            final int n4 = a[i];
            final int n5 = a[i + 2];
            final int n6 = n5 & 0xFFFFF;
            int n8;
            int n9;
            if (n3 <= 17) {
                int n7;
                if (n6 != (n7 = n)) {
                    if (n6 == 1048575) {
                        int1 = 0;
                    }
                    else {
                        int1 = s.getInt(o, n6);
                    }
                    n7 = n6;
                }
                n8 = 1 << (n5 >>> 20);
                n9 = n7;
            }
            else {
                n8 = 0;
                n9 = n;
            }
            final long offset = g & 0xFFFFF;
            if (n3 >= T3.c0.a()) {
                T3.p0.a();
            }
            int n20 = 0;
            Label_2398: {
                int n19 = 0;
                Label_2194: {
                    int n18 = 0;
                Label_0628:
                    while (true) {
                        int n17 = 0;
                    Label_0504:
                        while (true) {
                            Label_0854: {
                                Object o6 = null;
                            Label_0725:
                                while (true) {
                                    Label_0822: {
                                        Object o4 = null;
                                        Label_0764: {
                                            int n14 = 0;
                                            Label_0690: {
                                                int n13 = 0;
                                            Label_0658:
                                                while (true) {
                                                    Label_0621: {
                                                        Label_0596: {
                                                            int n12 = 0;
                                                            Label_0571: {
                                                                long n11 = 0L;
                                                                Label_0538: {
                                                                    Object o2 = null;
                                                                    switch (n3) {
                                                                        default: {
                                                                            final int n10 = n2;
                                                                            break Label_0509;
                                                                        }
                                                                        case 68: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                o2 = s.getObject(o, offset);
                                                                                break;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 67: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                n11 = L(o, offset);
                                                                                break Label_0538;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 66: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                n12 = H(o, offset);
                                                                                break Label_0571;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 65: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                break Label_0596;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 64: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                break Label_0621;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 63: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                n13 = H(o, offset);
                                                                                break Label_0658;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 62: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                n14 = H(o, offset);
                                                                                break Label_0690;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 61: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                final Object o3 = s.getObject(o, offset);
                                                                                break Label_0725;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 60: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                o4 = s.getObject(o, offset);
                                                                                break Label_0764;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 59: {
                                                                            final int n10 = n2;
                                                                            if (!this.J(o, n4, i)) {
                                                                                break Label_0509;
                                                                            }
                                                                            final Object o5 = o6 = s.getObject(o, offset);
                                                                            if (o5 instanceof q3) {
                                                                                final Object o3 = o5;
                                                                                break Label_0822;
                                                                            }
                                                                            break Label_0725;
                                                                        }
                                                                        case 58: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                break Label_0854;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 57: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                final int n15 = J3.h0(n4, 0);
                                                                                break Label_0628;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 56: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                final int n16 = J3.P(n4, 0L);
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 55: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                final int n16 = J3.l0(n4, H(o, offset));
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 54: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                final int n16 = J3.m0(n4, L(o, offset));
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 53: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                final int n16 = J3.Y(n4, L(o, offset));
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 52: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                final int n16 = J3.f(n4, 0.0f);
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 51: {
                                                                            final int n10 = n2;
                                                                            if (this.J(o, n4, i)) {
                                                                                final int n16 = J3.e(n4, 0.0);
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 50: {
                                                                            final int n16 = this.q.i(n4, s.getObject(o, offset), this.Q(i));
                                                                            break Label_0504;
                                                                        }
                                                                        case 49: {
                                                                            final int n16 = a5.c(n4, (List)s.getObject(o, offset), this.N(i));
                                                                            break Label_0504;
                                                                        }
                                                                        case 48: {
                                                                            final int r = a5.R((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (r > 0) {
                                                                                n17 = r;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 47: {
                                                                            final int o7 = a5.O((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (o7 > 0) {
                                                                                n17 = o7;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 46: {
                                                                            final int d = a5.D((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (d > 0) {
                                                                                n17 = d;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 45: {
                                                                            final int z = a5.z((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (z > 0) {
                                                                                n17 = z;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 44: {
                                                                            final int t = a5.t((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (t > 0) {
                                                                                n17 = t;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 43: {
                                                                            final int u = a5.U((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (u > 0) {
                                                                                n17 = u;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 42: {
                                                                            final int e = a5.e((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (e > 0) {
                                                                                n17 = e;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 41: {
                                                                            final int z2 = a5.z((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (z2 > 0) {
                                                                                n17 = z2;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 40: {
                                                                            final int d2 = a5.D((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (d2 > 0) {
                                                                                n17 = d2;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 39: {
                                                                            final int h = a5.H((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (h > 0) {
                                                                                n17 = h;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 38: {
                                                                            final int x = a5.X((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (x > 0) {
                                                                                n17 = x;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 37: {
                                                                            final int l = a5.L((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (l > 0) {
                                                                                n17 = l;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 36: {
                                                                            final int z3 = a5.z((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (z3 > 0) {
                                                                                n17 = z3;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 35: {
                                                                            final int d3 = a5.D((List)s.getObject(o, offset));
                                                                            final int n10 = n2;
                                                                            if (d3 > 0) {
                                                                                n17 = d3;
                                                                                break Label_0504;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 34: {
                                                                            n18 = a5.Q(n4, (List)s.getObject(o, offset), false);
                                                                            break Label_0628;
                                                                        }
                                                                        case 33: {
                                                                            n18 = a5.N(n4, (List)s.getObject(o, offset), false);
                                                                            break Label_0628;
                                                                        }
                                                                        case 23:
                                                                        case 32: {
                                                                            n18 = a5.C(n4, (List)s.getObject(o, offset), false);
                                                                            break Label_0628;
                                                                        }
                                                                        case 19:
                                                                        case 24:
                                                                        case 31: {
                                                                            n18 = a5.y(n4, (List)s.getObject(o, offset), false);
                                                                            break Label_0628;
                                                                        }
                                                                        case 30: {
                                                                            n18 = a5.s(n4, (List)s.getObject(o, offset), false);
                                                                            break Label_0628;
                                                                        }
                                                                        case 29: {
                                                                            final int n16 = a5.T(n4, (List)s.getObject(o, offset), false);
                                                                            break Label_0504;
                                                                        }
                                                                        case 28: {
                                                                            final int n16 = a5.b(n4, (List)s.getObject(o, offset));
                                                                            break Label_0504;
                                                                        }
                                                                        case 27: {
                                                                            final int n16 = a5.r(n4, (List)s.getObject(o, offset), this.N(i));
                                                                            break Label_0504;
                                                                        }
                                                                        case 26: {
                                                                            final int n16 = a5.q(n4, (List)s.getObject(o, offset));
                                                                            break Label_0504;
                                                                        }
                                                                        case 25: {
                                                                            n18 = a5.d(n4, (List)s.getObject(o, offset), false);
                                                                            break Label_0628;
                                                                        }
                                                                        case 22: {
                                                                            n18 = a5.G(n4, (List)s.getObject(o, offset), false);
                                                                            break Label_0628;
                                                                        }
                                                                        case 21: {
                                                                            n18 = a5.W(n4, (List)s.getObject(o, offset), false);
                                                                            break Label_0628;
                                                                        }
                                                                        case 20: {
                                                                            n18 = a5.K(n4, (List)s.getObject(o, offset), false);
                                                                            break Label_0628;
                                                                        }
                                                                        case 18: {
                                                                            final int n16 = a5.C(n4, (List)s.getObject(o, offset), false);
                                                                            break Label_0504;
                                                                        }
                                                                        case 17: {
                                                                            final int n10 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                o2 = s.getObject(o, offset);
                                                                                break;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 16: {
                                                                            final int n10 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                n11 = s.getLong(o, offset);
                                                                                break Label_0538;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 15: {
                                                                            final int n10 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                n12 = s.getInt(o, offset);
                                                                                break Label_0571;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 14: {
                                                                            final int n10 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                break Label_0596;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 13: {
                                                                            final int n10 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                break Label_0621;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 12: {
                                                                            final int n10 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                n13 = s.getInt(o, offset);
                                                                                break Label_0658;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 11: {
                                                                            final int n10 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                n14 = s.getInt(o, offset);
                                                                                break Label_0690;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 10: {
                                                                            final int n10 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                final Object o3 = s.getObject(o, offset);
                                                                                break Label_0725;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 9: {
                                                                            final int n10 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                o4 = s.getObject(o, offset);
                                                                                break Label_0764;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 8: {
                                                                            final int n10 = n2;
                                                                            if (!this.z(o, i, n9, int1, n8)) {
                                                                                break Label_0509;
                                                                            }
                                                                            final Object o8 = o6 = s.getObject(o, offset);
                                                                            if (o8 instanceof q3) {
                                                                                final Object o3 = o8;
                                                                                break Label_0822;
                                                                            }
                                                                            break Label_0725;
                                                                        }
                                                                        case 7: {
                                                                            final int n10 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                break Label_0854;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 6: {
                                                                            final int n10 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                n19 = J3.h0(n4, 0);
                                                                                break Label_2194;
                                                                            }
                                                                            break Label_0509;
                                                                        }
                                                                        case 5: {
                                                                            n20 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                n19 = J3.P(n4, 0L);
                                                                                break Label_2194;
                                                                            }
                                                                            break Label_2398;
                                                                        }
                                                                        case 4: {
                                                                            n20 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                n19 = J3.l0(n4, s.getInt(o, offset));
                                                                                break Label_2194;
                                                                            }
                                                                            break Label_2398;
                                                                        }
                                                                        case 3: {
                                                                            n20 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                n19 = J3.m0(n4, s.getLong(o, offset));
                                                                                break Label_2194;
                                                                            }
                                                                            break Label_2398;
                                                                        }
                                                                        case 2: {
                                                                            n20 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                n19 = J3.Y(n4, s.getLong(o, offset));
                                                                                break Label_2194;
                                                                            }
                                                                            break Label_2398;
                                                                        }
                                                                        case 1: {
                                                                            n20 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                n19 = J3.f(n4, 0.0f);
                                                                                break Label_2194;
                                                                            }
                                                                            break Label_2398;
                                                                        }
                                                                        case 0: {
                                                                            n20 = n2;
                                                                            if (this.z(o, i, n9, int1, n8)) {
                                                                                n19 = J3.e(n4, 0.0);
                                                                                break Label_2194;
                                                                            }
                                                                            break Label_2398;
                                                                        }
                                                                    }
                                                                    final int n16 = J3.x(n4, (I4)o2, this.N(i));
                                                                    final int n10 = n2 + n16;
                                                                    n20 = n10;
                                                                    break Label_2398;
                                                                }
                                                                final int n16 = J3.i0(n4, n11);
                                                                continue Label_0504;
                                                            }
                                                            final int n16 = J3.t0(n4, n12);
                                                            continue Label_0504;
                                                        }
                                                        final int n16 = J3.e0(n4, 0L);
                                                        continue Label_0504;
                                                    }
                                                    final int n15 = J3.p0(n4, 0);
                                                    final int n10 = n2 + n15;
                                                    continue Label_0725_Outer;
                                                }
                                                final int n16 = J3.d0(n4, n13);
                                                continue Label_0504;
                                            }
                                            int n16 = J3.w0(n4, n14);
                                            continue Label_0504;
                                            Object o3 = null;
                                            n16 = J3.Q(n4, (q3)o3);
                                            continue Label_0504;
                                        }
                                        int n16 = a5.a(n4, o4, this.N(i));
                                        continue Label_0504;
                                    }
                                    continue Label_0725;
                                }
                                int n16 = J3.y(n4, (String)o6);
                                continue Label_0504;
                            }
                            int n16 = J3.z(n4, true);
                            continue Label_0504;
                        }
                        final int n15 = J3.s0(n4) + J3.v0(n17) + n17;
                        continue Label_0628;
                    }
                    n20 = n2 + n18;
                    break Label_2398;
                }
                n20 = n2 + n19;
            }
            i += 3;
            n = n9;
            n2 = n20;
        }
        final int n21 = 0;
        final x5 o9 = this.o;
        int n22 = n2 + o9.a(o9.k(o));
        if (this.f) {
            final S3 b = this.p.b(o);
            final int n23 = 0;
            int n24 = n21;
            for (int j = n23; j < b.a.g(); ++j) {
                final Map.Entry h2 = b.a.h(j);
                android.support.v4.media.a.a(h2.getKey());
                n24 += S3.b(null, h2.getValue());
            }
            for (final Map.Entry<Object, V> entry : b.a.j()) {
                android.support.v4.media.a.a(entry.getKey());
                n24 += S3.b(null, entry.getValue());
            }
            n22 += n24;
        }
        return n22;
    }
    
    @Override
    public final boolean c(Object q) {
        int n = 1048575;
        int i;
        for (int int1 = i = 0; i < this.k; ++i) {
            final int n2 = this.j[i];
            final int n3 = this.a[n2];
            final int g = this.G(n2);
            final int n4 = this.a[n2 + 2];
            final int n5 = n4 & 0xFFFFF;
            final int n6 = 1 << (n4 >>> 20);
            if (n5 != n) {
                if (n5 != 1048575) {
                    int1 = M4.s.getInt(q, n5);
                }
                n = n5;
            }
            if ((0x10000000 & g) != 0x0 && !this.z(q, n2, n, int1, n6)) {
                return false;
            }
            final int n7 = (0xFF00000 & g) >>> 20;
            if (n7 != 9 && n7 != 17) {
                if (n7 != 27) {
                    if (n7 != 60 && n7 != 68) {
                        if (n7 != 49) {
                            if (n7 != 50) {
                                continue;
                            }
                            if (this.q.c(D5.B(q, g & 0xFFFFF)).isEmpty()) {
                                continue;
                            }
                            q = this.Q(n2);
                            this.q.b(q);
                            throw null;
                        }
                    }
                    else {
                        if (this.J(q, n3, n2) && !A(q, g, this.N(n2))) {
                            return false;
                        }
                        continue;
                    }
                }
                final List list = (List)D5.B(q, g & 0xFFFFF);
                if (!list.isEmpty()) {
                    final Z4 n8 = this.N(n2);
                    for (int j = 0; j < list.size(); ++j) {
                        if (!n8.c(list.get(j))) {
                            return false;
                        }
                    }
                }
            }
            else if (this.z(q, n2, n, int1, n6) && !A(q, g, this.N(n2))) {
                return false;
            }
        }
        return !this.f || this.p.b(q).n();
    }
    
    @Override
    public final void d(final Object o, final Object o2) {
        R(o);
        o2.getClass();
    Label_0464_Outer:
        for (int i = 0; i < this.a.length; i += 3) {
            final int g = this.G(i);
            final long n = 0xFFFFF & g;
            final int n2 = this.a[i];
            while (true) {
                Label_0554: {
                    Label_0482: {
                        Label_0452: {
                            switch ((g & 0xFF00000) >>> 20) {
                                default: {
                                    continue Label_0464_Outer;
                                }
                                case 60:
                                case 68: {
                                    this.F(o, o2, i);
                                    continue Label_0464_Outer;
                                }
                                case 61:
                                case 62:
                                case 63:
                                case 64:
                                case 65:
                                case 66:
                                case 67: {
                                    if (this.J(o2, n2, i)) {
                                        break;
                                    }
                                    continue Label_0464_Outer;
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
                                    if (this.J(o2, n2, i)) {
                                        break;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 50: {
                                    a5.m(this.q, o, o2, n);
                                    continue Label_0464_Outer;
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
                                    this.n.b(o, o2, n);
                                    continue Label_0464_Outer;
                                }
                                case 9:
                                case 17: {
                                    this.y(o, o2, i);
                                    continue Label_0464_Outer;
                                }
                                case 16: {
                                    if (this.I(o2, i)) {
                                        break Label_0452;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 15: {
                                    if (this.I(o2, i)) {
                                        break Label_0482;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 14: {
                                    if (this.I(o2, i)) {
                                        break Label_0452;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 13: {
                                    if (this.I(o2, i)) {
                                        break Label_0482;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 12: {
                                    if (this.I(o2, i)) {
                                        break Label_0482;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 11: {
                                    if (this.I(o2, i)) {
                                        break Label_0482;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 10: {
                                    if (this.I(o2, i)) {
                                        break Label_0554;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 8: {
                                    if (this.I(o2, i)) {
                                        break Label_0554;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 7: {
                                    if (this.I(o2, i)) {
                                        D5.v(o, n, D5.F(o2, n));
                                        break Label_0464;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 6: {
                                    if (this.I(o2, i)) {
                                        break Label_0482;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 5: {
                                    if (this.I(o2, i)) {
                                        break Label_0452;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 4: {
                                    if (this.I(o2, i)) {
                                        break Label_0482;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 3: {
                                    if (this.I(o2, i)) {
                                        break Label_0452;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 2: {
                                    if (this.I(o2, i)) {
                                        break Label_0452;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 1: {
                                    if (this.I(o2, i)) {
                                        D5.g(o, n, D5.n(o2, n));
                                        break Label_0464;
                                    }
                                    continue Label_0464_Outer;
                                }
                                case 0: {
                                    if (this.I(o2, i)) {
                                        D5.f(o, n, D5.a(o2, n));
                                        break Label_0464;
                                    }
                                    continue Label_0464_Outer;
                                }
                            }
                            D5.j(o, n, D5.B(o2, n));
                            this.E(o, n2, i);
                            continue Label_0464_Outer;
                        }
                        D5.i(o, n, D5.x(o2, n));
                        this.D(o, i);
                        continue Label_0464_Outer;
                    }
                    D5.h(o, n, D5.t(o2, n));
                    continue;
                }
                D5.j(o, n, D5.B(o2, n));
                continue;
            }
        }
        a5.n(this.o, o, o2);
        if (this.f) {
            a5.l(this.p, o, o2);
        }
    }
    
    @Override
    public final void e(final Object o) {
        if (!T(o)) {
            return;
        }
        final boolean b = o instanceof Y3;
        int i = 0;
        if (b) {
            final Y3 y3 = (Y3)o;
            y3.j(Integer.MAX_VALUE);
            y3.zza = 0;
            y3.D();
        }
        while (i < this.a.length) {
            final int g = this.G(i);
            final long offset = 0xFFFFF & g;
            final int n = (g & 0xFF00000) >>> 20;
            Label_0363: {
                while (true) {
                    Label_0351: {
                        if (n == 9) {
                            break Label_0351;
                        }
                        if (n != 60 && n != 68) {
                            switch (n) {
                                default: {
                                    break Label_0363;
                                }
                                case 50: {
                                    final Unsafe s = M4.s;
                                    final Object object = s.getObject(o, offset);
                                    if (object != null) {
                                        s.putObject(o, offset, this.q.e(object));
                                    }
                                    break Label_0363;
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
                                    this.n.d(o, offset);
                                    break Label_0363;
                                }
                                case 17: {
                                    break Label_0351;
                                }
                            }
                        }
                        else if (!this.J(o, this.a[i], i)) {
                            break Label_0363;
                        }
                        this.N(i).e(M4.s.getObject(o, offset));
                        break Label_0363;
                    }
                    if (this.I(o, i)) {
                        continue;
                    }
                    break;
                }
            }
            i += 3;
        }
        this.o.l(o);
        if (this.f) {
            this.p.f(o);
        }
    }
    
    @Override
    public final int f(final Object o) {
        final int length = this.a.length;
        int i = 0;
        int n = 0;
    Label_0434_Outer:
        while (i < length) {
            final int g = this.G(i);
            final int n2 = this.a[i];
            final long n3 = 0xFFFFF & g;
            int hashCode = 37;
            int n4 = 0;
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
                                            int n5 = 0;
                                            Object o2 = null;
                                            Label_0386: {
                                                Label_0623: {
                                                    switch ((g & 0xFF00000) >>> 20) {
                                                        default: {
                                                            n4 = n;
                                                            break Label_1001;
                                                        }
                                                        case 68: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 67: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 66: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 65: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 64: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 63: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 62: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 61: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
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
                                                            n5 = n * 53;
                                                            o2 = D5.B(o, n3);
                                                            break Label_0386;
                                                        }
                                                        case 60: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 59: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break Label_0623;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 8: {
                                                            n5 = n * 53;
                                                            final int n6 = ((String)D5.B(o, n3)).hashCode();
                                                            break Label_0393;
                                                        }
                                                        case 58: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                n5 = n * 53;
                                                                b = P(o, n3);
                                                                break Label_0678;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 57: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 56: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 55: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 54: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 53: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 52: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                n5 = n * 53;
                                                                value = B(o, n3);
                                                                break Label_0814;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 51: {
                                                            n4 = n;
                                                            if (this.J(o, n2, i)) {
                                                                n5 = n * 53;
                                                                value2 = j(o, n3);
                                                                break Label_0854;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 17: {
                                                            o3 = D5.B(o, n3);
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
                                                            n5 = n * 53;
                                                            final long n7 = D5.x(o, n3);
                                                            break Label_0434;
                                                        }
                                                        case 4:
                                                        case 6:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                        case 15: {
                                                            n5 = n * 53;
                                                            final int n6 = D5.t(o, n3);
                                                            break Label_0393;
                                                        }
                                                        case 9: {
                                                            o3 = D5.B(o, n3);
                                                            if (o3 != null) {
                                                                break Label_0434;
                                                            }
                                                            break Label_0883;
                                                        }
                                                        case 7: {
                                                            n5 = n * 53;
                                                            b = D5.F(o, n3);
                                                            break Label_0678;
                                                        }
                                                        case 1: {
                                                            n5 = n * 53;
                                                            value = D5.n(o, n3);
                                                            break Label_0814;
                                                        }
                                                        case 0: {
                                                            n5 = n * 53;
                                                            value2 = D5.a(o, n3);
                                                            break Label_0854;
                                                        }
                                                    }
                                                }
                                                o2 = D5.B(o, n3);
                                                n5 = n * 53;
                                            }
                                            final int n6 = o2.hashCode();
                                            n4 = n5 + n6;
                                            break Label_1001;
                                        }
                                        int n5 = n * 53;
                                        final long n7 = L(o, n3);
                                        final int n6 = a4.b(n7);
                                        continue Label_0434_Outer;
                                    }
                                    int n5 = n * 53;
                                    final int n6 = H(o, n3);
                                    continue Label_0434_Outer;
                                }
                                final int n6 = a4.c(b);
                                continue Label_0434_Outer;
                            }
                            final int n6 = Float.floatToIntBits(value);
                            continue Label_0434_Outer;
                        }
                        final long n7 = Double.doubleToLongBits(value2);
                        continue Label_0434;
                    }
                    hashCode = o3.hashCode();
                }
                n4 = n * 53 + hashCode;
            }
            i += 3;
            n = n4;
        }
        int n8 = n * 53 + this.o.k(o).hashCode();
        if (this.f) {
            n8 = n8 * 53 + this.p.b(o).hashCode();
        }
        return n8;
    }
    
    @Override
    public final void g(final Object o, final byte[] array, final int n, final int n2, final p3 p5) {
        this.m(o, array, n, n2, 0, p5);
    }
    
    @Override
    public final boolean h(final Object o, final Object o2) {
        for (int length = this.a.length, i = 0; i < length; i += 3) {
            final int g = this.G(i);
            final long n = g & 0xFFFFF;
            switch ((g & 0xFF00000) >>> 20) {
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
                    final long n2 = this.C(i) & 0xFFFFF;
                    if (D5.t(o, n2) != D5.t(o2, n2)) {
                        return false;
                    }
                    if (!a5.p(D5.B(o, n), D5.B(o2, n))) {
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
                    if (!a5.p(D5.B(o, n), D5.B(o2, n))) {
                        return false;
                    }
                    break;
                }
                case 17: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (!a5.p(D5.B(o, n), D5.B(o2, n))) {
                        return false;
                    }
                    break;
                }
                case 16: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (D5.x(o, n) != D5.x(o2, n)) {
                        return false;
                    }
                    break;
                }
                case 15: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (D5.t(o, n) != D5.t(o2, n)) {
                        return false;
                    }
                    break;
                }
                case 14: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (D5.x(o, n) != D5.x(o2, n)) {
                        return false;
                    }
                    break;
                }
                case 13: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (D5.t(o, n) != D5.t(o2, n)) {
                        return false;
                    }
                    break;
                }
                case 12: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (D5.t(o, n) != D5.t(o2, n)) {
                        return false;
                    }
                    break;
                }
                case 11: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (D5.t(o, n) != D5.t(o2, n)) {
                        return false;
                    }
                    break;
                }
                case 10: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (!a5.p(D5.B(o, n), D5.B(o2, n))) {
                        return false;
                    }
                    break;
                }
                case 9: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (!a5.p(D5.B(o, n), D5.B(o2, n))) {
                        return false;
                    }
                    break;
                }
                case 8: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (!a5.p(D5.B(o, n), D5.B(o2, n))) {
                        return false;
                    }
                    break;
                }
                case 7: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (D5.F(o, n) != D5.F(o2, n)) {
                        return false;
                    }
                    break;
                }
                case 6: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (D5.t(o, n) != D5.t(o2, n)) {
                        return false;
                    }
                    break;
                }
                case 5: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (D5.x(o, n) != D5.x(o2, n)) {
                        return false;
                    }
                    break;
                }
                case 4: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (D5.t(o, n) != D5.t(o2, n)) {
                        return false;
                    }
                    break;
                }
                case 3: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (D5.x(o, n) != D5.x(o2, n)) {
                        return false;
                    }
                    break;
                }
                case 2: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (D5.x(o, n) != D5.x(o2, n)) {
                        return false;
                    }
                    break;
                }
                case 1: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (Float.floatToIntBits(D5.n(o, n)) != Float.floatToIntBits(D5.n(o2, n))) {
                        return false;
                    }
                    break;
                }
                case 0: {
                    if (!this.K(o, o2, i)) {
                        return false;
                    }
                    if (Double.doubleToLongBits(D5.a(o, n)) != Double.doubleToLongBits(D5.a(o2, n))) {
                        return false;
                    }
                    break;
                }
            }
        }
        return this.o.k(o).equals(this.o.k(o2)) && (!this.f || this.p.b(o).equals(this.p.b(o2)));
    }
    
    @Override
    public final void i(final Object o, final T5 t5) {
        T5 t6 = t5;
        if (t5.a() == W5.b) {
            u(this.o, o, t6);
            Iterator<Map.Entry<?, ?>> i = null;
            Map.Entry<?, ?> entry = null;
            Label_0076: {
                if (this.f) {
                    final S3 b = this.p.b(o);
                    if (!b.a.isEmpty()) {
                        i = (Iterator<Map.Entry<?, ?>>)b.i();
                        entry = i.next();
                        break Label_0076;
                    }
                }
                i = null;
                entry = null;
            }
            int n = this.a.length - 3;
            Map.Entry<?, ?> entry2;
            while (true) {
                entry2 = entry;
                if (n < 0) {
                    break;
                }
                final int g = this.G(n);
                final int n2 = this.a[n];
                while (entry != null && this.p.a((Map.Entry)entry) > n2) {
                    this.p.c(t6, (Map.Entry)entry);
                    if (i.hasNext()) {
                        entry = i.next();
                    }
                    else {
                        entry = null;
                    }
                }
                Label_2506: {
                    double n15 = 0.0;
                    Label_1133: {
                        float n14 = 0.0f;
                        Label_1096: {
                            long n13 = 0L;
                            Label_1058: {
                                long n12 = 0L;
                                Label_1020: {
                                    int n11 = 0;
                                    Label_0982: {
                                        long n10 = 0L;
                                        Label_0944: {
                                            int n9 = 0;
                                            Label_0906: {
                                                boolean b2 = false;
                                                Label_0868: {
                                                    Label_0824: {
                                                        Label_0784: {
                                                            Label_0747: {
                                                                int n8 = 0;
                                                                Label_0721: {
                                                                    int n7 = 0;
                                                                    Label_0683: {
                                                                        int n6 = 0;
                                                                        Label_0645: {
                                                                            long n5 = 0L;
                                                                            Label_0607: {
                                                                                int n4 = 0;
                                                                                Label_0569: {
                                                                                    long n3 = 0L;
                                                                                    Label_0531: {
                                                                                        switch ((g & 0xFF00000) >>> 20) {
                                                                                            default: {
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 68: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    break;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 67: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n3 = L(o, g & 0xFFFFF);
                                                                                                    break Label_0531;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 66: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n4 = H(o, g & 0xFFFFF);
                                                                                                    break Label_0569;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 65: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n5 = L(o, g & 0xFFFFF);
                                                                                                    break Label_0607;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 64: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n6 = H(o, g & 0xFFFFF);
                                                                                                    break Label_0645;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 63: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n7 = H(o, g & 0xFFFFF);
                                                                                                    break Label_0683;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 62: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n8 = H(o, g & 0xFFFFF);
                                                                                                    break Label_0721;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 61: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    break Label_0747;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 60: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    break Label_0784;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 59: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    break Label_0824;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 58: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    b2 = P(o, g & 0xFFFFF);
                                                                                                    break Label_0868;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 57: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n9 = H(o, g & 0xFFFFF);
                                                                                                    break Label_0906;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 56: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n10 = L(o, g & 0xFFFFF);
                                                                                                    break Label_0944;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 55: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n11 = H(o, g & 0xFFFFF);
                                                                                                    break Label_0982;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 54: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n12 = L(o, g & 0xFFFFF);
                                                                                                    break Label_1020;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 53: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n13 = L(o, g & 0xFFFFF);
                                                                                                    break Label_1058;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 52: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n14 = B(o, g & 0xFFFFF);
                                                                                                    break Label_1096;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 51: {
                                                                                                if (this.J(o, n2, n)) {
                                                                                                    n15 = j(o, g & 0xFFFFF);
                                                                                                    break Label_1133;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 50: {
                                                                                                this.v(t6, n2, D5.B(o, g & 0xFFFFF), n);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 49: {
                                                                                                a5.j(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, this.N(n));
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 48: {
                                                                                                a5.a0(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 47: {
                                                                                                a5.Z(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 46: {
                                                                                                a5.Y(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 45: {
                                                                                                a5.V(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 44: {
                                                                                                a5.B(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 43: {
                                                                                                a5.b0(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 42: {
                                                                                                a5.k(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 41: {
                                                                                                a5.F(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 40: {
                                                                                                a5.J(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 39: {
                                                                                                a5.P(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 38: {
                                                                                                a5.c0(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 37: {
                                                                                                a5.S(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 36: {
                                                                                                a5.M(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 35: {
                                                                                                a5.x(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, true);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 34: {
                                                                                                a5.a0(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 33: {
                                                                                                a5.Z(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 32: {
                                                                                                a5.Y(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 31: {
                                                                                                a5.V(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 30: {
                                                                                                a5.B(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 29: {
                                                                                                a5.b0(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 28: {
                                                                                                a5.i(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 27: {
                                                                                                a5.w(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, this.N(n));
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 26: {
                                                                                                a5.v(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 25: {
                                                                                                a5.k(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 24: {
                                                                                                a5.F(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 23: {
                                                                                                a5.J(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 22: {
                                                                                                a5.P(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 21: {
                                                                                                a5.c0(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 20: {
                                                                                                a5.S(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 19: {
                                                                                                a5.M(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 18: {
                                                                                                a5.x(this.a[n], (List)D5.B(o, g & 0xFFFFF), t6, false);
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 17: {
                                                                                                if (this.I(o, n)) {
                                                                                                    break;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 16: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n3 = D5.x(o, g & 0xFFFFF);
                                                                                                    break Label_0531;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 15: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n4 = D5.t(o, g & 0xFFFFF);
                                                                                                    break Label_0569;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 14: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n5 = D5.x(o, g & 0xFFFFF);
                                                                                                    break Label_0607;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 13: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n6 = D5.t(o, g & 0xFFFFF);
                                                                                                    break Label_0645;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 12: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n7 = D5.t(o, g & 0xFFFFF);
                                                                                                    break Label_0683;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 11: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n8 = D5.t(o, g & 0xFFFFF);
                                                                                                    break Label_0721;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 10: {
                                                                                                if (this.I(o, n)) {
                                                                                                    break Label_0747;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 9: {
                                                                                                if (this.I(o, n)) {
                                                                                                    break Label_0784;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 8: {
                                                                                                if (this.I(o, n)) {
                                                                                                    break Label_0824;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 7: {
                                                                                                if (this.I(o, n)) {
                                                                                                    b2 = D5.F(o, g & 0xFFFFF);
                                                                                                    break Label_0868;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 6: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n9 = D5.t(o, g & 0xFFFFF);
                                                                                                    break Label_0906;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 5: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n10 = D5.x(o, g & 0xFFFFF);
                                                                                                    break Label_0944;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 4: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n11 = D5.t(o, g & 0xFFFFF);
                                                                                                    break Label_0982;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 3: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n12 = D5.x(o, g & 0xFFFFF);
                                                                                                    break Label_1020;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 2: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n13 = D5.x(o, g & 0xFFFFF);
                                                                                                    break Label_1058;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 1: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n14 = D5.n(o, g & 0xFFFFF);
                                                                                                    break Label_1096;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                            case 0: {
                                                                                                if (this.I(o, n)) {
                                                                                                    n15 = D5.a(o, g & 0xFFFFF);
                                                                                                    break Label_1133;
                                                                                                }
                                                                                                break Label_2506;
                                                                                            }
                                                                                        }
                                                                                        t6.C(n2, D5.B(o, g & 0xFFFFF), this.N(n));
                                                                                        break Label_2506;
                                                                                    }
                                                                                    t6.A(n2, n3);
                                                                                    break Label_2506;
                                                                                }
                                                                                t6.G(n2, n4);
                                                                                break Label_2506;
                                                                            }
                                                                            t6.s(n2, n5);
                                                                            break Label_2506;
                                                                        }
                                                                        t6.x(n2, n6);
                                                                        break Label_2506;
                                                                    }
                                                                    t6.K(n2, n7);
                                                                    break Label_2506;
                                                                }
                                                                t6.h(n2, n8);
                                                                break Label_2506;
                                                            }
                                                            t6.f(n2, (q3)D5.B(o, g & 0xFFFFF));
                                                            break Label_2506;
                                                        }
                                                        t6.d(n2, D5.B(o, g & 0xFFFFF), this.N(n));
                                                        break Label_2506;
                                                    }
                                                    t(n2, D5.B(o, g & 0xFFFFF), t6);
                                                    break Label_2506;
                                                }
                                                t6.c(n2, b2);
                                                break Label_2506;
                                            }
                                            t6.k(n2, n9);
                                            break Label_2506;
                                        }
                                        t6.M(n2, n10);
                                        break Label_2506;
                                    }
                                    t6.r(n2, n11);
                                    break Label_2506;
                                }
                                t6.I(n2, n12);
                                break Label_2506;
                            }
                            t6.j(n2, n13);
                            break Label_2506;
                        }
                        t6.O(n2, n14);
                        break Label_2506;
                    }
                    t6.N(n2, n15);
                }
                n -= 3;
            }
            while (entry2 != null) {
                this.p.c(t6, (Map.Entry)entry2);
                if (i.hasNext()) {
                    entry2 = i.next();
                }
                else {
                    entry2 = null;
                }
            }
            return;
        }
        Iterator<Map.Entry<?, ?>> l = null;
        Map.Entry<?, ?> entry3 = null;
        Label_2619: {
            if (this.f) {
                final S3 b3 = this.p.b(o);
                if (!b3.a.isEmpty()) {
                    l = (Iterator<Map.Entry<?, ?>>)b3.l();
                    entry3 = l.next();
                    break Label_2619;
                }
            }
            entry3 = null;
            l = null;
        }
        final int length = this.a.length;
        final Unsafe s = M4.s;
        int j;
        int int1 = j = 0;
        int n16 = 1048575;
        while (j < length) {
            final int g2 = this.G(j);
            final int[] a = this.a;
            final int n17 = a[j];
            final int n18 = (g2 & 0xFF00000) >>> 20;
            int n23;
            if (n18 <= 17) {
                final int n19 = a[j + 2];
                final int n20 = n19 & 0xFFFFF;
                int n21;
                if (n20 != (n21 = n16)) {
                    if (n20 == 1048575) {
                        int1 = 0;
                    }
                    else {
                        int1 = s.getInt(o, n20);
                    }
                    n21 = n20;
                }
                final int n22 = 1 << (n19 >>> 20);
                n16 = n21;
                n23 = n22;
            }
            else {
                n23 = 0;
            }
            Iterator<Map.Entry<?, ?>> iterator;
            while (true) {
                iterator = l;
                if (entry3 == null || this.p.a((Map.Entry)entry3) > n17) {
                    break;
                }
                this.p.c(t6, (Map.Entry)entry3);
                if (iterator.hasNext()) {
                    entry3 = iterator.next();
                }
                else {
                    entry3 = null;
                }
            }
            final long n24 = g2 & 0xFFFFF;
            T5 t7 = null;
            Label_5586: {
                switch (n18) {
                    case 68: {
                        if (this.J(o, n17, j)) {
                            t6.C(n17, s.getObject(o, n24), this.N(j));
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if (this.J(o, n17, j)) {
                            t6.A(n17, L(o, n24));
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if (this.J(o, n17, j)) {
                            t6.G(n17, H(o, n24));
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if (this.J(o, n17, j)) {
                            t6.s(n17, L(o, n24));
                            break;
                        }
                        break;
                    }
                    case 64: {
                        if (this.J(o, n17, j)) {
                            t6.x(n17, H(o, n24));
                            break;
                        }
                        break;
                    }
                    case 63: {
                        if (this.J(o, n17, j)) {
                            t6.K(n17, H(o, n24));
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if (this.J(o, n17, j)) {
                            t6.h(n17, H(o, n24));
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if (this.J(o, n17, j)) {
                            t6.f(n17, (q3)s.getObject(o, n24));
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if (this.J(o, n17, j)) {
                            t6.d(n17, s.getObject(o, n24), this.N(j));
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if (this.J(o, n17, j)) {
                            t(n17, s.getObject(o, n24), t6);
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if (this.J(o, n17, j)) {
                            t6.c(n17, P(o, n24));
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if (this.J(o, n17, j)) {
                            t6.k(n17, H(o, n24));
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if (this.J(o, n17, j)) {
                            t6.M(n17, L(o, n24));
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if (this.J(o, n17, j)) {
                            t6.r(n17, H(o, n24));
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if (this.J(o, n17, j)) {
                            t6.I(n17, L(o, n24));
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if (this.J(o, n17, j)) {
                            t6.j(n17, L(o, n24));
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if (this.J(o, n17, j)) {
                            t6.O(n17, B(o, n24));
                            break;
                        }
                        break;
                    }
                    case 51: {
                        if (this.J(o, n17, j)) {
                            t6.N(n17, j(o, n24));
                            break;
                        }
                        break;
                    }
                    case 50: {
                        this.v(t6, n17, s.getObject(o, n24), j);
                        break;
                    }
                    case 49: {
                        a5.j(this.a[j], (List)s.getObject(o, n24), t6, this.N(j));
                        break;
                    }
                    case 48: {
                        a5.a0(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 47: {
                        a5.Z(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 46: {
                        a5.Y(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 45: {
                        a5.V(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 44: {
                        a5.B(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 43: {
                        a5.b0(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 42: {
                        a5.k(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 41: {
                        a5.F(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 40: {
                        a5.J(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 39: {
                        a5.P(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 38: {
                        a5.c0(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 37: {
                        a5.S(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 36: {
                        a5.M(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 35: {
                        a5.x(this.a[j], (List)s.getObject(o, n24), t6, true);
                        break;
                    }
                    case 34: {
                        a5.a0(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 33: {
                        a5.Z(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 32: {
                        a5.Y(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 31: {
                        a5.V(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 30: {
                        a5.B(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 29: {
                        a5.b0(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 28: {
                        a5.i(this.a[j], (List)s.getObject(o, n24), t6);
                        break;
                    }
                    case 27: {
                        a5.w(this.a[j], (List)s.getObject(o, n24), t6, this.N(j));
                        break;
                    }
                    case 26: {
                        a5.v(this.a[j], (List)s.getObject(o, n24), t6);
                        break;
                    }
                    case 25: {
                        a5.k(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 24: {
                        a5.F(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 23: {
                        a5.J(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 22: {
                        a5.P(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 21: {
                        a5.c0(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 20: {
                        a5.S(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 19: {
                        a5.M(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 18: {
                        a5.x(this.a[j], (List)s.getObject(o, n24), t6, false);
                        break;
                    }
                    case 17: {
                        if (this.z(o, j, n16, int1, n23)) {
                            t5.C(n17, s.getObject(o, n24), this.N(j));
                        }
                        t7 = t5;
                        break Label_5586;
                    }
                    case 16: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.A(n17, s.getLong(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 15: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.G(n17, s.getInt(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 14: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.s(n17, s.getLong(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 13: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.x(n17, s.getInt(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 12: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.K(n17, s.getInt(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 11: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.h(n17, s.getInt(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 10: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.f(n17, (q3)s.getObject(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 9: {
                        final int n25 = j;
                        t7 = t6;
                        if (this.z(o, n25, n16, int1, n23)) {
                            t6.d(n17, s.getObject(o, n24), this.N(n25));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 8: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t(n17, s.getObject(o, n24), t6);
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 7: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.c(n17, D5.F(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 6: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.k(n17, s.getInt(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 5: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.M(n17, s.getLong(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 4: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.r(n17, s.getInt(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 3: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.I(n17, s.getLong(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 2: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.j(n17, s.getLong(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 1: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.O(n17, D5.n(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                    case 0: {
                        t7 = t6;
                        if (this.z(o, j, n16, int1, n23)) {
                            t6.N(n17, D5.a(o, n24));
                            t7 = t6;
                        }
                        break Label_5586;
                    }
                }
                while (true) {
                    t7 = t6;
                    break Label_5586;
                    continue;
                }
            }
            j += 3;
            t6 = t7;
            l = iterator;
        }
        while (entry3 != null) {
            this.p.c(t6, (Map.Entry)entry3);
            if (l.hasNext()) {
                entry3 = l.next();
            }
            else {
                entry3 = null;
            }
        }
        u(this.o, o, t6);
    }
    
    public final int k(final int n) {
        if (n >= this.c && n <= this.d) {
            return this.l(n, 0);
        }
        return -1;
    }
    
    public final int l(final int n, int i) {
        int n2 = this.a.length / 3 - 1;
        while (i <= n2) {
            final int n3 = n2 + i >>> 1;
            final int n4 = n3 * 3;
            final int n5 = this.a[n4];
            if (n == n5) {
                return n4;
            }
            if (n < n5) {
                n2 = n3 - 1;
            }
            else {
                i = n3 + 1;
            }
        }
        return -1;
    }
    
    public final int m(final Object o, final byte[] array, int i, int n, int a, final p3 p6) {
        Object o2 = o;
        int n2 = n;
        int n3 = a;
        p3 p7 = p6;
        R(o);
        Unsafe s = M4.s;
        int n4 = 0;
        int n6;
        int n5 = n6 = n4;
        int n7 = -1;
        int n8 = 1048575;
        while (true) {
            int d;
            int x;
            int n9;
            int n10;
            int n11;
            int n12;
            boolean b;
            int n13;
            int n14 = 0;
            int n15 = 0;
            int n16 = 0;
            p3 p8 = null;
            int n17;
            int n18 = 0;
            Unsafe unsafe = null;
            int[] a2;
            int n19;
            int n20;
            long n21;
            int n22;
            int n23;
            int int1;
            int n24;
            Object p9;
            int h;
            int n25;
            int n26 = 0;
            int n27 = 0;
            int n28 = 0;
            int n29 = 0;
            p3 p10;
            int offset = 0;
            int n30;
            p3 p11;
            int n31;
            int n32;
            Unsafe unsafe2;
            int o3;
            int a3;
            g4 m;
            int n33;
            int n34;
            int n35;
            p3 p12;
            Unsafe unsafe3;
            int n36 = 0;
            int n37 = 0;
            int n38;
            Unsafe unsafe4 = null;
            int n39;
            Object p13;
            p3 p14;
            int n40;
            int a4;
            p3 p15;
            int n41;
            int n42;
            p3 p16;
            p3 p17;
            Unsafe unsafe5;
            int n43;
            int n44;
            int n45;
            int n46;
            int n47;
            int n48;
            int n49;
            int n50;
            int n51;
            int n52;
            int n53;
            h4 e;
            h4 h2;
            int size;
            int e2;
            int n54;
            long n55;
            Unsafe s2;
            h4 e3;
            h4 h3;
            int size2;
            int n56 = 0;
            Z4 n57;
            int n58;
            int n59;
            int n60;
            int j = 0;
            int o4;
            w4 w4;
            int n61;
            w4 w5;
            int n62;
            int o5;
            c4 c4;
            int n63;
            c4 c5;
            int n64;
            int o6;
            int o7;
            int a5;
            int n65;
            int n66;
            int n67;
            int o8;
            int o9;
            int a6;
            int n68;
            int k = 0;
            int n69;
            p3 p18;
            int n70;
            int n71;
            int n72;
            String s3;
            int o10;
            int n73;
            int a7;
            int n74;
            String s4;
            int o11;
            int a8;
            int n75;
            long b2;
            c4 c6;
            int n76;
            c4 c7;
            int n77;
            int n78 = 0;
            int o12;
            w4 w6;
            int n79;
            w4 w7;
            int n80;
            int o13;
            int n81;
            int n82;
            int n83;
            int n84;
            int n85;
            int n86;
            int n87;
            w4 w8;
            int n88;
            w4 w9;
            int n89;
            int o14;
            int n90;
            int n91;
            int n92;
            int n93;
            int n94;
            int n95;
            int n96;
            int n97;
            int n98;
            int n99;
            int n100;
            int n101;
            int n102;
            int n103;
            int n104;
            Unsafe unsafe6;
            int n105;
            int n106;
            int n107;
            Unsafe s5;
            Object q;
            Object x2;
            Object o15;
            Unsafe s6;
            long offset2;
            Object q2;
            int n108 = 0;
            int n109 = 0;
            int n110;
            Object x3 = null;
            int o16;
            int a9;
            g4 l;
            int n111;
            Object q3;
            Z4 n112;
            int n113;
            p3 p19;
            int n114;
            int a10;
            p3 p20;
            int n115;
            int n116;
            int n117 = 0;
            Serializable x4 = null;
            int n118;
            int n119;
            Number x5 = null;
            int n120;
            int n121;
            Number x6 = null;
            p3 p21;
            int n122;
            int n123;
            p3 p22;
            int n124;
            int n125;
            int n126;
            int n127;
            int n128;
            int n129;
            int n130;
            int n131;
            int n132;
            int n133;
            int n134;
            int n135;
            int n136;
            int n137;
            M3 d2;
            int n138;
            int n139;
            int n140;
            int n141;
            int n142;
            int k2;
            Object o17;
            Label_0680_Outer:Label_4211_Outer:
            while (i < n2) {
                d = i + 1;
                i = array[i];
                if (i < 0) {
                    d = com.google.android.gms.internal.measurement.n3.d(i, array, d, p7);
                    i = p7.a;
                }
                x = i >>> 3;
                n9 = (i & 0x7);
                if (x > n7) {
                    n10 = n4 / 3;
                    if (x >= this.c && x <= this.d) {
                        n11 = this.l(x, n10);
                    }
                    else {
                        n11 = -1;
                    }
                }
                else {
                    n11 = this.k(x);
                }
                Label_4688_Outer:Label_5640_Outer:
                while (true) {
                    Label_5558: {
                        if (n11 == -1) {
                            n12 = n8;
                            b = false;
                            n13 = n3;
                            n14 = x;
                            n15 = n2;
                            n5 = i;
                            n16 = d;
                            p8 = p7;
                            i = n13;
                            n17 = (b ? 1 : 0);
                            n18 = n12;
                            unsafe = s;
                            break Label_5558;
                        }
                        a2 = this.a;
                        n19 = a2[n11 + 1];
                        n20 = (n19 & 0xFF00000) >>> 20;
                        n21 = (n19 & 0xFFFFF);
                        Label_0523: {
                            if (n20 <= 17) {
                                n22 = a2[n11 + 2];
                                n23 = 1 << (n22 >>> 20);
                                n18 = (n22 & 0xFFFFF);
                                if (n18 != n8) {
                                    if (n8 != 1048575) {
                                        s.putInt(o2, n8, n6);
                                    }
                                    if (n18 == 1048575) {
                                        int1 = 0;
                                    }
                                    else {
                                        int1 = s.getInt(o2, n18);
                                    }
                                    n24 = int1;
                                }
                                else {
                                    n18 = n8;
                                    n24 = n6;
                                }
                                Label_1504: {
                                    Label_1196: {
                                        while (true) {
                                            Label_1178: {
                                                Label_0982: {
                                                    Label_0703: {
                                                        Label_0688: {
                                                            Label_0661: {
                                                                Label_0571: {
                                                                    switch (n20) {
                                                                        case 17: {
                                                                            if (n9 == 3) {
                                                                                p9 = this.p(o2, n11);
                                                                                h = com.google.android.gms.internal.measurement.n3.h(p9, this.N(n11), array, d, n, x << 3 | 0x4, p6);
                                                                                this.x(o2, n11, p9);
                                                                                n6 = (n24 | n23);
                                                                                n25 = x;
                                                                                n8 = n18;
                                                                                n2 = n;
                                                                                n5 = i;
                                                                                n4 = n11;
                                                                                n7 = n25;
                                                                                i = h;
                                                                                break Label_0523;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case 16: {
                                                                            if (n9 == 0) {
                                                                                n26 = com.google.android.gms.internal.measurement.n3.p(array, d, p7);
                                                                                s.putLong(o, n21, G3.b(p7.b));
                                                                                n27 = (n24 | n23);
                                                                                break Label_0571;
                                                                            }
                                                                            n28 = a;
                                                                            n29 = i;
                                                                            break Label_1504;
                                                                        }
                                                                        case 15: {
                                                                            n28 = a;
                                                                            p10 = p7;
                                                                            n29 = i;
                                                                            if (n9 == 0) {
                                                                                offset = com.google.android.gms.internal.measurement.n3.o(array, d, p10);
                                                                                s.putInt(o2, n21, G3.e(p10.a));
                                                                                break Label_0661;
                                                                            }
                                                                            break Label_1504;
                                                                        }
                                                                        case 12: {
                                                                            n30 = a;
                                                                            p11 = p7;
                                                                            n31 = n11;
                                                                            n32 = i;
                                                                            unsafe2 = s;
                                                                            n28 = n30;
                                                                            n29 = n32;
                                                                            if (n9 == 0) {
                                                                                o3 = com.google.android.gms.internal.measurement.n3.o(array, d, p11);
                                                                                a3 = p11.a;
                                                                                m = this.M(n31);
                                                                                if ((n19 & Integer.MIN_VALUE) == 0x0 || m == null || m.e(a3)) {
                                                                                    unsafe2.putInt(o2, n21, a3);
                                                                                    n6 = (n24 | n23);
                                                                                }
                                                                                else {
                                                                                    O(o).e(n32, (long)a3);
                                                                                    n6 = n24;
                                                                                }
                                                                                n8 = n18;
                                                                                n33 = i;
                                                                                n34 = n11;
                                                                                n2 = n;
                                                                                i = o3;
                                                                                n3 = n30;
                                                                                n7 = x;
                                                                                n4 = n34;
                                                                                n5 = n33;
                                                                                continue Label_0680_Outer;
                                                                            }
                                                                            break Label_1504;
                                                                        }
                                                                        case 10: {
                                                                            n35 = a;
                                                                            p12 = p7;
                                                                            unsafe3 = s;
                                                                            if (n9 == 2) {
                                                                                offset = com.google.android.gms.internal.measurement.n3.j(array, d, p12);
                                                                                unsafe3.putObject(o2, n21, p12.c);
                                                                                n36 = (n24 | n23);
                                                                                n37 = n;
                                                                                n38 = n11;
                                                                                p7 = p12;
                                                                                unsafe4 = unsafe3;
                                                                                n3 = n35;
                                                                                n7 = x;
                                                                                n4 = n38;
                                                                                n5 = i;
                                                                                break Label_0703;
                                                                            }
                                                                            break Label_0982;
                                                                        }
                                                                        case 9: {
                                                                            n39 = n11;
                                                                            if (n9 == 2) {
                                                                                p13 = this.p(o2, n39);
                                                                                offset = com.google.android.gms.internal.measurement.n3.i(p13, this.N(n39), array, d, n, p6);
                                                                                this.x(o2, n39, p13);
                                                                                n36 = (n24 | n23);
                                                                                unsafe4 = s;
                                                                                n37 = n;
                                                                                n3 = a;
                                                                                break Label_0688;
                                                                            }
                                                                            break Label_0982;
                                                                        }
                                                                        case 8: {
                                                                            p14 = p7;
                                                                            n40 = d;
                                                                            if (n9 == 2) {
                                                                                if (S(n19)) {
                                                                                    offset = com.google.android.gms.internal.measurement.n3.m(array, n40, p14);
                                                                                }
                                                                                else {
                                                                                    offset = com.google.android.gms.internal.measurement.n3.o(array, n40, p14);
                                                                                    a4 = p14.a;
                                                                                    if (a4 < 0) {
                                                                                        throw k4.d();
                                                                                    }
                                                                                    if (a4 == 0) {
                                                                                        p14.c = "";
                                                                                    }
                                                                                    else {
                                                                                        p14.c = new String(array, offset, a4, com.google.android.gms.internal.measurement.a4.b);
                                                                                        offset += a4;
                                                                                    }
                                                                                }
                                                                                s.putObject(o2, n21, p14.c);
                                                                                break Label_1178;
                                                                            }
                                                                            break Label_1196;
                                                                        }
                                                                        case 7: {
                                                                            p15 = p7;
                                                                            if (n9 == 0) {
                                                                                offset = com.google.android.gms.internal.measurement.n3.p(array, d, p15);
                                                                                D5.v(o2, n21, p15.b != 0L);
                                                                                break Label_1178;
                                                                            }
                                                                            break Label_1196;
                                                                        }
                                                                        case 6:
                                                                        case 13: {
                                                                            n41 = d;
                                                                            if (n9 == 5) {
                                                                                s.putInt(o2, n21, com.google.android.gms.internal.measurement.n3.n(array, n41));
                                                                                offset = n41 + 4;
                                                                                break Label_1178;
                                                                            }
                                                                            break Label_1196;
                                                                        }
                                                                        case 5:
                                                                        case 14: {
                                                                            n42 = d;
                                                                            unsafe4 = s;
                                                                            if (n9 == 1) {
                                                                                unsafe4.putLong(o, n21, com.google.android.gms.internal.measurement.n3.q(array, n42));
                                                                                offset = n42 + 8;
                                                                                n36 = (n24 | n23);
                                                                                n37 = n;
                                                                                n3 = a;
                                                                                break Label_0688;
                                                                            }
                                                                            break Label_1196;
                                                                        }
                                                                        case 4:
                                                                        case 11: {
                                                                            p16 = p7;
                                                                            if (n9 == 0) {
                                                                                offset = com.google.android.gms.internal.measurement.n3.o(array, d, p16);
                                                                                s.putInt(o2, n21, p16.a);
                                                                                break Label_1178;
                                                                            }
                                                                            break Label_1196;
                                                                        }
                                                                        case 2:
                                                                        case 3: {
                                                                            p17 = p7;
                                                                            unsafe5 = s;
                                                                            if (n9 == 0) {
                                                                                n26 = com.google.android.gms.internal.measurement.n3.p(array, d, p17);
                                                                                unsafe5.putLong(o, n21, p17.b);
                                                                                n27 = (n24 | n23);
                                                                                break Label_0571;
                                                                            }
                                                                            break Label_1196;
                                                                        }
                                                                        case 1: {
                                                                            n28 = a;
                                                                            n43 = d;
                                                                            n29 = i;
                                                                            if (n9 == 5) {
                                                                                D5.g(o2, n21, com.google.android.gms.internal.measurement.n3.l(array, n43));
                                                                                offset = n43 + 4;
                                                                                break Label_0661;
                                                                            }
                                                                            break Label_1504;
                                                                        }
                                                                        case 0: {
                                                                            n28 = a;
                                                                            n44 = d;
                                                                            n29 = i;
                                                                            if (n9 == 1) {
                                                                                D5.f(o2, n21, com.google.android.gms.internal.measurement.n3.a(array, n44));
                                                                                offset = n44 + 8;
                                                                                break Label_0661;
                                                                            }
                                                                            break Label_1504;
                                                                        }
                                                                    }
                                                                    n28 = a;
                                                                    n29 = i;
                                                                    break Label_1504;
                                                                }
                                                                n8 = n18;
                                                                n45 = i;
                                                                n4 = n11;
                                                                n3 = a;
                                                                n2 = n;
                                                                i = n26;
                                                                n7 = x;
                                                                n5 = n45;
                                                                n6 = n27;
                                                                continue Label_0680_Outer;
                                                            }
                                                            n46 = a;
                                                            n47 = (n24 | n23);
                                                            n3 = n46;
                                                            n36 = n47;
                                                            unsafe4 = s;
                                                            n37 = n;
                                                        }
                                                        n48 = x;
                                                        n5 = i;
                                                        n4 = n11;
                                                        n7 = n48;
                                                    }
                                                    n49 = n18;
                                                    i = offset;
                                                    n6 = n36;
                                                    s = unsafe4;
                                                    n2 = n37;
                                                    n8 = n49;
                                                    continue Label_0680_Outer;
                                                }
                                                n28 = a;
                                                n29 = i;
                                                break Label_1504;
                                            }
                                            n36 = (n24 | n23);
                                            n3 = a;
                                            continue Label_4211_Outer;
                                        }
                                    }
                                    n28 = a;
                                    n29 = i;
                                }
                                i = d;
                                n17 = n11;
                                n50 = x;
                                n5 = n29;
                                n15 = n;
                                n16 = i;
                                p8 = p7;
                                i = n28;
                                n6 = n24;
                                n14 = n50;
                                unsafe = s;
                                break Label_5558;
                            }
                            n3 = a;
                            n51 = n8;
                            p8 = p7;
                            n52 = d;
                            n53 = 10;
                            if (n20 == 27) {
                                if (n9 == 2) {
                                    h2 = (e = (h4)s.getObject(o2, n21));
                                    if (!h2.c()) {
                                        size = h2.size();
                                        if (size != 0) {
                                            n53 = size << 1;
                                        }
                                        e = h2.e(n53);
                                        s.putObject(o2, n21, e);
                                    }
                                    e2 = com.google.android.gms.internal.measurement.n3.e(this.N(n11), i, array, n52, n, e, p6);
                                    n2 = n;
                                    n54 = n11;
                                    n7 = x;
                                    n5 = i;
                                    n8 = n51;
                                    p7 = p8;
                                    i = e2;
                                    n4 = n54;
                                    continue Label_4211_Outer;
                                }
                            }
                            else if (n20 <= 49) {
                                n55 = n19;
                                s2 = M4.s;
                                h3 = (e3 = (h4)s2.getObject(o2, n21));
                                if (!h3.c()) {
                                    size2 = h3.size();
                                    if (size2 != 0) {
                                        n53 = size2 << 1;
                                    }
                                    e3 = h3.e(n53);
                                    s2.putObject(o2, n21, e3);
                                }
                                Label_4130: {
                                    Label_4121: {
                                        Label_3456: {
                                            Label_3187: {
                                                Label_2753: {
                                                    Label_2282: {
                                                        Label_2082: {
                                                            switch (n20) {
                                                                default: {
                                                                    n17 = n11;
                                                                    n56 = i;
                                                                    i = n52;
                                                                    p7 = p8;
                                                                    break Label_4121;
                                                                }
                                                                case 49: {
                                                                    if (n9 != 3) {
                                                                        n17 = n11;
                                                                        n56 = i;
                                                                        i = n52;
                                                                        p7 = p8;
                                                                        break Label_4121;
                                                                    }
                                                                    n57 = this.N(n11);
                                                                    n58 = i;
                                                                    n59 = ((n58 & 0xFFFFFFF8) | 0x4);
                                                                    n60 = com.google.android.gms.internal.measurement.n3.f(n57, array, n52, n, n59, p6);
                                                                    while (true) {
                                                                        e3.add(p8.c);
                                                                        j = n60;
                                                                        if (n60 >= n) {
                                                                            break Label_2082;
                                                                        }
                                                                        o4 = com.google.android.gms.internal.measurement.n3.o(array, n60, p8);
                                                                        j = n60;
                                                                        if (n58 != p8.a) {
                                                                            break Label_2082;
                                                                        }
                                                                        n60 = com.google.android.gms.internal.measurement.n3.f(n57, array, o4, n, n59, p6);
                                                                    }
                                                                    break;
                                                                }
                                                                case 34:
                                                                case 48: {
                                                                    if (n9 == 2) {
                                                                        w4 = (w4)e3;
                                                                        j = com.google.android.gms.internal.measurement.n3.o(array, n52, p8);
                                                                        n61 = p8.a + j;
                                                                        while (j < n61) {
                                                                            j = com.google.android.gms.internal.measurement.n3.p(array, j, p8);
                                                                            w4.d(G3.b(p8.b));
                                                                        }
                                                                        if (j == n61) {
                                                                            break;
                                                                        }
                                                                        throw k4.f();
                                                                    }
                                                                    else {
                                                                        if (n9 != 0) {
                                                                            break Label_2282;
                                                                        }
                                                                        w5 = (w4)e3;
                                                                        n62 = com.google.android.gms.internal.measurement.n3.p(array, n52, p8);
                                                                        while (true) {
                                                                            w5.d(G3.b(p8.b));
                                                                            j = n62;
                                                                            if (n62 >= n) {
                                                                                break Label_2082;
                                                                            }
                                                                            o5 = com.google.android.gms.internal.measurement.n3.o(array, n62, p8);
                                                                            j = n62;
                                                                            if (i != p8.a) {
                                                                                break Label_2082;
                                                                            }
                                                                            n62 = com.google.android.gms.internal.measurement.n3.p(array, o5, p8);
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                case 33:
                                                                case 47: {
                                                                    if (n9 == 2) {
                                                                        c4 = (c4)e3;
                                                                        j = com.google.android.gms.internal.measurement.n3.o(array, n52, p8);
                                                                        n63 = p8.a + j;
                                                                        while (j < n63) {
                                                                            j = com.google.android.gms.internal.measurement.n3.o(array, j, p8);
                                                                            c4.g(G3.e(p8.a));
                                                                        }
                                                                        if (j == n63) {
                                                                            break;
                                                                        }
                                                                        throw k4.f();
                                                                    }
                                                                    else {
                                                                        if (n9 != 0) {
                                                                            break Label_2282;
                                                                        }
                                                                        c5 = (c4)e3;
                                                                        n64 = com.google.android.gms.internal.measurement.n3.o(array, n52, p8);
                                                                        while (true) {
                                                                            c5.g(G3.e(p8.a));
                                                                            j = n64;
                                                                            if (n64 >= n) {
                                                                                break Label_2082;
                                                                            }
                                                                            o6 = com.google.android.gms.internal.measurement.n3.o(array, n64, p8);
                                                                            j = n64;
                                                                            if (i != p8.a) {
                                                                                break Label_2082;
                                                                            }
                                                                            n64 = com.google.android.gms.internal.measurement.n3.o(array, o6, p8);
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                case 30:
                                                                case 44: {
                                                                    if (n9 == 2) {
                                                                        j = com.google.android.gms.internal.measurement.n3.k(array, n52, e3, p8);
                                                                    }
                                                                    else {
                                                                        if (n9 != 0) {
                                                                            break Label_2282;
                                                                        }
                                                                        j = com.google.android.gms.internal.measurement.n3.b(i, array, n52, n, e3, p6);
                                                                    }
                                                                    com.google.android.gms.internal.measurement.a5.h(o, x, e3, this.M(n11), null, this.o);
                                                                    break;
                                                                }
                                                                case 28: {
                                                                    if (n9 != 2) {
                                                                        break Label_2282;
                                                                    }
                                                                    o7 = com.google.android.gms.internal.measurement.n3.o(array, n52, p8);
                                                                    a5 = p8.a;
                                                                    if (a5 < 0) {
                                                                        throw k4.d();
                                                                    }
                                                                    if (a5 > array.length - o7) {
                                                                        throw k4.f();
                                                                    }
                                                                    n65 = o7;
                                                                Label_2583_Outer:
                                                                    while (true) {
                                                                        if ((n66 = a5) != 0) {
                                                                            break Label_2597;
                                                                        }
                                                                        n67 = o7;
                                                                        while (true) {
                                                                            e3.add(com.google.android.gms.internal.measurement.q3.p);
                                                                            Label_2620: {
                                                                                break Label_2620;
                                                                                e3.add(com.google.android.gms.internal.measurement.q3.q(array, n65, n66));
                                                                                n67 = n65 + n66;
                                                                            }
                                                                            j = n67;
                                                                            if (n67 >= n) {
                                                                                break;
                                                                            }
                                                                            o8 = com.google.android.gms.internal.measurement.n3.o(array, n67, p8);
                                                                            j = n67;
                                                                            if (i != p8.a) {
                                                                                break;
                                                                            }
                                                                            o9 = com.google.android.gms.internal.measurement.n3.o(array, o8, p8);
                                                                            a6 = p8.a;
                                                                            if (a6 < 0) {
                                                                                throw k4.d();
                                                                            }
                                                                            if (a6 > array.length - o9) {
                                                                                throw k4.f();
                                                                            }
                                                                            n65 = o9;
                                                                            if ((n66 = a6) == 0) {
                                                                                n67 = o9;
                                                                                continue Label_4211_Outer;
                                                                            }
                                                                            break;
                                                                        }
                                                                        continue Label_2583_Outer;
                                                                    }
                                                                }
                                                                case 27: {
                                                                    n68 = i;
                                                                    if (n9 == 2) {
                                                                        k = com.google.android.gms.internal.measurement.n3.e(this.N(n11), n68, array, n52, n, e3, p6);
                                                                        break Label_2753;
                                                                    }
                                                                    break Label_2282;
                                                                }
                                                                case 26: {
                                                                    n69 = n;
                                                                    p18 = p8;
                                                                    n70 = i;
                                                                    if (n9 != 2) {
                                                                        break Label_3187;
                                                                    }
                                                                    if ((n55 & 0x20000000L) == 0x0L) {
                                                                        n71 = com.google.android.gms.internal.measurement.n3.o(array, n52, p18);
                                                                        n72 = p18.a;
                                                                        if (n72 < 0) {
                                                                            throw k4.d();
                                                                        }
                                                                    Label_2837_Outer:
                                                                        while (true) {
                                                                            if (n72 != 0) {
                                                                                s3 = new String(array, n71, n72, com.google.android.gms.internal.measurement.a4.b);
                                                                                break Label_2868;
                                                                            }
                                                                            while (true) {
                                                                                e3.add("");
                                                                                Label_2885: {
                                                                                    break Label_2885;
                                                                                    e3.add((q3)s3);
                                                                                    n71 += n72;
                                                                                }
                                                                                k = n71;
                                                                                if (n71 >= n69) {
                                                                                    break Label_2753;
                                                                                }
                                                                                o10 = com.google.android.gms.internal.measurement.n3.o(array, n71, p18);
                                                                                k = n71;
                                                                                if (n70 != p18.a) {
                                                                                    break Label_2753;
                                                                                }
                                                                                n71 = com.google.android.gms.internal.measurement.n3.o(array, o10, p18);
                                                                                n72 = p18.a;
                                                                                if (n72 < 0) {
                                                                                    throw k4.d();
                                                                                }
                                                                                if (n72 == 0) {
                                                                                    continue Label_4211_Outer;
                                                                                }
                                                                                break;
                                                                            }
                                                                            s3 = new String(array, n71, n72, com.google.android.gms.internal.measurement.a4.b);
                                                                            continue Label_2837_Outer;
                                                                        }
                                                                    }
                                                                    else {
                                                                        n73 = com.google.android.gms.internal.measurement.n3.o(array, n52, p18);
                                                                        a7 = p18.a;
                                                                        if (a7 < 0) {
                                                                            throw k4.d();
                                                                        }
                                                                    Label_3005_Outer:
                                                                        while (true) {
                                                                            if (a7 != 0) {
                                                                                n74 = n73 + a7;
                                                                                if (E5.f(array, n73, n74)) {
                                                                                    s4 = new String(array, n73, a7, com.google.android.gms.internal.measurement.a4.b);
                                                                                    break Label_3054;
                                                                                }
                                                                                throw k4.c();
                                                                            }
                                                                            while (true) {
                                                                                e3.add("");
                                                                                Label_3068: {
                                                                                    break Label_3068;
                                                                                    e3.add((q3)s4);
                                                                                    n73 = n74;
                                                                                }
                                                                                k = n73;
                                                                                if (n73 >= n69) {
                                                                                    break Label_2753;
                                                                                }
                                                                                o11 = com.google.android.gms.internal.measurement.n3.o(array, n73, p18);
                                                                                k = n73;
                                                                                if (n70 != p18.a) {
                                                                                    break Label_2753;
                                                                                }
                                                                                n73 = com.google.android.gms.internal.measurement.n3.o(array, o11, p18);
                                                                                a8 = p18.a;
                                                                                if (a8 < 0) {
                                                                                    throw k4.d();
                                                                                }
                                                                                if (a8 == 0) {
                                                                                    continue Label_4211_Outer;
                                                                                }
                                                                                break;
                                                                            }
                                                                            n74 = n73 + a8;
                                                                            if (E5.f(array, n73, n74)) {
                                                                                s4 = new String(array, n73, a8, com.google.android.gms.internal.measurement.a4.b);
                                                                                continue Label_3005_Outer;
                                                                            }
                                                                            break;
                                                                        }
                                                                        throw k4.c();
                                                                    }
                                                                    break;
                                                                }
                                                                case 25:
                                                                case 42: {
                                                                    if (n9 == 2) {
                                                                        a.a(e3);
                                                                        k = com.google.android.gms.internal.measurement.n3.o(array, n52, p8);
                                                                        n75 = p8.a + k;
                                                                        if (k < n75) {
                                                                            com.google.android.gms.internal.measurement.n3.p(array, k, p8);
                                                                            throw null;
                                                                        }
                                                                        if (k == n75) {
                                                                            break Label_2753;
                                                                        }
                                                                        throw k4.f();
                                                                    }
                                                                    else {
                                                                        if (n9 != 0) {
                                                                            break Label_3187;
                                                                        }
                                                                        a.a(e3);
                                                                        com.google.android.gms.internal.measurement.n3.p(array, n52, p8);
                                                                        b2 = p8.b;
                                                                        throw null;
                                                                    }
                                                                    break;
                                                                }
                                                                case 24:
                                                                case 31:
                                                                case 41:
                                                                case 45: {
                                                                    if (n9 == 2) {
                                                                        c6 = (c4)e3;
                                                                        for (k = com.google.android.gms.internal.measurement.n3.o(array, n52, p8), n76 = p8.a + k; k < n76; k += 4) {
                                                                            c6.g(com.google.android.gms.internal.measurement.n3.n(array, k));
                                                                        }
                                                                        if (k == n76) {
                                                                            break Label_2753;
                                                                        }
                                                                        throw k4.f();
                                                                    }
                                                                    else {
                                                                        if (n9 != 5) {
                                                                            break Label_3187;
                                                                        }
                                                                        c7 = (c4)e3;
                                                                        c7.g(com.google.android.gms.internal.measurement.n3.n(array, n52));
                                                                        n77 = n52 + 4;
                                                                        while (true) {
                                                                            n78 = n77;
                                                                            if (n77 >= n) {
                                                                                break Label_3456;
                                                                            }
                                                                            o12 = com.google.android.gms.internal.measurement.n3.o(array, n77, p8);
                                                                            n78 = n77;
                                                                            if (i != p8.a) {
                                                                                break Label_3456;
                                                                            }
                                                                            c7.g(com.google.android.gms.internal.measurement.n3.n(array, o12));
                                                                            n77 = o12 + 4;
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                case 23:
                                                                case 32:
                                                                case 40:
                                                                case 46: {
                                                                    if (n9 == 2) {
                                                                        w6 = (w4)e3;
                                                                        for (k = com.google.android.gms.internal.measurement.n3.o(array, n52, p8), n79 = p8.a + k; k < n79; k += 8) {
                                                                            w6.d(com.google.android.gms.internal.measurement.n3.q(array, k));
                                                                        }
                                                                        if (k == n79) {
                                                                            break Label_2753;
                                                                        }
                                                                        throw k4.f();
                                                                    }
                                                                    else {
                                                                        if (n9 != 1) {
                                                                            break Label_3187;
                                                                        }
                                                                        w7 = (w4)e3;
                                                                        w7.d(com.google.android.gms.internal.measurement.n3.q(array, n52));
                                                                        n80 = n52 + 8;
                                                                        while (true) {
                                                                            n78 = n80;
                                                                            if (n80 >= n) {
                                                                                break Label_3456;
                                                                            }
                                                                            o13 = com.google.android.gms.internal.measurement.n3.o(array, n80, p8);
                                                                            n78 = n80;
                                                                            if (i != p8.a) {
                                                                                break Label_3456;
                                                                            }
                                                                            w7.d(com.google.android.gms.internal.measurement.n3.q(array, o13));
                                                                            n80 = o13 + 8;
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                case 22:
                                                                case 29:
                                                                case 39:
                                                                case 43: {
                                                                    n81 = n52;
                                                                    n82 = i;
                                                                    if (n9 == 2) {
                                                                        k = com.google.android.gms.internal.measurement.n3.k(array, n81, e3, p8);
                                                                        break Label_2753;
                                                                    }
                                                                    if (n9 == 0) {
                                                                        p7 = p8;
                                                                        n52 = n81;
                                                                        n83 = n82;
                                                                        n84 = n11;
                                                                        i = com.google.android.gms.internal.measurement.n3.b(n82, array, n81, n, e3, p6);
                                                                        n56 = n83;
                                                                        n17 = n84;
                                                                        break Label_4130;
                                                                    }
                                                                    break Label_3187;
                                                                }
                                                                case 20:
                                                                case 21:
                                                                case 37:
                                                                case 38: {
                                                                    n85 = n11;
                                                                    n86 = n52;
                                                                    n87 = i;
                                                                    if (n9 == 2) {
                                                                        w8 = (w4)e3;
                                                                        i = com.google.android.gms.internal.measurement.n3.o(array, n86, p8);
                                                                        n88 = p8.a + i;
                                                                        while (i < n88) {
                                                                            i = com.google.android.gms.internal.measurement.n3.p(array, i, p8);
                                                                            w8.d(p8.b);
                                                                        }
                                                                        if (i == n88) {
                                                                            n56 = n87;
                                                                            n17 = n85;
                                                                            n52 = n86;
                                                                            p7 = p8;
                                                                            break Label_4130;
                                                                        }
                                                                        throw k4.f();
                                                                    }
                                                                    else {
                                                                        n56 = n87;
                                                                        n17 = n85;
                                                                        i = n86;
                                                                        p7 = p8;
                                                                        if (n9 != 0) {
                                                                            break Label_4121;
                                                                        }
                                                                        w9 = (w4)e3;
                                                                        n89 = com.google.android.gms.internal.measurement.n3.p(array, n86, p8);
                                                                        while (true) {
                                                                            w9.d(p8.b);
                                                                            i = n89;
                                                                            n56 = n87;
                                                                            n17 = n85;
                                                                            n52 = n86;
                                                                            p7 = p8;
                                                                            if (n89 >= n) {
                                                                                break Label_4130;
                                                                            }
                                                                            o14 = com.google.android.gms.internal.measurement.n3.o(array, n89, p8);
                                                                            i = n89;
                                                                            n56 = n87;
                                                                            n17 = n85;
                                                                            n52 = n86;
                                                                            p7 = p8;
                                                                            if (n87 != p8.a) {
                                                                                break Label_4130;
                                                                            }
                                                                            n89 = com.google.android.gms.internal.measurement.n3.p(array, o14, p8);
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                case 19:
                                                                case 36: {
                                                                    n17 = n11;
                                                                    n56 = i;
                                                                    if (n9 == 2) {
                                                                        a.a(e3);
                                                                        i = com.google.android.gms.internal.measurement.n3.o(array, n52, p8);
                                                                        n90 = p8.a + i;
                                                                        if (i < n90) {
                                                                            com.google.android.gms.internal.measurement.n3.l(array, i);
                                                                            throw null;
                                                                        }
                                                                        if (i == n90) {
                                                                            p7 = p8;
                                                                            break Label_4130;
                                                                        }
                                                                        throw k4.f();
                                                                    }
                                                                    else {
                                                                        if (n9 != 5) {
                                                                            i = n52;
                                                                            p7 = p8;
                                                                            break Label_4121;
                                                                        }
                                                                        a.a(e3);
                                                                        com.google.android.gms.internal.measurement.n3.l(array, n52);
                                                                        throw null;
                                                                    }
                                                                    break;
                                                                }
                                                                case 18:
                                                                case 35: {
                                                                    n17 = n11;
                                                                    n56 = i;
                                                                    if (n9 == 2) {
                                                                        a.a(e3);
                                                                        i = com.google.android.gms.internal.measurement.n3.o(array, n52, p8);
                                                                        n91 = p8.a + i;
                                                                        if (i < n91) {
                                                                            com.google.android.gms.internal.measurement.n3.a(array, i);
                                                                            throw null;
                                                                        }
                                                                        if (i == n91) {
                                                                            p7 = p8;
                                                                            break Label_4130;
                                                                        }
                                                                        throw k4.f();
                                                                    }
                                                                    else {
                                                                        if (n9 != 1) {
                                                                            p7 = p8;
                                                                            i = n52;
                                                                            break Label_4121;
                                                                        }
                                                                        a.a(e3);
                                                                        com.google.android.gms.internal.measurement.n3.a(array, n52);
                                                                        throw null;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        n92 = n11;
                                                        n56 = i;
                                                        i = j;
                                                        n17 = n92;
                                                        p7 = p8;
                                                        break Label_4130;
                                                    }
                                                    n17 = n11;
                                                    n56 = i;
                                                    i = n52;
                                                    p7 = p8;
                                                    break Label_4121;
                                                }
                                                n93 = k;
                                                n52 = d;
                                                n94 = i;
                                                n95 = n11;
                                                i = n93;
                                                n56 = n94;
                                                n17 = n95;
                                                break Label_4130;
                                            }
                                            n96 = d;
                                            n17 = n11;
                                            n56 = i;
                                            i = n96;
                                            break Label_4121;
                                        }
                                        n97 = d;
                                        n98 = i;
                                        n99 = n11;
                                        i = n78;
                                        n56 = n98;
                                        n17 = n99;
                                        n52 = n97;
                                        break Label_4130;
                                    }
                                    n100 = i;
                                    n52 = i;
                                    i = n100;
                                }
                                n2 = n;
                                if (i == n52) {
                                    n101 = n2;
                                    n102 = n56;
                                    n14 = x;
                                    o2 = o;
                                    n103 = a;
                                    n16 = i;
                                    p8 = p7;
                                    n15 = n101;
                                    i = n103;
                                    n5 = n102;
                                    n18 = n51;
                                    unsafe = s;
                                    break Label_5558;
                                }
                                n3 = a;
                                n104 = x;
                                n8 = n51;
                                o2 = o;
                                n5 = n56;
                                n7 = n104;
                                break Label_4211;
                            }
                            else {
                                unsafe6 = s;
                                n105 = n11;
                                n106 = n52;
                                n107 = i;
                                if (n20 == 50) {
                                    if (n9 == 2) {
                                        s5 = M4.s;
                                        q = this.Q(n105);
                                        o15 = (x2 = s5.getObject(o, n21));
                                        if (this.q.g(o15)) {
                                            x2 = this.q.f(q);
                                            this.q.d(x2, o15);
                                            s5.putObject(o, n21, x2);
                                        }
                                        this.q.b(q);
                                        this.q.h(x2);
                                        i = com.google.android.gms.internal.measurement.n3.o(array, n106, p8);
                                        a = p8.a;
                                        if (a >= 0 && a <= n - i) {
                                            throw null;
                                        }
                                        throw k4.f();
                                    }
                                    else {
                                        o2 = o;
                                    }
                                }
                                else {
                                    o2 = o;
                                    s6 = M4.s;
                                    offset2 = (a2[n105 + 2] & 0xFFFFF);
                                    Label_5510: {
                                        Label_5507: {
                                            while (true) {
                                                Label_5310: {
                                                    Label_5232: {
                                                    Label_4688:
                                                        while (true) {
                                                            Label_4743: {
                                                            Label_4701:
                                                                while (true) {
                                                                    switch (n20) {
                                                                        case 68: {
                                                                            if (n9 == 3) {
                                                                                q2 = this.q(o2, x, n105);
                                                                                i = com.google.android.gms.internal.measurement.n3.h(q2, this.N(n105), array, n106, n, (n107 & 0xFFFFFFF8) | 0x4, p6);
                                                                                this.w(o2, x, n105, q2);
                                                                                n108 = n107;
                                                                                n109 = x;
                                                                                break Label_4635;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case 67: {
                                                                            if (n9 == 0) {
                                                                                n110 = com.google.android.gms.internal.measurement.n3.p(array, n106, p8);
                                                                                s6.putObject(o2, n21, G3.b(p8.b));
                                                                                s6.putInt(o2, offset2, x);
                                                                                break Label_4688;
                                                                            }
                                                                            break Label_4701;
                                                                        }
                                                                        case 66: {
                                                                            if (n9 == 0) {
                                                                                n110 = com.google.android.gms.internal.measurement.n3.o(array, n106, p8);
                                                                                x3 = G3.e(p8.a);
                                                                                break Label_4743;
                                                                            }
                                                                            break Label_4701;
                                                                        }
                                                                        case 63: {
                                                                            if (n9 != 0) {
                                                                                break Label_4701;
                                                                            }
                                                                            o16 = com.google.android.gms.internal.measurement.n3.o(array, n106, p8);
                                                                            a9 = p8.a;
                                                                            l = this.M(n105);
                                                                            if (l != null && !l.e(a9)) {
                                                                                O(o).e(n107, (long)a9);
                                                                                n110 = o16;
                                                                                break Label_4688;
                                                                            }
                                                                            x3 = a9;
                                                                            n110 = o16;
                                                                            break Label_4743;
                                                                        }
                                                                        case 61: {
                                                                            if (n9 == 2) {
                                                                                n110 = com.google.android.gms.internal.measurement.n3.j(array, n106, p8);
                                                                                x3 = p8.c;
                                                                                break Label_4743;
                                                                            }
                                                                            break Label_4701;
                                                                        }
                                                                        case 60: {
                                                                            n111 = x;
                                                                            if (n9 == 2) {
                                                                                q3 = this.q(o2, n111, n105);
                                                                                n112 = this.N(n105);
                                                                                n113 = n107;
                                                                                i = com.google.android.gms.internal.measurement.n3.i(q3, n112, array, n106, n, p6);
                                                                                this.w(o2, n111, n105, q3);
                                                                                n109 = n111;
                                                                                n108 = n113;
                                                                                break Label_5510;
                                                                            }
                                                                            break Label_4701;
                                                                        }
                                                                        case 59: {
                                                                            p19 = p8;
                                                                            n114 = n107;
                                                                            p8 = p19;
                                                                            n109 = x;
                                                                            n108 = n114;
                                                                            if (n9 == 2) {
                                                                                i = com.google.android.gms.internal.measurement.n3.o(array, n106, p19);
                                                                                a10 = p19.a;
                                                                                if (a10 == 0) {
                                                                                    s6.putObject(o2, n21, "");
                                                                                }
                                                                                else {
                                                                                    if ((n19 & 0x20000000) != 0x0 && !E5.f(array, i, i + a10)) {
                                                                                        throw k4.c();
                                                                                    }
                                                                                    s6.putObject(o2, n21, new String(array, i, a10, com.google.android.gms.internal.measurement.a4.b));
                                                                                    i += a10;
                                                                                }
                                                                                s6.putInt(o2, offset2, x);
                                                                                p8 = p19;
                                                                                n109 = x;
                                                                                n108 = n114;
                                                                                break Label_5510;
                                                                            }
                                                                            break Label_5507;
                                                                        }
                                                                        case 58: {
                                                                            p20 = p8;
                                                                            n115 = x;
                                                                            n116 = n107;
                                                                            p8 = p20;
                                                                            n109 = n115;
                                                                            n108 = n116;
                                                                            if (n9 == 0) {
                                                                                n117 = com.google.android.gms.internal.measurement.n3.p(array, n106, p20);
                                                                                x4 = (p20.b != 0L);
                                                                                break Label_4688;
                                                                            }
                                                                            break Label_5507;
                                                                        }
                                                                        case 57:
                                                                        case 64: {
                                                                            n118 = x;
                                                                            n119 = n107;
                                                                            n109 = n118;
                                                                            n108 = n119;
                                                                            if (n9 == 5) {
                                                                                x5 = com.google.android.gms.internal.measurement.n3.n(array, n106);
                                                                                break Label_5232;
                                                                            }
                                                                            break Label_5507;
                                                                        }
                                                                        case 56:
                                                                        case 65: {
                                                                            n120 = x;
                                                                            n121 = n107;
                                                                            n109 = n120;
                                                                            n108 = n121;
                                                                            if (n9 == 1) {
                                                                                x6 = com.google.android.gms.internal.measurement.n3.q(array, n106);
                                                                                break Label_5310;
                                                                            }
                                                                            break Label_5507;
                                                                        }
                                                                        case 55:
                                                                        case 62: {
                                                                            p21 = p8;
                                                                            n122 = x;
                                                                            n123 = n107;
                                                                            p8 = p21;
                                                                            n109 = n122;
                                                                            n108 = n123;
                                                                            if (n9 == 0) {
                                                                                n117 = com.google.android.gms.internal.measurement.n3.o(array, n106, p21);
                                                                                x4 = p21.a;
                                                                                break Label_4688;
                                                                            }
                                                                            break Label_5507;
                                                                        }
                                                                        case 53:
                                                                        case 54: {
                                                                            p22 = p8;
                                                                            n124 = x;
                                                                            n125 = n107;
                                                                            p8 = p22;
                                                                            n109 = n124;
                                                                            n108 = n125;
                                                                            if (n9 == 0) {
                                                                                n117 = com.google.android.gms.internal.measurement.n3.p(array, n106, p22);
                                                                                x4 = p22.b;
                                                                                break Label_4688;
                                                                            }
                                                                            break Label_5507;
                                                                        }
                                                                        case 52: {
                                                                            n126 = x;
                                                                            n127 = n107;
                                                                            n109 = n126;
                                                                            n108 = n127;
                                                                            if (n9 == 5) {
                                                                                x5 = com.google.android.gms.internal.measurement.n3.l(array, n106);
                                                                                break Label_5232;
                                                                            }
                                                                            break Label_5507;
                                                                        }
                                                                        case 51: {
                                                                            n128 = x;
                                                                            n129 = n107;
                                                                            n109 = n128;
                                                                            n108 = n129;
                                                                            if (n9 == 1) {
                                                                                x6 = com.google.android.gms.internal.measurement.n3.a(array, n106);
                                                                                break Label_5310;
                                                                            }
                                                                            break Label_5507;
                                                                        }
                                                                    }
                                                                    n108 = n107;
                                                                    n109 = x;
                                                                    break Label_5507;
                                                                    p8 = p7;
                                                                    break Label_5510;
                                                                    n108 = i;
                                                                    i = n110;
                                                                    n109 = x;
                                                                    continue Label_4688_Outer;
                                                                }
                                                                p8 = p7;
                                                                n109 = x;
                                                                n108 = i;
                                                                break Label_5507;
                                                            }
                                                            s6.putObject(o2, n21, x3);
                                                            s6.putInt(o2, offset2, x);
                                                            continue Label_4688;
                                                        }
                                                        n108 = i;
                                                        s6.putObject(o2, n21, x4);
                                                        s6.putInt(o2, offset2, x);
                                                        i = n117;
                                                        p8 = p7;
                                                        n109 = x;
                                                        break Label_5510;
                                                    }
                                                    s6.putObject(o2, n21, x5);
                                                    n130 = d + 4;
                                                    n108 = i;
                                                    s6.putInt(o2, offset2, x);
                                                    i = n130;
                                                    p8 = p7;
                                                    n109 = x;
                                                    break Label_5510;
                                                }
                                                s6.putObject(o2, n21, x6);
                                                n130 = d + 8;
                                                continue;
                                            }
                                        }
                                        i = d;
                                    }
                                    n131 = n11;
                                    n15 = n;
                                    if (i == d) {
                                        n132 = a;
                                        n133 = i;
                                        n17 = n131;
                                        n5 = n108;
                                        unsafe = unsafe6;
                                        n18 = n51;
                                        n14 = n109;
                                        i = n132;
                                        n16 = n133;
                                        break Label_5558;
                                    }
                                    n134 = n108;
                                    p7 = p6;
                                    n2 = n15;
                                    n7 = n109;
                                    n8 = n51;
                                    s = unsafe6;
                                    n4 = n131;
                                    n5 = n134;
                                    break Label_0523;
                                }
                            }
                            unsafe = s;
                            n135 = a;
                            n136 = i;
                            n14 = x;
                            n137 = n11;
                            n15 = n;
                            n16 = d;
                            i = n135;
                            n17 = n137;
                            n5 = n136;
                            n18 = n51;
                            break Label_5558;
                        }
                        n3 = a;
                        continue Label_4211_Outer;
                        n4 = n17;
                        continue Label_4211_Outer;
                    }
                    if (n5 != i || i == 0) {
                        while (true) {
                            Label_5685: {
                                if (!this.f) {
                                    break Label_5685;
                                }
                                d2 = p8.d;
                                if (d2 == M3.c) {
                                    break Label_5685;
                                }
                                d2.b(this.e, n14);
                                n138 = com.google.android.gms.internal.measurement.n3.c(n5, array, n16, n, O(o), p6);
                                n139 = i;
                                n140 = n14;
                                n141 = n18;
                                s = unsafe;
                                i = n138;
                                p7 = p6;
                                n2 = n15;
                                n3 = n139;
                                n7 = n140;
                                n8 = n141;
                                continue Label_5640_Outer;
                            }
                            n138 = com.google.android.gms.internal.measurement.n3.c(n5, array, n16, n, O(o), p6);
                            continue;
                        }
                    }
                    break;
                }
                a = n15;
                n142 = n18;
                n = i;
                i = n16;
                if (n142 != 1048575) {
                    unsafe.putInt(o2, n142, n6);
                }
                k2 = this.k;
                o17 = null;
                while (k2 < this.l) {
                    o17 = this.r(o, this.j[k2], o17, this.o, o);
                    ++k2;
                }
                if (o17 != null) {
                    this.o.h(o2, o17);
                }
                if (n == 0) {
                    if (i == a) {
                        return i;
                    }
                    throw k4.e();
                }
                else {
                    if (i <= a && n5 == n) {
                        return i;
                    }
                    throw k4.e();
                }
            }
            unsafe = s;
            a = n2;
            n = n3;
            n142 = n8;
            continue;
        }
    }
    
    public final Object o(final int n, final int n2, final Map map, final g4 g4, Object o, final x5 x5, final Object o2) {
        this.q.b(this.Q(n));
        final Iterator<Map.Entry<K, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<K, Integer> entry = iterator.next();
            if (!g4.e(entry.getValue())) {
                Object i;
                if ((i = o) == null) {
                    i = x5.i(o2);
                }
                final z3 u = q3.U(A4.a(null, entry.getKey(), entry.getValue()));
                final J3 b = u.b();
                try {
                    A4.b(b, null, entry.getKey(), entry.getValue());
                    x5.c(i, n2, u.a());
                    iterator.remove();
                    o = i;
                    continue;
                }
                catch (IOException cause) {
                    throw new RuntimeException(cause);
                }
                break;
            }
        }
        return o;
    }
    
    public final Object p(Object object, final int n) {
        final Z4 n2 = this.N(n);
        final long offset = this.G(n) & 0xFFFFF;
        if (!this.I(object, n)) {
            return n2.a();
        }
        object = M4.s.getObject(object, offset);
        if (T(object)) {
            return object;
        }
        final Object a = n2.a();
        if (object != null) {
            n2.d(a, object);
        }
        return a;
    }
    
    public final Object q(Object object, final int n, final int n2) {
        final Z4 n3 = this.N(n2);
        if (!this.J(object, n, n2)) {
            return n3.a();
        }
        object = M4.s.getObject(object, this.G(n2) & 0xFFFFF);
        if (T(object)) {
            return object;
        }
        final Object a = n3.a();
        if (object != null) {
            n3.d(a, object);
        }
        return a;
    }
    
    public final Object r(Object b, final int n, final Object o, final x5 x5, final Object o2) {
        final int n2 = this.a[n];
        b = D5.B(b, this.G(n) & 0xFFFFF);
        if (b == null) {
            return o;
        }
        final g4 m = this.M(n);
        if (m == null) {
            return o;
        }
        return this.o(n, n2, this.q.h(b), m, o, x5, o2);
    }
    
    public final void v(final T5 t5, final int n, final Object o, final int n2) {
        if (o != null) {
            this.q.b(this.Q(n2));
            t5.o(n, null, this.q.c(o));
        }
    }
    
    public final void w(final Object o, final int n, final int n2, final Object x) {
        M4.s.putObject(o, this.G(n2) & 0xFFFFF, x);
        this.E(o, n, n2);
    }
    
    public final void x(final Object o, final int n, final Object x) {
        M4.s.putObject(o, this.G(n) & 0xFFFFF, x);
        this.D(o, n);
    }
    
    public final void y(final Object o, Object o2, int i) {
        if (!this.I(o2, i)) {
            return;
        }
        final long offset = this.G(i) & 0xFFFFF;
        final Unsafe s = M4.s;
        final Object object = s.getObject(o2, offset);
        if (object == null) {
            i = this.a[i];
            final String value = String.valueOf(o2);
            final StringBuilder sb = new StringBuilder("Source subfield ");
            sb.append(i);
            sb.append(" is present but null: ");
            sb.append(value);
            throw new IllegalStateException(sb.toString());
        }
        final Z4 n = this.N(i);
        if (!this.I(o, i)) {
            if (!T(object)) {
                s.putObject(o, offset, object);
            }
            else {
                o2 = n.a();
                n.d(o2, object);
                s.putObject(o, offset, o2);
            }
            this.D(o, i);
            return;
        }
        final Object o3 = o2 = s.getObject(o, offset);
        if (!T(o3)) {
            o2 = n.a();
            n.d(o2, o3);
            s.putObject(o, offset, o2);
        }
        n.d(o2, object);
    }
    
    public final boolean z(final Object o, final int n, final int n2, final int n3, final int n4) {
        if (n2 == 1048575) {
            return this.I(o, n);
        }
        return (n3 & n4) != 0x0;
    }
}
