package p;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f12696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f12697b;

    public f(m mVar, Bundle bundle) {
        this.f12697b = mVar;
        this.f12696a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12697b.f12721b.onMessageChannelReady(this.f12696a);
    }
}
