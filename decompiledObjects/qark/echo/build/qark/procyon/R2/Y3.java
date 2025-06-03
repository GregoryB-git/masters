// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import A2.n;
import android.os.Bundle;

public final class Y3 implements Runnable
{
    public final /* synthetic */ Bundle o;
    public final /* synthetic */ C3 p;
    
    public Y3(final C3 p2, final Bundle o) {
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
        final String e = n.e(((BaseBundle)o).getString("name"));
        if (!p.a.p()) {
            p.j().K().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        final R5 r5 = new R5(e, 0L, null, "");
        try {
            p.t().C(new e(((BaseBundle)o).getString("app_id"), "", r5, ((BaseBundle)o).getLong("creation_timestamp"), ((BaseBundle)o).getBoolean("active"), ((BaseBundle)o).getString("trigger_event_name"), null, ((BaseBundle)o).getLong("trigger_timeout"), null, ((BaseBundle)o).getLong("time_to_live"), p.k().C(((BaseBundle)o).getString("app_id"), ((BaseBundle)o).getString("expired_event_name"), o.getBundle("expired_event_params"), "", ((BaseBundle)o).getLong("creation_timestamp"), true, true)));
        }
        catch (IllegalArgumentException ex) {}
    }
}
