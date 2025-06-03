/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 */
package Z5;

import X5.d;
import X5.g;
import X5.h;
import Z5.a;

public abstract class j
extends a {
    public j(d d8) {
        super(d8);
        if (d8 != null) {
            if (d8.getContext() == h.o) {
                return;
            }
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override
    public g getContext() {
        return h.o;
    }
}

