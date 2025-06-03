package aa;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f357a;

    /* renamed from: b, reason: collision with root package name */
    public String f358b;

    /* renamed from: c, reason: collision with root package name */
    public String f359c;

    /* renamed from: d, reason: collision with root package name */
    public int f360d;

    /* renamed from: e, reason: collision with root package name */
    public int f361e = 0;

    public r(Context context) {
        this.f357a = context;
    }

    public static String a(u7.f fVar) {
        fVar.a();
        String str = fVar.f15086c.f15100e;
        if (str != null) {
            return str;
        }
        fVar.a();
        String str2 = fVar.f15086c.f15097b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final PackageInfo b(String str) {
        try {
            return this.f357a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public final boolean c() {
        int i10;
        synchronized (this) {
            int i11 = this.f361e;
            if (i11 == 0) {
                PackageManager packageManager = this.f357a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    if (!v6.e.a()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f361e = 1;
                            i10 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    i10 = 2;
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (v6.e.a()) {
                            this.f361e = 2;
                        } else {
                            this.f361e = 1;
                        }
                        i11 = this.f361e;
                    } else {
                        this.f361e = 2;
                    }
                }
            }
            i10 = i11;
        }
        return i10 != 0;
    }

    public final synchronized void d() {
        PackageInfo b10 = b(this.f357a.getPackageName());
        if (b10 != null) {
            this.f358b = Integer.toString(b10.versionCode);
            this.f359c = b10.versionName;
        }
    }
}
