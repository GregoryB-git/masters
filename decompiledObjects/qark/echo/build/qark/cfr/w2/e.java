/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.Message
 */
package w2;

import L2.f;
import android.os.Looper;
import android.os.Message;
import w2.c;

public final class e
extends f {
    public final /* synthetic */ c a;

    public e(c c8, Looper looper) {
        this.a = c8;
        super(looper);
    }

    public final void handleMessage(Message message) {
        c.d(this.a, message);
    }
}

