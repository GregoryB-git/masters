// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R3;

import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.HashSet;
import a4.i;
import X3.h;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import d4.o;
import V3.B;
import android.content.ContentValues;
import d4.b;
import android.database.sqlite.SQLiteException;
import Q3.d;
import android.database.sqlite.SQLiteDatabaseLockedException;
import java.util.Iterator;
import android.database.Cursor;
import Y3.e;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import d4.g;
import d4.n;
import java.util.ArrayList;
import java.util.List;
import V3.k;
import Y3.m;
import java.io.IOException;
import java.net.URLEncoder;
import android.content.Context;
import c4.c;
import android.database.sqlite.SQLiteDatabase;
import java.nio.charset.Charset;
import X3.f;

public class j implements f
{
    public static final Charset e;
    public final SQLiteDatabase a;
    public final c4.c b;
    public boolean c;
    public long d;
    
    static {
        e = Charset.forName("UTF-8");
    }
    
    public j(final Context context, final V3.f f, String encode) {
        this.d = 0L;
        try {
            encode = URLEncoder.encode(encode, "utf-8");
            this.b = f.q("Persistence");
            this.a = this.C(context, encode);
        }
        catch (IOException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    public static String E(final String s) {
        m.g(s.endsWith("/"), "Path keys must end with a '/'");
        final StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, s.length() - 1));
        sb.append('0');
        return sb.toString();
    }
    
    public static String F(final k k) {
        if (k.isEmpty()) {
            return "/";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(k.toString());
        sb.append("/");
        return sb.toString();
    }
    
    public static List M(final byte[] array, final int a) {
        final int initialCapacity = (array.length - 1) / a + 1;
        final ArrayList list = new ArrayList<byte[]>(initialCapacity);
        for (int i = 0; i < initialCapacity; ++i) {
            final int length = array.length;
            final int n = i * a;
            final int min = Math.min(a, length - n);
            final byte[] array2 = new byte[min];
            System.arraycopy(array, n, array2, 0, min);
            list.add(array2);
        }
        return list;
    }
    
    public static String w(k a0, final String[] array) {
        final int length = array.length;
        final int size = a0.size();
        boolean b = true;
        int n = 0;
        if (length < size + 1) {
            b = false;
        }
        m.f(b);
        final StringBuilder sb = new StringBuilder("(");
        while (true) {
            final boolean empty = a0.isEmpty();
            sb.append("path");
            if (empty) {
                break;
            }
            sb.append(" = ? OR ");
            array[n] = F(a0);
            a0 = a0.a0();
            ++n;
        }
        sb.append(" = ?)");
        array[n] = F(k.Y());
        return sb.toString();
    }
    
    public final n A(final k k) {
        final ArrayList<String> list = new ArrayList<String>();
        final ArrayList<byte[]> list2 = new ArrayList<byte[]>();
        final long currentTimeMillis = System.currentTimeMillis();
        final Cursor b = this.B(k, new String[] { "path", "value" });
        final long l = System.currentTimeMillis() - currentTimeMillis;
        final long currentTimeMillis2 = System.currentTimeMillis();
        Label_0685: {
            try {
                while (b.moveToNext()) {
                    list.add(b.getString(0));
                    list2.add(b.getBlob(1));
                }
            }
            finally {
                break Label_0685;
            }
            b.close();
            final long i = System.currentTimeMillis() - currentTimeMillis2;
            final long currentTimeMillis3 = System.currentTimeMillis();
            n n = g.W();
            final HashMap<k, n> hashMap = new HashMap<k, n>();
            int n2;
            final k k3;
            for (int j = n2 = 0; j < list2.size(); ++j) {
                n y;
                k k2;
                if (((String)list.get(j)).endsWith(".part-0000")) {
                    final String s = list.get(j);
                    final k m = new k(s.substring(0, s.length() - 10));
                    final int n3 = this.N(m, list, j);
                    if (this.b.f()) {
                        final c4.c b2 = this.b;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Loading split node with ");
                        sb.append(n3);
                        sb.append(" parts.");
                        b2.b(sb.toString(), new Object[0]);
                    }
                    final int n4 = n3 + j;
                    y = this.y(this.z(list2.subList(j, n4)));
                    j = n4 - 1;
                    k2 = m;
                }
                else {
                    final n y2 = this.y(list2.get(j));
                    k2 = new k(list.get(j));
                    y = y2;
                }
                if (k2.X() != null && k2.X().s()) {
                    hashMap.put(k2, y);
                }
                else if (k2.W(k3)) {
                    m.g((boolean)((n2 ^ 0x1) != 0x0), "Descendants of path must come after ancestors.");
                    n = y.A(k.b0(k2, k3));
                }
                else {
                    if (!k3.W(k2)) {
                        throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", k2, k3));
                    }
                    n = n.y(k.b0(k3, k2), y);
                    n2 = 1;
                }
            }
            for (final Map.Entry<k, n> entry : hashMap.entrySet()) {
                n = n.y(k.b0(k3, entry.getKey()), entry.getValue());
            }
            final long currentTimeMillis4 = System.currentTimeMillis();
            final long currentTimeMillis5 = System.currentTimeMillis();
            if (this.b.f()) {
                this.b.b(String.format(Locale.US, "Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", list2.size(), Y3.e.c(n), k3, currentTimeMillis5 - currentTimeMillis, l, i, currentTimeMillis4 - currentTimeMillis3), new Object[0]);
            }
            return n;
        }
        b.close();
    }
    
    public final Cursor B(final k k, final String[] array) {
        final String f = F(k);
        final String e = E(f);
        final String[] array2 = new String[k.size() + 3];
        final String w = w(k, array2);
        final StringBuilder sb = new StringBuilder();
        sb.append(w);
        sb.append(" OR (path > ? AND path < ?)");
        final String string = sb.toString();
        array2[k.size() + 1] = f;
        array2[k.size() + 2] = e;
        return this.a.query("serverCache", array, string, array2, (String)null, (String)null, "path");
    }
    
    public final SQLiteDatabase C(final Context context, final String s) {
        final c c = new c(context, s);
        try {
            final SQLiteDatabase writableDatabase = c.getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", (String[])null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        }
        catch (SQLiteException ex) {
            if (ex instanceof SQLiteDatabaseLockedException) {
                throw new d("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", (Throwable)ex);
            }
            throw ex;
        }
    }
    
    public final String D(final k k, final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append(F(k));
        sb.append(String.format(Locale.US, ".part-%04d", i));
        return sb.toString();
    }
    
    public final void G(k t, final k k, final Y3.d d, final Y3.d d2, final X3.g g, final List list) {
        if (d.getValue() != null) {
            final Integer n = (Integer)g.b(0, new Y3.d.c() {
                public Integer b(final k k, final Void void1, final Integer n) {
                    int intValue;
                    if (d2.s(k) == null) {
                        intValue = n + 1;
                    }
                    else {
                        intValue = n;
                    }
                    return intValue;
                }
            });
            if (n > 0) {
                t = t.T(k);
                if (this.b.f()) {
                    this.b.b(String.format(Locale.US, "Need to rewrite %d nodes below path %s", n, t), new Object[0]);
                }
                g.b(null, new Y3.d.c() {
                    public final /* synthetic */ n d = j.this.A(t);
                    
                    public Void b(final k k, final Void void1, final Void void2) {
                        if (d2.s(k) == null) {
                            list.add(new Y3.g(k.T(k), this.d.A(k)));
                        }
                        return null;
                    }
                });
            }
        }
        else {
            for (final Map.Entry<b, V> entry : d.M()) {
                final b b = entry.getKey();
                this.G(t, k.U(b), (Y3.d)entry.getValue(), d2.D(b), g.a(entry.getKey()), list);
            }
        }
    }
    
    public final int H(final String s, final k k) {
        final String f = F(k);
        return this.a.delete(s, "path >= ? AND path < ?", new String[] { f, E(f) });
    }
    
    public final int I(final k k, final n n) {
        int n2 = 0;
        final long b = Y3.e.b(n);
        if (n instanceof d4.c && b > 16384L) {
            if (this.b.f()) {
                this.b.b(String.format(Locale.US, "Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", k, b, 16384), new Object[0]);
            }
            for (final d4.m m : n) {
                n2 += this.I(k.U(m.c()), m.d());
            }
            int n3 = n2;
            if (!n.t().isEmpty()) {
                this.J(k.U(d4.b.o()), n.t());
                n3 = n2 + 1;
            }
            this.J(k, g.W());
            return n3 + 1;
        }
        this.J(k, n);
        return 1;
    }
    
    public final void J(final k k, final n n) {
        final byte[] l = this.L(n.L(true));
        if (l.length >= 262144) {
            final List m = M(l, 262144);
            final boolean f = this.b.f();
            int i;
            final int n2 = i = 0;
            if (f) {
                final c4.c b = this.b;
                final StringBuilder sb = new StringBuilder();
                sb.append("Saving huge leaf node with ");
                sb.append(m.size());
                sb.append(" parts.");
                b.b(sb.toString(), new Object[0]);
                i = n2;
            }
            while (i < m.size()) {
                final ContentValues contentValues = new ContentValues();
                contentValues.put("path", this.D(k, i));
                contentValues.put("value", (byte[])m.get(i));
                this.a.insertWithOnConflict("serverCache", (String)null, contentValues, 5);
                ++i;
            }
        }
        else {
            final ContentValues contentValues2 = new ContentValues();
            contentValues2.put("path", F(k));
            contentValues2.put("value", l);
            this.a.insertWithOnConflict("serverCache", (String)null, contentValues2, 5);
        }
    }
    
    public final void K(final k k, final long l, final String s, final byte[] array) {
        this.P();
        this.a.delete("writes", "id = ?", new String[] { String.valueOf(l) });
        if (array.length >= 262144) {
            final List m = M(array, 262144);
            for (int i = 0; i < m.size(); ++i) {
                final ContentValues contentValues = new ContentValues();
                contentValues.put("id", Long.valueOf(l));
                contentValues.put("path", F(k));
                contentValues.put("type", s);
                contentValues.put("part", Integer.valueOf(i));
                contentValues.put("node", (byte[])m.get(i));
                this.a.insertWithOnConflict("writes", (String)null, contentValues, 5);
            }
        }
        else {
            final ContentValues contentValues2 = new ContentValues();
            contentValues2.put("id", Long.valueOf(l));
            contentValues2.put("path", F(k));
            contentValues2.put("type", s);
            contentValues2.put("part", (Integer)null);
            contentValues2.put("node", array);
            this.a.insertWithOnConflict("writes", (String)null, contentValues2, 5);
        }
    }
    
    public final byte[] L(final Object o) {
        try {
            return f4.b.d(o).getBytes(j.e);
        }
        catch (IOException cause) {
            throw new RuntimeException("Could not serialize leaf node", cause);
        }
    }
    
    public final int N(final k k, final List list, final int n) {
        int n2 = n + 1;
        final String f = F(k);
        if (list.get(n).startsWith(f)) {
            while (n2 < list.size() && list.get(n2).equals(this.D(k, n2 - n))) {
                ++n2;
            }
            if (n2 < list.size()) {
                final String s = list.get(n2);
                final StringBuilder sb = new StringBuilder();
                sb.append(f);
                sb.append(".part-");
                if (s.startsWith(sb.toString())) {
                    throw new IllegalStateException("Run did not finish with all parts");
                }
            }
            return n2 - n;
        }
        throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
    }
    
    public final void O(final k k, final n n, final boolean b) {
        final long currentTimeMillis = System.currentTimeMillis();
        int h;
        int i;
        if (!b) {
            h = this.H("serverCache", k);
            i = this.I(k, n);
        }
        else {
            final Iterator<d4.m> iterator = n.iterator();
            i = (h = 0);
            while (iterator.hasNext()) {
                final d4.m m = iterator.next();
                h += this.H("serverCache", k.U(m.c()));
                i += this.I(k.U(m.c()), m.d());
            }
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", i, h, k.toString(), currentTimeMillis2 - currentTimeMillis), new Object[0]);
        }
    }
    
    public final void P() {
        m.g(this.c, "Transaction expected to already be in progress.");
    }
    
    @Override
    public void a() {
        this.P();
        final long currentTimeMillis = System.currentTimeMillis();
        final int delete = this.a.delete("writes", (String)null, (String[])null);
        final long currentTimeMillis2 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format(Locale.US, "Deleted %d (all) write(s) in %dms", delete, currentTimeMillis2 - currentTimeMillis), new Object[0]);
        }
    }
    
    @Override
    public void b(final long n) {
        this.P();
        final long currentTimeMillis = System.currentTimeMillis();
        final int delete = this.a.delete("writes", "id = ?", new String[] { String.valueOf(n) });
        final long currentTimeMillis2 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format(Locale.US, "Deleted %d write(s) with writeId %d in %dms", delete, n, currentTimeMillis2 - currentTimeMillis), new Object[0]);
        }
    }
    
    @Override
    public void c(final k k, final V3.b b, long currentTimeMillis) {
        this.P();
        final long currentTimeMillis2 = System.currentTimeMillis();
        this.K(k, currentTimeMillis, "m", this.L(b.U(true)));
        currentTimeMillis = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format(Locale.US, "Persisted user merge in %dms", currentTimeMillis - currentTimeMillis2), new Object[0]);
        }
    }
    
    @Override
    public List d() {
        final long currentTimeMillis = System.currentTimeMillis();
        final Cursor query = this.a.query("writes", new String[] { "id", "path", "type", "part", "node" }, (String)null, (String[])null, (String)null, (String)null, "id, part");
        final ArrayList<B> list = new ArrayList<B>();
        while (true) {
            try {
                try {
                    while (query.moveToNext()) {
                        final long long1 = query.getLong(0);
                        final k k = new k(query.getString(1));
                        final String string = query.getString(2);
                        byte[] bytes;
                        if (query.isNull(3)) {
                            bytes = query.getBlob(4);
                        }
                        else {
                            final ArrayList<byte[]> list2 = new ArrayList<byte[]>();
                            do {
                                list2.add(query.getBlob(4));
                            } while (query.moveToNext() && query.getLong(0) == long1);
                            query.moveToPrevious();
                            bytes = this.z(list2);
                        }
                        final Object b = f4.b.b(new String(bytes, j.e));
                        B b2;
                        if ("o".equals(string)) {
                            b2 = new B(long1, k, o.a(b), true);
                        }
                        else {
                            if (!"m".equals(string)) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Got invalid write type: ");
                                sb.append(string);
                                throw new IllegalStateException(sb.toString());
                            }
                            b2 = new B(long1, k, V3.b.M((Map)b));
                        }
                        list.add(b2);
                    }
                    final long currentTimeMillis2 = System.currentTimeMillis();
                    if (this.b.f()) {
                        this.b.b(String.format(Locale.US, "Loaded %d writes in %dms", list.size(), currentTimeMillis2 - currentTimeMillis), new Object[0]);
                    }
                    query.close();
                    return list;
                    query.close();
                    throw;
                    final IOException cause;
                    throw new RuntimeException("Failed to load writes", cause);
                }
                finally {}
            }
            catch (IOException ex) {}
            final IOException ex;
            final IOException cause = ex;
            continue;
        }
    }
    
    @Override
    public void e(final k k, final n n, long currentTimeMillis) {
        this.P();
        final long currentTimeMillis2 = System.currentTimeMillis();
        this.K(k, currentTimeMillis, "o", this.L(n.L(true)));
        currentTimeMillis = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format(Locale.US, "Persisted user overwrite in %dms", currentTimeMillis - currentTimeMillis2), new Object[0]);
        }
    }
    
    @Override
    public void f() {
        this.a.endTransaction();
        this.c = false;
        final long currentTimeMillis = System.currentTimeMillis();
        final long d = this.d;
        if (this.b.f()) {
            this.b.b(String.format(Locale.US, "Transaction completed. Elapsed: %dms", currentTimeMillis - d), new Object[0]);
        }
    }
    
    @Override
    public void g() {
        m.g(this.c ^ true, "runInTransaction called when an existing transaction is already in progress.");
        if (this.b.f()) {
            this.b.b("Starting transaction.", new Object[0]);
        }
        this.a.beginTransaction();
        this.c = true;
        this.d = System.currentTimeMillis();
    }
    
    @Override
    public void h(final long l) {
        this.P();
        final String value = String.valueOf(l);
        this.a.delete("trackedQueries", "id = ?", new String[] { value });
        this.a.delete("trackedKeys", "id = ?", new String[] { value });
    }
    
    @Override
    public Set i(final long l) {
        return this.v(Collections.singleton(l));
    }
    
    @Override
    public void j(long currentTimeMillis) {
        this.P();
        final long currentTimeMillis2 = System.currentTimeMillis();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.FALSE);
        contentValues.put("lastUse", Long.valueOf(currentTimeMillis));
        this.a.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        currentTimeMillis = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format(Locale.US, "Reset active tracked queries in %dms", currentTimeMillis - currentTimeMillis2), new Object[0]);
        }
    }
    
    @Override
    public void k(final long l, final Set set) {
        this.P();
        final long currentTimeMillis = System.currentTimeMillis();
        this.a.delete("trackedKeys", "id = ?", new String[] { String.valueOf(l) });
        for (final b b : set) {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(l));
            contentValues.put("key", b.e());
            this.a.insertWithOnConflict("trackedKeys", (String)null, contentValues, 5);
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format(Locale.US, "Set %d tracked query keys for tracked query %d in %dms", set.size(), l, currentTimeMillis2 - currentTimeMillis), new Object[0]);
        }
    }
    
    @Override
    public long l() {
        final Cursor rawQuery = this.a.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", "value", "path", "serverCache"), (String[])null);
        Label_0078: {
            try {
                if (rawQuery.moveToFirst()) {
                    final long long1 = rawQuery.getLong(0);
                    rawQuery.close();
                    return long1;
                }
            }
            finally {
                break Label_0078;
            }
            throw new IllegalStateException("Couldn't read database result!");
        }
        rawQuery.close();
    }
    
    @Override
    public void m(final k k, final X3.g g) {
        if (!g.e()) {
            return;
        }
        this.P();
        final long currentTimeMillis = System.currentTimeMillis();
        final Cursor b = this.B(k, new String[] { "rowid", "path" });
        Y3.d w = new Y3.d(null);
        Y3.d w2 = new Y3.d(null);
        while (b.moveToNext()) {
            final long long1 = b.getLong(0);
            final k i = new k(b.getString(1));
            c4.c c;
            StringBuilder sb;
            String str;
            if (!k.W(i)) {
                c = this.b;
                sb = new StringBuilder();
                sb.append("We are pruning at ");
                sb.append(k);
                sb.append(" but we have data stored higher up at ");
                sb.append(i);
                str = ". Ignoring.";
            }
            else {
                final k b2 = k.b0(k, i);
                if (g.g(b2)) {
                    w = w.W(b2, long1);
                    continue;
                }
                if (g.f(b2)) {
                    w2 = w2.W(b2, long1);
                    continue;
                }
                c = this.b;
                sb = new StringBuilder();
                sb.append("We are pruning at ");
                sb.append(k);
                sb.append(" and have data at ");
                sb.append(i);
                str = " that isn't marked for pruning or keeping. Ignoring.";
            }
            sb.append(str);
            c.i(sb.toString());
        }
        int size;
        int size2;
        if (!w.isEmpty()) {
            final ArrayList<Y3.g> list = new ArrayList<Y3.g>();
            this.G(k, k.Y(), w, w2, g, list);
            final Collection z = w.Z();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("rowid IN (");
            sb2.append(this.x(z));
            sb2.append(")");
            this.a.delete("serverCache", sb2.toString(), (String[])null);
            for (final Y3.g g2 : list) {
                this.I(k.T((k)g2.a()), (n)g2.b());
            }
            size = z.size();
            size2 = list.size();
        }
        else {
            size = (size2 = 0);
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format(Locale.US, "Pruned %d rows with %d nodes resaved in %dms", size, size2, currentTimeMillis2 - currentTimeMillis), new Object[0]);
        }
    }
    
    @Override
    public List n() {
        final long currentTimeMillis = System.currentTimeMillis();
        final Cursor query = this.a.query("trackedQueries", new String[] { "id", "path", "queryParams", "lastUse", "complete", "active" }, (String)null, (String[])null, (String)null, (String)null, "id");
        final ArrayList<h> list = new ArrayList<h>();
    Label_0287_Outer:
        while (true) {
            while (true) {
                try {
                Label_0217:
                    while (query.moveToNext()) {
                    Label_0178_Outer:
                        while (true) {
                            final long long1 = query.getLong(0);
                            final k k = new k(query.getString(1));
                            final String string = query.getString(2);
                            while (true) {
                            Label_0303:
                                while (true) {
                                    Label_0297: {
                                        try {
                                            final i b = i.b(k, f4.b.a(string));
                                            final long long2 = query.getLong(3);
                                            if (query.getInt(4) == 0) {
                                                break Label_0297;
                                            }
                                            final boolean b2 = true;
                                            if (query.getInt(5) != 0) {
                                                final boolean b3 = true;
                                                list.add(new h(long1, b, long2, b2, b3));
                                                break;
                                            }
                                            break Label_0303;
                                        }
                                        catch (IOException cause) {
                                            throw new RuntimeException(cause);
                                        }
                                        break Label_0217;
                                    }
                                    final boolean b2 = false;
                                    continue Label_0178_Outer;
                                }
                                final boolean b3 = false;
                                continue Label_0287_Outer;
                            }
                        }
                    }
                    final long currentTimeMillis2 = System.currentTimeMillis();
                    if (this.b.f()) {
                        this.b.b(String.format(Locale.US, "Loaded %d tracked queries in %dms", list.size(), currentTimeMillis2 - currentTimeMillis), new Object[0]);
                    }
                    query.close();
                    return list;
                    query.close();
                }
                finally {}
                continue;
            }
        }
    }
    
    @Override
    public void o(final k k, final V3.b b) {
        this.P();
        final long currentTimeMillis = System.currentTimeMillis();
        final Iterator iterator = b.iterator();
        int j;
        int i = j = 0;
        while (iterator.hasNext()) {
            final Map.Entry<k, V> entry = iterator.next();
            i += this.H("serverCache", k.T(entry.getKey()));
            j += this.I(k.T(entry.getKey()), (n)entry.getValue());
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", j, i, k.toString(), currentTimeMillis2 - currentTimeMillis), new Object[0]);
        }
    }
    
    @Override
    public void p() {
        this.a.setTransactionSuccessful();
    }
    
    @Override
    public n q(final k k) {
        return this.A(k);
    }
    
    @Override
    public void r(final long l, final Set set, final Set set2) {
        this.P();
        final long currentTimeMillis = System.currentTimeMillis();
        final Iterator<b> iterator = set2.iterator();
        while (iterator.hasNext()) {
            this.a.delete("trackedKeys", "id = ? AND key = ?", new String[] { String.valueOf(l), iterator.next().e() });
        }
        for (final b b : set) {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(l));
            contentValues.put("key", b.e());
            this.a.insertWithOnConflict("trackedKeys", (String)null, contentValues, 5);
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format(Locale.US, "Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", set.size(), set2.size(), l, currentTimeMillis2 - currentTimeMillis), new Object[0]);
        }
    }
    
    @Override
    public void s(final k k, final n n) {
        this.P();
        this.O(k, n, true);
    }
    
    @Override
    public void t(final k k, final n n) {
        this.P();
        this.O(k, n, false);
    }
    
    @Override
    public void u(final h h) {
        this.P();
        final long currentTimeMillis = System.currentTimeMillis();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(h.a));
        contentValues.put("path", F(h.b.e()));
        contentValues.put("queryParams", h.b.d().y());
        contentValues.put("lastUse", Long.valueOf(h.c));
        contentValues.put("complete", Boolean.valueOf(h.d));
        contentValues.put("active", Boolean.valueOf(h.e));
        this.a.insertWithOnConflict("trackedQueries", (String)null, contentValues, 5);
        final long currentTimeMillis2 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format(Locale.US, "Saved new tracked query in %dms", currentTimeMillis2 - currentTimeMillis), new Object[0]);
        }
    }
    
    @Override
    public Set v(final Set set) {
        final long currentTimeMillis = System.currentTimeMillis();
        final StringBuilder sb = new StringBuilder();
        sb.append("id IN (");
        sb.append(this.x(set));
        sb.append(")");
        final Cursor query = this.a.query(true, "trackedKeys", new String[] { "key" }, sb.toString(), (String[])null, (String)null, (String)null, (String)null, (String)null);
        final HashSet<b> set2 = new HashSet<b>();
        while (true) {
            try {
                while (query.moveToNext()) {
                    set2.add(d4.b.j(query.getString(0)));
                }
                final long currentTimeMillis2 = System.currentTimeMillis();
                if (this.b.f()) {
                    this.b.b(String.format(Locale.US, "Loaded %d tracked queries keys for tracked queries %s in %dms", set2.size(), set.toString(), currentTimeMillis2 - currentTimeMillis), new Object[0]);
                }
                query.close();
                return set2;
                query.close();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final String x(final Collection collection) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<Long> iterator = collection.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final long longValue = iterator.next();
            if (n == 0) {
                sb.append(",");
            }
            sb.append(longValue);
            n = 0;
        }
        return sb.toString();
    }
    
    public final n y(final byte[] array) {
        try {
            return o.a(f4.b.b(new String(array, j.e)));
        }
        catch (IOException cause) {
            final String str = new String(array, j.e);
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not deserialize node: ");
            sb.append(str);
            throw new RuntimeException(sb.toString(), cause);
        }
    }
    
    public final byte[] z(final List list) {
        final Iterator<byte[]> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += iterator.next().length;
        }
        final byte[] array = new byte[n];
        final Iterator<byte[]> iterator2 = list.iterator();
        int n2 = 0;
        while (iterator2.hasNext()) {
            final byte[] array2 = iterator2.next();
            System.arraycopy(array2, 0, array, n2, array2.length);
            n2 += array2.length;
        }
        return array;
    }
    
    public static class c extends SQLiteOpenHelper
    {
        public c(final Context context, final String s) {
            super(context, s, (SQLiteDatabase$CursorFactory)null, 2);
        }
        
        public final void a(final SQLiteDatabase sqLiteDatabase, final String str) {
            final StringBuilder sb = new StringBuilder();
            sb.append("DROP TABLE IF EXISTS ");
            sb.append(str);
            sqLiteDatabase.execSQL(sb.toString());
        }
        
        public void onCreate(final SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sqLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
            sqLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            sqLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        }
        
        public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int i) {
            m.g(i == 2, "Why is onUpgrade() called with a different version?");
            if (n <= 1) {
                this.a(sqLiteDatabase, "serverCache");
                sqLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
                this.a(sqLiteDatabase, "complete");
                sqLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
                sqLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("We don't handle upgrading to ");
            sb.append(i);
            throw new AssertionError((Object)sb.toString());
        }
    }
}
