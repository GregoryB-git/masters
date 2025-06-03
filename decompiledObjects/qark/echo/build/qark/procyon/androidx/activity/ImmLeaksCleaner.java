// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.activity;

import androidx.lifecycle.d;
import androidx.lifecycle.h;
import android.view.inputmethod.InputMethodManager;
import android.app.Activity;
import java.lang.reflect.Field;
import androidx.lifecycle.f;

final class ImmLeaksCleaner implements f
{
    public static int p;
    public static Field q;
    public static Field r;
    public static Field s;
    public Activity o;
    
    public ImmLeaksCleaner(final Activity o) {
        this.o = o;
    }
    
    public static void b() {
        try {
            ImmLeaksCleaner.p = 2;
            (ImmLeaksCleaner.r = InputMethodManager.class.getDeclaredField("mServedView")).setAccessible(true);
            (ImmLeaksCleaner.s = InputMethodManager.class.getDeclaredField("mNextServedView")).setAccessible(true);
            (ImmLeaksCleaner.q = InputMethodManager.class.getDeclaredField("mH")).setAccessible(true);
            ImmLeaksCleaner.p = 1;
        }
        catch (NoSuchFieldException ex) {}
    }
    
    @Override
    public void a(final h p0, final d.b p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       androidx/lifecycle/d$b.ON_DESTROY:Landroidx/lifecycle/d$b;
        //     4: if_acmpeq       8
        //     7: return         
        //     8: getstatic       androidx/activity/ImmLeaksCleaner.p:I
        //    11: ifne            17
        //    14: invokestatic    androidx/activity/ImmLeaksCleaner.b:()V
        //    17: getstatic       androidx/activity/ImmLeaksCleaner.p:I
        //    20: iconst_1       
        //    21: if_icmpne       109
        //    24: aload_0        
        //    25: getfield        androidx/activity/ImmLeaksCleaner.o:Landroid/app/Activity;
        //    28: ldc             "input_method"
        //    30: invokevirtual   android/app/Activity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    33: checkcast       Landroid/view/inputmethod/InputMethodManager;
        //    36: astore_2       
        //    37: getstatic       androidx/activity/ImmLeaksCleaner.q:Ljava/lang/reflect/Field;
        //    40: aload_2        
        //    41: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    44: astore_1       
        //    45: aload_1        
        //    46: ifnonnull       50
        //    49: return         
        //    50: aload_1        
        //    51: monitorenter   
        //    52: getstatic       androidx/activity/ImmLeaksCleaner.r:Ljava/lang/reflect/Field;
        //    55: aload_2        
        //    56: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    59: checkcast       Landroid/view/View;
        //    62: astore_3       
        //    63: aload_3        
        //    64: ifnonnull       70
        //    67: aload_1        
        //    68: monitorexit    
        //    69: return         
        //    70: aload_3        
        //    71: invokevirtual   android/view/View.isAttachedToWindow:()Z
        //    74: ifeq            80
        //    77: aload_1        
        //    78: monitorexit    
        //    79: return         
        //    80: getstatic       androidx/activity/ImmLeaksCleaner.s:Ljava/lang/reflect/Field;
        //    83: aload_2        
        //    84: aconst_null    
        //    85: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    88: aload_1        
        //    89: monitorexit    
        //    90: aload_2        
        //    91: invokevirtual   android/view/inputmethod/InputMethodManager.isActive:()Z
        //    94: pop            
        //    95: return         
        //    96: aload_1        
        //    97: monitorexit    
        //    98: return         
        //    99: aload_1        
        //   100: monitorexit    
        //   101: return         
        //   102: aload_1        
        //   103: monitorexit    
        //   104: return         
        //   105: aload_1        
        //   106: monitorexit    
        //   107: aload_2        
        //   108: athrow         
        //   109: return         
        //   110: astore_1       
        //   111: return         
        //   112: astore_2       
        //   113: goto            102
        //   116: astore_2       
        //   117: goto            99
        //   120: astore_2       
        //   121: goto            96
        //   124: astore_2       
        //   125: goto            105
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  37     45     110    112    Ljava/lang/IllegalAccessException;
        //  52     63     112    105    Ljava/lang/IllegalAccessException;
        //  52     63     116    102    Ljava/lang/ClassCastException;
        //  52     63     124    109    Any
        //  67     69     124    109    Any
        //  70     79     124    109    Any
        //  80     88     120    99     Ljava/lang/IllegalAccessException;
        //  80     88     124    109    Any
        //  88     90     124    109    Any
        //  96     98     124    109    Any
        //  99     101    124    109    Any
        //  102    104    124    109    Any
        //  105    107    124    109    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0070:
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
}
