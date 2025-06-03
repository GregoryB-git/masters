package e7;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class b4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f4108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4109e;
    public final /* synthetic */ boolean f;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f4110o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f4111p = null;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ k3 f4112q;

    public b4(k3 k3Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f4105a = str;
        this.f4106b = str2;
        this.f4107c = j10;
        this.f4108d = bundle;
        this.f4109e = z10;
        this.f = z11;
        this.f4110o = z12;
        this.f4112q = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4112q.C(this.f4105a, this.f4106b, this.f4107c, this.f4108d, this.f4109e, this.f, this.f4110o, this.f4111p);
    }
}
