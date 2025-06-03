package rc;

/* loaded from: classes.dex */
public final class s<T> implements ub.e<T>, wb.d {

    /* renamed from: a, reason: collision with root package name */
    public final ub.e<T> f13902a;

    /* renamed from: b, reason: collision with root package name */
    public final ub.h f13903b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(ub.e<? super T> eVar, ub.h hVar) {
        this.f13902a = eVar;
        this.f13903b = hVar;
    }

    @Override // wb.d
    public final wb.d getCallerFrame() {
        ub.e<T> eVar = this.f13902a;
        if (eVar instanceof wb.d) {
            return (wb.d) eVar;
        }
        return null;
    }

    @Override // ub.e
    public final ub.h getContext() {
        return this.f13903b;
    }

    @Override // ub.e
    public final void resumeWith(Object obj) {
        this.f13902a.resumeWith(obj);
    }
}
