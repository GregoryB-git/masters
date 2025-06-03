package R2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class U3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5056o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5057p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f5058q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f5059r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f5060s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f5061t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f5062u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f5063v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3 f5064w;

    public U3(C3 c32, String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        this.f5064w = c32;
        this.f5056o = str;
        this.f5057p = str2;
        this.f5058q = j7;
        this.f5059r = bundle;
        this.f5060s = z7;
        this.f5061t = z8;
        this.f5062u = z9;
        this.f5063v = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5064w.V(this.f5056o, this.f5057p, this.f5058q, this.f5059r, this.f5060s, this.f5061t, this.f5062u, this.f5063v);
    }
}
