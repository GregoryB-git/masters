package g9;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final j9.f f5964a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5965b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5966c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5967d;

    public h(j9.f fVar, String str, String str2, boolean z10) {
        this.f5964a = fVar;
        this.f5965b = str;
        this.f5966c = str2;
        this.f5967d = z10;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("DatabaseInfo(databaseId:");
        l10.append(this.f5964a);
        l10.append(" host:");
        return defpackage.g.f(l10, this.f5966c, ")");
    }
}
