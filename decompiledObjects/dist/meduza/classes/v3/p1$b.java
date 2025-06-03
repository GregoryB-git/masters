package v3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import b.d;

public final class p1$b
  extends BroadcastReceiver
{
  public p1$b(p1 paramp1) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = a;
    b.post(new d(paramContext, 7));
  }
}

/* Location:
 * Qualified Name:     v3.p1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */