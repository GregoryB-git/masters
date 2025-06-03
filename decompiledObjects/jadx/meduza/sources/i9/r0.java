package i9;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7788c;

    public /* synthetic */ r0(int i10, Object obj, Object obj2) {
        this.f7786a = i10;
        this.f7787b = obj;
        this.f7788c = obj2;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7786a) {
            case 0:
                t0 t0Var = (t0) this.f7787b;
                h9.d dVar = (h9.d) obj;
                t0Var.f7798a.G("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(dVar.i()), t0Var.f7800c, dVar.f(), dVar.g(), ((j9.g) this.f7788c).getKey().toString());
                break;
            default:
                boolean[] zArr = (boolean[]) this.f7787b;
                SQLiteStatement sQLiteStatement = (SQLiteStatement) this.f7788c;
                zArr[0] = true;
                String string = ((Cursor) obj).getString(0);
                j9.o x10 = p2.m0.x(string);
                sQLiteStatement.clearBindings();
                sQLiteStatement.bindLong(1, x10.q());
                sQLiteStatement.bindString(2, string);
                x6.b.Z("Failed to update document path", sQLiteStatement.executeUpdateDelete() != -1, new Object[0]);
                break;
        }
    }
}
