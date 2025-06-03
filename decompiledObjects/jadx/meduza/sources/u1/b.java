package u1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import dc.r;
import ec.i;
import i9.y0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14891b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f14890a = i10;
        this.f14891b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f14890a) {
            case 0:
                r rVar = (r) this.f14891b;
                i.e(rVar, "$tmp0");
                return rVar.d(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            default:
                y0.C(sQLiteQuery, (Object[]) this.f14891b);
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
