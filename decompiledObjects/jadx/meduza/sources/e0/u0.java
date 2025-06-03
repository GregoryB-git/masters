package e0;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class u0 extends t0 {
    public u0(Window window) {
        super(window);
    }

    @Override // b.a0
    public final void J(boolean z10) {
        if (!z10) {
            View decorView = this.f3845k0.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            this.f3845k0.clearFlags(67108864);
            this.f3845k0.addFlags(Integer.MIN_VALUE);
            View decorView2 = this.f3845k0.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
