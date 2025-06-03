package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class WebViewActivity$1
  extends BroadcastReceiver
{
  public WebViewActivity$1(WebViewActivity paramWebViewActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("close action".equals(paramIntent.getAction())) {
      this$0.finish();
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.WebViewActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */