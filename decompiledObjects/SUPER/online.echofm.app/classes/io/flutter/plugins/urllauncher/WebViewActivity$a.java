package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class WebViewActivity$a
  extends BroadcastReceiver
{
  public WebViewActivity$a(WebViewActivity paramWebViewActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("close action".equals(paramIntent.getAction())) {
      a.finish();
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.WebViewActivity.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */