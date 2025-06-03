package u1;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class g extends f implements t1.f {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f14917b;

    public g(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f14917b = sQLiteStatement;
    }

    @Override // t1.f
    public final int p() {
        return this.f14917b.executeUpdateDelete();
    }

    @Override // t1.f
    public final long w0() {
        return this.f14917b.executeInsert();
    }
}
