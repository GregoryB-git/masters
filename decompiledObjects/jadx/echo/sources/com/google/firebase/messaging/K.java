package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import s3.C1947e;

/* loaded from: classes.dex */
public class K {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11648a;

    /* renamed from: b, reason: collision with root package name */
    public String f11649b;

    /* renamed from: c, reason: collision with root package name */
    public String f11650c;

    /* renamed from: d, reason: collision with root package name */
    public int f11651d;

    /* renamed from: e, reason: collision with root package name */
    public int f11652e = 0;

    public K(Context context) {
        this.f11648a = context;
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
            if (this.f11649b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11649b;
    }

    public synchronized String b() {
        try {
            if (this.f11650c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11650c;
    }

    public synchronized int d() {
        PackageInfo f7;
        try {
            if (this.f11651d == 0 && (f7 = f("com.google.android.gms")) != null) {
                this.f11651d = f7.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11651d;
    }

    public synchronized int e() {
        int i7 = this.f11652e;
        if (i7 != 0) {
            return i7;
        }
        PackageManager packageManager = this.f11648a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!E2.l.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f11652e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f11652e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (E2.l.h()) {
            this.f11652e = 2;
        } else {
            this.f11652e = 1;
        }
        return this.f11652e;
    }

    public final PackageInfo f(String str) {
        try {
            return this.f11648a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("FirebaseMessaging", "Failed to find package " + e7);
            return null;
        }
    }

    public boolean g() {
        return e() != 0;
    }

    public final synchronized void h() {
        PackageInfo f7 = f(this.f11648a.getPackageName());
        if (f7 != null) {
            this.f11649b = Integer.toString(f7.versionCode);
            this.f11650c = f7.versionName;
        }
    }
}
