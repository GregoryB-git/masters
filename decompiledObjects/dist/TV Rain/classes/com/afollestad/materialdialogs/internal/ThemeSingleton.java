package com.afollestad.materialdialogs.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.afollestad.materialdialogs.GravityEnum;

public class ThemeSingleton
{
  private static ThemeSingleton singleton;
  @ColorInt
  public int backgroundColor = 0;
  @DrawableRes
  public int btnSelectorNegative = 0;
  @DrawableRes
  public int btnSelectorNeutral = 0;
  @DrawableRes
  public int btnSelectorPositive = 0;
  @DrawableRes
  public int btnSelectorStacked = 0;
  public GravityEnum btnStackedGravity;
  public GravityEnum buttonsGravity;
  @ColorInt
  public int contentColor = 0;
  public GravityEnum contentGravity;
  public boolean darkTheme = false;
  @ColorInt
  public int dividerColor = 0;
  public Drawable icon = null;
  @ColorInt
  public int itemColor = 0;
  public GravityEnum itemsGravity;
  public ColorStateList linkColor = null;
  @DrawableRes
  public int listSelector = 0;
  public ColorStateList negativeColor = null;
  public ColorStateList neutralColor = null;
  public ColorStateList positiveColor = null;
  @ColorInt
  public int titleColor = 0;
  public GravityEnum titleGravity;
  @ColorInt
  public int widgetColor = 0;
  
  public ThemeSingleton()
  {
    GravityEnum localGravityEnum = GravityEnum.START;
    titleGravity = localGravityEnum;
    contentGravity = localGravityEnum;
    btnStackedGravity = GravityEnum.END;
    itemsGravity = localGravityEnum;
    buttonsGravity = localGravityEnum;
  }
  
  public static ThemeSingleton get()
  {
    return get(true);
  }
  
  public static ThemeSingleton get(boolean paramBoolean)
  {
    if ((singleton == null) && (paramBoolean)) {
      singleton = new ThemeSingleton();
    }
    return singleton;
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.internal.ThemeSingleton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */