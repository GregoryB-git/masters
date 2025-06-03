// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.RandomAccess;
import java.util.List;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class y
{
    public static final Charset a;
    public static final Charset b;
    public static final byte[] c;
    public static final ByteBuffer d;
    public static final h e;
    
    static {
        a = Charset.forName("UTF-8");
        b = Charset.forName("ISO-8859-1");
        final byte[] array = c = new byte[0];
        d = ByteBuffer.wrap(array);
        e = h.h(array);
    }
    
    public static Object a(final Object o) {
        o.getClass();
        return o;
    }
    
    public static Object b(final Object o, final String s) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(s);
    }
    
    public static int c(final boolean b) {
        if (b) {
            return 1231;
        }
        return 1237;
    }
    
    public static int d(final byte[] array) {
        return e(array, 0, array.length);
    }
    
    public static int e(final byte[] array, int i, int n) {
        n = (i = i(n, array, i, n));
        if (n == 0) {
            i = 1;
        }
        return i;
    }
    
    public static int f(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static boolean g(final byte[] array) {
        return q0.m(array);
    }
    
    public static Object h(final Object o, final Object o2) {
        return ((O)o).f().h((O)o2).c();
    }
    
    public static int i(int n, final byte[] array, final int n2, final int n3) {
        for (int i = n2; i < n2 + n3; ++i) {
            n = n * 31 + array[i];
        }
        return n;
    }
    
    public static String j(final byte[] bytes) {
        return new String(bytes, y.a);
    }
    
    public interface a
    {
        boolean a(final int p0);
    }
    
    public interface b extends List, RandomAccess
    {
        b h(final int p0);
        
        void j();
        
        boolean p();
    }
}
