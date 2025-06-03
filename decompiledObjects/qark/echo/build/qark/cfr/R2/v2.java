/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import A2.n;
import R2.N2;
import R2.Y1;
import R2.a2;
import android.content.Context;
import android.content.Intent;

public final class v2 {
    public final a a;

    public v2(a a8) {
        n.i(a8);
        this.a = a8;
    }

    public final void a(Context context, Intent object) {
        Y1 y12 = N2.c(context, null, null).j();
        if (object == null) {
            y12.L().a("Receiver called with null intent");
            return;
        }
        object = object.getAction();
        y12.K().b("Local receiver got", object);
        if ("com.google.android.gms.measurement.UPLOAD".equals(object)) {
            object = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            object.setAction("com.google.android.gms.measurement.UPLOAD");
            y12.K().a("Starting wakeful intent.");
            this.a.a(context, (Intent)object);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(object)) {
            y12.L().a("Install Referrer Broadcasts are deprecated");
        }
    }

    public static interface a {
        public void a(Context var1, Intent var2);
    }

}

