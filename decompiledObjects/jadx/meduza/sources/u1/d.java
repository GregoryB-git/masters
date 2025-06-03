package u1;

import a0.j;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import b.z;
import ec.i;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p2.m0;
import t1.c;
import u1.d;

/* loaded from: classes.dex */
public final class d implements t1.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14897a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14898b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f14899c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14900d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14901e;
    public final rb.g f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14902o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public u1.c f14903a = null;
    }

    public static final class b extends SQLiteOpenHelper {

        /* renamed from: p, reason: collision with root package name */
        public static final /* synthetic */ int f14904p = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Context f14905a;

        /* renamed from: b, reason: collision with root package name */
        public final a f14906b;

        /* renamed from: c, reason: collision with root package name */
        public final c.a f14907c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f14908d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f14909e;
        public final v1.a f;

        /* renamed from: o, reason: collision with root package name */
        public boolean f14910o;

        public static final class a extends RuntimeException {

            /* renamed from: a, reason: collision with root package name */
            public final int f14911a;

            /* renamed from: b, reason: collision with root package name */
            public final Throwable f14912b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, Throwable th) {
                super(th);
                j.p(i10, "callbackName");
                this.f14911a = i10;
                this.f14912b = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f14912b;
            }
        }

        /* renamed from: u1.d$b$b, reason: collision with other inner class name */
        public static final class C0240b {
            public static u1.c a(a aVar, SQLiteDatabase sQLiteDatabase) {
                i.e(aVar, "refHolder");
                i.e(sQLiteDatabase, "sqLiteDatabase");
                u1.c cVar = aVar.f14903a;
                if (cVar != null && i.a(cVar.f14894a, sQLiteDatabase)) {
                    return cVar;
                }
                u1.c cVar2 = new u1.c(sQLiteDatabase);
                aVar.f14903a = cVar2;
                return cVar2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, final a aVar, final c.a aVar2, boolean z10) {
            super(context, str, null, aVar2.f14406a, new DatabaseErrorHandler() { // from class: u1.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    String g10;
                    c.a aVar3 = c.a.this;
                    d.a aVar4 = aVar;
                    i.e(aVar3, "$callback");
                    i.e(aVar4, "$dbRef");
                    int i10 = d.b.f14904p;
                    i.d(sQLiteDatabase, "dbObj");
                    c a10 = d.b.C0240b.a(aVar4, sQLiteDatabase);
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + a10 + ".path");
                    if (a10.isOpen()) {
                        List<Pair<String, String>> list = null;
                        try {
                            try {
                                list = a10.f14895b;
                            } catch (Throwable th) {
                                if (list != null) {
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        Object obj = ((Pair) it.next()).second;
                                        i.d(obj, "p.second");
                                        c.a.a((String) obj);
                                    }
                                } else {
                                    String g11 = a10.g();
                                    if (g11 != null) {
                                        c.a.a(g11);
                                    }
                                }
                                throw th;
                            }
                        } catch (SQLiteException unused) {
                        }
                        try {
                            a10.close();
                        } catch (IOException unused2) {
                        }
                        if (list != null) {
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                Object obj2 = ((Pair) it2.next()).second;
                                i.d(obj2, "p.second");
                                c.a.a((String) obj2);
                            }
                            return;
                        }
                        g10 = a10.g();
                        if (g10 == null) {
                            return;
                        }
                    } else {
                        g10 = a10.g();
                        if (g10 == null) {
                            return;
                        }
                    }
                    c.a.a(g10);
                }
            });
            i.e(context, "context");
            i.e(aVar2, "callback");
            this.f14905a = context;
            this.f14906b = aVar;
            this.f14907c = aVar2;
            this.f14908d = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                i.d(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            i.d(cacheDir, "context.cacheDir");
            this.f = new v1.a(str, cacheDir, false);
        }

        public final SQLiteDatabase C(boolean z10) {
            SQLiteDatabase writableDatabase = z10 ? getWritableDatabase() : getReadableDatabase();
            i.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }

        public final SQLiteDatabase H(boolean z10) {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.f14905a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return C(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return C(z10);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable th2 = aVar.f14912b;
                        int c10 = q0.g.c(aVar.f14911a);
                        if (c10 == 0) {
                            throw th2;
                        }
                        if (c10 == 1) {
                            throw th2;
                        }
                        if (c10 == 2) {
                            throw th2;
                        }
                        if (c10 == 3) {
                            throw th2;
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                    } else {
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                        if (databaseName == null || !this.f14908d) {
                            throw th;
                        }
                    }
                    this.f14905a.deleteDatabase(databaseName);
                    try {
                        return C(z10);
                    } catch (a e10) {
                        throw e10.f14912b;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            try {
                v1.a aVar = this.f;
                aVar.a(aVar.f15208a);
                super.close();
                this.f14906b.f14903a = null;
                this.f14910o = false;
            } finally {
                this.f.b();
            }
        }

        public final t1.b f(boolean z10) {
            try {
                this.f.a((this.f14910o || getDatabaseName() == null) ? false : true);
                this.f14909e = false;
                SQLiteDatabase H = H(z10);
                if (!this.f14909e) {
                    return g(H);
                }
                close();
                return f(z10);
            } finally {
                this.f.b();
            }
        }

        public final u1.c g(SQLiteDatabase sQLiteDatabase) {
            i.e(sQLiteDatabase, "sqLiteDatabase");
            return C0240b.a(this.f14906b, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            i.e(sQLiteDatabase, "db");
            try {
                this.f14907c.b(g(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(1, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            i.e(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f14907c.c(g(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(2, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            i.e(sQLiteDatabase, "db");
            this.f14909e = true;
            try {
                this.f14907c.d(g(sQLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new a(4, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            i.e(sQLiteDatabase, "db");
            if (!this.f14909e) {
                try {
                    this.f14907c.e(g(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new a(5, th);
                }
            }
            this.f14910o = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            i.e(sQLiteDatabase, "sqLiteDatabase");
            this.f14909e = true;
            try {
                this.f14907c.f(g(sQLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new a(3, th);
            }
        }
    }

    public static final class c extends ec.j implements dc.a<b> {
        public c() {
            super(0);
        }

        @Override // dc.a
        public final b invoke() {
            b bVar;
            d dVar = d.this;
            if (dVar.f14898b == null || !dVar.f14900d) {
                d dVar2 = d.this;
                bVar = new b(dVar2.f14897a, dVar2.f14898b, new a(), dVar2.f14899c, dVar2.f14901e);
            } else {
                Context context = d.this.f14897a;
                i.e(context, "context");
                File noBackupFilesDir = context.getNoBackupFilesDir();
                i.d(noBackupFilesDir, "context.noBackupFilesDir");
                File file = new File(noBackupFilesDir, d.this.f14898b);
                Context context2 = d.this.f14897a;
                String absolutePath = file.getAbsolutePath();
                a aVar = new a();
                d dVar3 = d.this;
                bVar = new b(context2, absolutePath, aVar, dVar3.f14899c, dVar3.f14901e);
            }
            bVar.setWriteAheadLoggingEnabled(d.this.f14902o);
            return bVar;
        }
    }

    public d(Context context, String str, c.a aVar, boolean z10, boolean z11) {
        i.e(context, "context");
        i.e(aVar, "callback");
        this.f14897a = context;
        this.f14898b = str;
        this.f14899c = aVar;
        this.f14900d = z10;
        this.f14901e = z11;
        this.f = z.n(new c());
    }

    @Override // t1.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f.f13849b != m0.B) {
            ((b) this.f.getValue()).close();
        }
    }

    @Override // t1.c
    public final String getDatabaseName() {
        return this.f14898b;
    }

    @Override // t1.c
    public final t1.b getWritableDatabase() {
        return ((b) this.f.getValue()).f(true);
    }

    @Override // t1.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f.f13849b != m0.B) {
            b bVar = (b) this.f.getValue();
            i.e(bVar, "sQLiteOpenHelper");
            bVar.setWriteAheadLoggingEnabled(z10);
        }
        this.f14902o = z10;
    }
}
