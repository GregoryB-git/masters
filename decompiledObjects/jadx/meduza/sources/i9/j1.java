package i9;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import i9.y0;
import java.util.Iterator;
import t8.e;

/* loaded from: classes.dex */
public final class j1 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f7710a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7711b;

    /* renamed from: c, reason: collision with root package name */
    public int f7712c;

    /* renamed from: d, reason: collision with root package name */
    public long f7713d;

    /* renamed from: e, reason: collision with root package name */
    public j9.q f7714e = j9.q.f8701b;
    public long f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public t8.e<j9.i> f7715a = j9.i.f8683c;
    }

    public j1(y0 y0Var, i iVar) {
        this.f7710a = y0Var;
        this.f7711b = iVar;
    }

    @Override // i9.l1
    public final m1 a(g9.k0 k0Var) {
        String b10 = k0Var.b();
        y0.d H = this.f7710a.H("SELECT target_proto FROM targets WHERE canonical_id = ?");
        H.a(b10);
        Cursor e10 = H.e();
        m1 m1Var = null;
        while (e10.moveToNext()) {
            try {
                m1 k10 = k(e10.getBlob(0));
                if (k0Var.equals(k10.f7734a)) {
                    m1Var = k10;
                }
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
        return m1Var;
    }

    @Override // i9.l1
    public final void b(t8.e<j9.i> eVar, int i10) {
        SQLiteStatement compileStatement = this.f7710a.f7850i.compileStatement("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        v0 v0Var = this.f7710a.f7848g;
        Iterator<j9.i> it = eVar.iterator();
        while (true) {
            e.a aVar = (e.a) it;
            if (!aVar.hasNext()) {
                return;
            }
            j9.i iVar = (j9.i) aVar.next();
            String A = p2.m0.A(iVar.f8684a);
            y0 y0Var = this.f7710a;
            Object[] objArr = {Integer.valueOf(i10), A};
            y0Var.getClass();
            y0.F(compileStatement, objArr);
            v0Var.p(iVar);
        }
    }

    @Override // i9.l1
    public final void c(m1 m1Var) {
        l(m1Var);
        int i10 = m1Var.f7735b;
        if (i10 > this.f7712c) {
            this.f7712c = i10;
        }
        long j10 = m1Var.f7736c;
        if (j10 > this.f7713d) {
            this.f7713d = j10;
        }
        this.f++;
        m();
    }

    @Override // i9.l1
    public final int d() {
        return this.f7712c;
    }

    @Override // i9.l1
    public final void e(t8.e<j9.i> eVar, int i10) {
        SQLiteStatement compileStatement = this.f7710a.f7850i.compileStatement("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        v0 v0Var = this.f7710a.f7848g;
        Iterator<j9.i> it = eVar.iterator();
        while (true) {
            e.a aVar = (e.a) it;
            if (!aVar.hasNext()) {
                return;
            }
            j9.i iVar = (j9.i) aVar.next();
            String A = p2.m0.A(iVar.f8684a);
            y0 y0Var = this.f7710a;
            Object[] objArr = {Integer.valueOf(i10), A};
            y0Var.getClass();
            y0.F(compileStatement, objArr);
            v0Var.p(iVar);
        }
    }

    @Override // i9.l1
    public final t8.e<j9.i> f(int i10) {
        a aVar = new a();
        y0.d H = this.f7710a.H("SELECT path FROM target_documents WHERE target_id = ?");
        H.a(Integer.valueOf(i10));
        H.d(new l(aVar, 3));
        return aVar.f7715a;
    }

    @Override // i9.l1
    public final j9.q g() {
        return this.f7714e;
    }

    @Override // i9.l1
    public final void h(m1 m1Var) {
        boolean z10;
        l(m1Var);
        int i10 = m1Var.f7735b;
        boolean z11 = true;
        if (i10 > this.f7712c) {
            this.f7712c = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = m1Var.f7736c;
        if (j10 > this.f7713d) {
            this.f7713d = j10;
        } else {
            z11 = z10;
        }
        if (z11) {
            m();
        }
    }

    @Override // i9.l1
    public final void i(int i10) {
        this.f7710a.G("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i10));
    }

    @Override // i9.l1
    public final void j(j9.q qVar) {
        this.f7714e = qVar;
        m();
    }

    public final m1 k(byte[] bArr) {
        try {
            return this.f7711b.d(l9.c.X(bArr));
        } catch (ma.b0 e10) {
            x6.b.T("TargetData failed to parse: %s", e10);
            throw null;
        }
    }

    public final void l(m1 m1Var) {
        int i10 = m1Var.f7735b;
        String b10 = m1Var.f7734a.b();
        u7.m mVar = m1Var.f7738e.f8702a;
        this.f7710a.G("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(i10), b10, Long.valueOf(mVar.f15102a), Integer.valueOf(mVar.f15103b), m1Var.f7739g.z(), Long.valueOf(m1Var.f7736c), this.f7711b.g(m1Var).j());
    }

    public final void m() {
        this.f7710a.G("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f7712c), Long.valueOf(this.f7713d), Long.valueOf(this.f7714e.f8702a.f15102a), Integer.valueOf(this.f7714e.f8702a.f15103b), Long.valueOf(this.f));
    }
}
