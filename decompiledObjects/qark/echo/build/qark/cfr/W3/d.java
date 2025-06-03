/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package W3;

import V3.k;
import W3.e;
import d4.b;

public abstract class d {
    public final a a;
    public final e b;
    public final k c;

    public d(a a8, e e8, k k8) {
        this.a = a8;
        this.b = e8;
        this.c = k8;
    }

    public k a() {
        return this.c;
    }

    public e b() {
        return this.b;
    }

    public a c() {
        return this.a;
    }

    public abstract d d(b var1);

    public static final class a
    extends Enum {
        public static final /* enum */ a o;
        public static final /* enum */ a p;
        public static final /* enum */ a q;
        public static final /* enum */ a r;
        public static final /* synthetic */ a[] s;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            o = a9 = new a();
            p = a8 = new a();
            q = a11 = new a();
            r = a10 = new a();
            s = new a[]{a9, a8, a11, a10};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])s.clone();
        }
    }

}

