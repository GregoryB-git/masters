package m8;

import java.util.List;
import m8.f0;

/* loaded from: classes.dex */
public final class y extends f0.e.d.f {

    /* renamed from: a, reason: collision with root package name */
    public final List<f0.e.d.AbstractC0160e> f10714a;

    public y() {
        throw null;
    }

    public y(List list) {
        this.f10714a = list;
    }

    @Override // m8.f0.e.d.f
    public final List<f0.e.d.AbstractC0160e> a() {
        return this.f10714a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.f) {
            return this.f10714a.equals(((f0.e.d.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f10714a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("RolloutsState{rolloutAssignments=");
        l10.append(this.f10714a);
        l10.append("}");
        return l10.toString();
    }
}
