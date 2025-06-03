// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import A2.n;
import android.os.Bundle;

public final class Z3 implements Runnable
{
    public final /* synthetic */ Bundle o;
    public final /* synthetic */ C3 p;
    
    public Z3(final C3 p2, final Bundle o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        final C3 p = this.p;
        final Bundle o = this.o;
        p.n();
        p.v();
        n.i(o);
        final String string = ((BaseBundle)o).getString("name");
        final String string2 = ((BaseBundle)o).getString("origin");
        n.e(string);
        n.e(string2);
        n.i(((BaseBundle)o).get("value"));
        if (!p.a.p()) {
            p.j().K().a("Conditional property not set since app measurement is disabled");
            return;
        }
        final R5 r5 = new R5(string, ((BaseBundle)o).getLong("triggered_timestamp"), ((BaseBundle)o).get("value"), string2);
        try {
            p.t().C(new e(((BaseBundle)o).getString("app_id"), string2, r5, ((BaseBundle)o).getLong("creation_timestamp"), false, ((BaseBundle)o).getString("trigger_event_name"), p.k().C(((BaseBundle)o).getString("app_id"), ((BaseBundle)o).getString("timed_out_event_name"), o.getBundle("timed_out_event_params"), string2, 0L, true, true), ((BaseBundle)o).getLong("trigger_timeout"), p.k().C(((BaseBundle)o).getString("app_id"), ((BaseBundle)o).getString("triggered_event_name"), o.getBundle("triggered_event_params"), string2, 0L, true, true), ((BaseBundle)o).getLong("time_to_live"), p.k().C(((BaseBundle)o).getString("app_id"), ((BaseBundle)o).getString("expired_event_name"), o.getBundle("expired_event_params"), string2, 0L, true, true)));
        }
        catch (IllegalArgumentException ex) {}
    }
}
