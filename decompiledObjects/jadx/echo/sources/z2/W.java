package z2;

import A2.AbstractC0328n;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import x2.C2188b;

/* loaded from: classes.dex */
public final class W implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final U f21685o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ X f21686p;

    public W(X x7, U u7) {
        this.f21686p = x7;
        this.f21685o = u7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21686p.f21687p) {
            C2188b b7 = this.f21685o.b();
            if (b7.g()) {
                X x7 = this.f21686p;
                x7.f10264o.startActivityForResult(GoogleApiActivity.a(x7.b(), (PendingIntent) AbstractC0328n.i(b7.f()), this.f21685o.a(), false), 1);
                return;
            }
            X x8 = this.f21686p;
            if (x8.f21690s.b(x8.b(), b7.a(), null) != null) {
                X x9 = this.f21686p;
                x9.f21690s.v(x9.b(), this.f21686p.f10264o, b7.a(), 2, this.f21686p);
            } else {
                if (b7.a() != 18) {
                    this.f21686p.l(b7, this.f21685o.a());
                    return;
                }
                X x10 = this.f21686p;
                Dialog q7 = x10.f21690s.q(x10.b(), this.f21686p);
                X x11 = this.f21686p;
                x11.f21690s.r(x11.b().getApplicationContext(), new V(this, q7));
            }
        }
    }
}
