/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package y2;

import x2.d;

public final class g
extends UnsupportedOperationException {
    public final d o;

    public g(d d8) {
        this.o = d8;
    }

    public String getMessage() {
        return "Missing ".concat(String.valueOf((Object)this.o));
    }
}

