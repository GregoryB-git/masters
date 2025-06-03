package com.devbrackets.android.exomedia.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.graphics.drawable.DrawableCompat;

public class ResourceUtil
{
  @ColorInt
  public static int getColor(Context paramContext, @ColorRes int paramInt)
  {
    return paramContext.getResources().getColor(paramInt, paramContext.getTheme());
  }
  
  public static ColorStateList getColorStateList(Context paramContext, @ColorRes int paramInt)
  {
    return paramContext.getResources().getColorStateList(paramInt, paramContext.getTheme());
  }
  
  public static Drawable getDrawable(Context paramContext, @DrawableRes int paramInt)
  {
    return paramContext.getResources().getDrawable(paramInt, paramContext.getTheme());
  }
  
  @AnyRes
  public static int getResolvedResourceId(Context paramContext, @AttrRes int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(paramInt, localTypedValue, true);
    if (type == 1) {
      return data;
    }
    return resourceId;
  }
  
  public static Drawable tint(Context paramContext, @DrawableRes int paramInt1, @ColorRes int paramInt2)
  {
    return tint(paramContext, getDrawable(paramContext, paramInt1).mutate(), paramInt2);
  }
  
  public static Drawable tint(Context paramContext, Drawable paramDrawable, @ColorRes int paramInt)
  {
    paramDrawable = DrawableCompat.wrap(paramDrawable);
    DrawableCompat.setTint(paramDrawable, getColor(paramContext, paramInt));
    return paramDrawable;
  }
  
  public static Drawable tintList(Context paramContext, @DrawableRes int paramInt1, @ColorRes int paramInt2)
  {
    return tintList(paramContext, getDrawable(paramContext, paramInt1).mutate(), paramInt2);
  }
  
  public static Drawable tintList(Context paramContext, Drawable paramDrawable, @ColorRes int paramInt)
  {
    paramDrawable = DrawableCompat.wrap(paramDrawable);
    DrawableCompat.setTintList(paramDrawable, getColorStateList(paramContext, paramInt));
    return paramDrawable;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.util.ResourceUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */