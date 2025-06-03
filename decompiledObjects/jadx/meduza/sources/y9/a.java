package y9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import c9.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17449a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f17450b;

    /* renamed from: c, reason: collision with root package name */
    public final c f17451c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17452d;

    public a(Context context, String str, c cVar) {
        context = Build.VERSION.SDK_INT >= 24 ? v.a.createDeviceProtectedStorageContext(context) : context;
        this.f17449a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f17450b = sharedPreferences;
        this.f17451c = cVar;
        this.f17452d = sharedPreferences.contains("firebase_data_collection_default_enabled") ? sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true) : a();
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f17449a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f17449a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
