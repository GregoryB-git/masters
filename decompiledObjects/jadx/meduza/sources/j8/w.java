package j8;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8651a;

    /* renamed from: b, reason: collision with root package name */
    public final u7.f f8652b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8653c;

    /* renamed from: d, reason: collision with root package name */
    public TaskCompletionSource<Void> f8654d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8655e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f8656g;

    /* renamed from: h, reason: collision with root package name */
    public final TaskCompletionSource<Void> f8657h;

    public w(u7.f fVar) {
        Boolean bool;
        Object obj = new Object();
        this.f8653c = obj;
        this.f8654d = new TaskCompletionSource<>();
        this.f8655e = false;
        this.f = false;
        this.f8657h = new TaskCompletionSource<>();
        fVar.a();
        Context context = fVar.f15084a;
        this.f8652b = fVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f8651a = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            bool = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            bool = null;
        }
        this.f8656g = bool == null ? a(context) : bool;
        synchronized (obj) {
            if (b()) {
                this.f8654d.trySetResult(null);
                this.f8655e = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "firebase_crashlytics_collection_enabled"
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 == 0) goto L32
            java.lang.String r5 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r2.getApplicationInfo(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r5 == 0) goto L32
            android.os.Bundle r2 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 == 0) goto L32
            boolean r2 = r2.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 == 0) goto L32
            android.os.Bundle r5 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            boolean r5 = r5.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            goto L33
        L2a:
            r5 = move-exception
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r0, r2, r5)
        L32:
            r5 = r1
        L33:
            if (r5 != 0) goto L39
            r5 = 0
            r4.f = r5
            return r1
        L39:
            r0 = 1
            r4.f = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = r0.equals(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.w.a(android.content.Context):java.lang.Boolean");
    }

    public final synchronized boolean b() {
        boolean z10;
        Boolean bool = this.f8656g;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f8652b.k();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        c(z10);
        return z10;
    }

    public final void c(boolean z10) {
        String format = String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f8656g == null ? "global Firebase setting" : this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", format, null);
        }
    }
}
