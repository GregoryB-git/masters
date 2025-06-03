// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

import java.util.Iterator;
import java.util.ArrayList;
import Y4.b;
import java.util.Map;
import V4.a;

public final class d extends n
{
    public static int f(final CharSequence charSequence, int char1, final int n) {
        final a g = g(charSequence, char1);
        final a p3 = a.p;
        if (g == p3) {
            return 100;
        }
        final a o = a.o;
        if (g == o) {
            if (char1 < charSequence.length()) {
                char1 = charSequence.charAt(char1);
                if (char1 < 32 || (n == 101 && char1 < 96)) {
                    return 101;
                }
            }
            return 100;
        }
        if (n == 99) {
            return 99;
        }
        if (n == 100) {
            final a r = a.r;
            if (g == r) {
                return 100;
            }
            final a g2 = g(charSequence, char1 + 2);
            if (g2 == o) {
                return 100;
            }
            if (g2 == p3) {
                return 100;
            }
            if (g2 == r) {
                if (g(charSequence, char1 + 3) == a.q) {
                    return 99;
                }
                return 100;
            }
            else {
                char1 += 4;
                a g3;
                while (true) {
                    g3 = g(charSequence, char1);
                    if (g3 != a.q) {
                        break;
                    }
                    char1 += 2;
                }
                if (g3 == a.p) {
                    return 100;
                }
                return 99;
            }
        }
        else {
            a g4;
            if ((g4 = g) == a.r) {
                g4 = g(charSequence, char1 + 1);
            }
            if (g4 == a.q) {
                return 99;
            }
            return 100;
        }
    }
    
    public static a g(final CharSequence charSequence, int char1) {
        final int length = charSequence.length();
        if (char1 >= length) {
            return a.o;
        }
        final char char2 = charSequence.charAt(char1);
        if (char2 == '\u00f1') {
            return a.r;
        }
        if (char2 < '0' || char2 > '9') {
            return a.o;
        }
        ++char1;
        if (char1 >= length) {
            return a.p;
        }
        char1 = charSequence.charAt(char1);
        if (char1 >= 48 && char1 <= 57) {
            return a.q;
        }
        return a.p;
    }
    
    @Override
    public b a(final String s, final V4.a obj, final int n, final int n2, final Map map) {
        if (obj == V4.a.s) {
            return super.a(s, obj, n, n2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(obj)));
    }
    
    @Override
    public boolean[] c(final String s) {
        final int length = s.length();
        if (length > 0 && length <= 80) {
            final int n = 0;
            int i = 0;
            while (i < length) {
                final char char1 = s.charAt(i);
                Label_0094: {
                    switch (char1) {
                        default: {
                            if (char1 <= '\u007f') {
                                break Label_0094;
                            }
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(char1)));
                        }
                        case 241:
                        case 242:
                        case 243:
                        case 244: {
                            ++i;
                            continue;
                        }
                    }
                }
            }
            final ArrayList<int[]> list = new ArrayList<int[]>();
            int n2 = 0;
            int n4;
            final int n3 = n4 = n2;
            int n5 = 1;
            int n6 = n3;
            while (true) {
                final int n7 = 103;
                if (n2 >= length) {
                    break;
                }
                final int f = f(s, n2, n4);
                int int1 = 100;
                int n10;
                int n11;
                if (f == n4) {
                    int n8 = 0;
                    switch (s.charAt(n2)) {
                        default: {
                            if (n4 == 100) {
                                int1 = s.charAt(n2) - ' ';
                                n8 = n2;
                                break;
                            }
                            if (n4 != 101) {
                                int1 = Integer.parseInt(s.substring(n2, n2 + 2));
                                n8 = n2 + 1;
                                break;
                            }
                            final char char2 = s.charAt(n2);
                            final int n9 = char2 - ' ';
                            n8 = n2;
                            if ((int1 = n9) < 0) {
                                int1 = char2 + '@';
                                n8 = n2;
                                break;
                            }
                            break;
                        }
                        case '\u00f4': {
                            n8 = n2;
                            if (n4 == 101) {
                                int1 = 101;
                                n8 = n2;
                                break;
                            }
                            break;
                        }
                        case '\u00f3': {
                            int1 = 96;
                            n8 = n2;
                            break;
                        }
                        case '\u00f2': {
                            int1 = 97;
                            n8 = n2;
                            break;
                        }
                        case '\u00f1': {
                            int1 = 102;
                            n8 = n2;
                            break;
                        }
                    }
                    n10 = n8 + 1;
                    n11 = n4;
                }
                else {
                    if (n4 == 0) {
                        if (f != 100) {
                            int1 = n7;
                            if (f != 101) {
                                int1 = 105;
                            }
                        }
                        else {
                            int1 = 104;
                        }
                    }
                    else {
                        int1 = f;
                    }
                    n11 = f;
                    n10 = n2;
                }
                list.add(c.a[int1]);
                final int n12 = n6 + int1 * n5;
                n2 = n10;
                n6 = n12;
                n4 = n11;
                if (n10 == 0) {
                    continue;
                }
                ++n5;
                n2 = n10;
                n6 = n12;
                n4 = n11;
            }
            final int[][] a = c.a;
            list.add(a[n6 % 103]);
            list.add(a[106]);
            final Iterator<Object> iterator = list.iterator();
            int n13 = 0;
            while (iterator.hasNext()) {
                final int[] array = iterator.next();
                final int length2 = array.length;
                int n14 = 0;
                int n15 = n13;
                while (true) {
                    n13 = n15;
                    if (n14 >= length2) {
                        break;
                    }
                    n15 += array[n14];
                    ++n14;
                }
            }
            final boolean[] array2 = new boolean[n13];
            final Iterator<Object> iterator2 = list.iterator();
            int n16 = n;
            while (iterator2.hasNext()) {
                n16 += c5.n.b(array2, n16, iterator2.next(), true);
            }
            return array2;
        }
        throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
    }
    
    public enum a
    {
        o("UNCODABLE", 0), 
        p("ONE_DIGIT", 1), 
        q("TWO_DIGITS", 2), 
        r("FNC_1", 3);
        
        public a(final String name, final int ordinal) {
        }
    }
}
