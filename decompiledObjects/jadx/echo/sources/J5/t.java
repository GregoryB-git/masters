package J5;

import E5.a;
import J5.p;
import J5.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class t {

    public class a implements p.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3123a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.e f3124b;

        public a(ArrayList arrayList, a.e eVar) {
            this.f3123a = arrayList;
            this.f3124b = eVar;
        }

        @Override // J5.p.f
        public void b(Throwable th) {
            this.f3124b.a(p.a(th));
        }

        @Override // J5.p.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(p.e eVar) {
            this.f3123a.add(0, eVar);
            this.f3124b.a(this.f3123a);
        }
    }

    public class b implements p.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3125a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.e f3126b;

        public b(ArrayList arrayList, a.e eVar) {
            this.f3125a = arrayList;
            this.f3126b = eVar;
        }

        @Override // J5.p.f
        public void b(Throwable th) {
            this.f3126b.a(p.a(th));
        }

        @Override // J5.p.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            this.f3125a.add(0, list);
            this.f3126b.a(this.f3125a);
        }
    }

    public class c implements p.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3127a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.e f3128b;

        public c(ArrayList arrayList, a.e eVar) {
            this.f3127a = arrayList;
            this.f3128b = eVar;
        }

        @Override // J5.p.f
        public void b(Throwable th) {
            this.f3128b.a(p.a(th));
        }

        @Override // J5.p.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(p.d dVar) {
            this.f3127a.add(0, dVar);
            this.f3128b.a(this.f3127a);
        }
    }

    public static E5.i a() {
        return p.c.f3083d;
    }

    public static /* synthetic */ void b(p.b bVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        bVar.e((String) arrayList.get(0), (p.d) arrayList.get(1), new a(new ArrayList(), eVar));
    }

    public static void e(E5.c cVar, final p.b bVar) {
        E5.a aVar = new E5.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", a());
        if (bVar != null) {
            aVar.e(new a.d() { // from class: J5.q
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    t.b(p.b.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        E5.a aVar2 = new E5.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", a());
        if (bVar != null) {
            aVar2.e(new a.d() { // from class: J5.r
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    p.b.this.a(new t.b(new ArrayList(), eVar));
                }
            });
        } else {
            aVar2.e(null);
        }
        E5.a aVar3 = new E5.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", a());
        if (bVar != null) {
            aVar3.e(new a.d() { // from class: J5.s
                @Override // E5.a.d
                public final void a(Object obj, a.e eVar) {
                    p.b.this.c(new t.c(new ArrayList(), eVar));
                }
            });
        } else {
            aVar3.e(null);
        }
    }
}
