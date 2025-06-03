package i9;

import android.database.Cursor;
import i9.y0;
import ja.a;
import ka.a0;

/* loaded from: classes.dex */
public final class i0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f7696a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7697b;

    public i0(y0 y0Var, i iVar) {
        this.f7696a = y0Var;
        this.f7697b = iVar;
    }

    @Override // i9.a
    public final f9.e a(String str) {
        y0.d H = this.f7696a.H("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?");
        H.a(str);
        return (f9.e) H.c(new defpackage.e(str, 3));
    }

    @Override // i9.a
    public final void b(f9.e eVar) {
        this.f7696a.G("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", eVar.f5490a, Integer.valueOf(eVar.f5491b), Long.valueOf(eVar.f5492c.f8702a.f15102a), Integer.valueOf(eVar.f5492c.f8702a.f15103b), Integer.valueOf(eVar.f5493d), Long.valueOf(eVar.f5494e));
    }

    @Override // i9.a
    public final void c(f9.j jVar) {
        i iVar = this.f7697b;
        f9.i iVar2 = jVar.f5509b;
        a0.c l10 = iVar.f7695a.l(iVar2.f5506a);
        a.C0125a M = ja.a.M();
        a.b bVar = q0.g.b(iVar2.f5507b, 1) ? a.b.FIRST : a.b.LAST;
        M.m();
        ja.a.I((ja.a) M.f11120b, bVar);
        String J = l10.J();
        M.m();
        ja.a.G((ja.a) M.f11120b, J);
        ka.z K = l10.K();
        M.m();
        ja.a.H((ja.a) M.f11120b, K);
        this.f7696a.G("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", jVar.f5508a, Long.valueOf(jVar.f5510c.f8702a.f15102a), Integer.valueOf(jVar.f5510c.f8702a.f15103b), M.k().j());
    }

    @Override // i9.a
    public final f9.j d(final String str) {
        y0.d H = this.f7696a.H("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?");
        H.a(str);
        return (f9.j) H.c(new n9.i() { // from class: i9.h0
            @Override // n9.i
            public final Object apply(Object obj) {
                i0 i0Var = i0.this;
                String str2 = str;
                Cursor cursor = (Cursor) obj;
                i0Var.getClass();
                if (cursor == null) {
                    return null;
                }
                try {
                    ja.a N = ja.a.N(cursor.getBlob(2));
                    i iVar = i0Var.f7697b;
                    iVar.getClass();
                    int i10 = N.J().equals(a.b.FIRST) ? 1 : 2;
                    m9.e0 e0Var = iVar.f7695a;
                    String K = N.K();
                    ka.z L = N.L();
                    e0Var.getClass();
                    return new f9.j(str2, new f9.i(m9.e0.e(K, L), i10), new j9.q(new u7.m(cursor.getInt(1), cursor.getLong(0))));
                } catch (ma.b0 e10) {
                    x6.b.T("NamedQuery failed to parse: %s", e10);
                    throw null;
                }
            }
        });
    }
}
