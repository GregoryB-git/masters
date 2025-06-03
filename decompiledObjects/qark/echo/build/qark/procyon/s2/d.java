// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s2;

public abstract class d
{
    public static final void a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    J2/i.b:(I)V
        //     6: new             Ljava/net/URL;
        //     9: dup            
        //    10: aload_0        
        //    11: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    14: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    17: checkcast       Ljava/net/HttpURLConnection;
        //    20: astore_2       
        //    21: aload_2        
        //    22: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    25: istore_1       
        //    26: iload_1        
        //    27: sipush          200
        //    30: if_icmplt       40
        //    33: iload_1        
        //    34: sipush          300
        //    37: if_icmplt       94
        //    40: new             Ljava/lang/StringBuilder;
        //    43: dup            
        //    44: aload_0        
        //    45: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    48: invokevirtual   java/lang/String.length:()I
        //    51: bipush          65
        //    53: iadd           
        //    54: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    57: astore_3       
        //    58: aload_3        
        //    59: ldc             "Received non-success response code "
        //    61: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    64: pop            
        //    65: aload_3        
        //    66: iload_1        
        //    67: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    70: pop            
        //    71: aload_3        
        //    72: ldc             " from pinging URL: "
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: pop            
        //    78: aload_3        
        //    79: aload_0        
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    83: pop            
        //    84: ldc             "HttpUrlPinger"
        //    86: aload_3        
        //    87: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    90: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    93: pop            
        //    94: aload_2        
        //    95: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //    98: invokestatic    J2/i.a:()V
        //   101: return         
        //   102: astore_0       
        //   103: goto            281
        //   106: astore_2       
        //   107: goto            125
        //   110: astore_2       
        //   111: goto            125
        //   114: astore_2       
        //   115: goto            203
        //   118: astore_3       
        //   119: aload_2        
        //   120: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   123: aload_3        
        //   124: athrow         
        //   125: aload_2        
        //   126: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   129: astore_3       
        //   130: new             Ljava/lang/StringBuilder;
        //   133: dup            
        //   134: aload_0        
        //   135: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   138: invokevirtual   java/lang/String.length:()I
        //   141: bipush          27
        //   143: iadd           
        //   144: aload_3        
        //   145: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   148: invokevirtual   java/lang/String.length:()I
        //   151: iadd           
        //   152: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   155: astore          4
        //   157: aload           4
        //   159: ldc             "Error while pinging URL: "
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: pop            
        //   165: aload           4
        //   167: aload_0        
        //   168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   171: pop            
        //   172: aload           4
        //   174: ldc             ". "
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: pop            
        //   180: aload           4
        //   182: aload_3        
        //   183: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   186: pop            
        //   187: ldc             "HttpUrlPinger"
        //   189: aload           4
        //   191: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   194: aload_2        
        //   195: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   198: pop            
        //   199: invokestatic    J2/i.a:()V
        //   202: return         
        //   203: aload_2        
        //   204: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   207: astore_3       
        //   208: new             Ljava/lang/StringBuilder;
        //   211: dup            
        //   212: aload_0        
        //   213: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   216: invokevirtual   java/lang/String.length:()I
        //   219: bipush          32
        //   221: iadd           
        //   222: aload_3        
        //   223: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   226: invokevirtual   java/lang/String.length:()I
        //   229: iadd           
        //   230: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   233: astore          4
        //   235: aload           4
        //   237: ldc             "Error while parsing ping URL: "
        //   239: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   242: pop            
        //   243: aload           4
        //   245: aload_0        
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: pop            
        //   250: aload           4
        //   252: ldc             ". "
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: pop            
        //   258: aload           4
        //   260: aload_3        
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   264: pop            
        //   265: ldc             "HttpUrlPinger"
        //   267: aload           4
        //   269: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   272: aload_2        
        //   273: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   276: pop            
        //   277: invokestatic    J2/i.a:()V
        //   280: return         
        //   281: invokestatic    J2/i.a:()V
        //   284: aload_0        
        //   285: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  0      21     114    281    Ljava/lang/IndexOutOfBoundsException;
        //  0      21     110    114    Ljava/io/IOException;
        //  0      21     106    110    Ljava/lang/RuntimeException;
        //  0      21     102    106    Any
        //  21     26     118    125    Any
        //  40     94     118    125    Any
        //  94     98     114    281    Ljava/lang/IndexOutOfBoundsException;
        //  94     98     110    114    Ljava/io/IOException;
        //  94     98     106    110    Ljava/lang/RuntimeException;
        //  94     98     102    106    Any
        //  119    125    114    281    Ljava/lang/IndexOutOfBoundsException;
        //  119    125    110    114    Ljava/io/IOException;
        //  119    125    106    110    Ljava/lang/RuntimeException;
        //  119    125    102    106    Any
        //  125    199    102    106    Any
        //  203    277    102    106    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
