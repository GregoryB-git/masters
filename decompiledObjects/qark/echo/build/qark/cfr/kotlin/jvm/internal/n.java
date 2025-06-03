/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.r;
import kotlin.jvm.internal.v;
import m6.b;
import m6.f;

public abstract class n
extends r
implements f {
    public n(Object object, Class class_, String string2, String string3, int n8) {
        super(object, class_, string2, string3, n8);
    }

    @Override
    public b computeReflected() {
        return v.d(this);
    }

    @Override
    public Object invoke() {
        return this.get();
    }
}

