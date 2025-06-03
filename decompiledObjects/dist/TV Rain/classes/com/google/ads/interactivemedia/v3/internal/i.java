package com.google.ads.interactivemedia.v3.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings.System;

public final class i
  extends ContentObserver
{
  private final Context a;
  private final AudioManager b;
  private final h c;
  private final j d;
  private float e;
  
  public i(Handler paramHandler, Context paramContext, h paramh, j paramj)
  {
    super(paramHandler);
    a = paramContext;
    b = ((AudioManager)paramContext.getSystemService("audio"));
    c = paramh;
    d = paramj;
  }
  
  private final float c()
  {
    int i = b.getStreamVolume(3);
    int j = b.getStreamMaxVolume(3);
    if ((j > 0) && (i > 0))
    {
      float f1 = i / j;
      float f2 = f1;
      if (f1 > 1.0F) {
        f2 = 1.0F;
      }
      return f2;
    }
    return 0.0F;
  }
  
  private final void d()
  {
    d.a(e);
  }
  
  public final void a()
  {
    e = c();
    d();
    a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
  }
  
  public final void b()
  {
    a.getContentResolver().unregisterContentObserver(this);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    float f = c();
    int i;
    if (f != e) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      e = f;
      d();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */