package gb;

import eb.e;
import gb.q;

/* loaded from: classes.dex */
public final class r extends z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eb.e1 f6698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eb.s0 f6699c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q.b f6700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q.b bVar, eb.e1 e1Var, eb.s0 s0Var) {
        super(q.this.f);
        this.f6700d = bVar;
        this.f6698b = e1Var;
        this.f6699c = s0Var;
    }

    @Override // gb.z
    public final void a() {
        pb.b.c();
        try {
            pb.c cVar = q.this.f6657b;
            pb.b.a();
            pb.a aVar = pb.b.f13110a;
            aVar.getClass();
            b();
            aVar.getClass();
        } catch (Throwable th) {
            try {
                pb.b.f13110a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        eb.e1 e1Var = this.f6698b;
        eb.s0 s0Var = this.f6699c;
        eb.e1 e1Var2 = this.f6700d.f6678b;
        if (e1Var2 != null) {
            s0Var = new eb.s0();
            e1Var = e1Var2;
        }
        q.this.f6665k = true;
        try {
            q.b bVar = this.f6700d;
            q qVar = q.this;
            e.a<RespT> aVar = bVar.f6677a;
            qVar.getClass();
            aVar.a(s0Var, e1Var);
        } finally {
            q.this.g();
            m mVar = q.this.f6660e;
            (e1Var.e() ? mVar.f6597c : mVar.f6598d).b();
        }
    }
}
