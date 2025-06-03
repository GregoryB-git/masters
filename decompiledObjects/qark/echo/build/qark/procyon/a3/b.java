// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a3;

import W2.m;

public abstract class b
{
    public static char a(final long n) {
        final char c = (char)n;
        m.g(c == n, "Out of range: %s", n);
        return c;
    }
    
    public static boolean b(final char[] array, final char c) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == c) {
                return true;
            }
        }
        return false;
    }
    
    public static char c(final byte b, final byte b2) {
        return (char)(b << 8 | (b2 & 0xFF));
    }
}
