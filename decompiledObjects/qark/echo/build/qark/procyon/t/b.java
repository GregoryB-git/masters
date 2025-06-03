// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.Set;
import java.util.Collection;

public final class b implements Collection, Set
{
    public static Object[] r;
    public static int s;
    public static Object[] t;
    public static int u;
    public static final Object v;
    public static final Object w;
    public int[] o;
    public Object[] p;
    public int q;
    
    static {
        v = new Object();
        w = new Object();
    }
    
    public b() {
        this(0);
    }
    
    public b(final int n) {
        if (n == 0) {
            this.o = d.a;
            this.p = d.c;
        }
        else {
            this.a(n);
        }
        this.q = 0;
    }
    
    public static void g(final int[] p0, final Object[] p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: bipush          8
        //     4: if_icmpne       57
        //     7: getstatic       t/b.w:Ljava/lang/Object;
        //    10: astore_3       
        //    11: aload_3        
        //    12: monitorenter   
        //    13: getstatic       t/b.u:I
        //    16: bipush          10
        //    18: if_icmpge       50
        //    21: aload_1        
        //    22: iconst_0       
        //    23: getstatic       t/b.t:[Ljava/lang/Object;
        //    26: aastore        
        //    27: aload_1        
        //    28: iconst_1       
        //    29: aload_0        
        //    30: aastore        
        //    31: iload_2        
        //    32: iconst_1       
        //    33: isub           
        //    34: istore_2       
        //    35: goto            114
        //    38: aload_1        
        //    39: putstatic       t/b.t:[Ljava/lang/Object;
        //    42: getstatic       t/b.u:I
        //    45: iconst_1       
        //    46: iadd           
        //    47: putstatic       t/b.u:I
        //    50: aload_3        
        //    51: monitorexit    
        //    52: return         
        //    53: aload_3        
        //    54: monitorexit    
        //    55: aload_0        
        //    56: athrow         
        //    57: aload_0        
        //    58: arraylength    
        //    59: iconst_4       
        //    60: if_icmpne       113
        //    63: getstatic       t/b.v:Ljava/lang/Object;
        //    66: astore_3       
        //    67: aload_3        
        //    68: monitorenter   
        //    69: getstatic       t/b.s:I
        //    72: bipush          10
        //    74: if_icmpge       106
        //    77: aload_1        
        //    78: iconst_0       
        //    79: getstatic       t/b.r:[Ljava/lang/Object;
        //    82: aastore        
        //    83: aload_1        
        //    84: iconst_1       
        //    85: aload_0        
        //    86: aastore        
        //    87: iload_2        
        //    88: iconst_1       
        //    89: isub           
        //    90: istore_2       
        //    91: goto            134
        //    94: aload_1        
        //    95: putstatic       t/b.r:[Ljava/lang/Object;
        //    98: getstatic       t/b.s:I
        //   101: iconst_1       
        //   102: iadd           
        //   103: putstatic       t/b.s:I
        //   106: aload_3        
        //   107: monitorexit    
        //   108: return         
        //   109: aload_3        
        //   110: monitorexit    
        //   111: aload_0        
        //   112: athrow         
        //   113: return         
        //   114: iload_2        
        //   115: iconst_2       
        //   116: if_icmplt       38
        //   119: aload_1        
        //   120: iload_2        
        //   121: aconst_null    
        //   122: aastore        
        //   123: iload_2        
        //   124: iconst_1       
        //   125: isub           
        //   126: istore_2       
        //   127: goto            114
        //   130: astore_0       
        //   131: goto            53
        //   134: iload_2        
        //   135: iconst_2       
        //   136: if_icmplt       94
        //   139: aload_1        
        //   140: iload_2        
        //   141: aconst_null    
        //   142: aastore        
        //   143: iload_2        
        //   144: iconst_1       
        //   145: isub           
        //   146: istore_2       
        //   147: goto            134
        //   150: astore_0       
        //   151: goto            109
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  13     27     130    57     Any
        //  38     50     130    57     Any
        //  50     52     130    57     Any
        //  53     55     130    57     Any
        //  69     83     150    113    Any
        //  94     106    150    113    Any
        //  106    108    150    113    Any
        //  109    111    150    113    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0094:
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
    
    public final void a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: bipush          8
        //     3: if_icmpne       147
        //     6: getstatic       t/b.w:Ljava/lang/Object;
        //     9: astore_2       
        //    10: aload_2        
        //    11: monitorenter   
        //    12: getstatic       t/b.t:[Ljava/lang/Object;
        //    15: astore_3       
        //    16: aload_3        
        //    17: ifnull          138
        //    20: aload_0        
        //    21: aload_3        
        //    22: putfield        t/b.p:[Ljava/lang/Object;
        //    25: aload_3        
        //    26: iconst_0       
        //    27: aaload         
        //    28: checkcast       [Ljava/lang/Object;
        //    31: putstatic       t/b.t:[Ljava/lang/Object;
        //    34: aload_3        
        //    35: iconst_1       
        //    36: aaload         
        //    37: checkcast       [I
        //    40: astore          4
        //    42: aload_0        
        //    43: aload           4
        //    45: putfield        t/b.o:[I
        //    48: aload           4
        //    50: ifnull          72
        //    53: aload_3        
        //    54: iconst_1       
        //    55: aconst_null    
        //    56: aastore        
        //    57: aload_3        
        //    58: iconst_0       
        //    59: aconst_null    
        //    60: aastore        
        //    61: getstatic       t/b.u:I
        //    64: iconst_1       
        //    65: isub           
        //    66: putstatic       t/b.u:I
        //    69: aload_2        
        //    70: monitorexit    
        //    71: return         
        //    72: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //    75: astore          4
        //    77: new             Ljava/lang/StringBuilder;
        //    80: dup            
        //    81: invokespecial   java/lang/StringBuilder.<init>:()V
        //    84: astore          5
        //    86: aload           5
        //    88: ldc             "ArraySet Found corrupt ArraySet cache: [0]="
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: pop            
        //    94: aload           5
        //    96: aload_3        
        //    97: iconst_0       
        //    98: aaload         
        //    99: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   102: pop            
        //   103: aload           5
        //   105: ldc             " [1]="
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: pop            
        //   111: aload           5
        //   113: aload_3        
        //   114: iconst_1       
        //   115: aaload         
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   119: pop            
        //   120: aload           4
        //   122: aload           5
        //   124: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   127: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   130: aconst_null    
        //   131: putstatic       t/b.t:[Ljava/lang/Object;
        //   134: iconst_0       
        //   135: putstatic       t/b.u:I
        //   138: aload_2        
        //   139: monitorexit    
        //   140: goto            293
        //   143: aload_2        
        //   144: monitorexit    
        //   145: aload_3        
        //   146: athrow         
        //   147: iload_1        
        //   148: iconst_4       
        //   149: if_icmpne       293
        //   152: getstatic       t/b.v:Ljava/lang/Object;
        //   155: astore_2       
        //   156: aload_2        
        //   157: monitorenter   
        //   158: getstatic       t/b.r:[Ljava/lang/Object;
        //   161: astore_3       
        //   162: aload_3        
        //   163: ifnull          284
        //   166: aload_0        
        //   167: aload_3        
        //   168: putfield        t/b.p:[Ljava/lang/Object;
        //   171: aload_3        
        //   172: iconst_0       
        //   173: aaload         
        //   174: checkcast       [Ljava/lang/Object;
        //   177: putstatic       t/b.r:[Ljava/lang/Object;
        //   180: aload_3        
        //   181: iconst_1       
        //   182: aaload         
        //   183: checkcast       [I
        //   186: astore          4
        //   188: aload_0        
        //   189: aload           4
        //   191: putfield        t/b.o:[I
        //   194: aload           4
        //   196: ifnull          218
        //   199: aload_3        
        //   200: iconst_1       
        //   201: aconst_null    
        //   202: aastore        
        //   203: aload_3        
        //   204: iconst_0       
        //   205: aconst_null    
        //   206: aastore        
        //   207: getstatic       t/b.s:I
        //   210: iconst_1       
        //   211: isub           
        //   212: putstatic       t/b.s:I
        //   215: aload_2        
        //   216: monitorexit    
        //   217: return         
        //   218: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   221: astore          4
        //   223: new             Ljava/lang/StringBuilder;
        //   226: dup            
        //   227: invokespecial   java/lang/StringBuilder.<init>:()V
        //   230: astore          5
        //   232: aload           5
        //   234: ldc             "ArraySet Found corrupt ArraySet cache: [0]="
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: pop            
        //   240: aload           5
        //   242: aload_3        
        //   243: iconst_0       
        //   244: aaload         
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   248: pop            
        //   249: aload           5
        //   251: ldc             " [1]="
        //   253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   256: pop            
        //   257: aload           5
        //   259: aload_3        
        //   260: iconst_1       
        //   261: aaload         
        //   262: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   265: pop            
        //   266: aload           4
        //   268: aload           5
        //   270: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   273: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   276: aconst_null    
        //   277: putstatic       t/b.r:[Ljava/lang/Object;
        //   280: iconst_0       
        //   281: putstatic       t/b.s:I
        //   284: aload_2        
        //   285: monitorexit    
        //   286: goto            293
        //   289: aload_2        
        //   290: monitorexit    
        //   291: aload_3        
        //   292: athrow         
        //   293: aload_0        
        //   294: iload_1        
        //   295: newarray        I
        //   297: putfield        t/b.o:[I
        //   300: aload_0        
        //   301: iload_1        
        //   302: anewarray       Ljava/lang/Object;
        //   305: putfield        t/b.p:[Ljava/lang/Object;
        //   308: return         
        //   309: astore          4
        //   311: goto            72
        //   314: astore          4
        //   316: goto            218
        //   319: astore_3       
        //   320: goto            143
        //   323: astore_3       
        //   324: goto            289
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  12     16     319    147    Any
        //  20     48     309    314    Ljava/lang/ClassCastException;
        //  20     48     319    147    Any
        //  61     69     309    314    Ljava/lang/ClassCastException;
        //  61     69     319    147    Any
        //  69     71     319    147    Any
        //  72     138    319    147    Any
        //  138    140    319    147    Any
        //  143    145    319    147    Any
        //  158    162    323    293    Any
        //  166    194    314    319    Ljava/lang/ClassCastException;
        //  166    194    323    293    Any
        //  207    215    314    319    Ljava/lang/ClassCastException;
        //  207    215    323    293    Any
        //  215    217    323    293    Any
        //  218    284    323    293    Any
        //  284    286    323    293    Any
        //  289    291    323    293    Any
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
    
    @Override
    public boolean add(final Object o) {
        final int q = this.q;
        int n;
        int hashCode;
        if (o == null) {
            n = this.k();
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
            n = this.i(o, hashCode);
        }
        if (n >= 0) {
            return false;
        }
        final int n2 = n;
        final int[] o2 = this.o;
        if (q >= o2.length) {
            int n3 = 8;
            if (q >= 8) {
                n3 = (q >> 1) + q;
            }
            else if (q < 4) {
                n3 = 4;
            }
            final Object[] p = this.p;
            this.a(n3);
            if (q != this.q) {
                throw new ConcurrentModificationException();
            }
            final int[] o3 = this.o;
            if (o3.length > 0) {
                System.arraycopy(o2, 0, o3, 0, o2.length);
                System.arraycopy(p, 0, this.p, 0, p.length);
            }
            g(o2, p, q);
        }
        if (n2 < q) {
            final int[] o4 = this.o;
            final int n4 = n2 + 1;
            final int n5 = q - n2;
            System.arraycopy(o4, n2, o4, n4, n5);
            final Object[] p2 = this.p;
            System.arraycopy(p2, n2, p2, n4, n5);
        }
        final int q2 = this.q;
        if (q == q2) {
            final int[] o5 = this.o;
            if (n2 < o5.length) {
                o5[n2] = hashCode;
                this.p[n2] = o;
                this.q = q2 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        this.f(this.q + collection.size());
        final Iterator<Object> iterator = collection.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= this.add(iterator.next());
        }
        return b;
    }
    
    @Override
    public void clear() {
        final int q = this.q;
        if (q != 0) {
            final int[] o = this.o;
            final Object[] p = this.p;
            this.o = d.a;
            this.p = d.c;
            this.q = 0;
            g(o, p, q);
        }
        if (this.q == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    @Override
    public boolean containsAll(final Collection collection) {
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final int d(int a) {
        try {
            a = d.a(this.o, this.q, a);
            return a;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set = (Set)o;
        if (this.size() != set.size()) {
            return false;
        }
        int i = 0;
        try {
            while (i < this.q) {
                if (!set.contains(this.s(i))) {
                    return false;
                }
                ++i;
            }
            return true;
        }
        catch (NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    public void f(int q) {
        final int q2 = this.q;
        final int[] o = this.o;
        if (o.length < q) {
            final Object[] p = this.p;
            this.a(q);
            q = this.q;
            if (q > 0) {
                System.arraycopy(o, 0, this.o, 0, q);
                System.arraycopy(p, 0, this.p, 0, this.q);
            }
            g(o, p, this.q);
        }
        if (this.q == q2) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public int hashCode() {
        final int[] o = this.o;
        final int q = this.q;
        int i = 0;
        int n = 0;
        while (i < q) {
            n += o[i];
            ++i;
        }
        return n;
    }
    
    public final int i(final Object o, final int n) {
        final int q = this.q;
        if (q == 0) {
            return -1;
        }
        final int d = this.d(n);
        if (d < 0) {
            return d;
        }
        if (o.equals(this.p[d])) {
            return d;
        }
        int n2;
        for (n2 = d + 1; n2 < q && this.o[n2] == n; ++n2) {
            if (o.equals(this.p[n2])) {
                return n2;
            }
        }
        for (int n3 = d - 1; n3 >= 0 && this.o[n3] == n; --n3) {
            if (o.equals(this.p[n3])) {
                return n3;
            }
        }
        return n2;
    }
    
    public int indexOf(final Object o) {
        if (o == null) {
            return this.k();
        }
        return this.i(o, o.hashCode());
    }
    
    @Override
    public boolean isEmpty() {
        return this.q <= 0;
    }
    
    @Override
    public Iterator iterator() {
        return new a();
    }
    
    public final int k() {
        final int q = this.q;
        if (q == 0) {
            return -1;
        }
        final int d = this.d(0);
        if (d < 0) {
            return d;
        }
        if (this.p[d] == null) {
            return d;
        }
        int n;
        for (n = d + 1; n < q && this.o[n] == 0; ++n) {
            if (this.p[n] == null) {
                return n;
            }
        }
        for (int n2 = d - 1; n2 >= 0 && this.o[n2] == 0; --n2) {
            if (this.p[n2] == null) {
                return n2;
            }
        }
        return n;
    }
    
    public Object q(final int n) {
        final int q = this.q;
        final Object[] p = this.p;
        final Object o = p[n];
        if (q <= 1) {
            this.clear();
            return o;
        }
        final int q2 = q - 1;
        final int[] o2 = this.o;
        final int length = o2.length;
        int n2 = 8;
        if (length > 8 && q < o2.length / 3) {
            if (q > 8) {
                n2 = q + (q >> 1);
            }
            this.a(n2);
            if (n > 0) {
                System.arraycopy(o2, 0, this.o, 0, n);
                System.arraycopy(p, 0, this.p, 0, n);
            }
            if (n < q2) {
                final int n3 = n + 1;
                final int[] o3 = this.o;
                final int n4 = q2 - n;
                System.arraycopy(o2, n3, o3, n, n4);
                System.arraycopy(p, n3, this.p, n, n4);
            }
        }
        else {
            if (n < q2) {
                final int n5 = n + 1;
                final int n6 = q2 - n;
                System.arraycopy(o2, n5, o2, n, n6);
                final Object[] p2 = this.p;
                System.arraycopy(p2, n5, p2, n, n6);
            }
            this.p[q2] = null;
        }
        if (q == this.q) {
            this.q = q2;
            return o;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public boolean remove(final Object o) {
        final int index = this.indexOf(o);
        if (index >= 0) {
            this.q(index);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean removeAll(final Collection collection) {
        final Iterator<Object> iterator = collection.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= this.remove(iterator.next());
        }
        return b;
    }
    
    @Override
    public boolean retainAll(final Collection collection) {
        int i = this.q - 1;
        boolean b = false;
        while (i >= 0) {
            if (!collection.contains(this.p[i])) {
                this.q(i);
                b = true;
            }
            --i;
        }
        return b;
    }
    
    public Object s(final int n) {
        return this.p[n];
    }
    
    @Override
    public int size() {
        return this.q;
    }
    
    @Override
    public Object[] toArray() {
        final int q = this.q;
        final Object[] array = new Object[q];
        System.arraycopy(this.p, 0, array, 0, q);
        return array;
    }
    
    @Override
    public Object[] toArray(final Object[] array) {
        Object[] array2 = array;
        if (array.length < this.q) {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), this.q);
        }
        System.arraycopy(this.p, 0, array2, 0, this.q);
        final int length = array2.length;
        final int q = this.q;
        if (length > q) {
            array2[q] = null;
        }
        return array2;
    }
    
    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.q * 14);
        sb.append('{');
        for (int i = 0; i < this.q; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object s = this.s(i);
            if (s != this) {
                sb.append(s);
            }
            else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
    
    public class a extends e
    {
        public a() {
            super(b.this.q);
        }
        
        @Override
        public Object b(final int n) {
            return b.this.s(n);
        }
        
        @Override
        public void d(final int n) {
            b.this.q(n);
        }
    }
}
