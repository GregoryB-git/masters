/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package J3;

import J3.B;
import J3.C;

public final class p
extends B.e.d.a.b.c {
    public final String a;
    public final String b;
    public final C c;
    public final B.e.d.a.b.c d;
    public final int e;

    public p(String string2, String string3, C c8, B.e.d.a.b.c c9, int n8) {
        this.a = string2;
        this.b = string3;
        this.c = c8;
        this.d = c9;
        this.e = n8;
    }

    public /* synthetic */ p(String string2, String string3, C c8, B.e.d.a.b.c c9, int n8,  a8) {
        this(string2, string3, c8, c9, n8);
    }

    @Override
    public B.e.d.a.b.c b() {
        return this.d;
    }

    @Override
    public C c() {
        return this.c;
    }

    @Override
    public int d() {
        return this.e;
    }

    @Override
    public String e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.d.a.b.c) {
            Object object2;
            if (this.a.equals((Object)(object = (B.e.d.a.b.c)object).f()) && ((object2 = this.b) == null ? object.e() == null : object2.equals((Object)object.e())) && this.c.equals(object.c()) && ((object2 = this.d) == null ? object.b() == null : object2.equals((Object)object.b())) && this.e == object.d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        Object object = this.b;
        int n9 = 0;
        int n10 = object == null ? 0 : object.hashCode();
        int n11 = this.c.hashCode();
        object = this.d;
        if (object != null) {
            n9 = object.hashCode();
        }
        return ((((n8 ^ 1000003) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n9) * 1000003 ^ this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception{type=");
        stringBuilder.append(this.a);
        stringBuilder.append(", reason=");
        stringBuilder.append(this.b);
        stringBuilder.append(", frames=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", causedBy=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", overflowCount=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.d.a.b.c.a {
        public String a;
        public String b;
        public C c;
        public B.e.d.a.b.c d;
        public Integer e;

        @Override
        public B.e.d.a.b.c a() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" type");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.c == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" frames");
                string2 = string2.toString();
            }
            string3 = string2;
            if (this.e == null) {
                string3 = new StringBuilder();
                string3.append(string2);
                string3.append(" overflowCount");
                string3 = string3.toString();
            }
            if (string3.isEmpty()) {
                return new p(this.a, this.b, this.c, this.d, this.e, null);
            }
            string2 = new StringBuilder();
            string2.append("Missing required properties:");
            string2.append(string3);
            throw new IllegalStateException(string2.toString());
        }

        @Override
        public B.e.d.a.b.c.a b(B.e.d.a.b.c c8) {
            this.d = c8;
            return this;
        }

        @Override
        public B.e.d.a.b.c.a c(C c8) {
            if (c8 != null) {
                this.c = c8;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override
        public B.e.d.a.b.c.a d(int n8) {
            this.e = n8;
            return this;
        }

        @Override
        public B.e.d.a.b.c.a e(String string2) {
            this.b = string2;
            return this;
        }

        @Override
        public B.e.d.a.b.c.a f(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

}

