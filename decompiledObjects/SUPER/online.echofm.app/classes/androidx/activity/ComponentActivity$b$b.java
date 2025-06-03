package androidx.activity;

import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import androidx.activity.result.ActivityResultRegistry;

public class ComponentActivity$b$b
  implements Runnable
{
  public ComponentActivity$b$b(ComponentActivity.b paramb, int paramInt, IntentSender.SendIntentException paramSendIntentException) {}
  
  public void run()
  {
    q.b(o, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", p));
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */