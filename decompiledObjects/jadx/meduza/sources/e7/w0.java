package e7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class w0 extends j0 {

    /* renamed from: d, reason: collision with root package name */
    public final v0 f4718d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4719e;

    public w0(j2 j2Var) {
        super(j2Var);
        this.f4718d = new v0(this, zza());
    }

    public static long v(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1L;
            }
            long j10 = cursor.getLong(0);
            cursor.close();
            return j10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // e7.j0
    public final boolean s() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(byte[] r17, int r18) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.w0.w(byte[], int):boolean");
    }

    public final void x() {
        int delete;
        l();
        try {
            SQLiteDatabase z10 = z();
            if (z10 == null || (delete = z10.delete("messages", null, null) + 0) <= 0) {
                return;
            }
            zzj().f4067w.c("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e10) {
            zzj().f4060o.c("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean y() {
        int i10;
        l();
        if (this.f4719e || !zza().getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i11 = 5;
        for (0; i10 < 5; i10 + 1) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase z10 = z();
                if (z10 == null) {
                    this.f4719e = true;
                    if (z10 != null) {
                        z10.close();
                    }
                    return false;
                }
                z10.beginTransaction();
                z10.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                z10.setTransactionSuccessful();
                z10.endTransaction();
                z10.close();
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i11);
                i11 += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (SQLiteFullException e10) {
                zzj().f4060o.c("Error deleting app launch break from local database", e10);
                this.f4719e = true;
                i10 = 0 == 0 ? i10 + 1 : 0;
                sQLiteDatabase.close();
            } catch (SQLiteException e11) {
                if (0 != 0) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                zzj().f4060o.c("Error deleting app launch break from local database", e11);
                this.f4719e = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        zzj().f4063r.b("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    public final SQLiteDatabase z() {
        if (this.f4719e) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f4718d.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f4719e = true;
        return null;
    }
}
