package nc;

/* loaded from: classes.dex */
public class m1 extends o1 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(j1 j1Var) {
        super(true);
        boolean z10 = true;
        J(j1Var);
        o oVar = (o) o1.f11523b.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar != null) {
            do {
                o1 m10 = pVar.m();
                if (m10.B()) {
                    break;
                }
                o oVar2 = (o) o1.f11523b.get(m10);
                pVar = oVar2 instanceof p ? (p) oVar2 : null;
            } while (pVar != null);
        }
        z10 = false;
        this.f11518c = z10;
    }

    @Override // nc.o1
    public final boolean B() {
        return this.f11518c;
    }

    @Override // nc.o1
    public final boolean D() {
        return true;
    }
}
