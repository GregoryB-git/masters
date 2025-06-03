package va;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2.m0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static Boolean f16013n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16014a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16015b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16016c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16017d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f16018e;

    /* renamed from: h, reason: collision with root package name */
    public i f16020h;

    /* renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f16021i;

    /* renamed from: l, reason: collision with root package name */
    public Integer f16024l;
    public final ArrayList f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f16019g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public int f16022j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f16023k = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f16025m = 0;

    public d(Context context, String str, int i10, boolean z10, int i11) {
        this.f16018e = context;
        this.f16015b = str;
        this.f16014a = z10;
        this.f16016c = i10;
        this.f16017d = i11;
    }

    public static HashMap c(Cursor cursor, Integer num) {
        int i10 = 0;
        HashMap hashMap = null;
        ArrayList arrayList = null;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                arrayList = new ArrayList();
                hashMap = new HashMap();
                i10 = cursor.getColumnCount();
                hashMap.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int type = cursor.getType(i11);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i11) : cursor.getString(i11) : Double.valueOf(cursor.getDouble(i11)) : Long.valueOf(cursor.getLong(i11)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    public final void a() {
        if (!this.f16019g.isEmpty()) {
            if (this.f16017d >= 1) {
                Log.d("Sqflite", h() + this.f16019g.size() + " cursor(s) are left opened");
            }
        }
        this.f16021i.close();
    }

    public final void b(l lVar) {
        try {
            int i10 = lVar.f16044a;
            if (m0.O(this.f16017d)) {
                Log.d("Sqflite", h() + "closing cursor " + i10);
            }
            this.f16019g.remove(Integer.valueOf(i10));
            lVar.f16046c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(m.e r10) {
        /*
            r9 = this;
            boolean r0 = r9.g(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r10.e()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L16
            wa.a r10 = (wa.a) r10
            r10.a(r2)
            return r3
        L16:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r9.f16021i     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto La3
            int r5 = r0.getCount()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            if (r5 <= 0) goto La3
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            if (r5 == 0) goto La3
            int r5 = r0.getInt(r1)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            if (r5 != 0) goto L6d
            int r5 = r9.f16017d     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            if (r5 < r3) goto L3a
            r5 = r3
            goto L3b
        L3a:
            r5 = r1
        L3b:
            if (r5 == 0) goto L61
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r5.<init>()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            java.lang.String r6 = r9.h()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r5.append(r6)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            long r6 = r0.getLong(r3)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r5.append(r6)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            android.util.Log.d(r4, r5)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
        L61:
            r4 = r10
            wa.a r4 = (wa.a) r4     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r4.a(r2)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r0.close()
            return r3
        L6b:
            r2 = move-exception
            goto Lcd
        L6d:
            long r5 = r0.getLong(r3)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            int r2 = r9.f16017d     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            if (r2 < r3) goto L77
            r2 = r3
            goto L78
        L77:
            r2 = r1
        L78:
            if (r2 == 0) goto L95
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r2.<init>()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            java.lang.String r7 = r9.h()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r2.append(r7)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r2.append(r5)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            android.util.Log.d(r4, r2)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
        L95:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r4 = r10
            wa.a r4 = (wa.a) r4     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r4.a(r2)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r0.close()
            return r3
        La3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r5.<init>()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            java.lang.String r6 = r9.h()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r5.append(r6)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            android.util.Log.e(r4, r5)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r4 = r10
            wa.a r4 = (wa.a) r4     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            r4.a(r2)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Ld6
            if (r0 == 0) goto Lc6
            r0.close()
        Lc6:
            return r3
        Lc7:
            r10 = move-exception
            goto Ld8
        Lc9:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        Lcd:
            r9.i(r2, r10)     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto Ld5
            r0.close()
        Ld5:
            return r1
        Ld6:
            r10 = move-exception
            r2 = r0
        Ld8:
            if (r2 == 0) goto Ldd
            r2.close()
        Ldd:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: va.d.d(m.e):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final boolean e(m.e eVar) {
        ?? r12;
        Cursor cursor;
        Integer num = (Integer) eVar.c("cursorPageSize");
        String str = (String) eVar.c("sql");
        t tVar = new t(str, (List) eVar.c("arguments"));
        if (this.f16017d >= 1) {
            Log.d("Sqflite", h() + tVar);
        }
        l lVar = null;
        try {
            try {
                cursor = this.f16021i.rawQueryWithFactory(new u1.a(tVar, 1), str, a.f16009a, null);
                try {
                    HashMap c10 = c(cursor, num);
                    if ((num == null || cursor.isLast() || cursor.isAfterLast()) ? false : true) {
                        int i10 = this.f16025m + 1;
                        this.f16025m = i10;
                        c10.put("cursorId", Integer.valueOf(i10));
                        l lVar2 = new l(i10, num.intValue(), cursor);
                        try {
                            this.f16019g.put(Integer.valueOf(i10), lVar2);
                            lVar = lVar2;
                        } catch (Exception e10) {
                            e = e10;
                            lVar = lVar2;
                            i(e, eVar);
                            if (lVar != null) {
                                b(lVar);
                            }
                            if (lVar == null && cursor != null) {
                                cursor.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            lVar = lVar2;
                            r12 = cursor;
                            if (lVar == null && r12 != 0) {
                                r12.close();
                            }
                            throw th;
                        }
                    }
                    ((wa.a) eVar).a(c10);
                    if (lVar == null) {
                        cursor.close();
                    }
                    return true;
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                r12 = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            r12 = tVar;
            lVar = null;
        }
    }

    public final boolean f(m.e eVar) {
        Cursor cursor;
        Exception e10;
        if (!g(eVar)) {
            return false;
        }
        Cursor cursor2 = null;
        if (eVar.e()) {
            ((wa.a) eVar).a(null);
            return true;
        }
        try {
            try {
                cursor = this.f16021i.rawQuery("SELECT changes()", null);
                if (cursor != null) {
                    try {
                        if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                            int i10 = cursor.getInt(0);
                            if (this.f16017d >= 1) {
                                Log.d("Sqflite", h() + "changed " + i10);
                            }
                            ((wa.a) eVar).a(Integer.valueOf(i10));
                            cursor.close();
                            return true;
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        cursor2 = cursor;
                        i(e10, eVar);
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", h() + "fail to read changes for Update/Delete");
                ((wa.a) eVar).a(null);
                if (cursor != null) {
                    cursor.close();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
            }
        } catch (Exception e12) {
            e10 = e12;
        }
    }

    public final boolean g(m.e eVar) {
        String str = (String) eVar.c("sql");
        t tVar = new t(str, (List) eVar.c("arguments"));
        if (this.f16017d >= 1) {
            Log.d("Sqflite", h() + tVar);
        }
        Object c10 = eVar.c("inTransaction");
        Boolean bool = c10 instanceof Boolean ? (Boolean) c10 : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f16021i;
            List<Object> list = tVar.f16084b;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(t.a(it.next()));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                if (Boolean.TRUE.equals(bool)) {
                    this.f16022j++;
                } else if (Boolean.FALSE.equals(bool)) {
                    this.f16022j--;
                }
            }
            return true;
        } catch (Exception e10) {
            i(e10, eVar);
            return false;
        }
    }

    public final String h() {
        StringBuilder l10 = defpackage.f.l("[");
        Thread currentThread = Thread.currentThread();
        l10.append(this.f16016c + "," + currentThread.getName() + "(" + currentThread.getId() + ")");
        l10.append("] ");
        return l10.toString();
    }

    public final void i(Exception exc, m.e eVar) {
        String message;
        HashMap Y;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            StringBuilder l10 = defpackage.f.l("open_failed ");
            l10.append(this.f16015b);
            message = l10.toString();
            Y = null;
        } else {
            boolean z10 = exc instanceof SQLException;
            message = exc.getMessage();
            Y = x6.b.Y(eVar);
        }
        ((wa.a) eVar).b(message, Y);
    }

    public final synchronized boolean j() {
        return this.f16022j > 0;
    }

    public final void k() {
        if (f16013n == null) {
            Context context = this.f16018e;
            boolean z10 = false;
            try {
                String packageName = context.getPackageName();
                if ((Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(packageName, 128)).metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z10 = true;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f16013n = valueOf;
            if (valueOf.booleanValue() && m0.O(this.f16017d)) {
                Log.d("Sqflite", h() + "[sqflite] WAL enabled");
            }
        }
        this.f16021i = SQLiteDatabase.openDatabase(this.f16015b, null, f16013n.booleanValue() ? 805306368 : 268435456);
    }

    public final void l(wa.c cVar, Runnable runnable) {
        Integer num = (Integer) cVar.c("transactionId");
        Integer num2 = this.f16024l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            this.f.add(new wa.e(runnable));
            return;
        }
        runnable.run();
        if (this.f16024l != null || this.f.isEmpty()) {
            return;
        }
        this.f16020h.a(this, new u.a(this, 17));
    }
}
