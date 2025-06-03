package m9;

import com.google.firebase.firestore.f;
import eb.e;
import eb.e1;
import eb.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import m9.v;

/* loaded from: classes.dex */
public final class t extends e.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v.a f10885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eb.e f10886b;

    public t(v.a aVar, eb.e eVar) {
        this.f10885a = aVar;
        this.f10886b = eVar;
    }

    @Override // eb.e.a
    public final void a(s0 s0Var, e1 e1Var) {
        i iVar = (i) this.f10885a;
        iVar.getClass();
        if (e1Var.e()) {
            iVar.f10807c.trySetResult(Collections.emptyList());
            return;
        }
        com.google.firebase.firestore.f g10 = n9.o.g(e1Var);
        if (g10.f3161a == f.a.UNAUTHENTICATED) {
            v vVar = iVar.f10808d.f10818c;
            vVar.f10894b.t();
            vVar.f10895c.t();
        }
        iVar.f10807c.trySetException(g10);
    }

    @Override // eb.e.a
    public final void c(Object obj) {
        j9.m n2;
        i iVar = (i) this.f10885a;
        iVar.getClass();
        iVar.f10805a.add((ka.e) obj);
        if (iVar.f10805a.size() == iVar.f10806b.size()) {
            HashMap hashMap = new HashMap();
            for (ka.e eVar : iVar.f10805a) {
                e0 e0Var = iVar.f10808d.f10816a;
                e0Var.getClass();
                if (q0.g.b(eVar.K(), 1)) {
                    x6.b.Z("Tried to deserialize a found document from a missing document.", q0.g.b(eVar.K(), 1), new Object[0]);
                    j9.i b10 = e0Var.b(eVar.H().L());
                    j9.n e10 = j9.n.e(eVar.H().K());
                    j9.q f = e0.f(eVar.H().M());
                    x6.b.Z("Got a document response with no snapshot version", !f.equals(j9.q.f8701b), new Object[0]);
                    n2 = new j9.m(b10);
                    n2.k(f, e10);
                } else {
                    if (!q0.g.b(eVar.K(), 2)) {
                        StringBuilder l10 = defpackage.f.l("Unknown result case: ");
                        l10.append(a0.j.w(eVar.K()));
                        throw new IllegalArgumentException(l10.toString());
                    }
                    x6.b.Z("Tried to deserialize a missing document from a found document.", q0.g.b(eVar.K(), 2), new Object[0]);
                    j9.i b11 = e0Var.b(eVar.I());
                    j9.q f10 = e0.f(eVar.J());
                    x6.b.Z("Got a no document response with no snapshot version", !f10.equals(j9.q.f8701b), new Object[0]);
                    n2 = j9.m.n(b11, f10);
                }
                hashMap.put(n2.f8693b, n2);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = iVar.f10806b.iterator();
            while (it.hasNext()) {
                arrayList.add((j9.m) hashMap.get((j9.i) it.next()));
            }
            iVar.f10807c.trySetResult(arrayList);
        }
        this.f10886b.c(1);
    }
}
