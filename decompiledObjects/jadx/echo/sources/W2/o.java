package W2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o {

    public static class b implements n, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: o, reason: collision with root package name */
        public final List f6834o;

        public b(List list) {
            this.f6834o = list;
        }

        @Override // W2.n
        public boolean apply(Object obj) {
            for (int i7 = 0; i7 < this.f6834o.size(); i7++) {
                if (!((n) this.f6834o.get(i7)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f6834o.equals(((b) obj).f6834o);
            }
            return false;
        }

        public int hashCode() {
            return this.f6834o.hashCode() + 306654252;
        }

        public String toString() {
            return o.d("and", this.f6834o);
        }
    }

    public static n b(n nVar, n nVar2) {
        return new b(c((n) m.j(nVar), (n) m.j(nVar2)));
    }

    public static List c(n nVar, n nVar2) {
        return Arrays.asList(nVar, nVar2);
    }

    public static String d(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z7 = true;
        for (Object obj : iterable) {
            if (!z7) {
                sb.append(',');
            }
            sb.append(obj);
            z7 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
