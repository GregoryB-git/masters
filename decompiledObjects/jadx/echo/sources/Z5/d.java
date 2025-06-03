package Z5;

import X5.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class d extends a {
    private final X5.g _context;
    private transient X5.d intercepted;

    public d(X5.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    @Override // X5.d
    @NotNull
    public X5.g getContext() {
        X5.g gVar = this._context;
        Intrinsics.b(gVar);
        return gVar;
    }

    @NotNull
    public final X5.d intercepted() {
        X5.d dVar = this.intercepted;
        if (dVar == null) {
            X5.e eVar = (X5.e) getContext().b(X5.e.f7290c);
            if (eVar == null || (dVar = eVar.i(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // Z5.a
    public void releaseIntercepted() {
        X5.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b b7 = getContext().b(X5.e.f7290c);
            Intrinsics.b(b7);
            ((X5.e) b7).C(dVar);
        }
        this.intercepted = c.f7879o;
    }

    public d(X5.d dVar, X5.g gVar) {
        super(dVar);
        this._context = gVar;
    }
}
