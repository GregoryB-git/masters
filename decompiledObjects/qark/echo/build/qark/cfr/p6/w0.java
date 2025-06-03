/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package p6;

import kotlin.jvm.internal.Intrinsics;
import p6.B;
import p6.C0;
import p6.M;
import p6.X;
import p6.l0;
import p6.x0;

public abstract class w0
extends B
implements X,
l0 {
    public x0 r;

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        this.w().u0(this);
    }

    @Override
    public C0 g() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(M.a(this));
        stringBuilder.append('@');
        stringBuilder.append(M.b(this));
        stringBuilder.append("[job@");
        stringBuilder.append(M.b(this.w()));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final x0 w() {
        x0 x02 = this.r;
        if (x02 != null) {
            return x02;
        }
        Intrinsics.n("job");
        return null;
    }

    public final void x(x0 x02) {
        this.r = x02;
    }
}

