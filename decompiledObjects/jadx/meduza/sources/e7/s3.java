package e7;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class s3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4636a = 0;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f4637b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4638c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4639d;

    public /* synthetic */ s3(k3 k3Var, Bundle bundle, long j10) {
        this.f4638c = k3Var;
        this.f4639d = bundle;
        this.f4637b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4636a) {
            case 0:
                k3 k3Var = (k3) this.f4638c;
                Bundle bundle = (Bundle) this.f4639d;
                long j10 = this.f4637b;
                if (!TextUtils.isEmpty(k3Var.m().w())) {
                    k3Var.zzj().t.b("Using developer consent only; google app id found");
                    break;
                } else {
                    k3Var.v(bundle, 0, j10);
                    break;
                }
            default:
                ((s4) this.f4639d).y((q4) this.f4638c, false, this.f4637b);
                s4 s4Var = (s4) this.f4639d;
                s4Var.f = null;
                w4 q10 = s4Var.q();
                q10.l();
                q10.t();
                q10.x(new i6.p(q10, (Object) null, 7));
                break;
        }
    }

    public s3(s4 s4Var, q4 q4Var, long j10) {
        this.f4638c = q4Var;
        this.f4637b = j10;
        this.f4639d = s4Var;
    }
}
