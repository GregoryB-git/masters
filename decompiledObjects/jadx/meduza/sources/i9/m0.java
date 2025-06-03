package i9;

import android.database.Cursor;
import i9.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f7731a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7732b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7733c;

    public m0(y0 y0Var, i iVar, e9.e eVar) {
        this.f7731a = y0Var;
        this.f7732b = iVar;
        String str = eVar.f4854a;
        this.f7733c = str != null ? str : "";
    }

    @Override // i9.b
    public final void a(int i10, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            j9.i iVar = (j9.i) entry.getKey();
            k9.f fVar = (k9.f) entry.getValue();
            Object[] objArr = {iVar};
            if (fVar == null) {
                throw new NullPointerException(String.format(Locale.US, "null value for key: %s", objArr));
            }
            this.f7731a.G("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.f7733c, iVar.f8684a.n(r3.q() - 2), p2.m0.A(iVar.f8684a.s()), iVar.f8684a.m(), Integer.valueOf(i10), this.f7732b.f7695a.k(fVar).j());
        }
    }

    @Override // i9.b
    public final HashMap b(int i10, int i11, String str) {
        final HashMap hashMap = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final n9.c cVar = new n9.c();
        y0.d H = this.f7731a.H("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?");
        H.a(this.f7733c, str, Integer.valueOf(i10), Integer.valueOf(i11));
        H.d(new n9.d() { // from class: i9.l0
            @Override // n9.d
            public final void accept(Object obj) {
                m0 m0Var = m0.this;
                int[] iArr2 = iArr;
                String[] strArr3 = strArr;
                String[] strArr4 = strArr2;
                n9.c cVar2 = cVar;
                Map<j9.i, k9.k> map = hashMap;
                Cursor cursor = (Cursor) obj;
                m0Var.getClass();
                iArr2[0] = cursor.getInt(1);
                strArr3[0] = cursor.getString(2);
                strArr4[0] = cursor.getString(3);
                m0Var.h(cVar2, map, cursor);
            }
        });
        if (strArr[0] == null) {
            return hashMap;
        }
        y0.d H2 = this.f7731a.H("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = strArr[0];
        H2.a(this.f7733c, str, str2, str2, strArr2[0], Integer.valueOf(iArr[0]));
        H2.d(new j0(this, cVar, hashMap, 1));
        cVar.a();
        return hashMap;
    }

    @Override // i9.b
    public final k9.k c(j9.i iVar) {
        String A = p2.m0.A(iVar.f8684a.s());
        String m10 = iVar.f8684a.m();
        y0.d H = this.f7731a.H("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?");
        H.a(this.f7733c, A, m10);
        return (k9.k) H.c(new aa.m0(this, 3));
    }

    @Override // i9.b
    public final HashMap d(TreeSet treeSet) {
        x6.b.Z("getOverlays() requires natural order", treeSet.comparator() == null, new Object[0]);
        HashMap hashMap = new HashMap();
        n9.c cVar = new n9.c();
        j9.o oVar = j9.o.f8700b;
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            j9.i iVar = (j9.i) it.next();
            if (!oVar.equals(iVar.i())) {
                i(hashMap, cVar, oVar, arrayList);
                oVar = iVar.i();
                arrayList.clear();
            }
            arrayList.add(iVar.f8684a.m());
        }
        i(hashMap, cVar, oVar, arrayList);
        cVar.a();
        return hashMap;
    }

    @Override // i9.b
    public final HashMap e(j9.o oVar, int i10) {
        HashMap hashMap = new HashMap();
        n9.c cVar = new n9.c();
        y0.d H = this.f7731a.H("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?");
        H.a(this.f7733c, p2.m0.A(oVar), Integer.valueOf(i10));
        H.d(new k0(this, cVar, hashMap, 0));
        cVar.a();
        return hashMap;
    }

    @Override // i9.b
    public final void f(int i10) {
        this.f7731a.G("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.f7733c, Integer.valueOf(i10));
    }

    public final k9.b g(byte[] bArr, int i10) {
        try {
            return new k9.b(i10, this.f7732b.f7695a.c(ka.e0.a0(bArr)));
        } catch (ma.b0 e10) {
            x6.b.T("Overlay failed to parse: %s", e10);
            throw null;
        }
    }

    public final void h(n9.c cVar, Map<j9.i, k9.k> map, Cursor cursor) {
        byte[] blob = cursor.getBlob(0);
        int i10 = cursor.getInt(1);
        Executor executor = cVar;
        if (cursor.isLast()) {
            executor = n9.f.f11361b;
        }
        executor.execute(new q3.f(this, blob, i10, map, 1));
    }

    public final void i(HashMap hashMap, n9.c cVar, j9.o oVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        y0.b bVar = new y0.b(this.f7731a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(this.f7733c, p2.m0.A(oVar)), arrayList, ")");
        while (bVar.f.hasNext()) {
            bVar.a().d(new j0(this, cVar, hashMap, 0));
        }
    }
}
