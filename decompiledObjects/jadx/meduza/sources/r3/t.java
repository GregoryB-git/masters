package r3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n3.a;
import n3.c;
import s3.b;

/* loaded from: classes.dex */
public final class t implements d, s3.b, c {
    public static final h3.c f = new h3.c("proto");

    /* renamed from: a, reason: collision with root package name */
    public final z f13584a;

    /* renamed from: b, reason: collision with root package name */
    public final t3.a f13585b;

    /* renamed from: c, reason: collision with root package name */
    public final t3.a f13586c;

    /* renamed from: d, reason: collision with root package name */
    public final e f13587d;

    /* renamed from: e, reason: collision with root package name */
    public final qb.a<String> f13588e;

    public interface a<T, U> {
        U apply(T t);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f13589a;

        /* renamed from: b, reason: collision with root package name */
        public final String f13590b;

        public b(String str, String str2) {
            this.f13589a = str;
            this.f13590b = str2;
        }
    }

    public t(t3.a aVar, t3.a aVar2, e eVar, z zVar, qb.a<String> aVar3) {
        this.f13584a = zVar;
        this.f13585b = aVar;
        this.f13586c = aVar2;
        this.f13587d = eVar;
        this.f13588e = aVar3;
    }

    public static Long Q(SQLiteDatabase sQLiteDatabase, k3.s sVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        int i10 = 2;
        ArrayList arrayList = new ArrayList(Arrays.asList(sVar.b(), String.valueOf(u3.a.a(sVar.d()))));
        if (sVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(sVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) k0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new j(i10));
    }

    public static h3.c h0(String str) {
        return str == null ? f : new h3.c(str);
    }

    public static String i0(Iterable<i> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> T k0(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // r3.d
    public final boolean B(k3.s sVar) {
        return ((Boolean) b0(new l(0, this, sVar))).booleanValue();
    }

    @Override // r3.c
    public final void C(final long j10, final c.a aVar, final String str) {
        b0(new a() { // from class: r3.m
            @Override // r3.t.a
            public final Object apply(Object obj) {
                String str2 = str;
                c.a aVar2 = aVar;
                long j11 = j10;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (((Boolean) t.k0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(aVar2.f11222a)}), new j(1))).booleanValue()) {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j11 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(aVar2.f11222a)});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put(Constants.REASON, Integer.valueOf(aVar2.f11222a));
                    contentValues.put("events_dropped_count", Long.valueOf(j11));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // r3.c
    public final n3.a H() {
        int i10 = n3.a.f11203e;
        a.C0169a c0169a = new a.C0169a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase I = I();
        I.beginTransaction();
        try {
            n3.a aVar = (n3.a) k0(I.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new r(this, hashMap, c0169a, 1));
            I.setTransactionSuccessful();
            return aVar;
        } finally {
            I.endTransaction();
        }
    }

    public final SQLiteDatabase I() {
        Object apply;
        z zVar = this.f13584a;
        Objects.requireNonNull(zVar);
        j jVar = new j(0);
        long a10 = this.f13586c.a();
        while (true) {
            try {
                apply = zVar.getWritableDatabase();
                break;
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f13586c.a() >= this.f13587d.a() + a10) {
                    apply = jVar.apply(e10);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        return (SQLiteDatabase) apply;
    }

    public final long M() {
        return I().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @Override // r3.d
    public final long N(k3.s sVar) {
        return ((Long) k0(I().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(u3.a.a(sVar.d()))}), new e0.d(2))).longValue();
    }

    @Override // r3.d
    public final void P(final long j10, final k3.s sVar) {
        b0(new a() { // from class: r3.n
            @Override // r3.t.a
            public final Object apply(Object obj) {
                long j11 = j10;
                k3.s sVar2 = sVar;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j11));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{sVar2.b(), String.valueOf(u3.a.a(sVar2.d()))}) < 1) {
                    contentValues.put("backend_name", sVar2.b());
                    contentValues.put("priority", Integer.valueOf(u3.a.a(sVar2.d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // r3.d
    public final int a() {
        final long a10 = this.f13585b.a() - this.f13587d.b();
        return ((Integer) b0(new a() { // from class: r3.k
            @Override // r3.t.a
            public final Object apply(Object obj) {
                t tVar = t.this;
                long j10 = a10;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                tVar.getClass();
                String[] strArr = {String.valueOf(j10)};
                t.k0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new p(tVar, 0));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            }
        })).intValue();
    }

    public final <T> T b0(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase I = I();
        I.beginTransaction();
        try {
            T apply = aVar.apply(I);
            I.setTransactionSuccessful();
            return apply;
        } finally {
            I.endTransaction();
        }
    }

    public final ArrayList c0(SQLiteDatabase sQLiteDatabase, k3.s sVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long Q = Q(sQLiteDatabase, sVar);
        if (Q == null) {
            return arrayList;
        }
        k0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{Q.toString()}, null, null, null, String.valueOf(i10)), new r(this, arrayList, sVar, 0));
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13584a.close();
    }

    @Override // s3.b
    public final <T> T f(b.a<T> aVar) {
        SQLiteDatabase I = I();
        long a10 = this.f13586c.a();
        while (true) {
            try {
                I.beginTransaction();
                try {
                    T a11 = aVar.a();
                    I.setTransactionSuccessful();
                    return a11;
                } finally {
                    I.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f13586c.a() >= this.f13587d.a() + a10) {
                    throw new s3.a("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // r3.c
    public final void g() {
        b0(new io.flutter.plugins.firebase.auth.g(this, 3));
    }

    @Override // r3.d
    public final void i(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder l10 = defpackage.f.l("DELETE FROM events WHERE _id in ");
            l10.append(i0(iterable));
            I().compileStatement(l10.toString()).execute();
        }
    }

    @Override // r3.d
    public final r3.b j(k3.s sVar, k3.n nVar) {
        Object[] objArr = {sVar.d(), nVar.k(), sVar.b()};
        String c10 = o3.a.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        long longValue = ((Long) b0(new p3.b(this, nVar, sVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new r3.b(longValue, sVar, nVar);
    }

    @Override // r3.d
    public final void s0(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder l10 = defpackage.f.l("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            l10.append(i0(iterable));
            b0(new o(this, l10.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    @Override // r3.d
    public final List x() {
        SQLiteDatabase I = I();
        I.beginTransaction();
        try {
            List list = (List) k0(I.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new e0.d(3));
            I.setTransactionSuccessful();
            return list;
        } finally {
            I.endTransaction();
        }
    }

    @Override // r3.d
    public final Iterable<i> z(k3.s sVar) {
        return (Iterable) b0(new o9.l(1, this, sVar));
    }
}
