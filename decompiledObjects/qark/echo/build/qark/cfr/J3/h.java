/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package J3;

import J3.B;
import J3.C;

public final class h
extends B.e {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final B.e.a g;
    public final B.e.f h;
    public final B.e.e i;
    public final B.e.c j;
    public final C k;
    public final int l;

    public h(String string2, String string3, String string4, long l8, Long l9, boolean bl, B.e.a a8, B.e.f f8, B.e.e e8, B.e.c c8, C c9, int n8) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = l8;
        this.e = l9;
        this.f = bl;
        this.g = a8;
        this.h = f8;
        this.i = e8;
        this.j = c8;
        this.k = c9;
        this.l = n8;
    }

    public /* synthetic */ h(String string2, String string3, String string4, long l8, Long l9, boolean bl, B.e.a a8, B.e.f f8, B.e.e e8, B.e.c c8, C c9, int n8,  a9) {
        this(string2, string3, string4, l8, l9, bl, a8, f8, e8, c8, c9, n8);
    }

    @Override
    public B.e.a b() {
        return this.g;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public B.e.c d() {
        return this.j;
    }

    @Override
    public Long e() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.e) {
            Object object2;
            if (this.a.equals((Object)(object = (B.e)object).g()) && this.b.equals((Object)object.i()) && ((object2 = this.c) == null ? object.c() == null : object2.equals((Object)object.c())) && this.d == object.l() && ((object2 = this.e) == null ? object.e() == null : object2.equals((Object)object.e())) && this.f == object.n() && this.g.equals((Object)object.b()) && ((object2 = this.h) == null ? object.m() == null : object2.equals((Object)object.m())) && ((object2 = this.i) == null ? object.k() == null : object2.equals((Object)object.k())) && ((object2 = this.j) == null ? object.d() == null : object2.equals((Object)object.d())) && ((object2 = this.k) == null ? object.f() == null : object2.equals(object.f())) && this.l == object.h()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public C f() {
        return this.k;
    }

    @Override
    public String g() {
        return this.a;
    }

    @Override
    public int h() {
        return this.l;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        int n9 = this.b.hashCode();
        Object object = this.c;
        int n10 = 0;
        int n11 = object == null ? 0 : object.hashCode();
        long l8 = this.d;
        int n12 = (int)(l8 ^ l8 >>> 32);
        object = this.e;
        int n13 = object == null ? 0 : object.hashCode();
        int n14 = this.f ? 1231 : 1237;
        int n15 = this.g.hashCode();
        object = this.h;
        int n16 = object == null ? 0 : object.hashCode();
        object = this.i;
        int n17 = object == null ? 0 : object.hashCode();
        object = this.j;
        int n18 = object == null ? 0 : object.hashCode();
        object = this.k;
        if (object != null) {
            n10 = object.hashCode();
        }
        return (((((((((((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n15) * 1000003 ^ n16) * 1000003 ^ n17) * 1000003 ^ n18) * 1000003 ^ n10) * 1000003 ^ this.l;
    }

    @Override
    public String i() {
        return this.b;
    }

    @Override
    public B.e.e k() {
        return this.i;
    }

    @Override
    public long l() {
        return this.d;
    }

    @Override
    public B.e.f m() {
        return this.h;
    }

    @Override
    public boolean n() {
        return this.f;
    }

    @Override
    public B.e.b o() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Session{generator=");
        stringBuilder.append(this.a);
        stringBuilder.append(", identifier=");
        stringBuilder.append(this.b);
        stringBuilder.append(", appQualitySessionId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", startedAt=");
        stringBuilder.append(this.d);
        stringBuilder.append(", endedAt=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(", crashed=");
        stringBuilder.append(this.f);
        stringBuilder.append(", app=");
        stringBuilder.append((Object)this.g);
        stringBuilder.append(", user=");
        stringBuilder.append((Object)this.h);
        stringBuilder.append(", os=");
        stringBuilder.append((Object)this.i);
        stringBuilder.append(", device=");
        stringBuilder.append((Object)this.j);
        stringBuilder.append(", events=");
        stringBuilder.append((Object)this.k);
        stringBuilder.append(", generatorType=");
        stringBuilder.append(this.l);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.e.b {
        public String a;
        public String b;
        public String c;
        public Long d;
        public Long e;
        public Boolean f;
        public B.e.a g;
        public B.e.f h;
        public B.e.e i;
        public B.e.c j;
        public C k;
        public Integer l;

        public b() {
        }

        public b(B.e e8) {
            this.a = e8.g();
            this.b = e8.i();
            this.c = e8.c();
            this.d = e8.l();
            this.e = e8.e();
            this.f = e8.n();
            this.g = e8.b();
            this.h = e8.m();
            this.i = e8.k();
            this.j = e8.d();
            this.k = e8.f();
            this.l = e8.h();
        }

        public /* synthetic */ b(B.e e8,  a8) {
            this(e8);
        }

        @Override
        public B.e a() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" generator");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.b == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" identifier");
                string2 = string2.toString();
            }
            string3 = string2;
            if (this.d == null) {
                string3 = new StringBuilder();
                string3.append(string2);
                string3.append(" startedAt");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.f == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" crashed");
                string2 = string2.toString();
            }
            string3 = string2;
            if (this.g == null) {
                string3 = new StringBuilder();
                string3.append(string2);
                string3.append(" app");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.l == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" generatorType");
                string2 = string2.toString();
            }
            if (string2.isEmpty()) {
                return new h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, null);
            }
            string3 = new StringBuilder();
            string3.append("Missing required properties:");
            string3.append(string2);
            throw new IllegalStateException(string3.toString());
        }

        @Override
        public B.e.b b(B.e.a a8) {
            if (a8 != null) {
                this.g = a8;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override
        public B.e.b c(String string2) {
            this.c = string2;
            return this;
        }

        @Override
        public B.e.b d(boolean bl) {
            this.f = bl;
            return this;
        }

        @Override
        public B.e.b e(B.e.c c8) {
            this.j = c8;
            return this;
        }

        @Override
        public B.e.b f(Long l8) {
            this.e = l8;
            return this;
        }

        @Override
        public B.e.b g(C c8) {
            this.k = c8;
            return this;
        }

        @Override
        public B.e.b h(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override
        public B.e.b i(int n8) {
            this.l = n8;
            return this;
        }

        @Override
        public B.e.b j(String string2) {
            if (string2 != null) {
                this.b = string2;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override
        public B.e.b l(B.e.e e8) {
            this.i = e8;
            return this;
        }

        @Override
        public B.e.b m(long l8) {
            this.d = l8;
            return this;
        }

        @Override
        public B.e.b n(B.e.f f8) {
            this.h = f8;
            return this;
        }
    }

}

