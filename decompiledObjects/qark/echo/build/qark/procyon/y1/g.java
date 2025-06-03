// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import java.io.ObjectStreamClass;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.File;
import android.content.Context;
import android.util.Log;
import java.io.Closeable;
import O1.P;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import x1.B;

public final class g
{
    public static final g a;
    public static final String b;
    
    static {
        a = new g();
        b = g.class.getName();
    }
    
    public static final G a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: invokestatic    G1/g.b:()V
        //     6: invokestatic    x1/B.l:()Landroid/content/Context;
        //     9: astore          4
        //    11: aconst_null    
        //    12: astore_3       
        //    13: aload           4
        //    15: ldc             "AppEventsLogger.persistedevents"
        //    17: invokevirtual   android/content/Context.openFileInput:(Ljava/lang/String;)Ljava/io/FileInputStream;
        //    20: astore_0       
        //    21: aload_0        
        //    22: ldc             "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
        //    24: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    27: new             Ly1/g$a;
        //    30: dup            
        //    31: new             Ljava/io/BufferedInputStream;
        //    34: dup            
        //    35: aload_0        
        //    36: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    39: invokespecial   y1/g$a.<init>:(Ljava/io/InputStream;)V
        //    42: astore_1       
        //    43: aload_1        
        //    44: astore_0       
        //    45: aload_1        
        //    46: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //    49: astore_2       
        //    50: aload_2        
        //    51: ifnull          107
        //    54: aload_1        
        //    55: astore_0       
        //    56: aload_2        
        //    57: checkcast       Ly1/G;
        //    60: astore_2       
        //    61: aload_1        
        //    62: invokestatic    O1/P.j:(Ljava/io/Closeable;)V
        //    65: aload           4
        //    67: ldc             "AppEventsLogger.persistedevents"
        //    69: invokevirtual   android/content/Context.getFileStreamPath:(Ljava/lang/String;)Ljava/io/File;
        //    72: invokevirtual   java/io/File.delete:()Z
        //    75: pop            
        //    76: goto            94
        //    79: astore_0       
        //    80: goto            264
        //    83: astore_0       
        //    84: getstatic       y1/g.b:Ljava/lang/String;
        //    87: ldc             "Got unexpected exception when removing events file: "
        //    89: aload_0        
        //    90: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    93: pop            
        //    94: aload_2        
        //    95: astore_0       
        //    96: goto            245
        //    99: astore_1       
        //   100: goto            186
        //   103: astore_2       
        //   104: goto            136
        //   107: aload_1        
        //   108: astore_0       
        //   109: new             Ljava/lang/NullPointerException;
        //   112: dup            
        //   113: ldc             "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
        //   115: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   118: athrow         
        //   119: astore_1       
        //   120: aconst_null    
        //   121: astore_0       
        //   122: goto            186
        //   125: astore_2       
        //   126: aconst_null    
        //   127: astore_1       
        //   128: goto            136
        //   131: aconst_null    
        //   132: astore_1       
        //   133: goto            217
        //   136: aload_1        
        //   137: astore_0       
        //   138: getstatic       y1/g.b:Ljava/lang/String;
        //   141: ldc             "Got unexpected exception while reading events: "
        //   143: aload_2        
        //   144: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   147: pop            
        //   148: aload_1        
        //   149: invokestatic    O1/P.j:(Ljava/io/Closeable;)V
        //   152: aload           4
        //   154: ldc             "AppEventsLogger.persistedevents"
        //   156: invokevirtual   android/content/Context.getFileStreamPath:(Ljava/lang/String;)Ljava/io/File;
        //   159: invokevirtual   java/io/File.delete:()Z
        //   162: pop            
        //   163: aload_3        
        //   164: astore_0       
        //   165: goto            245
        //   168: astore_0       
        //   169: getstatic       y1/g.b:Ljava/lang/String;
        //   172: astore_1       
        //   173: aload_1        
        //   174: ldc             "Got unexpected exception when removing events file: "
        //   176: aload_0        
        //   177: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   180: pop            
        //   181: aload_3        
        //   182: astore_0       
        //   183: goto            245
        //   186: aload_0        
        //   187: invokestatic    O1/P.j:(Ljava/io/Closeable;)V
        //   190: aload           4
        //   192: ldc             "AppEventsLogger.persistedevents"
        //   194: invokevirtual   android/content/Context.getFileStreamPath:(Ljava/lang/String;)Ljava/io/File;
        //   197: invokevirtual   java/io/File.delete:()Z
        //   200: pop            
        //   201: goto            215
        //   204: astore_0       
        //   205: getstatic       y1/g.b:Ljava/lang/String;
        //   208: ldc             "Got unexpected exception when removing events file: "
        //   210: aload_0        
        //   211: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   214: pop            
        //   215: aload_1        
        //   216: athrow         
        //   217: aload_1        
        //   218: invokestatic    O1/P.j:(Ljava/io/Closeable;)V
        //   221: aload           4
        //   223: ldc             "AppEventsLogger.persistedevents"
        //   225: invokevirtual   android/content/Context.getFileStreamPath:(Ljava/lang/String;)Ljava/io/File;
        //   228: invokevirtual   java/io/File.delete:()Z
        //   231: pop            
        //   232: aload_3        
        //   233: astore_0       
        //   234: goto            245
        //   237: astore_0       
        //   238: getstatic       y1/g.b:Ljava/lang/String;
        //   241: astore_1       
        //   242: goto            173
        //   245: aload_0        
        //   246: astore_1       
        //   247: aload_0        
        //   248: ifnonnull       259
        //   251: new             Ly1/G;
        //   254: dup            
        //   255: invokespecial   y1/G.<init>:()V
        //   258: astore_1       
        //   259: ldc             Ly1/g;.class
        //   261: monitorexit    
        //   262: aload_1        
        //   263: areturn        
        //   264: ldc             Ly1/g;.class
        //   266: monitorexit    
        //   267: aload_0        
        //   268: athrow         
        //   269: astore_0       
        //   270: goto            131
        //   273: astore_0       
        //   274: goto            217
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  3      11     79     83     Any
        //  13     43     269    136    Ljava/io/FileNotFoundException;
        //  13     43     125    131    Ljava/lang/Exception;
        //  13     43     119    125    Any
        //  45     50     273    277    Ljava/io/FileNotFoundException;
        //  45     50     103    107    Ljava/lang/Exception;
        //  45     50     99     103    Any
        //  56     61     273    277    Ljava/io/FileNotFoundException;
        //  56     61     103    107    Ljava/lang/Exception;
        //  56     61     99     103    Any
        //  61     65     79     83     Any
        //  65     76     83     94     Ljava/lang/Exception;
        //  65     76     79     83     Any
        //  84     94     79     83     Any
        //  109    119    273    277    Ljava/io/FileNotFoundException;
        //  109    119    103    107    Ljava/lang/Exception;
        //  109    119    99     103    Any
        //  138    148    99     103    Any
        //  148    152    79     83     Any
        //  152    163    168    173    Ljava/lang/Exception;
        //  152    163    79     83     Any
        //  169    173    79     83     Any
        //  173    181    79     83     Any
        //  186    190    79     83     Any
        //  190    201    204    215    Ljava/lang/Exception;
        //  190    201    79     83     Any
        //  205    215    79     83     Any
        //  215    217    79     83     Any
        //  217    221    79     83     Any
        //  221    232    237    245    Ljava/lang/Exception;
        //  221    232    79     83     Any
        //  238    242    79     83     Any
        //  251    259    79     83     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 153 out of bounds for length 153
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
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
    
    public static final void b(G obj) {
        final Context l = B.l();
        final G g = null;
        try {
            final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(l.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream.writeObject(obj);
                P.j(objectOutputStream);
                return;
            }
            finally {}
        }
        finally {
            obj = g;
        }
        while (true) {
            Label_0081: {
                try {
                    final Throwable t;
                    Log.w(y1.g.b, "Got unexpected exception while persisting events: ", t);
                    final Context context = l;
                    final String s = "AppEventsLogger.persistedevents";
                    final File file = context.getFileStreamPath(s);
                    file.delete();
                    break Label_0076;
                }
                finally {
                    break Label_0081;
                }
                try {
                    final Context context = l;
                    final String s = "AppEventsLogger.persistedevents";
                    final File file = context.getFileStreamPath(s);
                    file.delete();
                    P.j((Closeable)obj);
                    return;
                    P.j((Closeable)obj);
                }
                catch (Exception ex) {
                    continue;
                }
            }
            break;
        }
    }
    
    public static final class a extends ObjectInputStream
    {
        public static final g.a.a o;
        
        static {
            o = new g.a.a(null);
        }
        
        public a(final InputStream in) {
            super(in);
        }
        
        public ObjectStreamClass readClassDescriptor() {
            final ObjectStreamClass classDescriptor = super.readClassDescriptor();
            ObjectStreamClass lookup = null;
            Label_0048: {
                Serializable cl;
                if (Intrinsics.a(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                    cl = a.b.class;
                }
                else {
                    lookup = classDescriptor;
                    if (!Intrinsics.a(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                        break Label_0048;
                    }
                    cl = e.b.class;
                }
                lookup = ObjectStreamClass.lookup((Class<?>)cl);
            }
            Intrinsics.checkNotNullExpressionValue(lookup, "resultClassDescriptor");
            return lookup;
        }
        
        public static final class a
        {
        }
    }
}
