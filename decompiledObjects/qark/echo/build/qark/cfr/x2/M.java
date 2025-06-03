/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 */
package x2;

import java.util.concurrent.Callable;
import x2.L;
import x2.N;
import x2.O;

public final class M
extends O {
    public final Callable f;

    public /* synthetic */ M(Callable callable, L l8) {
        super(false, 1, 5, null, null, null);
        this.f = callable;
    }

    @Override
    public final String a() {
        try {
            String string2 = (String)this.f.call();
            return string2;
        }
        catch (Exception exception) {
            throw new RuntimeException((Throwable)exception);
        }
    }
}

