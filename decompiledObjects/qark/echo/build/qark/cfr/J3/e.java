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

public final class e
extends B.c {
    public final String a;
    public final String b;

    public e(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }

    public /* synthetic */ e(String string2, String string3,  a8) {
        this(string2, string3);
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public String c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.c) {
            if (this.a.equals((Object)(object = (B.c)object).b()) && this.b.equals((Object)object.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CustomAttribute{key=");
        stringBuilder.append(this.a);
        stringBuilder.append(", value=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.c.a {
        public String a;
        public String b;

        @Override
        public B.c a() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" key");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.b == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" value");
                string2 = string2.toString();
            }
            if (string2.isEmpty()) {
                return new e(this.a, this.b, null);
            }
            string3 = new StringBuilder();
            string3.append("Missing required properties:");
            string3.append(string2);
            throw new IllegalStateException(string3.toString());
        }

        @Override
        public B.c.a b(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override
        public B.c.a c(String string2) {
            if (string2 != null) {
                this.b = string2;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

}

