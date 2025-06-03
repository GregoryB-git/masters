package com.afollestad.materialdialogs.util;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.ColorInt;

@TargetApi(21)
public class RippleHelper
{
  public static void applyColor(Drawable paramDrawable, @ColorInt int paramInt)
  {
    if ((paramDrawable instanceof RippleDrawable)) {
      ((RippleDrawable)paramDrawable).setColor(ColorStateList.valueOf(paramInt));
    }
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.util.RippleHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */