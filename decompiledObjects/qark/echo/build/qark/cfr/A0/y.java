/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.List
 */
package A0;

import A0.B;
import d0.I;
import d0.J;
import d0.q;
import g0.o;
import java.util.List;
import x0.x;
import y0.e;
import y0.n;

public interface y
extends B {
    public void g();

    public void h(boolean var1);

    public boolean i(int var1, long var2);

    public void j();

    public int k(long var1, List var3);

    public int l();

    public q m();

    public int n();

    public int o();

    public boolean p(int var1, long var2);

    public boolean q(long var1, e var3, List var4);

    public void r(float var1);

    public Object s();

    public void t();

    public void u();

    public void v(long var1, long var3, long var5, List var7, n[] var8);

    public static final class a {
        public final J a;
        public final int[] b;
        public final int c;

        public /* varargs */ a(J j8, int ... arrn) {
            this(j8, arrn, 0);
        }

        public a(J j8, int[] arrn, int n8) {
            if (arrn.length == 0) {
                o.d("ETSDefinition", "Empty tracks are not allowed", (Throwable)new IllegalArgumentException());
            }
            this.a = j8;
            this.b = arrn;
            this.c = n8;
        }
    }

    public static interface b {
        public y[] a(a[] var1, B0.e var2, x.b var3, I var4);
    }

}

