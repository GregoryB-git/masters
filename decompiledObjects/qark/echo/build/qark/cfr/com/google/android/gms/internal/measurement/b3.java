/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.google.android.gms.internal.measurement.E2;
import com.google.android.gms.internal.measurement.N2;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.z2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.a;

public final class b3
implements E2 {
    public static final Map g = new a();
    public final SharedPreferences a;
    public final Runnable b;
    public final SharedPreferences.OnSharedPreferenceChangeListener c;
    public final Object d;
    public volatile Map e;
    public final List f;

    public b3(SharedPreferences sharedPreferences, Runnable runnable) {
        e3 e32 = new e3(this);
        this.c = e32;
        this.d = new Object();
        this.f = new ArrayList();
        this.a = sharedPreferences;
        this.b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)e32);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static SharedPreferences a(Context context, String string2) {
        Throwable throwable2;
        StrictMode.ThreadPolicy threadPolicy;
        block4 : {
            threadPolicy = StrictMode.allowThreadDiskReads();
            try {
                if (!string2.startsWith("direct_boot:")) break block4;
                Context context2 = context;
                if (z2.a()) {
                    context2 = N2.a(context);
                }
                context = context2.getSharedPreferences(string2.substring(12), 0);
            }
            catch (Throwable throwable2) {}
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return context;
        }
        context = context.getSharedPreferences(string2, 0);
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        return context;
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b3 b(Context context, String string2, Runnable runnable) {
        if (z2.a() && !string2.startsWith("direct_boot:") && !z2.c(context)) {
            return null;
        }
        synchronized (b3.class) {
            try {
                b3 b32;
                Map map = g;
                b3 b33 = b32 = (b3)map.get((Object)string2);
                if (b32 == null) {
                    b33 = new b3(b3.a(context, string2), runnable);
                    map.put((Object)string2, (Object)b33);
                }
                return b33;
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
    public static void c() {
        synchronized (b3.class) {
            try {
                for (b3 b32 : g.values()) {
                    b32.a.unregisterOnSharedPreferenceChangeListener(b32.c);
                }
                g.clear();
            }
            catch (Throwable throwable) {}
            return;
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void d(SharedPreferences object, String string2) {
        object = this.d;
        synchronized (object) {
            this.e = null;
            this.b.run();
        }
        synchronized (this) {
            try {
                object = this.f.iterator();
                if (!object.hasNext()) {
                    return;
                }
                android.support.v4.media.a.a(object.next());
                throw null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final Object i(String string2) {
        block6 : {
            map = map2 = this.e;
            if (map2 != null) break block6;
            object = this.d;
            // MONITORENTER : object
            map = map2 = this.e;
            if (map2 != null) ** GOTO lbl19
            map2 = StrictMode.allowThreadDiskReads();
            this.e = map = this.a.getAll();
            {
                catch (Throwable throwable) {
                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)map2);
                    throw throwable;
                }
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)map2);
lbl19: // 2 sources:
            // MONITOREXIT : object
        }
        if (map == null) return null;
        return map.get((Object)string2);
    }
}

