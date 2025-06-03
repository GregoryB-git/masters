/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  java.lang.Object
 */
package g0;

import android.os.Handler;
import android.os.Message;
import g0.n;

public final class l
implements Handler.Callback {
    public final /* synthetic */ n o;

    public /* synthetic */ l(n n8) {
        this.o = n8;
    }

    public final boolean handleMessage(Message message) {
        return n.b(this.o, message);
    }
}

