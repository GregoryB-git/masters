// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d5;

import java.nio.charset.Charset;
import V4.c;
import java.util.Map;
import java.lang.reflect.Array;
import e5.d;
import Y4.b;
import V4.g;

public final class a implements g
{
    public static b b(final byte[][] array, final int n) {
        final int length = array[0].length;
        final int n2 = n * 2;
        final b b = new b(length + n2, array.length + n2);
        b.b();
        for (int n3 = b.g() - n - 1, i = 0; i < array.length; ++i, --n3) {
            final byte[] array2 = array[i];
            for (int j = 0; j < array[0].length; ++j) {
                if (array2[j] == 1) {
                    b.l(j + n, n3);
                }
            }
        }
        return b;
    }
    
    public static b c(final d d, final String s, int n, int n2, int n3, final int n4) {
        d.e(s, n);
        byte[][] array = d.f().b(1, 4);
        if (n3 > n2) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != ((array[0].length < array.length) ? 1 : 0)) {
            array = d(array);
            n = 1;
        }
        else {
            n = 0;
        }
        n2 /= array[0].length;
        n3 /= array.length;
        if (n2 >= n3) {
            n2 = n3;
        }
        if (n2 > 1) {
            byte[][] array2 = d.f().b(n2, n2 << 2);
            if (n != 0) {
                array2 = d(array2);
            }
            return b(array2, n4);
        }
        return b(array, n4);
    }
    
    public static byte[][] d(final byte[][] array) {
        final byte[][] array2 = (byte[][])Array.newInstance(Byte.TYPE, array[0].length, array.length);
        for (int i = 0; i < array.length; ++i) {
            final int length = array.length;
            for (int j = 0; j < array[0].length; ++j) {
                array2[j][length - i - 1] = array[i][j];
            }
        }
        return array2;
    }
    
    @Override
    public b a(final String s, final V4.a obj, final int n, final int n2, final Map map) {
        if (obj == V4.a.y) {
            final d d = new d();
            int int1 = 30;
            int n3;
            int int2 = n3 = 2;
            int n4 = int1;
            if (map != null) {
                final c u = c.u;
                if (map.containsKey(u)) {
                    d.h(Boolean.valueOf(map.get(u).toString()));
                }
                final c v = c.v;
                if (map.containsKey(v)) {
                    d.i(e5.c.valueOf(map.get(v).toString()));
                }
                final c w = c.w;
                if (map.containsKey(w)) {
                    android.support.v4.media.a.a(map.get(w));
                    throw null;
                }
                final c t = c.t;
                if (map.containsKey(t)) {
                    int1 = Integer.parseInt(map.get(t).toString());
                }
                final c o = c.o;
                if (map.containsKey(o)) {
                    int2 = Integer.parseInt(map.get(o).toString());
                }
                final c p5 = c.p;
                n3 = int2;
                n4 = int1;
                if (map.containsKey(p5)) {
                    d.j(Charset.forName(map.get(p5).toString()));
                    n4 = int1;
                    n3 = int2;
                }
            }
            return c(d, s, n3, n, n2, n4);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(obj)));
    }
}
