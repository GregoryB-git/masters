// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class P1
{
    public static final Object h;
    public final String a;
    public final N1 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public volatile Object f;
    public volatile Object g;
    
    static {
        h = new Object();
    }
    
    public P1(final String a, final Object c, final Object d, final N1 b) {
        this.e = new Object();
        this.f = null;
        this.g = null;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public final Object a(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        R2/P1.e:Ljava/lang/Object;
        //     4: astore_3       
        //     5: aload_3        
        //     6: monitorenter   
        //     7: aload_3        
        //     8: monitorexit    
        //     9: aload_1        
        //    10: ifnull          15
        //    13: aload_1        
        //    14: areturn        
        //    15: getstatic       R2/M1.a:LR2/f;
        //    18: ifnonnull       26
        //    21: aload_0        
        //    22: getfield        R2/P1.c:Ljava/lang/Object;
        //    25: areturn        
        //    26: getstatic       R2/P1.h:Ljava/lang/Object;
        //    29: astore_3       
        //    30: aload_3        
        //    31: monitorenter   
        //    32: invokestatic    R2/f.a:()Z
        //    35: ifeq            62
        //    38: aload_0        
        //    39: getfield        R2/P1.g:Ljava/lang/Object;
        //    42: ifnonnull       53
        //    45: aload_0        
        //    46: getfield        R2/P1.c:Ljava/lang/Object;
        //    49: astore_1       
        //    50: goto            58
        //    53: aload_0        
        //    54: getfield        R2/P1.g:Ljava/lang/Object;
        //    57: astore_1       
        //    58: aload_3        
        //    59: monitorexit    
        //    60: aload_1        
        //    61: areturn        
        //    62: aload_3        
        //    63: monitorexit    
        //    64: invokestatic    R2/K.z0:()Ljava/util/List;
        //    67: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    72: astore          4
        //    74: aload           4
        //    76: invokeinterface java/util/Iterator.hasNext:()Z
        //    81: ifeq            160
        //    84: aload           4
        //    86: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    91: checkcast       LR2/P1;
        //    94: astore          5
        //    96: invokestatic    R2/f.a:()Z
        //    99: istore_2       
        //   100: iload_2        
        //   101: ifne            150
        //   104: aconst_null    
        //   105: astore_3       
        //   106: aload           5
        //   108: getfield        R2/P1.b:LR2/N1;
        //   111: astore          6
        //   113: aload_3        
        //   114: astore_1       
        //   115: aload           6
        //   117: ifnull          128
        //   120: aload           6
        //   122: invokeinterface R2/N1.a:()Ljava/lang/Object;
        //   127: astore_1       
        //   128: getstatic       R2/P1.h:Ljava/lang/Object;
        //   131: astore_3       
        //   132: aload_3        
        //   133: monitorenter   
        //   134: aload           5
        //   136: aload_1        
        //   137: putfield        R2/P1.g:Ljava/lang/Object;
        //   140: aload_3        
        //   141: monitorexit    
        //   142: goto            74
        //   145: astore_1       
        //   146: aload_3        
        //   147: monitorexit    
        //   148: aload_1        
        //   149: athrow         
        //   150: new             Ljava/lang/IllegalStateException;
        //   153: dup            
        //   154: ldc             "Refreshing flag cache must be done on a worker thread."
        //   156: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   159: athrow         
        //   160: aload_0        
        //   161: getfield        R2/P1.b:LR2/N1;
        //   164: astore_1       
        //   165: aload_1        
        //   166: ifnonnull       174
        //   169: aload_0        
        //   170: getfield        R2/P1.c:Ljava/lang/Object;
        //   173: areturn        
        //   174: aload_1        
        //   175: invokeinterface R2/N1.a:()Ljava/lang/Object;
        //   180: astore_1       
        //   181: aload_1        
        //   182: areturn        
        //   183: aload_0        
        //   184: getfield        R2/P1.c:Ljava/lang/Object;
        //   187: areturn        
        //   188: aload_0        
        //   189: getfield        R2/P1.c:Ljava/lang/Object;
        //   192: areturn        
        //   193: aload_3        
        //   194: monitorexit    
        //   195: aload_1        
        //   196: athrow         
        //   197: astore_1       
        //   198: aload_3        
        //   199: monitorexit    
        //   200: aload_1        
        //   201: athrow         
        //   202: astore_1       
        //   203: goto            160
        //   206: astore_1       
        //   207: aload_3        
        //   208: astore_1       
        //   209: goto            128
        //   212: astore_1       
        //   213: goto            188
        //   216: astore_1       
        //   217: goto            183
        //   220: astore_1       
        //   221: goto            193
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  7      9      197    202    Any
        //  32     50     220    197    Any
        //  53     58     220    197    Any
        //  58     60     220    197    Any
        //  62     64     220    197    Any
        //  64     74     202    206    Ljava/lang/SecurityException;
        //  74     100    202    206    Ljava/lang/SecurityException;
        //  106    113    206    212    Ljava/lang/IllegalStateException;
        //  106    113    202    206    Ljava/lang/SecurityException;
        //  120    128    206    212    Ljava/lang/IllegalStateException;
        //  120    128    202    206    Ljava/lang/SecurityException;
        //  128    134    202    206    Ljava/lang/SecurityException;
        //  134    142    145    150    Any
        //  146    148    145    150    Any
        //  148    150    202    206    Ljava/lang/SecurityException;
        //  150    160    202    206    Ljava/lang/SecurityException;
        //  174    181    212    193    Ljava/lang/SecurityException;
        //  174    181    216    188    Ljava/lang/IllegalStateException;
        //  193    195    220    197    Any
        //  198    200    197    202    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 124 out of bounds for length 124
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
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
    
    public final String b() {
        return this.a;
    }
}
