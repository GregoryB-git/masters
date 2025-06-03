package H3;

import V2.AbstractC0659j;
import V2.C0660k;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executor;
import s3.C1947e;

/* renamed from: H3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0402y {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f2381a;

    /* renamed from: b, reason: collision with root package name */
    public final C1947e f2382b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2383c;

    /* renamed from: d, reason: collision with root package name */
    public C0660k f2384d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2385e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2386f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f2387g;

    /* renamed from: h, reason: collision with root package name */
    public final C0660k f2388h;

    public C0402y(C1947e c1947e) {
        Object obj = new Object();
        this.f2383c = obj;
        this.f2384d = new C0660k();
        this.f2385e = false;
        this.f2386f = false;
        this.f2388h = new C0660k();
        Context m7 = c1947e.m();
        this.f2382b = c1947e;
        this.f2381a = AbstractC0387i.r(m7);
        Boolean b7 = b();
        this.f2387g = b7 == null ? a(m7) : b7;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f2384d.e(null);
                    this.f2385e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e7) {
            E3.f.f().e("Could not read data collection permission from manifest", e7);
            return null;
        }
    }

    public static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    public final Boolean a(Context context) {
        Boolean g7 = g(context);
        if (g7 == null) {
            this.f2386f = false;
            return null;
        }
        this.f2386f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g7));
    }

    public final Boolean b() {
        if (!this.f2381a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f2386f = false;
        return Boolean.valueOf(this.f2381a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    public void c(boolean z7) {
        if (!z7) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f2388h.e(null);
    }

    public synchronized boolean d() {
        boolean booleanValue;
        try {
            Boolean bool = this.f2387g;
            booleanValue = bool != null ? bool.booleanValue() : e();
            f(booleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return booleanValue;
    }

    public final boolean e() {
        try {
            return this.f2382b.x();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final void f(boolean z7) {
        E3.f.f().b(String.format("Crashlytics automatic data collection %s by %s.", z7 ? "ENABLED" : "DISABLED", this.f2387g == null ? "global Firebase setting" : this.f2386f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f2386f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2387g = bool != null ? bool : a(this.f2382b.m());
        i(this.f2381a, bool);
        synchronized (this.f2383c) {
            try {
                if (d()) {
                    if (!this.f2385e) {
                        this.f2384d.e(null);
                        this.f2385e = true;
                    }
                } else if (this.f2385e) {
                    this.f2384d = new C0660k();
                    this.f2385e = false;
                }
            } finally {
            }
        }
    }

    public AbstractC0659j j() {
        AbstractC0659j a7;
        synchronized (this.f2383c) {
            a7 = this.f2384d.a();
        }
        return a7;
    }

    public AbstractC0659j k(Executor executor) {
        return c0.o(executor, this.f2388h.a(), j());
    }
}
