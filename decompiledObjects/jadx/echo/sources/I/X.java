package I;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final e f2408a;

    public static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final Window f2409a;

        /* renamed from: b, reason: collision with root package name */
        public final View f2410b;

        public a(Window window, View view) {
            this.f2409a = window;
            this.f2410b = view;
        }

        public void c(int i7) {
            View decorView = this.f2409a.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        public void d(int i7) {
            this.f2409a.addFlags(i7);
        }

        public void e(int i7) {
            View decorView = this.f2409a.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }

        public void f(int i7) {
            this.f2409a.clearFlags(i7);
        }
    }

    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        @Override // I.X.e
        public void b(boolean z7) {
            if (!z7) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        @Override // I.X.e
        public void a(boolean z7) {
            if (!z7) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public final X f2411a;

        /* renamed from: b, reason: collision with root package name */
        public final WindowInsetsController f2412b;

        /* renamed from: c, reason: collision with root package name */
        public final t.h f2413c;

        /* renamed from: d, reason: collision with root package name */
        public Window f2414d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(android.view.Window r2, I.X r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = I.Y.a(r2)
                r1.<init>(r0, r3)
                r1.f2414d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: I.X.d.<init>(android.view.Window, I.X):void");
        }

        @Override // I.X.e
        public void a(boolean z7) {
            if (z7) {
                if (this.f2414d != null) {
                    c(16);
                }
                this.f2412b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f2414d != null) {
                    d(16);
                }
                this.f2412b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // I.X.e
        public void b(boolean z7) {
            if (z7) {
                if (this.f2414d != null) {
                    c(8192);
                }
                this.f2412b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f2414d != null) {
                    d(8192);
                }
                this.f2412b.setSystemBarsAppearance(0, 8);
            }
        }

        public void c(int i7) {
            View decorView = this.f2414d.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        public void d(int i7) {
            View decorView = this.f2414d.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, X x7) {
            this.f2413c = new t.h();
            this.f2412b = windowInsetsController;
            this.f2411a = x7;
        }
    }

    public X(Window window, View view) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f2408a = new d(window, this);
        } else {
            this.f2408a = i7 >= 26 ? new c(window, view) : new b(window, view);
        }
    }

    public void a(boolean z7) {
        this.f2408a.a(z7);
    }

    public void b(boolean z7) {
        this.f2408a.b(z7);
    }

    public static class e {
        public abstract void b(boolean z7);

        public void a(boolean z7) {
        }
    }
}
