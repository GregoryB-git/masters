package com.facebook.appevents.codeless;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class CodelessMatcher$1
  implements Runnable
{
  public CodelessMatcher$1(CodelessMatcher paramCodelessMatcher) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      CodelessMatcher.access$000(this$0);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.CodelessMatcher.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */