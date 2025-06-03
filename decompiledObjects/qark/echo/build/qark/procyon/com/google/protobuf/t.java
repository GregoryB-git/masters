// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.RandomAccess;
import java.util.List;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class t
{
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final g f;
    
    static {
        a = Charset.forName("US-ASCII");
        b = Charset.forName("UTF-8");
        c = Charset.forName("ISO-8859-1");
        final byte[] array = d = new byte[0];
        e = ByteBuffer.wrap(array);
        f = g.a(array);
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
    
    public static int e(final byte[] array, int h, int n) {
        n = (h = h(n, array, h, n));
        if (n == 0) {
            h = 1;
        }
        return h;
    }
    
    public static int f(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static boolean g(final byte[] array) {
        return l0.l(array);
    }
    
    public static int h(int n, final byte[] array, final int n2, final int n3) {
        for (int i = n2; i < n2 + n3; ++i) {
            n = n * 31 + array[i];
        }
        return n;
    }
    
    public static String i(final byte[] bytes) {
        return new String(bytes, t.b);
    }
    
    public interface a
    {
        int g();
    }
    
    public interface b
    {
    }
    
    public interface c
    {
    }
    
    public interface d extends e
    {
        int F(final int p0);
        
        d h(final int p0);
        
        void z(final int p0);
    }
    
    public interface e extends List, RandomAccess
    {
        e h(final int p0);
        
        void j();
        
        boolean p();
    }
}
