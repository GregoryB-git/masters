package R2;

import A2.n;
import android.content.Context;
import android.content.Intent;

public final class v2
{
  public final a a;
  
  public v2(a parama)
  {
    n.i(parama);
    a = parama;
  }
  
  public final void a(Context paramContext, Intent paramIntent)
  {
    Y1 localY1 = N2.c(paramContext, null, null).j();
    if (paramIntent == null)
    {
      localY1.L().a("Receiver called with null intent");
      return;
    }
    paramIntent = paramIntent.getAction();
    localY1.K().b("Local receiver got", paramIntent);
    if ("com.google.android.gms.measurement.UPLOAD".equals(paramIntent))
    {
      paramIntent = new Intent().setClassName(paramContext, "com.google.android.gms.measurement.AppMeasurementService");
      paramIntent.setAction("com.google.android.gms.measurement.UPLOAD");
      localY1.K().a("Starting wakeful intent.");
      a.a(paramContext, paramIntent);
      return;
    }
    if ("com.android.vending.INSTALL_REFERRER".equals(paramIntent)) {
      localY1.L().a("Install Referrer Broadcasts are deprecated");
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(Context paramContext, Intent paramIntent);
  }
}

/* Location:
 * Qualified Name:     R2.v2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */