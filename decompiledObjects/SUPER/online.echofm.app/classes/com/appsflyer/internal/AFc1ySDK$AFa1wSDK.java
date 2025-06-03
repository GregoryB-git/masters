package com.appsflyer.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class AFc1ySDK$AFa1wSDK
  implements ThreadFactory
{
  private static final AtomicInteger AFInAppEventParameterName = new AtomicInteger();
  private final AtomicInteger valueOf = new AtomicInteger();
  
  public AFc1ySDK$AFa1wSDK()
  {
    AFInAppEventParameterName.incrementAndGet();
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    int i = AFInAppEventParameterName.get();
    int j = valueOf.incrementAndGet();
    StringBuilder localStringBuilder = new StringBuilder("queue-");
    localStringBuilder.append(i);
    localStringBuilder.append("-");
    localStringBuilder.append(j);
    return new Thread(paramRunnable, localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1ySDK.AFa1wSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */