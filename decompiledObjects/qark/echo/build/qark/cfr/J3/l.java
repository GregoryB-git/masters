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

public final class l
extends B.e.d {
    public final long a;
    public final String b;
    public final B.e.d.a c;
    public final B.e.d.c d;
    public final B.e.d.d e;

    public l(long l8, String string2, B.e.d.a a8, B.e.d.c c8, B.e.d.d d8) {
        this.a = l8;
        this.b = string2;
        this.c = a8;
        this.d = c8;
        this.e = d8;
    }

    public /* synthetic */ l(long l8, String string2, B.e.d.a a8, B.e.d.c c8, B.e.d.d d8,  a9) {
        this(l8, string2, a8, c8, d8);
    }

    @Override
    public B.e.d.a b() {
        return this.c;
    }

    @Override
    public B.e.d.c c() {
        return this.d;
    }

    @Override
    public B.e.d.d d() {
        return this.e;
    }

    @Override
    public long e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.d) {
            Object object2 = (B.e.d)object;
            if (this.a == object2.e() && this.b.equals((Object)object2.f()) && this.c.equals((Object)object2.b()) && this.d.equals((Object)object2.c())) {
                object = this.e;
                object2 = object2.d();
                if (object == null ? object2 == null : object.equals(object2)) {
                    return true;
                }
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
    public B.e.d.b g() {
        return new b(this, null);
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        int n9 = this.b.hashCode();
        int n10 = this.c.hashCode();
        int n11 = this.d.hashCode();
        B.e.d.d d8 = this.e;
        int n12 = d8 == null ? 0 : d8.hashCode();
        return ((((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Event{timestamp=");
        stringBuilder.append(this.a);
        stringBuilder.append(", type=");
        stringBuilder.append(this.b);
        stringBuilder.append(", app=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", device=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", log=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.d.b {
        public Long a;
        public String b;
        public B.e.d.a c;
        public B.e.d.c d;
        public B.e.d.d e;

        public b() {
        }

        public b(B.e.d d8) {
            this.a = d8.e();
            this.b = d8.f();
            this.c = d8.b();
            this.d = d8.c();
            this.e = d8.d();
        }

        public /* synthetic */ b(B.e.d d8,  a8) {
            this(d8);
        }

        @Override
        public B.e.d a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" timestamp");
                object2 = object2.toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" type");
                object = object.toString();
            }
            object2 = object;
            if (this.c == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" app");
                object2 = object2.toString();
            }
            object = object2;
            if (this.d == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" device");
                object = object.toString();
            }
            if (object.isEmpty()) {
                return new l(this.a, this.b, this.c, this.d, this.e, null);
            }
            object2 = new StringBuilder();
            object2.append("Missing required properties:");
            object2.append((String)object);
            throw new IllegalStateException(object2.toString());
        }

        @Override
        public B.e.d.b b(B.e.d.a a8) {
            if (a8 != null) {
                this.c = a8;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override
        public B.e.d.b c(B.e.d.c c8) {
            if (c8 != null) {
                this.d = c8;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override
        public B.e.d.b d(B.e.d.d d8) {
            this.e = d8;
            return this;
        }

        @Override
        public B.e.d.b e(long l8) {
            this.a = l8;
            return this;
        }

        @Override
        public B.e.d.b f(String string2) {
            if (string2 != null) {
                this.b = string2;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

}

