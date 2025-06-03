// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import android.os.Looper;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import O1.P;
import T1.a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.net.HttpURLConnection;
import android.os.AsyncTask;

public class I extends AsyncTask
{
    public static final a d;
    public static final String e;
    public final HttpURLConnection a;
    public final J b;
    public Exception c;
    
    static {
        d = new a(null);
        e = I.class.getCanonicalName();
    }
    
    public I(final HttpURLConnection a, final J b) {
        Intrinsics.checkNotNullParameter(b, "requests");
        this.a = a;
        this.b = b;
    }
    
    public I(final J j) {
        Intrinsics.checkNotNullParameter(j, "requests");
        this(null, j);
    }
    
    public List a(final Void... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            9
        //     7: aconst_null    
        //     8: areturn        
        //     9: aload_1        
        //    10: ldc             "params"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_0        
        //    16: getfield        x1/I.a:Ljava/net/HttpURLConnection;
        //    19: astore_1       
        //    20: aload_1        
        //    21: ifnonnull       35
        //    24: aload_0        
        //    25: getfield        x1/I.b:Lx1/J;
        //    28: invokevirtual   x1/J.i:()Ljava/util/List;
        //    31: astore_1       
        //    32: goto            64
        //    35: getstatic       x1/F.n:Lx1/F$c;
        //    38: aload_1        
        //    39: aload_0        
        //    40: getfield        x1/I.b:Lx1/J;
        //    43: invokevirtual   x1/F$c.o:(Ljava/net/HttpURLConnection;Lx1/J;)Ljava/util/List;
        //    46: astore_1       
        //    47: goto            64
        //    50: aload_0        
        //    51: aload_1        
        //    52: putfield        x1/I.c:Ljava/lang/Exception;
        //    55: aconst_null    
        //    56: areturn        
        //    57: aload_1        
        //    58: aload_0        
        //    59: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //    62: aconst_null    
        //    63: areturn        
        //    64: aload_1        
        //    65: areturn        
        //    66: astore_1       
        //    67: goto            57
        //    70: astore_1       
        //    71: goto            50
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      15     66     64     Any
        //  15     20     70     57     Ljava/lang/Exception;
        //  15     20     66     64     Any
        //  24     32     70     57     Ljava/lang/Exception;
        //  24     32     66     64     Any
        //  35     47     70     57     Ljava/lang/Exception;
        //  35     47     66     64     Any
        //  50     55     66     64     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    public void b(final List list) {
        if (T1.a.d(this)) {
            return;
        }
        Label_0078: {
            try {
                Intrinsics.checkNotNullParameter(list, "result");
                super.onPostExecute((Object)list);
                final Exception c = this.c;
                if (c != null) {
                    final P a = P.a;
                    final String e = I.e;
                    final x a2 = x.a;
                    final String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[] { c.getMessage() }, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    P.j0(e, format);
                    return;
                }
            }
            finally {
                break Label_0078;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, this);
    }
    
    public void onPreExecute() {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                super.onPreExecute();
                if (B.D()) {
                    final P a = P.a;
                    final String e = I.e;
                    final x a2 = x.a;
                    final String format = String.format("execute async task: %s", Arrays.copyOf(new Object[] { this }, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    P.j0(e, format);
                }
                if (this.b.S() == null) {
                    Handler handler;
                    if (Thread.currentThread() instanceof HandlerThread) {
                        handler = new Handler();
                    }
                    else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    this.b.e0(handler);
                }
                return;
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{RequestAsyncTask: ");
        sb.append(" connection: ");
        sb.append(this.a);
        sb.append(", requests: ");
        sb.append(this.b);
        sb.append("}");
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return string;
    }
    
    public static final class a
    {
    }
}
