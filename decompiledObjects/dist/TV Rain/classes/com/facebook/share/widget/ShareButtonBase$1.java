package com.facebook.share.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class ShareButtonBase$1
  implements View.OnClickListener
{
  public ShareButtonBase$1(ShareButtonBase paramShareButtonBase) {}
  
  public void onClick(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      ShareButtonBase.access$000(this$0, paramView);
      this$0.getDialog().show(this$0.getShareContent());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.ShareButtonBase.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */