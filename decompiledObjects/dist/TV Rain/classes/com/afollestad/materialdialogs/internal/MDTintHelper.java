package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import com.afollestad.materialdialogs.R.attr;
import com.afollestad.materialdialogs.util.DialogUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import z2;

@SuppressLint({"PrivateResource"})
public class MDTintHelper
{
  private static ColorStateList createEditTextColorStateList(@NonNull Context paramContext, @ColorInt int paramInt)
  {
    int[] arrayOfInt1 = { -16842910 };
    int i = R.attr.colorControlNormal;
    int j = DialogUtils.resolveColor(paramContext, i);
    int[] arrayOfInt2 = { -16842919, -16842908 };
    i = DialogUtils.resolveColor(paramContext, i);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, new int[0] }, new int[] { j, i, paramInt });
  }
  
  private static void setCursorTint(@NonNull EditText paramEditText, @ColorInt int paramInt)
  {
    try
    {
      Field localField = TextView.class.getDeclaredField("mCursorDrawableRes");
      localField.setAccessible(true);
      int i = localField.getInt(paramEditText);
      localField = TextView.class.getDeclaredField("mEditor");
      localField.setAccessible(true);
      Object localObject = localField.get(paramEditText);
      localField = localObject.getClass().getDeclaredField("mCursorDrawable");
      localField.setAccessible(true);
      Drawable[] arrayOfDrawable = new Drawable[2];
      arrayOfDrawable[0] = ContextCompat.getDrawable(paramEditText.getContext(), i);
      arrayOfDrawable[1] = ContextCompat.getDrawable(paramEditText.getContext(), i);
      arrayOfDrawable[0].setColorFilter(paramInt, PorterDuff.Mode.SRC_IN);
      arrayOfDrawable[1].setColorFilter(paramInt, PorterDuff.Mode.SRC_IN);
      localField.set(localObject, arrayOfDrawable);
    }
    catch (Exception paramEditText)
    {
      paramEditText.printStackTrace();
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      paramEditText = z2.t("Device issue with cursor tinting: ");
      paramEditText.append(localNoSuchFieldException.getMessage());
      Log.d("MDTintHelper", paramEditText.toString());
      localNoSuchFieldException.printStackTrace();
    }
  }
  
  public static void setTint(@NonNull CheckBox paramCheckBox, @ColorInt int paramInt)
  {
    int i = DialogUtils.getDisabledColor(paramCheckBox.getContext());
    int[] arrayOfInt1 = { 16842910, -16842912 };
    int[] arrayOfInt2 = { 16842910, 16842912 };
    int[] arrayOfInt3 = { -16842910, 16842912 };
    int j = DialogUtils.resolveColor(paramCheckBox.getContext(), R.attr.colorControlNormal);
    setTint(paramCheckBox, new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, { -16842910, -16842912 }, arrayOfInt3 }, new int[] { j, paramInt, i, i }));
  }
  
  public static void setTint(@NonNull CheckBox paramCheckBox, @NonNull ColorStateList paramColorStateList)
  {
    paramCheckBox.setButtonTintList(paramColorStateList);
  }
  
  public static void setTint(@NonNull EditText paramEditText, @ColorInt int paramInt)
  {
    ColorStateList localColorStateList = createEditTextColorStateList(paramEditText.getContext(), paramInt);
    if ((paramEditText instanceof AppCompatEditText)) {
      ((AppCompatEditText)paramEditText).setSupportBackgroundTintList(localColorStateList);
    } else {
      paramEditText.setBackgroundTintList(localColorStateList);
    }
    setCursorTint(paramEditText, paramInt);
  }
  
  public static void setTint(@NonNull ProgressBar paramProgressBar, @ColorInt int paramInt)
  {
    setTint(paramProgressBar, paramInt, false);
  }
  
  private static void setTint(@NonNull ProgressBar paramProgressBar, @ColorInt int paramInt, boolean paramBoolean)
  {
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    paramProgressBar.setProgressTintList(localColorStateList);
    paramProgressBar.setSecondaryProgressTintList(localColorStateList);
    if (!paramBoolean) {
      paramProgressBar.setIndeterminateTintList(localColorStateList);
    }
  }
  
  public static void setTint(@NonNull RadioButton paramRadioButton, @ColorInt int paramInt)
  {
    int i = DialogUtils.getDisabledColor(paramRadioButton.getContext());
    int j = DialogUtils.resolveColor(paramRadioButton.getContext(), R.attr.colorControlNormal);
    setTint(paramRadioButton, new ColorStateList(new int[][] { { 16842910, -16842912 }, { 16842910, 16842912 }, { -16842910, -16842912 }, { -16842910, 16842912 } }, new int[] { j, paramInt, i, i }));
  }
  
  public static void setTint(@NonNull RadioButton paramRadioButton, @NonNull ColorStateList paramColorStateList)
  {
    paramRadioButton.setButtonTintList(paramColorStateList);
  }
  
  public static void setTint(@NonNull SeekBar paramSeekBar, @ColorInt int paramInt)
  {
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    paramSeekBar.setThumbTintList(localColorStateList);
    paramSeekBar.setProgressTintList(localColorStateList);
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.internal.MDTintHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */