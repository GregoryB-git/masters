package k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public final class g1$c
  extends BroadcastReceiver
{
  public g1$c(g1 paramg1) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    g1.a(a).post(new h1(a));
  }
}

/* Location:
 * Qualified Name:     k0.g1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */