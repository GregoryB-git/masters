// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n5;

import E5.l;
import E5.c;
import android.os.Build$VERSION;
import java.util.Iterator;
import android.util.Log;
import p5.e;
import p5.d;
import E5.j;
import java.util.HashMap;
import android.content.Context;
import java.util.Map;
import E5.k;
import A5.a;

public class E implements a, c
{
    public static final Map c;
    public static final Map d;
    public static final Object e;
    public static final Object f;
    public static int g;
    public static String h;
    public static int i;
    public static int j;
    public static int k;
    public static q l;
    public Context a;
    public k b;
    
    static {
        c = new HashMap();
        d = new HashMap();
        e = new Object();
        f = new Object();
        E.g = 0;
        E.i = 0;
        E.j = 1;
        E.k = 0;
    }
    
    public static /* synthetic */ Object i() {
        return E.f;
    }
    
    public static /* synthetic */ int k() {
        return E.k;
    }
    
    public static boolean o(final String s) {
        return s == null || s.equals(":memory:");
    }
    
    public static Map x(final int i, final boolean b, final boolean b2) {
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("id", i);
        if (b) {
            hashMap.put("recovered", (Integer)(Object)Boolean.TRUE);
        }
        if (b2) {
            hashMap.put("recoveredInTransaction", (Integer)(Object)Boolean.TRUE);
        }
        return hashMap;
    }
    
    public final void A(final j j, final d d) {
        final Integer n = (Integer)j.a("id");
        final int intValue = n;
        final n5.k n2 = this.n(j, d);
        if (n2 == null) {
            return;
        }
        if (t.b(n2.d)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(n2.A());
            sb.append("closing ");
            sb.append(intValue);
            sb.append(" ");
            sb.append(n2.b);
            Log.d("Sqflite", sb.toString());
        }
        final String b = n2.b;
        final Object e = E.e;
        // monitorenter(e)
        while (true) {
            try {
                E.d.remove(n);
                if (n2.a) {
                    E.c.remove(b);
                }
                // monitorexit(e)
                E.l.b(n2, new Runnable() {
                    @Override
                    public void run() {
                        synchronized (E.i()) {
                            E.this.l(n2);
                            // monitorexit(E.i())
                            d.a(null);
                        }
                    }
                });
                return;
                // monitorexit(e)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void B(final j j, final d d) {
        d.a(n5.k.x((String)j.a("path")));
    }
    
    public final void C(final j j, final d d) {
        final String anObject = (String)j.a("cmd");
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        if ("get".equals(anObject)) {
            final int g = E.g;
            if (g > 0) {
                hashMap.put("logLevel", g);
            }
            final Map d2 = E.d;
            if (!d2.isEmpty()) {
                final HashMap<String, HashMap<String, Boolean>> hashMap2 = new HashMap<String, HashMap<String, Boolean>>();
                for (final Map.Entry<Integer, V> entry : d2.entrySet()) {
                    final n5.k k = (n5.k)entry.getValue();
                    final HashMap<String, Boolean> hashMap3 = new HashMap<String, Boolean>();
                    hashMap3.put("path", (Boolean)k.b);
                    hashMap3.put("singleInstance", k.a);
                    final int d3 = k.d;
                    if (d3 > 0) {
                        hashMap3.put("logLevel", (Boolean)(Object)Integer.valueOf(d3));
                    }
                    hashMap2.put(entry.getKey().toString(), hashMap3);
                }
                hashMap.put("databases", (Integer)hashMap2);
            }
        }
        d.a(hashMap);
    }
    
    public final void D(final j j, final d d) {
        o5.a.a = Boolean.TRUE.equals(j.b());
        o5.a.c = (o5.a.b && o5.a.a);
        if (o5.a.a) {
            if (o5.a.c) {
                E.g = 2;
            }
            else if (o5.a.a) {
                E.g = 1;
            }
        }
        else {
            E.g = 0;
        }
        d.a(null);
    }
    
    public final void E(final j j, d d) {
        String s;
        Object e;
        StringBuilder sb;
        Map c;
        Integer obj;
        Map d2;
        Object l;
        StringBuilder sb2;
        String str;
        n5.k k;
        final Throwable t;
        Label_0193_Outer:Label_0260_Outer:
        while (true) {
            s = (String)j.a("path");
            e = E.e;
            // monitorenter(e)
            while (true) {
                Label_0316: {
                    while (true) {
                        Label_0309: {
                            while (true) {
                                try {
                                    if (n5.t.c(E.g)) {
                                        sb = new StringBuilder();
                                        sb.append("Look for ");
                                        sb.append(s);
                                        sb.append(" in ");
                                        sb.append(E.c.keySet());
                                        Log.d("Sqflite", sb.toString());
                                    }
                                    c = E.c;
                                    obj = c.get(s);
                                    if (obj == null) {
                                        break Label_0316;
                                    }
                                    d2 = E.d;
                                    l = d2.get(obj);
                                    if (l == null || !((n5.k)l).i.isOpen()) {
                                        break Label_0316;
                                    }
                                    if (n5.t.c(E.g)) {
                                        sb2 = new StringBuilder();
                                        sb2.append(((n5.k)l).A());
                                        sb2.append("found single instance ");
                                        if (!((n5.k)l).F()) {
                                            break Label_0309;
                                        }
                                        str = "(in transaction) ";
                                        sb2.append(str);
                                        sb2.append(obj);
                                        sb2.append(" ");
                                        sb2.append(s);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    d2.remove(obj);
                                    c.remove(s);
                                    k = (n5.k)l;
                                    // monitorexit(e)
                                    d = (d)new Runnable() {
                                        @Override
                                        public void run() {
                                            final Object i = E.i();
                                            // monitorenter(i)
                                            while (true) {
                                                Label_0030: {
                                                    try {
                                                        final n5.k o = k;
                                                        if (o != null) {
                                                            E.this.l(o);
                                                        }
                                                        break Label_0030;
                                                    }
                                                    finally {
                                                        Label_0145: {
                                                            break Label_0145;
                                                            try {
                                                                if (n5.t.c(E.g)) {
                                                                    final StringBuilder sb = new StringBuilder();
                                                                    sb.append("delete database ");
                                                                    sb.append(s);
                                                                    Log.d("Sqflite", sb.toString());
                                                                }
                                                                n5.k.o(s);
                                                                // monitorexit(i)
                                                                d.a(null);
                                                                return;
                                                                // monitorexit(i)
                                                                final StringBuilder sb2 = new StringBuilder();
                                                                sb2.append("error ");
                                                                final Exception obj;
                                                                sb2.append(obj);
                                                                sb2.append(" while closing database ");
                                                                sb2.append(E.k());
                                                                Log.e("Sqflite", sb2.toString());
                                                            }
                                                            catch (Exception ex) {}
                                                        }
                                                    }
                                                }
                                                final Exception ex;
                                                final Exception obj = ex;
                                                continue Label_0193_Outer;
                                            }
                                        }
                                    };
                                    l = E.l;
                                    if (l != null) {
                                        ((q)l).b(k, (Runnable)d);
                                        return;
                                    }
                                    ((Runnable)d).run();
                                    return;
                                    // monitorexit(e)
                                    throw t;
                                }
                                finally {
                                    continue;
                                }
                                break;
                            }
                        }
                        str = "";
                        continue Label_0260_Outer;
                    }
                }
                k = null;
                continue;
            }
        }
    }
    
    public final void F(final j j, final d d) {
        final n5.k n = this.n(j, d);
        if (n == null) {
            return;
        }
        E.l.b(n, new B(j, d, n));
    }
    
    public void G(final j j, final d d) {
        if (E.h == null) {
            E.h = this.a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        d.a(E.h);
    }
    
    public final void H(final j j, final d d) {
        final n5.k n = this.n(j, d);
        if (n == null) {
            return;
        }
        E.l.b(n, new x(j, d, n));
    }
    
    public final void I(final j p0, final d p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "path"
        //     4: invokevirtual   E5/j.a:(Ljava/lang/String;)Ljava/lang/Object;
        //     7: checkcast       Ljava/lang/String;
        //    10: astore          6
        //    12: aload_1        
        //    13: ldc_w           "readOnly"
        //    16: invokevirtual   E5/j.a:(Ljava/lang/String;)Ljava/lang/Object;
        //    19: checkcast       Ljava/lang/Boolean;
        //    22: astore          7
        //    24: aload           6
        //    26: invokestatic    n5/E.o:(Ljava/lang/String;)Z
        //    29: istore          5
        //    31: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //    34: aload_1        
        //    35: ldc_w           "singleInstance"
        //    38: invokevirtual   E5/j.a:(Ljava/lang/String;)Ljava/lang/Object;
        //    41: invokevirtual   java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        //    44: ifne            58
        //    47: iload           5
        //    49: ifne            58
        //    52: iconst_1       
        //    53: istore          4
        //    55: goto            61
        //    58: iconst_0       
        //    59: istore          4
        //    61: iload           4
        //    63: ifeq            396
        //    66: getstatic       n5/E.e:Ljava/lang/Object;
        //    69: astore          8
        //    71: aload           8
        //    73: monitorenter   
        //    74: getstatic       n5/E.g:I
        //    77: invokestatic    n5/t.c:(I)Z
        //    80: ifeq            146
        //    83: new             Ljava/lang/StringBuilder;
        //    86: dup            
        //    87: invokespecial   java/lang/StringBuilder.<init>:()V
        //    90: astore          9
        //    92: aload           9
        //    94: ldc_w           "Look for "
        //    97: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   100: pop            
        //   101: aload           9
        //   103: aload           6
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   108: pop            
        //   109: aload           9
        //   111: ldc_w           " in "
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: pop            
        //   118: aload           9
        //   120: getstatic       n5/E.c:Ljava/util/Map;
        //   123: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   128: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   131: pop            
        //   132: ldc             "Sqflite"
        //   134: aload           9
        //   136: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   139: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   142: pop            
        //   143: goto            146
        //   146: getstatic       n5/E.c:Ljava/util/Map;
        //   149: aload           6
        //   151: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   156: checkcast       Ljava/lang/Integer;
        //   159: astore          10
        //   161: aload           10
        //   163: ifnull          665
        //   166: getstatic       n5/E.d:Ljava/util/Map;
        //   169: aload           10
        //   171: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   176: checkcast       Ln5/k;
        //   179: astore          9
        //   181: aload           9
        //   183: ifnull          665
        //   186: aload           9
        //   188: getfield        n5/k.i:Landroid/database/sqlite/SQLiteDatabase;
        //   191: invokevirtual   android/database/sqlite/SQLiteDatabase.isOpen:()Z
        //   194: ifne            266
        //   197: getstatic       n5/E.g:I
        //   200: invokestatic    n5/t.c:(I)Z
        //   203: ifeq            665
        //   206: new             Ljava/lang/StringBuilder;
        //   209: dup            
        //   210: invokespecial   java/lang/StringBuilder.<init>:()V
        //   213: astore          10
        //   215: aload           10
        //   217: aload           9
        //   219: invokevirtual   n5/k.A:()Ljava/lang/String;
        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   225: pop            
        //   226: aload           10
        //   228: ldc_w           "single instance database of "
        //   231: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   234: pop            
        //   235: aload           10
        //   237: aload           6
        //   239: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   242: pop            
        //   243: aload           10
        //   245: ldc_w           " not opened"
        //   248: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   251: pop            
        //   252: ldc             "Sqflite"
        //   254: aload           10
        //   256: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   259: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   262: pop            
        //   263: goto            665
        //   266: getstatic       n5/E.g:I
        //   269: invokestatic    n5/t.c:(I)Z
        //   272: ifeq            361
        //   275: new             Ljava/lang/StringBuilder;
        //   278: dup            
        //   279: invokespecial   java/lang/StringBuilder.<init>:()V
        //   282: astore          7
        //   284: aload           7
        //   286: aload           9
        //   288: invokevirtual   n5/k.A:()Ljava/lang/String;
        //   291: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   294: pop            
        //   295: aload           7
        //   297: ldc_w           "re-opened single instance "
        //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   303: pop            
        //   304: aload           9
        //   306: invokevirtual   n5/k.F:()Z
        //   309: ifeq            668
        //   312: ldc_w           "(in transaction) "
        //   315: astore_1       
        //   316: goto            319
        //   319: aload           7
        //   321: aload_1        
        //   322: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   325: pop            
        //   326: aload           7
        //   328: aload           10
        //   330: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   333: pop            
        //   334: aload           7
        //   336: ldc             " "
        //   338: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   341: pop            
        //   342: aload           7
        //   344: aload           6
        //   346: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   349: pop            
        //   350: ldc             "Sqflite"
        //   352: aload           7
        //   354: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   357: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   360: pop            
        //   361: aload_2        
        //   362: aload           10
        //   364: invokevirtual   java/lang/Integer.intValue:()I
        //   367: iconst_1       
        //   368: aload           9
        //   370: invokevirtual   n5/k.F:()Z
        //   373: invokestatic    n5/E.x:(IZZ)Ljava/util/Map;
        //   376: invokeinterface E5/k$d.a:(Ljava/lang/Object;)V
        //   381: aload           8
        //   383: monitorexit    
        //   384: return         
        //   385: aload           8
        //   387: monitorexit    
        //   388: goto            396
        //   391: aload           8
        //   393: monitorexit    
        //   394: aload_1        
        //   395: athrow         
        //   396: getstatic       n5/E.e:Ljava/lang/Object;
        //   399: astore          8
        //   401: aload           8
        //   403: monitorenter   
        //   404: getstatic       n5/E.k:I
        //   407: iconst_1       
        //   408: iadd           
        //   409: istore_3       
        //   410: iload_3        
        //   411: putstatic       n5/E.k:I
        //   414: aload           8
        //   416: monitorexit    
        //   417: new             Ln5/k;
        //   420: dup            
        //   421: aload_0        
        //   422: getfield        n5/E.a:Landroid/content/Context;
        //   425: aload           6
        //   427: iload_3        
        //   428: iload           4
        //   430: getstatic       n5/E.g:I
        //   433: invokespecial   n5/k.<init>:(Landroid/content/Context;Ljava/lang/String;IZI)V
        //   436: astore          9
        //   438: aload           8
        //   440: monitorenter   
        //   441: getstatic       n5/E.l:Ln5/q;
        //   444: ifnonnull       535
        //   447: ldc             "Sqflite"
        //   449: getstatic       n5/E.j:I
        //   452: getstatic       n5/E.i:I
        //   455: invokestatic    n5/p.b:(Ljava/lang/String;II)Ln5/q;
        //   458: astore          10
        //   460: aload           10
        //   462: putstatic       n5/E.l:Ln5/q;
        //   465: aload           10
        //   467: invokeinterface n5/q.start:()V
        //   472: aload           9
        //   474: getfield        n5/k.d:I
        //   477: invokestatic    n5/t.b:(I)Z
        //   480: ifeq            535
        //   483: new             Ljava/lang/StringBuilder;
        //   486: dup            
        //   487: invokespecial   java/lang/StringBuilder.<init>:()V
        //   490: astore          10
        //   492: aload           10
        //   494: aload           9
        //   496: invokevirtual   n5/k.A:()Ljava/lang/String;
        //   499: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   502: pop            
        //   503: aload           10
        //   505: ldc_w           "starting worker pool with priority "
        //   508: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   511: pop            
        //   512: aload           10
        //   514: getstatic       n5/E.i:I
        //   517: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   520: pop            
        //   521: ldc             "Sqflite"
        //   523: aload           10
        //   525: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   528: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   531: pop            
        //   532: goto            535
        //   535: aload           9
        //   537: getstatic       n5/E.l:Ln5/q;
        //   540: putfield        n5/k.h:Ln5/q;
        //   543: aload           9
        //   545: getfield        n5/k.d:I
        //   548: invokestatic    n5/t.b:(I)Z
        //   551: ifeq            616
        //   554: new             Ljava/lang/StringBuilder;
        //   557: dup            
        //   558: invokespecial   java/lang/StringBuilder.<init>:()V
        //   561: astore          10
        //   563: aload           10
        //   565: aload           9
        //   567: invokevirtual   n5/k.A:()Ljava/lang/String;
        //   570: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   573: pop            
        //   574: aload           10
        //   576: ldc             "opened "
        //   578: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   581: pop            
        //   582: aload           10
        //   584: iload_3        
        //   585: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   588: pop            
        //   589: aload           10
        //   591: ldc             " "
        //   593: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   596: pop            
        //   597: aload           10
        //   599: aload           6
        //   601: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   604: pop            
        //   605: ldc             "Sqflite"
        //   607: aload           10
        //   609: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   612: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   615: pop            
        //   616: getstatic       n5/E.l:Ln5/q;
        //   619: aload           9
        //   621: new             Ln5/A;
        //   624: dup            
        //   625: iload           5
        //   627: aload           6
        //   629: aload_2        
        //   630: aload           7
        //   632: aload           9
        //   634: aload_1        
        //   635: iload           4
        //   637: iload_3        
        //   638: invokespecial   n5/A.<init>:(ZLjava/lang/String;LE5/k$d;Ljava/lang/Boolean;Ln5/k;LE5/j;ZI)V
        //   641: invokeinterface n5/q.b:(Ln5/k;Ljava/lang/Runnable;)V
        //   646: aload           8
        //   648: monitorexit    
        //   649: return         
        //   650: aload           8
        //   652: monitorexit    
        //   653: aload_1        
        //   654: athrow         
        //   655: astore_1       
        //   656: aload           8
        //   658: monitorexit    
        //   659: aload_1        
        //   660: athrow         
        //   661: astore_1       
        //   662: goto            391
        //   665: goto            385
        //   668: ldc_w           ""
        //   671: astore_1       
        //   672: goto            319
        //   675: astore_1       
        //   676: goto            650
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  74     143    661    396    Any
        //  146    161    661    396    Any
        //  166    181    661    396    Any
        //  186    263    661    396    Any
        //  266    312    661    396    Any
        //  319    361    661    396    Any
        //  361    384    661    396    Any
        //  385    388    661    396    Any
        //  391    394    661    396    Any
        //  404    417    655    661    Any
        //  441    532    675    655    Any
        //  535    616    675    655    Any
        //  616    649    675    655    Any
        //  650    653    675    655    Any
        //  656    659    655    661    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0535:
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
    
    public void J(final j j, final d d) {
        final Object a = j.a("androidThreadPriority");
        if (a != null) {
            E.i = (int)a;
        }
        final Object a2 = j.a("androidThreadCount");
        if (a2 != null && !a2.equals(E.j)) {
            E.j = (int)a2;
            final q l = E.l;
            if (l != null) {
                l.a();
                E.l = null;
            }
        }
        final Integer a3 = t.a(j);
        if (a3 != null) {
            E.g = a3;
        }
        d.a(null);
    }
    
    public final void K(final j j, final d d) {
        final n5.k n = this.n(j, d);
        if (n == null) {
            return;
        }
        E.l.b(n, new y(j, d, n));
    }
    
    public final void L(final j j, final d d) {
        final n5.k n = this.n(j, d);
        if (n == null) {
            return;
        }
        E.l.b(n, new w(j, d, n));
    }
    
    public final void M(final j j, final d d) {
        final n5.k n = this.n(j, d);
        if (n == null) {
            return;
        }
        E.l.b(n, new z(j, n, d));
    }
    
    public final void N(final j j, final d d) {
        final n5.k n = this.n(j, d);
        if (n == null) {
            return;
        }
        E.l.b(n, new C(j, d, n));
    }
    
    public final void l(final n5.k p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        n5/k.d:I
        //     4: invokestatic    n5/t.b:(I)Z
        //     7: ifeq            48
        //    10: new             Ljava/lang/StringBuilder;
        //    13: dup            
        //    14: invokespecial   java/lang/StringBuilder.<init>:()V
        //    17: astore_2       
        //    18: aload_2        
        //    19: aload_1        
        //    20: invokevirtual   n5/k.A:()Ljava/lang/String;
        //    23: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    26: pop            
        //    27: aload_2        
        //    28: ldc_w           "closing database "
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: pop            
        //    35: ldc             "Sqflite"
        //    37: aload_2        
        //    38: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    41: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    44: pop            
        //    45: goto            48
        //    48: aload_1        
        //    49: invokevirtual   n5/k.k:()V
        //    52: goto            103
        //    55: new             Ljava/lang/StringBuilder;
        //    58: dup            
        //    59: invokespecial   java/lang/StringBuilder.<init>:()V
        //    62: astore_2       
        //    63: aload_2        
        //    64: ldc_w           "error "
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: pop            
        //    71: aload_2        
        //    72: aload_3        
        //    73: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    76: pop            
        //    77: aload_2        
        //    78: ldc_w           " while closing database "
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: pop            
        //    85: aload_2        
        //    86: getstatic       n5/E.k:I
        //    89: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    92: pop            
        //    93: ldc             "Sqflite"
        //    95: aload_2        
        //    96: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    99: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   102: pop            
        //   103: getstatic       n5/E.e:Ljava/lang/Object;
        //   106: astore_2       
        //   107: aload_2        
        //   108: monitorenter   
        //   109: getstatic       n5/E.d:Ljava/util/Map;
        //   112: invokeinterface java/util/Map.isEmpty:()Z
        //   117: ifeq            186
        //   120: getstatic       n5/E.l:Ln5/q;
        //   123: ifnull          186
        //   126: aload_1        
        //   127: getfield        n5/k.d:I
        //   130: invokestatic    n5/t.b:(I)Z
        //   133: ifeq            174
        //   136: new             Ljava/lang/StringBuilder;
        //   139: dup            
        //   140: invokespecial   java/lang/StringBuilder.<init>:()V
        //   143: astore_3       
        //   144: aload_3        
        //   145: aload_1        
        //   146: invokevirtual   n5/k.A:()Ljava/lang/String;
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: pop            
        //   153: aload_3        
        //   154: ldc_w           "stopping thread"
        //   157: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   160: pop            
        //   161: ldc             "Sqflite"
        //   163: aload_3        
        //   164: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   167: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   170: pop            
        //   171: goto            174
        //   174: getstatic       n5/E.l:Ln5/q;
        //   177: invokeinterface n5/q.a:()V
        //   182: aconst_null    
        //   183: putstatic       n5/E.l:Ln5/q;
        //   186: aload_2        
        //   187: monitorexit    
        //   188: return         
        //   189: aload_2        
        //   190: monitorexit    
        //   191: aload_1        
        //   192: athrow         
        //   193: astore_3       
        //   194: goto            55
        //   197: astore_1       
        //   198: goto            189
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      45     193    103    Ljava/lang/Exception;
        //  48     52     193    103    Ljava/lang/Exception;
        //  109    171    197    193    Any
        //  174    186    197    193    Any
        //  186    188    197    193    Any
        //  189    191    197    193    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0174:
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
    
    public final n5.k m(final int i) {
        return E.d.get(i);
    }
    
    public final n5.k n(final j j, final d d) {
        final int intValue = (int)j.a("id");
        final n5.k m = this.m(intValue);
        if (m != null) {
            return m;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("database_closed ");
        sb.append(intValue);
        d.b("sqlite_error", sb.toString(), null);
        return null;
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.y(b.a(), b.b());
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        this.a = null;
        this.b.e(null);
        this.b = null;
    }
    
    @Override
    public void onMethodCall(final j j, final d d) {
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1863829223: {
                if (!a.equals("getDatabasesPath")) {
                    break;
                }
                n = 15;
                break;
            }
            case 1385449135: {
                if (!a.equals("getPlatformVersion")) {
                    break;
                }
                n = 14;
                break;
            }
            case 1193546321: {
                if (!a.equals("queryCursorNext")) {
                    break;
                }
                n = 13;
                break;
            }
            case 956410295: {
                if (!a.equals("databaseExists")) {
                    break;
                }
                n = 12;
                break;
            }
            case 107944136: {
                if (!a.equals("query")) {
                    break;
                }
                n = 11;
                break;
            }
            case 95458899: {
                if (!a.equals("debug")) {
                    break;
                }
                n = 10;
                break;
            }
            case 93509434: {
                if (!a.equals("batch")) {
                    break;
                }
                n = 9;
                break;
            }
            case -17190427: {
                if (!a.equals("openDatabase")) {
                    break;
                }
                n = 8;
                break;
            }
            case -198450538: {
                if (!a.equals("debugMode")) {
                    break;
                }
                n = 7;
                break;
            }
            case -263511994: {
                if (!a.equals("deleteDatabase")) {
                    break;
                }
                n = 6;
                break;
            }
            case -396289107: {
                if (!a.equals("androidSetLocale")) {
                    break;
                }
                n = 5;
                break;
            }
            case -838846263: {
                if (!a.equals("update")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1183792455: {
                if (!a.equals("insert")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1249474914: {
                if (!a.equals("options")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1253581933: {
                if (!a.equals("closeDatabase")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1319569547: {
                if (!a.equals("execute")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                d.c();
            }
            case 15: {
                this.G(j, d);
            }
            case 14: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Android ");
                sb.append(Build$VERSION.RELEASE);
                d.a(sb.toString());
            }
            case 13: {
                this.L(j, d);
            }
            case 12: {
                this.B(j, d);
            }
            case 11: {
                this.K(j, d);
            }
            case 10: {
                this.C(j, d);
            }
            case 9: {
                this.z(j, d);
            }
            case 8: {
                this.I(j, d);
            }
            case 7: {
                this.D(j, d);
            }
            case 6: {
                this.E(j, d);
            }
            case 5: {
                this.M(j, d);
            }
            case 4: {
                this.N(j, d);
            }
            case 3: {
                this.H(j, d);
            }
            case 2: {
                this.J(j, d);
            }
            case 1: {
                this.A(j, d);
            }
            case 0: {
                this.F(j, d);
            }
        }
    }
    
    public final void y(final Context a, final E5.c c) {
        this.a = a;
        (this.b = new k(c, "com.tekartik.sqflite", E5.q.b, c.b())).e((k.c)this);
    }
    
    public final void z(final j j, final d d) {
        final n5.k n = this.n(j, d);
        if (n == null) {
            return;
        }
        E.l.b(n, new D(n, j, d));
    }
}
