package R2;

import A2.AbstractC0328n;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class J5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f4762o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f4763p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bundle f4764q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K5 f4765r;

    public J5(K5 k52, String str, String str2, Bundle bundle) {
        this.f4765r = k52;
        this.f4762o = str;
        this.f4763p = str2;
        this.f4764q = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4765r.f4881a.r((I) AbstractC0328n.i(this.f4765r.f4881a.n0().C(this.f4762o, this.f4763p, this.f4764q, "auto", this.f4765r.f4881a.b().a(), false, true)), this.f4762o);
    }
}
