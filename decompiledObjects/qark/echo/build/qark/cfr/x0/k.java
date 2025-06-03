/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  java.lang.Object
 */
package x0;

import android.os.Handler;
import android.os.Message;
import x0.l;

public final class k
implements Handler.Callback {
    public final /* synthetic */ l o;

    public /* synthetic */ k(l l8) {
        this.o = l8;
    }

    public final boolean handleMessage(Message message) {
        return l.M(this.o, message);
    }
}

