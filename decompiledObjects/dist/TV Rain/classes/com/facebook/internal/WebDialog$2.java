package com.facebook.internal;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class WebDialog$2
  implements View.OnClickListener
{
  public WebDialog$2(WebDialog paramWebDialog) {}
  
  public void onClick(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      this$0.cancel();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.WebDialog.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */