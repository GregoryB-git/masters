package i9;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import i9.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ma.h;

/* loaded from: classes.dex */
public final class w0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f7834a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7835b;

    /* renamed from: c, reason: collision with root package name */
    public final f f7836c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7837d;

    /* renamed from: e, reason: collision with root package name */
    public int f7838e;
    public ma.h f;

    public w0(y0 y0Var, i iVar, e9.e eVar, f fVar) {
        this.f7834a = y0Var;
        this.f7835b = iVar;
        String str = eVar.f4854a;
        this.f7837d = str != null ? str : "";
        this.f = m9.q0.f10876w;
        this.f7836c = fVar;
    }

    @Override // i9.a0
    public final void a() {
        y0.d H = this.f7834a.H("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1");
        int i10 = 1;
        H.a(this.f7837d);
        Cursor e10 = H.e();
        try {
            boolean z10 = !e10.moveToFirst();
            e10.close();
            if (z10) {
                ArrayList arrayList = new ArrayList();
                y0.d H2 = this.f7834a.H("SELECT path FROM document_mutations WHERE uid = ?");
                H2.a(this.f7837d);
                H2.d(new o0(i10, arrayList));
                x6.b.Z("Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList.isEmpty(), arrayList);
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

    @Override // i9.a0
    public final void b(k9.g gVar) {
        SQLiteStatement compileStatement = this.f7834a.f7850i.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement compileStatement2 = this.f7834a.f7850i.compileStatement("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int i10 = gVar.f9153a;
        y0 y0Var = this.f7834a;
        Object[] objArr = {this.f7837d, Integer.valueOf(i10)};
        y0Var.getClass();
        x6.b.Z("Mutation batch (%s, %d) did not exist", y0.F(compileStatement, objArr) != 0, this.f7837d, Integer.valueOf(gVar.f9153a));
        Iterator<k9.f> it = gVar.f9156d.iterator();
        while (it.hasNext()) {
            j9.i iVar = it.next().f9150a;
            String A = p2.m0.A(iVar.f8684a);
            y0 y0Var2 = this.f7834a;
            Object[] objArr2 = {this.f7837d, A, Integer.valueOf(i10)};
            y0Var2.getClass();
            y0.F(compileStatement2, objArr2);
            this.f7834a.f7848g.p(iVar);
        }
    }

    @Override // i9.a0
    public final void c(ma.h hVar) {
        hVar.getClass();
        this.f = hVar;
        m();
    }

    @Override // i9.a0
    public final k9.g d(u7.m mVar, ArrayList arrayList, List list) {
        int i10 = this.f7838e;
        this.f7838e = i10 + 1;
        k9.g gVar = new k9.g(i10, mVar, arrayList, list);
        this.f7834a.G("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.f7837d, Integer.valueOf(i10), this.f7835b.f(gVar).j());
        HashSet hashSet = new HashSet();
        SQLiteStatement compileStatement = this.f7834a.f7850i.compileStatement("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j9.i iVar = ((k9.f) it.next()).f9150a;
            if (hashSet.add(iVar)) {
                String A = p2.m0.A(iVar.f8684a);
                y0 y0Var = this.f7834a;
                Object[] objArr = {this.f7837d, A, Integer.valueOf(i10)};
                y0Var.getClass();
                y0.F(compileStatement, objArr);
                this.f7836c.j(iVar.i());
            }
        }
        return gVar;
    }

    @Override // i9.a0
    public final ArrayList e(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(p2.m0.A(((j9.i) it.next()).f8684a));
        }
        y0.b bVar = new y0.b(this.f7834a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, this.f7837d), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (bVar.f.hasNext()) {
            bVar.a().d(new k0(this, hashSet, arrayList2, 1));
        }
        if (bVar.f7857e > 1) {
            Collections.sort(arrayList2, new b0.d(11));
        }
        return arrayList2;
    }

    @Override // i9.a0
    public final k9.g f(int i10) {
        y0.d H = this.f7834a.H("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1");
        H.a(1000000, this.f7837d, Integer.valueOf(i10 + 1));
        return (k9.g) H.c(new aa.m0(this, 4));
    }

    @Override // i9.a0
    public final int g() {
        y0.d H = this.f7834a.H("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?");
        H.a(-1, this.f7837d);
        return ((Integer) H.c(new d9.p(1))).intValue();
    }

    @Override // i9.a0
    public final k9.g h(int i10) {
        y0.d H = this.f7834a.H("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
        H.a(1000000, this.f7837d, Integer.valueOf(i10));
        Cursor e10 = H.e();
        try {
            k9.g l10 = e10.moveToFirst() ? l(e10.getBlob(0), i10) : null;
            e10.close();
            return l10;
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

    @Override // i9.a0
    public final ma.h i() {
        return this.f;
    }

    @Override // i9.a0
    public final void j(k9.g gVar, ma.h hVar) {
        hVar.getClass();
        this.f = hVar;
        m();
    }

    @Override // i9.a0
    public final List<k9.g> k() {
        ArrayList arrayList = new ArrayList();
        y0.d H = this.f7834a.H("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC");
        H.a(1000000, this.f7837d);
        H.d(new q0(2, this, arrayList));
        return arrayList;
    }

    public final k9.g l(byte[] bArr, int i10) {
        try {
            if (bArr.length < 1000000) {
                return this.f7835b.c(l9.e.S(bArr));
            }
            ArrayList arrayList = new ArrayList();
            h.C0164h c0164h = ma.h.f10961b;
            arrayList.add(ma.h.m(bArr, 0, bArr.length));
            boolean z10 = true;
            while (z10) {
                int size = (arrayList.size() * 1000000) + 1;
                y0.d H = this.f7834a.H("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
                H.a(Integer.valueOf(size), 1000000, this.f7837d, Integer.valueOf(i10));
                Cursor e10 = H.e();
                try {
                    if (e10.moveToFirst()) {
                        byte[] blob = e10.getBlob(0);
                        h.C0164h c0164h2 = ma.h.f10961b;
                        arrayList.add(ma.h.m(blob, 0, blob.length));
                        if (blob.length < 1000000) {
                            z10 = false;
                        }
                    }
                    e10.close();
                } finally {
                }
            }
            int size2 = arrayList.size();
            return this.f7835b.c(l9.e.R(size2 == 0 ? ma.h.f10961b : ma.h.h(arrayList.iterator(), size2)));
        } catch (ma.b0 e11) {
            x6.b.T("MutationBatch failed to parse: %s", e11);
            throw null;
        }
    }

    public final void m() {
        this.f7834a.G("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.f7837d, -1, this.f.z());
    }

    @Override // i9.a0
    public final void start() {
        ArrayList arrayList = new ArrayList();
        int i10 = 2;
        this.f7834a.H("SELECT uid FROM mutation_queues").d(new m(arrayList, 2));
        this.f7838e = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            y0.d H = this.f7834a.H("SELECT MAX(batch_id) FROM mutations WHERE uid = ?");
            H.a(str);
            H.d(new p0(this, i10));
        }
        this.f7838e++;
        y0.d H2 = this.f7834a.H("SELECT last_stream_token FROM mutation_queues WHERE uid = ?");
        H2.a(this.f7837d);
        if (H2.b(new l(this, 2)) == 0) {
            m();
        }
    }
}
