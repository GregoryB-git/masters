package s0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s0.x;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13958a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f13959b = new b();

    public static final class a extends e0 {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?> f13960c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX WARN: Multi-variable type inference failed */
        public static List d(Object obj, int i10, long j10) {
            x.c c10;
            c0 c0Var;
            List list = (List) l1.n(obj, j10);
            if (list.isEmpty()) {
                if (list instanceof d0) {
                    list = new c0(i10);
                } else if ((list instanceof x0) && (list instanceof x.c)) {
                    c10 = ((x.c) list).c(i10);
                    list = c10;
                } else {
                    list = new ArrayList(i10);
                }
                l1.u(obj, j10, list);
            } else {
                if (f13960c.isAssignableFrom(list.getClass())) {
                    ArrayList arrayList = new ArrayList(list.size() + i10);
                    arrayList.addAll(list);
                    c0Var = arrayList;
                } else if (list instanceof k1) {
                    c0 c0Var2 = new c0(list.size() + i10);
                    c0Var2.addAll((k1) list);
                    c0Var = c0Var2;
                } else if ((list instanceof x0) && (list instanceof x.c)) {
                    x.c cVar = (x.c) list;
                    if (!cVar.g()) {
                        c10 = cVar.c(list.size() + i10);
                        list = c10;
                        l1.u(obj, j10, list);
                    }
                }
                list = c0Var;
                l1.u(obj, j10, list);
            }
            return list;
        }

        @Override // s0.e0
        public final void a(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) l1.n(obj, j10);
            if (list instanceof d0) {
                unmodifiableList = ((d0) list).e();
            } else {
                if (f13960c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof x0) && (list instanceof x.c)) {
                    x.c cVar = (x.c) list;
                    if (cVar.g()) {
                        cVar.b();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            l1.u(obj, j10, unmodifiableList);
        }

        @Override // s0.e0
        public final void b(Object obj, long j10, Object obj2) {
            List list = (List) l1.n(obj2, j10);
            List d10 = d(obj, list.size(), j10);
            int size = d10.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d10.addAll(list);
            }
            if (size > 0) {
                list = d10;
            }
            l1.u(obj, j10, list);
        }

        @Override // s0.e0
        public final <L> List<L> c(Object obj, long j10) {
            return d(obj, 10, j10);
        }
    }

    public static final class b extends e0 {
        @Override // s0.e0
        public final void a(Object obj, long j10) {
            ((x.c) l1.n(obj, j10)).b();
        }

        @Override // s0.e0
        public final void b(Object obj, long j10, Object obj2) {
            x.c cVar = (x.c) l1.n(obj, j10);
            x.c cVar2 = (x.c) l1.n(obj2, j10);
            int size = cVar.size();
            int size2 = cVar2.size();
            if (size > 0 && size2 > 0) {
                if (!cVar.g()) {
                    cVar = cVar.c(size2 + size);
                }
                cVar.addAll(cVar2);
            }
            if (size > 0) {
                cVar2 = cVar;
            }
            l1.u(obj, j10, cVar2);
        }

        @Override // s0.e0
        public final <L> List<L> c(Object obj, long j10) {
            x.c cVar = (x.c) l1.n(obj, j10);
            if (cVar.g()) {
                return cVar;
            }
            int size = cVar.size();
            x.c c10 = cVar.c(size == 0 ? 10 : size * 2);
            l1.u(obj, j10, c10);
            return c10;
        }
    }

    public abstract void a(Object obj, long j10);

    public abstract void b(Object obj, long j10, Object obj2);

    public abstract <L> List<L> c(Object obj, long j10);
}
