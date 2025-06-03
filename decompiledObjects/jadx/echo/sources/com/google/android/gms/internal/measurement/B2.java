package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.C1958a;

/* loaded from: classes.dex */
public final class B2 implements E2 {

    /* renamed from: h, reason: collision with root package name */
    public static final Map f10305h = new C1958a();

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f10306i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f10307a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f10308b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f10309c;

    /* renamed from: d, reason: collision with root package name */
    public final ContentObserver f10310d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10311e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Map f10312f;

    /* renamed from: g, reason: collision with root package name */
    public final List f10313g;

    public B2(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        D2 d22 = new D2(this, null);
        this.f10310d = d22;
        this.f10311e = new Object();
        this.f10313g = new ArrayList();
        W2.m.j(contentResolver);
        W2.m.j(uri);
        this.f10307a = contentResolver;
        this.f10308b = uri;
        this.f10309c = runnable;
        contentResolver.registerContentObserver(uri, false, d22);
    }

    public static B2 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        B2 b22;
        synchronized (B2.class) {
            Map map = f10305h;
            b22 = (B2) map.get(uri);
            if (b22 == null) {
                try {
                    B2 b23 = new B2(contentResolver, uri, runnable);
                    try {
                        map.put(uri, b23);
                    } catch (SecurityException unused) {
                    }
                    b22 = b23;
                } catch (SecurityException unused2) {
                }
            }
        }
        return b22;
    }

    public static synchronized void d() {
        synchronized (B2.class) {
            try {
                for (B2 b22 : f10305h.values()) {
                    b22.f10307a.unregisterContentObserver(b22.f10310d);
                }
                f10305h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map b() {
        Map map = this.f10312f;
        if (map == null) {
            synchronized (this.f10311e) {
                try {
                    map = this.f10312f;
                    if (map == null) {
                        map = f();
                        this.f10312f = map;
                    }
                } finally {
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final /* synthetic */ Map c() {
        Cursor query = this.f10307a.query(this.f10308b, f10306i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map c1958a = count <= 256 ? new C1958a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                c1958a.put(query.getString(0), query.getString(1));
            }
            return c1958a;
        } finally {
            query.close();
        }
    }

    public final void e() {
        synchronized (this.f10311e) {
            this.f10312f = null;
            this.f10309c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f10313g.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.a.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) H2.a(new G2() { // from class: com.google.android.gms.internal.measurement.A2
                    @Override // com.google.android.gms.internal.measurement.G2
                    public final Object a() {
                        return B2.this.c();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Override // com.google.android.gms.internal.measurement.E2
    public final /* synthetic */ Object i(String str) {
        return (String) b().get(str);
    }
}
