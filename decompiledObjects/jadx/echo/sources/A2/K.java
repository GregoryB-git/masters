package A2;

import android.app.PendingIntent;
import android.os.Bundle;
import x2.C2188b;

/* loaded from: classes.dex */
public abstract class K extends V {

    /* renamed from: d, reason: collision with root package name */
    public final int f385d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0317c f387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(AbstractC0317c abstractC0317c, int i7, Bundle bundle) {
        super(abstractC0317c, Boolean.TRUE);
        this.f387f = abstractC0317c;
        this.f385d = i7;
        this.f386e = bundle;
    }

    @Override // A2.V
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        C2188b c2188b;
        if (this.f385d != 0) {
            this.f387f.i0(1, null);
            Bundle bundle = this.f386e;
            c2188b = new C2188b(this.f385d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        } else {
            if (g()) {
                return;
            }
            this.f387f.i0(1, null);
            c2188b = new C2188b(8, null);
        }
        f(c2188b);
    }

    public abstract void f(C2188b c2188b);

    public abstract boolean g();

    @Override // A2.V
    public final void b() {
    }
}
