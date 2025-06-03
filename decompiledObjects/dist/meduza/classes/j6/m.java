package j6;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

public final class m
  extends zau
{
  public final Context a;
  
  public m(e parame, Context paramContext)
  {
    super(parame);
    a = paramContext.getApplicationContext();
  }
  
  public final void handleMessage(Message paramMessage)
  {
    int i = what;
    int j = 1;
    if (i != 1)
    {
      paramMessage = new StringBuilder();
      paramMessage.append("Don't know how to handle this message: ");
      paramMessage.append(i);
      Log.w("GoogleApiAvailability", paramMessage.toString());
      return;
    }
    int k = b.b(a);
    paramMessage = j.a;
    i = j;
    if (k != 1)
    {
      i = j;
      if (k != 2)
      {
        i = j;
        if (k != 3)
        {
          i = j;
          if (k != 9) {
            i = 0;
          }
        }
      }
    }
    if (i != 0)
    {
      e locale = b;
      Context localContext = a;
      paramMessage = locale.a(localContext, "n", k);
      if (paramMessage == null) {
        paramMessage = null;
      } else {
        paramMessage = PendingIntent.getActivity(localContext, 0, paramMessage, 201326592);
      }
      locale.g(localContext, k, paramMessage);
    }
  }
}

/* Location:
 * Qualified Name:     j6.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */