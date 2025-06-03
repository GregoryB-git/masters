package ea;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f4971a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4973c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4974d;

    public s(int i10, int i11, String str, boolean z10) {
        this.f4971a = str;
        this.f4972b = i10;
        this.f4973c = i11;
        this.f4974d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return ec.i.a(this.f4971a, sVar.f4971a) && this.f4972b == sVar.f4972b && this.f4973c == sVar.f4973c && this.f4974d == sVar.f4974d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((this.f4971a.hashCode() * 31) + this.f4972b) * 31) + this.f4973c) * 31;
        boolean z10 = this.f4974d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ProcessDetails(processName=");
        l10.append(this.f4971a);
        l10.append(", pid=");
        l10.append(this.f4972b);
        l10.append(", importance=");
        l10.append(this.f4973c);
        l10.append(", isDefaultProcess=");
        l10.append(this.f4974d);
        l10.append(')');
        return l10.toString();
    }
}
