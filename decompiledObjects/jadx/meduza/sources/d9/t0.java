package d9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t0 f3717c = new t0(false, null);

    /* renamed from: d, reason: collision with root package name */
    public static final t0 f3718d = new t0(true, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3719a;

    /* renamed from: b, reason: collision with root package name */
    public final k9.d f3720b;

    public t0(boolean z10, k9.d dVar) {
        x6.b.p("Cannot specify a fieldMask for non-merge sets()", dVar == null || z10, new Object[0]);
        this.f3719a = z10;
        this.f3720b = dVar;
    }

    public static t0 a(List<n> list) {
        HashSet hashSet = new HashSet();
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().f3690a);
        }
        return new t0(true, new k9.d(hashSet));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f3719a != t0Var.f3719a) {
            return false;
        }
        k9.d dVar = this.f3720b;
        k9.d dVar2 = t0Var.f3720b;
        return dVar != null ? dVar.equals(dVar2) : dVar2 == null;
    }

    public final int hashCode() {
        int i10 = (this.f3719a ? 1 : 0) * 31;
        k9.d dVar = this.f3720b;
        return i10 + (dVar != null ? dVar.hashCode() : 0);
    }
}
