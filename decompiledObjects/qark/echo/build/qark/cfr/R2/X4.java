/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collections
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
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class X4
implements Runnable {
    public final /* synthetic */ AtomicReference o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ W5 s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ D4 u;

    public X4(D4 d42, AtomicReference atomicReference, String string2, String string3, String string4, W5 w52, boolean bl) {
        this.u = d42;
        this.o = atomicReference;
        this.p = string2;
        this.q = string3;
        this.r = string4;
        this.s = w52;
        this.t = bl;
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
        block12 : {
            var3_1 = this.o;
            // MONITORENTER : var3_1
            var1_2 = D4.B(this.u);
            if (var1_2 != null) break block12;
            this.u.j().G().d("(legacy) Failed to get user properties; not connected to service", Y1.v(this.p), this.q, this.r);
            this.o.set((Object)Collections.emptyList());
            this.o.notify();
            // MONITOREXIT : var3_1
            return;
        }
        if (TextUtils.isEmpty((CharSequence)this.p)) {
            n.i(this.s);
            var2_6 = this.o;
            var1_2 = var1_2.x0(this.q, this.r, this.t, this.s);
        } else {
            var2_6 = this.o;
            var1_2 = var1_2.W(this.p, this.q, this.r, this.t);
        }
        var2_6.set((Object)var1_2);
        D4.m0(this.u);
        var1_2 = this.o;
        ** GOTO lbl34
        catch (Throwable var1_4) {
            ** GOTO lbl36
        }
        catch (RemoteException var1_5) {}
        {
            this.u.j().G().d("(legacy) Failed to get user properties; remote exception", Y1.v(this.p), this.q, (Object)var1_5);
            this.o.set((Object)Collections.emptyList());
        }
        {
            var1_2 = this.o;
lbl34: // 2 sources:
            var1_2.notify();
            return;
lbl36: // 1 sources:
            this.o.notify();
            throw var1_4;
        }
    }
}

