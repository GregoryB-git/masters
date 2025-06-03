/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import A2.n;
import R2.C3;
import R2.D4;
import R2.I;
import R2.N2;
import R2.R5;
import R2.S5;
import R2.Y1;
import R2.a2;
import R2.e;
import R2.m3;
import android.os.Bundle;

public final class Z3
implements Runnable {
    public final /* synthetic */ Bundle o;
    public final /* synthetic */ C3 p;

    public Z3(C3 c32, Bundle bundle) {
        this.p = c32;
        this.o = bundle;
    }

    public final void run() {
        I i8;
        I i9;
        I i10;
        C3 c32 = this.p;
        Object object = this.o;
        c32.n();
        c32.v();
        n.i(object);
        Object object2 = object.getString("name");
        String string2 = object.getString("origin");
        n.e((String)object2);
        n.e(string2);
        n.i(object.get("value"));
        if (!c32.a.p()) {
            c32.j().K().a("Conditional property not set since app measurement is disabled");
            return;
        }
        object2 = new R5((String)object2, object.getLong("triggered_timestamp"), object.get("value"), string2);
        try {
            i10 = c32.k().C(object.getString("app_id"), object.getString("triggered_event_name"), object.getBundle("triggered_event_params"), string2, 0L, true, true);
            i9 = c32.k().C(object.getString("app_id"), object.getString("timed_out_event_name"), object.getBundle("timed_out_event_params"), string2, 0L, true, true);
            i8 = c32.k().C(object.getString("app_id"), object.getString("expired_event_name"), object.getBundle("expired_event_params"), string2, 0L, true, true);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
        object = new e(object.getString("app_id"), string2, (R5)object2, object.getLong("creation_timestamp"), false, object.getString("trigger_event_name"), i9, object.getLong("trigger_timeout"), i10, object.getLong("time_to_live"), i8);
        c32.t().C((e)object);
    }
}

