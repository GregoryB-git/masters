package R3;

import V3.AbstractC0667f;
import V3.B;
import V3.C0663b;
import V3.k;
import Y3.d;
import Y3.m;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import c4.C0851c;
import d4.C1227b;
import d4.n;
import d4.o;
import f4.AbstractC1292b;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class j implements X3.f {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f5657e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f5658a;

    /* renamed from: b, reason: collision with root package name */
    public final C0851c f5659b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5660c;

    /* renamed from: d, reason: collision with root package name */
    public long f5661d = 0;

    public class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y3.d f5662a;

        public a(Y3.d dVar) {
            this.f5662a = dVar;
        }

        @Override // Y3.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(k kVar, Void r22, Integer num) {
            return Integer.valueOf(this.f5662a.s(kVar) == null ? num.intValue() + 1 : num.intValue());
        }
    }

    public class b implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y3.d f5664a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f5665b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f5666c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f5667d;

        public b(Y3.d dVar, List list, k kVar, n nVar) {
            this.f5664a = dVar;
            this.f5665b = list;
            this.f5666c = kVar;
            this.f5667d = nVar;
        }

        @Override // Y3.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(k kVar, Void r42, Void r52) {
            if (this.f5664a.s(kVar) != null) {
                return null;
            }
            this.f5665b.add(new Y3.g(this.f5666c.T(kVar), this.f5667d.A(kVar)));
            return null;
        }
    }

    public static class c extends SQLiteOpenHelper {
        public c(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        }

        public final void a(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            m.g(i8 == 2, "Why is onUpgrade() called with a different version?");
            if (i7 > 1) {
                throw new AssertionError("We don't handle upgrading to " + i8);
            }
            a(sQLiteDatabase, "serverCache");
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            a(sQLiteDatabase, "complete");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
        }
    }

    public j(Context context, AbstractC0667f abstractC0667f, String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            this.f5659b = abstractC0667f.q("Persistence");
            this.f5658a = C(context, encode);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static String E(String str) {
        m.g(str.endsWith("/"), "Path keys must end with a '/'");
        return str.substring(0, str.length() - 1) + '0';
    }

    public static String F(k kVar) {
        if (kVar.isEmpty()) {
            return "/";
        }
        return kVar.toString() + "/";
    }

    public static List M(byte[] bArr, int i7) {
        int length = ((bArr.length - 1) / i7) + 1;
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * i7;
            int min = Math.min(i7, bArr.length - i9);
            byte[] bArr2 = new byte[min];
            System.arraycopy(bArr, i9, bArr2, 0, min);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    public static String w(k kVar, String[] strArr) {
        int i7 = 0;
        m.f(strArr.length >= kVar.size() + 1);
        StringBuilder sb = new StringBuilder("(");
        while (true) {
            boolean isEmpty = kVar.isEmpty();
            sb.append("path");
            if (isEmpty) {
                sb.append(" = ?)");
                strArr[i7] = F(k.Y());
                return sb.toString();
            }
            sb.append(" = ? OR ");
            strArr[i7] = F(kVar);
            kVar = kVar.a0();
            i7++;
        }
    }

    public final n A(k kVar) {
        long j7;
        k kVar2;
        n nVar;
        int i7;
        k kVar3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor B7 = B(kVar, new String[]{"path", "value"});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        while (B7.moveToNext()) {
            try {
                arrayList.add(B7.getString(0));
                arrayList2.add(B7.getBlob(1));
            } catch (Throwable th) {
                B7.close();
                throw th;
            }
        }
        B7.close();
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        long currentTimeMillis5 = System.currentTimeMillis();
        n W6 = d4.g.W();
        HashMap hashMap = new HashMap();
        int i8 = 0;
        boolean z7 = false;
        while (i8 < arrayList2.size()) {
            long j8 = currentTimeMillis4;
            if (((String) arrayList.get(i8)).endsWith(".part-0000")) {
                j7 = currentTimeMillis2;
                k kVar4 = new k(((String) arrayList.get(i8)).substring(0, r3.length() - 10));
                int N6 = N(kVar4, arrayList, i8);
                if (this.f5659b.f()) {
                    kVar3 = kVar4;
                    this.f5659b.b("Loading split node with " + N6 + " parts.", new Object[0]);
                } else {
                    kVar3 = kVar4;
                }
                int i9 = N6 + i8;
                nVar = y(z(arrayList2.subList(i8, i9)));
                i7 = i9 - 1;
                kVar2 = kVar3;
            } else {
                j7 = currentTimeMillis2;
                n y7 = y((byte[]) arrayList2.get(i8));
                kVar2 = new k((String) arrayList.get(i8));
                int i10 = i8;
                nVar = y7;
                i7 = i10;
            }
            if (kVar2.X() != null && kVar2.X().s()) {
                hashMap.put(kVar2, nVar);
            } else if (kVar2.W(kVar)) {
                m.g(!z7, "Descendants of path must come after ancestors.");
                W6 = nVar.A(k.b0(kVar2, kVar));
            } else {
                if (!kVar.W(kVar2)) {
                    throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", kVar2, kVar));
                }
                W6 = W6.y(k.b0(kVar, kVar2), nVar);
                z7 = true;
            }
            i8 = i7 + 1;
            currentTimeMillis4 = j8;
            currentTimeMillis2 = j7;
        }
        long j9 = currentTimeMillis2;
        long j10 = currentTimeMillis4;
        for (Map.Entry entry : hashMap.entrySet()) {
            W6 = W6.y(k.b0(kVar, (k) entry.getKey()), (n) entry.getValue());
        }
        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
        long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", Integer.valueOf(arrayList2.size()), Integer.valueOf(Y3.e.c(W6)), kVar, Long.valueOf(currentTimeMillis7), Long.valueOf(j9), Long.valueOf(j10), Long.valueOf(currentTimeMillis6)), new Object[0]);
        }
        return W6;
    }

    public final Cursor B(k kVar, String[] strArr) {
        String F6 = F(kVar);
        String E6 = E(F6);
        String[] strArr2 = new String[kVar.size() + 3];
        String str = w(kVar, strArr2) + " OR (path > ? AND path < ?)";
        strArr2[kVar.size() + 1] = F6;
        strArr2[kVar.size() + 2] = E6;
        return this.f5658a.query("serverCache", strArr, str, strArr2, null, null, "path");
    }

    public final SQLiteDatabase C(Context context, String str) {
        try {
            SQLiteDatabase writableDatabase = new c(context, str).getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (SQLiteException e7) {
            if (e7 instanceof SQLiteDatabaseLockedException) {
                throw new Q3.d("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e7);
            }
            throw e7;
        }
    }

    public final String D(k kVar, int i7) {
        return F(kVar) + String.format(Locale.US, ".part-%04d", Integer.valueOf(i7));
    }

    public final void G(k kVar, k kVar2, Y3.d dVar, Y3.d dVar2, X3.g gVar, List list) {
        if (dVar.getValue() == null) {
            Iterator it = dVar.M().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                C1227b c1227b = (C1227b) entry.getKey();
                G(kVar, kVar2.U(c1227b), (Y3.d) entry.getValue(), dVar2.D(c1227b), gVar.a((C1227b) entry.getKey()), list);
            }
            return;
        }
        Integer num = (Integer) gVar.b(0, new a(dVar2));
        if (num.intValue() > 0) {
            k T6 = kVar.T(kVar2);
            if (this.f5659b.f()) {
                this.f5659b.b(String.format(Locale.US, "Need to rewrite %d nodes below path %s", num, T6), new Object[0]);
            }
            gVar.b(null, new b(dVar2, list, kVar2, A(T6)));
        }
    }

    public final int H(String str, k kVar) {
        String F6 = F(kVar);
        return this.f5658a.delete(str, "path >= ? AND path < ?", new String[]{F6, E(F6)});
    }

    public final int I(k kVar, n nVar) {
        int i7 = 0;
        long b7 = Y3.e.b(nVar);
        if (!(nVar instanceof d4.c) || b7 <= 16384) {
            J(kVar, nVar);
            return 1;
        }
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", kVar, Long.valueOf(b7), 16384), new Object[0]);
        }
        Iterator it = nVar.iterator();
        while (it.hasNext()) {
            d4.m mVar = (d4.m) it.next();
            i7 += I(kVar.U(mVar.c()), mVar.d());
        }
        if (!nVar.t().isEmpty()) {
            J(kVar.U(C1227b.o()), nVar.t());
            i7++;
        }
        J(kVar, d4.g.W());
        return i7 + 1;
    }

    public final void J(k kVar, n nVar) {
        byte[] L6 = L(nVar.L(true));
        if (L6.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", F(kVar));
            contentValues.put("value", L6);
            this.f5658a.insertWithOnConflict("serverCache", null, contentValues, 5);
            return;
        }
        List M6 = M(L6, 262144);
        if (this.f5659b.f()) {
            this.f5659b.b("Saving huge leaf node with " + M6.size() + " parts.", new Object[0]);
        }
        for (int i7 = 0; i7 < M6.size(); i7++) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("path", D(kVar, i7));
            contentValues2.put("value", (byte[]) M6.get(i7));
            this.f5658a.insertWithOnConflict("serverCache", null, contentValues2, 5);
        }
    }

    public final void K(k kVar, long j7, String str, byte[] bArr) {
        P();
        this.f5658a.delete("writes", "id = ?", new String[]{String.valueOf(j7)});
        if (bArr.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j7));
            contentValues.put("path", F(kVar));
            contentValues.put("type", str);
            contentValues.put("part", (Integer) null);
            contentValues.put("node", bArr);
            this.f5658a.insertWithOnConflict("writes", null, contentValues, 5);
            return;
        }
        List M6 = M(bArr, 262144);
        for (int i7 = 0; i7 < M6.size(); i7++) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("id", Long.valueOf(j7));
            contentValues2.put("path", F(kVar));
            contentValues2.put("type", str);
            contentValues2.put("part", Integer.valueOf(i7));
            contentValues2.put("node", (byte[]) M6.get(i7));
            this.f5658a.insertWithOnConflict("writes", null, contentValues2, 5);
        }
    }

    public final byte[] L(Object obj) {
        try {
            return AbstractC1292b.d(obj).getBytes(f5657e);
        } catch (IOException e7) {
            throw new RuntimeException("Could not serialize leaf node", e7);
        }
    }

    public final int N(k kVar, List list, int i7) {
        int i8 = i7 + 1;
        String F6 = F(kVar);
        if (!((String) list.get(i7)).startsWith(F6)) {
            throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
        }
        while (i8 < list.size() && ((String) list.get(i8)).equals(D(kVar, i8 - i7))) {
            i8++;
        }
        if (i8 < list.size()) {
            if (((String) list.get(i8)).startsWith(F6 + ".part-")) {
                throw new IllegalStateException("Run did not finish with all parts");
            }
        }
        return i8 - i7;
    }

    public final void O(k kVar, n nVar, boolean z7) {
        int i7;
        int i8;
        long currentTimeMillis = System.currentTimeMillis();
        if (z7) {
            Iterator it = nVar.iterator();
            int i9 = 0;
            int i10 = 0;
            while (it.hasNext()) {
                d4.m mVar = (d4.m) it.next();
                i10 += H("serverCache", kVar.U(mVar.c()));
                i9 += I(kVar.U(mVar.c()), mVar.d());
            }
            i7 = i9;
            i8 = i10;
        } else {
            i8 = H("serverCache", kVar);
            i7 = I(kVar, nVar);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", Integer.valueOf(i7), Integer.valueOf(i8), kVar.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    public final void P() {
        m.g(this.f5660c, "Transaction expected to already be in progress.");
    }

    @Override // X3.f
    public void a() {
        P();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.f5658a.delete("writes", null, null);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Deleted %d (all) write(s) in %dms", Integer.valueOf(delete), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // X3.f
    public void b(long j7) {
        P();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.f5658a.delete("writes", "id = ?", new String[]{String.valueOf(j7)});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Deleted %d write(s) with writeId %d in %dms", Integer.valueOf(delete), Long.valueOf(j7), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // X3.f
    public void c(k kVar, C0663b c0663b, long j7) {
        P();
        long currentTimeMillis = System.currentTimeMillis();
        K(kVar, j7, "m", L(c0663b.U(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Persisted user merge in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // X3.f
    public List d() {
        byte[] z7;
        B b7;
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f5658a.query("writes", new String[]{"id", "path", "type", "part", "node"}, null, null, null, null, "id, part");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    long j7 = query.getLong(0);
                    k kVar = new k(query.getString(1));
                    String string = query.getString(2);
                    if (query.isNull(3)) {
                        z7 = query.getBlob(4);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        do {
                            arrayList2.add(query.getBlob(4));
                            if (!query.moveToNext()) {
                                break;
                            }
                        } while (query.getLong(0) == j7);
                        query.moveToPrevious();
                        z7 = z(arrayList2);
                    }
                    Object b8 = AbstractC1292b.b(new String(z7, f5657e));
                    if ("o".equals(string)) {
                        b7 = new B(j7, kVar, o.a(b8), true);
                    } else {
                        if (!"m".equals(string)) {
                            throw new IllegalStateException("Got invalid write type: " + string);
                        }
                        b7 = new B(j7, kVar, C0663b.M((Map) b8));
                    }
                    arrayList.add(b7);
                } catch (IOException e7) {
                    throw new RuntimeException("Failed to load writes", e7);
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Loaded %d writes in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        query.close();
        return arrayList;
    }

    @Override // X3.f
    public void e(k kVar, n nVar, long j7) {
        P();
        long currentTimeMillis = System.currentTimeMillis();
        K(kVar, j7, "o", L(nVar.L(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Persisted user overwrite in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // X3.f
    public void f() {
        this.f5658a.endTransaction();
        this.f5660c = false;
        long currentTimeMillis = System.currentTimeMillis() - this.f5661d;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Transaction completed. Elapsed: %dms", Long.valueOf(currentTimeMillis)), new Object[0]);
        }
    }

    @Override // X3.f
    public void g() {
        m.g(!this.f5660c, "runInTransaction called when an existing transaction is already in progress.");
        if (this.f5659b.f()) {
            this.f5659b.b("Starting transaction.", new Object[0]);
        }
        this.f5658a.beginTransaction();
        this.f5660c = true;
        this.f5661d = System.currentTimeMillis();
    }

    @Override // X3.f
    public void h(long j7) {
        P();
        String valueOf = String.valueOf(j7);
        this.f5658a.delete("trackedQueries", "id = ?", new String[]{valueOf});
        this.f5658a.delete("trackedKeys", "id = ?", new String[]{valueOf});
    }

    @Override // X3.f
    public Set i(long j7) {
        return v(Collections.singleton(Long.valueOf(j7)));
    }

    @Override // X3.f
    public void j(long j7) {
        P();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.FALSE);
        contentValues.put("lastUse", Long.valueOf(j7));
        this.f5658a.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Reset active tracked queries in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // X3.f
    public void k(long j7, Set set) {
        P();
        long currentTimeMillis = System.currentTimeMillis();
        this.f5658a.delete("trackedKeys", "id = ?", new String[]{String.valueOf(j7)});
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1227b c1227b = (C1227b) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j7));
            contentValues.put("key", c1227b.e());
            this.f5658a.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Set %d tracked query keys for tracked query %d in %dms", Integer.valueOf(set.size()), Long.valueOf(j7), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // X3.f
    public long l() {
        Cursor rawQuery = this.f5658a.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", "value", "path", "serverCache"), null);
        try {
            if (rawQuery.moveToFirst()) {
                return rawQuery.getLong(0);
            }
            throw new IllegalStateException("Couldn't read database result!");
        } finally {
            rawQuery.close();
        }
    }

    @Override // X3.f
    public void m(k kVar, X3.g gVar) {
        int i7;
        int i8;
        C0851c c0851c;
        StringBuilder sb;
        String str;
        if (gVar.e()) {
            P();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor B7 = B(kVar, new String[]{"rowid", "path"});
            Y3.d dVar = new Y3.d(null);
            Y3.d dVar2 = new Y3.d(null);
            while (B7.moveToNext()) {
                long j7 = B7.getLong(0);
                k kVar2 = new k(B7.getString(1));
                if (kVar.W(kVar2)) {
                    k b02 = k.b0(kVar, kVar2);
                    if (gVar.g(b02)) {
                        dVar = dVar.W(b02, Long.valueOf(j7));
                    } else if (gVar.f(b02)) {
                        dVar2 = dVar2.W(b02, Long.valueOf(j7));
                    } else {
                        c0851c = this.f5659b;
                        sb = new StringBuilder();
                        sb.append("We are pruning at ");
                        sb.append(kVar);
                        sb.append(" and have data at ");
                        sb.append(kVar2);
                        str = " that isn't marked for pruning or keeping. Ignoring.";
                    }
                } else {
                    c0851c = this.f5659b;
                    sb = new StringBuilder();
                    sb.append("We are pruning at ");
                    sb.append(kVar);
                    sb.append(" but we have data stored higher up at ");
                    sb.append(kVar2);
                    str = ". Ignoring.";
                }
                sb.append(str);
                c0851c.i(sb.toString());
            }
            if (dVar.isEmpty()) {
                i7 = 0;
                i8 = 0;
            } else {
                ArrayList<Y3.g> arrayList = new ArrayList();
                G(kVar, k.Y(), dVar, dVar2, gVar, arrayList);
                Collection Z6 = dVar.Z();
                this.f5658a.delete("serverCache", "rowid IN (" + x(Z6) + ")", null);
                for (Y3.g gVar2 : arrayList) {
                    I(kVar.T((k) gVar2.a()), (n) gVar2.b());
                }
                i7 = Z6.size();
                i8 = arrayList.size();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.f5659b.f()) {
                this.f5659b.b(String.format(Locale.US, "Pruned %d rows with %d nodes resaved in %dms", Integer.valueOf(i7), Integer.valueOf(i8), Long.valueOf(currentTimeMillis2)), new Object[0]);
            }
        }
    }

    @Override // X3.f
    public List n() {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f5658a.query("trackedQueries", new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"}, null, null, null, null, "id");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    arrayList.add(new X3.h(query.getLong(0), a4.i.b(new k(query.getString(1)), AbstractC1292b.a(query.getString(2))), query.getLong(3), query.getInt(4) != 0, query.getInt(5) != 0));
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Loaded %d tracked queries in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        query.close();
        return arrayList;
    }

    @Override // X3.f
    public void o(k kVar, C0663b c0663b) {
        P();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = c0663b.iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i7 += H("serverCache", kVar.T((k) entry.getKey()));
            i8 += I(kVar.T((k) entry.getKey()), (n) entry.getValue());
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", Integer.valueOf(i8), Integer.valueOf(i7), kVar.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // X3.f
    public void p() {
        this.f5658a.setTransactionSuccessful();
    }

    @Override // X3.f
    public n q(k kVar) {
        return A(kVar);
    }

    @Override // X3.f
    public void r(long j7, Set set, Set set2) {
        P();
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(j7);
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            this.f5658a.delete("trackedKeys", "id = ? AND key = ?", new String[]{valueOf, ((C1227b) it.next()).e()});
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            C1227b c1227b = (C1227b) it2.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j7));
            contentValues.put("key", c1227b.e());
            this.f5658a.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j7), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // X3.f
    public void s(k kVar, n nVar) {
        P();
        O(kVar, nVar, true);
    }

    @Override // X3.f
    public void t(k kVar, n nVar) {
        P();
        O(kVar, nVar, false);
    }

    @Override // X3.f
    public void u(X3.h hVar) {
        P();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(hVar.f7241a));
        contentValues.put("path", F(hVar.f7242b.e()));
        contentValues.put("queryParams", hVar.f7242b.d().y());
        contentValues.put("lastUse", Long.valueOf(hVar.f7243c));
        contentValues.put("complete", Boolean.valueOf(hVar.f7244d));
        contentValues.put("active", Boolean.valueOf(hVar.f7245e));
        this.f5658a.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Saved new tracked query in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // X3.f
    public Set v(Set set) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f5658a.query(true, "trackedKeys", new String[]{"key"}, "id IN (" + x(set) + ")", null, null, null, null, null);
        HashSet hashSet = new HashSet();
        while (query.moveToNext()) {
            try {
                hashSet.add(C1227b.j(query.getString(0)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f5659b.f()) {
            this.f5659b.b(String.format(Locale.US, "Loaded %d tracked queries keys for tracked queries %s in %dms", Integer.valueOf(hashSet.size()), set.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        query.close();
        return hashSet;
    }

    public final String x(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (!z7) {
                sb.append(",");
            }
            sb.append(longValue);
            z7 = false;
        }
        return sb.toString();
    }

    public final n y(byte[] bArr) {
        try {
            return o.a(AbstractC1292b.b(new String(bArr, f5657e)));
        } catch (IOException e7) {
            throw new RuntimeException("Could not deserialize node: " + new String(bArr, f5657e), e7);
        }
    }

    public final byte[] z(List list) {
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((byte[]) it.next()).length;
        }
        byte[] bArr = new byte[i7];
        Iterator it2 = list.iterator();
        int i8 = 0;
        while (it2.hasNext()) {
            byte[] bArr2 = (byte[]) it2.next();
            System.arraycopy(bArr2, 0, bArr, i8, bArr2.length);
            i8 += bArr2.length;
        }
        return bArr;
    }
}
