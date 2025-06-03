// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.f0;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class t2 implements ServiceConnection
{
    public final String a;
    public final /* synthetic */ u2 b;
    
    public t2(final u2 b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (binder == null) {
            this.b.a.j().L().a("Install Referrer connection returned with null binder");
            return;
        }
        while (true) {
            try {
                final c0 o = f0.o(binder);
                if (o == null) {
                    this.b.a.j().L().a("Install Referrer Service implementation was not found");
                    return;
                }
                this.b.a.j().K().a("Install Referrer Service connected");
                this.b.a.e().D(new w2(this, o, (ServiceConnection)this));
                return;
                final RuntimeException ex;
                this.b.a.j().L().b("Exception occurred while calling Install Referrer API", ex);
            }
            catch (RuntimeException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.b.a.j().K().a("Install Referrer Service disconnected");
    }
}
