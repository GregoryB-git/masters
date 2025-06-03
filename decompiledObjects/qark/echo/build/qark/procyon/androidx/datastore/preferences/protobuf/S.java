// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Iterator;
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
    public final l0 o;
    public final p p;
    public final J q;
    
    static {
        r = new int[0];
        s = p0.B();
    }
    
    public S(final int[] a, final Object[] b, final int c, final int d, final O e, final boolean h, final boolean i, final int[] j, final int k, final int l, final U m, final E n, final l0 o, final p p15, final J q) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = (e instanceof w);
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
    
    public static boolean E(final int n) {
        return (n & 0x10000000) != 0x0;
    }
    
    public static List F(final Object o, final long n) {
        return (List)p0.A(o, n);
    }
    
    public static long G(final Object o, final long n) {
        return p0.y(o, n);
    }
    
    public static S M(final Class clazz, final M m, final U u, final E e, final l0 l0, final p p7, final J j) {
        if (m instanceof c0) {
            return O((c0)m, u, e, l0, p7, j);
        }
        a.a(m);
        return N(null, u, e, l0, p7, j);
    }
    
    public static S N(final i0 i0, final U u, final E e, final l0 l0, final p p6, final J j) {
        throw null;
    }
    
    public static S O(final c0 c0, final U u, final E e, final l0 l0, final p p6, final J j) {
        final Z b = c0.b();
        final Z p7 = Z.p;
        final boolean b2 = false;
        final boolean b3 = b == p7;
        final String e2 = c0.e();
        final int length = e2.length();
        int char1 = e2.charAt(0);
        int index2;
        if (char1 >= 55296) {
            int n = char1 & 0x1FFF;
            int index = 1;
            int n2 = 13;
            int n3;
            char char2;
            while (true) {
                n3 = index + 1;
                char2 = e2.charAt(index);
                if (char2 < '\ud800') {
                    break;
                }
                n |= (char2 & '\u1fff') << n2;
                n2 += 13;
                index = n3;
            }
            char1 = (n | char2 << n2);
            index2 = n3;
        }
        else {
            index2 = 1;
        }
        final int n4 = index2 + 1;
        final char char3 = e2.charAt(index2);
        int n5 = n4;
        int n6 = char3;
        if (char3 >= '\ud800') {
            int n7 = char3 & '\u1fff';
            int n8 = 13;
            int index3 = n4;
            int n9;
            char char4;
            while (true) {
                n9 = index3 + 1;
                char4 = e2.charAt(index3);
                if (char4 < '\ud800') {
                    break;
                }
                n7 |= (char4 & '\u1fff') << n8;
                n8 += 13;
                index3 = n9;
            }
            n6 = (n7 | char4 << n8);
            n5 = n9;
        }
        int[] r;
        int n11;
        int n10;
        int n13;
        int n15;
        int n14;
        int n16;
        int n17;
        if (n6 == 0) {
            r = S.r;
            n10 = (n11 = 0);
            final int n12 = n13 = n11;
            n14 = (n15 = n13);
            n16 = (b2 ? 1 : 0);
            n17 = n12;
        }
        else {
            final int n18 = n5 + 1;
            int char5;
            final char c2 = (char)(char5 = e2.charAt(n5));
            int index4 = n18;
            if (c2 >= '\ud800') {
                int n19 = c2 & '\u1fff';
                int n20 = 13;
                int index5 = n18;
                int n21;
                char char6;
                while (true) {
                    n21 = index5 + 1;
                    char6 = e2.charAt(index5);
                    if (char6 < '\ud800') {
                        break;
                    }
                    n19 |= (char6 & '\u1fff') << n20;
                    n20 += 13;
                    index5 = n21;
                }
                char5 = (n19 | char6 << n20);
                index4 = n21;
            }
            final int n22 = index4 + 1;
            int char7;
            final char c3 = (char)(char7 = e2.charAt(index4));
            int index6 = n22;
            if (c3 >= '\ud800') {
                int n23 = c3 & '\u1fff';
                int n24 = 13;
                int index7 = n22;
                int n25;
                char char8;
                while (true) {
                    n25 = index7 + 1;
                    char8 = e2.charAt(index7);
                    if (char8 < '\ud800') {
                        break;
                    }
                    n23 |= (char8 & '\u1fff') << n24;
                    n24 += 13;
                    index7 = n25;
                }
                char7 = (n23 | char8 << n24);
                index6 = n25;
            }
            final int n26 = index6 + 1;
            int char9;
            final char c4 = (char)(char9 = e2.charAt(index6));
            int index8 = n26;
            if (c4 >= '\ud800') {
                int n27 = c4 & '\u1fff';
                int n28 = 13;
                int index9 = n26;
                int n29;
                char char10;
                while (true) {
                    n29 = index9 + 1;
                    char10 = e2.charAt(index9);
                    if (char10 < '\ud800') {
                        break;
                    }
                    n27 |= (char10 & '\u1fff') << n28;
                    n28 += 13;
                    index9 = n29;
                }
                char9 = (n27 | char10 << n28);
                index8 = n29;
            }
            final int n30 = index8 + 1;
            int char11;
            final char c5 = (char)(char11 = e2.charAt(index8));
            int index10 = n30;
            if (c5 >= '\ud800') {
                int n31 = c5 & '\u1fff';
                int n32 = 13;
                int index11 = n30;
                int n33;
                char char12;
                while (true) {
                    n33 = index11 + 1;
                    char12 = e2.charAt(index11);
                    if (char12 < '\ud800') {
                        break;
                    }
                    n31 |= (char12 & '\u1fff') << n32;
                    n32 += 13;
                    index11 = n33;
                }
                char11 = (n31 | char12 << n32);
                index10 = n33;
            }
            final int n34 = index10 + 1;
            int char13;
            final char c6 = (char)(char13 = e2.charAt(index10));
            int index12 = n34;
            if (c6 >= '\ud800') {
                int n35 = c6 & '\u1fff';
                int n36 = 13;
                int index13 = n34;
                int n37;
                char char14;
                while (true) {
                    n37 = index13 + 1;
                    char14 = e2.charAt(index13);
                    if (char14 < '\ud800') {
                        break;
                    }
                    n35 |= (char14 & '\u1fff') << n36;
                    n36 += 13;
                    index13 = n37;
                }
                char13 = (n35 | char14 << n36);
                index12 = n37;
            }
            final int n38 = index12 + 1;
            int char15;
            final char c7 = (char)(char15 = e2.charAt(index12));
            int index14 = n38;
            if (c7 >= '\ud800') {
                int n39 = c7 & '\u1fff';
                int n40 = 13;
                int index15 = n38;
                int n41;
                char char16;
                while (true) {
                    n41 = index15 + 1;
                    char16 = e2.charAt(index15);
                    if (char16 < '\ud800') {
                        break;
                    }
                    n39 |= (char16 & '\u1fff') << n40;
                    n40 += 13;
                    index15 = n41;
                }
                char15 = (n39 | char16 << n40);
                index14 = n41;
            }
            final int n42 = index14 + 1;
            int char17;
            final char c8 = (char)(char17 = e2.charAt(index14));
            int index16 = n42;
            if (c8 >= '\ud800') {
                int n43 = c8 & '\u1fff';
                int n44 = 13;
                int index17 = n42;
                int n45;
                char char18;
                while (true) {
                    n45 = index17 + 1;
                    char18 = e2.charAt(index17);
                    if (char18 < '\ud800') {
                        break;
                    }
                    n43 |= (char18 & '\u1fff') << n44;
                    n44 += 13;
                    index17 = n45;
                }
                char17 = (n43 | char18 << n44);
                index16 = n45;
            }
            final int n46 = index16 + 1;
            int char19;
            final char c9 = (char)(char19 = e2.charAt(index16));
            int n47 = n46;
            if (c9 >= '\ud800') {
                final int n48 = c9 & '\u1fff';
                int index18 = n46;
                int n49 = 13;
                int n50 = n48;
                char char20;
                while (true) {
                    n47 = index18 + 1;
                    char20 = e2.charAt(index18);
                    if (char20 < '\ud800') {
                        break;
                    }
                    n50 |= (char20 & '\u1fff') << n49;
                    n49 += 13;
                    index18 = n47;
                }
                char19 = (n50 | char20 << n49);
            }
            r = new int[char19 + char15 + char17];
            final int n51 = char5 * 2 + char7;
            final int n52 = n47;
            final int n53 = char9;
            n14 = char19;
            n13 = n51;
            n17 = char13;
            n11 = char11;
            n10 = char15;
            n15 = char5;
            n5 = n52;
            n16 = n53;
        }
        final Unsafe s = S.s;
        final Object[] d = c0.d();
        final Class<? extends O> class1 = c0.c().getClass();
        final int[] array = new int[n17 * 3];
        final Object[] array2 = new Object[n17 * 2];
        final int n54 = n14 + n10;
        int n55 = n14;
        int n56 = n54;
        final int n57 = 0;
        int n58 = 0;
        final int n59 = n11;
        int n60 = n57;
        final int n61 = char1;
        final int n62 = n16;
        while (true) {
            final int n63 = n58;
            if (n5 >= length) {
                break;
            }
            int index19 = n5 + 1;
            int char21 = e2.charAt(n5);
            int n67;
            int index20;
            if (char21 >= 55296) {
                int n64 = char21 & 0x1FFF;
                int n65 = 13;
                int n66;
                char char22;
                while (true) {
                    n66 = index19 + 1;
                    char22 = e2.charAt(index19);
                    n67 = n14;
                    if (char22 < '\ud800') {
                        break;
                    }
                    n64 |= (char22 & '\u1fff') << n65;
                    n65 += 13;
                    n14 = n67;
                    index19 = n66;
                }
                char21 = (n64 | char22 << n65);
                index20 = n66;
            }
            else {
                final int n68 = n14;
                index20 = index19;
                n67 = n68;
            }
            final int n69 = index20 + 1;
            int char23 = e2.charAt(index20);
            int n73;
            if (char23 >= 55296) {
                int n70 = char23 & 0x1FFF;
                int n71 = 13;
                int index21 = n69;
                int n72;
                char char24;
                while (true) {
                    n72 = index21 + 1;
                    char24 = e2.charAt(index21);
                    if (char24 < '\ud800') {
                        break;
                    }
                    n70 |= (char24 & '\u1fff') << n71;
                    n71 += 13;
                    index21 = n72;
                }
                char23 = (n70 | char24 << n71);
                n73 = n72;
            }
            else {
                n73 = n69;
            }
            final int n74 = char23 & 0xFF;
            int n75 = n60;
            if ((char23 & 0x400) != 0x0) {
                r[n60] = n63;
                n75 = n60 + 1;
            }
            int n77;
            int n83 = 0;
            int n87;
            int n89;
            int n90;
            if (n74 >= 51) {
                final int n76 = n73 + 1;
                final char char25 = e2.charAt(n73);
                n77 = n76;
                int n78;
                if ((n78 = char25) >= 55296) {
                    int n79 = char25 & '\u1fff';
                    int n80 = 13;
                    int index22 = n76;
                    int n81;
                    char char26;
                    while (true) {
                        n81 = index22 + 1;
                        char26 = e2.charAt(index22);
                        if (char26 < '\ud800') {
                            break;
                        }
                        n79 |= (char26 & '\u1fff') << n80;
                        n80 += 13;
                        index22 = n81;
                    }
                    n78 = (n79 | char26 << n80);
                    n77 = n81;
                }
                final int n82 = n74 - 51;
                if (n82 != 9 && n82 != 17) {
                    n83 = n13;
                    if (n82 == 12) {
                        n83 = n13;
                        if ((n61 & 0x1) == 0x1) {
                            final int n84 = n63 / 3;
                            n83 = n13 + 1;
                            array2[n84 * 2 + 1] = d[n13];
                        }
                    }
                }
                else {
                    final int n85 = n63 / 3;
                    n83 = n13 + 1;
                    array2[n85 * 2 + 1] = d[n13];
                }
                final int n86 = n78 * 2;
                final Object o = d[n86];
                Field c10;
                if (o instanceof Field) {
                    c10 = (Field)o;
                }
                else {
                    c10 = c0(class1, (String)o);
                    d[n86] = c10;
                }
                n87 = (int)s.objectFieldOffset(c10);
                final int n88 = n86 + 1;
                final Object o2 = d[n88];
                Field c11;
                if (o2 instanceof Field) {
                    c11 = (Field)o2;
                }
                else {
                    c11 = c0(class1, (String)o2);
                    d[n88] = c11;
                }
                n89 = (int)s.objectFieldOffset(c11);
                n90 = 0;
            }
            else {
                final int n91 = n13 + 1;
                final Field c12 = c0(class1, (String)d[n13]);
                Label_2221: {
                    int n94 = 0;
                    Label_2095: {
                        if (n74 != 9 && n74 != 17) {
                            int n93;
                            if (n74 == 27 || n74 == 49) {
                                final int n92 = n63 / 3;
                                n93 = n13 + 2;
                                array2[n92 * 2 + 1] = d[n91];
                            }
                            else if (n74 != 12 && n74 != 30 && n74 != 44) {
                                if (n74 != 50) {
                                    n83 = n91;
                                    n94 = n55;
                                    break Label_2095;
                                }
                                n94 = n55 + 1;
                                r[n55] = n63;
                                final int n95 = n63 / 3 * 2;
                                n83 = n13 + 2;
                                array2[n95] = d[n91];
                                if ((char23 & 0x800) != 0x0) {
                                    final int n96 = n13 + 3;
                                    array2[n95 + 1] = d[n83];
                                    n83 = n96;
                                }
                                break Label_2095;
                            }
                            else {
                                n83 = n91;
                                n94 = n55;
                                if ((n61 & 0x1) != 0x1) {
                                    break Label_2095;
                                }
                                final int n97 = n63 / 3;
                                n93 = n13 + 2;
                                array2[n97 * 2 + 1] = d[n91];
                            }
                            n83 = n93;
                            break Label_2221;
                        }
                        array2[n63 / 3 * 2 + 1] = c12.getType();
                        n83 = n91;
                        n94 = n55;
                    }
                    n55 = n94;
                }
                final int n98 = (int)s.objectFieldOffset(c12);
                int n106;
                if ((n61 & 0x1) == 0x1 && n74 <= 17) {
                    final int n99 = n73 + 1;
                    final char char27 = e2.charAt(n73);
                    int n100 = n99;
                    int n101;
                    if ((n101 = char27) >= 55296) {
                        int n102 = char27 & '\u1fff';
                        int n103 = 13;
                        int index23 = n99;
                        int n104;
                        char char28;
                        while (true) {
                            n104 = index23 + 1;
                            char28 = e2.charAt(index23);
                            if (char28 < '\ud800') {
                                break;
                            }
                            n102 |= (char28 & '\u1fff') << n103;
                            n103 += 13;
                            index23 = n104;
                        }
                        n101 = (n102 | char28 << n103);
                        n100 = n104;
                    }
                    final int n105 = n15 * 2 + n101 / 32;
                    final Object o3 = d[n105];
                    Field c13;
                    if (o3 instanceof Field) {
                        c13 = (Field)o3;
                    }
                    else {
                        c13 = c0(class1, (String)o3);
                        d[n105] = c13;
                    }
                    n73 = n100;
                    n89 = (int)s.objectFieldOffset(c13);
                    n106 = n101 % 32;
                }
                else {
                    n89 = 0;
                    n106 = 0;
                }
                int n107 = n56;
                if (n74 >= 18) {
                    n107 = n56;
                    if (n74 <= 49) {
                        r[n56] = n98;
                        n107 = n56 + 1;
                    }
                }
                n56 = n107;
                n90 = n106;
                n77 = n73;
                n87 = n98;
            }
            array[n63] = char21;
            int n108;
            if ((char23 & 0x200) != 0x0) {
                n108 = 536870912;
            }
            else {
                n108 = 0;
            }
            int n109;
            if ((char23 & 0x100) != 0x0) {
                n109 = 268435456;
            }
            else {
                n109 = 0;
            }
            array[n63 + 1] = (n109 | n108 | n74 << 20 | n87);
            n58 = n63 + 3;
            array[n63 + 2] = (n90 << 20 | n89);
            n60 = n75;
            n5 = n77;
            n13 = n83;
            n14 = n67;
        }
        return new S(array, array2, n62, n59, c0.c(), b3, false, r, n14, n54, u, e, l0, p6, j);
    }
    
    public static long Q(final int n) {
        return n & 0xFFFFF;
    }
    
    public static boolean R(final Object o, final long n) {
        return (boolean)p0.A(o, n);
    }
    
    public static double S(final Object o, final long n) {
        return (double)p0.A(o, n);
    }
    
    public static float T(final Object o, final long n) {
        return (float)p0.A(o, n);
    }
    
    public static int U(final Object o, final long n) {
        return (int)p0.A(o, n);
    }
    
    public static long V(final Object o, final long n) {
        return (long)p0.A(o, n);
    }
    
    public static Field c0(final Class clazz, final String s) {
        while (true) {
            try {
                return clazz.getDeclaredField(s);
                // iftrue(Label_0055:, n >= length)
                int n = 0;
                Field[] declaredFields = null;
            Block_2:
                while (true) {
                    break Block_2;
                    declaredFields = clazz.getDeclaredFields();
                    final int length = declaredFields.length;
                    n = 0;
                    continue;
                    final StringBuilder sb;
                    Label_0055: {
                        sb = new StringBuilder();
                    }
                    sb.append("Field ");
                    sb.append(s);
                    sb.append(" for ");
                    sb.append(clazz.getName());
                    sb.append(" not found. Known fields are ");
                    sb.append(Arrays.toString(declaredFields));
                    throw new RuntimeException(sb.toString());
                    Label_0048:
                    ++n;
                    continue;
                }
                // iftrue(Label_0048:, !s.equals((Object)field.getName()))
                return declaredFields[n];
            }
            catch (NoSuchFieldException ex) {
                continue;
            }
            break;
        }
    }
    
    public static int g0(final int n) {
        return (n & 0xFF00000) >>> 20;
    }
    
    public static boolean k(final Object o, final long n) {
        return p0.p(o, n);
    }
    
    public static double l(final Object o, final long n) {
        return p0.v(o, n);
    }
    
    public static float o(final Object o, final long n) {
        return p0.w(o, n);
    }
    
    public static int v(final Object o, final long n) {
        return p0.x(o, n);
    }
    
    public static boolean w(final int n) {
        return (n & 0x20000000) != 0x0;
    }
    
    public static boolean z(final Object o, final int n, final e0 e0) {
        return e0.c(p0.A(o, Q(n)));
    }
    
    public final boolean A(final Object o, int i, final int n) {
        final List list = (List)p0.A(o, Q(i));
        if (list.isEmpty()) {
            return true;
        }
        final e0 r = this.r(n);
        for (i = 0; i < list.size(); ++i) {
            if (!r.c(list.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean B(final Object o, final int n, final int n2) {
        final Map e = this.q.e(p0.A(o, Q(n)));
        if (e.isEmpty()) {
            return true;
        }
        if (this.q.d(this.q(n2)).c.c() != r0.c.x) {
            return true;
        }
        final Iterator<Object> iterator = e.values().iterator();
        e0 e2 = null;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            e0 c;
            if ((c = e2) == null) {
                c = a0.a().c(next.getClass());
            }
            e2 = c;
            if (!c.c(next)) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean C(final Object o, final Object o2, final int n) {
        final long n2 = this.X(n) & 0xFFFFF;
        return p0.x(o, n2) == p0.x(o2, n2);
    }
    
    public final boolean D(final Object o, final int n, final int n2) {
        return p0.x(o, this.X(n2) & 0xFFFFF) == n;
    }
    
    public final void H(final l0 l0, p p5, final Object o, final d0 d0, final o o2) {
        s s;
        Object o3 = s = null;
        Object n;
        int p6;
        int w;
        int h0;
        Object o4;
        int b;
        Object h2;
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
        Object o5 = null;
        long n2 = 0L;
        int b2;
        int k;
        Object o6;
        boolean y;
        int i;
        int j;
        Object o7;
        int m;
        boolean m2;
        boolean m3;
        final z.a a;
        s d2;
        Object n3;
        boolean m4;
        final p p7;
        Label_3432_Outer:Label_3294_Outer:Label_3480_Outer:Label_0644_Outer:
        while (true) {
            n = o3;
            while (true) {
                Label_3544: {
                    while (true) {
                        try {
                            p6 = d0.p();
                            n = o3;
                            w = this.W(p6);
                            if (w >= 0) {
                                n = o3;
                                h0 = this.h0(w);
                                o4 = o3;
                                n = o3;
                                while (true) {
                                    try {
                                        Label_2716: {
                                            Label_2665: {
                                                Label_2100: {
                                                    Label_2057: {
                                                        Label_2014: {
                                                            Label_1971: {
                                                                Label_1928: {
                                                                    Label_1885: {
                                                                        Label_1842: {
                                                                            Label_1799: {
                                                                                Label_1756: {
                                                                                    Label_1709: {
                                                                                        Label_1634: {
                                                                                            Label_1591: {
                                                                                                Label_1548: {
                                                                                                    Label_1505: {
                                                                                                        switch (g0(h0)) {
                                                                                                            case 68: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.N(this.r(w), o2));
                                                                                                                break;
                                                                                                            }
                                                                                                            case 67: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.j());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 66: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.h());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 65: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.r());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 64: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.z());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 63: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                b = d0.b();
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                this.p(w);
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), b);
                                                                                                                break;
                                                                                                            }
                                                                                                            case 62: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.w());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 61: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.u());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 60: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                if (this.D(o, p6, w)) {
                                                                                                                    o4 = o3;
                                                                                                                    n = o3;
                                                                                                                    h2 = androidx.datastore.preferences.protobuf.y.h(p0.A(o, Q(h0)), d0.J(this.r(w), o2));
                                                                                                                    o4 = o3;
                                                                                                                    n = o3;
                                                                                                                    p0.O(o, Q(h0), h2);
                                                                                                                    break;
                                                                                                                }
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.J(this.r(w), o2));
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                this.d0(o, w);
                                                                                                                break;
                                                                                                            }
                                                                                                            case 59: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                this.a0(o, h0, d0);
                                                                                                                break;
                                                                                                            }
                                                                                                            case 58: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.o());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 57: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.n());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 56: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.f());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 55: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.x());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 54: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.c());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 53: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.E());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 52: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.readFloat());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 51: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.readDouble());
                                                                                                                break;
                                                                                                            }
                                                                                                            case 50: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                this.I(o, w, this.q(w), o2, d0);
                                                                                                                continue Label_3432_Outer;
                                                                                                            }
                                                                                                            case 49: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                this.Y(o, Q(h0), d0, this.r(w), o2);
                                                                                                                continue Label_3432_Outer;
                                                                                                            }
                                                                                                            case 48: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list = this.n.e(o, Q(h0));
                                                                                                                break Label_1505;
                                                                                                            }
                                                                                                            case 47: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list2 = this.n.e(o, Q(h0));
                                                                                                                break Label_1548;
                                                                                                            }
                                                                                                            case 46: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list3 = this.n.e(o, Q(h0));
                                                                                                                break Label_1591;
                                                                                                            }
                                                                                                            case 45: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list4 = this.n.e(o, Q(h0));
                                                                                                                break Label_1634;
                                                                                                            }
                                                                                                            case 44: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list5 = this.n.e(o, Q(h0));
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                d0.I(list5);
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                this.p(w);
                                                                                                                break Label_1709;
                                                                                                            }
                                                                                                            case 43: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list6 = this.n.e(o, Q(h0));
                                                                                                                break Label_1756;
                                                                                                            }
                                                                                                            case 42: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list7 = this.n.e(o, Q(h0));
                                                                                                                break Label_1799;
                                                                                                            }
                                                                                                            case 41: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list8 = this.n.e(o, Q(h0));
                                                                                                                break Label_1842;
                                                                                                            }
                                                                                                            case 40: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list9 = this.n.e(o, Q(h0));
                                                                                                                break Label_1885;
                                                                                                            }
                                                                                                            case 39: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list10 = this.n.e(o, Q(h0));
                                                                                                                break Label_1928;
                                                                                                            }
                                                                                                            case 38: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list11 = this.n.e(o, Q(h0));
                                                                                                                break Label_1971;
                                                                                                            }
                                                                                                            case 37: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list12 = this.n.e(o, Q(h0));
                                                                                                                break Label_2014;
                                                                                                            }
                                                                                                            case 36: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list13 = this.n.e(o, Q(h0));
                                                                                                                break Label_2057;
                                                                                                            }
                                                                                                            case 35: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list14 = this.n.e(o, Q(h0));
                                                                                                                break Label_2100;
                                                                                                            }
                                                                                                            case 34: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list = this.n.e(o, Q(h0));
                                                                                                                break Label_1505;
                                                                                                            }
                                                                                                            case 33: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list2 = this.n.e(o, Q(h0));
                                                                                                                break Label_1548;
                                                                                                            }
                                                                                                            case 32: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list3 = this.n.e(o, Q(h0));
                                                                                                                break Label_1591;
                                                                                                            }
                                                                                                            case 31: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list4 = this.n.e(o, Q(h0));
                                                                                                                break Label_1634;
                                                                                                            }
                                                                                                            case 30: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list5 = this.n.e(o, Q(h0));
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                d0.I(list5);
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                this.p(w);
                                                                                                                break Label_1709;
                                                                                                            }
                                                                                                            case 29: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list6 = this.n.e(o, Q(h0));
                                                                                                                break Label_1756;
                                                                                                            }
                                                                                                            case 28: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                d0.A(this.n.e(o, Q(h0)));
                                                                                                                continue Label_3432_Outer;
                                                                                                            }
                                                                                                            case 27: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                this.Z(o, h0, d0, this.r(w), o2);
                                                                                                                continue Label_3432_Outer;
                                                                                                            }
                                                                                                            case 26: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                this.b0(o, h0, d0);
                                                                                                                continue Label_3432_Outer;
                                                                                                            }
                                                                                                            case 25: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list7 = this.n.e(o, Q(h0));
                                                                                                                break Label_1799;
                                                                                                            }
                                                                                                            case 24: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list8 = this.n.e(o, Q(h0));
                                                                                                                break Label_1842;
                                                                                                            }
                                                                                                            case 23: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list9 = this.n.e(o, Q(h0));
                                                                                                                break Label_1885;
                                                                                                            }
                                                                                                            case 22: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list10 = this.n.e(o, Q(h0));
                                                                                                                break Label_1928;
                                                                                                            }
                                                                                                            case 21: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list11 = this.n.e(o, Q(h0));
                                                                                                                break Label_1971;
                                                                                                            }
                                                                                                            case 20: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list12 = this.n.e(o, Q(h0));
                                                                                                                break Label_2014;
                                                                                                            }
                                                                                                            case 19: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list13 = this.n.e(o, Q(h0));
                                                                                                                break Label_2057;
                                                                                                            }
                                                                                                            case 18: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                list14 = this.n.e(o, Q(h0));
                                                                                                                break Label_2100;
                                                                                                            }
                                                                                                            case 17: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                if (this.x(o, w)) {
                                                                                                                    o4 = o3;
                                                                                                                    n = o3;
                                                                                                                    o5 = androidx.datastore.preferences.protobuf.y.h(p0.A(o, Q(h0)), d0.N(this.r(w), o2));
                                                                                                                    o4 = o3;
                                                                                                                    n = o3;
                                                                                                                    n2 = Q(h0);
                                                                                                                    break Label_2665;
                                                                                                                }
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.N(this.r(w), o2));
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 16: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.N(o, Q(h0), d0.j());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 15: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.M(o, Q(h0), d0.h());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 14: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.N(o, Q(h0), d0.r());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 13: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.M(o, Q(h0), d0.z());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 12: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                b2 = d0.b();
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                this.p(w);
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.M(o, Q(h0), b2);
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 11: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.M(o, Q(h0), d0.w());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 10: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.u());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 9: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                if (this.x(o, w)) {
                                                                                                                    o4 = o3;
                                                                                                                    n = o3;
                                                                                                                    o5 = androidx.datastore.preferences.protobuf.y.h(p0.A(o, Q(h0)), d0.J(this.r(w), o2));
                                                                                                                    o4 = o3;
                                                                                                                    n = o3;
                                                                                                                    n2 = Q(h0);
                                                                                                                    break Label_2665;
                                                                                                                }
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.O(o, Q(h0), d0.J(this.r(w), o2));
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 8: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                this.a0(o, h0, d0);
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 7: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.E(o, Q(h0), d0.o());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 6: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.M(o, Q(h0), d0.n());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 5: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.N(o, Q(h0), d0.f());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 4: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.M(o, Q(h0), d0.x());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.N(o, Q(h0), d0.c());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.N(o, Q(h0), d0.E());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 1: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.L(o, Q(h0), d0.readFloat());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            case 0: {
                                                                                                                o4 = o3;
                                                                                                                n = o3;
                                                                                                                p0.K(o, Q(h0), d0.readDouble());
                                                                                                                break Label_2716;
                                                                                                            }
                                                                                                            default: {
                                                                                                                break Label_3544;
                                                                                                            }
                                                                                                        }
                                                                                                        o4 = o3;
                                                                                                        n = o3;
                                                                                                        this.e0(o, p6, w);
                                                                                                        continue Label_3432_Outer;
                                                                                                    }
                                                                                                    o4 = o3;
                                                                                                    n = o3;
                                                                                                    d0.i(list);
                                                                                                    continue Label_3432_Outer;
                                                                                                }
                                                                                                o4 = o3;
                                                                                                n = o3;
                                                                                                d0.a(list2);
                                                                                                continue Label_3432_Outer;
                                                                                            }
                                                                                            o4 = o3;
                                                                                            n = o3;
                                                                                            d0.D(list3);
                                                                                            continue Label_3432_Outer;
                                                                                        }
                                                                                        o4 = o3;
                                                                                        n = o3;
                                                                                        d0.g(list4);
                                                                                        continue Label_3432_Outer;
                                                                                    }
                                                                                    o4 = o3;
                                                                                    n = o3;
                                                                                    o3 = g0.z(p6, list5, null, o3, l0);
                                                                                    continue Label_3432_Outer;
                                                                                }
                                                                                o4 = o3;
                                                                                n = o3;
                                                                                d0.k(list6);
                                                                                continue Label_3432_Outer;
                                                                            }
                                                                            o4 = o3;
                                                                            n = o3;
                                                                            d0.l(list7);
                                                                            continue Label_3432_Outer;
                                                                        }
                                                                        o4 = o3;
                                                                        n = o3;
                                                                        d0.d(list8);
                                                                        continue Label_3432_Outer;
                                                                    }
                                                                    o4 = o3;
                                                                    n = o3;
                                                                    d0.G(list9);
                                                                    continue Label_3432_Outer;
                                                                }
                                                                o4 = o3;
                                                                n = o3;
                                                                d0.H(list10);
                                                                continue Label_3432_Outer;
                                                            }
                                                            o4 = o3;
                                                            n = o3;
                                                            d0.s(list11);
                                                            continue Label_3432_Outer;
                                                        }
                                                        o4 = o3;
                                                        n = o3;
                                                        d0.C(list12);
                                                        continue Label_3432_Outer;
                                                    }
                                                    o4 = o3;
                                                    n = o3;
                                                    d0.v(list13);
                                                    continue Label_3432_Outer;
                                                }
                                                o4 = o3;
                                                n = o3;
                                                d0.B(list14);
                                                continue Label_3432_Outer;
                                            }
                                            o4 = o3;
                                            n = o3;
                                            p0.O(o, n2, o5);
                                            continue Label_3432_Outer;
                                        }
                                        o4 = o3;
                                        n = o3;
                                        this.d0(o, w);
                                        continue Label_3432_Outer;
                                        // iftrue(Label_3467:, k >= this.l)
                                        // iftrue(Label_3479:, o6 == null)
                                        // iftrue(Label_0007:, y)
                                        // iftrue(Label_3383:, !l0.q(d0))
                                        // iftrue(Label_3521:, j >= this.l)
                                        // iftrue(Label_3370:, i >= this.l)
                                        // iftrue(Label_0007:, m2)
                                        // iftrue(Label_0747:, o7 == null)
                                        // iftrue(Label_3403:, o6 = o4 != null)
                                        // iftrue(Label_3533:, n == null)
                                        // iftrue(Label_0667:, o3 != null)
                                        // iftrue(Label_0007:, m3)
                                        // iftrue(Label_3533:, o4 == null)
                                        // iftrue(Label_0735:, m >= this.l)
                                        Block_29_Outer:Block_30_Outer:Label_3335_Outer:
                                        while (true) {
                                            Block_31: {
                                                break Block_31;
                                                Label_3335:Block_28_Outer:Block_20_Outer:
                                                while (true) {
                                                    Block_26: {
                                                        while (true) {
                                                        Label_0700:
                                                            while (true) {
                                                            Block_18_Outer:
                                                                while (true) {
                                                                Block_34_Outer:
                                                                    while (true) {
                                                                        Block_19: {
                                                                            while (true) {
                                                                            Block_27_Outer:
                                                                                while (true) {
                                                                                    n = o4;
                                                                                    o6 = l0.f(o);
                                                                                    break Block_34_Outer;
                                                                                    Block_32: {
                                                                                        break Block_32;
                                                                                        k = this.k;
                                                                                        continue Block_29_Outer;
                                                                                    }
                                                                                    l0.o(o, o6);
                                                                                    return;
                                                                                    while (true) {
                                                                                        Block_33: {
                                                                                            Label_0667: {
                                                                                                while (true) {
                                                                                                    while (true) {
                                                                                                        n = o4;
                                                                                                        y = d0.y();
                                                                                                        o3 = o4;
                                                                                                        break Block_26;
                                                                                                        o4 = this.n(o, this.j[i], o4, l0);
                                                                                                        ++i;
                                                                                                        break Label_3335;
                                                                                                        n = o4;
                                                                                                        continue Block_27_Outer;
                                                                                                    }
                                                                                                    j = this.k;
                                                                                                    break Block_33;
                                                                                                    o4 = o3;
                                                                                                    n = o3;
                                                                                                    o7 = l0.n();
                                                                                                    break Label_0667;
                                                                                                    continue Label_3335_Outer;
                                                                                                }
                                                                                                l0.o(o, o4);
                                                                                                return;
                                                                                                o7 = this.n(o, this.j[m], o7, l0);
                                                                                                ++m;
                                                                                                break Label_0700;
                                                                                                Label_3479: {
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            o4 = o7;
                                                                                            n = o7;
                                                                                            m2 = l0.m(o7, d0);
                                                                                            o3 = o7;
                                                                                            break Block_19;
                                                                                        }
                                                                                        n = this.n(o, this.j[j], n, l0);
                                                                                        ++j;
                                                                                        continue Block_18_Outer;
                                                                                    }
                                                                                    while (true) {
                                                                                        l0.o(o, o7);
                                                                                        return;
                                                                                        l0.o(o, n);
                                                                                        return;
                                                                                        Label_0735: {
                                                                                            continue Block_34_Outer;
                                                                                        }
                                                                                    }
                                                                                    Label_3383: {
                                                                                        continue Block_30_Outer;
                                                                                    }
                                                                                }
                                                                                Label_3521: {
                                                                                    continue Label_0644_Outer;
                                                                                }
                                                                            }
                                                                        }
                                                                        m = this.k;
                                                                        break Label_0700;
                                                                        o7 = o3;
                                                                        continue Block_28_Outer;
                                                                    }
                                                                    n = o6;
                                                                    m3 = l0.m(o6, d0);
                                                                    o3 = o6;
                                                                    continue Label_3335_Outer;
                                                                }
                                                                Label_0747: {
                                                                    return;
                                                                }
                                                                Label_3370:
                                                                continue Block_20_Outer;
                                                            }
                                                            continue Label_0644_Outer;
                                                        }
                                                    }
                                                    i = this.k;
                                                    continue Label_3335;
                                                }
                                            }
                                            o6 = this.n(o, this.j[k], o6, l0);
                                            ++k;
                                            continue Label_3294_Outer;
                                        }
                                        Label_3533: {
                                            return;
                                        }
                                    }
                                    catch (z.a a) {}
                                    o3 = a;
                                    continue Label_3480_Outer;
                                }
                            }
                            if (p6 == Integer.MAX_VALUE) {
                                for (int k2 = this.k; k2 < this.l; ++k2) {
                                    o3 = this.n(o, this.j[k2], o3, l0);
                                }
                                if (o3 != null) {
                                    l0.o(o, o3);
                                }
                                return;
                            }
                            n = o3;
                            if (!this.f) {
                                o4 = null;
                            }
                            else {
                                n = o3;
                                o4 = p5.b(o2, this.e, p6);
                            }
                            if (o4 != null) {
                                if ((d2 = s) == null) {
                                    n = o3;
                                    d2 = p5.d(o);
                                }
                                n = o3;
                                o3 = p5.g(d0, o4, o2, d2, o3, l0);
                                s = d2;
                                continue Label_3480_Outer;
                            }
                            n = o3;
                            if (l0.q(d0)) {
                                n3 = o3;
                                n = o3;
                                if (d0.y()) {
                                    continue Label_3480_Outer;
                                }
                            }
                            else {
                                if ((o4 = o3) == null) {
                                    n = o3;
                                    o4 = l0.f(o);
                                }
                                n = o4;
                                m4 = l0.m(o4, d0);
                                n3 = o4;
                                if (m4) {
                                    o3 = o4;
                                    continue Label_3480_Outer;
                                }
                            }
                            for (int k3 = this.k; k3 < this.l; ++k3) {
                                n3 = this.n(o, this.j[k3], n3, l0);
                            }
                            if (n3 != null) {
                                l0.o(o, n3);
                            }
                            return;
                        }
                        finally {}
                        p5 = p7;
                        continue Label_0644_Outer;
                    }
                }
                continue;
            }
        }
    }
    
    public final void I(final Object o, final int n, final Object o2, final o o3, final d0 d0) {
        final long q = Q(this.h0(n));
        final Object a = p0.A(o, q);
        Object o4;
        if (a == null) {
            o4 = this.q.f(o2);
            p0.O(o, q, o4);
        }
        else {
            o4 = a;
            if (this.q.g(a)) {
                o4 = this.q.f(o2);
                this.q.a(o4, a);
                p0.O(o, q, o4);
            }
        }
        d0.K(this.q.h(o4), this.q.d(o2), o3);
    }
    
    public final void J(final Object o, Object o2, final int n) {
        final long q = Q(this.h0(n));
        if (!this.x(o2, n)) {
            return;
        }
        final Object a = p0.A(o, q);
        o2 = p0.A(o2, q);
        if (a != null && o2 != null) {
            o2 = y.h(a, o2);
        }
        else if (o2 == null) {
            return;
        }
        p0.O(o, q, o2);
        this.d0(o, n);
    }
    
    public final void K(final Object o, Object o2, final int n) {
        final int h0 = this.h0(n);
        final int p3 = this.P(n);
        final long q = Q(h0);
        if (!this.D(o2, p3, n)) {
            return;
        }
        final Object a = p0.A(o, q);
        o2 = p0.A(o2, q);
        if (a != null && o2 != null) {
            o2 = y.h(a, o2);
        }
        else if (o2 == null) {
            return;
        }
        p0.O(o, q, o2);
        this.e0(o, p3, n);
    }
    
    public final void L(final Object o, final Object o2, final int n) {
        final int h0 = this.h0(n);
        final long q = Q(h0);
        final int p3 = this.P(n);
        while (true) {
            Label_0512: {
                Label_0440: {
                    Label_0412: {
                        switch (g0(h0)) {
                            default: {
                                return;
                            }
                            case 60:
                            case 68: {
                                this.K(o, o2, n);
                                return;
                            }
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67: {
                                if (this.D(o2, p3, n)) {
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
                                if (this.D(o2, p3, n)) {
                                    break;
                                }
                                return;
                            }
                            case 50: {
                                g0.E(this.q, o, o2, q);
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
                                this.n.d(o, o2, q);
                                return;
                            }
                            case 9:
                            case 17: {
                                this.J(o, o2, n);
                                return;
                            }
                            case 16: {
                                if (this.x(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 15: {
                                if (this.x(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 14: {
                                if (this.x(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 13: {
                                if (this.x(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 12: {
                                if (this.x(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 11: {
                                if (this.x(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 10: {
                                if (this.x(o2, n)) {
                                    break Label_0512;
                                }
                                return;
                            }
                            case 8: {
                                if (this.x(o2, n)) {
                                    break Label_0512;
                                }
                                return;
                            }
                            case 7: {
                                if (this.x(o2, n)) {
                                    p0.E(o, q, p0.p(o2, q));
                                    break Label_0424;
                                }
                                return;
                            }
                            case 6: {
                                if (this.x(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 5: {
                                if (this.x(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 4: {
                                if (this.x(o2, n)) {
                                    break Label_0440;
                                }
                                return;
                            }
                            case 3: {
                                if (this.x(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 2: {
                                if (this.x(o2, n)) {
                                    break Label_0412;
                                }
                                return;
                            }
                            case 1: {
                                if (this.x(o2, n)) {
                                    p0.L(o, q, p0.w(o2, q));
                                    break Label_0424;
                                }
                                return;
                            }
                            case 0: {
                                if (this.x(o2, n)) {
                                    p0.K(o, q, p0.v(o2, q));
                                    break Label_0424;
                                }
                                return;
                            }
                        }
                        p0.O(o, q, p0.A(o2, q));
                        this.e0(o, p3, n);
                        return;
                    }
                    p0.N(o, q, p0.y(o2, q));
                    this.d0(o, n);
                    return;
                }
                p0.M(o, q, p0.x(o2, q));
                continue;
            }
            p0.O(o, q, p0.A(o2, q));
            continue;
        }
    }
    
    public final int P(final int n) {
        return this.a[n];
    }
    
    public final int W(final int n) {
        if (n >= this.c && n <= this.d) {
            return this.f0(n, 0);
        }
        return -1;
    }
    
    public final int X(final int n) {
        return this.a[n + 2];
    }
    
    public final void Y(final Object o, final long n, final d0 d0, final e0 e0, final o o2) {
        d0.L(this.n.e(o, n), e0, o2);
    }
    
    public final void Z(final Object o, final int n, final d0 d0, final e0 e0, final o o2) {
        d0.M(this.n.e(o, Q(n)), e0, o2);
    }
    
    @Override
    public void a(final Object o, final Object o2) {
        o2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            this.L(o, o2, i);
        }
        if (!this.h) {
            g0.F(this.o, o, o2);
            if (this.f) {
                g0.D(this.p, o, o2);
            }
        }
    }
    
    public final void a0(final Object o, final int n, final d0 d0) {
        long n2;
        Serializable s;
        if (w(n)) {
            n2 = Q(n);
            s = d0.F();
        }
        else if (this.g) {
            n2 = Q(n);
            s = d0.m();
        }
        else {
            n2 = Q(n);
            s = d0.u();
        }
        p0.O(o, n2, s);
    }
    
    @Override
    public void b(final Object o) {
        int k = this.k;
        int l;
        while (true) {
            l = this.l;
            if (k >= l) {
                break;
            }
            final long q = Q(this.h0(this.j[k]));
            final Object a = p0.A(o, q);
            if (a != null) {
                p0.O(o, q, this.q.c(a));
            }
            ++k;
        }
        for (int length = this.j.length, i = l; i < length; ++i) {
            this.n.c(o, this.j[i]);
        }
        this.o.j(o);
        if (this.f) {
            this.p.f(o);
        }
    }
    
    public final void b0(final Object o, final int n, final d0 d0) {
        if (w(n)) {
            d0.t(this.n.e(o, Q(n)));
            return;
        }
        d0.q(this.n.e(o, Q(n)));
    }
    
    @Override
    public final boolean c(final Object o) {
        int n = -1;
        int int1;
        int n6;
        for (int i = int1 = 0; i < this.k; ++i, n = n6) {
            final int n2 = this.j[i];
            final int p = this.P(n2);
            final int h0 = this.h0(n2);
            int n7;
            if (!this.h) {
                final int n3 = this.a[n2 + 2];
                final int n4 = 0xFFFFF & n3;
                final int n5 = 1 << (n3 >>> 20);
                n6 = n;
                n7 = n5;
                if (n4 != n) {
                    int1 = S.s.getInt(o, n4);
                    n6 = n4;
                    n7 = n5;
                }
            }
            else {
                n7 = 0;
                n6 = n;
            }
            if (E(h0) && !this.y(o, n2, int1, n7)) {
                return false;
            }
            final int g0 = g0(h0);
            if (g0 != 9 && g0 != 17) {
                if (g0 != 27) {
                    if (g0 != 60 && g0 != 68) {
                        if (g0 != 49) {
                            if (g0 != 50) {
                                continue;
                            }
                            if (!this.B(o, h0, n2)) {
                                return false;
                            }
                            continue;
                        }
                    }
                    else {
                        if (this.D(o, p, n2) && !z(o, h0, this.r(n2))) {
                            return false;
                        }
                        continue;
                    }
                }
                if (!this.A(o, h0, n2)) {
                    return false;
                }
            }
            else if (this.y(o, n2, int1, n7) && !z(o, h0, this.r(n2))) {
                return false;
            }
        }
        return !this.f || this.p.c(o).k();
    }
    
    @Override
    public boolean d(final Object o, final Object o2) {
        for (int length = this.a.length, i = 0; i < length; i += 3) {
            if (!this.m(o, o2, i)) {
                return false;
            }
        }
        return this.o.g(o).equals(this.o.g(o2)) && (!this.f || this.p.c(o).equals(this.p.c(o2)));
    }
    
    public final void d0(final Object o, int x) {
        if (this.h) {
            return;
        }
        x = this.X(x);
        final long n = x & 0xFFFFF;
        p0.M(o, n, p0.x(o, n) | 1 << (x >>> 20));
    }
    
    @Override
    public int e(final Object o) {
        if (this.h) {
            return this.t(o);
        }
        return this.s(o);
    }
    
    public final void e0(final Object o, final int n, final int n2) {
        p0.M(o, this.X(n2) & 0xFFFFF, n);
    }
    
    @Override
    public Object f() {
        return this.m.a(this.e);
    }
    
    public final int f0(final int n, int i) {
        int n2 = this.a.length / 3 - 1;
        while (i <= n2) {
            final int n3 = n2 + i >>> 1;
            final int n4 = n3 * 3;
            final int p2 = this.P(n4);
            if (n == p2) {
                return n4;
            }
            if (n < p2) {
                n2 = n3 - 1;
            }
            else {
                i = n3 + 1;
            }
        }
        return -1;
    }
    
    @Override
    public int g(final Object o) {
        final int length = this.a.length;
        int i = 0;
        int n = 0;
    Label_0434_Outer:
        while (i < length) {
            final int h0 = this.h0(i);
            final int p = this.P(i);
            final long q = Q(h0);
            final int g0 = g0(h0);
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
                                                    switch (g0) {
                                                        default: {
                                                            n2 = n;
                                                            break Label_1001;
                                                        }
                                                        case 68: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 67: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 66: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 65: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 64: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 63: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 62: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 61: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
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
                                                            o2 = p0.A(o, q);
                                                            break Label_0386;
                                                        }
                                                        case 60: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 59: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break Label_0623;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 8: {
                                                            n3 = n * 53;
                                                            final int n4 = ((String)p0.A(o, q)).hashCode();
                                                            break Label_0393;
                                                        }
                                                        case 58: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                n3 = n * 53;
                                                                b = R(o, q);
                                                                break Label_0678;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 57: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 56: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 55: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break Label_0460;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 54: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 53: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                break Label_0419;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 52: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                n3 = n * 53;
                                                                value = T(o, q);
                                                                break Label_0814;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 51: {
                                                            n2 = n;
                                                            if (this.D(o, p, i)) {
                                                                n3 = n * 53;
                                                                value2 = S(o, q);
                                                                break Label_0854;
                                                            }
                                                            break Label_1001;
                                                        }
                                                        case 17: {
                                                            o3 = p0.A(o, q);
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
                                                            final long n5 = p0.y(o, q);
                                                            break Label_0434;
                                                        }
                                                        case 4:
                                                        case 6:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                        case 15: {
                                                            n3 = n * 53;
                                                            final int n4 = p0.x(o, q);
                                                            break Label_0393;
                                                        }
                                                        case 9: {
                                                            o3 = p0.A(o, q);
                                                            if (o3 != null) {
                                                                break Label_0434;
                                                            }
                                                            break Label_0883;
                                                        }
                                                        case 7: {
                                                            n3 = n * 53;
                                                            b = p0.p(o, q);
                                                            break Label_0678;
                                                        }
                                                        case 1: {
                                                            n3 = n * 53;
                                                            value = p0.w(o, q);
                                                            break Label_0814;
                                                        }
                                                        case 0: {
                                                            n3 = n * 53;
                                                            value2 = p0.v(o, q);
                                                            break Label_0854;
                                                        }
                                                    }
                                                }
                                                o2 = p0.A(o, q);
                                                n3 = n * 53;
                                            }
                                            final int n4 = o2.hashCode();
                                            n2 = n3 + n4;
                                            break Label_1001;
                                        }
                                        int n3 = n * 53;
                                        final long n5 = V(o, q);
                                        final int n4 = y.f(n5);
                                        continue Label_0434_Outer;
                                    }
                                    int n3 = n * 53;
                                    final int n4 = U(o, q);
                                    continue Label_0434_Outer;
                                }
                                final int n4 = y.c(b);
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
    
    @Override
    public void h(final Object o, final d0 d0, final o o2) {
        o2.getClass();
        this.H(this.o, this.p, o, d0, o2);
    }
    
    public final int h0(final int n) {
        return this.a[n + 1];
    }
    
    @Override
    public void i(final Object o, final s0 s0) {
        if (s0.v() == androidx.datastore.preferences.protobuf.s0.a.p) {
            this.k0(o, s0);
            return;
        }
        if (this.h) {
            this.j0(o, s0);
            return;
        }
        this.i0(o, s0);
    }
    
    public final void i0(final Object o, final s0 s0) {
        Iterator<Map.Entry<?, ?>> n = null;
        Map.Entry<?, ?> entry = null;
        Label_0053: {
            if (this.f) {
                final s c = this.p.c(o);
                if (!c.j()) {
                    n = (Iterator<Map.Entry<?, ?>>)c.n();
                    entry = n.next();
                    break Label_0053;
                }
            }
            n = null;
            entry = null;
        }
        final int length = this.a.length;
        final Unsafe s2 = S.s;
        int n2 = -1;
        int i = 0;
        int int1 = 0;
        while (i < length) {
            final int h0 = this.h0(i);
            final int p2 = this.P(i);
            final int g0 = g0(h0);
            int n6;
            if (!this.h && g0 <= 17) {
                final int n3 = this.a[i + 2];
                final int n4 = n3 & 0xFFFFF;
                int n5;
                if (n4 != (n5 = n2)) {
                    int1 = s2.getInt(o, n4);
                    n5 = n4;
                }
                n6 = 1 << (n3 >>> 20);
                n2 = n5;
            }
            else {
                n6 = 0;
            }
            while (entry != null && this.p.a((Map.Entry)entry) <= p2) {
                this.p.j(s0, (Map.Entry)entry);
                if (n.hasNext()) {
                    entry = n.next();
                }
                else {
                    entry = null;
                }
            }
            final long q = Q(h0);
            switch (g0) {
                case 68: {
                    if (this.D(o, p2, i)) {
                        s0.O(p2, s2.getObject(o, q), this.r(i));
                        break;
                    }
                    break;
                }
                case 67: {
                    if (this.D(o, p2, i)) {
                        s0.w(p2, V(o, q));
                        break;
                    }
                    break;
                }
                case 66: {
                    if (this.D(o, p2, i)) {
                        s0.H(p2, U(o, q));
                        break;
                    }
                    break;
                }
                case 65: {
                    if (this.D(o, p2, i)) {
                        s0.n(p2, V(o, q));
                        break;
                    }
                    break;
                }
                case 64: {
                    if (this.D(o, p2, i)) {
                        s0.g(p2, U(o, q));
                        break;
                    }
                    break;
                }
                case 63: {
                    if (this.D(o, p2, i)) {
                        s0.D(p2, U(o, q));
                        break;
                    }
                    break;
                }
                case 62: {
                    if (this.D(o, p2, i)) {
                        s0.e(p2, U(o, q));
                        break;
                    }
                    break;
                }
                case 61: {
                    if (this.D(o, p2, i)) {
                        s0.J(p2, (g)s2.getObject(o, q));
                        break;
                    }
                    break;
                }
                case 60: {
                    if (this.D(o, p2, i)) {
                        s0.K(p2, s2.getObject(o, q), this.r(i));
                        break;
                    }
                    break;
                }
                case 59: {
                    if (this.D(o, p2, i)) {
                        this.m0(p2, s2.getObject(o, q), s0);
                        break;
                    }
                    break;
                }
                case 58: {
                    if (this.D(o, p2, i)) {
                        s0.d(p2, R(o, q));
                        break;
                    }
                    break;
                }
                case 57: {
                    if (this.D(o, p2, i)) {
                        s0.l(p2, U(o, q));
                        break;
                    }
                    break;
                }
                case 56: {
                    if (this.D(o, p2, i)) {
                        s0.u(p2, V(o, q));
                        break;
                    }
                    break;
                }
                case 55: {
                    if (this.D(o, p2, i)) {
                        s0.i(p2, U(o, q));
                        break;
                    }
                    break;
                }
                case 54: {
                    if (this.D(o, p2, i)) {
                        s0.C(p2, V(o, q));
                        break;
                    }
                    break;
                }
                case 53: {
                    if (this.D(o, p2, i)) {
                        s0.c(p2, V(o, q));
                        break;
                    }
                    break;
                }
                case 52: {
                    if (this.D(o, p2, i)) {
                        s0.x(p2, T(o, q));
                        break;
                    }
                    break;
                }
                case 51: {
                    if (this.D(o, p2, i)) {
                        s0.m(p2, S(o, q));
                        break;
                    }
                    break;
                }
                case 50: {
                    this.l0(s0, p2, s2.getObject(o, q), i);
                    break;
                }
                case 49: {
                    androidx.datastore.preferences.protobuf.g0.T(this.P(i), (List)s2.getObject(o, q), s0, this.r(i));
                    break;
                }
                case 48: {
                    androidx.datastore.preferences.protobuf.g0.a0(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 47: {
                    androidx.datastore.preferences.protobuf.g0.Z(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 46: {
                    androidx.datastore.preferences.protobuf.g0.Y(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 45: {
                    androidx.datastore.preferences.protobuf.g0.X(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 44: {
                    androidx.datastore.preferences.protobuf.g0.P(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 43: {
                    androidx.datastore.preferences.protobuf.g0.c0(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 42: {
                    androidx.datastore.preferences.protobuf.g0.M(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 41: {
                    androidx.datastore.preferences.protobuf.g0.Q(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 40: {
                    androidx.datastore.preferences.protobuf.g0.R(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 39: {
                    androidx.datastore.preferences.protobuf.g0.U(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 38: {
                    androidx.datastore.preferences.protobuf.g0.d0(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 37: {
                    androidx.datastore.preferences.protobuf.g0.V(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 36: {
                    androidx.datastore.preferences.protobuf.g0.S(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 35: {
                    androidx.datastore.preferences.protobuf.g0.O(this.P(i), (List)s2.getObject(o, q), s0, true);
                    break;
                }
                case 34: {
                    androidx.datastore.preferences.protobuf.g0.a0(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 33: {
                    androidx.datastore.preferences.protobuf.g0.Z(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 32: {
                    androidx.datastore.preferences.protobuf.g0.Y(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 31: {
                    androidx.datastore.preferences.protobuf.g0.X(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 30: {
                    androidx.datastore.preferences.protobuf.g0.P(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 29: {
                    androidx.datastore.preferences.protobuf.g0.c0(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 28: {
                    androidx.datastore.preferences.protobuf.g0.N(this.P(i), (List)s2.getObject(o, q), s0);
                    break;
                }
                case 27: {
                    androidx.datastore.preferences.protobuf.g0.W(this.P(i), (List)s2.getObject(o, q), s0, this.r(i));
                    break;
                }
                case 26: {
                    androidx.datastore.preferences.protobuf.g0.b0(this.P(i), (List)s2.getObject(o, q), s0);
                    break;
                }
                case 25: {
                    androidx.datastore.preferences.protobuf.g0.M(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 24: {
                    androidx.datastore.preferences.protobuf.g0.Q(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 23: {
                    androidx.datastore.preferences.protobuf.g0.R(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 22: {
                    androidx.datastore.preferences.protobuf.g0.U(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 21: {
                    androidx.datastore.preferences.protobuf.g0.d0(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 20: {
                    androidx.datastore.preferences.protobuf.g0.V(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 19: {
                    androidx.datastore.preferences.protobuf.g0.S(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 18: {
                    androidx.datastore.preferences.protobuf.g0.O(this.P(i), (List)s2.getObject(o, q), s0, false);
                    break;
                }
                case 17: {
                    if ((n6 & int1) != 0x0) {
                        s0.O(p2, s2.getObject(o, q), this.r(i));
                        break;
                    }
                    break;
                }
                case 16: {
                    if ((n6 & int1) != 0x0) {
                        s0.w(p2, s2.getLong(o, q));
                        break;
                    }
                    break;
                }
                case 15: {
                    if ((n6 & int1) != 0x0) {
                        s0.H(p2, s2.getInt(o, q));
                        break;
                    }
                    break;
                }
                case 14: {
                    if ((n6 & int1) != 0x0) {
                        s0.n(p2, s2.getLong(o, q));
                        break;
                    }
                    break;
                }
                case 13: {
                    if ((n6 & int1) != 0x0) {
                        s0.g(p2, s2.getInt(o, q));
                        break;
                    }
                    break;
                }
                case 12: {
                    if ((n6 & int1) != 0x0) {
                        s0.D(p2, s2.getInt(o, q));
                        break;
                    }
                    break;
                }
                case 11: {
                    if ((n6 & int1) != 0x0) {
                        s0.e(p2, s2.getInt(o, q));
                        break;
                    }
                    break;
                }
                case 10: {
                    if ((n6 & int1) != 0x0) {
                        s0.J(p2, (g)s2.getObject(o, q));
                        break;
                    }
                    break;
                }
                case 9: {
                    if ((n6 & int1) != 0x0) {
                        s0.K(p2, s2.getObject(o, q), this.r(i));
                        break;
                    }
                    break;
                }
                case 8: {
                    if ((n6 & int1) != 0x0) {
                        this.m0(p2, s2.getObject(o, q), s0);
                        break;
                    }
                    break;
                }
                case 7: {
                    if ((n6 & int1) != 0x0) {
                        s0.d(p2, k(o, q));
                        break;
                    }
                    break;
                }
                case 6: {
                    if ((n6 & int1) != 0x0) {
                        s0.l(p2, s2.getInt(o, q));
                        break;
                    }
                    break;
                }
                case 5: {
                    if ((n6 & int1) != 0x0) {
                        s0.u(p2, s2.getLong(o, q));
                        break;
                    }
                    break;
                }
                case 4: {
                    if ((n6 & int1) != 0x0) {
                        s0.i(p2, s2.getInt(o, q));
                        break;
                    }
                    break;
                }
                case 3: {
                    if ((n6 & int1) != 0x0) {
                        s0.C(p2, s2.getLong(o, q));
                        break;
                    }
                    break;
                }
                case 2: {
                    if ((n6 & int1) != 0x0) {
                        s0.c(p2, s2.getLong(o, q));
                        break;
                    }
                    break;
                }
                case 1: {
                    if ((n6 & int1) != 0x0) {
                        s0.x(p2, o(o, q));
                        break;
                    }
                    break;
                }
                case 0: {
                    if ((n6 & int1) != 0x0) {
                        s0.m(p2, l(o, q));
                        break;
                    }
                    break;
                }
            }
            i += 3;
        }
        while (entry != null) {
            this.p.j(s0, (Map.Entry)entry);
            if (n.hasNext()) {
                entry = n.next();
            }
            else {
                entry = null;
            }
        }
        this.n0(this.o, o, s0);
    }
    
    public final boolean j(final Object o, final Object o2, final int n) {
        return this.x(o, n) == this.x(o2, n);
    }
    
    public final void j0(final Object o, final s0 s0) {
        Object n = null;
        Map.Entry<?, ?> entry = null;
        Label_0054: {
            if (this.f) {
                final s c = this.p.c(o);
                if (!c.j()) {
                    n = c.n();
                    entry = ((Iterator<Map.Entry<?, ?>>)n).next();
                    break Label_0054;
                }
            }
            n = (entry = null);
        }
        final int length = this.a.length;
        int n2 = 0;
        Map.Entry<?, ?> entry2;
        while (true) {
            entry2 = entry;
            if (n2 >= length) {
                break;
            }
            final int h0 = this.h0(n2);
            final int p2 = this.P(n2);
            while (entry != null && this.p.a((Map.Entry)entry) <= p2) {
                this.p.j(s0, (Map.Entry)entry);
                if (((Iterator)n).hasNext()) {
                    entry = ((Iterator<Map.Entry<?, ?>>)n).next();
                }
                else {
                    entry = null;
                }
            }
            Label_2343: {
                double n15 = 0.0;
                Label_1083: {
                    float n14 = 0.0f;
                    Label_1048: {
                        long n13 = 0L;
                        Label_1012: {
                            long n12 = 0L;
                            Label_0976: {
                                int n11 = 0;
                                Label_0940: {
                                    long n10 = 0L;
                                    Label_0904: {
                                        int n9 = 0;
                                        Label_0868: {
                                            boolean b = false;
                                            Label_0832: {
                                                Label_0790: {
                                                    Label_0752: {
                                                        Label_0717: {
                                                            int n8 = 0;
                                                            Label_0692: {
                                                                int n7 = 0;
                                                                Label_0656: {
                                                                    int n6 = 0;
                                                                    Label_0620: {
                                                                        long n5 = 0L;
                                                                        Label_0584: {
                                                                            int n4 = 0;
                                                                            Label_0548: {
                                                                                long n3 = 0L;
                                                                                Label_0512: {
                                                                                    switch (g0(h0)) {
                                                                                        default: {
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 68: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                break;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 67: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n3 = V(o, Q(h0));
                                                                                                break Label_0512;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 66: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n4 = U(o, Q(h0));
                                                                                                break Label_0548;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 65: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n5 = V(o, Q(h0));
                                                                                                break Label_0584;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 64: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n6 = U(o, Q(h0));
                                                                                                break Label_0620;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 63: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n7 = U(o, Q(h0));
                                                                                                break Label_0656;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 62: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n8 = U(o, Q(h0));
                                                                                                break Label_0692;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 61: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                break Label_0717;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 60: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                break Label_0752;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 59: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                break Label_0790;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 58: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                b = R(o, Q(h0));
                                                                                                break Label_0832;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 57: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n9 = U(o, Q(h0));
                                                                                                break Label_0868;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 56: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n10 = V(o, Q(h0));
                                                                                                break Label_0904;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 55: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n11 = U(o, Q(h0));
                                                                                                break Label_0940;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 54: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n12 = V(o, Q(h0));
                                                                                                break Label_0976;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 53: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n13 = V(o, Q(h0));
                                                                                                break Label_1012;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 52: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n14 = T(o, Q(h0));
                                                                                                break Label_1048;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 51: {
                                                                                            if (this.D(o, p2, n2)) {
                                                                                                n15 = S(o, Q(h0));
                                                                                                break Label_1083;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 50: {
                                                                                            this.l0(s0, p2, p0.A(o, Q(h0)), n2);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 49: {
                                                                                            g0.T(this.P(n2), (List)p0.A(o, Q(h0)), s0, this.r(n2));
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 48: {
                                                                                            g0.a0(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 47: {
                                                                                            g0.Z(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 46: {
                                                                                            g0.Y(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 45: {
                                                                                            g0.X(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 44: {
                                                                                            g0.P(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 43: {
                                                                                            g0.c0(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 42: {
                                                                                            g0.M(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 41: {
                                                                                            g0.Q(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 40: {
                                                                                            g0.R(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 39: {
                                                                                            g0.U(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 38: {
                                                                                            g0.d0(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 37: {
                                                                                            g0.V(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 36: {
                                                                                            g0.S(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 35: {
                                                                                            g0.O(this.P(n2), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 34: {
                                                                                            g0.a0(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 33: {
                                                                                            g0.Z(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 32: {
                                                                                            g0.Y(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 31: {
                                                                                            g0.X(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 30: {
                                                                                            g0.P(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 29: {
                                                                                            g0.c0(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 28: {
                                                                                            g0.N(this.P(n2), (List)p0.A(o, Q(h0)), s0);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 27: {
                                                                                            g0.W(this.P(n2), (List)p0.A(o, Q(h0)), s0, this.r(n2));
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 26: {
                                                                                            g0.b0(this.P(n2), (List)p0.A(o, Q(h0)), s0);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 25: {
                                                                                            g0.M(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 24: {
                                                                                            g0.Q(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 23: {
                                                                                            g0.R(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 22: {
                                                                                            g0.U(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 21: {
                                                                                            g0.d0(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 20: {
                                                                                            g0.V(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 19: {
                                                                                            g0.S(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 18: {
                                                                                            g0.O(this.P(n2), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 17: {
                                                                                            if (this.x(o, n2)) {
                                                                                                break;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 16: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n3 = G(o, Q(h0));
                                                                                                break Label_0512;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 15: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n4 = v(o, Q(h0));
                                                                                                break Label_0548;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 14: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n5 = G(o, Q(h0));
                                                                                                break Label_0584;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 13: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n6 = v(o, Q(h0));
                                                                                                break Label_0620;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 12: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n7 = v(o, Q(h0));
                                                                                                break Label_0656;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 11: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n8 = v(o, Q(h0));
                                                                                                break Label_0692;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 10: {
                                                                                            if (this.x(o, n2)) {
                                                                                                break Label_0717;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 9: {
                                                                                            if (this.x(o, n2)) {
                                                                                                break Label_0752;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 8: {
                                                                                            if (this.x(o, n2)) {
                                                                                                break Label_0790;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 7: {
                                                                                            if (this.x(o, n2)) {
                                                                                                b = k(o, Q(h0));
                                                                                                break Label_0832;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 6: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n9 = v(o, Q(h0));
                                                                                                break Label_0868;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 5: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n10 = G(o, Q(h0));
                                                                                                break Label_0904;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 4: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n11 = v(o, Q(h0));
                                                                                                break Label_0940;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 3: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n12 = G(o, Q(h0));
                                                                                                break Label_0976;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 2: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n13 = G(o, Q(h0));
                                                                                                break Label_1012;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 1: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n14 = o(o, Q(h0));
                                                                                                break Label_1048;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                        case 0: {
                                                                                            if (this.x(o, n2)) {
                                                                                                n15 = l(o, Q(h0));
                                                                                                break Label_1083;
                                                                                            }
                                                                                            break Label_2343;
                                                                                        }
                                                                                    }
                                                                                    s0.O(p2, p0.A(o, Q(h0)), this.r(n2));
                                                                                    break Label_2343;
                                                                                }
                                                                                s0.w(p2, n3);
                                                                                break Label_2343;
                                                                            }
                                                                            s0.H(p2, n4);
                                                                            break Label_2343;
                                                                        }
                                                                        s0.n(p2, n5);
                                                                        break Label_2343;
                                                                    }
                                                                    s0.g(p2, n6);
                                                                    break Label_2343;
                                                                }
                                                                s0.D(p2, n7);
                                                                break Label_2343;
                                                            }
                                                            s0.e(p2, n8);
                                                            break Label_2343;
                                                        }
                                                        s0.J(p2, (g)p0.A(o, Q(h0)));
                                                        break Label_2343;
                                                    }
                                                    s0.K(p2, p0.A(o, Q(h0)), this.r(n2));
                                                    break Label_2343;
                                                }
                                                this.m0(p2, p0.A(o, Q(h0)), s0);
                                                break Label_2343;
                                            }
                                            s0.d(p2, b);
                                            break Label_2343;
                                        }
                                        s0.l(p2, n9);
                                        break Label_2343;
                                    }
                                    s0.u(p2, n10);
                                    break Label_2343;
                                }
                                s0.i(p2, n11);
                                break Label_2343;
                            }
                            s0.C(p2, n12);
                            break Label_2343;
                        }
                        s0.c(p2, n13);
                        break Label_2343;
                    }
                    s0.x(p2, n14);
                    break Label_2343;
                }
                s0.m(p2, n15);
            }
            n2 += 3;
        }
        while (entry2 != null) {
            this.p.j(s0, (Map.Entry)entry2);
            if (((Iterator)n).hasNext()) {
                entry2 = ((Iterator<Map.Entry<?, ?>>)n).next();
            }
            else {
                entry2 = null;
            }
        }
        this.n0(this.o, o, s0);
    }
    
    public final void k0(final Object o, final s0 s0) {
        this.n0(this.o, o, s0);
        Object e = null;
        Map.Entry<?, ?> entry = null;
        Label_0064: {
            if (this.f) {
                final s c = this.p.c(o);
                if (!c.j()) {
                    e = c.e();
                    entry = ((Iterator<Map.Entry<?, ?>>)e).next();
                    break Label_0064;
                }
            }
            e = (entry = null);
        }
        int n = this.a.length - 3;
        Map.Entry<?, ?> entry2;
        while (true) {
            entry2 = entry;
            if (n < 0) {
                break;
            }
            final int h0 = this.h0(n);
            final int p2 = this.P(n);
            while (entry != null && this.p.a((Map.Entry)entry) > p2) {
                this.p.j(s0, (Map.Entry)entry);
                if (((Iterator)e).hasNext()) {
                    entry = ((Iterator<Map.Entry<?, ?>>)e).next();
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
                                                                                    switch (g0(h0)) {
                                                                                        default: {
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 68: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                break;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 67: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n2 = V(o, Q(h0));
                                                                                                break Label_0516;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 66: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n3 = U(o, Q(h0));
                                                                                                break Label_0552;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 65: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n4 = V(o, Q(h0));
                                                                                                break Label_0588;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 64: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n5 = U(o, Q(h0));
                                                                                                break Label_0624;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 63: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n6 = U(o, Q(h0));
                                                                                                break Label_0660;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 62: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n7 = U(o, Q(h0));
                                                                                                break Label_0696;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 61: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                break Label_0721;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 60: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                break Label_0756;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 59: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                break Label_0794;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 58: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                b = R(o, Q(h0));
                                                                                                break Label_0836;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 57: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n8 = U(o, Q(h0));
                                                                                                break Label_0872;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 56: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n9 = V(o, Q(h0));
                                                                                                break Label_0908;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 55: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n10 = U(o, Q(h0));
                                                                                                break Label_0944;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 54: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n11 = V(o, Q(h0));
                                                                                                break Label_0980;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 53: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n12 = V(o, Q(h0));
                                                                                                break Label_1016;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 52: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n13 = T(o, Q(h0));
                                                                                                break Label_1052;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 51: {
                                                                                            if (this.D(o, p2, n)) {
                                                                                                n14 = S(o, Q(h0));
                                                                                                break Label_1087;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 50: {
                                                                                            this.l0(s0, p2, p0.A(o, Q(h0)), n);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 49: {
                                                                                            g0.T(this.P(n), (List)p0.A(o, Q(h0)), s0, this.r(n));
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 48: {
                                                                                            g0.a0(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 47: {
                                                                                            g0.Z(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 46: {
                                                                                            g0.Y(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 45: {
                                                                                            g0.X(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 44: {
                                                                                            g0.P(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 43: {
                                                                                            g0.c0(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 42: {
                                                                                            g0.M(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 41: {
                                                                                            g0.Q(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 40: {
                                                                                            g0.R(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 39: {
                                                                                            g0.U(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 38: {
                                                                                            g0.d0(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 37: {
                                                                                            g0.V(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 36: {
                                                                                            g0.S(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 35: {
                                                                                            g0.O(this.P(n), (List)p0.A(o, Q(h0)), s0, true);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 34: {
                                                                                            g0.a0(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 33: {
                                                                                            g0.Z(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 32: {
                                                                                            g0.Y(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 31: {
                                                                                            g0.X(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 30: {
                                                                                            g0.P(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 29: {
                                                                                            g0.c0(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 28: {
                                                                                            g0.N(this.P(n), (List)p0.A(o, Q(h0)), s0);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 27: {
                                                                                            g0.W(this.P(n), (List)p0.A(o, Q(h0)), s0, this.r(n));
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 26: {
                                                                                            g0.b0(this.P(n), (List)p0.A(o, Q(h0)), s0);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 25: {
                                                                                            g0.M(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 24: {
                                                                                            g0.Q(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 23: {
                                                                                            g0.R(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 22: {
                                                                                            g0.U(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 21: {
                                                                                            g0.d0(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 20: {
                                                                                            g0.V(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 19: {
                                                                                            g0.S(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 18: {
                                                                                            g0.O(this.P(n), (List)p0.A(o, Q(h0)), s0, false);
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 17: {
                                                                                            if (this.x(o, n)) {
                                                                                                break;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 16: {
                                                                                            if (this.x(o, n)) {
                                                                                                n2 = G(o, Q(h0));
                                                                                                break Label_0516;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 15: {
                                                                                            if (this.x(o, n)) {
                                                                                                n3 = v(o, Q(h0));
                                                                                                break Label_0552;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 14: {
                                                                                            if (this.x(o, n)) {
                                                                                                n4 = G(o, Q(h0));
                                                                                                break Label_0588;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 13: {
                                                                                            if (this.x(o, n)) {
                                                                                                n5 = v(o, Q(h0));
                                                                                                break Label_0624;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 12: {
                                                                                            if (this.x(o, n)) {
                                                                                                n6 = v(o, Q(h0));
                                                                                                break Label_0660;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 11: {
                                                                                            if (this.x(o, n)) {
                                                                                                n7 = v(o, Q(h0));
                                                                                                break Label_0696;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 10: {
                                                                                            if (this.x(o, n)) {
                                                                                                break Label_0721;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 9: {
                                                                                            if (this.x(o, n)) {
                                                                                                break Label_0756;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 8: {
                                                                                            if (this.x(o, n)) {
                                                                                                break Label_0794;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 7: {
                                                                                            if (this.x(o, n)) {
                                                                                                b = k(o, Q(h0));
                                                                                                break Label_0836;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 6: {
                                                                                            if (this.x(o, n)) {
                                                                                                n8 = v(o, Q(h0));
                                                                                                break Label_0872;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 5: {
                                                                                            if (this.x(o, n)) {
                                                                                                n9 = G(o, Q(h0));
                                                                                                break Label_0908;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 4: {
                                                                                            if (this.x(o, n)) {
                                                                                                n10 = v(o, Q(h0));
                                                                                                break Label_0944;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 3: {
                                                                                            if (this.x(o, n)) {
                                                                                                n11 = G(o, Q(h0));
                                                                                                break Label_0980;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 2: {
                                                                                            if (this.x(o, n)) {
                                                                                                n12 = G(o, Q(h0));
                                                                                                break Label_1016;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 1: {
                                                                                            if (this.x(o, n)) {
                                                                                                n13 = o(o, Q(h0));
                                                                                                break Label_1052;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                        case 0: {
                                                                                            if (this.x(o, n)) {
                                                                                                n14 = l(o, Q(h0));
                                                                                                break Label_1087;
                                                                                            }
                                                                                            break Label_2347;
                                                                                        }
                                                                                    }
                                                                                    s0.O(p2, p0.A(o, Q(h0)), this.r(n));
                                                                                    break Label_2347;
                                                                                }
                                                                                s0.w(p2, n2);
                                                                                break Label_2347;
                                                                            }
                                                                            s0.H(p2, n3);
                                                                            break Label_2347;
                                                                        }
                                                                        s0.n(p2, n4);
                                                                        break Label_2347;
                                                                    }
                                                                    s0.g(p2, n5);
                                                                    break Label_2347;
                                                                }
                                                                s0.D(p2, n6);
                                                                break Label_2347;
                                                            }
                                                            s0.e(p2, n7);
                                                            break Label_2347;
                                                        }
                                                        s0.J(p2, (g)p0.A(o, Q(h0)));
                                                        break Label_2347;
                                                    }
                                                    s0.K(p2, p0.A(o, Q(h0)), this.r(n));
                                                    break Label_2347;
                                                }
                                                this.m0(p2, p0.A(o, Q(h0)), s0);
                                                break Label_2347;
                                            }
                                            s0.d(p2, b);
                                            break Label_2347;
                                        }
                                        s0.l(p2, n8);
                                        break Label_2347;
                                    }
                                    s0.u(p2, n9);
                                    break Label_2347;
                                }
                                s0.i(p2, n10);
                                break Label_2347;
                            }
                            s0.C(p2, n11);
                            break Label_2347;
                        }
                        s0.c(p2, n12);
                        break Label_2347;
                    }
                    s0.x(p2, n13);
                    break Label_2347;
                }
                s0.m(p2, n14);
            }
            n -= 3;
        }
        while (entry2 != null) {
            this.p.j(s0, (Map.Entry)entry2);
            if (((Iterator)e).hasNext()) {
                entry2 = ((Iterator<Map.Entry<?, ?>>)e).next();
            }
            else {
                entry2 = null;
            }
        }
    }
    
    public final void l0(final s0 s0, final int n, final Object o, final int n2) {
        if (o != null) {
            s0.N(n, this.q.d(this.q(n2)), this.q.e(o));
        }
    }
    
    public final boolean m(final Object o, final Object o2, final int n) {
        final int h0 = this.h0(n);
        final long q = Q(h0);
        final int g0 = g0(h0);
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
        switch (g0) {
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
                if (this.C(o, o2, n)) {
                    b20 = b19;
                    if (androidx.datastore.preferences.protobuf.g0.J(p0.A(o, q), p0.A(o2, q))) {
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
                return androidx.datastore.preferences.protobuf.g0.J(p0.A(o, q), p0.A(o2, q));
            }
            case 17: {
                boolean b21 = b;
                if (this.j(o, o2, n)) {
                    b21 = b;
                    if (androidx.datastore.preferences.protobuf.g0.J(p0.A(o, q), p0.A(o2, q))) {
                        b21 = true;
                    }
                }
                return b21;
            }
            case 16: {
                boolean b22 = b2;
                if (this.j(o, o2, n)) {
                    b22 = b2;
                    if (p0.y(o, q) == p0.y(o2, q)) {
                        b22 = true;
                    }
                }
                return b22;
            }
            case 15: {
                boolean b23 = b3;
                if (this.j(o, o2, n)) {
                    b23 = b3;
                    if (p0.x(o, q) == p0.x(o2, q)) {
                        b23 = true;
                    }
                }
                return b23;
            }
            case 14: {
                boolean b24 = b4;
                if (this.j(o, o2, n)) {
                    b24 = b4;
                    if (p0.y(o, q) == p0.y(o2, q)) {
                        b24 = true;
                    }
                }
                return b24;
            }
            case 13: {
                boolean b25 = b5;
                if (this.j(o, o2, n)) {
                    b25 = b5;
                    if (p0.x(o, q) == p0.x(o2, q)) {
                        b25 = true;
                    }
                }
                return b25;
            }
            case 12: {
                boolean b26 = b6;
                if (this.j(o, o2, n)) {
                    b26 = b6;
                    if (p0.x(o, q) == p0.x(o2, q)) {
                        b26 = true;
                    }
                }
                return b26;
            }
            case 11: {
                boolean b27 = b7;
                if (this.j(o, o2, n)) {
                    b27 = b7;
                    if (p0.x(o, q) == p0.x(o2, q)) {
                        b27 = true;
                    }
                }
                return b27;
            }
            case 10: {
                boolean b28 = b8;
                if (this.j(o, o2, n)) {
                    b28 = b8;
                    if (androidx.datastore.preferences.protobuf.g0.J(p0.A(o, q), p0.A(o2, q))) {
                        b28 = true;
                    }
                }
                return b28;
            }
            case 9: {
                boolean b29 = b9;
                if (this.j(o, o2, n)) {
                    b29 = b9;
                    if (androidx.datastore.preferences.protobuf.g0.J(p0.A(o, q), p0.A(o2, q))) {
                        b29 = true;
                    }
                }
                return b29;
            }
            case 8: {
                boolean b30 = b10;
                if (this.j(o, o2, n)) {
                    b30 = b10;
                    if (androidx.datastore.preferences.protobuf.g0.J(p0.A(o, q), p0.A(o2, q))) {
                        b30 = true;
                    }
                }
                return b30;
            }
            case 7: {
                boolean b31 = b11;
                if (this.j(o, o2, n)) {
                    b31 = b11;
                    if (p0.p(o, q) == p0.p(o2, q)) {
                        b31 = true;
                    }
                }
                return b31;
            }
            case 6: {
                boolean b32 = b12;
                if (this.j(o, o2, n)) {
                    b32 = b12;
                    if (p0.x(o, q) == p0.x(o2, q)) {
                        b32 = true;
                    }
                }
                return b32;
            }
            case 5: {
                boolean b33 = b13;
                if (this.j(o, o2, n)) {
                    b33 = b13;
                    if (p0.y(o, q) == p0.y(o2, q)) {
                        b33 = true;
                    }
                }
                return b33;
            }
            case 4: {
                boolean b34 = b14;
                if (this.j(o, o2, n)) {
                    b34 = b14;
                    if (p0.x(o, q) == p0.x(o2, q)) {
                        b34 = true;
                    }
                }
                return b34;
            }
            case 3: {
                boolean b35 = b15;
                if (this.j(o, o2, n)) {
                    b35 = b15;
                    if (p0.y(o, q) == p0.y(o2, q)) {
                        b35 = true;
                    }
                }
                return b35;
            }
            case 2: {
                boolean b36 = b16;
                if (this.j(o, o2, n)) {
                    b36 = b16;
                    if (p0.y(o, q) == p0.y(o2, q)) {
                        b36 = true;
                    }
                }
                return b36;
            }
            case 1: {
                boolean b37 = b17;
                if (this.j(o, o2, n)) {
                    b37 = b17;
                    if (Float.floatToIntBits(p0.w(o, q)) == Float.floatToIntBits(p0.w(o2, q))) {
                        b37 = true;
                    }
                }
                return b37;
            }
            case 0: {
                boolean b38 = b18;
                if (this.j(o, o2, n)) {
                    b38 = b18;
                    if (Double.doubleToLongBits(p0.v(o, q)) == Double.doubleToLongBits(p0.v(o2, q))) {
                        b38 = true;
                    }
                }
                return b38;
            }
        }
    }
    
    public final void m0(final int n, final Object o, final s0 s0) {
        if (o instanceof String) {
            s0.A(n, (String)o);
            return;
        }
        s0.J(n, (g)o);
    }
    
    public final Object n(final Object o, final int n, final Object o2, final l0 l0) {
        this.P(n);
        if (p0.A(o, Q(this.h0(n))) == null) {
            return o2;
        }
        this.p(n);
        return o2;
    }
    
    public final void n0(final l0 l0, final Object o, final s0 s0) {
        l0.t(l0.g(o), s0);
    }
    
    public final y.a p(final int n) {
        android.support.v4.media.a.a(this.b[n / 3 * 2 + 1]);
        return null;
    }
    
    public final Object q(final int n) {
        return this.b[n / 3 * 2];
    }
    
    public final e0 r(int n) {
        n = n / 3 * 2;
        final e0 e0 = (e0)this.b[n];
        if (e0 != null) {
            return e0;
        }
        return (e0)(this.b[n] = a0.a().c((Class)this.b[n + 1]));
    }
    
    public final int s(final Object o) {
        final Unsafe s = S.s;
        int n = -1;
        int i = 0;
        int n2 = 0;
        int int1 = 0;
    Label_0516_Outer:
        while (i < this.a.length) {
            final int h0 = this.h0(i);
            final int p = this.P(i);
            final int g0 = g0(h0);
            int n3;
            int n5;
            int n6;
            int n7;
            if (g0 <= 17) {
                n3 = this.a[i + 2];
                final int n4 = 0xFFFFF & n3;
                if (n4 != (n5 = n)) {
                    int1 = s.getInt(o, n4);
                    n5 = n4;
                }
                n6 = 1 << (n3 >>> 20);
                n7 = int1;
            }
            else {
                if (this.i && g0 >= t.c0.c() && g0 <= t.p0.c()) {
                    n3 = (this.a[i + 2] & 0xFFFFF);
                }
                else {
                    n3 = 0;
                }
                n6 = 0;
                n5 = n;
                n7 = int1;
            }
            final long q = Q(h0);
            int n18 = 0;
            Label_2351: {
                int n17 = 0;
                Label_2196: {
                    int n16 = 0;
                Label_0639:
                    while (true) {
                        int x = 0;
                        Label_1158: {
                        Label_0516:
                            while (true) {
                                Label_0860: {
                                    Label_0761: {
                                        Label_0726: {
                                            int n12 = 0;
                                            Label_0701: {
                                                int n11 = 0;
                                            Label_0669:
                                                while (true) {
                                                    Label_0632: {
                                                        Label_0607: {
                                                            int n10 = 0;
                                                            Label_0582: {
                                                                long n9 = 0L;
                                                                Label_0549: {
                                                                    switch (g0) {
                                                                        default: {
                                                                            final int n8 = n2;
                                                                            break Label_0521;
                                                                        }
                                                                        case 68: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                break;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 67: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                n9 = V(o, q);
                                                                                break Label_0549;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 66: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                n10 = U(o, q);
                                                                                break Label_0582;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 65: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                break Label_0607;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 64: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                break Label_0632;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 63: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                n11 = U(o, q);
                                                                                break Label_0669;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 62: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                n12 = U(o, q);
                                                                                break Label_0701;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 61: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                break Label_0726;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 60: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                break Label_0761;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 59: {
                                                                            final int n8 = n2;
                                                                            if (!this.D(o, p, i)) {
                                                                                break Label_0521;
                                                                            }
                                                                            final Object object = s.getObject(o, q);
                                                                            if (object instanceof g) {
                                                                                final int n13 = androidx.datastore.preferences.protobuf.j.f(p, (g)object);
                                                                                break Label_0516;
                                                                            }
                                                                            final int n13 = androidx.datastore.preferences.protobuf.j.N(p, (String)object);
                                                                            break Label_0516;
                                                                        }
                                                                        case 58: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                break Label_0860;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 57: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                final int n14 = androidx.datastore.preferences.protobuf.j.l(p, 0);
                                                                                break Label_0639;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 56: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                final int n13 = androidx.datastore.preferences.protobuf.j.n(p, 0L);
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 55: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                final int n13 = androidx.datastore.preferences.protobuf.j.u(p, U(o, q));
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 54: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                final int n13 = androidx.datastore.preferences.protobuf.j.S(p, V(o, q));
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 53: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                final int n13 = androidx.datastore.preferences.protobuf.j.w(p, V(o, q));
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 52: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                final int n13 = androidx.datastore.preferences.protobuf.j.p(p, 0.0f);
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 51: {
                                                                            final int n8 = n2;
                                                                            if (this.D(o, p, i)) {
                                                                                final int n13 = androidx.datastore.preferences.protobuf.j.h(p, 0.0);
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 50: {
                                                                            final int n13 = this.q.b(p, s.getObject(o, q), this.q(i));
                                                                            break Label_0516;
                                                                        }
                                                                        case 49: {
                                                                            final int n13 = androidx.datastore.preferences.protobuf.g0.j(p, (List)s.getObject(o, q), this.r(i));
                                                                            break Label_0516;
                                                                        }
                                                                        case 48: {
                                                                            final int t = androidx.datastore.preferences.protobuf.g0.t((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (t <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = t;
                                                                            if (this.i) {
                                                                                x = t;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 47: {
                                                                            final int r = androidx.datastore.preferences.protobuf.g0.r((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (r <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = r;
                                                                            if (this.i) {
                                                                                x = r;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 46: {
                                                                            final int j = androidx.datastore.preferences.protobuf.g0.i((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (j <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = j;
                                                                            if (this.i) {
                                                                                x = j;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 45: {
                                                                            final int g2 = androidx.datastore.preferences.protobuf.g0.g((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (g2 <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = g2;
                                                                            if (this.i) {
                                                                                x = g2;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 44: {
                                                                            final int e = androidx.datastore.preferences.protobuf.g0.e((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (e <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = e;
                                                                            if (this.i) {
                                                                                x = e;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 43: {
                                                                            final int w = androidx.datastore.preferences.protobuf.g0.w((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (w <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = w;
                                                                            if (this.i) {
                                                                                x = w;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 42: {
                                                                            final int b = androidx.datastore.preferences.protobuf.g0.b((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (b <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = b;
                                                                            if (this.i) {
                                                                                x = b;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 41: {
                                                                            final int g3 = androidx.datastore.preferences.protobuf.g0.g((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (g3 <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = g3;
                                                                            if (this.i) {
                                                                                x = g3;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 40: {
                                                                            final int k = androidx.datastore.preferences.protobuf.g0.i((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (k <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = k;
                                                                            if (this.i) {
                                                                                x = k;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 39: {
                                                                            final int l = androidx.datastore.preferences.protobuf.g0.l((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (l <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = l;
                                                                            if (this.i) {
                                                                                x = l;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 38: {
                                                                            final int y = androidx.datastore.preferences.protobuf.g0.y((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (y <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = y;
                                                                            if (this.i) {
                                                                                x = y;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 37: {
                                                                            final int n15 = androidx.datastore.preferences.protobuf.g0.n((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (n15 <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = n15;
                                                                            if (this.i) {
                                                                                x = n15;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 36: {
                                                                            final int g4 = androidx.datastore.preferences.protobuf.g0.g((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (g4 <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = g4;
                                                                            if (this.i) {
                                                                                x = g4;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 35: {
                                                                            final int m = androidx.datastore.preferences.protobuf.g0.i((List)s.getObject(o, q));
                                                                            final int n8 = n2;
                                                                            if (m <= 0) {
                                                                                break Label_0521;
                                                                            }
                                                                            x = m;
                                                                            if (this.i) {
                                                                                x = m;
                                                                                break Label_0516;
                                                                            }
                                                                            break Label_1158;
                                                                        }
                                                                        case 34: {
                                                                            n16 = androidx.datastore.preferences.protobuf.g0.s(p, (List)s.getObject(o, q), false);
                                                                            break Label_0639;
                                                                        }
                                                                        case 33: {
                                                                            n16 = androidx.datastore.preferences.protobuf.g0.q(p, (List)s.getObject(o, q), false);
                                                                            break Label_0639;
                                                                        }
                                                                        case 23:
                                                                        case 32: {
                                                                            n16 = androidx.datastore.preferences.protobuf.g0.h(p, (List)s.getObject(o, q), false);
                                                                            break Label_0639;
                                                                        }
                                                                        case 19:
                                                                        case 24:
                                                                        case 31: {
                                                                            n16 = androidx.datastore.preferences.protobuf.g0.f(p, (List)s.getObject(o, q), false);
                                                                            break Label_0639;
                                                                        }
                                                                        case 30: {
                                                                            n16 = androidx.datastore.preferences.protobuf.g0.d(p, (List)s.getObject(o, q), false);
                                                                            break Label_0639;
                                                                        }
                                                                        case 29: {
                                                                            final int n13 = androidx.datastore.preferences.protobuf.g0.v(p, (List)s.getObject(o, q), false);
                                                                            break Label_0516;
                                                                        }
                                                                        case 28: {
                                                                            final int n13 = androidx.datastore.preferences.protobuf.g0.c(p, (List)s.getObject(o, q));
                                                                            break Label_0516;
                                                                        }
                                                                        case 27: {
                                                                            final int n13 = androidx.datastore.preferences.protobuf.g0.p(p, (List)s.getObject(o, q), this.r(i));
                                                                            break Label_0516;
                                                                        }
                                                                        case 26: {
                                                                            final int n13 = androidx.datastore.preferences.protobuf.g0.u(p, (List)s.getObject(o, q));
                                                                            break Label_0516;
                                                                        }
                                                                        case 25: {
                                                                            n16 = androidx.datastore.preferences.protobuf.g0.a(p, (List)s.getObject(o, q), false);
                                                                            break Label_0639;
                                                                        }
                                                                        case 22: {
                                                                            n16 = androidx.datastore.preferences.protobuf.g0.k(p, (List)s.getObject(o, q), false);
                                                                            break Label_0639;
                                                                        }
                                                                        case 21: {
                                                                            n16 = androidx.datastore.preferences.protobuf.g0.x(p, (List)s.getObject(o, q), false);
                                                                            break Label_0639;
                                                                        }
                                                                        case 20: {
                                                                            n16 = androidx.datastore.preferences.protobuf.g0.m(p, (List)s.getObject(o, q), false);
                                                                            break Label_0639;
                                                                        }
                                                                        case 18: {
                                                                            final int n13 = androidx.datastore.preferences.protobuf.g0.h(p, (List)s.getObject(o, q), false);
                                                                            break Label_0516;
                                                                        }
                                                                        case 17: {
                                                                            final int n8 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                break;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 16: {
                                                                            final int n8 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                n9 = s.getLong(o, q);
                                                                                break Label_0549;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 15: {
                                                                            final int n8 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                n10 = s.getInt(o, q);
                                                                                break Label_0582;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 14: {
                                                                            final int n8 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                break Label_0607;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 13: {
                                                                            final int n8 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                break Label_0632;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 12: {
                                                                            final int n8 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                n11 = s.getInt(o, q);
                                                                                break Label_0669;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 11: {
                                                                            final int n8 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                n12 = s.getInt(o, q);
                                                                                break Label_0701;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 10: {
                                                                            final int n8 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                break Label_0726;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 9: {
                                                                            final int n8 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                break Label_0761;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 8: {
                                                                            final int n8 = n2;
                                                                            if ((n7 & n6) == 0x0) {
                                                                                break Label_0521;
                                                                            }
                                                                            final Object object2 = s.getObject(o, q);
                                                                            if (object2 instanceof g) {
                                                                                final int n13 = androidx.datastore.preferences.protobuf.j.f(p, (g)object2);
                                                                                break Label_0516;
                                                                            }
                                                                            final int n13 = androidx.datastore.preferences.protobuf.j.N(p, (String)object2);
                                                                            break Label_0516;
                                                                        }
                                                                        case 7: {
                                                                            final int n8 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                break Label_0860;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 6: {
                                                                            final int n8 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                n17 = androidx.datastore.preferences.protobuf.j.l(p, 0);
                                                                                break Label_2196;
                                                                            }
                                                                            break Label_0521;
                                                                        }
                                                                        case 5: {
                                                                            n18 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                n17 = androidx.datastore.preferences.protobuf.j.n(p, 0L);
                                                                                break Label_2196;
                                                                            }
                                                                            break Label_2351;
                                                                        }
                                                                        case 4: {
                                                                            n18 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                n17 = androidx.datastore.preferences.protobuf.j.u(p, s.getInt(o, q));
                                                                                break Label_2196;
                                                                            }
                                                                            break Label_2351;
                                                                        }
                                                                        case 3: {
                                                                            n18 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                n17 = androidx.datastore.preferences.protobuf.j.S(p, s.getLong(o, q));
                                                                                break Label_2196;
                                                                            }
                                                                            break Label_2351;
                                                                        }
                                                                        case 2: {
                                                                            n18 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                n17 = androidx.datastore.preferences.protobuf.j.w(p, s.getLong(o, q));
                                                                                break Label_2196;
                                                                            }
                                                                            break Label_2351;
                                                                        }
                                                                        case 1: {
                                                                            n18 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                n17 = androidx.datastore.preferences.protobuf.j.p(p, 0.0f);
                                                                                break Label_2196;
                                                                            }
                                                                            break Label_2351;
                                                                        }
                                                                        case 0: {
                                                                            n18 = n2;
                                                                            if ((n7 & n6) != 0x0) {
                                                                                n17 = androidx.datastore.preferences.protobuf.j.h(p, 0.0);
                                                                                break Label_2196;
                                                                            }
                                                                            break Label_2351;
                                                                        }
                                                                    }
                                                                    final int n13 = androidx.datastore.preferences.protobuf.j.r(p, (O)s.getObject(o, q), this.r(i));
                                                                    final int n8 = n2 + n13;
                                                                    n18 = n8;
                                                                    break Label_2351;
                                                                }
                                                                final int n13 = androidx.datastore.preferences.protobuf.j.L(p, n9);
                                                                continue Label_0516;
                                                            }
                                                            final int n13 = androidx.datastore.preferences.protobuf.j.J(p, n10);
                                                            continue Label_0516;
                                                        }
                                                        final int n13 = androidx.datastore.preferences.protobuf.j.H(p, 0L);
                                                        continue Label_0516;
                                                    }
                                                    final int n14 = androidx.datastore.preferences.protobuf.j.F(p, 0);
                                                    final int n8 = n2 + n14;
                                                    continue Label_0516_Outer;
                                                }
                                                final int n13 = androidx.datastore.preferences.protobuf.j.j(p, n11);
                                                continue Label_0516;
                                            }
                                            final int n13 = androidx.datastore.preferences.protobuf.j.Q(p, n12);
                                            continue Label_0516;
                                        }
                                        final int n13 = androidx.datastore.preferences.protobuf.j.f(p, (g)s.getObject(o, q));
                                        continue Label_0516;
                                    }
                                    final int n13 = androidx.datastore.preferences.protobuf.g0.o(p, s.getObject(o, q), this.r(i));
                                    continue Label_0516;
                                }
                                final int n13 = androidx.datastore.preferences.protobuf.j.c(p, true);
                                continue Label_0516;
                            }
                            s.putInt(o, n3, x);
                        }
                        final int n14 = androidx.datastore.preferences.protobuf.j.P(p) + androidx.datastore.preferences.protobuf.j.R(x) + x;
                        continue Label_0639;
                    }
                    n18 = n2 + n16;
                    break Label_2351;
                }
                n18 = n2 + n17;
            }
            i += 3;
            n = n5;
            n2 = n18;
            int1 = n7;
        }
        int n19 = n2 + this.u(this.o, o);
        if (this.f) {
            n19 += this.p.c(o).h();
        }
        return n19;
    }
    
    public final int t(final Object o) {
        final Unsafe s = S.s;
        int n = 0;
        int n3 = 0;
    Label_0416_Outer:
        for (int i = n = 0; i < this.a.length; i += 3, n = n3) {
            final int h0 = this.h0(i);
            final int g0 = g0(h0);
            final int p = this.P(i);
            final long q = Q(h0);
            int n2;
            if (g0 >= t.c0.c() && g0 <= t.p0.c()) {
                n2 = (this.a[i + 2] & 0xFFFFF);
            }
            else {
                n2 = 0;
            }
        Label_0620_Outer:
            while (true) {
                int x = 0;
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
                                                                                                    switch (g0) {
                                                                                                        default: {
                                                                                                            n3 = n;
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 68: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 67: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                n4 = V(o, q);
                                                                                                                break Label_0446;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 66: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                n5 = U(o, q);
                                                                                                                break Label_0478;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 65: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                break Label_0502;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 64: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                break Label_0526;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 63: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                n6 = U(o, q);
                                                                                                                break Label_0557;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 62: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                n7 = U(o, q);
                                                                                                                break Label_0588;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 61: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                break Label_0612;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 60: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                break Label_0648;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 59: {
                                                                                                            n3 = n;
                                                                                                            if (!this.D(o, p, i)) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            final Object o2 = o3 = p0.A(o, q);
                                                                                                            if (o2 instanceof g) {
                                                                                                                final Object a = o2;
                                                                                                                break Label_0706;
                                                                                                            }
                                                                                                            break Label_0709;
                                                                                                        }
                                                                                                        case 58: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                break Label_0737;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 57: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                break Label_0761;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 56: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                break Label_0785;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 55: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                n8 = U(o, q);
                                                                                                                break Label_0816;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 54: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                n9 = V(o, q);
                                                                                                                break Label_0848;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 53: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                n10 = V(o, q);
                                                                                                                break Label_0881;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 52: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                break Label_0906;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 51: {
                                                                                                            n3 = n;
                                                                                                            if (this.D(o, p, i)) {
                                                                                                                break Label_0930;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 50: {
                                                                                                            final int n11 = this.q.b(p, p0.A(o, q), this.q(i));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 49: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.j(p, F(o, q), this.r(i));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 48: {
                                                                                                            final int t = androidx.datastore.preferences.protobuf.g0.t((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (t <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = t;
                                                                                                            if (this.i) {
                                                                                                                x = t;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 47: {
                                                                                                            final int r = androidx.datastore.preferences.protobuf.g0.r((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (r <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = r;
                                                                                                            if (this.i) {
                                                                                                                x = r;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 46: {
                                                                                                            final int j = androidx.datastore.preferences.protobuf.g0.i((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (j <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = j;
                                                                                                            if (this.i) {
                                                                                                                x = j;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 45: {
                                                                                                            final int g2 = androidx.datastore.preferences.protobuf.g0.g((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (g2 <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = g2;
                                                                                                            if (this.i) {
                                                                                                                x = g2;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 44: {
                                                                                                            final int e = androidx.datastore.preferences.protobuf.g0.e((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (e <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = e;
                                                                                                            if (this.i) {
                                                                                                                x = e;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 43: {
                                                                                                            final int w = androidx.datastore.preferences.protobuf.g0.w((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (w <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = w;
                                                                                                            if (this.i) {
                                                                                                                x = w;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 42: {
                                                                                                            final int b = androidx.datastore.preferences.protobuf.g0.b((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (b <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = b;
                                                                                                            if (this.i) {
                                                                                                                x = b;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 41: {
                                                                                                            final int g3 = androidx.datastore.preferences.protobuf.g0.g((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (g3 <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = g3;
                                                                                                            if (this.i) {
                                                                                                                x = g3;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 40: {
                                                                                                            final int k = androidx.datastore.preferences.protobuf.g0.i((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (k <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = k;
                                                                                                            if (this.i) {
                                                                                                                x = k;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 39: {
                                                                                                            final int l = androidx.datastore.preferences.protobuf.g0.l((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (l <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = l;
                                                                                                            if (this.i) {
                                                                                                                x = l;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 38: {
                                                                                                            final int y = androidx.datastore.preferences.protobuf.g0.y((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (y <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = y;
                                                                                                            if (this.i) {
                                                                                                                x = y;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 37: {
                                                                                                            final int n12 = androidx.datastore.preferences.protobuf.g0.n((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (n12 <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = n12;
                                                                                                            if (this.i) {
                                                                                                                x = n12;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 36: {
                                                                                                            final int g4 = androidx.datastore.preferences.protobuf.g0.g((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (g4 <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = g4;
                                                                                                            if (this.i) {
                                                                                                                x = g4;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 35: {
                                                                                                            final int m = androidx.datastore.preferences.protobuf.g0.i((List)s.getObject(o, q));
                                                                                                            n3 = n;
                                                                                                            if (m <= 0) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            x = m;
                                                                                                            if (this.i) {
                                                                                                                x = m;
                                                                                                                break Label_1023;
                                                                                                            }
                                                                                                            break Label_1033;
                                                                                                        }
                                                                                                        case 34: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.s(p, F(o, q), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 33: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.q(p, F(o, q), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 18:
                                                                                                        case 23:
                                                                                                        case 32: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.h(p, F(o, q), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 19:
                                                                                                        case 24:
                                                                                                        case 31: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.f(p, F(o, q), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 30: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.d(p, F(o, q), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 29: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.v(p, F(o, q), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 28: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.c(p, F(o, q));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 27: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.p(p, F(o, q), this.r(i));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 26: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.u(p, F(o, q));
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 25: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.a(p, F(o, q), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 22: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.k(p, F(o, q), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 21: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.x(p, F(o, q), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 20: {
                                                                                                            final int n11 = androidx.datastore.preferences.protobuf.g0.m(p, F(o, q), false);
                                                                                                            break Label_0416;
                                                                                                        }
                                                                                                        case 17: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 16: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                n4 = p0.y(o, q);
                                                                                                                break Label_0446;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 15: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                n5 = p0.x(o, q);
                                                                                                                break Label_0478;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 14: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                break Label_0502;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 13: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                break Label_0526;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 12: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                n6 = p0.x(o, q);
                                                                                                                break Label_0557;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 11: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                n7 = p0.x(o, q);
                                                                                                                break Label_0588;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 10: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                break Label_0612;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 9: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                break Label_0648;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 8: {
                                                                                                            n3 = n;
                                                                                                            if (!this.x(o, i)) {
                                                                                                                continue Label_0416_Outer;
                                                                                                            }
                                                                                                            final Object o4 = o3 = p0.A(o, q);
                                                                                                            if (o4 instanceof g) {
                                                                                                                final Object a = o4;
                                                                                                                break Label_0706;
                                                                                                            }
                                                                                                            break Label_0709;
                                                                                                        }
                                                                                                        case 7: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                break Label_0737;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 6: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                break Label_0761;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 5: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                break Label_0785;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 4: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                n8 = p0.x(o, q);
                                                                                                                break Label_0816;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                n9 = p0.y(o, q);
                                                                                                                break Label_0848;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                n10 = p0.y(o, q);
                                                                                                                break Label_0881;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 1: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                break Label_0906;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                        case 0: {
                                                                                                            n3 = n;
                                                                                                            if (this.x(o, i)) {
                                                                                                                break Label_0930;
                                                                                                            }
                                                                                                            continue Label_0416_Outer;
                                                                                                        }
                                                                                                    }
                                                                                                    final int n11 = androidx.datastore.preferences.protobuf.j.r(p, (O)p0.A(o, q), this.r(i));
                                                                                                    n3 = n + n11;
                                                                                                    continue Label_0416_Outer;
                                                                                                }
                                                                                                final int n11 = androidx.datastore.preferences.protobuf.j.L(p, n4);
                                                                                                continue Label_0620_Outer;
                                                                                            }
                                                                                            final int n11 = androidx.datastore.preferences.protobuf.j.J(p, n5);
                                                                                            continue Label_0620_Outer;
                                                                                        }
                                                                                        final int n11 = androidx.datastore.preferences.protobuf.j.H(p, 0L);
                                                                                        continue Label_0620_Outer;
                                                                                    }
                                                                                    final int n11 = androidx.datastore.preferences.protobuf.j.F(p, 0);
                                                                                    continue Label_0620_Outer;
                                                                                }
                                                                                final int n11 = androidx.datastore.preferences.protobuf.j.j(p, n6);
                                                                                continue Label_0620_Outer;
                                                                            }
                                                                            final int n11 = androidx.datastore.preferences.protobuf.j.Q(p, n7);
                                                                            continue Label_0620_Outer;
                                                                        }
                                                                        final Object a = p0.A(o, q);
                                                                        final int n11 = androidx.datastore.preferences.protobuf.j.f(p, (g)a);
                                                                        continue Label_0620_Outer;
                                                                    }
                                                                    final int n11 = androidx.datastore.preferences.protobuf.g0.o(p, p0.A(o, q), this.r(i));
                                                                    continue Label_0620_Outer;
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                        final int n11 = androidx.datastore.preferences.protobuf.j.N(p, (String)o3);
                                                        continue;
                                                    }
                                                    final int n11 = androidx.datastore.preferences.protobuf.j.c(p, true);
                                                    continue;
                                                }
                                                final int n11 = androidx.datastore.preferences.protobuf.j.l(p, 0);
                                                continue;
                                            }
                                            final int n11 = androidx.datastore.preferences.protobuf.j.n(p, 0L);
                                            continue;
                                        }
                                        final int n11 = androidx.datastore.preferences.protobuf.j.u(p, n8);
                                        continue;
                                    }
                                    final int n11 = androidx.datastore.preferences.protobuf.j.S(p, n9);
                                    continue;
                                }
                                final int n11 = androidx.datastore.preferences.protobuf.j.w(p, n10);
                                continue;
                            }
                            final int n11 = androidx.datastore.preferences.protobuf.j.p(p, 0.0f);
                            continue;
                        }
                        final int n11 = androidx.datastore.preferences.protobuf.j.h(p, 0.0);
                        continue;
                    }
                    s.putInt(o, n2, x);
                }
                final int n11 = androidx.datastore.preferences.protobuf.j.P(p) + androidx.datastore.preferences.protobuf.j.R(x) + x;
                continue;
            }
        }
        return n + this.u(this.o, o);
    }
    
    public final int u(final l0 l0, final Object o) {
        return l0.h(l0.g(o));
    }
    
    public final boolean x(Object a, int n) {
        final boolean h = this.h;
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
        if (!h) {
            n = this.X(n);
            boolean b17 = b15;
            if ((p0.x(a, n & 0xFFFFF) & 1 << (n >>> 20)) != 0x0) {
                b17 = true;
            }
            return b17;
        }
        n = this.h0(n);
        final long q = Q(n);
        switch (g0(n)) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                if (p0.A(a, q) != null) {
                    b16 = true;
                }
                return b16;
            }
            case 16: {
                boolean b18 = b;
                if (p0.y(a, q) != 0L) {
                    b18 = true;
                }
                return b18;
            }
            case 15: {
                boolean b19 = b2;
                if (p0.x(a, q) != 0) {
                    b19 = true;
                }
                return b19;
            }
            case 14: {
                boolean b20 = b3;
                if (p0.y(a, q) != 0L) {
                    b20 = true;
                }
                return b20;
            }
            case 13: {
                boolean b21 = b4;
                if (p0.x(a, q) != 0) {
                    b21 = true;
                }
                return b21;
            }
            case 12: {
                boolean b22 = b5;
                if (p0.x(a, q) != 0) {
                    b22 = true;
                }
                return b22;
            }
            case 11: {
                boolean b23 = b6;
                if (p0.x(a, q) != 0) {
                    b23 = true;
                }
                return b23;
            }
            case 10: {
                return androidx.datastore.preferences.protobuf.g.p.equals(p0.A(a, q)) ^ true;
            }
            case 9: {
                boolean b24 = b7;
                if (p0.A(a, q) != null) {
                    b24 = true;
                }
                return b24;
            }
            case 8: {
                a = p0.A(a, q);
                if (a instanceof String) {
                    return ((String)a).isEmpty() ^ true;
                }
                if (a instanceof g) {
                    return androidx.datastore.preferences.protobuf.g.p.equals(a) ^ true;
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return p0.p(a, q);
            }
            case 6: {
                boolean b25 = b8;
                if (p0.x(a, q) != 0) {
                    b25 = true;
                }
                return b25;
            }
            case 5: {
                boolean b26 = b9;
                if (p0.y(a, q) != 0L) {
                    b26 = true;
                }
                return b26;
            }
            case 4: {
                boolean b27 = b10;
                if (p0.x(a, q) != 0) {
                    b27 = true;
                }
                return b27;
            }
            case 3: {
                boolean b28 = b11;
                if (p0.y(a, q) != 0L) {
                    b28 = true;
                }
                return b28;
            }
            case 2: {
                boolean b29 = b12;
                if (p0.y(a, q) != 0L) {
                    b29 = true;
                }
                return b29;
            }
            case 1: {
                boolean b30 = b13;
                if (p0.w(a, q) != 0.0f) {
                    b30 = true;
                }
                return b30;
            }
            case 0: {
                boolean b31 = b14;
                if (p0.v(a, q) != 0.0) {
                    b31 = true;
                }
                return b31;
            }
        }
    }
    
    public final boolean y(final Object o, final int n, final int n2, final int n3) {
        if (this.h) {
            return this.x(o, n);
        }
        return (n2 & n3) != 0x0;
    }
}
