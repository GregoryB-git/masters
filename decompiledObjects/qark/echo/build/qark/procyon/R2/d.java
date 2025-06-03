// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import A2.n;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;
import java.util.Locale;
import java.util.List;
import com.google.android.gms.internal.measurement.B1;
import java.math.BigDecimal;
import com.google.android.gms.internal.measurement.z1;

public abstract class d
{
    public String a;
    public int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    
    public d(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static Boolean b(final double n, final z1 z1) {
        try {
            return h(new BigDecimal(n), z1, Math.ulp(n));
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    public static Boolean c(final long val, final z1 z1) {
        try {
            return h(new BigDecimal(val), z1, 0.0);
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    public static Boolean d(final Boolean b, final boolean b2) {
        if (b == null) {
            return null;
        }
        return b != b2;
    }
    
    public static Boolean e(final String val, final z1 z1) {
        if (!N5.f0(val)) {
            return null;
        }
        try {
            return h(new BigDecimal(val), z1, 0.0);
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    public static Boolean f(final String s, final B1.a a, final boolean b, final String s2, final List list, final String regex, final Y1 y1) {
        if (s == null) {
            return null;
        }
        if (a == B1.a.v) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        }
        else if (s2 == null) {
            return null;
        }
        String upperCase = s;
        if (!b) {
            if (a == B1.a.q) {
                upperCase = s;
            }
            else {
                upperCase = s.toUpperCase(Locale.ENGLISH);
            }
        }
        boolean b2 = false;
        switch (e6.a[a.ordinal()]) {
            default: {
                return null;
            }
            case 6: {
                if (list == null) {
                    return null;
                }
                b2 = list.contains(upperCase);
                break;
            }
            case 5: {
                b2 = upperCase.equals(s2);
                break;
            }
            case 4: {
                b2 = upperCase.contains(s2);
                break;
            }
            case 3: {
                b2 = upperCase.endsWith(s2);
                break;
            }
            case 2: {
                b2 = upperCase.startsWith(s2);
                break;
            }
            case 1: {
                if (regex == null) {
                    return null;
                }
                int flags;
                if (b) {
                    flags = 0;
                }
                else {
                    flags = 66;
                }
                while (true) {
                    try {
                        return Pattern.compile(regex, flags).matcher(upperCase).matches();
                        Label_0235: {
                            return null;
                        }
                        while (true) {
                            y1.L().b("Invalid regular expression in REGEXP audience filter. expression", regex);
                            return null;
                            continue;
                        }
                    }
                    // iftrue(Label_0235:, y1 == null)
                    catch (PatternSyntaxException ex) {
                        continue;
                    }
                    break;
                }
                break;
            }
        }
        return b2;
    }
    
    public static Boolean g(final String s, final B1 b1, final Y1 y1) {
        n.i(b1);
        if (s == null) {
            return null;
        }
        if (!b1.O()) {
            return null;
        }
        if (b1.G() == B1.a.p) {
            return null;
        }
        final B1.a g = b1.G();
        final B1.a v = B1.a.v;
        if (g == v) {
            if (b1.k() == 0) {
                return null;
            }
        }
        else if (!b1.N()) {
            return null;
        }
        final B1.a g2 = b1.G();
        final boolean l = b1.L();
        String s2;
        if (!l && g2 != B1.a.q && g2 != v) {
            s2 = b1.J().toUpperCase(Locale.ENGLISH);
        }
        else {
            s2 = b1.J();
        }
        List<String> list;
        if (b1.k() == 0) {
            list = null;
        }
        else {
            list = (List<String>)b1.K();
            if (!l) {
                final ArrayList list2 = new ArrayList<String>(list.size());
                final Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    list2.add(iterator.next().toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList((List<? extends String>)list2);
            }
        }
        String s3;
        if (g2 == B1.a.q) {
            s3 = s2;
        }
        else {
            s3 = null;
        }
        return f(s, g2, l, s2, list, s3, y1);
    }
    
    public static Boolean h(final BigDecimal p0, final z1 p1, final double p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //     4: pop            
        //     5: aload_1        
        //     6: invokevirtual   com/google/android/gms/internal/measurement/z1.N:()Z
        //     9: ifeq            443
        //    12: aload_1        
        //    13: invokevirtual   com/google/android/gms/internal/measurement/z1.G:()Lcom/google/android/gms/internal/measurement/z1$b;
        //    16: getstatic       com/google/android/gms/internal/measurement/z1$b.p:Lcom/google/android/gms/internal/measurement/z1$b;
        //    19: if_acmpne       24
        //    22: aconst_null    
        //    23: areturn        
        //    24: aload_1        
        //    25: invokevirtual   com/google/android/gms/internal/measurement/z1.G:()Lcom/google/android/gms/internal/measurement/z1$b;
        //    28: astore          10
        //    30: getstatic       com/google/android/gms/internal/measurement/z1$b.t:Lcom/google/android/gms/internal/measurement/z1$b;
        //    33: astore          12
        //    35: aload           10
        //    37: aload           12
        //    39: if_acmpne       58
        //    42: aload_1        
        //    43: invokevirtual   com/google/android/gms/internal/measurement/z1.R:()Z
        //    46: ifeq            56
        //    49: aload_1        
        //    50: invokevirtual   com/google/android/gms/internal/measurement/z1.Q:()Z
        //    53: ifne            67
        //    56: aconst_null    
        //    57: areturn        
        //    58: aload_1        
        //    59: invokevirtual   com/google/android/gms/internal/measurement/z1.O:()Z
        //    62: ifne            67
        //    65: aconst_null    
        //    66: areturn        
        //    67: aload_1        
        //    68: invokevirtual   com/google/android/gms/internal/measurement/z1.G:()Lcom/google/android/gms/internal/measurement/z1$b;
        //    71: astore          13
        //    73: aload_1        
        //    74: invokevirtual   com/google/android/gms/internal/measurement/z1.G:()Lcom/google/android/gms/internal/measurement/z1$b;
        //    77: aload           12
        //    79: if_acmpne       141
        //    82: aload_1        
        //    83: invokevirtual   com/google/android/gms/internal/measurement/z1.L:()Ljava/lang/String;
        //    86: invokestatic    R2/N5.f0:(Ljava/lang/String;)Z
        //    89: ifeq            139
        //    92: aload_1        
        //    93: invokevirtual   com/google/android/gms/internal/measurement/z1.K:()Ljava/lang/String;
        //    96: invokestatic    R2/N5.f0:(Ljava/lang/String;)Z
        //    99: ifne            104
        //   102: aconst_null    
        //   103: areturn        
        //   104: new             Ljava/math/BigDecimal;
        //   107: dup            
        //   108: aload_1        
        //   109: invokevirtual   com/google/android/gms/internal/measurement/z1.L:()Ljava/lang/String;
        //   112: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   115: astore          10
        //   117: new             Ljava/math/BigDecimal;
        //   120: dup            
        //   121: aload_1        
        //   122: invokevirtual   com/google/android/gms/internal/measurement/z1.K:()Ljava/lang/String;
        //   125: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   128: astore          11
        //   130: aload           10
        //   132: astore_1       
        //   133: aconst_null    
        //   134: astore          10
        //   136: goto            171
        //   139: aconst_null    
        //   140: areturn        
        //   141: aload_1        
        //   142: invokevirtual   com/google/android/gms/internal/measurement/z1.J:()Ljava/lang/String;
        //   145: invokestatic    R2/N5.f0:(Ljava/lang/String;)Z
        //   148: ifne            153
        //   151: aconst_null    
        //   152: areturn        
        //   153: new             Ljava/math/BigDecimal;
        //   156: dup            
        //   157: aload_1        
        //   158: invokevirtual   com/google/android/gms/internal/measurement/z1.J:()Ljava/lang/String;
        //   161: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   164: astore          10
        //   166: aconst_null    
        //   167: astore_1       
        //   168: aload_1        
        //   169: astore          11
        //   171: aload           13
        //   173: aload           12
        //   175: if_acmpne       184
        //   178: aload_1        
        //   179: ifnonnull       189
        //   182: aconst_null    
        //   183: areturn        
        //   184: aload           10
        //   186: ifnull          443
        //   189: getstatic       R2/e6.b:[I
        //   192: aload           13
        //   194: invokevirtual   java/lang/Enum.ordinal:()I
        //   197: iaload         
        //   198: istore          4
        //   200: iconst_0       
        //   201: istore          7
        //   203: iconst_0       
        //   204: istore          5
        //   206: iconst_0       
        //   207: istore          8
        //   209: iconst_0       
        //   210: istore          9
        //   212: iconst_0       
        //   213: istore          6
        //   215: iload           4
        //   217: iconst_1       
        //   218: if_icmpeq       416
        //   221: iload           4
        //   223: iconst_2       
        //   224: if_icmpeq       389
        //   227: iload           4
        //   229: iconst_3       
        //   230: if_icmpeq       281
        //   233: iload           4
        //   235: iconst_4       
        //   236: if_icmpeq       241
        //   239: aconst_null    
        //   240: areturn        
        //   241: aload_1        
        //   242: ifnonnull       247
        //   245: aconst_null    
        //   246: areturn        
        //   247: iload           6
        //   249: istore          5
        //   251: aload_0        
        //   252: aload_1        
        //   253: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   256: iflt            275
        //   259: iload           6
        //   261: istore          5
        //   263: aload_0        
        //   264: aload           11
        //   266: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   269: ifgt            275
        //   272: iconst_1       
        //   273: istore          5
        //   275: iload           5
        //   277: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   280: areturn        
        //   281: aload           10
        //   283: ifnull          443
        //   286: dload_2        
        //   287: dconst_0       
        //   288: dcmpl          
        //   289: ifeq            371
        //   292: iload           7
        //   294: istore          5
        //   296: aload_0        
        //   297: aload           10
        //   299: new             Ljava/math/BigDecimal;
        //   302: dup            
        //   303: dload_2        
        //   304: invokespecial   java/math/BigDecimal.<init>:(D)V
        //   307: new             Ljava/math/BigDecimal;
        //   310: dup            
        //   311: iconst_2       
        //   312: invokespecial   java/math/BigDecimal.<init>:(I)V
        //   315: invokevirtual   java/math/BigDecimal.multiply:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   318: invokevirtual   java/math/BigDecimal.subtract:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   321: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   324: ifle            365
        //   327: iload           7
        //   329: istore          5
        //   331: aload_0        
        //   332: aload           10
        //   334: new             Ljava/math/BigDecimal;
        //   337: dup            
        //   338: dload_2        
        //   339: invokespecial   java/math/BigDecimal.<init>:(D)V
        //   342: new             Ljava/math/BigDecimal;
        //   345: dup            
        //   346: iconst_2       
        //   347: invokespecial   java/math/BigDecimal.<init>:(I)V
        //   350: invokevirtual   java/math/BigDecimal.multiply:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   353: invokevirtual   java/math/BigDecimal.add:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   356: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   359: ifge            365
        //   362: iconst_1       
        //   363: istore          5
        //   365: iload           5
        //   367: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   370: areturn        
        //   371: aload_0        
        //   372: aload           10
        //   374: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   377: ifne            383
        //   380: iconst_1       
        //   381: istore          5
        //   383: iload           5
        //   385: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   388: areturn        
        //   389: aload           10
        //   391: ifnull          443
        //   394: iload           8
        //   396: istore          5
        //   398: aload_0        
        //   399: aload           10
        //   401: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   404: ifle            410
        //   407: iconst_1       
        //   408: istore          5
        //   410: iload           5
        //   412: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   415: areturn        
        //   416: aload           10
        //   418: ifnull          443
        //   421: iload           9
        //   423: istore          5
        //   425: aload_0        
        //   426: aload           10
        //   428: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   431: ifge            437
        //   434: iconst_1       
        //   435: istore          5
        //   437: iload           5
        //   439: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   442: areturn        
        //   443: aconst_null    
        //   444: areturn        
        //   445: astore_0       
        //   446: aconst_null    
        //   447: areturn        
        //   448: astore_0       
        //   449: aconst_null    
        //   450: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  104    130    445    448    Ljava/lang/NumberFormatException;
        //  153    166    448    451    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0153:
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
    
    public abstract int a();
    
    public abstract boolean i();
    
    public abstract boolean j();
}
