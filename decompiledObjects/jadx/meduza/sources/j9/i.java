package j9;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements Comparable<i> {

    /* renamed from: b, reason: collision with root package name */
    public static final v4.d f8682b;

    /* renamed from: c, reason: collision with root package name */
    public static final t8.e<i> f8683c;

    /* renamed from: a, reason: collision with root package name */
    public final o f8684a;

    static {
        v4.d dVar = new v4.d(8);
        f8682b = dVar;
        f8683c = new t8.e<>(Collections.emptyList(), dVar);
    }

    public i(o oVar) {
        x6.b.Z("Not a document key path: %s", l(oVar), oVar);
        this.f8684a = oVar;
    }

    public static i g() {
        List emptyList = Collections.emptyList();
        o oVar = o.f8700b;
        return new i(emptyList.isEmpty() ? o.f8700b : new o(emptyList));
    }

    public static i h(String str) {
        o t = o.t(str);
        x6.b.Z("Tried to parse an invalid key: %s", t.q() > 4 && t.n(0).equals("projects") && t.n(2).equals("databases") && t.n(4).equals("documents"), t);
        return new i((o) t.r());
    }

    public static boolean l(o oVar) {
        return oVar.q() % 2 == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return this.f8684a.equals(((i) obj).f8684a);
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        return this.f8684a.compareTo(iVar.f8684a);
    }

    public final int hashCode() {
        return this.f8684a.hashCode();
    }

    public final o i() {
        return this.f8684a.s();
    }

    public final String toString() {
        return this.f8684a.h();
    }
}
