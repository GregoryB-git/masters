// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import W2.c;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.io.IOException;

public class r extends h
{
    public final k p;
    public final int q;
    
    public r(final k p3, final int n, final int q) {
        super(b(n, q));
        this.p = p3;
        this.q = q;
    }
    
    public r(final IOException ex, final k p4, final int n, final int q) {
        super(ex, b(n, q));
        this.p = p4;
        this.q = q;
    }
    
    public r(final String s, final k p4, final int n, final int q) {
        super(s, b(n, q));
        this.p = p4;
        this.q = q;
    }
    
    public r(final String s, final IOException ex, final k p5, final int n, final int q) {
        super(s, ex, b(n, q));
        this.p = p5;
        this.q = q;
    }
    
    public static int b(final int n, final int n2) {
        int n3 = n;
        if (n == 2000) {
            n3 = n;
            if (n2 == 1) {
                n3 = 2001;
            }
        }
        return n3;
    }
    
    public static r c(final IOException ex, final k k, final int n) {
        final String message = ex.getMessage();
        int n2;
        if (ex instanceof SocketTimeoutException) {
            n2 = 2002;
        }
        else if (ex instanceof InterruptedIOException) {
            n2 = 1004;
        }
        else if (message != null && c.e(message).matches("cleartext.*not permitted.*")) {
            n2 = 2007;
        }
        else {
            n2 = 2001;
        }
        if (n2 == 2007) {
            return new q(ex, k);
        }
        return new r(ex, k, n2, n);
    }
}
