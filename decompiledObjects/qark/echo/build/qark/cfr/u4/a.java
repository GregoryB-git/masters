/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package u4;

import u4.c;
import u4.d;

public final class a
extends d {
    public final String b;
    public final c.a c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    public a(String string2, c.a a8, String string3, String string4, long l8, long l9, String string5) {
        this.b = string2;
        this.c = a8;
        this.d = string3;
        this.e = string4;
        this.f = l8;
        this.g = l9;
        this.h = string5;
    }

    public /* synthetic */ a(String string2, c.a a8, String string3, String string4, long l8, long l9, String string5,  a9) {
        this(string2, a8, string3, string4, l8, l9, string5);
    }

    @Override
    public String b() {
        return this.d;
    }

    @Override
    public long c() {
        return this.f;
    }

    @Override
    public String d() {
        return this.b;
    }

    @Override
    public String e() {
        return this.h;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            object = (d)object;
            String string2 = this.b;
            if ((string2 == null ? object.d() == null : string2.equals((Object)object.d())) && this.c.equals((Object)object.g()) && ((string2 = this.d) == null ? object.b() == null : string2.equals((Object)object.b())) && ((string2 = this.e) == null ? object.f() == null : string2.equals((Object)object.f())) && this.f == object.c() && this.g == object.h()) {
                string2 = this.h;
                object = object.e();
                if (string2 == null ? object == null : string2.equals(object)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public String f() {
        return this.e;
    }

    @Override
    public c.a g() {
        return this.c;
    }

    @Override
    public long h() {
        return this.g;
    }

    public int hashCode() {
        String string2 = this.b;
        int n8 = 0;
        int n9 = string2 == null ? 0 : string2.hashCode();
        int n10 = this.c.hashCode();
        string2 = this.d;
        int n11 = string2 == null ? 0 : string2.hashCode();
        string2 = this.e;
        int n12 = string2 == null ? 0 : string2.hashCode();
        long l8 = this.f;
        int n13 = (int)(l8 ^ l8 >>> 32);
        l8 = this.g;
        int n14 = (int)(l8 ^ l8 >>> 32);
        string2 = this.h;
        if (string2 != null) {
            n8 = string2.hashCode();
        }
        return ((((((n9 ^ 1000003) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n8;
    }

    @Override
    public d.a n() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PersistedInstallationEntry{firebaseInstallationId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", registrationStatus=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", authToken=");
        stringBuilder.append(this.d);
        stringBuilder.append(", refreshToken=");
        stringBuilder.append(this.e);
        stringBuilder.append(", expiresInSecs=");
        stringBuilder.append(this.f);
        stringBuilder.append(", tokenCreationEpochInSecs=");
        stringBuilder.append(this.g);
        stringBuilder.append(", fisError=");
        stringBuilder.append(this.h);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends d.a {
        public String a;
        public c.a b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;

        public b() {
        }

        public b(d d8) {
            this.a = d8.d();
            this.b = d8.g();
            this.c = d8.b();
            this.d = d8.f();
            this.e = d8.c();
            this.f = d8.h();
            this.g = d8.e();
        }

        public /* synthetic */ b(d d8,  a8) {
            this(d8);
        }

        @Override
        public d a() {
            Object object = this.b;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" registrationStatus");
                object2 = object2.toString();
            }
            object = object2;
            if (this.e == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" expiresInSecs");
                object = object.toString();
            }
            object2 = object;
            if (this.f == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" tokenCreationEpochInSecs");
                object2 = object2.toString();
            }
            if (object2.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
            }
            object = new StringBuilder();
            object.append("Missing required properties:");
            object.append((String)object2);
            throw new IllegalStateException(object.toString());
        }

        @Override
        public d.a b(String string2) {
            this.c = string2;
            return this;
        }

        @Override
        public d.a c(long l8) {
            this.e = l8;
            return this;
        }

        @Override
        public d.a d(String string2) {
            this.a = string2;
            return this;
        }

        @Override
        public d.a e(String string2) {
            this.g = string2;
            return this;
        }

        @Override
        public d.a f(String string2) {
            this.d = string2;
            return this;
        }

        @Override
        public d.a g(c.a a8) {
            if (a8 != null) {
                this.b = a8;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override
        public d.a h(long l8) {
            this.f = l8;
            return this;
        }
    }

}

