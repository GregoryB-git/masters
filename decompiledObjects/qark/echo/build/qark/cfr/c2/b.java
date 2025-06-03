/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c2;

public final class b {
    public final String a;

    public b(String string2) {
        if (string2 != null) {
            this.a = string2;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static b b(String string2) {
        return new b(string2);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        return this.a.equals((Object)((b)object).a);
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Encoding{name=\"");
        stringBuilder.append(this.a);
        stringBuilder.append("\"}");
        return stringBuilder.toString();
    }
}

