package i9;

import android.database.Cursor;
import j9.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7782b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7783c;

    public /* synthetic */ q0(int i10, Object obj, Object obj2) {
        this.f7781a = i10;
        this.f7782b = obj;
        this.f7783c = obj2;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7781a) {
            case 0:
                t0 t0Var = (t0) this.f7782b;
                h9.d dVar = (h9.d) obj;
                t0Var.f7798a.G("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(dVar.i()), t0Var.f7800c, dVar.f(), dVar.g(), ((j9.g) this.f7783c).getKey().toString());
                return;
            case 1:
                t0 t0Var2 = (t0) this.f7782b;
                Map map = (Map) this.f7783c;
                Cursor cursor = (Cursor) obj;
                t0Var2.getClass();
                try {
                    int i10 = cursor.getInt(0);
                    String string = cursor.getString(1);
                    i iVar = t0Var2.f7799b;
                    ia.a K = ia.a.K(cursor.getBlob(2));
                    iVar.getClass();
                    ArrayList a10 = i.a(K);
                    k.b bVar = map.containsKey(Integer.valueOf(i10)) ? (k.b) map.get(Integer.valueOf(i10)) : j9.k.f8687a;
                    j9.c cVar = j9.k.f8687a;
                    t0Var2.t(new j9.a(i10, string, a10, bVar));
                    return;
                } catch (ma.b0 e10) {
                    x6.b.T("Failed to decode index: " + e10, new Object[0]);
                    throw null;
                }
            default:
                w0 w0Var = (w0) this.f7782b;
                List list = (List) this.f7783c;
                Cursor cursor2 = (Cursor) obj;
                w0Var.getClass();
                list.add(w0Var.l(cursor2.getBlob(1), cursor2.getInt(0)));
                return;
        }
    }
}
