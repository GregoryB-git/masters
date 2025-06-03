// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y5;

import android.os.BaseBundle;
import java.util.concurrent.Callable;
import io.flutter.view.s;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.os.Looper;
import android.os.Bundle;
import android.os.Handler;
import android.content.Context;
import t5.a;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import io.flutter.embedding.engine.FlutterJNI;

public class f
{
    public boolean a;
    public c b;
    public long c;
    public y5.b d;
    public FlutterJNI e;
    public ExecutorService f;
    public Future g;
    
    public f() {
        this(t5.a.e().d().a());
    }
    
    public f(final FlutterJNI flutterJNI) {
        this(flutterJNI, t5.a.e().b());
    }
    
    public f(final FlutterJNI e, final ExecutorService f) {
        this.a = false;
        this.e = e;
        this.f = f;
    }
    
    public static boolean m(final Bundle bundle) {
        return bundle == null || ((BaseBundle)bundle).getBoolean("io.flutter.embedding.android.LeakVM", true);
    }
    
    public boolean g() {
        return this.d.g;
    }
    
    public void h(final Context p0, final String[] p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        y5/f.a:Z
        //     4: ifeq            8
        //     7: return         
        //     8: invokestatic    android/os/Looper.myLooper:()Landroid/os/Looper;
        //    11: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //    14: if_acmpne       886
        //    17: aload_0        
        //    18: getfield        y5/f.b:Ly5/f$c;
        //    21: ifnull          875
        //    24: ldc             "FlutterLoader#ensureInitializationComplete"
        //    26: invokestatic    T5/f.i:(Ljava/lang/String;)LT5/f;
        //    29: astore          9
        //    31: aload_0        
        //    32: getfield        y5/f.g:Ljava/util/concurrent/Future;
        //    35: invokeinterface java/util/concurrent/Future.get:()Ljava/lang/Object;
        //    40: checkcast       Ly5/f$b;
        //    43: astore          10
        //    45: new             Ljava/util/ArrayList;
        //    48: dup            
        //    49: invokespecial   java/util/ArrayList.<init>:()V
        //    52: astore          11
        //    54: aload           11
        //    56: ldc             "--icu-symbol-prefix=_binary_icudtl_dat"
        //    58: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    63: pop            
        //    64: new             Ljava/lang/StringBuilder;
        //    67: dup            
        //    68: invokespecial   java/lang/StringBuilder.<init>:()V
        //    71: astore          13
        //    73: aload           13
        //    75: ldc             "--icu-native-lib-path="
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: pop            
        //    81: aload           13
        //    83: aload_0        
        //    84: getfield        y5/f.d:Ly5/b;
        //    87: getfield        y5/b.f:Ljava/lang/String;
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: pop            
        //    94: getstatic       java/io/File.separator:Ljava/lang/String;
        //    97: astore          12
        //    99: aload           13
        //   101: aload           12
        //   103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   106: pop            
        //   107: aload           13
        //   109: ldc             "libflutter.so"
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   114: pop            
        //   115: aload           11
        //   117: aload           13
        //   119: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   122: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   127: pop            
        //   128: aload_2        
        //   129: ifnull          142
        //   132: aload           11
        //   134: aload_2        
        //   135: invokestatic    java/util/Collections.addAll:(Ljava/util/Collection;[Ljava/lang/Object;)Z
        //   138: pop            
        //   139: goto            142
        //   142: new             Ljava/lang/StringBuilder;
        //   145: dup            
        //   146: invokespecial   java/lang/StringBuilder.<init>:()V
        //   149: astore_2       
        //   150: aload_2        
        //   151: ldc             "--aot-shared-library-name="
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: pop            
        //   157: aload_2        
        //   158: aload_0        
        //   159: getfield        y5/f.d:Ly5/b;
        //   162: getfield        y5/b.a:Ljava/lang/String;
        //   165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   168: pop            
        //   169: aload           11
        //   171: aload_2        
        //   172: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   175: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   180: pop            
        //   181: new             Ljava/lang/StringBuilder;
        //   184: dup            
        //   185: invokespecial   java/lang/StringBuilder.<init>:()V
        //   188: astore_2       
        //   189: aload_2        
        //   190: ldc             "--aot-shared-library-name="
        //   192: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   195: pop            
        //   196: aload_2        
        //   197: aload_0        
        //   198: getfield        y5/f.d:Ly5/b;
        //   201: getfield        y5/b.f:Ljava/lang/String;
        //   204: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   207: pop            
        //   208: aload_2        
        //   209: aload           12
        //   211: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   214: pop            
        //   215: aload_2        
        //   216: aload_0        
        //   217: getfield        y5/f.d:Ly5/b;
        //   220: getfield        y5/b.a:Ljava/lang/String;
        //   223: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   226: pop            
        //   227: aload           11
        //   229: aload_2        
        //   230: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   233: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   238: pop            
        //   239: new             Ljava/lang/StringBuilder;
        //   242: dup            
        //   243: invokespecial   java/lang/StringBuilder.<init>:()V
        //   246: astore_2       
        //   247: aload_2        
        //   248: ldc             "--cache-dir-path="
        //   250: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   253: pop            
        //   254: aload_2        
        //   255: aload           10
        //   257: getfield        y5/f$b.b:Ljava/lang/String;
        //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   263: pop            
        //   264: aload           11
        //   266: aload_2        
        //   267: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   270: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   275: pop            
        //   276: aload_0        
        //   277: getfield        y5/f.d:Ly5/b;
        //   280: getfield        y5/b.e:Ljava/lang/String;
        //   283: ifnull          325
        //   286: new             Ljava/lang/StringBuilder;
        //   289: dup            
        //   290: invokespecial   java/lang/StringBuilder.<init>:()V
        //   293: astore_2       
        //   294: aload_2        
        //   295: ldc             "--domain-network-policy="
        //   297: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   300: pop            
        //   301: aload_2        
        //   302: aload_0        
        //   303: getfield        y5/f.d:Ly5/b;
        //   306: getfield        y5/b.e:Ljava/lang/String;
        //   309: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   312: pop            
        //   313: aload           11
        //   315: aload_2        
        //   316: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   319: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   324: pop            
        //   325: aload_0        
        //   326: getfield        y5/f.b:Ly5/f$c;
        //   329: invokevirtual   y5/f$c.a:()Ljava/lang/String;
        //   332: ifnull          374
        //   335: new             Ljava/lang/StringBuilder;
        //   338: dup            
        //   339: invokespecial   java/lang/StringBuilder.<init>:()V
        //   342: astore_2       
        //   343: aload_2        
        //   344: ldc             "--log-tag="
        //   346: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   349: pop            
        //   350: aload_2        
        //   351: aload_0        
        //   352: getfield        y5/f.b:Ly5/f$c;
        //   355: invokevirtual   y5/f$c.a:()Ljava/lang/String;
        //   358: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   361: pop            
        //   362: aload           11
        //   364: aload_2        
        //   365: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   368: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   373: pop            
        //   374: aload_1        
        //   375: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   378: aload_1        
        //   379: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   382: sipush          128
        //   385: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   388: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //   391: astore_2       
        //   392: aload_2        
        //   393: ifnull          901
        //   396: aload_2        
        //   397: ldc             "io.flutter.embedding.android.OldGenHeapSize"
        //   399: invokevirtual   android/os/BaseBundle.getInt:(Ljava/lang/String;)I
        //   402: istore_3       
        //   403: goto            406
        //   406: iload_3        
        //   407: ifne            906
        //   410: aload_1        
        //   411: ldc             "activity"
        //   413: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   416: checkcast       Landroid/app/ActivityManager;
        //   419: astore          12
        //   421: new             Landroid/app/ActivityManager$MemoryInfo;
        //   424: dup            
        //   425: invokespecial   android/app/ActivityManager$MemoryInfo.<init>:()V
        //   428: astore          13
        //   430: aload           12
        //   432: aload           13
        //   434: invokevirtual   android/app/ActivityManager.getMemoryInfo:(Landroid/app/ActivityManager$MemoryInfo;)V
        //   437: aload           13
        //   439: getfield        android/app/ActivityManager$MemoryInfo.totalMem:J
        //   442: l2d            
        //   443: ldc2_w          1000000.0
        //   446: ddiv           
        //   447: ldc2_w          2.0
        //   450: ddiv           
        //   451: d2i            
        //   452: istore_3       
        //   453: goto            456
        //   456: new             Ljava/lang/StringBuilder;
        //   459: dup            
        //   460: invokespecial   java/lang/StringBuilder.<init>:()V
        //   463: astore          12
        //   465: aload           12
        //   467: ldc             "--old-gen-heap-size="
        //   469: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   472: pop            
        //   473: aload           12
        //   475: iload_3        
        //   476: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   479: pop            
        //   480: aload           11
        //   482: aload           12
        //   484: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   487: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   492: pop            
        //   493: aload_1        
        //   494: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   497: invokevirtual   android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
        //   500: astore          12
        //   502: aload           12
        //   504: getfield        android/util/DisplayMetrics.widthPixels:I
        //   507: istore_3       
        //   508: aload           12
        //   510: getfield        android/util/DisplayMetrics.heightPixels:I
        //   513: istore          4
        //   515: new             Ljava/lang/StringBuilder;
        //   518: dup            
        //   519: invokespecial   java/lang/StringBuilder.<init>:()V
        //   522: astore          12
        //   524: aload           12
        //   526: ldc             "--resource-cache-max-bytes-threshold="
        //   528: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   531: pop            
        //   532: aload           12
        //   534: iload_3        
        //   535: iload           4
        //   537: imul           
        //   538: bipush          48
        //   540: imul           
        //   541: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   544: pop            
        //   545: aload           11
        //   547: aload           12
        //   549: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   552: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   557: pop            
        //   558: aload           11
        //   560: ldc             "--prefetched-default-font-manager"
        //   562: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   567: pop            
        //   568: aload_2        
        //   569: ifnull          713
        //   572: aload_2        
        //   573: ldc_w           "io.flutter.embedding.android.EnableImpeller"
        //   576: iconst_0       
        //   577: invokevirtual   android/os/BaseBundle.getBoolean:(Ljava/lang/String;Z)Z
        //   580: ifeq            594
        //   583: aload           11
        //   585: ldc_w           "--enable-impeller"
        //   588: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   593: pop            
        //   594: aload_2        
        //   595: ldc_w           "io.flutter.embedding.android.EnableVulkanValidation"
        //   598: iconst_0       
        //   599: invokevirtual   android/os/BaseBundle.getBoolean:(Ljava/lang/String;Z)Z
        //   602: ifeq            616
        //   605: aload           11
        //   607: ldc_w           "--enable-vulkan-validation"
        //   610: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   615: pop            
        //   616: aload_2        
        //   617: ldc_w           "io.flutter.embedding.android.EnableOpenGLGPUTracing"
        //   620: iconst_0       
        //   621: invokevirtual   android/os/BaseBundle.getBoolean:(Ljava/lang/String;Z)Z
        //   624: ifeq            638
        //   627: aload           11
        //   629: ldc_w           "--enable-opengl-gpu-tracing"
        //   632: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   637: pop            
        //   638: aload_2        
        //   639: ldc_w           "io.flutter.embedding.android.EnableVulkanGPUTracing"
        //   642: iconst_0       
        //   643: invokevirtual   android/os/BaseBundle.getBoolean:(Ljava/lang/String;Z)Z
        //   646: ifeq            660
        //   649: aload           11
        //   651: ldc_w           "--enable-vulkan-gpu-tracing"
        //   654: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   659: pop            
        //   660: aload_2        
        //   661: ldc_w           "io.flutter.embedding.android.ImpellerBackend"
        //   664: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   667: astore          12
        //   669: aload           12
        //   671: ifnull          713
        //   674: new             Ljava/lang/StringBuilder;
        //   677: dup            
        //   678: invokespecial   java/lang/StringBuilder.<init>:()V
        //   681: astore          13
        //   683: aload           13
        //   685: ldc_w           "--impeller-backend="
        //   688: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   691: pop            
        //   692: aload           13
        //   694: aload           12
        //   696: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   699: pop            
        //   700: aload           11
        //   702: aload           13
        //   704: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   707: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   712: pop            
        //   713: aload_2        
        //   714: invokestatic    y5/f.m:(Landroid/os/Bundle;)Z
        //   717: ifeq            909
        //   720: ldc_w           "true"
        //   723: astore_2       
        //   724: goto            727
        //   727: new             Ljava/lang/StringBuilder;
        //   730: dup            
        //   731: invokespecial   java/lang/StringBuilder.<init>:()V
        //   734: astore          12
        //   736: aload           12
        //   738: ldc_w           "--leak-vm="
        //   741: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   744: pop            
        //   745: aload           12
        //   747: aload_2        
        //   748: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   751: pop            
        //   752: aload           11
        //   754: aload           12
        //   756: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   759: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   764: pop            
        //   765: invokestatic    android/os/SystemClock.uptimeMillis:()J
        //   768: lstore          5
        //   770: aload_0        
        //   771: getfield        y5/f.c:J
        //   774: lstore          7
        //   776: aload_0        
        //   777: getfield        y5/f.e:Lio/flutter/embedding/engine/FlutterJNI;
        //   780: aload_1        
        //   781: aload           11
        //   783: iconst_0       
        //   784: anewarray       Ljava/lang/String;
        //   787: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   792: checkcast       [Ljava/lang/String;
        //   795: aconst_null    
        //   796: aload           10
        //   798: getfield        y5/f$b.a:Ljava/lang/String;
        //   801: aload           10
        //   803: getfield        y5/f$b.b:Ljava/lang/String;
        //   806: lload           5
        //   808: lload           7
        //   810: lsub           
        //   811: invokevirtual   io/flutter/embedding/engine/FlutterJNI.init:(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
        //   814: aload_0        
        //   815: iconst_1       
        //   816: putfield        y5/f.a:Z
        //   819: aload           9
        //   821: ifnull          834
        //   824: aload           9
        //   826: invokevirtual   T5/f.close:()V
        //   829: return         
        //   830: astore_1       
        //   831: goto            856
        //   834: return         
        //   835: aload           9
        //   837: ifnull          854
        //   840: aload           9
        //   842: invokevirtual   T5/f.close:()V
        //   845: goto            854
        //   848: astore_2       
        //   849: aload_1        
        //   850: aload_2        
        //   851: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   854: aload_1        
        //   855: athrow         
        //   856: ldc_w           "FlutterLoader"
        //   859: ldc_w           "Flutter initialization failed."
        //   862: aload_1        
        //   863: invokestatic    t5/b.c:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   866: new             Ljava/lang/RuntimeException;
        //   869: dup            
        //   870: aload_1        
        //   871: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   874: athrow         
        //   875: new             Ljava/lang/IllegalStateException;
        //   878: dup            
        //   879: ldc_w           "ensureInitializationComplete must be called after startInitialization"
        //   882: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   885: athrow         
        //   886: new             Ljava/lang/IllegalStateException;
        //   889: dup            
        //   890: ldc_w           "ensureInitializationComplete must be called on the main thread"
        //   893: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   896: athrow         
        //   897: astore_1       
        //   898: goto            835
        //   901: iconst_0       
        //   902: istore_3       
        //   903: goto            406
        //   906: goto            456
        //   909: ldc_w           "false"
        //   912: astore_2       
        //   913: goto            727
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  24     31     830    834    Ljava/lang/Exception;
        //  31     128    897    856    Any
        //  132    139    897    856    Any
        //  142    325    897    856    Any
        //  325    374    897    856    Any
        //  374    392    897    856    Any
        //  396    403    897    856    Any
        //  410    453    897    856    Any
        //  456    568    897    856    Any
        //  572    594    897    856    Any
        //  594    616    897    856    Any
        //  616    638    897    856    Any
        //  638    660    897    856    Any
        //  660    669    897    856    Any
        //  674    713    897    856    Any
        //  713    720    897    856    Any
        //  727    819    897    856    Any
        //  824    829    830    834    Ljava/lang/Exception;
        //  840    845    848    854    Any
        //  849    854    830    834    Ljava/lang/Exception;
        //  854    856    830    834    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0142:
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
    
    public void i(final Context context, final String[] array, final Handler handler, final Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (this.a) {
            handler.post(runnable);
            return;
        }
        this.f.execute(new y5.c(this, context, array, handler, runnable));
    }
    
    public String j() {
        return this.d.d;
    }
    
    public final g k(final Context context) {
        return null;
    }
    
    public boolean l() {
        return this.a;
    }
    
    public void p(final Context context) {
        this.q(context, new c());
    }
    
    public void q(Context applicationContext, final c b) {
        if (this.b != null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            final T5.f i = T5.f.i("FlutterLoader#startInitialization");
            try {
                applicationContext = ((Context)applicationContext).getApplicationContext();
                this.b = b;
                this.c = SystemClock.uptimeMillis();
                this.d = y5.a.e((Context)applicationContext);
                s.f((DisplayManager)((Context)applicationContext).getSystemService("display"), this.e).g();
                this.g = this.f.submit((Callable<Object>)new Callable() {
                    public b b() {
                        // 
                        // This method could not be decompiled.
                        // 
                        // Original Bytecode:
                        // 
                        //     2: invokestatic    T5/f.i:(Ljava/lang/String;)LT5/f;
                        //     5: astore_1       
                        //     6: aload_0        
                        //     7: getfield        y5/f$a.p:Ly5/f;
                        //    10: aload_0        
                        //    11: getfield        y5/f$a.o:Landroid/content/Context;
                        //    14: invokestatic    y5/f.c:(Ly5/f;Landroid/content/Context;)Ly5/g;
                        //    17: pop            
                        //    18: aload_0        
                        //    19: getfield        y5/f$a.p:Ly5/f;
                        //    22: invokestatic    y5/f.d:(Ly5/f;)Lio/flutter/embedding/engine/FlutterJNI;
                        //    25: invokevirtual   io/flutter/embedding/engine/FlutterJNI.loadLibrary:()V
                        //    28: aload_0        
                        //    29: getfield        y5/f$a.p:Ly5/f;
                        //    32: invokestatic    y5/f.d:(Ly5/f;)Lio/flutter/embedding/engine/FlutterJNI;
                        //    35: invokevirtual   io/flutter/embedding/engine/FlutterJNI.updateRefreshRate:()V
                        //    38: aload_0        
                        //    39: getfield        y5/f$a.p:Ly5/f;
                        //    42: invokestatic    y5/f.f:(Ly5/f;)Ljava/util/concurrent/ExecutorService;
                        //    45: new             Ly5/e;
                        //    48: dup            
                        //    49: aload_0        
                        //    50: invokespecial   y5/e.<init>:(Ly5/f$a;)V
                        //    53: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
                        //    58: new             Ly5/f$b;
                        //    61: dup            
                        //    62: aload_0        
                        //    63: getfield        y5/f$a.o:Landroid/content/Context;
                        //    66: invokestatic    T5/c.d:(Landroid/content/Context;)Ljava/lang/String;
                        //    69: aload_0        
                        //    70: getfield        y5/f$a.o:Landroid/content/Context;
                        //    73: invokestatic    T5/c.a:(Landroid/content/Context;)Ljava/lang/String;
                        //    76: aload_0        
                        //    77: getfield        y5/f$a.o:Landroid/content/Context;
                        //    80: invokestatic    T5/c.c:(Landroid/content/Context;)Ljava/lang/String;
                        //    83: aconst_null    
                        //    84: invokespecial   y5/f$b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly5/f$a;)V
                        //    87: astore_2       
                        //    88: aload_1        
                        //    89: ifnull          96
                        //    92: aload_1        
                        //    93: invokevirtual   T5/f.close:()V
                        //    96: aload_2        
                        //    97: areturn        
                        //    98: astore_2       
                        //    99: goto            240
                        //   102: astore_2       
                        //   103: aload_2        
                        //   104: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                        //   107: ldc             "couldn't find \"libflutter.so\""
                        //   109: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
                        //   112: ifne            132
                        //   115: aload_2        
                        //   116: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
                        //   119: ldc             "dlopen failed: library \"libflutter.so\" not found"
                        //   121: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
                        //   124: ifeq            130
                        //   127: goto            132
                        //   130: aload_2        
                        //   131: athrow         
                        //   132: ldc             "os.arch"
                        //   134: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
                        //   137: astore_3       
                        //   138: new             Ljava/io/File;
                        //   141: dup            
                        //   142: aload_0        
                        //   143: getfield        y5/f$a.p:Ly5/f;
                        //   146: invokestatic    y5/f.e:(Ly5/f;)Ly5/b;
                        //   149: getfield        y5/b.f:Ljava/lang/String;
                        //   152: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
                        //   155: astore          4
                        //   157: aload           4
                        //   159: invokevirtual   java/io/File.list:()[Ljava/lang/String;
                        //   162: astore          5
                        //   164: new             Ljava/lang/StringBuilder;
                        //   167: dup            
                        //   168: invokespecial   java/lang/StringBuilder.<init>:()V
                        //   171: astore          6
                        //   173: aload           6
                        //   175: ldc             "Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: "
                        //   177: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   180: pop            
                        //   181: aload           6
                        //   183: aload_3        
                        //   184: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   187: pop            
                        //   188: aload           6
                        //   190: ldc             ", and the native libraries directory (with path "
                        //   192: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   195: pop            
                        //   196: aload           6
                        //   198: aload           4
                        //   200: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
                        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   206: pop            
                        //   207: aload           6
                        //   209: ldc             ") contains the following files: "
                        //   211: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   214: pop            
                        //   215: aload           6
                        //   217: aload           5
                        //   219: invokestatic    java/util/Arrays.toString:([Ljava/lang/Object;)Ljava/lang/String;
                        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                        //   225: pop            
                        //   226: new             Ljava/lang/UnsupportedOperationException;
                        //   229: dup            
                        //   230: aload           6
                        //   232: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                        //   235: aload_2        
                        //   236: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
                        //   239: athrow         
                        //   240: aload_1        
                        //   241: ifnull          257
                        //   244: aload_1        
                        //   245: invokevirtual   T5/f.close:()V
                        //   248: goto            257
                        //   251: astore_1       
                        //   252: aload_2        
                        //   253: aload_1        
                        //   254: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
                        //   257: aload_2        
                        //   258: athrow         
                        //    Exceptions:
                        //  Try           Handler
                        //  Start  End    Start  End    Type                            
                        //  -----  -----  -----  -----  --------------------------------
                        //  6      18     98     259    Any
                        //  18     28     102    240    Ljava/lang/UnsatisfiedLinkError;
                        //  18     28     98     259    Any
                        //  28     88     98     259    Any
                        //  103    127    98     259    Any
                        //  130    132    98     259    Any
                        //  132    240    98     259    Any
                        //  244    248    251    257    Any
                        // 
                        // The error that occurred was:
                        // 
                        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
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
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:494)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
                });
                if (i != null) {
                    i.close();
                }
                return;
            }
            finally {
                if (i != null) {
                    try {
                        i.close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)applicationContext).addSuppressed(exception);
                    }
                }
            }
        }
        throw new IllegalStateException("startInitialization must be called on the main thread");
    }
    
    public static class b
    {
        public final String a;
        public final String b;
        public final String c;
        
        public b(final String a, final String b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static class c
    {
        public String a;
        
        public String a() {
            return this.a;
        }
    }
}
