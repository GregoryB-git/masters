package com.facebook.login.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class ToolTipPopup$3
  implements View.OnClickListener
{
  public ToolTipPopup$3(ToolTipPopup paramToolTipPopup) {}
  
  public void onClick(View paramView)
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
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.widget.ToolTipPopup.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */