package k0;

import android.content.Context;
import g0.o;
import l0.w1;
import l0.y1;

public abstract class f0$c
{
  public static y1 a(Context paramContext, f0 paramf0, boolean paramBoolean, String paramString)
  {
    paramContext = w1.x0(paramContext);
    if (paramContext == null)
    {
      o.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
      return new y1(g0.a(), paramString);
    }
    if (paramBoolean) {
      paramf0.c1(paramContext);
    }
    return new y1(paramContext.E0(), paramString);
  }
}

/* Location:
 * Qualified Name:     k0.f0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */