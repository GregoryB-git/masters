// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import d0.z;
import d0.q;
import W2.s;
import g0.F;
import g0.M;
import android.media.MediaCodec$OnFrameRenderedListener;
import android.os.Handler;
import java.nio.ByteBuffer;
import android.media.MediaCodec$BufferInfo;
import android.os.Bundle;
import j0.c;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.media.MediaCodec;

public final class b implements m
{
    public final MediaCodec a;
    public final i b;
    public final n c;
    public boolean d;
    public int e;
    
    public b(final MediaCodec a, final HandlerThread handlerThread, final n c) {
        this.a = a;
        this.b = new i(handlerThread);
        this.c = c;
        this.e = 0;
    }
    
    public static String t(final int n) {
        return v(n, "ExoPlayer:MediaCodecAsyncAdapter:");
    }
    
    public static String u(final int n) {
        return v(n, "ExoPlayer:MediaCodecQueueingThread:");
    }
    
    public static String v(final int i, String s) {
        final StringBuilder sb = new StringBuilder(s);
        if (i == 1) {
            s = "Audio";
        }
        else if (i == 2) {
            s = "Video";
        }
        else {
            sb.append("Unknown(");
            sb.append(i);
            s = ")";
        }
        sb.append(s);
        return sb.toString();
    }
    
    @Override
    public void a(final int n, final int n2, final j0.c c, final long n3, final int n4) {
        this.c.a(n, n2, c, n3, n4);
    }
    
    @Override
    public void b(final int n, final int n2, final int n3, final long n4, final int n5) {
        this.c.b(n, n2, n3, n4, n5);
    }
    
    @Override
    public void c(final Bundle bundle) {
        this.c.c(bundle);
    }
    
    @Override
    public int d(final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.c.d();
        return this.b.d(mediaCodec$BufferInfo);
    }
    
    @Override
    public boolean e() {
        return false;
    }
    
    @Override
    public void f(final int n, final boolean b) {
        this.a.releaseOutputBuffer(n, b);
    }
    
    @Override
    public void flush() {
        this.c.flush();
        this.a.flush();
        this.b.e();
        this.a.start();
    }
    
    @Override
    public void g(final int videoScalingMode) {
        this.a.setVideoScalingMode(videoScalingMode);
    }
    
    @Override
    public MediaFormat h() {
        return this.b.g();
    }
    
    @Override
    public ByteBuffer i(final int n) {
        return this.a.getInputBuffer(n);
    }
    
    @Override
    public void j(final Surface outputSurface) {
        this.a.setOutputSurface(outputSurface);
    }
    
    @Override
    public ByteBuffer k(final int n) {
        return this.a.getOutputBuffer(n);
    }
    
    @Override
    public boolean l(final c c) {
        this.b.p(c);
        return true;
    }
    
    @Override
    public void m(final int n, final long n2) {
        this.a.releaseOutputBuffer(n, n2);
    }
    
    @Override
    public int n() {
        this.c.d();
        return this.b.c();
    }
    
    @Override
    public void o(final d d, final Handler handler) {
        this.a.setOnFrameRenderedListener((MediaCodec$OnFrameRenderedListener)new t0.a(this, d), handler);
    }
    
    @Override
    public void release() {
        while (true) {
            try {
                if (this.e == 1) {
                    this.c.shutdown();
                    this.b.q();
                }
                this.e = 2;
                if (this.d) {
                    return;
                }
                Label_0082: {
                    try {
                        final int a = M.a;
                        if (a >= 30 && a < 33) {
                            this.a.stop();
                        }
                    }
                    finally {
                        break Label_0082;
                    }
                    this.a.release();
                    this.d = true;
                    return;
                }
                this.a.release();
                this.d = true;
                while (true) {
                    Label_0134: {
                        Label_0149: {
                            try {
                                final int a2 = M.a;
                                if (a2 >= 30 && a2 < 33) {
                                    this.a.stop();
                                }
                            }
                            finally {
                                break Label_0149;
                            }
                            break Label_0134;
                        }
                        this.a.release();
                        this.d = true;
                        throw;
                        continue;
                    }
                    this.a.release();
                    this.d = true;
                    continue;
                }
            }
            // iftrue(Label_0163:, this.d)
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void w(final MediaFormat mediaFormat, final Surface surface, final MediaCrypto mediaCrypto, final int n) {
        this.b.h(this.a);
        F.a("configureCodec");
        this.a.configure(mediaFormat, surface, mediaCrypto, n);
        F.b();
        this.c.start();
        F.a("startCodec");
        this.a.start();
        F.b();
        this.e = 1;
    }
    
    public static final class b implements m.b
    {
        public final s a;
        public final s b;
        public boolean c;
        
        public b(final int n) {
            this(new t0.c(n), new t0.d(n));
        }
        
        public b(final s a, final s b) {
            this.a = a;
            this.b = b;
            this.c = true;
        }
        
        public static boolean h(final q q) {
            final int a = M.a;
            boolean b = false;
            if (a < 34) {
                return false;
            }
            if (a >= 35 || z.s(q.n)) {
                b = true;
            }
            return b;
        }
        
        public t0.b d(final a p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        t0/m$a.a:Lt0/p;
            //     4: getfield        t0/p.a:Ljava/lang/String;
            //     7: astore_3       
            //     8: aconst_null    
            //     9: astore          4
            //    11: new             Ljava/lang/StringBuilder;
            //    14: dup            
            //    15: invokespecial   java/lang/StringBuilder.<init>:()V
            //    18: astore          5
            //    20: aload           5
            //    22: ldc             "createCodec:"
            //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //    27: pop            
            //    28: aload           5
            //    30: aload_3        
            //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //    34: pop            
            //    35: aload           5
            //    37: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //    40: invokestatic    g0/F.a:(Ljava/lang/String;)V
            //    43: aload_3        
            //    44: invokestatic    android/media/MediaCodec.createByCodecName:(Ljava/lang/String;)Landroid/media/MediaCodec;
            //    47: astore          5
            //    49: aload_1        
            //    50: getfield        t0/m$a.f:I
            //    53: istore_2       
            //    54: aload_0        
            //    55: getfield        t0/b$b.c:Z
            //    58: ifeq            88
            //    61: aload_1        
            //    62: getfield        t0/m$a.c:Ld0/q;
            //    65: invokestatic    t0/b$b.h:(Ld0/q;)Z
            //    68: ifeq            88
            //    71: new             Lt0/L;
            //    74: dup            
            //    75: aload           5
            //    77: invokespecial   t0/L.<init>:(Landroid/media/MediaCodec;)V
            //    80: astore_3       
            //    81: iload_2        
            //    82: iconst_4       
            //    83: ior            
            //    84: istore_2       
            //    85: goto            110
            //    88: new             Lt0/g;
            //    91: dup            
            //    92: aload           5
            //    94: aload_0        
            //    95: getfield        t0/b$b.b:LW2/s;
            //    98: invokeinterface W2/s.get:()Ljava/lang/Object;
            //   103: checkcast       Landroid/os/HandlerThread;
            //   106: invokespecial   t0/g.<init>:(Landroid/media/MediaCodec;Landroid/os/HandlerThread;)V
            //   109: astore_3       
            //   110: new             Lt0/b;
            //   113: dup            
            //   114: aload           5
            //   116: aload_0        
            //   117: getfield        t0/b$b.a:LW2/s;
            //   120: invokeinterface W2/s.get:()Ljava/lang/Object;
            //   125: checkcast       Landroid/os/HandlerThread;
            //   128: aload_3        
            //   129: aconst_null    
            //   130: invokespecial   t0/b.<init>:(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Lt0/n;Lt0/b$a;)V
            //   133: astore_3       
            //   134: invokestatic    g0/F.b:()V
            //   137: aload_3        
            //   138: aload_1        
            //   139: getfield        t0/m$a.b:Landroid/media/MediaFormat;
            //   142: aload_1        
            //   143: getfield        t0/m$a.d:Landroid/view/Surface;
            //   146: aload_1        
            //   147: getfield        t0/m$a.e:Landroid/media/MediaCrypto;
            //   150: iload_2        
            //   151: invokestatic    t0/b.q:(Lt0/b;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
            //   154: aload_3        
            //   155: areturn        
            //   156: astore_1       
            //   157: aload_3        
            //   158: astore          4
            //   160: aload           5
            //   162: astore_3       
            //   163: goto            169
            //   166: astore_1       
            //   167: aconst_null    
            //   168: astore_3       
            //   169: aload           4
            //   171: ifnonnull       185
            //   174: aload_3        
            //   175: ifnull          190
            //   178: aload_3        
            //   179: invokevirtual   android/media/MediaCodec.release:()V
            //   182: goto            190
            //   185: aload           4
            //   187: invokevirtual   t0/b.release:()V
            //   190: aload_1        
            //   191: athrow         
            //   192: astore_1       
            //   193: aload           5
            //   195: astore_3       
            //   196: goto            169
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  11     49     166    169    Ljava/lang/Exception;
            //  49     81     192    199    Ljava/lang/Exception;
            //  88     110    192    199    Ljava/lang/Exception;
            //  110    134    192    199    Ljava/lang/Exception;
            //  134    154    156    166    Ljava/lang/Exception;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0088:
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
        
        public void e(final boolean c) {
            this.c = c;
        }
    }
}
