package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.view.Window;

public class PlayCoreDialogWrapperActivity
  extends Activity
{
  public ResultReceiver a;
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 0)
    {
      ResultReceiver localResultReceiver = a;
      if (localResultReceiver != null)
      {
        if (paramInt2 == -1) {
          paramInt1 = 1;
        }
        for (paramIntent = new Bundle();; paramIntent = new Bundle())
        {
          localResultReceiver.send(paramInt1, paramIntent);
          break;
          if (paramInt2 != 0) {
            break;
          }
          paramInt1 = 2;
        }
      }
    }
    finish();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    int i = getIntent().getIntExtra("window_flags", 0);
    Object localObject = null;
    Intent localIntent;
    if (i != 0)
    {
      getWindow().getDecorView().setSystemUiVisibility(i);
      localIntent = new Intent();
      localIntent.putExtra("window_flags", i);
    }
    else
    {
      localIntent = null;
    }
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      a = ((ResultReceiver)getIntent().getParcelableExtra("result_receiver"));
      Bundle localBundle = getIntent().getExtras();
      paramBundle = (Bundle)localObject;
      if (localBundle != null) {
        paramBundle = (PendingIntent)localBundle.get("confirmation_intent");
      }
      if ((localBundle != null) && (paramBundle != null)) {
        try
        {
          startIntentSenderForResult(paramBundle.getIntentSender(), 0, localIntent, 0, 0, 0);
          return;
        }
        catch (IntentSender.SendIntentException paramBundle)
        {
          paramBundle = a;
          if (paramBundle != null) {
            paramBundle.send(3, new Bundle());
          }
          finish();
          return;
        }
      }
      paramBundle = a;
      if (paramBundle != null) {
        paramBundle.send(3, new Bundle());
      }
      finish();
      return;
    }
    a = ((ResultReceiver)paramBundle.getParcelable("result_receiver"));
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putParcelable("result_receiver", a);
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.common.PlayCoreDialogWrapperActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */