/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package p6;

import V5.t;
import g6.l;
import p6.M;
import p6.j;

public final class n0
extends j {
    public final l o;

    public n0(l l8) {
        this.o = l8;
    }

    @Override
    public void a(Throwable throwable) {
        this.o.invoke((Object)throwable);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InvokeOnCancel[");
        stringBuilder.append(M.a(this.o));
        stringBuilder.append('@');
        stringBuilder.append(M.b(this));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

