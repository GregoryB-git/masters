package v2;

import a3.b;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import ec.i;
import t2.c;

public final class k
  extends e<c>
{
  public final ConnectivityManager g;
  
  public k(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
    paramContext = b.getSystemService("connectivity");
    i.c(paramContext, "null cannot be cast to non-null type android.net.ConnectivityManager");
    g = ((ConnectivityManager)paramContext);
  }
  
  public final Object a()
  {
    return j.a(g);
  }
  
  public final IntentFilter e()
  {
    return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
  }
  
  public final void f(Intent paramIntent)
  {
    i.e(paramIntent, "intent");
    if (i.a(paramIntent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE"))
    {
      o2.j.d().a(j.a, "Network broadcast received");
      b(j.a(g));
    }
  }
}

/* Location:
 * Qualified Name:     v2.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */