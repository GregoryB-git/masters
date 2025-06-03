/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 */
package p6;

import java.util.concurrent.CancellationException;

public abstract class f0 {
    public static final CancellationException a(String string2, Throwable throwable) {
        string2 = new CancellationException(string2);
        string2.initCause(throwable);
        return string2;
    }
}

