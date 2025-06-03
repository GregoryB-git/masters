package s;

import defpackage.f;

/* loaded from: classes.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    public Object f13933a;

    /* renamed from: b, reason: collision with root package name */
    public d<T> f13934b;

    /* renamed from: c, reason: collision with root package name */
    public e<Void> f13935c = new e<>();

    /* renamed from: d, reason: collision with root package name */
    public boolean f13936d;

    public final void finalize() {
        e<Void> eVar;
        d<T> dVar = this.f13934b;
        if (dVar != null && !dVar.isDone()) {
            StringBuilder l10 = f.l("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            l10.append(this.f13933a);
            dVar.f13938b.q(new c(l10.toString()));
        }
        if (this.f13936d || (eVar = this.f13935c) == null) {
            return;
        }
        eVar.p(null);
    }
}
