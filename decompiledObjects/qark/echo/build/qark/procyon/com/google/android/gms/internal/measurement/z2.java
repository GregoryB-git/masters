// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.util.Log;
import android.os.Process;
import android.content.Context;
import android.os.Build$VERSION;
import android.os.UserManager;

public abstract class z2
{
    public static UserManager a;
    public static volatile boolean b;
    public static boolean c;
    
    static {
        z2.b = (a() ^ true);
        z2.c = false;
    }
    
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 24;
    }
    
    public static boolean b(final Context context) {
        return a() && !d(context);
    }
    
    public static boolean c(final Context context) {
        return !a() || d(context);
    }
    
    public static boolean d(final Context context) {
        if (z2.b) {
            return true;
        }
        // monitorenter(z2.class)
        while (true) {
            try {
                if (z2.b) {
                    // monitorexit(z2.class)
                    return true;
                }
                final boolean e = e(context);
                if (e) {
                    z2.b = e;
                }
                // monitorexit(z2.class)
                return e;
                // monitorexit(z2.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static boolean e(final Context context) {
        final boolean b = true;
        int n = 1;
        boolean b2;
        while (true) {
            b2 = false;
            if (n > 2) {
                break;
            }
            if (z2.a == null) {
                z2.a = (UserManager)context.getSystemService((Class)UserManager.class);
            }
            final UserManager a = z2.a;
            if (a == null) {
                return true;
            }
            b2 = b;
            Label_0082: {
                try {
                    if (!y2.a(a)) {
                        b2 = (!a.isUserRunning(Process.myUserHandle()) && b);
                    }
                }
                catch (NullPointerException ex) {
                    break Label_0082;
                }
                break;
            }
            final NullPointerException ex;
            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", (Throwable)ex);
            z2.a = null;
            ++n;
            continue;
            break;
        }
        if (b2) {
            z2.a = null;
        }
        return b2;
    }
}
