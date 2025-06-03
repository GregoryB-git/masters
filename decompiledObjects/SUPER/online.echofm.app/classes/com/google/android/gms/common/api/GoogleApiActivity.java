package com.google.android.gms.common.api;

import A2.n;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import x2.b;
import x2.j;
import z2.e;

@KeepName
public class GoogleApiActivity
  extends Activity
  implements DialogInterface.OnCancelListener
{
  public int o = 0;
  
  public static Intent a(Context paramContext, PendingIntent paramPendingIntent, int paramInt, boolean paramBoolean)
  {
    paramContext = new Intent(paramContext, GoogleApiActivity.class);
    paramContext.putExtra("pending_intent", paramPendingIntent);
    paramContext.putExtra("failing_client_id", paramInt);
    paramContext.putExtra("notify_manager", paramBoolean);
    return paramContext;
  }
  
  public final void b()
  {
    Bundle localBundle = getIntent().getExtras();
    if (localBundle == null)
    {
      Log.e("GoogleApiActivity", "Activity started without extras");
      finish();
      return;
    }
    Object localObject2 = (PendingIntent)localBundle.get("pending_intent");
    Integer localInteger = (Integer)localBundle.get("error_code");
    if ((localObject2 == null) && (localInteger == null))
    {
      Log.e("GoogleApiActivity", "Activity started without resolution");
      finish();
      return;
    }
    if (localObject2 != null)
    {
      try
      {
        startIntentSenderForResult(((PendingIntent)localObject2).getIntentSender(), 1, null, 0, 0, 0);
        o = 1;
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException) {}catch (ActivityNotFoundException localActivityNotFoundException) {}
      Log.e("GoogleApiActivity", "Failed to launch pendingIntent", localSendIntentException);
      finish();
      return;
      if (localSendIntentException.getBoolean("notify_manager", true))
      {
        e.x(this).F(new b(22, null), getIntent().getIntExtra("failing_client_id", -1));
      }
      else
      {
        Object localObject1 = localObject2.toString();
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Activity not found while launching ");
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(".");
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject1 = localObject2;
        if (Build.FINGERPRINT.contains("generic")) {
          localObject1 = ((String)localObject2).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
        }
        Log.e("GoogleApiActivity", (String)localObject1, localActivityNotFoundException);
      }
      o = 1;
      finish();
      return;
    }
    int i = ((Integer)n.i(localActivityNotFoundException)).intValue();
    j.m().n(this, i, 2, this);
    o = 1;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      boolean bool = getIntent().getBooleanExtra("notify_manager", true);
      o = 0;
      setResult(paramInt2, paramIntent);
      if (bool)
      {
        paramIntent = e.x(this);
        if (paramInt2 != -1)
        {
          if (paramInt2 == 0) {
            paramIntent.F(new b(13, null), getIntent().getIntExtra("failing_client_id", -1));
          }
        }
        else {
          paramIntent.a();
        }
      }
    }
    else if (paramInt1 == 2)
    {
      o = 0;
      setResult(paramInt2, paramIntent);
    }
    finish();
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    o = 0;
    setResult(0);
    finish();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null) {
      o = paramBundle.getInt("resolution");
    }
    if (o != 1) {
      b();
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("resolution", o);
    super.onSaveInstanceState(paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.GoogleApiActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */