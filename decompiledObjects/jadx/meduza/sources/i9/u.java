package i9;

import android.util.SparseArray;
import i9.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class u implements f0, p {

    /* renamed from: a, reason: collision with root package name */
    public final w f7807a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7808b;

    /* renamed from: d, reason: collision with root package name */
    public l3.l f7810d;

    /* renamed from: e, reason: collision with root package name */
    public final g9.a0 f7811e;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7809c = new HashMap();
    public long f = -1;

    public u(w wVar, q.b bVar, i iVar) {
        this.f7807a = wVar;
        this.f7808b = iVar;
        this.f7811e = new g9.a0(wVar.f.f7867e);
    }

    @Override // i9.p
    public final void a(n9.d<Long> dVar) {
        for (Map.Entry entry : this.f7809c.entrySet()) {
            if (!p((j9.i) entry.getKey(), ((Long) entry.getValue()).longValue())) {
                dVar.accept((Long) entry.getValue());
            }
        }
    }

    @Override // i9.p
    public final int b(long j10, SparseArray<?> sparseArray) {
        z zVar = this.f7807a.f;
        Iterator it = zVar.f7863a.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i11 = ((m1) entry.getValue()).f7735b;
            if (((m1) entry.getValue()).f7736c <= j10 && sparseArray.get(i11) == null) {
                it.remove();
                zVar.i(i11);
                i10++;
            }
        }
        return i10;
    }

    @Override // i9.f0
    public final void c(j9.i iVar) {
        this.f7809c.put(iVar, Long.valueOf(h()));
    }

    @Override // i9.f0
    public final void d() {
        x6.b.Z("Committing a transaction without having started one", this.f != -1, new Object[0]);
        this.f = -1L;
    }

    @Override // i9.f0
    public final void e(j9.i iVar) {
        this.f7809c.put(iVar, Long.valueOf(h()));
    }

    @Override // i9.f0
    public final void f() {
        x6.b.Z("Starting a transaction without committing the previous one", this.f == -1, new Object[0]);
        g9.a0 a0Var = this.f7811e;
        long j10 = a0Var.f5918a + 1;
        a0Var.f5918a = j10;
        this.f = j10;
    }

    @Override // i9.p
    public final void g(l lVar) {
        Iterator it = this.f7807a.f.f7863a.values().iterator();
        while (it.hasNext()) {
            lVar.accept((m1) it.next());
        }
    }

    @Override // i9.f0
    public final long h() {
        x6.b.Z("Attempting to get a sequence number outside of a transaction", this.f != -1, new Object[0]);
        return this.f;
    }

    @Override // i9.p
    public final long i() {
        long size = this.f7807a.f.f7863a.size();
        long[] jArr = new long[1];
        a(new t(jArr, 0));
        return size + jArr[0];
    }

    @Override // i9.p
    public final int j(long j10) {
        y yVar = this.f7807a.f7831h;
        ArrayList arrayList = new ArrayList();
        yVar.getClass();
        x xVar = new x(yVar.f7841a.iterator());
        while (xVar.hasNext()) {
            j9.i key = ((j9.g) xVar.next()).getKey();
            if (!p(key, j10)) {
                arrayList.add(key);
                this.f7809c.remove(key);
            }
        }
        yVar.b(arrayList);
        return arrayList.size();
    }

    @Override // i9.f0
    public final void k(j9.i iVar) {
        this.f7809c.put(iVar, Long.valueOf(h()));
    }

    @Override // i9.p
    public final long l() {
        z zVar = this.f7807a.f;
        i iVar = this.f7808b;
        long j10 = 0;
        while (zVar.f7863a.entrySet().iterator().hasNext()) {
            j10 += iVar.g((m1) ((Map.Entry) r0.next()).getValue()).m(null);
        }
        long j11 = j10 + 0;
        y yVar = this.f7807a.f7831h;
        i iVar2 = this.f7808b;
        yVar.getClass();
        long j12 = 0;
        while (new x(yVar.f7841a.iterator()).hasNext()) {
            j12 += iVar2.e((j9.g) r6.next()).m(null);
        }
        long j13 = j11 + j12;
        for (v vVar : this.f7807a.f7827c.values()) {
            i iVar3 = this.f7808b;
            long j14 = 0;
            while (vVar.f7816a.iterator().hasNext()) {
                j14 += iVar3.f((k9.g) r1.next()).m(null);
            }
            j13 += j14;
        }
        return j13;
    }

    @Override // i9.f0
    public final void m(l3.l lVar) {
        this.f7810d = lVar;
    }

    @Override // i9.f0
    public final void n(j9.i iVar) {
        this.f7809c.put(iVar, Long.valueOf(h()));
    }

    @Override // i9.f0
    public final void o(m1 m1Var) {
        this.f7807a.f.c(m1Var.b(h()));
    }

    public final boolean p(j9.i iVar, long j10) {
        boolean z10;
        Iterator it = this.f7807a.f7827c.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (((v) it.next()).l(iVar)) {
                z10 = true;
                break;
            }
        }
        if (z10 || this.f7810d.a(iVar) || this.f7807a.f.f7864b.a(iVar)) {
            return true;
        }
        Long l10 = (Long) this.f7809c.get(iVar);
        return l10 != null && l10.longValue() > j10;
    }
}
