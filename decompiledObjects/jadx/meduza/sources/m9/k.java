package m9;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f10819a;

    /* renamed from: b, reason: collision with root package name */
    public ka.g f10820b;

    public k(int i10, ka.g gVar) {
        this.f10819a = i10;
        this.f10820b = gVar;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ExistenceFilter{count=");
        l10.append(this.f10819a);
        l10.append(", unchangedNames=");
        l10.append(this.f10820b);
        l10.append('}');
        return l10.toString();
    }
}
