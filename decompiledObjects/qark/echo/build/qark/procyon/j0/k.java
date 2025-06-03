// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j0;

import g0.a;
import java.util.ArrayDeque;

public abstract class k implements g
{
    public final Thread a;
    public final Object b;
    public final ArrayDeque c;
    public final ArrayDeque d;
    public final i[] e;
    public final j[] f;
    public int g;
    public int h;
    public i i;
    public h j;
    public boolean k;
    public boolean l;
    public int m;
    public long n;
    
    public k(final i[] e, final j[] f) {
        this.b = new Object();
        this.n = -9223372036854775807L;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = e;
        this.g = e.length;
        final int n = 0;
        for (int i = 0; i < this.g; ++i) {
            this.e[i] = this.i();
        }
        this.f = f;
        this.h = f.length;
        for (int j = n; j < this.h; ++j) {
            this.f[j] = this.j();
        }
        (this.a = new Thread("ExoPlayer:SimpleDecoder") {
            @Override
            public void run() {
                j0.k.this.v();
            }
        }).start();
    }
    
    public final void b(final i e) {
        while (true) {
            while (true) {
                synchronized (this.b) {
                    this.r();
                    if (e == this.i) {
                        final boolean b = true;
                        g0.a.a(b);
                        this.c.addLast(e);
                        this.q();
                        this.i = null;
                        return;
                    }
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    @Override
    public final void c(final long n) {
        while (true) {
            final Object b = this.b;
            // monitorenter(b)
            while (true) {
                Label_0060: {
                    while (true) {
                        try {
                            if (this.g != this.e.length && !this.k) {
                                final boolean b2 = false;
                                g0.a.f(b2);
                                this.n = n;
                                // monitorexit(b)
                                return;
                            }
                            break Label_0060;
                        }
                        // monitorexit(b)
                        finally {}
                        continue;
                    }
                }
                final boolean b2 = true;
                continue;
            }
        }
    }
    
    @Override
    public final void flush() {
        final Object b = this.b;
        // monitorenter(b)
        while (true) {
            try {
                this.k = true;
                this.m = 0;
                final i i = this.i;
                if (i != null) {
                    this.s(i);
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    this.s(this.c.removeFirst());
                }
                while (!this.d.isEmpty()) {
                    this.d.removeFirst().x();
                }
                // monitorexit(b)
                return;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean h() {
        return !this.c.isEmpty() && this.h > 0;
    }
    
    public abstract i i();
    
    public abstract j j();
    
    public abstract h k(final Throwable p0);
    
    public abstract h l(final i p0, final j p1, final boolean p2);
    
    public final boolean m() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        j0/k.b:Ljava/lang/Object;
        //     4: astore_3       
        //     5: aload_3        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        j0/k.l:Z
        //    11: ifne            31
        //    14: aload_0        
        //    15: invokevirtual   j0/k.h:()Z
        //    18: ifne            31
        //    21: aload_0        
        //    22: getfield        j0/k.b:Ljava/lang/Object;
        //    25: invokevirtual   java/lang/Object.wait:()V
        //    28: goto            7
        //    31: aload_0        
        //    32: getfield        j0/k.l:Z
        //    35: ifeq            42
        //    38: aload_3        
        //    39: monitorexit    
        //    40: iconst_0       
        //    41: ireturn        
        //    42: aload_0        
        //    43: getfield        j0/k.c:Ljava/util/ArrayDeque;
        //    46: invokevirtual   java/util/ArrayDeque.removeFirst:()Ljava/lang/Object;
        //    49: checkcast       Lj0/i;
        //    52: astore          4
        //    54: aload_0        
        //    55: getfield        j0/k.f:[Lj0/j;
        //    58: astore          5
        //    60: aload_0        
        //    61: getfield        j0/k.h:I
        //    64: iconst_1       
        //    65: isub           
        //    66: istore_1       
        //    67: aload_0        
        //    68: iload_1        
        //    69: putfield        j0/k.h:I
        //    72: aload           5
        //    74: iload_1        
        //    75: aaload         
        //    76: astore          5
        //    78: aload_0        
        //    79: getfield        j0/k.k:Z
        //    82: istore_2       
        //    83: aload_0        
        //    84: iconst_0       
        //    85: putfield        j0/k.k:Z
        //    88: aload_3        
        //    89: monitorexit    
        //    90: aload           4
        //    92: invokevirtual   j0/a.p:()Z
        //    95: ifeq            107
        //    98: aload           5
        //   100: iconst_4       
        //   101: invokevirtual   j0/a.l:(I)V
        //   104: goto            206
        //   107: aload           5
        //   109: aload           4
        //   111: getfield        j0/i.t:J
        //   114: putfield        j0/j.p:J
        //   117: aload           4
        //   119: invokevirtual   j0/a.r:()Z
        //   122: ifeq            132
        //   125: aload           5
        //   127: ldc             134217728
        //   129: invokevirtual   j0/a.l:(I)V
        //   132: aload_0        
        //   133: aload           4
        //   135: getfield        j0/i.t:J
        //   138: invokevirtual   j0/k.p:(J)Z
        //   141: ifne            150
        //   144: aload           5
        //   146: iconst_1       
        //   147: putfield        j0/j.r:Z
        //   150: aload_0        
        //   151: aload           4
        //   153: aload           5
        //   155: iload_2        
        //   156: invokevirtual   j0/k.l:(Lj0/i;Lj0/j;Z)Lj0/h;
        //   159: astore_3       
        //   160: goto            177
        //   163: astore_3       
        //   164: aload_0        
        //   165: aload_3        
        //   166: invokevirtual   j0/k.k:(Ljava/lang/Throwable;)Lj0/h;
        //   169: astore_3       
        //   170: goto            177
        //   173: astore_3       
        //   174: goto            164
        //   177: aload_3        
        //   178: ifnull          206
        //   181: aload_0        
        //   182: getfield        j0/k.b:Ljava/lang/Object;
        //   185: astore          4
        //   187: aload           4
        //   189: monitorenter   
        //   190: aload_0        
        //   191: aload_3        
        //   192: putfield        j0/k.j:Lj0/h;
        //   195: aload           4
        //   197: monitorexit    
        //   198: iconst_0       
        //   199: ireturn        
        //   200: astore_3       
        //   201: aload           4
        //   203: monitorexit    
        //   204: aload_3        
        //   205: athrow         
        //   206: aload_0        
        //   207: getfield        j0/k.b:Ljava/lang/Object;
        //   210: astore_3       
        //   211: aload_3        
        //   212: monitorenter   
        //   213: aload_0        
        //   214: getfield        j0/k.k:Z
        //   217: ifeq            228
        //   220: aload           5
        //   222: invokevirtual   j0/j.x:()V
        //   225: goto            272
        //   228: aload           5
        //   230: getfield        j0/j.r:Z
        //   233: ifeq            249
        //   236: aload_0        
        //   237: aload_0        
        //   238: getfield        j0/k.m:I
        //   241: iconst_1       
        //   242: iadd           
        //   243: putfield        j0/k.m:I
        //   246: goto            220
        //   249: aload           5
        //   251: aload_0        
        //   252: getfield        j0/k.m:I
        //   255: putfield        j0/j.q:I
        //   258: aload_0        
        //   259: iconst_0       
        //   260: putfield        j0/k.m:I
        //   263: aload_0        
        //   264: getfield        j0/k.d:Ljava/util/ArrayDeque;
        //   267: aload           5
        //   269: invokevirtual   java/util/ArrayDeque.addLast:(Ljava/lang/Object;)V
        //   272: aload_0        
        //   273: aload           4
        //   275: invokevirtual   j0/k.s:(Lj0/i;)V
        //   278: aload_3        
        //   279: monitorexit    
        //   280: iconst_1       
        //   281: ireturn        
        //   282: aload_3        
        //   283: monitorexit    
        //   284: aload           4
        //   286: athrow         
        //   287: aload_3        
        //   288: monitorexit    
        //   289: aload           4
        //   291: athrow         
        //   292: astore          4
        //   294: goto            287
        //   297: astore          4
        //   299: goto            282
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      28     292    297    Any
        //  31     40     292    297    Any
        //  42     72     292    297    Any
        //  78     90     292    297    Any
        //  150    160    173    177    Ljava/lang/RuntimeException;
        //  150    160    163    164    Ljava/lang/OutOfMemoryError;
        //  190    198    200    206    Any
        //  201    204    200    206    Any
        //  213    220    297    287    Any
        //  220    225    297    287    Any
        //  228    246    297    287    Any
        //  249    272    297    287    Any
        //  272    280    297    287    Any
        //  282    284    297    287    Any
        //  287    289    292    297    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0220:
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
    
    public final i n() {
        while (true) {
            while (true) {
                synchronized (this.b) {
                    this.r();
                    if (this.i == null) {
                        final boolean b = true;
                        g0.a.f(b);
                        final int g = this.g;
                        i i;
                        if (g == 0) {
                            i = null;
                        }
                        else {
                            final i[] e = this.e;
                            final int g2 = g - 1;
                            this.g = g2;
                            i = e[g2];
                        }
                        return this.i = i;
                    }
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    public final j o() {
        final Object b = this.b;
        // monitorenter(b)
        while (true) {
            try {
                this.r();
                if (this.d.isEmpty()) {
                    // monitorexit(b)
                    return null;
                }
                // monitorexit(b)
                return this.d.removeFirst();
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean p(final long n) {
        while (true) {
            synchronized (this.b) {
                final long n2 = this.n;
                if (n2 != -9223372036854775807L && n < n2) {
                    return false;
                }
                return true;
            }
            return false;
            b = true;
            return b;
        }
    }
    
    public final void q() {
        if (this.h()) {
            this.b.notify();
        }
    }
    
    public final void r() {
        final h j = this.j;
        if (j == null) {
            return;
        }
        throw j;
    }
    
    @Override
    public void release() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        j0/k.b:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: iconst_1       
        //     9: putfield        j0/k.l:Z
        //    12: aload_0        
        //    13: getfield        j0/k.b:Ljava/lang/Object;
        //    16: invokevirtual   java/lang/Object.notify:()V
        //    19: aload_1        
        //    20: monitorexit    
        //    21: aload_0        
        //    22: getfield        j0/k.a:Ljava/lang/Thread;
        //    25: invokevirtual   java/lang/Thread.join:()V
        //    28: return         
        //    29: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    32: invokevirtual   java/lang/Thread.interrupt:()V
        //    35: return         
        //    36: astore_2       
        //    37: aload_1        
        //    38: monitorexit    
        //    39: aload_2        
        //    40: athrow         
        //    41: astore_1       
        //    42: goto            29
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      21     36     41     Any
        //  21     28     41     36     Ljava/lang/InterruptedException;
        //  37     39     36     41     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0029:
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
    
    public final void s(final i i) {
        i.m();
        this.e[this.g++] = i;
    }
    
    public void t(final j j) {
        synchronized (this.b) {
            this.u(j);
            this.q();
        }
    }
    
    public final void u(final j j) {
        j.m();
        this.f[this.h++] = j;
    }
    
    public final void v() {
        try {
            while (this.m()) {}
        }
        catch (InterruptedException cause) {
            throw new IllegalStateException(cause);
        }
    }
    
    public final void w(final int n) {
        final int g = this.g;
        final int length = this.e.length;
        int i = 0;
        g0.a.f(g == length);
        for (i[] e = this.e; i < e.length; ++i) {
            e[i].z(n);
        }
    }
}
