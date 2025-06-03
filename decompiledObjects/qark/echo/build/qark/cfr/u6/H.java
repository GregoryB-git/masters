/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.System
 */
package u6;

public abstract class H {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final String b(String string2) {
        try {
            return System.getProperty((String)string2);
        }
        catch (SecurityException securityException) {
            return null;
        }
    }
}

