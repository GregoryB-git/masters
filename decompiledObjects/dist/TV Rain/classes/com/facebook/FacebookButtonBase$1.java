package com.facebook;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class FacebookButtonBase$1
  implements View.OnClickListener
{
  public FacebookButtonBase$1(FacebookButtonBase paramFacebookButtonBase) {}
  
  public void onClick(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      FacebookButtonBase localFacebookButtonBase = this$0;
      FacebookButtonBase.access$000(localFacebookButtonBase, localFacebookButtonBase.getContext());
      if (FacebookButtonBase.access$100(this$0) != null) {
        FacebookButtonBase.access$100(this$0).onClick(paramView);
      } else if (FacebookButtonBase.access$200(this$0) != null) {
        FacebookButtonBase.access$200(this$0).onClick(paramView);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookButtonBase.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */