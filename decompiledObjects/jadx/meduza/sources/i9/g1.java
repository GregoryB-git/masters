package i9;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import i9.s;

/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7686c;

    public /* synthetic */ g1(int i10, Object obj, Object obj2) {
        this.f7684a = i10;
        this.f7685b = obj;
        this.f7686c = obj2;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7684a) {
            case 0:
                s.a aVar = (s.a) this.f7685b;
                SQLiteStatement sQLiteStatement = (SQLiteStatement) this.f7686c;
                j9.o oVar = (j9.o) obj;
                if (aVar.a(oVar)) {
                    String m10 = oVar.m();
                    j9.o s10 = oVar.s();
                    sQLiteStatement.clearBindings();
                    sQLiteStatement.bindString(1, m10);
                    sQLiteStatement.bindString(2, p2.m0.A(s10));
                    sQLiteStatement.execute();
                    break;
                }
                break;
            default:
                h1 h1Var = (h1) this.f7685b;
                String str = (String) this.f7686c;
                h1Var.getClass();
                int i10 = ((Cursor) obj).getInt(0);
                SQLiteStatement compileStatement = h1Var.f7693a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
                compileStatement.bindString(1, str);
                compileStatement.bindLong(2, i10);
                x6.b.Z("Mutation batch (%s, %d) did not exist", compileStatement.executeUpdateDelete() != 0, str, Integer.valueOf(i10));
                h1Var.f7693a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i10)});
                break;
        }
    }
}
