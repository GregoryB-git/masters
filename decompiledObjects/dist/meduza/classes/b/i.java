package b;

import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import d.g;

public final class i
  implements Runnable
{
  public final void run()
  {
    c.a(a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", b));
  }
}

/* Location:
 * Qualified Name:     b.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */