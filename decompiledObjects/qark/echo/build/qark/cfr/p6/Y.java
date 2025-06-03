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
import p6.X;
import p6.j;

public final class Y
extends j {
    public final X o;

    public Y(X x8) {
        this.o = x8;
    }

    @Override
    public void a(Throwable throwable) {
        this.o.b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DisposeOnCancel[");
        stringBuilder.append((Object)this.o);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

