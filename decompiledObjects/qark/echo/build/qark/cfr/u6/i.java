/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.RuntimeException
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Throwable
 */
package u6;

import X5.g;

public final class i
extends RuntimeException {
    public final transient g o;

    public i(g g8) {
        this.o = g8;
    }

    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.o.toString();
    }
}

