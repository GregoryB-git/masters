package Q5;

import E5.a;
import E5.p;
import Q5.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static E5.i a() {
        return new p();
    }

    public static /* synthetic */ void b(i.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.a());
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(i.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.e());
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(i.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.c());
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(i.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.b());
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(i.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.g());
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(i.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.d());
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(i.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.f(arrayList2.get(0) == null ? null : i.b.values()[((Integer) arrayList2.get(0)).intValue()]));
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static void i(E5.c cVar, final i.a aVar) {
        E5.a aVar2 = new E5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", a(), cVar.b());
        if (aVar != null) {
            aVar2.e(new a.d() { // from class: Q5.a
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    h.b(i.a.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        E5.a aVar3 = new E5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", a(), cVar.b());
        if (aVar != null) {
            aVar3.e(new a.d() { // from class: Q5.b
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    h.c(i.a.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        E5.a aVar4 = new E5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", a(), cVar.b());
        if (aVar != null) {
            aVar4.e(new a.d() { // from class: Q5.c
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    h.d(i.a.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        E5.a aVar5 = new E5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationCachePath", a(), cVar.b());
        if (aVar != null) {
            aVar5.e(new a.d() { // from class: Q5.d
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    h.e(i.a.this, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        E5.a aVar6 = new E5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", a(), cVar.b());
        if (aVar != null) {
            aVar6.e(new a.d() { // from class: Q5.e
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    h.f(i.a.this, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
        E5.a aVar7 = new E5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", a(), cVar.b());
        if (aVar != null) {
            aVar7.e(new a.d() { // from class: Q5.f
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    h.g(i.a.this, obj, eVar);
                }
            });
        } else {
            aVar7.e(null);
        }
        E5.a aVar8 = new E5.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", a(), cVar.b());
        if (aVar != null) {
            aVar8.e(new a.d() { // from class: Q5.g
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    h.h(i.a.this, obj, eVar);
                }
            });
        } else {
            aVar8.e(null);
        }
    }
}
