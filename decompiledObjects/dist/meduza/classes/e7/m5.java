package e7;

import android.content.Context;
import android.content.Intent;
import m6.j;

public final class m5<T extends Context,  extends o5>
{
  public final T a;
  
  public m5(T paramT)
  {
    j.i(paramT);
    a = paramT;
  }
  
  public final void a(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      bo.b("onRebind called with null intent");
      return;
    }
    paramIntent = paramIntent.getAction();
    bw.c("onRebind called. action", paramIntent);
  }
  
  public final a1 b()
  {
    return j2.a(a, null, null).zzj();
  }
  
  public final void c(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      bo.b("onUnbind called with null intent");
      return;
    }
    paramIntent = paramIntent.getAction();
    bw.c("onUnbind called for intent. action", paramIntent);
  }
}

/* Location:
 * Qualified Name:     e7.m5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */