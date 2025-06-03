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

public final class o
extends B.e.d.a.b.a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public o(long l8, long l9, String string2, String string3) {
        this.a = l8;
        this.b = l9;
        this.c = string2;
        this.d = string3;
    }

    public /* synthetic */ o(long l8, long l9, String string2, String string3,  a8) {
        this(l8, l9, string2, string3);
    }

    @Override
    public long b() {
        return this.a;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public long d() {
        return this.b;
    }

    @Override
    public String e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.d.a.b.a) {
            Object object2 = (B.e.d.a.b.a)object;
            if (this.a == object2.b() && this.b == object2.d() && this.c.equals((Object)object2.c())) {
                object = this.d;
                object2 = object2.e();
                if (object == null ? object2 == null : object.equals(object2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        l8 = this.b;
        int n9 = (int)(l8 >>> 32 ^ l8);
        int n10 = this.c.hashCode();
        String string2 = this.d;
        int n11 = string2 == null ? 0 : string2.hashCode();
        return (((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BinaryImage{baseAddress=");
        stringBuilder.append(this.a);
        stringBuilder.append(", size=");
        stringBuilder.append(this.b);
        stringBuilder.append(", name=");
        stringBuilder.append(this.c);
        stringBuilder.append(", uuid=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.d.a.b.a.a {
        public Long a;
        public Long b;
        public String c;
        public String d;

        @Override
        public B.e.d.a.b.a a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" baseAddress");
                object2 = object2.toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" size");
                object = object.toString();
            }
            object2 = object;
            if (this.c == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" name");
                object2 = object2.toString();
            }
            if (object2.isEmpty()) {
                return new o(this.a, this.b, this.c, this.d, null);
            }
            object = new StringBuilder();
            object.append("Missing required properties:");
            object.append((String)object2);
            throw new IllegalStateException(object.toString());
        }

        @Override
        public B.e.d.a.b.a.a b(long l8) {
            this.a = l8;
            return this;
        }

        @Override
        public B.e.d.a.b.a.a c(String string2) {
            if (string2 != null) {
                this.c = string2;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override
        public B.e.d.a.b.a.a d(long l8) {
            this.b = l8;
            return this;
        }

        @Override
        public B.e.d.a.b.a.a e(String string2) {
            this.d = string2;
            return this;
        }
    }

}

