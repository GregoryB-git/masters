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
package s4;

import s4.n;

public final class a
extends n {
    public final String a;
    public final long b;
    public final long c;

    public a(String string2, long l8, long l9) {
        this.a = string2;
        this.b = l8;
        this.c = l9;
    }

    public /* synthetic */ a(String string2, long l8, long l9,  a8) {
        this(string2, l8, l9);
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public long c() {
        return this.c;
    }

    @Override
    public long d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof n) {
            if (this.a.equals((Object)(object = (n)object).b()) && this.b == object.d() && this.c == object.c()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        long l8 = this.b;
        int n9 = (int)(l8 ^ l8 >>> 32);
        l8 = this.c;
        return ((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstallationTokenResult{token=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tokenExpirationTimestamp=");
        stringBuilder.append(this.b);
        stringBuilder.append(", tokenCreationTimestamp=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends n.a {
        public String a;
        public Long b;
        public Long c;

        @Override
        public n a() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" token");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.b == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" tokenExpirationTimestamp");
                string2 = string2.toString();
            }
            string3 = string2;
            if (this.c == null) {
                string3 = new StringBuilder();
                string3.append(string2);
                string3.append(" tokenCreationTimestamp");
                string3 = string3.toString();
            }
            if (string3.isEmpty()) {
                return new a(this.a, this.b, this.c, null);
            }
            string2 = new StringBuilder();
            string2.append("Missing required properties:");
            string2.append(string3);
            throw new IllegalStateException(string2.toString());
        }

        @Override
        public n.a b(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override
        public n.a c(long l8) {
            this.c = l8;
            return this;
        }

        @Override
        public n.a d(long l8) {
            this.b = l8;
            return this;
        }
    }

}

