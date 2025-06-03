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

public final class r
extends B.e.d.a.b.e {
    public final String a;
    public final int b;
    public final C c;

    public r(String string2, int n8, C c8) {
        this.a = string2;
        this.b = n8;
        this.c = c8;
    }

    public /* synthetic */ r(String string2, int n8, C c8,  a8) {
        this(string2, n8, c8);
    }

    @Override
    public C b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.b;
    }

    @Override
    public String d() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.d.a.b.e) {
            if (this.a.equals((Object)(object = (B.e.d.a.b.e)object).d()) && this.b == object.c() && this.c.equals(object.b())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Thread{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", importance=");
        stringBuilder.append(this.b);
        stringBuilder.append(", frames=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.d.a.b.e.a {
        public String a;
        public Integer b;
        public C c;

        @Override
        public B.e.d.a.b.e a() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" name");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.b == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" importance");
                string2 = string2.toString();
            }
            string3 = string2;
            if (this.c == null) {
                string3 = new StringBuilder();
                string3.append(string2);
                string3.append(" frames");
                string3 = string3.toString();
            }
            if (string3.isEmpty()) {
                return new r(this.a, this.b, this.c, null);
            }
            string2 = new StringBuilder();
            string2.append("Missing required properties:");
            string2.append(string3);
            throw new IllegalStateException(string2.toString());
        }

        @Override
        public B.e.d.a.b.e.a b(C c8) {
            if (c8 != null) {
                this.c = c8;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override
        public B.e.d.a.b.e.a c(int n8) {
            this.b = n8;
            return this;
        }

        @Override
        public B.e.d.a.b.e.a d(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

}

