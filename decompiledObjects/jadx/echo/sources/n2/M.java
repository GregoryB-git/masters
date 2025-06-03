package n2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import c2.C0819b;
import c2.EnumC0821d;
import f2.i;
import i2.C1347a;
import i2.C1348b;
import i2.C1349c;
import i2.C1350d;
import i2.C1351e;
import i2.C1352f;
import j2.AbstractC1370a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o2.C1754a;
import o2.b;
import p2.InterfaceC1791a;
import q2.AbstractC1884a;

/* loaded from: classes.dex */
public class M implements InterfaceC1707d, o2.b, InterfaceC1706c {

    /* renamed from: t, reason: collision with root package name */
    public static final C0819b f17878t = C0819b.b("proto");

    /* renamed from: o, reason: collision with root package name */
    public final U f17879o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1791a f17880p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1791a f17881q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC1708e f17882r;

    /* renamed from: s, reason: collision with root package name */
    public final U5.a f17883s;

    public interface b {
        Object apply(Object obj);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f17884a;

        /* renamed from: b, reason: collision with root package name */
        public final String f17885b;

        public c(String str, String str2) {
            this.f17884a = str;
            this.f17885b = str2;
        }
    }

    public interface d {
        Object a();
    }

    public M(InterfaceC1791a interfaceC1791a, InterfaceC1791a interfaceC1791a2, AbstractC1708e abstractC1708e, U u7, U5.a aVar) {
        this.f17879o = u7;
        this.f17880p = interfaceC1791a;
        this.f17881q = interfaceC1791a2;
        this.f17882r = abstractC1708e;
        this.f17883s = aVar;
    }

    public static byte[] A0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static C0819b E0(String str) {
        return str == null ? f17878t : C0819b.b(str);
    }

    public static String F0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC1714k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object G0(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object b0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Object c0(Throwable th) {
        throw new C1754a("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ SQLiteDatabase d0(Throwable th) {
        throw new C1754a("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Long e0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    public static /* synthetic */ C1352f f0(long j7, Cursor cursor) {
        cursor.moveToNext();
        return C1352f.c().c(cursor.getLong(0)).b(j7).a();
    }

    public static /* synthetic */ C1352f g0(final long j7, SQLiteDatabase sQLiteDatabase) {
        return (C1352f) G0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: n2.D
            @Override // n2.M.b
            public final Object apply(Object obj) {
                C1352f f02;
                f02 = M.f0(j7, (Cursor) obj);
                return f02;
            }
        });
    }

    public static /* synthetic */ Long h0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ List j0(SQLiteDatabase sQLiteDatabase) {
        return (List) G0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: n2.J
            @Override // n2.M.b
            public final Object apply(Object obj) {
                List k02;
                k02 = M.k0((Cursor) obj);
                return k02;
            }
        });
    }

    public static /* synthetic */ List k0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(f2.p.a().b(cursor.getString(1)).d(AbstractC1884a.b(cursor.getInt(2))).c(A0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object p0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j7 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j7));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j7), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ byte[] r0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i7 += blob.length;
        }
        byte[] bArr = new byte[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            byte[] bArr2 = (byte[]) arrayList.get(i9);
            System.arraycopy(bArr2, 0, bArr, i8, bArr2.length);
            i8 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ Boolean u0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    public static /* synthetic */ Object v0(String str, C1349c.b bVar, long j7, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) G0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.g())}), new b() { // from class: n2.y
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Boolean u02;
                u02 = M.u0((Cursor) obj);
                return u02;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j7 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.g())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.g()));
            contentValues.put("events_dropped_count", Long.valueOf(j7));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Object w0(long j7, f2.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j7));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(AbstractC1884a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(AbstractC1884a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // n2.InterfaceC1707d
    public Iterable A(final f2.p pVar) {
        return (Iterable) W(new b() { // from class: n2.L
            @Override // n2.M.b
            public final Object apply(Object obj) {
                List l02;
                l02 = M.this.l0(pVar, (SQLiteDatabase) obj);
                return l02;
            }
        });
    }

    public final void B0(C1347a.C0216a c0216a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0216a.a(C1350d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public final byte[] C0(long j7) {
        return (byte[]) G0(Q().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j7)}, null, null, "sequence_num"), new b() { // from class: n2.B
            @Override // n2.M.b
            public final Object apply(Object obj) {
                byte[] r02;
                r02 = M.r0((Cursor) obj);
                return r02;
            }
        });
    }

    public final Object D0(d dVar, b bVar) {
        long a7 = this.f17881q.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e7) {
                if (this.f17881q.a() >= this.f17882r.b() + a7) {
                    return bVar.apply(e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final C1349c.b M(int i7) {
        C1349c.b bVar = C1349c.b.REASON_UNKNOWN;
        if (i7 == bVar.g()) {
            return bVar;
        }
        C1349c.b bVar2 = C1349c.b.MESSAGE_TOO_OLD;
        if (i7 == bVar2.g()) {
            return bVar2;
        }
        C1349c.b bVar3 = C1349c.b.CACHE_FULL;
        if (i7 == bVar3.g()) {
            return bVar3;
        }
        C1349c.b bVar4 = C1349c.b.PAYLOAD_TOO_BIG;
        if (i7 == bVar4.g()) {
            return bVar4;
        }
        C1349c.b bVar5 = C1349c.b.MAX_RETRIES_REACHED;
        if (i7 == bVar5.g()) {
            return bVar5;
        }
        C1349c.b bVar6 = C1349c.b.INVALID_PAYLOD;
        if (i7 == bVar6.g()) {
            return bVar6;
        }
        C1349c.b bVar7 = C1349c.b.SERVER_ERROR;
        if (i7 == bVar7.g()) {
            return bVar7;
        }
        AbstractC1370a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i7));
        return bVar;
    }

    public final void N(final SQLiteDatabase sQLiteDatabase) {
        D0(new d() { // from class: n2.l
            @Override // n2.M.d
            public final Object a() {
                Object b02;
                b02 = M.b0(sQLiteDatabase);
                return b02;
            }
        }, new b() { // from class: n2.w
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Object c02;
                c02 = M.c0((Throwable) obj);
                return c02;
            }
        });
    }

    public final long O(SQLiteDatabase sQLiteDatabase, f2.p pVar) {
        Long V6 = V(sQLiteDatabase, pVar);
        if (V6 != null) {
            return V6.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(AbstractC1884a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public long P() {
        return S() * T();
    }

    public SQLiteDatabase Q() {
        final U u7 = this.f17879o;
        Objects.requireNonNull(u7);
        return (SQLiteDatabase) D0(new d() { // from class: n2.E
            @Override // n2.M.d
            public final Object a() {
                return U.this.getWritableDatabase();
            }
        }, new b() { // from class: n2.F
            @Override // n2.M.b
            public final Object apply(Object obj) {
                SQLiteDatabase d02;
                d02 = M.d0((Throwable) obj);
                return d02;
            }
        });
    }

    public final C1348b R() {
        return C1348b.b().b(C1351e.c().b(P()).c(AbstractC1708e.f17917a.f()).a()).a();
    }

    public final long S() {
        return Q().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long T() {
        return Q().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final C1352f U() {
        final long a7 = this.f17880p.a();
        return (C1352f) W(new b() { // from class: n2.C
            @Override // n2.M.b
            public final Object apply(Object obj) {
                C1352f g02;
                g02 = M.g0(a7, (SQLiteDatabase) obj);
                return g02;
            }
        });
    }

    public final Long V(SQLiteDatabase sQLiteDatabase, f2.p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(AbstractC1884a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) G0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: n2.x
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Long h02;
                h02 = M.h0((Cursor) obj);
                return h02;
            }
        });
    }

    public Object W(b bVar) {
        SQLiteDatabase Q6 = Q();
        Q6.beginTransaction();
        try {
            Object apply = bVar.apply(Q6);
            Q6.setTransactionSuccessful();
            return apply;
        } finally {
            Q6.endTransaction();
        }
    }

    public final boolean X() {
        return S() * T() >= this.f17882r.f();
    }

    public final List Y(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC1714k abstractC1714k = (AbstractC1714k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC1714k.c()))) {
                i.a l7 = abstractC1714k.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC1714k.c()))) {
                    l7.c(cVar.f17884a, cVar.f17885b);
                }
                listIterator.set(AbstractC1714k.a(abstractC1714k.c(), abstractC1714k.d(), l7.d()));
            }
        }
        return list;
    }

    public final /* synthetic */ Object Z(Cursor cursor) {
        while (cursor.moveToNext()) {
            c(cursor.getInt(0), C1349c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // o2.b
    public Object a(b.a aVar) {
        SQLiteDatabase Q6 = Q();
        N(Q6);
        try {
            Object e7 = aVar.e();
            Q6.setTransactionSuccessful();
            return e7;
        } finally {
            Q6.endTransaction();
        }
    }

    public final /* synthetic */ Integer a0(long j7, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j7)};
        G0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: n2.r
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Object Z6;
                Z6 = M.this.Z((Cursor) obj);
                return Z6;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    @Override // n2.InterfaceC1706c
    public C1347a b() {
        final C1347a.C0216a e7 = C1347a.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C1347a) W(new b() { // from class: n2.s
            @Override // n2.M.b
            public final Object apply(Object obj) {
                C1347a n02;
                n02 = M.this.n0(str, hashMap, e7, (SQLiteDatabase) obj);
                return n02;
            }
        });
    }

    @Override // n2.InterfaceC1706c
    public void c(final long j7, final C1349c.b bVar, final String str) {
        W(new b() { // from class: n2.q
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Object v02;
                v02 = M.v0(str, bVar, j7, (SQLiteDatabase) obj);
                return v02;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17879o.close();
    }

    @Override // n2.InterfaceC1707d
    public void d(final f2.p pVar, final long j7) {
        W(new b() { // from class: n2.o
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Object w02;
                w02 = M.w0(j7, pVar, (SQLiteDatabase) obj);
                return w02;
            }
        });
    }

    @Override // n2.InterfaceC1706c
    public void e() {
        W(new b() { // from class: n2.p
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Object x02;
                x02 = M.this.x0((SQLiteDatabase) obj);
                return x02;
            }
        });
    }

    @Override // n2.InterfaceC1707d
    public int f() {
        final long a7 = this.f17880p.a() - this.f17882r.c();
        return ((Integer) W(new b() { // from class: n2.I
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Integer a02;
                a02 = M.this.a0(a7, (SQLiteDatabase) obj);
                return a02;
            }
        })).intValue();
    }

    @Override // n2.InterfaceC1707d
    public void g(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            Q().compileStatement("DELETE FROM events WHERE _id in " + F0(iterable)).execute();
        }
    }

    public final /* synthetic */ Boolean i0(f2.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long V6 = V(sQLiteDatabase, pVar);
        return V6 == null ? Boolean.FALSE : (Boolean) G0(Q().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{V6.toString()}), new b() { // from class: n2.t
            @Override // n2.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    @Override // n2.InterfaceC1707d
    public boolean j(final f2.p pVar) {
        return ((Boolean) W(new b() { // from class: n2.n
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Boolean i02;
                i02 = M.this.i0(pVar, (SQLiteDatabase) obj);
                return i02;
            }
        })).booleanValue();
    }

    public final /* synthetic */ List l0(f2.p pVar, SQLiteDatabase sQLiteDatabase) {
        List y02 = y0(sQLiteDatabase, pVar, this.f17882r.d());
        for (EnumC0821d enumC0821d : EnumC0821d.values()) {
            if (enumC0821d != pVar.d()) {
                int d7 = this.f17882r.d() - y02.size();
                if (d7 <= 0) {
                    break;
                }
                y02.addAll(y0(sQLiteDatabase, pVar.f(enumC0821d), d7));
            }
        }
        return Y(y02, z0(sQLiteDatabase, y02));
    }

    public final /* synthetic */ C1347a m0(Map map, C1347a.C0216a c0216a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C1349c.b M6 = M(cursor.getInt(1));
            long j7 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C1349c.c().c(M6).b(j7).a());
        }
        B0(c0216a, map);
        c0216a.e(U());
        c0216a.d(R());
        c0216a.c((String) this.f17883s.get());
        return c0216a.b();
    }

    public final /* synthetic */ C1347a n0(String str, final Map map, final C1347a.C0216a c0216a, SQLiteDatabase sQLiteDatabase) {
        return (C1347a) G0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: n2.A
            @Override // n2.M.b
            public final Object apply(Object obj) {
                C1347a m02;
                m02 = M.this.m0(map, c0216a, (Cursor) obj);
                return m02;
            }
        });
    }

    @Override // n2.InterfaceC1707d
    public Iterable o() {
        return (Iterable) W(new b() { // from class: n2.G
            @Override // n2.M.b
            public final Object apply(Object obj) {
                List j02;
                j02 = M.j0((SQLiteDatabase) obj);
                return j02;
            }
        });
    }

    public final /* synthetic */ Object o0(List list, f2.p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j7 = cursor.getLong(0);
            boolean z7 = cursor.getInt(7) != 0;
            i.a k7 = f2.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            k7.h(z7 ? new f2.h(E0(cursor.getString(4)), cursor.getBlob(5)) : new f2.h(E0(cursor.getString(4)), C0(j7)));
            if (!cursor.isNull(6)) {
                k7.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC1714k.a(j7, pVar, k7.d()));
        }
        return null;
    }

    @Override // n2.InterfaceC1707d
    public long p(f2.p pVar) {
        return ((Long) G0(Q().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(AbstractC1884a.a(pVar.d()))}), new b() { // from class: n2.H
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Long e02;
                e02 = M.e0((Cursor) obj);
                return e02;
            }
        })).longValue();
    }

    public final /* synthetic */ Long q0(f2.i iVar, f2.p pVar, SQLiteDatabase sQLiteDatabase) {
        if (X()) {
            c(1L, C1349c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long O6 = O(sQLiteDatabase, pVar);
        int e7 = this.f17882r.e();
        byte[] a7 = iVar.e().a();
        boolean z7 = a7.length <= e7;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(O6));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z7));
        contentValues.put("payload", z7 ? a7 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z7) {
            int ceil = (int) Math.ceil(a7.length / e7);
            for (int i7 = 1; i7 <= ceil; i7++) {
                byte[] copyOfRange = Arrays.copyOfRange(a7, (i7 - 1) * e7, Math.min(i7 * e7, a7.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i7));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public final /* synthetic */ Object s0(Cursor cursor) {
        while (cursor.moveToNext()) {
            c(cursor.getInt(0), C1349c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public final /* synthetic */ Object t0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        G0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: n2.u
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Object s02;
                s02 = M.this.s0((Cursor) obj);
                return s02;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public final /* synthetic */ Object x0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f17880p.a()).execute();
        return null;
    }

    @Override // n2.InterfaceC1707d
    public void y(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + F0(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            W(new b() { // from class: n2.K
                @Override // n2.M.b
                public final Object apply(Object obj) {
                    Object t02;
                    t02 = M.this.t0(str, str2, (SQLiteDatabase) obj);
                    return t02;
                }
            });
        }
    }

    public final List y0(SQLiteDatabase sQLiteDatabase, final f2.p pVar, int i7) {
        final ArrayList arrayList = new ArrayList();
        Long V6 = V(sQLiteDatabase, pVar);
        if (V6 == null) {
            return arrayList;
        }
        G0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{V6.toString()}, null, null, null, String.valueOf(i7)), new b() { // from class: n2.v
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Object o02;
                o02 = M.this.o0(arrayList, pVar, (Cursor) obj);
                return o02;
            }
        });
        return arrayList;
    }

    @Override // n2.InterfaceC1707d
    public AbstractC1714k z(final f2.p pVar, final f2.i iVar) {
        AbstractC1370a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.j(), pVar.b());
        long longValue = ((Long) W(new b() { // from class: n2.m
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Long q02;
                q02 = M.this.q0(iVar, pVar, (SQLiteDatabase) obj);
                return q02;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC1714k.a(longValue, pVar, iVar);
    }

    public final Map z0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < list.size(); i7++) {
            sb.append(((AbstractC1714k) list.get(i7)).c());
            if (i7 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        G0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: n2.z
            @Override // n2.M.b
            public final Object apply(Object obj) {
                Object p02;
                p02 = M.p0(hashMap, (Cursor) obj);
                return p02;
            }
        });
        return hashMap;
    }
}
