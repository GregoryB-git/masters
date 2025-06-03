package J5;

import E5.a;
import J5.o;
import J5.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o {

    public class a implements p.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3077a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.e f3078b;

        public a(ArrayList arrayList, a.e eVar) {
            this.f3077a = arrayList;
            this.f3078b = eVar;
        }

        @Override // J5.p.f
        public void b(Throwable th) {
            this.f3078b.a(p.a(th));
        }

        @Override // J5.p.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r32) {
            this.f3077a.add(0, null);
            this.f3078b.a(this.f3077a);
        }
    }

    public class b implements p.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3079a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.e f3080b;

        public b(ArrayList arrayList, a.e eVar) {
            this.f3079a = arrayList;
            this.f3080b = eVar;
        }

        @Override // J5.p.f
        public void b(Throwable th) {
            this.f3080b.a(p.a(th));
        }

        @Override // J5.p.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r32) {
            this.f3079a.add(0, null);
            this.f3080b.a(this.f3079a);
        }
    }

    public class c implements p.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3081a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.e f3082b;

        public c(ArrayList arrayList, a.e eVar) {
            this.f3081a = arrayList;
            this.f3082b = eVar;
        }

        @Override // J5.p.f
        public void b(Throwable th) {
            this.f3082b.a(p.a(th));
        }

        @Override // J5.p.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r32) {
            this.f3081a.add(0, null);
            this.f3082b.a(this.f3081a);
        }
    }

    public static E5.i a() {
        return new E5.p();
    }

    public static /* synthetic */ void b(p.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        aVar.f((String) arrayList.get(0), (Boolean) arrayList.get(1), new a(new ArrayList(), eVar));
    }

    public static /* synthetic */ void c(p.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        aVar.b((String) arrayList.get(0), (Boolean) arrayList.get(1), new b(new ArrayList(), eVar));
    }

    public static void e(E5.c cVar, final p.a aVar) {
        E5.a aVar2 = new E5.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", a());
        if (aVar != null) {
            aVar2.e(new a.d() { // from class: J5.l
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    o.b(p.a.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        E5.a aVar3 = new E5.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", a());
        if (aVar != null) {
            aVar3.e(new a.d() { // from class: J5.m
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    o.c(p.a.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        E5.a aVar4 = new E5.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", a());
        if (aVar != null) {
            aVar4.e(new a.d() { // from class: J5.n
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    p.a.this.d((String) ((ArrayList) obj).get(0), new o.c(new ArrayList(), eVar));
                }
            });
        } else {
            aVar4.e(null);
        }
    }
}
