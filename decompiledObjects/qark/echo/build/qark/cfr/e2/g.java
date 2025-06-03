/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package e2;

import e2.k;
import e2.m;
import e2.p;
import java.util.List;

public final class g
extends m {
    public final long a;
    public final long b;
    public final k c;
    public final Integer d;
    public final String e;
    public final List f;
    public final p g;

    public g(long l8, long l9, k k8, Integer n8, String string2, List list, p p8) {
        this.a = l8;
        this.b = l9;
        this.c = k8;
        this.d = n8;
        this.e = string2;
        this.f = list;
        this.g = p8;
    }

    public /* synthetic */ g(long l8, long l9, k k8, Integer n8, String string2, List list, p p8,  a8) {
        this(l8, l9, k8, n8, string2, list, p8);
    }

    @Override
    public k b() {
        return this.c;
    }

    @Override
    public List c() {
        return this.f;
    }

    @Override
    public Integer d() {
        return this.d;
    }

    @Override
    public String e() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof m) {
            Object object2;
            if (this.a == (object = (m)object).g() && this.b == object.h() && ((object2 = this.c) == null ? object.b() == null : object2.equals((Object)object.b())) && ((object2 = this.d) == null ? object.d() == null : object2.equals((Object)object.d())) && ((object2 = this.e) == null ? object.e() == null : object2.equals((Object)object.e())) && ((object2 = this.f) == null ? object.c() == null : object2.equals((Object)object.c()))) {
                object2 = this.g;
                object = object.f();
                if (object2 == null ? object == null : object2.equals(object)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public p f() {
        return this.g;
    }

    @Override
    public long g() {
        return this.a;
    }

    @Override
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        l8 = this.b;
        int n9 = (int)(l8 >>> 32 ^ l8);
        Object object = this.c;
        int n10 = 0;
        int n11 = object == null ? 0 : object.hashCode();
        object = this.d;
        int n12 = object == null ? 0 : object.hashCode();
        object = this.e;
        int n13 = object == null ? 0 : object.hashCode();
        object = this.f;
        int n14 = object == null ? 0 : object.hashCode();
        object = this.g;
        if (object != null) {
            n10 = object.hashCode();
        }
        return ((((((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LogRequest{requestTimeMs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", requestUptimeMs=");
        stringBuilder.append(this.b);
        stringBuilder.append(", clientInfo=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", logSource=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", logSourceName=");
        stringBuilder.append(this.e);
        stringBuilder.append(", logEvents=");
        stringBuilder.append((Object)this.f);
        stringBuilder.append(", qosTier=");
        stringBuilder.append((Object)this.g);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends m.a {
        public Long a;
        public Long b;
        public k c;
        public Integer d;
        public String e;
        public List f;
        public p g;

        @Override
        public m a() {
            Object object = this.a;
            String string2 = "";
            if (object == null) {
                string2 = new StringBuilder();
                string2.append("");
                string2.append(" requestTimeMs");
                string2 = string2.toString();
            }
            object = string2;
            if (this.b == null) {
                object = new StringBuilder();
                object.append(string2);
                object.append(" requestUptimeMs");
                object = object.toString();
            }
            if (object.isEmpty()) {
                return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
            }
            string2 = new StringBuilder();
            string2.append("Missing required properties:");
            string2.append((String)object);
            throw new IllegalStateException(string2.toString());
        }

        @Override
        public m.a b(k k8) {
            this.c = k8;
            return this;
        }

        @Override
        public m.a c(List list) {
            this.f = list;
            return this;
        }

        @Override
        public m.a d(Integer n8) {
            this.d = n8;
            return this;
        }

        @Override
        public m.a e(String string2) {
            this.e = string2;
            return this;
        }

        @Override
        public m.a f(p p8) {
            this.g = p8;
            return this;
        }

        @Override
        public m.a g(long l8) {
            this.a = l8;
            return this;
        }

        @Override
        public m.a h(long l8) {
            this.b = l8;
            return this;
        }
    }

}

