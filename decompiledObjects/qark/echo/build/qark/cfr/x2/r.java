/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package x2;

import K2.i;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import x2.j;

public final class r
extends i {
    public final Context a;
    public final /* synthetic */ j b;

    public r(j j8, Context context) {
        this.b = j8;
        j8 = Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper();
        super((Looper)j8);
        this.a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int n8 = message.what;
        if (n8 != 1) {
            message = new StringBuilder();
            message.append("Don't know how to handle this message: ");
            message.append(n8);
            Log.w((String)"GoogleApiAvailability", (String)message.toString());
            return;
        }
        n8 = this.b.g(this.a);
        if (this.b.j(n8)) {
            this.b.o(this.a, n8);
        }
    }
}

