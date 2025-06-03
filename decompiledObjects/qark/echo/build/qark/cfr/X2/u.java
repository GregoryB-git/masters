/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 */
package X2;

import X2.e;
import java.io.Serializable;

public class u
extends e
implements Serializable {
    private static final long serialVersionUID = 0L;
    public final Object o;
    public final Object p;

    public u(Object object, Object object2) {
        this.o = object;
        this.p = object2;
    }

    @Override
    public final Object getKey() {
        return this.o;
    }

    @Override
    public final Object getValue() {
        return this.p;
    }

    public final Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }
}

