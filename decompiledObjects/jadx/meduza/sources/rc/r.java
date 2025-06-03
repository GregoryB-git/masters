package rc;

/* loaded from: classes.dex */
public final class r<T> implements qc.f<T> {

    /* renamed from: a, reason: collision with root package name */
    public final pc.t<T> f13901a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(pc.t<? super T> tVar) {
        this.f13901a = tVar;
    }

    @Override // qc.f
    public final Object emit(T t, ub.e<? super rb.h> eVar) {
        Object k10 = this.f13901a.k(t, eVar);
        return k10 == vb.a.f16085a ? k10 : rb.h.f13851a;
    }
}
