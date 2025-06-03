/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package u6;

import u6.q;

public final class z {
    public final q a;

    public z(q q8) {
        this.a = q8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Removed[");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

