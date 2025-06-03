package com.appsflyer.internal;

import java.util.concurrent.Executor;

final class AFa1eSDK$AFa1ySDK
  implements Runnable
{
  private final AFa1qSDK values;
  
  private AFa1eSDK$AFa1ySDK(AFa1eSDK paramAFa1eSDK, AFa1qSDK paramAFa1qSDK)
  {
    values = paramAFa1qSDK;
  }
  
  public final void run()
  {
    Object localObject;
    if (values.AFInAppEventParameterName())
    {
      localObject = new AFd1fSDK(values, valueOf.AFInAppEventType());
      AFVersionDeclaration = AFa1eSDK.values(valueOf);
    }
    else
    {
      localObject = new AFd1hSDK(values, valueOf.AFInAppEventType());
    }
    AFc1bSDK localAFc1bSDK = valueOf.AFInAppEventType().AFVersionDeclaration();
    AFKeystoreWrapper.execute(new AFc1bSDK.4(localAFc1bSDK, (AFd1zSDK)localObject));
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1eSDK.AFa1ySDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */