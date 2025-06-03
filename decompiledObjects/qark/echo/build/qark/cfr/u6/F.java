/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package u6;

public final class F {
    public final String a;

    public F(String string2) {
        this.a = string2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('<');
        stringBuilder.append(this.a);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

