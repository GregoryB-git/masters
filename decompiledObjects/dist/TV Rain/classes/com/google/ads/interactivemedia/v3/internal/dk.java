package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioManager.OnAudioFocusChangeListener;
import android.util.Log;
import z2;

final class dk
  implements AudioManager.OnAudioFocusChangeListener
{
  private dk(dh paramdh) {}
  
  public final void onAudioFocusChange(int paramInt)
  {
    if (paramInt != -3)
    {
      if (paramInt != -2)
      {
        if (paramInt != -1)
        {
          if (paramInt != 1)
          {
            StringBuilder localStringBuilder = new StringBuilder(38);
            localStringBuilder.append("Unknown focus change type: ");
            localStringBuilder.append(paramInt);
            Log.w("AudioFocusManager", localStringBuilder.toString());
            return;
          }
          dh.a(a, 1);
        }
        else
        {
          dh.a(a, -1);
        }
      }
      else {
        dh.a(a, 2);
      }
    }
    else if (dh.a(a)) {
      dh.a(a, 2);
    } else {
      dh.a(a, 3);
    }
    paramInt = dh.b(a);
    if (paramInt != -1)
    {
      if (paramInt != 0) {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3) {
              throw new IllegalStateException(z2.k(38, "Unknown audio focus state: ", dh.b(a)));
            }
          }
          else {
            dh.c(a).c(0);
          }
        }
        else {
          dh.c(a).c(1);
        }
      }
    }
    else
    {
      dh.c(a).c(-1);
      dh.a(a, true);
    }
    float f;
    if (dh.b(a) == 3) {
      f = 0.2F;
    } else {
      f = 1.0F;
    }
    if (dh.d(a) != f)
    {
      dh.a(a, f);
      dh.c(a).b();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.dk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */