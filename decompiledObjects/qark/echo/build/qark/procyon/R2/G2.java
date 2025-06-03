// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.concurrent.atomic.AtomicReference;
import E2.e;
import android.content.Context;
import A2.n;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class G2 extends l3
{
    public static final AtomicLong l;
    public K2 c;
    public K2 d;
    public final PriorityBlockingQueue e;
    public final BlockingQueue f;
    public final Thread.UncaughtExceptionHandler g;
    public final Thread.UncaughtExceptionHandler h;
    public final Object i;
    public final Semaphore j;
    public volatile boolean k;
    
    static {
        l = new AtomicLong(Long.MIN_VALUE);
    }
    
    public G2(final N2 n2) {
        super(n2);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new J2(this, "Thread death: Uncaught exception on worker thread");
        this.h = new J2(this, "Thread death: Uncaught exception on network thread");
    }
    
    public final Future B(final Callable callable) {
        this.o();
        n.i(callable);
        final L2 l2 = new L2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            l2.run();
            return l2;
        }
        this.y(l2);
        return l2;
    }
    
    public final void D(final Runnable runnable) {
        this.o();
        n.i(runnable);
        this.y(new L2(this, runnable, false, "Task exception on worker thread"));
    }
    
    public final void G(final Runnable runnable) {
        this.o();
        n.i(runnable);
        this.y(new L2(this, runnable, true, "Task exception on worker thread"));
    }
    
    public final boolean J() {
        return Thread.currentThread() == this.c;
    }
    
    @Override
    public final void l() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }
    
    @Override
    public final void n() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }
    
    @Override
    public final boolean s() {
        return false;
    }
    
    public final Object v(final AtomicReference p0, final long p1, final String p2, final Runnable p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: invokevirtual   R2/m3.e:()LR2/G2;
        //     6: aload           5
        //     8: invokevirtual   R2/G2.D:(Ljava/lang/Runnable;)V
        //    11: aload_1        
        //    12: lload_2        
        //    13: invokevirtual   java/lang/Object.wait:(J)V
        //    16: aload_1        
        //    17: monitorexit    
        //    18: aload_1        
        //    19: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    22: astore_1       
        //    23: aload_1        
        //    24: ifnonnull       65
        //    27: aload_0        
        //    28: invokevirtual   R2/m3.j:()LR2/Y1;
        //    31: invokevirtual   R2/Y1.L:()LR2/a2;
        //    34: astore          5
        //    36: new             Ljava/lang/StringBuilder;
        //    39: dup            
        //    40: ldc             "Timed out waiting for "
        //    42: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    45: astore          6
        //    47: aload           6
        //    49: aload           4
        //    51: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    54: pop            
        //    55: aload           5
        //    57: aload           6
        //    59: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    62: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //    65: aload_1        
        //    66: areturn        
        //    67: astore          4
        //    69: goto            114
        //    72: aload_0        
        //    73: invokevirtual   R2/m3.j:()LR2/Y1;
        //    76: invokevirtual   R2/Y1.L:()LR2/a2;
        //    79: astore          5
        //    81: new             Ljava/lang/StringBuilder;
        //    84: dup            
        //    85: ldc             "Interrupted waiting for "
        //    87: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    90: astore          6
        //    92: aload           6
        //    94: aload           4
        //    96: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    99: pop            
        //   100: aload           5
        //   102: aload           6
        //   104: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   107: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //   110: aload_1        
        //   111: monitorexit    
        //   112: aconst_null    
        //   113: areturn        
        //   114: aload_1        
        //   115: monitorexit    
        //   116: aload           4
        //   118: athrow         
        //   119: astore          5
        //   121: goto            72
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      11     67     119    Any
        //  11     16     119    114    Ljava/lang/InterruptedException;
        //  11     16     67     119    Any
        //  16     18     67     119    Any
        //  72     112    67     119    Any
        //  114    116    67     119    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    public final Future w(final Callable callable) {
        this.o();
        n.i(callable);
        final L2 l2 = new L2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                this.j().L().a("Callable skipped the worker queue.");
            }
            l2.run();
            return l2;
        }
        this.y(l2);
        return l2;
    }
    
    public final void y(final L2 e) {
        final Object i = this.i;
        // monitorenter(i)
        while (true) {
            try {
                this.e.add(e);
                final K2 c = this.c;
                if (c == null) {
                    (this.c = new K2(this, "Measurement Worker", this.e)).setUncaughtExceptionHandler(this.g);
                    this.c.start();
                }
                else {
                    c.a();
                }
                // monitorexit(i)
                return;
                // monitorexit(i)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void z(Runnable i) {
        this.o();
        n.i(i);
        final L2 l2 = new L2(this, i, false, "Task exception on network thread");
        i = (Runnable)this.i;
        // monitorenter(i)
        while (true) {
            try {
                this.f.add(l2);
                final K2 d = this.d;
                if (d == null) {
                    (this.d = new K2(this, "Measurement Network", this.f)).setUncaughtExceptionHandler(this.h);
                    this.d.start();
                }
                else {
                    d.a();
                }
                // monitorexit(i)
                return;
                // monitorexit(i)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
