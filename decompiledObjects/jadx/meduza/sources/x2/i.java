package x2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f16813a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16814b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16815c;

    public i(String str, int i10, int i11) {
        ec.i.e(str, "workSpecId");
        this.f16813a = str;
        this.f16814b = i10;
        this.f16815c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return ec.i.a(this.f16813a, iVar.f16813a) && this.f16814b == iVar.f16814b && this.f16815c == iVar.f16815c;
    }

    public final int hashCode() {
        return (((this.f16813a.hashCode() * 31) + this.f16814b) * 31) + this.f16815c;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SystemIdInfo(workSpecId=");
        l10.append(this.f16813a);
        l10.append(", generation=");
        l10.append(this.f16814b);
        l10.append(", systemId=");
        l10.append(this.f16815c);
        l10.append(')');
        return l10.toString();
    }
}
