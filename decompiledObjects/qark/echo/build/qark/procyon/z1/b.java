// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z1;

import O1.r;
import O1.v;
import android.app.Activity;
import O1.P;
import x1.B;
import T1.a;

public final class b
{
    public static final b a;
    public static final String b;
    public static boolean c;
    
    static {
        a = new b();
        b = b.class.getCanonicalName();
    }
    
    public static final void b() {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            try {
                B.t().execute(new z1.a());
                return;
            }
            finally {}
        }
        catch (Exception ex) {
            final P a = P.a;
            P.i0(z1.b.b, ex);
            return;
        }
        final Throwable t;
        T1.a.b(t, b.class);
    }
    
    public static final void c() {
        if (T1.a.d(b.class)) {
            return;
        }
        Label_0039: {
            try {
                if (!O1.a.f.h(B.l())) {
                    z1.b.a.e();
                    z1.b.c = true;
                    return;
                }
            }
            finally {
                break Label_0039;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, b.class);
    }
    
    public static final void d(final Activity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     5: ifeq            9
        //     8: return         
        //     9: aload_0        
        //    10: ldc             "activity"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: getstatic       z1/b.c:Z
        //    18: ifeq            48
        //    21: getstatic       z1/d.d:Lz1/d$a;
        //    24: invokevirtual   z1/d$a.c:()Ljava/util/Set;
        //    27: invokeinterface java/util/Set.isEmpty:()Z
        //    32: ifeq            36
        //    35: return         
        //    36: getstatic       z1/f.s:Lz1/f$a;
        //    39: aload_0        
        //    40: invokevirtual   z1/f$a.e:(Landroid/app/Activity;)V
        //    43: return         
        //    44: astore_0       
        //    45: goto            49
        //    48: return         
        //    49: aload_0        
        //    50: ldc             Lz1/b;.class
        //    52: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //    55: return         
        //    56: astore_0       
        //    57: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      15     44     48     Any
        //  15     35     56     58     Ljava/lang/Exception;
        //  15     35     44     48     Any
        //  36     43     56     58     Ljava/lang/Exception;
        //  36     43     44     48     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
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
    
    public final void e() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final v a = v.a;
            final r q = v.q(B.m(), false);
            if (q == null) {
                return;
            }
            final String h = q.h();
            if (h == null) {
                return;
            }
            d.d.d(h);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
}
