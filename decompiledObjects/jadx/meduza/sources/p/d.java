package p;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f12691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f12692c;

    public d(m mVar, int i10, Bundle bundle) {
        this.f12692c = mVar;
        this.f12690a = i10;
        this.f12691b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12692c.f12721b.onNavigationEvent(this.f12690a, this.f12691b);
    }
}
