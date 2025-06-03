/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package x4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import n4.c;
import s3.b;

public class a {
    public final Context a;
    public final SharedPreferences b;
    public final c c;
    public boolean d;

    public a(Context context, String string2, c c8) {
        this.a = context = a.a(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.google.firebase.common.prefs:");
        stringBuilder.append(string2);
        this.b = context.getSharedPreferences(stringBuilder.toString(), 0);
        this.c = c8;
        this.d = this.c();
    }

    public static Context a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return x.a.b(context);
    }

    public boolean b() {
        synchronized (this) {
            boolean bl = this.d;
            return bl;
        }
    }

    public final boolean c() {
        if (this.b.contains("firebase_data_collection_default_enabled")) {
            return this.b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return this.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean d() {
        PackageManager packageManager;
        try {
            packageManager = this.a.getPackageManager();
            if (packageManager == null) return true;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return true;
        }
        packageManager = packageManager.getApplicationInfo(this.a.getPackageName(), 128);
        if (packageManager == null) return true;
        Bundle bundle = packageManager.metaData;
        if (bundle == null) return true;
        if (!bundle.containsKey("firebase_data_collection_default_enabled")) return true;
        return packageManager.metaData.getBoolean("firebase_data_collection_default_enabled");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void e(Boolean var1_1) {
        block3 : {
            // MONITORENTER : this
            if (var1_1 != null) ** GOTO lbl7
            this.b.edit().remove("firebase_data_collection_default_enabled").apply();
            var2_3 = this.d();
            break block3;
lbl7: // 1 sources:
            var2_3 = Boolean.TRUE.equals((Object)var1_1);
            this.b.edit().putBoolean("firebase_data_collection_default_enabled", var2_3).apply();
        }
        this.f(var2_3);
        return;
    }

    public final void f(boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                block3 : {
                    try {
                        if (this.d == bl) break block3;
                        this.d = bl;
                        this.c.a(new n4.a(b.class, new b(bl)));
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

