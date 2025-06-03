package com.facebook.drawee.interfaces;

import android.graphics.drawable.Drawable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract interface DraweeHierarchy
{
  public abstract Drawable getTopLevelDrawable();
}

/* Location:
 * Qualified Name:     com.facebook.drawee.interfaces.DraweeHierarchy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */