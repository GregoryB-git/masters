package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import ca.d;
import ca.f;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.k;
import d8.t;
import d9.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import q9.c;
import q9.e;
import r3.j;
import w3.v;
import y7.a;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static String b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<b<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        b.a b10 = b.b(f.class);
        b10.a(new k(2, 0, d.class));
        b10.f = new p(4);
        arrayList.add(b10.b());
        t tVar = new t(a.class, Executor.class);
        b.a aVar = new b.a(c.class, new Class[]{e.class, q9.f.class});
        aVar.a(k.d(Context.class));
        aVar.a(k.d(u7.f.class));
        aVar.a(new k(2, 0, q9.d.class));
        aVar.a(new k(1, 1, f.class));
        aVar.a(new k((t<?>) tVar, 1, 0));
        aVar.f = new defpackage.d(tVar, 2);
        arrayList.add(aVar.b());
        arrayList.add(ca.e.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(ca.e.a("fire-core", "21.0.0"));
        arrayList.add(ca.e.a("device-name", b(Build.PRODUCT)));
        arrayList.add(ca.e.a("device-model", b(Build.DEVICE)));
        arrayList.add(ca.e.a("device-brand", b(Build.BRAND)));
        int i10 = 14;
        arrayList.add(ca.e.b("android-target-sdk", new j(i10)));
        arrayList.add(ca.e.b("android-min-sdk", new e0.d(20)));
        arrayList.add(ca.e.b("android-platform", new e0.e(19)));
        arrayList.add(ca.e.b("android-installer", new v(i10)));
        try {
            str = rb.b.f13839e.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(ca.e.a("kotlin", str));
        }
        return arrayList;
    }
}
