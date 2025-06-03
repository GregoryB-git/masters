/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package i2;

public final class c {
    public static final c c = new a().a();
    public final long a;
    public final b b;

    public c(long l8, b b8) {
        this.a = l8;
        this.b = b8;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.a;
    }

    public b b() {
        return this.b;
    }

    public static final class a {
        public long a = 0L;
        public b b = b.p;

        public c a() {
            return new c(this.a, this.b);
        }

        public a b(long l8) {
            this.a = l8;
            return this;
        }

        public a c(b b8) {
            this.b = b8;
            return this;
        }
    }

    public static final class b
    extends Enum
    implements m4.c {
        public static final /* enum */ b p;
        public static final /* enum */ b q;
        public static final /* enum */ b r;
        public static final /* enum */ b s;
        public static final /* enum */ b t;
        public static final /* enum */ b u;
        public static final /* enum */ b v;
        public static final /* synthetic */ b[] w;
        public final int o;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            b b13;
            b b14;
            p = b12 = new b(0);
            q = b13 = new b(1);
            r = b14 = new b(2);
            s = b8 = new b(3);
            t = b10 = new b(4);
            u = b11 = new b(5);
            v = b9 = new b(6);
            w = new b[]{b12, b13, b14, b8, b10, b11, b9};
        }

        public b(int n9) {
            this.o = n9;
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])w.clone();
        }

        @Override
        public int g() {
            return this.o;
        }
    }

}

