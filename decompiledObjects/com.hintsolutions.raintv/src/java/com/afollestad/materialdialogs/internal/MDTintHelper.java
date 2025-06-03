/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.Log
 *  android.widget.CheckBox
 *  android.widget.EditText
 *  android.widget.ProgressBar
 *  android.widget.RadioButton
 *  android.widget.SeekBar
 *  android.widget.TextView
 *  androidx.annotation.ColorInt
 *  androidx.annotation.NonNull
 *  androidx.appcompat.widget.AppCompatEditText
 *  androidx.core.content.ContextCompat
 *  java.lang.Exception
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Field
 */
package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.util.DialogUtils;
import java.lang.reflect.Field;

@SuppressLint(value={"PrivateResource"})
public class MDTintHelper {
    private static ColorStateList createEditTextColorStateList(@NonNull Context context, @ColorInt int n) {
        int n2 = R.attr.colorControlNormal;
        int n3 = DialogUtils.resolveColor(context, n2);
        int[] nArray = new int[]{-16842919, -16842908};
        n2 = DialogUtils.resolveColor(context, n2);
        return new ColorStateList((int[][])new int[][]{{-16842910}, nArray, new int[0]}, new int[]{n3, n2, n});
    }

    private static void setCursorTint(@NonNull EditText editText, @ColorInt int n) {
        try {
            Drawable[] drawableArray = TextView.class.getDeclaredField("mCursorDrawableRes");
            drawableArray.setAccessible(true);
            int n2 = drawableArray.getInt((Object)editText);
            drawableArray = TextView.class.getDeclaredField("mEditor");
            drawableArray.setAccessible(true);
            Object object = drawableArray.get((Object)editText);
            Field field = object.getClass().getDeclaredField("mCursorDrawable");
            field.setAccessible(true);
            drawableArray = new Drawable[]{ContextCompat.getDrawable((Context)editText.getContext(), (int)n2), ContextCompat.getDrawable((Context)editText.getContext(), (int)n2)};
            drawableArray[0].setColorFilter(n, PorterDuff.Mode.SRC_IN);
            drawableArray[1].setColorFilter(n, PorterDuff.Mode.SRC_IN);
            field.set(object, (Object)drawableArray);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        catch (NoSuchFieldException noSuchFieldException) {
            editText = z2.t("Device issue with cursor tinting: ");
            editText.append(noSuchFieldException.getMessage());
            Log.d((String)"MDTintHelper", (String)editText.toString());
            noSuchFieldException.printStackTrace();
        }
    }

    public static void setTint(@NonNull CheckBox checkBox, @ColorInt int n) {
        int n2 = DialogUtils.getDisabledColor(checkBox.getContext());
        int n3 = DialogUtils.resolveColor(checkBox.getContext(), R.attr.colorControlNormal);
        MDTintHelper.setTint(checkBox, new ColorStateList((int[][])new int[][]{{16842910, -16842912}, {16842910, 0x10100A0}, {-16842910, -16842912}, {-16842910, 0x10100A0}}, new int[]{n3, n, n2, n2}));
    }

    public static void setTint(@NonNull CheckBox checkBox, @NonNull ColorStateList colorStateList) {
        checkBox.setButtonTintList(colorStateList);
    }

    public static void setTint(@NonNull EditText editText, @ColorInt int n) {
        ColorStateList colorStateList = MDTintHelper.createEditTextColorStateList(editText.getContext(), n);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText)editText).setSupportBackgroundTintList(colorStateList);
        } else {
            editText.setBackgroundTintList(colorStateList);
        }
        MDTintHelper.setCursorTint(editText, n);
    }

    public static void setTint(@NonNull ProgressBar progressBar, @ColorInt int n) {
        MDTintHelper.setTint(progressBar, n, false);
    }

    private static void setTint(@NonNull ProgressBar progressBar, @ColorInt int n, boolean bl) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n);
        progressBar.setProgressTintList(colorStateList);
        progressBar.setSecondaryProgressTintList(colorStateList);
        if (!bl) {
            progressBar.setIndeterminateTintList(colorStateList);
        }
    }

    public static void setTint(@NonNull RadioButton radioButton, @ColorInt int n) {
        int n2 = DialogUtils.getDisabledColor(radioButton.getContext());
        int[] nArray = new int[]{16842910, -16842912};
        int[] nArray2 = new int[]{-16842910, -16842912};
        int[] nArray3 = new int[]{-16842910, 0x10100A0};
        int n3 = DialogUtils.resolveColor(radioButton.getContext(), R.attr.colorControlNormal);
        MDTintHelper.setTint(radioButton, new ColorStateList((int[][])new int[][]{nArray, {16842910, 0x10100A0}, nArray2, nArray3}, new int[]{n3, n, n2, n2}));
    }

    public static void setTint(@NonNull RadioButton radioButton, @NonNull ColorStateList colorStateList) {
        radioButton.setButtonTintList(colorStateList);
    }

    public static void setTint(@NonNull SeekBar seekBar, @ColorInt int n) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n);
        seekBar.setThumbTintList(colorStateList);
        seekBar.setProgressTintList(colorStateList);
    }
}

