/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.database.sqlite.SQLiteStatement
 *  android.os.SystemClock
 *  android.util.Base64
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 */
package n2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import android.util.Base64;
import f2.h;
import f2.i;
import f2.p;
import i2.a;
import i2.b;
import i2.c;
import i2.d;
import i2.e;
import i2.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n2.A;
import n2.B;
import n2.C;
import n2.D;
import n2.E;
import n2.F;
import n2.G;
import n2.H;
import n2.I;
import n2.J;
import n2.K;
import n2.L;
import n2.U;
import n2.e;
import n2.k;
import n2.l;
import n2.m;
import n2.n;
import n2.o;
import n2.p;
import n2.q;
import n2.r;
import n2.s;
import n2.t;
import n2.u;
import n2.v;
import n2.w;
import n2.x;
import n2.y;
import n2.z;
import o2.b;
import q2.a;

public class M
implements n2.d,
o2.b,
n2.c {
    public static final c2.b t = c2.b.b("proto");
    public final U o;
    public final p2.a p;
    public final p2.a q;
    public final e r;
    public final U5.a s;

    public M(p2.a a8, p2.a a9, e e8, U u8, U5.a a10) {
        this.o = u8;
        this.p = a8;
        this.q = a9;
        this.r = e8;
        this.s = a10;
    }

    public static byte[] A0(String string2) {
        if (string2 == null) {
            return null;
        }
        return Base64.decode((String)string2, (int)0);
    }

    public static /* synthetic */ Object B(SQLiteDatabase sQLiteDatabase) {
        return M.b0(sQLiteDatabase);
    }

    public static /* synthetic */ Long C(Cursor cursor) {
        return M.h0(cursor);
    }

    public static /* synthetic */ Object D(Throwable throwable) {
        return M.c0(throwable);
    }

    public static /* synthetic */ Object E(String string2, c.b b8, long l8, SQLiteDatabase sQLiteDatabase) {
        return M.v0(string2, b8, l8, sQLiteDatabase);
    }

    public static c2.b E0(String string2) {
        if (string2 == null) {
            return t;
        }
        return c2.b.b(string2);
    }

    public static /* synthetic */ Object F(Map map, Cursor cursor) {
        return M.p0(map, cursor);
    }

    public static String F0(Iterable iterable) {
        StringBuilder stringBuilder = new StringBuilder("(");
        iterable = iterable.iterator();
        while (iterable.hasNext()) {
            stringBuilder.append(((k)iterable.next()).c());
            if (!iterable.hasNext()) continue;
            stringBuilder.append(',');
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static /* synthetic */ Integer G(M m8, long l8, SQLiteDatabase sQLiteDatabase) {
        return m8.a0(l8, sQLiteDatabase);
    }

    public static Object G0(Cursor cursor, b object) {
        try {
            object = object.apply((Object)cursor);
            return object;
        }
        finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object H(M m8, List list, f2.p p8, Cursor cursor) {
        return m8.o0(list, p8, cursor);
    }

    public static /* synthetic */ Object I(M m8, SQLiteDatabase sQLiteDatabase) {
        return m8.x0(sQLiteDatabase);
    }

    public static /* synthetic */ i2.a J(M m8, String string2, Map map, a.a a8, SQLiteDatabase sQLiteDatabase) {
        return m8.n0(string2, map, a8, sQLiteDatabase);
    }

    public static /* synthetic */ Long K(Cursor cursor) {
        return M.e0(cursor);
    }

    public static /* synthetic */ f L(long l8, SQLiteDatabase sQLiteDatabase) {
        return M.g0(l8, sQLiteDatabase);
    }

    public static /* synthetic */ Object b0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Object c0(Throwable throwable) {
        throw new o2.a("Timed out while trying to acquire the lock.", throwable);
    }

    public static /* synthetic */ SQLiteDatabase d0(Throwable throwable) {
        throw new o2.a("Timed out while trying to open db.", throwable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ Long e0(Cursor cursor) {
        long l8;
        if (cursor.moveToNext()) {
            l8 = cursor.getLong(0);
            do {
                return l8;
                break;
            } while (true);
        }
        l8 = 0L;
        return l8;
    }

    public static /* synthetic */ f f0(long l8, Cursor cursor) {
        cursor.moveToNext();
        long l9 = cursor.getLong(0);
        return f.c().c(l9).b(l8).a();
    }

    public static /* synthetic */ f g0(long l8, SQLiteDatabase sQLiteDatabase) {
        return (f)M.G0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new D(l8));
    }

    public static /* synthetic */ f h(long l8, Cursor cursor) {
        return M.f0(l8, cursor);
    }

    public static /* synthetic */ Long h0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return cursor.getLong(0);
    }

    public static /* synthetic */ List i(M m8, f2.p p8, SQLiteDatabase sQLiteDatabase) {
        return m8.l0(p8, sQLiteDatabase);
    }

    public static /* synthetic */ List j0(SQLiteDatabase sQLiteDatabase) {
        return (List)M.G0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new J());
    }

    public static /* synthetic */ List k(Cursor cursor) {
        return M.k0(cursor);
    }

    public static /* synthetic */ List k0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add((Object)f2.p.a().b(cursor.getString(1)).d(a.b(cursor.getInt(2))).c(M.A0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object l(M m8, Cursor cursor) {
        return m8.s0(cursor);
    }

    public static /* synthetic */ SQLiteDatabase m(Throwable throwable) {
        return M.d0(throwable);
    }

    public static /* synthetic */ Object n(M m8, Cursor cursor) {
        return m8.Z(cursor);
    }

    public static /* synthetic */ Object p0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            Set set;
            long l8 = cursor.getLong(0);
            Set set2 = set = (Set)map.get((Object)l8);
            if (set == null) {
                set2 = new HashSet();
                map.put((Object)l8, (Object)set2);
            }
            set2.add((Object)new c(cursor.getString(1), cursor.getString(2), null));
        }
        return null;
    }

    public static /* synthetic */ Object q(M m8, String string2, String string3, SQLiteDatabase sQLiteDatabase) {
        return m8.t0(string2, string3, sQLiteDatabase);
    }

    public static /* synthetic */ Boolean r(M m8, f2.p p8, SQLiteDatabase sQLiteDatabase) {
        return m8.i0(p8, sQLiteDatabase);
    }

    public static /* synthetic */ byte[] r0(Cursor arrby) {
        byte[] arrby2;
        ArrayList arrayList = new ArrayList();
        int n8 = 0;
        while (arrby.moveToNext()) {
            arrby2 = arrby.getBlob(0);
            arrayList.add((Object)arrby2);
            n8 += arrby2.length;
        }
        arrby = new byte[n8];
        int n9 = n8 = 0;
        while (n8 < arrayList.size()) {
            arrby2 = (byte[])arrayList.get(n8);
            System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)n9, (int)arrby2.length);
            n9 += arrby2.length;
            ++n8;
        }
        return arrby;
    }

    public static /* synthetic */ Object s(long l8, f2.p p8, SQLiteDatabase sQLiteDatabase) {
        return M.w0(l8, p8, sQLiteDatabase);
    }

    public static /* synthetic */ byte[] t(Cursor cursor) {
        return M.r0(cursor);
    }

    public static /* synthetic */ List u(SQLiteDatabase sQLiteDatabase) {
        return M.j0(sQLiteDatabase);
    }

    public static /* synthetic */ i2.a v(M m8, Map map, a.a a8, Cursor cursor) {
        return m8.m0(map, a8, cursor);
    }

    public static /* synthetic */ Object v0(String string2, c.b b8, long l8, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean)M.G0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{string2, Integer.toString((int)b8.g())}), new y())).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", string2);
            contentValues.put("reason", Integer.valueOf((int)b8.g()));
            contentValues.put("events_dropped_count", Long.valueOf((long)l8));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ");
        stringBuilder.append(l8);
        stringBuilder.append(" WHERE log_source = ? AND reason = ?");
        sQLiteDatabase.execSQL(stringBuilder.toString(), (Object[])new String[]{string2, Integer.toString((int)b8.g())});
        return null;
    }

    public static /* synthetic */ Boolean w(Cursor cursor) {
        return bl = cursor.getCount() > 0;
    }

    public static /* synthetic */ Object w0(long l8, f2.p p8, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf((long)l8));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{p8.b(), String.valueOf((int)a.a(p8.d()))}) < 1) {
            contentValues.put("backend_name", p8.b());
            contentValues.put("priority", Integer.valueOf((int)a.a(p8.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Long x(M m8, i i8, f2.p p8, SQLiteDatabase sQLiteDatabase) {
        return m8.q0(i8, p8, sQLiteDatabase);
    }

    @Override
    public Iterable A(f2.p p8) {
        return (Iterable)this.W(new L(this, p8));
    }

    public final void B0(a.a a8, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a8.a(i2.d.c().c((String)entry.getKey()).b((List)entry.getValue()).a());
        }
    }

    public final byte[] C0(long l8) {
        return (byte[])M.G0(this.Q().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf((long)l8)}, null, null, "sequence_num"), new B());
    }

    public final Object D0(d d8, b b8) {
        long l8 = this.q.a();
        do {
            try {
                Object object = d8.a();
                return object;
            }
            catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
                if (this.q.a() >= (long)this.r.b() + l8) {
                    return b8.apply((Object)sQLiteDatabaseLockedException);
                }
                SystemClock.sleep((long)50L);
                continue;
            }
            break;
        } while (true);
    }

    public final c.b M(int n8) {
        c.b b8 = c.b.p;
        if (n8 == b8.g()) {
            return b8;
        }
        c.b b9 = c.b.q;
        if (n8 == b9.g()) {
            return b9;
        }
        b9 = c.b.r;
        if (n8 == b9.g()) {
            return b9;
        }
        b9 = c.b.s;
        if (n8 == b9.g()) {
            return b9;
        }
        b9 = c.b.t;
        if (n8 == b9.g()) {
            return b9;
        }
        b9 = c.b.u;
        if (n8 == b9.g()) {
            return b9;
        }
        b9 = c.b.v;
        if (n8 == b9.g()) {
            return b9;
        }
        j2.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", n8);
        return b8;
    }

    public final void N(SQLiteDatabase sQLiteDatabase) {
        this.D0(new l(sQLiteDatabase), new w());
    }

    public final long O(SQLiteDatabase sQLiteDatabase, f2.p p8) {
        Long l8 = this.V(sQLiteDatabase, p8);
        if (l8 != null) {
            return l8;
        }
        l8 = new ContentValues();
        l8.put("backend_name", p8.b());
        l8.put("priority", Integer.valueOf((int)a.a(p8.d())));
        l8.put("next_request_ms", Integer.valueOf((int)0));
        if (p8.c() != null) {
            l8.put("extras", Base64.encodeToString((byte[])p8.c(), (int)0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, (ContentValues)l8);
    }

    public long P() {
        return this.S() * this.T();
    }

    public SQLiteDatabase Q() {
        U u8 = this.o;
        Objects.requireNonNull((Object)((Object)u8));
        return (SQLiteDatabase)this.D0(new E(u8), new F());
    }

    public final i2.b R() {
        return i2.b.b().b(i2.e.c().b(this.P()).c(e.a.f()).a()).a();
    }

    public final long S() {
        return this.Q().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long T() {
        return this.Q().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final f U() {
        return (f)this.W(new C(this.p.a()));
    }

    public final Long V(SQLiteDatabase sQLiteDatabase, f2.p object) {
        StringBuilder stringBuilder = new StringBuilder("backend_name = ? and priority = ?");
        String[] arrstring = new String[]((Collection)Arrays.asList((Object[])new String[]{object.b(), String.valueOf((int)a.a(object.d()))}));
        if (object.c() != null) {
            stringBuilder.append(" and extras = ?");
            arrstring.add((Object)Base64.encodeToString((byte[])object.c(), (int)0));
        } else {
            stringBuilder.append(" and extras is null");
        }
        object = stringBuilder.toString();
        arrstring = (String[])arrstring.toArray((Object[])new String[0]);
        return (Long)M.G0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, (String)object, arrstring, null, null, null), new x());
    }

    public Object W(b object) {
        SQLiteDatabase sQLiteDatabase = this.Q();
        sQLiteDatabase.beginTransaction();
        try {
            object = object.apply((Object)sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return object;
        }
        finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final boolean X() {
        if (this.S() * this.T() >= this.r.f()) {
            return true;
        }
        return false;
    }

    public final List Y(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k k8 = (k)listIterator.next();
            if (!map.containsKey((Object)k8.c())) continue;
            i.a a8 = k8.b().l();
            for (c c8 : (Set)map.get((Object)k8.c())) {
                a8.c(c8.a, c8.b);
            }
            listIterator.set((Object)k.a(k8.c(), k8.d(), a8.d()));
        }
        return list;
    }

    public final /* synthetic */ Object Z(Cursor cursor) {
        while (cursor.moveToNext()) {
            int n8 = cursor.getInt(0);
            String string2 = cursor.getString(1);
            this.c(n8, c.b.q, string2);
        }
        return null;
    }

    @Override
    public Object a(b.a object) {
        SQLiteDatabase sQLiteDatabase = this.Q();
        this.N(sQLiteDatabase);
        try {
            object = object.e();
            sQLiteDatabase.setTransactionSuccessful();
            return object;
        }
        finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final /* synthetic */ Integer a0(long l8, SQLiteDatabase sQLiteDatabase) {
        String[] arrstring = new String[]{String.valueOf((long)l8)};
        M.G0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", arrstring), new r(this));
        return sQLiteDatabase.delete("events", "timestamp_ms < ?", arrstring);
    }

    @Override
    public i2.a b() {
        a.a a8 = i2.a.e();
        return (i2.a)this.W(new s(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", (Map)new HashMap(), a8));
    }

    @Override
    public void c(long l8, c.b b8, String string2) {
        this.W(new q(string2, b8, l8));
    }

    public void close() {
        this.o.close();
    }

    @Override
    public void d(f2.p p8, long l8) {
        this.W(new o(l8, p8));
    }

    @Override
    public void e() {
        this.W(new p(this));
    }

    @Override
    public int f() {
        return (Integer)this.W(new I(this, this.p.a() - this.r.c()));
    }

    @Override
    public void g(Iterable object) {
        if (!object.iterator().hasNext()) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DELETE FROM events WHERE _id in ");
        stringBuilder.append(M.F0((Iterable)object));
        object = stringBuilder.toString();
        this.Q().compileStatement((String)object).execute();
    }

    public final /* synthetic */ Boolean i0(f2.p p8, SQLiteDatabase sQLiteDatabase) {
        if ((p8 = this.V(sQLiteDatabase, p8)) == null) {
            return Boolean.FALSE;
        }
        return (Boolean)M.G0(this.Q().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{p8.toString()}), new t());
    }

    @Override
    public boolean j(f2.p p8) {
        return (Boolean)this.W(new n(this, p8));
    }

    public final /* synthetic */ List l0(f2.p p8, SQLiteDatabase sQLiteDatabase) {
        List list = this.y0(sQLiteDatabase, p8, this.r.d());
        for (c2.d d8 : c2.d.values()) {
            if (d8 == p8.d()) continue;
            int n8 = this.r.d() - list.size();
            if (n8 <= 0) break;
            list.addAll((Collection)this.y0(sQLiteDatabase, p8.f(d8), n8));
        }
        return this.Y(list, this.z0(sQLiteDatabase, list));
    }

    public final /* synthetic */ i2.a m0(Map map, a.a a8, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string2 = cursor.getString(0);
            c.b b8 = this.M(cursor.getInt(1));
            long l8 = cursor.getLong(2);
            if (!map.containsKey((Object)string2)) {
                map.put((Object)string2, (Object)new ArrayList());
            }
            ((List)map.get((Object)string2)).add((Object)i2.c.c().c(b8).b(l8).a());
        }
        this.B0(a8, map);
        a8.e(this.U());
        a8.d(this.R());
        a8.c((String)this.s.get());
        return a8.b();
    }

    public final /* synthetic */ i2.a n0(String string2, Map map, a.a a8, SQLiteDatabase sQLiteDatabase) {
        return (i2.a)M.G0(sQLiteDatabase.rawQuery(string2, new String[0]), new A(this, map, a8));
    }

    @Override
    public Iterable o() {
        return (Iterable)this.W(new G());
    }

    /*
     * Enabled aggressive block sorting
     */
    public final /* synthetic */ Object o0(List list, f2.p p8, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean bl = false;
            long l8 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                bl = true;
            }
            i.a a8 = i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            h h8 = bl ? new h(M.E0(cursor.getString(4)), cursor.getBlob(5)) : new h(M.E0(cursor.getString(4)), this.C0(l8));
            a8.h(h8);
            if (!cursor.isNull(6)) {
                a8.g(cursor.getInt(6));
            }
            list.add((Object)k.a(l8, p8, a8.d()));
        }
        return null;
    }

    @Override
    public long p(f2.p p8) {
        return (Long)M.G0(this.Q().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{p8.b(), String.valueOf((int)a.a(p8.d()))}), new H());
    }

    public final /* synthetic */ Long q0(i i8, f2.p arrby3, SQLiteDatabase sQLiteDatabase) {
        if (this.X()) {
            this.c(1L, c.b.r, i8.j());
            return -1L;
        }
        long l8 = this.O(sQLiteDatabase, (f2.p)arrby3);
        int n8 = this.r.e();
        byte[] arrby2 = i8.e().a();
        int n9 = arrby2.length;
        boolean bl = n9 <= n8;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf((long)l8));
        contentValues.put("transport_name", i8.j());
        contentValues.put("timestamp_ms", Long.valueOf((long)i8.f()));
        contentValues.put("uptime_ms", Long.valueOf((long)i8.k()));
        contentValues.put("payload_encoding", i8.e().b().a());
        contentValues.put("code", i8.d());
        contentValues.put("num_attempts", Integer.valueOf((int)0));
        contentValues.put("inline", Boolean.valueOf((boolean)bl));
        arrby3 = bl ? arrby2 : new byte[]{};
        contentValues.put("payload", arrby3);
        l8 = sQLiteDatabase.insert("events", null, contentValues);
        if (!bl) {
            n9 = (int)Math.ceil((double)((double)arrby2.length / (double)n8));
            for (int i9 = 1; i9 <= n9; ++i9) {
                arrby3 = Arrays.copyOfRange((byte[])arrby2, (int)((i9 - 1) * n8), (int)Math.min((int)(i9 * n8), (int)arrby2.length));
                contentValues = new ContentValues();
                contentValues.put("event_id", Long.valueOf((long)l8));
                contentValues.put("sequence_num", Integer.valueOf((int)i9));
                contentValues.put("bytes", arrby3);
                sQLiteDatabase.insert("event_payloads", null, contentValues);
            }
        }
        for (byte[] arrby3 : i8.i().entrySet()) {
            arrby2 = new ContentValues();
            arrby2.put("event_id", Long.valueOf((long)l8));
            arrby2.put("name", (String)arrby3.getKey());
            arrby2.put("value", (String)arrby3.getValue());
            sQLiteDatabase.insert("event_metadata", null, (ContentValues)arrby2);
        }
        return l8;
    }

    public final /* synthetic */ Object s0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int n8 = cursor.getInt(0);
            String string2 = cursor.getString(1);
            this.c(n8, c.b.t, string2);
        }
        return null;
    }

    public final /* synthetic */ Object t0(String string2, String string3, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(string2).execute();
        M.G0(sQLiteDatabase.rawQuery(string3, null), new u(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public final /* synthetic */ Object x0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE global_log_event_state SET last_metrics_upload_ms=");
        stringBuilder.append(this.p.a());
        sQLiteDatabase.compileStatement(stringBuilder.toString()).execute();
        return null;
    }

    @Override
    public void y(Iterable iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        stringBuilder.append(M.F0(iterable));
        this.W(new K(this, stringBuilder.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
    }

    public final List y0(SQLiteDatabase sQLiteDatabase, f2.p p8, int n8) {
        ArrayList arrayList = new ArrayList();
        Object object = this.V(sQLiteDatabase, p8);
        if (object == null) {
            return arrayList;
        }
        object = object.toString();
        M.G0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{object}, null, null, null, String.valueOf((int)n8)), new v(this, (List)arrayList, p8));
        return arrayList;
    }

    @Override
    public k z(f2.p p8, i i8) {
        j2.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", new Object[]{p8.d(), i8.j(), p8.b()});
        long l8 = (Long)this.W(new m(this, i8, p8));
        if (l8 < 1L) {
            return null;
        }
        return k.a(l8, p8, i8);
    }

    public final Map z0(SQLiteDatabase sQLiteDatabase, List object) {
        HashMap hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder("event_id IN (");
        for (int i8 = 0; i8 < object.size(); ++i8) {
            stringBuilder.append(((k)object.get(i8)).c());
            if (i8 >= object.size() - 1) continue;
            stringBuilder.append(',');
        }
        stringBuilder.append(')');
        object = stringBuilder.toString();
        M.G0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, (String)object, null, null, null, null), new z((Map)hashMap));
        return hashMap;
    }

    public static interface b {
        public Object apply(Object var1);
    }

    public static class c {
        public final String a;
        public final String b;

        public c(String string2, String string3) {
            this.a = string2;
            this.b = string3;
        }

        public /* synthetic */ c(String string2, String string3,  a8) {
            this(string2, string3);
        }
    }

    public static interface d {
        public Object a();
    }

}

