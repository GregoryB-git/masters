// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D0;

import android.os.Message;
import android.os.Handler;
import g0.i;
import android.os.Handler$Callback;
import android.os.HandlerThread;
import g0.a;
import g0.j;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class o extends Surface
{
    public static int r;
    public static boolean s;
    public final boolean o;
    public final b p;
    public boolean q;
    
    public o(final b p3, final SurfaceTexture surfaceTexture, final boolean o) {
        super(surfaceTexture);
        this.p = p3;
        this.o = o;
    }
    
    public static int a(final Context context) {
        if (!j.d(context)) {
            return 0;
        }
        if (j.e()) {
            return 1;
        }
        return 2;
    }
    
    public static boolean b(final Context context) {
        // monitorenter(o.class)
        while (true) {
            try {
                final boolean s = o.s;
                boolean b = true;
                if (!s) {
                    o.r = a(context);
                    o.s = true;
                }
                if (o.r == 0) {
                    b = false;
                }
                // monitorexit(o.class)
                return b;
                // monitorexit(o.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static o c(final Context context, final boolean b) {
        int r = 0;
        a.f(!b || b(context));
        final b b2 = new b();
        if (b) {
            r = o.r;
        }
        return b2.a(r);
    }
    
    public void release() {
        super.release();
        final b p = this.p;
        // monitorenter(p)
        while (true) {
            try {
                if (!this.q) {
                    this.p.c();
                    this.q = true;
                }
                // monitorexit(p)
                return;
                // monitorexit(p)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static class b extends HandlerThread implements Handler$Callback
    {
        public i o;
        public Handler p;
        public Error q;
        public RuntimeException r;
        public o s;
        
        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }
        
        public o a(final int p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokevirtual   java/lang/Thread.start:()V
            //     4: aload_0        
            //     5: new             Landroid/os/Handler;
            //     8: dup            
            //     9: aload_0        
            //    10: invokevirtual   android/os/HandlerThread.getLooper:()Landroid/os/Looper;
            //    13: aload_0        
            //    14: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;Landroid/os/Handler$Callback;)V
            //    17: putfield        D0/o$b.p:Landroid/os/Handler;
            //    20: aload_0        
            //    21: new             Lg0/i;
            //    24: dup            
            //    25: aload_0        
            //    26: getfield        D0/o$b.p:Landroid/os/Handler;
            //    29: invokespecial   g0/i.<init>:(Landroid/os/Handler;)V
            //    32: putfield        D0/o$b.o:Lg0/i;
            //    35: aload_0        
            //    36: monitorenter   
            //    37: aload_0        
            //    38: getfield        D0/o$b.p:Landroid/os/Handler;
            //    41: astore_3       
            //    42: iconst_0       
            //    43: istore_2       
            //    44: aload_3        
            //    45: iconst_1       
            //    46: iload_1        
            //    47: iconst_0       
            //    48: invokevirtual   android/os/Handler.obtainMessage:(III)Landroid/os/Message;
            //    51: invokevirtual   android/os/Message.sendToTarget:()V
            //    54: iload_2        
            //    55: istore_1       
            //    56: aload_0        
            //    57: getfield        D0/o$b.s:LD0/o;
            //    60: ifnonnull       95
            //    63: aload_0        
            //    64: getfield        D0/o$b.r:Ljava/lang/RuntimeException;
            //    67: ifnonnull       95
            //    70: aload_0        
            //    71: getfield        D0/o$b.q:Ljava/lang/Error;
            //    74: astore_3       
            //    75: aload_3        
            //    76: ifnonnull       95
            //    79: aload_0        
            //    80: invokevirtual   java/lang/Object.wait:()V
            //    83: goto            56
            //    86: astore_3       
            //    87: goto            140
            //    90: iconst_1       
            //    91: istore_1       
            //    92: goto            56
            //    95: aload_0        
            //    96: monitorexit    
            //    97: iload_1        
            //    98: ifeq            107
            //   101: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
            //   104: invokevirtual   java/lang/Thread.interrupt:()V
            //   107: aload_0        
            //   108: getfield        D0/o$b.r:Ljava/lang/RuntimeException;
            //   111: astore_3       
            //   112: aload_3        
            //   113: ifnonnull       138
            //   116: aload_0        
            //   117: getfield        D0/o$b.q:Ljava/lang/Error;
            //   120: astore_3       
            //   121: aload_3        
            //   122: ifnonnull       136
            //   125: aload_0        
            //   126: getfield        D0/o$b.s:LD0/o;
            //   129: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
            //   132: checkcast       LD0/o;
            //   135: areturn        
            //   136: aload_3        
            //   137: athrow         
            //   138: aload_3        
            //   139: athrow         
            //   140: aload_0        
            //   141: monitorexit    
            //   142: aload_3        
            //   143: athrow         
            //   144: astore_3       
            //   145: goto            90
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                            
            //  -----  -----  -----  -----  --------------------------------
            //  37     42     86     144    Any
            //  44     54     86     144    Any
            //  56     75     86     144    Any
            //  79     83     144    95     Ljava/lang/InterruptedException;
            //  79     83     86     144    Any
            //  95     97     86     144    Any
            //  140    142    86     144    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0090:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
        
        public final void b(final int n) {
            a.e(this.o);
            this.o.h(n);
            this.s = new o(this, this.o.g(), n != 0, null);
        }
        
        public void c() {
            a.e(this.p);
            this.p.sendEmptyMessage(2);
        }
        
        public final void d() {
            a.e(this.o);
            this.o.i();
        }
        
        public boolean handleMessage(final Message p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        android/os/Message.what:I
            //     4: istore_2       
            //     5: iload_2        
            //     6: iconst_1       
            //     7: if_icmpeq       48
            //    10: iload_2        
            //    11: iconst_2       
            //    12: if_icmpeq       17
            //    15: iconst_1       
            //    16: ireturn        
            //    17: aload_0        
            //    18: invokevirtual   D0/o$b.d:()V
            //    21: aload_0        
            //    22: invokevirtual   android/os/HandlerThread.quit:()Z
            //    25: pop            
            //    26: iconst_1       
            //    27: ireturn        
            //    28: astore_1       
            //    29: ldc             "PlaceholderSurface"
            //    31: ldc             "Failed to release placeholder surface"
            //    33: aload_1        
            //    34: invokestatic    g0/o.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //    37: goto            21
            //    40: astore_1       
            //    41: aload_0        
            //    42: invokevirtual   android/os/HandlerThread.quit:()Z
            //    45: pop            
            //    46: aload_1        
            //    47: athrow         
            //    48: aload_0        
            //    49: aload_1        
            //    50: getfield        android/os/Message.arg1:I
            //    53: invokevirtual   D0/o$b.b:(I)V
            //    56: aload_0        
            //    57: monitorenter   
            //    58: aload_0        
            //    59: invokevirtual   java/lang/Object.notify:()V
            //    62: aload_0        
            //    63: monitorexit    
            //    64: iconst_1       
            //    65: ireturn        
            //    66: astore_1       
            //    67: aload_0        
            //    68: monitorexit    
            //    69: aload_1        
            //    70: athrow         
            //    71: astore_1       
            //    72: goto            178
            //    75: astore_1       
            //    76: goto            87
            //    79: astore_1       
            //    80: goto            115
            //    83: astore_1       
            //    84: goto            150
            //    87: ldc             "PlaceholderSurface"
            //    89: ldc             "Failed to initialize placeholder surface"
            //    91: aload_1        
            //    92: invokestatic    g0/o.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //    95: aload_0        
            //    96: aload_1        
            //    97: putfield        D0/o$b.q:Ljava/lang/Error;
            //   100: aload_0        
            //   101: monitorenter   
            //   102: aload_0        
            //   103: invokevirtual   java/lang/Object.notify:()V
            //   106: aload_0        
            //   107: monitorexit    
            //   108: iconst_1       
            //   109: ireturn        
            //   110: astore_1       
            //   111: aload_0        
            //   112: monitorexit    
            //   113: aload_1        
            //   114: athrow         
            //   115: ldc             "PlaceholderSurface"
            //   117: ldc             "Failed to initialize placeholder surface"
            //   119: aload_1        
            //   120: invokestatic    g0/o.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //   123: aload_0        
            //   124: new             Ljava/lang/IllegalStateException;
            //   127: dup            
            //   128: aload_1        
            //   129: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
            //   132: putfield        D0/o$b.r:Ljava/lang/RuntimeException;
            //   135: aload_0        
            //   136: monitorenter   
            //   137: aload_0        
            //   138: invokevirtual   java/lang/Object.notify:()V
            //   141: aload_0        
            //   142: monitorexit    
            //   143: iconst_1       
            //   144: ireturn        
            //   145: astore_1       
            //   146: aload_0        
            //   147: monitorexit    
            //   148: aload_1        
            //   149: athrow         
            //   150: ldc             "PlaceholderSurface"
            //   152: ldc             "Failed to initialize placeholder surface"
            //   154: aload_1        
            //   155: invokestatic    g0/o.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //   158: aload_0        
            //   159: aload_1        
            //   160: putfield        D0/o$b.r:Ljava/lang/RuntimeException;
            //   163: aload_0        
            //   164: monitorenter   
            //   165: aload_0        
            //   166: invokevirtual   java/lang/Object.notify:()V
            //   169: aload_0        
            //   170: monitorexit    
            //   171: iconst_1       
            //   172: ireturn        
            //   173: astore_1       
            //   174: aload_0        
            //   175: monitorexit    
            //   176: aload_1        
            //   177: athrow         
            //   178: aload_0        
            //   179: monitorenter   
            //   180: aload_0        
            //   181: invokevirtual   java/lang/Object.notify:()V
            //   184: aload_0        
            //   185: monitorexit    
            //   186: aload_1        
            //   187: athrow         
            //   188: astore_1       
            //   189: aload_0        
            //   190: monitorexit    
            //   191: aload_1        
            //   192: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  17     21     28     48     Any
            //  29     37     40     48     Any
            //  48     56     83     178    Ljava/lang/RuntimeException;
            //  48     56     79     150    Lg0/j$a;
            //  48     56     75     115    Ljava/lang/Error;
            //  48     56     71     193    Any
            //  58     64     66     71     Any
            //  67     69     66     71     Any
            //  87     100    71     193    Any
            //  102    108    110    115    Any
            //  111    113    110    115    Any
            //  115    135    71     193    Any
            //  137    143    145    150    Any
            //  146    148    145    150    Any
            //  150    163    71     193    Any
            //  165    171    173    178    Any
            //  174    176    173    178    Any
            //  180    186    188    193    Any
            //  189    191    188    193    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index 98 out of bounds for length 98
            //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
            //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
}
