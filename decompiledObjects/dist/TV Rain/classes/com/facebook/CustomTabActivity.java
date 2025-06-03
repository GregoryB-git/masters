package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class CustomTabActivity
  extends Activity
{
  public static final String CUSTOM_TAB_REDIRECT_ACTION = "CustomTabActivity.action_customTabRedirect";
  private static final int CUSTOM_TAB_REDIRECT_REQUEST_CODE = 2;
  public static final String DESTROY_ACTION = "CustomTabActivity.action_destroy";
  private BroadcastReceiver closeReceiver;
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == 0)
    {
      paramIntent = new Intent(CUSTOM_TAB_REDIRECT_ACTION);
      paramIntent.putExtra(CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
      LocalBroadcastManager.getInstance(this).sendBroadcast(paramIntent);
      closeReceiver = new BroadcastReceiver()
      {
        public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          finish();
        }
      };
      LocalBroadcastManager.getInstance(this).registerReceiver(closeReceiver, new IntentFilter(DESTROY_ACTION));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new Intent(this, CustomTabMainActivity.class);
    paramBundle.setAction(CUSTOM_TAB_REDIRECT_ACTION);
    paramBundle.putExtra(CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
    paramBundle.addFlags(603979776);
    startActivityForResult(paramBundle, 2);
  }
  
  public void onDestroy()
  {
    LocalBroadcastManager.getInstance(this).unregisterReceiver(closeReceiver);
    super.onDestroy();
  }
}

/* Location:
 * Qualified Name:     com.facebook.CustomTabActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */