/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.DeadObjectException
 *  android.os.RemoteException
 *  java.lang.Exception
 *  java.lang.RuntimeException
 */
package z2;

import V2.k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import y2.b;
import z2.F;
import z2.T;
import z2.x;

public abstract class P
extends F {
    public final k b;

    public P(int n8, k k8) {
        super(n8);
        this.b = k8;
    }

    @Override
    public final void a(Status status) {
        this.b.d(new b(status));
    }

    @Override
    public final void b(Exception exception) {
        this.b.d(exception);
    }

    @Override
    public final void c(x x8) {
        try {
            this.h(x8);
            return;
        }
        catch (RuntimeException runtimeException) {
            this.b.d((Exception)runtimeException);
            return;
        }
        catch (RemoteException remoteException) {
            this.a(T.e(remoteException));
            return;
        }
        catch (DeadObjectException deadObjectException) {
            this.a(T.e((RemoteException)deadObjectException));
            throw deadObjectException;
        }
    }

    public abstract void h(x var1);
}

