package g0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class t$d
  extends BroadcastReceiver
{
  public t$d(t paramt) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = t.b(paramContext);
    if ((M.a >= 31) && (i == 5)) {
      t.b.a(paramContext, a);
    } else {
      t.c(a, i);
    }
  }
}

/* Location:
 * Qualified Name:     g0.t.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */