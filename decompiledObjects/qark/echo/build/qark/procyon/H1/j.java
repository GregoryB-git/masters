// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H1;

import java.nio.charset.Charset;
import android.text.TextUtils;
import kotlin.text.Regex;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import java.util.Map;
import x1.B;
import T1.a;
import java.io.File;

public final class j
{
    public static final j a;
    
    static {
        a = new j();
    }
    
    public static final File a() {
        if (T1.a.d(j.class)) {
            return null;
        }
        final File file2;
        Label_0057: {
            File file;
            try {
                file = new File(B.l().getFilesDir(), "facebook_ml/");
                if (!file.exists()) {
                    if (!file.mkdirs()) {
                        return file2;
                    }
                }
            }
            finally {
                break Label_0057;
            }
            file2 = file;
            return file2;
        }
        T1.a.b((Throwable)file2, j.class);
        return null;
    }
    
    public static final Map c(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     5: ifeq            10
        //     8: aconst_null    
        //     9: areturn        
        //    10: aload_0        
        //    11: ldc             "file"
        //    13: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: new             Ljava/io/FileInputStream;
        //    19: dup            
        //    20: aload_0        
        //    21: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    24: astore_0       
        //    25: aload_0        
        //    26: invokevirtual   java/io/InputStream.available:()I
        //    29: istore          6
        //    31: new             Ljava/io/DataInputStream;
        //    34: dup            
        //    35: aload_0        
        //    36: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    39: astore          10
        //    41: iload           6
        //    43: newarray        B
        //    45: astore_0       
        //    46: aload           10
        //    48: aload_0        
        //    49: invokevirtual   java/io/DataInputStream.readFully:([B)V
        //    52: aload           10
        //    54: invokevirtual   java/io/InputStream.close:()V
        //    57: iload           6
        //    59: iconst_4       
        //    60: if_icmpge       65
        //    63: aconst_null    
        //    64: areturn        
        //    65: aload_0        
        //    66: iconst_0       
        //    67: iconst_4       
        //    68: invokestatic    java/nio/ByteBuffer.wrap:([BII)Ljava/nio/ByteBuffer;
        //    71: astore          10
        //    73: aload           10
        //    75: getstatic       java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        //    78: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //    81: pop            
        //    82: aload           10
        //    84: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //    87: istore_1       
        //    88: iload_1        
        //    89: iconst_4       
        //    90: iadd           
        //    91: istore_2       
        //    92: iload           6
        //    94: iload_2        
        //    95: if_icmpge       100
        //    98: aconst_null    
        //    99: areturn        
        //   100: new             Lorg/json/JSONObject;
        //   103: dup            
        //   104: new             Ljava/lang/String;
        //   107: dup            
        //   108: aload_0        
        //   109: iconst_4       
        //   110: iload_1        
        //   111: getstatic       kotlin/text/b.b:Ljava/nio/charset/Charset;
        //   114: invokespecial   java/lang/String.<init>:([BIILjava/nio/charset/Charset;)V
        //   117: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   120: astore          10
        //   122: aload           10
        //   124: invokevirtual   org/json/JSONObject.names:()Lorg/json/JSONArray;
        //   127: astore          12
        //   129: aload           12
        //   131: invokevirtual   org/json/JSONArray.length:()I
        //   134: istore          7
        //   136: iload           7
        //   138: anewarray       Ljava/lang/String;
        //   141: astore          11
        //   143: iload           7
        //   145: iconst_1       
        //   146: isub           
        //   147: istore          4
        //   149: iload           4
        //   151: iflt            190
        //   154: iconst_0       
        //   155: istore_1       
        //   156: iload_1        
        //   157: iconst_1       
        //   158: iadd           
        //   159: istore_3       
        //   160: aload           11
        //   162: iload_1        
        //   163: aload           12
        //   165: iload_1        
        //   166: invokevirtual   org/json/JSONArray.getString:(I)Ljava/lang/String;
        //   169: aastore        
        //   170: iload_3        
        //   171: iload           4
        //   173: if_icmple       179
        //   176: goto            190
        //   179: iload_3        
        //   180: istore_1       
        //   181: goto            156
        //   184: astore_0       
        //   185: goto            354
        //   188: aconst_null    
        //   189: areturn        
        //   190: aload           11
        //   192: invokestatic    W5/g.f:([Ljava/lang/Object;)V
        //   195: new             Ljava/util/HashMap;
        //   198: dup            
        //   199: invokespecial   java/util/HashMap.<init>:()V
        //   202: astore          12
        //   204: iconst_0       
        //   205: istore_3       
        //   206: iload_2        
        //   207: istore_1       
        //   208: iload_3        
        //   209: istore_2       
        //   210: goto            370
        //   213: aload           10
        //   215: aload           13
        //   217: invokevirtual   org/json/JSONObject.getJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
        //   220: astore          15
        //   222: aload           15
        //   224: invokevirtual   org/json/JSONArray.length:()I
        //   227: istore_2       
        //   228: iload_2        
        //   229: newarray        I
        //   231: astore          14
        //   233: iload_2        
        //   234: iconst_1       
        //   235: isub           
        //   236: istore          8
        //   238: iconst_1       
        //   239: istore_2       
        //   240: iconst_1       
        //   241: istore_3       
        //   242: iload           8
        //   244: iflt            413
        //   247: iload           5
        //   249: istore_2       
        //   250: iload_2        
        //   251: iconst_1       
        //   252: iadd           
        //   253: istore          5
        //   255: aload           15
        //   257: iload_2        
        //   258: invokevirtual   org/json/JSONArray.getInt:(I)I
        //   261: istore          9
        //   263: aload           14
        //   265: iload_2        
        //   266: iload           9
        //   268: iastore        
        //   269: iload_3        
        //   270: iload           9
        //   272: imul           
        //   273: istore_3       
        //   274: iload           5
        //   276: iload           8
        //   278: if_icmple       401
        //   281: iload_3        
        //   282: istore_2       
        //   283: goto            413
        //   286: aload_0        
        //   287: iload_1        
        //   288: iload           5
        //   290: invokestatic    java/nio/ByteBuffer.wrap:([BII)Ljava/nio/ByteBuffer;
        //   293: astore          15
        //   295: aload           15
        //   297: getstatic       java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        //   300: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //   303: pop            
        //   304: new             LH1/a;
        //   307: dup            
        //   308: aload           14
        //   310: invokespecial   H1/a.<init>:([I)V
        //   313: astore          14
        //   315: aload           15
        //   317: invokevirtual   java/nio/ByteBuffer.asFloatBuffer:()Ljava/nio/FloatBuffer;
        //   320: aload           14
        //   322: invokevirtual   H1/a.a:()[F
        //   325: iconst_0       
        //   326: iload_2        
        //   327: invokevirtual   java/nio/FloatBuffer.get:([FII)Ljava/nio/FloatBuffer;
        //   330: pop            
        //   331: aload           12
        //   333: aload           13
        //   335: aload           14
        //   337: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   342: pop            
        //   343: iload_3        
        //   344: istore_1       
        //   345: iload           4
        //   347: istore_2       
        //   348: goto            370
        //   351: aload           12
        //   353: areturn        
        //   354: aload_0        
        //   355: ldc             LH1/j;.class
        //   357: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   360: aconst_null    
        //   361: areturn        
        //   362: astore_0       
        //   363: goto            188
        //   366: astore_0       
        //   367: goto            411
        //   370: iconst_0       
        //   371: istore          5
        //   373: iload_2        
        //   374: iload           7
        //   376: if_icmpge       351
        //   379: aload           11
        //   381: iload_2        
        //   382: aaload         
        //   383: astore          13
        //   385: iload_2        
        //   386: iconst_1       
        //   387: iadd           
        //   388: istore          4
        //   390: aload           13
        //   392: ifnonnull       213
        //   395: iload           4
        //   397: istore_2       
        //   398: goto            370
        //   401: iload           5
        //   403: istore_2       
        //   404: goto            250
        //   407: astore_0       
        //   408: goto            354
        //   411: aconst_null    
        //   412: areturn        
        //   413: iload_2        
        //   414: iconst_4       
        //   415: imul           
        //   416: istore          5
        //   418: iload_1        
        //   419: iload           5
        //   421: iadd           
        //   422: istore_3       
        //   423: iload_3        
        //   424: iload           6
        //   426: if_icmple       286
        //   429: aconst_null    
        //   430: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     16     184    188    Any
        //  16     57     362    190    Ljava/lang/Exception;
        //  16     57     407    411    Any
        //  65     88     362    190    Ljava/lang/Exception;
        //  65     88     407    411    Any
        //  100    143    362    190    Ljava/lang/Exception;
        //  100    143    407    411    Any
        //  160    170    362    190    Ljava/lang/Exception;
        //  160    170    184    188    Any
        //  190    204    362    190    Ljava/lang/Exception;
        //  190    204    407    411    Any
        //  213    233    362    190    Ljava/lang/Exception;
        //  213    233    407    411    Any
        //  255    263    366    370    Ljava/lang/Exception;
        //  255    263    407    411    Any
        //  286    343    366    370    Ljava/lang/Exception;
        //  286    343    407    411    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    public final String b(String s) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(s, "str");
                int n = s.length() - 1;
                int n2;
                int i = n2 = 0;
                while (i <= n) {
                    int n3;
                    if (n2 == 0) {
                        n3 = i;
                    }
                    else {
                        n3 = n;
                    }
                    final boolean b = Intrinsics.d(s.charAt(n3), 32) <= 0;
                    if (n2 == 0) {
                        if (!b) {
                            n2 = 1;
                        }
                        else {
                            ++i;
                        }
                    }
                    else {
                        if (!b) {
                            break;
                        }
                        --n;
                    }
                }
                s = s.subSequence(i, n + 1).toString();
                final Object[] array = new Regex("\\s+").c(s, 0).toArray(new String[0]);
                if (array != null) {
                    s = TextUtils.join((CharSequence)" ", (Object[])array);
                    Intrinsics.checkNotNullExpressionValue(s, "join(\" \", strArray)");
                    return s;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final int[] d(String b, final int n) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            while (true) {
                int[] array = null;
                int n3 = 0;
                Label_0114: {
                    int n2 = 0;
                    Label_0109: {
                        while (true) {
                            try {
                                Intrinsics.checkNotNullParameter(b, "texts");
                                array = new int[n];
                                b = this.b(b);
                                final Charset forName = Charset.forName("UTF-8");
                                Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
                                if (b == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                                final byte[] bytes = b.getBytes(forName);
                                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                                if (n <= 0) {
                                    return array;
                                }
                                n2 = 0;
                                n3 = n2 + 1;
                                if (n2 < ((Throwable)(Object)bytes).length) {
                                    array[n2] = (bytes[n2] & 0xFF);
                                    break Label_0114;
                                }
                                break Label_0109;
                                T1.a.b((Throwable)(Object)bytes, this);
                                return null;
                            }
                            finally {
                                continue;
                            }
                            break;
                        }
                    }
                    array[n2] = 0;
                }
                if (n3 >= n) {
                    return array;
                }
                int n2 = n3;
                continue;
            }
        }
    }
}
