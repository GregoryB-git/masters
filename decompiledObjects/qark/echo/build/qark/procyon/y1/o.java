// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import G1.g;
import kotlin.jvm.internal.Intrinsics;

public final class o
{
    public static final o a;
    public static final String b;
    
    static {
        a = new o();
        b = o.class.getName();
    }
    
    public static final void a(final a a, final H h) {
        synchronized (o.class) {
            if (T1.a.d(o.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(a, "accessTokenAppIdPair");
                Intrinsics.checkNotNullParameter(h, "appEvents");
                g.b();
                final G a2 = y1.g.a();
                a2.a(a, h.d());
                y1.g.b(a2);
            }
            finally {
                final Throwable t;
                T1.a.b(t, o.class);
            }
        }
    }
    
    public static final void b(final f p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: ldc             Ly1/o;.class
        //     5: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     8: istore_1       
        //     9: iload_1        
        //    10: ifeq            17
        //    13: ldc             Ly1/o;.class
        //    15: monitorexit    
        //    16: return         
        //    17: aload_0        
        //    18: ldc             "eventsToPersist"
        //    20: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    23: invokestatic    G1/g.b:()V
        //    26: invokestatic    y1/g.a:()Ly1/G;
        //    29: astore_2       
        //    30: aload_0        
        //    31: invokevirtual   y1/f.f:()Ljava/util/Set;
        //    34: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    39: astore_3       
        //    40: aload_3        
        //    41: invokeinterface java/util/Iterator.hasNext:()Z
        //    46: ifeq            100
        //    49: aload_3        
        //    50: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    55: checkcast       Ly1/a;
        //    58: astore          4
        //    60: aload_0        
        //    61: aload           4
        //    63: invokevirtual   y1/f.c:(Ly1/a;)Ly1/H;
        //    66: astore          5
        //    68: aload           5
        //    70: ifnull          87
        //    73: aload_2        
        //    74: aload           4
        //    76: aload           5
        //    78: invokevirtual   y1/H.d:()Ljava/util/List;
        //    81: invokevirtual   y1/G.a:(Ly1/a;Ljava/util/List;)V
        //    84: goto            40
        //    87: new             Ljava/lang/IllegalStateException;
        //    90: dup            
        //    91: ldc             "Required value was null."
        //    93: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    96: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    99: athrow         
        //   100: aload_2        
        //   101: invokestatic    y1/g.b:(Ly1/G;)V
        //   104: ldc             Ly1/o;.class
        //   106: monitorexit    
        //   107: return         
        //   108: aload_0        
        //   109: ldc             Ly1/o;.class
        //   111: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   114: ldc             Ly1/o;.class
        //   116: monitorexit    
        //   117: return         
        //   118: astore_0       
        //   119: ldc             Ly1/o;.class
        //   121: monitorexit    
        //   122: aload_0        
        //   123: athrow         
        //   124: astore_0       
        //   125: goto            108
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  3      9      118    124    Any
        //  17     40     124    118    Any
        //  40     68     124    118    Any
        //  73     84     124    118    Any
        //  87     100    124    118    Any
        //  100    104    124    118    Any
        //  108    114    118    124    Any
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
}
