/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 */
package com.google.firebase.messaging;

import E2.l;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.List;
import s3.e;
import s3.m;

public class K {
    public final Context a;
    public String b;
    public String c;
    public int d;
    public int e = 0;

    public K(Context context) {
        this.a = context;
    }

    public static String c(e object) {
        String string2 = object.r().f();
        if (string2 != null) {
            return string2;
        }
        if (!(object = object.r().c()).startsWith("1:")) {
            return object;
        }
        if ((object = object.split(":")).length < 2) {
            return null;
        }
        if ((object = object[1]).isEmpty()) {
            return null;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String a() {
        synchronized (this) {
            try {
                if (this.b != null) return this.b;
                this.h();
                return this.b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String b() {
        synchronized (this) {
            try {
                if (this.c != null) return this.c;
                this.h();
                return this.c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int d() {
        synchronized (this) {
            try {
                if (this.d != 0) return this.d;
                PackageInfo packageInfo = this.f("com.google.android.gms");
                if (packageInfo == null) return this.d;
                this.d = packageInfo.versionCode;
                return this.d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int e() {
        synchronized (this) {
            Throwable throwable2;
            block10 : {
                PackageManager packageManager;
                Intent intent;
                block9 : {
                    block8 : {
                        int n8;
                        try {
                            n8 = this.e;
                            if (n8 == 0) break block8;
                        }
                        catch (Throwable throwable2) {}
                        return n8;
                    }
                    packageManager = this.a.getPackageManager();
                    if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                        Log.e((String)"FirebaseMessaging", (String)"Google Play services missing or without correct permission.");
                        return 0;
                    }
                    break block9;
                    break block10;
                }
                if (!l.h()) {
                    intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    intent = packageManager.queryIntentServices(intent, 0);
                    if (intent != null && intent.size() > 0) {
                        this.e = 1;
                        return 1;
                    }
                }
                intent = new Intent("com.google.iid.TOKEN_REQUEST");
                intent.setPackage("com.google.android.gms");
                packageManager = packageManager.queryBroadcastReceivers(intent, 0);
                if (packageManager != null && packageManager.size() > 0) {
                    this.e = 2;
                    return 2;
                }
                Log.w((String)"FirebaseMessaging", (String)"Failed to resolve IID implementation package, falling back");
                this.e = l.h() ? 2 : 1;
                return this.e;
            }
            throw throwable2;
        }
    }

    public final PackageInfo f(String string2) {
        try {
            string2 = this.a.getPackageManager().getPackageInfo(string2, 0);
            return string2;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to find package ");
            stringBuilder.append((Object)nameNotFoundException);
            Log.w((String)"FirebaseMessaging", (String)stringBuilder.toString());
            return null;
        }
    }

    public boolean g() {
        if (this.e() != 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        synchronized (this) {
            Throwable throwable2;
            block5 : {
                block4 : {
                    try {
                        PackageInfo packageInfo = this.f(this.a.getPackageName());
                        if (packageInfo == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.b = Integer.toString((int)packageInfo.versionCode);
                    this.c = packageInfo.versionName;
                }
                return;
            }
            throw throwable2;
        }
    }
}

