package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.IntentSenderRequest.Builder;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class FragmentManager$FragmentIntentSenderContract
  extends ActivityResultContract<IntentSenderRequest, ActivityResult>
{
  @NonNull
  public Intent createIntent(@NonNull Context paramContext, IntentSenderRequest paramIntentSenderRequest)
  {
    Intent localIntent1 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
    Intent localIntent2 = paramIntentSenderRequest.getFillInIntent();
    paramContext = paramIntentSenderRequest;
    if (localIntent2 != null)
    {
      Bundle localBundle = localIntent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
      paramContext = paramIntentSenderRequest;
      if (localBundle != null)
      {
        localIntent1.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", localBundle);
        localIntent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        paramContext = paramIntentSenderRequest;
        if (localIntent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
          paramContext = new IntentSenderRequest.Builder(paramIntentSenderRequest.getIntentSender()).setFillInIntent(null).setFlags(paramIntentSenderRequest.getFlagsValues(), paramIntentSenderRequest.getFlagsMask()).build();
        }
      }
    }
    localIntent1.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", paramContext);
    if (FragmentManager.isLoggingEnabled(2))
    {
      paramContext = new StringBuilder();
      paramContext.append("CreateIntent created the following intent: ");
      paramContext.append(localIntent1);
      Log.v("FragmentManager", paramContext.toString());
    }
    return localIntent1;
  }
  
  @NonNull
  public ActivityResult parseResult(int paramInt, @Nullable Intent paramIntent)
  {
    return new ActivityResult(paramInt, paramIntent);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.FragmentIntentSenderContract
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */