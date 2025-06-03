// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import t0.m;
import z0.i;
import android.os.Looper;
import s0.e;
import s0.g;
import s0.c;
import m0.N;
import java.util.ArrayList;
import u0.b;
import z0.h;
import m0.x;
import D0.E;
import android.os.Handler;
import t0.z;
import t0.k;
import android.content.Context;

public class t implements c1
{
    public final Context a;
    public final k b;
    public int c;
    public long d;
    public boolean e;
    public z f;
    public boolean g;
    public boolean h;
    
    public t(final Context a) {
        this.a = a;
        this.b = new k(a);
        this.c = 0;
        this.d = 5000L;
        this.f = z.a;
    }
    
    @Override
    public Y0[] a(final Handler handler, final E e, final x x, final h h, final b b) {
        final ArrayList list = new ArrayList();
        this.i(this.a, this.c, this.f, this.e, handler, e, this.d, list);
        final m0.z c = this.c(this.a, this.g, this.h);
        if (c != null) {
            this.b(this.a, this.c, this.f, this.e, c, handler, x, list);
        }
        this.h(this.a, h, handler.getLooper(), this.c, list);
        this.f(this.a, b, handler.getLooper(), this.c, list);
        this.d(this.a, this.c, list);
        this.e(list);
        this.g(this.a, handler, this.c, list);
        return list.toArray(new Y0[0]);
    }
    
    public void b(final Context p0, final int p1, final z p2, final boolean p3, final m0.z p4, final Handler p5, final x p6, final ArrayList p7) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: new             Lm0/b0;
        //     5: dup            
        //     6: aload_1        
        //     7: aload_0        
        //     8: invokevirtual   k0/t.j:()Lt0/m$b;
        //    11: aload_3        
        //    12: iload           4
        //    14: aload           6
        //    16: aload           7
        //    18: aload           5
        //    20: invokespecial   m0/b0.<init>:(Landroid/content/Context;Lt0/m$b;Lt0/z;ZLandroid/os/Handler;Lm0/x;Lm0/z;)V
        //    23: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    26: pop            
        //    27: iload_2        
        //    28: ifne            32
        //    31: return         
        //    32: aload           8
        //    34: invokevirtual   java/util/ArrayList.size:()I
        //    37: istore          10
        //    39: iload           10
        //    41: istore          9
        //    43: iload_2        
        //    44: iconst_2       
        //    45: if_icmpne       54
        //    48: iload           10
        //    50: iconst_1       
        //    51: isub           
        //    52: istore          9
        //    54: ldc             "androidx.media3.decoder.midi.MidiRenderer"
        //    56: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    59: iconst_1       
        //    60: anewarray       Ljava/lang/Class;
        //    63: dup            
        //    64: iconst_0       
        //    65: ldc             Landroid/content/Context;.class
        //    67: aastore        
        //    68: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    71: iconst_1       
        //    72: anewarray       Ljava/lang/Object;
        //    75: dup            
        //    76: iconst_0       
        //    77: aload_1        
        //    78: aastore        
        //    79: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //    82: checkcast       Lk0/Y0;
        //    85: astore_1       
        //    86: iload           9
        //    88: iconst_1       
        //    89: iadd           
        //    90: istore_2       
        //    91: aload           8
        //    93: iload           9
        //    95: aload_1        
        //    96: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //    99: ldc             "DefaultRenderersFactory"
        //   101: ldc             "Loaded MidiRenderer."
        //   103: invokestatic    g0/o.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   106: goto            139
        //   109: astore_1       
        //   110: goto            125
        //   113: iload_2        
        //   114: istore          9
        //   116: goto            136
        //   119: goto            113
        //   122: goto            136
        //   125: new             Ljava/lang/RuntimeException;
        //   128: dup            
        //   129: ldc             "Error instantiating MIDI extension"
        //   131: aload_1        
        //   132: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   135: athrow         
        //   136: iload           9
        //   138: istore_2       
        //   139: ldc             "androidx.media3.decoder.opus.LibopusAudioRenderer"
        //   141: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   144: iconst_3       
        //   145: anewarray       Ljava/lang/Class;
        //   148: dup            
        //   149: iconst_0       
        //   150: ldc             Landroid/os/Handler;.class
        //   152: aastore        
        //   153: dup            
        //   154: iconst_1       
        //   155: ldc             Lm0/x;.class
        //   157: aastore        
        //   158: dup            
        //   159: iconst_2       
        //   160: ldc             Lm0/z;.class
        //   162: aastore        
        //   163: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   166: iconst_3       
        //   167: anewarray       Ljava/lang/Object;
        //   170: dup            
        //   171: iconst_0       
        //   172: aload           6
        //   174: aastore        
        //   175: dup            
        //   176: iconst_1       
        //   177: aload           7
        //   179: aastore        
        //   180: dup            
        //   181: iconst_2       
        //   182: aload           5
        //   184: aastore        
        //   185: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   188: checkcast       Lk0/Y0;
        //   191: astore_1       
        //   192: iload_2        
        //   193: iconst_1       
        //   194: iadd           
        //   195: istore          9
        //   197: aload           8
        //   199: iload_2        
        //   200: aload_1        
        //   201: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   204: ldc             "DefaultRenderersFactory"
        //   206: ldc             "Loaded LibopusAudioRenderer."
        //   208: invokestatic    g0/o.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   211: iload           9
        //   213: istore_2       
        //   214: goto            238
        //   217: astore_1       
        //   218: goto            227
        //   221: iload           9
        //   223: istore_2       
        //   224: goto            238
        //   227: new             Ljava/lang/RuntimeException;
        //   230: dup            
        //   231: ldc             "Error instantiating Opus extension"
        //   233: aload_1        
        //   234: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   237: athrow         
        //   238: ldc             "androidx.media3.decoder.flac.LibflacAudioRenderer"
        //   240: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   243: iconst_3       
        //   244: anewarray       Ljava/lang/Class;
        //   247: dup            
        //   248: iconst_0       
        //   249: ldc             Landroid/os/Handler;.class
        //   251: aastore        
        //   252: dup            
        //   253: iconst_1       
        //   254: ldc             Lm0/x;.class
        //   256: aastore        
        //   257: dup            
        //   258: iconst_2       
        //   259: ldc             Lm0/z;.class
        //   261: aastore        
        //   262: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   265: iconst_3       
        //   266: anewarray       Ljava/lang/Object;
        //   269: dup            
        //   270: iconst_0       
        //   271: aload           6
        //   273: aastore        
        //   274: dup            
        //   275: iconst_1       
        //   276: aload           7
        //   278: aastore        
        //   279: dup            
        //   280: iconst_2       
        //   281: aload           5
        //   283: aastore        
        //   284: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   287: checkcast       Lk0/Y0;
        //   290: astore_1       
        //   291: iload_2        
        //   292: iconst_1       
        //   293: iadd           
        //   294: istore          9
        //   296: aload           8
        //   298: iload_2        
        //   299: aload_1        
        //   300: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   303: ldc             "DefaultRenderersFactory"
        //   305: ldc             "Loaded LibflacAudioRenderer."
        //   307: invokestatic    g0/o.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   310: iload           9
        //   312: istore_2       
        //   313: goto            337
        //   316: astore_1       
        //   317: goto            326
        //   320: iload           9
        //   322: istore_2       
        //   323: goto            337
        //   326: new             Ljava/lang/RuntimeException;
        //   329: dup            
        //   330: ldc             "Error instantiating FLAC extension"
        //   332: aload_1        
        //   333: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   336: athrow         
        //   337: aload           8
        //   339: iload_2        
        //   340: ldc             "androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer"
        //   342: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   345: iconst_3       
        //   346: anewarray       Ljava/lang/Class;
        //   349: dup            
        //   350: iconst_0       
        //   351: ldc             Landroid/os/Handler;.class
        //   353: aastore        
        //   354: dup            
        //   355: iconst_1       
        //   356: ldc             Lm0/x;.class
        //   358: aastore        
        //   359: dup            
        //   360: iconst_2       
        //   361: ldc             Lm0/z;.class
        //   363: aastore        
        //   364: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   367: iconst_3       
        //   368: anewarray       Ljava/lang/Object;
        //   371: dup            
        //   372: iconst_0       
        //   373: aload           6
        //   375: aastore        
        //   376: dup            
        //   377: iconst_1       
        //   378: aload           7
        //   380: aastore        
        //   381: dup            
        //   382: iconst_2       
        //   383: aload           5
        //   385: aastore        
        //   386: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   389: checkcast       Lk0/Y0;
        //   392: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   395: ldc             "DefaultRenderersFactory"
        //   397: ldc             "Loaded FfmpegAudioRenderer."
        //   399: invokestatic    g0/o.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   402: return         
        //   403: astore_1       
        //   404: new             Ljava/lang/RuntimeException;
        //   407: dup            
        //   408: ldc             "Error instantiating FFmpeg extension"
        //   410: aload_1        
        //   411: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   414: athrow         
        //   415: astore_1       
        //   416: goto            122
        //   419: astore_1       
        //   420: goto            119
        //   423: astore_1       
        //   424: goto            113
        //   427: astore_1       
        //   428: goto            238
        //   431: astore_1       
        //   432: goto            221
        //   435: astore_1       
        //   436: goto            337
        //   439: astore_1       
        //   440: goto            320
        //   443: astore_1       
        //   444: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  54     86     415    125    Ljava/lang/ClassNotFoundException;
        //  54     86     109    113    Ljava/lang/Exception;
        //  91     99     419    122    Ljava/lang/ClassNotFoundException;
        //  91     99     109    113    Ljava/lang/Exception;
        //  99     106    423    427    Ljava/lang/ClassNotFoundException;
        //  99     106    109    113    Ljava/lang/Exception;
        //  139    192    427    431    Ljava/lang/ClassNotFoundException;
        //  139    192    217    221    Ljava/lang/Exception;
        //  197    211    431    227    Ljava/lang/ClassNotFoundException;
        //  197    211    217    221    Ljava/lang/Exception;
        //  238    291    435    439    Ljava/lang/ClassNotFoundException;
        //  238    291    316    320    Ljava/lang/Exception;
        //  296    310    439    326    Ljava/lang/ClassNotFoundException;
        //  296    310    316    320    Ljava/lang/Exception;
        //  337    402    443    445    Ljava/lang/ClassNotFoundException;
        //  337    402    403    415    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 255 out of bounds for length 255
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
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
    
    public m0.z c(final Context context, final boolean b, final boolean b2) {
        return new N.f(context).k(b).j(b2).i();
    }
    
    public void d(final Context context, final int n, final ArrayList list) {
        list.add(new E0.b());
    }
    
    public void e(final ArrayList list) {
        list.add(new g(s0.c.a.a, null));
    }
    
    public void f(final Context context, final b b, final Looper looper, final int n, final ArrayList list) {
        list.add(new u0.c(b, looper));
    }
    
    public void g(final Context context, final Handler handler, final int n, final ArrayList list) {
    }
    
    public void h(final Context context, final h h, final Looper looper, final int n, final ArrayList list) {
        list.add(new i(h, looper));
    }
    
    public void i(final Context p0, final int p1, final z p2, final boolean p3, final Handler p4, final E p5, final long p6, final ArrayList p7) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: new             LD0/k;
        //     5: dup            
        //     6: aload_1        
        //     7: aload_0        
        //     8: invokevirtual   k0/t.j:()Lt0/m$b;
        //    11: aload_3        
        //    12: lload           7
        //    14: iload           4
        //    16: aload           5
        //    18: aload           6
        //    20: bipush          50
        //    22: invokespecial   D0/k.<init>:(Landroid/content/Context;Lt0/m$b;Lt0/z;JZLandroid/os/Handler;LD0/E;I)V
        //    25: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    28: pop            
        //    29: iload_2        
        //    30: ifne            34
        //    33: return         
        //    34: aload           9
        //    36: invokevirtual   java/util/ArrayList.size:()I
        //    39: istore          11
        //    41: iload           11
        //    43: istore          10
        //    45: iload_2        
        //    46: iconst_2       
        //    47: if_icmpne       56
        //    50: iload           11
        //    52: iconst_1       
        //    53: isub           
        //    54: istore          10
        //    56: ldc             "androidx.media3.decoder.vp9.LibvpxVideoRenderer"
        //    58: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    61: iconst_4       
        //    62: anewarray       Ljava/lang/Class;
        //    65: dup            
        //    66: iconst_0       
        //    67: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //    70: aastore        
        //    71: dup            
        //    72: iconst_1       
        //    73: ldc             Landroid/os/Handler;.class
        //    75: aastore        
        //    76: dup            
        //    77: iconst_2       
        //    78: ldc             LD0/E;.class
        //    80: aastore        
        //    81: dup            
        //    82: iconst_3       
        //    83: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    86: aastore        
        //    87: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    90: iconst_4       
        //    91: anewarray       Ljava/lang/Object;
        //    94: dup            
        //    95: iconst_0       
        //    96: lload           7
        //    98: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   101: aastore        
        //   102: dup            
        //   103: iconst_1       
        //   104: aload           5
        //   106: aastore        
        //   107: dup            
        //   108: iconst_2       
        //   109: aload           6
        //   111: aastore        
        //   112: dup            
        //   113: iconst_3       
        //   114: bipush          50
        //   116: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   119: aastore        
        //   120: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   123: checkcast       Lk0/Y0;
        //   126: astore_1       
        //   127: iload           10
        //   129: iconst_1       
        //   130: iadd           
        //   131: istore_2       
        //   132: aload           9
        //   134: iload           10
        //   136: aload_1        
        //   137: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   140: ldc             "DefaultRenderersFactory"
        //   142: ldc             "Loaded LibvpxVideoRenderer."
        //   144: invokestatic    g0/o.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   147: goto            174
        //   150: astore_1       
        //   151: goto            160
        //   154: iload_2        
        //   155: istore          10
        //   157: goto            171
        //   160: new             Ljava/lang/RuntimeException;
        //   163: dup            
        //   164: ldc             "Error instantiating VP9 extension"
        //   166: aload_1        
        //   167: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   170: athrow         
        //   171: iload           10
        //   173: istore_2       
        //   174: ldc             "androidx.media3.decoder.av1.Libgav1VideoRenderer"
        //   176: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   179: iconst_4       
        //   180: anewarray       Ljava/lang/Class;
        //   183: dup            
        //   184: iconst_0       
        //   185: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //   188: aastore        
        //   189: dup            
        //   190: iconst_1       
        //   191: ldc             Landroid/os/Handler;.class
        //   193: aastore        
        //   194: dup            
        //   195: iconst_2       
        //   196: ldc             LD0/E;.class
        //   198: aastore        
        //   199: dup            
        //   200: iconst_3       
        //   201: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   204: aastore        
        //   205: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   208: iconst_4       
        //   209: anewarray       Ljava/lang/Object;
        //   212: dup            
        //   213: iconst_0       
        //   214: lload           7
        //   216: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   219: aastore        
        //   220: dup            
        //   221: iconst_1       
        //   222: aload           5
        //   224: aastore        
        //   225: dup            
        //   226: iconst_2       
        //   227: aload           6
        //   229: aastore        
        //   230: dup            
        //   231: iconst_3       
        //   232: bipush          50
        //   234: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   237: aastore        
        //   238: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   241: checkcast       Lk0/Y0;
        //   244: astore_1       
        //   245: iload_2        
        //   246: iconst_1       
        //   247: iadd           
        //   248: istore          10
        //   250: aload           9
        //   252: iload_2        
        //   253: aload_1        
        //   254: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   257: ldc             "DefaultRenderersFactory"
        //   259: ldc             "Loaded Libgav1VideoRenderer."
        //   261: invokestatic    g0/o.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   264: iload           10
        //   266: istore_2       
        //   267: goto            291
        //   270: astore_1       
        //   271: goto            280
        //   274: iload           10
        //   276: istore_2       
        //   277: goto            291
        //   280: new             Ljava/lang/RuntimeException;
        //   283: dup            
        //   284: ldc             "Error instantiating AV1 extension"
        //   286: aload_1        
        //   287: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   290: athrow         
        //   291: aload           9
        //   293: iload_2        
        //   294: ldc             "androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer"
        //   296: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   299: iconst_4       
        //   300: anewarray       Ljava/lang/Class;
        //   303: dup            
        //   304: iconst_0       
        //   305: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //   308: aastore        
        //   309: dup            
        //   310: iconst_1       
        //   311: ldc             Landroid/os/Handler;.class
        //   313: aastore        
        //   314: dup            
        //   315: iconst_2       
        //   316: ldc             LD0/E;.class
        //   318: aastore        
        //   319: dup            
        //   320: iconst_3       
        //   321: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   324: aastore        
        //   325: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   328: iconst_4       
        //   329: anewarray       Ljava/lang/Object;
        //   332: dup            
        //   333: iconst_0       
        //   334: lload           7
        //   336: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   339: aastore        
        //   340: dup            
        //   341: iconst_1       
        //   342: aload           5
        //   344: aastore        
        //   345: dup            
        //   346: iconst_2       
        //   347: aload           6
        //   349: aastore        
        //   350: dup            
        //   351: iconst_3       
        //   352: bipush          50
        //   354: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   357: aastore        
        //   358: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   361: checkcast       Lk0/Y0;
        //   364: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   367: ldc             "DefaultRenderersFactory"
        //   369: ldc             "Loaded FfmpegVideoRenderer."
        //   371: invokestatic    g0/o.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   374: return         
        //   375: astore_1       
        //   376: new             Ljava/lang/RuntimeException;
        //   379: dup            
        //   380: ldc             "Error instantiating FFmpeg extension"
        //   382: aload_1        
        //   383: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   386: athrow         
        //   387: astore_1       
        //   388: goto            171
        //   391: astore_1       
        //   392: goto            154
        //   395: astore_1       
        //   396: goto            291
        //   399: astore_1       
        //   400: goto            274
        //   403: astore_1       
        //   404: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  56     127    387    391    Ljava/lang/ClassNotFoundException;
        //  56     127    150    154    Ljava/lang/Exception;
        //  132    147    391    160    Ljava/lang/ClassNotFoundException;
        //  132    147    150    154    Ljava/lang/Exception;
        //  174    245    395    399    Ljava/lang/ClassNotFoundException;
        //  174    245    270    274    Ljava/lang/Exception;
        //  250    264    399    280    Ljava/lang/ClassNotFoundException;
        //  250    264    270    274    Ljava/lang/Exception;
        //  291    374    403    405    Ljava/lang/ClassNotFoundException;
        //  291    374    375    387    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 235 out of bounds for length 235
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
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
    
    public m.b j() {
        return this.b;
    }
}
