// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H1;

import kotlin.jvm.internal.Intrinsics;

public final class i
{
    public static final i a;
    
    static {
        a = new i();
    }
    
    public static final void a(final a a, a a2) {
        if (T1.a.d(i.class)) {
            return;
        }
    Label_0119_Outer:
        while (true) {
            final Throwable t;
            Label_0150: {
                while (true) {
                    while (true) {
                        int b3 = 0;
                        int n5 = 0;
                        Label_0169: {
                            while (true) {
                                int b2 = 0;
                                int n = 0;
                                Label_0157: {
                                    int b;
                                    try {
                                        Intrinsics.checkNotNullParameter(a, "x");
                                        Intrinsics.checkNotNullParameter(a2, "b");
                                        b = a.b(0);
                                        b2 = a.b(1);
                                        b3 = a.b(2);
                                        a.a();
                                        a2 = (a)(Object)a2.a();
                                        if (b > 0) {
                                            n = 0;
                                            break Label_0157;
                                        }
                                        return;
                                        final int n3;
                                        final int n2 = n3 + 1;
                                        final int n4 = n * b2 * b3 + n5 * b3 + n3;
                                        t[n4] += a2[n3];
                                        // iftrue(Label_0108:, n2 < b3)
                                        Block_8: {
                                            break Block_8;
                                            Label_0108: {
                                                n3 = n2;
                                            }
                                            continue Label_0119_Outer;
                                        }
                                    }
                                    finally {
                                        break Label_0150;
                                    }
                                    final int n6;
                                    if (n6 < b2) {
                                        n5 = n6;
                                        break Label_0169;
                                    }
                                    final int n7;
                                    if (n7 >= b) {
                                        return;
                                    }
                                    n = n7;
                                }
                                final int n7 = n + 1;
                                if (b2 <= 0) {
                                    continue;
                                }
                                break;
                            }
                            n5 = 0;
                        }
                        final int n6 = n5 + 1;
                        if (b3 > 0) {
                            final int n3 = 0;
                            continue Label_0119_Outer;
                        }
                        break;
                    }
                    continue;
                }
            }
            T1.a.b(t, i.class);
        }
    }
    
    public static final a b(final a[] p0) {
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
        //    11: ldc             "tensors"
        //    13: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: aload_0        
        //    17: iconst_0       
        //    18: aaload         
        //    19: iconst_0       
        //    20: invokevirtual   H1/a.b:(I)I
        //    23: istore          7
        //    25: aload_0        
        //    26: arraylength    
        //    27: iconst_1       
        //    28: isub           
        //    29: istore          4
        //    31: iload           4
        //    33: iflt            220
        //    36: iconst_0       
        //    37: istore_1       
        //    38: iload_1        
        //    39: istore_2       
        //    40: iload_1        
        //    41: iconst_1       
        //    42: iadd           
        //    43: istore_3       
        //    44: iload_2        
        //    45: aload_0        
        //    46: iload_1        
        //    47: aaload         
        //    48: iconst_1       
        //    49: invokevirtual   H1/a.b:(I)I
        //    52: iadd           
        //    53: istore_2       
        //    54: iload_3        
        //    55: iload           4
        //    57: if_icmple       211
        //    60: iload_2        
        //    61: istore_1       
        //    62: goto            65
        //    65: new             LH1/a;
        //    68: dup            
        //    69: iconst_2       
        //    70: newarray        I
        //    72: dup            
        //    73: iconst_0       
        //    74: iload           7
        //    76: iastore        
        //    77: dup            
        //    78: iconst_1       
        //    79: iload_1        
        //    80: iastore        
        //    81: invokespecial   H1/a.<init>:([I)V
        //    84: astore          9
        //    86: aload           9
        //    88: invokevirtual   H1/a.a:()[F
        //    91: astore          10
        //    93: iload           7
        //    95: ifle            200
        //    98: iconst_0       
        //    99: istore_2       
        //   100: iload_2        
        //   101: iconst_1       
        //   102: iadd           
        //   103: istore          5
        //   105: iload_2        
        //   106: iload_1        
        //   107: imul           
        //   108: istore_3       
        //   109: aload_0        
        //   110: arraylength    
        //   111: iconst_1       
        //   112: isub           
        //   113: istore          8
        //   115: iload           8
        //   117: iflt            184
        //   120: iconst_0       
        //   121: istore          4
        //   123: iload           4
        //   125: iconst_1       
        //   126: iadd           
        //   127: istore          6
        //   129: aload_0        
        //   130: iload           4
        //   132: aaload         
        //   133: invokevirtual   H1/a.a:()[F
        //   136: astore          11
        //   138: aload_0        
        //   139: iload           4
        //   141: aaload         
        //   142: iconst_1       
        //   143: invokevirtual   H1/a.b:(I)I
        //   146: istore          4
        //   148: aload           11
        //   150: iload_2        
        //   151: iload           4
        //   153: imul           
        //   154: aload           10
        //   156: iload_3        
        //   157: iload           4
        //   159: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   162: iload_3        
        //   163: iload           4
        //   165: iadd           
        //   166: istore_3       
        //   167: iload           6
        //   169: iload           8
        //   171: if_icmple       177
        //   174: goto            184
        //   177: iload           6
        //   179: istore          4
        //   181: goto            123
        //   184: iload           5
        //   186: iload           7
        //   188: if_icmplt       194
        //   191: aload           9
        //   193: areturn        
        //   194: iload           5
        //   196: istore_2       
        //   197: goto            100
        //   200: aload           9
        //   202: areturn        
        //   203: aload_0        
        //   204: ldc             LH1/i;.class
        //   206: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   209: aconst_null    
        //   210: areturn        
        //   211: iload_3        
        //   212: istore_1       
        //   213: goto            40
        //   216: astore_0       
        //   217: goto            203
        //   220: iconst_0       
        //   221: istore_1       
        //   222: goto            65
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  10     31     216    211    Any
        //  44     54     216    211    Any
        //  65     93     216    211    Any
        //  109    115    216    211    Any
        //  129    162    216    211    Any
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
    
    public static final a c(a a, a a2) {
        final Class<i> clazz = i.class;
        if (T1.a.d(i.class)) {
            return null;
        }
        int b;
        int b2;
        int b3;
        int b4 = 0;
        int n;
        int b5;
        a a3;
        float[] a4;
        float[] a5;
        float[] a6;
        int n2;
        Class<i> clazz2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        float n8 = 0.0f;
        float n9;
        int n10;
        int n11 = 0;
        int n12;
        int n13 = 0;
        Class<i> clazz3;
        final Class<i> clazz4;
        Label_0176_Outer:Label_0250_Outer:
        while (true) {
        Label_0250:
            while (true) {
                Label_0388: {
                    while (true) {
                        Label_0371: {
                            while (true) {
                            Block_10_Outer:
                                while (true) {
                                    Label_0361: {
                                        try {
                                            Intrinsics.checkNotNullParameter(a, "x");
                                            Intrinsics.checkNotNullParameter(a2, "w");
                                            b = a.b(0);
                                            b2 = a.b(1);
                                            b3 = a.b(2);
                                            b4 = a2.b(0);
                                            n = b2 - b4 + 1;
                                            b5 = a2.b(2);
                                            a3 = new a(new int[] { b, n, b5 });
                                            a4 = a.a();
                                            a5 = a3.a();
                                            a6 = a2.a();
                                            if (b <= 0) {
                                                return a3;
                                            }
                                            n2 = 0;
                                            a2 = a3;
                                            clazz2 = clazz;
                                            while (true) {
                                                while (true) {
                                                    while (true) {
                                                        while (true) {
                                                            n3 = n2 + 1;
                                                            if (b5 > 0) {
                                                                n4 = 0;
                                                                while (true) {
                                                                    n5 = n4 + 1;
                                                                    if (n > 0) {
                                                                        n6 = 0;
                                                                        n7 = n6 + 1;
                                                                        n8 = 0.0f;
                                                                        n9 = 0.0f;
                                                                        if (b4 <= 0) {
                                                                            break Label_0388;
                                                                        }
                                                                        n10 = 0;
                                                                        n11 = n10 + 1;
                                                                        if (b3 <= 0) {
                                                                            break Label_0371;
                                                                        }
                                                                        n12 = 0;
                                                                        n13 = n12 + 1;
                                                                        n9 += a4[b2 * b3 * n2 + (n10 + n6) * b3 + n12] * a6[(n10 * b3 + n12) * b5 + n4];
                                                                        if (n13 >= b3) {
                                                                            break Label_0371;
                                                                        }
                                                                        break Label_0361;
                                                                    }
                                                                    else {
                                                                        clazz3 = clazz2;
                                                                        a = a2;
                                                                        if (n5 >= b5) {
                                                                            break;
                                                                        }
                                                                        n4 = n5;
                                                                        a2 = a;
                                                                        clazz2 = clazz3;
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                clazz3 = clazz2;
                                                                a = a2;
                                                            }
                                                            if (n3 >= b) {
                                                                return a;
                                                            }
                                                            n2 = n3;
                                                            a2 = a;
                                                            clazz2 = clazz3;
                                                        }
                                                        Label_0286: {
                                                            n6 = n7;
                                                        }
                                                        continue Label_0176_Outer;
                                                    }
                                                    clazz3 = clazz4;
                                                    a = a2;
                                                    continue Block_10_Outer;
                                                }
                                                a5[n * b5 * n2 + n6 * b5 + n4] = n9;
                                                continue Label_0250_Outer;
                                            }
                                        }
                                        // iftrue(Label_0286:, n7 < n)
                                        finally {
                                            break Block_10_Outer;
                                            T1.a.b((Throwable)clazz4, i.class);
                                            return null;
                                        }
                                    }
                                    n12 = n13;
                                    continue Label_0250_Outer;
                                }
                                continue;
                            }
                        }
                        if (n11 >= b4) {
                            continue Label_0250;
                        }
                        n10 = n11;
                        continue Label_0250_Outer;
                    }
                }
                n9 = n8;
                continue Label_0250;
            }
        }
    }
    
    public static final a d(a h, a a, a a2) {
        if (T1.a.d(i.class)) {
            return null;
        }
    Label_0117_Outer:
        while (true) {
            final Throwable t;
        Label_0117:
            while (true) {
                while (true) {
                    int b2 = 0;
                    int n = 0;
                    Label_0142: {
                        int b;
                        try {
                            Intrinsics.checkNotNullParameter(h, "x");
                            Intrinsics.checkNotNullParameter(a, "w");
                            Intrinsics.checkNotNullParameter(a2, "b");
                            b = h.b(0);
                            b2 = a2.b(0);
                            h = h(h, a);
                            a = (a)(Object)a2.a();
                            a2 = (a)(Object)h.a();
                            if (b > 0) {
                                n = 0;
                                break Label_0142;
                            }
                            return (a)t;
                            // iftrue(Label_0106:, n2 < b2)
                            int n2;
                            while (true) {
                                break Label_0117;
                                final int n3;
                                n2 = n3 + 1;
                                final int n4 = n * b2 + n3;
                                a2[n4] += a[n3];
                                continue Label_0117_Outer;
                            }
                            Label_0106: {
                                final int n3 = n2;
                            }
                            continue;
                        }
                        finally {
                            break Label_0117;
                        }
                        final int n5;
                        if (n5 >= b) {
                            return (a)t;
                        }
                        n = n5;
                    }
                    final int n5 = n + 1;
                    if (b2 > 0) {
                        final int n3 = 0;
                        continue;
                    }
                    break;
                }
                continue Label_0117;
            }
            T1.a.b(t, i.class);
            return null;
        }
    }
    
    public static final a e(final String[] p0, final int p1, final a p2) {
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
        //    11: ldc             "texts"
        //    13: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: aload_2        
        //    17: ldc             "w"
        //    19: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    22: aload_0        
        //    23: arraylength    
        //    24: istore          7
        //    26: aload_2        
        //    27: iconst_1       
        //    28: invokevirtual   H1/a.b:(I)I
        //    31: istore          8
        //    33: new             LH1/a;
        //    36: dup            
        //    37: iconst_3       
        //    38: newarray        I
        //    40: dup            
        //    41: iconst_0       
        //    42: iload           7
        //    44: iastore        
        //    45: dup            
        //    46: iconst_1       
        //    47: iload_1        
        //    48: iastore        
        //    49: dup            
        //    50: iconst_2       
        //    51: iload           8
        //    53: iastore        
        //    54: invokespecial   H1/a.<init>:([I)V
        //    57: astore          9
        //    59: aload           9
        //    61: invokevirtual   H1/a.a:()[F
        //    64: astore          10
        //    66: aload_2        
        //    67: invokevirtual   H1/a.a:()[F
        //    70: astore_2       
        //    71: iload           7
        //    73: ifle            172
        //    76: iconst_0       
        //    77: istore_3       
        //    78: iload_3        
        //    79: iconst_1       
        //    80: iadd           
        //    81: istore          5
        //    83: getstatic       H1/j.a:LH1/j;
        //    86: aload_0        
        //    87: iload_3        
        //    88: aaload         
        //    89: iload_1        
        //    90: invokevirtual   H1/j.d:(Ljava/lang/String;I)[I
        //    93: astore          11
        //    95: iload_1        
        //    96: ifle            156
        //    99: iconst_0       
        //   100: istore          4
        //   102: iload           4
        //   104: iconst_1       
        //   105: iadd           
        //   106: istore          6
        //   108: aload_2        
        //   109: aload           11
        //   111: iload           4
        //   113: iaload         
        //   114: iload           8
        //   116: imul           
        //   117: aload           10
        //   119: iload           8
        //   121: iload_1        
        //   122: imul           
        //   123: iload_3        
        //   124: imul           
        //   125: iload           4
        //   127: iload           8
        //   129: imul           
        //   130: iadd           
        //   131: iload           8
        //   133: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   136: iload           6
        //   138: iload_1        
        //   139: if_icmplt       145
        //   142: goto            156
        //   145: iload           6
        //   147: istore          4
        //   149: goto            102
        //   152: astore_0       
        //   153: goto            175
        //   156: iload           5
        //   158: iload           7
        //   160: if_icmplt       166
        //   163: aload           9
        //   165: areturn        
        //   166: iload           5
        //   168: istore_3       
        //   169: goto            78
        //   172: aload           9
        //   174: areturn        
        //   175: aload_0        
        //   176: ldc             LH1/i;.class
        //   178: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   181: aconst_null    
        //   182: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  10     71     152    156    Any
        //  83     95     152    156    Any
        //  108    136    152    156    Any
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
    
    public static final void f(a a, final int n) {
        if (T1.a.d(i.class)) {
            return;
        }
        while (true) {
            while (true) {
                int n3 = 0;
                Label_0134: {
                    while (true) {
                        try {
                            Intrinsics.checkNotNullParameter(a, "x");
                            if (n >= a.c()) {
                                return;
                            }
                            final int c = a.c();
                            int n2 = 1;
                            n3 = 1;
                            if (n < c) {
                                int n4 = n;
                                n2 = n3;
                                while (true) {
                                    n3 = n4 + 1;
                                    n2 *= a.b(n4);
                                    if (n3 >= c) {
                                        break;
                                    }
                                    n4 = n3;
                                }
                            }
                            final int[] array = new int[n + 1];
                            if (n > 0) {
                                final int n5 = 0;
                                n3 = n5 + 1;
                                array[n5] = a.b(n5);
                                if (n3 < n) {
                                    break Label_0134;
                                }
                            }
                            array[n] = n2;
                            a.d(array);
                            return;
                            T1.a.b((Throwable)a, i.class);
                            return;
                        }
                        finally {}
                        final a a2;
                        a = a2;
                        continue;
                    }
                }
                final int n5 = n3;
                continue;
            }
        }
    }
    
    public static final a g(final a a, final int n) {
        if (T1.a.d(i.class)) {
            return null;
        }
    Label_0155_Outer:
        while (true) {
            final Throwable t;
            Label_0208: {
                while (true) {
                    while (true) {
                        int b2 = 0;
                        int b3 = 0;
                        int n2 = 0;
                        float[] a3 = null;
                        int n3 = 0;
                        int n8 = 0;
                        int n11 = 0;
                        Label_0243: {
                            while (true) {
                                Label_0230: {
                                    while (true) {
                                        Label_0216: {
                                            int b;
                                            a a2;
                                            try {
                                                Intrinsics.checkNotNullParameter(a, "x");
                                                b = a.b(0);
                                                b2 = a.b(1);
                                                b3 = a.b(2);
                                                n2 = b2 - n + 1;
                                                a2 = new a(new int[] { b, n2, b3 });
                                                a.a();
                                                a3 = a2.a();
                                                if (b > 0) {
                                                    n3 = 0;
                                                    break Label_0216;
                                                }
                                                return a2;
                                                final int n5;
                                                final int n4 = n5 + 1;
                                                final int n6;
                                                final int n7;
                                                a3[n6] = Math.max(a3[n6], t[n3 * b2 * b3 + n7 + n8 + n5 * b3]);
                                                // iftrue(Label_0144:, n4 < n)
                                                Block_10: {
                                                    break Block_10;
                                                    Label_0144: {
                                                        n5 = n4;
                                                    }
                                                    continue Label_0155_Outer;
                                                }
                                                final int n9;
                                                b2 = n9;
                                            }
                                            finally {
                                                break Label_0208;
                                            }
                                            final int n10;
                                            if (n10 < n2) {
                                                n11 = n10;
                                                break Label_0243;
                                            }
                                            final int n12;
                                            if (n12 < b3) {
                                                n8 = n12;
                                                break Label_0230;
                                            }
                                            final int n13;
                                            if (n13 >= b) {
                                                return a2;
                                            }
                                            n3 = n13;
                                        }
                                        final int n13 = n3 + 1;
                                        if (b3 <= 0) {
                                            continue;
                                        }
                                        break;
                                    }
                                    n8 = 0;
                                }
                                final int n12 = n8 + 1;
                                if (n2 <= 0) {
                                    continue;
                                }
                                break;
                            }
                            n11 = 0;
                        }
                        final int n10 = n11 + 1;
                        final int n7 = n11 * b3;
                        final int n6 = n3 * n2 * b3 + n7 + n8;
                        a3[n6] = Float.MIN_VALUE;
                        if (n > 0) {
                            final int n5 = 0;
                            final int n9 = b2;
                            continue Label_0155_Outer;
                        }
                        break;
                    }
                    continue;
                }
            }
            T1.a.b(t, i.class);
            return null;
        }
    }
    
    public static final a h(final a a, a a2) {
        if (T1.a.d(i.class)) {
            return null;
        }
    Label_0149_Outer:
        while (true) {
            final Throwable t;
        Label_0149:
            while (true) {
                while (true) {
                    int b2 = 0;
                    int b3 = 0;
                    float[] a4 = null;
                    int n = 0;
                    int n5 = 0;
                    Label_0204: {
                        while (true) {
                            Label_0192: {
                                int b;
                                a a3;
                                try {
                                    Intrinsics.checkNotNullParameter(a, "x");
                                    Intrinsics.checkNotNullParameter(a2, "w");
                                    b = a.b(0);
                                    b2 = a2.b(0);
                                    b3 = a2.b(1);
                                    a3 = new a(new int[] { b, b3 });
                                    a.a();
                                    a2 = (a)(Object)a2.a();
                                    a4 = a3.a();
                                    if (b > 0) {
                                        n = 0;
                                        break Label_0192;
                                    }
                                    return a3;
                                    Label_0138: {
                                        final int n3;
                                        final int n2 = n3;
                                    }
                                    break Label_0092;
                                    break Label_0149;
                                    final int n2;
                                    final int n3 = n2 + 1;
                                    final int n4;
                                    a4[n4] += t[n * b2 + n2] * a2[n2 * b3 + n5];
                                }
                                // iftrue(Label_0138:, n3 < b2)
                                finally {
                                    break Label_0149;
                                }
                                final int n6;
                                if (n6 < b3) {
                                    n5 = n6;
                                    break Label_0204;
                                }
                                final int n7;
                                if (n7 >= b) {
                                    return a3;
                                }
                                n = n7;
                            }
                            final int n7 = n + 1;
                            if (b3 <= 0) {
                                continue;
                            }
                            break;
                        }
                        n5 = 0;
                    }
                    final int n6 = n5 + 1;
                    final int n4 = n * b3 + n5;
                    a4[n4] = 0.0f;
                    if (b2 > 0) {
                        final int n2 = 0;
                        continue Label_0149_Outer;
                    }
                    break;
                }
                continue Label_0149;
            }
            T1.a.b(t, i.class);
            return null;
        }
    }
    
    public static final void i(final a a) {
        if (T1.a.d(i.class)) {
            return;
        }
        while (true) {
            float[] a2 = null;
        Label_0066:
            while (true) {
                int n;
                int n3;
                try {
                    Intrinsics.checkNotNullParameter(a, "x");
                    a2 = a.a();
                    n = ((Throwable)(Object)a2).length - 1;
                    if (n < 0) {
                        return;
                    }
                    final int n2 = 0;
                    n3 = n2 + 1;
                    if (a2[n2] < 0.0f) {
                        a2[n2] = 0.0f;
                    }
                }
                finally {
                    break Label_0066;
                }
                if (n3 > n) {
                    return;
                }
                final int n2 = n3;
                continue;
            }
            T1.a.b((Throwable)(Object)a2, i.class);
        }
    }
    
    public static final void j(final a a) {
        if (T1.a.d(i.class)) {
            return;
        }
        int n = 0;
        int b;
        int b2;
        Object a2;
        int n2;
        int n3 = 0;
        float n4;
        float n5;
        int n6;
        int n7;
        float n8;
        int n9;
        int n10;
        float n11;
        final Throwable t;
        float n12;
        Label_0082_Outer:Block_7_Outer:
        while (true) {
        Block_7:
            while (true) {
                while (true) {
                Label_0246:
                    while (true) {
                        Label_0219: {
                            while (true) {
                                try {
                                    Intrinsics.checkNotNullParameter(a, "x");
                                    n = 0;
                                    b = a.b(0);
                                    b2 = a.b(1);
                                    a2 = a.a();
                                    if (b <= 0) {
                                        return;
                                    }
                                    // iftrue(Label_0108:, n9 < n3)
                                    // iftrue(Label_0239:, n7 < n3)
                                    while (true) {
                                        n2 = n + 1;
                                        n *= b2;
                                        n3 = n + b2;
                                        n4 = Float.MIN_VALUE;
                                        n5 = Float.MIN_VALUE;
                                        if (n < n3) {
                                            n6 = n;
                                            while (true) {
                                                n7 = n6 + 1;
                                                n8 = a2[n6];
                                                n4 = n5;
                                                if (n8 > n5) {
                                                    n4 = n8;
                                                }
                                                if (n7 >= n3) {
                                                    break;
                                                }
                                                n6 = n7;
                                                n5 = n4;
                                            }
                                        }
                                        break Label_0219;
                                        n9 = n + 1;
                                        a2[n] /= n5;
                                        break Block_7;
                                        n7 = n10 + 1;
                                        n11 = (float)Math.exp((double)(a2[n10] - n4));
                                        a2[n10] = n11;
                                        n5 += n11;
                                        break Label_0246;
                                        Label_0123: {
                                            n = n2;
                                        }
                                        continue Label_0082_Outer;
                                    }
                                    // iftrue(Label_0123:, n2 < b)
                                    return;
                                    T1.a.b((Throwable)a2, i.class);
                                    return;
                                    Label_0108: {
                                        n = n9;
                                    }
                                    continue Block_7_Outer;
                                }
                                finally {}
                                a2 = t;
                                continue;
                            }
                        }
                        n5 = 0.0f;
                        n12 = 0.0f;
                        if (n < n3) {
                            n10 = n;
                            n5 = n12;
                            continue;
                        }
                        break Label_0246;
                        Label_0239: {
                            n10 = n7;
                        }
                        continue;
                    }
                    if (n < n3) {
                        continue Block_7_Outer;
                    }
                    break;
                }
                continue Block_7;
            }
        }
    }
    
    public static final a k(final a a) {
        if (T1.a.d(i.class)) {
            return null;
        }
    Label_0116_Outer:
        while (true) {
            final Throwable t;
            Label_0133: {
                while (true) {
                    while (true) {
                        int b2 = 0;
                        int n = 0;
                        Label_0141: {
                            int b;
                            a a2;
                            try {
                                Intrinsics.checkNotNullParameter(a, "x");
                                b = a.b(0);
                                b2 = a.b(1);
                                a2 = new a(new int[] { b2, b });
                                a.a();
                                final float[] a3 = a2.a();
                                if (b > 0) {
                                    n = 0;
                                    break Label_0141;
                                }
                                return a2;
                                final int n3;
                                final int n2 = n3 + 1;
                                a3[n3 * b + n] = t[n * b2 + n3];
                                // iftrue(Label_0106:, n2 < b2)
                                Block_6: {
                                    break Block_6;
                                    Label_0106: {
                                        n3 = n2;
                                    }
                                    continue Label_0116_Outer;
                                }
                            }
                            finally {
                                break Label_0133;
                            }
                            final int n4;
                            if (n4 >= b) {
                                return a2;
                            }
                            n = n4;
                        }
                        final int n4 = n + 1;
                        if (b2 > 0) {
                            final int n3 = 0;
                            continue Label_0116_Outer;
                        }
                        break;
                    }
                    continue;
                }
            }
            T1.a.b(t, i.class);
            return null;
        }
    }
    
    public static final a l(final a a) {
        if (T1.a.d(i.class)) {
            return null;
        }
    Label_0144_Outer:
        while (true) {
            final Throwable t;
        Label_0144:
            while (true) {
                while (true) {
                    int b3 = 0;
                    int n4 = 0;
                    Label_0199: {
                        while (true) {
                            int b2 = 0;
                            int n = 0;
                            Label_0187: {
                                int b;
                                a a2;
                                try {
                                    Intrinsics.checkNotNullParameter(a, "x");
                                    b = a.b(0);
                                    b2 = a.b(1);
                                    b3 = a.b(2);
                                    a2 = new a(new int[] { b3, b2, b });
                                    a.a();
                                    final float[] a3 = a2.a();
                                    if (b > 0) {
                                        n = 0;
                                        break Label_0187;
                                    }
                                    return a2;
                                    Label_0134: {
                                        final int n3;
                                        final int n2 = n3;
                                    }
                                    break Label_0086;
                                    break Label_0144;
                                    final int n2;
                                    final int n3 = n2 + 1;
                                    a3[n2 * b * b2 + n4 * b + n] = t[n * b2 * b3 + n4 * b3 + n2];
                                }
                                // iftrue(Label_0134:, n3 < b3)
                                finally {
                                    break Label_0144;
                                }
                                final int n5;
                                if (n5 < b2) {
                                    n4 = n5;
                                    break Label_0199;
                                }
                                final int n6;
                                if (n6 >= b) {
                                    return a2;
                                }
                                n = n6;
                            }
                            final int n6 = n + 1;
                            if (b2 <= 0) {
                                continue;
                            }
                            break;
                        }
                        n4 = 0;
                    }
                    final int n5 = n4 + 1;
                    if (b3 > 0) {
                        final int n2 = 0;
                        continue Label_0144_Outer;
                    }
                    break;
                }
                continue Label_0144;
            }
            T1.a.b(t, i.class);
            return null;
        }
    }
}
