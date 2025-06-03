/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package u6;

import X5.g;
import p6.I;

public final class f
implements I {
    public final g o;

    public f(g g8) {
        this.o = g8;
    }

    @Override
    public g f() {
        return this.o;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CoroutineScope(coroutineContext=");
        stringBuilder.append((Object)this.f());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

