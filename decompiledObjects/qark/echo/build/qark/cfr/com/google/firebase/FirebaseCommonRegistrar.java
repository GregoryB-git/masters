/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.firebase;

import O4.c;
import O4.e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import o4.f;
import s3.g;
import s3.h;
import s3.i;
import s3.j;
import s3.k;

public class FirebaseCommonRegistrar
implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        return FirebaseCommonRegistrar.h(context);
    }

    public static /* synthetic */ String b(Context context) {
        return FirebaseCommonRegistrar.f(context);
    }

    public static /* synthetic */ String c(Context context) {
        return FirebaseCommonRegistrar.e(context);
    }

    public static /* synthetic */ String d(Context context) {
        return FirebaseCommonRegistrar.g(context);
    }

    public static /* synthetic */ String e(Context context) {
        if ((context = context.getApplicationInfo()) != null) {
            return String.valueOf((int)context.targetSdkVersion);
        }
        return "";
    }

    public static /* synthetic */ String f(Context context) {
        if ((context = context.getApplicationInfo()) != null && Build.VERSION.SDK_INT >= 24) {
            return String.valueOf((int)g.a((ApplicationInfo)context));
        }
        return "";
    }

    public static /* synthetic */ String g(Context context) {
        int n8 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (n8 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    public static /* synthetic */ String h(Context object) {
        if ((object = object.getPackageManager().getInstallerPackageName(object.getPackageName())) != null) {
            return FirebaseCommonRegistrar.i((String)object);
        }
        return "";
    }

    public static String i(String string2) {
        return string2.replace(' ', '_').replace('/', '_');
    }

    @Override
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)c.c());
        arrayList.add((Object)f.g());
        arrayList.add((Object)O4.h.b("fire-android", String.valueOf((int)Build.VERSION.SDK_INT)));
        arrayList.add((Object)O4.h.b("fire-core", "20.4.2"));
        arrayList.add((Object)O4.h.b("device-name", FirebaseCommonRegistrar.i(Build.PRODUCT)));
        arrayList.add((Object)O4.h.b("device-model", FirebaseCommonRegistrar.i(Build.DEVICE)));
        arrayList.add((Object)O4.h.b("device-brand", FirebaseCommonRegistrar.i(Build.BRAND)));
        arrayList.add((Object)O4.h.c("android-target-sdk", new h()));
        arrayList.add((Object)O4.h.c("android-min-sdk", new i()));
        arrayList.add((Object)O4.h.c("android-platform", new j()));
        arrayList.add((Object)O4.h.c("android-installer", new k()));
        String string2 = e.a();
        if (string2 != null) {
            arrayList.add((Object)O4.h.b("kotlin", string2));
        }
        return arrayList;
    }
}

