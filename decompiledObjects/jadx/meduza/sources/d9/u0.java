package d9;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3722a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3723b;

    public u0(boolean z10, boolean z11) {
        this.f3722a = z10;
        this.f3723b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f3722a == u0Var.f3722a && this.f3723b == u0Var.f3723b;
    }

    public final int hashCode() {
        return ((this.f3722a ? 1 : 0) * 31) + (this.f3723b ? 1 : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SnapshotMetadata{hasPendingWrites=");
        l10.append(this.f3722a);
        l10.append(", isFromCache=");
        l10.append(this.f3723b);
        l10.append('}');
        return l10.toString();
    }
}
