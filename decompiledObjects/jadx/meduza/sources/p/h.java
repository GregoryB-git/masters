package p;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f12702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12703c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f12704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f12705e;

    public h(m mVar, int i10, Uri uri, boolean z10, Bundle bundle) {
        this.f12705e = mVar;
        this.f12701a = i10;
        this.f12702b = uri;
        this.f12703c = z10;
        this.f12704d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12705e.f12721b.onRelationshipValidationResult(this.f12701a, this.f12702b, this.f12703c, this.f12704d);
    }
}
