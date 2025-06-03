package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import g;
import j6.b;
import j6.e;
import l6.d;
import m6.j;

public class GoogleApiActivity
  extends Activity
  implements DialogInterface.OnCancelListener
{
  public int a = 0;
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      boolean bool = getIntent().getBooleanExtra("notify_manager", true);
      a = 0;
      setResult(paramInt2, paramIntent);
      if (bool)
      {
        paramIntent = d.g(this);
        if (paramInt2 != -1)
        {
          if (paramInt2 == 0) {
            paramIntent.h(new b(13, null), getIntent().getIntExtra("failing_client_id", -1));
          }
        }
        else
        {
          paramIntent = v;
          paramIntent.sendMessage(paramIntent.obtainMessage(3));
        }
      }
    }
    else if (paramInt1 == 2)
    {
      a = 0;
      setResult(paramInt2, paramIntent);
    }
    finish();
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    a = 0;
    setResult(0);
    finish();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null) {
      a = paramBundle.getInt("resolution");
    }
    if (a != 1)
    {
      Object localObject = getIntent().getExtras();
      if (localObject == null)
      {
        paramBundle = "Activity started without extras";
      }
      else
      {
        paramBundle = (PendingIntent)((BaseBundle)localObject).get("pending_intent");
        Integer localInteger = (Integer)((BaseBundle)localObject).get("error_code");
        if ((paramBundle != null) || (localInteger != null)) {
          break label89;
        }
        paramBundle = "Activity started without resolution";
      }
      Log.e("GoogleApiActivity", paramBundle);
      label89:
      if (paramBundle != null)
      {
        try
        {
          startIntentSenderForResult(paramBundle.getIntentSender(), 1, null, 0, 0, 0);
          a = 1;
        }
        catch (IntentSender.SendIntentException paramBundle)
        {
          Log.e("GoogleApiActivity", "Failed to launch pendingIntent", paramBundle);
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          if (((BaseBundle)localObject).getBoolean("notify_manager", true))
          {
            d.g(this).h(new b(22, null), getIntent().getIntExtra("failing_client_id", -1));
          }
          else
          {
            localObject = g.e("Activity not found while launching ", paramBundle.toString(), ".");
            paramBundle = (Bundle)localObject;
            if (Build.FINGERPRINT.contains("generic")) {
              paramBundle = ((String)localObject).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
            }
            Log.e("GoogleApiActivity", paramBundle, localActivityNotFoundException);
          }
          a = 1;
        }
        finish();
      }
      else
      {
        j.i(localActivityNotFoundException);
        int i = localActivityNotFoundException.intValue();
        e.d.d(this, i, this);
        a = 1;
      }
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("resolution", a);
    super.onSaveInstanceState(paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.GoogleApiActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */