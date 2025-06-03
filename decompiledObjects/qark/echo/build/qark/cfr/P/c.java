/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package P;

import P.n;
import kotlin.jvm.internal.g;

public final class c
extends n {
    public final Object a;
    public final int b;

    public c(Object object, int n8) {
        super(null);
        this.a = object;
        this.b = n8;
    }

    public final void a() {
        Object object = this.a;
        boolean bl = false;
        int n8 = object != null ? object.hashCode() : 0;
        if (n8 == this.b) {
            bl = true;
        }
        if (bl) {
            return;
        }
        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
    }

    public final Object b() {
        return this.a;
    }
}

