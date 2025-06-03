/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package p6;

import p6.C0;
import p6.l0;

public final class Z
implements l0 {
    public final boolean o;

    public Z(boolean bl) {
        this.o = bl;
    }

    @Override
    public boolean a() {
        return this.o;
    }

    @Override
    public C0 g() {
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Empty{");
        String string2 = this.a() ? "Active" : "New";
        stringBuilder.append(string2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

