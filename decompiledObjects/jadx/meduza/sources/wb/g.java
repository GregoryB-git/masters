package wb;

/* loaded from: classes.dex */
public abstract class g extends a {
    public g(ub.e<Object> eVar) {
        super(eVar);
        if (eVar != null) {
            if (!(eVar.getContext() == ub.i.f15164a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // ub.e
    public final ub.h getContext() {
        return ub.i.f15164a;
    }
}
