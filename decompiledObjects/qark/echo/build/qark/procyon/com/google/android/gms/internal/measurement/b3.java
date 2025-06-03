// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.content.Context;
import java.util.ArrayList;
import t.a;
import java.util.List;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import java.util.Map;

public final class b3 implements E2
{
    public static final Map g;
    public final SharedPreferences a;
    public final Runnable b;
    public final SharedPreferences$OnSharedPreferenceChangeListener c;
    public final Object d;
    public volatile Map e;
    public final List f;
    
    static {
        g = new a();
    }
    
    public b3(final SharedPreferences a, final Runnable b) {
        final e3 c = new e3(this);
        this.c = (SharedPreferences$OnSharedPreferenceChangeListener)c;
        this.d = new Object();
        this.f = new ArrayList();
        this.a = a;
        this.b = b;
        a.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)c);
    }
    
    public static SharedPreferences a(final Context context, final String s) {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        while (true) {
            try {
                if (s.startsWith("direct_boot:")) {
                    Context a = context;
                    if (z2.a()) {
                        a = N2.a(context);
                    }
                    final SharedPreferences sharedPreferences = a.getSharedPreferences(s.substring(12), 0);
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    return sharedPreferences;
                }
                final SharedPreferences sharedPreferences2 = context.getSharedPreferences(s, 0);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return sharedPreferences2;
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static b3 b(final Context context, final String s, final Runnable runnable) {
        if (z2.a() && !s.startsWith("direct_boot:") && !z2.c(context)) {
            return null;
        }
        // monitorenter(b3.class)
        while (true) {
            try {
                final Map g = b3.g;
                b3 b3;
                if ((b3 = g.get(s)) == null) {
                    b3 = new b3(a(context, s), runnable);
                    g.put(s, b3);
                }
                // monitorexit(b3.class)
                return b3;
                // monitorexit(b3.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void c() {
        // monitorenter(b3.class)
        while (true) {
            try {
                for (final b3 b3 : b3.g.values()) {
                    b3.a.unregisterOnSharedPreferenceChangeListener(b3.c);
                }
                b3.g.clear();
                // monitorexit(b3.class)
                return;
                // monitorexit(b3.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final Object i(final String s) {
        while (true) {
            Map e;
            if ((e = this.e) == null) {
                final Object d = this.d;
                // monitorenter(d)
                while (true) {
                    try {
                        if ((e = this.e) == null) {
                            final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                e = this.a.getAll();
                                this.e = e;
                            }
                            finally {
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            }
                        }
                        // monitorexit(d)
                        if (e != null) {
                            return e.get(s);
                        }
                        return null;
                    }
                    // monitorexit(d)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
}
