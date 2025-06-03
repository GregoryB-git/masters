/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e2;

import e2.a;

public final class c
extends a {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public c(Integer n8, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
        this.a = n8;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = string6;
        this.g = string7;
        this.h = string8;
        this.i = string9;
        this.j = string10;
        this.k = string11;
        this.l = string12;
    }

    public /* synthetic */ c(Integer n8, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12,  a8) {
        this(n8, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12);
    }

    @Override
    public String b() {
        return this.l;
    }

    @Override
    public String c() {
        return this.j;
    }

    @Override
    public String d() {
        return this.d;
    }

    @Override
    public String e() {
        return this.h;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof a) {
            object = (a)object;
            Object object2 = this.a;
            if ((object2 == null ? object.m() == null : object2.equals((Object)object.m())) && ((object2 = this.b) == null ? object.j() == null : object2.equals((Object)object.j())) && ((object2 = this.c) == null ? object.f() == null : object2.equals((Object)object.f())) && ((object2 = this.d) == null ? object.d() == null : object2.equals((Object)object.d())) && ((object2 = this.e) == null ? object.l() == null : object2.equals((Object)object.l())) && ((object2 = this.f) == null ? object.k() == null : object2.equals((Object)object.k())) && ((object2 = this.g) == null ? object.h() == null : object2.equals((Object)object.h())) && ((object2 = this.h) == null ? object.e() == null : object2.equals((Object)object.e())) && ((object2 = this.i) == null ? object.g() == null : object2.equals((Object)object.g())) && ((object2 = this.j) == null ? object.c() == null : object2.equals((Object)object.c())) && ((object2 = this.k) == null ? object.i() == null : object2.equals((Object)object.i()))) {
                object2 = this.l;
                object = object.b();
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
        return this.c;
    }

    @Override
    public String g() {
        return this.i;
    }

    @Override
    public String h() {
        return this.g;
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
        int n13 = object == null ? 0 : object.hashCode();
        object = this.f;
        int n14 = object == null ? 0 : object.hashCode();
        object = this.g;
        int n15 = object == null ? 0 : object.hashCode();
        object = this.h;
        int n16 = object == null ? 0 : object.hashCode();
        object = this.i;
        int n17 = object == null ? 0 : object.hashCode();
        object = this.j;
        int n18 = object == null ? 0 : object.hashCode();
        object = this.k;
        int n19 = object == null ? 0 : object.hashCode();
        object = this.l;
        if (object != null) {
            n8 = object.hashCode();
        }
        return (((((((((((n9 ^ 1000003) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n15) * 1000003 ^ n16) * 1000003 ^ n17) * 1000003 ^ n18) * 1000003 ^ n19) * 1000003 ^ n8;
    }

    @Override
    public String i() {
        return this.k;
    }

    @Override
    public String j() {
        return this.b;
    }

    @Override
    public String k() {
        return this.f;
    }

    @Override
    public String l() {
        return this.e;
    }

    @Override
    public Integer m() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AndroidClientInfo{sdkVersion=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", model=");
        stringBuilder.append(this.b);
        stringBuilder.append(", hardware=");
        stringBuilder.append(this.c);
        stringBuilder.append(", device=");
        stringBuilder.append(this.d);
        stringBuilder.append(", product=");
        stringBuilder.append(this.e);
        stringBuilder.append(", osBuild=");
        stringBuilder.append(this.f);
        stringBuilder.append(", manufacturer=");
        stringBuilder.append(this.g);
        stringBuilder.append(", fingerprint=");
        stringBuilder.append(this.h);
        stringBuilder.append(", locale=");
        stringBuilder.append(this.i);
        stringBuilder.append(", country=");
        stringBuilder.append(this.j);
        stringBuilder.append(", mccMnc=");
        stringBuilder.append(this.k);
        stringBuilder.append(", applicationBuild=");
        stringBuilder.append(this.l);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends a.a {
        public Integer a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;

        @Override
        public a a() {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, null);
        }

        @Override
        public a.a b(String string2) {
            this.l = string2;
            return this;
        }

        @Override
        public a.a c(String string2) {
            this.j = string2;
            return this;
        }

        @Override
        public a.a d(String string2) {
            this.d = string2;
            return this;
        }

        @Override
        public a.a e(String string2) {
            this.h = string2;
            return this;
        }

        @Override
        public a.a f(String string2) {
            this.c = string2;
            return this;
        }

        @Override
        public a.a g(String string2) {
            this.i = string2;
            return this;
        }

        @Override
        public a.a h(String string2) {
            this.g = string2;
            return this;
        }

        @Override
        public a.a i(String string2) {
            this.k = string2;
            return this;
        }

        @Override
        public a.a j(String string2) {
            this.b = string2;
            return this;
        }

        @Override
        public a.a k(String string2) {
            this.f = string2;
            return this;
        }

        @Override
        public a.a l(String string2) {
            this.e = string2;
            return this;
        }

        @Override
        public a.a m(Integer n8) {
            this.a = n8;
            return this;
        }
    }

}

