package R2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class V1 extends AbstractC0506f1 {

    /* renamed from: c, reason: collision with root package name */
    public final U1 f5069c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5070d;

    public V1(N2 n22) {
        super(n22);
        this.f5069c = new U1(this, a(), "google_app_measurement_local.db");
    }

    public static long B(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1L;
            }
            long j7 = cursor.getLong(0);
            cursor.close();
            return j7;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean L() {
        return a().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override // R2.AbstractC0506f1
    public final boolean A() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0205  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List C(int r23) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.V1.C(int):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[Catch: all -> 0x0056, SQLiteException -> 0x005a, SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bc, TRY_ENTER, TryCatch #6 {SQLiteDatabaseLockedException -> 0x00bc, SQLiteFullException -> 0x005c, SQLiteException -> 0x005a, all -> 0x0056, blocks: (B:72:0x004b, B:74:0x0051, B:17:0x006b, B:19:0x008f, B:20:0x00a9), top: B:71:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.V1.D(int, byte[]):boolean");
    }

    public final boolean E(C0497e c0497e) {
        k();
        byte[] p02 = S5.p0(c0497e);
        if (p02.length <= 131072) {
            return D(2, p02);
        }
        j().I().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean F(I i7) {
        Parcel obtain = Parcel.obtain();
        i7.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return D(0, marshall);
        }
        j().I().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean G(R5 r52) {
        Parcel obtain = Parcel.obtain();
        r52.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return D(1, marshall);
        }
        j().I().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final void H() {
        int delete;
        n();
        try {
            SQLiteDatabase K6 = K();
            if (K6 == null || (delete = K6.delete("messages", null, null)) <= 0) {
                return;
            }
            j().K().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e7) {
            j().G().b("Error resetting local analytics data. error", e7);
        }
    }

    public final boolean I() {
        return D(3, new byte[0]);
    }

    public final boolean J() {
        int i7;
        n();
        if (this.f5070d || !L()) {
            return false;
        }
        int i8 = 5;
        for (0; i7 < 5; i7 + 1) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase K6 = K();
                    if (K6 == null) {
                        this.f5070d = true;
                        if (K6 != null) {
                            K6.close();
                        }
                        return false;
                    }
                    K6.beginTransaction();
                    K6.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    K6.setTransactionSuccessful();
                    K6.endTransaction();
                    K6.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i8);
                    i8 += 20;
                    i7 = 0 == 0 ? i7 + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteException e7) {
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
                    j().G().b("Error deleting app launch break from local database", e7);
                    this.f5070d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteFullException e8) {
                j().G().b("Error deleting app launch break from local database", e8);
                this.f5070d = true;
                if (0 == 0) {
                }
                sQLiteDatabase.close();
            }
        }
        j().L().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    public final SQLiteDatabase K() {
        if (this.f5070d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f5069c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f5070d = true;
        return null;
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0511g f() {
        return super.f();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C g() {
        return super.g();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ X1 h() {
        return super.h();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0549l2 i() {
        return super.i();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Y1 j() {
        return super.j();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ S5 k() {
        return super.k();
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ B o() {
        return super.o();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ S1 p() {
        return super.p();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ V1 q() {
        return super.q();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C3 r() {
        return super.r();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C0620v4 s() {
        return super.s();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ D4 t() {
        return super.t();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C0552l5 u() {
        return super.u();
    }
}
