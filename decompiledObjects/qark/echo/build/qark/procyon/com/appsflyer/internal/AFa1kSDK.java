// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import androidx.annotation.NonNull;
import android.content.Context;
import android.net.NetworkInfo;

public final class AFa1kSDK
{
    private static boolean values(final NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }
    
    public final AFa1zSDK AFInAppEventParameterName(@NonNull final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore          6
        //     4: aconst_null    
        //     5: astore          8
        //     7: aconst_null    
        //     8: astore          7
        //    10: aload           6
        //    12: astore          5
        //    14: aload_1        
        //    15: ldc             "connectivity"
        //    17: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    20: checkcast       Landroid/net/ConnectivityManager;
        //    23: astore          9
        //    25: aload           6
        //    27: astore          4
        //    29: aload           9
        //    31: ifnull          134
        //    34: aload           6
        //    36: astore          5
        //    38: aload           9
        //    40: invokevirtual   android/net/ConnectivityManager.getAllNetworks:()[Landroid/net/Network;
        //    43: astore          10
        //    45: aload           6
        //    47: astore          5
        //    49: aload           10
        //    51: arraylength    
        //    52: istore_3       
        //    53: iconst_0       
        //    54: istore_2       
        //    55: aload           6
        //    57: astore          4
        //    59: iload_2        
        //    60: iload_3        
        //    61: if_icmpge       134
        //    64: aload           6
        //    66: astore          5
        //    68: aload           9
        //    70: aload           10
        //    72: iload_2        
        //    73: aaload         
        //    74: invokevirtual   android/net/ConnectivityManager.getNetworkInfo:(Landroid/net/Network;)Landroid/net/NetworkInfo;
        //    77: astore          11
        //    79: aload           6
        //    81: astore          5
        //    83: aload           11
        //    85: invokestatic    com/appsflyer/internal/AFa1kSDK.values:(Landroid/net/NetworkInfo;)Z
        //    88: ifeq            289
        //    91: aload           6
        //    93: astore          5
        //    95: iconst_1       
        //    96: aload           11
        //    98: invokevirtual   android/net/NetworkInfo.getType:()I
        //   101: if_icmpne       111
        //   104: ldc             "WIFI"
        //   106: astore          4
        //   108: goto            134
        //   111: aload           6
        //   113: astore          4
        //   115: aload           6
        //   117: astore          5
        //   119: aload           11
        //   121: invokevirtual   android/net/NetworkInfo.getType:()I
        //   124: ifne            134
        //   127: ldc             "MOBILE"
        //   129: astore          4
        //   131: goto            134
        //   134: aload           4
        //   136: astore          5
        //   138: aload_1        
        //   139: ldc             "phone"
        //   141: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   144: checkcast       Landroid/telephony/TelephonyManager;
        //   147: astore          10
        //   149: aload           4
        //   151: astore          5
        //   153: aload           10
        //   155: invokevirtual   android/telephony/TelephonyManager.getSimOperatorName:()Ljava/lang/String;
        //   158: astore          6
        //   160: aload           8
        //   162: astore          5
        //   164: aload           10
        //   166: invokevirtual   android/telephony/TelephonyManager.getNetworkOperatorName:()Ljava/lang/String;
        //   169: astore          9
        //   171: aload           9
        //   173: ifnull          202
        //   176: aload           4
        //   178: astore          8
        //   180: aload           9
        //   182: astore_1       
        //   183: aload           6
        //   185: astore          7
        //   187: aload           9
        //   189: astore          5
        //   191: aload           9
        //   193: invokevirtual   java/lang/String.isEmpty:()Z
        //   196: ifeq            257
        //   199: goto            202
        //   202: aload           4
        //   204: astore          8
        //   206: aload           9
        //   208: astore_1       
        //   209: aload           6
        //   211: astore          7
        //   213: aload           9
        //   215: astore          5
        //   217: iconst_2       
        //   218: aload           10
        //   220: invokevirtual   android/telephony/TelephonyManager.getPhoneType:()I
        //   223: if_icmpne       257
        //   226: ldc             "CDMA"
        //   228: astore_1       
        //   229: aload           4
        //   231: astore          8
        //   233: aload           6
        //   235: astore          7
        //   237: goto            257
        //   240: ldc             "Exception while collecting network info. "
        //   242: aload           6
        //   244: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   247: aload_1        
        //   248: astore          7
        //   250: aload           5
        //   252: astore_1       
        //   253: aload           4
        //   255: astore          8
        //   257: new             Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;
        //   260: dup            
        //   261: aload           8
        //   263: aload_1        
        //   264: aload           7
        //   266: invokespecial   com/appsflyer/internal/AFa1kSDK$AFa1zSDK.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   269: areturn        
        //   270: astore          6
        //   272: aconst_null    
        //   273: astore          8
        //   275: aload           5
        //   277: astore          4
        //   279: aload           7
        //   281: astore_1       
        //   282: aload           8
        //   284: astore          5
        //   286: goto            240
        //   289: iload_2        
        //   290: iconst_1       
        //   291: iadd           
        //   292: istore_2       
        //   293: goto            55
        //   296: astore          7
        //   298: aload           6
        //   300: astore_1       
        //   301: aload           7
        //   303: astore          6
        //   305: goto            240
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  14     25     270    289    Any
        //  38     45     270    289    Any
        //  49     53     270    289    Any
        //  68     79     270    289    Any
        //  83     91     270    289    Any
        //  95     104    270    289    Any
        //  119    127    270    289    Any
        //  138    149    270    289    Any
        //  153    160    270    289    Any
        //  164    171    296    308    Any
        //  191    199    296    308    Any
        //  217    226    296    308    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public static final class AFa1zSDK
    {
        public final String AFInAppEventParameterName;
        public final String AFInAppEventType;
        public final String valueOf;
        
        public AFa1zSDK(@NonNull final String afInAppEventParameterName, final String afInAppEventType, final String valueOf) {
            this.AFInAppEventParameterName = afInAppEventParameterName;
            this.AFInAppEventType = afInAppEventType;
            this.valueOf = valueOf;
        }
    }
}
