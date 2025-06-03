/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package J3;

import J3.B;
import J3.C;

public final class n
extends B.e.d.a.b {
    public final C a;
    public final B.e.d.a.b.c b;
    public final B.a c;
    public final B.e.d.a.b.d d;
    public final C e;

    public n(C c8, B.e.d.a.b.c c9, B.a a8, B.e.d.a.b.d d8, C c10) {
        this.a = c8;
        this.b = c9;
        this.c = a8;
        this.d = d8;
        this.e = c10;
    }

    public /* synthetic */ n(C c8, B.e.d.a.b.c c9, B.a a8, B.e.d.a.b.d d8, C c10,  a9) {
        this(c8, c9, a8, d8, c10);
    }

    @Override
    public B.a b() {
        return this.c;
    }

    @Override
    public C c() {
        return this.e;
    }

    @Override
    public B.e.d.a.b.c d() {
        return this.b;
    }

    @Override
    public B.e.d.a.b.d e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.d.a.b) {
            object = (B.e.d.a.b)object;
            Object object2 = this.a;
            if ((object2 == null ? object.f() == null : object2.equals(object.f())) && ((object2 = this.b) == null ? object.d() == null : object2.equals((Object)object.d())) && ((object2 = this.c) == null ? object.b() == null : object2.equals((Object)object.b())) && this.d.equals((Object)object.e()) && this.e.equals(object.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public C f() {
        return this.a;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.b;
        int n10 = object == null ? 0 : object.hashCode();
        object = this.c;
        if (object != null) {
            n8 = object.hashCode();
        }
        return ((((n9 ^ 1000003) * 1000003 ^ n10) * 1000003 ^ n8) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Execution{threads=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", exception=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", appExitInfo=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", signal=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", binaries=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.d.a.b.b {
        public C a;
        public B.e.d.a.b.c b;
        public B.a c;
        public B.e.d.a.b.d d;
        public C e;

        @Override
        public B.e.d.a.b a() {
            Object object = this.d;
            String string2 = "";
            if (object == null) {
                string2 = new StringBuilder();
                string2.append("");
                string2.append(" signal");
                string2 = string2.toString();
            }
            object = string2;
            if (this.e == null) {
                object = new StringBuilder();
                object.append(string2);
                object.append(" binaries");
                object = object.toString();
            }
            if (object.isEmpty()) {
                return new n(this.a, this.b, this.c, this.d, this.e, null);
            }
            string2 = new StringBuilder();
            string2.append("Missing required properties:");
            string2.append((String)object);
            throw new IllegalStateException(string2.toString());
        }

        @Override
        public B.e.d.a.b.b b(B.a a8) {
            this.c = a8;
            return this;
        }

        @Override
        public B.e.d.a.b.b c(C c8) {
            if (c8 != null) {
                this.e = c8;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override
        public B.e.d.a.b.b d(B.e.d.a.b.c c8) {
            this.b = c8;
            return this;
        }

        @Override
        public B.e.d.a.b.b e(B.e.d.a.b.d d8) {
            if (d8 != null) {
                this.d = d8;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override
        public B.e.d.a.b.b f(C c8) {
            this.a = c8;
            return this;
        }
    }

}

