/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package D0;

import D0.p;
import android.view.Surface;
import d0.P;
import d0.q;
import g0.A;
import java.util.List;
import java.util.concurrent.Executor;

public interface F {
    public void A(boolean var1);

    public void B();

    public void C(List var1);

    public void D(long var1, long var3);

    public boolean E();

    public void F(a var1, Executor var2);

    public void G(int var1, q var2);

    public void H(q var1);

    public void I(Surface var1, A var2);

    public boolean J();

    public void K(boolean var1);

    public void L();

    public boolean c();

    public boolean e();

    public void f(long var1, long var3);

    public void j();

    public void release();

    public void u(float var1);

    public void v();

    public long w(long var1, boolean var3);

    public Surface x();

    public void y();

    public void z(p var1);

    public static interface a {
        public static final a a = new a(){

            @Override
            public void a(F f8) {
            }

            @Override
            public void b(F f8) {
            }

            @Override
            public void c(F f8, P p8) {
            }
        };

        public void a(F var1);

        public void b(F var1);

        public void c(F var1, P var2);

    }

    public static final class b
    extends Exception {
        public final q o;

        public b(Throwable throwable, q q8) {
            super(throwable);
            this.o = q8;
        }
    }

}

