package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.C1958a;

/* renamed from: com.google.android.gms.internal.measurement.b3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0868b3 implements E2 {

    /* renamed from: g, reason: collision with root package name */
    public static final Map f10837g = new C1958a();

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f10838a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f10839b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences.OnSharedPreferenceChangeListener f10840c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10841d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Map f10842e;

    /* renamed from: f, reason: collision with root package name */
    public final List f10843f;

    public C0868b3(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.e3
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                C0868b3.this.d(sharedPreferences2, str);
            }
        };
        this.f10840c = onSharedPreferenceChangeListener;
        this.f10841d = new Object();
        this.f10843f = new ArrayList();
        this.f10838a = sharedPreferences;
        this.f10839b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return sharedPreferences;
            }
            if (AbstractC1081z2.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(str.substring(12), 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static C0868b3 b(Context context, String str, Runnable runnable) {
        C0868b3 c0868b3;
        if (AbstractC1081z2.a() && !str.startsWith("direct_boot:") && !AbstractC1081z2.c(context)) {
            return null;
        }
        synchronized (C0868b3.class) {
            try {
                Map map = f10837g;
                c0868b3 = (C0868b3) map.get(str);
                if (c0868b3 == null) {
                    c0868b3 = new C0868b3(a(context, str), runnable);
                    map.put(str, c0868b3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0868b3;
    }

    public static synchronized void c() {
        synchronized (C0868b3.class) {
            try {
                for (C0868b3 c0868b3 : f10837g.values()) {
                    c0868b3.f10838a.unregisterOnSharedPreferenceChangeListener(c0868b3.f10840c);
                }
                f10837g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f10841d) {
            this.f10842e = null;
            this.f10839b.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f10843f.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.a.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.E2
    public final Object i(String str) {
        Map<String, ?> map = this.f10842e;
        if (map == null) {
            synchronized (this.f10841d) {
                try {
                    map = this.f10842e;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f10838a.getAll();
                            this.f10842e = all;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
