package x2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f16809a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f16810b;

    public d(String str, Long l10) {
        this.f16809a = str;
        this.f16810b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return ec.i.a(this.f16809a, dVar.f16809a) && ec.i.a(this.f16810b, dVar.f16810b);
    }

    public final int hashCode() {
        int hashCode = this.f16809a.hashCode() * 31;
        Long l10 = this.f16810b;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Preference(key=");
        l10.append(this.f16809a);
        l10.append(", value=");
        l10.append(this.f16810b);
        l10.append(')');
        return l10.toString();
    }
}
