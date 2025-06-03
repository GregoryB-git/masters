package j9;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static j9.c f8687a = new j9.c(0, a.f8689a);

    /* renamed from: b, reason: collision with root package name */
    public static final r5.c f8688b = new r5.c(7);

    public static abstract class a implements Comparable<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final j9.b f8689a = new j9.b(q.f8701b, i.g(), -1);

        /* renamed from: b, reason: collision with root package name */
        public static final q5.i f8690b = new q5.i(6);

        public static j9.b g(g gVar) {
            return new j9.b(gVar.f(), gVar.getKey(), -1);
        }

        @Override // java.lang.Comparable
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            int compareTo = l().compareTo(aVar.l());
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = h().compareTo(aVar.h());
            return compareTo2 != 0 ? compareTo2 : Integer.compare(i(), aVar.i());
        }

        public abstract i h();

        public abstract int i();

        public abstract q l();
    }

    public static abstract class b {
        public abstract a a();

        public abstract long b();
    }

    public static abstract class c implements Comparable<c> {
        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            int compareTo = f().compareTo(cVar2.f());
            return compareTo != 0 ? compareTo : q0.g.a(g(), cVar2.g());
        }

        public abstract l f();

        public abstract int g();
    }

    public final c a() {
        for (c cVar : f()) {
            if (q0.g.b(cVar.g(), 3)) {
                return cVar;
            }
        }
        return null;
    }

    public abstract String b();

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : f()) {
            if (!q0.g.b(cVar.g(), 3)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public abstract int d();

    public abstract b e();

    public abstract List<c> f();
}
