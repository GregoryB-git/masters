package z2;

import android.app.Dialog;

/* loaded from: classes.dex */
public final class V extends AbstractC2295D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dialog f21683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f21684b;

    public V(W w7, Dialog dialog) {
        this.f21684b = w7;
        this.f21683a = dialog;
    }

    @Override // z2.AbstractC2295D
    public final void a() {
        this.f21684b.f21686p.o();
        if (this.f21683a.isShowing()) {
            this.f21683a.dismiss();
        }
    }
}
