package nc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.o1.d;

/* loaded from: classes.dex */
public final /* synthetic */ class p1 extends ec.h implements dc.q<o1, uc.f<?>, Object, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f11543a = new p1();

    public p1() {
        super(3, o1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dc.q
    public final Object f(qc.f fVar, Object obj, Object obj2) {
        o1 o1Var = (o1) fVar;
        uc.f fVar2 = (uc.f) obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o1.f11522a;
        while (true) {
            Object F = o1Var.F();
            if (!(F instanceof f1)) {
                if (!(F instanceof u)) {
                    F = p2.m0.f0(F);
                }
                fVar2.g(F);
            } else if (o1Var.U(F) >= 0) {
                fVar2.b(o1Var.invokeOnCompletion(o1Var.new d(fVar2)));
                break;
            }
        }
        return rb.h.f13851a;
    }
}
