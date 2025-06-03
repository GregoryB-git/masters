/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.Throwable
 */
package A2;

import A2.L;
import A2.a0;
import A2.c;
import A2.n;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class W
extends L {
    public c b;
    public final int c;

    public W(c c8, int n8) {
        this.b = c8;
        this.c = n8;
    }

    @Override
    public final void F0(int n8, IBinder iBinder, a0 a02) {
        c c8 = this.b;
        n.j(c8, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        n.i(a02);
        c.c0(c8, a02);
        this.W0(n8, iBinder, a02.o);
    }

    @Override
    public final void W0(int n8, IBinder iBinder, Bundle bundle) {
        n.j(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
        this.b.N(n8, iBinder, bundle, this.c);
        this.b = null;
    }

    @Override
    public final void q0(int n8, Bundle bundle) {
        Log.wtf((String)"GmsClient", (String)"received deprecated onAccountValidationComplete callback, ignoring", (Throwable)new Exception());
    }
}

