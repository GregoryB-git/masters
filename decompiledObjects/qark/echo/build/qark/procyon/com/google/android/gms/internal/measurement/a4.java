// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class a4
{
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final G3 f;
    
    static {
        a = Charset.forName("US-ASCII");
        b = Charset.forName("UTF-8");
        c = Charset.forName("ISO-8859-1");
        final byte[] array = d = new byte[0];
        e = ByteBuffer.wrap(array);
        f = G3.c(array, 0, array.length, false);
    }
    
    public static int a(int n, final byte[] array, final int n2, final int n3) {
        for (int i = n2; i < n2 + n3; ++i) {
            n = n * 31 + array[i];
        }
        return n;
    }
    
    public static int b(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static int c(final boolean b) {
        if (b) {
            return 1231;
        }
        return 1237;
    }
    
    public static int d(final byte[] array) {
        final int length = array.length;
        int a;
        if ((a = a(length, array, 0, length)) == 0) {
            a = 1;
        }
        return a;
    }
    
    public static Object e(final Object o) {
        o.getClass();
        return o;
    }
    
    public static Object f(final Object o, final String s) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(s);
    }
    
    public static boolean g(final I4 i4) {
        return false;
    }
    
    public static String h(final byte[] bytes) {
        return new String(bytes, a4.b);
    }
    
    public static boolean i(final byte[] array) {
        return E5.d(array);
    }
}
