package m9;

import eb.e;
import eb.e1;
import eb.s0;
import m9.a;

/* loaded from: classes.dex */
public final class r extends e.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f10879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eb.e[] f10880b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f10881c;

    public r(v vVar, a0 a0Var, eb.e[] eVarArr) {
        this.f10881c = vVar;
        this.f10879a = a0Var;
        this.f10880b = eVarArr;
    }

    @Override // eb.e.a
    public final void a(s0 s0Var, e1 e1Var) {
        try {
            a.c cVar = (a.c) this.f10879a;
            cVar.f10745a.a(new w.g(21, cVar, e1Var));
        } catch (Throwable th) {
            this.f10881c.f10893a.c(th);
        }
    }

    @Override // eb.e.a
    public final void b(s0 s0Var) {
        try {
            a.c cVar = (a.c) this.f10879a;
            cVar.f10745a.a(new x0.f(19, cVar, s0Var));
        } catch (Throwable th) {
            this.f10881c.f10893a.c(th);
        }
    }

    @Override // eb.e.a
    public final void c(Object obj) {
        try {
            a.c cVar = (a.c) this.f10879a;
            int i10 = cVar.f10746b + 1;
            cVar.f10745a.a(new n1.a(cVar, i10, obj, 2));
            cVar.f10746b = i10;
            this.f10880b[0].c(1);
        } catch (Throwable th) {
            this.f10881c.f10893a.c(th);
        }
    }

    @Override // eb.e.a
    public final void d() {
    }
}
