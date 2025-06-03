package m9;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import eb.t0;
import n9.a;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public Task<eb.n0> f10903a = Tasks.call(n9.f.f11362c, new w(this, 0));

    /* renamed from: b, reason: collision with root package name */
    public final n9.a f10904b;

    /* renamed from: c, reason: collision with root package name */
    public eb.c f10905c;

    /* renamed from: d, reason: collision with root package name */
    public a.C0174a f10906d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f10907e;
    public final g9.h f;

    /* renamed from: g, reason: collision with root package name */
    public final eb.b f10908g;

    public y(n9.a aVar, Context context, g9.h hVar, n nVar) {
        this.f10904b = aVar;
        this.f10907e = context;
        this.f = hVar;
        this.f10908g = nVar;
    }

    public final <ReqT, RespT> Task<eb.e<ReqT, RespT>> a(t0<ReqT, RespT> t0Var) {
        return (Task<eb.e<ReqT, RespT>>) this.f10903a.continueWithTask(this.f10904b.f11322a, new r3.l(7, this, t0Var));
    }

    public final void b(eb.n0 n0Var) {
        eb.n E = n0Var.E();
        p2.m0.y(1, "GrpcCallProvider", "Current gRPC connectivity state: " + E, new Object[0]);
        if (this.f10906d != null) {
            p2.m0.w("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.f10906d.a();
            this.f10906d = null;
        }
        if (E == eb.n.CONNECTING) {
            p2.m0.y(1, "GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f10906d = this.f10904b.b(a.c.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new g.q(19, this, n0Var));
        }
        n0Var.F(E, new x0.f(20, this, n0Var));
    }
}
