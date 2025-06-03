/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package J3;

import J3.B;

public final class u
extends B.e.d.d {
    public final String a;

    public u(String string2) {
        this.a = string2;
    }

    public /* synthetic */ u(String string2,  a8) {
        this(string2);
    }

    @Override
    public String b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.d.d) {
            object = (B.e.d.d)object;
            return this.a.equals((Object)object.b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Log{content=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.d.d.a {
        public String a;

        @Override
        public B.e.d.d a() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" content");
                string3 = string3.toString();
            }
            if (string3.isEmpty()) {
                return new u(this.a, null);
            }
            string2 = new StringBuilder();
            string2.append("Missing required properties:");
            string2.append(string3);
            throw new IllegalStateException(string2.toString());
        }

        @Override
        public B.e.d.d.a b(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

}

