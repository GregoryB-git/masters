package i2;

import java.util.List;
import sb.q;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final List<a> f7390a;

    /* JADX WARN: Multi-variable type inference failed */
    public k(List<? extends a> list) {
        this.f7390a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ec.i.a(k.class, obj.getClass())) {
            return false;
        }
        return ec.i.a(this.f7390a, ((k) obj).f7390a);
    }

    public final int hashCode() {
        return this.f7390a.hashCode();
    }

    public final String toString() {
        return q.p(this.f7390a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
