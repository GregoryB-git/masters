/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Comparator
 */
package S3;

import java.util.Comparator;

public interface h {
    public h a();

    public h b(Object var1, Object var2, Comparator var3);

    public h c(Object var1, Object var2, a var3, h var4, h var5);

    public boolean d();

    public void e(b var1);

    public h f();

    public h g(Object var1, Comparator var2);

    public Object getKey();

    public Object getValue();

    public h h();

    public h i();

    public boolean isEmpty();

    public int size();

    public static final class a
    extends Enum {
        public static final /* enum */ a o;
        public static final /* enum */ a p;
        public static final /* synthetic */ a[] q;

        static {
            a a8;
            a a9;
            o = a8 = new a();
            p = a9 = new a();
            q = new a[]{a8, a9};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])q.clone();
        }
    }

    public static abstract class b {
        public abstract void a(Object var1, Object var2);
    }

}

