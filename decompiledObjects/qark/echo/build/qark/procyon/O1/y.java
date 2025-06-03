// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.InstallReferrerClient;
import x1.B;
import kotlin.jvm.internal.Intrinsics;

public final class y
{
    public static final y a;
    
    static {
        a = new y();
    }
    
    public static final void d(final a a) {
        Intrinsics.checkNotNullParameter(a, "callback");
        final y a2 = y.a;
        if (!a2.b()) {
            a2.c(a);
        }
    }
    
    public final boolean b() {
        return B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }
    
    public final void c(final a a) {
        final InstallReferrerClient build = InstallReferrerClient.newBuilder(B.l()).build();
        final InstallReferrerStateListener installReferrerStateListener = new InstallReferrerStateListener() {
            @Override
            public void onInstallReferrerServiceDisconnected() {
            }
            
            @Override
            public void onInstallReferrerSetupFinished(final int p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
                //     4: ifeq            8
                //     7: return         
                //     8: iload_1        
                //     9: ifeq            35
                //    12: iload_1        
                //    13: iconst_2       
                //    14: if_icmpeq       20
                //    17: goto            99
                //    20: getstatic       O1/y.a:LO1/y;
                //    23: astore_2       
                //    24: aload_2        
                //    25: invokestatic    O1/y.a:(LO1/y;)V
                //    28: goto            99
                //    31: astore_2       
                //    32: goto            107
                //    35: aload_0        
                //    36: getfield        O1/y$b.a:Lcom/android/installreferrer/api/InstallReferrerClient;
                //    39: invokevirtual   com/android/installreferrer/api/InstallReferrerClient.getInstallReferrer:()Lcom/android/installreferrer/api/ReferrerDetails;
                //    42: astore_2       
                //    43: aload_2        
                //    44: ldc             "{\n                      referrerClient.installReferrer\n                    }"
                //    46: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
                //    49: aload_2        
                //    50: invokevirtual   com/android/installreferrer/api/ReferrerDetails.getInstallReferrer:()Ljava/lang/String;
                //    53: astore_2       
                //    54: aload_2        
                //    55: ifnull          92
                //    58: aload_2        
                //    59: ldc             "fb"
                //    61: iconst_0       
                //    62: iconst_2       
                //    63: aconst_null    
                //    64: invokestatic    kotlin/text/i.v:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
                //    67: ifne            82
                //    70: aload_2        
                //    71: ldc             "facebook"
                //    73: iconst_0       
                //    74: iconst_2       
                //    75: aconst_null    
                //    76: invokestatic    kotlin/text/i.v:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
                //    79: ifeq            92
                //    82: aload_0        
                //    83: getfield        O1/y$b.b:LO1/y$a;
                //    86: aload_2        
                //    87: invokeinterface O1/y$a.a:(Ljava/lang/String;)V
                //    92: getstatic       O1/y.a:LO1/y;
                //    95: astore_2       
                //    96: goto            24
                //    99: aload_0        
                //   100: getfield        O1/y$b.a:Lcom/android/installreferrer/api/InstallReferrerClient;
                //   103: invokevirtual   com/android/installreferrer/api/InstallReferrerClient.endConnection:()V
                //   106: return         
                //   107: aload_2        
                //   108: aload_0        
                //   109: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
                //   112: return         
                //   113: astore_2       
                //   114: return         
                //   115: astore_2       
                //   116: return         
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  20     24     31     35     Any
                //  24     28     31     35     Any
                //  35     49     113    115    Landroid/os/RemoteException;
                //  35     49     31     35     Any
                //  49     54     31     35     Any
                //  58     82     31     35     Any
                //  82     92     31     35     Any
                //  92     96     31     35     Any
                //  99     106    115    117    Ljava/lang/Exception;
                //  99     106    31     35     Any
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0099:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
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
        };
        try {
            build.startConnection(installReferrerStateListener);
        }
        catch (Exception ex) {}
    }
    
    public final void e() {
        B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
    
    public interface a
    {
        void a(final String p0);
    }
}
