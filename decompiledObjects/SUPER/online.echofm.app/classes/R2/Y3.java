package R2;

import A2.n;
import android.os.BaseBundle;
import android.os.Bundle;

public final class Y3
  implements Runnable
{
  public Y3(C3 paramC3, Bundle paramBundle) {}
  
  public final void run()
  {
    C3 localC3 = p;
    Object localObject1 = o;
    localC3.n();
    localC3.v();
    n.i(localObject1);
    Object localObject2 = n.e(((BaseBundle)localObject1).getString("name"));
    if (!a.p())
    {
      localC3.j().K().a("Conditional property not cleared since app measurement is disabled");
      return;
    }
    localObject2 = new R5((String)localObject2, 0L, null, "");
    try
    {
      I localI = localC3.k().C(((BaseBundle)localObject1).getString("app_id"), ((BaseBundle)localObject1).getString("expired_event_name"), ((Bundle)localObject1).getBundle("expired_event_params"), "", ((BaseBundle)localObject1).getLong("creation_timestamp"), true, true);
      localObject1 = new e(((BaseBundle)localObject1).getString("app_id"), "", (R5)localObject2, ((BaseBundle)localObject1).getLong("creation_timestamp"), ((BaseBundle)localObject1).getBoolean("active"), ((BaseBundle)localObject1).getString("trigger_event_name"), null, ((BaseBundle)localObject1).getLong("trigger_timeout"), null, ((BaseBundle)localObject1).getLong("time_to_live"), localI);
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
 * Qualified Name:     R2.Y3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */