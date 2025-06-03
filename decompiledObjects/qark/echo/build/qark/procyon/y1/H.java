// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import android.os.BaseBundle;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import G1.h;
import org.json.JSONArray;
import android.content.Context;
import x1.F;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.util.List;
import O1.a;

public final class H
{
    public static final a f;
    public static final String g;
    public static final int h;
    public final O1.a a;
    public final String b;
    public List c;
    public final List d;
    public int e;
    
    static {
        f = new a(null);
        g = H.class.getSimpleName();
        h = 1000;
    }
    
    public H(final O1.a a, final String b) {
        Intrinsics.checkNotNullParameter(a, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(b, "anonymousAppDeviceGUID");
        this.a = a;
        this.b = b;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }
    
    public final void a(final e p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     6: istore_2       
        //     7: iload_2        
        //     8: ifeq            14
        //    11: aload_0        
        //    12: monitorexit    
        //    13: return         
        //    14: aload_1        
        //    15: ldc             "event"
        //    17: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    20: aload_0        
        //    21: getfield        y1/H.c:Ljava/util/List;
        //    24: invokeinterface java/util/List.size:()I
        //    29: aload_0        
        //    30: getfield        y1/H.d:Ljava/util/List;
        //    33: invokeinterface java/util/List.size:()I
        //    38: iadd           
        //    39: getstatic       y1/H.h:I
        //    42: if_icmplt       58
        //    45: aload_0        
        //    46: aload_0        
        //    47: getfield        y1/H.e:I
        //    50: iconst_1       
        //    51: iadd           
        //    52: putfield        y1/H.e:I
        //    55: goto            69
        //    58: aload_0        
        //    59: getfield        y1/H.c:Ljava/util/List;
        //    62: aload_1        
        //    63: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    68: pop            
        //    69: aload_0        
        //    70: monitorexit    
        //    71: return         
        //    72: aload_1        
        //    73: aload_0        
        //    74: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //    77: aload_0        
        //    78: monitorexit    
        //    79: return         
        //    80: astore_1       
        //    81: aload_0        
        //    82: monitorexit    
        //    83: aload_1        
        //    84: athrow         
        //    85: astore_1       
        //    86: goto            72
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      7      80     85     Any
        //  14     55     85     80     Any
        //  58     69     85     80     Any
        //  72     77     80     85     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0014:
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
    
    public final void b(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     6: istore_2       
        //     7: iload_2        
        //     8: ifeq            14
        //    11: aload_0        
        //    12: monitorexit    
        //    13: return         
        //    14: iload_1        
        //    15: ifeq            38
        //    18: aload_0        
        //    19: getfield        y1/H.c:Ljava/util/List;
        //    22: aload_0        
        //    23: getfield        y1/H.d:Ljava/util/List;
        //    26: checkcast       Ljava/util/Collection;
        //    29: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //    34: pop            
        //    35: goto            38
        //    38: aload_0        
        //    39: getfield        y1/H.d:Ljava/util/List;
        //    42: invokeinterface java/util/List.clear:()V
        //    47: aload_0        
        //    48: iconst_0       
        //    49: putfield        y1/H.e:I
        //    52: aload_0        
        //    53: monitorexit    
        //    54: return         
        //    55: aload_3        
        //    56: aload_0        
        //    57: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //    60: aload_0        
        //    61: monitorexit    
        //    62: return         
        //    63: astore_3       
        //    64: aload_0        
        //    65: monitorexit    
        //    66: aload_3        
        //    67: athrow         
        //    68: astore_3       
        //    69: goto            55
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      7      63     68     Any
        //  18     35     68     63     Any
        //  38     52     68     63     Any
        //  55     60     63     68     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
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
    
    public final int c() {
        synchronized (this) {
            if (T1.a.d(this)) {
                return 0;
            }
            try {
                return this.c.size();
            }
            finally {
                final Throwable t;
                T1.a.b(t, this);
                return 0;
            }
        }
    }
    
    public final List d() {
        synchronized (this) {
            if (T1.a.d(this)) {
                return null;
            }
            try {
                final List c = this.c;
                this.c = new ArrayList();
                return c;
            }
            finally {
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
        }
    }
    
    public final int e(final F p0, final Context p1, final boolean p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            9
        //     7: iconst_0       
        //     8: ireturn        
        //     9: aload_1        
        //    10: ldc             "request"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_2        
        //    16: ldc             "applicationContext"
        //    18: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    21: aload_0        
        //    22: monitorenter   
        //    23: aload_0        
        //    24: getfield        y1/H.e:I
        //    27: istore          5
        //    29: getstatic       D1/a.a:LD1/a;
        //    32: astore          7
        //    34: aload_0        
        //    35: getfield        y1/H.c:Ljava/util/List;
        //    38: invokestatic    D1/a.d:(Ljava/util/List;)V
        //    41: aload_0        
        //    42: getfield        y1/H.d:Ljava/util/List;
        //    45: aload_0        
        //    46: getfield        y1/H.c:Ljava/util/List;
        //    49: checkcast       Ljava/util/Collection;
        //    52: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //    57: pop            
        //    58: aload_0        
        //    59: getfield        y1/H.c:Ljava/util/List;
        //    62: invokeinterface java/util/List.clear:()V
        //    67: new             Lorg/json/JSONArray;
        //    70: dup            
        //    71: invokespecial   org/json/JSONArray.<init>:()V
        //    74: astore          7
        //    76: aload_0        
        //    77: getfield        y1/H.d:Ljava/util/List;
        //    80: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    85: astore          8
        //    87: aload           8
        //    89: invokeinterface java/util/Iterator.hasNext:()Z
        //    94: ifeq            167
        //    97: aload           8
        //    99: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   104: checkcast       Ly1/e;
        //   107: astore          9
        //   109: aload           9
        //   111: invokevirtual   y1/e.g:()Z
        //   114: ifeq            146
        //   117: iload_3        
        //   118: ifne            132
        //   121: aload           9
        //   123: invokevirtual   y1/e.h:()Z
        //   126: ifne            87
        //   129: goto            132
        //   132: aload           7
        //   134: aload           9
        //   136: invokevirtual   y1/e.e:()Lorg/json/JSONObject;
        //   139: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   142: pop            
        //   143: goto            87
        //   146: getstatic       O1/P.a:LO1/P;
        //   149: astore          10
        //   151: getstatic       y1/H.g:Ljava/lang/String;
        //   154: ldc             "Event with invalid checksum: "
        //   156: aload           9
        //   158: invokestatic    kotlin/jvm/internal/Intrinsics.i:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   161: invokestatic    O1/P.j0:(Ljava/lang/String;Ljava/lang/String;)V
        //   164: goto            87
        //   167: aload           7
        //   169: invokevirtual   org/json/JSONArray.length:()I
        //   172: istore          6
        //   174: iload           6
        //   176: ifne            187
        //   179: aload_0        
        //   180: monitorexit    
        //   181: iconst_0       
        //   182: ireturn        
        //   183: astore_1       
        //   184: goto            216
        //   187: getstatic       V5/t.a:LV5/t;
        //   190: astore          8
        //   192: aload_0        
        //   193: monitorexit    
        //   194: aload_0        
        //   195: aload_1        
        //   196: aload_2        
        //   197: iload           5
        //   199: aload           7
        //   201: iload           4
        //   203: invokevirtual   y1/H.f:(Lx1/F;Landroid/content/Context;ILorg/json/JSONArray;Z)V
        //   206: aload           7
        //   208: invokevirtual   org/json/JSONArray.length:()I
        //   211: ireturn        
        //   212: aload_0        
        //   213: monitorexit    
        //   214: aload_1        
        //   215: athrow         
        //   216: aload_1        
        //   217: aload_0        
        //   218: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   221: iconst_0       
        //   222: ireturn        
        //   223: astore_1       
        //   224: goto            212
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  9      23     183    187    Any
        //  23     87     223    216    Any
        //  87     117    223    216    Any
        //  121    129    223    216    Any
        //  132    143    223    216    Any
        //  146    164    223    216    Any
        //  167    174    223    216    Any
        //  179    181    183    187    Any
        //  187    192    223    216    Any
        //  192    212    183    187    Any
        //  212    216    183    187    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
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
    
    public final void f(final F f, Context a, final int n, JSONArray string, final boolean b) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            while (true) {
                try {
                    Label_0113: {
                        Label_0069: {
                            try {
                                final h a2 = G1.h.a;
                                final Context context = a = (Context)G1.h.a(G1.h.a.p, this.a, this.b, b, a);
                                if (this.e > 0) {
                                    ((JSONObject)context).put("num_skipped_events", n);
                                    a = context;
                                }
                                break Label_0069;
                            }
                            finally {
                                break Label_0113;
                            }
                            a = (Context)new JSONObject();
                        }
                        f.E((JSONObject)a);
                        final Bundle u = f.u();
                        string = (JSONArray)string.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "events.toString()");
                        ((BaseBundle)u).putString("custom_events", (String)string);
                        f.H(string);
                        f.G(u);
                        return;
                    }
                    T1.a.b((Throwable)f, this);
                    return;
                }
                catch (JSONException ex) {}
                continue;
            }
        }
    }
    
    public static final class a
    {
    }
}
