package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class CustomTabMainActivity$1
  extends BroadcastReceiver
{
  public CustomTabMainActivity$1(CustomTabMainActivity paramCustomTabMainActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Intent localIntent = new Intent(this$0, CustomTabMainActivity.class);
    localIntent.setAction(CustomTabMainActivity.REFRESH_ACTION);
    paramContext = CustomTabMainActivity.EXTRA_URL;
    localIntent.putExtra(paramContext, paramIntent.getStringExtra(paramContext));
    localIntent.addFlags(603979776);
    this$0.startActivity(localIntent);
  }
}

/* Location:
 * Qualified Name:     com.facebook.CustomTabMainActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */