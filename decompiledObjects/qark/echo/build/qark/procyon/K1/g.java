// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K1;

import kotlin.jvm.internal.Intrinsics;
import android.view.ViewTreeObserver;
import android.view.View;
import T1.a;
import android.os.Looper;
import android.app.Activity;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Map;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class g implements ViewTreeObserver$OnGlobalLayoutListener
{
    public static final a r;
    public static final Map s;
    public final WeakReference o;
    public final Handler p;
    public final AtomicBoolean q;
    
    static {
        r = new a(null);
        s = new HashMap();
    }
    
    public g(final Activity referent) {
        this.o = new WeakReference((T)referent);
        this.p = new Handler(Looper.getMainLooper());
        this.q = new AtomicBoolean(false);
    }
    
    public static final /* synthetic */ Map b() {
        if (T1.a.d(g.class)) {
            return null;
        }
        try {
            return g.s;
        }
        finally {
            final Throwable t;
            T1.a.b(t, g.class);
            return null;
        }
    }
    
    public static final /* synthetic */ void c(final g g) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            g.g();
        }
        finally {
            final Throwable t;
            T1.a.b(t, g.class);
        }
    }
    
    public static final /* synthetic */ void d(final g g) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            g.h();
        }
        finally {
            final Throwable t;
            T1.a.b(t, g.class);
        }
    }
    
    public static final void f(final g p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     5: ifeq            9
        //     8: return         
        //     9: aload_0        
        //    10: ldc             "this$0"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: getstatic       G1/g.a:LG1/g;
        //    18: astore_1       
        //    19: aload_0        
        //    20: getfield        K1/g.o:Ljava/lang/ref/WeakReference;
        //    23: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //    26: checkcast       Landroid/app/Activity;
        //    29: invokestatic    G1/g.e:(Landroid/app/Activity;)Landroid/view/View;
        //    32: astore_1       
        //    33: aload_0        
        //    34: getfield        K1/g.o:Ljava/lang/ref/WeakReference;
        //    37: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //    40: checkcast       Landroid/app/Activity;
        //    43: astore_0       
        //    44: aload_1        
        //    45: ifnull          153
        //    48: aload_0        
        //    49: ifnonnull       53
        //    52: return         
        //    53: aload_1        
        //    54: invokestatic    K1/c.a:(Landroid/view/View;)Ljava/util/List;
        //    57: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    62: astore_2       
        //    63: aload_2        
        //    64: invokeinterface java/util/Iterator.hasNext:()Z
        //    69: ifeq            153
        //    72: aload_2        
        //    73: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    78: checkcast       Landroid/view/View;
        //    81: astore_3       
        //    82: aload_3        
        //    83: invokestatic    C1/d.g:(Landroid/view/View;)Z
        //    86: ifeq            92
        //    89: goto            63
        //    92: aload_3        
        //    93: invokestatic    K1/c.d:(Landroid/view/View;)Ljava/lang/String;
        //    96: astore          4
        //    98: aload           4
        //   100: invokeinterface java/lang/CharSequence.length:()I
        //   105: ifle            63
        //   108: aload           4
        //   110: invokevirtual   java/lang/String.length:()I
        //   113: sipush          300
        //   116: if_icmpgt       63
        //   119: getstatic       K1/j.s:LK1/j$a;
        //   122: astore          4
        //   124: aload_0        
        //   125: invokevirtual   android/app/Activity.getLocalClassName:()Ljava/lang/String;
        //   128: astore          5
        //   130: aload           5
        //   132: ldc             "activity.localClassName"
        //   134: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   137: aload           4
        //   139: aload_3        
        //   140: aload_1        
        //   141: aload           5
        //   143: invokevirtual   K1/j$a.d:(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V
        //   146: goto            63
        //   149: astore_0       
        //   150: goto            154
        //   153: return         
        //   154: aload_0        
        //   155: ldc             LK1/g;.class
        //   157: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   160: return         
        //   161: astore_0       
        //   162: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      15     149    153    Any
        //  15     44     161    163    Ljava/lang/Exception;
        //  15     44     149    153    Any
        //  53     63     161    163    Ljava/lang/Exception;
        //  53     63     149    153    Any
        //  63     89     161    163    Ljava/lang/Exception;
        //  63     89     149    153    Any
        //  92     146    161    163    Ljava/lang/Exception;
        //  92     146    149    153    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
        while (true) {
            try {
                final f f = new f(this);
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    f.run();
                    return;
                }
                this.p.post((Runnable)f);
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
    
    public final void g() {
        if (T1.a.d(this)) {
            return;
        }
        Label_0070: {
            try {
                if (this.q.getAndSet(true)) {
                    return;
                }
                final G1.g a = G1.g.a;
                final View e = G1.g.e((Activity)this.o.get());
                if (e == null) {
                    return;
                }
                final ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                    this.e();
                    return;
                }
            }
            finally {
                break Label_0070;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, this);
    }
    
    public final void h() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (!this.q.getAndSet(false)) {
                return;
            }
            final G1.g a = G1.g.a;
            final View e = G1.g.e((Activity)this.o.get());
            if (e == null) {
                return;
            }
            final ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
            if (!viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public void onGlobalLayout() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.e();
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public static final class a
    {
        public final void a(final Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            final int hashCode = activity.hashCode();
            final Map b = g.b();
            final Integer value = hashCode;
            g value2;
            if ((value2 = b.get(value)) == null) {
                value2 = new g(activity, null);
                b.put(value, value2);
            }
            g.c(value2);
        }
        
        public final void b(final Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            final g g = K1.g.b().remove(activity.hashCode());
            if (g == null) {
                return;
            }
            K1.g.d(g);
        }
    }
}
