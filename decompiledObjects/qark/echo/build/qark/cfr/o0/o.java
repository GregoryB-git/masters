/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package o0;

public final class o {
    public final String a;
    public final String b;

    public o(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

