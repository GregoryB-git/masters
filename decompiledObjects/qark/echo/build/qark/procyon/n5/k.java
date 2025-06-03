// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n5;

import android.database.sqlite.SQLiteClosable;
import android.os.BaseBundle;
import java.util.Arrays;
import java.util.Iterator;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.util.Log;
import p5.h;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import java.io.File;
import android.content.pm.ApplicationInfo;
import android.os.Build$VERSION;
import p5.e;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteProgram;
import android.database.Cursor;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteCursorDriver;
import java.util.HashMap;
import java.util.ArrayList;
import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import java.util.List;
import android.content.Context;

public class k
{
    public static Boolean n;
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final Context e;
    public final List f;
    public final Map g;
    public q h;
    public SQLiteDatabase i;
    public int j;
    public int k;
    public Integer l;
    public int m;
    
    public k(final Context e, final String b, final int c, final boolean a, final int d) {
        this.f = new ArrayList();
        this.g = new HashMap();
        this.j = 0;
        this.k = 0;
        this.m = 0;
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public static boolean i(final Context context, final String s, final boolean b) {
        while (true) {
            try {
                final String packageName = context.getPackageName();
                ApplicationInfo applicationInfo;
                if (Build$VERSION.SDK_INT >= 33) {
                    applicationInfo = c.a(context.getPackageManager(), packageName, b.a(128L));
                }
                else {
                    applicationInfo = y(context, packageName, 128);
                }
                if (((BaseBundle)applicationInfo.metaData).getBoolean(s, b)) {
                    return true;
                }
                return false;
                final Exception ex;
                ex.printStackTrace();
                return false;
            }
            catch (Exception ex2) {}
            final Exception ex2;
            final Exception ex = ex2;
            continue;
        }
    }
    
    public static boolean j(final Context context) {
        return i(context, "com.tekartik.sqflite.wal_enabled", false);
    }
    
    public static void o(final String pathname) {
        SQLiteDatabase.deleteDatabase(new File(pathname));
    }
    
    public static boolean x(final String pathname) {
        try {
            return new File(pathname).exists();
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    public static ApplicationInfo y(final Context context, final String s, final int n) {
        return context.getPackageManager().getApplicationInfo(s, n);
    }
    
    public String A() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.B());
        sb.append("] ");
        return sb.toString();
    }
    
    public String B() {
        final Thread currentThread = Thread.currentThread();
        final StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.c);
        sb.append(",");
        sb.append(currentThread.getName());
        sb.append("(");
        sb.append(currentThread.getId());
        sb.append(")");
        return sb.toString();
    }
    
    public SQLiteDatabase C() {
        return this.i;
    }
    
    public void D(final Exception ex, final e e) {
        String s;
        Object a;
        if (ex instanceof SQLiteCantOpenDatabaseException) {
            final StringBuilder sb = new StringBuilder();
            sb.append("open_failed ");
            sb.append(this.b);
            s = sb.toString();
            a = null;
        }
        else {
            final boolean b = ex instanceof SQLException;
            s = ex.getMessage();
            a = p5.h.a(e);
        }
        e.b("sqlite_error", s, a);
    }
    
    public void E(final e e) {
        this.S(e, new g(this, e));
    }
    
    public boolean F() {
        synchronized (this) {
            return this.j > 0;
        }
    }
    
    public void M() {
        if (n5.k.n == null && (n5.k.n = j(this.e)) && t.c(this.d)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.A());
            sb.append("[sqflite] WAL enabled");
            Log.d("Sqflite", sb.toString());
        }
        int n;
        if (n5.k.n) {
            n = 805306368;
        }
        else {
            n = 268435456;
        }
        this.i = SQLiteDatabase.openDatabase(this.b, (SQLiteDatabase$CursorFactory)null, n);
    }
    
    public void N() {
        this.i = SQLiteDatabase.openDatabase(this.b, (SQLiteDatabase$CursorFactory)null, 1, (DatabaseErrorHandler)new DatabaseErrorHandler() {
            public void onCorruption(final SQLiteDatabase sqLiteDatabase) {
            }
        });
    }
    
    public void O(final e e) {
        this.S(e, new n5.e(this, e));
    }
    
    public void P(final e e) {
        this.S(e, new d(this, e));
    }
    
    public final void Q() {
        while (!this.f.isEmpty()) {
            if (this.l != null) {
                return;
            }
            this.f.get(0).a();
            this.f.remove(0);
        }
    }
    
    public void R(final e e) {
        this.S(e, new f(this, e));
    }
    
    public final void S(final e e, final Runnable runnable) {
        final Integer g = e.g();
        final Integer l = this.l;
        if (l == null) {
            runnable.run();
            return;
        }
        if (g != null && (g.equals(l) || g == -1)) {
            runnable.run();
            if (this.l == null && !this.f.isEmpty()) {
                this.h.b(this, new j(this));
            }
        }
        else {
            this.f.add(new p5.g(e, runnable));
        }
    }
    
    public void h(final E5.j j, final E5.k.d d) {
        final p5.d d2 = new p5.d(j, d);
        final boolean e = d2.e();
        final boolean l = d2.l();
        final List list = (List)d2.c("operations");
        final ArrayList list2 = new ArrayList();
        final Iterator<Map> iterator = list.iterator();
        while (iterator.hasNext()) {
            final p5.c c = new p5.c(iterator.next(), e);
            final String i = c.i();
            i.hashCode();
            final int hashCode = i.hashCode();
            int n = -1;
            switch (hashCode) {
                case 107944136: {
                    if (!i.equals("query")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -838846263: {
                    if (!i.equals("update")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1183792455: {
                    if (!i.equals("insert")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1319569547: {
                    if (!i.equals("execute")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            Label_0325: {
                switch (n) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Batch method '");
                        sb.append(i);
                        sb.append("' not supported");
                        d.b("bad_param", sb.toString(), null);
                        return;
                    }
                    case 3: {
                        if (this.r(c)) {
                            break;
                        }
                        if (l) {
                            break Label_0325;
                        }
                        c.r(d);
                        return;
                    }
                    case 2: {
                        if (this.t(c)) {
                            break;
                        }
                        if (l) {
                            break Label_0325;
                        }
                        c.r(d);
                        return;
                    }
                    case 1: {
                        if (this.q(c)) {
                            break;
                        }
                        if (l) {
                            break Label_0325;
                        }
                        c.r(d);
                        return;
                    }
                    case 0: {
                        if (this.p(c)) {
                            break;
                        }
                        if (l) {
                            break Label_0325;
                        }
                        c.r(d);
                        return;
                    }
                }
                c.t(list2);
                continue;
            }
            c.s(list2);
        }
        if (e) {
            d.a(null);
            return;
        }
        d.a(list2);
    }
    
    public void k() {
        if (!this.g.isEmpty() && t.b(this.d)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.A());
            sb.append(this.g.size());
            sb.append(" cursor(s) are left opened");
            Log.d("Sqflite", sb.toString());
        }
        ((SQLiteClosable)this.i).close();
    }
    
    public final void l(final int i) {
        final v v = this.g.get(i);
        if (v != null) {
            this.m(v);
        }
    }
    
    public final void m(final v v) {
        try {
            final int a = v.a;
            if (t.c(this.d)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.A());
                sb.append("closing cursor ");
                sb.append(a);
                Log.d("Sqflite", sb.toString());
            }
            this.g.remove(a);
            v.c.close();
        }
        catch (Exception ex) {}
    }
    
    public final Map n(final Cursor cursor, final Integer n) {
        Map<String, List<String>> map = null;
        int n2 = 0;
        List<String> list = null;
        Map<String, List<String>> map2;
        while (true) {
            map2 = map;
            if (!cursor.moveToNext()) {
                break;
            }
            map2 = map;
            List<String> list2 = list;
            int columnCount = n2;
            if (map == null) {
                list2 = new ArrayList<String>();
                map2 = new HashMap<String, List<String>>();
                columnCount = cursor.getColumnCount();
                map2.put("columns", Arrays.asList(cursor.getColumnNames()));
                map2.put("rows", list2);
            }
            list2.add((String)G.a(cursor, columnCount));
            map = map2;
            list = list2;
            n2 = columnCount;
            if (n == null) {
                continue;
            }
            map = map2;
            list = list2;
            n2 = columnCount;
            if (list2.size() >= n) {
                break;
            }
        }
        Map<String, List<String>> map3;
        if ((map3 = map2) == null) {
            map3 = new HashMap<String, List<String>>();
        }
        return map3;
    }
    
    public final boolean p(final e e) {
        if (!this.w(e)) {
            return false;
        }
        e.a(null);
        return true;
    }
    
    public final boolean q(final e p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokevirtual   n5/k.w:(Lp5/e;)Z
        //     5: ifne            10
        //     8: iconst_0       
        //     9: ireturn        
        //    10: aload_1        
        //    11: invokeinterface p5/e.e:()Z
        //    16: istore_2       
        //    17: aconst_null    
        //    18: astore          5
        //    20: iload_2        
        //    21: ifeq            33
        //    24: aload_1        
        //    25: aconst_null    
        //    26: invokeinterface p5/f.a:(Ljava/lang/Object;)V
        //    31: iconst_1       
        //    32: ireturn        
        //    33: aload_0        
        //    34: invokevirtual   n5/k.C:()Landroid/database/sqlite/SQLiteDatabase;
        //    37: ldc_w           "SELECT changes(), last_insert_rowid()"
        //    40: aconst_null    
        //    41: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //    44: astore          6
        //    46: aload           6
        //    48: ifnull          334
        //    51: aload           6
        //    53: astore          5
        //    55: aload           6
        //    57: invokeinterface android/database/Cursor.getCount:()I
        //    62: ifle            334
        //    65: aload           6
        //    67: astore          5
        //    69: aload           6
        //    71: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    76: ifeq            334
        //    79: aload           6
        //    81: astore          5
        //    83: aload           6
        //    85: iconst_0       
        //    86: invokeinterface android/database/Cursor.getInt:(I)I
        //    91: ifne            217
        //    94: aload           6
        //    96: astore          5
        //    98: aload_0        
        //    99: getfield        n5/k.d:I
        //   102: invokestatic    n5/t.b:(I)Z
        //   105: ifeq            197
        //   108: aload           6
        //   110: astore          5
        //   112: new             Ljava/lang/StringBuilder;
        //   115: dup            
        //   116: invokespecial   java/lang/StringBuilder.<init>:()V
        //   119: astore          7
        //   121: aload           6
        //   123: astore          5
        //   125: aload           7
        //   127: aload_0        
        //   128: invokevirtual   n5/k.A:()Ljava/lang/String;
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   134: pop            
        //   135: aload           6
        //   137: astore          5
        //   139: aload           7
        //   141: ldc_w           "no changes (id was "
        //   144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   147: pop            
        //   148: aload           6
        //   150: astore          5
        //   152: aload           7
        //   154: aload           6
        //   156: iconst_1       
        //   157: invokeinterface android/database/Cursor.getLong:(I)J
        //   162: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   165: pop            
        //   166: aload           6
        //   168: astore          5
        //   170: aload           7
        //   172: ldc             ")"
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: pop            
        //   178: aload           6
        //   180: astore          5
        //   182: ldc_w           "Sqflite"
        //   185: aload           7
        //   187: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   190: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   193: pop            
        //   194: goto            197
        //   197: aload           6
        //   199: astore          5
        //   201: aload_1        
        //   202: aconst_null    
        //   203: invokeinterface p5/f.a:(Ljava/lang/Object;)V
        //   208: aload           6
        //   210: invokeinterface android/database/Cursor.close:()V
        //   215: iconst_1       
        //   216: ireturn        
        //   217: aload           6
        //   219: astore          5
        //   221: aload           6
        //   223: iconst_1       
        //   224: invokeinterface android/database/Cursor.getLong:(I)J
        //   229: lstore_3       
        //   230: aload           6
        //   232: astore          5
        //   234: aload_0        
        //   235: getfield        n5/k.d:I
        //   238: invokestatic    n5/t.b:(I)Z
        //   241: ifeq            311
        //   244: aload           6
        //   246: astore          5
        //   248: new             Ljava/lang/StringBuilder;
        //   251: dup            
        //   252: invokespecial   java/lang/StringBuilder.<init>:()V
        //   255: astore          7
        //   257: aload           6
        //   259: astore          5
        //   261: aload           7
        //   263: aload_0        
        //   264: invokevirtual   n5/k.A:()Ljava/lang/String;
        //   267: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   270: pop            
        //   271: aload           6
        //   273: astore          5
        //   275: aload           7
        //   277: ldc_w           "inserted "
        //   280: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   283: pop            
        //   284: aload           6
        //   286: astore          5
        //   288: aload           7
        //   290: lload_3        
        //   291: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   294: pop            
        //   295: aload           6
        //   297: astore          5
        //   299: ldc_w           "Sqflite"
        //   302: aload           7
        //   304: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   307: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   310: pop            
        //   311: aload           6
        //   313: astore          5
        //   315: aload_1        
        //   316: lload_3        
        //   317: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   320: invokeinterface p5/f.a:(Ljava/lang/Object;)V
        //   325: aload           6
        //   327: invokeinterface android/database/Cursor.close:()V
        //   332: iconst_1       
        //   333: ireturn        
        //   334: aload           6
        //   336: astore          5
        //   338: new             Ljava/lang/StringBuilder;
        //   341: dup            
        //   342: invokespecial   java/lang/StringBuilder.<init>:()V
        //   345: astore          7
        //   347: aload           6
        //   349: astore          5
        //   351: aload           7
        //   353: aload_0        
        //   354: invokevirtual   n5/k.A:()Ljava/lang/String;
        //   357: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   360: pop            
        //   361: aload           6
        //   363: astore          5
        //   365: aload           7
        //   367: ldc_w           "fail to read changes for Insert"
        //   370: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   373: pop            
        //   374: aload           6
        //   376: astore          5
        //   378: ldc_w           "Sqflite"
        //   381: aload           7
        //   383: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   386: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   389: pop            
        //   390: aload           6
        //   392: astore          5
        //   394: aload_1        
        //   395: aconst_null    
        //   396: invokeinterface p5/f.a:(Ljava/lang/Object;)V
        //   401: aload           6
        //   403: ifnull          413
        //   406: aload           6
        //   408: invokeinterface android/database/Cursor.close:()V
        //   413: iconst_1       
        //   414: ireturn        
        //   415: astore          6
        //   417: aload           5
        //   419: astore_1       
        //   420: aload           6
        //   422: astore          5
        //   424: goto            457
        //   427: astore          7
        //   429: aconst_null    
        //   430: astore          6
        //   432: aload           6
        //   434: astore          5
        //   436: aload_0        
        //   437: aload           7
        //   439: aload_1        
        //   440: invokevirtual   n5/k.D:(Ljava/lang/Exception;Lp5/e;)V
        //   443: aload           6
        //   445: ifnull          455
        //   448: aload           6
        //   450: invokeinterface android/database/Cursor.close:()V
        //   455: iconst_0       
        //   456: ireturn        
        //   457: aload_1        
        //   458: ifnull          467
        //   461: aload_1        
        //   462: invokeinterface android/database/Cursor.close:()V
        //   467: aload           5
        //   469: athrow         
        //   470: astore          6
        //   472: aload           5
        //   474: astore_1       
        //   475: aload           6
        //   477: astore          5
        //   479: goto            457
        //   482: astore          7
        //   484: goto            432
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  33     46     427    432    Ljava/lang/Exception;
        //  33     46     415    427    Any
        //  55     65     482    487    Ljava/lang/Exception;
        //  55     65     470    482    Any
        //  69     79     482    487    Ljava/lang/Exception;
        //  69     79     470    482    Any
        //  83     94     482    487    Ljava/lang/Exception;
        //  83     94     470    482    Any
        //  98     108    482    487    Ljava/lang/Exception;
        //  98     108    470    482    Any
        //  112    121    482    487    Ljava/lang/Exception;
        //  112    121    470    482    Any
        //  125    135    482    487    Ljava/lang/Exception;
        //  125    135    470    482    Any
        //  139    148    482    487    Ljava/lang/Exception;
        //  139    148    470    482    Any
        //  152    166    482    487    Ljava/lang/Exception;
        //  152    166    470    482    Any
        //  170    178    482    487    Ljava/lang/Exception;
        //  170    178    470    482    Any
        //  182    194    482    487    Ljava/lang/Exception;
        //  182    194    470    482    Any
        //  201    208    482    487    Ljava/lang/Exception;
        //  201    208    470    482    Any
        //  221    230    482    487    Ljava/lang/Exception;
        //  221    230    470    482    Any
        //  234    244    482    487    Ljava/lang/Exception;
        //  234    244    470    482    Any
        //  248    257    482    487    Ljava/lang/Exception;
        //  248    257    470    482    Any
        //  261    271    482    487    Ljava/lang/Exception;
        //  261    271    470    482    Any
        //  275    284    482    487    Ljava/lang/Exception;
        //  275    284    470    482    Any
        //  288    295    482    487    Ljava/lang/Exception;
        //  288    295    470    482    Any
        //  299    311    482    487    Ljava/lang/Exception;
        //  299    311    470    482    Any
        //  315    325    482    487    Ljava/lang/Exception;
        //  315    325    470    482    Any
        //  338    347    482    487    Ljava/lang/Exception;
        //  338    347    470    482    Any
        //  351    361    482    487    Ljava/lang/Exception;
        //  351    361    470    482    Any
        //  365    374    482    487    Ljava/lang/Exception;
        //  365    374    470    482    Any
        //  378    390    482    487    Ljava/lang/Exception;
        //  378    390    470    482    Any
        //  394    401    482    487    Ljava/lang/Exception;
        //  394    401    470    482    Any
        //  436    443    470    482    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0197:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final boolean r(final e e) {
        final Integer n = (Integer)e.c("cursorPageSize");
        final F d = e.d();
        if (t.b(this.d)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.A());
            sb.append(d);
            Log.d("Sqflite", sb.toString());
        }
        final v v = null;
        final v v2 = null;
        v v3 = null;
        Object o = null;
        final Exception ex = null;
        Cursor cursor3 = null;
        Label_0425: {
            Label_0374: {
                try {
                    Cursor rawQueryWithFactory;
                    final Cursor cursor = rawQueryWithFactory = this.z().rawQueryWithFactory((SQLiteDatabase$CursorFactory)new i(d), d.c(), n5.a.a, (String)null);
                    o = ex;
                    v v4 = v;
                    Map n2 = null;
                    Cursor cursor2 = null;
                    Label_0324: {
                        try {
                            try {
                                n2 = this.n(cursor, n);
                                v3 = v2;
                                if (n == null) {
                                    break Label_0324;
                                }
                                rawQueryWithFactory = cursor;
                                o = ex;
                                v4 = v;
                                v3 = v2;
                                if (cursor.isLast()) {
                                    break Label_0324;
                                }
                                rawQueryWithFactory = cursor;
                                o = ex;
                                v4 = v;
                                v3 = v2;
                                if (cursor.isAfterLast()) {
                                    break Label_0324;
                                }
                                rawQueryWithFactory = cursor;
                                o = ex;
                                v4 = v;
                                final int i = this.m + 1;
                                rawQueryWithFactory = cursor;
                                o = ex;
                                v4 = v;
                                this.m = i;
                                rawQueryWithFactory = cursor;
                                o = ex;
                                v4 = v;
                                n2.put("cursorId", i);
                                rawQueryWithFactory = cursor;
                                o = ex;
                                v4 = v;
                                v3 = new v(i, n, cursor);
                                try {
                                    this.g.put(i, v3);
                                }
                                catch (Exception ex) {}
                            }
                            finally {
                                cursor2 = rawQueryWithFactory;
                            }
                        }
                        catch (Exception ex) {
                            v3 = v4;
                            break Label_0374;
                        }
                    }
                    o = v3;
                    e.a(n2);
                    if (v3 == null && cursor2 != null) {
                        cursor2.close();
                    }
                    return true;
                }
                catch (Exception ex) {
                    cursor3 = null;
                }
                finally {
                    cursor3 = null;
                    break Label_0425;
                }
            }
            this.D(ex, e);
            if (v3 != null) {
                this.m(v3);
            }
            if (v3 == null && cursor3 != null) {
                cursor3.close();
            }
            return false;
        }
        if (o == null && cursor3 != null) {
            cursor3.close();
        }
    }
    
    public final boolean s(final e e) {
        final Integer n = (Integer)e.c("cursorId");
        int intValue = n;
        final boolean equals = Boolean.TRUE.equals(e.c("cancel"));
        if (t.c(this.d)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.A());
            sb.append("cursor ");
            sb.append(intValue);
            Object c;
            if (equals) {
                c = " cancel";
            }
            else {
                c = " next";
            }
            sb.append((String)c);
            Log.d("Sqflite", sb.toString());
        }
        final v v = null;
        if (equals) {
            this.l(intValue);
            e.a(null);
            return true;
        }
        final v v2 = this.g.get(n);
        int n2 = 0;
        Label_0274: {
            if (v2 == null) {
                break Label_0274;
            }
            while (true) {
                Label_0367: {
                    Map n3 = null;
                    Label_0230: {
                        try {
                            final Object c = v2.c;
                            n3 = this.n((Cursor)c, v2.b);
                            if (!((Cursor)c).isLast() && !((Cursor)c).isAfterLast()) {
                                n2 = 1;
                                break Label_0230;
                            }
                        }
                        catch (Exception c) {
                            n2 = 0;
                            break Label_0321;
                        }
                        finally {
                            break Label_0367;
                        }
                        n2 = 0;
                    }
                    Label_0252: {
                        if (n2 == 0) {
                            break Label_0252;
                        }
                        intValue = n2;
                        try {
                            try {
                                n3.put("cursorId", n);
                                intValue = n2;
                                e.a(n3);
                                if (n2 == 0) {
                                    this.m(v2);
                                }
                                return true;
                                intValue = n2;
                                final Object c;
                                this.D((Exception)c, e);
                                // iftrue(Label_0349:, v2 == null)
                                // iftrue(Label_0382:, n2 != 0 || v2 == null)
                                Block_14: {
                                    break Block_14;
                                    Block_18: {
                                        break Block_18;
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Cursor ");
                                        sb2.append(intValue);
                                        sb2.append(" not found");
                                        throw new IllegalStateException(sb2.toString());
                                    }
                                    this.m(v2);
                                    Label_0382: {
                                        throw e;
                                    }
                                }
                                intValue = n2;
                                this.m(v2);
                                v v3 = v;
                                // iftrue(Label_0365:, n2 != 0 || v3 == null)
                                while (true) {
                                    Label_0352: {
                                        break Label_0352;
                                        Label_0365: {
                                            return false;
                                        }
                                        this.m(v3);
                                        return false;
                                    }
                                    continue;
                                }
                                Label_0349: {
                                    v3 = v2;
                                }
                            }
                            finally {
                                n2 = intValue;
                            }
                        }
                        catch (Exception c) {
                            continue;
                        }
                    }
                }
                break;
            }
        }
    }
    
    public final boolean t(final e p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokevirtual   n5/k.w:(Lp5/e;)Z
        //     5: ifne            10
        //     8: iconst_0       
        //     9: ireturn        
        //    10: aload_1        
        //    11: invokeinterface p5/e.e:()Z
        //    16: istore_3       
        //    17: aconst_null    
        //    18: astore          6
        //    20: aconst_null    
        //    21: astore          4
        //    23: iload_3        
        //    24: ifeq            36
        //    27: aload_1        
        //    28: aconst_null    
        //    29: invokeinterface p5/f.a:(Ljava/lang/Object;)V
        //    34: iconst_1       
        //    35: ireturn        
        //    36: aload_0        
        //    37: invokevirtual   n5/k.C:()Landroid/database/sqlite/SQLiteDatabase;
        //    40: ldc_w           "SELECT changes()"
        //    43: aconst_null    
        //    44: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //    47: astore          5
        //    49: aload           5
        //    51: ifnull          162
        //    54: aload           5
        //    56: invokeinterface android/database/Cursor.getCount:()I
        //    61: ifle            162
        //    64: aload           5
        //    66: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    71: ifeq            162
        //    74: aload           5
        //    76: iconst_0       
        //    77: invokeinterface android/database/Cursor.getInt:(I)I
        //    82: istore_2       
        //    83: aload_0        
        //    84: getfield        n5/k.d:I
        //    87: invokestatic    n5/t.b:(I)Z
        //    90: ifeq            143
        //    93: new             Ljava/lang/StringBuilder;
        //    96: dup            
        //    97: invokespecial   java/lang/StringBuilder.<init>:()V
        //   100: astore          4
        //   102: aload           4
        //   104: aload_0        
        //   105: invokevirtual   n5/k.A:()Ljava/lang/String;
        //   108: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: pop            
        //   112: aload           4
        //   114: ldc_w           "changed "
        //   117: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   120: pop            
        //   121: aload           4
        //   123: iload_2        
        //   124: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   127: pop            
        //   128: ldc_w           "Sqflite"
        //   131: aload           4
        //   133: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   136: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   139: pop            
        //   140: goto            143
        //   143: aload_1        
        //   144: iload_2        
        //   145: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   148: invokeinterface p5/f.a:(Ljava/lang/Object;)V
        //   153: aload           5
        //   155: invokeinterface android/database/Cursor.close:()V
        //   160: iconst_1       
        //   161: ireturn        
        //   162: new             Ljava/lang/StringBuilder;
        //   165: dup            
        //   166: invokespecial   java/lang/StringBuilder.<init>:()V
        //   169: astore          4
        //   171: aload           4
        //   173: aload_0        
        //   174: invokevirtual   n5/k.A:()Ljava/lang/String;
        //   177: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   180: pop            
        //   181: aload           4
        //   183: ldc_w           "fail to read changes for Update/Delete"
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: pop            
        //   190: ldc_w           "Sqflite"
        //   193: aload           4
        //   195: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   198: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   201: pop            
        //   202: aload_1        
        //   203: aconst_null    
        //   204: invokeinterface p5/f.a:(Ljava/lang/Object;)V
        //   209: aload           5
        //   211: ifnull          221
        //   214: aload           5
        //   216: invokeinterface android/database/Cursor.close:()V
        //   221: iconst_1       
        //   222: ireturn        
        //   223: astore_1       
        //   224: goto            262
        //   227: astore          4
        //   229: aload           6
        //   231: astore          5
        //   233: aload           4
        //   235: astore          6
        //   237: aload           5
        //   239: astore          4
        //   241: aload_0        
        //   242: aload           6
        //   244: aload_1        
        //   245: invokevirtual   n5/k.D:(Ljava/lang/Exception;Lp5/e;)V
        //   248: aload           5
        //   250: ifnull          260
        //   253: aload           5
        //   255: invokeinterface android/database/Cursor.close:()V
        //   260: iconst_0       
        //   261: ireturn        
        //   262: aload           4
        //   264: ifnull          274
        //   267: aload           4
        //   269: invokeinterface android/database/Cursor.close:()V
        //   274: aload_1        
        //   275: athrow         
        //   276: astore_1       
        //   277: aload           5
        //   279: astore          4
        //   281: goto            262
        //   284: astore          6
        //   286: goto            237
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  36     49     227    237    Ljava/lang/Exception;
        //  36     49     223    227    Any
        //  54     140    284    289    Ljava/lang/Exception;
        //  54     140    276    284    Any
        //  143    153    284    289    Ljava/lang/Exception;
        //  143    153    276    284    Any
        //  162    209    284    289    Ljava/lang/Exception;
        //  162    209    276    284    Any
        //  241    248    223    227    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException
        //     at java.base/java.util.Collections$1.remove(Collections.java:4714)
        //     at java.base/java.util.AbstractCollection.removeAll(AbstractCollection.java:385)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2968)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void u(final Boolean b) {
        // monitorenter(this)
        while (true) {
            try {
                if (Boolean.TRUE.equals(b)) {
                    ++this.j;
                }
                else if (Boolean.FALSE.equals(b)) {
                    --this.j;
                }
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void v(final e e) {
        this.S(e, new n5.h(this, e));
    }
    
    public final boolean w(final e e) {
        final F d = e.d();
        if (t.b(this.d)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.A());
            sb.append(d);
            Log.d("Sqflite", sb.toString());
        }
        final Boolean f = e.f();
        try {
            this.C().execSQL(d.c(), d.d());
            this.u(f);
            return true;
        }
        catch (Exception ex) {
            this.D(ex, e);
            return false;
        }
    }
    
    public SQLiteDatabase z() {
        return this.i;
    }
}
