package com.facebook.share.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;

class LikeView$LikeControllerBroadcastReceiver
  extends BroadcastReceiver
{
  private LikeView$LikeControllerBroadcastReceiver(LikeView paramLikeView) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    Bundle localBundle = paramIntent.getExtras();
    int i = 1;
    int j = i;
    if (localBundle != null)
    {
      paramIntent = localBundle.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
      j = i;
      if (!Utility.isNullOrEmpty(paramIntent)) {
        if (Utility.areObjectsEqual(LikeView.access$600(this$0), paramIntent)) {
          j = i;
        } else {
          j = 0;
        }
      }
    }
    if (j == 0) {
      return;
    }
    if ("com.facebook.sdk.LikeActionController.UPDATED".equals(paramContext))
    {
      LikeView.access$700(this$0);
    }
    else if ("com.facebook.sdk.LikeActionController.DID_ERROR".equals(paramContext))
    {
      if (LikeView.access$800(this$0) != null) {
        LikeView.access$800(this$0).onError(NativeProtocol.getExceptionFromErrorData(localBundle));
      }
    }
    else if ("com.facebook.sdk.LikeActionController.DID_RESET".equals(paramContext))
    {
      paramContext = this$0;
      LikeView.access$1000(paramContext, LikeView.access$600(paramContext), LikeView.access$900(this$0));
      LikeView.access$700(this$0);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.LikeView.LikeControllerBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */