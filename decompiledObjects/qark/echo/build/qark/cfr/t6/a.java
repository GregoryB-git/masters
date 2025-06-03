/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 */
package t6;

import java.util.concurrent.CancellationException;
import s6.c;

public final class a
extends CancellationException {
    public final transient c o;

    public a(c c8) {
        super("Flow was aborted, no more elements needed");
        this.o = c8;
    }

    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

