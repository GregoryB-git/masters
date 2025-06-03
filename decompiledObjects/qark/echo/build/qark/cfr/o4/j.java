/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package o4;

public interface j {
    public a b(String var1);

    public static final class a
    extends Enum {
        public static final /* enum */ a p;
        public static final /* enum */ a q;
        public static final /* enum */ a r;
        public static final /* enum */ a s;
        public static final /* synthetic */ a[] t;
        public final int o;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            p = a9 = new a(0);
            q = a8 = new a(1);
            r = a11 = new a(2);
            s = a10 = new a(3);
            t = new a[]{a9, a8, a11, a10};
        }

        public a(int n9) {
            this.o = n9;
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])t.clone();
        }

        public int c() {
            return this.o;
        }
    }

}

