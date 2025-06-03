package p;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f12710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f12711b;

    public j(m mVar, Bundle bundle) {
        this.f12711b = mVar;
        this.f12710a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12711b.f12721b.onWarmupCompleted(this.f12710a);
    }
}
