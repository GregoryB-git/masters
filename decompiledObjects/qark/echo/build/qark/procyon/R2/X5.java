// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import com.google.android.gms.internal.measurement.g7;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class X5 extends BroadcastReceiver
{
    public final N2 a;
    
    public X5(final N2 a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            this.a.j().L().a("App receiver called with null intent");
            return;
        }
        final String action = intent.getAction();
        if (action == null) {
            this.a.j().L().a("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.a.j().L().a("App receiver called with unknown action");
            return;
        }
        final N2 a = this.a;
        if (g7.a()) {
            if (!a.z().D(null, K.M0)) {
                return;
            }
            a.j().K().a("App receiver notified triggers are available");
            a.e().D(new Z5(a));
        }
    }
}
