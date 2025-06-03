/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicReference
 */
package R2;

import A2.n;
import R2.D4;
import R2.R1;
import R2.W5;
import R2.Y1;
import R2.a2;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class H4
implements Runnable {
    public final /* synthetic */ AtomicReference o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ Bundle q;
    public final /* synthetic */ D4 r;

    public H4(D4 d42, AtomicReference atomicReference, W5 w52, Bundle bundle) {
        this.r = d42;
        this.o = atomicReference;
        this.p = w52;
        this.q = bundle;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        block10 : {
            var2_1 = this.o;
            // MONITORENTER : var2_1
            var1_2 = D4.B(this.r);
            if (var1_2 != null) break block10;
            this.r.j().G().a("Failed to get trigger URIs; not connected to service");
            this.o.notify();
            // MONITOREXIT : var2_1
            return;
        }
        n.i(this.p);
        this.o.set((Object)var1_2.F(this.p, this.q));
        D4.m0(this.r);
        var1_2 = this.o;
        ** GOTO lbl26
        catch (Throwable var1_4) {
            ** GOTO lbl28
        }
        catch (RemoteException var1_5) {}
        {
            this.r.j().G().b("Failed to get trigger URIs; remote exception", (Object)var1_5);
        }
        {
            var1_2 = this.o;
lbl26: // 2 sources:
            var1_2.notify();
            return;
lbl28: // 1 sources:
            this.o.notify();
            throw var1_4;
        }
    }
}

