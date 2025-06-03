// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import com.google.android.gms.internal.measurement.H0;
import android.content.Intent;
import android.content.Context;
import A2.n;

public final class v2
{
    public final a a;
    
    public v2(final a a) {
        n.i(a);
        this.a = a;
    }
    
    public final void a(final Context context, Intent setClassName) {
        final Y1 j = N2.c(context, null, null).j();
        if (setClassName == null) {
            j.L().a("Receiver called with null intent");
            return;
        }
        final String action = setClassName.getAction();
        j.K().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            setClassName = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            setClassName.setAction("com.google.android.gms.measurement.UPLOAD");
            j.K().a("Starting wakeful intent.");
            this.a.a(context, setClassName);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            j.L().a("Install Referrer Broadcasts are deprecated");
        }
    }
    
    public interface a
    {
        void a(final Context p0, final Intent p1);
    }
}
