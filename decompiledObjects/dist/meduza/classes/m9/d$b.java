package m9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class d$b
  extends BroadcastReceiver
{
  public boolean a = false;
  
  public d$b(d paramd) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = b.b();
    if ((b.b()) && (!a)) {
      paramContext = b;
    }
    for (boolean bool2 = true;; bool2 = false)
    {
      paramContext.c(bool2);
      break;
      if ((bool1) || (!a)) {
        break;
      }
      paramContext = b;
    }
    a = bool1;
  }
}

/* Location:
 * Qualified Name:     m9.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */