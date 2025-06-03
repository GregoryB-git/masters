package p;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12716e;
    public final /* synthetic */ Bundle f;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f12717o;

    public k(m mVar, int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
        this.f12717o = mVar;
        this.f12712a = i10;
        this.f12713b = i11;
        this.f12714c = i12;
        this.f12715d = i13;
        this.f12716e = i14;
        this.f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12717o.f12721b.onActivityLayout(this.f12712a, this.f12713b, this.f12714c, this.f12715d, this.f12716e, this.f);
    }
}
