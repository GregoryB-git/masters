package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import android.util.Log;

public class ed
{
  private ed(eh parameh) {}
  
  public void a(int paramInt, long paramLong)
  {
    if (eh.d(a) != null)
    {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = eh.e(a);
      eh.d(a).a(paramInt, paramLong, l1 - l2);
    }
  }
  
  public void a(long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder(61);
    localStringBuilder.append("Ignoring impossibly large audio latency: ");
    localStringBuilder.append(paramLong);
    Log.w("AudioTrack", localStringBuilder.toString());
  }
  
  public void a(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    long l1 = eh.b(a);
    long l2 = eh.c(a);
    StringBuilder localStringBuilder = new StringBuilder(182);
    localStringBuilder.append("Spurious audio timestamp (frame position mismatch): ");
    localStringBuilder.append(paramLong1);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramLong2);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramLong3);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramLong4);
    localStringBuilder.append(", ");
    localStringBuilder.append(l1);
    localStringBuilder.append(", ");
    localStringBuilder.append(l2);
    Log.w("AudioTrack", localStringBuilder.toString());
  }
  
  public void b(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    long l1 = eh.b(a);
    long l2 = eh.c(a);
    StringBuilder localStringBuilder = new StringBuilder(180);
    localStringBuilder.append("Spurious audio timestamp (system clock mismatch): ");
    localStringBuilder.append(paramLong1);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramLong2);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramLong3);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramLong4);
    localStringBuilder.append(", ");
    localStringBuilder.append(l1);
    localStringBuilder.append(", ");
    localStringBuilder.append(l2);
    Log.w("AudioTrack", localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ed
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */