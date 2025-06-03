// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t;

import java.util.Map;
import java.util.ConcurrentModificationException;

public class h
{
    public static Object[] r;
    public static int s;
    public static Object[] t;
    public static int u;
    public int[] o;
    public Object[] p;
    public int q;
    
    public h() {
        this.o = d.a;
        this.p = d.c;
        this.q = 0;
    }
    
    public h(final int n) {
        if (n == 0) {
            this.o = d.a;
            this.p = d.c;
        }
        else {
            this.a(n);
        }
        this.q = 0;
    }
    
    public static int b(final int[] array, int a, final int n) {
        try {
            a = d.a(array, a, n);
            return a;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }
    
    public static void d(final int[] p0, final Object[] p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: bipush          8
        //     4: if_icmpne       58
        //     7: ldc             Lt/h;.class
        //     9: monitorenter   
        //    10: getstatic       t/h.u:I
        //    13: bipush          10
        //    15: if_icmpge       49
        //    18: aload_1        
        //    19: iconst_0       
        //    20: getstatic       t/h.t:[Ljava/lang/Object;
        //    23: aastore        
        //    24: aload_1        
        //    25: iconst_1       
        //    26: aload_0        
        //    27: aastore        
        //    28: iload_2        
        //    29: iconst_1       
        //    30: ishl           
        //    31: iconst_1       
        //    32: isub           
        //    33: istore_2       
        //    34: goto            116
        //    37: aload_1        
        //    38: putstatic       t/h.t:[Ljava/lang/Object;
        //    41: getstatic       t/h.u:I
        //    44: iconst_1       
        //    45: iadd           
        //    46: putstatic       t/h.u:I
        //    49: ldc             Lt/h;.class
        //    51: monitorexit    
        //    52: return         
        //    53: ldc             Lt/h;.class
        //    55: monitorexit    
        //    56: aload_0        
        //    57: athrow         
        //    58: aload_0        
        //    59: arraylength    
        //    60: iconst_4       
        //    61: if_icmpne       115
        //    64: ldc             Lt/h;.class
        //    66: monitorenter   
        //    67: getstatic       t/h.s:I
        //    70: bipush          10
        //    72: if_icmpge       106
        //    75: aload_1        
        //    76: iconst_0       
        //    77: getstatic       t/h.r:[Ljava/lang/Object;
        //    80: aastore        
        //    81: aload_1        
        //    82: iconst_1       
        //    83: aload_0        
        //    84: aastore        
        //    85: iload_2        
        //    86: iconst_1       
        //    87: ishl           
        //    88: iconst_1       
        //    89: isub           
        //    90: istore_2       
        //    91: goto            136
        //    94: aload_1        
        //    95: putstatic       t/h.r:[Ljava/lang/Object;
        //    98: getstatic       t/h.s:I
        //   101: iconst_1       
        //   102: iadd           
        //   103: putstatic       t/h.s:I
        //   106: ldc             Lt/h;.class
        //   108: monitorexit    
        //   109: return         
        //   110: ldc             Lt/h;.class
        //   112: monitorexit    
        //   113: aload_0        
        //   114: athrow         
        //   115: return         
        //   116: iload_2        
        //   117: iconst_2       
        //   118: if_icmplt       37
        //   121: aload_1        
        //   122: iload_2        
        //   123: aconst_null    
        //   124: aastore        
        //   125: iload_2        
        //   126: iconst_1       
        //   127: isub           
        //   128: istore_2       
        //   129: goto            116
        //   132: astore_0       
        //   133: goto            53
        //   136: iload_2        
        //   137: iconst_2       
        //   138: if_icmplt       94
        //   141: aload_1        
        //   142: iload_2        
        //   143: aconst_null    
        //   144: aastore        
        //   145: iload_2        
        //   146: iconst_1       
        //   147: isub           
        //   148: istore_2       
        //   149: goto            136
        //   152: astore_0       
        //   153: goto            110
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  10     24     132    58     Any
        //  37     49     132    58     Any
        //  49     52     132    58     Any
        //  53     56     132    58     Any
        //  67     81     152    115    Any
        //  94     106    152    115    Any
        //  106    109    152    115    Any
        //  110    113    152    115    Any
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
        //     3: if_icmpne       72
        //     6: ldc             Lt/h;.class
        //     8: monitorenter   
        //     9: getstatic       t/h.t:[Ljava/lang/Object;
        //    12: astore_2       
        //    13: aload_2        
        //    14: ifnull          61
        //    17: aload_0        
        //    18: aload_2        
        //    19: putfield        t/h.p:[Ljava/lang/Object;
        //    22: aload_2        
        //    23: iconst_0       
        //    24: aaload         
        //    25: checkcast       [Ljava/lang/Object;
        //    28: putstatic       t/h.t:[Ljava/lang/Object;
        //    31: aload_0        
        //    32: aload_2        
        //    33: iconst_1       
        //    34: aaload         
        //    35: checkcast       [I
        //    38: putfield        t/h.o:[I
        //    41: aload_2        
        //    42: iconst_1       
        //    43: aconst_null    
        //    44: aastore        
        //    45: aload_2        
        //    46: iconst_0       
        //    47: aconst_null    
        //    48: aastore        
        //    49: getstatic       t/h.u:I
        //    52: iconst_1       
        //    53: isub           
        //    54: putstatic       t/h.u:I
        //    57: ldc             Lt/h;.class
        //    59: monitorexit    
        //    60: return         
        //    61: ldc             Lt/h;.class
        //    63: monitorexit    
        //    64: goto            143
        //    67: ldc             Lt/h;.class
        //    69: monitorexit    
        //    70: aload_2        
        //    71: athrow         
        //    72: iload_1        
        //    73: iconst_4       
        //    74: if_icmpne       143
        //    77: ldc             Lt/h;.class
        //    79: monitorenter   
        //    80: getstatic       t/h.r:[Ljava/lang/Object;
        //    83: astore_2       
        //    84: aload_2        
        //    85: ifnull          132
        //    88: aload_0        
        //    89: aload_2        
        //    90: putfield        t/h.p:[Ljava/lang/Object;
        //    93: aload_2        
        //    94: iconst_0       
        //    95: aaload         
        //    96: checkcast       [Ljava/lang/Object;
        //    99: putstatic       t/h.r:[Ljava/lang/Object;
        //   102: aload_0        
        //   103: aload_2        
        //   104: iconst_1       
        //   105: aaload         
        //   106: checkcast       [I
        //   109: putfield        t/h.o:[I
        //   112: aload_2        
        //   113: iconst_1       
        //   114: aconst_null    
        //   115: aastore        
        //   116: aload_2        
        //   117: iconst_0       
        //   118: aconst_null    
        //   119: aastore        
        //   120: getstatic       t/h.s:I
        //   123: iconst_1       
        //   124: isub           
        //   125: putstatic       t/h.s:I
        //   128: ldc             Lt/h;.class
        //   130: monitorexit    
        //   131: return         
        //   132: ldc             Lt/h;.class
        //   134: monitorexit    
        //   135: goto            143
        //   138: ldc             Lt/h;.class
        //   140: monitorexit    
        //   141: aload_2        
        //   142: athrow         
        //   143: aload_0        
        //   144: iload_1        
        //   145: newarray        I
        //   147: putfield        t/h.o:[I
        //   150: aload_0        
        //   151: iload_1        
        //   152: iconst_1       
        //   153: ishl           
        //   154: anewarray       Ljava/lang/Object;
        //   157: putfield        t/h.p:[Ljava/lang/Object;
        //   160: return         
        //   161: astore_2       
        //   162: goto            67
        //   165: astore_2       
        //   166: goto            138
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  9      13     161    72     Any
        //  17     41     161    72     Any
        //  49     60     161    72     Any
        //  61     64     161    72     Any
        //  67     70     161    72     Any
        //  80     84     165    143    Any
        //  88     112    165    143    Any
        //  120    131    165    143    Any
        //  132    135    165    143    Any
        //  138    141    165    143    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0132:
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
    
    public void c(final int n) {
        final int q = this.q;
        final int[] o = this.o;
        if (o.length < n) {
            final Object[] p = this.p;
            this.a(n);
            if (this.q > 0) {
                System.arraycopy(o, 0, this.o, 0, q);
                System.arraycopy(p, 0, this.p, 0, q << 1);
            }
            d(o, p, q);
        }
        if (this.q == q) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public void clear() {
        final int q = this.q;
        if (q > 0) {
            final int[] o = this.o;
            final Object[] p = this.p;
            this.o = d.a;
            this.p = d.c;
            this.q = 0;
            d(o, p, q);
        }
        if (this.q <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public boolean containsKey(final Object o) {
        return this.f(o) >= 0;
    }
    
    public boolean containsValue(final Object o) {
        return this.h(o) >= 0;
    }
    
    public int e(final Object o, final int n) {
        final int q = this.q;
        if (q == 0) {
            return -1;
        }
        final int b = b(this.o, q, n);
        if (b < 0) {
            return b;
        }
        if (o.equals(this.p[b << 1])) {
            return b;
        }
        int n2;
        for (n2 = b + 1; n2 < q && this.o[n2] == n; ++n2) {
            if (o.equals(this.p[n2 << 1])) {
                return n2;
            }
        }
        for (int n3 = b - 1; n3 >= 0 && this.o[n3] == n; --n3) {
            if (o.equals(this.p[n3 << 1])) {
                return n3;
            }
        }
        return n2;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        h h;
        Map map;
        int n;
        Object i;
        Object l;
        Object value;
        int n2;
        Object j;
        Object k;
        Object value2;
        Block_7_Outer:Label_0122_Outer:
        while (true) {
        Label_0122:
            while (true) {
                Label_0221: {
                    while (true) {
                        Label_0205: {
                            try {
                                if (o instanceof h) {
                                    h = (h)o;
                                    if (this.size() != h.size()) {
                                        return false;
                                    }
                                    break Label_0205;
                                }
                                else {
                                    if (!(o instanceof Map)) {
                                        return false;
                                    }
                                    map = (Map)o;
                                    if (this.size() != map.size()) {
                                        return false;
                                    }
                                    break Label_0221;
                                }
                                // iftrue(Label_0083:, l != null)
                                // iftrue(Label_0212:, h.containsKey(i))
                                // iftrue(Label_0212:, l.equals(value))
                                // iftrue(Label_0219:, n >= this.q)
                                // iftrue(Label_0177:, k != null)
                                // iftrue(Label_0226:, value2 != null)
                                // iftrue(Label_0191:, k.equals(value2))
                                // iftrue(Label_0191:, map.containsKey(j))
                                // iftrue(Label_0210:, value != null)
                                while (true) {
                                    while (true) {
                                        Block_6: {
                                            while (true) {
                                                i = this.i(n);
                                                l = this.l(n);
                                                value = h.get(i);
                                                break Block_6;
                                                return false;
                                                Label_0191: {
                                                    ++n2;
                                                }
                                                break Label_0122;
                                                Label_0083:
                                                return false;
                                                continue Block_7_Outer;
                                            }
                                            j = this.i(n2);
                                            k = this.l(n2);
                                            value2 = map.get(j);
                                            Block_14: {
                                                break Block_14;
                                                Label_0198: {
                                                    return true;
                                                }
                                                Label_0177:
                                                return false;
                                            }
                                            return false;
                                        }
                                        continue Label_0122_Outer;
                                    }
                                    continue;
                                }
                            }
                            // iftrue(Label_0198:, n2 >= this.q)
                            catch (NullPointerException | ClassCastException ex) {
                                return false;
                            }
                        }
                        n = 0;
                        continue;
                        Label_0212: {
                            ++n;
                        }
                        continue;
                    }
                }
                n2 = 0;
                continue Label_0122;
            }
            Label_0210: {
                return false;
            }
            Label_0219:
            return true;
            Label_0226:
            return false;
        }
    }
    
    public int f(final Object o) {
        if (o == null) {
            return this.g();
        }
        return this.e(o, o.hashCode());
    }
    
    public int g() {
        final int q = this.q;
        if (q == 0) {
            return -1;
        }
        final int b = b(this.o, q, 0);
        if (b < 0) {
            return b;
        }
        if (this.p[b << 1] == null) {
            return b;
        }
        int n;
        for (n = b + 1; n < q && this.o[n] == 0; ++n) {
            if (this.p[n << 1] == null) {
                return n;
            }
        }
        for (int n2 = b - 1; n2 >= 0 && this.o[n2] == 0; --n2) {
            if (this.p[n2 << 1] == null) {
                return n2;
            }
        }
        return n;
    }
    
    public Object get(final Object o) {
        return this.getOrDefault(o, null);
    }
    
    public Object getOrDefault(final Object o, Object o2) {
        final int f = this.f(o);
        if (f >= 0) {
            o2 = this.p[(f << 1) + 1];
        }
        return o2;
    }
    
    public int h(final Object o) {
        final int n = this.q * 2;
        final Object[] p = this.p;
        if (o == null) {
            for (int i = 1; i < n; i += 2) {
                if (p[i] == null) {
                    return i >> 1;
                }
            }
        }
        else {
            for (int j = 1; j < n; j += 2) {
                if (o.equals(p[j])) {
                    return j >> 1;
                }
            }
        }
        return -1;
    }
    
    @Override
    public int hashCode() {
        final int[] o = this.o;
        final Object[] p = this.p;
        int n2;
        for (int q = this.q, n = 1, i = n2 = 0; i < q; ++i, n += 2) {
            final Object o2 = p[n];
            final int n3 = o[i];
            int hashCode;
            if (o2 == null) {
                hashCode = 0;
            }
            else {
                hashCode = o2.hashCode();
            }
            n2 += (hashCode ^ n3);
        }
        return n2;
    }
    
    public Object i(final int n) {
        return this.p[n << 1];
    }
    
    public boolean isEmpty() {
        return this.q <= 0;
    }
    
    public Object j(int n) {
        final Object[] p = this.p;
        final int n2 = n << 1;
        final Object o = p[n2 + 1];
        final int q = this.q;
        if (q <= 1) {
            this.clear();
            return o;
        }
        final int q2 = q - 1;
        final int[] o2 = this.o;
        final int length = o2.length;
        int n3 = 8;
        if (length > 8 && q < o2.length / 3) {
            if (q > 8) {
                n3 = q + (q >> 1);
            }
            this.a(n3);
            if (q != this.q) {
                throw new ConcurrentModificationException();
            }
            if (n > 0) {
                System.arraycopy(o2, 0, this.o, 0, n);
                System.arraycopy(p, 0, this.p, 0, n2);
            }
            if (n < q2) {
                final int n4 = n + 1;
                final int[] o3 = this.o;
                final int n5 = q2 - n;
                System.arraycopy(o2, n4, o3, n, n5);
                System.arraycopy(p, n4 << 1, this.p, n2, n5 << 1);
            }
        }
        else {
            if (n < q2) {
                final int n6 = n + 1;
                final int n7 = q2 - n;
                System.arraycopy(o2, n6, o2, n, n7);
                final Object[] p2 = this.p;
                System.arraycopy(p2, n6 << 1, p2, n2, n7 << 1);
            }
            final Object[] p3 = this.p;
            n = q2 << 1;
            p3[n + 1] = (p3[n] = null);
        }
        if (q == this.q) {
            this.q = q2;
            return o;
        }
        throw new ConcurrentModificationException();
    }
    
    public Object k(int n, final Object o) {
        n = (n << 1) + 1;
        final Object[] p2 = this.p;
        final Object o2 = p2[n];
        p2[n] = o;
        return o2;
    }
    
    public Object l(final int n) {
        return this.p[(n << 1) + 1];
    }
    
    public Object put(final Object o, final Object o2) {
        final int q = this.q;
        int n;
        int hashCode;
        if (o == null) {
            n = this.g();
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
            n = this.e(o, hashCode);
        }
        if (n >= 0) {
            final int n2 = (n << 1) + 1;
            final Object[] p2 = this.p;
            final Object o3 = p2[n2];
            p2[n2] = o2;
            return o3;
        }
        final int n3 = n;
        final int[] o4 = this.o;
        if (q >= o4.length) {
            int n4 = 8;
            if (q >= 8) {
                n4 = (q >> 1) + q;
            }
            else if (q < 4) {
                n4 = 4;
            }
            final Object[] p3 = this.p;
            this.a(n4);
            if (q != this.q) {
                throw new ConcurrentModificationException();
            }
            final int[] o5 = this.o;
            if (o5.length > 0) {
                System.arraycopy(o4, 0, o5, 0, o4.length);
                System.arraycopy(p3, 0, this.p, 0, p3.length);
            }
            d(o4, p3, q);
        }
        if (n3 < q) {
            final int[] o6 = this.o;
            final int n5 = n3 + 1;
            System.arraycopy(o6, n3, o6, n5, q - n3);
            final Object[] p4 = this.p;
            System.arraycopy(p4, n3 << 1, p4, n5 << 1, this.q - n3 << 1);
        }
        final int q2 = this.q;
        if (q == q2) {
            final int[] o7 = this.o;
            if (n3 < o7.length) {
                o7[n3] = hashCode;
                final Object[] p5 = this.p;
                final int n6 = n3 << 1;
                p5[n6] = o;
                p5[n6 + 1] = o2;
                this.q = q2 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }
    
    public Object putIfAbsent(final Object o, final Object o2) {
        Object o3;
        if ((o3 = this.get(o)) == null) {
            o3 = this.put(o, o2);
        }
        return o3;
    }
    
    public Object remove(final Object o) {
        final int f = this.f(o);
        if (f >= 0) {
            return this.j(f);
        }
        return null;
    }
    
    public boolean remove(Object l, final Object o) {
        final int f = this.f(l);
        if (f >= 0) {
            l = this.l(f);
            if (o == l || (o != null && o.equals(l))) {
                this.j(f);
                return true;
            }
        }
        return false;
    }
    
    public Object replace(final Object o, final Object o2) {
        final int f = this.f(o);
        if (f >= 0) {
            return this.k(f, o2);
        }
        return null;
    }
    
    public boolean replace(Object l, final Object o, final Object o2) {
        final int f = this.f(l);
        if (f >= 0) {
            l = this.l(f);
            if (l == o || (o != null && o.equals(l))) {
                this.k(f, o2);
                return true;
            }
        }
        return false;
    }
    
    public int size() {
        return this.q;
    }
    
    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.q * 28);
        sb.append('{');
        for (int i = 0; i < this.q; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object j = this.i(i);
            if (j != this) {
                sb.append(j);
            }
            else {
                sb.append("(this Map)");
            }
            sb.append('=');
            final Object l = this.l(i);
            if (l != this) {
                sb.append(l);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
