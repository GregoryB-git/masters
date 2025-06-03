/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package s4;

import s3.l;

public class j
extends l {
    public final a o;

    public j(String string2, a a8) {
        super(string2);
        this.o = a8;
    }

    public j(a a8) {
        this.o = a8;
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a o;
        public static final /* enum */ a p;
        public static final /* enum */ a q;
        public static final /* synthetic */ a[] r;

        static {
            a a8;
            a a9;
            a a10;
            o = a10 = new a();
            p = a8 = new a();
            q = a9 = new a();
            r = new a[]{a10, a8, a9};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])r.clone();
        }
    }

}

