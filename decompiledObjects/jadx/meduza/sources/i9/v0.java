package i9;

import android.database.Cursor;
import android.util.SparseArray;
import i9.q;
import i9.y0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v0 implements f0, p {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f7821a;

    /* renamed from: b, reason: collision with root package name */
    public g9.a0 f7822b;

    /* renamed from: c, reason: collision with root package name */
    public long f7823c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final q f7824d;

    /* renamed from: e, reason: collision with root package name */
    public l3.l f7825e;

    public v0(y0 y0Var, q.b bVar) {
        this.f7821a = y0Var;
        this.f7824d = new q(this, bVar);
    }

    @Override // i9.p
    public final void a(n9.d<Long> dVar) {
        m mVar = (m) dVar;
        Cursor e10 = this.f7821a.H("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").e();
        while (e10.moveToNext()) {
            try {
                mVar.accept(Long.valueOf(e10.getLong(0)));
            } catch (Throwable th) {
                if (e10 != null) {
                    try {
                        e10.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        e10.close();
    }

    @Override // i9.p
    public final int b(long j10, SparseArray<?> sparseArray) {
        j1 j1Var = this.f7821a.f7846d;
        int[] iArr = new int[1];
        y0.d H = j1Var.f7710a.H("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?");
        H.a(Long.valueOf(j10));
        H.d(new s0(j1Var, sparseArray, iArr, 1));
        j1Var.m();
        return iArr[0];
    }

    @Override // i9.f0
    public final void c(j9.i iVar) {
        p(iVar);
    }

    @Override // i9.f0
    public final void d() {
        x6.b.Z("Committing a transaction without having started one", this.f7823c != -1, new Object[0]);
        this.f7823c = -1L;
    }

    @Override // i9.f0
    public final void e(j9.i iVar) {
        p(iVar);
    }

    @Override // i9.f0
    public final void f() {
        x6.b.Z("Starting a transaction without committing the previous one", this.f7823c == -1, new Object[0]);
        g9.a0 a0Var = this.f7822b;
        long j10 = a0Var.f5918a + 1;
        a0Var.f5918a = j10;
        this.f7823c = j10;
    }

    @Override // i9.p
    public final void g(l lVar) {
        j1 j1Var = this.f7821a.f7846d;
        j1Var.f7710a.H("SELECT target_proto FROM targets").d(new i1(0, j1Var, lVar));
    }

    @Override // i9.f0
    public final long h() {
        x6.b.Z("Attempting to get a sequence number outside of a transaction", this.f7823c != -1, new Object[0]);
        return this.f7823c;
    }

    @Override // i9.p
    public final long i() {
        y0 y0Var = this.f7821a;
        return ((Long) y0Var.H("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").c(new d9.q(2))).longValue() + y0Var.f7846d.f;
    }

    @Override // i9.p
    public final int j(long j10) {
        final int[] iArr = new int[1];
        final ArrayList arrayList = new ArrayList();
        final j9.o[] oVarArr = {j9.o.f8700b};
        while (true) {
            for (boolean z10 = true; z10; z10 = false) {
                y0.d H = this.f7821a.H("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?");
                H.a(Long.valueOf(j10), p2.m0.A(oVarArr[0]), 100);
                if (H.d(new n9.d() { // from class: i9.u0
                    @Override // n9.d
                    public final void accept(Object obj) {
                        boolean z11;
                        v0 v0Var = v0.this;
                        int[] iArr2 = iArr;
                        List list = arrayList;
                        j9.o[] oVarArr2 = oVarArr;
                        v0Var.getClass();
                        j9.o x10 = p2.m0.x(((Cursor) obj).getString(0));
                        j9.i iVar = new j9.i(x10);
                        if (v0Var.f7825e.a(iVar)) {
                            z11 = true;
                        } else {
                            y0.d H2 = v0Var.f7821a.H("SELECT 1 FROM document_mutations WHERE path = ?");
                            H2.a(p2.m0.A(iVar.f8684a));
                            Cursor e10 = H2.e();
                            try {
                                boolean z12 = !e10.moveToFirst();
                                e10.close();
                                z11 = !z12;
                            } catch (Throwable th) {
                                if (e10 != null) {
                                    try {
                                        e10.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }
                        if (!z11) {
                            iArr2[0] = iArr2[0] + 1;
                            list.add(iVar);
                            v0Var.f7821a.G("DELETE FROM target_documents WHERE path = ? AND target_id = 0", p2.m0.A(iVar.f8684a));
                        }
                        oVarArr2[0] = x10;
                    }
                }) == 100) {
                    break;
                }
            }
            this.f7821a.f.b(arrayList);
            return iArr[0];
        }
    }

    @Override // i9.f0
    public final void k(j9.i iVar) {
        p(iVar);
    }

    @Override // i9.p
    public final long l() {
        y0 y0Var = this.f7821a;
        return ((Long) y0Var.H("PRAGMA page_size").c(new d9.q(3))).longValue() * ((Long) y0Var.H("PRAGMA page_count").c(new d9.r(1))).longValue();
    }

    @Override // i9.f0
    public final void m(l3.l lVar) {
        this.f7825e = lVar;
    }

    @Override // i9.f0
    public final void n(j9.i iVar) {
        p(iVar);
    }

    @Override // i9.f0
    public final void o(m1 m1Var) {
        this.f7821a.f7846d.h(m1Var.b(h()));
    }

    public final void p(j9.i iVar) {
        this.f7821a.G("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", p2.m0.A(iVar.f8684a), Long.valueOf(h()));
    }
}
