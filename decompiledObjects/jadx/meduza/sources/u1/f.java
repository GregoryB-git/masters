package u1;

import android.database.sqlite.SQLiteProgram;
import ec.i;

/* loaded from: classes.dex */
public class f implements t1.d {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f14916a;

    public f(SQLiteProgram sQLiteProgram) {
        i.e(sQLiteProgram, "delegate");
        this.f14916a = sQLiteProgram;
    }

    @Override // t1.d
    public final void F(int i10, long j10) {
        this.f14916a.bindLong(i10, j10);
    }

    @Override // t1.d
    public final void T(byte[] bArr, int i10) {
        this.f14916a.bindBlob(i10, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14916a.close();
    }

    @Override // t1.d
    public final void d0(int i10) {
        this.f14916a.bindNull(i10);
    }

    @Override // t1.d
    public final void n(int i10, String str) {
        i.e(str, "value");
        this.f14916a.bindString(i10, str);
    }

    @Override // t1.d
    public final void s(int i10, double d10) {
        this.f14916a.bindDouble(i10, d10);
    }
}
