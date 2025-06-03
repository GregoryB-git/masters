package com.appsflyer.internal;

import java.util.AbstractCollection;
import java.util.concurrent.LinkedBlockingQueue;

final class AFc1ySDK$4
  extends LinkedBlockingQueue<Runnable>
{
  private boolean values(Runnable paramRunnable)
  {
    if (isEmpty()) {
      return super.offer(paramRunnable);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1ySDK.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */