package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import l5;

public final class dh
{
  private final AudioManager a;
  private final dk b;
  private final dj c;
  private int d;
  private float e = 1.0F;
  private AudioFocusRequest f;
  
  public dh(Context paramContext, dj paramdj)
  {
    a = ((AudioManager)paramContext.getApplicationContext().getSystemService("audio"));
    c = paramdj;
    b = new dk(this, (byte)0);
    d = 0;
  }
  
  private final void b(boolean paramBoolean)
  {
    if (d == 0) {
      return;
    }
    if (wl.a >= 26)
    {
      AudioFocusRequest localAudioFocusRequest = f;
      if (localAudioFocusRequest != null) {
        l5.e(a, localAudioFocusRequest);
      }
    }
    else
    {
      a.abandonAudioFocus(b);
    }
    d = 0;
  }
  
  private final int c()
  {
    if (d != 0) {
      b(true);
    }
    return 1;
  }
  
  private final boolean d()
  {
    return false;
  }
  
  public final float a()
  {
    return e;
  }
  
  public final int a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return c();
    }
    return -1;
  }
  
  public final int a(boolean paramBoolean, int paramInt)
  {
    if (!paramBoolean)
    {
      b(false);
      return -1;
    }
    int i = 1;
    if (paramInt == 1)
    {
      if (paramBoolean) {
        paramInt = i;
      } else {
        return -1;
      }
    }
    else {
      paramInt = c();
    }
    return paramInt;
  }
  
  public final void b()
  {
    b(true);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.dh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */