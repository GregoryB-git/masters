package g9;

import g9.i;
import g9.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import t8.e;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f5959a;

    /* renamed from: b, reason: collision with root package name */
    public final k.a f5960b;

    /* renamed from: c, reason: collision with root package name */
    public final d9.l<s0> f5961c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5962d = false;

    /* renamed from: e, reason: collision with root package name */
    public d0 f5963e = d0.UNKNOWN;
    public s0 f;

    public g0(f0 f0Var, k.a aVar, d dVar) {
        this.f5959a = f0Var;
        this.f5961c = dVar;
        this.f5960b = aVar;
    }

    public final boolean a() {
        if (this.f5960b != null) {
            return !r0.f6001d.equals(d9.a0.CACHE);
        }
        return true;
    }

    public final boolean b(s0 s0Var) {
        boolean z10;
        boolean z11 = true;
        x6.b.Z("We got a new snapshot with no changes?", !s0Var.f6079d.isEmpty() || s0Var.f6081g, new Object[0]);
        if (!this.f5960b.f5998a) {
            ArrayList arrayList = new ArrayList();
            for (i iVar : s0Var.f6079d) {
                if (iVar.f5971a != i.a.METADATA) {
                    arrayList.add(iVar);
                }
            }
            s0Var = new s0(s0Var.f6076a, s0Var.f6077b, s0Var.f6078c, arrayList, s0Var.f6080e, s0Var.f, s0Var.f6081g, true, s0Var.f6083i);
        }
        if (this.f5962d) {
            if (s0Var.f6079d.isEmpty()) {
                s0 s0Var2 = this.f;
                z10 = (s0Var.f6081g || (s0Var2 != null && (s0Var2.f.f14652a.isEmpty() ^ true) != (s0Var.f.f14652a.isEmpty() ^ true))) ? this.f5960b.f5999b : false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.f5961c.a(s0Var, null);
            }
            z11 = false;
        } else {
            if (d(s0Var, this.f5963e)) {
                c(s0Var);
            }
            z11 = false;
        }
        this.f = s0Var;
        return z11;
    }

    public final void c(s0 s0Var) {
        x6.b.Z("Trying to raise initial event for second time", !this.f5962d, new Object[0]);
        f0 f0Var = s0Var.f6076a;
        j9.j jVar = s0Var.f6077b;
        t8.e<j9.i> eVar = s0Var.f;
        boolean z10 = s0Var.f6080e;
        boolean z11 = s0Var.f6082h;
        boolean z12 = s0Var.f6083i;
        ArrayList arrayList = new ArrayList();
        Iterator<j9.g> it = jVar.iterator();
        while (true) {
            e.a aVar = (e.a) it;
            if (!aVar.hasNext()) {
                s0 s0Var2 = new s0(f0Var, jVar, new j9.j(j9.h.f8681a, new t8.e(Collections.emptyList(), new o4.o(f0Var.a(), 1))), arrayList, z10, eVar, true, z11, z12);
                this.f5962d = true;
                this.f5961c.a(s0Var2, null);
                return;
            }
            arrayList.add(new i(i.a.ADDED, (j9.g) aVar.next()));
        }
    }

    public final boolean d(s0 s0Var, d0 d0Var) {
        x6.b.Z("Determining whether to raise first event but already had first event.", !this.f5962d, new Object[0]);
        if (!s0Var.f6080e || !a()) {
            return true;
        }
        d0 d0Var2 = d0.OFFLINE;
        boolean z10 = !d0Var.equals(d0Var2);
        if (!this.f5960b.f6000c || !z10) {
            return !s0Var.f6077b.f8685a.isEmpty() || s0Var.f6083i || d0Var.equals(d0Var2);
        }
        x6.b.Z("Waiting for sync, but snapshot is not from cache", s0Var.f6080e, new Object[0]);
        return false;
    }
}
