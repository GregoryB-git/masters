// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L;

import android.view.MenuItem;
import android.view.ActionMode;
import android.view.Menu;
import android.text.Editable;
import java.util.Iterator;
import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import java.lang.reflect.Method;
import android.text.PrecomputedText$Params;
import android.icu.text.DecimalFormatSymbols;
import java.util.Locale;
import android.graphics.drawable.Drawable;
import android.view.ActionMode$Callback;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.PorterDuff$Mode;
import H.e;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.TextPaint;
import G.l;
import android.view.View;
import android.os.Build$VERSION;
import android.text.method.PasswordTransformationMethod;
import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;

public abstract class h
{
    public static int a(final TextView textView) {
        return ((View)textView).getPaddingTop() - ((Paint)textView.getPaint()).getFontMetricsInt().top;
    }
    
    public static int b(final TextView textView) {
        return ((View)textView).getPaddingBottom() + ((Paint)textView.getPaint()).getFontMetricsInt().bottom;
    }
    
    public static int c(final TextDirectionHeuristic textDirectionHeuristic) {
        final TextDirectionHeuristic firststrong_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == firststrong_RTL) {
            return 1;
        }
        final TextDirectionHeuristic firststrong_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (textDirectionHeuristic == firststrong_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == firststrong_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == firststrong_RTL) {
            return 7;
        }
        return 1;
    }
    
    public static TextDirectionHeuristic d(final TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = true;
        if (sdk_INT >= 28 && (textView.getInputType() & 0xF) == 0x3) {
            final byte directionality = Character.getDirectionality(e.a(d.a(h.b.d(textView)))[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        else {
            if (h.b.b((View)textView) != 1) {
                b = false;
            }
            switch (h.b.c((View)textView)) {
                default: {
                    if (b) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                }
                case 7: {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                case 6: {
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                }
                case 5: {
                    return TextDirectionHeuristics.LOCALE;
                }
                case 4: {
                    return TextDirectionHeuristics.RTL;
                }
                case 3: {
                    return TextDirectionHeuristics.LTR;
                }
                case 2: {
                    return TextDirectionHeuristics.ANYRTL_LTR;
                }
            }
        }
    }
    
    public static l.a e(final TextView textView) {
        if (Build$VERSION.SDK_INT >= 28) {
            return new l.a(e.b(textView));
        }
        final l.a.a a = new l.a.a(new TextPaint((Paint)textView.getPaint()));
        a.b(c.a(textView));
        a.c(c.d(textView));
        a.d(d(textView));
        return a.a();
    }
    
    public static void f(final TextView textView, final ColorStateList supportCompoundDrawablesTintList) {
        H.e.b(textView);
        if (Build$VERSION.SDK_INT >= 24) {
            c.f(textView, supportCompoundDrawablesTintList);
            return;
        }
        if (textView instanceof i) {
            ((i)textView).setSupportCompoundDrawablesTintList(supportCompoundDrawablesTintList);
        }
    }
    
    public static void g(final TextView textView, final PorterDuff$Mode supportCompoundDrawablesTintMode) {
        H.e.b(textView);
        if (Build$VERSION.SDK_INT >= 24) {
            c.g(textView, supportCompoundDrawablesTintMode);
            return;
        }
        if (textView instanceof i) {
            ((i)textView).setSupportCompoundDrawablesTintMode(supportCompoundDrawablesTintMode);
        }
    }
    
    public static void h(final TextView textView, final int n) {
        H.e.a(n);
        if (Build$VERSION.SDK_INT >= 28) {
            e.c(textView, n);
            return;
        }
        final Paint$FontMetricsInt fontMetricsInt = ((Paint)textView.getPaint()).getFontMetricsInt();
        int a;
        if (h.a.a(textView)) {
            a = fontMetricsInt.top;
        }
        else {
            a = fontMetricsInt.ascent;
        }
        if (n > Math.abs(a)) {
            textView.setPadding(((View)textView).getPaddingLeft(), n + a, ((View)textView).getPaddingRight(), ((View)textView).getPaddingBottom());
        }
    }
    
    public static void i(final TextView textView, final int n) {
        H.e.a(n);
        final Paint$FontMetricsInt fontMetricsInt = ((Paint)textView.getPaint()).getFontMetricsInt();
        int a;
        if (h.a.a(textView)) {
            a = fontMetricsInt.bottom;
        }
        else {
            a = fontMetricsInt.descent;
        }
        if (n > Math.abs(a)) {
            textView.setPadding(((View)textView).getPaddingLeft(), ((View)textView).getPaddingTop(), ((View)textView).getPaddingRight(), n - a);
        }
    }
    
    public static void j(final TextView textView, final int n) {
        H.e.a(n);
        final int fontMetricsInt = ((Paint)textView.getPaint()).getFontMetricsInt((Paint$FontMetricsInt)null);
        if (n != fontMetricsInt) {
            textView.setLineSpacing((float)(n - fontMetricsInt), 1.0f);
        }
    }
    
    public static void k(final TextView textView, final l l) {
        if (Build$VERSION.SDK_INT >= 29) {
            throw null;
        }
        e(textView);
        throw null;
    }
    
    public static void l(final TextView textView, final l.a a) {
        b.h((View)textView, c(a.d()));
        textView.getPaint().set(a.e());
        c.e(textView, a.b());
        c.h(textView, a.c());
    }
    
    public static ActionMode$Callback m(final TextView textView, final ActionMode$Callback actionMode$Callback) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 26 || sdk_INT > 27 || actionMode$Callback instanceof f) {
            return actionMode$Callback;
        }
        if (actionMode$Callback == null) {
            return actionMode$Callback;
        }
        return (ActionMode$Callback)new f(actionMode$Callback, textView);
    }
    
    public abstract static class a
    {
        public static boolean a(final TextView textView) {
            return textView.getIncludeFontPadding();
        }
        
        public static int b(final TextView textView) {
            return textView.getMaxLines();
        }
        
        public static int c(final TextView textView) {
            return textView.getMinLines();
        }
    }
    
    public abstract static class b
    {
        public static Drawable[] a(final TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
        
        public static int b(final View view) {
            return view.getLayoutDirection();
        }
        
        public static int c(final View view) {
            return view.getTextDirection();
        }
        
        public static Locale d(final TextView textView) {
            return textView.getTextLocale();
        }
        
        public static void e(final TextView textView, final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }
        
        public static void f(final TextView textView, final int n, final int n2, final int n3, final int n4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(n, n2, n3, n4);
        }
        
        public static void g(final TextView textView, final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
        
        public static void h(final View view, final int textDirection) {
            view.setTextDirection(textDirection);
        }
    }
    
    public abstract static class c
    {
        public static int a(final TextView textView) {
            return textView.getBreakStrategy();
        }
        
        public static ColorStateList b(final TextView textView) {
            return textView.getCompoundDrawableTintList();
        }
        
        public static PorterDuff$Mode c(final TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }
        
        public static int d(final TextView textView) {
            return textView.getHyphenationFrequency();
        }
        
        public static void e(final TextView textView, final int breakStrategy) {
            textView.setBreakStrategy(breakStrategy);
        }
        
        public static void f(final TextView textView, final ColorStateList compoundDrawableTintList) {
            textView.setCompoundDrawableTintList(compoundDrawableTintList);
        }
        
        public static void g(final TextView textView, final PorterDuff$Mode compoundDrawableTintMode) {
            textView.setCompoundDrawableTintMode(compoundDrawableTintMode);
        }
        
        public static void h(final TextView textView, final int hyphenationFrequency) {
            textView.setHyphenationFrequency(hyphenationFrequency);
        }
    }
    
    public abstract static class d
    {
        public static DecimalFormatSymbols a(final Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }
    
    public abstract static class e
    {
        public static String[] a(final DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }
        
        public static PrecomputedText$Params b(final TextView textView) {
            return textView.getTextMetricsParams();
        }
        
        public static void c(final TextView textView, final int firstBaselineToTopHeight) {
            textView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
        }
    }
    
    public static class f implements ActionMode$Callback
    {
        public final ActionMode$Callback a;
        public final TextView b;
        public Class c;
        public Method d;
        public boolean e;
        public boolean f;
        
        public f(final ActionMode$Callback a, final TextView b) {
            this.a = a;
            this.b = b;
            this.f = false;
        }
        
        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
        
        public final Intent b(final ResolveInfo resolveInfo, final TextView textView) {
            final Intent putExtra = this.a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", this.d(textView) ^ true);
            final ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }
        
        public final List c(final Context context, final PackageManager packageManager) {
            final ArrayList<ResolveInfo> list = new ArrayList<ResolveInfo>();
            if (!(context instanceof Activity)) {
                return list;
            }
            for (final ResolveInfo resolveInfo : packageManager.queryIntentActivities(this.a(), 0)) {
                if (this.e(resolveInfo, context)) {
                    list.add(resolveInfo);
                }
            }
            return list;
        }
        
        public final boolean d(final TextView textView) {
            return textView instanceof Editable && textView.onCheckIsTextEditor() && ((View)textView).isEnabled();
        }
        
        public final boolean e(final ResolveInfo resolveInfo, final Context context) {
            final boolean equals = context.getPackageName().equals(resolveInfo.activityInfo.packageName);
            boolean b = true;
            if (equals) {
                return true;
            }
            final ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            final String permission = activityInfo.permission;
            if (permission != null) {
                if (context.checkSelfPermission(permission) == 0) {
                    return true;
                }
                b = false;
            }
            return b;
        }
        
        public final void f(final Menu p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        L/h$f.b:Landroid/widget/TextView;
            //     4: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
            //     7: astore          5
            //     9: aload           5
            //    11: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
            //    14: astore          4
            //    16: aload_0        
            //    17: getfield        L/h$f.f:Z
            //    20: ifne            82
            //    23: aload_0        
            //    24: iconst_1       
            //    25: putfield        L/h$f.f:Z
            //    28: ldc             "com.android.internal.view.menu.MenuBuilder"
            //    30: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
            //    33: astore_3       
            //    34: aload_0        
            //    35: aload_3        
            //    36: putfield        L/h$f.c:Ljava/lang/Class;
            //    39: aload_0        
            //    40: aload_3        
            //    41: ldc             "removeItemAt"
            //    43: iconst_1       
            //    44: anewarray       Ljava/lang/Class;
            //    47: dup            
            //    48: iconst_0       
            //    49: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
            //    52: aastore        
            //    53: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    56: putfield        L/h$f.d:Ljava/lang/reflect/Method;
            //    59: aload_0        
            //    60: iconst_1       
            //    61: putfield        L/h$f.e:Z
            //    64: goto            82
            //    67: aload_0        
            //    68: aconst_null    
            //    69: putfield        L/h$f.c:Ljava/lang/Class;
            //    72: aload_0        
            //    73: aconst_null    
            //    74: putfield        L/h$f.d:Ljava/lang/reflect/Method;
            //    77: aload_0        
            //    78: iconst_0       
            //    79: putfield        L/h$f.e:Z
            //    82: aload_0        
            //    83: getfield        L/h$f.e:Z
            //    86: ifeq            108
            //    89: aload_0        
            //    90: getfield        L/h$f.c:Ljava/lang/Class;
            //    93: aload_1        
            //    94: invokevirtual   java/lang/Class.isInstance:(Ljava/lang/Object;)Z
            //    97: ifeq            108
            //   100: aload_0        
            //   101: getfield        L/h$f.d:Ljava/lang/reflect/Method;
            //   104: astore_3       
            //   105: goto            128
            //   108: aload_1        
            //   109: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //   112: ldc             "removeItemAt"
            //   114: iconst_1       
            //   115: anewarray       Ljava/lang/Class;
            //   118: dup            
            //   119: iconst_0       
            //   120: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
            //   123: aastore        
            //   124: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //   127: astore_3       
            //   128: aload_1        
            //   129: invokeinterface android/view/Menu.size:()I
            //   134: iconst_1       
            //   135: isub           
            //   136: istore_2       
            //   137: iload_2        
            //   138: iflt            202
            //   141: aload_1        
            //   142: iload_2        
            //   143: invokeinterface android/view/Menu.getItem:(I)Landroid/view/MenuItem;
            //   148: astore          6
            //   150: aload           6
            //   152: invokeinterface android/view/MenuItem.getIntent:()Landroid/content/Intent;
            //   157: ifnull          195
            //   160: ldc             "android.intent.action.PROCESS_TEXT"
            //   162: aload           6
            //   164: invokeinterface android/view/MenuItem.getIntent:()Landroid/content/Intent;
            //   169: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
            //   172: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //   175: ifeq            195
            //   178: aload_3        
            //   179: aload_1        
            //   180: iconst_1       
            //   181: anewarray       Ljava/lang/Object;
            //   184: dup            
            //   185: iconst_0       
            //   186: iload_2        
            //   187: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   190: aastore        
            //   191: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
            //   194: pop            
            //   195: iload_2        
            //   196: iconst_1       
            //   197: isub           
            //   198: istore_2       
            //   199: goto            137
            //   202: aload_0        
            //   203: aload           5
            //   205: aload           4
            //   207: invokevirtual   L/h$f.c:(Landroid/content/Context;Landroid/content/pm/PackageManager;)Ljava/util/List;
            //   210: astore_3       
            //   211: iconst_0       
            //   212: istore_2       
            //   213: iload_2        
            //   214: aload_3        
            //   215: invokeinterface java/util/List.size:()I
            //   220: if_icmpge       282
            //   223: aload_3        
            //   224: iload_2        
            //   225: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
            //   230: checkcast       Landroid/content/pm/ResolveInfo;
            //   233: astore          5
            //   235: aload_1        
            //   236: iconst_0       
            //   237: iconst_0       
            //   238: iload_2        
            //   239: bipush          100
            //   241: iadd           
            //   242: aload           5
            //   244: aload           4
            //   246: invokevirtual   android/content/pm/ResolveInfo.loadLabel:(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
            //   249: invokeinterface android/view/Menu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
            //   254: aload_0        
            //   255: aload           5
            //   257: aload_0        
            //   258: getfield        L/h$f.b:Landroid/widget/TextView;
            //   261: invokevirtual   L/h$f.b:(Landroid/content/pm/ResolveInfo;Landroid/widget/TextView;)Landroid/content/Intent;
            //   264: invokeinterface android/view/MenuItem.setIntent:(Landroid/content/Intent;)Landroid/view/MenuItem;
            //   269: iconst_1       
            //   270: invokeinterface android/view/MenuItem.setShowAsAction:(I)V
            //   275: iload_2        
            //   276: iconst_1       
            //   277: iadd           
            //   278: istore_2       
            //   279: goto            213
            //   282: return         
            //   283: astore_3       
            //   284: goto            67
            //   287: astore_1       
            //   288: return         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                         
            //  -----  -----  -----  -----  ---------------------------------------------
            //  28     64     283    82     Ljava/lang/ClassNotFoundException;
            //  28     64     283    82     Ljava/lang/NoSuchMethodException;
            //  82     105    287    289    Ljava/lang/NoSuchMethodException;
            //  82     105    287    289    Ljava/lang/IllegalAccessException;
            //  82     105    287    289    Ljava/lang/reflect/InvocationTargetException;
            //  108    128    287    289    Ljava/lang/NoSuchMethodException;
            //  108    128    287    289    Ljava/lang/IllegalAccessException;
            //  108    128    287    289    Ljava/lang/reflect/InvocationTargetException;
            //  128    137    287    289    Ljava/lang/NoSuchMethodException;
            //  128    137    287    289    Ljava/lang/IllegalAccessException;
            //  128    137    287    289    Ljava/lang/reflect/InvocationTargetException;
            //  141    195    287    289    Ljava/lang/NoSuchMethodException;
            //  141    195    287    289    Ljava/lang/IllegalAccessException;
            //  141    195    287    289    Ljava/lang/reflect/InvocationTargetException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0082:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
        
        public boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
            return this.a.onActionItemClicked(actionMode, menuItem);
        }
        
        public boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
            return this.a.onCreateActionMode(actionMode, menu);
        }
        
        public void onDestroyActionMode(final ActionMode actionMode) {
            this.a.onDestroyActionMode(actionMode);
        }
        
        public boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
            this.f(menu);
            return this.a.onPrepareActionMode(actionMode, menu);
        }
    }
}
