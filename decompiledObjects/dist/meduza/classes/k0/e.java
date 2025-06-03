package k0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import d6.c;
import dc.l;
import ec.i;
import ec.j;
import rb.h;

public final class e
  extends j
  implements l<c, h>
{
  public e(HiddenActivity paramHiddenActivity, int paramInt)
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    paramObject = (c)paramObject;
    try
    {
      localHiddenActivity = a;
      b = true;
      localHiddenActivity.startIntentSenderForResult(a.getIntentSender(), b, null, 0, 0, 0, null);
    }
    catch (IntentSender.SendIntentException localSendIntentException)
    {
      HiddenActivity localHiddenActivity = a;
      ResultReceiver localResultReceiver = a;
      i.b(localResultReceiver);
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("During begin sign in, one tap ui intent sender failure: ");
      ((StringBuilder)paramObject).append(localSendIntentException.getMessage());
      localHiddenActivity.a(localResultReceiver, "GET_UNKNOWN", ((StringBuilder)paramObject).toString());
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     k0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */