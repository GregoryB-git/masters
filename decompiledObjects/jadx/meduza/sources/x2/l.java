package x2;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f16820a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16821b;

    public l(String str, int i10) {
        ec.i.e(str, "workSpecId");
        this.f16820a = str;
        this.f16821b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return ec.i.a(this.f16820a, lVar.f16820a) && this.f16821b == lVar.f16821b;
    }

    public final int hashCode() {
        return (this.f16820a.hashCode() * 31) + this.f16821b;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("WorkGenerationalId(workSpecId=");
        l10.append(this.f16820a);
        l10.append(", generation=");
        l10.append(this.f16821b);
        l10.append(')');
        return l10.toString();
    }
}
