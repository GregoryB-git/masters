/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package w2;

import V2.k;
import android.util.Log;
import java.io.IOException;

public final class C
implements Runnable {
    public final /* synthetic */ k o;

    public /* synthetic */ C(k k8) {
        this.o = k8;
    }

    public final void run() {
        if (this.o.d((Exception)new IOException("TIMEOUT"))) {
            Log.w((String)"Rpc", (String)"No response");
        }
    }
}

