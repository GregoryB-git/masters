package z2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class E
  extends BroadcastReceiver
{
  public Context a;
  public final D b;
  
  public E(D paramD)
  {
    b = paramD;
  }
  
  public final void a(Context paramContext)
  {
    a = paramContext;
  }
  
  public final void b()
  {
    try
    {
      Context localContext = a;
      if (localContext != null) {
        localContext.unregisterReceiver(this);
      }
    }
    finally
    {
      break label31;
    }
    a = null;
    return;
    label31:
    throw ((Throwable)localObject);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getData();
    if (paramContext != null) {
      paramContext = paramContext.getSchemeSpecificPart();
    } else {
      paramContext = null;
    }
    if ("com.google.android.gms".equals(paramContext))
    {
      b.a();
      b();
    }
  }
}

/* Location:
 * Qualified Name:     z2.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */