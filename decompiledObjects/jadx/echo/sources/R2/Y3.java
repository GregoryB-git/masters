package R2;

import A2.AbstractC0328n;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class Y3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bundle f5163o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f5164p;

    public Y3(C3 c32, Bundle bundle) {
        this.f5164p = c32;
        this.f5163o = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3 c32 = this.f5164p;
        Bundle bundle = this.f5163o;
        c32.n();
        c32.v();
        AbstractC0328n.i(bundle);
        String e7 = AbstractC0328n.e(bundle.getString("name"));
        if (!c32.f5424a.p()) {
            c32.j().K().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c32.t().C(new C0497e(bundle.getString("app_id"), "", new R5(e7, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c32.k().C(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
