// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C1;

import android.widget.CompoundButton;
import org.json.JSONException;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.TimePicker;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import O1.P;
import android.view.View$OnTouchListener;
import java.lang.reflect.Field;
import android.view.View$OnClickListener;
import org.json.JSONObject;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import android.view.ViewParent;
import T1.a;
import android.view.View;
import java.lang.reflect.Method;
import java.lang.ref.WeakReference;

public final class f
{
    public static final f a;
    public static final String b;
    public static WeakReference c;
    public static Method d;
    
    static {
        a = new f();
        b = f.class.getCanonicalName();
        f.c = new WeakReference(null);
    }
    
    public static final View a(View o) {
        if (T1.a.d(f.class)) {
            return null;
        }
        while (o != null) {
            try {
                if (f.a.q((View)o)) {
                    return (View)o;
                }
                final ViewParent parent = ((View)o).getParent();
                if (parent instanceof View) {
                    o = parent;
                    continue;
                }
            }
            finally {
                T1.a.b((Throwable)o, f.class);
            }
            break;
        }
        return null;
    }
    
    public static final List b(final View view) {
        if (T1.a.d(f.class)) {
            return null;
        }
        Label_0078: {
            ArrayList<View> list;
            try {
                list = new ArrayList<View>();
                if (view instanceof ViewGroup) {
                    final int childCount = ((ViewGroup)view).getChildCount();
                    if (childCount > 0) {
                        int n = 0;
                        while (true) {
                            final int n2 = n + 1;
                            list.add(((ViewGroup)view).getChildAt(n));
                            if (n2 >= childCount) {
                                break;
                            }
                            n = n2;
                        }
                        return list;
                    }
                }
            }
            finally {
                break Label_0078;
            }
            return list;
        }
        final Throwable t;
        T1.a.b(t, f.class);
        return null;
    }
    
    public static final int c(final View view) {
        if (T1.a.d(f.class)) {
            return 0;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                int n;
                if (view instanceof ImageView) {
                    n = 2;
                }
                else {
                    n = 0;
                }
                int n2 = n;
                if (view.isClickable()) {
                    n2 = (n | 0x20);
                }
                int n3 = n2;
                if (o(view)) {
                    n3 = (n2 | 0x200);
                }
                if (view instanceof TextView) {
                    int n4 = n3 | 0x401;
                    while (true) {
                        Label_0229: {
                            if (!(view instanceof Button)) {
                                break Label_0229;
                            }
                            n4 = (n3 | 0x405);
                            int n5;
                            if (view instanceof Switch) {
                                n5 = (n3 | 0x2405);
                            }
                            else {
                                if (!(view instanceof CheckBox)) {
                                    break Label_0229;
                                }
                                n5 = (n3 | 0x8405);
                            }
                            final int n6 = n5;
                            if (view instanceof EditText) {
                                return n5 | 0x800;
                            }
                            return n6;
                        }
                        int n5 = n4;
                        continue;
                    }
                }
                int n6;
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return n3 | 0x10000;
                    }
                    if (view instanceof RadioGroup) {
                        return n3 | 0x4000;
                    }
                    n6 = n3;
                    if (view instanceof ViewGroup) {
                        final boolean p = f.a.p(view, (View)f.c.get());
                        n6 = n3;
                        if (p) {
                            return n3 | 0x40;
                        }
                    }
                }
                else {
                    n6 = (n3 | 0x1000);
                }
                return n6;
                final Throwable t;
                T1.a.b(t, f.class);
                return 0;
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public static final JSONObject d(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     5: ifeq            10
        //     8: aconst_null    
        //     9: areturn        
        //    10: aload_0        
        //    11: ldc             "view"
        //    13: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: aload_0        
        //    17: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    20: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    23: ldc             "com.facebook.react.ReactRootView"
        //    25: invokestatic    kotlin/jvm/internal/Intrinsics.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    28: ifeq            45
        //    31: new             Ljava/lang/ref/WeakReference;
        //    34: dup            
        //    35: aload_0        
        //    36: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //    39: putstatic       C1/f.c:Ljava/lang/ref/WeakReference;
        //    42: goto            45
        //    45: new             Lorg/json/JSONObject;
        //    48: dup            
        //    49: invokespecial   org/json/JSONObject.<init>:()V
        //    52: astore          4
        //    54: aload_0        
        //    55: aload           4
        //    57: invokestatic    C1/f.s:(Landroid/view/View;Lorg/json/JSONObject;)V
        //    60: new             Lorg/json/JSONArray;
        //    63: dup            
        //    64: invokespecial   org/json/JSONArray.<init>:()V
        //    67: astore          5
        //    69: aload_0        
        //    70: invokestatic    C1/f.b:(Landroid/view/View;)Ljava/util/List;
        //    73: astore_0       
        //    74: aload_0        
        //    75: invokeinterface java/util/List.size:()I
        //    80: iconst_1       
        //    81: isub           
        //    82: istore_3       
        //    83: iload_3        
        //    84: iflt            120
        //    87: iconst_0       
        //    88: istore_1       
        //    89: iload_1        
        //    90: iconst_1       
        //    91: iadd           
        //    92: istore_2       
        //    93: aload           5
        //    95: aload_0        
        //    96: iload_1        
        //    97: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   102: checkcast       Landroid/view/View;
        //   105: invokestatic    C1/f.d:(Landroid/view/View;)Lorg/json/JSONObject;
        //   108: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   111: pop            
        //   112: iload_2        
        //   113: iload_3        
        //   114: if_icmple       158
        //   117: goto            120
        //   120: aload           4
        //   122: ldc             "childviews"
        //   124: aload           5
        //   126: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   129: pop            
        //   130: aload           4
        //   132: areturn        
        //   133: getstatic       C1/f.b:Ljava/lang/String;
        //   136: ldc             "Failed to create JSONObject for view."
        //   138: aload_0        
        //   139: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   142: pop            
        //   143: aload           4
        //   145: areturn        
        //   146: aload_0        
        //   147: ldc             LC1/f;.class
        //   149: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   152: aconst_null    
        //   153: areturn        
        //   154: astore_0       
        //   155: goto            146
        //   158: iload_2        
        //   159: istore_1       
        //   160: goto            89
        //   163: astore_0       
        //   164: goto            133
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  10     42     154    158    Any
        //  45     54     154    158    Any
        //  54     83     163    146    Lorg/json/JSONException;
        //  54     83     154    158    Any
        //  93     112    163    146    Lorg/json/JSONException;
        //  93     112    154    158    Any
        //  120    130    163    146    Lorg/json/JSONException;
        //  120    130    154    158    Any
        //  133    143    154    158    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0089:
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
    
    public static final View$OnClickListener g(final View obj) {
        if (T1.a.d(f.class)) {
            return null;
        }
        while (true) {
            try {
                final Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                try {
                    final Object value = declaredField.get(obj);
                    if (value == null) {
                        return null;
                    }
                    final Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    if (declaredField2 == null) {
                        return null;
                    }
                    declaredField2.setAccessible(true);
                    final Object value2 = declaredField2.get(value);
                    if (value2 != null) {
                        return (View$OnClickListener)value2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
                    final Throwable t;
                    T1.a.b(t, f.class);
                    return null;
                }
                catch (ClassNotFoundException ex) {
                    return null;
                }
            }
            catch (NoSuchFieldException ex2) {}
            catch (ClassNotFoundException ex3) {}
            catch (IllegalAccessException ex4) {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public static final View$OnTouchListener h(final View obj) {
        if (T1.a.d(f.class)) {
            return null;
        }
        while (true) {
            try {
                try {
                    final Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                    final Object value = declaredField.get(obj);
                    if (value == null) {
                        return null;
                    }
                    final Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                    if (declaredField2 == null) {
                        return null;
                    }
                    declaredField2.setAccessible(true);
                    final Object value2 = declaredField2.get(value);
                    if (value2 != null) {
                        return (View$OnTouchListener)value2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                    final Throwable t;
                    T1.a.b(t, f.class);
                    return null;
                    final P a = P.a;
                    final IllegalAccessException ex;
                    P.i0(f.b, ex);
                    return null;
                }
                finally {}
            }
            catch (IllegalAccessException ex3) {}
            catch (ClassNotFoundException ex4) {}
            catch (NoSuchFieldException ex2) {}
            final NoSuchFieldException ex2;
            final IllegalAccessException ex = (IllegalAccessException)ex2;
            continue;
        }
    }
    
    public static final String i(final View view) {
        if (T1.a.d(f.class)) {
            return null;
        }
        while (true) {
            try {
                CharSequence hint = null;
                Label_0047: {
                    Object o;
                    if (view instanceof EditText) {
                        o = view;
                    }
                    else {
                        if (!(view instanceof TextView)) {
                            hint = null;
                            break Label_0047;
                        }
                        o = view;
                    }
                    hint = ((TextView)o).getHint();
                }
                if (hint == null) {
                    return "";
                }
                final String string = hint.toString();
                if (string == null) {
                    return "";
                }
                return string;
                final Throwable t;
                T1.a.b(t, f.class);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final ViewGroup j(final View view) {
        if (T1.a.d(f.class)) {
            return null;
        }
        if (view == null) {
            return null;
        }
        Label_0041: {
            try {
                final ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup)parent;
                }
            }
            finally {
                break Label_0041;
            }
            return null;
        }
        final Throwable t;
        T1.a.b(t, f.class);
        return null;
    }
    
    public static final String k(View view) {
        if (T1.a.d(f.class)) {
            return null;
        }
    Label_0359_Outer:
        while (true) {
            while (true) {
                int n2 = 0;
            Label_0359:
                while (true) {
                    int childCount = 0;
                Label_0410:
                    while (true) {
                        Label_0403: {
                            while (true) {
                                try {
                                    CharSequence charSequence = null;
                                    Label_0362: {
                                        if (view instanceof TextView) {
                                            charSequence = ((TextView)view).getText();
                                            if (view instanceof Switch) {
                                                if (!((CompoundButton)view).isChecked()) {
                                                    break Label_0403;
                                                }
                                                final String s = "1";
                                                charSequence = s;
                                            }
                                        }
                                        else {
                                            if (!(view instanceof Spinner)) {
                                                final boolean b = view instanceof DatePicker;
                                                final int n = 0;
                                                if (b) {
                                                    final int year = ((DatePicker)view).getYear();
                                                    n2 = ((DatePicker)view).getMonth();
                                                    final int i = ((DatePicker)view).getDayOfMonth();
                                                    final x a = x.a;
                                                    charSequence = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[] { year, n2, i }, 3));
                                                }
                                                else if (view instanceof TimePicker) {
                                                    final Integer currentHour = ((TimePicker)view).getCurrentHour();
                                                    Intrinsics.checkNotNullExpressionValue(currentHour, "view.currentHour");
                                                    final int intValue = currentHour.intValue();
                                                    final Integer currentMinute = ((TimePicker)view).getCurrentMinute();
                                                    Intrinsics.checkNotNullExpressionValue(currentMinute, "view.currentMinute");
                                                    n2 = currentMinute.intValue();
                                                    final x a2 = x.a;
                                                    charSequence = String.format("%02d:%02d", Arrays.copyOf(new Object[] { intValue, n2 }, 2));
                                                }
                                                else if (view instanceof RadioGroup) {
                                                    final int i = ((RadioGroup)view).getCheckedRadioButtonId();
                                                    childCount = ((ViewGroup)view).getChildCount();
                                                    if (childCount <= 0) {
                                                        break Label_0359;
                                                    }
                                                    n2 = n + 1;
                                                    final View child = ((ViewGroup)view).getChildAt(n);
                                                    if (child.getId() == i && child instanceof RadioButton) {
                                                        charSequence = ((TextView)child).getText();
                                                        break Label_0362;
                                                    }
                                                    break Label_0410;
                                                }
                                                else {
                                                    if (view instanceof RatingBar) {
                                                        charSequence = String.valueOf(((RatingBar)view).getRating());
                                                        break Label_0362;
                                                    }
                                                    break Label_0359;
                                                }
                                                Intrinsics.checkNotNullExpressionValue(charSequence, "java.lang.String.format(format, *args)");
                                                break Label_0362;
                                            }
                                            if (((AdapterView)view).getCount() > 0) {
                                                final Object selectedItem = ((AdapterView)view).getSelectedItem();
                                                if (selectedItem != null) {
                                                    charSequence = selectedItem.toString();
                                                    break Label_0362;
                                                }
                                            }
                                            charSequence = null;
                                        }
                                    }
                                    if (charSequence == null) {
                                        return "";
                                    }
                                    final String string = charSequence.toString();
                                    if (string == null) {
                                        return "";
                                    }
                                    return string;
                                    T1.a.b((Throwable)view, f.class);
                                    return null;
                                }
                                finally {}
                                final View view2;
                                view = view2;
                                continue;
                            }
                        }
                        final String s = "0";
                        continue Label_0359_Outer;
                    }
                    if (n2 >= childCount) {
                        continue Label_0359;
                    }
                    break;
                }
                final int n = n2;
                continue;
            }
        }
    }
    
    public static final boolean o(final View view) {
        final boolean d = T1.a.d(f.class);
        final boolean b = false;
        if (d) {
            return false;
        }
        while (true) {
            try {
                final ViewParent parent = view.getParent();
                if (parent instanceof AdapterView) {
                    return true;
                }
                final f a = f.a;
                final Class f = a.f("android.support.v4.view.NestedScrollingChild");
                if (f != null && f.isInstance(parent)) {
                    return true;
                }
                final Class f2 = a.f("androidx.core.view.NestedScrollingChild");
                boolean b2 = b;
                if (f2 != null) {
                    final boolean instance = f2.isInstance(parent);
                    b2 = b;
                    if (instance) {
                        b2 = true;
                    }
                }
                return b2;
                final Throwable t;
                T1.a.b(t, f.class);
                return false;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final void r(final View p0, final View$OnClickListener p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     5: ifeq            9
        //     8: return         
        //     9: aload_0        
        //    10: ldc             "view"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aconst_null    
        //    16: astore          4
        //    18: ldc             "android.view.View"
        //    20: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    23: ldc             "mListenerInfo"
        //    25: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    28: astore_2       
        //    29: ldc             "android.view.View$ListenerInfo"
        //    31: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    34: ldc             "mOnClickListener"
        //    36: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    39: astore_3       
        //    40: goto            51
        //    43: astore_0       
        //    44: goto            106
        //    47: aconst_null    
        //    48: astore_2       
        //    49: aconst_null    
        //    50: astore_3       
        //    51: aload_2        
        //    52: ifnull          100
        //    55: aload_3        
        //    56: ifnonnull       62
        //    59: goto            100
        //    62: aload_2        
        //    63: iconst_1       
        //    64: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //    67: aload_3        
        //    68: iconst_1       
        //    69: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //    72: aload_2        
        //    73: iconst_1       
        //    74: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //    77: aload_2        
        //    78: aload_0        
        //    79: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    82: astore_2       
        //    83: aload_2        
        //    84: ifnonnull       93
        //    87: aload_0        
        //    88: aload_1        
        //    89: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    92: return         
        //    93: aload_3        
        //    94: aload_2        
        //    95: aload_1        
        //    96: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    99: return         
        //   100: aload_0        
        //   101: aload_1        
        //   102: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   105: return         
        //   106: aload_0        
        //   107: ldc             LC1/f;.class
        //   109: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   112: return         
        //   113: astore_2       
        //   114: goto            47
        //   117: astore_0       
        //   118: return         
        //   119: astore_3       
        //   120: goto            49
        //   123: astore_2       
        //   124: aload           4
        //   126: astore_2       
        //   127: goto            83
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  9      15     43     47     Any
        //  18     29     113    49     Ljava/lang/ClassNotFoundException;
        //  18     29     113    49     Ljava/lang/NoSuchFieldException;
        //  18     29     117    119    Ljava/lang/Exception;
        //  18     29     43     47     Any
        //  29     40     119    123    Ljava/lang/ClassNotFoundException;
        //  29     40     119    123    Ljava/lang/NoSuchFieldException;
        //  29     40     117    119    Ljava/lang/Exception;
        //  29     40     43     47     Any
        //  62     72     117    119    Ljava/lang/Exception;
        //  62     72     43     47     Any
        //  72     83     123    130    Ljava/lang/IllegalAccessException;
        //  72     83     117    119    Ljava/lang/Exception;
        //  72     83     43     47     Any
        //  87     92     117    119    Ljava/lang/Exception;
        //  87     92     43     47     Any
        //  93     99     117    119    Ljava/lang/Exception;
        //  93     99     43     47     Any
        //  100    105    117    119    Ljava/lang/Exception;
        //  100    105    43     47     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 73 out of bounds for length 73
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
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
    
    public static final void s(final View p0, final JSONObject p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     5: ifeq            9
        //     8: return         
        //     9: aload_0        
        //    10: ldc             "view"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_1        
        //    16: ldc_w           "json"
        //    19: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    22: aload_0        
        //    23: invokestatic    C1/f.k:(Landroid/view/View;)Ljava/lang/String;
        //    26: astore_3       
        //    27: aload_0        
        //    28: invokestatic    C1/f.i:(Landroid/view/View;)Ljava/lang/String;
        //    31: astore          4
        //    33: aload_0        
        //    34: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //    37: astore          5
        //    39: aload_0        
        //    40: invokevirtual   android/view/View.getContentDescription:()Ljava/lang/CharSequence;
        //    43: astore          6
        //    45: aload_1        
        //    46: ldc_w           "classname"
        //    49: aload_0        
        //    50: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    53: invokevirtual   java/lang/Class.getCanonicalName:()Ljava/lang/String;
        //    56: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //    59: pop            
        //    60: aload_1        
        //    61: ldc_w           "classtypebitmask"
        //    64: aload_0        
        //    65: invokestatic    C1/f.c:(Landroid/view/View;)I
        //    68: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //    71: pop            
        //    72: aload_1        
        //    73: ldc_w           "id"
        //    76: aload_0        
        //    77: invokevirtual   android/view/View.getId:()I
        //    80: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
        //    83: pop            
        //    84: aload_0        
        //    85: invokestatic    C1/d.g:(Landroid/view/View;)Z
        //    88: istore_2       
        //    89: iload_2        
        //    90: ifne            113
        //    93: aload_1        
        //    94: ldc_w           "text"
        //    97: aload_3        
        //    98: invokestatic    O1/P.F0:(Ljava/lang/String;)Ljava/lang/String;
        //   101: ldc             ""
        //   103: invokestatic    O1/P.k:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   106: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   109: pop            
        //   110: goto            132
        //   113: aload_1        
        //   114: ldc_w           "text"
        //   117: ldc             ""
        //   119: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   122: pop            
        //   123: aload_1        
        //   124: ldc_w           "is_user_input"
        //   127: iconst_1       
        //   128: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Z)Lorg/json/JSONObject;
        //   131: pop            
        //   132: aload_1        
        //   133: ldc_w           "hint"
        //   136: aload           4
        //   138: invokestatic    O1/P.F0:(Ljava/lang/String;)Ljava/lang/String;
        //   141: ldc             ""
        //   143: invokestatic    O1/P.k:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   146: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   149: pop            
        //   150: aload           5
        //   152: ifnull          176
        //   155: aload_1        
        //   156: ldc_w           "tag"
        //   159: aload           5
        //   161: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   164: invokestatic    O1/P.F0:(Ljava/lang/String;)Ljava/lang/String;
        //   167: ldc             ""
        //   169: invokestatic    O1/P.k:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   172: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   175: pop            
        //   176: aload           6
        //   178: ifnull          202
        //   181: aload_1        
        //   182: ldc_w           "description"
        //   185: aload           6
        //   187: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   190: invokestatic    O1/P.F0:(Ljava/lang/String;)Ljava/lang/String;
        //   193: ldc             ""
        //   195: invokestatic    O1/P.k:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   198: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   201: pop            
        //   202: aload_1        
        //   203: ldc_w           "dimension"
        //   206: getstatic       C1/f.a:LC1/f;
        //   209: aload_0        
        //   210: invokevirtual   C1/f.e:(Landroid/view/View;)Lorg/json/JSONObject;
        //   213: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   216: pop            
        //   217: return         
        //   218: getstatic       O1/P.a:LO1/P;
        //   221: astore_0       
        //   222: getstatic       C1/f.b:Ljava/lang/String;
        //   225: aload_1        
        //   226: invokestatic    O1/P.i0:(Ljava/lang/String;Ljava/lang/Exception;)V
        //   229: return         
        //   230: aload_0        
        //   231: ldc             LC1/f;.class
        //   233: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   236: return         
        //   237: astore_0       
        //   238: goto            230
        //   241: astore_1       
        //   242: goto            218
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  9      22     237    241    Any
        //  22     89     241    230    Lorg/json/JSONException;
        //  22     89     237    241    Any
        //  93     110    241    230    Lorg/json/JSONException;
        //  93     110    237    241    Any
        //  113    132    241    230    Lorg/json/JSONException;
        //  113    132    237    241    Any
        //  132    150    241    230    Lorg/json/JSONException;
        //  132    150    237    241    Any
        //  155    176    241    230    Lorg/json/JSONException;
        //  155    176    237    241    Any
        //  181    202    241    230    Lorg/json/JSONException;
        //  181    202    237    241    Any
        //  202    217    241    230    Lorg/json/JSONException;
        //  202    217    237    241    Any
        //  218    229    237    241    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0113:
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
    
    public final JSONObject e(final View view) {
        if (T1.a.d(this)) {
            return null;
        }
        Object o = null;
        Label_0121: {
            JSONObject jsonObject;
            try {
                final JSONObject jsonObject2;
                jsonObject = (jsonObject2 = new JSONObject());
                final String s = "top";
                final View view2 = view;
                final int n = view2.getTop();
                jsonObject2.put(s, n);
                final JSONObject jsonObject3 = jsonObject;
                final String s2 = "left";
                final View view3 = view;
                final int n2 = view3.getLeft();
                jsonObject3.put(s2, n2);
                final JSONObject jsonObject4 = jsonObject;
                final String s3 = "width";
                final View view4 = view;
                final int n3 = view4.getWidth();
                jsonObject4.put(s3, n3);
                final JSONObject jsonObject5 = jsonObject;
                final String s4 = "height";
                final View view5 = view;
                final int n4 = view5.getHeight();
                jsonObject5.put(s4, n4);
                final JSONObject jsonObject6 = jsonObject;
                final String s5 = "scrollx";
                final View view6 = view;
                final int n5 = view6.getScrollX();
                jsonObject6.put(s5, n5);
                final JSONObject jsonObject7 = jsonObject;
                final String s6 = "scrolly";
                final View view7 = view;
                final int n6 = view7.getScrollY();
                jsonObject7.put(s6, n6);
                final JSONObject jsonObject8 = jsonObject;
                final String s7 = "visibility";
                final View view8 = view;
                final int n7 = view8.getVisibility();
                jsonObject8.put(s7, n7);
                return jsonObject;
            }
            finally {
                final Object o2;
                o = o2;
                break Label_0121;
            }
            try {
                final JSONObject jsonObject2 = jsonObject;
                final String s = "top";
                final View view2 = view;
                final int n = view2.getTop();
                jsonObject2.put(s, n);
                final JSONObject jsonObject3 = jsonObject;
                final String s2 = "left";
                final View view3 = view;
                final int n2 = view3.getLeft();
                jsonObject3.put(s2, n2);
                final JSONObject jsonObject4 = jsonObject;
                final String s3 = "width";
                final View view4 = view;
                final int n3 = view4.getWidth();
                jsonObject4.put(s3, n3);
                final JSONObject jsonObject5 = jsonObject;
                final String s4 = "height";
                final View view5 = view;
                final int n4 = view5.getHeight();
                jsonObject5.put(s4, n4);
                final JSONObject jsonObject6 = jsonObject;
                final String s5 = "scrollx";
                final View view6 = view;
                final int n5 = view6.getScrollX();
                jsonObject6.put(s5, n5);
                final JSONObject jsonObject7 = jsonObject;
                final String s6 = "scrolly";
                final View view7 = view;
                final int n6 = view7.getScrollY();
                jsonObject7.put(s6, n6);
                final JSONObject jsonObject8 = jsonObject;
                final String s7 = "visibility";
                final View view8 = view;
                final int n7 = view8.getVisibility();
                jsonObject8.put(s7, n7);
                return jsonObject;
            }
            catch (JSONException ex) {
                Log.e(f.b, "Failed to create JSONObject for dimension.", (Throwable)ex);
                return jsonObject;
            }
        }
        T1.a.b((Throwable)o, this);
        return null;
    }
    
    public final Class f(final String className) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return Class.forName(className);
        }
        catch (ClassNotFoundException ex) {
            return null;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final View l(final float[] p0, final View p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            9
        //     7: aconst_null    
        //     8: areturn        
        //     9: aload_0        
        //    10: invokevirtual   C1/f.n:()V
        //    13: getstatic       C1/f.d:Ljava/lang/reflect/Method;
        //    16: astore_3       
        //    17: aload_3        
        //    18: ifnull          141
        //    21: aload_2        
        //    22: ifnonnull       27
        //    25: aconst_null    
        //    26: areturn        
        //    27: aload_3        
        //    28: ifnull          101
        //    31: aload_3        
        //    32: aconst_null    
        //    33: iconst_2       
        //    34: anewarray       Ljava/lang/Object;
        //    37: dup            
        //    38: iconst_0       
        //    39: aload_1        
        //    40: aastore        
        //    41: dup            
        //    42: iconst_1       
        //    43: aload_2        
        //    44: aastore        
        //    45: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    48: astore_1       
        //    49: aload_1        
        //    50: ifnull          90
        //    53: aload_1        
        //    54: checkcast       Landroid/view/View;
        //    57: astore_1       
        //    58: aload_1        
        //    59: invokevirtual   android/view/View.getId:()I
        //    62: ifle            141
        //    65: aload_1        
        //    66: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //    69: astore_1       
        //    70: aload_1        
        //    71: ifnull          79
        //    74: aload_1        
        //    75: checkcast       Landroid/view/View;
        //    78: areturn        
        //    79: new             Ljava/lang/NullPointerException;
        //    82: dup            
        //    83: ldc_w           "null cannot be cast to non-null type android.view.View"
        //    86: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    89: athrow         
        //    90: new             Ljava/lang/NullPointerException;
        //    93: dup            
        //    94: ldc_w           "null cannot be cast to non-null type android.view.View"
        //    97: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   100: athrow         
        //   101: new             Ljava/lang/IllegalStateException;
        //   104: dup            
        //   105: ldc_w           "Required value was null."
        //   108: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   111: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   114: athrow         
        //   115: getstatic       O1/P.a:LO1/P;
        //   118: astore_2       
        //   119: getstatic       C1/f.b:Ljava/lang/String;
        //   122: astore_2       
        //   123: aload_2        
        //   124: aload_1        
        //   125: invokestatic    O1/P.i0:(Ljava/lang/String;Ljava/lang/Exception;)V
        //   128: aconst_null    
        //   129: areturn        
        //   130: getstatic       O1/P.a:LO1/P;
        //   133: astore_2       
        //   134: getstatic       C1/f.b:Ljava/lang/String;
        //   137: astore_2       
        //   138: goto            123
        //   141: aconst_null    
        //   142: areturn        
        //   143: aload_1        
        //   144: aload_0        
        //   145: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   148: aconst_null    
        //   149: areturn        
        //   150: astore_1       
        //   151: goto            143
        //   154: astore_1       
        //   155: goto            115
        //   158: astore_1       
        //   159: goto            130
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  9      17     150    154    Any
        //  31     49     158    141    Ljava/lang/IllegalAccessException;
        //  31     49     154    123    Ljava/lang/reflect/InvocationTargetException;
        //  31     49     150    154    Any
        //  53     70     158    141    Ljava/lang/IllegalAccessException;
        //  53     70     154    123    Ljava/lang/reflect/InvocationTargetException;
        //  53     70     150    154    Any
        //  74     79     158    141    Ljava/lang/IllegalAccessException;
        //  74     79     154    123    Ljava/lang/reflect/InvocationTargetException;
        //  74     79     150    154    Any
        //  79     90     158    141    Ljava/lang/IllegalAccessException;
        //  79     90     154    123    Ljava/lang/reflect/InvocationTargetException;
        //  79     90     150    154    Any
        //  90     101    158    141    Ljava/lang/IllegalAccessException;
        //  90     101    154    123    Ljava/lang/reflect/InvocationTargetException;
        //  90     101    150    154    Any
        //  101    115    158    141    Ljava/lang/IllegalAccessException;
        //  101    115    154    123    Ljava/lang/reflect/InvocationTargetException;
        //  101    115    150    154    Any
        //  115    123    150    154    Any
        //  123    128    150    154    Any
        //  130    138    150    154    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0079:
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
    
    public final float[] m(final View view) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            final int[] array = new int[2];
            view.getLocationOnScreen(array);
            return new float[] { (float)array[0], (float)array[1] };
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final void n() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            8
        //     7: return         
        //     8: getstatic       C1/f.d:Ljava/lang/reflect/Method;
        //    11: astore_1       
        //    12: aload_1        
        //    13: ifnull          17
        //    16: return         
        //    17: ldc_w           "com.facebook.react.uimanager.TouchTargetHelper"
        //    20: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    23: ldc_w           "findTouchTargetView"
        //    26: iconst_2       
        //    27: anewarray       Ljava/lang/Class;
        //    30: dup            
        //    31: iconst_0       
        //    32: ldc_w           [F.class
        //    35: aastore        
        //    36: dup            
        //    37: iconst_1       
        //    38: ldc             Landroid/view/ViewGroup;.class
        //    40: aastore        
        //    41: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    44: astore_1       
        //    45: aload_1        
        //    46: putstatic       C1/f.d:Ljava/lang/reflect/Method;
        //    49: aload_1        
        //    50: ifnull          59
        //    53: aload_1        
        //    54: iconst_1       
        //    55: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //    58: return         
        //    59: new             Ljava/lang/IllegalStateException;
        //    62: dup            
        //    63: ldc_w           "Required value was null."
        //    66: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    69: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    72: athrow         
        //    73: getstatic       O1/P.a:LO1/P;
        //    76: astore_2       
        //    77: getstatic       C1/f.b:Ljava/lang/String;
        //    80: astore_2       
        //    81: aload_2        
        //    82: aload_1        
        //    83: invokestatic    O1/P.i0:(Ljava/lang/String;Ljava/lang/Exception;)V
        //    86: return         
        //    87: getstatic       O1/P.a:LO1/P;
        //    90: astore_2       
        //    91: getstatic       C1/f.b:Ljava/lang/String;
        //    94: astore_2       
        //    95: goto            81
        //    98: aload_1        
        //    99: aload_0        
        //   100: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   103: return         
        //   104: astore_1       
        //   105: goto            98
        //   108: astore_1       
        //   109: goto            73
        //   112: astore_1       
        //   113: goto            87
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  8      12     104    108    Any
        //  17     49     112    98     Ljava/lang/ClassNotFoundException;
        //  17     49     108    81     Ljava/lang/NoSuchMethodException;
        //  17     49     104    108    Any
        //  53     58     112    98     Ljava/lang/ClassNotFoundException;
        //  53     58     108    81     Ljava/lang/NoSuchMethodException;
        //  53     58     104    108    Any
        //  59     73     112    98     Ljava/lang/ClassNotFoundException;
        //  59     73     108    81     Ljava/lang/NoSuchMethodException;
        //  59     73     104    108    Any
        //  73     81     104    108    Any
        //  81     86     104    108    Any
        //  87     95     104    108    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0017:
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
    
    public final boolean p(final View view, View l) {
        if (T1.a.d(this)) {
            return false;
        }
        Label_0071: {
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                if (Intrinsics.a(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
                    l = this.l(this.m(view), l);
                    if (l != null && l.getId() == view.getId()) {
                        return true;
                    }
                }
            }
            finally {
                break Label_0071;
            }
            return false;
        }
        final Throwable t;
        T1.a.b(t, this);
        return false;
    }
    
    public final boolean q(final View view) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return Intrinsics.a(view.getClass().getName(), "com.facebook.react.ReactRootView");
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return false;
        }
    }
}
