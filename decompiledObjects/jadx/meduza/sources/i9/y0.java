package i9;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import com.google.firebase.firestore.f;
import i9.q;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class y0 extends e9.a {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f7843k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final c f7844b;

    /* renamed from: c, reason: collision with root package name */
    public final i f7845c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f7846d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f7847e;
    public final b1 f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f7848g;

    /* renamed from: h, reason: collision with root package name */
    public final a f7849h;

    /* renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f7850i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7851j;

    public class a implements SQLiteTransactionListener {
        public a() {
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public final void onBegin() {
            y0.this.f7848g.f();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public final void onCommit() {
            y0.this.f7848g.d();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public final void onRollback() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final y0 f7853a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7854b;

        /* renamed from: c, reason: collision with root package name */
        public final String f7855c;

        /* renamed from: d, reason: collision with root package name */
        public final List<Object> f7856d;

        /* renamed from: e, reason: collision with root package name */
        public int f7857e;
        public final Iterator<Object> f;

        public b(y0 y0Var, String str, List list, ArrayList arrayList, String str2) {
            this.f7857e = 0;
            this.f7853a = y0Var;
            this.f7854b = str;
            this.f7856d = list;
            this.f7855c = str2;
            this.f = arrayList.iterator();
        }

        public b(y0 y0Var, ArrayList arrayList) {
            this.f7857e = 0;
            this.f7853a = y0Var;
            this.f7854b = "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (";
            this.f7856d = Collections.emptyList();
            this.f7855c = ") ORDER BY path";
            this.f = arrayList.iterator();
        }

        public final d a() {
            this.f7857e++;
            ArrayList arrayList = new ArrayList(this.f7856d);
            for (int i10 = 0; this.f.hasNext() && i10 < 900 - this.f7856d.size(); i10++) {
                arrayList.add(this.f.next());
            }
            Object[] array = arrayList.toArray();
            d H = this.f7853a.H(this.f7854b + ((Object) n9.o.h("?", array.length, ", ")) + this.f7855c);
            H.a(array);
            return H;
        }
    }

    public static class c extends SQLiteOpenHelper {

        /* renamed from: a, reason: collision with root package name */
        public final i f7858a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f7859b;

        public c(Context context, i iVar, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 17);
            this.f7858a = iVar;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f7859b = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (!this.f7859b) {
                onConfigure(sQLiteDatabase);
            }
            new h1(sQLiteDatabase, this.f7858a).c(0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (this.f7859b) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f7859b) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (!this.f7859b) {
                onConfigure(sQLiteDatabase);
            }
            new h1(sQLiteDatabase, this.f7858a).c(i10);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final SQLiteDatabase f7860a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7861b;

        /* renamed from: c, reason: collision with root package name */
        public u1.b f7862c;

        public d(SQLiteDatabase sQLiteDatabase, String str) {
            this.f7860a = sQLiteDatabase;
            this.f7861b = str;
        }

        public final void a(Object... objArr) {
            this.f7862c = new u1.b(objArr, 1);
        }

        public final int b(n9.d<Cursor> dVar) {
            int i10;
            Cursor e10 = e();
            try {
                if (e10.moveToFirst()) {
                    dVar.accept(e10);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                e10.close();
                return i10;
            } catch (Throwable th) {
                if (e10 != null) {
                    try {
                        e10.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        public final <T> T c(n9.i<Cursor, T> iVar) {
            Cursor e10 = e();
            try {
                if (!e10.moveToFirst()) {
                    e10.close();
                    return null;
                }
                T apply = iVar.apply(e10);
                e10.close();
                return apply;
            } catch (Throwable th) {
                if (e10 != null) {
                    try {
                        e10.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        public final int d(n9.d<Cursor> dVar) {
            Cursor e10 = e();
            int i10 = 0;
            while (e10.moveToNext()) {
                try {
                    i10++;
                    dVar.accept(e10);
                } catch (Throwable th) {
                    if (e10 != null) {
                        try {
                            e10.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            e10.close();
            return i10;
        }

        public final Cursor e() {
            u1.b bVar = this.f7862c;
            return bVar != null ? this.f7860a.rawQueryWithFactory(bVar, this.f7861b, null, null) : this.f7860a.rawQuery(this.f7861b, null);
        }
    }

    public y0(Context context, String str, j9.f fVar, i iVar, q.b bVar) {
        c cVar = new c(context, iVar, E(str, fVar));
        this.f7849h = new a();
        this.f7844b = cVar;
        this.f7845c = iVar;
        this.f7846d = new j1(this, iVar);
        this.f7847e = new i0(this, iVar);
        this.f = new b1(this, iVar);
        this.f7848g = new v0(this, bVar);
    }

    public static void C(SQLiteProgram sQLiteProgram, Object[] objArr) {
        int i10;
        long longValue;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                sQLiteProgram.bindNull(i11 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i11 + 1, (String) obj);
            } else {
                if (obj instanceof Integer) {
                    i10 = i11 + 1;
                    longValue = ((Integer) obj).intValue();
                } else if (obj instanceof Long) {
                    i10 = i11 + 1;
                    longValue = ((Long) obj).longValue();
                } else if (obj instanceof Double) {
                    sQLiteProgram.bindDouble(i11 + 1, ((Double) obj).doubleValue());
                } else {
                    if (!(obj instanceof byte[])) {
                        x6.b.T("Unknown argument %s of type %s", obj, obj.getClass());
                        throw null;
                    }
                    sQLiteProgram.bindBlob(i11 + 1, (byte[]) obj);
                }
                sQLiteProgram.bindLong(i10, longValue);
            }
        }
    }

    public static void D(Context context, j9.f fVar, String str) {
        String path = context.getDatabasePath(E(str, fVar)).getPath();
        String d10 = defpackage.g.d(path, "-journal");
        String d11 = defpackage.g.d(path, "-wal");
        File file = new File(path);
        File file2 = new File(d10);
        File file3 = new File(d11);
        try {
            n9.h.a(file);
            n9.h.a(file2);
            n9.h.a(file3);
        } catch (IOException e10) {
            throw new com.google.firebase.firestore.f("Failed to clear persistence." + e10, f.a.UNKNOWN);
        }
    }

    public static String E(String str, j9.f fVar) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(fVar.f8678a, "utf-8") + "." + URLEncoder.encode(fVar.f8679b, "utf-8");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public static int F(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        C(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    @Override // e9.a
    public final void A() {
        x6.b.Z("SQLitePersistence shutdown without start!", this.f7851j, new Object[0]);
        this.f7851j = false;
        this.f7850i.close();
        this.f7850i = null;
    }

    @Override // e9.a
    public final void B() {
        x6.b.Z("SQLitePersistence double-started!", !this.f7851j, new Object[0]);
        this.f7851j = true;
        try {
            this.f7850i = this.f7844b.getWritableDatabase();
            j1 j1Var = this.f7846d;
            x6.b.Z("Missing target_globals entry", j1Var.f7710a.H("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").b(new t(j1Var, 3)) == 1, new Object[0]);
            v0 v0Var = this.f7848g;
            long j10 = this.f7846d.f7713d;
            v0Var.getClass();
            v0Var.f7822b = new g9.a0(j10);
        } catch (SQLiteDatabaseLockedException e10) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e10);
        }
    }

    public final void G(String str, Object... objArr) {
        this.f7850i.execSQL(str, objArr);
    }

    public final d H(String str) {
        return new d(this.f7850i, str);
    }

    @Override // e9.a
    public final i9.a j() {
        return this.f7847e;
    }

    @Override // e9.a
    public final i9.b k(e9.e eVar) {
        return new m0(this, this.f7845c, eVar);
    }

    @Override // e9.a
    public final i9.d l() {
        return new n0();
    }

    @Override // e9.a
    public final f m(e9.e eVar) {
        return new t0(this, this.f7845c, eVar);
    }

    @Override // e9.a
    public final a0 n(e9.e eVar, f fVar) {
        return new w0(this, this.f7845c, eVar, fVar);
    }

    @Override // e9.a
    public final b0 o() {
        return new x0(this);
    }

    @Override // e9.a
    public final f0 p() {
        return this.f7848g;
    }

    @Override // e9.a
    public final g0 q() {
        return this.f;
    }

    @Override // e9.a
    public final l1 r() {
        return this.f7846d;
    }

    @Override // e9.a
    public final boolean u() {
        return this.f7851j;
    }

    @Override // e9.a
    public final <T> T x(String str, n9.l<T> lVar) {
        p2.m0.y(1, "a", "Starting transaction: %s", str);
        this.f7850i.beginTransactionWithListener(this.f7849h);
        try {
            T t = lVar.get();
            this.f7850i.setTransactionSuccessful();
            return t;
        } finally {
            this.f7850i.endTransaction();
        }
    }

    @Override // e9.a
    public final void y(String str, Runnable runnable) {
        p2.m0.y(1, "a", "Starting transaction: %s", str);
        this.f7850i.beginTransactionWithListener(this.f7849h);
        try {
            runnable.run();
            this.f7850i.setTransactionSuccessful();
        } finally {
            this.f7850i.endTransaction();
        }
    }
}
