/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.util.Log
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package w2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import w2.q;
import w2.t;
import w2.u;

public final class j
implements Handler.Callback {
    public final /* synthetic */ q o;

    public /* synthetic */ j(q q8) {
        this.o = q8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean handleMessage(Message message) {
        Object object;
        q q8 = this.o;
        int n8 = message.arg1;
        if (Log.isLoggable((String)"MessengerIpcClient", (int)3)) {
            object = new StringBuilder(41);
            object.append("Received response to request: ");
            object.append(n8);
            Log.d((String)"MessengerIpcClient", (String)object.toString());
        }
        // MONITORENTER : q8
        object = (t)q8.e.get(n8);
        if (object == null) {
            message = new StringBuilder(50);
            message.append("Received response for unknown request: ");
            message.append(n8);
            Log.w((String)"MessengerIpcClient", (String)message.toString());
            // MONITOREXIT : q8
            return true;
        }
        q8.e.remove(n8);
        q8.f();
        // MONITOREXIT : q8
        message = message.getData();
        if (message.getBoolean("unsupported", false)) {
            object.c(new u(4, "Not supported by GmsCore", null));
            return true;
        }
        object.a((Bundle)message);
        return true;
    }
}

