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
import J3.C;

public final class m
extends B.e.d.a {
    public final B.e.d.a.b a;
    public final C b;
    public final C c;
    public final Boolean d;
    public final int e;

    public m(B.e.d.a.b b8, C c8, C c9, Boolean bl, int n8) {
        this.a = b8;
        this.b = c8;
        this.c = c9;
        this.d = bl;
        this.e = n8;
    }

    public /* synthetic */ m(B.e.d.a.b b8, C c8, C c9, Boolean bl, int n8,  a8) {
        this(b8, c8, c9, bl, n8);
    }

    @Override
    public Boolean b() {
        return this.d;
    }

    @Override
    public C c() {
        return this.b;
    }

    @Override
    public B.e.d.a.b d() {
        return this.a;
    }

    @Override
    public C e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.d.a) {
            C c8;
            if (this.a.equals((Object)(object = (B.e.d.a)object).d()) && ((c8 = this.b) == null ? object.c() == null : c8.equals(object.c())) && ((c8 = this.c) == null ? object.e() == null : c8.equals(object.e())) && ((c8 = this.d) == null ? object.b() == null : c8.equals((Object)object.b())) && this.e == object.f()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int f() {
        return this.e;
    }

    @Override
    public B.e.d.a.a g() {
        return new b(this, null);
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        C c8 = this.b;
        int n9 = 0;
        int n10 = c8 == null ? 0 : c8.hashCode();
        c8 = this.c;
        int n11 = c8 == null ? 0 : c8.hashCode();
        c8 = this.d;
        if (c8 != null) {
            n9 = c8.hashCode();
        }
        return ((((n8 ^ 1000003) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n9) * 1000003 ^ this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application{execution=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", customAttributes=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", internalKeys=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", background=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", uiOrientation=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.d.a.a {
        public B.e.d.a.b a;
        public C b;
        public C c;
        public Boolean d;
        public Integer e;

        public b() {
        }

        public b(B.e.d.a a8) {
            this.a = a8.d();
            this.b = a8.c();
            this.c = a8.e();
            this.d = a8.b();
            this.e = a8.f();
        }

        public /* synthetic */ b(B.e.d.a a8,  a9) {
            this(a8);
        }

        @Override
        public B.e.d.a a() {
            Object object = this.a;
            String string2 = "";
            if (object == null) {
                string2 = new StringBuilder();
                string2.append("");
                string2.append(" execution");
                string2 = string2.toString();
            }
            object = string2;
            if (this.e == null) {
                object = new StringBuilder();
                object.append(string2);
                object.append(" uiOrientation");
                object = object.toString();
            }
            if (object.isEmpty()) {
                return new m(this.a, this.b, this.c, this.d, this.e, null);
            }
            string2 = new StringBuilder();
            string2.append("Missing required properties:");
            string2.append((String)object);
            throw new IllegalStateException(string2.toString());
        }

        @Override
        public B.e.d.a.a b(Boolean bl) {
            this.d = bl;
            return this;
        }

        @Override
        public B.e.d.a.a c(C c8) {
            this.b = c8;
            return this;
        }

        @Override
        public B.e.d.a.a d(B.e.d.a.b b8) {
            if (b8 != null) {
                this.a = b8;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override
        public B.e.d.a.a e(C c8) {
            this.c = c8;
            return this;
        }

        @Override
        public B.e.d.a.a f(int n8) {
            this.e = n8;
            return this;
        }
    }

}

