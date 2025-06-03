/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package v4;

import v4.f;

public final class b
extends f {
    public final String a;
    public final long b;
    public final f.b c;

    public b(String string2, long l8, f.b b8) {
        this.a = string2;
        this.b = l8;
        this.c = b8;
    }

    public /* synthetic */ b(String string2, long l8, f.b b8,  a8) {
        this(string2, l8, b8);
    }

    @Override
    public f.b b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.a;
    }

    @Override
    public long d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof f) {
            object = (f)object;
            Object object2 = this.a;
            if ((object2 == null ? object.c() == null : object2.equals((Object)object.c())) && this.b == object.d()) {
                object2 = this.c;
                object = object.b();
                if (object2 == null ? object == null : object2.equals(object)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        long l8 = this.b;
        int n10 = (int)(l8 ^ l8 >>> 32);
        object = this.c;
        if (object != null) {
            n8 = object.hashCode();
        }
        return ((n9 ^ 1000003) * 1000003 ^ n10) * 1000003 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TokenResult{token=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tokenExpirationTimestamp=");
        stringBuilder.append(this.b);
        stringBuilder.append(", responseCode=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends f.a {
        public String a;
        public Long b;
        public f.b c;

        @Override
        public f a() {
            Long l8 = this.b;
            String string2 = "";
            if (l8 == null) {
                string2 = new StringBuilder();
                string2.append("");
                string2.append(" tokenExpirationTimestamp");
                string2 = string2.toString();
            }
            if (string2.isEmpty()) {
                return new b(this.a, this.b, this.c, null);
            }
            l8 = new StringBuilder();
            l8.append("Missing required properties:");
            l8.append(string2);
            throw new IllegalStateException(l8.toString());
        }

        @Override
        public f.a b(f.b b8) {
            this.c = b8;
            return this;
        }

        @Override
        public f.a c(String string2) {
            this.a = string2;
            return this;
        }

        @Override
        public f.a d(long l8) {
            this.b = l8;
            return this;
        }
    }

}

