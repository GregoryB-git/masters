/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.lang.Object
 *  java.lang.String
 */
package F0;

import F0.s;
import d0.A;
import java.io.EOFException;

public abstract class u {
    public static void a(boolean bl, String string2) {
        if (bl) {
            return;
        }
        throw A.a(string2, null);
    }

    public static boolean b(s s8, byte[] arrby, int n8, int n9, boolean bl) {
        try {
            boolean bl2 = s8.l(arrby, n8, n9, bl);
            return bl2;
        }
        catch (EOFException eOFException) {
            if (bl) {
                return false;
            }
            throw eOFException;
        }
    }

    public static int c(s s8, byte[] arrby, int n8, int n9) {
        int n10;
        int n11;
        for (n11 = 0; n11 < n9; n11 += n10) {
            n10 = s8.f(arrby, n8 + n11, n9 - n11);
            if (n10 != -1) continue;
            return n11;
        }
        return n11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean d(s s8, byte[] arrby, int n8, int n9) {
        try {
            s8.readFully(arrby, n8, n9);
            return true;
        }
        catch (EOFException eOFException) {
            return false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean e(s s8, int n8) {
        try {
            s8.i(n8);
            return true;
        }
        catch (EOFException eOFException) {
            return false;
        }
    }
}

