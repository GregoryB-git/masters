package k0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import dc.l;
import ec.i;
import ec.j;

public final class h
  extends j
  implements l<PendingIntent, rb.h>
{
  public h(HiddenActivity paramHiddenActivity, int paramInt)
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    paramObject = (PendingIntent)paramObject;
    try
    {
      localObject = a;
      b = true;
      ((Activity)localObject).startIntentSenderForResult(((PendingIntent)paramObject).getIntentSender(), b, null, 0, 0, 0, null);
    }
    catch (IntentSender.SendIntentException localSendIntentException)
    {
      HiddenActivity localHiddenActivity = a;
      paramObject = a;
      i.b(paramObject);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("During get sign-in intent, one tap ui intent sender failure: ");
      ((StringBuilder)localObject).append(localSendIntentException.getMessage());
      localHiddenActivity.a((ResultReceiver)paramObject, "GET_UNKNOWN", ((StringBuilder)localObject).toString());
    }
    return rb.h.a;
  }
}

/* Location:
 * Qualified Name:     k0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */