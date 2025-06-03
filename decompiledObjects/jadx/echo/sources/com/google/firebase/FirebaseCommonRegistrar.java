package com.google.firebase;

import O4.c;
import O4.e;
import O4.h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import o4.C1761f;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static /* synthetic */ String f(Context context) {
        int i7;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || Build.VERSION.SDK_INT < 24) {
            return "";
        }
        i7 = applicationInfo.minSdkVersion;
        return String.valueOf(i7);
    }

    public static /* synthetic */ String g(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    public static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.c());
        arrayList.add(C1761f.g());
        arrayList.add(h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.b("fire-core", "20.4.2"));
        arrayList.add(h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(h.b("device-model", i(Build.DEVICE)));
        arrayList.add(h.b("device-brand", i(Build.BRAND)));
        arrayList.add(h.c("android-target-sdk", new h.a() { // from class: s3.h
            @Override // O4.h.a
            public final String a(Object obj) {
                String e7;
                e7 = FirebaseCommonRegistrar.e((Context) obj);
                return e7;
            }
        }));
        arrayList.add(h.c("android-min-sdk", new h.a() { // from class: s3.i
            @Override // O4.h.a
            public final String a(Object obj) {
                String f7;
                f7 = FirebaseCommonRegistrar.f((Context) obj);
                return f7;
            }
        }));
        arrayList.add(h.c("android-platform", new h.a() { // from class: s3.j
            @Override // O4.h.a
            public final String a(Object obj) {
                String g7;
                g7 = FirebaseCommonRegistrar.g((Context) obj);
                return g7;
            }
        }));
        arrayList.add(h.c("android-installer", new h.a() { // from class: s3.k
            @Override // O4.h.a
            public final String a(Object obj) {
                String h7;
                h7 = FirebaseCommonRegistrar.h((Context) obj);
                return h7;
            }
        }));
        String a7 = e.a();
        if (a7 != null) {
            arrayList.add(h.b("kotlin", a7));
        }
        return arrayList;
    }
}
