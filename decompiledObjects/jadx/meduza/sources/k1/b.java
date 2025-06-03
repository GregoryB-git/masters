package k1;

import dc.l;
import ec.j;
import java.util.concurrent.CancellationException;
import nc.j0;
import rb.h;
import s.d;

/* loaded from: classes.dex */
public final class b extends j implements l<Throwable, h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.b<Object> f8837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0<Object> f8838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s.b<Object> bVar, j0<Object> j0Var) {
        super(1);
        this.f8837a = bVar;
        this.f8838b = j0Var;
    }

    @Override // dc.l
    public final h invoke(Throwable th) {
        Throwable th2 = th;
        boolean z10 = false;
        if (th2 == null) {
            s.b<Object> bVar = this.f8837a;
            Object completed = this.f8838b.getCompleted();
            bVar.f13936d = true;
            d<Object> dVar = bVar.f13934b;
            if (dVar != null && dVar.f13938b.p(completed)) {
                z10 = true;
            }
            if (z10) {
                bVar.f13933a = null;
                bVar.f13934b = null;
                bVar.f13935c = null;
            }
        } else if (th2 instanceof CancellationException) {
            s.b<Object> bVar2 = this.f8837a;
            bVar2.f13936d = true;
            d<Object> dVar2 = bVar2.f13934b;
            if (dVar2 != null && dVar2.f13938b.cancel(true)) {
                z10 = true;
            }
            if (z10) {
                bVar2.f13933a = null;
                bVar2.f13934b = null;
                bVar2.f13935c = null;
            }
        } else {
            s.b<Object> bVar3 = this.f8837a;
            bVar3.f13936d = true;
            d<Object> dVar3 = bVar3.f13934b;
            if (dVar3 != null && dVar3.f13938b.q(th2)) {
                z10 = true;
            }
            if (z10) {
                bVar3.f13933a = null;
                bVar3.f13934b = null;
                bVar3.f13935c = null;
            }
        }
        return h.f13851a;
    }
}
