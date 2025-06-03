package com.google.firebase.crashlytics;

import android.util.Log;
import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.k;
import d8.t;
import fa.a;
import fa.b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import u7.f;
import vc.d;
import y7.a;
import y7.b;
import y7.c;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f3114d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final t<ExecutorService> f3115a = new t<>(a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    public final t<ExecutorService> f3116b = new t<>(b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    public final t<ExecutorService> f3117c = new t<>(c.class, ExecutorService.class);

    static {
        StringBuilder sb2;
        String str;
        b.a aVar = b.a.CRASHLYTICS;
        Map<b.a, a.C0084a> map = fa.a.f5512b;
        if (map.containsKey(aVar)) {
            sb2 = new StringBuilder();
            sb2.append("Dependency ");
            sb2.append(aVar);
            str = " already added.";
        } else {
            map.put(aVar, new a.C0084a(new d(true)));
            sb2 = new StringBuilder();
            sb2.append("Dependency to ");
            sb2.append(aVar);
            str = " added.";
        }
        sb2.append(str);
        Log.d("SessionsDependencies", sb2.toString());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<d8.b<?>> getComponents() {
        b.a b10 = d8.b.b(f8.c.class);
        b10.f3588a = "fire-cls";
        b10.a(k.d(f.class));
        b10.a(k.d(u9.d.class));
        b10.a(k.c(this.f3115a));
        b10.a(k.c(this.f3116b));
        b10.a(k.c(this.f3117c));
        b10.a(k.a(g8.a.class));
        b10.a(k.a(w7.a.class));
        b10.a(k.a(da.a.class));
        b10.f = new defpackage.d(this, 1);
        b10.c(2);
        return Arrays.asList(b10.b(), e.a("fire-cls", "19.4.0"));
    }
}
