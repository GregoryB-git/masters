package com.facebook.login.widget;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class ToolTipPopup$2
  implements Runnable
{
  public ToolTipPopup$2(ToolTipPopup paramToolTipPopup) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      this$0.dismiss();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.widget.ToolTipPopup.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */