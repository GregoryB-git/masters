package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0777y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f8891a;

    /* renamed from: b, reason: collision with root package name */
    public static final E f8892b;

    public static final class b extends E {

        /* renamed from: c, reason: collision with root package name */
        public static final Class f8893c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        public static List f(Object obj, long j7) {
            return (List) p0.A(obj, j7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static List g(Object obj, long j7, int i7) {
            List h7;
            C c7;
            List f7 = f(obj, j7);
            if (!f7.isEmpty()) {
                if (f8893c.isAssignableFrom(f7.getClass())) {
                    ArrayList arrayList = new ArrayList(f7.size() + i7);
                    arrayList.addAll(f7);
                    c7 = arrayList;
                } else if (f7 instanceof o0) {
                    C c8 = new C(f7.size() + i7);
                    c8.addAll((o0) f7);
                    c7 = c8;
                } else {
                    if (!(f7 instanceof Y) || !(f7 instanceof AbstractC0777y.b)) {
                        return f7;
                    }
                    AbstractC0777y.b bVar = (AbstractC0777y.b) f7;
                    if (bVar.p()) {
                        return f7;
                    }
                    h7 = bVar.h(f7.size() + i7);
                }
                p0.O(obj, j7, c7);
                return c7;
            }
            h7 = f7 instanceof D ? new C(i7) : ((f7 instanceof Y) && (f7 instanceof AbstractC0777y.b)) ? ((AbstractC0777y.b) f7).h(i7) : new ArrayList(i7);
            p0.O(obj, j7, h7);
            return h7;
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public void c(Object obj, long j7) {
            Object unmodifiableList;
            List list = (List) p0.A(obj, j7);
            if (list instanceof D) {
                unmodifiableList = ((D) list).m();
            } else {
                if (f8893c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof Y) && (list instanceof AbstractC0777y.b)) {
                    AbstractC0777y.b bVar = (AbstractC0777y.b) list;
                    if (bVar.p()) {
                        bVar.j();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            p0.O(obj, j7, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public void d(Object obj, Object obj2, long j7) {
            List f7 = f(obj2, j7);
            List g7 = g(obj, j7, f7.size());
            int size = g7.size();
            int size2 = f7.size();
            if (size > 0 && size2 > 0) {
                g7.addAll(f7);
            }
            if (size > 0) {
                f7 = g7;
            }
            p0.O(obj, j7, f7);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public List e(Object obj, long j7) {
            return g(obj, j7, 10);
        }
    }

    public static final class c extends E {
        public c() {
            super();
        }

        public static AbstractC0777y.b f(Object obj, long j7) {
            return (AbstractC0777y.b) p0.A(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public void c(Object obj, long j7) {
            f(obj, j7).j();
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public void d(Object obj, Object obj2, long j7) {
            AbstractC0777y.b f7 = f(obj, j7);
            AbstractC0777y.b f8 = f(obj2, j7);
            int size = f7.size();
            int size2 = f8.size();
            if (size > 0 && size2 > 0) {
                if (!f7.p()) {
                    f7 = f7.h(size2 + size);
                }
                f7.addAll(f8);
            }
            if (size > 0) {
                f8 = f7;
            }
            p0.O(obj, j7, f8);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public List e(Object obj, long j7) {
            AbstractC0777y.b f7 = f(obj, j7);
            if (f7.p()) {
                return f7;
            }
            int size = f7.size();
            AbstractC0777y.b h7 = f7.h(size == 0 ? 10 : size * 2);
            p0.O(obj, j7, h7);
            return h7;
        }
    }

    static {
        f8891a = new b();
        f8892b = new c();
    }

    public E() {
    }

    public static E a() {
        return f8891a;
    }

    public static E b() {
        return f8892b;
    }

    public abstract void c(Object obj, long j7);

    public abstract void d(Object obj, Object obj2, long j7);

    public abstract List e(Object obj, long j7);
}
