// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E;

import android.os.CancellationSignal;

public final class c
{
    public boolean a;
    public b b;
    public Object c;
    public boolean d;
    
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        E/c.a:Z
        //     6: ifeq            12
        //     9: aload_0        
        //    10: monitorexit    
        //    11: return         
        //    12: aload_0        
        //    13: iconst_1       
        //    14: putfield        E/c.a:Z
        //    17: aload_0        
        //    18: iconst_1       
        //    19: putfield        E/c.d:Z
        //    22: aload_0        
        //    23: getfield        E/c.b:LE/c$b;
        //    26: astore_1       
        //    27: aload_0        
        //    28: getfield        E/c.c:Ljava/lang/Object;
        //    31: astore_2       
        //    32: aload_0        
        //    33: monitorexit    
        //    34: aload_1        
        //    35: ifnull          47
        //    38: aload_1        
        //    39: invokeinterface E/c$b.a:()V
        //    44: goto            47
        //    47: aload_2        
        //    48: ifnull          78
        //    51: aload_2        
        //    52: invokestatic    E/c$a.a:(Ljava/lang/Object;)V
        //    55: goto            78
        //    58: aload_0        
        //    59: monitorenter   
        //    60: aload_0        
        //    61: iconst_0       
        //    62: putfield        E/c.d:Z
        //    65: aload_0        
        //    66: invokevirtual   java/lang/Object.notifyAll:()V
        //    69: aload_0        
        //    70: monitorexit    
        //    71: aload_1        
        //    72: athrow         
        //    73: astore_1       
        //    74: aload_0        
        //    75: monitorexit    
        //    76: aload_1        
        //    77: athrow         
        //    78: aload_0        
        //    79: monitorenter   
        //    80: aload_0        
        //    81: iconst_0       
        //    82: putfield        E/c.d:Z
        //    85: aload_0        
        //    86: invokevirtual   java/lang/Object.notifyAll:()V
        //    89: aload_0        
        //    90: monitorexit    
        //    91: return         
        //    92: astore_1       
        //    93: aload_0        
        //    94: monitorexit    
        //    95: aload_1        
        //    96: athrow         
        //    97: aload_0        
        //    98: monitorexit    
        //    99: aload_1        
        //   100: athrow         
        //   101: astore_1       
        //   102: goto            97
        //   105: astore_1       
        //   106: goto            58
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      11     101    105    Any
        //  12     34     101    105    Any
        //  38     44     105    78     Any
        //  51     55     105    78     Any
        //  60     71     73     78     Any
        //  74     76     73     78     Any
        //  80     91     92     97     Any
        //  93     95     92     97     Any
        //  97     99     101    105    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0047:
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
    
    public boolean b() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public void c(final b b) {
        // monitorenter(this)
        while (true) {
            try {
                this.d();
                if (this.b == b) {
                    // monitorexit(this)
                    return;
                }
                this.b = b;
                if (this.a && b != null) {
                    // monitorexit(this)
                    b.a();
                    return;
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
    
    public final void d() {
        while (true) {
            if (!this.d) {
                return;
            }
            try {
                this.wait();
                continue;
            }
            catch (InterruptedException ex) {}
        }
    }
    
    public abstract static class a
    {
        public static void a(final Object o) {
            ((CancellationSignal)o).cancel();
        }
        
        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }
    
    public interface b
    {
        void a();
    }
}
