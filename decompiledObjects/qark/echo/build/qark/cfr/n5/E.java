/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package n5;

import A5.a;
import E5.c;
import E5.j;
import E5.k;
import E5.l;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import n5.A;
import n5.B;
import n5.C;
import n5.D;
import n5.G;
import n5.k;
import n5.p;
import n5.q;
import n5.t;
import n5.w;
import n5.x;
import n5.y;
import n5.z;
import o5.a;
import p5.d;
import p5.e;

/*
 * Exception performing whole class analysis ignored.
 */
public class E
implements A5.a,
k.c {
    public static final Map c = new HashMap();
    public static final Map d = new HashMap();
    public static final Object e = new Object();
    public static final Object f = new Object();
    public static int g = 0;
    public static String h;
    public static int i;
    public static int j;
    public static int k;
    public static q l;
    public Context a;
    public E5.k b;

    static {
        i = 0;
        j = 1;
        k = 0;
    }

    public E() {
    }

    public static /* synthetic */ void a(j j8, k.d d8, k k8) {
        k8.P(new d(j8, d8));
    }

    public static /* synthetic */ void b(j j8, k.d d8, k k8) {
        k8.R(new d(j8, d8));
    }

    public static /* synthetic */ void c(k k8, j j8, k.d d8) {
        k8.h(j8, d8);
    }

    public static /* synthetic */ void d(boolean bl, String string2, k.d d8, Boolean bl2, k k8, j j8, boolean bl3, int n8) {
        E.s(bl, string2, d8, bl2, k8, j8, bl3, n8);
    }

    public static /* synthetic */ void e(j j8, k.d d8, k k8) {
        E.t(j8, d8, k8);
    }

    public static /* synthetic */ void f(j j8, k.d d8, k k8) {
        E.q(j8, d8, k8);
    }

    public static /* synthetic */ void g(j j8, k k8, k.d d8) {
        E.v(j8, k8, d8);
    }

    public static /* synthetic */ void h(j j8, k.d d8, k k8) {
        E.r(j8, d8, k8);
    }

    public static boolean o(String string2) {
        if (string2 != null && !string2.equals((Object)":memory:")) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void q(j j8, k.d d8, k k8) {
        k8.v(new d(j8, d8));
    }

    public static /* synthetic */ void r(j j8, k.d d8, k k8) {
        k8.E(new d(j8, d8));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void s(boolean var0, String var1_1, k.d var2_5, Boolean var3_6, k var4_7, j var5_8, boolean var6_9, int var7_10) {
        var8_11 = E.f;
        // MONITORENTER : var8_11
        if (var0) ** GOTO lbl13
        var9_12 = new File(new File(var1_1).getParent());
        if (!(var9_12.exists() || var9_12.mkdirs() || var9_12.exists())) {
            var3_6 = new StringBuilder();
            var3_6.append("open_failed ");
            var3_6.append(var1_1);
            var2_5.b("sqlite_error", var3_6.toString(), null);
            // MONITOREXIT : var8_11
            return;
        }
lbl13: // 3 sources:
        try {
            if (Boolean.TRUE.equals(var3_6)) {
                var4_7.N();
            } else {
                var4_7.M();
            }
            var3_6 = E.e;
        }
        catch (Exception var1_4) {}
        if (!var6_9) ** GOTO lbl24
        E.c.put((Object)var1_1, (Object)var7_10);
lbl24: // 2 sources:
        E.d.put((Object)var7_10, (Object)var4_7);
        // MONITOREXIT : var3_6
        if (t.b(var4_7.d)) {
            var3_6 = new StringBuilder();
            var3_6.append(var4_7.A());
            var3_6.append("opened ");
            var3_6.append(var7_10);
            var3_6.append(" ");
            var3_6.append(var1_1);
            Log.d((String)"Sqflite", (String)var3_6.toString());
        }
        // MONITOREXIT : var8_11
        var2_5.a((Object)E.x(var7_10, false, false));
        return;
        {
            var4_7.D(var1_4, new d(var5_8, var2_5));
            // MONITOREXIT : var8_11
            return;
            catch (Throwable var1_3) {}
            ** try [egrp 5[TRYBLOCK] [11 : 253->278)] { 
lbl45: // 1 sources:
            throw var1_3;
        }
    }

    public static /* synthetic */ void t(j j8, k.d d8, k k8) {
        k8.O(new d(j8, d8));
    }

    public static /* synthetic */ void v(j object, k k8, k.d d8) {
        object = (String)object.a("locale");
        try {
            k8.i.setLocale(G.d((String)object));
            d8.a(null);
            return;
        }
        catch (Exception exception) {
            k8 = new StringBuilder();
            k8.append("Error calling setLocale: ");
            k8.append(exception.getMessage());
            d8.b("sqlite_error", k8.toString(), null);
            return;
        }
    }

    public static Map x(int n8, boolean bl, boolean bl2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"id", (Object)n8);
        if (bl) {
            hashMap.put((Object)"recovered", (Object)Boolean.TRUE);
        }
        if (bl2) {
            hashMap.put((Object)"recoveredInTransaction", (Object)Boolean.TRUE);
        }
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void A(j object, k.d d8) {
        Object object2;
        Integer n8 = (Integer)object.a("id");
        int n9 = n8;
        if ((object = this.n((j)object, d8)) == null) {
            return;
        }
        if (t.b(object.d)) {
            object2 = new StringBuilder();
            object2.append(object.A());
            object2.append("closing ");
            object2.append(n9);
            object2.append(" ");
            object2.append(object.b);
            Log.d((String)"Sqflite", (String)object2.toString());
        }
        String string2 = object.b;
        object2 = e;
        // MONITORENTER : object2
        d.remove((Object)n8);
        if (object.a) {
            c.remove((Object)string2);
        }
        // MONITOREXIT : object2
        l.b((k)object, new Runnable((k)object, d8){
            public final /* synthetic */ k o;
            public final /* synthetic */ k.d p;
            {
                this.o = k8;
                this.p = d8;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                Object object = f;
                synchronized (object) {
                    E.this.l(this.o);
                }
                this.p.a(null);
            }
        });
    }

    public final void B(j j8, k.d d8) {
        d8.a(k.x((String)j8.a("path")));
    }

    public final void C(j j8, k.d d8) {
        String string2 = (String)j8.a("cmd");
        j8 = new HashMap();
        if ("get".equals((Object)string2)) {
            Map map;
            int n8 = g;
            if (n8 > 0) {
                j8.put((Object)"logLevel", (Object)n8);
            }
            if (!(map = d).isEmpty()) {
                string2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    k k8 = (k)entry.getValue();
                    HashMap hashMap = new HashMap();
                    hashMap.put((Object)"path", (Object)k8.b);
                    hashMap.put((Object)"singleInstance", (Object)k8.a);
                    n8 = k8.d;
                    if (n8 > 0) {
                        hashMap.put((Object)"logLevel", (Object)n8);
                    }
                    string2.put((Object)((Integer)entry.getKey()).toString(), (Object)hashMap);
                }
                j8.put((Object)"databases", (Object)string2);
            }
        }
        d8.a(j8);
    }

    public final void D(j object, k.d d8) {
        object = object.b();
        a.a = Boolean.TRUE.equals(object);
        boolean bl = a.b && a.a;
        a.c = bl;
        if (a.a) {
            if (a.c) {
                g = 2;
            } else if (a.a) {
                g = 1;
            }
        } else {
            g = 0;
        }
        d8.a(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void E(j object, k.d object2) {
        String string2;
        Object object3;
        block8 : {
            block7 : {
                Map map;
                Map map2;
                Integer n8;
                string2 = (String)object.a("path");
                Object object4 = e;
                // MONITORENTER : object4
                if (t.c(g)) {
                    object = new StringBuilder();
                    object.append("Look for ");
                    object.append(string2);
                    object.append(" in ");
                    object.append((Object)c.keySet());
                    Log.d((String)"Sqflite", (String)object.toString());
                }
                if ((n8 = (Integer)(map2 = c).get((Object)string2)) == null || (object3 = (k)(map = d).get((Object)n8)) == null || !object3.i.isOpen()) break block7;
                if (t.c(g)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(object3.A());
                    stringBuilder.append("found single instance ");
                    object = object3.F() ? "(in transaction) " : "";
                    stringBuilder.append((String)object);
                    stringBuilder.append((Object)n8);
                    stringBuilder.append(" ");
                    stringBuilder.append(string2);
                    Log.d((String)"Sqflite", (String)stringBuilder.toString());
                }
                map.remove((Object)n8);
                map2.remove((Object)string2);
                object = object3;
                // MONITOREXIT : object4
                break block8;
            }
            object = null;
        }
        object2 = new Runnable((k)object, string2, (k.d)object2){
            public final /* synthetic */ k o;
            public final /* synthetic */ String p;
            public final /* synthetic */ k.d q;
            {
                this.o = k8;
                this.p = string2;
                this.q = d8;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public void run() {
                block8 : {
                    Object object = f;
                    // MONITORENTER : object
                    k k8 = this.o;
                    if (k8 != null) {
                        E.this.l(k8);
                    }
                    try {
                        if (t.c(E.g)) {
                            k8 = new StringBuilder();
                            k8.append("delete database ");
                            k8.append(this.p);
                            Log.d((String)"Sqflite", (String)k8.toString());
                        }
                        k.o(this.p);
                        break block8;
                    }
                    catch (Exception exception) {}
                    k8 = new StringBuilder();
                    k8.append("error ");
                    k8.append((Object)exception);
                    k8.append(" while closing database ");
                    k8.append(k);
                    Log.e((String)"Sqflite", (String)k8.toString());
                }
                // MONITOREXIT : object
                this.q.a(null);
            }
        };
        object3 = l;
        if (object3 != null) {
            object3.b((k)object, (Runnable)object2);
            return;
        }
        object2.run();
    }

    public final void F(j j8, k.d d8) {
        k k8 = this.n(j8, d8);
        if (k8 == null) {
            return;
        }
        l.b(k8, new B(j8, d8, k8));
    }

    public void G(j j8, k.d d8) {
        if (h == null) {
            h = this.a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        d8.a(h);
    }

    public final void H(j j8, k.d d8) {
        k k8 = this.n(j8, d8);
        if (k8 == null) {
            return;
        }
        l.b(k8, new x(j8, d8, k8));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void I(j object, k.d d8) {
        Object object2;
        Object object3;
        Object object4;
        int n8;
        String string2 = (String)object.a("path");
        Boolean bl = (Boolean)object.a("readOnly");
        boolean bl2 = E.o(string2);
        boolean bl3 = !Boolean.FALSE.equals(object.a("singleInstance")) && !bl2;
        if (bl3) {
            object2 = e;
            // MONITORENTER : object2
            if (t.c(g)) {
                object4 = new StringBuilder();
                object4.append("Look for ");
                object4.append(string2);
                object4.append(" in ");
                object4.append((Object)c.keySet());
                Log.d((String)"Sqflite", (String)object4.toString());
            }
            if ((object3 = (Integer)c.get((Object)string2)) != null && (object4 = (k)d.get(object3)) != null) {
                if (!object4.i.isOpen()) {
                    if (t.c(g)) {
                        object3 = new StringBuilder();
                        object3.append(object4.A());
                        object3.append("single instance database of ");
                        object3.append(string2);
                        object3.append(" not opened");
                        Log.d((String)"Sqflite", (String)object3.toString());
                    }
                } else {
                    if (t.c(g)) {
                        bl = new StringBuilder();
                        bl.append(object4.A());
                        bl.append("re-opened single instance ");
                        object = object4.F() ? "(in transaction) " : "";
                        bl.append((String)object);
                        bl.append(object3);
                        bl.append(" ");
                        bl.append(string2);
                        Log.d((String)"Sqflite", (String)bl.toString());
                    }
                    d8.a((Object)E.x(object3.intValue(), true, object4.F()));
                    // MONITOREXIT : object2
                    return;
                }
            }
            // MONITOREXIT : object2
        }
        object2 = e;
        // MONITORENTER : object2
        k = n8 = k + 1;
        // MONITOREXIT : object2
        object4 = new k(this.a, string2, n8, bl3, g);
        // MONITORENTER : object2
        if (l == null) {
            l = object3 = p.b("Sqflite", j, i);
            object3.start();
            if (t.b(object4.d)) {
                object3 = new StringBuilder();
                object3.append(object4.A());
                object3.append("starting worker pool with priority ");
                object3.append(i);
                Log.d((String)"Sqflite", (String)object3.toString());
            }
        }
        object4.h = l;
        if (t.b(object4.d)) {
            object3 = new StringBuilder();
            object3.append(object4.A());
            object3.append("opened ");
            object3.append(n8);
            object3.append(" ");
            object3.append(string2);
            Log.d((String)"Sqflite", (String)object3.toString());
        }
        l.b((k)object4, new A(bl2, string2, d8, bl, (k)object4, (j)object, bl3, n8));
        // MONITOREXIT : object2
        return;
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    public void J(j j8, k.d d8) {
        Object object = j8.a("androidThreadPriority");
        if (object != null) {
            i = (Integer)object;
        }
        if ((object = j8.a("androidThreadCount")) != null && !object.equals((Object)j)) {
            j = (Integer)object;
            object = l;
            if (object != null) {
                object.a();
                l = null;
            }
        }
        if ((j8 = t.a(j8)) != null) {
            g = j8.intValue();
        }
        d8.a(null);
    }

    public final void K(j j8, k.d d8) {
        k k8 = this.n(j8, d8);
        if (k8 == null) {
            return;
        }
        l.b(k8, new y(j8, d8, k8));
    }

    public final void L(j j8, k.d d8) {
        k k8 = this.n(j8, d8);
        if (k8 == null) {
            return;
        }
        l.b(k8, new w(j8, d8, k8));
    }

    public final void M(j j8, k.d d8) {
        k k8 = this.n(j8, d8);
        if (k8 == null) {
            return;
        }
        l.b(k8, new z(j8, k8, d8));
    }

    public final void N(j j8, k.d d8) {
        k k8 = this.n(j8, d8);
        if (k8 == null) {
            return;
        }
        l.b(k8, new C(j8, d8, k8));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(k k8) {
        Object object;
        block8 : {
            try {
                if (t.b(k8.d)) {
                    object = new StringBuilder();
                    object.append(k8.A());
                    object.append("closing database ");
                    Log.d((String)"Sqflite", (String)object.toString());
                }
                k8.k();
                break block8;
            }
            catch (Exception exception) {}
            object = new StringBuilder();
            object.append("error ");
            object.append((Object)exception);
            object.append(" while closing database ");
            object.append(k);
            Log.e((String)"Sqflite", (String)object.toString());
        }
        object = e;
        synchronized (object) {
            try {
                if (d.isEmpty() && l != null) {
                    if (t.b(k8.d)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(k8.A());
                        stringBuilder.append("stopping thread");
                        Log.d((String)"Sqflite", (String)stringBuilder.toString());
                    }
                    l.a();
                    l = null;
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final k m(int n8) {
        return (k)d.get((Object)n8);
    }

    public final k n(j object, k.d d8) {
        int n8 = (Integer)object.a("id");
        object = this.m(n8);
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        object.append("database_closed ");
        object.append(n8);
        d8.b("sqlite_error", object.toString(), null);
        return null;
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.y(b8.a(), b8.b());
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        this.a = null;
        this.b.e(null);
        this.b = null;
    }

    @Override
    public void onMethodCall(j j8, k.d d8) {
        String string2 = j8.a;
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1863829223: {
                if (!string2.equals((Object)"getDatabasesPath")) break;
                n9 = 15;
                break;
            }
            case 1385449135: {
                if (!string2.equals((Object)"getPlatformVersion")) break;
                n9 = 14;
                break;
            }
            case 1193546321: {
                if (!string2.equals((Object)"queryCursorNext")) break;
                n9 = 13;
                break;
            }
            case 956410295: {
                if (!string2.equals((Object)"databaseExists")) break;
                n9 = 12;
                break;
            }
            case 107944136: {
                if (!string2.equals((Object)"query")) break;
                n9 = 11;
                break;
            }
            case 95458899: {
                if (!string2.equals((Object)"debug")) break;
                n9 = 10;
                break;
            }
            case 93509434: {
                if (!string2.equals((Object)"batch")) break;
                n9 = 9;
                break;
            }
            case -17190427: {
                if (!string2.equals((Object)"openDatabase")) break;
                n9 = 8;
                break;
            }
            case -198450538: {
                if (!string2.equals((Object)"debugMode")) break;
                n9 = 7;
                break;
            }
            case -263511994: {
                if (!string2.equals((Object)"deleteDatabase")) break;
                n9 = 6;
                break;
            }
            case -396289107: {
                if (!string2.equals((Object)"androidSetLocale")) break;
                n9 = 5;
                break;
            }
            case -838846263: {
                if (!string2.equals((Object)"update")) break;
                n9 = 4;
                break;
            }
            case -1183792455: {
                if (!string2.equals((Object)"insert")) break;
                n9 = 3;
                break;
            }
            case -1249474914: {
                if (!string2.equals((Object)"options")) break;
                n9 = 2;
                break;
            }
            case -1253581933: {
                if (!string2.equals((Object)"closeDatabase")) break;
                n9 = 1;
                break;
            }
            case -1319569547: {
                if (!string2.equals((Object)"execute")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                d8.c();
                return;
            }
            case 15: {
                this.G(j8, d8);
                return;
            }
            case 14: {
                j8 = new StringBuilder();
                j8.append("Android ");
                j8.append(Build.VERSION.RELEASE);
                d8.a(j8.toString());
                return;
            }
            case 13: {
                this.L(j8, d8);
                return;
            }
            case 12: {
                this.B(j8, d8);
                return;
            }
            case 11: {
                this.K(j8, d8);
                return;
            }
            case 10: {
                this.C(j8, d8);
                return;
            }
            case 9: {
                this.z(j8, d8);
                return;
            }
            case 8: {
                this.I(j8, d8);
                return;
            }
            case 7: {
                this.D(j8, d8);
                return;
            }
            case 6: {
                this.E(j8, d8);
                return;
            }
            case 5: {
                this.M(j8, d8);
                return;
            }
            case 4: {
                this.N(j8, d8);
                return;
            }
            case 3: {
                this.H(j8, d8);
                return;
            }
            case 2: {
                this.J(j8, d8);
                return;
            }
            case 1: {
                this.A(j8, d8);
                return;
            }
            case 0: 
        }
        this.F(j8, d8);
    }

    public final void y(Context object, c c8) {
        this.a = object;
        this.b = object = new E5.k(c8, "com.tekartik.sqflite", E5.q.b, c8.b());
        object.e(this);
    }

    public final void z(j j8, k.d d8) {
        k k8 = this.n(j8, d8);
        if (k8 == null) {
            return;
        }
        l.b(k8, new D(k8, j8, d8));
    }

}

