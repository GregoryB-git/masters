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
 */
package n2;

import n2.e;

public final class a
extends e {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    public a(long l8, int n8, int n9, long l9, int n10) {
        this.b = l8;
        this.c = n8;
        this.d = n9;
        this.e = l9;
        this.f = n10;
    }

    public /* synthetic */ a(long l8, int n8, int n9, long l9, int n10,  a8) {
        this(l8, n8, n9, l9, n10);
    }

    @Override
    public int b() {
        return this.d;
    }

    @Override
    public long c() {
        return this.e;
    }

    @Override
    public int d() {
        return this.c;
    }

    @Override
    public int e() {
        return this.f;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof e) {
            if (this.b == (object = (e)object).f() && this.c == object.d() && this.d == object.b() && this.e == object.c() && this.f == object.e()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long l8 = this.b;
        int n8 = (int)(l8 ^ l8 >>> 32);
        int n9 = this.c;
        int n10 = this.d;
        l8 = this.e;
        return ((((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ (int)(l8 >>> 32 ^ l8)) * 1000003 ^ this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EventStoreConfig{maxStorageSizeInBytes=");
        stringBuilder.append(this.b);
        stringBuilder.append(", loadBatchSize=");
        stringBuilder.append(this.c);
        stringBuilder.append(", criticalSectionEnterTimeoutMs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", eventCleanUpAge=");
        stringBuilder.append(this.e);
        stringBuilder.append(", maxBlobByteSizePerRow=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends e.a {
        public Long a;
        public Integer b;
        public Integer c;
        public Long d;
        public Integer e;

        @Override
        public e a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" maxStorageSizeInBytes");
                object2 = object2.toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" loadBatchSize");
                object = object.toString();
            }
            object2 = object;
            if (this.c == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" criticalSectionEnterTimeoutMs");
                object2 = object2.toString();
            }
            object = object2;
            if (this.d == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" eventCleanUpAge");
                object = object.toString();
            }
            object2 = object;
            if (this.e == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" maxBlobByteSizePerRow");
                object2 = object2.toString();
            }
            if (object2.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e, null);
            }
            object = new StringBuilder();
            object.append("Missing required properties:");
            object.append((String)object2);
            throw new IllegalStateException(object.toString());
        }

        @Override
        public e.a b(int n8) {
            this.c = n8;
            return this;
        }

        @Override
        public e.a c(long l8) {
            this.d = l8;
            return this;
        }

        @Override
        public e.a d(int n8) {
            this.b = n8;
            return this;
        }

        @Override
        public e.a e(int n8) {
            this.e = n8;
            return this;
        }

        @Override
        public e.a f(long l8) {
            this.a = l8;
            return this;
        }
    }

}

