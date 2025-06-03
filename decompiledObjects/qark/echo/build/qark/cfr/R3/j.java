/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteOpenHelper
 *  java.io.IOException
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.net.URLEncoder
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package R3;

import V3.B;
import V3.k;
import X3.f;
import X3.g;
import X3.h;
import Y3.d;
import Y3.e;
import Y3.m;
import a4.i;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import d4.n;
import d4.o;
import f4.b;
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

public class j
implements f {
    public static final Charset e = Charset.forName((String)"UTF-8");
    public final SQLiteDatabase a;
    public final c4.c b;
    public boolean c;
    public long d = 0L;

    public j(Context context, V3.f f8, String string2) {
        try {
            string2 = URLEncoder.encode((String)string2, (String)"utf-8");
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
        this.b = f8.q("Persistence");
        this.a = this.C(context, string2);
    }

    public static String E(String string2) {
        m.g(string2.endsWith("/"), "Path keys must end with a '/'");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2.substring(0, string2.length() - 1));
        stringBuilder.append('0');
        return stringBuilder.toString();
    }

    public static String F(k k8) {
        if (k8.isEmpty()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(k8.toString());
        stringBuilder.append("/");
        return stringBuilder.toString();
    }

    public static List M(byte[] arrby, int n8) {
        int n9 = (arrby.length - 1) / n8 + 1;
        ArrayList arrayList = new ArrayList(n9);
        for (int i8 = 0; i8 < n9; ++i8) {
            int n10 = arrby.length;
            int n11 = i8 * n8;
            n10 = Math.min((int)n8, (int)(n10 - n11));
            byte[] arrby2 = new byte[n10];
            System.arraycopy((Object)arrby, (int)n11, (Object)arrby2, (int)0, (int)n10);
            arrayList.add((Object)arrby2);
        }
        return arrayList;
    }

    public static String w(k k8, String[] arrstring) {
        int n8 = arrstring.length;
        int n9 = k8.size();
        boolean bl = true;
        int n10 = 0;
        if (n8 < n9 + 1) {
            bl = false;
        }
        m.f(bl);
        StringBuilder stringBuilder = new StringBuilder("(");
        do {
            bl = k8.isEmpty();
            stringBuilder.append("path");
            if (bl) break;
            stringBuilder.append(" = ? OR ");
            arrstring[n10] = j.F(k8);
            k8 = k8.a0();
            ++n10;
        } while (true);
        stringBuilder.append(" = ?)");
        arrstring[n10] = j.F(k.Y());
        return stringBuilder.toString();
    }

    public final n A(k k8) {
        Object object;
        Throwable throwable2;
        block12 : {
            int n8;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long l8 = System.currentTimeMillis();
            object = this.B(k8, new String[]{"path", "value"});
            long l9 = System.currentTimeMillis() - l8;
            long l10 = System.currentTimeMillis();
            try {
                while (object.moveToNext()) {
                    arrayList.add((Object)object.getString(0));
                    arrayList2.add((Object)object.getBlob(1));
                }
            }
            catch (Throwable throwable2) {
                break block12;
            }
            object.close();
            l10 = System.currentTimeMillis() - l10;
            long l11 = System.currentTimeMillis();
            object = d4.g.W();
            HashMap hashMap = new HashMap();
            int n9 = n8 = 0;
            while (n8 < arrayList2.size()) {
                Object object2;
                block16 : {
                    block14 : {
                        Object object3;
                        block15 : {
                            block13 : {
                                Object object4;
                                if (((String)arrayList.get(n8)).endsWith(".part-0000")) {
                                    object4 = (String)arrayList.get(n8);
                                    object4 = new k(object4.substring(0, object4.length() - 10));
                                    int n10 = this.N((k)object4, (List)arrayList, n8);
                                    if (this.b.f()) {
                                        object3 = this.b;
                                        object2 = new StringBuilder();
                                        object2.append("Loading split node with ");
                                        object2.append(n10);
                                        object2.append(" parts.");
                                        object3.b(object2.toString(), new Object[0]);
                                    }
                                    object3 = this.y(this.z(arrayList2.subList(n8, n10 += n8)));
                                    n8 = n10 - 1;
                                    object2 = object4;
                                } else {
                                    object4 = this.y((byte[])arrayList2.get(n8));
                                    object2 = new k((String)arrayList.get(n8));
                                    object3 = object4;
                                }
                                if (object2.X() == null || !object2.X().s()) break block13;
                                hashMap.put(object2, object3);
                                break block14;
                            }
                            if (!object2.W(k8)) break block15;
                            m.g((boolean)(n9 ^ 1), "Descendants of path must come after ancestors.");
                            object = object3.A(k.b0((k)object2, k8));
                            break block14;
                        }
                        if (!k8.W((k)object2)) break block16;
                        object = object.y(k.b0(k8, (k)object2), (n)object3);
                        n9 = 1;
                    }
                    ++n8;
                    continue;
                }
                throw new IllegalStateException(String.format((String)"Loading an unrelated row with path %s for %s", (Object[])new Object[]{object2, k8}));
            }
            for (Object object3 : hashMap.entrySet()) {
                object = object.y(k.b0(k8, (k)object3.getKey()), (n)object3.getValue());
            }
            long l12 = System.currentTimeMillis();
            long l13 = System.currentTimeMillis();
            if (this.b.f()) {
                this.b.b(String.format((Locale)Locale.US, (String)"Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", (Object[])new Object[]{arrayList2.size(), e.c((n)object), k8, l13 - l8, l9, l10, l12 - l11}), new Object[0]);
            }
            return object;
        }
        object.close();
        throw throwable2;
    }

    public final Cursor B(k k8, String[] arrstring) {
        String string2 = j.F(k8);
        String string3 = j.E(string2);
        String[] arrstring2 = new String[k8.size() + 3];
        String string4 = j.w(k8, arrstring2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string4);
        stringBuilder.append(" OR (path > ? AND path < ?)");
        string4 = stringBuilder.toString();
        arrstring2[k8.size() + 1] = string2;
        arrstring2[k8.size() + 2] = string3;
        return this.a.query("serverCache", arrstring, string4, arrstring2, null, null, "path");
    }

    public final SQLiteDatabase C(Context object, String string2) {
        object = new c((Context)object, string2);
        try {
            object = object.getWritableDatabase();
            object.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
            object.beginTransaction();
            object.endTransaction();
            return object;
        }
        catch (SQLiteException sQLiteException) {
            if (sQLiteException instanceof SQLiteDatabaseLockedException) {
                throw new Q3.d("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", (Throwable)sQLiteException);
            }
            throw sQLiteException;
        }
    }

    public final String D(k k8, int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(j.F(k8));
        stringBuilder.append(String.format((Locale)Locale.US, (String)".part-%04d", (Object[])new Object[]{n8}));
        return stringBuilder.toString();
    }

    public final void G(k k8, final k k9, d d8, final d d9, g g8, final List list) {
        if (d8.getValue() != null) {
            d8 = (Integer)g8.b(0, new d.c(){

                public Integer b(k k8, Void void_, Integer n8) {
                    int n9 = d9.s(k8) == null ? n8 + 1 : n8;
                    return n9;
                }
            });
            if (d8.intValue() > 0) {
                k8 = k8.T(k9);
                if (this.b.f()) {
                    this.b.b(String.format((Locale)Locale.US, (String)"Need to rewrite %d nodes below path %s", (Object[])new Object[]{d8, k8}), new Object[0]);
                }
                g8.b(null, new d.c(this.A(k8)){
                    public final /* synthetic */ n d;
                    {
                        this.d = n8;
                    }

                    public Void b(k k8, Void void_, Void void_2) {
                        if (d9.s(k8) == null) {
                            list.add((Object)new Y3.g(k9.T(k8), this.d.A(k8)));
                        }
                        return null;
                    }
                });
                return;
            }
        } else {
            for (Map.Entry entry : d8.M()) {
                d4.b b8 = (d4.b)entry.getKey();
                g g9 = g8.a((d4.b)entry.getKey());
                this.G(k8, k9.U(b8), (d)entry.getValue(), d9.D(b8), g9, list);
            }
        }
    }

    public final int H(String string2, k object) {
        object = j.F((k)object);
        String string3 = j.E((String)object);
        return this.a.delete(string2, "path >= ? AND path < ?", new String[]{object, string3});
    }

    public final int I(k k8, n n8) {
        int n9 = 0;
        long l8 = e.b(n8);
        if (n8 instanceof d4.c && l8 > 16384L) {
            if (this.b.f()) {
                this.b.b(String.format((Locale)Locale.US, (String)"Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", (Object[])new Object[]{k8, l8, 16384}), new Object[0]);
            }
            for (d4.m m8 : n8) {
                n9 += this.I(k8.U(m8.c()), m8.d());
            }
            int n10 = n9;
            if (!n8.t().isEmpty()) {
                this.J(k8.U(d4.b.o()), n8.t());
                n10 = n9 + 1;
            }
            this.J(k8, d4.g.W());
            return n10 + 1;
        }
        this.J(k8, n8);
        return 1;
    }

    public final void J(k k8, n list) {
        if ((list = this.L(list.L(true))).length >= 262144) {
            c4.c c8;
            int n8;
            list = j.M((byte[])list, 262144);
            boolean bl = this.b.f();
            int n9 = n8 = 0;
            if (bl) {
                c8 = this.b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Saving huge leaf node with ");
                stringBuilder.append(list.size());
                stringBuilder.append(" parts.");
                c8.b(stringBuilder.toString(), new Object[0]);
                n9 = n8;
            }
            while (n9 < list.size()) {
                c8 = new ContentValues();
                c8.put("path", this.D(k8, n9));
                c8.put("value", (byte[])list.get(n9));
                this.a.insertWithOnConflict("serverCache", null, (ContentValues)c8, 5);
                ++n9;
            }
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", j.F(k8));
            contentValues.put("value", (byte[])list);
            this.a.insertWithOnConflict("serverCache", null, contentValues, 5);
        }
    }

    public final void K(k k8, long l8, String string2, byte[] list) {
        this.P();
        this.a.delete("writes", "id = ?", new String[]{String.valueOf((long)l8)});
        if (list.length >= 262144) {
            list = j.M((byte[])list, 262144);
            for (int i8 = 0; i8 < list.size(); ++i8) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", Long.valueOf((long)l8));
                contentValues.put("path", j.F(k8));
                contentValues.put("type", string2);
                contentValues.put("part", Integer.valueOf((int)i8));
                contentValues.put("node", (byte[])list.get(i8));
                this.a.insertWithOnConflict("writes", null, contentValues, 5);
            }
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf((long)l8));
            contentValues.put("path", j.F(k8));
            contentValues.put("type", string2);
            contentValues.put("part", null);
            contentValues.put("node", (byte[])list);
            this.a.insertWithOnConflict("writes", null, contentValues, 5);
        }
    }

    public final byte[] L(Object arrby) {
        try {
            arrby = b.d(arrby).getBytes(e);
            return arrby;
        }
        catch (IOException iOException) {
            throw new RuntimeException("Could not serialize leaf node", (Throwable)iOException);
        }
    }

    public final int N(k object, List list, int n8) {
        String string2 = j.F((k)object);
        if (((String)list.get(n8)).startsWith(string2)) {
            int n9;
            for (n9 = n8 + 1; n9 < list.size() && ((String)list.get(n9)).equals((Object)this.D((k)object, n9 - n8)); ++n9) {
            }
            if (n9 < list.size()) {
                object = (String)list.get(n9);
                list = new StringBuilder();
                list.append(string2);
                list.append(".part-");
                if (object.startsWith(list.toString())) {
                    throw new IllegalStateException("Run did not finish with all parts");
                }
            }
            return n9 - n8;
        }
        throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
    }

    public final void O(k k8, n n8, boolean bl) {
        int n9;
        int n10;
        long l8 = System.currentTimeMillis();
        if (!bl) {
            n9 = this.H("serverCache", k8);
            n10 = this.I(k8, n8);
        } else {
            n8 = n8.iterator();
            n9 = n10 = 0;
            while (n8.hasNext()) {
                d4.m m8 = (d4.m)n8.next();
                n9 += this.H("serverCache", k8.U(m8.c()));
                n10 += this.I(k8.U(m8.c()), m8.d());
            }
        }
        long l9 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format((Locale)Locale.US, (String)"Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", (Object[])new Object[]{n10, n9, k8.toString(), l9 - l8}), new Object[0]);
        }
    }

    public final void P() {
        m.g(this.c, "Transaction expected to already be in progress.");
    }

    @Override
    public void a() {
        this.P();
        long l8 = System.currentTimeMillis();
        int n8 = this.a.delete("writes", null, null);
        long l9 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format((Locale)Locale.US, (String)"Deleted %d (all) write(s) in %dms", (Object[])new Object[]{n8, l9 - l8}), new Object[0]);
        }
    }

    @Override
    public void b(long l8) {
        this.P();
        long l9 = System.currentTimeMillis();
        int n8 = this.a.delete("writes", "id = ?", new String[]{String.valueOf((long)l8)});
        long l10 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format((Locale)Locale.US, (String)"Deleted %d write(s) with writeId %d in %dms", (Object[])new Object[]{n8, l8, l10 - l9}), new Object[0]);
        }
    }

    @Override
    public void c(k k8, V3.b b8, long l8) {
        this.P();
        long l9 = System.currentTimeMillis();
        this.K(k8, l8, "m", this.L((Object)b8.U(true)));
        l8 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format((Locale)Locale.US, (String)"Persisted user merge in %dms", (Object[])new Object[]{l8 - l9}), new Object[0]);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public List d() {
        block12 : {
            var1_1 = System.currentTimeMillis();
            var6_2 = this.a.query("writes", new String[]{"id", "path", "type", "part", "node"}, null, null, null, null, "id, part");
            var7_3 = new ArrayList();
            try {
                while (var6_2.moveToNext()) {
                    var3_4 = var6_2.getLong(0);
                    var9_9 = new k(var6_2.getString(1));
                    var8_8 = var6_2.getString(2);
                    if (var6_2.isNull(3)) {
                        var5_5 = var6_2.getBlob(4);
                    } else {
                        var5_5 = new ArrayList();
                        do {
                            var5_5.add((Object)var6_2.getBlob(4));
                        } while (var6_2.moveToNext() && var6_2.getLong(0) == var3_4);
                        var6_2.moveToPrevious();
                        var5_5 = this.z((List)var5_5);
                    }
                    var5_5 = b.b(new String((byte[])var5_5, j.e));
                    if ("o".equals((Object)var8_8)) {
                        var5_5 = new B(var3_4, var9_9, o.a(var5_5), true);
                    } else {
                        if (!"m".equals((Object)var8_8)) {
                            var5_5 = new StringBuilder();
                            var5_5.append("Got invalid write type: ");
                            var5_5.append(var8_8);
                            throw new IllegalStateException(var5_5.toString());
                        }
                        var5_5 = new B(var3_4, var9_9, V3.b.M((Map)var5_5));
                    }
                    var7_3.add(var5_5);
                }
                var3_4 = System.currentTimeMillis();
                if (!this.b.f()) break block12;
                this.b.b(String.format((Locale)Locale.US, (String)"Loaded %d writes in %dms", (Object[])new Object[]{var7_3.size(), var3_4 - var1_1}), new Object[0]);
            }
            catch (IOException var5_6) {
                ** continue;
            }
        }
        var6_2.close();
        return var7_3;
lbl36: // 1 sources:
        do {
            try {
                throw new RuntimeException("Failed to load writes", (Throwable)var5_6);
            }
            catch (Throwable var5_7) {}
            var6_2.close();
            throw var5_7;
            break;
        } while (true);
    }

    @Override
    public void e(k k8, n n8, long l8) {
        this.P();
        long l9 = System.currentTimeMillis();
        this.K(k8, l8, "o", this.L(n8.L(true)));
        l8 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format((Locale)Locale.US, (String)"Persisted user overwrite in %dms", (Object[])new Object[]{l8 - l9}), new Object[0]);
        }
    }

    @Override
    public void f() {
        this.a.endTransaction();
        this.c = false;
        long l8 = System.currentTimeMillis();
        long l9 = this.d;
        if (this.b.f()) {
            this.b.b(String.format((Locale)Locale.US, (String)"Transaction completed. Elapsed: %dms", (Object[])new Object[]{l8 - l9}), new Object[0]);
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
    public void h(long l8) {
        this.P();
        String string2 = String.valueOf((long)l8);
        this.a.delete("trackedQueries", "id = ?", new String[]{string2});
        this.a.delete("trackedKeys", "id = ?", new String[]{string2});
    }

    @Override
    public Set i(long l8) {
        return this.v(Collections.singleton((Object)l8));
    }

    @Override
    public void j(long l8) {
        this.P();
        long l9 = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.FALSE);
        contentValues.put("lastUse", Long.valueOf((long)l8));
        this.a.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        l8 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format((Locale)Locale.US, (String)"Reset active tracked queries in %dms", (Object[])new Object[]{l8 - l9}), new Object[0]);
        }
    }

    @Override
    public void k(long l8, Set set) {
        this.P();
        long l9 = System.currentTimeMillis();
        this.a.delete("trackedKeys", "id = ?", new String[]{String.valueOf((long)l8)});
        for (d4.b b8 : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf((long)l8));
            contentValues.put("key", b8.e());
            this.a.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long l10 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format((Locale)Locale.US, (String)"Set %d tracked query keys for tracked query %d in %dms", (Object[])new Object[]{set.size(), l8, l10 - l9}), new Object[0]);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long l() {
        Throwable throwable2;
        String string2;
        block3 : {
            long l8;
            string2 = String.format((String)"SELECT sum(length(%s) + length(%s)) FROM %s", (Object[])new Object[]{"value", "path", "serverCache"});
            string2 = this.a.rawQuery(string2, null);
            try {
                if (!string2.moveToFirst()) break block3;
                l8 = string2.getLong(0);
            }
            catch (Throwable throwable2) {}
            string2.close();
            return l8;
        }
        throw new IllegalStateException("Couldn't read database result!");
        string2.close();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void m(k k8, g g8) {
        int n8;
        long l8;
        Object object;
        int n9;
        if (!g8.e()) {
            return;
        }
        this.P();
        long l9 = System.currentTimeMillis();
        Cursor cursor = this.B(k8, new String[]{"rowid", "path"});
        Object object2 = new d(null);
        Object object3 = new d(null);
        while (cursor.moveToNext()) {
            StringBuilder stringBuilder;
            l8 = cursor.getLong(0);
            Object object4 = new k(cursor.getString(1));
            if (!k8.W((k)object4)) {
                object = this.b;
                stringBuilder = new StringBuilder();
                stringBuilder.append("We are pruning at ");
                stringBuilder.append((Object)k8);
                stringBuilder.append(" but we have data stored higher up at ");
                stringBuilder.append(object4);
                object4 = ". Ignoring.";
            } else {
                object = k.b0(k8, (k)object4);
                if (g8.g((k)object)) {
                    object2 = object2.W((k)object, l8);
                    continue;
                }
                if (g8.f((k)object)) {
                    object3 = object3.W((k)object, l8);
                    continue;
                }
                object = this.b;
                stringBuilder = new StringBuilder();
                stringBuilder.append("We are pruning at ");
                stringBuilder.append((Object)k8);
                stringBuilder.append(" and have data at ");
                stringBuilder.append(object4);
                object4 = " that isn't marked for pruning or keeping. Ignoring.";
            }
            stringBuilder.append((String)object4);
            object.i(stringBuilder.toString());
        }
        if (!object2.isEmpty()) {
            object = new ArrayList();
            this.G(k8, k.Y(), (d)object2, (d)object3, g8, (List)object);
            g8 = object2.Z();
            object2 = new StringBuilder();
            object2.append("rowid IN (");
            object2.append(this.x((Collection)g8));
            object2.append(")");
            object2 = object2.toString();
            this.a.delete("serverCache", (String)object2, null);
            object2 = object.iterator();
            while (object2.hasNext()) {
                object3 = (Y3.g)object2.next();
                this.I(k8.T((k)object3.a()), (n)object3.b());
            }
            n8 = g8.size();
            n9 = object.size();
        } else {
            n9 = n8 = 0;
        }
        l8 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format((Locale)Locale.US, (String)"Pruned %d rows with %d nodes resaved in %dms", (Object[])new Object[]{n8, n9, l8 - l9}), new Object[0]);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List n() {
        ArrayList arrayList;
        Cursor cursor;
        Throwable throwable2;
        block5 : {
            long l8 = System.currentTimeMillis();
            cursor = this.a.query("trackedQueries", new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"}, null, null, null, null, "id");
            arrayList = new ArrayList();
            try {
                long l9;
                while (cursor.moveToNext()) {
                    l9 = cursor.getLong(0);
                    Object object = new k(cursor.getString(1));
                    String string2 = cursor.getString(2);
                    try {
                        string2 = b.a(string2);
                    }
                    catch (IOException iOException) {
                        throw new RuntimeException((Throwable)iOException);
                    }
                    object = i.b((k)object, (Map)string2);
                    long l10 = cursor.getLong(3);
                    boolean bl = cursor.getInt(4) != 0;
                    boolean bl2 = cursor.getInt(5) != 0;
                    arrayList.add((Object)new h(l9, (i)object, l10, bl, bl2));
                }
                l9 = System.currentTimeMillis();
                if (!this.b.f()) break block5;
                this.b.b(String.format((Locale)Locale.US, (String)"Loaded %d tracked queries in %dms", (Object[])new Object[]{arrayList.size(), l9 - l8}), new Object[0]);
            }
            catch (Throwable throwable2) {}
        }
        cursor.close();
        return arrayList;
        cursor.close();
        throw throwable2;
    }

    @Override
    public void o(k k8, V3.b b8) {
        int n8;
        this.P();
        long l8 = System.currentTimeMillis();
        b8 = b8.iterator();
        int n9 = n8 = 0;
        while (b8.hasNext()) {
            Map.Entry entry = (Map.Entry)b8.next();
            n8 += this.H("serverCache", k8.T((k)entry.getKey()));
            n9 += this.I(k8.T((k)entry.getKey()), (n)entry.getValue());
        }
        long l9 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format((Locale)Locale.US, (String)"Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", (Object[])new Object[]{n9, n8, k8.toString(), l9 - l8}), new Object[0]);
        }
    }

    @Override
    public void p() {
        this.a.setTransactionSuccessful();
    }

    @Override
    public n q(k k8) {
        return this.A(k8);
    }

    @Override
    public void r(long l8, Set set, Set set2) {
        this.P();
        long l9 = System.currentTimeMillis();
        for (d4.b b8 : set2) {
            this.a.delete("trackedKeys", "id = ? AND key = ?", new String[]{String.valueOf((long)l8), b8.e()});
        }
        for (d4.b b8 : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf((long)l8));
            contentValues.put("key", b8.e());
            this.a.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long l10 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format((Locale)Locale.US, (String)"Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", (Object[])new Object[]{set.size(), set2.size(), l8, l10 - l9}), new Object[0]);
        }
    }

    @Override
    public void s(k k8, n n8) {
        this.P();
        this.O(k8, n8, true);
    }

    @Override
    public void t(k k8, n n8) {
        this.P();
        this.O(k8, n8, false);
    }

    @Override
    public void u(h h8) {
        this.P();
        long l8 = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf((long)h8.a));
        contentValues.put("path", j.F(h8.b.e()));
        contentValues.put("queryParams", h8.b.d().y());
        contentValues.put("lastUse", Long.valueOf((long)h8.c));
        contentValues.put("complete", Boolean.valueOf((boolean)h8.d));
        contentValues.put("active", Boolean.valueOf((boolean)h8.e));
        this.a.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        long l9 = System.currentTimeMillis();
        if (this.b.f()) {
            this.b.b(String.format((Locale)Locale.US, (String)"Saved new tracked query in %dms", (Object[])new Object[]{l9 - l8}), new Object[0]);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Set v(Set set) {
        HashSet hashSet;
        Object object;
        Throwable throwable2;
        block3 : {
            long l8 = System.currentTimeMillis();
            object = new StringBuilder();
            object.append("id IN (");
            object.append(this.x((Collection)set));
            object.append(")");
            object = object.toString();
            object = this.a.query(true, "trackedKeys", new String[]{"key"}, (String)object, null, null, null, null, null);
            hashSet = new HashSet();
            try {
                while (object.moveToNext()) {
                    hashSet.add((Object)d4.b.j(object.getString(0)));
                }
                long l9 = System.currentTimeMillis();
                if (!this.b.f()) break block3;
                this.b.b(String.format((Locale)Locale.US, (String)"Loaded %d tracked queries keys for tracked queries %s in %dms", (Object[])new Object[]{hashSet.size(), set.toString(), l9 - l8}), new Object[0]);
            }
            catch (Throwable throwable2) {}
        }
        object.close();
        return hashSet;
        object.close();
        throw throwable2;
    }

    public final String x(Collection collection) {
        StringBuilder stringBuilder = new StringBuilder();
        collection = collection.iterator();
        boolean bl = true;
        while (collection.hasNext()) {
            long l8 = (Long)collection.next();
            if (!bl) {
                stringBuilder.append(",");
            }
            stringBuilder.append(l8);
            bl = false;
        }
        return stringBuilder.toString();
    }

    public final n y(byte[] object) {
        try {
            n n8 = o.a(b.b(new String((byte[])object, e)));
            return n8;
        }
        catch (IOException iOException) {
            object = new String((byte[])object, e);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not deserialize node: ");
            stringBuilder.append((String)object);
            throw new RuntimeException(stringBuilder.toString(), (Throwable)iOException);
        }
    }

    public final byte[] z(List list) {
        byte[] arrby = list.iterator();
        int n8 = 0;
        while (arrby.hasNext()) {
            n8 += ((byte[])arrby.next()).length;
        }
        arrby = new byte[n8];
        list = list.iterator();
        n8 = 0;
        while (list.hasNext()) {
            byte[] arrby2 = (byte[])list.next();
            System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)n8, (int)arrby2.length);
            n8 += arrby2.length;
        }
        return arrby;
    }

    public static class c
    extends SQLiteOpenHelper {
        public c(Context context, String string2) {
            super(context, string2, null, 2);
        }

        public final void a(SQLiteDatabase sQLiteDatabase, String string2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DROP TABLE IF EXISTS ");
            stringBuilder.append(string2);
            sQLiteDatabase.execSQL(stringBuilder.toString());
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
            boolean bl = n9 == 2;
            m.g(bl, "Why is onUpgrade() called with a different version?");
            if (n8 <= 1) {
                this.a(sQLiteDatabase, "serverCache");
                sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
                this.a(sQLiteDatabase, "complete");
                sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
                return;
            }
            sQLiteDatabase = new StringBuilder();
            sQLiteDatabase.append("We don't handle upgrading to ");
            sQLiteDatabase.append(n9);
            throw new AssertionError((Object)sQLiteDatabase.toString());
        }
    }

}

