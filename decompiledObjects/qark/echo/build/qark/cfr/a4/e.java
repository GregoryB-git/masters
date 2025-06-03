/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package a4;

public interface e {
    public void a();

    public String toString();

    public static final class a
    extends Enum {
        public static final /* enum */ a o;
        public static final /* enum */ a p;
        public static final /* enum */ a q;
        public static final /* enum */ a r;
        public static final /* enum */ a s;
        public static final /* synthetic */ a[] t;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            o = a10 = new a();
            p = a12 = new a();
            q = a9 = new a();
            r = a8 = new a();
            s = a11 = new a();
            t = new a[]{a10, a12, a9, a8, a11};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])t.clone();
        }
    }

}

