package p;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f12699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f12700c;

    public g(m mVar, String str, Bundle bundle) {
        this.f12700c = mVar;
        this.f12698a = str;
        this.f12699b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12700c.f12721b.onPostMessage(this.f12698a, this.f12699b);
    }
}
