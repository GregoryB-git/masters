// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

public abstract class m
{
    public static String a;
    public static int b;
    
    public static String a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifnonnull       162
        //     6: getstatic       E2/m.b:I
        //     9: istore_1       
        //    10: iload_1        
        //    11: istore_0       
        //    12: iload_1        
        //    13: ifne            24
        //    16: invokestatic    android/os/Process.myPid:()I
        //    19: istore_0       
        //    20: iload_0        
        //    21: putstatic       E2/m.b:I
        //    24: aconst_null    
        //    25: astore          4
        //    27: aconst_null    
        //    28: astore_3       
        //    29: aconst_null    
        //    30: astore_2       
        //    31: iload_0        
        //    32: ifgt            40
        //    35: aload_3        
        //    36: astore_2       
        //    37: goto            158
        //    40: new             Ljava/lang/StringBuilder;
        //    43: dup            
        //    44: invokespecial   java/lang/StringBuilder.<init>:()V
        //    47: astore_3       
        //    48: aload_3        
        //    49: ldc             "/proc/"
        //    51: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    54: pop            
        //    55: aload_3        
        //    56: iload_0        
        //    57: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    60: pop            
        //    61: aload_3        
        //    62: ldc             "/cmdline"
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: pop            
        //    68: aload_3        
        //    69: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    72: astore_3       
        //    73: invokestatic    android/os/StrictMode.allowThreadDiskReads:()Landroid/os/StrictMode$ThreadPolicy;
        //    76: astore          5
        //    78: new             Ljava/io/BufferedReader;
        //    81: dup            
        //    82: new             Ljava/io/FileReader;
        //    85: dup            
        //    86: aload_3        
        //    87: invokespecial   java/io/FileReader.<init>:(Ljava/lang/String;)V
        //    90: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    93: astore_3       
        //    94: aload           5
        //    96: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //    99: aload_3        
        //   100: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   103: astore          4
        //   105: aload           4
        //   107: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //   110: pop            
        //   111: aload           4
        //   113: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   116: astore          4
        //   118: aload           4
        //   120: astore_2       
        //   121: aload_3        
        //   122: invokestatic    E2/k.a:(Ljava/io/Closeable;)V
        //   125: goto            158
        //   128: astore_2       
        //   129: goto            147
        //   132: astore_2       
        //   133: aload           4
        //   135: astore_3       
        //   136: goto            147
        //   139: astore_3       
        //   140: aload           5
        //   142: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //   145: aload_3        
        //   146: athrow         
        //   147: aload_3        
        //   148: invokestatic    E2/k.a:(Ljava/io/Closeable;)V
        //   151: aload_2        
        //   152: athrow         
        //   153: aconst_null    
        //   154: astore_3       
        //   155: goto            121
        //   158: aload_2        
        //   159: putstatic       E2/m.a:Ljava/lang/String;
        //   162: getstatic       E2/m.a:Ljava/lang/String;
        //   165: areturn        
        //   166: astore_3       
        //   167: goto            153
        //   170: astore          4
        //   172: goto            121
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  40     78     166    158    Ljava/io/IOException;
        //  40     78     132    139    Any
        //  78     94     139    147    Any
        //  94     99     166    158    Ljava/io/IOException;
        //  94     99     132    139    Any
        //  99     118    170    175    Ljava/io/IOException;
        //  99     118    128    132    Any
        //  140    147    166    158    Ljava/io/IOException;
        //  140    147    132    139    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0121:
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
