package p;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f12718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f12719b;

    public l(m mVar, Bundle bundle) {
        this.f12719b = mVar;
        this.f12718a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12719b.f12721b.onMinimized(this.f12718a);
    }
}
