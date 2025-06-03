/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.c;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.v;
import m6.b;
import m6.g;
import m6.h;

public abstract class p
extends r
implements g {
    public p(Class class_, String string2, String string3, int n8) {
        super(c.NO_RECEIVER, class_, string2, string3, n8);
    }

    @Override
    public b computeReflected() {
        return v.e(this);
    }

    @Override
    public g.a e() {
        ((g)this.b()).e();
        return null;
    }

    @Override
    public Object invoke(Object object, Object object2) {
        return this.f(object, object2);
    }
}

