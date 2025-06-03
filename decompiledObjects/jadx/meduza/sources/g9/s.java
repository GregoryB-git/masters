package g9;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f6074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6075c;

    public /* synthetic */ s(u uVar, Object obj, int i10) {
        this.f6073a = i10;
        this.f6074b = uVar;
        this.f6075c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6073a) {
            case 0:
                u uVar = this.f6074b;
                j9.i iVar = (j9.i) this.f6075c;
                i9.h hVar = uVar.f6092g.f;
                k9.k c10 = hVar.f7689c.c(iVar);
                j9.m g10 = (c10 == null || (c10.c() instanceof k9.l)) ? hVar.f7687a.g(iVar) : j9.m.m(iVar);
                if (c10 != null) {
                    c10.c().a(g10, k9.d.f9146b, new u7.m(new Date()));
                }
                return g10;
            default:
                u uVar2 = this.f6074b;
                f0 f0Var = (f0) this.f6075c;
                r4.c b10 = uVar2.f6092g.b(f0Var, true);
                r0 r0Var = new r0(f0Var, (t8.e) b10.f13613c);
                return (s0) r0Var.a(r0Var.c((t8.c) b10.f13612b, null), null, false).f3532b;
        }
    }
}
