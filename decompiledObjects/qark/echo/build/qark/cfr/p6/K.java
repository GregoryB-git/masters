/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package p6;

import V5.l;
import X5.d;
import X5.f;
import g6.p;
import v6.b;

public final class K
extends Enum {
    public static final /* enum */ K o = new K();
    public static final /* enum */ K p = new K();
    public static final /* enum */ K q = new K();
    public static final /* enum */ K r = new K();
    public static final /* synthetic */ K[] s;

    static {
        s = K.c();
    }

    public static final /* synthetic */ K[] c() {
        return new K[]{o, p, q, r};
    }

    public static K valueOf(String string2) {
        return (K)Enum.valueOf(K.class, (String)string2);
    }

    public static K[] values() {
        return (K[])s.clone();
    }

    public final void e(p p8, Object object, d d8) {
        int n8 = a.a[this.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 == 4) {
                        return;
                    }
                    throw new l();
                }
                b.a(p8, object, d8);
                return;
            }
            f.a(p8, object, d8);
            return;
        }
        v6.a.d(p8, object, d8, null, 4, null);
    }

    public final boolean h() {
        if (this == p) {
            return true;
        }
        return false;
    }

    public abstract class a {
        public static final /* synthetic */ int[] a;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            int[] arrn;
            arrn = new int[K.values().length];
            try {
                arrn[K.o.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                arrn[K.q.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                arrn[K.r.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                arrn[K.p.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            a = arrn;
        }
    }

}

