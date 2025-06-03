// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import java.io.EOFException;
import d0.A;

public abstract class u
{
    public static void a(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw A.a(s, null);
    }
    
    public static boolean b(final s s, final byte[] array, final int n, final int n2, final boolean b) {
        try {
            return s.l(array, n, n2, b);
        }
        catch (EOFException ex) {
            if (b) {
                return false;
            }
            throw ex;
        }
    }
    
    public static int c(final s s, final byte[] array, final int n, final int n2) {
        int i;
        int f;
        for (i = 0; i < n2; i += f) {
            f = s.f(array, n + i, n2 - i);
            if (f == -1) {
                return i;
            }
        }
        return i;
    }
    
    public static boolean d(final s s, final byte[] array, final int n, final int n2) {
        try {
            s.readFully(array, n, n2);
            return true;
        }
        catch (EOFException ex) {
            return false;
        }
    }
    
    public static boolean e(final s s, final int n) {
        try {
            s.i(n);
            return true;
        }
        catch (EOFException ex) {
            return false;
        }
    }
}
