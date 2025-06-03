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
 *  java.util.Map
 */
package f2;

import f2.h;
import f2.i;
import java.util.Map;

public final class b
extends i {
    public final String a;
    public final Integer b;
    public final h c;
    public final long d;
    public final long e;
    public final Map f;

    public b(String string2, Integer n8, h h8, long l8, long l9, Map map) {
        this.a = string2;
        this.b = n8;
        this.c = h8;
        this.d = l8;
        this.e = l9;
        this.f = map;
    }

    public /* synthetic */ b(String string2, Integer n8, h h8, long l8, long l9, Map map,  a8) {
        this(string2, n8, h8, l8, l9, map);
    }

    @Override
    public Map c() {
        return this.f;
    }

    @Override
    public Integer d() {
        return this.b;
    }

    @Override
    public h e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof i) {
            Integer n8;
            if (this.a.equals((Object)(object = (i)object).j()) && ((n8 = this.b) == null ? object.d() == null : n8.equals((Object)object.d())) && this.c.equals(object.e()) && this.d == object.f() && this.e == object.k() && this.f.equals((Object)object.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        Integer n9 = this.b;
        int n10 = n9 == null ? 0 : n9.hashCode();
        int n11 = this.c.hashCode();
        long l8 = this.d;
        int n12 = (int)(l8 ^ l8 >>> 32);
        l8 = this.e;
        return (((((n8 ^ 1000003) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ (int)(l8 ^ l8 >>> 32)) * 1000003 ^ this.f.hashCode();
    }

    @Override
    public String j() {
        return this.a;
    }

    @Override
    public long k() {
        return this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EventInternal{transportName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", code=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", encodedPayload=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", eventMillis=");
        stringBuilder.append(this.d);
        stringBuilder.append(", uptimeMillis=");
        stringBuilder.append(this.e);
        stringBuilder.append(", autoMetadata=");
        stringBuilder.append((Object)this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends i.a {
        public String a;
        public Integer b;
        public h c;
        public Long d;
        public Long e;
        public Map f;

        @Override
        public i d() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" transportName");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.c == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" encodedPayload");
                string2 = string2.toString();
            }
            string3 = string2;
            if (this.d == null) {
                string3 = new StringBuilder();
                string3.append(string2);
                string3.append(" eventMillis");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.e == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" uptimeMillis");
                string2 = string2.toString();
            }
            string3 = string2;
            if (this.f == null) {
                string3 = new StringBuilder();
                string3.append(string2);
                string3.append(" autoMetadata");
                string3 = string3.toString();
            }
            if (string3.isEmpty()) {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f, null);
            }
            string2 = new StringBuilder();
            string2.append("Missing required properties:");
            string2.append(string3);
            throw new IllegalStateException(string2.toString());
        }

        @Override
        public Map e() {
            Map map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override
        public i.a f(Map map) {
            if (map != null) {
                this.f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override
        public i.a g(Integer n8) {
            this.b = n8;
            return this;
        }

        @Override
        public i.a h(h h8) {
            if (h8 != null) {
                this.c = h8;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override
        public i.a i(long l8) {
            this.d = l8;
            return this;
        }

        @Override
        public i.a j(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override
        public i.a k(long l8) {
            this.e = l8;
            return this;
        }
    }

}

