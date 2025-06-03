package androidx.activity;

import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import androidx.activity.result.ActivityResultRegistry;

class ComponentActivity$2$2
  implements Runnable
{
  public ComponentActivity$2$2(ComponentActivity.2 param2, int paramInt, IntentSender.SendIntentException paramSendIntentException) {}
  
  public void run()
  {
    this$1.dispatchResult(val$requestCode, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", val$e));
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity.2.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */