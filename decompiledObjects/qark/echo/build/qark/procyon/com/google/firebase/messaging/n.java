// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import java.util.concurrent.Callable;
import android.util.Base64;
import E2.l;
import V2.b;
import android.util.Log;
import V2.j;
import android.content.Intent;
import r1.m;
import java.util.concurrent.Executor;
import android.content.Context;

public class n
{
    public static final Object c;
    public static o0 d;
    public final Context a;
    public final Executor b;
    
    static {
        c = new Object();
    }
    
    public n(final Context a) {
        this.a = a;
        this.b = new m();
    }
    
    public static j e(final Context context, final Intent intent, final boolean b) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        final o0 f = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (b) {
            if (Y.b().e(context)) {
                j0.f(context, f, intent);
            }
            else {
                f.c(intent);
            }
            return V2.m.e(-1);
        }
        return f.c(intent).g(new m(), new com.google.firebase.messaging.m());
    }
    
    public static o0 f(final Context context, final String s) {
        final Object c = n.c;
        // monitorenter(c)
        while (true) {
            try {
                if (n.d == null) {
                    n.d = new o0(context, s);
                }
                // monitorexit(c)
                return n.d;
                // monitorexit(c)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public j k(final Intent intent) {
        final String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return this.l(this.a, intent);
    }
    
    public j l(final Context context, final Intent intent) {
        final boolean h = l.h();
        boolean b = false;
        final boolean b2 = h && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 0x10000000) != 0x0) {
            b = true;
        }
        if (b2 && !b) {
            return e(context, intent, b);
        }
        return V2.m.c(this.b, new com.google.firebase.messaging.j(context, intent)).h(this.b, new k(context, intent, b));
    }
}
