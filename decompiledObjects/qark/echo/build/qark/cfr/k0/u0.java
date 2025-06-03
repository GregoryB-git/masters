/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package k0;

public final class u0
extends RuntimeException {
    public final int o;

    public u0(int n8) {
        super(u0.a(n8));
        this.o = n8;
    }

    public static String a(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return "Undefined timeout.";
                }
                return "Detaching surface timed out.";
            }
            return "Setting foreground mode timed out.";
        }
        return "Player release timed out.";
    }
}

