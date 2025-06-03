package m9;

import m9.m0;

/* loaded from: classes.dex */
public final class f extends m0.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f10780a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10781b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10782c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10783d;

    /* renamed from: e, reason: collision with root package name */
    public final m0.a f10784e;

    public f(int i10, int i11, String str, String str2, e eVar) {
        this.f10780a = i10;
        this.f10781b = i11;
        if (str == null) {
            throw new NullPointerException("Null projectId");
        }
        this.f10782c = str;
        if (str2 == null) {
            throw new NullPointerException("Null databaseId");
        }
        this.f10783d = str2;
        this.f10784e = eVar;
    }

    @Override // m9.m0.b
    public final m0.a a() {
        return this.f10784e;
    }

    @Override // m9.m0.b
    public final String b() {
        return this.f10783d;
    }

    @Override // m9.m0.b
    public final int c() {
        return this.f10781b;
    }

    @Override // m9.m0.b
    public final int d() {
        return this.f10780a;
    }

    @Override // m9.m0.b
    public final String e() {
        return this.f10782c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0.b)) {
            return false;
        }
        m0.b bVar = (m0.b) obj;
        if (this.f10780a == bVar.d() && this.f10781b == bVar.c() && this.f10782c.equals(bVar.e()) && this.f10783d.equals(bVar.b())) {
            m0.a aVar = this.f10784e;
            m0.a a10 = bVar.a();
            if (aVar == null) {
                if (a10 == null) {
                    return true;
                }
            } else if (aVar.equals(a10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f10780a ^ 1000003) * 1000003) ^ this.f10781b) * 1000003) ^ this.f10782c.hashCode()) * 1000003) ^ this.f10783d.hashCode()) * 1000003;
        m0.a aVar = this.f10784e;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ExistenceFilterMismatchInfo{localCacheCount=");
        l10.append(this.f10780a);
        l10.append(", existenceFilterCount=");
        l10.append(this.f10781b);
        l10.append(", projectId=");
        l10.append(this.f10782c);
        l10.append(", databaseId=");
        l10.append(this.f10783d);
        l10.append(", bloomFilter=");
        l10.append(this.f10784e);
        l10.append("}");
        return l10.toString();
    }
}
