package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;

public class FacebookBroadcastReceiver
  extends BroadcastReceiver
{
  public void onFailedAppCall(String paramString1, String paramString2, Bundle paramBundle) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
    String str2 = paramIntent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
    if ((str1 != null) && (str2 != null))
    {
      paramContext = paramIntent.getExtras();
      if (NativeProtocol.isErrorResult(paramIntent)) {
        onFailedAppCall(str1, str2, paramContext);
      } else {
        onSuccessfulAppCall(str1, str2, paramContext);
      }
    }
  }
  
  public void onSuccessfulAppCall(String paramString1, String paramString2, Bundle paramBundle) {}
}

/* Location:
 * Qualified Name:     com.facebook.FacebookBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */