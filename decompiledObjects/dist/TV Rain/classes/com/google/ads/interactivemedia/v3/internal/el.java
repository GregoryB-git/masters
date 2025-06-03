package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioFormat.Builder;
import android.media.AudioTrack;

final class el
{
  public final boolean a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final boolean g;
  public final boolean h;
  public final dl[] i;
  private final int j;
  private final int k;
  
  public el(boolean paramBoolean1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean2, boolean paramBoolean3, dl[] paramArrayOfdl)
  {
    a = paramBoolean1;
    b = paramInt1;
    c = paramInt2;
    d = paramInt3;
    j = paramInt4;
    k = paramInt5;
    e = paramInt6;
    if (paramInt7 == 0) {
      if (paramBoolean1)
      {
        paramInt1 = AudioTrack.getMinBufferSize(paramInt4, paramInt5, paramInt6);
        if (paramInt1 != -2) {
          paramBoolean1 = true;
        } else {
          paramBoolean1 = false;
        }
        rp.c(paramBoolean1);
        paramInt7 = wl.a(paramInt1 << 2, (int)b(250000L) * paramInt3, (int)Math.max(paramInt1, b(750000L) * paramInt3));
      }
      else
      {
        paramInt2 = eh.b(paramInt6);
        paramInt1 = paramInt2;
        if (paramInt6 == 5) {
          paramInt1 = paramInt2 << 1;
        }
        paramInt7 = (int)(paramInt1 * 250000L / 1000000L);
      }
    }
    f = paramInt7;
    g = paramBoolean2;
    h = paramBoolean3;
    i = paramArrayOfdl;
  }
  
  private final long b(long paramLong)
  {
    return paramLong * j / 1000000L;
  }
  
  public final long a(long paramLong)
  {
    return paramLong * 1000000L / j;
  }
  
  public final AudioTrack a(boolean paramBoolean, dg paramdg, int paramInt)
    throws dx
  {
    int m;
    if (wl.a >= 21)
    {
      if (paramBoolean) {
        paramdg = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
      } else {
        paramdg = paramdg.a();
      }
      AudioFormat localAudioFormat = new AudioFormat.Builder().setChannelMask(k).setEncoding(e).setSampleRate(j).build();
      m = f;
      if (paramInt == 0) {
        paramInt = 0;
      }
      paramdg = new AudioTrack(paramdg, localAudioFormat, m, 1, paramInt);
    }
    else
    {
      m = wl.f(c);
      if (paramInt == 0) {
        paramdg = new AudioTrack(m, j, k, e, f, 1);
      } else {
        paramdg = new AudioTrack(m, j, k, e, f, 1, paramInt);
      }
    }
    paramInt = paramdg.getState();
    if (paramInt == 1) {
      return paramdg;
    }
    try
    {
      paramdg.release();
      throw new dx(paramInt, j, k, f);
    }
    catch (Exception paramdg)
    {
      for (;;) {}
    }
  }
  
  public final boolean a(el paramel)
  {
    return (e == e) && (j == j) && (k == k);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.el
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */