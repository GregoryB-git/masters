/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package A2;

import A2.K;
import A2.c;
import A2.n;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import x2.b;

public final class Y
extends K {
    public final IBinder g;
    public final /* synthetic */ c h;

    public Y(c c8, int n8, IBinder iBinder, Bundle bundle) {
        this.h = c8;
        super(c8, n8, bundle);
        this.g = iBinder;
    }

    @Override
    public final void f(b b8) {
        if (c.V(this.h) != null) {
            c.V(this.h).o(b8);
        }
        this.h.L(b8);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean g() {
        Object object = this.g;
        n.i(object);
        object = object.getInterfaceDescriptor();
        {
            catch (RemoteException remoteException) {}
        }
        if (!this.h.E().equals(object)) {
            String string2 = this.h.E();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("service descriptor mismatch: ");
            stringBuilder.append(string2);
            stringBuilder.append(" vs. ");
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
        } else {
            object = this.h.s(this.g);
            if (object == null) return false;
            if (!c.g0(this.h, 2, 4, (IInterface)object)) {
                if (!c.g0(this.h, 3, 4, (IInterface)object)) return false;
            }
            c.Z(this.h, null);
            object = this.h.x();
            c c8 = this.h;
            if (c.U(c8) == null) return true;
            c.U(c8).v((Bundle)object);
            return true;
            object = "service probably died";
        }
        Log.w((String)"GmsClient", (String)object);
        return false;
    }
}

