package k0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import dc.l;
import ec.j;
import rb.h;

public final class f
  extends j
  implements l<d6.i, h>
{
  public f(HiddenActivity paramHiddenActivity, int paramInt)
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    d6.i locali = (d6.i)paramObject;
    try
    {
      paramObject = a;
      b = true;
      ((Activity)paramObject).startIntentSenderForResult(a.getIntentSender(), b, null, 0, 0, 0, null);
    }
    catch (IntentSender.SendIntentException localSendIntentException)
    {
      HiddenActivity localHiddenActivity = a;
      paramObject = a;
      ec.i.b(paramObject);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("During save password, found UI intent sender failure: ");
      localStringBuilder.append(localSendIntentException.getMessage());
      localHiddenActivity.a((ResultReceiver)paramObject, "CREATE_UNKNOWN", localStringBuilder.toString());
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     k0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */