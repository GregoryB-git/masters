package R2;

import A2.AbstractC0328n;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class Z3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bundle f5176o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f5177p;

    public Z3(C3 c32, Bundle bundle) {
        this.f5177p = c32;
        this.f5176o = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3 c32 = this.f5177p;
        Bundle bundle = this.f5176o;
        c32.n();
        c32.v();
        AbstractC0328n.i(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        AbstractC0328n.e(string);
        AbstractC0328n.e(string2);
        AbstractC0328n.i(bundle.get("value"));
        if (!c32.f5424a.p()) {
            c32.j().K().a("Conditional property not set since app measurement is disabled");
            return;
        }
        R5 r52 = new R5(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            I C7 = c32.k().C(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c32.t().C(new C0497e(bundle.getString("app_id"), string2, r52, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c32.k().C(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), C7, bundle.getLong("time_to_live"), c32.k().C(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
