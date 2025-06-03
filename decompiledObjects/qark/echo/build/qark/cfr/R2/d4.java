/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import E2.e;
import R2.C3;
import R2.K;
import R2.N2;
import R2.P1;
import R2.S5;
import R2.Y1;
import R2.a2;
import R2.g;
import R2.l2;
import R2.l5;
import R2.m3;
import R2.q2;
import R2.q3;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.y0;

public final class d4
implements Runnable {
    public final /* synthetic */ y0 o;
    public final /* synthetic */ C3 p;

    public d4(C3 c32, y0 y02) {
        this.p = c32;
        this.o = y02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object;
        block7 : {
            block6 : {
                String string2;
                block5 : {
                    block3 : {
                        block4 : {
                            object = this.p.u();
                            if (!r7.a() || !object.f().s(K.D0)) break block3;
                            if (object.i().J().y()) break block4;
                            object = object.j().M();
                            string2 = "Analytics storage consent denied; will not get session id";
                            break block5;
                        }
                        if (object.i().y(object.b().a()) || object.i().q.a() == 0L) break block6;
                        object = object.i().q.a();
                        break block7;
                    }
                    object = object.j().M();
                    string2 = "getSessionId has been disabled.";
                }
                object.a(string2);
            }
            object = null;
        }
        if (object != null) {
            this.p.a.L().T(this.o, object.longValue());
            return;
        }
        try {
            this.o.l(null);
            return;
        }
        catch (RemoteException remoteException) {
            this.p.a.j().G().b("getSessionId failed with exception", (Object)remoteException);
            return;
        }
    }
}

