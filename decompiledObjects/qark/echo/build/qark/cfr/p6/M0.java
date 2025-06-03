/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package p6;

import X5.g;
import android.support.v4.media.a;
import p6.F;
import p6.Q0;

public final class M0
extends F {
    public static final M0 q = new M0();

    @Override
    public void E(g g8, Runnable runnable) {
        a.a(g8.b(Q0.p));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override
    public boolean F(g g8) {
        return false;
    }

    @Override
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}

