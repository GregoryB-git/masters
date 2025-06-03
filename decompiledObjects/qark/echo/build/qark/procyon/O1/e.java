// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import x1.B;
import T1.a;
import android.app.Activity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import android.os.Bundle;
import kotlin.jvm.internal.g;
import android.net.Uri;

public class e
{
    public static final a b;
    public Uri a;
    
    static {
        b = new a(null);
    }
    
    public e(final String s, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(s, "action");
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        final w[] values = w.values();
        final ArrayList list = new ArrayList<String>(values.length);
        for (int length = values.length, i = 0; i < length; ++i) {
            list.add(values[i].e());
        }
        Uri a2;
        if (list.contains(s)) {
            final P a = P.a;
            a2 = P.g(H.g(), Intrinsics.i("/dialog/", s), bundle2);
        }
        else {
            a2 = e.b.a(s, bundle2);
        }
        this.a = a2;
    }
    
    public final boolean a(final Activity p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            9
        //     7: iconst_0       
        //     8: ireturn        
        //     9: aload_1        
        //    10: ldc             "activity"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: getstatic       Y1/d.a:LY1/d$a;
        //    18: invokevirtual   Y1/d$a.a:()Lq/e;
        //    21: pop            
        //    22: new             Lq/c$b;
        //    25: dup            
        //    26: aconst_null    
        //    27: invokespecial   q/c$b.<init>:(Lq/e;)V
        //    30: invokevirtual   q/c$b.a:()Lq/c;
        //    33: astore_3       
        //    34: aload_3        
        //    35: getfield        q/c.a:Landroid/content/Intent;
        //    38: aload_2        
        //    39: invokevirtual   android/content/Intent.setPackage:(Ljava/lang/String;)Landroid/content/Intent;
        //    42: pop            
        //    43: aload_3        
        //    44: aload_1        
        //    45: aload_0        
        //    46: getfield        O1/e.a:Landroid/net/Uri;
        //    49: invokevirtual   q/c.a:(Landroid/content/Context;Landroid/net/Uri;)V
        //    52: iconst_1       
        //    53: ireturn        
        //    54: astore_1       
        //    55: goto            58
        //    58: aload_1        
        //    59: aload_0        
        //    60: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //    63: iconst_0       
        //    64: ireturn        
        //    65: astore_1       
        //    66: iconst_0       
        //    67: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  9      43     54     65     Any
        //  43     52     65     68     Landroid/content/ActivityNotFoundException;
        //  43     52     54     65     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0058:
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
    
    public final void b(final Uri a) {
        if (a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(a, "<set-?>");
            this.a = a;
        }
        finally {
            final Throwable t;
            a.b(t, this);
        }
    }
    
    public static final class a
    {
        public Uri a(final String str, final Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "action");
            final P a = P.a;
            final String b = H.b();
            final StringBuilder sb = new StringBuilder();
            sb.append(B.w());
            sb.append("/dialog/");
            sb.append(str);
            return P.g(b, sb.toString(), bundle);
        }
    }
}
