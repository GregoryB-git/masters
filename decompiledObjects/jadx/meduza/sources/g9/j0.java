package g9;

import com.google.android.gms.tasks.TaskCompletionSource;
import eb.e1;
import g9.k;
import g9.r0;
import i9.m1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import m9.h0;
import t8.e;

/* loaded from: classes.dex */
public final class j0 implements h0.a {

    /* renamed from: a, reason: collision with root package name */
    public final i9.n f5979a;

    /* renamed from: b, reason: collision with root package name */
    public final m9.h0 f5980b;

    /* renamed from: e, reason: collision with root package name */
    public final int f5983e;

    /* renamed from: m, reason: collision with root package name */
    public e9.e f5990m;

    /* renamed from: n, reason: collision with root package name */
    public b f5991n;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5981c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5982d = new HashMap();
    public final LinkedHashSet<j9.i> f = new LinkedHashSet<>();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f5984g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f5985h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final l3.l f5986i = new l3.l(6);

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f5987j = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final l0 f5989l = new l0(1, 1);

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f5988k = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final j9.i f5992a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5993b;

        public a(j9.i iVar) {
            this.f5992a = iVar;
        }
    }

    public interface b {
    }

    public j0(i9.n nVar, m9.h0 h0Var, e9.e eVar, int i10) {
        this.f5979a = nVar;
        this.f5980b = h0Var;
        this.f5983e = i10;
        this.f5990m = eVar;
    }

    public static void j(e1 e1Var, String str, Object... objArr) {
        e1.a aVar = e1Var.f5081a;
        String str2 = e1Var.f5082b;
        if (str2 == null) {
            str2 = "";
        }
        if ((aVar == e1.a.FAILED_PRECONDITION && str2.contains("requires an index")) || aVar == e1.a.PERMISSION_DENIED) {
            p2.m0.y(2, "Firestore", "%s: %s", String.format(str, objArr), e1Var);
        }
    }

    @Override // m9.h0.a
    public final void a(k9.h hVar) {
        g("handleSuccessfulWrite");
        k(hVar.f9157a.f9153a, null);
        o(hVar.f9157a.f9153a);
        i9.n nVar = this.f5979a;
        h((t8.c) nVar.f7743a.x("Acknowledge batch", new r3.l(6, nVar, hVar)), null);
    }

    @Override // m9.h0.a
    public final void b(d0 d0Var) {
        boolean z10;
        d5.n nVar;
        g("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5981c.entrySet().iterator();
        while (it.hasNext()) {
            r0 r0Var = ((h0) ((Map.Entry) it.next()).getValue()).f5970c;
            if (r0Var.f6065c && d0Var == d0.OFFLINE) {
                r0Var.f6065c = false;
                nVar = r0Var.a(new r0.a(r0Var.f6066d, new j(), r0Var.f6068g, false), null, false);
            } else {
                nVar = new d5.n(2, null, Collections.emptyList());
            }
            x6.b.Z("OnlineState should not affect limbo documents.", ((List) nVar.f3533c).isEmpty(), new Object[0]);
            s0 s0Var = (s0) nVar.f3532b;
            if (s0Var != null) {
                arrayList.add(s0Var);
            }
        }
        ((k) this.f5991n).a(arrayList);
        k kVar = (k) this.f5991n;
        kVar.f5997d = d0Var;
        Iterator it2 = kVar.f5995b.values().iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            Iterator it3 = ((k.b) it2.next()).f6002a.iterator();
            while (it3.hasNext()) {
                g0 g0Var = (g0) it3.next();
                g0Var.f5963e = d0Var;
                s0 s0Var2 = g0Var.f;
                if (s0Var2 == null || g0Var.f5962d || !g0Var.d(s0Var2, d0Var)) {
                    z10 = false;
                } else {
                    g0Var.c(g0Var.f);
                    z10 = true;
                }
                if (z10) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            kVar.b();
        }
    }

    @Override // m9.h0.a
    public final void c(m9.d0 d0Var) {
        g("handleRemoteEvent");
        for (Map.Entry entry : ((Map) d0Var.f10769b).entrySet()) {
            Integer num = (Integer) entry.getKey();
            m9.k0 k0Var = (m9.k0) entry.getValue();
            a aVar = (a) this.f5985h.get(num);
            if (aVar != null) {
                x6.b.Z("Limbo resolution for single document contains multiple changes.", k0Var.f10825e.size() + (k0Var.f10824d.size() + k0Var.f10823c.size()) <= 1, new Object[0]);
                if (k0Var.f10823c.size() > 0) {
                    aVar.f5993b = true;
                } else if (k0Var.f10824d.size() > 0) {
                    x6.b.Z("Received change for limbo target document without add.", aVar.f5993b, new Object[0]);
                } else if (k0Var.f10825e.size() > 0) {
                    x6.b.Z("Received remove for limbo target document without add.", aVar.f5993b, new Object[0]);
                    aVar.f5993b = false;
                }
            }
        }
        i9.n nVar = this.f5979a;
        nVar.getClass();
        h((t8.c) nVar.f7743a.x("Apply remote event", new p3.b(nVar, d0Var, (j9.q) d0Var.f10768a)), d0Var);
    }

    @Override // m9.h0.a
    public final t8.e<j9.i> d(int i10) {
        a aVar = (a) this.f5985h.get(Integer.valueOf(i10));
        if (aVar != null && aVar.f5993b) {
            return j9.i.f8683c.a(aVar.f5992a);
        }
        t8.e eVar = j9.i.f8683c;
        if (this.f5982d.containsKey(Integer.valueOf(i10))) {
            for (f0 f0Var : (List) this.f5982d.get(Integer.valueOf(i10))) {
                if (this.f5981c.containsKey(f0Var)) {
                    t8.e eVar2 = ((h0) this.f5981c.get(f0Var)).f5970c.f6067e;
                    int size = eVar.size();
                    int size2 = eVar2.size();
                    t8.e eVar3 = eVar2;
                    if (size >= size2) {
                        eVar3 = eVar;
                        eVar = eVar2;
                    }
                    Iterator<j9.i> it = eVar.iterator();
                    t8.e eVar4 = eVar3;
                    while (true) {
                        e.a aVar2 = (e.a) it;
                        if (!aVar2.hasNext()) {
                            break;
                        }
                        eVar4 = eVar4.a(aVar2.next());
                    }
                    eVar = eVar4;
                }
            }
        }
        return eVar;
    }

    @Override // m9.h0.a
    public final void e(int i10, e1 e1Var) {
        g("handleRejectedListen");
        a aVar = (a) this.f5985h.get(Integer.valueOf(i10));
        j9.i iVar = aVar != null ? aVar.f5992a : null;
        if (iVar == null) {
            i9.n nVar = this.f5979a;
            nVar.f7743a.y("Release target", new i9.k(nVar, i10));
            m(i10, e1Var);
        } else {
            this.f5984g.remove(iVar);
            this.f5985h.remove(Integer.valueOf(i10));
            l();
            j9.q qVar = j9.q.f8701b;
            c(new m9.d0(qVar, Collections.emptyMap(), Collections.emptyMap(), Collections.singletonMap(iVar, j9.m.n(iVar, qVar)), Collections.singleton(iVar)));
        }
    }

    @Override // m9.h0.a
    public final void f(int i10, e1 e1Var) {
        g("handleRejectedWrite");
        i9.n nVar = this.f5979a;
        t8.c<j9.i, j9.g> cVar = (t8.c) nVar.f7743a.x("Reject batch", new v3.y(nVar, i10, 2));
        if (!cVar.isEmpty()) {
            j(e1Var, "Write failed at %s", cVar.l().f8684a);
        }
        k(i10, e1Var);
        o(i10);
        h(cVar, null);
    }

    public final void g(String str) {
        x6.b.Z("Trying to call %s before setting callback", this.f5991n != null, str);
    }

    public final void h(t8.c<j9.i, j9.g> cVar, m9.d0 d0Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f5981c.entrySet().iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) ((Map.Entry) it.next()).getValue();
            r0 r0Var = h0Var.f5970c;
            r0.a c10 = r0Var.c(cVar, null);
            boolean z10 = false;
            if (c10.f6071c) {
                c10 = r0Var.c((t8.c) this.f5979a.b(h0Var.f5968a, false).f13612b, c10);
            }
            m9.k0 k0Var = d0Var != null ? (m9.k0) ((Map) d0Var.f10769b).get(Integer.valueOf(h0Var.f5969b)) : null;
            if (d0Var != null && ((Map) d0Var.f10770c).get(Integer.valueOf(h0Var.f5969b)) != null) {
                z10 = true;
            }
            d5.n a10 = h0Var.f5970c.a(c10, k0Var, z10);
            q(h0Var.f5969b, (List) a10.f3533c);
            s0 s0Var = (s0) a10.f3532b;
            if (s0Var != null) {
                arrayList.add(s0Var);
                int i10 = h0Var.f5969b;
                s0 s0Var2 = (s0) a10.f3532b;
                ArrayList arrayList3 = new ArrayList();
                v4.d dVar = j9.i.f8682b;
                t8.e eVar = new t8.e(arrayList3, dVar);
                t8.e eVar2 = new t8.e(new ArrayList(), dVar);
                for (i iVar : s0Var2.f6079d) {
                    int ordinal = iVar.f5971a.ordinal();
                    if (ordinal == 0) {
                        eVar2 = eVar2.a(iVar.f5972b.getKey());
                    } else if (ordinal == 1) {
                        eVar = eVar.a(iVar.f5972b.getKey());
                    }
                }
                arrayList2.add(new i9.o(i10, s0Var2.f6080e, eVar, eVar2));
            }
        }
        ((k) this.f5991n).a(arrayList);
        i9.n nVar = this.f5979a;
        nVar.f7743a.y("notifyLocalViewChanges", new w.g(19, nVar, arrayList2));
    }

    public final int i(f0 f0Var, boolean z10) {
        g("listen");
        x6.b.Z("We already listen to query: %s", !this.f5981c.containsKey(f0Var), f0Var);
        m1 a10 = this.f5979a.a(f0Var.i());
        int i10 = a10.f7735b;
        ma.h hVar = a10.f7739g;
        r4.c b10 = this.f5979a.b(f0Var, true);
        boolean z11 = (this.f5982d.get(Integer.valueOf(i10)) != null ? ((h0) this.f5981c.get((f0) ((List) this.f5982d.get(Integer.valueOf(i10))).get(0))).f5970c.f6064b : 1) == 3;
        t8.e<j9.i> eVar = j9.i.f8683c;
        m9.k0 k0Var = new m9.k0(hVar, z11, eVar, eVar, eVar);
        r0 r0Var = new r0(f0Var, (t8.e) b10.f13613c);
        d5.n a11 = r0Var.a(r0Var.c((t8.c) b10.f13612b, null), k0Var, false);
        q(i10, (List) a11.f3533c);
        this.f5981c.put(f0Var, new h0(f0Var, i10, r0Var));
        if (!this.f5982d.containsKey(Integer.valueOf(i10))) {
            this.f5982d.put(Integer.valueOf(i10), new ArrayList(1));
        }
        ((List) this.f5982d.get(Integer.valueOf(i10))).add(f0Var);
        ((k) this.f5991n).a(Collections.singletonList((s0) a11.f3532b));
        if (z10) {
            this.f5980b.d(a10);
        }
        return a10.f7735b;
    }

    public final void k(int i10, e1 e1Var) {
        Map map = (Map) this.f5987j.get(this.f5990m);
        if (map != null) {
            Integer valueOf = Integer.valueOf(i10);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) map.get(valueOf);
            if (taskCompletionSource != null) {
                if (e1Var != null) {
                    taskCompletionSource.setException(n9.o.g(e1Var));
                } else {
                    taskCompletionSource.setResult(null);
                }
                map.remove(valueOf);
            }
        }
    }

    public final void l() {
        while (!this.f.isEmpty() && this.f5984g.size() < this.f5983e) {
            Iterator<j9.i> it = this.f.iterator();
            j9.i next = it.next();
            it.remove();
            l0 l0Var = this.f5989l;
            int i10 = l0Var.f6024a;
            l0Var.f6024a = i10 + 2;
            this.f5985h.put(Integer.valueOf(i10), new a(next));
            this.f5984g.put(next, Integer.valueOf(i10));
            this.f5980b.d(new m1(new f0(next.f8684a, null).i(), i10, -1L, i9.e0.LIMBO_RESOLUTION));
        }
    }

    public final void m(int i10, e1 e1Var) {
        for (f0 f0Var : (List) this.f5982d.get(Integer.valueOf(i10))) {
            this.f5981c.remove(f0Var);
            if (!e1Var.e()) {
                k kVar = (k) this.f5991n;
                k.b bVar = (k.b) kVar.f5995b.get(f0Var);
                if (bVar != null) {
                    Iterator it = bVar.f6002a.iterator();
                    while (it.hasNext()) {
                        ((g0) it.next()).f5961c.a(null, n9.o.g(e1Var));
                    }
                }
                kVar.f5995b.remove(f0Var);
                j(e1Var, "Listen for %s failed", f0Var);
            }
        }
        this.f5982d.remove(Integer.valueOf(i10));
        t8.e c10 = this.f5986i.c(i10);
        this.f5986i.d(i10);
        Iterator it2 = c10.iterator();
        while (true) {
            e.a aVar = (e.a) it2;
            if (!aVar.hasNext()) {
                return;
            }
            j9.i iVar = (j9.i) aVar.next();
            if (!this.f5986i.a(iVar)) {
                n(iVar);
            }
        }
    }

    public final void n(j9.i iVar) {
        this.f.remove(iVar);
        Integer num = (Integer) this.f5984g.get(iVar);
        if (num != null) {
            this.f5980b.j(num.intValue());
            this.f5984g.remove(iVar);
            this.f5985h.remove(num);
            l();
        }
    }

    public final void o(int i10) {
        if (this.f5988k.containsKey(Integer.valueOf(i10))) {
            Iterator it = ((List) this.f5988k.get(Integer.valueOf(i10))).iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).setResult(null);
            }
            this.f5988k.remove(Integer.valueOf(i10));
        }
    }

    public final void p(f0 f0Var, boolean z10) {
        g("stopListening");
        h0 h0Var = (h0) this.f5981c.get(f0Var);
        x6.b.Z("Trying to stop listening to a query not found", h0Var != null, new Object[0]);
        this.f5981c.remove(f0Var);
        int i10 = h0Var.f5969b;
        List list = (List) this.f5982d.get(Integer.valueOf(i10));
        list.remove(f0Var);
        if (list.isEmpty()) {
            i9.n nVar = this.f5979a;
            nVar.f7743a.y("Release target", new i9.k(nVar, i10));
            if (z10) {
                this.f5980b.j(i10);
            }
            m(i10, e1.f5070e);
        }
    }

    public final void q(int i10, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            int ordinal = zVar.f6101a.ordinal();
            if (ordinal == 0) {
                l3.l lVar = this.f5986i;
                j9.i iVar = zVar.f6102b;
                lVar.getClass();
                i9.c cVar = new i9.c(i10, iVar);
                lVar.f9559a = ((t8.e) lVar.f9559a).a(cVar);
                lVar.f9560b = ((t8.e) lVar.f9560b).a(cVar);
                j9.i iVar2 = zVar.f6102b;
                if (!this.f5984g.containsKey(iVar2) && !this.f.contains(iVar2)) {
                    p2.m0.y(1, "j0", "New document in limbo: %s", iVar2);
                    this.f.add(iVar2);
                    l();
                }
            } else {
                if (ordinal != 1) {
                    x6.b.T("Unknown limbo change type: %s", zVar.f6101a);
                    throw null;
                }
                p2.m0.y(1, "j0", "Document no longer in limbo: %s", zVar.f6102b);
                j9.i iVar3 = zVar.f6102b;
                l3.l lVar2 = this.f5986i;
                lVar2.getClass();
                i9.c cVar2 = new i9.c(i10, iVar3);
                lVar2.f9559a = ((t8.e) lVar2.f9559a).i(cVar2);
                lVar2.f9560b = ((t8.e) lVar2.f9560b).i(cVar2);
                if (!this.f5986i.a(iVar3)) {
                    n(iVar3);
                }
            }
        }
    }
}
