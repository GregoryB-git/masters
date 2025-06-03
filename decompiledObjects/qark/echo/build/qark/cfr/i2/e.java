/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package i2;

public final class e {
    public static final e c = new a().a();
    public final long a;
    public final long b;

    public e(long l8, long l9) {
        this.a = l8;
        this.b = l9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public static final class a {
        public long a = 0L;
        public long b = 0L;

        public e a() {
            return new e(this.a, this.b);
        }

        public a b(long l8) {
            this.a = l8;
            return this;
        }

        public a c(long l8) {
            this.b = l8;
            return this;
        }
    }

}

