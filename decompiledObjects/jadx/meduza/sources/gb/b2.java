package gb;

import eb.e;
import gb.r1;

/* loaded from: classes.dex */
public final class b2 extends z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.a f6201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eb.e1 f6202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(r1.f fVar, e.a aVar, eb.e1 e1Var) {
        super(fVar.f6745e);
        this.f6201b = aVar;
        this.f6202c = e1Var;
    }

    @Override // gb.z
    public final void a() {
        this.f6201b.a(new eb.s0(), this.f6202c);
    }
}
