package Z5;

/* loaded from: classes.dex */
public abstract class j extends a {
    public j(X5.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != X5.h.f7293o) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // X5.d
    public X5.g getContext() {
        return X5.h.f7293o;
    }
}
