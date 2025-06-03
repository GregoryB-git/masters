// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.util.Log;
import x.b;
import android.os.Handler;
import android.database.ContentObserver;
import android.content.Context;

public final class J2 implements E2
{
    public static J2 c;
    public final Context a;
    public final ContentObserver b;
    
    public J2() {
        this.a = null;
        this.b = null;
    }
    
    public J2(final Context a) {
        this.a = a;
        final L2 b = new L2(this, null);
        this.b = b;
        a.getContentResolver().registerContentObserver(t2.a, true, (ContentObserver)b);
    }
    
    public static J2 a(final Context context) {
        // monitorenter(J2.class)
        while (true) {
            try {
                if (J2.c == null) {
                    J2 c;
                    if (b.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        c = new J2(context);
                    }
                    else {
                        c = new J2();
                    }
                    J2.c = c;
                }
                // monitorexit(J2.class)
                return J2.c;
                // monitorexit(J2.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void b() {
        // monitorenter(J2.class)
        while (true) {
            try {
                final J2 c = J2.c;
                if (c != null) {
                    final Context a = c.a;
                    if (a != null && c.b != null) {
                        a.getContentResolver().unregisterContentObserver(J2.c.b);
                    }
                }
                J2.c = null;
                // monitorexit(J2.class)
                return;
                // monitorexit(J2.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final String d(final String str) {
        Object a = this.a;
        if (a != null) {
            if (z2.b((Context)a)) {
                return null;
            }
            try {
                a = H2.a(new I2(this, str));
                return (String)a;
            }
            catch (NullPointerException a) {}
            catch (SecurityException a) {}
            catch (IllegalStateException ex) {}
            final StringBuilder sb = new StringBuilder("Unable to read GServices for: ");
            sb.append(str);
            Log.e("GservicesLoader", sb.toString(), (Throwable)a);
        }
        return null;
    }
}
