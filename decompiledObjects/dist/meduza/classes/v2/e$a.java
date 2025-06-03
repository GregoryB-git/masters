package v2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ec.i;

public final class e$a
  extends BroadcastReceiver
{
  public e$a(e<T> parame) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    i.e(paramContext, "context");
    i.e(paramIntent, "intent");
    a.f(paramIntent);
  }
}

/* Location:
 * Qualified Name:     v2.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */