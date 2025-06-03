package x2;

import K2.i;
import android.content.Context;
import android.os.Message;
import android.util.Log;

public final class r
  extends i
{
  public final Context a;
  
  public r(j paramj, Context paramContext)
  {
    super(paramj);
    a = paramContext.getApplicationContext();
  }
  
  public final void handleMessage(Message paramMessage)
  {
    int i = what;
    if (i != 1)
    {
      paramMessage = new StringBuilder();
      paramMessage.append("Don't know how to handle this message: ");
      paramMessage.append(i);
      Log.w("GoogleApiAvailability", paramMessage.toString());
      return;
    }
    i = b.g(a);
    if (b.j(i)) {
      b.o(a, i);
    }
  }
}

/* Location:
 * Qualified Name:     x2.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */