package w2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20372a;

    /* renamed from: b, reason: collision with root package name */
    public int f20373b;

    /* renamed from: c, reason: collision with root package name */
    public int f20374c = 0;

    public x(Context context) {
        this.f20372a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f20373b == 0) {
            try {
                packageInfo = G2.d.a(this.f20372a).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e7) {
                String valueOf = String.valueOf(e7);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                Log.w("Metadata", sb.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f20373b = packageInfo.versionCode;
            }
        }
        return this.f20373b;
    }

    public final synchronized int b() {
        int i7 = this.f20374c;
        if (i7 != 0) {
            return i7;
        }
        PackageManager packageManager = this.f20372a.getPackageManager();
        if (G2.d.a(this.f20372a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i8 = 1;
        if (!E2.l.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f20374c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f20374c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (E2.l.h()) {
            this.f20374c = 2;
            i8 = 2;
        } else {
            this.f20374c = 1;
        }
        return i8;
    }
}
