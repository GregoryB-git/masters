// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.dynamite;

import com.google.android.gms.common.util.DynamiteApi;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import I2.i;
import android.os.IBinder;
import java.lang.reflect.Field;
import android.util.Log;
import A2.m;
import A2.n;
import I2.f;
import android.content.Context;
import I2.k;
import I2.j;

public final class DynamiteModule
{
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static Boolean h;
    public static String i;
    public static boolean j = false;
    public static int k = -1;
    public static Boolean l;
    public static final ThreadLocal m;
    public static final ThreadLocal n;
    public static final b.a o;
    public static final b p;
    public static j q;
    public static k r;
    public final Context a;
    
    static {
        m = new ThreadLocal();
        n = new f();
        o = (b.a)new com.google.android.gms.dynamite.a();
        b = (b)new com.google.android.gms.dynamite.b();
        c = (b)new c();
        d = (b)new d();
        e = (b)new e();
        f = (b)new com.google.android.gms.dynamite.f();
        g = (b)new g();
        p = (b)new h();
    }
    
    public DynamiteModule(final Context a) {
        A2.n.i(a);
        this.a = a;
    }
    
    public static int a(final Context context, final String str) {
        while (true) {
            while (true) {
                try {
                    final ClassLoader classLoader = context.getApplicationContext().getClassLoader();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("com.google.android.gms.dynamite.descriptors.");
                    sb.append(str);
                    sb.append(".ModuleDescriptor");
                    final Class<?> loadClass = classLoader.loadClass(sb.toString());
                    final Field declaredField = loadClass.getDeclaredField("MODULE_ID");
                    final Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
                    if (!A2.m.a(declaredField.get(null), str)) {
                        final String value = String.valueOf(declaredField.get(null));
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Module descriptor id '");
                        sb2.append(value);
                        sb2.append("' didn't match expected id '");
                        sb2.append(str);
                        sb2.append("'");
                        Log.e("DynamiteModule", sb2.toString());
                        return 0;
                    }
                    return declaredField2.getInt(null);
                    final Exception ex;
                    Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(ex.getMessage())));
                    return 0;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Local module descriptor class for ");
                    sb3.append(str);
                    sb3.append(" not found.");
                    Log.w("DynamiteModule", sb3.toString());
                    return 0;
                }
                catch (ClassNotFoundException ex3) {
                    continue;
                }
                catch (Exception ex2) {}
                break;
            }
            final Exception ex2;
            final Exception ex = ex2;
            continue;
        }
    }
    
    public static int b(final Context context, final String s) {
        return e(context, s, false);
    }
    
    public static DynamiteModule d(final Context p0, final b p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          12
        //     5: aload           12
        //     7: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //    10: checkcast       LI2/h;
        //    13: astore          8
        //    15: new             LI2/h;
        //    18: dup            
        //    19: aconst_null    
        //    20: invokespecial   I2/h.<init>:(LI2/g;)V
        //    23: astore          9
        //    25: aload           12
        //    27: aload           9
        //    29: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //    32: getstatic       com/google/android/gms/dynamite/DynamiteModule.n:Ljava/lang/ThreadLocal;
        //    35: astore          13
        //    37: aload           13
        //    39: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //    42: checkcast       Ljava/lang/Long;
        //    45: astore          10
        //    47: aload           10
        //    49: invokevirtual   java/lang/Long.longValue:()J
        //    52: lstore          5
        //    54: aload           13
        //    56: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //    59: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    62: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //    65: aload_1        
        //    66: aload_0        
        //    67: aload_2        
        //    68: getstatic       com/google/android/gms/dynamite/DynamiteModule.o:Lcom/google/android/gms/dynamite/DynamiteModule$b$a;
        //    71: invokeinterface com/google/android/gms/dynamite/DynamiteModule$b.a:(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/dynamite/DynamiteModule$b$a;)Lcom/google/android/gms/dynamite/DynamiteModule$b$b;
        //    76: astore          11
        //    78: aload           11
        //    80: getfield        com/google/android/gms/dynamite/DynamiteModule$b$b.a:I
        //    83: istore_3       
        //    84: aload           11
        //    86: getfield        com/google/android/gms/dynamite/DynamiteModule$b$b.b:I
        //    89: istore          4
        //    91: new             Ljava/lang/StringBuilder;
        //    94: dup            
        //    95: invokespecial   java/lang/StringBuilder.<init>:()V
        //    98: astore          7
        //   100: aload           7
        //   102: ldc             "Considering local module "
        //   104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   107: pop            
        //   108: aload           7
        //   110: aload_2        
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   114: pop            
        //   115: aload           7
        //   117: ldc             ":"
        //   119: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   122: pop            
        //   123: aload           7
        //   125: iload_3        
        //   126: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   129: pop            
        //   130: aload           7
        //   132: ldc             " and remote module "
        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   137: pop            
        //   138: aload           7
        //   140: aload_2        
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: pop            
        //   145: aload           7
        //   147: ldc             ":"
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: pop            
        //   153: aload           7
        //   155: iload           4
        //   157: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   160: pop            
        //   161: ldc             "DynamiteModule"
        //   163: aload           7
        //   165: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   168: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   171: pop            
        //   172: aload           11
        //   174: getfield        com/google/android/gms/dynamite/DynamiteModule$b$b.c:I
        //   177: istore          4
        //   179: iload           4
        //   181: ifeq            1137
        //   184: iload           4
        //   186: istore_3       
        //   187: iload           4
        //   189: iconst_m1      
        //   190: if_icmpne       206
        //   193: aload           11
        //   195: getfield        com/google/android/gms/dynamite/DynamiteModule$b$b.a:I
        //   198: ifeq            1137
        //   201: iconst_m1      
        //   202: istore_3       
        //   203: goto            206
        //   206: iload_3        
        //   207: iconst_1       
        //   208: if_icmpne       219
        //   211: aload           11
        //   213: getfield        com/google/android/gms/dynamite/DynamiteModule$b$b.b:I
        //   216: ifeq            1137
        //   219: iload_3        
        //   220: iconst_m1      
        //   221: if_icmpne       277
        //   224: aload_0        
        //   225: aload_2        
        //   226: invokestatic    com/google/android/gms/dynamite/DynamiteModule.g:(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
        //   229: astore_0       
        //   230: lload           5
        //   232: lconst_0       
        //   233: lcmp           
        //   234: ifne            245
        //   237: aload           13
        //   239: invokevirtual   java/lang/ThreadLocal.remove:()V
        //   242: goto            252
        //   245: aload           13
        //   247: aload           10
        //   249: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //   252: aload           9
        //   254: getfield        I2/h.a:Landroid/database/Cursor;
        //   257: astore_1       
        //   258: aload_1        
        //   259: ifnull          268
        //   262: aload_1        
        //   263: invokeinterface android/database/Cursor.close:()V
        //   268: aload           12
        //   270: aload           8
        //   272: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //   275: aload_0        
        //   276: areturn        
        //   277: iload_3        
        //   278: iconst_1       
        //   279: if_icmpne       1102
        //   282: aload           11
        //   284: getfield        com/google/android/gms/dynamite/DynamiteModule$b$b.b:I
        //   287: istore          4
        //   289: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   291: monitorenter   
        //   292: aload_0        
        //   293: invokestatic    com/google/android/gms/dynamite/DynamiteModule.j:(Landroid/content/Context;)Z
        //   296: ifeq            898
        //   299: getstatic       com/google/android/gms/dynamite/DynamiteModule.h:Ljava/lang/Boolean;
        //   302: astore          7
        //   304: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   306: monitorexit    
        //   307: aload           7
        //   309: ifnull          881
        //   312: aload           7
        //   314: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   317: ifeq            597
        //   320: new             Ljava/lang/StringBuilder;
        //   323: dup            
        //   324: invokespecial   java/lang/StringBuilder.<init>:()V
        //   327: astore          7
        //   329: aload           7
        //   331: ldc_w           "Selected remote version of "
        //   334: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   337: pop            
        //   338: aload           7
        //   340: aload_2        
        //   341: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   344: pop            
        //   345: aload           7
        //   347: ldc_w           ", version >= "
        //   350: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   353: pop            
        //   354: aload           7
        //   356: iload           4
        //   358: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   361: pop            
        //   362: ldc             "DynamiteModule"
        //   364: aload           7
        //   366: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   369: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   372: pop            
        //   373: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   375: monitorenter   
        //   376: getstatic       com/google/android/gms/dynamite/DynamiteModule.r:LI2/k;
        //   379: astore          7
        //   381: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   383: monitorexit    
        //   384: aload           7
        //   386: ifnull          577
        //   389: aload           12
        //   391: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   394: checkcast       LI2/h;
        //   397: astore          15
        //   399: aload           15
        //   401: ifnull          565
        //   404: aload           15
        //   406: getfield        I2/h.a:Landroid/database/Cursor;
        //   409: ifnull          565
        //   412: aload_0        
        //   413: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //   416: astore          14
        //   418: aload           15
        //   420: getfield        I2/h.a:Landroid/database/Cursor;
        //   423: astore          15
        //   425: aconst_null    
        //   426: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //   429: pop            
        //   430: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   432: monitorenter   
        //   433: getstatic       com/google/android/gms/dynamite/DynamiteModule.k:I
        //   436: iconst_2       
        //   437: if_icmplt       1276
        //   440: iconst_1       
        //   441: istore_3       
        //   442: goto            445
        //   445: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   447: monitorexit    
        //   448: iload_3        
        //   449: ifeq            484
        //   452: ldc             "DynamiteModule"
        //   454: ldc_w           "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
        //   457: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   460: pop            
        //   461: aload           7
        //   463: aload           14
        //   465: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //   468: aload_2        
        //   469: iload           4
        //   471: aload           15
        //   473: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //   476: invokevirtual   I2/k.Z0:(LH2/a;Ljava/lang/String;ILH2/a;)LH2/a;
        //   479: astore          7
        //   481: goto            513
        //   484: ldc             "DynamiteModule"
        //   486: ldc_w           "Dynamite loader version < 2, falling back to loadModule2"
        //   489: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   492: pop            
        //   493: aload           7
        //   495: aload           14
        //   497: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //   500: aload_2        
        //   501: iload           4
        //   503: aload           15
        //   505: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //   508: invokevirtual   I2/k.v:(LH2/a;Ljava/lang/String;ILH2/a;)LH2/a;
        //   511: astore          7
        //   513: aload           7
        //   515: invokestatic    H2/b.v:(LH2/a;)Ljava/lang/Object;
        //   518: checkcast       Landroid/content/Context;
        //   521: astore          7
        //   523: aload           7
        //   525: ifnull          545
        //   528: new             Lcom/google/android/gms/dynamite/DynamiteModule;
        //   531: dup            
        //   532: aload           7
        //   534: invokespecial   com/google/android/gms/dynamite/DynamiteModule.<init>:(Landroid/content/Context;)V
        //   537: astore          7
        //   539: aload           7
        //   541: astore_0       
        //   542: goto            1296
        //   545: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   548: dup            
        //   549: ldc_w           "Failed to get module context"
        //   552: aconst_null    
        //   553: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;LI2/i;)V
        //   556: athrow         
        //   557: astore          7
        //   559: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   561: monitorexit    
        //   562: aload           7
        //   564: athrow         
        //   565: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   568: dup            
        //   569: ldc_w           "No result cursor"
        //   572: aconst_null    
        //   573: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;LI2/i;)V
        //   576: athrow         
        //   577: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   580: dup            
        //   581: ldc_w           "DynamiteLoaderV2 was not cached."
        //   584: aconst_null    
        //   585: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;LI2/i;)V
        //   588: athrow         
        //   589: astore          7
        //   591: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   593: monitorexit    
        //   594: aload           7
        //   596: athrow         
        //   597: new             Ljava/lang/StringBuilder;
        //   600: dup            
        //   601: invokespecial   java/lang/StringBuilder.<init>:()V
        //   604: astore          7
        //   606: aload           7
        //   608: ldc_w           "Selected remote version of "
        //   611: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   614: pop            
        //   615: aload           7
        //   617: aload_2        
        //   618: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   621: pop            
        //   622: aload           7
        //   624: ldc_w           ", version >= "
        //   627: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   630: pop            
        //   631: aload           7
        //   633: iload           4
        //   635: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   638: pop            
        //   639: ldc             "DynamiteModule"
        //   641: aload           7
        //   643: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   646: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   649: pop            
        //   650: aload_0        
        //   651: invokestatic    com/google/android/gms/dynamite/DynamiteModule.k:(Landroid/content/Context;)LI2/j;
        //   654: astore          7
        //   656: aload           7
        //   658: ifnull          869
        //   661: aload           7
        //   663: invokevirtual   I2/j.v:()I
        //   666: istore_3       
        //   667: iload_3        
        //   668: iconst_3       
        //   669: if_icmplt       724
        //   672: aload           12
        //   674: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   677: checkcast       LI2/h;
        //   680: astore          14
        //   682: aload           14
        //   684: ifnull          712
        //   687: aload           7
        //   689: aload_0        
        //   690: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //   693: aload_2        
        //   694: iload           4
        //   696: aload           14
        //   698: getfield        I2/h.a:Landroid/database/Cursor;
        //   701: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //   704: invokevirtual   I2/j.c1:(LH2/a;Ljava/lang/String;ILH2/a;)LH2/a;
        //   707: astore          7
        //   709: goto            778
        //   712: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   715: dup            
        //   716: ldc_w           "No cached result cursor holder"
        //   719: aconst_null    
        //   720: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;LI2/i;)V
        //   723: athrow         
        //   724: iload_3        
        //   725: iconst_2       
        //   726: if_icmpne       755
        //   729: ldc             "DynamiteModule"
        //   731: ldc_w           "IDynamite loader version = 2"
        //   734: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   737: pop            
        //   738: aload           7
        //   740: aload_0        
        //   741: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //   744: aload_2        
        //   745: iload           4
        //   747: invokevirtual   I2/j.d1:(LH2/a;Ljava/lang/String;I)LH2/a;
        //   750: astore          7
        //   752: goto            778
        //   755: ldc             "DynamiteModule"
        //   757: ldc_w           "Dynamite loader version < 2, falling back to createModuleContext"
        //   760: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   763: pop            
        //   764: aload           7
        //   766: aload_0        
        //   767: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //   770: aload_2        
        //   771: iload           4
        //   773: invokevirtual   I2/j.b1:(LH2/a;Ljava/lang/String;I)LH2/a;
        //   776: astore          7
        //   778: aload           7
        //   780: invokestatic    H2/b.v:(LH2/a;)Ljava/lang/Object;
        //   783: astore          7
        //   785: aload           7
        //   787: ifnull          857
        //   790: new             Lcom/google/android/gms/dynamite/DynamiteModule;
        //   793: dup            
        //   794: aload           7
        //   796: checkcast       Landroid/content/Context;
        //   799: invokespecial   com/google/android/gms/dynamite/DynamiteModule.<init>:(Landroid/content/Context;)V
        //   802: astore          7
        //   804: aload           7
        //   806: astore_0       
        //   807: goto            1296
        //   810: lload           5
        //   812: lconst_0       
        //   813: lcmp           
        //   814: ifne            825
        //   817: aload           13
        //   819: invokevirtual   java/lang/ThreadLocal.remove:()V
        //   822: goto            832
        //   825: aload           13
        //   827: aload           10
        //   829: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //   832: aload           9
        //   834: getfield        I2/h.a:Landroid/database/Cursor;
        //   837: astore_1       
        //   838: aload_1        
        //   839: ifnull          848
        //   842: aload_1        
        //   843: invokeinterface android/database/Cursor.close:()V
        //   848: aload           12
        //   850: aload           8
        //   852: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //   855: aload_0        
        //   856: areturn        
        //   857: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   860: dup            
        //   861: ldc_w           "Failed to load remote module."
        //   864: aconst_null    
        //   865: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;LI2/i;)V
        //   868: athrow         
        //   869: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   872: dup            
        //   873: ldc_w           "Failed to create IDynamiteLoader."
        //   876: aconst_null    
        //   877: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;LI2/i;)V
        //   880: athrow         
        //   881: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   884: dup            
        //   885: ldc_w           "Failed to determine which loading route to use."
        //   888: aconst_null    
        //   889: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;LI2/i;)V
        //   892: athrow         
        //   893: astore          7
        //   895: goto            910
        //   898: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   901: dup            
        //   902: ldc_w           "Remote loading disabled"
        //   905: aconst_null    
        //   906: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;LI2/i;)V
        //   909: athrow         
        //   910: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   912: monitorexit    
        //   913: aload           7
        //   915: athrow         
        //   916: aload_0        
        //   917: aload           7
        //   919: invokestatic    E2/g.a:(Landroid/content/Context;Ljava/lang/Throwable;)Z
        //   922: pop            
        //   923: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   926: dup            
        //   927: ldc_w           "Failed to load remote module."
        //   930: aload           7
        //   932: aconst_null    
        //   933: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;Ljava/lang/Throwable;LI2/i;)V
        //   936: athrow         
        //   937: aload           7
        //   939: athrow         
        //   940: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   943: dup            
        //   944: ldc_w           "Failed to load remote module."
        //   947: aload           7
        //   949: aconst_null    
        //   950: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;Ljava/lang/Throwable;LI2/i;)V
        //   953: athrow         
        //   954: aload           13
        //   956: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   959: astore          7
        //   961: new             Ljava/lang/StringBuilder;
        //   964: dup            
        //   965: invokespecial   java/lang/StringBuilder.<init>:()V
        //   968: astore          12
        //   970: aload           12
        //   972: ldc_w           "Failed to load remote module: "
        //   975: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   978: pop            
        //   979: aload           12
        //   981: aload           7
        //   983: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   986: pop            
        //   987: ldc             "DynamiteModule"
        //   989: aload           12
        //   991: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   994: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   997: pop            
        //   998: aload           11
        //  1000: getfield        com/google/android/gms/dynamite/DynamiteModule$b$b.a:I
        //  1003: istore_3       
        //  1004: iload_3        
        //  1005: ifeq            1088
        //  1008: aload_1        
        //  1009: aload_0        
        //  1010: aload_2        
        //  1011: new             Lcom/google/android/gms/dynamite/i;
        //  1014: dup            
        //  1015: iload_3        
        //  1016: iconst_0       
        //  1017: invokespecial   com/google/android/gms/dynamite/i.<init>:(II)V
        //  1020: invokeinterface com/google/android/gms/dynamite/DynamiteModule$b.a:(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/dynamite/DynamiteModule$b$a;)Lcom/google/android/gms/dynamite/DynamiteModule$b$b;
        //  1025: getfield        com/google/android/gms/dynamite/DynamiteModule$b$b.c:I
        //  1028: iconst_m1      
        //  1029: if_icmpne       1088
        //  1032: aload_0        
        //  1033: aload_2        
        //  1034: invokestatic    com/google/android/gms/dynamite/DynamiteModule.g:(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
        //  1037: astore_0       
        //  1038: lload           5
        //  1040: lconst_0       
        //  1041: lcmp           
        //  1042: ifne            1054
        //  1045: getstatic       com/google/android/gms/dynamite/DynamiteModule.n:Ljava/lang/ThreadLocal;
        //  1048: invokevirtual   java/lang/ThreadLocal.remove:()V
        //  1051: goto            1062
        //  1054: getstatic       com/google/android/gms/dynamite/DynamiteModule.n:Ljava/lang/ThreadLocal;
        //  1057: aload           10
        //  1059: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //  1062: aload           9
        //  1064: getfield        I2/h.a:Landroid/database/Cursor;
        //  1067: astore_1       
        //  1068: aload_1        
        //  1069: ifnull          1078
        //  1072: aload_1        
        //  1073: invokeinterface android/database/Cursor.close:()V
        //  1078: getstatic       com/google/android/gms/dynamite/DynamiteModule.m:Ljava/lang/ThreadLocal;
        //  1081: aload           8
        //  1083: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //  1086: aload_0        
        //  1087: areturn        
        //  1088: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  1091: dup            
        //  1092: ldc_w           "Remote load failed. No local fallback found."
        //  1095: aload           13
        //  1097: aconst_null    
        //  1098: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;Ljava/lang/Throwable;LI2/i;)V
        //  1101: athrow         
        //  1102: new             Ljava/lang/StringBuilder;
        //  1105: dup            
        //  1106: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1109: astore_0       
        //  1110: aload_0        
        //  1111: ldc_w           "VersionPolicy returned invalid code:"
        //  1114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1117: pop            
        //  1118: aload_0        
        //  1119: iload_3        
        //  1120: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1123: pop            
        //  1124: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  1127: dup            
        //  1128: aload_0        
        //  1129: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1132: aconst_null    
        //  1133: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;LI2/i;)V
        //  1136: athrow         
        //  1137: aload           11
        //  1139: getfield        com/google/android/gms/dynamite/DynamiteModule$b$b.a:I
        //  1142: istore_3       
        //  1143: aload           11
        //  1145: getfield        com/google/android/gms/dynamite/DynamiteModule$b$b.b:I
        //  1148: istore          4
        //  1150: new             Ljava/lang/StringBuilder;
        //  1153: dup            
        //  1154: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1157: astore_0       
        //  1158: aload_0        
        //  1159: ldc_w           "No acceptable module "
        //  1162: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1165: pop            
        //  1166: aload_0        
        //  1167: aload_2        
        //  1168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1171: pop            
        //  1172: aload_0        
        //  1173: ldc_w           " found. Local version is "
        //  1176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1179: pop            
        //  1180: aload_0        
        //  1181: iload_3        
        //  1182: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1185: pop            
        //  1186: aload_0        
        //  1187: ldc_w           " and remote version is "
        //  1190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1193: pop            
        //  1194: aload_0        
        //  1195: iload           4
        //  1197: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1200: pop            
        //  1201: aload_0        
        //  1202: ldc_w           "."
        //  1205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1208: pop            
        //  1209: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  1212: dup            
        //  1213: aload_0        
        //  1214: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1217: aconst_null    
        //  1218: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;LI2/i;)V
        //  1221: athrow         
        //  1222: lload           5
        //  1224: lconst_0       
        //  1225: lcmp           
        //  1226: ifne            1238
        //  1229: getstatic       com/google/android/gms/dynamite/DynamiteModule.n:Ljava/lang/ThreadLocal;
        //  1232: invokevirtual   java/lang/ThreadLocal.remove:()V
        //  1235: goto            1246
        //  1238: getstatic       com/google/android/gms/dynamite/DynamiteModule.n:Ljava/lang/ThreadLocal;
        //  1241: aload           10
        //  1243: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //  1246: aload           9
        //  1248: getfield        I2/h.a:Landroid/database/Cursor;
        //  1251: astore_1       
        //  1252: aload_1        
        //  1253: ifnull          1262
        //  1256: aload_1        
        //  1257: invokeinterface android/database/Cursor.close:()V
        //  1262: getstatic       com/google/android/gms/dynamite/DynamiteModule.m:Ljava/lang/ThreadLocal;
        //  1265: aload           8
        //  1267: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //  1270: aload_0        
        //  1271: athrow         
        //  1272: astore_0       
        //  1273: goto            1222
        //  1276: iconst_0       
        //  1277: istore_3       
        //  1278: goto            445
        //  1281: astore          7
        //  1283: goto            916
        //  1286: astore          7
        //  1288: goto            937
        //  1291: astore          7
        //  1293: goto            940
        //  1296: goto            810
        //  1299: astore          13
        //  1301: goto            954
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  54     179    1272   1276   Any
        //  193    201    1272   1276   Any
        //  211    219    1272   1276   Any
        //  224    230    1272   1276   Any
        //  282    289    1299   1102   Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  282    289    1272   1276   Any
        //  289    292    1291   954    Landroid/os/RemoteException;
        //  289    292    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  289    292    1281   937    Any
        //  292    307    893    916    Any
        //  312    376    1291   954    Landroid/os/RemoteException;
        //  312    376    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  312    376    1281   937    Any
        //  376    384    589    597    Any
        //  389    399    1291   954    Landroid/os/RemoteException;
        //  389    399    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  389    399    1281   937    Any
        //  404    433    1291   954    Landroid/os/RemoteException;
        //  404    433    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  404    433    1281   937    Any
        //  433    440    557    565    Any
        //  445    448    557    565    Any
        //  452    481    1291   954    Landroid/os/RemoteException;
        //  452    481    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  452    481    1281   937    Any
        //  484    513    1291   954    Landroid/os/RemoteException;
        //  484    513    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  484    513    1281   937    Any
        //  513    523    1291   954    Landroid/os/RemoteException;
        //  513    523    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  513    523    1281   937    Any
        //  528    539    1291   954    Landroid/os/RemoteException;
        //  528    539    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  528    539    1281   937    Any
        //  545    557    1291   954    Landroid/os/RemoteException;
        //  545    557    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  545    557    1281   937    Any
        //  559    562    557    565    Any
        //  562    565    1291   954    Landroid/os/RemoteException;
        //  562    565    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  562    565    1281   937    Any
        //  565    577    1291   954    Landroid/os/RemoteException;
        //  565    577    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  565    577    1281   937    Any
        //  577    589    1291   954    Landroid/os/RemoteException;
        //  577    589    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  577    589    1281   937    Any
        //  591    594    589    597    Any
        //  594    597    1291   954    Landroid/os/RemoteException;
        //  594    597    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  594    597    1281   937    Any
        //  597    656    1291   954    Landroid/os/RemoteException;
        //  597    656    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  597    656    1281   937    Any
        //  661    667    1291   954    Landroid/os/RemoteException;
        //  661    667    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  661    667    1281   937    Any
        //  672    682    1291   954    Landroid/os/RemoteException;
        //  672    682    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  672    682    1281   937    Any
        //  687    709    1291   954    Landroid/os/RemoteException;
        //  687    709    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  687    709    1281   937    Any
        //  712    724    1291   954    Landroid/os/RemoteException;
        //  712    724    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  712    724    1281   937    Any
        //  729    752    1291   954    Landroid/os/RemoteException;
        //  729    752    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  729    752    1281   937    Any
        //  755    778    1291   954    Landroid/os/RemoteException;
        //  755    778    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  755    778    1281   937    Any
        //  778    785    1291   954    Landroid/os/RemoteException;
        //  778    785    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  778    785    1281   937    Any
        //  790    804    1291   954    Landroid/os/RemoteException;
        //  790    804    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  790    804    1281   937    Any
        //  857    869    1291   954    Landroid/os/RemoteException;
        //  857    869    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  857    869    1281   937    Any
        //  869    881    1291   954    Landroid/os/RemoteException;
        //  869    881    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  869    881    1281   937    Any
        //  881    893    1291   954    Landroid/os/RemoteException;
        //  881    893    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  881    893    1281   937    Any
        //  898    910    893    916    Any
        //  910    913    893    916    Any
        //  913    916    1291   954    Landroid/os/RemoteException;
        //  913    916    1286   940    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  913    916    1281   937    Any
        //  916    937    1299   1102   Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  916    937    1272   1276   Any
        //  937    940    1299   1102   Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  937    940    1272   1276   Any
        //  940    954    1299   1102   Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  940    954    1272   1276   Any
        //  954    1004   1272   1276   Any
        //  1008   1038   1272   1276   Any
        //  1088   1102   1272   1276   Any
        //  1102   1137   1272   1276   Any
        //  1137   1222   1272   1276   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0445:
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
    
    public static int e(final Context p0, final String p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       com/google/android/gms/dynamite/DynamiteModule.h:Ljava/lang/Boolean;
        //     6: astore          9
        //     8: aconst_null    
        //     9: astore          7
        //    11: aconst_null    
        //    12: astore          8
        //    14: aconst_null    
        //    15: astore          6
        //    17: aload           9
        //    19: astore          5
        //    21: aload           9
        //    23: ifnonnull       393
        //    26: aload_0        
        //    27: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //    30: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //    33: ldc             Lcom/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;.class
        //    35: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    38: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    41: ldc_w           "sClassLoader"
        //    44: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    47: astore          10
        //    49: aload           10
        //    51: invokevirtual   java/lang/reflect/Field.getDeclaringClass:()Ljava/lang/Class;
        //    54: astore          9
        //    56: aload           9
        //    58: monitorenter   
        //    59: aload           10
        //    61: aconst_null    
        //    62: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    65: checkcast       Ljava/lang/ClassLoader;
        //    68: astore          5
        //    70: aload           5
        //    72: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //    75: if_acmpne       91
        //    78: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //    81: astore          5
        //    83: goto            315
        //    86: astore          5
        //    88: goto            321
        //    91: aload           5
        //    93: ifnull          109
        //    96: aload           5
        //    98: invokestatic    com/google/android/gms/dynamite/DynamiteModule.h:(Ljava/lang/ClassLoader;)V
        //   101: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   104: astore          5
        //   106: goto            315
        //   109: aload_0        
        //   110: invokestatic    com/google/android/gms/dynamite/DynamiteModule.j:(Landroid/content/Context;)Z
        //   113: ifne            128
        //   116: aload           9
        //   118: monitorexit    
        //   119: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   121: monitorexit    
        //   122: iconst_0       
        //   123: ireturn        
        //   124: astore_1       
        //   125: goto            831
        //   128: getstatic       com/google/android/gms/dynamite/DynamiteModule.j:Z
        //   131: ifne            303
        //   134: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   137: astore          11
        //   139: aload           11
        //   141: aconst_null    
        //   142: invokevirtual   java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        //   145: istore          4
        //   147: iload           4
        //   149: ifeq            155
        //   152: goto            303
        //   155: aload_0        
        //   156: aload_1        
        //   157: iload_2        
        //   158: iconst_1       
        //   159: invokestatic    com/google/android/gms/dynamite/DynamiteModule.f:(Landroid/content/Context;Ljava/lang/String;ZZ)I
        //   162: istore_3       
        //   163: getstatic       com/google/android/gms/dynamite/DynamiteModule.i:Ljava/lang/String;
        //   166: astore          5
        //   168: aload           5
        //   170: ifnull          283
        //   173: aload           5
        //   175: invokevirtual   java/lang/String.isEmpty:()Z
        //   178: ifeq            184
        //   181: goto            283
        //   184: invokestatic    I2/d.a:()Ljava/lang/ClassLoader;
        //   187: astore          5
        //   189: aload           5
        //   191: ifnull          197
        //   194: goto            257
        //   197: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   200: bipush          29
        //   202: if_icmplt       232
        //   205: invokestatic    I2/b.a:()V
        //   208: getstatic       com/google/android/gms/dynamite/DynamiteModule.i:Ljava/lang/String;
        //   211: astore          5
        //   213: aload           5
        //   215: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //   218: pop            
        //   219: aload           5
        //   221: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   224: invokestatic    I2/a.a:(Ljava/lang/String;Ljava/lang/ClassLoader;)Ldalvik/system/DelegateLastClassLoader;
        //   227: astore          5
        //   229: goto            257
        //   232: getstatic       com/google/android/gms/dynamite/DynamiteModule.i:Ljava/lang/String;
        //   235: astore          5
        //   237: aload           5
        //   239: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //   242: pop            
        //   243: new             LI2/e;
        //   246: dup            
        //   247: aload           5
        //   249: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   252: invokespecial   I2/e.<init>:(Ljava/lang/String;Ljava/lang/ClassLoader;)V
        //   255: astore          5
        //   257: aload           5
        //   259: invokestatic    com/google/android/gms/dynamite/DynamiteModule.h:(Ljava/lang/ClassLoader;)V
        //   262: aload           10
        //   264: aconst_null    
        //   265: aload           5
        //   267: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   270: aload           11
        //   272: putstatic       com/google/android/gms/dynamite/DynamiteModule.h:Ljava/lang/Boolean;
        //   275: aload           9
        //   277: monitorexit    
        //   278: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   280: monitorexit    
        //   281: iload_3        
        //   282: ireturn        
        //   283: aload           9
        //   285: monitorexit    
        //   286: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   288: monitorexit    
        //   289: iload_3        
        //   290: ireturn        
        //   291: aload           10
        //   293: aconst_null    
        //   294: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   297: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   300: goto            78
        //   303: aload           10
        //   305: aconst_null    
        //   306: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   309: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   312: goto            78
        //   315: aload           9
        //   317: monitorexit    
        //   318: goto            388
        //   321: aload           9
        //   323: monitorexit    
        //   324: aload           5
        //   326: athrow         
        //   327: astore          5
        //   329: goto            339
        //   332: astore          5
        //   334: goto            339
        //   337: astore          5
        //   339: aload           5
        //   341: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   344: astore          5
        //   346: new             Ljava/lang/StringBuilder;
        //   349: dup            
        //   350: invokespecial   java/lang/StringBuilder.<init>:()V
        //   353: astore          9
        //   355: aload           9
        //   357: ldc_w           "Failed to load module via V2: "
        //   360: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   363: pop            
        //   364: aload           9
        //   366: aload           5
        //   368: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   371: pop            
        //   372: ldc             "DynamiteModule"
        //   374: aload           9
        //   376: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   379: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   382: pop            
        //   383: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   386: astore          5
        //   388: aload           5
        //   390: putstatic       com/google/android/gms/dynamite/DynamiteModule.h:Ljava/lang/Boolean;
        //   393: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   395: monitorexit    
        //   396: aload           5
        //   398: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   401: istore          4
        //   403: iload           4
        //   405: ifeq            466
        //   408: aload_0        
        //   409: aload_1        
        //   410: iload_2        
        //   411: iconst_0       
        //   412: invokestatic    com/google/android/gms/dynamite/DynamiteModule.f:(Landroid/content/Context;Ljava/lang/String;ZZ)I
        //   415: istore_3       
        //   416: iload_3        
        //   417: ireturn        
        //   418: astore_1       
        //   419: goto            836
        //   422: astore_1       
        //   423: aload_1        
        //   424: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   427: astore_1       
        //   428: new             Ljava/lang/StringBuilder;
        //   431: dup            
        //   432: invokespecial   java/lang/StringBuilder.<init>:()V
        //   435: astore          5
        //   437: aload           5
        //   439: ldc_w           "Failed to retrieve remote module version: "
        //   442: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   445: pop            
        //   446: aload           5
        //   448: aload_1        
        //   449: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   452: pop            
        //   453: ldc             "DynamiteModule"
        //   455: aload           5
        //   457: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   460: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   463: pop            
        //   464: iconst_0       
        //   465: ireturn        
        //   466: aload_0        
        //   467: invokestatic    com/google/android/gms/dynamite/DynamiteModule.k:(Landroid/content/Context;)LI2/j;
        //   470: astore          9
        //   472: aload           9
        //   474: ifnonnull       479
        //   477: iconst_0       
        //   478: ireturn        
        //   479: aload           8
        //   481: astore          5
        //   483: aload           9
        //   485: invokevirtual   I2/j.v:()I
        //   488: istore_3       
        //   489: iload_3        
        //   490: iconst_3       
        //   491: if_icmplt       675
        //   494: aload           8
        //   496: astore          5
        //   498: getstatic       com/google/android/gms/dynamite/DynamiteModule.m:Ljava/lang/ThreadLocal;
        //   501: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   504: checkcast       LI2/h;
        //   507: astore          10
        //   509: aload           10
        //   511: ifnull          543
        //   514: aload           8
        //   516: astore          5
        //   518: aload           10
        //   520: getfield        I2/h.a:Landroid/database/Cursor;
        //   523: astore          10
        //   525: aload           10
        //   527: ifnull          543
        //   530: aload           8
        //   532: astore          5
        //   534: aload           10
        //   536: iconst_0       
        //   537: invokeinterface android/database/Cursor.getInt:(I)I
        //   542: ireturn        
        //   543: aload           8
        //   545: astore          5
        //   547: aload           9
        //   549: aload_0        
        //   550: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //   553: aload_1        
        //   554: iload_2        
        //   555: getstatic       com/google/android/gms/dynamite/DynamiteModule.n:Ljava/lang/ThreadLocal;
        //   558: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   561: checkcast       Ljava/lang/Long;
        //   564: invokevirtual   java/lang/Long.longValue:()J
        //   567: invokevirtual   I2/j.e1:(LH2/a;Ljava/lang/String;ZJ)LH2/a;
        //   570: invokestatic    H2/b.v:(LH2/a;)Ljava/lang/Object;
        //   573: checkcast       Landroid/database/Cursor;
        //   576: astore_1       
        //   577: aload_1        
        //   578: ifnull          642
        //   581: aload_1        
        //   582: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   587: ifne            593
        //   590: goto            642
        //   593: aload_1        
        //   594: iconst_0       
        //   595: invokeinterface android/database/Cursor.getInt:(I)I
        //   600: istore_3       
        //   601: iload_3        
        //   602: ifle            630
        //   605: aload_1        
        //   606: invokestatic    com/google/android/gms/dynamite/DynamiteModule.i:(Landroid/database/Cursor;)Z
        //   609: istore_2       
        //   610: iload_2        
        //   611: ifeq            630
        //   614: aload           6
        //   616: astore_1       
        //   617: goto            630
        //   620: astore          6
        //   622: goto            663
        //   625: astore          6
        //   627: goto            672
        //   630: aload_1        
        //   631: ifnull          640
        //   634: aload_1        
        //   635: invokeinterface android/database/Cursor.close:()V
        //   640: iload_3        
        //   641: ireturn        
        //   642: ldc             "DynamiteModule"
        //   644: ldc_w           "Failed to retrieve remote module version."
        //   647: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   650: pop            
        //   651: aload_1        
        //   652: ifnull          859
        //   655: aload_1        
        //   656: invokeinterface android/database/Cursor.close:()V
        //   661: iconst_0       
        //   662: ireturn        
        //   663: aload_1        
        //   664: astore          5
        //   666: aload           6
        //   668: astore_1       
        //   669: goto            817
        //   672: goto            746
        //   675: iload_3        
        //   676: iconst_2       
        //   677: if_icmpne       709
        //   680: aload           8
        //   682: astore          5
        //   684: ldc             "DynamiteModule"
        //   686: ldc_w           "IDynamite loader version = 2, no high precision latency measurement."
        //   689: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   692: pop            
        //   693: aload           8
        //   695: astore          5
        //   697: aload           9
        //   699: aload_0        
        //   700: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //   703: aload_1        
        //   704: iload_2        
        //   705: invokevirtual   I2/j.a1:(LH2/a;Ljava/lang/String;Z)I
        //   708: ireturn        
        //   709: aload           8
        //   711: astore          5
        //   713: ldc             "DynamiteModule"
        //   715: ldc_w           "IDynamite loader version < 2, falling back to getModuleVersion2"
        //   718: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   721: pop            
        //   722: aload           8
        //   724: astore          5
        //   726: aload           9
        //   728: aload_0        
        //   729: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //   732: aload_1        
        //   733: iload_2        
        //   734: invokevirtual   I2/j.Z0:(LH2/a;Ljava/lang/String;Z)I
        //   737: istore_3       
        //   738: iload_3        
        //   739: ireturn        
        //   740: goto            817
        //   743: aload           7
        //   745: astore_1       
        //   746: aload_1        
        //   747: astore          5
        //   749: aload           6
        //   751: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   754: astore          6
        //   756: aload_1        
        //   757: astore          5
        //   759: new             Ljava/lang/StringBuilder;
        //   762: dup            
        //   763: invokespecial   java/lang/StringBuilder.<init>:()V
        //   766: astore          7
        //   768: aload_1        
        //   769: astore          5
        //   771: aload           7
        //   773: ldc_w           "Failed to retrieve remote module version: "
        //   776: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   779: pop            
        //   780: aload_1        
        //   781: astore          5
        //   783: aload           7
        //   785: aload           6
        //   787: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   790: pop            
        //   791: aload_1        
        //   792: astore          5
        //   794: ldc             "DynamiteModule"
        //   796: aload           7
        //   798: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   801: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   804: pop            
        //   805: aload_1        
        //   806: ifnull          859
        //   809: aload_1        
        //   810: invokeinterface android/database/Cursor.close:()V
        //   815: iconst_0       
        //   816: ireturn        
        //   817: aload           5
        //   819: ifnull          829
        //   822: aload           5
        //   824: invokeinterface android/database/Cursor.close:()V
        //   829: aload_1        
        //   830: athrow         
        //   831: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   833: monitorexit    
        //   834: aload_1        
        //   835: athrow         
        //   836: aload_0        
        //   837: aload_1        
        //   838: invokestatic    E2/g.a:(Landroid/content/Context;Ljava/lang/Throwable;)Z
        //   841: pop            
        //   842: aload_1        
        //   843: athrow         
        //   844: astore          5
        //   846: goto            101
        //   849: astore          5
        //   851: goto            291
        //   854: astore          6
        //   856: goto            743
        //   859: iconst_0       
        //   860: ireturn        
        //   861: astore_1       
        //   862: goto            740
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  0      3      418    422    Any
        //  3      8      124    836    Any
        //  26     59     337    339    Ljava/lang/ClassNotFoundException;
        //  26     59     332    337    Ljava/lang/IllegalAccessException;
        //  26     59     327    332    Ljava/lang/NoSuchFieldException;
        //  26     59     124    836    Any
        //  59     78     86     327    Any
        //  78     83     86     327    Any
        //  96     101    844    849    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  96     101    86     327    Any
        //  101    106    86     327    Any
        //  109    119    86     327    Any
        //  119    122    124    836    Any
        //  128    147    86     327    Any
        //  155    168    849    303    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  155    168    86     327    Any
        //  173    181    849    303    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  173    181    86     327    Any
        //  184    189    849    303    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  184    189    86     327    Any
        //  197    229    849    303    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  197    229    86     327    Any
        //  232    257    849    303    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  232    257    86     327    Any
        //  257    275    849    303    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  257    275    86     327    Any
        //  275    278    86     327    Any
        //  278    281    124    836    Any
        //  283    286    86     327    Any
        //  286    289    124    836    Any
        //  291    300    86     327    Any
        //  303    312    86     327    Any
        //  315    318    86     327    Any
        //  321    324    86     327    Any
        //  324    327    337    339    Ljava/lang/ClassNotFoundException;
        //  324    327    332    337    Ljava/lang/IllegalAccessException;
        //  324    327    327    332    Ljava/lang/NoSuchFieldException;
        //  324    327    124    836    Any
        //  339    388    124    836    Any
        //  388    393    124    836    Any
        //  393    396    124    836    Any
        //  396    403    418    422    Any
        //  408    416    422    466    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  408    416    418    422    Any
        //  423    464    418    422    Any
        //  466    472    418    422    Any
        //  483    489    854    746    Landroid/os/RemoteException;
        //  483    489    861    743    Any
        //  498    509    854    746    Landroid/os/RemoteException;
        //  498    509    861    743    Any
        //  518    525    854    746    Landroid/os/RemoteException;
        //  518    525    861    743    Any
        //  534    543    854    746    Landroid/os/RemoteException;
        //  534    543    861    743    Any
        //  547    577    854    746    Landroid/os/RemoteException;
        //  547    577    861    743    Any
        //  581    590    625    630    Landroid/os/RemoteException;
        //  581    590    620    625    Any
        //  593    601    625    630    Landroid/os/RemoteException;
        //  593    601    620    625    Any
        //  605    610    625    630    Landroid/os/RemoteException;
        //  605    610    620    625    Any
        //  634    640    418    422    Any
        //  642    651    625    630    Landroid/os/RemoteException;
        //  642    651    620    625    Any
        //  655    661    418    422    Any
        //  684    693    854    746    Landroid/os/RemoteException;
        //  684    693    861    743    Any
        //  697    709    854    746    Landroid/os/RemoteException;
        //  697    709    861    743    Any
        //  713    722    854    746    Landroid/os/RemoteException;
        //  713    722    861    743    Any
        //  726    738    854    746    Landroid/os/RemoteException;
        //  726    738    861    743    Any
        //  749    756    861    743    Any
        //  759    768    861    743    Any
        //  771    780    861    743    Any
        //  783    791    861    743    Any
        //  794    805    861    743    Any
        //  809    815    418    422    Any
        //  822    829    418    422    Any
        //  829    831    418    422    Any
        //  831    834    124    836    Any
        //  834    836    418    422    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 417 out of bounds for length 417
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
    
    public static int f(final Context p0, final String p1, final boolean p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          11
        //     3: getstatic       com/google/android/gms/dynamite/DynamiteModule.n:Ljava/lang/ThreadLocal;
        //     6: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //     9: checkcast       Ljava/lang/Long;
        //    12: invokevirtual   java/lang/Long.longValue:()J
        //    15: lstore          8
        //    17: aload_0        
        //    18: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    21: astore          10
        //    23: ldc_w           "api_force_staging"
        //    26: astore_0       
        //    27: iconst_1       
        //    28: istore          7
        //    30: iconst_1       
        //    31: iload_2        
        //    32: if_icmpeq       39
        //    35: ldc_w           "api"
        //    38: astore_0       
        //    39: aload           10
        //    41: new             Landroid/net/Uri$Builder;
        //    44: dup            
        //    45: invokespecial   android/net/Uri$Builder.<init>:()V
        //    48: ldc_w           "content"
        //    51: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    54: ldc_w           "com.google.android.gms.chimera"
        //    57: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    60: aload_0        
        //    61: invokevirtual   android/net/Uri$Builder.path:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    64: aload_1        
        //    65: invokevirtual   android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    68: ldc_w           "requestStartTime"
        //    71: lload           8
        //    73: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    76: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    79: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //    82: aconst_null    
        //    83: aconst_null    
        //    84: aconst_null    
        //    85: aconst_null    
        //    86: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    89: astore          10
        //    91: aload           10
        //    93: ifnull          318
        //    96: aload           10
        //    98: astore_0       
        //    99: aload           10
        //   101: astore_1       
        //   102: aload           10
        //   104: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   109: ifeq            318
        //   112: iconst_0       
        //   113: istore          6
        //   115: iconst_0       
        //   116: istore_2       
        //   117: aload           10
        //   119: astore_0       
        //   120: aload           10
        //   122: astore_1       
        //   123: aload           10
        //   125: iconst_0       
        //   126: invokeinterface android/database/Cursor.getInt:(I)I
        //   131: istore          4
        //   133: aload           10
        //   135: astore_1       
        //   136: iload           4
        //   138: ifle            415
        //   141: aload           10
        //   143: astore_0       
        //   144: aload           10
        //   146: astore_1       
        //   147: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   149: monitorenter   
        //   150: aload           10
        //   152: iconst_2       
        //   153: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   158: putstatic       com/google/android/gms/dynamite/DynamiteModule.i:Ljava/lang/String;
        //   161: aload           10
        //   163: ldc_w           "loaderVersion"
        //   166: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   171: istore          5
        //   173: iload           5
        //   175: iflt            193
        //   178: aload           10
        //   180: iload           5
        //   182: invokeinterface android/database/Cursor.getInt:(I)I
        //   187: putstatic       com/google/android/gms/dynamite/DynamiteModule.k:I
        //   190: goto            193
        //   193: aload           10
        //   195: ldc_w           "disableStandaloneDynamiteLoader2"
        //   198: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   203: istore          5
        //   205: iload           5
        //   207: iflt            232
        //   210: aload           10
        //   212: iload           5
        //   214: invokeinterface android/database/Cursor.getInt:(I)I
        //   219: ifeq            410
        //   222: iload           7
        //   224: istore_2       
        //   225: goto            228
        //   228: iload_2        
        //   229: putstatic       com/google/android/gms/dynamite/DynamiteModule.j:Z
        //   232: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   234: monitorexit    
        //   235: aload           10
        //   237: astore_0       
        //   238: aload           10
        //   240: astore_1       
        //   241: aload           10
        //   243: invokestatic    com/google/android/gms/dynamite/DynamiteModule.i:(Landroid/database/Cursor;)Z
        //   246: istore          7
        //   248: aload           10
        //   250: astore_1       
        //   251: iload_2        
        //   252: istore          6
        //   254: iload           7
        //   256: ifeq            415
        //   259: aconst_null    
        //   260: astore_1       
        //   261: iload_2        
        //   262: istore          6
        //   264: goto            415
        //   267: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   269: monitorexit    
        //   270: aload           10
        //   272: astore_0       
        //   273: aload           10
        //   275: astore_1       
        //   276: aload           11
        //   278: athrow         
        //   279: aload_1        
        //   280: astore_0       
        //   281: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   284: dup            
        //   285: ldc_w           "forcing fallback to container DynamiteLoader impl"
        //   288: aconst_null    
        //   289: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;LI2/i;)V
        //   292: athrow         
        //   293: astore_1       
        //   294: goto            302
        //   297: astore          10
        //   299: goto            362
        //   302: goto            393
        //   305: aload_1        
        //   306: ifnull          315
        //   309: aload_1        
        //   310: invokeinterface android/database/Cursor.close:()V
        //   315: iload           4
        //   317: ireturn        
        //   318: aload           10
        //   320: astore_0       
        //   321: aload           10
        //   323: astore_1       
        //   324: ldc             "DynamiteModule"
        //   326: ldc_w           "Failed to retrieve remote module version."
        //   329: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   332: pop            
        //   333: aload           10
        //   335: astore_0       
        //   336: aload           10
        //   338: astore_1       
        //   339: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   342: dup            
        //   343: ldc_w           "Failed to connect to dynamite module ContentResolver."
        //   346: aconst_null    
        //   347: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;LI2/i;)V
        //   350: athrow         
        //   351: astore_1       
        //   352: aload           11
        //   354: astore_0       
        //   355: goto            393
        //   358: astore          10
        //   360: aconst_null    
        //   361: astore_1       
        //   362: aload_1        
        //   363: astore_0       
        //   364: aload           10
        //   366: instanceof      Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   369: ifeq            377
        //   372: aload_1        
        //   373: astore_0       
        //   374: aload           10
        //   376: athrow         
        //   377: aload_1        
        //   378: astore_0       
        //   379: new             Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //   382: dup            
        //   383: ldc_w           "V2 version check failed"
        //   386: aload           10
        //   388: aconst_null    
        //   389: invokespecial   com/google/android/gms/dynamite/DynamiteModule$a.<init>:(Ljava/lang/String;Ljava/lang/Throwable;LI2/i;)V
        //   392: athrow         
        //   393: aload_0        
        //   394: ifnull          403
        //   397: aload_0        
        //   398: invokeinterface android/database/Cursor.close:()V
        //   403: aload_1        
        //   404: athrow         
        //   405: astore          11
        //   407: goto            267
        //   410: iconst_0       
        //   411: istore_2       
        //   412: goto            228
        //   415: iload_3        
        //   416: ifeq            305
        //   419: iload           6
        //   421: ifne            279
        //   424: goto            305
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      23     358    362    Ljava/lang/Exception;
        //  3      23     351    358    Any
        //  39     91     358    362    Ljava/lang/Exception;
        //  39     91     351    358    Any
        //  102    112    297    302    Ljava/lang/Exception;
        //  102    112    293    297    Any
        //  123    133    297    302    Ljava/lang/Exception;
        //  123    133    293    297    Any
        //  147    150    297    302    Ljava/lang/Exception;
        //  147    150    293    297    Any
        //  150    173    405    279    Any
        //  178    190    405    279    Any
        //  193    205    405    279    Any
        //  210    222    405    279    Any
        //  228    232    405    279    Any
        //  232    235    405    279    Any
        //  241    248    297    302    Ljava/lang/Exception;
        //  241    248    293    297    Any
        //  267    270    405    279    Any
        //  276    279    297    302    Ljava/lang/Exception;
        //  276    279    293    297    Any
        //  281    293    297    302    Ljava/lang/Exception;
        //  281    293    293    297    Any
        //  324    333    297    302    Ljava/lang/Exception;
        //  324    333    293    297    Any
        //  339    351    297    302    Ljava/lang/Exception;
        //  339    351    293    297    Any
        //  364    372    293    297    Any
        //  374    377    293    297    Any
        //  379    393    293    297    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0193:
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
    
    public static DynamiteModule g(final Context context, final String obj) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(obj)));
        return new DynamiteModule(context.getApplicationContext());
    }
    
    public static void h(final ClassLoader classLoader) {
        try {
            final IBinder binder = (IBinder)classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            k r;
            if (binder == null) {
                r = null;
            }
            else {
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof k) {
                    r = (k)queryLocalInterface;
                }
                else {
                    r = new k(binder);
                }
            }
            DynamiteModule.r = r;
        }
        catch (NoSuchMethodException ex) {
            throw new a("Failed to instantiate dynamite loader", ex, null);
        }
        catch (InvocationTargetException ex) {
            throw new a("Failed to instantiate dynamite loader", ex, null);
        }
        catch (InstantiationException ex) {
            throw new a("Failed to instantiate dynamite loader", ex, null);
        }
        catch (IllegalAccessException ex) {
            throw new a("Failed to instantiate dynamite loader", ex, null);
        }
        catch (ClassNotFoundException ex) {
            throw new a("Failed to instantiate dynamite loader", ex, null);
        }
    }
    
    public static boolean i(final Cursor a) {
        final I2.h h = DynamiteModule.m.get();
        if (h != null && h.a == null) {
            h.a = a;
            return true;
        }
        return false;
    }
    
    public static boolean j(final Context context) {
        final Boolean true = Boolean.TRUE;
        if (true.equals(null)) {
            return true;
        }
        if (true.equals(DynamiteModule.l)) {
            return true;
        }
        final Boolean l = DynamiteModule.l;
        boolean b = false;
        final boolean b2 = false;
        if (l == null) {
            final ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            boolean b3 = b2;
            if (x2.k.f().h(context, 10000000) == 0) {
                b3 = b2;
                if (resolveContentProvider != null) {
                    b3 = b2;
                    if ("com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        b3 = true;
                    }
                }
            }
            DynamiteModule.l = b3;
            if (b = b3) {
                b = b3;
                if (resolveContentProvider != null) {
                    final ApplicationInfo applicationInfo = resolveContentProvider.applicationInfo;
                    b = b3;
                    if (applicationInfo != null) {
                        b = b3;
                        if ((applicationInfo.flags & 0x81) == 0x0) {
                            Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                            DynamiteModule.j = true;
                            b = b3;
                        }
                    }
                }
            }
        }
        if (!b) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return b;
    }
    
    public static j k(final Context context) {
        // monitorenter(DynamiteModule.class)
        while (true) {
            Label_0020: {
                try {
                    final j q = DynamiteModule.q;
                    if (q != null) {
                        // monitorexit(DynamiteModule.class)
                        return q;
                    }
                    break Label_0020;
                }
                finally {
                    Label_0142: {
                        break Label_0142;
                        try {
                            final IBinder binder = (IBinder)context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                            j q2;
                            if (binder == null) {
                                q2 = null;
                            }
                            else {
                                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                                if (queryLocalInterface instanceof j) {
                                    q2 = (j)queryLocalInterface;
                                }
                                else {
                                    q2 = new j(binder);
                                }
                            }
                            if (q2 != null) {
                                DynamiteModule.q = q2;
                                // monitorexit(DynamiteModule.class)
                                return q2;
                            }
                            // monitorexit(DynamiteModule.class)
                            while (true) {
                                return null;
                                final Exception ex;
                                final String message = ex.getMessage();
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                                sb.append(message);
                                Log.e("DynamiteModule", sb.toString());
                                continue;
                            }
                        }
                        // monitorexit(DynamiteModule.class)
                        catch (Exception ex2) {}
                    }
                }
            }
            final Exception ex2;
            final Exception ex = ex2;
            continue;
        }
    }
    
    public IBinder c(final String s) {
        IBinder binder = null;
        try {
            binder = (IBinder)this.a.getClassLoader().loadClass(s).newInstance();
            return binder;
        }
        catch (IllegalAccessException binder) {}
        catch (InstantiationException binder) {}
        catch (ClassNotFoundException ex) {}
        throw new a("Failed to instantiate module class: ".concat(String.valueOf(s)), (Throwable)binder, null);
    }
    
    @DynamiteApi
    public static class DynamiteLoaderClassLoader
    {
        public static ClassLoader sClassLoader;
    }
    
    public static class a extends Exception
    {
    }
    
    public interface b
    {
        DynamiteModule.b.b a(final Context p0, final String p1, final a p2);
        
        public interface a
        {
            int a(final Context p0, final String p1);
            
            int b(final Context p0, final String p1, final boolean p2);
        }
        
        public static class b
        {
            public int a;
            public int b;
            public int c;
            
            public b() {
                this.a = 0;
                this.b = 0;
                this.c = 0;
            }
        }
    }
}
