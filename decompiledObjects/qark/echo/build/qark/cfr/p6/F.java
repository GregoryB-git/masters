/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package p6;

import X5.b;
import X5.d;
import X5.e;
import X5.g;
import g6.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import p6.M;
import u6.j;
import u6.m;
import u6.n;

public abstract class F
extends X5.a
implements e {
    public static final a p = new a(null);

    public F() {
        super(e.c);
    }

    @Override
    public final void C(d d8) {
        Intrinsics.c(d8, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((j)d8).r();
    }

    public abstract void E(X5.g var1, Runnable var2);

    public boolean F(X5.g g8) {
        return true;
    }

    public F G(int n8) {
        n.a(n8);
        return new m(this, n8);
    }

    @Override
    public g.b b(g.c c8) {
        return e.a.a(this, c8);
    }

    @Override
    public final d i(d d8) {
        return new j(this, d8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(M.a(this));
        stringBuilder.append('@');
        stringBuilder.append(M.b(this));
        return stringBuilder.toString();
    }

    @Override
    public X5.g x(g.c c8) {
        return e.a.b(this, c8);
    }

    public static final class a
    extends b {
        public a() {
            super(e.c, .o);
        }

        public /* synthetic */ a(g g8) {
            this();
        }

    }

}

