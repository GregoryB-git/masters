package p;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f12708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f12709d;

    public i(m mVar, int i10, int i11, Bundle bundle) {
        this.f12709d = mVar;
        this.f12706a = i10;
        this.f12707b = i11;
        this.f12708c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12709d.f12721b.onActivityResized(this.f12706a, this.f12707b, this.f12708c);
    }
}
