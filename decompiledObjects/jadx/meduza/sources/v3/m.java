package v3;

/* loaded from: classes.dex */
public final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f15516a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15517b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15518c;

    static {
        v5.e0.E(0);
        v5.e0.E(1);
        v5.e0.E(2);
    }

    public m(int i10, int i11, int i12) {
        this.f15516a = i10;
        this.f15517b = i11;
        this.f15518c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f15516a == mVar.f15516a && this.f15517b == mVar.f15517b && this.f15518c == mVar.f15518c;
    }

    public final int hashCode() {
        return ((((527 + this.f15516a) * 31) + this.f15517b) * 31) + this.f15518c;
    }
}
