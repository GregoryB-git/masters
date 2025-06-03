package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;

public final class zak
  extends Drawable
  implements Drawable.Callback
{
  private int zaa = 0;
  private long zab;
  private int zac;
  private int zad = 255;
  private int zae;
  private int zaf = 0;
  private boolean zag = true;
  private boolean zah;
  private zaj zai;
  private Drawable zaj;
  private Drawable zak;
  private boolean zal;
  private boolean zam;
  private boolean zan;
  private int zao;
  
  public zak(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    this(null);
    Object localObject = paramDrawable1;
    if (paramDrawable1 == null) {
      localObject = zai.zaa();
    }
    zaj = ((Drawable)localObject);
    ((Drawable)localObject).setCallback(this);
    paramDrawable1 = zai;
    int i = zab;
    zab = (((Drawable)localObject).getChangingConfigurations() | i);
    paramDrawable1 = paramDrawable2;
    if (paramDrawable2 == null) {
      paramDrawable1 = zai.zaa();
    }
    zak = paramDrawable1;
    paramDrawable1.setCallback(this);
    paramDrawable2 = zai;
    i = zab;
    zab = (paramDrawable1.getChangingConfigurations() | i);
  }
  
  public zak(zaj paramzaj)
  {
    zai = new zaj(paramzaj);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int i = zaa;
    int j = 0;
    int k = 0;
    if (i != 1)
    {
      if (i != 2) {}
      while (zab < 0L)
      {
        i = 1;
        break;
      }
      long l1 = SystemClock.uptimeMillis();
      long l2 = zab;
      float f = zae;
      f = (float)(l1 - l2) / f;
      if (f >= 1.0F) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        zaa = 0;
      }
      f = Math.min(f, 1.0F);
      zaf = ((int)(zac * f + 0.0F));
    }
    else
    {
      zab = SystemClock.uptimeMillis();
      zaa = 2;
      i = 0;
    }
    int m = zaf;
    boolean bool = zag;
    Drawable localDrawable1 = zaj;
    Drawable localDrawable2 = zak;
    if (i != 0)
    {
      if (bool)
      {
        i = m;
        if (m != 0) {
          break label182;
        }
        i = k;
      }
      else
      {
        i = m;
      }
      localDrawable1.draw(paramCanvas);
      label182:
      m = zad;
      if (i == m)
      {
        localDrawable2.setAlpha(m);
        localDrawable2.draw(paramCanvas);
      }
      return;
    }
    i = j;
    if (bool)
    {
      localDrawable1.setAlpha(zad - m);
      i = 1;
    }
    localDrawable1.draw(paramCanvas);
    if (i != 0) {
      localDrawable1.setAlpha(zad);
    }
    if (m > 0)
    {
      localDrawable2.setAlpha(m);
      localDrawable2.draw(paramCanvas);
      localDrawable2.setAlpha(zad);
    }
    invalidateSelf();
  }
  
  public final int getChangingConfigurations()
  {
    int i = super.getChangingConfigurations();
    zaj localzaj = zai;
    return i | zaa | zab;
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if (zac())
    {
      zai.zaa = getChangingConfigurations();
      return zai;
    }
    return null;
  }
  
  public final int getIntrinsicHeight()
  {
    return Math.max(zaj.getIntrinsicHeight(), zak.getIntrinsicHeight());
  }
  
  public final int getIntrinsicWidth()
  {
    return Math.max(zaj.getIntrinsicWidth(), zak.getIntrinsicWidth());
  }
  
  public final int getOpacity()
  {
    if (!zan)
    {
      zao = Drawable.resolveOpacity(zaj.getOpacity(), zak.getOpacity());
      zan = true;
    }
    return zao;
  }
  
  public final void invalidateDrawable(Drawable paramDrawable)
  {
    paramDrawable = getCallback();
    if (paramDrawable != null) {
      paramDrawable.invalidateDrawable(this);
    }
  }
  
  public final Drawable mutate()
  {
    if ((!zah) && (super.mutate() == this)) {
      if (zac())
      {
        zaj.mutate();
        zak.mutate();
        zah = true;
      }
      else
      {
        throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
      }
    }
    return this;
  }
  
  public final void onBoundsChange(Rect paramRect)
  {
    zaj.setBounds(paramRect);
    zak.setBounds(paramRect);
  }
  
  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    paramDrawable = getCallback();
    if (paramDrawable != null) {
      paramDrawable.scheduleDrawable(this, paramRunnable, paramLong);
    }
  }
  
  public final void setAlpha(int paramInt)
  {
    if (zaf == zad) {
      zaf = paramInt;
    }
    zad = paramInt;
    invalidateSelf();
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    zaj.setColorFilter(paramColorFilter);
    zak.setColorFilter(paramColorFilter);
  }
  
  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    paramDrawable = getCallback();
    if (paramDrawable != null) {
      paramDrawable.unscheduleDrawable(this, paramRunnable);
    }
  }
  
  public final Drawable zaa()
  {
    return zak;
  }
  
  public final void zab(int paramInt)
  {
    zac = zad;
    zaf = 0;
    zae = 250;
    zaa = 1;
    invalidateSelf();
  }
  
  public final boolean zac()
  {
    if (!zal)
    {
      Drawable.ConstantState localConstantState = zaj.getConstantState();
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (localConstantState != null)
      {
        bool2 = bool1;
        if (zak.getConstantState() != null) {
          bool2 = true;
        }
      }
      zam = bool2;
      zal = true;
    }
    return zam;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.base.zak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */