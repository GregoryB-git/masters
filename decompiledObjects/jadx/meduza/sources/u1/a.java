package u1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import ec.i;
import java.util.List;
import va.t;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14889b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f14888a = i10;
        this.f14889b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        long j10;
        switch (this.f14888a) {
            case 0:
                t1.e eVar = (t1.e) this.f14889b;
                i.e(eVar, "$query");
                i.b(sQLiteQuery);
                eVar.f(new f(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                t tVar = (t) this.f14889b;
                List<Object> list = tVar.f16084b;
                if (list != null) {
                    int size = list.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object a10 = t.a(tVar.f16084b.get(i10));
                        int i11 = i10 + 1;
                        if (a10 == null) {
                            sQLiteQuery.bindNull(i11);
                        } else if (a10 instanceof byte[]) {
                            sQLiteQuery.bindBlob(i11, (byte[]) a10);
                        } else if (a10 instanceof Double) {
                            sQLiteQuery.bindDouble(i11, ((Double) a10).doubleValue());
                        } else {
                            if (a10 instanceof Integer) {
                                j10 = ((Integer) a10).intValue();
                            } else if (a10 instanceof Long) {
                                j10 = ((Long) a10).longValue();
                            } else if (a10 instanceof String) {
                                sQLiteQuery.bindString(i11, (String) a10);
                            } else {
                                if (!(a10 instanceof Boolean)) {
                                    throw new IllegalArgumentException("Could not bind " + a10 + " from index " + i10 + ": Supported types are null, byte[], double, long, boolean and String");
                                }
                                j10 = ((Boolean) a10).booleanValue() ? 1L : 0L;
                            }
                            sQLiteQuery.bindLong(i11, j10);
                        }
                        i10 = i11;
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
