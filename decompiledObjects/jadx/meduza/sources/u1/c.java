package u1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import dc.r;
import ec.i;
import ec.j;
import java.util.List;
import t1.a;

/* loaded from: classes.dex */
public final class c implements t1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f14892c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f14893d = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f14894a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Pair<String, String>> f14895b;

    public static final class a extends j implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t1.e f14896a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t1.e eVar) {
            super(4);
            this.f14896a = eVar;
        }

        @Override // dc.r
        public final SQLiteCursor d(Object obj, Object obj2, Object obj3, Object obj4) {
            SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
            t1.e eVar = this.f14896a;
            i.b(sQLiteQuery);
            eVar.f(new f(sQLiteQuery));
            return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        i.e(sQLiteDatabase, "delegate");
        this.f14894a = sQLiteDatabase;
        this.f14895b = sQLiteDatabase.getAttachedDbs();
    }

    public final Cursor C(String str) {
        i.e(str, "query");
        return y(new t1.a(str));
    }

    @Override // t1.b
    public final void G() {
        this.f14894a.setTransactionSuccessful();
    }

    public final int H(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        i.e(str, "table");
        i.e(contentValues, "values");
        int i11 = 0;
        if (!(contentValues.size() != 0)) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder l10 = defpackage.f.l("UPDATE ");
        l10.append(f14892c[i10]);
        l10.append(str);
        l10.append(" SET ");
        for (String str3 : contentValues.keySet()) {
            l10.append(i11 > 0 ? "," : "");
            l10.append(str3);
            objArr2[i11] = contentValues.get(str3);
            l10.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            l10.append(" WHERE ");
            l10.append(str2);
        }
        String sb2 = l10.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        t1.f q10 = q(sb2);
        a.C0225a.a(q10, objArr2);
        return ((g) q10).p();
    }

    @Override // t1.b
    public final void J() {
        this.f14894a.beginTransactionNonExclusive();
    }

    @Override // t1.b
    public final Cursor V(t1.e eVar, CancellationSignal cancellationSignal) {
        i.e(eVar, "query");
        SQLiteDatabase sQLiteDatabase = this.f14894a;
        String g10 = eVar.g();
        String[] strArr = f14893d;
        i.b(cancellationSignal);
        u1.a aVar = new u1.a(eVar, 0);
        i.e(sQLiteDatabase, "sQLiteDatabase");
        i.e(g10, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, g10, strArr, null, cancellationSignal);
        i.d(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // t1.b
    public final void X() {
        this.f14894a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14894a.close();
    }

    public final void f(String str, Object[] objArr) {
        i.e(str, "sql");
        i.e(objArr, "bindArgs");
        this.f14894a.execSQL(str, objArr);
    }

    public final String g() {
        return this.f14894a.getPath();
    }

    @Override // t1.b
    public final void h() {
        this.f14894a.beginTransaction();
    }

    @Override // t1.b
    public final boolean isOpen() {
        return this.f14894a.isOpen();
    }

    @Override // t1.b
    public final boolean j0() {
        return this.f14894a.inTransaction();
    }

    @Override // t1.b
    public final void m(String str) {
        i.e(str, "sql");
        this.f14894a.execSQL(str);
    }

    @Override // t1.b
    public final boolean n0() {
        SQLiteDatabase sQLiteDatabase = this.f14894a;
        i.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // t1.b
    public final t1.f q(String str) {
        i.e(str, "sql");
        SQLiteStatement compileStatement = this.f14894a.compileStatement(str);
        i.d(compileStatement, "delegate.compileStatement(sql)");
        return new g(compileStatement);
    }

    @Override // t1.b
    public final Cursor y(t1.e eVar) {
        i.e(eVar, "query");
        Cursor rawQueryWithFactory = this.f14894a.rawQueryWithFactory(new b(new a(eVar), 0), eVar.g(), f14893d, null);
        i.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }
}
