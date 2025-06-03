package R2;

import android.os.Bundle;

/* renamed from: R2.x4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0634x4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bundle f5609o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0627w4 f5610p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0627w4 f5611q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f5612r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0620v4 f5613s;

    public RunnableC0634x4(C0620v4 c0620v4, Bundle bundle, C0627w4 c0627w4, C0627w4 c0627w42, long j7) {
        this.f5613s = c0620v4;
        this.f5609o = bundle;
        this.f5610p = c0627w4;
        this.f5611q = c0627w42;
        this.f5612r = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0620v4.H(this.f5613s, this.f5609o, this.f5610p, this.f5611q, this.f5612r);
    }
}
