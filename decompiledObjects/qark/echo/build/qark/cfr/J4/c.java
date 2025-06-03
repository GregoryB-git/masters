/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 */
package J4;

import J4.a;
import android.content.Context;
import com.google.firebase.perf.session.SessionManager;

public final class c
implements Runnable {
    public final /* synthetic */ SessionManager o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ a q;

    public /* synthetic */ c(SessionManager sessionManager, Context context, a a8) {
        this.o = sessionManager;
        this.p = context;
        this.q = a8;
    }

    public final void run() {
        SessionManager.a(this.o, this.p, this.q);
    }
}

