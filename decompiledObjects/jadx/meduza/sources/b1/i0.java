package b1;

import android.os.Bundle;
import java.util.Map;
import s1.c;

/* loaded from: classes.dex */
public final class i0 implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final s1.c f1737a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1738b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1739c;

    /* renamed from: d, reason: collision with root package name */
    public final rb.g f1740d;

    public static final class a extends ec.j implements dc.a<j0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t0 f1741a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t0 t0Var) {
            super(0);
            this.f1741a = t0Var;
        }

        @Override // dc.a
        public final j0 invoke() {
            return h0.c(this.f1741a);
        }
    }

    public i0(s1.c cVar, t0 t0Var) {
        ec.i.e(cVar, "savedStateRegistry");
        ec.i.e(t0Var, "viewModelStoreOwner");
        this.f1737a = cVar;
        this.f1740d = b.z.n(new a(t0Var));
    }

    @Override // s1.c.b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1739c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((j0) this.f1740d.getValue()).f1744d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((e0) entry.getValue()).f1729e.a();
            if (!ec.i.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f1738b = false;
        return bundle;
    }

    public final void b() {
        if (this.f1738b) {
            return;
        }
        Bundle a10 = this.f1737a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1739c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a10 != null) {
            bundle.putAll(a10);
        }
        this.f1739c = bundle;
        this.f1738b = true;
    }
}
