/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.Runnable
 */
package w2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import w2.b;

public final class i
implements Runnable {
    public final /* synthetic */ b o;
    public final /* synthetic */ Intent p;
    public final /* synthetic */ Context q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ BroadcastReceiver.PendingResult s;

    public /* synthetic */ i(b b8, Intent intent, Context context, boolean bl, BroadcastReceiver.PendingResult pendingResult) {
        this.o = b8;
        this.p = intent;
        this.q = context;
        this.r = bl;
        this.s = pendingResult;
    }

    public final void run() {
        this.o.d(this.p, this.q, this.r, this.s);
    }
}

