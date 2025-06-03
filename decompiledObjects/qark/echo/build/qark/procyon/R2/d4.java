// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.RemoteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.y0;

public final class d4 implements Runnable
{
    public final /* synthetic */ y0 o;
    public final /* synthetic */ C3 p;
    
    public d4(final C3 p2, final y0 o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        final l5 u = this.p.u();
        Long value = null;
        Label_0129: {
            Label_0056: {
                a2 a2;
                String s;
                if (r7.a() && u.f().s(K.D0)) {
                    if (!u.i().J().y()) {
                        a2 = u.j().M();
                        s = "Analytics storage consent denied; will not get session id";
                    }
                    else {
                        if (u.i().y(u.b().a())) {
                            break Label_0056;
                        }
                        if (u.i().q.a() == 0L) {
                            break Label_0056;
                        }
                        value = u.i().q.a();
                        break Label_0129;
                    }
                }
                else {
                    a2 = u.j().M();
                    s = "getSessionId has been disabled.";
                }
                a2.a(s);
            }
            value = null;
        }
        if (value != null) {
            this.p.a.L().T(this.o, value);
            return;
        }
        try {
            this.o.l(null);
        }
        catch (RemoteException ex) {
            this.p.a.j().G().b("getSessionId failed with exception", ex);
        }
    }
}
