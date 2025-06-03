/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package u6;

import p6.M;

public abstract class y {
    public abstract Object a(Object var1);

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(M.a(this));
        stringBuilder.append('@');
        stringBuilder.append(M.b(this));
        return stringBuilder.toString();
    }
}

