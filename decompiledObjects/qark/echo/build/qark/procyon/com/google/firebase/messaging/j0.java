// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.content.ComponentName;
import V2.e;
import android.content.Context;
import V2.j;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import U2.a;

public abstract class j0
{
    public static final long a;
    public static final Object b;
    public static a c;
    
    static {
        a = TimeUnit.MINUTES.toMillis(1L);
        b = new Object();
    }
    
    public static void b(final Context context) {
        if (j0.c == null) {
            (j0.c = new a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder")).d(true);
        }
    }
    
    public static void c(final Intent intent) {
        final Object b = j0.b;
        // monitorenter(b)
        while (true) {
            try {
                if (j0.c != null && d(intent)) {
                    g(intent, false);
                    j0.c.c();
                }
                // monitorexit(b)
                return;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static boolean d(final Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }
    
    public static void f(final Context context, final o0 o0, final Intent intent) {
        final Object b = j0.b;
        // monitorenter(b)
        while (true) {
            try {
                b(context);
                final boolean d = d(intent);
                g(intent, true);
                if (!d) {
                    j0.c.a(j0.a);
                }
                o0.c(intent).b(new i0(intent));
                // monitorexit(b)
                return;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void g(final Intent intent, final boolean b) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", b);
    }
    
    public static ComponentName h(final Context context, final Intent intent) {
        final Object b = j0.b;
        // monitorenter(b)
        while (true) {
            try {
                b(context);
                final boolean d = d(intent);
                g(intent, true);
                final ComponentName startService = context.startService(intent);
                if (startService == null) {
                    // monitorexit(b)
                    return null;
                }
                if (!d) {
                    j0.c.a(j0.a);
                }
                // monitorexit(b)
                return startService;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
