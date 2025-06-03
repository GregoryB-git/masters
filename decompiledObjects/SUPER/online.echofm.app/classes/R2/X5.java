package R2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.g7;

public final class X5
  extends BroadcastReceiver
{
  public final N2 a;
  
  public X5(N2 paramN2)
  {
    a = paramN2;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
    {
      a.j().L().a("App receiver called with null intent");
      return;
    }
    paramContext = paramIntent.getAction();
    if (paramContext == null)
    {
      a.j().L().a("App receiver called with null action");
      return;
    }
    if (!paramContext.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE"))
    {
      a.j().L().a("App receiver called with unknown action");
      return;
    }
    paramContext = a;
    if ((g7.a()) && (paramContext.z().D(null, K.M0)))
    {
      paramContext.j().K().a("App receiver notified triggers are available");
      paramContext.e().D(new Z5(paramContext));
    }
  }
}

/* Location:
 * Qualified Name:     R2.X5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */