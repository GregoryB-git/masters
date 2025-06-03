package com.facebook.share.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class LikeView$1
  implements View.OnClickListener
{
  public LikeView$1(LikeView paramLikeView) {}
  
  public void onClick(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      LikeView.access$300(this$0);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.LikeView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */