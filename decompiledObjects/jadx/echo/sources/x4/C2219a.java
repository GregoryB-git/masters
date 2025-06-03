package x4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import n4.C1728a;
import n4.InterfaceC1730c;
import s3.C1944b;
import x.AbstractC2112a;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2219a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21219a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f21220b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1730c f21221c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21222d;

    public C2219a(Context context, String str, InterfaceC1730c interfaceC1730c) {
        Context a7 = a(context);
        this.f21219a = a7;
        this.f21220b = a7.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f21221c = interfaceC1730c;
        this.f21222d = c();
    }

    public static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : AbstractC2112a.b(context);
    }

    public synchronized boolean b() {
        return this.f21222d;
    }

    public final boolean c() {
        return this.f21220b.contains("firebase_data_collection_default_enabled") ? this.f21220b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f21219a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f21219a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized void e(Boolean bool) {
        boolean equals;
        try {
            if (bool == null) {
                this.f21220b.edit().remove("firebase_data_collection_default_enabled").apply();
                equals = d();
            } else {
                equals = Boolean.TRUE.equals(bool);
                this.f21220b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
            }
            f(equals);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(boolean z7) {
        if (this.f21222d != z7) {
            this.f21222d = z7;
            this.f21221c.a(new C1728a(C1944b.class, new C1944b(z7)));
        }
    }
}
