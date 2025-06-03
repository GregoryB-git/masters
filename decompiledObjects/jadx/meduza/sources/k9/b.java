package k9;

/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    public final int f9144a;

    /* renamed from: b, reason: collision with root package name */
    public final f f9145b;

    public b(int i10, f fVar) {
        this.f9144a = i10;
        this.f9145b = fVar;
    }

    @Override // k9.k
    public final int b() {
        return this.f9144a;
    }

    @Override // k9.k
    public final f c() {
        return this.f9145b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f9144a == kVar.b() && this.f9145b.equals(kVar.c());
    }

    public final int hashCode() {
        return ((this.f9144a ^ 1000003) * 1000003) ^ this.f9145b.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Overlay{largestBatchId=");
        l10.append(this.f9144a);
        l10.append(", mutation=");
        l10.append(this.f9145b);
        l10.append("}");
        return l10.toString();
    }
}
