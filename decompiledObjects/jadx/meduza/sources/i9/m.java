package i9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import i9.q;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7730b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f7729a = i10;
        this.f7730b = obj;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7729a) {
            case 0:
                ((f) this.f7730b).c((j9.k) obj);
                return;
            case 1:
                ((q.d) this.f7730b).a((Long) obj);
                return;
            case 2:
                ((List) this.f7730b).add(((Cursor) obj).getString(0));
                return;
            default:
                h1 h1Var = (h1) this.f7730b;
                Cursor cursor = (Cursor) obj;
                h1Var.getClass();
                String string = cursor.getString(0);
                long j10 = cursor.getLong(1);
                SQLiteDatabase sQLiteDatabase = h1Var.f7693a;
                u1.b bVar = new u1.b(new Object[]{string, Long.valueOf(j10)}, 1);
                g1 g1Var = new g1(1, h1Var, string);
                Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(bVar, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?", null, null);
                while (rawQueryWithFactory.moveToNext()) {
                    try {
                        g1Var.accept(rawQueryWithFactory);
                    } catch (Throwable th) {
                        if (rawQueryWithFactory != null) {
                            try {
                                rawQueryWithFactory.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                rawQueryWithFactory.close();
                return;
        }
    }
}
