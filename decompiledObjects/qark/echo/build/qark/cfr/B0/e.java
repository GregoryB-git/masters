/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package B0;

import B0.d;
import android.os.Handler;
import i0.y;
import java.util.concurrent.CopyOnWriteArrayList;

public interface e {
    public y a();

    public long b();

    public void c(a var1);

    public long d();

    public void i(Handler var1, a var2);

    public static interface B0.e$a {
        public void c0(int var1, long var2, long var4);

        public static final class B0.e$a$a {
            public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

            public static /* synthetic */ void a(a a8, int n8, long l8, long l9) {
                B0.e$a$a.d(a8, n8, l8, l9);
            }

            public static /* synthetic */ void d(a a8, int n8, long l8, long l9) {
                a8.b.c0(n8, l8, l9);
            }

            public void b(Handler handler, B0.e$a a8) {
                g0.a.e((Object)handler);
                g0.a.e(a8);
                this.e(a8);
                this.a.add((Object)new a(handler, a8));
            }

            public void c(int n8, long l8, long l9) {
                for (a a8 : this.a) {
                    if (a8.c) continue;
                    a8.a.post((Runnable)new d(a8, n8, l8, l9));
                }
            }

            public void e(B0.e$a a8) {
                for (a a9 : this.a) {
                    if (a9.b != a8) continue;
                    a9.d();
                    this.a.remove((Object)a9);
                }
            }

            public static final class a {
                public final Handler a;
                public final B0.e$a b;
                public boolean c;

                public a(Handler handler, B0.e$a a8) {
                    this.a = handler;
                    this.b = a8;
                }

                public void d() {
                    this.c = true;
                }
            }

        }

    }

}

