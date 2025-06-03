/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package w2;

import android.os.IBinder;
import android.os.RemoteException;
import w2.q;
import w2.r;

public final class n
implements Runnable {
    public final /* synthetic */ q o;
    public final /* synthetic */ IBinder p;

    public /* synthetic */ n(q q8, IBinder iBinder) {
        this.o = q8;
        this.p = iBinder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        q q8 = this.o;
        IBinder iBinder = this.p;
        synchronized (q8) {
            Throwable throwable2;
            if (iBinder == null) {
                try {
                    q8.a(0, "Null service connection");
                    return;
                }
                catch (Throwable throwable2) {}
            } else {
                try {
                    q8.c = new r(iBinder);
                }
                catch (RemoteException remoteException) {
                    q8.a(0, remoteException.getMessage());
                    return;
                }
                q8.a = 2;
                q8.c();
                return;
            }
            throw throwable2;
        }
    }
}

