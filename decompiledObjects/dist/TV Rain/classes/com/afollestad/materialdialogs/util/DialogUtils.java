package com.afollestad.materialdialogs.util;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
import com.afollestad.materialdialogs.MaterialDialog.Builder;

public class DialogUtils
{
  @ColorInt
  public static int adjustAlpha(@ColorInt int paramInt, float paramFloat)
  {
    return Color.argb(Math.round(Color.alpha(paramInt) * paramFloat), Color.red(paramInt), Color.green(paramInt), Color.blue(paramInt));
  }
  
  public static ColorStateList getActionTextColorStateList(Context paramContext, @ColorRes int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    paramContext.getResources().getValue(paramInt, localTypedValue, true);
    int i = type;
    if ((i >= 28) && (i <= 31)) {
      return getActionTextStateList(paramContext, data);
    }
    return paramContext.getColorStateList(paramInt);
  }
  
  public static ColorStateList getActionTextStateList(Context paramContext, int paramInt)
  {
    int i = resolveColor(paramContext, 16842806);
    int j = paramInt;
    if (paramInt == 0) {
      j = i;
    }
    paramInt = adjustAlpha(j, 0.4F);
    return new ColorStateList(new int[][] { { -16842910 }, new int[0] }, new int[] { paramInt, j });
  }
  
  @ColorInt
  public static int getColor(Context paramContext, @ColorRes int paramInt)
  {
    return ContextCompat.getColor(paramContext, paramInt);
  }
  
  public static int[] getColorArray(@NonNull Context paramContext, @ArrayRes int paramInt)
  {
    if (paramInt == 0) {
      return null;
    }
    paramContext = paramContext.getResources().obtainTypedArray(paramInt);
    int[] arrayOfInt = new int[paramContext.length()];
    for (paramInt = 0; paramInt < paramContext.length(); paramInt++) {
      arrayOfInt[paramInt] = paramContext.getColor(paramInt, 0);
    }
    paramContext.recycle();
    return arrayOfInt;
  }
  
  @ColorInt
  public static int getDisabledColor(Context paramContext)
  {
    int i;
    if (isColorDark(resolveColor(paramContext, 16842806))) {
      i = -16777216;
    } else {
      i = -1;
    }
    return adjustAlpha(i, 0.3F);
  }
  
  private static int gravityEnumToAttrInt(GravityEnum paramGravityEnum)
  {
    int i = 2.$SwitchMap$com$afollestad$materialdialogs$GravityEnum[paramGravityEnum.ordinal()];
    int j = 1;
    if (i != 1)
    {
      j = 2;
      if (i != 2) {
        return 0;
      }
    }
    return j;
  }
  
  public static void hideKeyboard(@NonNull DialogInterface paramDialogInterface, @NonNull MaterialDialog.Builder paramBuilder)
  {
    paramDialogInterface = (MaterialDialog)paramDialogInterface;
    if (paramDialogInterface.getInputEditText() == null) {
      return;
    }
    paramBuilder = (InputMethodManager)paramBuilder.getContext().getSystemService("input_method");
    if (paramBuilder != null)
    {
      View localView = paramDialogInterface.getCurrentFocus();
      if (localView != null) {
        paramDialogInterface = localView.getWindowToken();
      } else {
        paramDialogInterface = paramDialogInterface.getView().getWindowToken();
      }
      if (paramDialogInterface != null) {
        paramBuilder.hideSoftInputFromWindow(paramDialogInterface, 0);
      }
    }
  }
  
  public static boolean isColorDark(@ColorInt int paramInt)
  {
    double d1 = Color.red(paramInt);
    double d2 = Color.green(paramInt);
    boolean bool;
    if (1.0D - (Color.blue(paramInt) * 0.114D + (d2 * 0.587D + d1 * 0.299D)) / 255.0D >= 0.5D) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static <T> boolean isIn(@NonNull T paramT, @Nullable T[] paramArrayOfT)
  {
    if ((paramArrayOfT != null) && (paramArrayOfT.length != 0))
    {
      int i = paramArrayOfT.length;
      for (int j = 0; j < i; j++) {
        if (paramArrayOfT[j].equals(paramT)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static ColorStateList resolveActionTextColorStateList(Context paramContext, @AttrRes int paramInt, ColorStateList paramColorStateList)
  {
    TypedArray localTypedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { paramInt });
    try
    {
      TypedValue localTypedValue = localTypedArray.peekValue(0);
      if (localTypedValue == null) {
        return paramColorStateList;
      }
      paramInt = type;
      if ((paramInt >= 28) && (paramInt <= 31))
      {
        paramContext = getActionTextStateList(paramContext, data);
        return paramContext;
      }
      paramContext = localTypedArray.getColorStateList(0);
      if (paramContext != null) {
        return paramContext;
      }
      return paramColorStateList;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  public static boolean resolveBoolean(Context paramContext, @AttrRes int paramInt)
  {
    return resolveBoolean(paramContext, paramInt, false);
  }
  
  public static boolean resolveBoolean(Context paramContext, @AttrRes int paramInt, boolean paramBoolean)
  {
    TypedArray localTypedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { paramInt });
    try
    {
      paramBoolean = localTypedArray.getBoolean(0, paramBoolean);
      return paramBoolean;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  @ColorInt
  public static int resolveColor(Context paramContext, @AttrRes int paramInt)
  {
    return resolveColor(paramContext, paramInt, 0);
  }
  
  @ColorInt
  public static int resolveColor(Context paramContext, @AttrRes int paramInt1, int paramInt2)
  {
    paramContext = paramContext.getTheme().obtainStyledAttributes(new int[] { paramInt1 });
    try
    {
      paramInt1 = paramContext.getColor(0, paramInt2);
      return paramInt1;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public static int resolveDimension(Context paramContext, @AttrRes int paramInt)
  {
    return resolveDimension(paramContext, paramInt, -1);
  }
  
  private static int resolveDimension(Context paramContext, @AttrRes int paramInt1, int paramInt2)
  {
    TypedArray localTypedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { paramInt1 });
    try
    {
      paramInt1 = localTypedArray.getDimensionPixelSize(0, paramInt2);
      return paramInt1;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  public static Drawable resolveDrawable(Context paramContext, @AttrRes int paramInt)
  {
    return resolveDrawable(paramContext, paramInt, null);
  }
  
  private static Drawable resolveDrawable(Context paramContext, @AttrRes int paramInt, Drawable paramDrawable)
  {
    TypedArray localTypedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { paramInt });
    try
    {
      paramContext = localTypedArray.getDrawable(0);
      if ((paramContext != null) || (paramDrawable == null)) {
        paramDrawable = paramContext;
      }
      return paramDrawable;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  public static GravityEnum resolveGravityEnum(Context paramContext, @AttrRes int paramInt, GravityEnum paramGravityEnum)
  {
    paramContext = paramContext.getTheme().obtainStyledAttributes(new int[] { paramInt });
    try
    {
      paramInt = paramContext.getInt(0, gravityEnumToAttrInt(paramGravityEnum));
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          paramGravityEnum = GravityEnum.START;
          return paramGravityEnum;
        }
        paramGravityEnum = GravityEnum.END;
        return paramGravityEnum;
      }
      paramGravityEnum = GravityEnum.CENTER;
      return paramGravityEnum;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public static String resolveString(Context paramContext, @AttrRes int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(paramInt, localTypedValue, true);
    return (String)string;
  }
  
  public static void setBackgroundCompat(View paramView, Drawable paramDrawable)
  {
    paramView.setBackground(paramDrawable);
  }
  
  public static void showKeyboard(@NonNull DialogInterface paramDialogInterface, @NonNull final MaterialDialog.Builder paramBuilder)
  {
    paramDialogInterface = (MaterialDialog)paramDialogInterface;
    if (paramDialogInterface.getInputEditText() == null) {
      return;
    }
    paramDialogInterface.getInputEditText().post(new Runnable()
    {
      public void run()
      {
        val$dialog.getInputEditText().requestFocus();
        InputMethodManager localInputMethodManager = (InputMethodManager)paramBuilder.getContext().getSystemService("input_method");
        if (localInputMethodManager != null) {
          localInputMethodManager.showSoftInput(val$dialog.getInputEditText(), 1);
        }
      }
    });
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.util.DialogUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */