/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package J3;

import J3.B;

public final class v
extends B.e.e {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public v(int n8, String string2, String string3, boolean bl) {
        this.a = n8;
        this.b = string2;
        this.c = string3;
        this.d = bl;
    }

    public /* synthetic */ v(int n8, String string2, String string3, boolean bl,  a8) {
        this(n8, string2, string3, bl);
    }

    @Override
    public String b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.a;
    }

    @Override
    public String d() {
        return this.b;
    }

    @Override
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.e) {
            if (this.a == (object = (B.e.e)object).c() && this.b.equals((Object)object.d()) && this.c.equals((Object)object.b()) && this.d == object.e()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a;
        int n9 = this.b.hashCode();
        int n10 = this.c.hashCode();
        int n11 = this.d ? 1231 : 1237;
        return (((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OperatingSystem{platform=");
        stringBuilder.append(this.a);
        stringBuilder.append(", version=");
        stringBuilder.append(this.b);
        stringBuilder.append(", buildVersion=");
        stringBuilder.append(this.c);
        stringBuilder.append(", jailbroken=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.e.a {
        public Integer a;
        public String b;
        public String c;
        public Boolean d;

        @Override
        public B.e.e a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" platform");
                object2 = object2.toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" version");
                object = object.toString();
            }
            object2 = object;
            if (this.c == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" buildVersion");
                object2 = object2.toString();
            }
            object = object2;
            if (this.d == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" jailbroken");
                object = object.toString();
            }
            if (object.isEmpty()) {
                return new v(this.a, this.b, this.c, this.d, null);
            }
            object2 = new StringBuilder();
            object2.append("Missing required properties:");
            object2.append((String)object);
            throw new IllegalStateException(object2.toString());
        }

        @Override
        public B.e.e.a b(String string2) {
            if (string2 != null) {
                this.c = string2;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override
        public B.e.e.a c(boolean bl) {
            this.d = bl;
            return this;
        }

        @Override
        public B.e.e.a d(int n8) {
            this.a = n8;
            return this;
        }

        @Override
        public B.e.e.a e(String string2) {
            if (string2 != null) {
                this.b = string2;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

}

