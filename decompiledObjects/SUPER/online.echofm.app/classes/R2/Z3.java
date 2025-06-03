package R2;

import A2.n;
import android.os.BaseBundle;
import android.os.Bundle;

public final class Z3
  implements Runnable
{
  public Z3(C3 paramC3, Bundle paramBundle) {}
  
  public final void run()
  {
    C3 localC3 = p;
    Object localObject1 = o;
    localC3.n();
    localC3.v();
    n.i(localObject1);
    Object localObject2 = ((BaseBundle)localObject1).getString("name");
    String str = ((BaseBundle)localObject1).getString("origin");
    n.e((String)localObject2);
    n.e(str);
    n.i(((BaseBundle)localObject1).get("value"));
    if (!a.p())
    {
      localC3.j().K().a("Conditional property not set since app measurement is disabled");
      return;
    }
    R5 localR5 = new R5((String)localObject2, ((BaseBundle)localObject1).getLong("triggered_timestamp"), ((BaseBundle)localObject1).get("value"), str);
    try
    {
      localObject2 = localC3.k().C(((BaseBundle)localObject1).getString("app_id"), ((BaseBundle)localObject1).getString("triggered_event_name"), ((Bundle)localObject1).getBundle("triggered_event_params"), str, 0L, true, true);
      I localI1 = localC3.k().C(((BaseBundle)localObject1).getString("app_id"), ((BaseBundle)localObject1).getString("timed_out_event_name"), ((Bundle)localObject1).getBundle("timed_out_event_params"), str, 0L, true, true);
      I localI2 = localC3.k().C(((BaseBundle)localObject1).getString("app_id"), ((BaseBundle)localObject1).getString("expired_event_name"), ((Bundle)localObject1).getBundle("expired_event_params"), str, 0L, true, true);
      localObject1 = new e(((BaseBundle)localObject1).getString("app_id"), str, localR5, ((BaseBundle)localObject1).getLong("creation_timestamp"), false, ((BaseBundle)localObject1).getString("trigger_event_name"), localI1, ((BaseBundle)localObject1).getLong("trigger_timeout"), (I)localObject2, ((BaseBundle)localObject1).getLong("time_to_live"), localI2);
      localC3.t().C((e)localObject1);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     R2.Z3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */