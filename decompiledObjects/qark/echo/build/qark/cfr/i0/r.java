/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.SocketTimeoutException
 */
package i0;

import W2.c;
import i0.h;
import i0.k;
import i0.q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class r
extends h {
    public final k p;
    public final int q;

    public r(k k8, int n8, int n9) {
        super(r.b(n8, n9));
        this.p = k8;
        this.q = n9;
    }

    public r(IOException iOException, k k8, int n8, int n9) {
        super((Throwable)iOException, r.b(n8, n9));
        this.p = k8;
        this.q = n9;
    }

    public r(String string2, k k8, int n8, int n9) {
        super(string2, r.b(n8, n9));
        this.p = k8;
        this.q = n9;
    }

    public r(String string2, IOException iOException, k k8, int n8, int n9) {
        super(string2, (Throwable)iOException, r.b(n8, n9));
        this.p = k8;
        this.q = n9;
    }

    public static int b(int n8, int n9) {
        int n10 = n8;
        if (n8 == 2000) {
            n10 = n8;
            if (n9 == 1) {
                n10 = 2001;
            }
        }
        return n10;
    }

    public static r c(IOException iOException, k k8, int n8) {
        String string2 = iOException.getMessage();
        int n9 = iOException instanceof SocketTimeoutException ? 2002 : (iOException instanceof InterruptedIOException ? 1004 : (string2 != null && c.e(string2).matches("cleartext.*not permitted.*") ? 2007 : 2001));
        if (n9 == 2007) {
            return new q(iOException, k8);
        }
        return new r(iOException, k8, n9, n8);
    }
}

