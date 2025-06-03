// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import android.os.Looper;
import V2.b;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import V2.j;
import V2.k;
import java.util.concurrent.ExecutorService;

public abstract class c0
{
    public static final ExecutorService a;
    
    static {
        a = A.c("awaitEvenIfOnMainThread task continuation executor");
    }
    
    public static Object f(final j j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        j.g(c0.a, new X(countDownLatch));
        long timeout;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            timeout = 3L;
        }
        else {
            timeout = 4L;
        }
        countDownLatch.await(timeout, TimeUnit.SECONDS);
        if (j.n()) {
            return j.j();
        }
        if (j.l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (j.m()) {
            throw new IllegalStateException(j.i());
        }
        throw new TimeoutException();
    }
    
    public static boolean g(final CountDownLatch p0, final long p1, final TimeUnit p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          6
        //     3: iconst_0       
        //     4: istore          5
        //     6: iload           6
        //     8: istore          4
        //    10: aload_3        
        //    11: lload_1        
        //    12: invokevirtual   java/util/concurrent/TimeUnit.toNanos:(J)J
        //    15: lstore          7
        //    17: iload           6
        //    19: istore          4
        //    21: invokestatic    java/lang/System.nanoTime:()J
        //    24: lstore          9
        //    26: lload           7
        //    28: lstore_1       
        //    29: iload           5
        //    31: istore          4
        //    33: aload_0        
        //    34: lload_1        
        //    35: getstatic       java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
        //    38: invokevirtual   java/util/concurrent/CountDownLatch.await:(JLjava/util/concurrent/TimeUnit;)Z
        //    41: istore          11
        //    43: iload           5
        //    45: ifeq            54
        //    48: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    51: invokevirtual   java/lang/Thread.interrupt:()V
        //    54: iload           11
        //    56: ireturn        
        //    57: astore_0       
        //    58: goto            82
        //    61: iconst_1       
        //    62: istore          4
        //    64: iconst_1       
        //    65: istore          5
        //    67: invokestatic    java/lang/System.nanoTime:()J
        //    70: lstore_1       
        //    71: lload           9
        //    73: lload           7
        //    75: ladd           
        //    76: lload_1        
        //    77: lsub           
        //    78: lstore_1       
        //    79: goto            29
        //    82: iload           4
        //    84: ifeq            93
        //    87: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    90: invokevirtual   java/lang/Thread.interrupt:()V
        //    93: aload_0        
        //    94: athrow         
        //    95: astore_3       
        //    96: goto            61
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  10     17     57     95     Any
        //  21     26     57     95     Any
        //  33     43     95     82     Ljava/lang/InterruptedException;
        //  33     43     57     95     Any
        //  67     71     57     95     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0054:
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
    
    public static j h(final Executor executor, final Callable callable) {
        final k k = new k();
        executor.execute(new Y(callable, executor, k));
        return k.a();
    }
    
    public static j n(final j j, final j i) {
        final k k = new k();
        final a0 a0 = new a0(k);
        j.f(a0);
        i.f(a0);
        return k.a();
    }
    
    public static j o(final Executor executor, final j j, final j i) {
        final k k = new k();
        final Z z = new Z(k);
        j.g(executor, z);
        i.g(executor, z);
        return k.a();
    }
}
