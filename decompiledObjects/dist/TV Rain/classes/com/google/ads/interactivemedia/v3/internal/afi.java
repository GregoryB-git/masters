package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Message;

public final class afi
{
  private final Handler a;
  
  public afi(Handler paramHandler)
  {
    a = paramHandler;
  }
  
  public final void a(int paramInt)
  {
    a.removeMessages(1);
  }
  
  public final boolean a(int paramInt, long paramLong)
  {
    return a.sendEmptyMessageDelayed(1, paramLong);
  }
  
  public final boolean b(int paramInt)
  {
    return a.sendEmptyMessage(0);
  }
  
  public final boolean c(int paramInt)
  {
    Handler localHandler = a;
    return localHandler.sendMessageAtFrontOfQueue(Message.obtain(localHandler, 2));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */