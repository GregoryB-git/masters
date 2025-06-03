package p;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f12694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f12695c;

    public e(m mVar, String str, Bundle bundle) {
        this.f12695c = mVar;
        this.f12693a = str;
        this.f12694b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12695c.f12721b.extraCallback(this.f12693a, this.f12694b);
    }
}
