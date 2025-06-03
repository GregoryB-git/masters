/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.os.IBinder
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  androidx.annotation.ArrayRes
 *  androidx.annotation.AttrRes
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.core.content.ContextCompat
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.afollestad.materialdialogs.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;

public class DialogUtils {
    @ColorInt
    public static int adjustAlpha(@ColorInt int n, float f2) {
        return Color.argb((int)Math.round((float)((float)Color.alpha((int)n) * f2)), (int)Color.red((int)n), (int)Color.green((int)n), (int)Color.blue((int)n));
    }

    public static ColorStateList getActionTextColorStateList(Context context, @ColorRes int n) {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(n, typedValue, true);
        int n2 = typedValue.type;
        if (n2 >= 28 && n2 <= 31) {
            return DialogUtils.getActionTextStateList(context, typedValue.data);
        }
        return context.getColorStateList(n);
    }

    public static ColorStateList getActionTextStateList(Context object, int n) {
        int n2 = DialogUtils.resolveColor(object, 16842806);
        int n3 = n;
        if (n == 0) {
            n3 = n2;
        }
        object = new int[]{-16842910};
        int[] nArray = new int[]{};
        n = DialogUtils.adjustAlpha(n3, 0.4f);
        return new ColorStateList((int[][])new int[][]{(int[])object, nArray}, new int[]{n, n3});
    }

    @ColorInt
    public static int getColor(Context context, @ColorRes int n) {
        return ContextCompat.getColor((Context)context, (int)n);
    }

    public static int[] getColorArray(@NonNull Context context, @ArrayRes int n) {
        if (n == 0) {
            return null;
        }
        context = context.getResources().obtainTypedArray(n);
        int[] nArray = new int[context.length()];
        for (n = 0; n < context.length(); ++n) {
            nArray[n] = context.getColor(n, 0);
        }
        context.recycle();
        return nArray;
    }

    @ColorInt
    public static int getDisabledColor(Context context) {
        int n = DialogUtils.isColorDark(DialogUtils.resolveColor(context, 16842806)) ? -16777216 : -1;
        return DialogUtils.adjustAlpha(n, 0.3f);
    }

    private static int gravityEnumToAttrInt(GravityEnum gravityEnum) {
        int n = 2.$SwitchMap$com$afollestad$materialdialogs$GravityEnum[gravityEnum.ordinal()];
        int n2 = 1;
        if (n != 1) {
            n2 = 2;
            if (n != 2) {
                return 0;
            }
        }
        return n2;
    }

    public static void hideKeyboard(@NonNull DialogInterface object, @NonNull MaterialDialog.Builder builder) {
        View view;
        if (((MaterialDialog)(object = (MaterialDialog)object)).getInputEditText() == null) {
            return;
        }
        if ((builder = (InputMethodManager)builder.getContext().getSystemService("input_method")) != null && (object = (view = object.getCurrentFocus()) != null ? view.getWindowToken() : ((MaterialDialog)object).getView().getWindowToken()) != null) {
            builder.hideSoftInputFromWindow((IBinder)object, 0);
        }
    }

    public static boolean isColorDark(@ColorInt int n) {
        double d2 = Color.red((int)n);
        double d6 = Color.green((int)n);
        boolean bl = 1.0 - ((double)Color.blue((int)n) * 0.114 + (d6 * 0.587 + d2 * 0.299)) / 255.0 >= 0.5;
        return bl;
    }

    public static <T> boolean isIn(@NonNull T t, @Nullable T[] TArray) {
        if (TArray != null && TArray.length != 0) {
            int n = TArray.length;
            for (int j = 0; j < n; ++j) {
                if (!TArray[j].equals(t)) continue;
                return true;
            }
        }
        return false;
    }

    public static ColorStateList resolveActionTextColorStateList(Context context, @AttrRes int n, ColorStateList colorStateList) {
        TypedArray typedArray;
        block8: {
            block7: {
                TypedValue typedValue;
                block6: {
                    typedArray = context.getTheme().obtainStyledAttributes(new int[]{n});
                    typedValue = typedArray.peekValue(0);
                    if (typedValue != null) break block6;
                    typedArray.recycle();
                    return colorStateList;
                }
                n = typedValue.type;
                if (n < 28 || n > 31) break block7;
                context = DialogUtils.getActionTextStateList(context, typedValue.data);
                return context;
            }
            context = typedArray.getColorStateList(0);
            if (context == null) break block8;
            typedArray.recycle();
            return context;
        }
        typedArray.recycle();
        return colorStateList;
        finally {
            typedArray.recycle();
        }
    }

    public static boolean resolveBoolean(Context context, @AttrRes int n) {
        return DialogUtils.resolveBoolean(context, n, false);
    }

    public static boolean resolveBoolean(Context context, @AttrRes int n, boolean bl) {
        context = context.getTheme().obtainStyledAttributes(new int[]{n});
        try {
            bl = context.getBoolean(0, bl);
            return bl;
        }
        finally {
            context.recycle();
        }
    }

    @ColorInt
    public static int resolveColor(Context context, @AttrRes int n) {
        return DialogUtils.resolveColor(context, n, 0);
    }

    @ColorInt
    public static int resolveColor(Context context, @AttrRes int n, int n2) {
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(new int[]{n});
        try {
            n = typedArray.getColor(0, n2);
            return n;
        }
        finally {
            typedArray.recycle();
        }
    }

    public static int resolveDimension(Context context, @AttrRes int n) {
        return DialogUtils.resolveDimension(context, n, -1);
    }

    private static int resolveDimension(Context context, @AttrRes int n, int n2) {
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(new int[]{n});
        try {
            n = typedArray.getDimensionPixelSize(0, n2);
            return n;
        }
        finally {
            typedArray.recycle();
        }
    }

    public static Drawable resolveDrawable(Context context, @AttrRes int n) {
        return DialogUtils.resolveDrawable(context, n, null);
    }

    private static Drawable resolveDrawable(Context context, @AttrRes int n, Drawable drawable2) {
        TypedArray typedArray;
        block2: {
            typedArray = context.getTheme().obtainStyledAttributes(new int[]{n});
            try {
                context = typedArray.getDrawable(0);
                if (context != null || drawable2 == null) break block2;
                context = drawable2;
            }
            catch (Throwable throwable) {
                typedArray.recycle();
                throw throwable;
            }
        }
        typedArray.recycle();
        return context;
    }

    public static GravityEnum resolveGravityEnum(Context context, @AttrRes int n, GravityEnum gravityEnum) {
        block6: {
            block7: {
                context = context.getTheme().obtainStyledAttributes(new int[]{n});
                n = context.getInt(0, DialogUtils.gravityEnumToAttrInt(gravityEnum));
                if (n == 1) break block6;
                if (n == 2) break block7;
                gravityEnum = GravityEnum.START;
                return gravityEnum;
            }
            gravityEnum = GravityEnum.END;
            context.recycle();
            return gravityEnum;
        }
        gravityEnum = GravityEnum.CENTER;
        context.recycle();
        return gravityEnum;
        finally {
            context.recycle();
        }
    }

    public static String resolveString(Context context, @AttrRes int n) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n, typedValue, true);
        return (String)typedValue.string;
    }

    public static void setBackgroundCompat(View view, Drawable drawable2) {
        view.setBackground(drawable2);
    }

    public static void showKeyboard(@NonNull DialogInterface object, @NonNull MaterialDialog.Builder builder) {
        if (((MaterialDialog)(object = (MaterialDialog)object)).getInputEditText() == null) {
            return;
        }
        ((MaterialDialog)object).getInputEditText().post(new Runnable((MaterialDialog)object, builder){
            public final MaterialDialog.Builder val$builder;
            public final MaterialDialog val$dialog;
            {
                this.val$dialog = materialDialog;
                this.val$builder = builder;
            }

            public void run() {
                this.val$dialog.getInputEditText().requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager)this.val$builder.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput((View)this.val$dialog.getInputEditText(), 1);
                }
            }
        });
    }
}

