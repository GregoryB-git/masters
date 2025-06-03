/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 */
package V4;

public abstract class f
extends Exception {
    public static final boolean o;
    public static final StackTraceElement[] p;

    static {
        boolean bl = System.getProperty((String)"surefire.test.class.path") != null;
        o = bl;
        p = new StackTraceElement[0];
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Throwable fillInStackTrace() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return null;
    }
}

