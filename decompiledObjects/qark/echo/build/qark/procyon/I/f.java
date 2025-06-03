// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import android.os.Build$VERSION;
import android.view.Window$Callback;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface;
import android.app.Dialog;
import android.view.KeyEvent$DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.KeyEvent$Callback;
import android.app.Activity;
import android.view.KeyEvent;
import android.app.ActionBar;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class f
{
    public static boolean a = false;
    public static Method b;
    public static boolean c = false;
    public static Field d;
    
    public static boolean a(final ActionBar p0, final KeyEvent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            31
        //     6: aload_0        
        //     7: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    10: ldc             "onMenuKeyEvent"
        //    12: iconst_1       
        //    13: anewarray       Ljava/lang/Class;
        //    16: dup            
        //    17: iconst_0       
        //    18: ldc             Landroid/view/KeyEvent;.class
        //    20: aastore        
        //    21: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    24: putstatic       I/f.b:Ljava/lang/reflect/Method;
        //    27: iconst_1       
        //    28: putstatic       I/f.a:Z
        //    31: getstatic       I/f.b:Ljava/lang/reflect/Method;
        //    34: astore_3       
        //    35: aload_3        
        //    36: ifnull          69
        //    39: aload_3        
        //    40: aload_0        
        //    41: iconst_1       
        //    42: anewarray       Ljava/lang/Object;
        //    45: dup            
        //    46: iconst_0       
        //    47: aload_1        
        //    48: aastore        
        //    49: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    52: astore_0       
        //    53: aload_0        
        //    54: ifnonnull       59
        //    57: iconst_0       
        //    58: ireturn        
        //    59: aload_0        
        //    60: checkcast       Ljava/lang/Boolean;
        //    63: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    66: istore_2       
        //    67: iload_2        
        //    68: ireturn        
        //    69: iconst_0       
        //    70: ireturn        
        //    71: astore_3       
        //    72: goto            27
        //    75: astore_0       
        //    76: iconst_0       
        //    77: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  6      27     71     75     Ljava/lang/NoSuchMethodException;
        //  39     53     75     78     Ljava/lang/IllegalAccessException;
        //  39     53     75     78     Ljava/lang/reflect/InvocationTargetException;
        //  59     67     75     78     Ljava/lang/IllegalAccessException;
        //  59     67     75     78     Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
    
    public static boolean b(final Activity activity, final KeyEvent keyEvent) {
        activity.onUserInteraction();
        final Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            final ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        final View decorView = window.getDecorView();
        if (s.d(decorView, keyEvent)) {
            return true;
        }
        KeyEvent$DispatcherState keyDispatcherState;
        if (decorView != null) {
            keyDispatcherState = decorView.getKeyDispatcherState();
        }
        else {
            keyDispatcherState = null;
        }
        return keyEvent.dispatch((KeyEvent$Callback)activity, keyDispatcherState, (Object)activity);
    }
    
    public static boolean c(final Dialog dialog, final KeyEvent keyEvent) {
        final DialogInterface$OnKeyListener f = f(dialog);
        if (f != null && f.onKey((DialogInterface)dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        final Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        final View decorView = window.getDecorView();
        if (s.d(decorView, keyEvent)) {
            return true;
        }
        KeyEvent$DispatcherState keyDispatcherState;
        if (decorView != null) {
            keyDispatcherState = decorView.getKeyDispatcherState();
        }
        else {
            keyDispatcherState = null;
        }
        return keyEvent.dispatch((KeyEvent$Callback)dialog, keyDispatcherState, (Object)dialog);
    }
    
    public static boolean d(final View view, final KeyEvent keyEvent) {
        return s.e(view, keyEvent);
    }
    
    public static boolean e(final a a, final View view, final Window$Callback window$Callback, final KeyEvent keyEvent) {
        boolean b = false;
        if (a == null) {
            return false;
        }
        if (Build$VERSION.SDK_INT >= 28) {
            return a.b(keyEvent);
        }
        if (window$Callback instanceof Activity) {
            return b((Activity)window$Callback, keyEvent);
        }
        if (window$Callback instanceof Dialog) {
            return c((Dialog)window$Callback, keyEvent);
        }
        if ((view != null && s.d(view, keyEvent)) || a.b(keyEvent)) {
            b = true;
        }
        return b;
    }
    
    public static DialogInterface$OnKeyListener f(final Dialog p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            27
        //     6: ldc             Landroid/app/Dialog;.class
        //     8: ldc             "mOnKeyListener"
        //    10: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    13: astore_1       
        //    14: aload_1        
        //    15: putstatic       I/f.d:Ljava/lang/reflect/Field;
        //    18: aload_1        
        //    19: iconst_1       
        //    20: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //    23: iconst_1       
        //    24: putstatic       I/f.c:Z
        //    27: getstatic       I/f.d:Ljava/lang/reflect/Field;
        //    30: astore_1       
        //    31: aload_1        
        //    32: ifnull          46
        //    35: aload_1        
        //    36: aload_0        
        //    37: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    40: checkcast       Landroid/content/DialogInterface$OnKeyListener;
        //    43: astore_0       
        //    44: aload_0        
        //    45: areturn        
        //    46: aconst_null    
        //    47: areturn        
        //    48: astore_1       
        //    49: goto            23
        //    52: astore_0       
        //    53: goto            46
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  6      23     48     52     Ljava/lang/NoSuchFieldException;
        //  35     44     52     56     Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    public interface a
    {
        boolean b(final KeyEvent p0);
    }
}
