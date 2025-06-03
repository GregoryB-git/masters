/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.res.ColorStateList
 *  android.graphics.Paint
 *  android.graphics.Paint$FontMetricsInt
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.icu.text.DecimalFormatSymbols
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.Editable
 *  android.text.PrecomputedText
 *  android.text.PrecomputedText$Params
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.text.TextPaint
 *  android.text.method.PasswordTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Locale
 */
package L;

import G.l;
import L.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class h {
    public static int a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int c(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 1;
        }
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (textDirectionHeuristic == textDirectionHeuristic3) {
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
        if (textDirectionHeuristic == textDirectionHeuristic3) {
            return 6;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 7;
        }
        return 1;
    }

    public static TextDirectionHeuristic d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        int n8 = Build.VERSION.SDK_INT;
        byte by = 1;
        if (n8 >= 28 && (textView.getInputType() & 15) == 3) {
            by = Character.getDirectionality((int)e.a(d.a(b.d(textView)))[0].codePointAt(0));
            if (by != 1 && by != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        if (b.b((View)textView) != 1) {
            by = 0;
        }
        switch (b.c((View)textView)) {
            default: {
                if (by != 0) {
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
            case 2: 
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }

    public static l.a e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new l.a(e.b(textView));
        }
        l.a.a a8 = new l.a.a(new TextPaint((Paint)textView.getPaint()));
        a8.b(c.a(textView));
        a8.c(c.d(textView));
        a8.d(h.d(textView));
        return a8.a();
    }

    public static void f(TextView textView, ColorStateList colorStateList) {
        H.e.b((Object)textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.f(textView, colorStateList);
            return;
        }
        if (textView instanceof i) {
            ((i)textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void g(TextView textView, PorterDuff.Mode mode) {
        H.e.b((Object)textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.g(textView, mode);
            return;
        }
        if (textView instanceof i) {
            ((i)textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void h(TextView textView, int n8) {
        H.e.a(n8);
        if (Build.VERSION.SDK_INT >= 28) {
            e.c(textView, n8);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int n9 = a.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (n8 > Math.abs((int)n9)) {
            textView.setPadding(textView.getPaddingLeft(), n8 + n9, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void i(TextView textView, int n8) {
        H.e.a(n8);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int n9 = a.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (n8 > Math.abs((int)n9)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), n8 - n9);
        }
    }

    public static void j(TextView textView, int n8) {
        H.e.a(n8);
        int n9 = textView.getPaint().getFontMetricsInt(null);
        if (n8 != n9) {
            textView.setLineSpacing((float)(n8 - n9), 1.0f);
        }
    }

    public static void k(TextView textView, l l8) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        h.e(textView);
        throw null;
    }

    public static void l(TextView textView, l.a a8) {
        b.h((View)textView, h.c(a8.d()));
        textView.getPaint().set(a8.e());
        c.e(textView, a8.b());
        c.h(textView, a8.c());
    }

    public static ActionMode.Callback m(TextView textView, ActionMode.Callback callback) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 26 && n8 <= 27 && !(callback instanceof f)) {
            if (callback == null) {
                return callback;
            }
            return new f(callback, textView);
        }
        return callback;
    }

    public static abstract class a {
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    public static abstract class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static int b(View view) {
            return view.getLayoutDirection();
        }

        public static int c(View view) {
            return view.getTextDirection();
        }

        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        public static void e(TextView textView, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5) {
            textView.setCompoundDrawablesRelative(drawable2, drawable3, drawable4, drawable5);
        }

        public static void f(TextView textView, int n8, int n9, int n10, int n11) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(n8, n9, n10, n11);
        }

        public static void g(TextView textView, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        }

        public static void h(View view, int n8) {
            view.setTextDirection(n8);
        }
    }

    public static abstract class c {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int n8) {
            textView.setBreakStrategy(n8);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int n8) {
            textView.setHyphenationFrequency(n8);
        }
    }

    public static abstract class d {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance((Locale)locale);
        }
    }

    public static abstract class e {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void c(TextView textView, int n8) {
            textView.setFirstBaselineToTopHeight(n8);
        }
    }

    public static class f
    implements ActionMode.Callback {
        public final ActionMode.Callback a;
        public final TextView b;
        public Class c;
        public Method d;
        public boolean e;
        public boolean f;

        public f(ActionMode.Callback callback, TextView textView) {
            this.a = callback;
            this.b = textView;
            this.f = false;
        }

        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final Intent b(ResolveInfo resolveInfo, TextView textView) {
            textView = this.a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", this.d(textView) ^ true);
            resolveInfo = resolveInfo.activityInfo;
            return textView.setClassName(resolveInfo.packageName, resolveInfo.name);
        }

        public final List c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(this.a(), 0)) {
                if (!this.e(resolveInfo, context)) continue;
                arrayList.add((Object)resolveInfo);
            }
            return arrayList;
        }

        public final boolean d(TextView textView) {
            if (textView instanceof Editable && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                return true;
            }
            return false;
        }

        public final boolean e(ResolveInfo object, Context context) {
            boolean bl = context.getPackageName().equals((Object)object.activityInfo.packageName);
            boolean bl2 = true;
            if (bl) {
                return true;
            }
            object = object.activityInfo;
            if (!object.exported) {
                return false;
            }
            object = object.permission;
            if (object != null) {
                if (context.checkSelfPermission((String)object) == 0) {
                    return true;
                }
                bl2 = false;
            }
            return bl2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void f(Menu menu) {
            Class class_;
            Context context;
            int n8;
            PackageManager packageManager;
            block7 : {
                context = this.b.getContext();
                packageManager = context.getPackageManager();
                if (!this.f) {
                    this.f = true;
                    try {
                        this.c = class_ = Class.forName((String)"com.android.internal.view.menu.MenuBuilder");
                        this.d = class_.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                        this.e = true;
                        break block7;
                    }
                    catch (ClassNotFoundException | NoSuchMethodException classNotFoundException) {}
                    this.c = null;
                    this.d = null;
                    this.e = false;
                }
            }
            try {
                class_ = this.e && this.c.isInstance((Object)menu) ? this.d : menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException invocationTargetException) {
                return;
            }
            for (n8 = menu.size() - 1; n8 >= 0; --n8) {
                MenuItem menuItem = menu.getItem(n8);
                if (menuItem.getIntent() == null || !"android.intent.action.PROCESS_TEXT".equals((Object)menuItem.getIntent().getAction())) continue;
                class_.invoke((Object)menu, new Object[]{n8});
            }
            class_ = this.c(context, packageManager);
            n8 = 0;
            while (n8 < class_.size()) {
                context = (ResolveInfo)class_.get(n8);
                menu.add(0, 0, n8 + 100, context.loadLabel(packageManager)).setIntent(this.b((ResolveInfo)context, this.b)).setShowAsAction(1);
                ++n8;
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            this.f(menu);
            return this.a.onPrepareActionMode(actionMode, menu);
        }
    }

}

