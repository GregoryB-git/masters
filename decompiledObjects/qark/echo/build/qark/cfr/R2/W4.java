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
 */
package R2;

import A2.n;
import B2.a;
import R2.D4;
import R2.R1;
import R2.W5;
import R2.Y1;
import R2.a2;
import R2.e;
import android.os.RemoteException;
import android.text.TextUtils;

public final class W4
implements Runnable {
    public final /* synthetic */ boolean o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ e r;
    public final /* synthetic */ e s;
    public final /* synthetic */ D4 t;

    public W4(D4 d42, boolean bl, W5 w52, boolean bl2, e e8, e e9) {
        this.t = d42;
        this.o = true;
        this.p = w52;
        this.q = bl2;
        this.r = e8;
        this.s = e9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block7 : {
            R1 r12 = D4.B(this.t);
            if (r12 == null) {
                this.t.j().G().a("Discarding data. Failed to send conditional user property to service");
                return;
            }
            if (this.o) {
                n.i(this.p);
                D4 d42 = this.t;
                e e8 = this.q ? null : this.r;
                d42.F(r12, e8, this.p);
            } else {
                try {
                    if (TextUtils.isEmpty((CharSequence)this.s.o)) {
                        n.i(this.p);
                        r12.m0(this.r, this.p);
                    } else {
                        r12.n0(this.r);
                    }
                    break block7;
                }
                catch (RemoteException remoteException) {}
                this.t.j().G().b("Failed to send conditional user property to the service", (Object)remoteException);
            }
        }
        D4.m0(this.t);
    }
}

