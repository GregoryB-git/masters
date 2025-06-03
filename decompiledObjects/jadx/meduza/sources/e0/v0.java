package e0;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class v0 extends u0 {
    public v0(Window window) {
        super(window);
    }

    @Override // b.a0
    public final void I(boolean z10) {
        if (!z10) {
            View decorView = this.f3845k0.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            this.f3845k0.clearFlags(134217728);
            this.f3845k0.addFlags(Integer.MIN_VALUE);
            View decorView2 = this.f3845k0.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
