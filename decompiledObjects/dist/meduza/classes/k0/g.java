package k0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import dc.l;
import ec.i;
import ec.j;
import rb.h;

public final class g
  extends j
  implements l<PendingIntent, h>
{
  public g(HiddenActivity paramHiddenActivity, int paramInt)
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    paramObject = (PendingIntent)paramObject;
    i.e(paramObject, "result");
    try
    {
      localHiddenActivity = a;
      b = true;
      localHiddenActivity.startIntentSenderForResult(((PendingIntent)paramObject).getIntentSender(), b, null, 0, 0, 0, null);
    }
    catch (IntentSender.SendIntentException paramObject)
    {
      HiddenActivity localHiddenActivity = a;
      ResultReceiver localResultReceiver = a;
      i.b(localResultReceiver);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("During public key credential, found IntentSender failure on public key creation: ");
      localStringBuilder.append(((Throwable)paramObject).getMessage());
      localHiddenActivity.a(localResultReceiver, "CREATE_UNKNOWN", localStringBuilder.toString());
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     k0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */