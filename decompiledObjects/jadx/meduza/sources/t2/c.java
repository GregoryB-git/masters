package t2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14414a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14415b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14416c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14417d;

    public c(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f14414a = z10;
        this.f14415b = z11;
        this.f14416c = z12;
        this.f14417d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14414a == cVar.f14414a && this.f14415b == cVar.f14415b && this.f14416c == cVar.f14416c && this.f14417d == cVar.f14417d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f14414a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f14415b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f14416c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z11 = this.f14417d;
        return i14 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("NetworkState(isConnected=");
        l10.append(this.f14414a);
        l10.append(", isValidated=");
        l10.append(this.f14415b);
        l10.append(", isMetered=");
        l10.append(this.f14416c);
        l10.append(", isNotRoaming=");
        l10.append(this.f14417d);
        l10.append(')');
        return l10.toString();
    }
}
