// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X4;

import java.util.Comparator;
import java.util.Collections;
import Y4.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Arrays;
import java.lang.reflect.Array;

public final class d
{
    public static final String[] b;
    public static final int[][] c;
    public static final int[][] d;
    public static final int[][] e;
    public final byte[] a;
    
    static {
        b = new String[] { "UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT" };
        c = new int[][] { { 0, 327708, 327710, 327709, 656318 }, { 590318, 0, 327710, 327709, 656318 }, { 262158, 590300, 0, 590301, 932798 }, { 327709, 327708, 656318, 0, 327710 }, { 327711, 656380, 656382, 656381, 0 } };
        (d = (int[][])Array.newInstance(Integer.TYPE, 5, 256))[0][32] = 1;
        for (int i = 65; i <= 90; ++i) {
            X4.d.d[0][i] = i - 63;
        }
        X4.d.d[1][32] = 1;
        for (int j = 97; j <= 122; ++j) {
            X4.d.d[1][j] = j - 95;
        }
        X4.d.d[2][32] = 1;
        for (int k = 48; k <= 57; ++k) {
            X4.d.d[2][k] = k - 46;
        }
        final int[] array = X4.d.d[2];
        array[44] = 12;
        array[46] = 13;
        for (int l = 0; l < 28; ++l) {
            X4.d.d[3][(new int[] { 0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127 })[l]] = l;
        }
        for (int n = 0; n < 31; ++n) {
            final int n2 = (new int[] { 0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125 })[n];
            if (n2 > 0) {
                X4.d.d[4][n2] = n;
            }
        }
        final int[][] array2 = e = (int[][])Array.newInstance(Integer.TYPE, 6, 6);
        for (int length = array2.length, n3 = 0; n3 < length; ++n3) {
            Arrays.fill(array2[n3], -1);
        }
        final int[][] e2 = X4.d.e;
        e2[0][4] = 0;
        final int[] array3 = e2[1];
        array3[array3[4] = 0] = 28;
        e2[3][4] = 0;
        final int[] array4 = e2[2];
        array4[array4[4] = 0] = 15;
    }
    
    public d(final byte[] a) {
        this.a = a;
    }
    
    public static Collection b(final Iterable iterable) {
        final LinkedList<f> list = new LinkedList<f>();
    Label_0015:
        for (final f f : iterable) {
            final Iterator<Object> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                final f f2 = iterator2.next();
                if (f2.f(f)) {
                    continue Label_0015;
                }
                if (!f.f(f2)) {
                    continue;
                }
                iterator2.remove();
            }
            list.add(f);
        }
        return list;
    }
    
    public static void d(final f f, final int n, final int n2, final Collection collection) {
        final f b = f.b(n);
        collection.add(b.g(4, n2));
        if (f.e() != 4) {
            collection.add(b.h(4, n2));
        }
        if (n2 == 3 || n2 == 4) {
            collection.add(b.g(2, 16 - n2).g(2, 1));
        }
        if (f.c() > 0) {
            collection.add(f.a(n).a(n + 1));
        }
    }
    
    public static Collection f(final Iterable iterable, final int n, final int n2) {
        final LinkedList list = new LinkedList();
        final Iterator<f> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            d(iterator.next(), n, n2, list);
        }
        return b(list);
    }
    
    public a a() {
        Collection<f> coll = Collections.singletonList(f.e);
        int n = 0;
        while (true) {
            final byte[] a = this.a;
            if (n >= a.length) {
                break;
            }
            final int n2 = n + 1;
            byte b;
            if (n2 < a.length) {
                b = a[n2];
            }
            else {
                b = 0;
            }
            final byte b2 = a[n];
            int n3;
            if ((b2 == 13) ? (b == 10) : ((b2 == 44) ? (b == 32) : ((b2 == 46) ? (b == 32) : (b2 == 58 && b == 32)))) {
                n3 = 5;
            }
            else {
                n3 = 0;
            }
            int n4;
            if (n3 > 0) {
                coll = (Collection<f>)f(coll, n, n3);
                n4 = n2;
            }
            else {
                coll = (Collection<f>)this.e(coll, n);
                n4 = n;
            }
            n = n4 + 1;
        }
        return ((f)Collections.min((Collection<?>)coll, (Comparator<? super Object>)new Comparator() {
            public int a(final f f, final f f2) {
                return f.d() - f2.d();
            }
        })).i(this.a);
    }
    
    public final void c(final f f, final int n, final Collection collection) {
        final char c = (char)(this.a[n] & 0xFF);
        final int n2 = X4.d.d[f.e()][c];
        int i = 0;
        final boolean b = n2 > 0;
        f f2 = null;
        while (i <= 4) {
            final int n3 = X4.d.d[i][c];
            f f3 = f2;
            if (n3 > 0) {
                f b2;
                if ((b2 = f2) == null) {
                    b2 = f.b(n);
                }
                if (!b || i == f.e() || i == 2) {
                    collection.add(b2.g(i, n3));
                }
                f3 = b2;
                if (!b) {
                    f3 = b2;
                    if (X4.d.e[f.e()][i] >= 0) {
                        collection.add(b2.h(i, n3));
                        f3 = b2;
                    }
                }
            }
            ++i;
            f2 = f3;
        }
        if (f.c() > 0 || X4.d.d[f.e()][c] == 0) {
            collection.add(f.a(n));
        }
    }
    
    public final Collection e(final Iterable iterable, final int n) {
        final LinkedList list = new LinkedList();
        final Iterator<f> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.c(iterator.next(), n, list);
        }
        return b(list);
    }
}
