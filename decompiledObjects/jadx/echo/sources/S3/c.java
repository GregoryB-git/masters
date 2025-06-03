package S3;

import S3.c;
import S3.h;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c implements Iterable {
    public abstract c D(Object obj);

    public abstract Iterator P();

    public abstract boolean a(Object obj);

    public abstract Object d(Object obj);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!f().equals(cVar.f()) || size() != cVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = cVar.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Comparator f();

    public abstract Object g();

    public int hashCode() {
        int hashCode = f().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return hashCode;
    }

    public abstract Object i();

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator iterator();

    public abstract Object k(Object obj);

    public abstract void q(h.b bVar);

    public abstract c s(Object obj, Object obj2);

    public abstract int size();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z7) {
                z7 = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final InterfaceC0091a f5860a = new InterfaceC0091a() { // from class: S3.b
            @Override // S3.c.a.InterfaceC0091a
            public final Object a(Object obj) {
                Object f7;
                f7 = c.a.f(obj);
                return f7;
            }
        };

        /* renamed from: S3.c$a$a, reason: collision with other inner class name */
        public interface InterfaceC0091a {
            Object a(Object obj);
        }

        public static c b(List list, Map map, InterfaceC0091a interfaceC0091a, Comparator comparator) {
            return list.size() < 25 ? S3.a.U(list, map, interfaceC0091a, comparator) : k.M(list, map, interfaceC0091a, comparator);
        }

        public static c c(Comparator comparator) {
            return new S3.a(comparator);
        }

        public static c d(Map map, Comparator comparator) {
            return map.size() < 25 ? S3.a.X(map, comparator) : k.S(map, comparator);
        }

        public static InterfaceC0091a e() {
            return f5860a;
        }

        public static /* synthetic */ Object f(Object obj) {
            return obj;
        }
    }
}
