// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I2;

public abstract class d
{
    public static volatile ClassLoader a;
    public static volatile Thread b;
    
    public static ClassLoader a() {
        // monitorenter(d.class)
        while (true) {
            try {
                if (d.a == null) {
                    d.a = b();
                }
                // monitorexit(d.class)
                return d.a;
                // monitorexit(d.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static ClassLoader b() {
        // monitorenter(d.class)
        // monitorenter(b)
        Label_0109: {
            try {
                if (d.b == null) {
                    d.b = c();
                    if (d.b == null) {
                        // monitorexit(d.class)
                        return null;
                    }
                }
            }
            finally {
                break Label_0109;
            }
            final Thread b = d.b;
            try {
                try {
                    final ClassLoader contextClassLoader = d.b.getContextClassLoader();
                }
                finally {
                    // monitorexit(b)
                    // monitorexit(b)
                    // monitorexit(d.class)
                    return;
                }
            }
            catch (SecurityException ex) {}
        }
    }
    // monitorexit(d.class)
    
    public static Thread c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //     6: invokevirtual   android/os/Looper.getThread:()Ljava/lang/Thread;
        //     9: invokevirtual   java/lang/Thread.getThreadGroup:()Ljava/lang/ThreadGroup;
        //    12: astore          6
        //    14: aload           6
        //    16: ifnonnull       24
        //    19: ldc             LI2/d;.class
        //    21: monitorexit    
        //    22: aconst_null    
        //    23: areturn        
        //    24: ldc             Ljava/lang/Void;.class
        //    26: monitorenter   
        //    27: aload           6
        //    29: invokevirtual   java/lang/ThreadGroup.activeGroupCount:()I
        //    32: istore_2       
        //    33: iload_2        
        //    34: anewarray       Ljava/lang/ThreadGroup;
        //    37: astore          5
        //    39: aload           6
        //    41: aload           5
        //    43: invokevirtual   java/lang/ThreadGroup.enumerate:([Ljava/lang/ThreadGroup;)I
        //    46: pop            
        //    47: iconst_0       
        //    48: istore_1       
        //    49: iconst_0       
        //    50: istore_0       
        //    51: iload_0        
        //    52: iload_2        
        //    53: if_icmpge       312
        //    56: aload           5
        //    58: iload_0        
        //    59: aaload         
        //    60: astore          4
        //    62: ldc             "dynamiteLoader"
        //    64: aload           4
        //    66: invokevirtual   java/lang/ThreadGroup.getName:()Ljava/lang/String;
        //    69: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    72: ifeq            295
        //    75: goto            78
        //    78: aload           4
        //    80: astore          5
        //    82: aload           4
        //    84: ifnonnull       100
        //    87: new             Ljava/lang/ThreadGroup;
        //    90: dup            
        //    91: aload           6
        //    93: ldc             "dynamiteLoader"
        //    95: invokespecial   java/lang/ThreadGroup.<init>:(Ljava/lang/ThreadGroup;Ljava/lang/String;)V
        //    98: astore          5
        //   100: aload           5
        //   102: invokevirtual   java/lang/ThreadGroup.activeCount:()I
        //   105: istore_2       
        //   106: iload_2        
        //   107: anewarray       Ljava/lang/Thread;
        //   110: astore          6
        //   112: aload           5
        //   114: aload           6
        //   116: invokevirtual   java/lang/ThreadGroup.enumerate:([Ljava/lang/Thread;)I
        //   119: pop            
        //   120: iload_1        
        //   121: istore_0       
        //   122: iload_0        
        //   123: iload_2        
        //   124: if_icmpge       158
        //   127: aload           6
        //   129: iload_0        
        //   130: aaload         
        //   131: astore          4
        //   133: ldc             "GmsDynamite"
        //   135: aload           4
        //   137: invokevirtual   java/lang/Thread.getName:()Ljava/lang/String;
        //   140: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   143: istore_3       
        //   144: iload_3        
        //   145: ifeq            151
        //   148: goto            161
        //   151: iload_0        
        //   152: iconst_1       
        //   153: iadd           
        //   154: istore_0       
        //   155: goto            122
        //   158: aconst_null    
        //   159: astore          4
        //   161: aload           4
        //   163: astore          6
        //   165: aload           4
        //   167: ifnonnull       272
        //   170: new             LI2/c;
        //   173: dup            
        //   174: aload           5
        //   176: ldc             "GmsDynamite"
        //   178: invokespecial   I2/c.<init>:(Ljava/lang/ThreadGroup;Ljava/lang/String;)V
        //   181: astore          5
        //   183: aload           5
        //   185: aconst_null    
        //   186: invokevirtual   java/lang/Thread.setContextClassLoader:(Ljava/lang/ClassLoader;)V
        //   189: aload           5
        //   191: invokevirtual   java/lang/Thread.start:()V
        //   194: aload           5
        //   196: astore          4
        //   198: aload           4
        //   200: astore          6
        //   202: goto            272
        //   205: astore          6
        //   207: aload           5
        //   209: astore          4
        //   211: aload           6
        //   213: astore          5
        //   215: goto            226
        //   218: astore          5
        //   220: goto            226
        //   223: aconst_null    
        //   224: astore          4
        //   226: aload           5
        //   228: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   231: astore          5
        //   233: new             Ljava/lang/StringBuilder;
        //   236: dup            
        //   237: invokespecial   java/lang/StringBuilder.<init>:()V
        //   240: astore          6
        //   242: aload           6
        //   244: ldc             "Failed to enumerate thread/threadgroup "
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: pop            
        //   250: aload           6
        //   252: aload           5
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: pop            
        //   258: ldc             "DynamiteLoaderV2CL"
        //   260: aload           6
        //   262: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   265: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   268: pop            
        //   269: goto            198
        //   272: ldc             Ljava/lang/Void;.class
        //   274: monitorexit    
        //   275: ldc             LI2/d;.class
        //   277: monitorexit    
        //   278: aload           6
        //   280: areturn        
        //   281: ldc             Ljava/lang/Void;.class
        //   283: monitorexit    
        //   284: aload           4
        //   286: athrow         
        //   287: astore          4
        //   289: ldc             LI2/d;.class
        //   291: monitorexit    
        //   292: aload           4
        //   294: athrow         
        //   295: iload_0        
        //   296: iconst_1       
        //   297: iadd           
        //   298: istore_0       
        //   299: goto            51
        //   302: astore          4
        //   304: goto            281
        //   307: astore          5
        //   309: goto            223
        //   312: aconst_null    
        //   313: astore          4
        //   315: goto            78
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  3      14     287    295    Any
        //  24     27     287    295    Any
        //  27     47     307    226    Ljava/lang/SecurityException;
        //  27     47     302    287    Any
        //  62     75     307    226    Ljava/lang/SecurityException;
        //  62     75     302    287    Any
        //  87     100    307    226    Ljava/lang/SecurityException;
        //  87     100    302    287    Any
        //  100    120    307    226    Ljava/lang/SecurityException;
        //  100    120    302    287    Any
        //  133    144    307    226    Ljava/lang/SecurityException;
        //  133    144    302    287    Any
        //  170    183    218    223    Ljava/lang/SecurityException;
        //  170    183    302    287    Any
        //  183    194    205    218    Ljava/lang/SecurityException;
        //  183    194    302    287    Any
        //  226    269    302    287    Any
        //  272    275    302    287    Any
        //  281    284    302    287    Any
        //  284    287    287    295    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
