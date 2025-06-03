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

public final class i
extends B.e.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public i(String string2, String string3, String string4, B.e.a.b b8, String string5, String string6, String string7) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = string6;
        this.f = string7;
    }

    public /* synthetic */ i(String string2, String string3, String string4, B.e.a.b b8, String string5, String string6, String string7,  a8) {
        this(string2, string3, string4, b8, string5, string6, string7);
    }

    @Override
    public String b() {
        return this.e;
    }

    @Override
    public String c() {
        return this.f;
    }

    @Override
    public String d() {
        return this.c;
    }

    @Override
    public String e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e.a) {
            String string2;
            if (this.a.equals((Object)(object = (B.e.a)object).e()) && this.b.equals((Object)object.h()) && ((string2 = this.c) == null ? object.d() == null : string2.equals((Object)object.d()))) {
                object.g();
                string2 = this.d;
                if ((string2 == null ? object.f() == null : string2.equals((Object)object.f())) && ((string2 = this.e) == null ? object.b() == null : string2.equals((Object)object.b()))) {
                    string2 = this.f;
                    object = object.c();
                    if (string2 == null ? object == null : string2.equals(object)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public String f() {
        return this.d;
    }

    @Override
    public B.e.a.b g() {
        return null;
    }

    @Override
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        int n9 = this.b.hashCode();
        String string2 = this.c;
        int n10 = 0;
        int n11 = string2 == null ? 0 : string2.hashCode();
        string2 = this.d;
        int n12 = string2 == null ? 0 : string2.hashCode();
        string2 = this.e;
        int n13 = string2 == null ? 0 : string2.hashCode();
        string2 = this.f;
        if (string2 != null) {
            n10 = string2.hashCode();
        }
        return (((((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n11) * -721379959 ^ n12) * 1000003 ^ n13) * 1000003 ^ n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application{identifier=");
        stringBuilder.append(this.a);
        stringBuilder.append(", version=");
        stringBuilder.append(this.b);
        stringBuilder.append(", displayVersion=");
        stringBuilder.append(this.c);
        stringBuilder.append(", organization=");
        stringBuilder.append((Object)null);
        stringBuilder.append(", installationUuid=");
        stringBuilder.append(this.d);
        stringBuilder.append(", developmentPlatform=");
        stringBuilder.append(this.e);
        stringBuilder.append(", developmentPlatformVersion=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.a.a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        @Override
        public B.e.a a() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" identifier");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.b == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" version");
                string2 = string2.toString();
            }
            if (string2.isEmpty()) {
                return new i(this.a, this.b, this.c, null, this.d, this.e, this.f, null);
            }
            string3 = new StringBuilder();
            string3.append("Missing required properties:");
            string3.append(string2);
            throw new IllegalStateException(string3.toString());
        }

        @Override
        public B.e.a.a b(String string2) {
            this.e = string2;
            return this;
        }

        @Override
        public B.e.a.a c(String string2) {
            this.f = string2;
            return this;
        }

        @Override
        public B.e.a.a d(String string2) {
            this.c = string2;
            return this;
        }

        @Override
        public B.e.a.a e(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override
        public B.e.a.a f(String string2) {
            this.d = string2;
            return this;
        }

        @Override
        public B.e.a.a g(String string2) {
            if (string2 != null) {
                this.b = string2;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

}

