package S5;

import E5.a;
import S5.a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static E5.i a() {
        return a.c.f5908d;
    }

    public static /* synthetic */ void b(a.b bVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, bVar.a((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(a.b bVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.d((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(a.b bVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.b((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (a.d) arrayList2.get(2)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(a.b bVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, bVar.e());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(a.b bVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            bVar.c();
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void g(E5.c cVar, final a.b bVar) {
        E5.a aVar = new E5.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", a());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: S5.b
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.b(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        E5.a aVar2 = new E5.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", a());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: S5.c
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.c(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        E5.a aVar3 = new E5.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", a());
        if (bVar != null) {
            aVar3.e(new a.d() { // from class: S5.d
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.d(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        E5.a aVar4 = new E5.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", a());
        if (bVar != null) {
            aVar4.e(new a.d() { // from class: S5.e
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.e(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        E5.a aVar5 = new E5.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", a());
        if (bVar != null) {
            aVar5.e(new a.d() { // from class: S5.f
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    g.f(a.b.this, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
    }
}
