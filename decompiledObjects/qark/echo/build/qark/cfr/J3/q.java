/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package J3;

import J3.B;

public final class q
extends B.e.d.a.b.d {
    public final String a;
    public final String b;
    public final long c;

    public q(String string2, String string3, long l8) {
        this.a = string2;
        this.b = string3;
        this.c = l8;
    }

    public /* synthetic */ q(String string2, String string3, long l8,  a8) {
        this(string2, string3, l8);
    }

    @Override
    public long b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.b;
    }

    @Override
    public String d() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.d.a.b.d) {
            if (this.a.equals((Object)(object = (B.e.d.a.b.d)object).d()) && this.b.equals((Object)object.c()) && this.c == object.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        int n9 = this.b.hashCode();
        long l8 = this.c;
        return ((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Signal{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", code=");
        stringBuilder.append(this.b);
        stringBuilder.append(", address=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.d.a.b.d.a {
        public String a;
        public String b;
        public Long c;

        @Override
        public B.e.d.a.b.d a() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" name");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.b == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" code");
                string2 = string2.toString();
            }
            string3 = string2;
            if (this.c == null) {
                string3 = new StringBuilder();
                string3.append(string2);
                string3.append(" address");
                string3 = string3.toString();
            }
            if (string3.isEmpty()) {
                return new q(this.a, this.b, this.c, null);
            }
            string2 = new StringBuilder();
            string2.append("Missing required properties:");
            string2.append(string3);
            throw new IllegalStateException(string2.toString());
        }

        @Override
        public B.e.d.a.b.d.a b(long l8) {
            this.c = l8;
            return this;
        }

        @Override
        public B.e.d.a.b.d.a c(String string2) {
            if (string2 != null) {
                this.b = string2;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override
        public B.e.d.a.b.d.a d(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

}

