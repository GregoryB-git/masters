package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class zaj
  extends Drawable.ConstantState
{
  public int zaa;
  public int zab;
  
  public zaj(zaj paramzaj)
  {
    if (paramzaj != null)
    {
      zaa = zaa;
      zab = zab;
    }
  }
  
  public final int getChangingConfigurations()
  {
    return zaa;
  }
  
  public final Drawable newDrawable()
  {
    return new zak(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.base.zaj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */