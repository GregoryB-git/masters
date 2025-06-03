// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.ArrayDeque;
import java.util.Queue;

public final class H
{
    public final Object a;
    public Queue b;
    public boolean c;
    
    public H() {
        this.a = new Object();
    }
    
    public final void a(final G g) {
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(g);
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void b(final j p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        V2/H.a:Ljava/lang/Object;
        //     4: astore_2       
        //     5: aload_2        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        V2/H.b:Ljava/util/Queue;
        //    11: ifnull          83
        //    14: aload_0        
        //    15: getfield        V2/H.c:Z
        //    18: ifeq            24
        //    21: goto            83
        //    24: aload_0        
        //    25: iconst_1       
        //    26: putfield        V2/H.c:Z
        //    29: aload_2        
        //    30: monitorexit    
        //    31: aload_0        
        //    32: getfield        V2/H.a:Ljava/lang/Object;
        //    35: astore_2       
        //    36: aload_2        
        //    37: monitorenter   
        //    38: aload_0        
        //    39: getfield        V2/H.b:Ljava/util/Queue;
        //    42: invokeinterface java/util/Queue.poll:()Ljava/lang/Object;
        //    47: checkcast       LV2/G;
        //    50: astore_3       
        //    51: aload_3        
        //    52: ifnonnull       63
        //    55: aload_0        
        //    56: iconst_0       
        //    57: putfield        V2/H.c:Z
        //    60: aload_2        
        //    61: monitorexit    
        //    62: return         
        //    63: aload_2        
        //    64: monitorexit    
        //    65: aload_3        
        //    66: aload_1        
        //    67: invokeinterface V2/G.c:(LV2/j;)V
        //    72: goto            31
        //    75: aload_2        
        //    76: monitorexit    
        //    77: aload_1        
        //    78: athrow         
        //    79: astore_1       
        //    80: goto            86
        //    83: aload_2        
        //    84: monitorexit    
        //    85: return         
        //    86: aload_2        
        //    87: monitorexit    
        //    88: aload_1        
        //    89: athrow         
        //    90: astore_1       
        //    91: goto            75
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      21     79     90     Any
        //  24     31     79     90     Any
        //  38     51     90     79     Any
        //  55     62     90     79     Any
        //  63     65     90     79     Any
        //  75     77     90     79     Any
        //  83     85     79     90     Any
        //  86     88     79     90     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0063:
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
