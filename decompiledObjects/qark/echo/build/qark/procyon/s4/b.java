// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s4;

import java.io.IOException;
import android.util.Log;
import android.content.Context;
import java.nio.channels.FileLock;
import java.nio.channels.FileChannel;

public class b
{
    public final FileChannel a;
    public final FileLock b;
    
    public b(final FileChannel a, final FileLock b) {
        this.a = a;
        this.b = b;
    }
    
    public static b a(final Context p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: new             Ljava/io/File;
        //     7: dup            
        //     8: aload_0        
        //     9: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    12: aload_1        
        //    13: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    16: ldc             "rw"
        //    18: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    21: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //    24: astore_2       
        //    25: aload_2        
        //    26: invokevirtual   java/nio/channels/FileChannel.lock:()Ljava/nio/channels/FileLock;
        //    29: astore_1       
        //    30: new             Ls4/b;
        //    33: dup            
        //    34: aload_2        
        //    35: aload_1        
        //    36: invokespecial   s4/b.<init>:(Ljava/nio/channels/FileChannel;Ljava/nio/channels/FileLock;)V
        //    39: astore_0       
        //    40: aload_0        
        //    41: areturn        
        //    42: astore_0       
        //    43: goto            84
        //    46: astore_0       
        //    47: goto            84
        //    50: astore_0       
        //    51: goto            84
        //    54: astore_0       
        //    55: aconst_null    
        //    56: astore_1       
        //    57: goto            84
        //    60: astore_0       
        //    61: goto            55
        //    64: astore_0       
        //    65: goto            55
        //    68: astore_0       
        //    69: aconst_null    
        //    70: astore_2       
        //    71: aload_2        
        //    72: astore_1       
        //    73: goto            84
        //    76: astore_0       
        //    77: goto            69
        //    80: astore_0       
        //    81: goto            69
        //    84: ldc             "CrossProcessLock"
        //    86: ldc             "encountered error while creating and acquiring the lock, ignoring"
        //    88: aload_0        
        //    89: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    92: pop            
        //    93: aload_1        
        //    94: ifnull          101
        //    97: aload_1        
        //    98: invokevirtual   java/nio/channels/FileLock.release:()V
        //   101: aload_2        
        //   102: ifnull          109
        //   105: aload_2        
        //   106: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //   109: aconst_null    
        //   110: areturn        
        //   111: astore_0       
        //   112: goto            101
        //   115: astore_0       
        //   116: aconst_null    
        //   117: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                            
        //  -----  -----  -----  -----  ------------------------------------------------
        //  0      25     80     84     Ljava/io/IOException;
        //  0      25     76     80     Ljava/lang/Error;
        //  0      25     68     69     Ljava/nio/channels/OverlappingFileLockException;
        //  25     30     64     68     Ljava/io/IOException;
        //  25     30     60     64     Ljava/lang/Error;
        //  25     30     54     55     Ljava/nio/channels/OverlappingFileLockException;
        //  30     40     50     54     Ljava/io/IOException;
        //  30     40     46     50     Ljava/lang/Error;
        //  30     40     42     46     Ljava/nio/channels/OverlappingFileLockException;
        //  97     101    111    115    Ljava/io/IOException;
        //  105    109    115    118    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0109:
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
    
    public void b() {
        try {
            this.b.release();
            this.a.close();
        }
        catch (IOException ex) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", (Throwable)ex);
        }
    }
}
