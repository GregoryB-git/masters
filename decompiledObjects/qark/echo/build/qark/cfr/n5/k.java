/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.database.Cursor
 *  android.database.DatabaseErrorHandler
 *  android.database.SQLException
 *  android.database.sqlite.SQLiteCantOpenDatabaseException
 *  android.database.sqlite.SQLiteCursor
 *  android.database.sqlite.SQLiteCursorDriver
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteProgram
 *  android.database.sqlite.SQLiteQuery
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
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
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n5.F;
import n5.G;
import n5.a;
import n5.b;
import n5.c;
import n5.d;
import n5.e;
import n5.f;
import n5.g;
import n5.h;
import n5.i;
import n5.j;
import n5.q;
import n5.t;
import n5.v;

public class k {
    public static Boolean n;
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final Context e;
    public final List f = new ArrayList();
    public final Map g = new HashMap();
    public q h;
    public SQLiteDatabase i;
    public int j = 0;
    public int k = 0;
    public Integer l;
    public int m = 0;

    public k(Context context, String string2, int n8, boolean bl, int n9) {
        this.e = context;
        this.b = string2;
        this.a = bl;
        this.c = n8;
        this.d = n9;
    }

    public static /* synthetic */ Cursor G(F f8, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String string2, SQLiteQuery sQLiteQuery) {
        f8.a((SQLiteProgram)sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, string2, sQLiteQuery);
    }

    public static /* synthetic */ void a(k k8, p5.e e8) {
        k8.L(e8);
    }

    public static /* synthetic */ void b(k k8) {
        k8.Q();
    }

    public static /* synthetic */ void c(k k8, p5.e e8) {
        k8.I(e8);
    }

    public static /* synthetic */ void d(k k8, p5.e e8) {
        k8.K(e8);
    }

    public static /* synthetic */ void e(k k8, p5.e e8) {
        k8.H(e8);
    }

    public static /* synthetic */ Cursor f(F f8, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String string2, SQLiteQuery sQLiteQuery) {
        return k.G(f8, sQLiteDatabase, sQLiteCursorDriver, string2, sQLiteQuery);
    }

    public static /* synthetic */ void g(k k8, p5.e e8) {
        k8.J(e8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean i(Context context, String string2, boolean bl) {
        try {
            String string3 = context.getPackageName();
            context = Build.VERSION.SDK_INT >= 33 ? c.a(context.getPackageManager(), string3, b.a(128L)) : k.y(context, string3, 128);
            bl = context.metaData.getBoolean(string2, bl);
            if (!bl) return false;
            return true;
        }
        catch (Exception exception) {}
        exception.printStackTrace();
        return false;
    }

    public static boolean j(Context context) {
        return k.i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    public static void o(String string2) {
        SQLiteDatabase.deleteDatabase((File)new File(string2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean x(String string2) {
        try {
            return new File(string2).exists();
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static ApplicationInfo y(Context context, String string2, int n8) {
        return context.getPackageManager().getApplicationInfo(string2, n8);
    }

    public String A() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(this.B());
        stringBuilder.append("] ");
        return stringBuilder.toString();
    }

    public String B() {
        Thread thread = Thread.currentThread();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.c);
        stringBuilder.append(",");
        stringBuilder.append(thread.getName());
        stringBuilder.append("(");
        stringBuilder.append(thread.getId());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public SQLiteDatabase C() {
        return this.i;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void D(Exception exception, p5.e e8) {
        String string2;
        if (exception instanceof SQLiteCantOpenDatabaseException) {
            exception = new StringBuilder();
            exception.append("open_failed ");
            exception.append(this.b);
            string2 = exception.toString();
            exception = null;
        } else {
            boolean bl = exception instanceof SQLException;
            string2 = exception.getMessage();
            exception = p5.h.a(e8);
        }
        e8.b("sqlite_error", string2, (Object)exception);
    }

    public void E(p5.e e8) {
        this.S(e8, new g(this, e8));
    }

    public boolean F() {
        synchronized (this) {
            int n8 = this.j;
            boolean bl = n8 > 0;
            return bl;
        }
    }

    public final /* synthetic */ void H(p5.e e8) {
        Boolean bl = e8.f();
        boolean bl2 = Boolean.TRUE.equals((Object)bl) && e8.h();
        if (bl2) {
            int n8;
            this.k = n8 = this.k + 1;
            this.l = n8;
        }
        if (!this.w(e8)) {
            if (bl2) {
                this.l = null;
                return;
            }
        } else {
            if (bl2) {
                bl = new HashMap();
                bl.put((Object)"transactionId", (Object)this.l);
                e8.a((Object)bl);
                return;
            }
            if (Boolean.FALSE.equals((Object)bl)) {
                this.l = null;
            }
            e8.a(null);
        }
    }

    public final /* synthetic */ void I(p5.e e8) {
        this.q(e8);
    }

    public final /* synthetic */ void J(p5.e e8) {
        this.r(e8);
    }

    public final /* synthetic */ void K(p5.e e8) {
        this.s(e8);
    }

    public final /* synthetic */ void L(p5.e e8) {
        this.t(e8);
    }

    public void M() {
        if (n == null) {
            Boolean bl;
            n = bl = Boolean.valueOf((boolean)k.j(this.e));
            if (bl.booleanValue() && t.c(this.d)) {
                bl = new StringBuilder();
                bl.append(this.A());
                bl.append("[sqflite] WAL enabled");
                Log.d((String)"Sqflite", (String)bl.toString());
            }
        }
        int n8 = n != false ? 805306368 : 268435456;
        this.i = SQLiteDatabase.openDatabase((String)this.b, (SQLiteDatabase.CursorFactory)null, (int)n8);
    }

    public void N() {
        this.i = SQLiteDatabase.openDatabase((String)this.b, (SQLiteDatabase.CursorFactory)null, (int)1, (DatabaseErrorHandler)new DatabaseErrorHandler(){

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
            }
        });
    }

    public void O(p5.e e8) {
        this.S(e8, new e(this, e8));
    }

    public void P(p5.e e8) {
        this.S(e8, new d(this, e8));
    }

    public final void Q() {
        while (!this.f.isEmpty()) {
            if (this.l != null) {
                return;
            }
            ((p5.g)this.f.get(0)).a();
            this.f.remove(0);
        }
    }

    public void R(p5.e e8) {
        this.S(e8, new f(this, e8));
    }

    public final void S(p5.e object, Runnable runnable) {
        Integer n8 = object.g();
        Integer n9 = this.l;
        if (n9 == null) {
            runnable.run();
            return;
        }
        if (n8 != null && (n8.equals((Object)n9) || n8 == -1)) {
            runnable.run();
            if (this.l == null && !this.f.isEmpty()) {
                this.h.b(this, new j(this));
                return;
            }
        } else {
            object = new p5.g((p5.e)object, runnable);
            this.f.add(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void h(E5.j object, k.d d8) {
        object = new p5.d((E5.j)object, d8);
        boolean bl = object.e();
        boolean bl2 = object.l();
        Object object2 = (List)object.c("operations");
        object = new ArrayList();
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            p5.c c8;
            block18 : {
                block19 : {
                    c8 = new p5.c((Map)iterator.next(), bl);
                    object2 = c8.i();
                    object2.hashCode();
                    int n8 = object2.hashCode();
                    int n9 = -1;
                    switch (n8) {
                        default: {
                            break;
                        }
                        case 107944136: {
                            if (!object2.equals((Object)"query")) break;
                            n9 = 3;
                            break;
                        }
                        case -838846263: {
                            if (!object2.equals((Object)"update")) break;
                            n9 = 2;
                            break;
                        }
                        case -1183792455: {
                            if (!object2.equals((Object)"insert")) break;
                            n9 = 1;
                            break;
                        }
                        case -1319569547: {
                            if (!object2.equals((Object)"execute")) break;
                            n9 = 0;
                        }
                    }
                    switch (n9) {
                        default: {
                            object = new StringBuilder();
                            object.append("Batch method '");
                            object.append((String)object2);
                            object.append("' not supported");
                            d8.b("bad_param", object.toString(), null);
                            return;
                        }
                        case 3: {
                            if (this.r(c8)) break;
                            if (!bl2) {
                                c8.r(d8);
                                return;
                            }
                            break block18;
                        }
                        case 2: {
                            if (this.t(c8)) break;
                            if (!bl2) {
                                c8.r(d8);
                                return;
                            }
                            break block18;
                        }
                        case 1: {
                            if (this.q(c8)) break;
                            if (!bl2) {
                                c8.r(d8);
                                return;
                            }
                            break block18;
                        }
                        case 0: {
                            if (!this.p(c8)) break block19;
                        }
                    }
                    c8.t((List)object);
                    continue;
                }
                if (!bl2) {
                    c8.r(d8);
                    return;
                }
            }
            c8.s((List)object);
        }
        if (bl) {
            d8.a(null);
            return;
        }
        d8.a(object);
    }

    public void k() {
        if (!this.g.isEmpty() && t.b(this.d)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.A());
            stringBuilder.append(this.g.size());
            stringBuilder.append(" cursor(s) are left opened");
            Log.d((String)"Sqflite", (String)stringBuilder.toString());
        }
        this.i.close();
    }

    public final void l(int n8) {
        v v8 = (v)this.g.get((Object)n8);
        if (v8 != null) {
            this.m(v8);
        }
    }

    public final void m(v v8) {
        try {
            int n8 = v8.a;
            if (t.c(this.d)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.A());
                stringBuilder.append("closing cursor ");
                stringBuilder.append(n8);
                Log.d((String)"Sqflite", (String)stringBuilder.toString());
            }
            this.g.remove((Object)n8);
            v8.c.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final Map n(Cursor var1_1, Integer var2_2) {
        var5_3 = null;
        var3_4 = 0;
        var7_5 = null;
        do lbl-1000: // 3 sources:
        {
            var6_7 = var5_3;
            if (!var1_1.moveToNext()) break;
            var6_7 = var5_3;
            var8_8 = var7_5;
            var4_6 = var3_4;
            if (var5_3 == null) {
                var8_8 = new ArrayList();
                var6_7 = new HashMap();
                var4_6 = var1_1.getColumnCount();
                var6_7.put((Object)"columns", (Object)Arrays.asList((Object[])var1_1.getColumnNames()));
                var6_7.put((Object)"rows", (Object)var8_8);
            }
            var8_8.add((Object)G.a(var1_1, var4_6));
            var5_3 = var6_7;
            var7_5 = var8_8;
            var3_4 = var4_6;
            if (var2_2 == null) ** GOTO lbl-1000
            var5_3 = var6_7;
            var7_5 = var8_8;
            var3_4 = var4_6;
        } while (var8_8.size() < var2_2);
        var1_1 = var6_7;
        if (var6_7 != null) return var1_1;
        return new HashMap();
    }

    public final boolean p(p5.e e8) {
        if (!this.w(e8)) {
            return false;
        }
        e8.a(null);
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean q(p5.e var1_1) {
        block17 : {
            block15 : {
                block16 : {
                    if (!this.w(var1_1)) {
                        return false;
                    }
                    var2_2 = var1_1.e();
                    var5_3 = null;
                    if (var2_2) {
                        var1_1.a(null);
                        return true;
                    }
                    var6_4 = this.C().rawQuery("SELECT changes(), last_insert_rowid()", null);
                    if (var6_4 == null) break block15;
                    var5_3 = var6_4;
                    if (var6_4.getCount() <= 0) break block15;
                    var5_3 = var6_4;
                    if (!var6_4.moveToFirst()) break block15;
                    var5_3 = var6_4;
                    if (var6_4.getInt(0) != 0) break block16;
                    var5_3 = var6_4;
                    if (t.b(this.d)) {
                        var5_3 = var6_4;
                        var7_7 = new StringBuilder();
                        var5_3 = var6_4;
                        var7_7.append(this.A());
                        var5_3 = var6_4;
                        var7_7.append("no changes (id was ");
                        var5_3 = var6_4;
                        var7_7.append(var6_4.getLong(1));
                        var5_3 = var6_4;
                        var7_7.append(")");
                        var5_3 = var6_4;
                        Log.d((String)"Sqflite", (String)var7_7.toString());
                    }
                    var5_3 = var6_4;
                    var1_1.a(null);
                    var6_4.close();
                    return true;
                }
                var5_3 = var6_4;
                var3_13 = var6_4.getLong(1);
                var5_3 = var6_4;
                if (t.b(this.d)) {
                    var5_3 = var6_4;
                    var7_8 = new StringBuilder();
                    var5_3 = var6_4;
                    var7_8.append(this.A());
                    var5_3 = var6_4;
                    var7_8.append("inserted ");
                    var5_3 = var6_4;
                    var7_8.append(var3_13);
                    var5_3 = var6_4;
                    Log.d((String)"Sqflite", (String)var7_8.toString());
                }
                var5_3 = var6_4;
                var1_1.a(var3_13);
                var6_4.close();
                return true;
            }
            var5_3 = var6_4;
            try {
                var7_9 = new StringBuilder();
                var5_3 = var6_4;
                var7_9.append(this.A());
                var5_3 = var6_4;
                var7_9.append("fail to read changes for Insert");
                var5_3 = var6_4;
                Log.e((String)"Sqflite", (String)var7_9.toString());
                var5_3 = var6_4;
                var1_1.a(null);
                if (var6_4 == null) break block17;
            }
            catch (Exception var7_12) {
                ** continue;
            }
            var6_4.close();
        }
        return true;
        catch (Throwable var6_5) {
            var1_1 = var5_3;
            var5_3 = var6_5;
        }
        catch (Exception var7_10) {
            var6_4 = null;
lbl78: // 2 sources:
            do {
                block18 : {
                    var5_3 = var6_4;
                    try {
                        this.D((Exception)var7_11, var1_1);
                        if (var6_4 == null) break block18;
                    }
                    catch (Throwable var6_6) {
                        var1_1 = var5_3;
                        var5_3 = var6_6;
                    }
                    var6_4.close();
                }
                return false;
                break;
            } while (true);
        }
        if (var1_1 != null) {
            var1_1.close();
        }
        throw var5_3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean r(p5.e e8) {
        void var1_5;
        Object object;
        F f8;
        block14 : {
            F f9;
            v v8;
            block15 : {
                Map map;
                v v9;
                block13 : {
                    Integer n8 = (Integer)e8.c("cursorPageSize");
                    f8 = e8.d();
                    if (t.b(this.d)) {
                        object = new StringBuilder();
                        object.append(this.A());
                        object.append((Object)f8);
                        Log.d((String)"Sqflite", (String)object.toString());
                    }
                    v v10 = null;
                    v v11 = null;
                    v8 = null;
                    object = null;
                    Object var8_12 = null;
                    f9 = f8 = this.z().rawQueryWithFactory((SQLiteDatabase.CursorFactory)new i(f8), f8.c(), a.a, null);
                    object = var8_12;
                    v9 = v10;
                    map = this.n((Cursor)f8, n8);
                    v8 = v11;
                    if (n8 == null) break block13;
                    f9 = f8;
                    object = var8_12;
                    v9 = v10;
                    v8 = v11;
                    if (f8.isLast()) break block13;
                    f9 = f8;
                    object = var8_12;
                    v9 = v10;
                    v8 = v11;
                    if (f8.isAfterLast()) break block13;
                    f9 = f8;
                    object = var8_12;
                    v9 = v10;
                    int n9 = this.m + 1;
                    f9 = f8;
                    object = var8_12;
                    v9 = v10;
                    this.m = n9;
                    f9 = f8;
                    object = var8_12;
                    v9 = v10;
                    map.put((Object)"cursorId", (Object)n9);
                    f9 = f8;
                    object = var8_12;
                    v9 = v10;
                    v8 = new v(n9, n8, (Cursor)f8);
                    try {
                        this.g.put((Object)n9, (Object)v8);
                    }
                    catch (Throwable throwable) {
                        object = v8;
                        break block14;
                    }
                    catch (Exception exception) {
                        break block15;
                    }
                }
                f9 = f8;
                object = v8;
                v9 = v8;
                try {
                    e8.a((Object)map);
                    if (v8 != null) return true;
                    if (f8 == null) return true;
                }
                catch (Throwable throwable) {
                    f8 = f9;
                    break block14;
                }
                catch (Exception exception) {
                    v8 = v9;
                }
                f8.close();
                return true;
                catch (Throwable throwable) {
                    f8 = null;
                    break block14;
                }
                catch (Exception exception) {
                    f8 = null;
                }
            }
            f9 = f8;
            object = v8;
            {
                void var8_16;
                this.D((Exception)var8_16, e8);
                if (v8 != null) {
                    f9 = f8;
                    object = v8;
                    this.m(v8);
                }
                if (v8 != null) return false;
                if (f8 == null) return false;
            }
            f8.close();
            return false;
        }
        if (object != null) throw var1_5;
        if (f8 == null) throw var1_5;
        f8.close();
        throw var1_5;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean s(p5.e var1_1) {
        block13 : {
            var8_5 = (Integer)var1_1.c("cursorId");
            var3_6 = var8_5;
            var4_7 = Boolean.TRUE.equals(var1_1.c("cancel"));
            if (t.c(this.d)) {
                var6_8 = new StringBuilder();
                var6_8.append(this.A());
                var6_8.append("cursor ");
                var6_8.append(var3_6);
                var5_9 = var4_7 != false ? " cancel" : " next";
                var6_8.append((String)var5_9);
                Log.d((String)"Sqflite", (String)var6_8.toString());
            }
            var7_13 = null;
            if (var4_7) {
                this.l(var3_6);
                var1_1.a(null);
                return true;
            }
            var6_8 = (v)this.g.get((Object)var8_5);
            var2_14 = 0;
            if (var6_8 == null) break block13;
            var5_9 = var6_8.c;
            var9_15 = this.n((Cursor)var5_9, var6_8.b);
            var2_14 = var5_9.isLast() == false && (var4_7 = var5_9.isAfterLast()) == false ? 1 : 0;
            if (var2_14 == 0) ** GOTO lbl28
            var3_6 = var2_14;
            var9_15.put((Object)"cursorId", (Object)var8_5);
lbl28: // 2 sources:
            var3_6 = var2_14;
            var1_1.a((Object)var9_15);
            if (var2_14 != 0) return true;
            this.m((v)var6_8);
            return true;
        }
        try {
            var5_9 = new StringBuilder();
            var5_9.append("Cursor ");
            var5_9.append(var3_6);
            var5_9.append(" not found");
            throw new IllegalStateException(var5_9.toString());
        }
        catch (Throwable var1_2) {
            ** GOTO lbl60
        }
        catch (Exception var5_10) {
            var2_14 = 0;
        }
lbl44: // 2 sources:
        do {
            var3_6 = var2_14;
            try {
                this.D((Exception)var5_11, (p5.e)var1_1);
                if (var6_8 != null) {
                    var3_6 = var2_14;
                    this.m((v)var6_8);
                    var1_1 = var7_13;
                } else {
                    var1_1 = var6_8;
                }
                if (var2_14 != 0) return false;
                if (var1_1 == null) return false;
            }
            catch (Throwable var1_4) {
                var2_14 = var3_6;
            }
            this.m((v)var1_1);
            return false;
lbl60: // 2 sources:
            if (var2_14 != 0) throw var1_3;
            if (var6_8 == null) throw var1_3;
            this.m((v)var6_8);
            throw var1_3;
            break;
        } while (true);
        catch (Exception var5_12) {
            ** continue;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean t(p5.e var1_1) {
        block12 : {
            block11 : {
                if (!this.w(var1_1)) {
                    return false;
                }
                var3_5 = var1_1.e();
                var6_6 = null;
                var4_8 = null;
                if (var3_5) {
                    var1_1.a(null);
                    return true;
                }
                var5_10 = this.C().rawQuery("SELECT changes()", null);
                if (var5_10 == null) break block11;
                if (var5_10.getCount() <= 0 || !var5_10.moveToFirst()) break block11;
                var2_11 = var5_10.getInt(0);
                if (t.b(this.d)) {
                    var4_8 = new StringBuilder();
                    var4_8.append(this.A());
                    var4_8.append("changed ");
                    var4_8.append(var2_11);
                    Log.d((String)"Sqflite", (String)var4_8.toString());
                }
                var1_1.a(var2_11);
                var5_10.close();
                return true;
            }
            try {
                var4_8 = new StringBuilder();
                var4_8.append(this.A());
                var4_8.append("fail to read changes for Update/Delete");
                Log.e((String)"Sqflite", (String)var4_8.toString());
                var1_1.a(null);
                if (var5_10 == null) return true;
            }
            catch (Throwable var1_4) {
                var4_8 = var5_10;
                break block12;
            }
            catch (Exception var6_7) {
                ** GOTO lbl44
            }
            var5_10.close();
            return true;
            {
                catch (Throwable var1_2) {
                }
                catch (Exception var4_9) {}
                var5_10 = var6_6;
                var6_6 = var4_9;
lbl44: // 2 sources:
                var4_8 = var5_10;
                {
                    this.D((Exception)var6_6, var1_1);
                    if (var5_10 == null) return false;
                }
                var5_10.close();
                return false;
            }
        }
        if (var4_8 == null) throw var1_3;
        var4_8.close();
        throw var1_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void u(Boolean bl) {
        synchronized (this) {
            try {
                if (Boolean.TRUE.equals((Object)bl)) {
                    ++this.j;
                } else if (Boolean.FALSE.equals((Object)bl)) {
                    --this.j;
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void v(p5.e e8) {
        this.S(e8, new h(this, e8));
    }

    public final boolean w(p5.e e8) {
        Boolean bl;
        F f8 = e8.d();
        if (t.b(this.d)) {
            bl = new StringBuilder();
            bl.append(this.A());
            bl.append((Object)f8);
            Log.d((String)"Sqflite", (String)bl.toString());
        }
        bl = e8.f();
        try {
            this.C().execSQL(f8.c(), f8.d());
            this.u(bl);
            return true;
        }
        catch (Exception exception) {
            this.D(exception, e8);
            return false;
        }
    }

    public SQLiteDatabase z() {
        return this.i;
    }

}

