// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.Message;
import android.os.Handler$Callback;

public final class i0 implements Handler$Callback
{
    public final boolean handleMessage(final Message p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/os/Message.what:I
        //     4: istore_2       
        //     5: iload_2        
        //     6: ifeq            179
        //     9: iload_2        
        //    10: iconst_1       
        //    11: if_icmpeq       16
        //    14: iconst_0       
        //    15: ireturn        
        //    16: aload_0        
        //    17: getfield        A2/i0.o:LA2/j0;
        //    20: invokestatic    A2/j0.k:(LA2/j0;)Ljava/util/HashMap;
        //    23: astore          4
        //    25: aload           4
        //    27: monitorenter   
        //    28: aload_1        
        //    29: getfield        android/os/Message.obj:Ljava/lang/Object;
        //    32: checkcast       LA2/e0;
        //    35: astore          6
        //    37: aload_0        
        //    38: getfield        A2/i0.o:LA2/j0;
        //    41: invokestatic    A2/j0.k:(LA2/j0;)Ljava/util/HashMap;
        //    44: aload           6
        //    46: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    49: checkcast       LA2/g0;
        //    52: astore          5
        //    54: aload           5
        //    56: ifnull          169
        //    59: aload           5
        //    61: invokevirtual   A2/g0.a:()I
        //    64: iconst_3       
        //    65: if_icmpne       169
        //    68: aload           6
        //    70: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    73: astore_3       
        //    74: new             Ljava/lang/StringBuilder;
        //    77: dup            
        //    78: invokespecial   java/lang/StringBuilder.<init>:()V
        //    81: astore_1       
        //    82: aload_1        
        //    83: ldc             "Timeout waiting for ServiceConnection callback "
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: pop            
        //    89: aload_1        
        //    90: aload_3        
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    94: pop            
        //    95: new             Ljava/lang/Exception;
        //    98: dup            
        //    99: invokespecial   java/lang/Exception.<init>:()V
        //   102: astore_3       
        //   103: ldc             "GmsClientSupervisor"
        //   105: aload_1        
        //   106: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   109: aload_3        
        //   110: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   113: pop            
        //   114: aload           5
        //   116: invokevirtual   A2/g0.b:()Landroid/content/ComponentName;
        //   119: astore_3       
        //   120: aload_3        
        //   121: astore_1       
        //   122: aload_3        
        //   123: ifnonnull       135
        //   126: aload           6
        //   128: invokevirtual   A2/e0.b:()Landroid/content/ComponentName;
        //   131: astore_1       
        //   132: goto            135
        //   135: aload_1        
        //   136: astore_3       
        //   137: aload_1        
        //   138: ifnonnull       163
        //   141: aload           6
        //   143: invokevirtual   A2/e0.d:()Ljava/lang/String;
        //   146: astore_1       
        //   147: aload_1        
        //   148: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //   151: pop            
        //   152: new             Landroid/content/ComponentName;
        //   155: dup            
        //   156: aload_1        
        //   157: ldc             "unknown"
        //   159: invokespecial   android/content/ComponentName.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   162: astore_3       
        //   163: aload           5
        //   165: aload_3        
        //   166: invokevirtual   A2/g0.onServiceDisconnected:(Landroid/content/ComponentName;)V
        //   169: aload           4
        //   171: monitorexit    
        //   172: iconst_1       
        //   173: ireturn        
        //   174: aload           4
        //   176: monitorexit    
        //   177: aload_1        
        //   178: athrow         
        //   179: aload_0        
        //   180: getfield        A2/i0.o:LA2/j0;
        //   183: invokestatic    A2/j0.k:(LA2/j0;)Ljava/util/HashMap;
        //   186: astore_3       
        //   187: aload_3        
        //   188: monitorenter   
        //   189: aload_1        
        //   190: getfield        android/os/Message.obj:Ljava/lang/Object;
        //   193: checkcast       LA2/e0;
        //   196: astore_1       
        //   197: aload_0        
        //   198: getfield        A2/i0.o:LA2/j0;
        //   201: invokestatic    A2/j0.k:(LA2/j0;)Ljava/util/HashMap;
        //   204: aload_1        
        //   205: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   208: checkcast       LA2/g0;
        //   211: astore          4
        //   213: aload           4
        //   215: ifnull          256
        //   218: aload           4
        //   220: invokevirtual   A2/g0.i:()Z
        //   223: ifeq            256
        //   226: aload           4
        //   228: invokevirtual   A2/g0.j:()Z
        //   231: ifeq            244
        //   234: aload           4
        //   236: ldc             "GmsClientSupervisor"
        //   238: invokevirtual   A2/g0.g:(Ljava/lang/String;)V
        //   241: goto            244
        //   244: aload_0        
        //   245: getfield        A2/i0.o:LA2/j0;
        //   248: invokestatic    A2/j0.k:(LA2/j0;)Ljava/util/HashMap;
        //   251: aload_1        
        //   252: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   255: pop            
        //   256: aload_3        
        //   257: monitorexit    
        //   258: iconst_1       
        //   259: ireturn        
        //   260: aload_3        
        //   261: monitorexit    
        //   262: aload_1        
        //   263: athrow         
        //   264: astore_1       
        //   265: goto            174
        //   268: astore_1       
        //   269: goto            260
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  28     54     264    179    Any
        //  59     120    264    179    Any
        //  126    132    264    179    Any
        //  141    163    264    179    Any
        //  163    169    264    179    Any
        //  169    172    264    179    Any
        //  174    177    264    179    Any
        //  189    213    268    264    Any
        //  218    241    268    264    Any
        //  244    256    268    264    Any
        //  256    258    268    264    Any
        //  260    262    268    264    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0244:
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
