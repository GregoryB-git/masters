/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package R2;

import R2.G2;
import R2.N2;
import R2.Y1;
import R2.a2;
import R2.u2;
import R2.w2;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.f0;

public final class t2
implements ServiceConnection {
    public final String a;
    public final /* synthetic */ u2 b;

    public t2(u2 u22, String string2) {
        this.b = u22;
        this.a = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.j().L().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            object = f0.o(iBinder);
            if (object == null) {
                this.b.a.j().L().a("Install Referrer Service implementation was not found");
                return;
            }
            this.b.a.j().K().a("Install Referrer Service connected");
            this.b.a.e().D(new w2(this, (c0)object, this));
            return;
        }
        catch (RuntimeException runtimeException) {}
        this.b.a.j().L().b("Exception occurred while calling Install Referrer API", (Object)runtimeException);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.j().K().a("Install Referrer Service disconnected");
    }
}

