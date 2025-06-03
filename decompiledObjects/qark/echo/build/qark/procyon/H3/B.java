// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;

public class B implements F
{
    public final File a;
    public final String b;
    public final String c;
    
    public B(final String b, final String c, final File a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    private byte[] a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: newarray        B
        //     5: astore          5
        //     7: aload_0        
        //     8: invokevirtual   H3/B.i:()Ljava/io/InputStream;
        //    11: astore_2       
        //    12: new             Ljava/io/ByteArrayOutputStream;
        //    15: dup            
        //    16: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //    19: astore_3       
        //    20: new             Ljava/util/zip/GZIPOutputStream;
        //    23: dup            
        //    24: aload_3        
        //    25: invokespecial   java/util/zip/GZIPOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    28: astore          4
        //    30: aload_2        
        //    31: ifnonnull       62
        //    34: aload           4
        //    36: invokevirtual   java/io/OutputStream.close:()V
        //    39: aload_3        
        //    40: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //    43: aload_2        
        //    44: ifnull          51
        //    47: aload_2        
        //    48: invokevirtual   java/io/InputStream.close:()V
        //    51: aconst_null    
        //    52: areturn        
        //    53: astore_3       
        //    54: goto            149
        //    57: astore          4
        //    59: goto            132
        //    62: aload_2        
        //    63: aload           5
        //    65: invokevirtual   java/io/InputStream.read:([B)I
        //    68: istore_1       
        //    69: iload_1        
        //    70: ifle            85
        //    73: aload           4
        //    75: aload           5
        //    77: iconst_0       
        //    78: iload_1        
        //    79: invokevirtual   java/util/zip/GZIPOutputStream.write:([BII)V
        //    82: goto            62
        //    85: aload           4
        //    87: invokevirtual   java/util/zip/GZIPOutputStream.finish:()V
        //    90: aload_3        
        //    91: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //    94: astore          5
        //    96: aload           4
        //    98: invokevirtual   java/io/OutputStream.close:()V
        //   101: aload_3        
        //   102: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   105: aload_2        
        //   106: invokevirtual   java/io/InputStream.close:()V
        //   109: aload           5
        //   111: areturn        
        //   112: aload           4
        //   114: invokevirtual   java/io/OutputStream.close:()V
        //   117: goto            129
        //   120: astore          4
        //   122: aload           5
        //   124: aload           4
        //   126: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   129: aload           5
        //   131: athrow         
        //   132: aload_3        
        //   133: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   136: goto            146
        //   139: astore_3       
        //   140: aload           4
        //   142: aload_3        
        //   143: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   146: aload           4
        //   148: athrow         
        //   149: aload_2        
        //   150: ifnull          166
        //   153: aload_2        
        //   154: invokevirtual   java/io/InputStream.close:()V
        //   157: goto            166
        //   160: astore_2       
        //   161: aload_3        
        //   162: aload_2        
        //   163: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   166: aload_3        
        //   167: athrow         
        //   168: astore_2       
        //   169: aconst_null    
        //   170: areturn        
        //   171: astore          5
        //   173: goto            112
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      12     168    171    Ljava/io/IOException;
        //  12     20     53     168    Any
        //  20     30     57     149    Any
        //  34     39     57     149    Any
        //  39     43     53     168    Any
        //  47     51     168    171    Ljava/io/IOException;
        //  62     69     171    132    Any
        //  73     82     171    132    Any
        //  85     96     171    132    Any
        //  96     101    57     149    Any
        //  101    105    53     168    Any
        //  105    109    168    171    Ljava/io/IOException;
        //  112    117    120    129    Any
        //  122    129    57     149    Any
        //  129    132    57     149    Any
        //  132    136    139    146    Any
        //  140    146    53     168    Any
        //  146    149    53     168    Any
        //  153    157    160    166    Any
        //  161    166    168    171    Ljava/io/IOException;
        //  166    168    168    171    Ljava/io/IOException;
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
    
    @Override
    public InputStream i() {
        Label_0036: {
            if (!this.a.exists()) {
                break Label_0036;
            }
            if (!this.a.isFile()) {
                return null;
            }
            try {
                return new FileInputStream(this.a);
                return null;
            }
            catch (FileNotFoundException ex) {
                return null;
            }
        }
    }
    
    @Override
    public String j() {
        return this.c;
    }
    
    @Override
    public J3.B.d.b k() {
        final byte[] a = this.a();
        if (a != null) {
            return J3.B.d.b.a().b(a).c(this.b).a();
        }
        return null;
    }
}
