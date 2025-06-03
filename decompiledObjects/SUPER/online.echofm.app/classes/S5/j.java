package S5;

import A5.a.b;
import B5.c;
import android.util.Log;

public final class j
  implements A5.a, B5.a
{
  public i a;
  
  public void onAttachedToActivity(c paramc)
  {
    i locali = a;
    if (locali == null)
    {
      Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
      return;
    }
    locali.l(paramc.c());
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    a = new i(paramb.a());
    g.g(paramb.b(), a);
  }
  
  public void onDetachedFromActivity()
  {
    i locali = a;
    if (locali == null)
    {
      Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
      return;
    }
    locali.l(null);
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    onDetachedFromActivity();
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    if (a == null)
    {
      Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
      return;
    }
    g.g(paramb.b(), null);
    a = null;
  }
  
  public void onReattachedToActivityForConfigChanges(c paramc)
  {
    onAttachedToActivity(paramc);
  }
}

/* Location:
 * Qualified Name:     S5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */