package e0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class w0 extends b.a0 {

    /* renamed from: k0, reason: collision with root package name */
    public final WindowInsetsController f3849k0;

    /* renamed from: l0, reason: collision with root package name */
    public Window f3850l0;

    public w0(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        new r.h();
        this.f3849k0 = insetsController;
        this.f3850l0 = window;
    }

    @Override // b.a0
    public final void I(boolean z10) {
        if (z10) {
            Window window = this.f3850l0;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f3849k0.setSystemBarsAppearance(16, 16);
            return;
        }
        Window window2 = this.f3850l0;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f3849k0.setSystemBarsAppearance(0, 16);
    }

    @Override // b.a0
    public final void J(boolean z10) {
        if (z10) {
            Window window = this.f3850l0;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f3849k0.setSystemBarsAppearance(8, 8);
            return;
        }
        Window window2 = this.f3850l0;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f3849k0.setSystemBarsAppearance(0, 8);
    }
}
