package com.facebook.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class NativeProtocol$1
  implements Runnable
{
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Iterator localIterator = NativeProtocol.access$900().iterator();
      while (localIterator.hasNext()) {
        NativeProtocol.NativeAppInfo.access$1000((NativeProtocol.NativeAppInfo)localIterator.next(), true);
      }
      return;
    }
    finally
    {
      try
      {
        NativeProtocol.access$1100().set(false);
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
      localObject = finally;
      NativeProtocol.access$1100().set(false);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.NativeProtocol.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */