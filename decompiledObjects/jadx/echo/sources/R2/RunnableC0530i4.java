package R2;

import com.google.android.gms.internal.measurement.C1024s7;

/* renamed from: R2.i4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0530i4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0585q3 f5337o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f5338p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f5339q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f5340r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0585q3 f5341s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C3 f5342t;

    public RunnableC0530i4(C3 c32, C0585q3 c0585q3, long j7, long j8, boolean z7, C0585q3 c0585q32) {
        this.f5342t = c32;
        this.f5337o = c0585q3;
        this.f5338p = j7;
        this.f5339q = j8;
        this.f5340r = z7;
        this.f5341s = c0585q32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5342t.G(this.f5337o);
        this.f5342t.E(this.f5338p, false);
        C3.K(this.f5342t, this.f5337o, this.f5339q, true, this.f5340r);
        if (C1024s7.a() && this.f5342t.f().s(K.f4867x0)) {
            C3.L(this.f5342t, this.f5337o, this.f5341s);
        }
    }
}
