package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class vo
{
  private final Handler a;
  
  public vo(Handler paramHandler)
  {
    a = paramHandler;
  }
  
  public Looper a()
  {
    return a.getLooper();
  }
  
  public Message a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a.obtainMessage(paramInt1, paramInt2, 0);
  }
  
  public Message a(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    return a.obtainMessage(paramInt1, paramInt2, paramInt3, paramObject);
  }
  
  public Message a(int paramInt, Object paramObject)
  {
    return a.obtainMessage(paramInt, paramObject);
  }
  
  public boolean a(int paramInt)
  {
    return a.sendEmptyMessage(paramInt);
  }
  
  public boolean a(int paramInt, long paramLong)
  {
    return a.sendEmptyMessageAtTime(2, paramLong);
  }
  
  public void b(int paramInt)
  {
    a.removeMessages(2);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */