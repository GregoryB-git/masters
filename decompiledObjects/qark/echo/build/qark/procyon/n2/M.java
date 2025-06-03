// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n2;

import f2.h;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.Objects;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import f2.i;
import android.content.ContentValues;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import i2.f;
import f2.p;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import p2.a;
import o2.b;

public class M implements n2.d, o2.b, n2.c
{
    public static final c2.b t;
    public final U o;
    public final p2.a p;
    public final p2.a q;
    public final e r;
    public final U5.a s;
    
    static {
        t = c2.b.b("proto");
    }
    
    public M(final p2.a p5, final p2.a q, final e r, final U o, final U5.a s) {
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    public static byte[] A0(final String s) {
        if (s == null) {
            return null;
        }
        return Base64.decode(s, 0);
    }
    
    public static c2.b E0(final String s) {
        if (s == null) {
            return M.t;
        }
        return c2.b.b(s);
    }
    
    public static String F0(final Iterable iterable) {
        final StringBuilder sb = new StringBuilder("(");
        final Iterator<k> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().c());
            if (iterator.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }
    
    public static Object G0(final Cursor cursor, final b b) {
        try {
            return b.apply(cursor);
        }
        finally {
            cursor.close();
        }
    }
    
    @Override
    public Iterable A(final p p) {
        return (Iterable)this.W((b)new L(this, p));
    }
    
    public final void B0(final i2.a.a a, final Map map) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            a.a(i2.d.c().c(entry.getKey()).b((List)entry.getValue()).a());
        }
    }
    
    public final byte[] C0(final long l) {
        return (byte[])G0(this.Q().query("event_payloads", new String[] { "bytes" }, "event_id = ?", new String[] { String.valueOf(l) }, (String)null, (String)null, "sequence_num"), (b)new B());
    }
    
    public final Object D0(final d d, final b b) {
        final long a = this.q.a();
        try {
            return d.a();
        }
        catch (SQLiteDatabaseLockedException ex) {
            if (this.q.a() >= this.r.b() + a) {
                return b.apply(ex);
            }
            SystemClock.sleep(50L);
            return d.a();
        }
    }
    
    public final i2.c.b M(final int i) {
        final i2.c.b p = i2.c.b.p;
        if (i == p.g()) {
            return p;
        }
        final i2.c.b q = i2.c.b.q;
        if (i == q.g()) {
            return q;
        }
        final i2.c.b r = i2.c.b.r;
        if (i == r.g()) {
            return r;
        }
        final i2.c.b s = i2.c.b.s;
        if (i == s.g()) {
            return s;
        }
        final i2.c.b t = i2.c.b.t;
        if (i == t.g()) {
            return t;
        }
        final i2.c.b u = i2.c.b.u;
        if (i == u.g()) {
            return u;
        }
        final i2.c.b v = i2.c.b.v;
        if (i == v.g()) {
            return v;
        }
        j2.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", i);
        return p;
    }
    
    public final void N(final SQLiteDatabase sqLiteDatabase) {
        this.D0((d)new l(sqLiteDatabase), (b)new w());
    }
    
    public final long O(final SQLiteDatabase sqLiteDatabase, final p p2) {
        final Long v = this.V(sqLiteDatabase, p2);
        if (v != null) {
            return v;
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", p2.b());
        contentValues.put("priority", Integer.valueOf(q2.a.a(p2.d())));
        contentValues.put("next_request_ms", Integer.valueOf(0));
        if (p2.c() != null) {
            contentValues.put("extras", Base64.encodeToString(p2.c(), 0));
        }
        return sqLiteDatabase.insert("transport_contexts", (String)null, contentValues);
    }
    
    public long P() {
        return this.S() * this.T();
    }
    
    public SQLiteDatabase Q() {
        final U o = this.o;
        Objects.requireNonNull(o);
        return (SQLiteDatabase)this.D0((d)new E(o), (b)new F());
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
        return (f)this.W((b)new C(this.p.a()));
    }
    
    public final Long V(final SQLiteDatabase sqLiteDatabase, final p p2) {
        final StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        final ArrayList<String> list = new ArrayList<String>(Arrays.asList(p2.b(), String.valueOf(q2.a.a(p2.d()))));
        if (p2.c() != null) {
            sb.append(" and extras = ?");
            list.add(Base64.encodeToString(p2.c(), 0));
        }
        else {
            sb.append(" and extras is null");
        }
        return (Long)G0(sqLiteDatabase.query("transport_contexts", new String[] { "_id" }, sb.toString(), (String[])list.toArray(new String[0]), (String)null, (String)null, (String)null), (b)new x());
    }
    
    public Object W(final b b) {
        final SQLiteDatabase q = this.Q();
        q.beginTransaction();
        try {
            final Object apply = b.apply(q);
            q.setTransactionSuccessful();
            return apply;
        }
        finally {
            q.endTransaction();
        }
    }
    
    public final boolean X() {
        return this.S() * this.T() >= this.r.f();
    }
    
    public final List Y(final List list, final Map map) {
        final ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            final k k = listIterator.next();
            if (!map.containsKey(k.c())) {
                continue;
            }
            final i.a l = k.b().l();
            for (final c c : map.get(k.c())) {
                l.c(c.a, c.b);
            }
            listIterator.set(n2.k.a(k.c(), k.d(), l.d()));
        }
        return list;
    }
    
    @Override
    public Object a(final a a) {
        final SQLiteDatabase q = this.Q();
        this.N(q);
        try {
            final Object e = a.e();
            q.setTransactionSuccessful();
            return e;
        }
        finally {
            q.endTransaction();
        }
    }
    
    @Override
    public i2.a b() {
        return (i2.a)this.W((b)new s(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), i2.a.e()));
    }
    
    @Override
    public void c(final long n, final i2.c.b b, final String s) {
        this.W((b)new q(s, b, n));
    }
    
    @Override
    public void close() {
        this.o.close();
    }
    
    @Override
    public void d(final p p2, final long n) {
        this.W((b)new o(n, p2));
    }
    
    @Override
    public void e() {
        this.W((b)new n2.p(this));
    }
    
    @Override
    public int f() {
        return (int)this.W((b)new I(this, this.p.a() - this.r.c()));
    }
    
    @Override
    public void g(final Iterable iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM events WHERE _id in ");
        sb.append(F0(iterable));
        this.Q().compileStatement(sb.toString()).execute();
    }
    
    @Override
    public boolean j(final p p) {
        return (boolean)this.W((b)new n(this, p));
    }
    
    @Override
    public Iterable o() {
        return (Iterable)this.W((b)new G());
    }
    
    @Override
    public long p(final p p) {
        return (long)G0(this.Q().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] { p.b(), String.valueOf(q2.a.a(p.d())) }), (b)new H());
    }
    
    @Override
    public void y(final Iterable iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        sb.append(F0(iterable));
        this.W((b)new K(this, sb.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
    }
    
    public final List y0(final SQLiteDatabase sqLiteDatabase, final p p3, final int i) {
        final ArrayList list = new ArrayList();
        final Long v = this.V(sqLiteDatabase, p3);
        if (v == null) {
            return list;
        }
        G0(sqLiteDatabase.query("events", new String[] { "_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline" }, "context_id = ?", new String[] { v.toString() }, (String)null, (String)null, (String)null, String.valueOf(i)), (b)new v(this, list, p3));
        return list;
    }
    
    @Override
    public k z(final p p2, final i i) {
        j2.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", p2.d(), i.j(), p2.b());
        final long longValue = (long)this.W((b)new m(this, i, p2));
        if (longValue < 1L) {
            return null;
        }
        return k.a(longValue, p2, i);
    }
    
    public final Map z0(final SQLiteDatabase sqLiteDatabase, final List list) {
        final HashMap hashMap = new HashMap();
        final StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); ++i) {
            sb.append(list.get(i).c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        G0(sqLiteDatabase.query("event_metadata", new String[] { "event_id", "name", "value" }, sb.toString(), (String[])null, (String)null, (String)null, (String)null), (b)new z(hashMap));
        return hashMap;
    }
    
    public interface b
    {
        Object apply(final Object p0);
    }
    
    public static class c
    {
        public final String a;
        public final String b;
        
        public c(final String a, final String b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public interface d
    {
        Object a();
    }
}
