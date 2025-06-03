package m9;

import com.google.firebase.firestore.f;
import eb.e1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ka.f0;
import m9.q0;
import ma.h;

/* loaded from: classes.dex */
public final class g0 implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f10790a;

    public g0(h0 h0Var) {
        this.f10790a = h0Var;
    }

    @Override // m9.j0
    public final void a() {
        q0 q0Var = this.f10790a.f10802j;
        x6.b.Z("Writing handshake requires an opened stream", q0Var.c(), new Object[0]);
        x6.b.Z("Handshake already completed", !q0Var.f10877u, new Object[0]);
        f0.a K = ka.f0.K();
        String str = q0Var.t.f10779b;
        K.m();
        ka.f0.G((ka.f0) K.f11120b, str);
        q0Var.i(K.k());
    }

    @Override // m9.q0.a
    public final void b(j9.q qVar, ArrayList arrayList) {
        h0 h0Var = this.f10790a;
        k9.g gVar = (k9.g) h0Var.f10804l.poll();
        ma.h hVar = h0Var.f10802j.f10878v;
        x6.b.Z("Mutations sent %d must equal results received %d", gVar.f9156d.size() == arrayList.size(), Integer.valueOf(gVar.f9156d.size()), Integer.valueOf(arrayList.size()));
        t8.b bVar = j9.h.f8681a;
        List<k9.f> list = gVar.f9156d;
        t8.c cVar = bVar;
        for (int i10 = 0; i10 < list.size(); i10++) {
            cVar = cVar.n(list.get(i10).f9150a, ((k9.i) arrayList.get(i10)).f9162a);
        }
        h0Var.f10795b.a(new k9.h(gVar, qVar, arrayList, hVar, cVar));
        h0Var.c();
    }

    @Override // m9.j0
    public final void c(e1 e1Var) {
        h0 h0Var = this.f10790a;
        h0Var.getClass();
        if (e1Var.e()) {
            x6.b.Z("Write stream was stopped gracefully while still needed.", !h0Var.h(), new Object[0]);
        }
        if (!e1Var.e() && !h0Var.f10804l.isEmpty()) {
            if (h0Var.f10802j.f10877u) {
                x6.b.Z("Handling write error with status OK.", !e1Var.e(), new Object[0]);
                HashSet hashSet = j.f10815d;
                if (j.a(f.a.f3171u.get(e1Var.f5081a.f5098a, f.a.UNKNOWN)) && !e1Var.f5081a.equals(e1.a.ABORTED)) {
                    k9.g gVar = (k9.g) h0Var.f10804l.poll();
                    h0Var.f10802j.b();
                    h0Var.f10795b.f(gVar.f9153a, e1Var);
                    h0Var.c();
                }
            } else {
                x6.b.Z("Handling write error with status OK.", !e1Var.e(), new Object[0]);
                HashSet hashSet2 = j.f10815d;
                if (j.a(f.a.f3171u.get(e1Var.f5081a.f5098a, f.a.UNKNOWN))) {
                    p2.m0.y(1, "RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", n9.o.i(h0Var.f10802j.f10878v), e1Var);
                    q0 q0Var = h0Var.f10802j;
                    h.C0164h c0164h = q0.f10876w;
                    q0Var.getClass();
                    c0164h.getClass();
                    q0Var.f10878v = c0164h;
                    i9.n nVar = h0Var.f10796c;
                    nVar.f7743a.y("Set stream token", new w.g(20, nVar, c0164h));
                }
            }
        }
        if (h0Var.h()) {
            x6.b.Z("startWriteStream() called when shouldStartWriteStream() is false.", h0Var.h(), new Object[0]);
            h0Var.f10802j.g();
        }
    }

    @Override // m9.q0.a
    public final void d() {
        h0 h0Var = this.f10790a;
        i9.n nVar = h0Var.f10796c;
        nVar.f7743a.y("Set stream token", new w.g(20, nVar, h0Var.f10802j.f10878v));
        Iterator it = h0Var.f10804l.iterator();
        while (it.hasNext()) {
            h0Var.f10802j.j(((k9.g) it.next()).f9156d);
        }
    }
}
