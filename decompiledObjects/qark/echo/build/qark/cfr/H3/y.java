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
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 */
package H3;

import E3.f;
import H3.c0;
import H3.i;
import V2.j;
import V2.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executor;
import s3.e;

public class y {
    public final SharedPreferences a;
    public final e b;
    public final Object c;
    public k d;
    public boolean e;
    public boolean f;
    public Boolean g;
    public final k h;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public y(e e8) {
        Object object;
        this.c = object = new Object();
        this.d = new k();
        this.e = false;
        this.f = false;
        this.h = new k();
        Context context = e8.m();
        this.b = e8;
        this.a = i.r(context);
        Boolean bl = this.b();
        e8 = bl;
        if (bl == null) {
            e8 = this.a(context);
        }
        this.g = e8;
        synchronized (object) {
            try {
                if (this.d()) {
                    this.d.e(null);
                    this.e = true;
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Boolean g(Context context) {
        boolean bl;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) return null;
        context = packageManager.getApplicationInfo(context.getPackageName(), 128);
        if (context == null) return null;
        packageManager = context.metaData;
        if (packageManager == null) return null;
        try {
            if (!packageManager.containsKey("firebase_crashlytics_collection_enabled")) return null;
            bl = context.metaData.getBoolean("firebase_crashlytics_collection_enabled");
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            f.f().e("Could not read data collection permission from manifest", (Throwable)nameNotFoundException);
        }
        return bl;
        return null;
    }

    public static void i(SharedPreferences sharedPreferences, Boolean bl) {
        sharedPreferences = sharedPreferences.edit();
        if (bl != null) {
            sharedPreferences.putBoolean("firebase_crashlytics_collection_enabled", bl.booleanValue());
        } else {
            sharedPreferences.remove("firebase_crashlytics_collection_enabled");
        }
        sharedPreferences.apply();
    }

    public final Boolean a(Context context) {
        if ((context = y.g(context)) == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.TRUE.equals((Object)context);
    }

    public final Boolean b() {
        if (this.a.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            return this.a.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        return null;
    }

    public void c(boolean bl) {
        if (bl) {
            this.h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean d() {
        synchronized (this) {
            try {
                Boolean bl = this.g;
                boolean bl2 = bl != null ? bl.booleanValue() : this.e();
                this.f(bl2);
                return bl2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean e() {
        try {
            return this.b.x();
        }
        catch (IllegalStateException illegalStateException) {
            return false;
        }
    }

    public final void f(boolean bl) {
        String string2 = bl ? "ENABLED" : "DISABLED";
        String string3 = this.g == null ? "global Firebase setting" : (this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API");
        f.f().b(String.format((String)"Crashlytics automatic data collection %s by %s.", (Object[])new Object[]{string2, string3}));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void h(Boolean var1_1) {
        // MONITORENTER : this
        if (var1_1 == null) ** GOTO lbl5
        this.f = false;
lbl5: // 2 sources:
        var2_3 = var1_1 != null ? var1_1 : this.a(this.b.m());
        this.g = var2_3;
        y.i(this.a, (Boolean)var1_1);
        var1_1 = this.c;
        // MONITORENTER : var1_1
        try {
            if (this.d()) {
                if (this.e) return;
                {
                    this.d.e(null);
                    this.e = true;
                    return;
                }
            } else if (this.e) {
                this.d = new k();
                this.e = false;
            }
            // MONITOREXIT : var1_1
            // MONITOREXIT : this
            return;
        }
        catch (Throwable var2_4) {}
        throw var2_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j j() {
        Object object = this.c;
        synchronized (object) {
            return this.d.a();
        }
    }

    public j k(Executor executor) {
        return c0.o(executor, this.h.a(), this.j());
    }
}

