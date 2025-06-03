/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.google.android.gms.internal.measurement;

import W2.l;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

public abstract class Q2 {
    public static volatile l a = l.a();
    public static final Object b = new Object();

    public static boolean a(Context context) {
        context = context.getPackageManager();
        try {
            context = context.getApplicationInfo("com.google.android.gms", 0);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
        if ((context.flags & 129) != 0) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(Context context, Uri object) {
        object = object.getAuthority();
        boolean bl = "com.google.android.gms.phenotype".equals(object);
        boolean bl2 = false;
        if (!bl) {
            context = new StringBuilder();
            context.append((String)object);
            context.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e((String)"PhenotypeClientHelper", (String)context.toString());
            return false;
        }
        if (a.c()) {
            return (Boolean)a.b();
        }
        object = b;
        synchronized (object) {
            try {
                block11 : {
                    block10 : {
                        if (a.c()) {
                            return (Boolean)a.b();
                        }
                        if ("com.google.android.gms".equals((Object)context.getPackageName())) break block10;
                        PackageManager packageManager = context.getPackageManager();
                        int n8 = Build.VERSION.SDK_INT < 29 ? 0 : 268435456;
                        packageManager = packageManager.resolveContentProvider("com.google.android.gms.phenotype", n8);
                        bl = bl2;
                        if (packageManager == null) break block11;
                        bl = bl2;
                        if (!"com.google.android.gms".equals((Object)packageManager.packageName)) break block11;
                    }
                    bl = bl2;
                    if (Q2.a(context)) {
                        bl = true;
                    }
                }
                a = l.d(bl);
                return (Boolean)a.b();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

