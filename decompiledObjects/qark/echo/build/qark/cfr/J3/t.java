/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package J3;

import J3.B;

public final class t
extends B.e.d.c {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public t(Double d8, int n8, boolean bl, int n9, long l8, long l9) {
        this.a = d8;
        this.b = n8;
        this.c = bl;
        this.d = n9;
        this.e = l8;
        this.f = l9;
    }

    public /* synthetic */ t(Double d8, int n8, boolean bl, int n9, long l8, long l9,  a8) {
        this(d8, n8, bl, n9, l8, l9);
    }

    @Override
    public Double b() {
        return this.a;
    }

    @Override
    public int c() {
        return this.b;
    }

    @Override
    public long d() {
        return this.f;
    }

    @Override
    public int e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.d.c) {
            object = (B.e.d.c)object;
            Double d8 = this.a;
            if ((d8 == null ? object.b() == null : d8.equals((Object)object.b())) && this.b == object.c() && this.c == object.g() && this.d == object.e() && this.e == object.f() && this.f == object.d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public long f() {
        return this.e;
    }

    @Override
    public boolean g() {
        return this.c;
    }

    public int hashCode() {
        Double d8 = this.a;
        int n8 = d8 == null ? 0 : d8.hashCode();
        int n9 = this.b;
        int n10 = this.c ? 1231 : 1237;
        int n11 = this.d;
        long l8 = this.e;
        int n12 = (int)(l8 ^ l8 >>> 32);
        l8 = this.f;
        return (((((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Device{batteryLevel=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", batteryVelocity=");
        stringBuilder.append(this.b);
        stringBuilder.append(", proximityOn=");
        stringBuilder.append(this.c);
        stringBuilder.append(", orientation=");
        stringBuilder.append(this.d);
        stringBuilder.append(", ramUsed=");
        stringBuilder.append(this.e);
        stringBuilder.append(", diskUsed=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.d.c.a {
        public Double a;
        public Integer b;
        public Boolean c;
        public Integer d;
        public Long e;
        public Long f;

        @Override
        public B.e.d.c a() {
            Object object = this.b;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" batteryVelocity");
                object2 = object2.toString();
            }
            object = object2;
            if (this.c == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" proximityOn");
                object = object.toString();
            }
            object2 = object;
            if (this.d == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" orientation");
                object2 = object2.toString();
            }
            object = object2;
            if (this.e == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" ramUsed");
                object = object.toString();
            }
            object2 = object;
            if (this.f == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" diskUsed");
                object2 = object2.toString();
            }
            if (object2.isEmpty()) {
                return new t(this.a, this.b, this.c, this.d, this.e, this.f, null);
            }
            object = new StringBuilder();
            object.append("Missing required properties:");
            object.append((String)object2);
            throw new IllegalStateException(object.toString());
        }

        @Override
        public B.e.d.c.a b(Double d8) {
            this.a = d8;
            return this;
        }

        @Override
        public B.e.d.c.a c(int n8) {
            this.b = n8;
            return this;
        }

        @Override
        public B.e.d.c.a d(long l8) {
            this.f = l8;
            return this;
        }

        @Override
        public B.e.d.c.a e(int n8) {
            this.d = n8;
            return this;
        }

        @Override
        public B.e.d.c.a f(boolean bl) {
            this.c = bl;
            return this;
        }

        @Override
        public B.e.d.c.a g(long l8) {
            this.e = l8;
            return this;
        }
    }

}

