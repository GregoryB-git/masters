/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package J3;

import J3.B;

public final class s
extends B.e.d.a.b.e.b {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public s(long l8, String string2, String string3, long l9, int n8) {
        this.a = l8;
        this.b = string2;
        this.c = string3;
        this.d = l9;
        this.e = n8;
    }

    public /* synthetic */ s(long l8, String string2, String string3, long l9, int n8,  a8) {
        this(l8, string2, string3, l9, n8);
    }

    @Override
    public String b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.e;
    }

    @Override
    public long d() {
        return this.d;
    }

    @Override
    public long e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.d.a.b.e.b) {
            String string2;
            if (this.a == (object = (B.e.d.a.b.e.b)object).e() && this.b.equals((Object)object.f()) && ((string2 = this.c) == null ? object.b() == null : string2.equals((Object)object.b())) && this.d == object.d() && this.e == object.c()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String f() {
        return this.b;
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        int n9 = this.b.hashCode();
        String string2 = this.c;
        int n10 = string2 == null ? 0 : string2.hashCode();
        l8 = this.d;
        return ((((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ (int)(l8 >>> 32 ^ l8)) * 1000003 ^ this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Frame{pc=");
        stringBuilder.append(this.a);
        stringBuilder.append(", symbol=");
        stringBuilder.append(this.b);
        stringBuilder.append(", file=");
        stringBuilder.append(this.c);
        stringBuilder.append(", offset=");
        stringBuilder.append(this.d);
        stringBuilder.append(", importance=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.d.a.b.e.b.a {
        public Long a;
        public String b;
        public String c;
        public Long d;
        public Integer e;

        @Override
        public B.e.d.a.b.e.b a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" pc");
                object2 = object2.toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" symbol");
                object = object.toString();
            }
            object2 = object;
            if (this.d == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" offset");
                object2 = object2.toString();
            }
            object = object2;
            if (this.e == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" importance");
                object = object.toString();
            }
            if (object.isEmpty()) {
                return new s(this.a, this.b, this.c, this.d, this.e, null);
            }
            object2 = new StringBuilder();
            object2.append("Missing required properties:");
            object2.append((String)object);
            throw new IllegalStateException(object2.toString());
        }

        @Override
        public B.e.d.a.b.e.b.a b(String string2) {
            this.c = string2;
            return this;
        }

        @Override
        public B.e.d.a.b.e.b.a c(int n8) {
            this.e = n8;
            return this;
        }

        @Override
        public B.e.d.a.b.e.b.a d(long l8) {
            this.d = l8;
            return this;
        }

        @Override
        public B.e.d.a.b.e.b.a e(long l8) {
            this.a = l8;
            return this;
        }

        @Override
        public B.e.d.a.b.e.b.a f(String string2) {
            if (string2 != null) {
                this.b = string2;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

}

