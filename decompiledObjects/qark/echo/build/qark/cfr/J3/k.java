/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
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

public final class k
extends B.e.c {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public k(int n8, String string2, int n9, long l8, long l9, boolean bl, int n10, String string3, String string4) {
        this.a = n8;
        this.b = string2;
        this.c = n9;
        this.d = l8;
        this.e = l9;
        this.f = bl;
        this.g = n10;
        this.h = string3;
        this.i = string4;
    }

    public /* synthetic */ k(int n8, String string2, int n9, long l8, long l9, boolean bl, int n10, String string3, String string4,  a8) {
        this(n8, string2, n9, l8, l9, bl, n10, string3, string4);
    }

    @Override
    public int b() {
        return this.a;
    }

    @Override
    public int c() {
        return this.c;
    }

    @Override
    public long d() {
        return this.e;
    }

    @Override
    public String e() {
        return this.h;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.c) {
            if (this.a == (object = (B.e.c)object).b() && this.b.equals((Object)object.f()) && this.c == object.c() && this.d == object.h() && this.e == object.d() && this.f == object.j() && this.g == object.i() && this.h.equals((Object)object.e()) && this.i.equals((Object)object.g())) {
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

    @Override
    public String g() {
        return this.i;
    }

    @Override
    public long h() {
        return this.d;
    }

    public int hashCode() {
        int n8 = this.a;
        int n9 = this.b.hashCode();
        int n10 = this.c;
        long l8 = this.d;
        int n11 = (int)(l8 ^ l8 >>> 32);
        l8 = this.e;
        int n12 = (int)(l8 ^ l8 >>> 32);
        int n13 = this.f ? 1231 : 1237;
        return ((((((((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }

    @Override
    public int i() {
        return this.g;
    }

    @Override
    public boolean j() {
        return this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Device{arch=");
        stringBuilder.append(this.a);
        stringBuilder.append(", model=");
        stringBuilder.append(this.b);
        stringBuilder.append(", cores=");
        stringBuilder.append(this.c);
        stringBuilder.append(", ram=");
        stringBuilder.append(this.d);
        stringBuilder.append(", diskSpace=");
        stringBuilder.append(this.e);
        stringBuilder.append(", simulator=");
        stringBuilder.append(this.f);
        stringBuilder.append(", state=");
        stringBuilder.append(this.g);
        stringBuilder.append(", manufacturer=");
        stringBuilder.append(this.h);
        stringBuilder.append(", modelClass=");
        stringBuilder.append(this.i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.c.a {
        public Integer a;
        public String b;
        public Integer c;
        public Long d;
        public Long e;
        public Boolean f;
        public Integer g;
        public String h;
        public String i;

        @Override
        public B.e.c a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" arch");
                object2 = object2.toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" model");
                object = object.toString();
            }
            object2 = object;
            if (this.c == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" cores");
                object2 = object2.toString();
            }
            object = object2;
            if (this.d == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" ram");
                object = object.toString();
            }
            object2 = object;
            if (this.e == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" diskSpace");
                object2 = object2.toString();
            }
            object = object2;
            if (this.f == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" simulator");
                object = object.toString();
            }
            object2 = object;
            if (this.g == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" state");
                object2 = object2.toString();
            }
            object = object2;
            if (this.h == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" manufacturer");
                object = object.toString();
            }
            object2 = object;
            if (this.i == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" modelClass");
                object2 = object2.toString();
            }
            if (object2.isEmpty()) {
                return new k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
            }
            object = new StringBuilder();
            object.append("Missing required properties:");
            object.append((String)object2);
            throw new IllegalStateException(object.toString());
        }

        @Override
        public B.e.c.a b(int n8) {
            this.a = n8;
            return this;
        }

        @Override
        public B.e.c.a c(int n8) {
            this.c = n8;
            return this;
        }

        @Override
        public B.e.c.a d(long l8) {
            this.e = l8;
            return this;
        }

        @Override
        public B.e.c.a e(String string2) {
            if (string2 != null) {
                this.h = string2;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override
        public B.e.c.a f(String string2) {
            if (string2 != null) {
                this.b = string2;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override
        public B.e.c.a g(String string2) {
            if (string2 != null) {
                this.i = string2;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override
        public B.e.c.a h(long l8) {
            this.d = l8;
            return this;
        }

        @Override
        public B.e.c.a i(boolean bl) {
            this.f = bl;
            return this;
        }

        @Override
        public B.e.c.a j(int n8) {
            this.g = n8;
            return this;
        }
    }

}

