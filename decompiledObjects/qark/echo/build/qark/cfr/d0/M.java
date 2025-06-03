/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Throwable
 */
package d0;

public final class M
extends Exception {
    public final long o;

    public M(Throwable throwable, long l8) {
        super(throwable);
        this.o = l8;
    }

    public static M a(Exception exception) {
        return M.b(exception, -9223372036854775807L);
    }

    public static M b(Exception exception, long l8) {
        if (exception instanceof M) {
            return (M)exception;
        }
        return new M((Throwable)exception, l8);
    }
}

