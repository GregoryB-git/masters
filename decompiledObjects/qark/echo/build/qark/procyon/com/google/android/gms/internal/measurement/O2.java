// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.util.Log;
import android.os.StrictMode$ThreadPolicy;
import java.io.File;
import android.os.StrictMode;
import W2.l;
import android.content.Context;

public final class O2
{
    public static l a(final Context context) {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        while (true) {
            try {
                StrictMode.allowThreadDiskWrites();
                final l d = d(context);
                l l;
                if (d.c()) {
                    l = W2.l.d(b(context, (File)d.b()));
                }
                else {
                    l = W2.l.a();
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return l;
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static K2 b(final Context p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: new             Ljava/io/InputStreamReader;
        //     7: dup            
        //     8: new             Ljava/io/FileInputStream;
        //    11: dup            
        //    12: aload_1        
        //    13: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    16: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    19: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    22: astore          4
        //    24: new             Lt/h;
        //    27: dup            
        //    28: invokespecial   t/h.<init>:()V
        //    31: astore          5
        //    33: new             Ljava/util/HashMap;
        //    36: dup            
        //    37: invokespecial   java/util/HashMap.<init>:()V
        //    40: astore          6
        //    42: aload           4
        //    44: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    47: astore_2       
        //    48: aload_2        
        //    49: ifnull          230
        //    52: aload_2        
        //    53: ldc             " "
        //    55: iconst_3       
        //    56: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //    59: astore          9
        //    61: aload           9
        //    63: arraylength    
        //    64: iconst_3       
        //    65: if_icmpeq       97
        //    68: new             Ljava/lang/StringBuilder;
        //    71: dup            
        //    72: ldc             "Invalid: "
        //    74: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    77: astore_3       
        //    78: aload_3        
        //    79: aload_2        
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    83: pop            
        //    84: ldc             "HermeticFileOverrides"
        //    86: aload_3        
        //    87: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    90: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    93: pop            
        //    94: goto            42
        //    97: aload           9
        //    99: iconst_0       
        //   100: aaload         
        //   101: invokestatic    com/google/android/gms/internal/measurement/O2.c:(Ljava/lang/String;)Ljava/lang/String;
        //   104: astore          7
        //   106: aload           9
        //   108: iconst_1       
        //   109: aaload         
        //   110: invokestatic    com/google/android/gms/internal/measurement/O2.c:(Ljava/lang/String;)Ljava/lang/String;
        //   113: invokestatic    android/net/Uri.decode:(Ljava/lang/String;)Ljava/lang/String;
        //   116: astore          8
        //   118: aload           6
        //   120: aload           9
        //   122: iconst_2       
        //   123: aaload         
        //   124: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   129: checkcast       Ljava/lang/String;
        //   132: astore_3       
        //   133: aload_3        
        //   134: astore_2       
        //   135: aload_3        
        //   136: ifnonnull       185
        //   139: aload           9
        //   141: iconst_2       
        //   142: aaload         
        //   143: invokestatic    com/google/android/gms/internal/measurement/O2.c:(Ljava/lang/String;)Ljava/lang/String;
        //   146: astore          9
        //   148: aload           9
        //   150: invokestatic    android/net/Uri.decode:(Ljava/lang/String;)Ljava/lang/String;
        //   153: astore_3       
        //   154: aload_3        
        //   155: invokevirtual   java/lang/String.length:()I
        //   158: sipush          1024
        //   161: if_icmplt       172
        //   164: aload_3        
        //   165: astore_2       
        //   166: aload_3        
        //   167: aload           9
        //   169: if_acmpne       185
        //   172: aload           6
        //   174: aload           9
        //   176: aload_3        
        //   177: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   182: pop            
        //   183: aload_3        
        //   184: astore_2       
        //   185: aload           5
        //   187: aload           7
        //   189: invokevirtual   t/h.containsKey:(Ljava/lang/Object;)Z
        //   192: ifne            210
        //   195: aload           5
        //   197: aload           7
        //   199: new             Lt/h;
        //   202: dup            
        //   203: invokespecial   t/h.<init>:()V
        //   206: invokevirtual   t/h.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   209: pop            
        //   210: aload           5
        //   212: aload           7
        //   214: invokevirtual   t/h.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   217: checkcast       Lt/h;
        //   220: aload           8
        //   222: aload_2        
        //   223: invokevirtual   t/h.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   226: pop            
        //   227: goto            42
        //   230: aload_1        
        //   231: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   234: astore_1       
        //   235: aload_0        
        //   236: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   239: astore_0       
        //   240: new             Ljava/lang/StringBuilder;
        //   243: dup            
        //   244: ldc             "Parsed "
        //   246: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   249: astore_2       
        //   250: aload_2        
        //   251: aload_1        
        //   252: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   255: pop            
        //   256: aload_2        
        //   257: ldc             " for Android package "
        //   259: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   262: pop            
        //   263: aload_2        
        //   264: aload_0        
        //   265: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   268: pop            
        //   269: ldc             "HermeticFileOverrides"
        //   271: aload_2        
        //   272: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   275: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   278: pop            
        //   279: new             Lcom/google/android/gms/internal/measurement/F2;
        //   282: dup            
        //   283: aload           5
        //   285: invokespecial   com/google/android/gms/internal/measurement/F2.<init>:(Lt/h;)V
        //   288: astore_0       
        //   289: aload           4
        //   291: invokevirtual   java/io/BufferedReader.close:()V
        //   294: aload_0        
        //   295: areturn        
        //   296: astore_0       
        //   297: goto            340
        //   300: aload           4
        //   302: invokevirtual   java/io/BufferedReader.close:()V
        //   305: goto            338
        //   308: astore_1       
        //   309: ldc             Ljava/lang/Throwable;.class
        //   311: ldc             "addSuppressed"
        //   313: iconst_1       
        //   314: anewarray       Ljava/lang/Class;
        //   317: dup            
        //   318: iconst_0       
        //   319: ldc             Ljava/lang/Throwable;.class
        //   321: aastore        
        //   322: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   325: aload_0        
        //   326: iconst_1       
        //   327: anewarray       Ljava/lang/Object;
        //   330: dup            
        //   331: iconst_0       
        //   332: aload_1        
        //   333: aastore        
        //   334: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   337: pop            
        //   338: aload_0        
        //   339: athrow         
        //   340: new             Ljava/lang/RuntimeException;
        //   343: dup            
        //   344: aload_0        
        //   345: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   348: athrow         
        //   349: astore_1       
        //   350: goto            338
        //   353: astore_0       
        //   354: goto            300
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      24     296    300    Ljava/io/IOException;
        //  24     42     353    357    Any
        //  42     48     353    357    Any
        //  52     94     353    357    Any
        //  97     133    353    357    Any
        //  139    164    353    357    Any
        //  172    183    353    357    Any
        //  185    210    353    357    Any
        //  210    227    353    357    Any
        //  230    289    353    357    Any
        //  289    294    296    300    Ljava/io/IOException;
        //  300    305    308    338    Any
        //  309    338    349    353    Ljava/lang/Exception;
        //  338    340    296    300    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
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
    
    public static final String c(final String original) {
        return new String(original);
    }
    
    public static l d(final Context context) {
        try {
            final File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                return l.d(file);
            }
            return l.a();
        }
        catch (RuntimeException ex) {
            Log.e("HermeticFileOverrides", "no data dir", (Throwable)ex);
            return l.a();
        }
    }
    
    public abstract static class a
    {
        public static volatile l a;
        
        public static l a(final Context context) {
            l a;
            String type;
            String tags;
            Context a2;
            final l a3;
            Label_0122_Outer:Label_0111_Outer:
            while (true) {
                // monitorenter(a.class)
                while (true) {
                    Label_0131: {
                        while (true) {
                            try {
                                if ((a = O2.a.a) == null) {
                                    new O2();
                                    type = Build.TYPE;
                                    tags = Build.TAGS;
                                    if ((type.equals("eng") || type.equals("userdebug")) && (tags.contains("dev-keys") || tags.contains("test-keys"))) {
                                        a2 = context;
                                        if (z2.a()) {
                                            if (M2.a(context)) {
                                                a2 = context;
                                            }
                                            else {
                                                a2 = N2.a(context);
                                            }
                                        }
                                        O2.a(a2);
                                        break Label_0131;
                                    }
                                    l.a();
                                    break Label_0131;
                                }
                                while (true) {
                                    return a;
                                    throw a3;
                                    O2.a.a = a3;
                                    a = a3;
                                    continue Label_0122_Outer;
                                }
                            }
                            // monitorexit(a.class)
                            // monitorexit(a.class)
                            finally {
                                continue Label_0111_Outer;
                            }
                            break;
                        }
                    }
                    continue;
                }
            }
        }
    }
}
