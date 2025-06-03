// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.database.Cursor;
import java.util.Map;
import java.util.HashMap;
import android.content.ContentResolver;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import android.net.Uri;

public abstract class t2
{
    public static final Uri a;
    public static final Uri b;
    public static final Pattern c;
    public static final Pattern d;
    public static final AtomicBoolean e;
    public static ContentResolver f;
    public static HashMap g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static Object l;
    public static boolean m;
    public static String[] n;
    
    static {
        a = Uri.parse("content://com.google.android.gsf.gservices");
        b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        e = new AtomicBoolean();
        t2.f = null;
        h = new HashMap(16, 1.0f);
        i = new HashMap(16, 1.0f);
        j = new HashMap(16, 1.0f);
        k = new HashMap(16, 1.0f);
        t2.n = new String[0];
    }
    
    public static String a(final ContentResolver p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       com/google/android/gms/internal/measurement/t2.g:Ljava/util/HashMap;
        //     6: astore          6
        //     8: iconst_0       
        //     9: istore_3       
        //    10: aconst_null    
        //    11: astore_2       
        //    12: aconst_null    
        //    13: astore          5
        //    15: aload           6
        //    17: ifnonnull       73
        //    20: getstatic       com/google/android/gms/internal/measurement/t2.e:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    23: iconst_0       
        //    24: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //    27: new             Ljava/util/HashMap;
        //    30: dup            
        //    31: bipush          16
        //    33: fconst_1       
        //    34: invokespecial   java/util/HashMap.<init>:(IF)V
        //    37: putstatic       com/google/android/gms/internal/measurement/t2.g:Ljava/util/HashMap;
        //    40: new             Ljava/lang/Object;
        //    43: dup            
        //    44: invokespecial   java/lang/Object.<init>:()V
        //    47: putstatic       com/google/android/gms/internal/measurement/t2.l:Ljava/lang/Object;
        //    50: iconst_0       
        //    51: putstatic       com/google/android/gms/internal/measurement/t2.m:Z
        //    54: aload_0        
        //    55: getstatic       com/google/android/gms/internal/measurement/t2.a:Landroid/net/Uri;
        //    58: iconst_1       
        //    59: new             Lcom/google/android/gms/internal/measurement/w2;
        //    62: dup            
        //    63: aconst_null    
        //    64: invokespecial   com/google/android/gms/internal/measurement/w2.<init>:(Landroid/os/Handler;)V
        //    67: invokevirtual   android/content/ContentResolver.registerContentObserver:(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V
        //    70: goto            127
        //    73: getstatic       com/google/android/gms/internal/measurement/t2.e:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    76: iconst_0       
        //    77: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.getAndSet:(Z)Z
        //    80: ifeq            127
        //    83: getstatic       com/google/android/gms/internal/measurement/t2.g:Ljava/util/HashMap;
        //    86: invokevirtual   java/util/HashMap.clear:()V
        //    89: getstatic       com/google/android/gms/internal/measurement/t2.h:Ljava/util/HashMap;
        //    92: invokevirtual   java/util/HashMap.clear:()V
        //    95: getstatic       com/google/android/gms/internal/measurement/t2.i:Ljava/util/HashMap;
        //    98: invokevirtual   java/util/HashMap.clear:()V
        //   101: getstatic       com/google/android/gms/internal/measurement/t2.j:Ljava/util/HashMap;
        //   104: invokevirtual   java/util/HashMap.clear:()V
        //   107: getstatic       com/google/android/gms/internal/measurement/t2.k:Ljava/util/HashMap;
        //   110: invokevirtual   java/util/HashMap.clear:()V
        //   113: new             Ljava/lang/Object;
        //   116: dup            
        //   117: invokespecial   java/lang/Object.<init>:()V
        //   120: putstatic       com/google/android/gms/internal/measurement/t2.l:Ljava/lang/Object;
        //   123: iconst_0       
        //   124: putstatic       com/google/android/gms/internal/measurement/t2.m:Z
        //   127: getstatic       com/google/android/gms/internal/measurement/t2.l:Ljava/lang/Object;
        //   130: astore          6
        //   132: getstatic       com/google/android/gms/internal/measurement/t2.g:Ljava/util/HashMap;
        //   135: aload_1        
        //   136: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   139: ifeq            167
        //   142: getstatic       com/google/android/gms/internal/measurement/t2.g:Ljava/util/HashMap;
        //   145: aload_1        
        //   146: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   149: checkcast       Ljava/lang/String;
        //   152: astore_1       
        //   153: aload           5
        //   155: astore_0       
        //   156: aload_1        
        //   157: ifnull          162
        //   160: aload_1        
        //   161: astore_0       
        //   162: ldc             Lcom/google/android/gms/internal/measurement/t2;.class
        //   164: monitorexit    
        //   165: aload_0        
        //   166: areturn        
        //   167: getstatic       com/google/android/gms/internal/measurement/t2.n:[Ljava/lang/String;
        //   170: astore          5
        //   172: aload           5
        //   174: arraylength    
        //   175: istore          4
        //   177: iload_3        
        //   178: iload           4
        //   180: if_icmpge       364
        //   183: aload_1        
        //   184: aload           5
        //   186: iload_3        
        //   187: aaload         
        //   188: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   191: ifeq            494
        //   194: getstatic       com/google/android/gms/internal/measurement/t2.m:Z
        //   197: ifne            359
        //   200: aload_0        
        //   201: getstatic       com/google/android/gms/internal/measurement/t2.n:[Ljava/lang/String;
        //   204: new             Lcom/google/android/gms/internal/measurement/v2;
        //   207: dup            
        //   208: invokespecial   com/google/android/gms/internal/measurement/v2.<init>:()V
        //   211: invokestatic    com/google/android/gms/internal/measurement/t2.b:(Landroid/content/ContentResolver;[Ljava/lang/String;Lcom/google/android/gms/internal/measurement/t2$a;)Ljava/util/Map;
        //   214: checkcast       Ljava/util/HashMap;
        //   217: astore_0       
        //   218: aload_0        
        //   219: ifnull          325
        //   222: aload_0        
        //   223: invokevirtual   java/util/HashMap.isEmpty:()Z
        //   226: ifne            291
        //   229: aload_0        
        //   230: invokevirtual   java/util/HashMap.keySet:()Ljava/util/Set;
        //   233: astore          5
        //   235: aload           5
        //   237: getstatic       com/google/android/gms/internal/measurement/t2.h:Ljava/util/HashMap;
        //   240: invokevirtual   java/util/HashMap.keySet:()Ljava/util/Set;
        //   243: invokeinterface java/util/Set.removeAll:(Ljava/util/Collection;)Z
        //   248: pop            
        //   249: aload           5
        //   251: getstatic       com/google/android/gms/internal/measurement/t2.i:Ljava/util/HashMap;
        //   254: invokevirtual   java/util/HashMap.keySet:()Ljava/util/Set;
        //   257: invokeinterface java/util/Set.removeAll:(Ljava/util/Collection;)Z
        //   262: pop            
        //   263: aload           5
        //   265: getstatic       com/google/android/gms/internal/measurement/t2.j:Ljava/util/HashMap;
        //   268: invokevirtual   java/util/HashMap.keySet:()Ljava/util/Set;
        //   271: invokeinterface java/util/Set.removeAll:(Ljava/util/Collection;)Z
        //   276: pop            
        //   277: aload           5
        //   279: getstatic       com/google/android/gms/internal/measurement/t2.k:Ljava/util/HashMap;
        //   282: invokevirtual   java/util/HashMap.keySet:()Ljava/util/Set;
        //   285: invokeinterface java/util/Set.removeAll:(Ljava/util/Collection;)Z
        //   290: pop            
        //   291: aload_0        
        //   292: invokevirtual   java/util/HashMap.isEmpty:()Z
        //   295: ifne            321
        //   298: getstatic       com/google/android/gms/internal/measurement/t2.g:Ljava/util/HashMap;
        //   301: invokevirtual   java/util/HashMap.isEmpty:()Z
        //   304: ifeq            314
        //   307: aload_0        
        //   308: putstatic       com/google/android/gms/internal/measurement/t2.g:Ljava/util/HashMap;
        //   311: goto            321
        //   314: getstatic       com/google/android/gms/internal/measurement/t2.g:Ljava/util/HashMap;
        //   317: aload_0        
        //   318: invokevirtual   java/util/HashMap.putAll:(Ljava/util/Map;)V
        //   321: iconst_1       
        //   322: putstatic       com/google/android/gms/internal/measurement/t2.m:Z
        //   325: getstatic       com/google/android/gms/internal/measurement/t2.g:Ljava/util/HashMap;
        //   328: aload_1        
        //   329: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   332: ifeq            359
        //   335: getstatic       com/google/android/gms/internal/measurement/t2.g:Ljava/util/HashMap;
        //   338: aload_1        
        //   339: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   342: checkcast       Ljava/lang/String;
        //   345: astore_1       
        //   346: aload_2        
        //   347: astore_0       
        //   348: aload_1        
        //   349: ifnull          354
        //   352: aload_1        
        //   353: astore_0       
        //   354: ldc             Lcom/google/android/gms/internal/measurement/t2;.class
        //   356: monitorexit    
        //   357: aload_0        
        //   358: areturn        
        //   359: ldc             Lcom/google/android/gms/internal/measurement/t2;.class
        //   361: monitorexit    
        //   362: aconst_null    
        //   363: areturn        
        //   364: ldc             Lcom/google/android/gms/internal/measurement/t2;.class
        //   366: monitorexit    
        //   367: aload_0        
        //   368: getstatic       com/google/android/gms/internal/measurement/t2.a:Landroid/net/Uri;
        //   371: aconst_null    
        //   372: aconst_null    
        //   373: iconst_1       
        //   374: anewarray       Ljava/lang/String;
        //   377: dup            
        //   378: iconst_0       
        //   379: aload_1        
        //   380: aastore        
        //   381: aconst_null    
        //   382: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   385: astore_0       
        //   386: aload_0        
        //   387: ifnonnull       402
        //   390: aload_0        
        //   391: ifnull          400
        //   394: aload_0        
        //   395: invokeinterface android/database/Cursor.close:()V
        //   400: aconst_null    
        //   401: areturn        
        //   402: aload_0        
        //   403: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   408: ifne            430
        //   411: aload           6
        //   413: aload_1        
        //   414: aconst_null    
        //   415: invokestatic    com/google/android/gms/internal/measurement/t2.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
        //   418: aload_0        
        //   419: invokeinterface android/database/Cursor.close:()V
        //   424: aconst_null    
        //   425: areturn        
        //   426: astore_1       
        //   427: goto            477
        //   430: aload_0        
        //   431: iconst_1       
        //   432: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   437: astore_2       
        //   438: aload_0        
        //   439: invokeinterface android/database/Cursor.close:()V
        //   444: aload_2        
        //   445: astore_0       
        //   446: aload_2        
        //   447: ifnull          462
        //   450: aload_2        
        //   451: astore_0       
        //   452: aload_2        
        //   453: aconst_null    
        //   454: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   457: ifeq            462
        //   460: aconst_null    
        //   461: astore_0       
        //   462: aload           6
        //   464: aload_1        
        //   465: aload_0        
        //   466: invokestatic    com/google/android/gms/internal/measurement/t2.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
        //   469: aload_0        
        //   470: ifnull          475
        //   473: aload_0        
        //   474: areturn        
        //   475: aconst_null    
        //   476: areturn        
        //   477: aload_0        
        //   478: invokeinterface android/database/Cursor.close:()V
        //   483: aload_1        
        //   484: athrow         
        //   485: ldc             Lcom/google/android/gms/internal/measurement/t2;.class
        //   487: monitorexit    
        //   488: aload_0        
        //   489: athrow         
        //   490: astore_0       
        //   491: goto            485
        //   494: iload_3        
        //   495: iconst_1       
        //   496: iadd           
        //   497: istore_3       
        //   498: goto            177
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  3      8      490    494    Any
        //  20     70     490    494    Any
        //  73     127    490    494    Any
        //  127    153    490    494    Any
        //  162    165    490    494    Any
        //  167    177    490    494    Any
        //  183    218    490    494    Any
        //  222    291    490    494    Any
        //  291    311    490    494    Any
        //  314    321    490    494    Any
        //  321    325    490    494    Any
        //  325    346    490    494    Any
        //  354    357    490    494    Any
        //  359    362    490    494    Any
        //  364    367    490    494    Any
        //  402    418    426    430    Any
        //  430    438    426    430    Any
        //  485    488    490    494    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
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
    
    public static Map b(ContentResolver query, final String[] array, final a a) {
        query = (ContentResolver)query.query(t2.b, (String[])null, (String)null, array, (String)null);
        if (query == null) {
            return null;
        }
        final Map e = a.e(((Cursor)query).getCount());
        Label_0076: {
            try {
                while (((Cursor)query).moveToNext()) {
                    e.put(((Cursor)query).getString(0), ((Cursor)query).getString(1));
                }
            }
            finally {
                break Label_0076;
            }
            ((Cursor)query).close();
            return;
        }
        ((Cursor)query).close();
    }
    
    public static void d(final Object o, final String key, final String value) {
        // monitorenter(t2.class)
        while (true) {
            try {
                if (o == t2.l) {
                    t2.g.put(key, value);
                }
                // monitorexit(t2.class)
                return;
                // monitorexit(t2.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public interface a
    {
        Map e(final int p0);
    }
}
