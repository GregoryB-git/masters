/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.UnsupportedOperationException
 */
package H1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class a {
    public static final a d = new a(null);
    public int[] a;
    public int b;
    public float[] c;

    public a(int[] arrn) {
        int n8;
        Intrinsics.checkNotNullParameter(arrn, "shape");
        this.a = arrn;
        this.b = n8 = d.b(arrn);
        this.c = new float[n8];
    }

    public final float[] a() {
        return this.c;
    }

    public final int b(int n8) {
        return this.a[n8];
    }

    public final int c() {
        return this.a.length;
    }

    public final void d(int[] arrn) {
        Intrinsics.checkNotNullParameter(arrn, "shape");
        this.a = arrn;
        int n8 = d.b(arrn);
        arrn = new float[n8];
        System.arraycopy((Object)this.c, (int)0, (Object)arrn, (int)0, (int)Math.min((int)this.b, (int)n8));
        this.c = arrn;
        this.b = n8;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final int b(int[] arrn) {
            if (arrn.length != 0) {
                int n8 = arrn[0];
                int n9 = W5.g.j(arrn);
                int n10 = 1;
                int n11 = n8;
                if (1 <= n9) {
                    do {
                        n11 = n8 *= arrn[n10];
                        if (n10 == n9) break;
                        ++n10;
                    } while (true);
                }
                return n11;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
    }

}

