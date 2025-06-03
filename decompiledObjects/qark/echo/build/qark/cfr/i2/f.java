/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package i2;

public final class f {
    public static final f c = new a().a();
    public final long a;
    public final long b;

    public f(long l8, long l9) {
        this.a = l8;
        this.b = l9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public static final class a {
        public long a = 0L;
        public long b = 0L;

        public f a() {
            return new f(this.a, this.b);
        }

        public a b(long l8) {
            this.b = l8;
            return this;
        }

        public a c(long l8) {
            this.a = l8;
            return this;
        }
    }

}

