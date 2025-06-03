package i6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7565a;

    /* renamed from: b, reason: collision with root package name */
    public int f7566b;

    /* renamed from: c, reason: collision with root package name */
    public int f7567c = 0;

    public a0(Context context) {
        this.f7565a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f7566b == 0) {
            try {
                packageInfo = x6.d.a(this.f7565a).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f7566b = packageInfo.versionCode;
            }
        }
        return this.f7566b;
    }

    public final synchronized int b() {
        int i10 = this.f7567c;
        if (i10 != 0) {
            return i10;
        }
        Context context = this.f7565a;
        PackageManager packageManager = context.getPackageManager();
        if (x6.d.a(context).f17198a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!v6.e.a()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                r2 = 1;
                this.f7567c = r2;
                return r2;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            r2 = true != v6.e.a() ? 1 : 2;
            this.f7567c = r2;
            return r2;
        }
        this.f7567c = r2;
        return r2;
    }
}
