package n5;

import E5.k;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p5.AbstractC1835h;
import p5.C1830c;
import p5.C1831d;
import p5.C1834g;
import p5.InterfaceC1832e;

/* loaded from: classes.dex */
public class k {

    /* renamed from: n, reason: collision with root package name */
    public static Boolean f18010n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18011a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18012b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18013c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18014d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f18015e;

    /* renamed from: h, reason: collision with root package name */
    public q f18018h;

    /* renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f18019i;

    /* renamed from: l, reason: collision with root package name */
    public Integer f18022l;

    /* renamed from: f, reason: collision with root package name */
    public final List f18016f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final Map f18017g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public int f18020j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f18021k = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f18023m = 0;

    public k(Context context, String str, int i7, boolean z7, int i8) {
        this.f18015e = context;
        this.f18012b = str;
        this.f18011a = z7;
        this.f18013c = i7;
        this.f18014d = i8;
    }

    public static /* synthetic */ Cursor G(C1737F c1737f, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        c1737f.a(sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static boolean i(Context context, String str, boolean z7) {
        ApplicationInfo y7;
        PackageManager.ApplicationInfoFlags of;
        try {
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of = PackageManager.ApplicationInfoFlags.of(128L);
                y7 = packageManager.getApplicationInfo(packageName, of);
            } else {
                y7 = y(context, packageName, 128);
            }
            return y7.metaData.getBoolean(str, z7);
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    public static boolean j(Context context) {
        return i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    public static void o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    public static boolean x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static ApplicationInfo y(Context context, String str, int i7) {
        return context.getPackageManager().getApplicationInfo(str, i7);
    }

    public String A() {
        return "[" + B() + "] ";
    }

    public String B() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f18013c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    public SQLiteDatabase C() {
        return this.f18019i;
    }

    public void D(Exception exc, InterfaceC1832e interfaceC1832e) {
        String message;
        Map a7;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + this.f18012b;
            a7 = null;
        } else {
            boolean z7 = exc instanceof SQLException;
            message = exc.getMessage();
            a7 = AbstractC1835h.a(interfaceC1832e);
        }
        interfaceC1832e.b("sqlite_error", message, a7);
    }

    public void E(final InterfaceC1832e interfaceC1832e) {
        S(interfaceC1832e, new Runnable() { // from class: n5.g
            @Override // java.lang.Runnable
            public final void run() {
                k.this.I(interfaceC1832e);
            }
        });
    }

    public synchronized boolean F() {
        return this.f18020j > 0;
    }

    public final /* synthetic */ void H(InterfaceC1832e interfaceC1832e) {
        Boolean f7 = interfaceC1832e.f();
        boolean z7 = Boolean.TRUE.equals(f7) && interfaceC1832e.h();
        if (z7) {
            int i7 = this.f18021k + 1;
            this.f18021k = i7;
            this.f18022l = Integer.valueOf(i7);
        }
        if (!w(interfaceC1832e)) {
            if (z7) {
                this.f18022l = null;
            }
        } else if (z7) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", this.f18022l);
            interfaceC1832e.a(hashMap);
        } else {
            if (Boolean.FALSE.equals(f7)) {
                this.f18022l = null;
            }
            interfaceC1832e.a(null);
        }
    }

    public void M() {
        if (f18010n == null) {
            Boolean valueOf = Boolean.valueOf(j(this.f18015e));
            f18010n = valueOf;
            if (valueOf.booleanValue() && t.c(this.f18014d)) {
                Log.d("Sqflite", A() + "[sqflite] WAL enabled");
            }
        }
        this.f18019i = SQLiteDatabase.openDatabase(this.f18012b, null, f18010n.booleanValue() ? 805306368 : 268435456);
    }

    public void N() {
        this.f18019i = SQLiteDatabase.openDatabase(this.f18012b, null, 1, new a());
    }

    public void O(final InterfaceC1832e interfaceC1832e) {
        S(interfaceC1832e, new Runnable() { // from class: n5.e
            @Override // java.lang.Runnable
            public final void run() {
                k.this.J(interfaceC1832e);
            }
        });
    }

    public void P(final InterfaceC1832e interfaceC1832e) {
        S(interfaceC1832e, new Runnable() { // from class: n5.d
            @Override // java.lang.Runnable
            public final void run() {
                k.this.K(interfaceC1832e);
            }
        });
    }

    public final void Q() {
        while (!this.f18016f.isEmpty() && this.f18022l == null) {
            ((C1834g) this.f18016f.get(0)).a();
            this.f18016f.remove(0);
        }
    }

    public void R(final InterfaceC1832e interfaceC1832e) {
        S(interfaceC1832e, new Runnable() { // from class: n5.f
            @Override // java.lang.Runnable
            public final void run() {
                k.this.L(interfaceC1832e);
            }
        });
    }

    public final void S(InterfaceC1832e interfaceC1832e, Runnable runnable) {
        Integer g7 = interfaceC1832e.g();
        Integer num = this.f18022l;
        if (num == null) {
            runnable.run();
            return;
        }
        if (g7 == null || !(g7.equals(num) || g7.intValue() == -1)) {
            this.f18016f.add(new C1834g(interfaceC1832e, runnable));
            return;
        }
        runnable.run();
        if (this.f18022l != null || this.f18016f.isEmpty()) {
            return;
        }
        this.f18018h.b(this, new Runnable() { // from class: n5.j
            @Override // java.lang.Runnable
            public final void run() {
                k.this.Q();
            }
        });
    }

    public void h(E5.j jVar, k.d dVar) {
        C1830c c1830c;
        String i7;
        C1831d c1831d = new C1831d(jVar, dVar);
        boolean e7 = c1831d.e();
        boolean l7 = c1831d.l();
        List list = (List) c1831d.c("operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c1830c = new C1830c((Map) it.next(), e7);
            i7 = c1830c.i();
            i7.hashCode();
            switch (i7) {
                case "execute":
                    if (p(c1830c)) {
                        c1830c.t(arrayList);
                    } else {
                        if (!l7) {
                            c1830c.r(dVar);
                            break;
                        }
                        c1830c.s(arrayList);
                    }
                case "insert":
                    if (I(c1830c)) {
                        c1830c.t(arrayList);
                    } else {
                        if (!l7) {
                            c1830c.r(dVar);
                            break;
                        }
                        c1830c.s(arrayList);
                    }
                case "update":
                    if (L(c1830c)) {
                        c1830c.t(arrayList);
                    } else {
                        if (!l7) {
                            c1830c.r(dVar);
                            break;
                        }
                        c1830c.s(arrayList);
                    }
                case "query":
                    if (J(c1830c)) {
                        c1830c.t(arrayList);
                    } else {
                        if (!l7) {
                            c1830c.r(dVar);
                            break;
                        }
                        c1830c.s(arrayList);
                    }
                default:
                    dVar.b("bad_param", "Batch method '" + i7 + "' not supported", null);
                    break;
            }
            return;
        }
        if (e7) {
            dVar.a(null);
        } else {
            dVar.a(arrayList);
        }
    }

    public void k() {
        if (!this.f18017g.isEmpty() && t.b(this.f18014d)) {
            Log.d("Sqflite", A() + this.f18017g.size() + " cursor(s) are left opened");
        }
        this.f18019i.close();
    }

    public final void l(int i7) {
        v vVar = (v) this.f18017g.get(Integer.valueOf(i7));
        if (vVar != null) {
            m(vVar);
        }
    }

    public final void m(v vVar) {
        try {
            int i7 = vVar.f18050a;
            if (t.c(this.f18014d)) {
                Log.d("Sqflite", A() + "closing cursor " + i7);
            }
            this.f18017g.remove(Integer.valueOf(i7));
            vVar.f18052c.close();
        } catch (Exception unused) {
        }
    }

    public final Map n(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        int i7 = 0;
        ArrayList arrayList = null;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                i7 = cursor.getColumnCount();
                hashMap2.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap2.put("rows", arrayList2);
                arrayList = arrayList2;
                hashMap = hashMap2;
            }
            arrayList.add(AbstractC1738G.a(cursor, i7));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    public final boolean p(InterfaceC1832e interfaceC1832e) {
        if (!w(interfaceC1832e)) {
            return false;
        }
        interfaceC1832e.a(null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(p5.InterfaceC1832e r10) {
        /*
            r9 = this;
            boolean r0 = r9.w(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r10.e()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r10.a(r2)
            return r3
        L14:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r9.C()     // Catch: java.lang.Throwable -> Lc0 java.lang.Exception -> Lc2
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lc0 java.lang.Exception -> Lc2
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L9f
            int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r5 <= 0) goto L9f
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r5 == 0) goto L9f
            int r5 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r5 != 0) goto L6d
            int r5 = r9.f18014d     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            boolean r5 = n5.t.b(r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r5 == 0) goto L66
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = r9.A()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            long r6 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            android.util.Log.d(r4, r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            goto L66
        L61:
            r10 = move-exception
            r2 = r0
            goto Lcf
        L64:
            r2 = move-exception
            goto Lc6
        L66:
            r10.a(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r0.close()
            return r3
        L6d:
            long r5 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            int r2 = r9.f18014d     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            boolean r2 = n5.t.b(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r2 == 0) goto L94
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r2.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r7 = r9.A()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r2.append(r7)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r2.append(r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            android.util.Log.d(r4, r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
        L94:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r10.a(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r0.close()
            return r3
        L9f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = r9.A()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            android.util.Log.e(r4, r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r10.a(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            if (r0 == 0) goto Lbf
            r0.close()
        Lbf:
            return r3
        Lc0:
            r10 = move-exception
            goto Lcf
        Lc2:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        Lc6:
            r9.D(r2, r10)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto Lce
            r0.close()
        Lce:
            return r1
        Lcf:
            if (r2 == 0) goto Ld4
            r2.close()
        Ld4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.k.I(p5.e):boolean");
    }

    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final boolean J(InterfaceC1832e interfaceC1832e) {
        Cursor cursor;
        Integer num = (Integer) interfaceC1832e.c("cursorPageSize");
        final C1737F d7 = interfaceC1832e.d();
        if (t.b(this.f18014d)) {
            Log.d("Sqflite", A() + d7);
        }
        v vVar = null;
        try {
            cursor = z().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: n5.i
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    Cursor G6;
                    G6 = k.G(C1737F.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                    return G6;
                }
            }, d7.c(), AbstractC1739a.f17997a, null);
            try {
                try {
                    Map n7 = n(cursor, num);
                    if (num != null && !cursor.isLast() && !cursor.isAfterLast()) {
                        int i7 = this.f18023m + 1;
                        this.f18023m = i7;
                        n7.put("cursorId", Integer.valueOf(i7));
                        v vVar2 = new v(i7, num.intValue(), cursor);
                        try {
                            this.f18017g.put(Integer.valueOf(i7), vVar2);
                            vVar = vVar2;
                        } catch (Exception e7) {
                            e = e7;
                            vVar = vVar2;
                            D(e, interfaceC1832e);
                            if (vVar != null) {
                                m(vVar);
                            }
                            if (vVar != null || cursor == null) {
                                return false;
                            }
                            cursor.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            vVar = vVar2;
                            if (vVar == null && cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    interfaceC1832e.a(n7);
                    if (vVar == null && cursor != null) {
                        cursor.close();
                    }
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Exception e9) {
            e = e9;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean K(InterfaceC1832e interfaceC1832e) {
        boolean z7;
        Integer num = (Integer) interfaceC1832e.c("cursorId");
        int intValue = num.intValue();
        boolean equals = Boolean.TRUE.equals(interfaceC1832e.c("cancel"));
        if (t.c(this.f18014d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(A());
            sb.append("cursor ");
            sb.append(intValue);
            sb.append(equals ? " cancel" : " next");
            Log.d("Sqflite", sb.toString());
        }
        v vVar = null;
        if (equals) {
            l(intValue);
            interfaceC1832e.a(null);
            return true;
        }
        v vVar2 = (v) this.f18017g.get(num);
        int i7 = 0;
        try {
            try {
                if (vVar2 == null) {
                    throw new IllegalStateException("Cursor " + intValue + " not found");
                }
                Cursor cursor = vVar2.f18052c;
                Map n7 = n(cursor, Integer.valueOf(vVar2.f18051b));
                z7 = (cursor.isLast() || cursor.isAfterLast()) ? false : true;
                if (z7) {
                    try {
                        n7.put("cursorId", num);
                    } catch (Exception e7) {
                        e = e7;
                        D(e, interfaceC1832e);
                        if (vVar2 != null) {
                            m(vVar2);
                        } else {
                            vVar = vVar2;
                        }
                        if (!z7 && vVar != null) {
                            m(vVar);
                        }
                        return false;
                    }
                }
                interfaceC1832e.a(n7);
                if (!z7) {
                    m(vVar2);
                }
                return true;
            } catch (Exception e8) {
                e = e8;
                z7 = false;
            } catch (Throwable th) {
                th = th;
                if (i7 == 0) {
                    m(vVar2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i7 = intValue;
            if (i7 == 0 && vVar2 != null) {
                m(vVar2);
            }
            throw th;
        }
    }

    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final boolean L(InterfaceC1832e interfaceC1832e) {
        if (!w(interfaceC1832e)) {
            return false;
        }
        Cursor cursor = null;
        if (interfaceC1832e.e()) {
            interfaceC1832e.a(null);
            return true;
        }
        try {
            try {
                Cursor rawQuery = C().rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i7 = rawQuery.getInt(0);
                            if (t.b(this.f18014d)) {
                                Log.d("Sqflite", A() + "changed " + i7);
                            }
                            interfaceC1832e.a(Integer.valueOf(i7));
                            rawQuery.close();
                            return true;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        cursor = rawQuery;
                        D(e, interfaceC1832e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", A() + "fail to read changes for Update/Delete");
                interfaceC1832e.a(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    public synchronized void u(Boolean bool) {
        try {
            if (Boolean.TRUE.equals(bool)) {
                this.f18020j++;
            } else if (Boolean.FALSE.equals(bool)) {
                this.f18020j--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void v(final InterfaceC1832e interfaceC1832e) {
        S(interfaceC1832e, new Runnable() { // from class: n5.h
            @Override // java.lang.Runnable
            public final void run() {
                k.this.H(interfaceC1832e);
            }
        });
    }

    public final boolean w(InterfaceC1832e interfaceC1832e) {
        C1737F d7 = interfaceC1832e.d();
        if (t.b(this.f18014d)) {
            Log.d("Sqflite", A() + d7);
        }
        Boolean f7 = interfaceC1832e.f();
        try {
            C().execSQL(d7.c(), d7.d());
            u(f7);
            return true;
        } catch (Exception e7) {
            D(e7, interfaceC1832e);
            return false;
        }
    }

    public SQLiteDatabase z() {
        return this.f18019i;
    }

    public class a implements DatabaseErrorHandler {
        public a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }
}
