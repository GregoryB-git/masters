/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowInsetsController
 *  java.lang.Object
 */
package I;

import I.Y;
import I.Z;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import t.h;

public final class X {
    public final e a;

    /*
     * Enabled aggressive block sorting
     */
    public X(Window object, View view) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 30) {
            this.a = new d((Window)object, this);
            return;
        }
        object = n8 >= 26 ? new c((Window)object, view) : new b((Window)object, view);
        this.a = object;
    }

    public void a(boolean bl) {
        this.a.a(bl);
    }

    public void b(boolean bl) {
        this.a.b(bl);
    }

    public static abstract class a
    extends e {
        public final Window a;
        public final View b;

        public a(Window window, View view) {
            this.a = window;
            this.b = view;
        }

        public void c(int n8) {
            View view = this.a.getDecorView();
            view.setSystemUiVisibility(n8 | view.getSystemUiVisibility());
        }

        public void d(int n8) {
            this.a.addFlags(n8);
        }

        public void e(int n8) {
            View view = this.a.getDecorView();
            view.setSystemUiVisibility(n8 & view.getSystemUiVisibility());
        }

        public void f(int n8) {
            this.a.clearFlags(n8);
        }
    }

    public static class b
    extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        @Override
        public void b(boolean bl) {
            if (bl) {
                this.f(67108864);
                this.d(Integer.MIN_VALUE);
                this.c(8192);
                return;
            }
            this.e(8192);
        }
    }

    public static class c
    extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        @Override
        public void a(boolean bl) {
            if (bl) {
                this.f(134217728);
                this.d(Integer.MIN_VALUE);
                this.c(16);
                return;
            }
            this.e(16);
        }
    }

    public static class d
    extends e {
        public final X a;
        public final WindowInsetsController b;
        public final h c = new h();
        public Window d;

        public d(Window window, X x8) {
            this(Y.a(window), x8);
            this.d = window;
        }

        public d(WindowInsetsController windowInsetsController, X x8) {
            this.b = windowInsetsController;
            this.a = x8;
        }

        @Override
        public void a(boolean bl) {
            if (bl) {
                if (this.d != null) {
                    this.c(16);
                }
                Z.a(this.b, 16, 16);
                return;
            }
            if (this.d != null) {
                this.d(16);
            }
            Z.a(this.b, 0, 16);
        }

        @Override
        public void b(boolean bl) {
            if (bl) {
                if (this.d != null) {
                    this.c(8192);
                }
                Z.a(this.b, 8, 8);
                return;
            }
            if (this.d != null) {
                this.d(8192);
            }
            Z.a(this.b, 0, 8);
        }

        public void c(int n8) {
            View view = this.d.getDecorView();
            view.setSystemUiVisibility(n8 | view.getSystemUiVisibility());
        }

        public void d(int n8) {
            View view = this.d.getDecorView();
            view.setSystemUiVisibility(n8 & view.getSystemUiVisibility());
        }
    }

    public static abstract class e {
        public void a(boolean bl) {
        }

        public abstract void b(boolean var1);
    }

}

