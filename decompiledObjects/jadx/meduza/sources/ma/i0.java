package ma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ma.a0;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11006a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f11007b = new b();

    public static final class a extends i0 {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?> f11008c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX WARN: Multi-variable type inference failed */
        public static List d(Object obj, int i10, long j10) {
            a0.d c10;
            g0 g0Var;
            List list = (List) t1.p(obj, j10);
            if (list.isEmpty()) {
                if (list instanceof h0) {
                    list = new g0(i10);
                } else if ((list instanceof c1) && (list instanceof a0.d)) {
                    c10 = ((a0.d) list).c(i10);
                    list = c10;
                } else {
                    list = new ArrayList(i10);
                }
                t1.z(obj, j10, list);
            } else {
                if (f11008c.isAssignableFrom(list.getClass())) {
                    ArrayList arrayList = new ArrayList(list.size() + i10);
                    arrayList.addAll(list);
                    g0Var = arrayList;
                } else if (list instanceof s1) {
                    g0 g0Var2 = new g0(list.size() + i10);
                    g0Var2.addAll((s1) list);
                    g0Var = g0Var2;
                } else if ((list instanceof c1) && (list instanceof a0.d)) {
                    a0.d dVar = (a0.d) list;
                    if (!dVar.g()) {
                        c10 = dVar.c(list.size() + i10);
                        list = c10;
                        t1.z(obj, j10, list);
                    }
                }
                list = g0Var;
                t1.z(obj, j10, list);
            }
            return list;
        }

        @Override // ma.i0
        public final void a(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) t1.p(obj, j10);
            if (list instanceof h0) {
                unmodifiableList = ((h0) list).e();
            } else {
                if (f11008c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof c1) && (list instanceof a0.d)) {
                    a0.d dVar = (a0.d) list;
                    if (dVar.g()) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            t1.z(obj, j10, unmodifiableList);
        }

        @Override // ma.i0
        public final void b(Object obj, long j10, Object obj2) {
            List list = (List) t1.p(obj2, j10);
            List d10 = d(obj, list.size(), j10);
            int size = d10.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d10.addAll(list);
            }
            if (size > 0) {
                list = d10;
            }
            t1.z(obj, j10, list);
        }

        @Override // ma.i0
        public final <L> List<L> c(Object obj, long j10) {
            return d(obj, 10, j10);
        }
    }

    public static final class b extends i0 {
        @Override // ma.i0
        public final void a(Object obj, long j10) {
            ((a0.d) t1.p(obj, j10)).b();
        }

        @Override // ma.i0
        public final void b(Object obj, long j10, Object obj2) {
            a0.d dVar = (a0.d) t1.p(obj, j10);
            a0.d dVar2 = (a0.d) t1.p(obj2, j10);
            int size = dVar.size();
            int size2 = dVar2.size();
            if (size > 0 && size2 > 0) {
                if (!dVar.g()) {
                    dVar = dVar.c(size2 + size);
                }
                dVar.addAll(dVar2);
            }
            if (size > 0) {
                dVar2 = dVar;
            }
            t1.z(obj, j10, dVar2);
        }

        @Override // ma.i0
        public final <L> List<L> c(Object obj, long j10) {
            a0.d dVar = (a0.d) t1.p(obj, j10);
            if (dVar.g()) {
                return dVar;
            }
            int size = dVar.size();
            a0.d c10 = dVar.c(size == 0 ? 10 : size * 2);
            t1.z(obj, j10, c10);
            return c10;
        }
    }

    public abstract void a(Object obj, long j10);

    public abstract void b(Object obj, long j10, Object obj2);

    public abstract <L> List<L> c(Object obj, long j10);
}
