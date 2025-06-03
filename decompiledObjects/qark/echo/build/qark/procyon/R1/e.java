// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R1;

import kotlin.jvm.internal.Intrinsics;
import java.util.Iterator;
import java.io.File;
import x1.F;
import W5.B;
import l6.d;
import org.json.JSONArray;
import java.util.Comparator;
import W5.m;
import java.util.ArrayList;
import Q1.k;
import O1.P;
import T1.a;
import x1.K;
import java.util.List;
import Q1.c;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e
{
    public static final e a;
    public static final AtomicBoolean b;
    
    static {
        a = new e();
        b = new AtomicBoolean(false);
    }
    
    public static final void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: ldc             LR1/e;.class
        //     5: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     8: istore_0       
        //     9: iload_0        
        //    10: ifeq            17
        //    13: ldc             LR1/e;.class
        //    15: monitorexit    
        //    16: return         
        //    17: getstatic       R1/e.b:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    20: iconst_1       
        //    21: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.getAndSet:(Z)Z
        //    24: istore_0       
        //    25: iload_0        
        //    26: ifeq            33
        //    29: ldc             LR1/e;.class
        //    31: monitorexit    
        //    32: return         
        //    33: invokestatic    x1/B.p:()Z
        //    36: ifeq            45
        //    39: invokestatic    R1/e.d:()V
        //    42: goto            45
        //    45: invokestatic    R1/b.d:()V
        //    48: ldc             LR1/e;.class
        //    50: monitorexit    
        //    51: return         
        //    52: aload_1        
        //    53: ldc             LR1/e;.class
        //    55: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //    58: ldc             LR1/e;.class
        //    60: monitorexit    
        //    61: return         
        //    62: astore_1       
        //    63: ldc             LR1/e;.class
        //    65: monitorexit    
        //    66: aload_1        
        //    67: athrow         
        //    68: astore_1       
        //    69: goto            52
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  3      9      62     68     Any
        //  17     25     68     62     Any
        //  33     42     68     62     Any
        //  45     48     68     62     Any
        //  52     58     62     68     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0017:
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
    
    public static final void d() {
        if (T1.a.d(e.class)) {
            return;
        }
        while (true) {
            try {
                if (P.Z()) {
                    return;
                }
                final File[] l = k.l();
                final ArrayList list = new ArrayList<Object>(l.length);
                for (int length = l.length, i = 0; i < length; ++i) {
                    list.add(c.a.d(l[i]));
                }
                final ArrayList<c> list2 = new ArrayList<c>();
                for (final c next : list) {
                    if (next.f()) {
                        list2.add(next);
                    }
                }
                final List e = m.E(list2, new R1.c());
                final JSONArray jsonArray = new JSONArray();
                final Iterator<Object> iterator2 = d.g(0, Math.min(e.size(), 5)).iterator();
                while (iterator2.hasNext()) {
                    jsonArray.put(e.get(((B)iterator2).b()));
                }
                final k a = k.a;
                k.s("anr_reports", jsonArray, new R1.d(e));
                return;
                final Throwable t;
                T1.a.b(t, e.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final int e(final c c, final c c2) {
        if (T1.a.d(e.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullExpressionValue(c2, "o2");
            return c.b(c2);
        }
        finally {
            final Throwable t;
            T1.a.b(t, e.class);
            return 0;
        }
    }
    
    public static final void f(final List p0, final K p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     5: ifeq            9
        //     8: return         
        //     9: aload_0        
        //    10: ldc             "$validReports"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_1        
        //    16: ldc             "response"
        //    18: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    21: aload_1        
        //    22: invokevirtual   x1/K.b:()Lx1/r;
        //    25: ifnonnull       100
        //    28: aload_1        
        //    29: invokevirtual   x1/K.d:()Lorg/json/JSONObject;
        //    32: astore_1       
        //    33: aload_1        
        //    34: ifnonnull       42
        //    37: aconst_null    
        //    38: astore_1       
        //    39: goto            52
        //    42: aload_1        
        //    43: ldc             "success"
        //    45: invokevirtual   org/json/JSONObject.getBoolean:(Ljava/lang/String;)Z
        //    48: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    51: astore_1       
        //    52: aload_1        
        //    53: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //    56: invokestatic    kotlin/jvm/internal/Intrinsics.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    59: ifeq            100
        //    62: aload_0        
        //    63: checkcast       Ljava/lang/Iterable;
        //    66: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    71: astore_0       
        //    72: aload_0        
        //    73: invokeinterface java/util/Iterator.hasNext:()Z
        //    78: ifeq            100
        //    81: aload_0        
        //    82: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    87: checkcast       LQ1/c;
        //    90: invokevirtual   Q1/c.a:()V
        //    93: goto            72
        //    96: astore_0       
        //    97: goto            101
        //   100: return         
        //   101: aload_0        
        //   102: ldc             LR1/e;.class
        //   104: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   107: return         
        //   108: astore_0       
        //   109: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  9      21     96     100    Any
        //  21     33     108    110    Lorg/json/JSONException;
        //  21     33     96     100    Any
        //  42     52     108    110    Lorg/json/JSONException;
        //  42     52     96     100    Any
        //  52     72     108    110    Lorg/json/JSONException;
        //  52     72     96     100    Any
        //  72     93     108    110    Lorg/json/JSONException;
        //  72     93     96     100    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
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
}
