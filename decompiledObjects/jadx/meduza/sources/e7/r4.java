package e7;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class r4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f4616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q4 f4617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q4 f4618c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s4 f4620e;

    public r4(s4 s4Var, Bundle bundle, q4 q4Var, q4 q4Var2, long j10) {
        this.f4616a = bundle;
        this.f4617b = q4Var;
        this.f4618c = q4Var2;
        this.f4619d = j10;
        this.f4620e = s4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s4 s4Var = this.f4620e;
        Bundle bundle = this.f4616a;
        q4 q4Var = this.f4617b;
        q4 q4Var2 = this.f4618c;
        long j10 = this.f4619d;
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        s4Var.x(q4Var, q4Var2, j10, true, s4Var.k().w("screen_view", bundle, null, false));
    }
}
