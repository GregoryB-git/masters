/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.net.Uri
 *  android.os.Handler
 *  android.util.Log
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.internal.measurement.E2;
import com.google.android.gms.internal.measurement.H2;
import com.google.android.gms.internal.measurement.I2;
import com.google.android.gms.internal.measurement.L2;
import com.google.android.gms.internal.measurement.t2;
import com.google.android.gms.internal.measurement.z2;
import x.b;

public final class J2
implements E2 {
    public static J2 c;
    public final Context a;
    public final ContentObserver b;

    public J2() {
        this.a = null;
        this.b = null;
    }

    public J2(Context context) {
        this.a = context;
        L2 l22 = new L2(this, null);
        this.b = l22;
        context.getContentResolver().registerContentObserver(t2.a, true, (ContentObserver)l22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static J2 a(Context object) {
        synchronized (J2.class) {
            try {
                if (c != null) return c;
                object = b.b((Context)object, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new J2((Context)object) : new J2();
                c = object;
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b() {
        synchronized (J2.class) {
            try {
                Context context;
                J2 j22 = c;
                if (j22 != null && (context = j22.a) != null && j22.b != null) {
                    context.getContentResolver().unregisterContentObserver(J2.c.b);
                }
                c = null;
            }
            catch (Throwable throwable) {}
            return;
            throw throwable;
        }
    }

    public final /* synthetic */ String c(String string2) {
        return t2.a(this.a.getContentResolver(), string2, null);
    }

    public final String d(String string2) {
        Object object = this.a;
        if (object != null) {
            void var2_6;
            if (z2.b((Context)object)) {
                return null;
            }
            try {
                object = (String)H2.a(new I2(this, string2));
                return object;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (SecurityException securityException) {
            }
            catch (IllegalStateException illegalStateException) {
                // empty catch block
            }
            StringBuilder stringBuilder = new StringBuilder("Unable to read GServices for: ");
            stringBuilder.append(string2);
            Log.e((String)"GservicesLoader", (String)stringBuilder.toString(), (Throwable)var2_6);
        }
        return null;
    }

    @Override
    public final /* synthetic */ Object i(String string2) {
        return this.d(string2);
    }
}

