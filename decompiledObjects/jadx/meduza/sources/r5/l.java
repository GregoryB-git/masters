package r5;

import java.util.Collections;
import java.util.List;
import o7.t;
import v5.e0;
import z4.i0;

/* loaded from: classes.dex */
public final class l implements v3.g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f13719c = e0.E(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String f13720d = e0.E(1);

    /* renamed from: e, reason: collision with root package name */
    public static final e0.d f13721e = new e0.d(17);

    /* renamed from: a, reason: collision with root package name */
    public final i0 f13722a;

    /* renamed from: b, reason: collision with root package name */
    public final t<Integer> f13723b;

    public l(i0 i0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= i0Var.f17684a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f13722a = i0Var;
        this.f13723b = t.p(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f13722a.equals(lVar.f13722a) && this.f13723b.equals(lVar.f13723b);
    }

    public final int hashCode() {
        return (this.f13723b.hashCode() * 31) + this.f13722a.hashCode();
    }
}
