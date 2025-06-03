/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 */
package x0;

import android.os.Handler;
import d0.I;
import d0.u;
import i0.y;
import l0.y1;
import x0.E;
import x0.v;

public interface x {
    public u a();

    public void c(E var1);

    public void d(c var1);

    public void e(v var1);

    public v f(b var1, B0.b var2, long var3);

    public void g(c var1, y var2, y1 var3);

    public void h();

    public boolean i();

    public I j();

    public void k(Handler var1, p0.v var2);

    public void l(u var1);

    public void m(c var1);

    public void n(c var1);

    public void o(p0.v var1);

    public void p(Handler var1, E var2);

    public static interface a {
    }

    public static final class b {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public b(Object object) {
            this(object, -1L);
        }

        public b(Object object, int n8, int n9, long l8) {
            this(object, n8, n9, l8, -1);
        }

        public b(Object object, int n8, int n9, long l8, int n10) {
            this.a = object;
            this.b = n8;
            this.c = n9;
            this.d = l8;
            this.e = n10;
        }

        public b(Object object, long l8) {
            this(object, -1, -1, l8, -1);
        }

        public b(Object object, long l8, int n8) {
            this(object, -1, -1, l8, n8);
        }

        public b a(Object object) {
            if (this.a.equals(object)) {
                return this;
            }
            return new b(object, this.b, this.c, this.d, this.e);
        }

        public boolean b() {
            if (this.b != -1) {
                return true;
            }
            return false;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            if (this.a.equals(object.a) && this.b == object.b && this.c == object.c && this.d == object.d && this.e == object.e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.a.hashCode()) * 31 + this.b) * 31 + this.c) * 31 + (int)this.d) * 31 + this.e;
        }
    }

    public static interface c {
        public void a(x var1, I var2);
    }

}

