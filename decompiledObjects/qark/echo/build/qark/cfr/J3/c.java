/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
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

public final class c
extends B.a {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final C i;

    public c(int n8, String string2, int n9, int n10, long l8, long l9, long l10, String string3, C c8) {
        this.a = n8;
        this.b = string2;
        this.c = n9;
        this.d = n10;
        this.e = l8;
        this.f = l9;
        this.g = l10;
        this.h = string3;
        this.i = c8;
    }

    public /* synthetic */ c(int n8, String string2, int n9, int n10, long l8, long l9, long l10, String string3, C c8,  a8) {
        this(n8, string2, n9, n10, l8, l9, l10, string3, c8);
    }

    @Override
    public C b() {
        return this.i;
    }

    @Override
    public int c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.a;
    }

    @Override
    public String e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.a) {
            Object object2;
            if (this.a == (object = (B.a)object).d() && this.b.equals((Object)object.e()) && this.c == object.g() && this.d == object.c() && this.e == object.f() && this.f == object.h() && this.g == object.i() && ((object2 = this.h) == null ? object.j() == null : object2.equals((Object)object.j()))) {
                object2 = this.i;
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
    public long f() {
        return this.e;
    }

    @Override
    public int g() {
        return this.c;
    }

    @Override
    public long h() {
        return this.f;
    }

    public int hashCode() {
        int n8 = this.a;
        int n9 = this.b.hashCode();
        int n10 = this.c;
        int n11 = this.d;
        long l8 = this.e;
        int n12 = (int)(l8 ^ l8 >>> 32);
        l8 = this.f;
        int n13 = (int)(l8 ^ l8 >>> 32);
        l8 = this.g;
        int n14 = (int)(l8 ^ l8 >>> 32);
        Object object = this.h;
        int n15 = 0;
        int n16 = object == null ? 0 : object.hashCode();
        object = this.i;
        if (object != null) {
            n15 = object.hashCode();
        }
        return ((((((((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n16) * 1000003 ^ n15;
    }

    @Override
    public long i() {
        return this.g;
    }

    @Override
    public String j() {
        return this.h;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApplicationExitInfo{pid=");
        stringBuilder.append(this.a);
        stringBuilder.append(", processName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", reasonCode=");
        stringBuilder.append(this.c);
        stringBuilder.append(", importance=");
        stringBuilder.append(this.d);
        stringBuilder.append(", pss=");
        stringBuilder.append(this.e);
        stringBuilder.append(", rss=");
        stringBuilder.append(this.f);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.g);
        stringBuilder.append(", traceFile=");
        stringBuilder.append(this.h);
        stringBuilder.append(", buildIdMappingForArch=");
        stringBuilder.append((Object)this.i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.a.b {
        public Integer a;
        public String b;
        public Integer c;
        public Integer d;
        public Long e;
        public Long f;
        public Long g;
        public String h;
        public C i;

        @Override
        public B.a a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" pid");
                object2 = object2.toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" processName");
                object = object.toString();
            }
            object2 = object;
            if (this.c == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" reasonCode");
                object2 = object2.toString();
            }
            object = object2;
            if (this.d == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" importance");
                object = object.toString();
            }
            object2 = object;
            if (this.e == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" pss");
                object2 = object2.toString();
            }
            object = object2;
            if (this.f == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" rss");
                object = object.toString();
            }
            object2 = object;
            if (this.g == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" timestamp");
                object2 = object2.toString();
            }
            if (object2.isEmpty()) {
                return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
            }
            object = new StringBuilder();
            object.append("Missing required properties:");
            object.append((String)object2);
            throw new IllegalStateException(object.toString());
        }

        @Override
        public B.a.b b(C c8) {
            this.i = c8;
            return this;
        }

        @Override
        public B.a.b c(int n8) {
            this.d = n8;
            return this;
        }

        @Override
        public B.a.b d(int n8) {
            this.a = n8;
            return this;
        }

        @Override
        public B.a.b e(String string2) {
            if (string2 != null) {
                this.b = string2;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override
        public B.a.b f(long l8) {
            this.e = l8;
            return this;
        }

        @Override
        public B.a.b g(int n8) {
            this.c = n8;
            return this;
        }

        @Override
        public B.a.b h(long l8) {
            this.f = l8;
            return this;
        }

        @Override
        public B.a.b i(long l8) {
            this.g = l8;
            return this;
        }

        @Override
        public B.a.b j(String string2) {
            this.h = string2;
            return this;
        }
    }

}

