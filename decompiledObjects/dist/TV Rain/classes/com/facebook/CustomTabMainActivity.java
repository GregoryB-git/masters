package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.CustomTab;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;

public class CustomTabMainActivity
  extends Activity
{
  public static final String EXTRA_ACTION = "CustomTabMainActivity.extra_action";
  public static final String EXTRA_CHROME_PACKAGE = "CustomTabMainActivity.extra_chromePackage";
  public static final String EXTRA_PARAMS = "CustomTabMainActivity.extra_params";
  public static final String EXTRA_URL = "CustomTabMainActivity.extra_url";
  public static final String NO_ACTIVITY_EXCEPTION = "CustomTabMainActivity.no_activity_exception";
  public static final String REFRESH_ACTION = "CustomTabMainActivity.action_refresh";
  private BroadcastReceiver redirectReceiver;
  private boolean shouldCloseCustomTab = true;
  
  private static Bundle parseResponseUri(String paramString)
  {
    paramString = Uri.parse(paramString);
    Bundle localBundle = Utility.parseUrlQueryString(paramString.getQuery());
    localBundle.putAll(Utility.parseUrlQueryString(paramString.getFragment()));
    return localBundle;
  }
  
  private void sendResult(int paramInt, Intent paramIntent)
  {
    LocalBroadcastManager.getInstance(this).unregisterReceiver(redirectReceiver);
    if (paramIntent != null)
    {
      Object localObject = paramIntent.getStringExtra(EXTRA_URL);
      if (localObject != null) {
        localObject = parseResponseUri((String)localObject);
      } else {
        localObject = new Bundle();
      }
      localObject = NativeProtocol.createProtocolResultIntent(getIntent(), (Bundle)localObject, null);
      if (localObject != null) {
        paramIntent = (Intent)localObject;
      }
      setResult(paramInt, paramIntent);
    }
    else
    {
      setResult(paramInt, NativeProtocol.createProtocolResultIntent(getIntent(), null, null));
    }
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str1 = CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION;
    if (str1.equals(getIntent().getAction()))
    {
      setResult(0);
      finish();
      return;
    }
    if (paramBundle == null)
    {
      String str2 = getIntent().getStringExtra(EXTRA_ACTION);
      Bundle localBundle = getIntent().getBundleExtra(EXTRA_PARAMS);
      paramBundle = getIntent().getStringExtra(EXTRA_CHROME_PACKAGE);
      boolean bool = new CustomTab(str2, localBundle).openCustomTab(this, paramBundle);
      shouldCloseCustomTab = false;
      if (!bool)
      {
        setResult(0, getIntent().putExtra(NO_ACTIVITY_EXCEPTION, true));
        finish();
        return;
      }
      redirectReceiver = new BroadcastReceiver()
      {
        public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          Intent localIntent = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
          localIntent.setAction(CustomTabMainActivity.REFRESH_ACTION);
          paramAnonymousContext = CustomTabMainActivity.EXTRA_URL;
          localIntent.putExtra(paramAnonymousContext, paramAnonymousIntent.getStringExtra(paramAnonymousContext));
          localIntent.addFlags(603979776);
          startActivity(localIntent);
        }
      };
      LocalBroadcastManager.getInstance(this).registerReceiver(redirectReceiver, new IntentFilter(str1));
    }
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if (REFRESH_ACTION.equals(paramIntent.getAction()))
    {
      Intent localIntent = new Intent(CustomTabActivity.DESTROY_ACTION);
      LocalBroadcastManager.getInstance(this).sendBroadcast(localIntent);
      sendResult(-1, paramIntent);
    }
    else if (CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION.equals(paramIntent.getAction()))
    {
      sendResult(-1, paramIntent);
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (shouldCloseCustomTab) {
      sendResult(0, null);
    }
    shouldCloseCustomTab = true;
  }
}

/* Location:
 * Qualified Name:     com.facebook.CustomTabMainActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */