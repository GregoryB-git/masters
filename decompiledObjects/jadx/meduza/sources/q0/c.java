package q0;

import android.content.Context;
import b.z;
import dc.l;
import java.util.List;
import jc.h;
import nc.d0;
import o0.i;
import o0.q;

/* loaded from: classes.dex */
public final class c implements fc.a<Context, i<r0.d>> {

    /* renamed from: a, reason: collision with root package name */
    public final String f13186a;

    /* renamed from: b, reason: collision with root package name */
    public final p0.a<r0.d> f13187b;

    /* renamed from: c, reason: collision with root package name */
    public final l<Context, List<o0.d<r0.d>>> f13188c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f13189d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13190e;
    public volatile r0.b f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, p0.a<r0.d> aVar, l<? super Context, ? extends List<? extends o0.d<r0.d>>> lVar, d0 d0Var) {
        ec.i.e(str, "name");
        this.f13186a = str;
        this.f13187b = aVar;
        this.f13188c = lVar;
        this.f13189d = d0Var;
        this.f13190e = new Object();
    }

    @Override // fc.a
    public final r0.b a(Object obj, h hVar) {
        r0.b bVar;
        Context context = (Context) obj;
        ec.i.e(context, "thisRef");
        ec.i.e(hVar, "property");
        r0.b bVar2 = this.f;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (this.f13190e) {
            if (this.f == null) {
                Context applicationContext = context.getApplicationContext();
                o0.b bVar3 = this.f13187b;
                l<Context, List<o0.d<r0.d>>> lVar = this.f13188c;
                ec.i.d(applicationContext, "applicationContext");
                List<o0.d<r0.d>> invoke = lVar.invoke(applicationContext);
                d0 d0Var = this.f13189d;
                b bVar4 = new b(applicationContext, this);
                ec.i.e(invoke, "migrations");
                ec.i.e(d0Var, "scope");
                r0.c cVar = new r0.c(bVar4);
                if (bVar3 == null) {
                    bVar3 = new z();
                }
                this.f = new r0.b(new q(cVar, va.a.f(new o0.e(invoke, null)), bVar3, d0Var));
            }
            bVar = this.f;
            ec.i.b(bVar);
        }
        return bVar;
    }
}
