// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import java.io.Closeable;
import java.util.Iterator;
import java.io.IOException;
import java.util.List;
import java.io.File;
import java.io.InputStream;

public abstract class G
{
    public static void a(final InputStream p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       5
        //     4: return         
        //     5: sipush          8192
        //     8: newarray        B
        //    10: astore          4
        //    12: aconst_null    
        //    13: astore_3       
        //    14: new             Ljava/util/zip/GZIPOutputStream;
        //    17: dup            
        //    18: new             Ljava/io/FileOutputStream;
        //    21: dup            
        //    22: aload_1        
        //    23: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    26: invokespecial   java/util/zip/GZIPOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    29: astore_1       
        //    30: aload_0        
        //    31: aload           4
        //    33: invokevirtual   java/io/InputStream.read:([B)I
        //    36: istore_2       
        //    37: iload_2        
        //    38: ifle            52
        //    41: aload_1        
        //    42: aload           4
        //    44: iconst_0       
        //    45: iload_2        
        //    46: invokevirtual   java/util/zip/GZIPOutputStream.write:([BII)V
        //    49: goto            30
        //    52: aload_1        
        //    53: invokevirtual   java/util/zip/GZIPOutputStream.finish:()V
        //    56: aload_1        
        //    57: invokestatic    H3/i.g:(Ljava/io/Closeable;)V
        //    60: return         
        //    61: astore_1       
        //    62: aload_3        
        //    63: astore_0       
        //    64: aload_0        
        //    65: invokestatic    H3/i.g:(Ljava/io/Closeable;)V
        //    68: aload_1        
        //    69: athrow         
        //    70: astore_3       
        //    71: aload_1        
        //    72: astore_0       
        //    73: aload_3        
        //    74: astore_1       
        //    75: goto            64
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  14     30     61     64     Any
        //  30     37     70     78     Any
        //  41     49     70     78     Any
        //  52     56     70     78     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
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
    
    public static void b(final File parent, List o) {
        for (final F f : o) {
            o = null;
            Closeable closeable = null;
            try {
                final InputStream i = f.i();
                if (i == null) {
                    o = i;
                }
                else {
                    closeable = i;
                    o = i;
                    a(i, new File(parent, f.j()));
                    o = i;
                }
            }
            catch (IOException ex) {}
            finally {
                i.g(closeable);
            }
        }
        goto Label_0090;
    }
}
