package R5;

import E5.a;
import E5.p;
import R5.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static E5.i a() {
        return new p();
    }

    public static /* synthetic */ void b(j.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.remove((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = j.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(j.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.f((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = j.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(j.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.c((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = j.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(j.a aVar, Object obj, a.e eVar) {
        Long valueOf;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        String str = (String) arrayList2.get(0);
        Number number = (Number) arrayList2.get(1);
        if (number == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = j.a(th);
            }
        }
        arrayList.add(0, aVar.a(str, valueOf));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(j.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.g((String) arrayList2.get(0), (Double) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = j.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(j.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.e((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = j.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(j.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.d((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = j.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void i(j.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.b((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = j.a(th);
        }
        eVar.a(arrayList);
    }

    public static void j(E5.c cVar, final j.a aVar) {
        E5.a aVar2 = new E5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.remove", a(), cVar.b());
        if (aVar != null) {
            aVar2.e(new a.d() { // from class: R5.a
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.b(j.a.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        E5.a aVar3 = new E5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setBool", a(), cVar.b());
        if (aVar != null) {
            aVar3.e(new a.d() { // from class: R5.b
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.c(j.a.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        E5.a aVar4 = new E5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setString", a(), cVar.b());
        if (aVar != null) {
            aVar4.e(new a.d() { // from class: R5.c
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.d(j.a.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        E5.a aVar5 = new E5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setInt", a(), cVar.b());
        if (aVar != null) {
            aVar5.e(new a.d() { // from class: R5.d
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.e(j.a.this, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        E5.a aVar6 = new E5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setDouble", a(), cVar.b());
        if (aVar != null) {
            aVar6.e(new a.d() { // from class: R5.e
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.f(j.a.this, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
        E5.a aVar7 = new E5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setStringList", a(), cVar.b());
        if (aVar != null) {
            aVar7.e(new a.d() { // from class: R5.f
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.g(j.a.this, obj, eVar);
                }
            });
        } else {
            aVar7.e(null);
        }
        E5.a aVar8 = new E5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.clear", a(), cVar.b());
        if (aVar != null) {
            aVar8.e(new a.d() { // from class: R5.g
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.h(j.a.this, obj, eVar);
                }
            });
        } else {
            aVar8.e(null);
        }
        E5.a aVar9 = new E5.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.getAll", a(), cVar.b());
        if (aVar != null) {
            aVar9.e(new a.d() { // from class: R5.h
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    i.i(j.a.this, obj, eVar);
                }
            });
        } else {
            aVar9.e(null);
        }
    }
}
