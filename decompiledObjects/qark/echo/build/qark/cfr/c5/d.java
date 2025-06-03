/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map
 */
package c5;

import Y4.b;
import c5.c;
import c5.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class d
extends n {
    public static int f(CharSequence charSequence, int n8, int n9) {
        a a8;
        a a9 = d.g(charSequence, n8);
        if (a9 == (a8 = a.p)) {
            return 100;
        }
        a a10 = a.o;
        if (a9 == a10) {
            if (n8 < charSequence.length() && ((n8 = (int)charSequence.charAt(n8)) < 32 || n9 == 101 && n8 < 96)) {
                return 101;
            }
            return 100;
        }
        if (n9 == 99) {
            return 99;
        }
        if (n9 == 100) {
            a a11 = a.r;
            if (a9 == a11) {
                return 100;
            }
            a9 = d.g(charSequence, n8 + 2);
            if (a9 != a10) {
                if (a9 == a8) {
                    return 100;
                }
                if (a9 == a11) {
                    if (d.g(charSequence, n8 + 3) == a.q) {
                        return 99;
                    }
                    return 100;
                }
                n8 += 4;
                while ((a8 = d.g(charSequence, n8)) == a.q) {
                    n8 += 2;
                }
                if (a8 == a.p) {
                    return 100;
                }
                return 99;
            }
            return 100;
        }
        a8 = a9;
        if (a9 == a.r) {
            a8 = d.g(charSequence, n8 + 1);
        }
        if (a8 == a.q) {
            return 99;
        }
        return 100;
    }

    public static a g(CharSequence charSequence, int n8) {
        int n9 = charSequence.length();
        if (n8 >= n9) {
            return a.o;
        }
        char c8 = charSequence.charAt(n8);
        if (c8 == '\u00f1') {
            return a.r;
        }
        if (c8 >= '0' && c8 <= '9') {
            if (++n8 >= n9) {
                return a.p;
            }
            if ((n8 = (int)charSequence.charAt(n8)) >= 48 && n8 <= 57) {
                return a.q;
            }
            return a.p;
        }
        return a.o;
    }

    @Override
    public b a(String string2, V4.a a8, int n8, int n9, Map map) {
        if (a8 == V4.a.s) {
            return super.a(string2, a8, n8, n9, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf((Object)((Object)a8))));
    }

    @Override
    public boolean[] c(String arrbl) {
        int n8 = arrbl.length();
        if (n8 > 0 && n8 <= 80) {
            int n9;
            int n10;
            int n11 = 0;
            block9 : for (n9 = 0; n9 < n8; ++n9) {
                char c8 = arrbl.charAt(n9);
                switch (c8) {
                    default: {
                        if (c8 <= '') continue block9;
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf((char)c8)));
                    }
                    case '\u00f1': 
                    case '\u00f2': 
                    case '\u00f3': 
                    case '\u00f4': 
                }
            }
            ArrayList arrayList = new ArrayList();
            int n12 = n9 = (n10 = 0);
            int n13 = 1;
            int n14 = n9;
            do {
                int n15 = 103;
                if (n10 >= n8) break;
                int n16 = d.f((CharSequence)arrbl, n10, n12);
                n9 = 100;
                if (n16 == n12) {
                    switch (arrbl.charAt(n10)) {
                        default: {
                            if (n12 != 100) {
                                if (n12 != 101) {
                                    n9 = Integer.parseInt((String)arrbl.substring(n10, n10 + 2));
                                    n16 = n10 + 1;
                                    break;
                                }
                                char c9 = arrbl.charAt(n10);
                                n15 = c9 - 32;
                                n16 = n10;
                                n9 = n15;
                                if (n15 >= 0) break;
                                n9 = c9 + 64;
                                n16 = n10;
                                break;
                            }
                            n9 = arrbl.charAt(n10) - 32;
                            n16 = n10;
                            break;
                        }
                        case '\u00f4': {
                            n16 = n10;
                            if (n12 != 101) break;
                            n9 = 101;
                            n16 = n10;
                            break;
                        }
                        case '\u00f3': {
                            n9 = 96;
                            n16 = n10;
                            break;
                        }
                        case '\u00f2': {
                            n9 = 97;
                            n16 = n10;
                            break;
                        }
                        case '\u00f1': {
                            n9 = 102;
                            n16 = n10;
                        }
                    }
                    ++n16;
                    n15 = n12;
                } else {
                    if (n12 == 0) {
                        if (n16 != 100) {
                            n9 = n15;
                            if (n16 != 101) {
                                n9 = 105;
                            }
                        } else {
                            n9 = 104;
                        }
                    } else {
                        n9 = n16;
                    }
                    n15 = n16;
                    n16 = n10;
                }
                arrayList.add((Object)c.a[n9]);
                n9 = n14 + n9 * n13;
                n10 = n16;
                n14 = n9;
                n12 = n15;
                if (n16 == 0) continue;
                ++n13;
                n10 = n16;
                n14 = n9;
                n12 = n15;
            } while (true);
            arrbl = c.a;
            arrayList.add((Object)arrbl[n14 % 103]);
            arrayList.add((Object)arrbl[106]);
            arrbl = arrayList.iterator();
            n9 = 0;
            block11 : while (arrbl.hasNext()) {
                int[] arrn = (int[])arrbl.next();
                n14 = arrn.length;
                n13 = 0;
                n10 = n9;
                do {
                    n9 = n10;
                    if (n13 >= n14) continue block11;
                    n10 += arrn[n13];
                    ++n13;
                } while (true);
            }
            arrbl = new boolean[n9];
            arrayList = arrayList.iterator();
            n9 = n11;
            while (arrayList.hasNext()) {
                n9 += n.b(arrbl, n9, (int[])arrayList.next(), true);
            }
            return arrbl;
        }
        throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf((int)n8)));
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a o;
        public static final /* enum */ a p;
        public static final /* enum */ a q;
        public static final /* enum */ a r;
        public static final /* synthetic */ a[] s;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            o = a10 = new a();
            p = a9 = new a();
            q = a11 = new a();
            r = a8 = new a();
            s = new a[]{a10, a9, a11, a8};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])s.clone();
        }
    }

}

