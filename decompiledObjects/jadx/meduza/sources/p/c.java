package p;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f12688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f12689b;

    public c(m mVar, Bundle bundle) {
        this.f12689b = mVar;
        this.f12688a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12689b.f12721b.onUnminimized(this.f12688a);
    }
}
