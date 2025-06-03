// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.UserManager;
import E2.l;
import android.content.pm.PackageInfo;
import E2.i;
import G2.d;
import android.content.res.Resources;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class n
{
    public static final int a = 12451000;
    public static final AtomicBoolean b;
    public static boolean c = false;
    public static boolean d = false;
    public static final AtomicBoolean e;
    
    static {
        b = new AtomicBoolean();
        e = new AtomicBoolean();
    }
    
    public static int a(final Context context) {
        while (true) {
            try {
                return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
                return 0;
            }
            catch (PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public static String b(final int n) {
        return x2.b.k(n);
    }
    
    public static Resources c(final Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public static boolean d(final Context context) {
    Label_0061_Outer:
        while (true) {
            if (!n.d) {
                while (true) {
                    try {
                    Label_0073_Outer:
                        while (true) {
                            while (true) {
                                try {
                                    final PackageInfo e = G2.d.a(context).e("com.google.android.gms", 64);
                                    o.a(context);
                                    if (e != null && !o.e(e, false) && o.e(e, true)) {
                                        n.c = true;
                                    }
                                    else {
                                        n.c = false;
                                    }
                                    while (true) {
                                        n.d = true;
                                        return n.c || !i.b();
                                        n.d = true;
                                        final Throwable t;
                                        Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", t);
                                        continue Label_0073_Outer;
                                    }
                                }
                                finally {}
                                continue Label_0061_Outer;
                            }
                        }
                    }
                    catch (PackageManager$NameNotFoundException ex) {}
                    final PackageManager$NameNotFoundException ex;
                    final Throwable t = (Throwable)ex;
                    continue;
                }
            }
            continue;
        }
    }
    
    public static int e(final Context p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //     4: getstatic       x2/p.a:I
        //     7: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //    10: pop            
        //    11: goto            22
        //    14: ldc             "GooglePlayServicesUtil"
        //    16: ldc             "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
        //    18: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    21: pop            
        //    22: ldc             "com.google.android.gms"
        //    24: aload_0        
        //    25: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    28: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    31: ifne            82
        //    34: getstatic       x2/n.e:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    37: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //    40: ifeq            46
        //    43: goto            82
        //    46: aload_0        
        //    47: invokestatic    A2/Q.a:(Landroid/content/Context;)I
        //    50: istore_2       
        //    51: iload_2        
        //    52: ifeq            74
        //    55: iload_2        
        //    56: getstatic       x2/n.a:I
        //    59: if_icmpne       65
        //    62: goto            82
        //    65: new             Lcom/google/android/gms/common/GooglePlayServicesIncorrectManifestValueException;
        //    68: dup            
        //    69: iload_2        
        //    70: invokespecial   com/google/android/gms/common/GooglePlayServicesIncorrectManifestValueException.<init>:(I)V
        //    73: athrow         
        //    74: new             Lcom/google/android/gms/common/GooglePlayServicesMissingManifestValueException;
        //    77: dup            
        //    78: invokespecial   com/google/android/gms/common/GooglePlayServicesMissingManifestValueException.<init>:()V
        //    81: athrow         
        //    82: aload_0        
        //    83: invokestatic    E2/i.d:(Landroid/content/Context;)Z
        //    86: ifne            101
        //    89: aload_0        
        //    90: invokestatic    E2/i.f:(Landroid/content/Context;)Z
        //    93: ifne            101
        //    96: iconst_1       
        //    97: istore_2       
        //    98: goto            103
        //   101: iconst_0       
        //   102: istore_2       
        //   103: iload_1        
        //   104: iflt            112
        //   107: iconst_1       
        //   108: istore_3       
        //   109: goto            114
        //   112: iconst_0       
        //   113: istore_3       
        //   114: iload_3        
        //   115: invokestatic    A2/n.a:(Z)V
        //   118: aload_0        
        //   119: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   122: astore          5
        //   124: aload_0        
        //   125: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   128: astore          6
        //   130: iload_2        
        //   131: ifeq            174
        //   134: aload           6
        //   136: ldc             "com.android.vending"
        //   138: sipush          8256
        //   141: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   144: astore          4
        //   146: goto            177
        //   149: aload           5
        //   151: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   154: astore_0       
        //   155: ldc             " requires the Google Play Store, but it is missing."
        //   157: astore          4
        //   159: ldc             "GooglePlayServicesUtil"
        //   161: aload_0        
        //   162: aload           4
        //   164: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   167: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   170: pop            
        //   171: bipush          9
        //   173: ireturn        
        //   174: aconst_null    
        //   175: astore          4
        //   177: aload           6
        //   179: ldc             "com.google.android.gms"
        //   181: bipush          64
        //   183: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   186: astore          7
        //   188: aload_0        
        //   189: invokestatic    x2/o.a:(Landroid/content/Context;)Lx2/o;
        //   192: pop            
        //   193: aload           7
        //   195: iconst_1       
        //   196: invokestatic    x2/o.e:(Landroid/content/pm/PackageInfo;Z)Z
        //   199: ifne            215
        //   202: aload           5
        //   204: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   207: astore_0       
        //   208: ldc             " requires Google Play services, but their signature is invalid."
        //   210: astore          4
        //   212: goto            159
        //   215: iload_2        
        //   216: ifeq            247
        //   219: aload           4
        //   221: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //   224: pop            
        //   225: aload           4
        //   227: iconst_1       
        //   228: invokestatic    x2/o.e:(Landroid/content/pm/PackageInfo;Z)Z
        //   231: ifne            247
        //   234: aload           5
        //   236: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   239: astore_0       
        //   240: ldc             " requires Google Play Store, but its signature is invalid."
        //   242: astore          4
        //   244: goto            159
        //   247: iload_2        
        //   248: ifeq            289
        //   251: aload           4
        //   253: ifnull          289
        //   256: aload           4
        //   258: getfield        android/content/pm/PackageInfo.signatures:[Landroid/content/pm/Signature;
        //   261: iconst_0       
        //   262: aaload         
        //   263: aload           7
        //   265: getfield        android/content/pm/PackageInfo.signatures:[Landroid/content/pm/Signature;
        //   268: iconst_0       
        //   269: aaload         
        //   270: invokevirtual   android/content/pm/Signature.equals:(Ljava/lang/Object;)Z
        //   273: ifne            289
        //   276: aload           5
        //   278: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   281: astore_0       
        //   282: ldc             " requires Google Play Store, but its signature doesn't match that of Google Play services."
        //   284: astore          4
        //   286: goto            159
        //   289: aload           7
        //   291: getfield        android/content/pm/PackageInfo.versionCode:I
        //   294: invokestatic    E2/q.a:(I)I
        //   297: iload_1        
        //   298: invokestatic    E2/q.a:(I)I
        //   301: if_icmpge       370
        //   304: aload           7
        //   306: getfield        android/content/pm/PackageInfo.versionCode:I
        //   309: istore_2       
        //   310: new             Ljava/lang/StringBuilder;
        //   313: dup            
        //   314: invokespecial   java/lang/StringBuilder.<init>:()V
        //   317: astore_0       
        //   318: aload_0        
        //   319: ldc             "Google Play services out of date for "
        //   321: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   324: pop            
        //   325: aload_0        
        //   326: aload           5
        //   328: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   331: pop            
        //   332: aload_0        
        //   333: ldc             ".  Requires "
        //   335: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   338: pop            
        //   339: aload_0        
        //   340: iload_1        
        //   341: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   344: pop            
        //   345: aload_0        
        //   346: ldc             " but found "
        //   348: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   351: pop            
        //   352: aload_0        
        //   353: iload_2        
        //   354: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   357: pop            
        //   358: ldc             "GooglePlayServicesUtil"
        //   360: aload_0        
        //   361: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   364: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   367: pop            
        //   368: iconst_2       
        //   369: ireturn        
        //   370: aload           7
        //   372: getfield        android/content/pm/PackageInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //   375: astore          4
        //   377: aload           4
        //   379: astore_0       
        //   380: aload           4
        //   382: ifnonnull       417
        //   385: aload           6
        //   387: ldc             "com.google.android.gms"
        //   389: iconst_0       
        //   390: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   393: astore_0       
        //   394: goto            417
        //   397: astore_0       
        //   398: ldc             "GooglePlayServicesUtil"
        //   400: aload           5
        //   402: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   405: ldc             " requires Google Play services, but they're missing when getting application info."
        //   407: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   410: aload_0        
        //   411: invokestatic    android/util/Log.wtf:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   414: pop            
        //   415: iconst_1       
        //   416: ireturn        
        //   417: aload_0        
        //   418: getfield        android/content/pm/ApplicationInfo.enabled:Z
        //   421: ifne            426
        //   424: iconst_3       
        //   425: ireturn        
        //   426: iconst_0       
        //   427: ireturn        
        //   428: ldc             "GooglePlayServicesUtil"
        //   430: aload           5
        //   432: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   435: ldc             " requires Google Play services, but they are missing."
        //   437: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   440: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   443: pop            
        //   444: iconst_1       
        //   445: ireturn        
        //   446: astore          4
        //   448: goto            14
        //   451: astore_0       
        //   452: goto            149
        //   455: astore_0       
        //   456: goto            428
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  0      11     446    22     Any
        //  134    146    451    159    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  177    188    455    446    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  385    394    397    417    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 229 out of bounds for length 229
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
    
    public static boolean f(final Context context, final int n) {
        return n == 18 || (n == 1 && j(context, "com.google.android.gms"));
    }
    
    public static boolean g(final Context context) {
        if (l.c()) {
            final Object systemService = context.getSystemService("user");
            A2.n.i(systemService);
            final Bundle applicationRestrictions = ((UserManager)systemService).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals(((BaseBundle)applicationRestrictions).getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean h(final int n) {
        return n == 1 || n == 2 || n == 3 || n == 9;
    }
    
    public static boolean i(final Context context, final int n, final String s) {
        return E2.o.b(context, n, s);
    }
    
    public static boolean j(final Context p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "com.google.android.gms"
        //     3: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //     6: istore_2       
        //     7: invokestatic    E2/l.f:()Z
        //    10: ifeq            61
        //    13: aload_0        
        //    14: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    17: invokevirtual   android/content/pm/PackageManager.getPackageInstaller:()Landroid/content/pm/PackageInstaller;
        //    20: invokevirtual   android/content/pm/PackageInstaller.getAllSessions:()Ljava/util/List;
        //    23: astore_3       
        //    24: aload_3        
        //    25: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    30: astore_3       
        //    31: aload_3        
        //    32: invokeinterface java/util/Iterator.hasNext:()Z
        //    37: ifeq            61
        //    40: aload_1        
        //    41: aload_3        
        //    42: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    47: checkcast       Landroid/content/pm/PackageInstaller$SessionInfo;
        //    50: invokevirtual   android/content/pm/PackageInstaller$SessionInfo.getAppPackageName:()Ljava/lang/String;
        //    53: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    56: ifeq            31
        //    59: iconst_1       
        //    60: ireturn        
        //    61: aload_0        
        //    62: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    65: astore_3       
        //    66: aload_3        
        //    67: aload_1        
        //    68: sipush          8192
        //    71: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //    74: astore_1       
        //    75: iload_2        
        //    76: ifeq            84
        //    79: aload_1        
        //    80: getfield        android/content/pm/ApplicationInfo.enabled:Z
        //    83: ireturn        
        //    84: aload_1        
        //    85: getfield        android/content/pm/ApplicationInfo.enabled:Z
        //    88: ifeq            102
        //    91: aload_0        
        //    92: invokestatic    x2/n.g:(Landroid/content/Context;)Z
        //    95: istore_2       
        //    96: iload_2        
        //    97: ifne            102
        //   100: iconst_1       
        //   101: ireturn        
        //   102: iconst_0       
        //   103: ireturn        
        //   104: astore_0       
        //   105: iconst_0       
        //   106: ireturn        
        //   107: astore_0       
        //   108: iconst_0       
        //   109: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  13     24     104    107    Ljava/lang/Exception;
        //  66     75     107    110    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  79     84     107    110    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  84     96     107    110    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0084:
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
}
