package wb;

import ub.f;
import ub.h;

/* loaded from: classes.dex */
public abstract class c extends a {
    private final ub.h _context;
    private transient ub.e<Object> intercepted;

    public c(ub.e<Object> eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }

    public c(ub.e<Object> eVar, ub.h hVar) {
        super(eVar);
        this._context = hVar;
    }

    @Override // ub.e
    public ub.h getContext() {
        ub.h hVar = this._context;
        ec.i.b(hVar);
        return hVar;
    }

    public final ub.e<Object> intercepted() {
        ub.e<Object> eVar = this.intercepted;
        if (eVar == null) {
            ub.f fVar = (ub.f) getContext().get(f.a.f15163a);
            if (fVar == null || (eVar = fVar.C(this)) == null) {
                eVar = this;
            }
            this.intercepted = eVar;
        }
        return eVar;
    }

    @Override // wb.a
    public void releaseIntercepted() {
        ub.e<?> eVar = this.intercepted;
        if (eVar != null && eVar != this) {
            ub.h context = getContext();
            int i10 = ub.f.f15162n;
            h.b bVar = context.get(f.a.f15163a);
            ec.i.b(bVar);
            ((ub.f) bVar).Q(eVar);
        }
        this.intercepted = b.f16480a;
    }
}
