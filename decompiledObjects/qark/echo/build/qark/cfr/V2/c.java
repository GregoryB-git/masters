/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package V2;

import V2.j;

public final class c
extends IllegalStateException {
    public c(String string2, Throwable throwable) {
        super(string2, throwable);
    }

    public static IllegalStateException a(j object) {
        if (!object.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = object.i();
        object = exception != null ? "failure" : (object.n() ? "result ".concat(String.valueOf((Object)object.j())) : (object.l() ? "cancellation" : "unknown issue"));
        return new c("Complete with: ".concat((String)object), (Throwable)exception);
    }
}

