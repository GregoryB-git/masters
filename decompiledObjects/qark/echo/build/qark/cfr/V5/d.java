/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package V5;

import V5.h;
import java.io.Serializable;

public final class d
implements h,
Serializable {
    public final Object o;

    public d(Object object) {
        this.o = object;
    }

    @Override
    public Object getValue() {
        return this.o;
    }

    public String toString() {
        return String.valueOf((Object)this.getValue());
    }
}

