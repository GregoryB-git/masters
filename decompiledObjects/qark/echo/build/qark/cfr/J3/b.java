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

public final class b
extends B {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final B.e j;
    public final B.d k;
    public final B.a l;

    public b(String string2, String string3, int n8, String string4, String string5, String string6, String string7, String string8, B.e e8, B.d d8, B.a a8) {
        this.b = string2;
        this.c = string3;
        this.d = n8;
        this.e = string4;
        this.f = string5;
        this.g = string6;
        this.h = string7;
        this.i = string8;
        this.j = e8;
        this.k = d8;
        this.l = a8;
    }

    public /* synthetic */ b(String string2, String string3, int n8, String string4, String string5, String string6, String string7, String string8, B.e e8, B.d d8, B.a a8,  a9) {
        this(string2, string3, n8, string4, string5, string6, string7, string8, e8, d8, a8);
    }

    @Override
    public B.a c() {
        return this.l;
    }

    @Override
    public String d() {
        return this.g;
    }

    @Override
    public String e() {
        return this.h;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B) {
            Object object2;
            if (this.b.equals((Object)(object = (B)object).l()) && this.c.equals((Object)object.h()) && this.d == object.k() && this.e.equals((Object)object.i()) && ((object2 = this.f) == null ? object.g() == null : object2.equals((Object)object.g())) && ((object2 = this.g) == null ? object.d() == null : object2.equals((Object)object.d())) && this.h.equals((Object)object.e()) && this.i.equals((Object)object.f()) && ((object2 = this.j) == null ? object.m() == null : object2.equals((Object)object.m())) && ((object2 = this.k) == null ? object.j() == null : object2.equals((Object)object.j()))) {
                object2 = this.l;
                object = object.c();
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
        return this.i;
    }

    @Override
    public String g() {
        return this.f;
    }

    @Override
    public String h() {
        return this.c;
    }

    public int hashCode() {
        int n8 = this.b.hashCode();
        int n9 = this.c.hashCode();
        int n10 = this.d;
        int n11 = this.e.hashCode();
        Object object = this.f;
        int n12 = 0;
        int n13 = object == null ? 0 : object.hashCode();
        object = this.g;
        int n14 = object == null ? 0 : object.hashCode();
        int n15 = this.h.hashCode();
        int n16 = this.i.hashCode();
        object = this.j;
        int n17 = object == null ? 0 : object.hashCode();
        object = this.k;
        int n18 = object == null ? 0 : object.hashCode();
        object = this.l;
        if (object != null) {
            n12 = object.hashCode();
        }
        return ((((((((((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n15) * 1000003 ^ n16) * 1000003 ^ n17) * 1000003 ^ n18) * 1000003 ^ n12;
    }

    @Override
    public String i() {
        return this.e;
    }

    @Override
    public B.d j() {
        return this.k;
    }

    @Override
    public int k() {
        return this.d;
    }

    @Override
    public String l() {
        return this.b;
    }

    @Override
    public B.e m() {
        return this.j;
    }

    @Override
    public B.b n() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CrashlyticsReport{sdkVersion=");
        stringBuilder.append(this.b);
        stringBuilder.append(", gmpAppId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", platform=");
        stringBuilder.append(this.d);
        stringBuilder.append(", installationUuid=");
        stringBuilder.append(this.e);
        stringBuilder.append(", firebaseInstallationId=");
        stringBuilder.append(this.f);
        stringBuilder.append(", appQualitySessionId=");
        stringBuilder.append(this.g);
        stringBuilder.append(", buildVersion=");
        stringBuilder.append(this.h);
        stringBuilder.append(", displayVersion=");
        stringBuilder.append(this.i);
        stringBuilder.append(", session=");
        stringBuilder.append((Object)this.j);
        stringBuilder.append(", ndkPayload=");
        stringBuilder.append((Object)this.k);
        stringBuilder.append(", appExitInfo=");
        stringBuilder.append((Object)this.l);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.b {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public B.e i;
        public B.d j;
        public B.a k;

        public b() {
        }

        public b(B b8) {
            this.a = b8.l();
            this.b = b8.h();
            this.c = b8.k();
            this.d = b8.i();
            this.e = b8.g();
            this.f = b8.d();
            this.g = b8.e();
            this.h = b8.f();
            this.i = b8.m();
            this.j = b8.j();
            this.k = b8.c();
        }

        public /* synthetic */ b(B b8,  a8) {
            this(b8);
        }

        @Override
        public B a() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" sdkVersion");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.b == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" gmpAppId");
                string2 = string2.toString();
            }
            string3 = string2;
            if (this.c == null) {
                string3 = new StringBuilder();
                string3.append(string2);
                string3.append(" platform");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.d == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" installationUuid");
                string2 = string2.toString();
            }
            string3 = string2;
            if (this.g == null) {
                string3 = new StringBuilder();
                string3.append(string2);
                string3.append(" buildVersion");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.h == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" displayVersion");
                string2 = string2.toString();
            }
            if (string2.isEmpty()) {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null);
            }
            string3 = new StringBuilder();
            string3.append("Missing required properties:");
            string3.append(string2);
            throw new IllegalStateException(string3.toString());
        }

        @Override
        public B.b b(B.a a8) {
            this.k = a8;
            return this;
        }

        @Override
        public B.b c(String string2) {
            this.f = string2;
            return this;
        }

        @Override
        public B.b d(String string2) {
            if (string2 != null) {
                this.g = string2;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override
        public B.b e(String string2) {
            if (string2 != null) {
                this.h = string2;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override
        public B.b f(String string2) {
            this.e = string2;
            return this;
        }

        @Override
        public B.b g(String string2) {
            if (string2 != null) {
                this.b = string2;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override
        public B.b h(String string2) {
            if (string2 != null) {
                this.d = string2;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override
        public B.b i(B.d d8) {
            this.j = d8;
            return this;
        }

        @Override
        public B.b j(int n8) {
            this.c = n8;
            return this;
        }

        @Override
        public B.b k(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override
        public B.b l(B.e e8) {
            this.i = e8;
            return this;
        }
    }

}

