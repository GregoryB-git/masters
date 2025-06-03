/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package P4;

import s3.l;

public class o
extends l {
    public final a o;

    public o(String string2) {
        super(string2);
        this.o = a.p;
    }

    public o(String string2, a a8) {
        super(string2);
        this.o = a8;
    }

    public o(String string2, Throwable throwable) {
        super(string2, throwable);
        this.o = a.p;
    }

    public o(String string2, Throwable throwable, a a8) {
        super(string2, throwable);
        this.o = a8;
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a p;
        public static final /* enum */ a q;
        public static final /* enum */ a r;
        public static final /* enum */ a s;
        public static final /* enum */ a t;
        public static final /* synthetic */ a[] u;
        public final int o;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            p = a12 = new a(0);
            q = a8 = new a(1);
            r = a9 = new a(2);
            s = a11 = new a(3);
            t = a10 = new a(4);
            u = new a[]{a12, a8, a9, a11, a10};
        }

        public a(int n9) {
            this.o = n9;
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])u.clone();
        }
    }

}

