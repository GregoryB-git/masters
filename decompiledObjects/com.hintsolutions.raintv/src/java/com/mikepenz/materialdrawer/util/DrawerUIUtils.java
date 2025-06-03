/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.WindowManager
 *  com.mikepenz.iconics.IconicsDrawable
 *  com.mikepenz.iconics.typeface.IIcon
 *  com.mikepenz.materialdrawer.icons.MaterialDrawerFont$Icon
 *  java.lang.Math
 *  java.lang.Object
 */
package com.mikepenz.materialdrawer.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.icons.MaterialDrawerFont;
import com.mikepenz.materialize.util.UIUtils;

@SuppressLint(value={"InlinedApi"})
public class DrawerUIUtils {
    public static StateListDrawable getDrawerItemBackground(int n) {
        ColorDrawable colorDrawable = new ColorDrawable(n);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{0x10100A1}, (Drawable)colorDrawable);
        return stateListDrawable;
    }

    public static StateListDrawable getIconStateList(Drawable drawable2, Drawable drawable3) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{0x10100A1}, drawable3);
        stateListDrawable.addState(new int[0], drawable2);
        return stateListDrawable;
    }

    public static int getOptimalDrawerWidth(Context context) {
        return Math.min((int)(UIUtils.getScreenWidth(context) - UIUtils.getActionBarHeight(context)), (int)context.getResources().getDimensionPixelSize(R.dimen.material_drawer_width));
    }

    public static Drawable getPlaceHolder(Context context) {
        return new IconicsDrawable(context, (IIcon)MaterialDrawerFont.Icon.mdf_person).colorRes(R.color.accent).backgroundColorRes(R.color.primary).sizeDp(56).paddingDp(16);
    }

    public static ColorStateList getTextColorStateList(int n, int n2) {
        return new ColorStateList((int[][])new int[][]{{0x10100A1}, new int[0]}, new int[]{n2, n});
    }

    public static boolean isSystemBarOnBottom(Context context) {
        WindowManager windowManager = (WindowManager)context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        context = context.getResources().getConfiguration();
        int n = displayMetrics.widthPixels;
        int n2 = displayMetrics.heightPixels;
        boolean bl = true;
        boolean bl2 = n != n2 && context.smallestScreenWidthDp < 600;
        boolean bl3 = bl;
        if (bl2) {
            bl3 = n < n2 ? bl : false;
        }
        return bl3;
    }

    public static void setDrawerVerticalPadding(View view) {
        int n = view.getContext().getResources().getDimensionPixelSize(R.dimen.material_drawer_vertical_padding);
        view.setPadding(n, 0, n, 0);
    }

    public static void setDrawerVerticalPadding(View view, int n) {
        int n2 = view.getContext().getResources().getDimensionPixelSize(R.dimen.material_drawer_vertical_padding);
        view.setPaddingRelative(n * n2, 0, n2, 0);
    }
}

