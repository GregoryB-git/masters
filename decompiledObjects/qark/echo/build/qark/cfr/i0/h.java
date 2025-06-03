/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.String
 *  java.lang.Throwable
 */
package i0;

import java.io.IOException;

public class h
extends IOException {
    public final int o;

    public h(int n8) {
        this.o = n8;
    }

    public h(String string2, int n8) {
        super(string2);
        this.o = n8;
    }

    public h(String string2, Throwable throwable, int n8) {
        super(string2, throwable);
        this.o = n8;
    }

    public h(Throwable throwable, int n8) {
        super(throwable);
        this.o = n8;
    }

    public static boolean a(IOException iOException) {
        while (iOException != null) {
            if (iOException instanceof h && ((h)iOException).o == 2008) {
                return true;
            }
            iOException = iOException.getCause();
        }
        return false;
    }
}

