/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package r6;

import p6.P0;

public final class o {
    public final P0 a;

    public o(P0 p02) {
        this.a = p02;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WaiterEB(");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

