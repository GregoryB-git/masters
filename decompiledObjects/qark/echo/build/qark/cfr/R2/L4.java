/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReference
 */
package R2;

import A2.n;
import R2.C3;
import R2.D4;
import R2.W5;
import R2.Y1;
import R2.a2;
import R2.l2;
import R2.q3;
import R2.r2;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

public final class L4
implements Runnable {
    public final /* synthetic */ AtomicReference o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ D4 q;

    public L4(D4 d42, AtomicReference atomicReference, W5 w52) {
        this.q = d42;
        this.o = atomicReference;
        this.p = w52;
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
        block14 : {
            block13 : {
                var2_1 = this.o;
                // MONITORENTER : var2_1
                if (this.q.i().J().y()) break block13;
                this.q.j().M().a("Analytics storage consent denied; will not get app instance id");
                this.q.r().T(null);
                this.q.i().g.b(null);
                this.o.set((Object)null);
                this.o.notify();
                // MONITOREXIT : var2_1
                return;
            }
            var1_5 = D4.B(this.q);
            if (var1_5 != null) break block14;
            this.q.j().G().a("Failed to get app instance id");
            this.o.notify();
            // MONITOREXIT : var2_1
            return;
        }
        n.i(this.p);
        this.o.set((Object)var1_5.G(this.p));
        var1_5 = (String)this.o.get();
        if (var1_5 != null) {
            this.q.r().T((String)var1_5);
            this.q.i().g.b((String)var1_5);
        }
        D4.m0(this.q);
        var1_5 = this.o;
        ** GOTO lbl41
        catch (Throwable var1_3) {
            ** GOTO lbl43
        }
        catch (RemoteException var1_4) {}
        {
            this.q.j().G().b("Failed to get app instance id", (Object)var1_4);
        }
        {
            var1_5 = this.o;
lbl41: // 2 sources:
            var1_5.notify();
            return;
lbl43: // 1 sources:
            this.o.notify();
            throw var1_3;
        }
    }
}

