/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package v4;

import v4.d;
import v4.f;

public final class a
extends d {
    public final String a;
    public final String b;
    public final String c;
    public final f d;
    public final d.b e;

    public a(String string2, String string3, String string4, f f8, d.b b8) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = f8;
        this.e = b8;
    }

    public /* synthetic */ a(String string2, String string3, String string4, f f8, d.b b8,  a8) {
        this(string2, string3, string4, f8, b8);
    }

    @Override
    public f b() {
        return this.d;
    }

    @Override
    public String c() {
        return this.b;
    }

    @Override
    public String d() {
        return this.c;
    }

    @Override
    public d.b e() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            object = (d)object;
            Object object2 = this.a;
            if ((object2 == null ? object.f() == null : object2.equals((Object)object.f())) && ((object2 = this.b) == null ? object.c() == null : object2.equals((Object)object.c())) && ((object2 = this.c) == null ? object.d() == null : object2.equals((Object)object.d())) && ((object2 = this.d) == null ? object.b() == null : object2.equals((Object)object.b()))) {
                object2 = this.e;
                object = object.e();
                if (object2 == null ? object == null : object2.equals(object)) {
                    return true;
                }
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
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.b;
        int n10 = object == null ? 0 : object.hashCode();
        object = this.c;
        int n11 = object == null ? 0 : object.hashCode();
        object = this.d;
        int n12 = object == null ? 0 : object.hashCode();
        object = this.e;
        if (object != null) {
            n8 = object.hashCode();
        }
        return ((((n9 ^ 1000003) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstallationResponse{uri=");
        stringBuilder.append(this.a);
        stringBuilder.append(", fid=");
        stringBuilder.append(this.b);
        stringBuilder.append(", refreshToken=");
        stringBuilder.append(this.c);
        stringBuilder.append(", authToken=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", responseCode=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends d.a {
        public String a;
        public String b;
        public String c;
        public f d;
        public d.b e;

        @Override
        public d a() {
            return new a(this.a, this.b, this.c, this.d, this.e, null);
        }

        @Override
        public d.a b(f f8) {
            this.d = f8;
            return this;
        }

        @Override
        public d.a c(String string2) {
            this.b = string2;
            return this;
        }

        @Override
        public d.a d(String string2) {
            this.c = string2;
            return this;
        }

        @Override
        public d.a e(d.b b8) {
            this.e = b8;
            return this;
        }

        @Override
        public d.a f(String string2) {
            this.a = string2;
            return this;
        }
    }

}

