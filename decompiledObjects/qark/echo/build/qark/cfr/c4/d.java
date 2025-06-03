/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package c4;

public interface d {
    public void a(a var1, String var2, String var3, long var4);

    public a b();

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
            o = a8 = new a();
            p = a10 = new a();
            q = a9 = new a();
            r = a11 = new a();
            s = a12 = new a();
            t = new a[]{a8, a10, a9, a11, a12};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])t.clone();
        }
    }

}

