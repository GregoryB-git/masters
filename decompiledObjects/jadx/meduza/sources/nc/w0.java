package nc;

/* loaded from: classes.dex */
public final class w0 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11561a;

    public w0(boolean z10) {
        this.f11561a = z10;
    }

    @Override // nc.f1
    public final t1 b() {
        return null;
    }

    @Override // nc.f1
    public final boolean isActive() {
        return this.f11561a;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Empty{");
        l10.append(this.f11561a ? "Active" : "New");
        l10.append('}');
        return l10.toString();
    }
}
