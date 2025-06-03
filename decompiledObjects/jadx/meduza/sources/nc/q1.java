package nc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final /* synthetic */ class q1 extends ec.h implements dc.q<o1, Object, Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f11544a = new q1();

    public q1() {
        super(3, o1.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dc.q
    public final Object f(qc.f fVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o1.f11522a;
        ((o1) fVar).getClass();
        if (obj2 instanceof u) {
            throw ((u) obj2).f11555a;
        }
        return obj2;
    }
}
