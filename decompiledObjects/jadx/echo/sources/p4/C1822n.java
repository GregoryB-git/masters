package p4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import s3.C1947e;

/* renamed from: p4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1822n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18455a;

    /* renamed from: b, reason: collision with root package name */
    public String f18456b;

    /* renamed from: c, reason: collision with root package name */
    public String f18457c;

    /* renamed from: d, reason: collision with root package name */
    public int f18458d;

    /* renamed from: e, reason: collision with root package name */
    public int f18459e = 0;

    public C1822n(Context context) {
        this.f18455a = context;
    }

    public static String c(C1947e c1947e) {
        String f7 = c1947e.r().f();
        if (f7 != null) {
            return f7;
        }
        String c7 = c1947e.r().c();
        if (!c7.startsWith("1:")) {
            return c7;
        }
        String[] split = c7.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public synchronized String a() {
        try {
            if (this.f18456b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18456b;
    }

    public synchronized String b() {
        try {
            if (this.f18457c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18457c;
    }

    public synchronized int d() {
        PackageInfo f7;
        try {
            if (this.f18458d == 0 && (f7 = f("com.google.android.gms")) != null) {
                this.f18458d = f7.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18458d;
    }

    public synchronized int e() {
        int i7 = this.f18459e;
        if (i7 != 0) {
            return i7;
        }
        PackageManager packageManager = this.f18455a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i8 = 1;
        if (!E2.l.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f18459e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f18459e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (E2.l.h()) {
            this.f18459e = 2;
            i8 = 2;
        } else {
            this.f18459e = 1;
        }
        return i8;
    }

    public final PackageInfo f(String str) {
        try {
            return this.f18455a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e7) {
            String valueOf = String.valueOf(e7);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public boolean g() {
        return e() != 0;
    }

    public final synchronized void h() {
        PackageInfo f7 = f(this.f18455a.getPackageName());
        if (f7 != null) {
            this.f18456b = Integer.toString(f7.versionCode);
            this.f18457c = f7.versionName;
        }
    }
}
