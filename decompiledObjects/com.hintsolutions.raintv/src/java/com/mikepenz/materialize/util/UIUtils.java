/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.WindowManager$LayoutParams
 *  androidx.annotation.AttrRes
 *  androidx.annotation.ColorRes
 *  androidx.annotation.DrawableRes
 *  androidx.core.content.ContextCompat
 *  androidx.core.view.ViewCompat
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.mikepenz.materialize.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.mikepenz.materialize.R;

@SuppressLint(value={"InlinedApi"})
public class UIUtils {
    public static int adjustAlpha(int n, int n2) {
        return n & 0xFFFFFF | n2 << 24;
    }

    public static float convertDpToPixel(float f, Context context) {
        return (float)context.getResources().getDisplayMetrics().densityDpi / 160.0f * f;
    }

    public static float convertPixelsToDp(float f, Context context) {
        return f / ((float)context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static int getActionBarHeight(Context context) {
        int n;
        int n2 = n = UIUtils.getThemeAttributeDimensionSize(context, R.attr.actionBarSize);
        if (n == 0) {
            n2 = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material);
        }
        return n2;
    }

    public static StateListDrawable getIconStateList(Drawable drawable2, Drawable drawable3) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{0x10100A1}, drawable3);
        stateListDrawable.addState(new int[0], drawable2);
        return stateListDrawable;
    }

    public static int getNavigationBarHeight(Context object) {
        Resources resources = object.getResources();
        int n = resources.getIdentifier((String)(object = object.getResources().getConfiguration().orientation == 1 ? "navigation_bar_height" : "navigation_bar_height_landscape"), "dimen", "android");
        if (n > 0) {
            return resources.getDimensionPixelSize(n);
        }
        return 0;
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static Drawable getSelectableBackground(Context context) {
        return ContextCompat.getDrawable((Context)context, (int)UIUtils.getSelectableBackgroundRes(context));
    }

    public static StateListDrawable getSelectableBackground(Context context, int n, boolean bl) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        ColorDrawable colorDrawable = new ColorDrawable(n);
        stateListDrawable.addState(new int[]{0x10100A1}, (Drawable)colorDrawable);
        colorDrawable = UIUtils.getSelectableBackground(context);
        stateListDrawable.addState(new int[0], (Drawable)colorDrawable);
        if (bl) {
            n = context.getResources().getInteger(0x10E0000);
            stateListDrawable.setEnterFadeDuration(n);
            stateListDrawable.setExitFadeDuration(n);
        }
        return stateListDrawable;
    }

    public static int getSelectableBackgroundRes(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        return typedValue.resourceId;
    }

    public static StateListDrawable getSelectablePressedBackground(Context context, int n, int n2, boolean bl) {
        context = UIUtils.getSelectableBackground(context, n, bl);
        ColorDrawable colorDrawable = new ColorDrawable(UIUtils.adjustAlpha(n, n2));
        context.addState(new int[]{16842919}, (Drawable)colorDrawable);
        return context;
    }

    public static int getStatusBarHeight(Context context) {
        return UIUtils.getStatusBarHeight(context, false);
    }

    public static int getStatusBarHeight(Context context, boolean bl) {
        int n = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        n = n > 0 ? context.getResources().getDimensionPixelSize(n) : 0;
        int n2 = context.getResources().getDimensionPixelSize(R.dimen.tool_bar_top_padding);
        if (n2 == 0 && !bl) {
            return 0;
        }
        int n3 = n;
        if (n == 0) {
            n3 = n2;
        }
        return n3;
    }

    public static int getThemeAttributeDimensionSize(Context context, @AttrRes int n) {
        Context context2 = null;
        try {
            context2 = context = context.getTheme().obtainStyledAttributes(new int[]{n});
        }
        catch (Throwable throwable) {
            if (context2 != null) {
                context2.recycle();
            }
            throw throwable;
        }
        n = context.getDimensionPixelSize(0, 0);
        context.recycle();
        return n;
    }

    public static int getThemeColor(Context context, @AttrRes int n) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true)) {
            return typedValue.data;
        }
        return 0;
    }

    public static int getThemeColorFromAttrOrRes(Context context, @AttrRes int n, @ColorRes int n2) {
        int n3;
        n = n3 = UIUtils.getThemeColor(context, n);
        if (n3 == 0) {
            n = ContextCompat.getColor((Context)context, (int)n2);
        }
        return n;
    }

    public static void setBackground(View view, @DrawableRes int n) {
        ViewCompat.setBackground((View)view, (Drawable)ContextCompat.getDrawable((Context)view.getContext(), (int)n));
    }

    @Deprecated
    @SuppressLint(value={"NewApi"})
    public static void setBackground(View view, Drawable drawable2) {
        ViewCompat.setBackground((View)view, (Drawable)drawable2);
    }

    public static void setFlag(Activity activity, int n, boolean bl) {
        activity = activity.getWindow();
        WindowManager.LayoutParams layoutParams = activity.getAttributes();
        layoutParams.flags = bl ? n | layoutParams.flags : ~n & layoutParams.flags;
        activity.setAttributes(layoutParams);
    }

    public static void setTranslucentNavigationFlag(Activity activity, boolean bl) {
        UIUtils.setFlag(activity, 0x8000000, bl);
    }

    public static void setTranslucentStatusFlag(Activity activity, boolean bl) {
        UIUtils.setFlag(activity, 0x4000000, bl);
    }
}

