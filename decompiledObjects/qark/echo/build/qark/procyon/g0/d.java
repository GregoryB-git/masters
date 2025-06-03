// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

public abstract class d
{
    public static final byte[] a;
    public static final String[] b;
    
    static {
        a = new byte[] { 0, 0, 0, 1 };
        b = new String[] { "", "A", "B", "C" };
    }
    
    public static String a(final int i, final int j, final int k) {
        return String.format("avc1.%02X%02X%02X", i, j, k);
    }
    
    public static List b(final boolean b) {
        byte[] o;
        if (b) {
            o = new byte[] { 1 };
        }
        else {
            o = new byte[] { 0 };
        }
        return Collections.singletonList(o);
    }
    
    public static String c(int length, final boolean b, int i, final int j, final int[] array, final int k) {
        final String s = d.b[length];
        char c;
        if (b) {
            c = 'H';
        }
        else {
            c = 'L';
        }
        final StringBuilder sb = new StringBuilder(M.G("hvc1.%s%d.%X.%c%d", s, i, j, c, k));
        for (length = array.length; length > 0 && array[length - 1] == 0; --length) {}
        for (i = 0; i < length; ++i) {
            sb.append(String.format(".%02X", array[i]));
        }
        return sb.toString();
    }
    
    public static byte[] d(final byte[] array, final int n, final int n2) {
        final byte[] a = d.a;
        final byte[] array2 = new byte[a.length + n2];
        System.arraycopy(a, 0, array2, 0, a.length);
        System.arraycopy(array, n, array2, a.length, n2);
        return array2;
    }
    
    public static Pair e(final byte[] array) {
        final z z = new z(array);
        z.T(9);
        final int g = z.G();
        z.T(20);
        return Pair.create((Object)z.K(), (Object)g);
    }
    
    public static boolean f(final List list) {
        final int size = list.size();
        boolean b2;
        final boolean b = b2 = false;
        if (size == 1) {
            b2 = b;
            if (((byte[])list.get(0)).length == 1) {
                b2 = b;
                if (((byte[])list.get(0))[0] == 1) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
}
