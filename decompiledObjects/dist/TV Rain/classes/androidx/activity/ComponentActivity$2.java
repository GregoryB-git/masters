package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContract.SynchronousResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

class ComponentActivity$2
  extends ActivityResultRegistry
{
  public ComponentActivity$2(ComponentActivity paramComponentActivity) {}
  
  public <I, O> void onLaunch(final int paramInt, @NonNull final ActivityResultContract<I, O> paramActivityResultContract, I paramI, @Nullable ActivityOptionsCompat paramActivityOptionsCompat)
  {
    ComponentActivity localComponentActivity = this$0;
    final ActivityResultContract.SynchronousResult localSynchronousResult = paramActivityResultContract.getSynchronousResult(localComponentActivity, paramI);
    if (localSynchronousResult != null)
    {
      new Handler(Looper.getMainLooper()).post(new Runnable()
      {
        public void run()
        {
          dispatchResult(paramInt, localSynchronousResult.getValue());
        }
      });
      return;
    }
    paramI = paramActivityResultContract.createIntent(localComponentActivity, paramI);
    paramActivityResultContract = null;
    if ((paramI.getExtras() != null) && (paramI.getExtras().getClassLoader() == null)) {
      paramI.setExtrasClassLoader(localComponentActivity.getClassLoader());
    }
    if (paramI.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"))
    {
      paramActivityResultContract = paramI.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
      paramI.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
    }
    else if (paramActivityOptionsCompat != null)
    {
      paramActivityResultContract = paramActivityOptionsCompat.toBundle();
    }
    if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(paramI.getAction()))
    {
      paramI = paramI.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
      paramActivityResultContract = paramI;
      if (paramI == null) {
        paramActivityResultContract = new String[0];
      }
      ActivityCompat.requestPermissions(localComponentActivity, paramActivityResultContract, paramInt);
    }
    else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(paramI.getAction()))
    {
      paramI = (IntentSenderRequest)paramI.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
      try
      {
        ActivityCompat.startIntentSenderForResult(localComponentActivity, paramI.getIntentSender(), paramInt, paramI.getFillInIntent(), paramI.getFlagsMask(), paramI.getFlagsValues(), 0, paramActivityResultContract);
      }
      catch (IntentSender.SendIntentException paramActivityResultContract)
      {
        new Handler(Looper.getMainLooper()).post(new Runnable()
        {
          public void run()
          {
            dispatchResult(paramInt, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", paramActivityResultContract));
          }
        });
      }
    }
    else
    {
      ActivityCompat.startActivityForResult(localComponentActivity, paramI, paramInt, paramActivityResultContract);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */