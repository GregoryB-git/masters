// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i5;

import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;
import android.os.Looper;
import android.util.Log;
import android.content.Context;
import E5.c;
import java.util.Map;
import E5.j;
import android.os.Handler;
import android.os.HandlerThread;
import A5.a;
import E5.k;

public class e implements c, A5.a
{
    public k a;
    public i5.a b;
    public HandlerThread c;
    public Handler d;
    
    public final String d(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b.d);
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }
    
    public final String e(final j j) {
        return this.d(((Map)j.b).get("key"));
    }
    
    public final String f(final j j) {
        return ((Map)j.b).get("value");
    }
    
    public void g(final E5.c c, final Context context) {
        try {
            this.b = new i5.a(context);
            ((Thread)(this.c = new HandlerThread("com.it_nomads.fluttersecurestorage.worker"))).start();
            this.d = new Handler(this.c.getLooper());
            (this.a = new k(c, "plugins.it_nomads.com/flutter_secure_storage")).e((k.c)this);
        }
        catch (Exception ex) {
            Log.e("FlutterSecureStoragePl", "Registration failed", (Throwable)ex);
        }
    }
    
    @Override
    public void onAttachedToEngine(final A5.a.b b) {
        this.g(b.b(), b.a());
    }
    
    @Override
    public void onDetachedFromEngine(final A5.a.b b) {
        if (this.a != null) {
            this.c.quitSafely();
            this.c = null;
            this.a.e(null);
            this.a = null;
        }
        this.b = null;
    }
    
    @Override
    public void onMethodCall(final j j, final d d) {
        this.d.post((Runnable)new b(j, new a(d)));
    }
    
    public static class a implements d
    {
        public final d a;
        public final Handler b;
        
        public a(final d a) {
            this.b = new Handler(Looper.getMainLooper());
            this.a = a;
        }
        
        @Override
        public void a(final Object o) {
            this.b.post((Runnable)new i5.c(this, o));
        }
        
        @Override
        public void b(final String s, final String s2, final Object o) {
            this.b.post((Runnable)new i5.d(this, s, s2, o));
        }
        
        @Override
        public void c() {
            final Handler b = this.b;
            final d a = this.a;
            Objects.requireNonNull(a);
            b.post((Runnable)new b(a));
        }
    }
    
    public class b implements Runnable
    {
        public final j o;
        public final d p;
        
        public b(final j o, final d p3) {
            this.o = o;
            this.p = p3;
        }
        
        public final void a(final Exception ex) {
            final StringWriter out = new StringWriter();
            ex.printStackTrace(new PrintWriter(out));
            this.p.b("Exception encountered", this.o.a, out.toString());
        }
        
        @Override
        public void run() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: istore_1       
            //     2: aload_0        
            //     3: getfield        i5/e$b.q:Li5/e;
            //     6: invokestatic    i5/e.a:(Li5/e;)Li5/a;
            //     9: aload_0        
            //    10: getfield        i5/e$b.o:LE5/j;
            //    13: getfield        E5/j.b:Ljava/lang/Object;
            //    16: checkcast       Ljava/util/Map;
            //    19: ldc             "options"
            //    21: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
            //    26: checkcast       Ljava/util/Map;
            //    29: putfield        i5/a.e:Ljava/util/Map;
            //    32: aload_0        
            //    33: getfield        i5/e$b.q:Li5/e;
            //    36: invokestatic    i5/e.a:(Li5/e;)Li5/a;
            //    39: invokevirtual   i5/a.g:()Z
            //    42: istore_2       
            //    43: aload_0        
            //    44: getfield        i5/e$b.o:LE5/j;
            //    47: getfield        E5/j.a:Ljava/lang/String;
            //    50: astore          4
            //    52: aload           4
            //    54: invokevirtual   java/lang/String.hashCode:()I
            //    57: lookupswitch {
            //          -1335458389: 189
            //          -358737930: 174
            //          3496342: 159
            //          113399775: 146
            //          208013248: 131
            //          1080375339: 116
            //          default: 554
            //        }
            //   116: aload           4
            //   118: ldc             "readAll"
            //   120: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //   123: ifeq            567
            //   126: iconst_2       
            //   127: istore_1       
            //   128: goto            204
            //   131: aload           4
            //   133: ldc             "containsKey"
            //   135: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //   138: ifeq            567
            //   141: iconst_3       
            //   142: istore_1       
            //   143: goto            204
            //   146: aload           4
            //   148: ldc             "write"
            //   150: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //   153: ifeq            567
            //   156: goto            204
            //   159: aload           4
            //   161: ldc             "read"
            //   163: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //   166: ifeq            567
            //   169: iconst_1       
            //   170: istore_1       
            //   171: goto            204
            //   174: aload           4
            //   176: ldc             "deleteAll"
            //   178: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //   181: ifeq            567
            //   184: iconst_5       
            //   185: istore_1       
            //   186: goto            204
            //   189: aload           4
            //   191: ldc             "delete"
            //   193: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //   196: ifeq            567
            //   199: iconst_4       
            //   200: istore_1       
            //   201: goto            204
            //   204: aconst_null    
            //   205: astore          5
            //   207: iload_1        
            //   208: ifeq            435
            //   211: iload_1        
            //   212: iconst_1       
            //   213: if_icmpeq       375
            //   216: iload_1        
            //   217: iconst_2       
            //   218: if_icmpeq       354
            //   221: iload_1        
            //   222: iconst_3       
            //   223: if_icmpeq       306
            //   226: iload_1        
            //   227: iconst_4       
            //   228: if_icmpeq       272
            //   231: iload_1        
            //   232: iconst_5       
            //   233: if_icmpeq       246
            //   236: aload_0        
            //   237: getfield        i5/e$b.p:LE5/k$d;
            //   240: invokeinterface E5/k$d.c:()V
            //   245: return         
            //   246: aload_0        
            //   247: getfield        i5/e$b.q:Li5/e;
            //   250: invokestatic    i5/e.a:(Li5/e;)Li5/a;
            //   253: invokevirtual   i5/a.e:()V
            //   256: aload_0        
            //   257: getfield        i5/e$b.p:LE5/k$d;
            //   260: astore          4
            //   262: aload           4
            //   264: aload           5
            //   266: invokeinterface E5/k$d.a:(Ljava/lang/Object;)V
            //   271: return         
            //   272: aload_0        
            //   273: getfield        i5/e$b.q:Li5/e;
            //   276: aload_0        
            //   277: getfield        i5/e$b.o:LE5/j;
            //   280: invokestatic    i5/e.b:(Li5/e;LE5/j;)Ljava/lang/String;
            //   283: astore          4
            //   285: aload_0        
            //   286: getfield        i5/e$b.q:Li5/e;
            //   289: invokestatic    i5/e.a:(Li5/e;)Li5/a;
            //   292: aload           4
            //   294: invokevirtual   i5/a.d:(Ljava/lang/String;)V
            //   297: aload_0        
            //   298: getfield        i5/e$b.p:LE5/k$d;
            //   301: astore          4
            //   303: goto            262
            //   306: aload_0        
            //   307: getfield        i5/e$b.q:Li5/e;
            //   310: aload_0        
            //   311: getfield        i5/e$b.o:LE5/j;
            //   314: invokestatic    i5/e.b:(Li5/e;LE5/j;)Ljava/lang/String;
            //   317: astore          4
            //   319: aload_0        
            //   320: getfield        i5/e$b.q:Li5/e;
            //   323: invokestatic    i5/e.a:(Li5/e;)Li5/a;
            //   326: aload           4
            //   328: invokevirtual   i5/a.b:(Ljava/lang/String;)Z
            //   331: istore_3       
            //   332: aload_0        
            //   333: getfield        i5/e$b.p:LE5/k$d;
            //   336: astore          5
            //   338: iload_3        
            //   339: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //   342: astore          4
            //   344: aload           5
            //   346: aload           4
            //   348: invokeinterface E5/k$d.a:(Ljava/lang/Object;)V
            //   353: return         
            //   354: aload_0        
            //   355: getfield        i5/e$b.p:LE5/k$d;
            //   358: astore          4
            //   360: aload_0        
            //   361: getfield        i5/e$b.q:Li5/e;
            //   364: invokestatic    i5/e.a:(Li5/e;)Li5/a;
            //   367: invokevirtual   i5/a.m:()Ljava/util/Map;
            //   370: astore          5
            //   372: goto            262
            //   375: aload_0        
            //   376: getfield        i5/e$b.q:Li5/e;
            //   379: aload_0        
            //   380: getfield        i5/e$b.o:LE5/j;
            //   383: invokestatic    i5/e.b:(Li5/e;LE5/j;)Ljava/lang/String;
            //   386: astore          4
            //   388: aload_0        
            //   389: getfield        i5/e$b.q:Li5/e;
            //   392: invokestatic    i5/e.a:(Li5/e;)Li5/a;
            //   395: aload           4
            //   397: invokevirtual   i5/a.b:(Ljava/lang/String;)Z
            //   400: ifeq            426
            //   403: aload_0        
            //   404: getfield        i5/e$b.q:Li5/e;
            //   407: invokestatic    i5/e.a:(Li5/e;)Li5/a;
            //   410: aload           4
            //   412: invokevirtual   i5/a.l:(Ljava/lang/String;)Ljava/lang/String;
            //   415: astore          4
            //   417: aload_0        
            //   418: getfield        i5/e$b.p:LE5/k$d;
            //   421: astore          5
            //   423: goto            344
            //   426: aload_0        
            //   427: getfield        i5/e$b.p:LE5/k$d;
            //   430: astore          4
            //   432: goto            262
            //   435: aload_0        
            //   436: getfield        i5/e$b.q:Li5/e;
            //   439: aload_0        
            //   440: getfield        i5/e$b.o:LE5/j;
            //   443: invokestatic    i5/e.b:(Li5/e;LE5/j;)Ljava/lang/String;
            //   446: astore          4
            //   448: aload_0        
            //   449: getfield        i5/e$b.q:Li5/e;
            //   452: aload_0        
            //   453: getfield        i5/e$b.o:LE5/j;
            //   456: invokestatic    i5/e.c:(Li5/e;LE5/j;)Ljava/lang/String;
            //   459: astore          6
            //   461: aload           6
            //   463: ifnull          489
            //   466: aload_0        
            //   467: getfield        i5/e$b.q:Li5/e;
            //   470: invokestatic    i5/e.a:(Li5/e;)Li5/a;
            //   473: aload           4
            //   475: aload           6
            //   477: invokevirtual   i5/a.n:(Ljava/lang/String;Ljava/lang/String;)V
            //   480: aload_0        
            //   481: getfield        i5/e$b.p:LE5/k$d;
            //   484: astore          4
            //   486: goto            262
            //   489: aload_0        
            //   490: getfield        i5/e$b.p:LE5/k$d;
            //   493: ldc             "null"
            //   495: aconst_null    
            //   496: aconst_null    
            //   497: invokeinterface E5/k$d.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
            //   502: return         
            //   503: astore          4
            //   505: iconst_0       
            //   506: istore_2       
            //   507: iload_2        
            //   508: ifeq            535
            //   511: aload_0        
            //   512: getfield        i5/e$b.q:Li5/e;
            //   515: invokestatic    i5/e.a:(Li5/e;)Li5/a;
            //   518: invokevirtual   i5/a.e:()V
            //   521: aload_0        
            //   522: getfield        i5/e$b.p:LE5/k$d;
            //   525: ldc             "Data has been reset"
            //   527: invokeinterface E5/k$d.a:(Ljava/lang/Object;)V
            //   532: return         
            //   533: astore          4
            //   535: aload_0        
            //   536: aload           4
            //   538: invokevirtual   i5/e$b.a:(Ljava/lang/Exception;)V
            //   541: return         
            //   542: ldc             "Creating sharedPrefs"
            //   544: aload           4
            //   546: invokevirtual   java/lang/Throwable.getLocalizedMessage:()Ljava/lang/String;
            //   549: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
            //   552: pop            
            //   553: return         
            //   554: goto            567
            //   557: astore          4
            //   559: goto            507
            //   562: astore          4
            //   564: goto            542
            //   567: iconst_m1      
            //   568: istore_1       
            //   569: goto            204
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                           
            //  -----  -----  -----  -----  -------------------------------
            //  2      43     562    554    Ljava/io/FileNotFoundException;
            //  2      43     503    507    Ljava/lang/Exception;
            //  43     116    562    554    Ljava/io/FileNotFoundException;
            //  43     116    557    562    Ljava/lang/Exception;
            //  116    126    562    554    Ljava/io/FileNotFoundException;
            //  116    126    557    562    Ljava/lang/Exception;
            //  131    141    562    554    Ljava/io/FileNotFoundException;
            //  131    141    557    562    Ljava/lang/Exception;
            //  146    156    562    554    Ljava/io/FileNotFoundException;
            //  146    156    557    562    Ljava/lang/Exception;
            //  159    169    562    554    Ljava/io/FileNotFoundException;
            //  159    169    557    562    Ljava/lang/Exception;
            //  174    184    562    554    Ljava/io/FileNotFoundException;
            //  174    184    557    562    Ljava/lang/Exception;
            //  189    199    562    554    Ljava/io/FileNotFoundException;
            //  189    199    557    562    Ljava/lang/Exception;
            //  236    245    562    554    Ljava/io/FileNotFoundException;
            //  236    245    557    562    Ljava/lang/Exception;
            //  246    262    562    554    Ljava/io/FileNotFoundException;
            //  246    262    557    562    Ljava/lang/Exception;
            //  262    271    562    554    Ljava/io/FileNotFoundException;
            //  262    271    557    562    Ljava/lang/Exception;
            //  272    303    562    554    Ljava/io/FileNotFoundException;
            //  272    303    557    562    Ljava/lang/Exception;
            //  306    344    562    554    Ljava/io/FileNotFoundException;
            //  306    344    557    562    Ljava/lang/Exception;
            //  344    353    562    554    Ljava/io/FileNotFoundException;
            //  344    353    557    562    Ljava/lang/Exception;
            //  354    372    562    554    Ljava/io/FileNotFoundException;
            //  354    372    557    562    Ljava/lang/Exception;
            //  375    423    562    554    Ljava/io/FileNotFoundException;
            //  375    423    557    562    Ljava/lang/Exception;
            //  426    432    562    554    Ljava/io/FileNotFoundException;
            //  426    432    557    562    Ljava/lang/Exception;
            //  435    461    562    554    Ljava/io/FileNotFoundException;
            //  435    461    557    562    Ljava/lang/Exception;
            //  466    486    562    554    Ljava/io/FileNotFoundException;
            //  466    486    557    562    Ljava/lang/Exception;
            //  489    502    562    554    Ljava/io/FileNotFoundException;
            //  489    502    557    562    Ljava/lang/Exception;
            //  511    532    533    535    Ljava/lang/Exception;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0116:
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
    }
}
