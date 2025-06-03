/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package Z5;

import X5.d;
import X5.g;

public final class c
implements d {
    public static final c o = new c();

    @Override
    public g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override
    public void resumeWith(Object object) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}

